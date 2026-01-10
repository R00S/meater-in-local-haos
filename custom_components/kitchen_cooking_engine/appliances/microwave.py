"""
Microwave Oven appliance support.

Last Updated: 11 Jan 2026, 00:00 CET
Last Change: Updated to use KitchenAppliance base class with per-appliance feature types

This module implements support for standard residential microwave ovens.
Supports basic microwave cooking, defrost, and reheat functions.

FEATURES:
- Microwave (MODIFIED) - Microwave cooking (requires recipe adaptation)
- Defrost (MODIFIED) - Defrosting frozen foods
- Reheat (STANDARD) - Reheating pre-cooked food
- Sensor Cook (MODIFIED) - Automatic cooking with sensor (if available)
- Convection Microwave (MODIFIED) - Combination microwave + convection (if available)
"""

from typing import List
from ..appliances import (
    KitchenAppliance,
    CookingFeature,
    FeatureType,
    ApplianceRecipe,
)
from ..features.catalog import FEATURE_CATALOG


class Microwave(KitchenAppliance):
    """Standard residential microwave oven."""
    
    def __init__(self, wattage: int = 1000, has_convection: bool = False, has_sensor: bool = False):
        """
        Initialize microwave.
        
        Args:
            wattage: Microwave power in watts (typical: 700-1200W)
            has_convection: Whether it's a combination microwave+convection oven
            has_sensor: Whether it has automatic sensor cooking
        """
        super().__init__()
        
        self.appliance_id = f"microwave_{wattage}w"
        self.brand = "Generic"
        self.model = "Standard"
        
        # Type-specific attributes
        self.wattage = wattage
        self.has_convection = has_convection
        self.has_sensor = has_sensor
        
        # Set display name
        if has_convection:
            self.name = f"Convection Microwave ({wattage}W)"
        elif has_sensor:
            self.name = f"Sensor Microwave ({wattage}W)"
        else:
            self.name = f"Microwave ({wattage}W)"
        
        # Build features
        self.features = {
            "microwave": FEATURE_CATALOG["microwave"],
            "defrost": FEATURE_CATALOG["defrost"],
            "reheat": FEATURE_CATALOG["reheat"],
        }
        
        # Set feature types - microwave requires recipe adaptation
        self._feature_types = {
            "microwave": FeatureType.MODIFIED,  # Requires adaptation
            "defrost": FeatureType.MODIFIED,    # Requires adaptation
            "reheat": FeatureType.STANDARD,     # Straightforward reheating
        }
        
        if has_sensor:
            self.features["sensor_cook"] = FEATURE_CATALOG["sensor_cook"]
            self._feature_types["sensor_cook"] = FeatureType.MODIFIED
        
        if has_convection:
            self.features["convection_microwave"] = FEATURE_CATALOG["convection_microwave"]
            self.features["bake"] = FEATURE_CATALOG["bake"]
            self._feature_types["convection_microwave"] = FeatureType.MODIFIED
            self._feature_types["bake"] = FeatureType.MODIFIED
        
        # No built-in recipes
        self.recipes = []
    
    def get_supported_features(self) -> List[CookingFeature]:
        """Return list of supported cooking features."""
        return list(self.features.values())
    
    def get_recipes(self) -> List[ApplianceRecipe]:
        """Return appliance-specific recipes (none for microwaves)."""
        return []
    
    def adapt_time_for_wattage(self, recipe_minutes: int, recipe_wattage: int = 1000) -> int:
        """
        Adapt recipe time based on microwave wattage.
        
        Args:
            recipe_minutes: Original recipe time
            recipe_wattage: Wattage the recipe was designed for
            
        Returns:
            Adjusted time in minutes for this microwave's wattage
        """
        # Higher wattage = less time needed
        # Lower wattage = more time needed
        wattage_ratio = recipe_wattage / self.wattage
        adjusted_minutes = int(recipe_minutes * wattage_ratio)
        
        # Ensure minimum time
        return max(1, adjusted_minutes)


# Common microwave configurations
def create_basic_microwave(wattage: int = 1000) -> Microwave:
    """Create a basic microwave without special features."""
    return Microwave(wattage=wattage, has_convection=False, has_sensor=False)


def create_sensor_microwave(wattage: int = 1100) -> Microwave:
    """Create a microwave with sensor cooking."""
    return Microwave(wattage=wattage, has_convection=False, has_sensor=True)


def create_convection_microwave(wattage: int = 1000) -> Microwave:
    """Create a combination microwave + convection oven."""
    return Microwave(wattage=wattage, has_convection=True, has_sensor=True)
