"""
Stovetop (Cooktop) appliance support.

Last Updated: 10 Jan 2026, 23:59 CET
Last Change: Updated to use KitchenAppliance base class with per-appliance feature types

This module implements support for residential stovetops/cooktops.
Supports gas, electric coil, smooth-top electric, and induction variants.

FEATURES:
- Pan Fry (STANDARD) - Traditional pan frying
- Sear (STANDARD) - High-heat searing
- Boil (STANDARD) - Boiling liquids
- Simmer (STANDARD) - Low-heat simmering
- Sauté (STANDARD) - Sautéing vegetables and proteins
"""

from typing import Dict, List, Optional
from ..appliances import (
    KitchenAppliance,
    CookingFeature,
    FeatureType,
    ApplianceRecipe,
)
from ..features.catalog import FEATURE_CATALOG


class StoretopType:
    """Stovetop types."""
    GAS = "gas"
    ELECTRIC_COIL = "electric_coil"
    ELECTRIC_SMOOTHTOP = "electric_smoothtop"
    INDUCTION = "induction"


class Stovetop(KitchenAppliance):
    """Residential stovetop/cooktop."""
    
    def __init__(self, name: str = None, stove_type: str = StoretopType.GAS, num_burners: int = 4, feature_types: Optional[Dict[str, str]] = None):
        """
        Initialize stovetop.
        
        Args:
            name: Custom name (auto-generated if None)
            stove_type: Type of stovetop (gas, electric_coil, electric_smoothtop, induction)
            num_burners: Number of cooking zones/burners
            feature_types: Optional user overrides for feature types
        """
        super().__init__()
        
        self.appliance_id = f"stovetop_{stove_type}"
        self.brand = "Generic"
        self.model = "Standard"
        
        # Type-specific attributes
        self.stovetop_type = stove_type
        self.num_burners = num_burners
        self.is_induction = stove_type == StoretopType.INDUCTION
        
        # Set display name
        if name:
            self.name = name
        else:
            type_names = {
                StoretopType.GAS: "Gas Stovetop",
                StoretopType.ELECTRIC_COIL: "Electric Coil Stovetop",
                StoretopType.ELECTRIC_SMOOTHTOP: "Electric Smoothtop",
                StoretopType.INDUCTION: "Induction Cooktop",
            }
            self.name = type_names.get(stove_type, "Stovetop")
            if num_burners != 4:
                self.name = f"{self.name} ({num_burners} burners)"
        
        # Build features - all stovetops support these
        self.features = {
            "pan_fry": FEATURE_CATALOG["pan_fry"],
            "sear": FEATURE_CATALOG["sear"],
            "boil": FEATURE_CATALOG["boil"],
            "simmer": FEATURE_CATALOG["simmer"],
            "saute": FEATURE_CATALOG["saute"],
        }
        
        # Stovetops implement all features as STANDARD by default
        # They are the traditional baseline for pan cooking
        default_feature_types = {
            "pan_fry": FeatureType.STANDARD,
            "sear": FeatureType.STANDARD,
            "boil": FeatureType.STANDARD,
            "simmer": FeatureType.STANDARD,
            "saute": FeatureType.STANDARD,
        }
        
        # Allow user override of feature types via config
        if feature_types:
            for feat, ftype in feature_types.items():
                if feat in self.features:
                    # Convert string to FeatureType enum
                    if ftype == "standard":
                        default_feature_types[feat] = FeatureType.STANDARD
                    elif ftype == "modified":
                        default_feature_types[feat] = FeatureType.MODIFIED
                    elif ftype == "special":
                        default_feature_types[feat] = FeatureType.SPECIAL
        
        self._feature_types = default_feature_types
        
        # No built-in recipes
        self.recipes = []
    
    def get_supported_features(self) -> List[CookingFeature]:
        """Return list of supported cooking features."""
        return list(self.features.values())
    
    def get_recipes(self) -> List[ApplianceRecipe]:
        """Return appliance-specific recipes (none for stovetops)."""
        return []


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
