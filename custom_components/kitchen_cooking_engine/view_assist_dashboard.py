"""View Assist Dashboard Integration.

Last Updated: 16 Jan 2026, 13:16 UTC
Last Change: v0.4.2.01 - Create View Assist dashboard for zero-config compatibility

This module manages the automatic creation and removal of a storage-mode Lovelace
dashboard that embeds the cooking panel in an iframe, enabling View Assist compatibility
with zero user configuration.
"""

from __future__ import annotations

from dataclasses import dataclass
import logging
from typing import Any

from homeassistant.core import HomeAssistant

_LOGGER = logging.getLogger(__name__)

# Dashboard configuration constants
DASHBOARD_URL_PATH = "cooking-va"
DASHBOARD_TITLE = "Kitchen Cooking (View Assist)"
DASHBOARD_ICON = "mdi:pot-steam"
DASHBOARD_REQUIRE_ADMIN = False


@dataclass
class MockAdminUser:
    """Mock admin user for WebSocket operations."""

    is_admin: bool = True


class MockWSConnection:
    """Mock WebSocket connection for programmatic Lovelace dashboard operations."""

    def __init__(self, hass: HomeAssistant) -> None:
        """Initialize the mock WebSocket connection."""
        self.hass = hass
        self.user = MockAdminUser()
        self.failed_request = False

    def send_result(self, msg_id: int, result: Any) -> None:
        """Mock send_result - marks request as successful."""
        self.failed_request = False
        _LOGGER.debug("WS request %s succeeded", msg_id)

    def send_error(self, msg_id: int, code: str, message: str) -> None:
        """Mock send_error - marks request as failed and logs error."""
        self.failed_request = True
        _LOGGER.error("WS request %s failed: %s - %s", msg_id, code, message)

    async def execute_ws_func(self, ws_type: str, msg: dict) -> bool:
        """Execute a WebSocket handler function.

        Args:
            ws_type: The WebSocket command type (e.g. "lovelace/dashboards/create")
            msg: The message dict containing command parameters

        Returns:
            bool: True if the request succeeded, False otherwise
        """
        self.failed_request = False

        # Get the WebSocket API registry
        ws_api = self.hass.data.get("websocket_api")
        if not ws_api:
            _LOGGER.error("WebSocket API not available")
            return False

        # Get the handler for this command type
        handler = ws_api.get(ws_type)
        if not handler:
            _LOGGER.error("WebSocket handler not found for type: %s", ws_type)
            return False

        # Execute the handler
        try:
            await handler(self.hass, self, msg)
            return not self.failed_request
        except Exception as err:
            _LOGGER.error("Error executing WebSocket handler %s: %s", ws_type, err)
            return False


async def async_create_view_assist_dashboard(hass: HomeAssistant) -> bool:
    """Create the View Assist dashboard if it doesn't exist.

    Args:
        hass: Home Assistant instance

    Returns:
        bool: True if dashboard was created or already exists, False on error
    """
    # Check if lovelace data is available
    lovelace_data = hass.data.get("lovelace")
    if not lovelace_data:
        _LOGGER.warning("Lovelace not loaded yet, cannot create View Assist dashboard")
        return False

    # Check if dashboard already exists
    dashboards = lovelace_data.get("dashboards", {})
    if DASHBOARD_URL_PATH in dashboards:
        _LOGGER.debug("View Assist dashboard already exists at /%s", DASHBOARD_URL_PATH)
        return True

    # Create the dashboard using WebSocket API
    conn = MockWSConnection(hass)

    create_msg = {
        "id": 1,
        "url_path": DASHBOARD_URL_PATH,
        "title": DASHBOARD_TITLE,
        "icon": DASHBOARD_ICON,
        "require_admin": DASHBOARD_REQUIRE_ADMIN,
        "mode": "storage",  # Storage mode for View Assist compatibility
    }

    success = await conn.execute_ws_func("lovelace/dashboards/create", create_msg)

    if not success:
        _LOGGER.error("Failed to create View Assist dashboard")
        return False

    _LOGGER.info("Created View Assist dashboard at /%s", DASHBOARD_URL_PATH)

    # Now configure the dashboard with an iframe view
    config_msg = {
        "id": 2,
        "url_path": DASHBOARD_URL_PATH,
        "config": {
            "views": [
                {
                    "title": "Kitchen Cooking",
                    "path": "cooking",
                    "icon": "mdi:pot-steam",
                    "panel": True,  # Full-width panel mode
                    "cards": [
                        {
                            "type": "iframe",
                            "url": "/kitchen-cooking-panel",
                            "aspect_ratio": "100%",
                        }
                    ],
                }
            ]
        },
    }

    success = await conn.execute_ws_func("lovelace/config/save", config_msg)

    if not success:
        _LOGGER.error("Failed to configure View Assist dashboard")
        return False

    _LOGGER.info("Configured View Assist dashboard with iframe view")
    return True


async def async_remove_view_assist_dashboard(hass: HomeAssistant) -> bool:
    """Remove the View Assist dashboard.

    Args:
        hass: Home Assistant instance

    Returns:
        bool: True if dashboard was removed or didn't exist, False on error
    """
    # Check if lovelace data is available
    lovelace_data = hass.data.get("lovelace")
    if not lovelace_data:
        _LOGGER.debug("Lovelace not loaded, nothing to remove")
        return True

    # Check if dashboard exists
    dashboards = lovelace_data.get("dashboards", {})
    if DASHBOARD_URL_PATH not in dashboards:
        _LOGGER.debug("View Assist dashboard doesn't exist, nothing to remove")
        return True

    # Delete the dashboard using WebSocket API
    conn = MockWSConnection(hass)

    delete_msg = {
        "id": 1,
        "url_path": DASHBOARD_URL_PATH,
    }

    success = await conn.execute_ws_func("lovelace/dashboards/delete", delete_msg)

    if not success:
        _LOGGER.error("Failed to remove View Assist dashboard")
        return False

    _LOGGER.info("Removed View Assist dashboard from /%s", DASHBOARD_URL_PATH)
    return True
