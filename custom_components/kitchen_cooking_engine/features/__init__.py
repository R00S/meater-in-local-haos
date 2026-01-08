"""
Cooking features catalog and definitions.

Last Updated: 08 Jan 2026, 21:00 CET
Last Change: Initial multi-appliance feature catalog implementation

This module provides the centralized catalog of all cooking features
supported across different kitchen appliances.
"""

from .catalog import (
    FEATURE_CATALOG,
    CookingFeature,
    FeatureType,
    get_feature,
    get_all_features,
    get_features_by_type,
    get_feature_names,
    validate_features,
)

__all__ = [
    "FEATURE_CATALOG",
    "CookingFeature",
    "FeatureType",
    "get_feature",
    "get_all_features",
    "get_features_by_type",
    "get_feature_names",
    "validate_features",
]
