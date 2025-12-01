"""Kitchen Cooking Engine - Home Assistant Integration.

Last Updated: 2024-11-30T23:50:00Z
Last Agent Edit: 2024-11-30T23:50:00Z

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
from typing import Any

from homeassistant.config_entries import ConfigEntry
from homeassistant.const import Platform
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
    CookingMethod,
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


async def _async_register_services(hass: HomeAssistant) -> None:
    """Register integration services."""

    async def handle_start_cook(call: ServiceCall) -> None:
        """Handle start cook service call."""
        _LOGGER.info("Kitchen Cooking Engine: Start cook service called")
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

        # Find the sensor entity and call start_cook
        # This would be implemented when we have entity references

    async def handle_stop_cook(call: ServiceCall) -> None:
        """Handle stop cook service call."""
        _LOGGER.info("Kitchen Cooking Engine: Stop cook service called")

    async def handle_start_rest(call: ServiceCall) -> None:
        """Handle start rest service call."""
        _LOGGER.info("Kitchen Cooking Engine: Start rest service called")

    async def handle_complete(call: ServiceCall) -> None:
        """Handle complete session service call."""
        _LOGGER.info("Kitchen Cooking Engine: Complete session service called")

    # Only register if not already registered
    if not hass.services.has_service(DOMAIN, SERVICE_START_COOK):
        hass.services.async_register(DOMAIN, SERVICE_START_COOK, handle_start_cook)
    if not hass.services.has_service(DOMAIN, SERVICE_STOP_COOK):
        hass.services.async_register(DOMAIN, SERVICE_STOP_COOK, handle_stop_cook)
    if not hass.services.has_service(DOMAIN, SERVICE_START_REST):
        hass.services.async_register(DOMAIN, SERVICE_START_REST, handle_start_rest)
    if not hass.services.has_service(DOMAIN, SERVICE_COMPLETE):
        hass.services.async_register(DOMAIN, SERVICE_COMPLETE, handle_complete)

