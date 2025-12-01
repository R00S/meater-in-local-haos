"""Config flow for Kitchen Cooking Engine integration.

Last Updated: 2024-11-30T23:50:00Z
Last Agent Edit: 2024-11-30T23:50:00Z
"""

from __future__ import annotations

import logging
from typing import Any

import voluptuous as vol

from homeassistant import config_entries
from homeassistant.core import callback

from .const import (
    CONF_TEMPERATURE_SENSOR,
    CONF_AMBIENT_SENSOR,
    CONF_TEMPERATURE_UNIT,
    DOMAIN,
    TEMP_CELSIUS,
    TEMP_FAHRENHEIT,
)

_LOGGER = logging.getLogger(__name__)


class KitchenCookingEngineConfigFlow(config_entries.ConfigFlow, domain=DOMAIN):
    """Handle a config flow for Kitchen Cooking Engine."""

    VERSION = 1

    async def async_step_user(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Handle the initial step."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Validate the temperature sensor exists
            temp_sensor = user_input.get(CONF_TEMPERATURE_SENSOR, "").strip()

            if not temp_sensor:
                errors[CONF_TEMPERATURE_SENSOR] = "sensor_not_found"
            elif self.hass.states.get(temp_sensor) is None:
                errors[CONF_TEMPERATURE_SENSOR] = "sensor_not_found"
            else:
                # Create unique ID based on temperature sensor
                await self.async_set_unique_id(f"kce_{temp_sensor}")
                self._abort_if_unique_id_configured()

                return self.async_create_entry(
                    title=f"Cooking ({temp_sensor.split('.')[-1]})",
                    data=user_input,
                )

        # Show form
        return self.async_show_form(
            step_id="user",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_TEMPERATURE_SENSOR, default=""): str,
                    vol.Optional(CONF_AMBIENT_SENSOR, default=""): str,
                    vol.Required(
                        CONF_TEMPERATURE_UNIT, default=TEMP_CELSIUS
                    ): vol.In([TEMP_CELSIUS, TEMP_FAHRENHEIT]),
                }
            ),
            errors=errors,
        )

    @staticmethod
    @callback
    def async_get_options_flow(
        config_entry: config_entries.ConfigEntry,
    ) -> config_entries.OptionsFlow:
        """Get the options flow for this handler."""
        return KitchenCookingEngineOptionsFlow(config_entry)


class KitchenCookingEngineOptionsFlow(config_entries.OptionsFlow):
    """Handle options flow for Kitchen Cooking Engine."""

    def __init__(self, config_entry: config_entries.ConfigEntry) -> None:
        """Initialize options flow."""
        self.config_entry = config_entry

    async def async_step_init(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Manage the options."""
        if user_input is not None:
            # Update the config entry with new data
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data={**self.config_entry.data, **user_input},
            )
            return self.async_create_entry(title="", data={})

        # Pre-fill with existing values
        current_data = self.config_entry.data

        return self.async_show_form(
            step_id="init",
            data_schema=vol.Schema(
                {
                    vol.Required(
                        CONF_TEMPERATURE_SENSOR,
                        default=current_data.get(CONF_TEMPERATURE_SENSOR, ""),
                    ): str,
                    vol.Optional(
                        CONF_AMBIENT_SENSOR,
                        default=current_data.get(CONF_AMBIENT_SENSOR, ""),
                    ): str,
                    vol.Required(
                        CONF_TEMPERATURE_UNIT,
                        default=current_data.get(CONF_TEMPERATURE_UNIT, TEMP_CELSIUS),
                    ): vol.In([TEMP_CELSIUS, TEMP_FAHRENHEIT]),
                }
            ),
        )

