"""Ninja Combi SFP700EU appliance class.

The Ninja Combi is a multi-function oven combining multiple cooking methods.
Based on official Ninja Combi Guide (docs/NINJA_COMBI_GUIDE.md) and PDF manual.

Last Updated: 11 Jan 2026, 01:15 CET
"""

from typing import List, Optional

from . import KitchenAppliance, CookingFeature, FeatureType, ApplianceDeviceControl
from ..features.catalog import FEATURE_CATALOG


class NinjaCombi(KitchenAppliance):
    """Ninja Combi SFP700EU multi-function oven.
    
    Supports 12 cooking modes combining standard and special features:
    - 4 Core modes (standard): Convection, Air Fry, Steam, Prove
    - 4 Modified modes: Sear, Grill, Rice/Pasta, Slow Cook
    - 4 Combi modes (special): Combi-Crisp, Combi-Bake, Combi-Roast, Combi-Meal
    """
    
    def __init__(
        self,
        name: str = "Ninja Combi",
        device_control: Optional[ApplianceDeviceControl] = None,
        feature_types: Optional[dict[str, str]] = None
    ):
        """Initialize Ninja Combi appliance.
        
        Args:
            name: Display name for the appliance
            device_control: Optional device control for power/start
            feature_types: Optional dict mapping feature names to types (standard/modified/special)
                          If not provided, uses Ninja Combi defaults
        """
        # Default Ninja Combi feature implementations
        # Based on NINJA_COMBI_GUIDE.md specifications
        default_features = {
            # Core modes (STANDARD - use recipes as-is)
            "oven": FeatureType.STANDARD,           # Convection oven mode
            "convection": FeatureType.STANDARD,     # Fan-assisted heat distribution
            "air_fry": FeatureType.STANDARD,        # Rapid hot air circulation
            "steam": FeatureType.STANDARD,          # Steam cooking with water reservoir
            "prove": FeatureType.STANDARD,          # Dough rising mode 30-40°C
            
            # Modified modes (MODIFIED - recipes need adaptation)
            "sear": FeatureType.MODIFIED,           # High temp searing in oven
            "grill": FeatureType.MODIFIED,          # Top element direct heat
            "bake": FeatureType.STANDARD,           # Standard baking
            "roast": FeatureType.STANDARD,          # Standard roasting
            "slow_cook": FeatureType.MODIFIED,      # 85-95°C slow cooking in oven
            
            # Combi modes (SPECIAL - needs specific Ninja recipes)
            "combi_crisp": FeatureType.SPECIAL,     # Steam + Air Fry combo
            "combi_bake": FeatureType.SPECIAL,      # Steam + Convection for bread
            "combi_roast": FeatureType.SPECIAL,     # Steam + Roast for moist results
            "combi_meal": FeatureType.SPECIAL,      # Multi-tray complete meals
        }
        
        # Allow user override of feature types via config
        if feature_types:
            for feat, ftype in feature_types.items():
                # Convert string to FeatureType enum
                if ftype == "standard":
                    default_features[feat] = FeatureType.STANDARD
                elif ftype == "modified":
                    default_features[feat] = FeatureType.MODIFIED
                elif ftype == "special":
                    default_features[feat] = FeatureType.SPECIAL
                else:
                    default_features[feat] = FeatureType.STANDARD  # default
        
        super().__init__()
        
        # Set appliance properties
        self.appliance_id = f"ninja_combi_{name.lower().replace(' ', '_')}"
        self.name = name
        self.appliance_type = "ninja_combi"
        self.device_control = device_control
        
        # Store feature types for querying
        self._feature_types = default_features
        
        # Build features dict from catalog
        self.features = {}
        for feature_name, feature_type in default_features.items():
            if feature_name in FEATURE_CATALOG:
                feature = FEATURE_CATALOG[feature_name]
                self.features[feature_name] = feature
    
    def get_supported_features(self) -> List[CookingFeature]:
        """Return list of cooking features this appliance supports.
        
        Returns:
            List of CookingFeature objects supported by this appliance
        """
        return list(self.features.values())
    
    def get_feature_type(self, feature_name: str) -> FeatureType:
        """Get the implementation type for a specific feature.
        
        Args:
            feature_name: Name of the feature
            
        Returns:
            FeatureType indicating how this appliance implements the feature
        """
        return self._feature_types.get(feature_name, FeatureType.STANDARD)
    
    def get_recipes(self) -> List:
        """Get Ninja Combi-specific recipes.
        
        Returns:
            List of recipes (imported from ninja_combi_data.py)
        """
        try:
            from ..ninja_combi_data import NINJA_RECIPES
            return NINJA_RECIPES
        except ImportError:
            return []
    
    def get_capabilities(self) -> dict:
        """Get Ninja Combi capabilities.
        
        Returns:
            Dictionary of capability information
        """
        return {
            "model": "SFP700EU",
            "manufacturer": "Ninja",
            "max_temperature_c": 260,
            "min_temperature_c": 30,
            "rack_positions": 3,
            "has_water_tank": True,
            "has_crisper_tray": True,
            "has_steamer_tray": True,
            "has_drip_tray": True,
            "multi_phase_cooking": True,
            "simultaneous_trays": 3,
            "cooking_modes": 12,
            "compatible_with_meater": True,
            "features": {
                "core_modes": ["oven", "convection", "air_fry", "steam", "prove"],
                "modified_modes": ["sear", "grill", "slow_cook"],
                "combi_modes": ["combi_crisp", "combi_bake", "combi_roast", "combi_meal"]
            }
        }
