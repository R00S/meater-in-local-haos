"""
Custom Appliance support for user-defined appliances.

Last Updated: 10 Jan 2026, 23:55 CET
Last Change: Updated to use per-appliance feature types

This module allows users to create custom appliances by selecting features
from the feature catalog. Once configured, custom appliances are treated
identically to pre-defined appliances (Ninja Combi, MultiFry, etc.).

KEY PRINCIPLE:
The only difference between implemented appliances and custom appliances is
that implemented appliances have default features, while custom appliances
require the user to select features. After configuration, they are identical.
"""

from typing import List, Dict, Optional
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
        config_features: Dict[str, List[str]],
        device_control: Optional[ApplianceDeviceControl] = None
    ):
        """
        Initialize custom appliance.
        
        Args:
            name: User-provided appliance name
            config_features: Dictionary with feature lists:
                - "standard_features": List of standard feature names
                - "modified_features": List of modified feature names  
                - "special_features": List of special feature names
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
        
        # Custom appliances don't have pre-defined recipes
        # (users can add recipes through recipe matcher)
        self.recipes = []
    
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
