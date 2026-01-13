"""Kitchen Cooking Engine - Home Assistant Integration.

Last Updated: 8 Jan 2026, 23:59 CET
Last Change: Phase 3.1 - Added multi-appliance backend infrastructure

A HACS-compatible integration that provides guided cooking functionality
for Home Assistant, working with any temperature sensor.

This integration provides:
- Protein, cut, and doneness selection
- Target temperature recommendations from USDA/professional culinary sources
- Cooking method selection (kitchen-focused: oven, stovetop, air fryer, etc.)
- Cooking session management with progress tracking
- Dynamic ETA calculation based on temperature rise rate
- Comprehensive notifications (approaching, 5-min warning, goal reached, rest complete)
- Rest time recommendations with carryover cooking estimation
- Battery level monitoring (for MEATER probes)
- Sidebar panel for easy cooking setup and monitoring
- External API for 3rd party integrations and automations
- Phase 3.1: Multi-appliance support with feature-based recipe matching
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
    SERVICE_SET_NOTES,
    SERVICE_START_MULTI_APPLIANCE_COOK,
)
from .cooking_data import (
    get_cut_by_id,
    get_doneness_for_cut,
    get_recommended_doneness,
    CookingMethod,
    MEAT_CATEGORIES,
)
from .swedish_cooking_data import (
    get_swedish_cut_by_id,
    SWEDISH_MEAT_CATEGORIES,
)
from .api import async_register_api

_LOGGER = logging.getLogger(__name__)

PLATFORMS = [Platform.SENSOR]

__version__ = "0.1.2"

# Data source options
DATA_SOURCE_INTERNATIONAL = "international"
DATA_SOURCE_SWEDISH = "swedish"

# Service schema for start_cook
SERVICE_START_COOK_SCHEMA = vol.Schema(
    {
        vol.Required(ATTR_ENTITY_ID): cv.entity_ids,
        vol.Required("cut_id"): vol.All(vol.Coerce(int), vol.Range(min=1, max=9999)),
        vol.Required("doneness"): vol.In([
            "rare", "medium_rare", "medium", "medium_well", "well_done",
            "pulled", "safe", "tender", "crisp_tender", "caramelized",
            "dark_meat_optimal", "heated_through", "crispy", "charred", "done",
            # Swedish doneness levels
            "blodig", "genomstekt", "långkokt",
        ]),
        vol.Required("cooking_method"): vol.In([m.value for m in CookingMethod]),
        # Optional: data source for temperature recommendations
        vol.Optional("data_source", default=DATA_SOURCE_INTERNATIONAL): vol.In([
            DATA_SOURCE_INTERNATIONAL,
            DATA_SOURCE_SWEDISH,
        ]),
        # Optional: custom target temperature (for fine-tuning)
        vol.Optional("custom_target_temp_c"): vol.All(
            vol.Coerce(int), vol.Range(min=30, max=100)
        ),
    }
)

# Service schema for entity-targeting services (no additional params)
SERVICE_ENTITY_SCHEMA = vol.Schema(
    {
        vol.Required(ATTR_ENTITY_ID): cv.entity_ids,
    }
)

# Service schema for set_notes
SERVICE_SET_NOTES_SCHEMA = vol.Schema(
    {
        vol.Required(ATTR_ENTITY_ID): cv.entity_ids,
        vol.Required("notes"): cv.string,
    }
)

# Phase 4: Service schema for start_multi_appliance_cook
SERVICE_START_MULTI_APPLIANCE_COOK_SCHEMA = vol.Schema(
    {
        vol.Required("recipe_id"): vol.Any(cv.string, vol.Coerce(int)),
        vol.Optional("appliances"): vol.Schema({
            vol.Optional("oven"): cv.entity_id,
            vol.Optional("probe"): cv.entity_id,
            vol.Optional("air_fryer"): cv.entity_id,
            vol.Optional("combi"): cv.entity_id,
        }),
        vol.Optional("target_temp_c"): vol.All(vol.Coerce(int), vol.Range(min=30, max=250)),
        vol.Optional("cook_time_minutes"): vol.All(vol.Coerce(int), vol.Range(min=1, max=1440)),
    }
)


async def async_setup(hass: HomeAssistant, config: dict) -> bool:
    """Initialize the integration (called before any entry setup)."""
    hass.data.setdefault(DOMAIN, {})
    _LOGGER.info("Kitchen Cooking Engine: Integration initialized")
    return True


async def async_migrate_entry(hass: HomeAssistant, entry: ConfigEntry) -> bool:
    """Migrate old config entry to new format.
    
    This function is called by Home Assistant when it detects that the
    config entry version is lower than the current integration version.
    Phase 3.1: Handles migration from v0.2 single-appliance to v0.3+ multi-appliance.
    """
    _LOGGER.info("Migrating config entry from version %s", entry.version)
    
    from .migration import async_migrate_entry as migrate_impl
    
    try:
        success = await migrate_impl(hass, entry)
        if success:
            _LOGGER.info("Config entry migration completed successfully")
        else:
            _LOGGER.error("Config entry migration failed")
        return success
    except Exception as err:
        _LOGGER.error("Error during config entry migration: %s", err)
        return False


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


async def _async_regenerate_frontend_data(hass: HomeAssistant) -> bool:
    """Regenerate the frontend JS data from backend Python files.
    
    This ensures the frontend always matches the backend data,
    eliminating discrepancies between frontend and backend.
    """
    try:
        # Import the generator module
        from .generate_frontend_data import regenerate_panel
        
        # Run in executor to avoid blocking the event loop
        result = await hass.async_add_executor_job(regenerate_panel)
        
        if result:
            _LOGGER.info("Kitchen Cooking Engine: Frontend data regenerated from backend")
        else:
            _LOGGER.warning("Kitchen Cooking Engine: Failed to regenerate frontend data")
        
        return result
    except Exception as e:
        _LOGGER.error("Kitchen Cooking Engine: Error regenerating frontend data: %s", e)
        return False


async def _async_register_panel(hass: HomeAssistant) -> None:
    """Register the sidebar panel."""
    # Only register once
    if hass.data.get(DOMAIN, {}).get("panel_registered"):
        return
    
    # Regenerate frontend data from backend before registering panel
    await _async_regenerate_frontend_data(hass)
    
    # Re-read PANEL_VERSION after regeneration (it may have been updated)
    # We need to reload the const module to get the updated value
    import importlib
    from . import const as const_module
    importlib.reload(const_module)
    panel_version = const_module.PANEL_VERSION
    
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
                cache_headers=True,
            )
        ])
    except Exception as e:
        _LOGGER.warning("Kitchen Cooking Engine: Could not register static path: %s", e)
        return
    
    # Register the custom panel in the sidebar
    # Use panel_version in both URL and element name to bust ALL caches
    # The element name must match what's in kitchen-cooking-panel.js
    panel_element_name = f"kitchen-cooking-panel-v{panel_version}"
    _LOGGER.info("Kitchen Cooking Engine: Registering panel with version %s", panel_version)
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
                "module_url": f"/kitchen_cooking_engine_panel/kitchen-cooking-panel.js?v={panel_version}",
            }
        },
        require_admin=False,
    )
    
    hass.data[DOMAIN]["panel_registered"] = True
    _LOGGER.info("Kitchen Cooking Engine: Sidebar panel registered (version %s)", panel_version)


async def async_setup_entry(hass: HomeAssistant, entry: ConfigEntry) -> bool:
    """Set up Kitchen Cooking Engine from a config entry."""
    _LOGGER.info("=" * 60)
    _LOGGER.info("Kitchen Cooking Engine: Starting integration setup")
    _LOGGER.info("=" * 60)

    hass.data.setdefault(DOMAIN, {})

    # Phase 3.1: Initialize Appliance Manager (if not already done)
    from .appliance_manager import ApplianceManager
    
    if "appliance_manager" not in hass.data[DOMAIN]:
        manager = ApplianceManager(hass)
        await manager.async_setup()
        _LOGGER.info("Appliance Manager initialized")
    else:
        manager = hass.data[DOMAIN]["appliance_manager"]
    
    # Phase 3.1: Initialize Panel Data Service (if not already done)
    from .panel_data import PanelDataService
    
    if "panel_data_service" not in hass.data[DOMAIN]:
        panel_data = PanelDataService(hass, manager)
        await panel_data.async_setup()
        hass.data[DOMAIN]["panel_data_service"] = panel_data
        _LOGGER.info("Panel Data Service initialized")
    
    # Phase 3.1: Setup appliance from this config entry
    appliance = await manager.async_setup_appliance(entry)
    if appliance:
        _LOGGER.info("Appliance registered: %s", appliance.name)

    # Clean up any duplicate sensor entities from old versions
    await _cleanup_old_entities(hass, entry)

    # Store the config entry data
    hass.data[DOMAIN][entry.entry_id] = {
        "config": entry.data,
    }

    # Register the sidebar panel (only once, not per config entry)
    if not hass.data[DOMAIN].get("panel_registered", False):
        await _async_register_panel(hass)
        hass.data[DOMAIN]["panel_registered"] = True

    # Register API endpoints for cooking data
    async_register_api(hass)

    # Register services
    await _async_register_services(hass)

    # Forward entry setup to platforms
    _LOGGER.info("Kitchen Cooking Engine: Setting up sensor platform...")
    await hass.config_entries.async_forward_entry_setups(entry, PLATFORMS)

    _LOGGER.info("Kitchen Cooking Engine: Integration setup complete")
    return True


async def async_unload_entry(hass: HomeAssistant, entry: ConfigEntry) -> bool:
    """Handle removal of a config entry."""
    # Phase 3.1: Unload appliance from manager
    from .appliance_manager import get_appliance_manager
    
    manager = get_appliance_manager(hass)
    if manager:
        await manager.async_unload_appliance(entry.entry_id)
        _LOGGER.info("Appliance unloaded: %s", entry.title)
    
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


def _get_protein_name_for_cut_with_categories(cut, categories) -> str | None:
    """Get the protein category name for a cut from specified categories."""
    for category in categories:
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
        data_source = call.data.get("data_source", DATA_SOURCE_INTERNATIONAL)
        custom_target_temp_c = call.data.get("custom_target_temp_c")

        # Get the cut data based on data source
        if data_source == DATA_SOURCE_SWEDISH:
            cut = get_swedish_cut_by_id(cut_id)
            categories = SWEDISH_MEAT_CATEGORIES
        else:
            cut = get_cut_by_id(cut_id)
            categories = MEAT_CATEGORIES
        
        if not cut:
            _LOGGER.error("Cut ID %s not found in %s data source", cut_id, data_source)
            return

        # Get the doneness level
        temp_range = get_doneness_for_cut(cut, doneness)
        if not temp_range:
            _LOGGER.error("Doneness %s not valid for cut %s", doneness, cut.name)
            return

        # Use custom target temperature if provided, otherwise use standard
        target_temp_c = custom_target_temp_c if custom_target_temp_c else temp_range.target_temp_c
        target_temp_f = int(target_temp_c * 9 / 5 + 32) if custom_target_temp_c else temp_range.target_temp_f

        _LOGGER.info(
            "Starting cook: %s (%s) at %d°C (%d°F) using %s [data: %s]%s",
            cut.name_long,
            doneness,
            target_temp_c,
            target_temp_f,
            cooking_method,
            data_source,
            " (custom temp)" if custom_target_temp_c else "",
        )

        # Get the category name for the protein
        protein_name = _get_protein_name_for_cut_with_categories(cut, categories)
        
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
            await entity.start_cook(
                protein=protein_name or "unknown",
                cut=cut.name,
                doneness=doneness,
                cooking_method=cooking_method,
                target_temp_c=target_temp_c,
                target_temp_f=target_temp_f,
                min_temp_c=temp_range.min_temp_c,
                min_temp_f=temp_range.min_temp_f,
                max_temp_c=temp_range.max_temp_c,
                max_temp_f=temp_range.max_temp_f,
                rest_time_min=cut.rest_time_min,
                rest_time_max=cut.rest_time_max,
                usda_safe=temp_range.usda_safe,
                carryover_temp_c=cut.carryover_temp_c,
                cut_display=cut.name_long,
                cut_id=cut_id,
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

    async def handle_set_notes(call: ServiceCall) -> None:
        """Handle set notes service call."""
        _LOGGER.info("Kitchen Cooking Engine: Set notes service called")
        
        entity_ids = call.data.get(ATTR_ENTITY_ID)
        notes = call.data.get("notes", "")
        
        if entity_ids is None:
            _LOGGER.error("No entity_id specified for set_notes service")
            return
        
        if isinstance(entity_ids, str):
            entity_ids = [entity_ids]
        
        entities = _get_cooking_session_entities(hass, entity_ids)
        for entity in entities:
            entity.set_notes(notes)

    async def handle_start_multi_appliance_cook(call: ServiceCall) -> None:
        """Handle start multi-appliance cook service call.
        
        Phase 4: Coordinates cooking across multiple appliances simultaneously.
        """
        _LOGGER.info("Kitchen Cooking Engine: Start multi-appliance cook service called")
        
        from .coordinator import get_coordinator
        from .recipes.matcher import RecipeMatcher
        from .appliances.registry import get_registry
        
        coordinator = get_coordinator(hass)
        registry = get_registry(hass)
        
        recipe_id = call.data.get("recipe_id")
        appliances_map = call.data.get("appliances", {})
        target_temp_c = call.data.get("target_temp_c")
        cook_time_minutes = call.data.get("cook_time_minutes")
        
        # Build a simple recipe dict from the service call
        # In a real implementation, this would look up a full recipe by ID
        recipe = {
            "id": recipe_id,
            "name": f"Recipe {recipe_id}",
            "required_features": list(appliances_map.keys()) if appliances_map else [],
        }
        
        # Build appliance assignments from the service call
        from .coordinator import ApplianceAssignment
        assignments = []
        
        for role, entity_id in appliances_map.items():
            # Try to find the appliance by entity
            # This is a simplified lookup - in production, would have proper entity->appliance mapping
            appliances = registry.get_all_appliances()
            for appliance in appliances:
                # For now, create assignment based on role
                assignments.append(ApplianceAssignment(
                    feature_role=role,
                    appliance_id=appliance.get("id", "unknown"),
                    appliance_name=appliance.get("name", "Unknown"),
                    entity_id=entity_id
                ))
                break  # Use first appliance for now
        
        # Start the multi-appliance cook session
        try:
            options = {}
            if target_temp_c:
                options["target_temp_c"] = target_temp_c
            if cook_time_minutes:
                options["cook_time_minutes"] = cook_time_minutes
            
            session = await coordinator.start_multi_appliance_cook(
                recipe=recipe,
                appliance_assignments=assignments if assignments else None,
                options=options
            )
            
            _LOGGER.info(
                "Started multi-appliance cook session %s for recipe %s",
                session.session_id,
                session.recipe_name
            )
            
            # Update sensor entities with multi-appliance session info
            for assignment in session.appliance_assignments:
                if assignment.entity_id:
                    entities = _get_cooking_session_entities(hass, [assignment.entity_id])
                    for entity in entities:
                        entity._multi_cook_session_id = session.session_id
                        entity._active_appliances = [a.appliance_id for a in session.appliance_assignments]
                        entity._primary_appliance = session.primary_appliance_id
                        entity._secondary_appliances = session.secondary_appliance_ids
                        entity.async_write_ha_state()
                        
        except Exception as err:
            _LOGGER.error("Failed to start multi-appliance cook: %s", err)
            raise

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
    if not hass.services.has_service(DOMAIN, SERVICE_SET_NOTES):
        hass.services.async_register(
            DOMAIN,
            SERVICE_SET_NOTES,
            handle_set_notes,
            schema=SERVICE_SET_NOTES_SCHEMA,
        )
    # Phase 4: Register multi-appliance cook service
    if not hass.services.has_service(DOMAIN, SERVICE_START_MULTI_APPLIANCE_COOK):
        hass.services.async_register(
            DOMAIN,
            SERVICE_START_MULTI_APPLIANCE_COOK,
            handle_start_multi_appliance_cook,
            schema=SERVICE_START_MULTI_APPLIANCE_COOK_SCHEMA,
        )

