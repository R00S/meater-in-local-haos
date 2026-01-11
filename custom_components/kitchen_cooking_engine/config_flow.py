"""Config flow for Kitchen Cooking Engine integration.

Last Updated: 11 Jan 2026, 01:00 CET
Last Change: Redesigned custom appliance config to use per-feature type selection
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
from .features.catalog import FEATURE_CATALOG

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

# Custom appliance feature configuration
CONF_FEATURES = "features"  # New: stores {"feature_name": "standard"|"modified"|"special"}

# Feature type options for UI
FEATURE_TYPE_STANDARD = "standard"
FEATURE_TYPE_MODIFIED = "modified"
FEATURE_TYPE_SPECIAL = "special"
FEATURE_TYPE_OPTIONS = [FEATURE_TYPE_STANDARD, FEATURE_TYPE_MODIFIED, FEATURE_TYPE_SPECIAL]

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
                    vol.Required(CONF_MULTIFRY_BOWL_TYPE, default="nonstick_paddle"): vol.In(
                        {
                            "nonstick_paddle": "Non-stick with Paddle (J)",
                            "nonstick_flat": "Non-stick Flat Bottom (Z)"
                        }
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
                    vol.Required(CONF_NUM_BURNERS, default=4): vol.In([1, 2, 3, 4, 5, 6]),
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
        """Configure custom appliance with per-feature type selection."""
        errors: dict[str, str] = {}

        if user_input is not None:
            # Extract appliance name and power outlet
            name = user_input.get(CONF_APPLIANCE_NAME, "Custom Appliance")
            power_outlet = user_input.get(CONF_POWER_OUTLET, "")
            
            # Build features dictionary from user input
            # Format: {"feature_name": "standard"|"modified"|"special"}
            features = {}
            
            # Scan all features from catalog
            for feature_name in FEATURE_CATALOG.keys():
                # Check if feature is enabled (checkbox)
                feature_enabled_key = f"feature_enabled_{feature_name}"
                if user_input.get(feature_enabled_key, False):
                    # Get feature type (dropdown)
                    feature_type_key = f"feature_type_{feature_name}"
                    feature_type = user_input.get(feature_type_key, FEATURE_TYPE_STANDARD)
                    features[feature_name] = feature_type
            
            # Validate that at least one feature is selected
            if not features:
                errors["base"] = "no_features_selected"
            else:
                # Store in config_data
                self._config_data.update({
                    CONF_APPLIANCE_NAME: name,
                    CONF_POWER_OUTLET: power_outlet,
                    CONF_FEATURES: features,
                    CONF_APPLIANCE_TYPE: APPLIANCE_TYPE_CUSTOM,
                })
                
                # Create unique ID
                await self.async_set_unique_id(f"kce_custom_{name.lower().replace(' ', '_')}")
                self._abort_if_unique_id_configured()

                return self.async_create_entry(
                    title=name,
                    data=self._config_data,
                )

        # Build dynamic form schema with all features from catalog
        schema_dict = {
            vol.Required(CONF_APPLIANCE_NAME, default="Custom Appliance"): str,
            vol.Optional(CONF_POWER_OUTLET, default=""): str,
        }
        
        # Add section for each feature from catalog
        # Sort features alphabetically for better UX
        sorted_features = sorted(FEATURE_CATALOG.items(), key=lambda x: x[1].display_name)
        
        for feature_name, feature_def in sorted_features:
            # Add checkbox for enabling the feature
            schema_dict[vol.Optional(f"feature_enabled_{feature_name}", default=False)] = bool
            
            # Add dropdown for selecting feature type
            schema_dict[vol.Optional(
                f"feature_type_{feature_name}", 
                default=FEATURE_TYPE_STANDARD
            )] = vol.In({
                FEATURE_TYPE_STANDARD: "Standard (use recipes as-is)",
                FEATURE_TYPE_MODIFIED: "Modified (auto-adapt recipes)",
                FEATURE_TYPE_SPECIAL: "Special (needs specific recipes)"
            })
        
        return self.async_show_form(
            step_id="custom",
            data_schema=vol.Schema(schema_dict),
            errors=errors,
            description_placeholders={
                "info": (
                    "Configure custom appliance by selecting features.\n\n"
                    "For each feature:\n"
                    "1. Check the box to enable it\n"
                    "2. Select how your appliance implements it:\n"
                    "   - Standard: Works like traditional method (no adaptation)\n"
                    "   - Modified: Requires recipe adjustments (time/temp)\n"
                    "   - Special: Needs appliance-specific recipes"
                )
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
        """Manage the options - route to appliance-specific step."""
        appliance_type = self.config_entry.data.get(CONF_APPLIANCE_TYPE, APPLIANCE_TYPE_MEATER_PLUS)
        
        # Route to the appropriate configuration step based on appliance type
        if appliance_type == APPLIANCE_TYPE_MEATER_PLUS:
            return await self.async_step_meater_plus(user_input)
        elif appliance_type == APPLIANCE_TYPE_NINJA_COMBI:
            return await self.async_step_ninja_combi(user_input)
        elif appliance_type == APPLIANCE_TYPE_MULTIFRY:
            return await self.async_step_multifry(user_input)
        elif appliance_type == APPLIANCE_TYPE_STANDARD_OVEN:
            return await self.async_step_standard_oven(user_input)
        elif appliance_type == APPLIANCE_TYPE_STOVETOP:
            return await self.async_step_stovetop(user_input)
        elif appliance_type == APPLIANCE_TYPE_MICROWAVE:
            return await self.async_step_microwave(user_input)
        elif appliance_type == APPLIANCE_TYPE_CUSTOM:
            return await self.async_step_custom(user_input)
        else:
            # Fallback to MEATER+ config for unknown types
            return await self.async_step_meater_plus(user_input)

    async def async_step_meater_plus(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure MEATER+ options."""
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
            step_id="meater_plus",
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

    async def async_step_ninja_combi(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure Ninja Combi options."""
        if user_input is not None:
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data={**self.config_entry.data, **user_input},
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data

        return self.async_show_form(
            step_id="ninja_combi",
            data_schema=vol.Schema(
                {
                    vol.Required(
                        CONF_APPLIANCE_NAME,
                        default=current_data.get(CONF_APPLIANCE_NAME, "Ninja Combi"),
                    ): str,
                    vol.Optional(
                        CONF_POWER_OUTLET,
                        default=current_data.get(CONF_POWER_OUTLET, ""),
                    ): str,
                    vol.Optional(
                        CONF_START_BUTTON,
                        default=current_data.get(CONF_START_BUTTON, ""),
                    ): str,
                }
            ),
        )

    async def async_step_multifry(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure MultiFry options."""
        if user_input is not None:
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data={**self.config_entry.data, **user_input},
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data

        return self.async_show_form(
            step_id="multifry",
            data_schema=vol.Schema(
                {
                    vol.Required(
                        CONF_APPLIANCE_NAME,
                        default=current_data.get(CONF_APPLIANCE_NAME, "MultiFry"),
                    ): str,
                    vol.Required(
                        CONF_MULTIFRY_BOWL_TYPE,
                        default=current_data.get(CONF_MULTIFRY_BOWL_TYPE, "nonstick_paddle"),
                    ): vol.In({
                        "nonstick_paddle": "Non-stick with Paddle (J)",
                        "nonstick_flat": "Non-stick Flat Bottom (Z)"
                    }),
                    vol.Optional(
                        CONF_POWER_OUTLET,
                        default=current_data.get(CONF_POWER_OUTLET, ""),
                    ): str,
                    vol.Optional(
                        CONF_START_BUTTON,
                        default=current_data.get(CONF_START_BUTTON, ""),
                    ): str,
                }
            ),
        )

    async def async_step_standard_oven(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure standard oven options."""
        if user_input is not None:
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data={**self.config_entry.data, **user_input},
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data

        return self.async_show_form(
            step_id="standard_oven",
            data_schema=vol.Schema(
                {
                    vol.Required(
                        CONF_APPLIANCE_NAME,
                        default=current_data.get(CONF_APPLIANCE_NAME, "Standard Oven"),
                    ): str,
                    vol.Optional(
                        CONF_HAS_CONVECTION,
                        default=current_data.get(CONF_HAS_CONVECTION, False),
                    ): bool,
                    vol.Optional(
                        CONF_HAS_GRILL,
                        default=current_data.get(CONF_HAS_GRILL, False),
                    ): bool,
                    vol.Optional(
                        CONF_POWER_OUTLET,
                        default=current_data.get(CONF_POWER_OUTLET, ""),
                    ): str,
                }
            ),
        )

    async def async_step_stovetop(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure stovetop options."""
        if user_input is not None:
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data={**self.config_entry.data, **user_input},
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data

        return self.async_show_form(
            step_id="stovetop",
            data_schema=vol.Schema(
                {
                    vol.Required(
                        CONF_APPLIANCE_NAME,
                        default=current_data.get(CONF_APPLIANCE_NAME, "Stovetop"),
                    ): str,
                    vol.Required(
                        CONF_STOVE_TYPE,
                        default=current_data.get(CONF_STOVE_TYPE, "gas"),
                    ): vol.In({
                        "gas": "Gas",
                        "electric_coil": "Electric Coil",
                        "electric_smoothtop": "Electric Smoothtop",
                        "induction": "Induction",
                    }),
                    vol.Required(
                        CONF_NUM_BURNERS,
                        default=current_data.get(CONF_NUM_BURNERS, 4),
                    ): vol.In([1, 2, 3, 4, 5, 6]),
                }
            ),
        )

    async def async_step_microwave(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure microwave options."""
        if user_input is not None:
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data={**self.config_entry.data, **user_input},
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data

        return self.async_show_form(
            step_id="microwave",
            data_schema=vol.Schema(
                {
                    vol.Required(
                        CONF_APPLIANCE_NAME,
                        default=current_data.get(CONF_APPLIANCE_NAME, "Microwave"),
                    ): str,
                    vol.Required(
                        CONF_MICROWAVE_WATTAGE,
                        default=current_data.get(CONF_MICROWAVE_WATTAGE, 1000),
                    ): vol.In([600, 700, 800, 900, 1000, 1100, 1200, 1500]),
                    vol.Optional(
                        CONF_HAS_SENSOR_COOK,
                        default=current_data.get(CONF_HAS_SENSOR_COOK, False),
                    ): bool,
                    vol.Optional(
                        CONF_HAS_CONVECTION,
                        default=current_data.get(CONF_HAS_CONVECTION, False),
                    ): bool,
                    vol.Optional(
                        CONF_POWER_OUTLET,
                        default=current_data.get(CONF_POWER_OUTLET, ""),
                    ): str,
                }
            ),
        )

    async def async_step_custom(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure custom appliance options with per-feature type management."""
        if user_input is not None:
            # Extract appliance name and power outlet
            name = user_input.get(CONF_APPLIANCE_NAME, "Custom Appliance")
            power_outlet = user_input.get(CONF_POWER_OUTLET, "")
            
            # Build features dictionary from user input
            features = {}
            
            # Scan all features from catalog
            for feature_name in FEATURE_CATALOG.keys():
                # Check if feature is enabled (checkbox)
                feature_enabled_key = f"feature_enabled_{feature_name}"
                if user_input.get(feature_enabled_key, False):
                    # Get feature type (dropdown)
                    feature_type_key = f"feature_type_{feature_name}"
                    feature_type = user_input.get(feature_type_key, FEATURE_TYPE_STANDARD)
                    features[feature_name] = feature_type
            
            # Update config with new data
            updated_data = {**self.config_entry.data}
            updated_data[CONF_APPLIANCE_NAME] = name
            updated_data[CONF_POWER_OUTLET] = power_outlet
            updated_data[CONF_FEATURES] = features
            
            # Migrate old format if present (backward compatibility)
            # Remove old keys if they exist
            updated_data.pop("custom_standard_features", None)
            updated_data.pop("custom_modified_features", None)
            updated_data.pop("custom_special_features", None)
            
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data=updated_data,
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data
        
        # Get currently configured features (handle both old and new format)
        current_features = {}
        
        # New format (preferred)
        if CONF_FEATURES in current_data:
            current_features = current_data[CONF_FEATURES]
        else:
            # Migrate from old format (backward compatibility)
            for feature in current_data.get("custom_standard_features", []):
                current_features[feature] = FEATURE_TYPE_STANDARD
            for feature in current_data.get("custom_modified_features", []):
                current_features[feature] = FEATURE_TYPE_MODIFIED
            for feature in current_data.get("custom_special_features", []):
                current_features[feature] = FEATURE_TYPE_SPECIAL

        # Build schema with pre-selected features
        schema_dict = {
            vol.Required(
                CONF_APPLIANCE_NAME,
                default=current_data.get(CONF_APPLIANCE_NAME, "Custom Appliance"),
            ): str,
            vol.Optional(
                CONF_POWER_OUTLET,
                default=current_data.get(CONF_POWER_OUTLET, ""),
            ): str,
        }
        
        # Add section for each feature from catalog
        # Sort features alphabetically for better UX
        sorted_features = sorted(FEATURE_CATALOG.items(), key=lambda x: x[1].display_name)
        
        for feature_name, feature_def in sorted_features:
            # Pre-fill checkbox based on current configuration
            is_enabled = feature_name in current_features
            
            # Add checkbox for enabling the feature
            schema_dict[vol.Optional(
                f"feature_enabled_{feature_name}", 
                default=is_enabled
            )] = bool
            
            # Add dropdown for selecting feature type
            # Pre-fill with current type or default to STANDARD
            current_type = current_features.get(feature_name, FEATURE_TYPE_STANDARD)
            schema_dict[vol.Optional(
                f"feature_type_{feature_name}", 
                default=current_type
            )] = vol.In({
                FEATURE_TYPE_STANDARD: "Standard (use recipes as-is)",
                FEATURE_TYPE_MODIFIED: "Modified (auto-adapt recipes)",
                FEATURE_TYPE_SPECIAL: "Special (needs specific recipes)"
            })

        return self.async_show_form(
            step_id="custom",
            data_schema=vol.Schema(schema_dict),
            description_placeholders={
                "info": (
                    "Manage custom appliance features.\n\n"
                    "For each feature:\n"
                    "1. Check the box to enable it\n"
                    "2. Select how your appliance implements it:\n"
                    "   - Standard: Works like traditional method (no adaptation)\n"
                    "   - Modified: Requires recipe adjustments (time/temp)\n"
                    "   - Special: Needs appliance-specific recipes"
                )
            },
        )

