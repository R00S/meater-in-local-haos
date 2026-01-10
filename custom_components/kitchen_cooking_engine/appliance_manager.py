"""Appliance Manager Service for Kitchen Cooking Engine.

Central coordination service for multi-appliance management.
Handles appliance lifecycle, registry initialization, and feature aggregation.

Last Updated: 8 Jan 2026
Phase: 3.1 - Backend Infrastructure
"""

from __future__ import annotations

import logging
from typing import TYPE_CHECKING, Any, Dict, List, Optional, Set

from homeassistant.config_entries import ConfigEntry
from homeassistant.core import HomeAssistant
from homeassistant.helpers import entity_registry as er

from .appliances.registry import ApplianceRegistry, get_registry
from .const import DOMAIN

if TYPE_CHECKING:
    from .appliances import KitchenAppliance

_LOGGER = logging.getLogger(__name__)


class ApplianceManager:
    """Central manager for all kitchen appliances.
    
    Responsibilities:
    - Initialize appliance registry on startup
    - Create appliances from config entries
    - Register/unregister appliances in registry
    - Coordinate between appliances
    - Provide feature aggregation API
    - Handle appliance lifecycle
    """

    def __init__(self, hass: HomeAssistant) -> None:
        """Initialize the appliance manager.
        
        Args:
            hass: Home Assistant instance
        """
        self.hass = hass
        self._registry: Optional[ApplianceRegistry] = None
        self._appliances: Dict[str, KitchenAppliance] = {}
        
    @property
    def registry(self) -> ApplianceRegistry:
        """Get the appliance registry.
        
        Lazy initialization - creates registry on first access.
        
        Returns:
            ApplianceRegistry instance
        """
        if self._registry is None:
            self._registry = get_registry(self.hass)
        return self._registry
    
    async def async_setup(self) -> bool:
        """Set up the appliance manager.
        
        Called during integration initialization.
        
        Returns:
            True if setup successful
        """
        _LOGGER.info("Setting up Appliance Manager")
        
        # Initialize registry
        self._registry = get_registry(self.hass)
        
        # Store manager in hass.data for global access
        if DOMAIN not in self.hass.data:
            self.hass.data[DOMAIN] = {}
        self.hass.data[DOMAIN]["appliance_manager"] = self
        
        _LOGGER.info("Appliance Manager setup complete")
        return True
    
    async def async_setup_appliance(
        self,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Set up an appliance from a config entry.
        
        Creates the appropriate appliance instance based on config data
        and registers it in the global registry.
        
        Args:
            config_entry: Configuration entry for the appliance
            
        Returns:
            Created appliance instance, or None if setup failed
        """
        appliance_type = config_entry.data.get("appliance_type", "meater_plus")
        entry_id = config_entry.entry_id
        
        _LOGGER.info(
            "Setting up appliance: %s (type: %s, entry_id: %s)",
            config_entry.title,
            appliance_type,
            entry_id
        )
        
        try:
            # Create appliance instance based on type
            appliance = await self._create_appliance(
                appliance_type,
                config_entry
            )
            
            if appliance is None:
                _LOGGER.error(
                    "Failed to create appliance of type: %s",
                    appliance_type
                )
                return None
            
            # Register in global registry
            self.registry.register_appliance(entry_id, appliance)
            
            # Store locally for lifecycle management
            self._appliances[entry_id] = appliance
            
            _LOGGER.info(
                "Appliance registered successfully: %s with features: %s",
                config_entry.title,
                appliance.get_features()
            )
            
            return appliance
            
        except Exception as ex:
            _LOGGER.error(
                "Error setting up appliance %s: %s",
                config_entry.title,
                ex,
                exc_info=True
            )
            return None
    
    async def async_unload_appliance(self, entry_id: str) -> bool:
        """Unload an appliance.
        
        Removes appliance from registry and cleans up resources.
        
        Args:
            entry_id: Config entry ID of appliance to unload
            
        Returns:
            True if unload successful
        """
        _LOGGER.info("Unloading appliance: %s", entry_id)
        
        try:
            # Unregister from global registry
            self.registry.unregister_appliance(entry_id)
            
            # Remove from local storage
            if entry_id in self._appliances:
                del self._appliances[entry_id]
            
            _LOGGER.info("Appliance unloaded successfully: %s", entry_id)
            return True
            
        except Exception as ex:
            _LOGGER.error(
                "Error unloading appliance %s: %s",
                entry_id,
                ex,
                exc_info=True
            )
            return False
    
    async def _create_appliance(
        self,
        appliance_type: str,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Create an appliance instance based on type.
        
        Args:
            appliance_type: Type of appliance to create
            config_entry: Configuration entry
            
        Returns:
            Appliance instance or None if type unknown
        """
        # Import appliance classes (avoid circular imports)
        from .appliances.standard_oven import StandardOven
        from .appliances.stovetop import Stovetop
        from .appliances.microwave import MicrowaveOven
        from .appliances.delonghi_multifry import DelonghiMultiFry
        from .appliances.custom_appliance import CustomAppliance
        from .appliances import ApplianceDeviceControl
        
        # For now, we'll handle MEATER+ specially since it's the existing sensor
        # In Phase 3.2, this will be refactored to proper appliance class
        if appliance_type == "meater_plus":
            # Create a temporary MEATER+ appliance wrapper
            return await self._create_meater_plus_appliance(config_entry)
        
        elif appliance_type == "standard_oven":
            return self._create_standard_oven(config_entry)
        
        elif appliance_type == "stovetop":
            return self._create_stovetop(config_entry)
        
        elif appliance_type == "microwave":
            return self._create_microwave(config_entry)
        
        elif appliance_type == "ninja_combi":
            return self._create_ninja_combi(config_entry)
        
        elif appliance_type == "multifry":
            return self._create_multifry(config_entry)
        
        elif appliance_type == "custom":
            return self._create_custom_appliance(config_entry)
        
        else:
            _LOGGER.error("Unknown appliance type: %s", appliance_type)
            return None
    
    async def _create_meater_plus_appliance(
        self,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Create MEATER+ appliance wrapper.
        
        Temporary implementation that wraps existing sensor functionality.
        Will be refactored in Phase 3.2 to proper appliance class.
        
        Args:
            config_entry: Configuration entry
            
        Returns:
            MEATER+ appliance instance
        """
        # For now, create a minimal appliance that declares probe features
        # The actual sensor logic remains in sensor.py until Phase 3.2
        
        from .appliances import KitchenAppliance, FeatureType
        
        class MeaterPlusAppliance(KitchenAppliance):
            """Temporary MEATER+ appliance wrapper."""
            
            def __init__(self, name: str, config: Dict[str, Any]):
                super().__init__(name, "MEATER+ Temperature Probe")
                self.config = config
            
            def get_features(self) -> Set[str]:
                """Return MEATER+ features."""
                return {
                    "temperature_probe",
                    "ambient_temperature",
                    "dual_temperature"
                }
            
            def get_feature_implementation(self, feature: str) -> FeatureType:
                """All MEATER+ features are STANDARD."""
                if feature in self.get_features():
                    return FeatureType.STANDARD
                raise ValueError(f"Feature {feature} not supported")
        
        name = config_entry.title or "MEATER+"
        return MeaterPlusAppliance(name, dict(config_entry.data))
    
    def _create_standard_oven(
        self,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Create standard oven appliance.
        
        Args:
            config_entry: Configuration entry
            
        Returns:
            StandardOven instance
        """
        from .appliances.standard_oven import StandardOven
        
        name = config_entry.data.get("name", "Standard Oven")
        has_convection = config_entry.data.get("has_convection", False)
        has_grill = config_entry.data.get("has_grill", False)
        
        return StandardOven(name, has_convection=has_convection, has_grill=has_grill)
    
    def _create_stovetop(
        self,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Create stovetop appliance.
        
        Args:
            config_entry: Configuration entry
            
        Returns:
            Stovetop instance
        """
        from .appliances.stovetop import Stovetop
        
        name = config_entry.data.get("name", "Stovetop")
        stove_type = config_entry.data.get("type", "gas")
        num_burners = config_entry.data.get("num_burners", 4)
        
        return Stovetop(name, stove_type=stove_type, num_burners=num_burners)
    
    def _create_microwave(
        self,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Create microwave appliance.
        
        Args:
            config_entry: Configuration entry
            
        Returns:
            MicrowaveOven instance
        """
        from .appliances.microwave import MicrowaveOven
        
        name = config_entry.data.get("name", "Microwave")
        wattage = config_entry.data.get("wattage", 1000)
        has_sensor = config_entry.data.get("has_sensor", False)
        has_convection = config_entry.data.get("has_convection", False)
        
        return MicrowaveOven(
            name,
            wattage=wattage,
            has_sensor_cook=has_sensor,
            has_convection=has_convection
        )
    
    def get_available_features(self) -> Set[str]:
        """Get all available features across all appliances.
        
        Returns:
            Set of feature names available
        """
        return self.registry.get_available_features()
    
    def get_appliances(self) -> List[KitchenAppliance]:
        """Get all registered appliances.
        
        Returns:
            List of appliance instances
        """
        return self.registry.get_all_appliances()
    
    def get_appliance_by_id(self, entry_id: str) -> Optional[KitchenAppliance]:
        """Get appliance by config entry ID.
        
        Args:
            entry_id: Config entry ID
            
        Returns:
            Appliance instance or None if not found
        """
        return self._appliances.get(entry_id)
    
    def _create_ninja_combi(
        self,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Create Ninja Combi appliance.
        
        Args:
            config_entry: Configuration entry
            
        Returns:
            Ninja Combi instance
        """
        from .appliances import KitchenAppliance, CookingFeature, FeatureType, ApplianceDeviceControl
        from .features.catalog import FEATURE_CATALOG
        
        name = config_entry.data.get("name", "Ninja Combi")
        power_outlet = config_entry.data.get("power_outlet_entity")
        start_button = config_entry.data.get("start_button_entity")
        
        # Create device control if entities configured
        device_control = None
        if power_outlet or start_button:
            device_control = ApplianceDeviceControl(
                power_outlet_entity=power_outlet,
                start_button_entity=start_button
            )
        
        # Create a minimal Ninja Combi appliance
        # Full implementation with recipes will be in separate ninja_combi.py file
        class NinjaCombiAppliance(KitchenAppliance):
            """Ninja Combi appliance."""
            
            def __init__(self, appliance_name: str, device_ctrl):
                super().__init__()
                self.appliance_id = f"ninja_combi_{appliance_name.lower().replace(' ', '_')}"
                self.name = appliance_name
                self.brand = "Ninja"
                self.model = "Combi"
                self.device_control = device_ctrl
                
                # Ninja Combi features from catalog
                self.features = {
                    "combi_crisp": FEATURE_CATALOG.get("combi_crisp"),
                    "air_fry": FEATURE_CATALOG.get("air_fry"),
                    "steam": FEATURE_CATALOG.get("steam"),
                }
                self.recipes = []
            
            def get_supported_features(self):
                return list(self.features.values())
            
            def get_recipes(self):
                return self.recipes
        
        return NinjaCombiAppliance(name, device_control)
    
    def _create_multifry(
        self,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Create MultiFry appliance.
        
        Args:
            config_entry: Configuration entry
            
        Returns:
            DelonghiMultiFry instance
        """
        from .appliances.delonghi_multifry import DelonghiMultiFry
        from .appliances import ApplianceDeviceControl
        
        name = config_entry.data.get("name", "De'Longhi MultiFry")
        bowl_type = config_entry.data.get("bowl_type", "paddle")
        power_outlet = config_entry.data.get("power_outlet_entity")
        start_button = config_entry.data.get("start_button_entity")
        
        # Create device control if entities configured
        device_control = None
        if power_outlet or start_button:
            device_control = ApplianceDeviceControl(
                power_outlet_entity=power_outlet,
                start_button_entity=start_button
            )
        
        appliance = DelonghiMultiFry()
        appliance.name = name
        appliance.device_control = device_control
        
        # Store bowl type in appliance (could affect feature availability)
        appliance.bowl_type = bowl_type
        
        return appliance
    
    def _create_custom_appliance(
        self,
        config_entry: ConfigEntry
    ) -> Optional[KitchenAppliance]:
        """Create custom user-defined appliance.
        
        Args:
            config_entry: Configuration entry
            
        Returns:
            CustomAppliance instance
        """
        from .appliances.custom_appliance import CustomAppliance
        from .appliances import ApplianceDeviceControl
        
        name = config_entry.data.get("name", "Custom Appliance")
        power_outlet = config_entry.data.get("power_outlet_entity")
        
        # Create device control if power outlet configured
        device_control = None
        if power_outlet:
            device_control = ApplianceDeviceControl(
                power_outlet_entity=power_outlet
            )
        
        # Extract features from config (keys have "custom_" prefix from config flow)
        config_features = {
            "standard_features": config_entry.data.get("custom_standard_features", []),
            "modified_features": config_entry.data.get("custom_modified_features", []),
            "special_features": config_entry.data.get("custom_special_features", []),
        }
        
        return CustomAppliance(name, config_features, device_control)


def get_appliance_manager(hass: HomeAssistant) -> Optional[ApplianceManager]:
    """Get the appliance manager instance.
    
    Args:
        hass: Home Assistant instance
        
    Returns:
        ApplianceManager instance or None if not initialized
    """
    if DOMAIN not in hass.data:
        return None
    return hass.data[DOMAIN].get("appliance_manager")
