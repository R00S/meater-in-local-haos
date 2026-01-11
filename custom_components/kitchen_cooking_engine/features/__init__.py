"""
Cooking features catalog and definitions.

Last Updated: 10 Jan 2026, 23:45 CET
Last Change: Removed feature_type from CookingFeature (now per-appliance)

This module provides the centralized catalog of all cooking features
supported across different kitchen appliances.
"""

from .catalog import (
    FEATURE_CATALOG,
    CookingFeature,
    get_feature,
    get_all_features,
    get_feature_names,
    validate_features,
)

__all__ = [
    "FEATURE_CATALOG",
    "CookingFeature",
    "get_feature",
    "get_all_features",
    "get_feature_names",
    "validate_features",
]
