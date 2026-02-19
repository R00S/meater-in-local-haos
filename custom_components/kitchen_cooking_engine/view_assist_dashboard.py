"""View Assist Dashboard Integration.

Last Updated: 19 Feb 2026, 02:52 UTC
Last Change: v0.5.0.72 - Replace mock WebSocket with direct DashboardsCollection API

This module manages the automatic creation and removal of a storage-mode Lovelace
dashboard that embeds the cooking panel in an iframe, enabling View Assist compatibility
with zero user configuration.

Uses DashboardsCollection.async_create_item() directly — the same pattern used by
HA core's _create_map_dashboard() and the R290_heatpump integration. No mock WebSocket
connections needed.
"""

from __future__ import annotations

import logging
from typing import Any

from homeassistant.components import frontend
from homeassistant.components.lovelace import const as lovelace_const
from homeassistant.components.lovelace import dashboard as lovelace_dashboard
from homeassistant.core import HomeAssistant

_LOGGER = logging.getLogger(__name__)

# Dashboard configuration constants
DASHBOARD_URL_PATH = "cooking-va"
DASHBOARD_TITLE = "Kitchen Cooking (View Assist)"
DASHBOARD_ICON = "mdi:pot-steam"
DASHBOARD_REQUIRE_ADMIN = False

# Dashboard view config (iframe embedding our cooking panel)
DASHBOARD_VIEW_CONFIG: dict[str, Any] = {
    "views": [
        {
            "title": "Kitchen Cooking",
            "path": "cooking",
            "icon": "mdi:pot-steam",
            "panel": True,
            "cards": [
                {
                    "type": "iframe",
                    "url": "/kitchen-cooking-panel",
                    "aspect_ratio": "100%",
                }
            ],
        }
    ]
}


async def async_create_view_assist_dashboard(hass: HomeAssistant) -> bool:
    """Create the View Assist dashboard if it doesn't exist.

    Uses DashboardsCollection directly (same pattern as HA core's
    _create_map_dashboard and R290_heatpump integration).

    Args:
        hass: Home Assistant instance

    Returns:
        bool: True if dashboard was created or already exists, False on error
    """
    lovelace_data = hass.data.get(lovelace_const.LOVELACE_DATA)
    if lovelace_data is None:
        _LOGGER.warning("Lovelace not loaded yet, cannot create View Assist dashboard")
        return False

    # Check if dashboard already exists in memory
    dashboards = getattr(lovelace_data, "dashboards", {})
    if DASHBOARD_URL_PATH in dashboards:
        _LOGGER.debug("View Assist dashboard already exists at /%s", DASHBOARD_URL_PATH)
        return True

    try:
        # Load the dashboards storage collection
        dashboards_collection = lovelace_dashboard.DashboardsCollection(hass)
        await dashboards_collection.async_load()

        # Check if it already exists in storage (but not yet in memory)
        existing_id: str | None = None
        for item_id, item in dashboards_collection.data.items():
            if item.get(lovelace_const.CONF_URL_PATH) == DASHBOARD_URL_PATH:
                existing_id = item_id
                break

        if existing_id is None:
            # Create the dashboard entry in storage
            _LOGGER.info(
                "Creating storage-backed View Assist dashboard '%s'",
                DASHBOARD_URL_PATH,
            )
            item = await dashboards_collection.async_create_item(
                {
                    lovelace_const.CONF_URL_PATH: DASHBOARD_URL_PATH,
                    lovelace_const.CONF_TITLE: DASHBOARD_TITLE,
                    lovelace_const.CONF_ICON: DASHBOARD_ICON,
                    lovelace_const.CONF_REQUIRE_ADMIN: DASHBOARD_REQUIRE_ADMIN,
                    lovelace_const.CONF_SHOW_IN_SIDEBAR: True,
                }
            )
        else:
            _LOGGER.debug("Dashboard already in storage, registering in memory")
            item = dashboards_collection.data[existing_id]

        # Register in lovelace data for immediate use
        lovelace_config = lovelace_data.dashboards.get(DASHBOARD_URL_PATH)
        if not isinstance(lovelace_config, lovelace_dashboard.LovelaceStorage):
            lovelace_config = lovelace_dashboard.LovelaceStorage(hass, item)
            lovelace_data.dashboards[DASHBOARD_URL_PATH] = lovelace_config

        # Save the dashboard view config (iframe to our cooking panel)
        await lovelace_config.async_save(DASHBOARD_VIEW_CONFIG)

        # Register the sidebar panel
        frontend.async_register_built_in_panel(
            hass,
            lovelace_const.DOMAIN,
            frontend_url_path=DASHBOARD_URL_PATH,
            sidebar_title=DASHBOARD_TITLE,
            sidebar_icon=DASHBOARD_ICON,
            require_admin=DASHBOARD_REQUIRE_ADMIN,
            config={"mode": lovelace_config.mode},
            update=True,
        )

        _LOGGER.info("View Assist dashboard ready at /%s", DASHBOARD_URL_PATH)
        return True

    except Exception as err:
        _LOGGER.error("Failed to create View Assist dashboard: %s", err)
        return False


async def async_remove_view_assist_dashboard(hass: HomeAssistant) -> bool:
    """Remove the View Assist dashboard.

    Args:
        hass: Home Assistant instance

    Returns:
        bool: True if dashboard was removed or didn't exist, False on error
    """
    lovelace_data = hass.data.get(lovelace_const.LOVELACE_DATA)
    if lovelace_data is None:
        _LOGGER.debug("Lovelace not loaded, nothing to remove")
        return True

    # Remove from lovelace data
    dashboards = getattr(lovelace_data, "dashboards", {})
    if DASHBOARD_URL_PATH not in dashboards:
        _LOGGER.debug("View Assist dashboard doesn't exist, nothing to remove")
        return True

    try:
        # Remove from storage collection
        dashboards_collection = lovelace_dashboard.DashboardsCollection(hass)
        await dashboards_collection.async_load()

        for item_id, item in list(dashboards_collection.data.items()):
            if item.get(lovelace_const.CONF_URL_PATH) == DASHBOARD_URL_PATH:
                await dashboards_collection.async_delete_item(item_id)
                break

        # Remove from in-memory lovelace data
        lovelace_data.dashboards.pop(DASHBOARD_URL_PATH, None)

        # Remove sidebar panel
        frontend.async_remove_panel(hass, DASHBOARD_URL_PATH)

        _LOGGER.info("Removed View Assist dashboard from /%s", DASHBOARD_URL_PATH)
        return True

    except Exception as err:
        _LOGGER.error("Failed to remove View Assist dashboard: %s", err)
        return False
