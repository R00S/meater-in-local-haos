"""Config flow for Kitchen Cooking Engine integration.

Last Updated: 14 Jan 2026, 01:00 CET
Last Change: Added feature editing UI to all predefined appliance options flows
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

# Default features for each predefined appliance type
# Maps appliance_type -> {feature_name: feature_type}
APPLIANCE_DEFAULT_FEATURES = {
    APPLIANCE_TYPE_NINJA_COMBI: {
        "oven": FEATURE_TYPE_STANDARD,
        "convection": FEATURE_TYPE_STANDARD,
        "air_fry": FEATURE_TYPE_STANDARD,
        "steam": FEATURE_TYPE_STANDARD,
        "prove": FEATURE_TYPE_STANDARD,
        "sear": FEATURE_TYPE_MODIFIED,
        "grill": FEATURE_TYPE_MODIFIED,
        "bake": FEATURE_TYPE_STANDARD,
        "roast": FEATURE_TYPE_STANDARD,
        "slow_cook": FEATURE_TYPE_MODIFIED,
        "combi_crisp": FEATURE_TYPE_SPECIAL,
        "combi_bake": FEATURE_TYPE_SPECIAL,
        "combi_roast": FEATURE_TYPE_SPECIAL,
        "combi_meal": FEATURE_TYPE_SPECIAL,
    },
    APPLIANCE_TYPE_MULTIFRY: {
        "casserole_risotto": FEATURE_TYPE_MODIFIED,
        "fry": FEATURE_TYPE_MODIFIED,
        "roast": FEATURE_TYPE_STANDARD,
        "gratin_grill": FEATURE_TYPE_STANDARD,
        "pizza_bread": FEATURE_TYPE_STANDARD,
        "dessert": FEATURE_TYPE_MODIFIED,
        "air_fry": FEATURE_TYPE_MODIFIED,
        "pan_fry": FEATURE_TYPE_MODIFIED,
        "sear": FEATURE_TYPE_MODIFIED,
    },
    APPLIANCE_TYPE_STANDARD_OVEN: {
        "oven": FEATURE_TYPE_STANDARD,
        "bake": FEATURE_TYPE_STANDARD,
        "broil": FEATURE_TYPE_STANDARD,
        "roast": FEATURE_TYPE_STANDARD,
        "convection": FEATURE_TYPE_STANDARD,  # Optional - based on has_convection
        "grill": FEATURE_TYPE_STANDARD,        # Optional - based on has_grill
    },
    APPLIANCE_TYPE_STOVETOP: {
        "pan_fry": FEATURE_TYPE_STANDARD,
        "sear": FEATURE_TYPE_STANDARD,
        "boil": FEATURE_TYPE_STANDARD,
        "simmer": FEATURE_TYPE_STANDARD,
        "saute": FEATURE_TYPE_STANDARD,
    },
    APPLIANCE_TYPE_MICROWAVE: {
        "microwave": FEATURE_TYPE_MODIFIED,
        "defrost": FEATURE_TYPE_MODIFIED,
        "reheat": FEATURE_TYPE_STANDARD,
        "sensor_cook": FEATURE_TYPE_MODIFIED,  # Optional - based on has_sensor
        "convection_microwave": FEATURE_TYPE_MODIFIED,  # Optional - based on has_convection
        "bake": FEATURE_TYPE_MODIFIED,  # Optional - based on has_convection
    },
}


def _build_feature_schema_dict(
    appliance_type: str,
    current_features: dict[str, str] | None = None,
    appliance_config: dict[str, Any] | None = None
) -> dict:
    """Build schema dictionary with feature editing for predefined appliances.
    
    Args:
        appliance_type: Type of appliance (ninja_combi, multifry, etc.)
        current_features: Currently configured features from config (overrides only)
        appliance_config: Current appliance configuration (for conditional features)
        
    Returns:
        Dictionary to be used in vol.Schema()
    """
    schema_dict = {}
    
    # Get default features for this appliance type
    default_features = APPLIANCE_DEFAULT_FEATURES.get(appliance_type, {})
    if not default_features:
        return schema_dict
    
    # Merge current features with defaults
    if current_features is None:
        current_features = {}
    
    # Filter features based on appliance configuration (for conditional features)
    features_to_show = dict(default_features)
    
    if appliance_type == APPLIANCE_TYPE_STANDARD_OVEN and appliance_config:
        # Only show convection if has_convection is True
        if not appliance_config.get(CONF_HAS_CONVECTION, False):
            features_to_show.pop("convection", None)
        # Only show grill if has_grill is True
        if not appliance_config.get(CONF_HAS_GRILL, False):
            features_to_show.pop("grill", None)
    
    elif appliance_type == APPLIANCE_TYPE_MICROWAVE and appliance_config:
        # Only show sensor_cook if has_sensor is True
        if not appliance_config.get(CONF_HAS_SENSOR_COOK, False):
            features_to_show.pop("sensor_cook", None)
        # Only show convection features if has_convection is True
        if not appliance_config.get(CONF_HAS_CONVECTION, False):
            features_to_show.pop("convection_microwave", None)
            features_to_show.pop("bake", None)
    
    # Sort features alphabetically for better UX
    sorted_features = sorted(features_to_show.items(), key=lambda x: x[0])
    
    for feature_name, default_type in sorted_features:
        # Check if feature exists in catalog
        if feature_name not in FEATURE_CATALOG:
            continue
        
        feature_def = FEATURE_CATALOG[feature_name]
        
        # Determine if feature is currently enabled
        # Feature is enabled if it's in the config overrides OR if it's explicitly disabled
        # For new configs: default features start as enabled
        # For existing configs: check if feature was explicitly disabled (value is None or False)
        if current_features:
            # Existing config: check if explicitly disabled
            is_enabled = current_features.get(feature_name) is not None
        else:
            # New config: all default features start enabled
            is_enabled = True
        
        current_type = current_features.get(feature_name, default_type)
        
        # Add checkbox for enabling/disabling the feature
        schema_dict[vol.Optional(
            f"feature_enabled_{feature_name}", 
            default=is_enabled
        )] = bool
        
        # Add dropdown for selecting feature type
        schema_dict[vol.Optional(
            f"feature_type_{feature_name}", 
            default=current_type
        )] = vol.In({
            FEATURE_TYPE_STANDARD: "Standard (use recipes as-is)",
            FEATURE_TYPE_MODIFIED: "Modified (auto-adapt recipes)",
            FEATURE_TYPE_SPECIAL: "Special (needs specific recipes)"
        })
    
    return schema_dict


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
            # Extract appliance name and power outlet/start button
            name = user_input.get(CONF_APPLIANCE_NAME, "Ninja Combi")
            power_outlet = user_input.get(CONF_POWER_OUTLET, "")
            start_button = user_input.get(CONF_START_BUTTON, "")
            
            # Build features dictionary from user input
            features = {}
            
            # Get default features for Ninja Combi
            default_features = APPLIANCE_DEFAULT_FEATURES.get(APPLIANCE_TYPE_NINJA_COMBI, {})
            
            # Scan all features that this appliance supports
            for feature_name in default_features.keys():
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
            updated_data[CONF_START_BUTTON] = start_button
            updated_data[CONF_FEATURES] = features
            
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data=updated_data,
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data
        
        # Get currently configured features
        current_features = current_data.get(CONF_FEATURES, {})
        
        # Build schema with appliance-specific settings first, then features
        schema_dict = {
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
        
        # Add feature editing schema
        feature_schema = _build_feature_schema_dict(
            APPLIANCE_TYPE_NINJA_COMBI,
            current_features,
            current_data
        )
        schema_dict.update(feature_schema)

        return self.async_show_form(
            step_id="ninja_combi",
            data_schema=vol.Schema(schema_dict),
            description_placeholders={
                "info": (
                    "Configure Ninja Combi settings and features.\n\n"
                    "For each feature:\n"
                    "1. Check the box to enable it\n"
                    "2. Select how it implements the feature:\n"
                    "   - Standard: Works like traditional method (no adaptation)\n"
                    "   - Modified: Requires recipe adjustments (time/temp)\n"
                    "   - Special: Needs appliance-specific recipes"
                )
            },
        )

    async def async_step_multifry(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure MultiFry options."""
        if user_input is not None:
            # Extract appliance settings
            name = user_input.get(CONF_APPLIANCE_NAME, "MultiFry")
            bowl_type = user_input.get(CONF_MULTIFRY_BOWL_TYPE, "nonstick_paddle")
            power_outlet = user_input.get(CONF_POWER_OUTLET, "")
            start_button = user_input.get(CONF_START_BUTTON, "")
            
            # Build features dictionary from user input
            features = {}
            
            # Get default features for MultiFry
            default_features = APPLIANCE_DEFAULT_FEATURES.get(APPLIANCE_TYPE_MULTIFRY, {})
            
            # Scan all features that this appliance supports
            for feature_name in default_features.keys():
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
            updated_data[CONF_MULTIFRY_BOWL_TYPE] = bowl_type
            updated_data[CONF_POWER_OUTLET] = power_outlet
            updated_data[CONF_START_BUTTON] = start_button
            updated_data[CONF_FEATURES] = features
            
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data=updated_data,
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data
        
        # Get currently configured features
        current_features = current_data.get(CONF_FEATURES, {})
        
        # Build schema with appliance-specific settings first, then features
        schema_dict = {
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
        
        # Add feature editing schema
        feature_schema = _build_feature_schema_dict(
            APPLIANCE_TYPE_MULTIFRY,
            current_features,
            current_data
        )
        schema_dict.update(feature_schema)

        return self.async_show_form(
            step_id="multifry",
            data_schema=vol.Schema(schema_dict),
            description_placeholders={
                "info": (
                    "Configure MultiFry settings and features.\n\n"
                    "For each feature:\n"
                    "1. Check the box to enable it\n"
                    "2. Select how it implements the feature:\n"
                    "   - Standard: Works like traditional method (no adaptation)\n"
                    "   - Modified: Requires recipe adjustments (time/temp)\n"
                    "   - Special: Needs appliance-specific recipes"
                )
            },
        )

    async def async_step_standard_oven(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure standard oven options."""
        if user_input is not None:
            # Extract appliance settings
            name = user_input.get(CONF_APPLIANCE_NAME, "Standard Oven")
            has_convection = user_input.get(CONF_HAS_CONVECTION, False)
            has_grill = user_input.get(CONF_HAS_GRILL, False)
            power_outlet = user_input.get(CONF_POWER_OUTLET, "")
            
            # Build features dictionary from user input
            features = {}
            
            # Get default features for Standard Oven
            default_features = APPLIANCE_DEFAULT_FEATURES.get(APPLIANCE_TYPE_STANDARD_OVEN, {})
            
            # Scan all features that this appliance supports
            for feature_name in default_features.keys():
                # Skip conditional features if they're not enabled
                if feature_name == "convection" and not has_convection:
                    continue
                if feature_name == "grill" and not has_grill:
                    continue
                
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
            updated_data[CONF_HAS_CONVECTION] = has_convection
            updated_data[CONF_HAS_GRILL] = has_grill
            updated_data[CONF_POWER_OUTLET] = power_outlet
            updated_data[CONF_FEATURES] = features
            
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data=updated_data,
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data
        
        # Get currently configured features
        current_features = current_data.get(CONF_FEATURES, {})
        
        # Build schema with appliance-specific settings first, then features
        schema_dict = {
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
        
        # Add feature editing schema (will filter based on has_convection/has_grill)
        feature_schema = _build_feature_schema_dict(
            APPLIANCE_TYPE_STANDARD_OVEN,
            current_features,
            current_data
        )
        schema_dict.update(feature_schema)

        return self.async_show_form(
            step_id="standard_oven",
            data_schema=vol.Schema(schema_dict),
            description_placeholders={
                "info": (
                    "Configure oven settings and features.\n\n"
                    "For each feature:\n"
                    "1. Check the box to enable it\n"
                    "2. Select how it implements the feature:\n"
                    "   - Standard: Works like traditional method (no adaptation)\n"
                    "   - Modified: Requires recipe adjustments (time/temp)\n"
                    "   - Special: Needs appliance-specific recipes"
                )
            },
        )

    async def async_step_stovetop(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure stovetop options."""
        if user_input is not None:
            # Extract appliance settings
            name = user_input.get(CONF_APPLIANCE_NAME, "Stovetop")
            stove_type = user_input.get(CONF_STOVE_TYPE, "gas")
            num_burners = user_input.get(CONF_NUM_BURNERS, 4)
            
            # Build features dictionary from user input
            features = {}
            
            # Get default features for Stovetop
            default_features = APPLIANCE_DEFAULT_FEATURES.get(APPLIANCE_TYPE_STOVETOP, {})
            
            # Scan all features that this appliance supports
            for feature_name in default_features.keys():
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
            updated_data[CONF_STOVE_TYPE] = stove_type
            updated_data[CONF_NUM_BURNERS] = num_burners
            updated_data[CONF_FEATURES] = features
            
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data=updated_data,
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data
        
        # Get currently configured features
        current_features = current_data.get(CONF_FEATURES, {})
        
        # Build schema with appliance-specific settings first, then features
        schema_dict = {
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
        
        # Add feature editing schema
        feature_schema = _build_feature_schema_dict(
            APPLIANCE_TYPE_STOVETOP,
            current_features,
            current_data
        )
        schema_dict.update(feature_schema)

        return self.async_show_form(
            step_id="stovetop",
            data_schema=vol.Schema(schema_dict),
            description_placeholders={
                "info": (
                    "Configure stovetop settings and features.\n\n"
                    "For each feature:\n"
                    "1. Check the box to enable it\n"
                    "2. Select how it implements the feature:\n"
                    "   - Standard: Works like traditional method (no adaptation)\n"
                    "   - Modified: Requires recipe adjustments (time/temp)\n"
                    "   - Special: Needs appliance-specific recipes"
                )
            },
        )

    async def async_step_microwave(
        self, user_input: dict[str, Any] | None = None
    ) -> config_entries.ConfigFlowResult:
        """Configure microwave options."""
        if user_input is not None:
            # Extract appliance settings
            name = user_input.get(CONF_APPLIANCE_NAME, "Microwave")
            wattage = user_input.get(CONF_MICROWAVE_WATTAGE, 1000)
            has_sensor = user_input.get(CONF_HAS_SENSOR_COOK, False)
            has_convection = user_input.get(CONF_HAS_CONVECTION, False)
            power_outlet = user_input.get(CONF_POWER_OUTLET, "")
            
            # Build features dictionary from user input
            features = {}
            
            # Get default features for Microwave
            default_features = APPLIANCE_DEFAULT_FEATURES.get(APPLIANCE_TYPE_MICROWAVE, {})
            
            # Scan all features that this appliance supports
            for feature_name in default_features.keys():
                # Skip conditional features if they're not enabled
                if feature_name == "sensor_cook" and not has_sensor:
                    continue
                if feature_name in ["convection_microwave", "bake"] and not has_convection:
                    continue
                
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
            updated_data[CONF_MICROWAVE_WATTAGE] = wattage
            updated_data[CONF_HAS_SENSOR_COOK] = has_sensor
            updated_data[CONF_HAS_CONVECTION] = has_convection
            updated_data[CONF_POWER_OUTLET] = power_outlet
            updated_data[CONF_FEATURES] = features
            
            self.hass.config_entries.async_update_entry(
                self.config_entry,
                data=updated_data,
            )
            return self.async_create_entry(title="", data={})

        current_data = self.config_entry.data
        
        # Get currently configured features
        current_features = current_data.get(CONF_FEATURES, {})
        
        # Build schema with appliance-specific settings first, then features
        schema_dict = {
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
        
        # Add feature editing schema (will filter based on has_sensor/has_convection)
        feature_schema = _build_feature_schema_dict(
            APPLIANCE_TYPE_MICROWAVE,
            current_features,
            current_data
        )
        schema_dict.update(feature_schema)

        return self.async_show_form(
            step_id="microwave",
            data_schema=vol.Schema(schema_dict),
            description_placeholders={
                "info": (
                    "Configure microwave settings and features.\n\n"
                    "For each feature:\n"
                    "1. Check the box to enable it\n"
                    "2. Select how it implements the feature:\n"
                    "   - Standard: Works like traditional method (no adaptation)\n"
                    "   - Modified: Requires recipe adjustments (time/temp)\n"
                    "   - Special: Needs appliance-specific recipes"
                )
            },
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

