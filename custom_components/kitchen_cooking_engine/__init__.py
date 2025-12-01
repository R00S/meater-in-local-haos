"""Kitchen Cooking Engine - Home Assistant Integration.

Last Updated: 1 Dec 2025, 14:00 CET
Last Change: Switched to custom panel JS instead of iframe for proper HA integration

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
- Sidebar panel for easy cooking setup and monitoring
"""

from __future__ import annotations

import logging
from pathlib import Path

import voluptuous as vol

from homeassistant.components.frontend import async_register_built_in_panel
from homeassistant.components.http import StaticPathConfig
from homeassistant.config_entries import ConfigEntry
from homeassistant.const import ATTR_ENTITY_ID, Platform
from homeassistant.core import HomeAssistant, ServiceCall
from homeassistant.helpers import config_validation as cv
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
    CookingMethod,
    MEAT_CATEGORIES,
)

_LOGGER = logging.getLogger(__name__)

PLATFORMS = [Platform.SENSOR]

__version__ = "0.1.0"

# Service schema for start_cook
SERVICE_START_COOK_SCHEMA = vol.Schema(
    {
        vol.Required(ATTR_ENTITY_ID): cv.entity_ids,
        vol.Required("cut_id"): vol.All(vol.Coerce(int), vol.Range(min=1, max=999)),
        vol.Required("doneness"): vol.In([
            "rare", "medium_rare", "medium", "medium_well", "well_done",
            "pulled", "safe", "tender", "crisp_tender", "caramelized",
            "dark_meat_optimal", "heated_through", "crispy", "charred", "done",
        ]),
        vol.Required("cooking_method"): vol.In([m.value for m in CookingMethod]),
    }
)

# Service schema for entity-targeting services (no additional params)
SERVICE_ENTITY_SCHEMA = vol.Schema(
    {
        vol.Required(ATTR_ENTITY_ID): cv.entity_ids,
    }
)


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


async def _async_register_panel(hass: HomeAssistant) -> None:
    """Register the sidebar panel."""
    from .const import PANEL_VERSION
    
    # Only register once
    if hass.data.get(DOMAIN, {}).get("panel_registered"):
        return
    
    # Get the path to the www directory
    www_path = Path(__file__).parent / "www"
    panel_js_path = www_path / "kitchen-cooking-panel.js"
    
    if not panel_js_path.exists():
        _LOGGER.warning("Kitchen Cooking Engine: Panel JS file not found at %s", panel_js_path)
        return
    
    # Register static path to serve the panel JS
    try:
        await hass.http.async_register_static_paths([
            StaticPathConfig(
                url_path="/kitchen_cooking_engine_panel",
                path=str(www_path),
                cache_headers=False,
            )
        ])
    except Exception as e:
        _LOGGER.warning("Kitchen Cooking Engine: Could not register static path: %s", e)
        return
    
    # Register the custom panel in the sidebar
    # Use PANEL_VERSION in both URL and element name to bust ALL caches
    # The element name must match what's in kitchen-cooking-panel.js
    panel_element_name = f"kitchen-cooking-panel-v{PANEL_VERSION}"
    async_register_built_in_panel(
        hass,
        component_name="custom",
        sidebar_title="Cooking",
        sidebar_icon="mdi:pot-steam",
        frontend_url_path="kitchen-cooking",
        config={
            "_panel_custom": {
                "name": panel_element_name,
                "embed_iframe": False,
                "trust_external": False,
                "module_url": f"/kitchen_cooking_engine_panel/kitchen-cooking-panel.js?v={PANEL_VERSION}",
            }
        },
        require_admin=False,
    )
    
    hass.data[DOMAIN]["panel_registered"] = True
    _LOGGER.info("Kitchen Cooking Engine: Sidebar panel registered (version %s)", PANEL_VERSION)


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

    # Register the sidebar panel
    await _async_register_panel(hass)

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
    
    Searches through stored entity references to find matching entities.
    Returns a list of CookingSessionSensor instances.
    """
    # Import here to avoid circular imports at module load time
    from .sensor import CookingSessionSensor
    
    entities = []
    for entity_id in entity_ids:
        # Verify entity exists in state machine
        state = hass.states.get(entity_id)
        if state is None:
            _LOGGER.warning("Entity %s not found in state machine", entity_id)
            continue
            
        # Search through all config entries for this domain
        for entry_id, data in hass.data.get(DOMAIN, {}).items():
            if not isinstance(data, dict) or "entities" not in data:
                continue
            for entity in data["entities"]:
                if (
                    isinstance(entity, CookingSessionSensor)
                    and hasattr(entity, "entity_id")
                    and entity.entity_id == entity_id
                ):
                    entities.append(entity)
                    break
    
    return entities


def _get_protein_name_for_cut(cut) -> str | None:
    """Get the protein category name for a cut."""
    for category in MEAT_CATEGORIES:
        for meat in category.meats:
            for cut_type in meat.cut_types:
                if cut in cut_type.cuts:
                    return category.name
    return None


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
        protein_name = _get_protein_name_for_cut(cut)
        
        # Find and update the target entities
        entities = _get_cooking_session_entities(hass, entity_ids)
        if not entities:
            _LOGGER.error(
                "No cooking session entities found for %s. "
                "Make sure the entity exists and the integration is properly set up.",
                entity_ids,
            )
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
        hass.services.async_register(
            DOMAIN,
            SERVICE_START_COOK,
            handle_start_cook,
            schema=SERVICE_START_COOK_SCHEMA,
        )
    if not hass.services.has_service(DOMAIN, SERVICE_STOP_COOK):
        hass.services.async_register(
            DOMAIN,
            SERVICE_STOP_COOK,
            handle_stop_cook,
            schema=SERVICE_ENTITY_SCHEMA,
        )
    if not hass.services.has_service(DOMAIN, SERVICE_START_REST):
        hass.services.async_register(
            DOMAIN,
            SERVICE_START_REST,
            handle_start_rest,
            schema=SERVICE_ENTITY_SCHEMA,
        )
    if not hass.services.has_service(DOMAIN, SERVICE_COMPLETE):
        hass.services.async_register(
            DOMAIN,
            SERVICE_COMPLETE,
            handle_complete,
            schema=SERVICE_ENTITY_SCHEMA,
        )

