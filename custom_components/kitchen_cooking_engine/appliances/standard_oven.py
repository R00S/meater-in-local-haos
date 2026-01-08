"""
Standard Electric/Gas Oven appliance support.

Last Updated: 08 Jan 2026, 21:50 CET
Last Change: Initial standard oven implementation

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

from typing import Dict, Set
from ..appliances import (
    KitchenAppliance,
    FeatureType,
)


class StandardOven(KitchenAppliance):
    """Standard residential oven (electric or gas)."""
    
    def __init__(self, has_convection: bool = False, has_grill: bool = False):
        """
        Initialize standard oven.
        
        Args:
            has_convection: Whether oven has convection/fan mode
            has_grill: Whether oven has grill mode
        """
        self.has_convection = has_convection
        self.has_grill = has_grill
    
    def get_features(self) -> Set[str]:
        """Get list of features supported by this oven."""
        features = {
            "oven",      # Traditional oven
            "bake",      # Baking mode
            "broil",     # Top heat (broiler)
            "roast",     # Roasting mode
        }
        
        if self.has_convection:
            features.add("convection")
        
        if self.has_grill:
            features.add("grill")
        
        return features
    
    def get_feature_implementation(self, feature: str) -> FeatureType:
        """
        Get implementation type for a feature.
        
        Standard ovens implement all features as STANDARD - they are the
        baseline for most recipes.
        """
        supported_features = self.get_features()
        
        if feature not in supported_features:
            raise ValueError(f"Feature '{feature}' not supported by this oven")
        
        # All oven features are STANDARD implementations
        return FeatureType.STANDARD
    
    def get_display_name(self) -> str:
        """Get human-readable name for this appliance."""
        if self.has_convection and self.has_grill:
            return "Convection Oven with Grill"
        elif self.has_convection:
            return "Convection Oven"
        elif self.has_grill:
            return "Oven with Grill"
        else:
            return "Standard Oven"
    
    def get_capabilities(self) -> Dict[str, any]:
        """Get appliance-specific capabilities and settings."""
        return {
            "appliance_type": "standard_oven",
            "has_convection": self.has_convection,
            "has_grill": self.has_grill,
            "temperature_range_c": (50, 280),
            "temperature_range_f": (122, 536),
            "supports_probe": True,  # Can use external probe like MEATER+
            "supports_timer": True,
            "racks": 2,  # Typical standard oven
        }


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
