"""
Standard Electric/Gas Oven appliance support.

Last Updated: 10 Jan 2026, 23:58 CET
Last Change: Updated to use KitchenAppliance base class with per-appliance feature types

This module implements support for standard residential ovens (electric or gas).
Most common kitchen appliance, typically supports basic cooking methods.

FEATURES:
- Oven (STANDARD) - Traditional oven cooking
- Convection (STANDARD) - Fan-assisted cooking (if available)
- Broil (STANDARD) - Top heat element
- Bake (STANDARD) - Traditional baking
- Roast (STANDARD) - Roasting mode
- Grill (STANDARD) - Grilling mode (if available)
"""

from typing import List, Optional
from ..appliances import (
    KitchenAppliance,
    CookingFeature,
    FeatureType,
    ApplianceRecipe,
)
from ..features.catalog import FEATURE_CATALOG


class StandardOven(KitchenAppliance):
    """Standard residential oven (electric or gas)."""
    
    def __init__(self, has_convection: bool = False, has_grill: bool = False):
        """
        Initialize standard oven.
        
        Args:
            has_convection: Whether oven has convection/fan mode
            has_grill: Whether oven has grill mode
        """
        super().__init__()
        
        self.appliance_id = "standard_oven"
        self.name = "Standard Oven"
        self.brand = "Generic"
        self.model = "Standard"
        
        # Build features based on capabilities
        self.features = {
            "oven": FEATURE_CATALOG["oven"],
            "bake": FEATURE_CATALOG["bake"],
            "broil": FEATURE_CATALOG["broil"],
            "roast": FEATURE_CATALOG["roast"],
        }
        
        # Standard ovens implement all features as STANDARD
        # They are the baseline that other appliances compare against
        self._feature_types = {
            "oven": FeatureType.STANDARD,
            "bake": FeatureType.STANDARD,
            "broil": FeatureType.STANDARD,
            "roast": FeatureType.STANDARD,
        }
        
        if has_convection:
            self.features["convection"] = FEATURE_CATALOG["convection"]
            self._feature_types["convection"] = FeatureType.STANDARD
            self.name = "Convection Oven"
        
        if has_grill:
            self.features["grill"] = FEATURE_CATALOG["grill"]
            self._feature_types["grill"] = FeatureType.STANDARD
            if has_convection:
                self.name = "Convection Oven with Grill"
            else:
                self.name = "Oven with Grill"
        
        # Standard ovens don't have built-in recipes
        self.recipes = []
    
    def get_supported_features(self) -> List[CookingFeature]:
        """Return list of supported cooking features."""
        return list(self.features.values())
    
    def get_recipes(self) -> List[ApplianceRecipe]:
        """Return appliance-specific recipes (none for standard ovens)."""
        return []


# Common oven configurations
def create_basic_oven() -> StandardOven:
    """Create a basic oven without convection or grill."""
    return StandardOven(has_convection=False, has_grill=False)


def create_convection_oven() -> StandardOven:
    """Create an oven with convection fan."""
    return StandardOven(has_convection=True, has_grill=False)


def create_full_featured_oven() -> StandardOven:
    """Create an oven with convection and grill."""
    return StandardOven(has_convection=True, has_grill=True)
