"""
Centralized catalog of all cooking features.

Last Updated: 08 Jan 2026, 21:00 CET
Last Change: Initial feature catalog with all cooking features

This catalog defines all available cooking features across all appliances.
Features are used for recipe matching and UI visibility.
"""

from typing import Dict, List, Optional, Set
import sys
import os

# Add parent directory to path for imports
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from appliances import CookingFeature, FeatureType, OilLevel


# =============================================================================
# FEATURE CATALOG - The single source of truth for all cooking features
# =============================================================================

FEATURE_CATALOG: Dict[str, CookingFeature] = {
    # =========================================================================
    # TEMPERATURE MONITORING FEATURES
    # =========================================================================
    "temperature_probe": CookingFeature(
        name="temperature_probe",
        display_name="Temperature Probe",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(0, 100),
        temperature_range_f=(32, 212),
        supports_probe=True,
        icon="mdi:thermometer",
        description="Internal temperature monitoring for precise doneness control"
    ),
    
    "ambient_temperature": CookingFeature(
        name="ambient_temperature",
        display_name="Ambient Temperature",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(0, 300),
        temperature_range_f=(32, 572),
        icon="mdi:thermometer-lines",
        description="Cooking environment temperature monitoring"
    ),
    
    # =========================================================================
    # STANDARD COOKING METHODS (use recipes without modification)
    # =========================================================================
    "oven": CookingFeature(
        name="oven",
        display_name="Oven",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(50, 250),
        temperature_range_f=(122, 482),
        supports_probe=True,
        icon="mdi:stove",
        description="Traditional oven cooking"
    ),
    
    "convection": CookingFeature(
        name="convection",
        display_name="Convection Oven",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(50, 250),
        temperature_range_f=(122, 482),
        supports_probe=True,
        icon="mdi:fan",
        description="Convection oven with fan circulation"
    ),
    
    "grill": CookingFeature(
        name="grill",
        display_name="Grill",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(150, 280),
        temperature_range_f=(302, 536),
        supports_probe=True,
        icon="mdi:grill",
        description="Direct high-heat grilling"
    ),
    
    "broil": CookingFeature(
        name="broil",
        display_name="Broil",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(200, 280),
        temperature_range_f=(392, 536),
        supports_probe=False,
        icon="mdi:fire",
        description="Top-down high heat broiling"
    ),
    
    "roast": CookingFeature(
        name="roast",
        display_name="Roast",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(120, 220),
        temperature_range_f=(248, 428),
        supports_probe=True,
        icon="mdi:turkey",
        description="Roasting meats and vegetables"
    ),
    
    "bake": CookingFeature(
        name="bake",
        display_name="Bake",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(50, 230),
        temperature_range_f=(122, 446),
        supports_probe=False,
        icon="mdi:cupcake",
        description="Traditional baking"
    ),
    
    "steam": CookingFeature(
        name="steam",
        display_name="Steam",
        feature_type=FeatureType.STANDARD,
        temperature_range_c=(80, 100),
        temperature_range_f=(176, 212),
        supports_probe=True,
        icon="mdi:cloud",
        description="Steam cooking for vegetables and fish"
    ),
    
    # =========================================================================
    # MODIFIED COOKING METHODS (auto-adapt general recipes)
    # =========================================================================
    "air_fry": CookingFeature(
        name="air_fry",
        display_name="Air Fry",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(80, 200),
        temperature_range_f=(176, 392),
        supports_probe=True,
        oil_levels=[OilLevel.ZERO, OilLevel.LOW],
        default_oil=OilLevel.ZERO,
        icon="mdi:air-filter",
        description="High-speed hot air circulation for crispy results with minimal oil"
    ),
    
    "pressure_cook": CookingFeature(
        name="pressure_cook",
        display_name="Pressure Cook",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(100, 120),
        temperature_range_f=(212, 248),
        supports_probe=False,
        oil_levels=[OilLevel.ZERO, OilLevel.LOW],
        default_oil=OilLevel.ZERO,
        icon="mdi:gauge",
        description="High-pressure fast cooking"
    ),
    
    "slow_cook": CookingFeature(
        name="slow_cook",
        display_name="Slow Cook",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(80, 100),
        temperature_range_f=(176, 212),
        supports_probe=True,
        oil_levels=[OilLevel.ZERO, OilLevel.LOW],
        default_oil=OilLevel.ZERO,
        icon="mdi:pot",
        description="Low and slow cooking for tender results"
    ),
    
    "dehydrate": CookingFeature(
        name="dehydrate",
        display_name="Dehydrate",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(35, 75),
        temperature_range_f=(95, 167),
        supports_probe=False,
        icon="mdi:leaf",
        description="Low-temperature moisture removal"
    ),
    
    "fry": CookingFeature(
        name="fry",
        display_name="Fry",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(150, 190),
        temperature_range_f=(302, 374),
        supports_probe=True,
        supports_paddle=True,
        oil_levels=[OilLevel.LOW, OilLevel.MEDIUM, OilLevel.RICH],
        default_oil=OilLevel.MEDIUM,
        icon="mdi:french-fries",
        description="Traditional frying with hot air circulation"
    ),
    
    "pan_fry": CookingFeature(
        name="pan_fry",
        display_name="Pan Fry",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(140, 180),
        temperature_range_f=(284, 356),
        supports_probe=True,
        oil_levels=[OilLevel.LOW, OilLevel.MEDIUM],
        default_oil=OilLevel.LOW,
        icon="mdi:frying-pan",
        description="Pan frying with minimal oil"
    ),
    
    "sear": CookingFeature(
        name="sear",
        display_name="Sear",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(180, 220),
        temperature_range_f=(356, 428),
        supports_probe=True,
        oil_levels=[OilLevel.LOW, OilLevel.MEDIUM],
        default_oil=OilLevel.LOW,
        icon="mdi:fire",
        description="High-heat searing for caramelization"
    ),
    
    "prove": CookingFeature(
        name="prove",
        display_name="Prove/Proof",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(25, 40),
        temperature_range_f=(77, 104),
        supports_probe=False,
        icon="mdi:bread-slice",
        description="Bread dough proofing with controlled warmth"
    ),
    
    "casserole_risotto": CookingFeature(
        name="casserole_risotto",
        display_name="Casserole/Risotto",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(80, 180),
        temperature_range_f=(176, 356),
        supports_probe=True,
        supports_paddle=True,
        oil_levels=[OilLevel.ZERO, OilLevel.LOW, OilLevel.MEDIUM],
        default_oil=OilLevel.LOW,
        icon="mdi:pot-steam",
        description="Slow cooking with automatic stirring"
    ),
    
    "gratin_grill": CookingFeature(
        name="gratin_grill",
        display_name="Gratin/Grilled",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(180, 200),
        temperature_range_f=(356, 392),
        supports_probe=False,
        oil_levels=[OilLevel.ZERO, OilLevel.LOW],
        default_oil=OilLevel.ZERO,
        icon="mdi:grill",
        description="Top heat for gratins and grilling"
    ),
    
    "pizza_bread": CookingFeature(
        name="pizza_bread",
        display_name="Pizza/Bread",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(180, 250),
        temperature_range_f=(356, 482),
        supports_probe=False,
        oil_levels=[OilLevel.ZERO],
        default_oil=OilLevel.ZERO,
        icon="mdi:pizza",
        description="High-heat baking for pizza and bread"
    ),
    
    "dessert": CookingFeature(
        name="dessert",
        display_name="Dessert",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(140, 180),
        temperature_range_f=(284, 356),
        supports_probe=False,
        oil_levels=[OilLevel.ZERO, OilLevel.LOW],
        default_oil=OilLevel.ZERO,
        icon="mdi:cupcake",
        description="Gentle baking for cakes and desserts"
    ),
    
    "rice_pasta": CookingFeature(
        name="rice_pasta",
        display_name="Rice/Pasta",
        feature_type=FeatureType.MODIFIED,
        temperature_range_c=(80, 100),
        temperature_range_f=(176, 212),
        supports_probe=False,
        oil_levels=[OilLevel.ZERO],
        default_oil=OilLevel.ZERO,
        icon="mdi:rice",
        description="Automated rice and pasta cooking"
    ),
    
    # =========================================================================
    # SPECIAL COOKING METHODS (require appliance-specific recipes)
    # =========================================================================
    "combi_crisp": CookingFeature(
        name="combi_crisp",
        display_name="Combi Crisp",
        feature_type=FeatureType.SPECIAL,
        temperature_range_c=(150, 230),
        temperature_range_f=(302, 446),
        supports_probe=True,
        icon="mdi:chef-hat",
        description="Steam + Air Fry combination for crispy exterior and moist interior"
    ),
    
    "combi_bake": CookingFeature(
        name="combi_bake",
        display_name="Combi Bake",
        feature_type=FeatureType.SPECIAL,
        temperature_range_c=(100, 230),
        temperature_range_f=(212, 446),
        supports_probe=False,
        icon="mdi:chef-hat",
        description="Steam + Convection combination for perfect baking"
    ),
    
    "combi_roast": CookingFeature(
        name="combi_roast",
        display_name="Combi Roast",
        feature_type=FeatureType.SPECIAL,
        temperature_range_c=(120, 220),
        temperature_range_f=(248, 428),
        supports_probe=True,
        icon="mdi:chef-hat",
        description="Steam + Roast combination for juicy roasts"
    ),
    
    "combi_meal": CookingFeature(
        name="combi_meal",
        display_name="Combi Meal",
        feature_type=FeatureType.SPECIAL,
        temperature_range_c=(100, 200),
        temperature_range_f=(212, 392),
        supports_probe=True,
        icon="mdi:silverware-fork-knife",
        description="Multi-tray complete meal cooking"
    ),
    
    "sous_vide": CookingFeature(
        name="sous_vide",
        display_name="Sous Vide",
        feature_type=FeatureType.SPECIAL,
        temperature_range_c=(50, 90),
        temperature_range_f=(122, 194),
        supports_probe=True,
        icon="mdi:water",
        description="Precise low-temperature water bath cooking"
    ),
}


# =============================================================================
# HELPER FUNCTIONS
# =============================================================================

def get_feature(feature_name: str) -> Optional[CookingFeature]:
    """Get a feature definition by name.
    
    Args:
        feature_name: The feature identifier (e.g., "air_fry")
        
    Returns:
        The CookingFeature definition, or None if not found
    """
    return FEATURE_CATALOG.get(feature_name)


def get_all_features() -> List[CookingFeature]:
    """Get all features in the catalog.
    
    Returns:
        List of all CookingFeature definitions
    """
    return list(FEATURE_CATALOG.values())


def get_features_by_type(feature_type: FeatureType) -> List[CookingFeature]:
    """Get all features of a specific type.
    
    Args:
        feature_type: The type of features to retrieve
        
    Returns:
        List of CookingFeature definitions matching the type
    """
    return [f for f in FEATURE_CATALOG.values() if f.feature_type == feature_type]


def get_feature_names() -> Set[str]:
    """Get all feature names in the catalog.
    
    Returns:
        Set of all feature identifiers
    """
    return set(FEATURE_CATALOG.keys())


def validate_features(feature_names: Set[str]) -> tuple[bool, List[str]]:
    """Validate a set of feature names against the catalog.
    
    Args:
        feature_names: Set of feature identifiers to validate
        
    Returns:
        Tuple of (all_valid: bool, invalid_features: List[str])
    """
    invalid = [name for name in feature_names if name not in FEATURE_CATALOG]
    return len(invalid) == 0, invalid
