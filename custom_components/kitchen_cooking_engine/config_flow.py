"""Config flow for Kitchen Cooking Engine integration.

Last Updated: 9 Jan 2026, 00:10 CET
Last Change: Phase 3.2 - Redesigned for multi-appliance support
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
    CONF_AUTO_SHUTOFF,
    CONF_AUTO_START,
    CONF_BATTERY_SENSOR,
    CONF_TEMPERATURE_UNIT,
    CONF_INDICATOR_LIGHT,
    CONF_NOTIFY_SERVICE,
    CONF_POWER_OUTLET,
    CONF_START_BUTTON,
    CONF_TTS_ENTITY,
    CONF_MEDIA_PLAYER,
    DOMAIN,
    TEMP_CELSIUS,
    TEMP_FAHRENHEIT,
)

_LOGGER = logging.getLogger(__name__)

# Phase 3.2: Appliance type constants
CONF_APPLIANCE_TYPE = "appliance_type"
CONF_APPLIANCE_NAME = "name"
CONF_HAS_CONVECTION = "has_convection"
CONF_HAS_GRILL = "has_grill"
CONF_STOVE_TYPE = "type"
CONF_NUM_BURNERS = "num_burners"
CONF_MICROWAVE_WATTAGE = "wattage"
CONF_HAS_SENSOR_COOK = "has_sensor"
CONF_MULTIFRY_BOWL_TYPE = "bowl_type"

# Appliance type options
APPLIANCE_TYPE_MEATER_PLUS = "meater_plus"
APPLIANCE_TYPE_NINJA_COMBI = "ninja_combi"
APPLIANCE_TYPE_MULTIFRY = "multifry"
APPLIANCE_TYPE_STANDARD_OVEN = "standard_oven"
APPLIANCE_TYPE_STOVETOP = "stovetop"
APPLIANCE_TYPE_MICROWAVE = "microwave"
APPLIANCE_TYPE_CUSTOM = "custom"

APPLIANCE_TYPES = {
    APPLIANCE_TYPE_MEATER_PLUS: "MEATER+ Temperature Probe",
    APPLIANCE_TYPE_NINJA_COMBI: "Ninja Combi SFP700EU",
    APPLIANCE_TYPE_MULTIFRY: "De'Longhi MultiFry FH1394",
    APPLIANCE_TYPE_STANDARD_OVEN: "Standard Oven",
    APPLIANCE_TYPE_STOVETOP: "Stovetop",
    APPLIANCE_TYPE_MICROWAVE: "Microwave Oven",
    APPLIANCE_TYPE_CUSTOM: "Custom Appliance",
}


class KitchenCookingEngineConfigFlow(config_entries.ConfigFlow, domain=DOMAIN):
    """Handle a config flow for Kitchen Cooking Engine."""

    VERSION = 2  # Incremented for Phase 3.2

    def __init__(self) -> None:
        """Initialize the config flow."""
        self._selected_appliance_type: str | None = None
        self._config_data: dict[str, Any] = {}

    async def async_step_user(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Handle the initial step - appliance type selection."""
        errors: dict[str, str] = {}

        if user_input is not None:
            self._selected_appliance_type = user_input[CONF_APPLIANCE_TYPE]
            self._config_data[CONF_APPLIANCE_TYPE] = self._selected_appliance_type
            
            # Route to appropriate configuration step
            if self._selected_appliance_type == APPLIANCE_TYPE_MEATER_PLUS:
                return await self.async_step_meater_plus()
            elif self._selected_appliance_type == APPLIANCE_TYPE_NINJA_COMBI:
                return await self.async_step_ninja_combi()
            elif self._selected_appliance_type == APPLIANCE_TYPE_MULTIFRY:
                return await self.async_step_multifry()
            elif self._selected_appliance_type == APPLIANCE_TYPE_STANDARD_OVEN:
                return await self.async_step_standard_oven()
            elif self._selected_appliance_type == APPLIANCE_TYPE_STOVETOP:
                return await self.async_step_stovetop()
            elif self._selected_appliance_type == APPLIANCE_TYPE_MICROWAVE:
                return await self.async_step_microwave()
            elif self._selected_appliance_type == APPLIANCE_TYPE_CUSTOM:
                return await self.async_step_custom()

        # Show appliance type selection form
        return self.async_show_form(
            step_id="user",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_APPLIANCE_TYPE): vol.In(APPLIANCE_TYPES),
                }
            ),
            errors=errors,
            description_placeholders={
                "info": "Select the type of appliance to add to your kitchen."
            },
        )

    async def async_step_meater_plus(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure MEATER+ temperature probe."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Validate the temperature sensor exists
            temp_sensor = user_input.get(CONF_TEMPERATURE_SENSOR, "").strip()

            if not temp_sensor:
                errors[CONF_TEMPERATURE_SENSOR] = "sensor_not_found"
            elif self.hass.states.get(temp_sensor) is None:
                errors[CONF_TEMPERATURE_SENSOR] = "sensor_not_found"
            else:
                # Merge with saved data
                self._config_data.update(user_input)
                
                # Create unique ID based on temperature sensor
                await self.async_set_unique_id(f"kce_{temp_sensor}")
                self._abort_if_unique_id_configured()

                return self.async_create_entry(
                    title=f"MEATER+ ({temp_sensor.split('.')[-1]})",
                    data=self._config_data,
                )

        # Show MEATER+ configuration form
        return self.async_show_form(
            step_id="meater_plus",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_TEMPERATURE_SENSOR, default=""): str,
                    vol.Optional(CONF_AMBIENT_SENSOR, default=""): str,
                    vol.Optional(CONF_BATTERY_SENSOR, default=""): str,
                    vol.Optional(CONF_INDICATOR_LIGHT, default=""): str,
                    vol.Optional(CONF_NOTIFY_SERVICE, default=""): str,
                    vol.Optional(CONF_TTS_ENTITY, default=""): str,
                    vol.Optional(CONF_MEDIA_PLAYER, default=""): str,
                    vol.Optional(CONF_POWER_OUTLET, default=""): str,
                    vol.Optional(CONF_START_BUTTON, default=""): str,
                    vol.Optional(CONF_AUTO_SHUTOFF, default=True): bool,
                    vol.Optional(CONF_AUTO_START, default=False): bool,
                    vol.Required(
                        CONF_TEMPERATURE_UNIT, default=TEMP_CELSIUS
                    ): vol.In([TEMP_CELSIUS, TEMP_FAHRENHEIT]),
                }
            ),
            errors=errors,
        )

    async def async_step_ninja_combi(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure Ninja Combi appliance."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Merge with saved data
            self._config_data.update(user_input)
            
            # Create unique ID
            name = user_input.get(CONF_APPLIANCE_NAME, "Ninja Combi")
            await self.async_set_unique_id(f"kce_ninja_combi_{name.lower().replace(' ', '_')}")
            self._abort_if_unique_id_configured()

            return self.async_create_entry(
                title=name,
                data=self._config_data,
            )

        # Show Ninja Combi configuration form
        return self.async_show_form(
            step_id="ninja_combi",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_APPLIANCE_NAME, default="Ninja Combi"): str,
                    vol.Optional(CONF_POWER_OUTLET, default=""): str,
                    vol.Optional(CONF_START_BUTTON, default=""): str,
                }
            ),
            errors=errors,
        )

    async def async_step_multifry(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure MultiFry appliance."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Merge with saved data
            self._config_data.update(user_input)
            
            # Create unique ID
            name = user_input.get(CONF_APPLIANCE_NAME, "MultiFry")
            await self.async_set_unique_id(f"kce_multifry_{name.lower().replace(' ', '_')}")
            self._abort_if_unique_id_configured()

            return self.async_create_entry(
                title=name,
                data=self._config_data,
            )

        # Show MultiFry configuration form
        return self.async_show_form(
            step_id="multifry",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_APPLIANCE_NAME, default="MultiFry"): str,
                    vol.Required(CONF_MULTIFRY_BOWL_TYPE, default="ceramic"): vol.In(
                        {"ceramic": "Ceramic Bowl (J)", "nonstick": "Non-stick Bowl (Z)"}
                    ),
                    vol.Optional(CONF_POWER_OUTLET, default=""): str,
                    vol.Optional(CONF_START_BUTTON, default=""): str,
                }
            ),
            errors=errors,
        )

    async def async_step_standard_oven(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure standard oven appliance."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Merge with saved data
            self._config_data.update(user_input)
            
            # Create unique ID
            name = user_input.get(CONF_APPLIANCE_NAME, "Oven")
            await self.async_set_unique_id(f"kce_oven_{name.lower().replace(' ', '_')}")
            self._abort_if_unique_id_configured()

            return self.async_create_entry(
                title=name,
                data=self._config_data,
            )

        # Show oven configuration form
        return self.async_show_form(
            step_id="standard_oven",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_APPLIANCE_NAME, default="Standard Oven"): str,
                    vol.Optional(CONF_HAS_CONVECTION, default=False): bool,
                    vol.Optional(CONF_HAS_GRILL, default=False): bool,
                    vol.Optional(CONF_POWER_OUTLET, default=""): str,
                }
            ),
            errors=errors,
        )

    async def async_step_stovetop(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure stovetop appliance."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Merge with saved data
            self._config_data.update(user_input)
            
            # Create unique ID
            name = user_input.get(CONF_APPLIANCE_NAME, "Stovetop")
            await self.async_set_unique_id(f"kce_stovetop_{name.lower().replace(' ', '_')}")
            self._abort_if_unique_id_configured()

            return self.async_create_entry(
                title=name,
                data=self._config_data,
            )

        # Show stovetop configuration form
        return self.async_show_form(
            step_id="stovetop",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_APPLIANCE_NAME, default="Stovetop"): str,
                    vol.Required(CONF_STOVE_TYPE, default="gas"): vol.In(
                        {
                            "gas": "Gas",
                            "electric_coil": "Electric Coil",
                            "electric_smoothtop": "Electric Smoothtop",
                            "induction": "Induction",
                        }
                    ),
                    vol.Required(CONF_NUM_BURNERS, default=4): vol.In([2, 3, 4, 5, 6]),
                }
            ),
            errors=errors,
        )

    async def async_step_microwave(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure microwave oven appliance."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Merge with saved data
            self._config_data.update(user_input)
            
            # Create unique ID
            name = user_input.get(CONF_APPLIANCE_NAME, "Microwave")
            await self.async_set_unique_id(f"kce_microwave_{name.lower().replace(' ', '_')}")
            self._abort_if_unique_id_configured()

            return self.async_create_entry(
                title=name,
                data=self._config_data,
            )

        # Show microwave configuration form
        return self.async_show_form(
            step_id="microwave",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_APPLIANCE_NAME, default="Microwave"): str,
                    vol.Required(CONF_MICROWAVE_WATTAGE, default=1000): vol.In(
                        [600, 700, 800, 900, 1000, 1100, 1200, 1500]
                    ),
                    vol.Optional(CONF_HAS_SENSOR_COOK, default=False): bool,
                    vol.Optional(CONF_HAS_CONVECTION, default=False): bool,
                    vol.Optional(CONF_POWER_OUTLET, default=""): str,
                }
            ),
            errors=errors,
        )

    async def async_step_custom(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure custom appliance."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Merge with saved data
            self._config_data.update(user_input)
            
            # Create unique ID
            name = user_input.get(CONF_APPLIANCE_NAME, "Custom Appliance")
            await self.async_set_unique_id(f"kce_custom_{name.lower().replace(' ', '_')}")
            self._abort_if_unique_id_configured()

            # TODO: In future, add feature selection for custom appliances
            # For now, custom appliances get minimal features

            return self.async_create_entry(
                title=name,
                data=self._config_data,
            )

        # Show custom appliance configuration form
        return self.async_show_form(
            step_id="custom",
            data_schema=vol.Schema(
                {
                    vol.Required(CONF_APPLIANCE_NAME, default="Custom Appliance"): str,
                    vol.Optional(CONF_POWER_OUTLET, default=""): str,
                }
            ),
            errors=errors,
            description_placeholders={
                "info": "Custom appliance configuration. Feature selection will be added in a future update."
            },
        )

    @staticmethod
    @callback
    def async_get_options_flow(
        config_entry: config_entries.ConfigEntry,
    ) -> config_entries.OptionsFlow:
        """Get the options flow for this handler."""
        return KitchenCookingEngineOptionsFlow()


class KitchenCookingEngineOptionsFlow(config_entries.OptionsFlow):
    """Handle options flow for Kitchen Cooking Engine."""

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
                    vol.Optional(
                        CONF_BATTERY_SENSOR,
                        default=current_data.get(CONF_BATTERY_SENSOR, ""),
                    ): str,
                    vol.Optional(
                        CONF_INDICATOR_LIGHT,
                        default=current_data.get(CONF_INDICATOR_LIGHT, ""),
                    ): str,
                    vol.Optional(
                        CONF_NOTIFY_SERVICE,
                        default=current_data.get(CONF_NOTIFY_SERVICE, ""),
                    ): str,
                    vol.Optional(
                        CONF_TTS_ENTITY,
                        default=current_data.get(CONF_TTS_ENTITY, ""),
                    ): str,
                    vol.Optional(
                        CONF_MEDIA_PLAYER,
                        default=current_data.get(CONF_MEDIA_PLAYER, ""),
                    ): str,
                    vol.Required(
                        CONF_TEMPERATURE_UNIT,
                        default=current_data.get(CONF_TEMPERATURE_UNIT, TEMP_CELSIUS),
                    ): vol.In([TEMP_CELSIUS, TEMP_FAHRENHEIT]),
                }
            ),
            description_placeholders={
                "notify_hint": "e.g., mobile_app_your_phone"
            },
        )

