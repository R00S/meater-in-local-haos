"""
Appliance registry for managing multiple kitchen appliances.

Last Updated: 08 Jan 2026, 21:15 CET
Last Change: Initial appliance registry implementation

This module provides the central registry for all configured appliances
across multiple config entries.
"""

import logging
from typing import Dict, List, Optional, Set
from homeassistant.core import HomeAssistant
from homeassistant.config_entries import ConfigEntry

from . import KitchenAppliance, CookingFeature, ApplianceRecipe

_LOGGER = logging.getLogger(__name__)


class ApplianceRegistry:
    """Central registry for all kitchen appliances."""
    
    def __init__(self, hass: HomeAssistant):
        """Initialize the appliance registry.
        
        Args:
            hass: Home Assistant instance
        """
        self.hass = hass
        self._appliances: Dict[str, KitchenAppliance] = {}
        self._config_entry_map: Dict[str, str] = {}  # entry_id -> appliance_id
        
    def register_appliance(
        self,
        entry_id: str,
        appliance: KitchenAppliance
    ) -> None:
        """Register an appliance with the registry.
        
        Args:
            entry_id: The config entry ID associated with this appliance
            appliance: The appliance instance to register
        """
        if not appliance.appliance_id:
            _LOGGER.error("Cannot register appliance without appliance_id")
            return
            
        self._appliances[appliance.appliance_id] = appliance
        self._config_entry_map[entry_id] = appliance.appliance_id
        
        _LOGGER.info(
            "Registered appliance: %s (%s) with %d features",
            appliance.name,
            appliance.appliance_id,
            len(appliance.get_features())
        )
        
    def unregister_appliance(self, entry_id: str) -> None:
        """Unregister an appliance from the registry.
        
        Args:
            entry_id: The config entry ID of the appliance to unregister
        """
        appliance_id = self._config_entry_map.get(entry_id)
        if appliance_id:
            appliance = self._appliances.pop(appliance_id, None)
            self._config_entry_map.pop(entry_id, None)
            if appliance:
                _LOGGER.info("Unregistered appliance: %s", appliance.name)
                
    def get_appliance(self, appliance_id: str) -> Optional[KitchenAppliance]:
        """Get an appliance by its ID.
        
        Args:
            appliance_id: The appliance identifier
            
        Returns:
            The appliance instance, or None if not found
        """
        return self._appliances.get(appliance_id)
        
    def get_appliance_by_entry(self, entry_id: str) -> Optional[KitchenAppliance]:
        """Get an appliance by its config entry ID.
        
        Args:
            entry_id: The config entry ID
            
        Returns:
            The appliance instance, or None if not found
        """
        appliance_id = self._config_entry_map.get(entry_id)
        if appliance_id:
            return self._appliances.get(appliance_id)
        return None
        
    def get_all_appliances(self) -> List[KitchenAppliance]:
        """Get all registered appliances.
        
        Returns:
            List of all appliance instances
        """
        return list(self._appliances.values())
        
    def get_appliances_with_feature(self, feature_name: str) -> List[KitchenAppliance]:
        """Get all appliances that support a specific feature.
        
        Args:
            feature_name: The feature identifier
            
        Returns:
            List of appliances that support the feature
        """
        return [
            appliance for appliance in self._appliances.values()
            if appliance.supports_feature(feature_name)
        ]
        
    def get_available_features(self) -> Set[str]:
        """Get all features available across all registered appliances.
        
        Returns:
            Set of all available feature identifiers
        """
        features = set()
        for appliance in self._appliances.values():
            features.update(appliance.features.keys())
        return features
        
    def get_feature_definitions(self) -> Dict[str, List[CookingFeature]]:
        """Get feature definitions grouped by feature name.
        
        Returns:
            Dictionary mapping feature names to lists of feature definitions
            from different appliances (may have slight variations)
        """
        feature_defs: Dict[str, List[CookingFeature]] = {}
        for appliance in self._appliances.values():
            for feature_name, feature in appliance.features.items():
                if feature_name not in feature_defs:
                    feature_defs[feature_name] = []
                feature_defs[feature_name].append(feature)
        return feature_defs
        
    def get_all_recipes(self) -> List[ApplianceRecipe]:
        """Get all recipes from all registered appliances.
        
        Returns:
            List of all recipes across all appliances
        """
        recipes = []
        
        # Get recipes from all registered appliances
        for appliance in self._appliances.values():
            recipes.extend(appliance.get_recipes())
        
        # Also include example recipes from central recipe database
        # These are universal recipes that can be matched to any compatible appliances
        try:
            from ..recipes.examples import ALL_EXAMPLE_RECIPES
            # Convert UnifiedRecipes to ApplianceRecipes if needed
            # For now, include them as-is since matcher can handle both types
            recipes.extend(ALL_EXAMPLE_RECIPES)
        except Exception as ex:
            _LOGGER.warning("Could not load example recipes: %s", ex)
        
        return recipes
        
    def get_recipe_by_id(self, recipe_id: int) -> Optional[ApplianceRecipe]:
        """Find a recipe by its ID across all appliances.
        
        Args:
            recipe_id: The recipe ID to search for
            
        Returns:
            The recipe if found, None otherwise
        """
        for appliance in self._appliances.values():
            recipe = appliance.get_recipe_by_id(recipe_id)
            if recipe:
                return recipe
        return None
        
    def get_recipes_by_feature(self, feature_name: str) -> List[ApplianceRecipe]:
        """Get all recipes that use a specific feature.
        
        Args:
            feature_name: The feature identifier
            
        Returns:
            List of recipes using the feature
        """
        recipes = []
        for appliance in self._appliances.values():
            recipes.extend(appliance.get_recipes_by_feature(feature_name))
        return recipes
        
    def has_appliances(self) -> bool:
        """Check if any appliances are registered.
        
        Returns:
            True if at least one appliance is registered
        """
        return len(self._appliances) > 0
        
    def get_appliance_count(self) -> int:
        """Get the number of registered appliances.
        
        Returns:
            Number of registered appliances
        """
        return len(self._appliances)
        
    def get_appliance_summary(self) -> Dict[str, Dict[str, any]]:
        """Get a summary of all registered appliances.
        
        Returns:
            Dictionary mapping appliance IDs to summary information
        """
        summary = {}
        for appliance_id, appliance in self._appliances.items():
            summary[appliance_id] = {
                "name": appliance.name,
                "brand": appliance.brand,
                "model": appliance.model,
                "features": list(appliance.features.keys()),
                "recipe_count": len(appliance.recipes),
            }
        return summary


# =============================================================================
# GLOBAL REGISTRY INSTANCE
# =============================================================================

def get_registry(hass: HomeAssistant) -> ApplianceRegistry:
    """Get or create the global appliance registry instance.
    
    Args:
        hass: Home Assistant instance
        
    Returns:
        The global appliance registry
    """
    from ..const import DOMAIN
    
    # Initialize domain data if needed
    if DOMAIN not in hass.data:
        hass.data[DOMAIN] = {}
        
    # Create registry if it doesn't exist
    if "appliance_registry" not in hass.data[DOMAIN]:
        hass.data[DOMAIN]["appliance_registry"] = ApplianceRegistry(hass)
        _LOGGER.info("Created global appliance registry")
        
    return hass.data[DOMAIN]["appliance_registry"]
