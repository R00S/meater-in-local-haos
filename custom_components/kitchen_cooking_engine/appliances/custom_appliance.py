"""
Custom Appliance support for user-defined appliances.

Last Updated: 11 Jan 2026, 01:00 CET
Last Change: Updated to support new per-feature type configuration format

This module allows users to create custom appliances by selecting features
from the feature catalog. Once configured, custom appliances are treated
identically to pre-defined appliances (Ninja Combi, MultiFry, etc.).

KEY PRINCIPLE:
The only difference between implemented appliances and custom appliances is
that implemented appliances have default features, while custom appliances
require the user to select features. After configuration, they are identical.
"""

from typing import List, Dict, Optional, Union
from ..appliances import (
    KitchenAppliance,
    CookingFeature,
    FeatureType,
    ApplianceRecipe,
    ApplianceDeviceControl,
)
from ..features.catalog import FEATURE_CATALOG


class CustomAppliance(KitchenAppliance):
    """User-defined custom appliance with selected features."""
    
    def __init__(
        self,
        name: str,
        config_features: Union[Dict[str, str], Dict[str, List[str]]],
        device_control: Optional[ApplianceDeviceControl] = None
    ):
        """
        Initialize custom appliance.
        
        Args:
            name: User-provided appliance name
            config_features: Feature configuration in one of two formats:
                NEW FORMAT (preferred):
                    {"feature_name": "standard"|"modified"|"special", ...}
                    Example: {"air_fry": "standard", "oven": "modified"}
                
                OLD FORMAT (backward compatibility):
                    {
                        "standard_features": ["oven", "grill"],
                        "modified_features": ["air_fry", "roast"],
                        "special_features": ["combi_crisp"]
                    }
            device_control: Optional device control configuration
        """
        super().__init__()
        
        self.appliance_id = f"custom_{name.lower().replace(' ', '_')}"
        self.name = name
        self.brand = "Custom"
        self.model = "User Defined"
        self.device_control = device_control
        
        # Build features dictionary and feature types from catalog
        self.features = {}
        self._feature_types = {}
        
        # Detect which format we're using
        if self._is_new_format(config_features):
            # NEW FORMAT: {"feature_name": "standard"|"modified"|"special"}
            self._load_new_format(config_features)
        else:
            # OLD FORMAT: {"standard_features": [...], "modified_features": [...], ...}
            self._load_old_format(config_features)
        
        # Custom appliances don't have pre-defined recipes
        # (users can add recipes through recipe matcher)
        self.recipes = []
    
    def _is_new_format(self, config_features: Dict) -> bool:
        """
        Detect if config is in new format or old format.
        
        New format: Keys are feature names from FEATURE_CATALOG
        Old format: Keys are "standard_features", "modified_features", "special_features"
        """
        if not config_features:
            return True  # Empty dict is technically new format
        
        # Check if any key is one of the old format keys
        old_format_keys = {"standard_features", "modified_features", "special_features"}
        return not any(key in old_format_keys for key in config_features.keys())
    
    def _load_new_format(self, config_features: Dict[str, str]) -> None:
        """
        Load features from new format.
        
        Format: {"feature_name": "standard"|"modified"|"special"}
        """
        for feature_name, feature_type_str in config_features.items():
            if feature_name in FEATURE_CATALOG:
                # Add feature definition from catalog
                self.features[feature_name] = FEATURE_CATALOG[feature_name]
                
                # Map string to FeatureType enum
                if feature_type_str == "standard":
                    self._feature_types[feature_name] = FeatureType.STANDARD
                elif feature_type_str == "modified":
                    self._feature_types[feature_name] = FeatureType.MODIFIED
                elif feature_type_str == "special":
                    self._feature_types[feature_name] = FeatureType.SPECIAL
                else:
                    # Default to STANDARD if unknown
                    self._feature_types[feature_name] = FeatureType.STANDARD
    
    def _load_old_format(self, config_features: Dict[str, List[str]]) -> None:
        """
        Load features from old format (backward compatibility).
        
        Format: {
            "standard_features": ["oven", "grill"],
            "modified_features": ["air_fry"],
            "special_features": ["combi_crisp"]
        }
        """
        # Add standard features
        for feature_name in config_features.get("standard_features", []):
            if feature_name in FEATURE_CATALOG:
                self.features[feature_name] = FEATURE_CATALOG[feature_name]
                self._feature_types[feature_name] = FeatureType.STANDARD
        
        # Add modified features
        for feature_name in config_features.get("modified_features", []):
            if feature_name in FEATURE_CATALOG:
                self.features[feature_name] = FEATURE_CATALOG[feature_name]
                self._feature_types[feature_name] = FeatureType.MODIFIED
        
        # Add special features
        for feature_name in config_features.get("special_features", []):
            if feature_name in FEATURE_CATALOG:
                self.features[feature_name] = FEATURE_CATALOG[feature_name]
                self._feature_types[feature_name] = FeatureType.SPECIAL
    
    def get_supported_features(self) -> List[CookingFeature]:
        """Return list of cooking features this appliance supports."""
        return list(self.features.values())
    
    def get_recipes(self) -> List[ApplianceRecipe]:
        """Return appliance-specific recipes (none for custom appliances)."""
        return []
    
    def __repr__(self) -> str:
        """String representation of custom appliance."""
        return (
            f"CustomAppliance(name='{self.name}', "
            f"features={list(self.features.keys())})"
        )
