"""
Stovetop (Cooktop) appliance support.

Last Updated: 08 Jan 2026, 21:50 CET
Last Change: Initial stovetop implementation

This module implements support for residential stovetops/cooktops.
Supports gas, electric coil, smooth-top electric, and induction variants.

FEATURES:
- Pan Fry (STANDARD) - Traditional pan frying
- Sear (STANDARD) - High-heat searing
- Boil (STANDARD) - Boiling liquids
- Simmer (STANDARD) - Low-heat simmering
- Sauté (STANDARD) - Sautéing vegetables and proteins
"""

from typing import Dict, Set
from ..appliances import (
    KitchenAppliance,
    FeatureType,
    OilLevel,
)


class StoretopType:
    """Stovetop types."""
    GAS = "gas"
    ELECTRIC_COIL = "electric_coil"
    ELECTRIC_SMOOTHTOP = "electric_smoothtop"
    INDUCTION = "induction"


class Stovetop(KitchenAppliance):
    """Residential stovetop/cooktop."""
    
    def __init__(self, stovetop_type: str = StoretopType.GAS, num_burners: int = 4):
        """
        Initialize stovetop.
        
        Args:
            stovetop_type: Type of stovetop (gas, electric_coil, electric_smoothtop, induction)
            num_burners: Number of cooking zones/burners
        """
        self.stovetop_type = stovetop_type
        self.num_burners = num_burners
        
        # Induction has fastest response
        self.is_induction = stovetop_type == StoretopType.INDUCTION
    
    def get_features(self) -> Set[str]:
        """Get list of features supported by this stovetop."""
        # Core stovetop features available on all types
        features = {
            "pan_fry",       # Pan frying
            "sear",          # High-heat searing
            "boil",          # Boiling water/liquids
            "simmer",        # Low-heat simmering
            "saute",         # Sautéing
        }
        
        # Induction can do precise temperature control for some special tasks
        if self.is_induction:
            features.add("precise_temp_control")
        
        return features
    
    def get_feature_implementation(self, feature: str) -> FeatureType:
        """
        Get implementation type for a feature.
        
        Stovetops implement all features as STANDARD - they are the
        traditional baseline for pan cooking.
        """
        supported_features = self.get_features()
        
        if feature not in supported_features:
            raise ValueError(f"Feature '{feature}' not supported by this stovetop")
        
        # All stovetop features are STANDARD implementations
        return FeatureType.STANDARD
    
    def get_display_name(self) -> str:
        """Get human-readable name for this appliance."""
        type_names = {
            StoretopType.GAS: "Gas Stovetop",
            StoretopType.ELECTRIC_COIL: "Electric Coil Stovetop",
            StoretopType.ELECTRIC_SMOOTHTOP: "Electric Smoothtop",
            StoretopType.INDUCTION: "Induction Cooktop",
        }
        
        base_name = type_names.get(self.stovetop_type, "Stovetop")
        
        if self.num_burners != 4:
            return f"{base_name} ({self.num_burners} burners)"
        
        return base_name
    
    def get_capabilities(self) -> Dict[str, any]:
        """Get appliance-specific capabilities and settings."""
        return {
            "appliance_type": "stovetop",
            "stovetop_type": self.stovetop_type,
            "num_burners": self.num_burners,
            "is_induction": self.is_induction,
            "supports_probe": True,  # Can use external probe like MEATER+
            "heat_levels": "continuous" if self.stovetop_type == StoretopType.GAS else "discrete",
            "instant_on": self.is_induction,
            "oil_required": True,  # Stovetop cooking typically needs some oil
            "default_oil_level": OilLevel.MEDIUM,
        }


# Common stovetop configurations
def create_gas_stovetop(num_burners: int = 4) -> Stovetop:
    """Create a gas stovetop."""
    return Stovetop(stovetop_type=StoretopType.GAS, num_burners=num_burners)


def create_electric_stovetop(num_burners: int = 4) -> Stovetop:
    """Create an electric smoothtop."""
    return Stovetop(stovetop_type=StoretopType.ELECTRIC_SMOOTHTOP, num_burners=num_burners)


def create_induction_cooktop(num_burners: int = 4) -> Stovetop:
    """Create an induction cooktop."""
    return Stovetop(stovetop_type=StoretopType.INDUCTION, num_burners=num_burners)
