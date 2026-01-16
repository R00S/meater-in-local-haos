"""View Assist dashboard manager for Kitchen Cooking Engine.

This module manages the automatic creation and removal of View Assist-compatible
dashboards using the WebSocket API, similar to how View Assist itself creates dashboards.
"""
from __future__ import annotations

import logging
from dataclasses import dataclass
from typing import Any

from homeassistant.components.lovelace import (
    CONF_ICON,
    CONF_REQUIRE_ADMIN,
    CONF_SHOW_IN_SIDEBAR,
    CONF_TITLE,
    CONF_URL_PATH,
    LovelaceData,
    dashboard,
)
from homeassistant.const import CONF_ID, CONF_MODE, CONF_TYPE
from homeassistant.core import HomeAssistant

_LOGGER = logging.getLogger(__name__)

# Dashboard configuration constants
DASHBOARD_URL_PATH = "cooking-va"
DASHBOARD_TITLE = "Kitchen Cooking (View Assist)"
DASHBOARD_ICON = "mdi:pot-steam"


@dataclass
class MockAdminUser:
    """Mock admin user for WebSocket operations."""

    is_admin = True


class MockWSConnection:
    """Mock WebSocket connection for programmatic dashboard creation.
    
    This class mimics a WebSocket connection to enable programmatic
    calls to Lovelace dashboard WebSocket handlers.
    """

    def __init__(self, hass: HomeAssistant) -> None:
        """Initialize mock connection.
        
        Args:
            hass: Home Assistant instance
        """
        self.hass = hass
        self.user = MockAdminUser()
        self.failed_request: bool = False

    def send_result(self, id, item):
        """Receive result from WebSocket handler.
        
        Args:
            id: Request ID
            item: Result item
        """
        self.failed_request = False

    def send_error(self, id, code, msg):
        """Receive error from WebSocket handler.
        
        Args:
            id: Request ID
            code: Error code
            msg: Error message
        """
        self.failed_request = True
        _LOGGER.error("WebSocket error: %s - %s", code, msg)

    def execute_ws_func(self, ws_type: str, msg: dict[str, Any]) -> bool:
        """Execute WebSocket handler function.
        
        Args:
            ws_type: WebSocket handler type (e.g., "lovelace/dashboards/create")
            msg: Message dictionary with handler parameters
            
        Returns:
            bool: True if successful, False otherwise
        """
        if self.hass.data["websocket_api"].get(ws_type):
            try:
                handler, schema = self.hass.data["websocket_api"][ws_type]
                if schema is False:
                    handler(self.hass, self, msg)
                else:
                    handler(self.hass, self, schema(msg))
            except Exception as ex:
                _LOGGER.error("Error calling %s: %s", ws_type, ex)
                return False
            else:
                return not self.failed_request
        return False


async def async_create_view_assist_dashboard(hass: HomeAssistant) -> bool:
    """Create View Assist compatible dashboard with iframe to main panel.
    
    This function creates a storage-mode Lovelace dashboard that contains
    an iframe view embedding the existing cooking panel at /kitchen-cooking.
    
    Args:
        hass: Home Assistant instance
        
    Returns:
        bool: True if dashboard was created or already exists, False on error
    """
    # Check if lovelace data is available
    lovelace: LovelaceData = hass.data.get("lovelace")
    if not lovelace:
        _LOGGER.error("Lovelace not initialized")
        return False

    # Check if dashboard already exists
    if DASHBOARD_URL_PATH in lovelace.dashboards:
        _LOGGER.debug("View Assist dashboard already exists")
        return True

    # Create dashboard using WebSocket API
    mock_connection = MockWSConnection(hass)

    if not mock_connection.execute_ws_func(
        "lovelace/dashboards/create",
        {
            CONF_ID: 1,
            CONF_TYPE: "lovelace/dashboards/create",
            CONF_ICON: DASHBOARD_ICON,
            CONF_TITLE: DASHBOARD_TITLE,
            CONF_URL_PATH: DASHBOARD_URL_PATH,
            CONF_MODE: "storage",
            CONF_SHOW_IN_SIDEBAR: False,  # Hidden from sidebar
            CONF_REQUIRE_ADMIN: False,
        },
    ):
        _LOGGER.error("Failed to create View Assist dashboard")
        return False

    # Create dashboard configuration with iframe view
    dashboard_config = {
        "views": [
            {
                "type": "panel",
                "title": "Cooking",
                "path": "main",
                "cards": [
                    {
                        "type": "iframe",
                        "url": "/kitchen-cooking",
                        "aspect_ratio": "100%",
                    }
                ],
            }
        ]
    }

    # Save dashboard configuration
    dashboard_store: dashboard.LovelaceStorage = lovelace.dashboards.get(
        DASHBOARD_URL_PATH
    )
    if dashboard_store:
        await dashboard_store.async_save(dashboard_config)
        _LOGGER.info("View Assist dashboard created at /%s", DASHBOARD_URL_PATH)
        return True

    _LOGGER.error("Dashboard created but unable to access storage")
    return False


async def async_remove_view_assist_dashboard(hass: HomeAssistant) -> bool:
    """Remove View Assist dashboard.
    
    This function removes the View Assist dashboard when the integration
    is being uninstalled.
    
    Args:
        hass: Home Assistant instance
        
    Returns:
        bool: True if dashboard was removed or doesn't exist, False on error
    """
    lovelace: LovelaceData = hass.data.get("lovelace")
    if not lovelace or DASHBOARD_URL_PATH not in lovelace.dashboards:
        return True

    mock_connection = MockWSConnection(hass)

    if mock_connection.execute_ws_func(
        "lovelace/dashboards/delete",
        {
            CONF_ID: 1,
            CONF_TYPE: "lovelace/dashboards/delete",
            CONF_URL_PATH: DASHBOARD_URL_PATH,
        },
    ):
        _LOGGER.info("View Assist dashboard removed")
        return True

    _LOGGER.error("Failed to remove View Assist dashboard")
    return False
