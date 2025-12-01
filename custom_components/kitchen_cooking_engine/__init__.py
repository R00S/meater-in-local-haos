"""Kitchen Cooking Engine - Home Assistant Integration.

Last Updated: 2024-12-01T01:45:00Z
Last Agent Edit: 2024-12-01T01:45:00Z

A HACS-compatible integration that provides guided cooking functionality
for Home Assistant, working with any temperature sensor.

This integration provides:
- Protein, cut, and doneness selection
- Target temperature recommendations from USDA/professional culinary sources
- Cooking method selection (kitchen-focused: oven, stovetop, air fryer, etc.)
- Cooking session management with progress tracking
- Time-to-target estimation
- Notifications for approaching target and goal reached
- Rest time recommendations with carryover cooking estimation
"""

from __future__ import annotations

import logging

from homeassistant.config_entries import ConfigEntry
from homeassistant.const import ATTR_ENTITY_ID, Platform
from homeassistant.core import HomeAssistant, ServiceCall
from homeassistant.helpers import entity_registry as er

from .const import (
    DOMAIN,
    SERVICE_START_COOK,
    SERVICE_STOP_COOK,
    SERVICE_START_REST,
    SERVICE_COMPLETE,
)
from .cooking_data import (
    get_cut_by_id,
    get_doneness_for_cut,
)

_LOGGER = logging.getLogger(__name__)

PLATFORMS = [Platform.SENSOR]

__version__ = "0.1.0"


async def async_setup(hass: HomeAssistant, config: dict) -> bool:
    """Initialize the integration (called before any entry setup)."""
    hass.data.setdefault(DOMAIN, {})
    _LOGGER.info("Kitchen Cooking Engine: Integration initialized")
    return True


async def _cleanup_old_entities(hass: HomeAssistant, entry: ConfigEntry) -> None:
    """Clean up old duplicate sensor entities from previous versions."""
    entity_reg = er.async_get(hass)

    # Find all entities for this integration
    entities = er.async_entries_for_config_entry(entity_reg, entry.entry_id)

    # Look for duplicate entities
    seen_unique_ids: set[str] = set()
    for entity in entities:
        if entity.unique_id in seen_unique_ids:
            _LOGGER.warning(
                "Found duplicate entity: %s (will be removed)", entity.entity_id
            )
            entity_reg.async_remove(entity.entity_id)
        else:
            seen_unique_ids.add(entity.unique_id)


async def async_setup_entry(hass: HomeAssistant, entry: ConfigEntry) -> bool:
    """Set up Kitchen Cooking Engine from a config entry."""
    _LOGGER.info("=" * 60)
    _LOGGER.info("Kitchen Cooking Engine: Starting integration setup")
    _LOGGER.info("=" * 60)

    hass.data.setdefault(DOMAIN, {})

    # Clean up any duplicate sensor entities from old versions
    await _cleanup_old_entities(hass, entry)

    # Store the config entry data
    hass.data[DOMAIN][entry.entry_id] = {
        "config": entry.data,
    }

    # Register services
    await _async_register_services(hass)

    # Forward entry setup to platforms
    _LOGGER.info("Kitchen Cooking Engine: Setting up sensor platform...")
    await hass.config_entries.async_forward_entry_setups(entry, PLATFORMS)

    _LOGGER.info("Kitchen Cooking Engine: Integration setup complete")
    return True


async def async_unload_entry(hass: HomeAssistant, entry: ConfigEntry) -> bool:
    """Handle removal of a config entry."""
    unload_ok = await hass.config_entries.async_unload_platforms(entry, PLATFORMS)
    if unload_ok:
        hass.data[DOMAIN].pop(entry.entry_id, None)
    return unload_ok


def _get_cooking_session_entities(hass: HomeAssistant, entity_ids: list[str]) -> list:
    """Get CookingSessionSensor entities from entity IDs.
    
    This imports the sensor module locally to avoid circular imports.
    """
    from .sensor import CookingSessionSensor
    
    entities = []
    for entity_id in entity_ids:
        state = hass.states.get(entity_id)
        if state is None:
            _LOGGER.warning("Entity %s not found", entity_id)
            continue
            
        # Get the actual entity object from entity registry
        entity_reg = er.async_get(hass)
        entity_entry = entity_reg.async_get(entity_id)
        if entity_entry is None:
            _LOGGER.warning("Entity %s not in registry", entity_id)
            continue
            
        # Find the entity in our stored data
        for entry_id, data in hass.data.get(DOMAIN, {}).items():
            if isinstance(data, dict) and "entities" in data:
                for entity in data["entities"]:
                    if hasattr(entity, "entity_id") and entity.entity_id == entity_id:
                        if isinstance(entity, CookingSessionSensor):
                            entities.append(entity)
                            break
    
    return entities


async def _async_register_services(hass: HomeAssistant) -> None:
    """Register integration services."""

    async def handle_start_cook(call: ServiceCall) -> None:
        """Handle start cook service call."""
        _LOGGER.info("Kitchen Cooking Engine: Start cook service called")
        
        # Get entity IDs from service call
        entity_ids = call.data.get(ATTR_ENTITY_ID)
        if entity_ids is None:
            _LOGGER.error("No entity_id specified for start_cook service")
            return
        
        # Ensure entity_ids is a list
        if isinstance(entity_ids, str):
            entity_ids = [entity_ids]
        
        cut_id = call.data.get("cut_id")
        doneness = call.data.get("doneness")
        cooking_method = call.data.get("cooking_method")

        # Get the cut data
        cut = get_cut_by_id(cut_id)
        if not cut:
            _LOGGER.error("Cut ID %s not found", cut_id)
            return

        # Get the doneness level
        temp_range = get_doneness_for_cut(cut, doneness)
        if not temp_range:
            _LOGGER.error("Doneness %s not valid for cut %s", doneness, cut.name)
            return

        _LOGGER.info(
            "Starting cook: %s (%s) at %d°C (%d°F) using %s",
            cut.name_long,
            doneness,
            temp_range.target_temp_c,
            temp_range.target_temp_f,
            cooking_method,
        )

        # Get the category name for the protein
        protein_name = None
        from .cooking_data import MEAT_CATEGORIES
        for category in MEAT_CATEGORIES:
            for meat in category.meats:
                for cut_type in meat.cut_types:
                    if cut in cut_type.cuts:
                        protein_name = category.name
                        break
        
        # Find and update the target entities
        entities = _get_cooking_session_entities(hass, entity_ids)
        if not entities:
            _LOGGER.warning("No cooking session entities found for %s", entity_ids)
            # Fall back to finding entities via state machine
            for entity_id in entity_ids:
                # Store the cook parameters for the entity
                # The entity will pick these up on next state update
                entry_id_match = None
                for entry_id in hass.data.get(DOMAIN, {}):
                    if isinstance(hass.data[DOMAIN].get(entry_id), dict):
                        entry_id_match = entry_id
                        break
                if entry_id_match:
                    hass.data[DOMAIN][entry_id_match]["pending_cook"] = {
                        "protein": protein_name,
                        "cut": cut.name,
                        "cut_name_long": cut.name_long,
                        "doneness": doneness,
                        "cooking_method": cooking_method,
                        "target_temp_c": temp_range.target_temp_c,
                        "target_temp_f": temp_range.target_temp_f,
                        "min_temp_c": temp_range.min_temp_c,
                        "min_temp_f": temp_range.min_temp_f,
                        "max_temp_c": temp_range.max_temp_c,
                        "max_temp_f": temp_range.max_temp_f,
                        "rest_time_min": cut.rest_time_min,
                        "rest_time_max": cut.rest_time_max,
                        "usda_safe": temp_range.usda_safe,
                        "carryover_temp_c": cut.carryover_temp_c,
                        "cut_display": cut.name_long,
                    }
                    _LOGGER.info("Stored pending cook for next entity update")
            return
            
        for entity in entities:
            entity.start_cook(
                protein=protein_name or "unknown",
                cut=cut.name,
                doneness=doneness,
                cooking_method=cooking_method,
                target_temp_c=temp_range.target_temp_c,
                target_temp_f=temp_range.target_temp_f,
                min_temp_c=temp_range.min_temp_c,
                min_temp_f=temp_range.min_temp_f,
                max_temp_c=temp_range.max_temp_c,
                max_temp_f=temp_range.max_temp_f,
                rest_time_min=cut.rest_time_min,
                rest_time_max=cut.rest_time_max,
                usda_safe=temp_range.usda_safe,
                carryover_temp_c=cut.carryover_temp_c,
                cut_display=cut.name_long,
            )

    async def handle_stop_cook(call: ServiceCall) -> None:
        """Handle stop cook service call."""
        _LOGGER.info("Kitchen Cooking Engine: Stop cook service called")
        
        entity_ids = call.data.get(ATTR_ENTITY_ID)
        if entity_ids is None:
            _LOGGER.error("No entity_id specified for stop_cook service")
            return
        
        if isinstance(entity_ids, str):
            entity_ids = [entity_ids]
        
        entities = _get_cooking_session_entities(hass, entity_ids)
        for entity in entities:
            entity.stop_cook()

    async def handle_start_rest(call: ServiceCall) -> None:
        """Handle start rest service call."""
        _LOGGER.info("Kitchen Cooking Engine: Start rest service called")
        
        entity_ids = call.data.get(ATTR_ENTITY_ID)
        if entity_ids is None:
            _LOGGER.error("No entity_id specified for start_rest service")
            return
        
        if isinstance(entity_ids, str):
            entity_ids = [entity_ids]
        
        entities = _get_cooking_session_entities(hass, entity_ids)
        for entity in entities:
            entity.start_rest()

    async def handle_complete(call: ServiceCall) -> None:
        """Handle complete session service call."""
        _LOGGER.info("Kitchen Cooking Engine: Complete session service called")
        
        entity_ids = call.data.get(ATTR_ENTITY_ID)
        if entity_ids is None:
            _LOGGER.error("No entity_id specified for complete_session service")
            return
        
        if isinstance(entity_ids, str):
            entity_ids = [entity_ids]
        
        entities = _get_cooking_session_entities(hass, entity_ids)
        for entity in entities:
            entity.complete_session()

    # Only register if not already registered
    if not hass.services.has_service(DOMAIN, SERVICE_START_COOK):
        hass.services.async_register(DOMAIN, SERVICE_START_COOK, handle_start_cook)
    if not hass.services.has_service(DOMAIN, SERVICE_STOP_COOK):
        hass.services.async_register(DOMAIN, SERVICE_STOP_COOK, handle_stop_cook)
    if not hass.services.has_service(DOMAIN, SERVICE_START_REST):
        hass.services.async_register(DOMAIN, SERVICE_START_REST, handle_start_rest)
    if not hass.services.has_service(DOMAIN, SERVICE_COMPLETE):
        hass.services.async_register(DOMAIN, SERVICE_COMPLETE, handle_complete)

