"""
Microwave Oven appliance support.

Last Updated: 08 Jan 2026, 21:50 CET
Last Change: Initial microwave implementation

This module implements support for standard residential microwave ovens.
Supports basic microwave cooking, defrost, and reheat functions.

FEATURES:
- Microwave (MODIFIED) - Microwave cooking (requires recipe adaptation)
- Defrost (MODIFIED) - Defrosting frozen foods
- Reheat (STANDARD) - Reheating pre-cooked food
- Sensor Cook (MODIFIED) - Automatic cooking with sensor (if available)
- Convection Microwave (MODIFIED) - Combination microwave + convection (if available)
"""

from typing import Dict, Set
from ..appliances import (
    KitchenAppliance,
    FeatureType,
)


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
        self.wattage = wattage
        self.has_convection = has_convection
        self.has_sensor = has_sensor
    
    def get_features(self) -> Set[str]:
        """Get list of features supported by this microwave."""
        features = {
            "microwave",     # Microwave cooking
            "defrost",       # Defrosting mode
            "reheat",        # Reheating mode
        }
        
        if self.has_sensor:
            features.add("sensor_cook")
        
        if self.has_convection:
            features.add("convection_microwave")
            features.add("bake")  # Convection microwaves can bake
        
        return features
    
    def get_feature_implementation(self, feature: str) -> FeatureType:
        """
        Get implementation type for a feature.
        
        Microwave cooking requires recipe adaptation due to different heating
        mechanism. Most features are MODIFIED.
        """
        supported_features = self.get_features()
        
        if feature not in supported_features:
            raise ValueError(f"Feature '{feature}' not supported by this microwave")
        
        # Reheating is straightforward - STANDARD
        if feature == "reheat":
            return FeatureType.STANDARD
        
        # All other microwave features require adaptation - MODIFIED
        # (Different cooking times, power levels, techniques)
        return FeatureType.MODIFIED
    
    def get_display_name(self) -> str:
        """Get human-readable name for this appliance."""
        if self.has_convection:
            return f"Convection Microwave ({self.wattage}W)"
        elif self.has_sensor:
            return f"Sensor Microwave ({self.wattage}W)"
        else:
            return f"Microwave ({self.wattage}W)"
    
    def get_capabilities(self) -> Dict[str, any]:
        """Get appliance-specific capabilities and settings."""
        # Calculate power level relative to standard 1000W
        power_factor = self.wattage / 1000.0
        
        return {
            "appliance_type": "microwave",
            "wattage": self.wattage,
            "power_factor": power_factor,  # For recipe time adjustment
            "has_convection": self.has_convection,
            "has_sensor": self.has_sensor,
            "supports_probe": False,  # Metal probes not safe in microwaves
            "power_levels": 10,  # Typical microwave power levels
            "turntable": True,  # Most microwaves have turntable
            "capacity_liters": 20 if not self.has_convection else 30,  # Typical sizes
        }
    
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
