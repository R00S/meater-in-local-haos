"""
Cooking data for Kitchen Cooking Engine.

Last Updated: 1 Dec 2025, 13:09 CET
Last Change: No changes, timestamps updated to new format

This module contains comprehensive cooking data including proteins, cuts,
doneness levels, cooking methods, and target temperatures.

DATA SOURCES (all publicly available):
- USDA Food Safety and Inspection Service (FSIS) Safe Minimum Internal
  Temperatures: https://www.fsis.usda.gov/food-safety/safe-food-handling-and-preparation/food-safety-basics/safe-minimum-internal-temperature-chart
- FDA Food Code temperature requirements
- America's Test Kitchen / Cook's Illustrated public temperature guides
- Serious Eats food science articles (publicly available)
- Professional culinary training standards (Le Cordon Bleu, CIA)

STRUCTURE REFERENCE:
The data structure (categories → meats → cut_types → cuts) is informed by
the MEATER app's organization (meatCutStructure package) but all actual
temperature values and cooking data come from the public sources listed above.

The MEATER app structure includes:
- MeatCategory (e.g., Beef, Pork, Poultry, Fish, Lamb, Game)
- Meat (animal types within category)
- MeatCutType (groupings like Steaks, Roasts)
- MeatCut/SearchableMeatCut (specific cuts with temperature ranges)
- MeatCookingTemperature (doneness levels with min/max temps)
- Appliance/CookMethod (cooking methods)

All temperature values in this file are sourced from USDA/FDA guidelines
and professional culinary standards, NOT from the MEATER app.
"""

from dataclasses import dataclass, field
from enum import Enum
from typing import Optional


class CookingMethod(Enum):
    """Cooking methods supported by the Kitchen Cooking Engine.

    These are kitchen-focused cooking methods, not just grilling.
    """

    # Oven methods
    OVEN_ROAST = "oven_roast"
    OVEN_BAKE = "oven_bake"
    OVEN_BROIL = "oven_broil"

    # Stove-top methods
    PAN_FRY = "pan_fry"
    PAN_SEAR = "pan_sear"
    SAUTE = "saute"
    BRAISE = "braise"
    POACH = "poach"
    SIMMER = "simmer"
    BOIL = "boil"
    STEAM = "steam"

    # Specialty appliances
    AIR_FRYER = "air_fryer"
    SOUS_VIDE = "sous_vide"
    SLOW_COOKER = "slow_cooker"
    PRESSURE_COOKER = "pressure_cooker"

    # Outdoor methods (included for completeness)
    GRILL = "grill"
    SMOKER = "smoker"
    CHARCOAL_GRILL = "charcoal_grill"


@dataclass
class CookingMethodInfo:
    """Information about a cooking method."""

    method: CookingMethod
    name: str  # Display name
    description: str
    typical_temp_range_c: tuple[int, int]  # (min, max) appliance temp
    typical_temp_range_f: tuple[int, int]
    has_safety_warning: bool = False
    safety_warning: Optional[str] = None
    indoor: bool = True  # True for kitchen methods


# Cooking method definitions with details
COOKING_METHODS = {
    CookingMethod.OVEN_ROAST: CookingMethodInfo(
        method=CookingMethod.OVEN_ROAST,
        name="Oven Roasting",
        description="Dry heat cooking in enclosed oven for roasts and whole poultry",
        typical_temp_range_c=(150, 230),
        typical_temp_range_f=(300, 450),
        indoor=True,
    ),
    CookingMethod.OVEN_BAKE: CookingMethodInfo(
        method=CookingMethod.OVEN_BAKE,
        name="Oven Baking",
        description="Gentle dry heat for even cooking of fish and chicken",
        typical_temp_range_c=(175, 200),
        typical_temp_range_f=(350, 400),
        indoor=True,
    ),
    CookingMethod.OVEN_BROIL: CookingMethodInfo(
        method=CookingMethod.OVEN_BROIL,
        name="Broiling",
        description="Direct high heat from above for quick cooking and browning",
        typical_temp_range_c=(260, 290),
        typical_temp_range_f=(500, 550),
        indoor=True,
    ),
    CookingMethod.PAN_FRY: CookingMethodInfo(
        method=CookingMethod.PAN_FRY,
        name="Pan Frying",
        description="Direct heat in pan with oil for steaks, chops, and fish",
        typical_temp_range_c=(175, 230),
        typical_temp_range_f=(350, 450),
        indoor=True,
    ),
    CookingMethod.PAN_SEAR: CookingMethodInfo(
        method=CookingMethod.PAN_SEAR,
        name="Pan Searing",
        description="High heat for crust formation, often followed by oven finishing",
        typical_temp_range_c=(230, 290),
        typical_temp_range_f=(450, 550),
        indoor=True,
    ),
    CookingMethod.SAUTE: CookingMethodInfo(
        method=CookingMethod.SAUTE,
        name="Sautéing",
        description="Quick cooking with movement for vegetables and thin cuts",
        typical_temp_range_c=(175, 205),
        typical_temp_range_f=(350, 400),
        indoor=True,
    ),
    CookingMethod.BRAISE: CookingMethodInfo(
        method=CookingMethod.BRAISE,
        name="Braising",
        description="Slow cooking in liquid for tough cuts and stews",
        typical_temp_range_c=(135, 165),
        typical_temp_range_f=(275, 325),
        indoor=True,
    ),
    CookingMethod.POACH: CookingMethodInfo(
        method=CookingMethod.POACH,
        name="Poaching",
        description="Gentle cooking in liquid for fish, eggs, and chicken breast",
        typical_temp_range_c=(70, 82),
        typical_temp_range_f=(160, 180),
        indoor=True,
    ),
    CookingMethod.SIMMER: CookingMethodInfo(
        method=CookingMethod.SIMMER,
        name="Simmering",
        description="Gentle bubbling for soups, sauces, and stews",
        typical_temp_range_c=(85, 96),
        typical_temp_range_f=(185, 205),
        indoor=True,
    ),
    CookingMethod.BOIL: CookingMethodInfo(
        method=CookingMethod.BOIL,
        name="Boiling",
        description="Vigorous bubbling for pasta, vegetables, and eggs",
        typical_temp_range_c=(100, 100),
        typical_temp_range_f=(212, 212),
        indoor=True,
    ),
    CookingMethod.STEAM: CookingMethodInfo(
        method=CookingMethod.STEAM,
        name="Steaming",
        description="Cooking with steam for vegetables and fish",
        typical_temp_range_c=(100, 100),
        typical_temp_range_f=(212, 212),
        indoor=True,
    ),
    CookingMethod.AIR_FRYER: CookingMethodInfo(
        method=CookingMethod.AIR_FRYER,
        name="Air Fryer",
        description="Rapid hot air circulation for crispy results",
        typical_temp_range_c=(175, 200),
        typical_temp_range_f=(350, 400),
        indoor=True,
    ),
    CookingMethod.SOUS_VIDE: CookingMethodInfo(
        method=CookingMethod.SOUS_VIDE,
        name="Sous Vide",
        description="Precision water bath cooking for perfect temperature control",
        typical_temp_range_c=(50, 85),
        typical_temp_range_f=(122, 185),
        indoor=True,
    ),
    CookingMethod.SLOW_COOKER: CookingMethodInfo(
        method=CookingMethod.SLOW_COOKER,
        name="Slow Cooker",
        description="Low, slow moist heat for stews, pulled meats, and roasts",
        typical_temp_range_c=(85, 150),
        typical_temp_range_f=(185, 300),
        indoor=True,
    ),
    CookingMethod.PRESSURE_COOKER: CookingMethodInfo(
        method=CookingMethod.PRESSURE_COOKER,
        name="Pressure Cooker / Instant Pot",
        description="High-pressure steam cooking for quick braising",
        typical_temp_range_c=(115, 120),
        typical_temp_range_f=(240, 250),
        indoor=True,
    ),
    CookingMethod.GRILL: CookingMethodInfo(
        method=CookingMethod.GRILL,
        name="Grill",
        description="Direct radiant heat for steaks, burgers, and vegetables",
        typical_temp_range_c=(230, 315),
        typical_temp_range_f=(450, 600),
        indoor=False,
    ),
    CookingMethod.SMOKER: CookingMethodInfo(
        method=CookingMethod.SMOKER,
        name="Smoker",
        description="Low heat with smoke for brisket, ribs, and pork shoulder",
        typical_temp_range_c=(95, 135),
        typical_temp_range_f=(200, 275),
        indoor=False,
    ),
    CookingMethod.CHARCOAL_GRILL: CookingMethodInfo(
        method=CookingMethod.CHARCOAL_GRILL,
        name="Charcoal Grill",
        description="Traditional charcoal grilling with smoky flavor",
        typical_temp_range_c=(230, 370),
        typical_temp_range_f=(450, 700),
        indoor=False,
        has_safety_warning=True,
        safety_warning="Never use charcoal indoors. Ensure proper ventilation.",
    ),
}


@dataclass
class TemperatureRange:
    """Temperature range for a specific doneness level."""

    id: int
    name: str  # e.g., "rare", "medium_rare", "medium", etc.
    description: str  # Human-readable description
    target_temp_c: int
    target_temp_f: int
    min_temp_c: int
    min_temp_f: int
    max_temp_c: int
    max_temp_f: int
    usda_safe: bool = False
    is_meater_recommended: bool = False
    # Hex colors for gradient display (from MEATER app)
    start_hex: Optional[str] = None
    end_hex: Optional[str] = None


@dataclass
class MeatCut:
    """A specific cut of meat with its temperature ranges."""

    id: int
    name: str  # Internal name key
    name_long: str  # Display name
    cut_order: int  # Display order
    estimated_thickness_mm: Optional[int] = None
    usda_safe_c: Optional[int] = None
    usda_safe_f: Optional[int] = None
    temperature_ranges: list[TemperatureRange] = field(default_factory=list)
    # Rest time recommendations (minutes)
    rest_time_min: int = 3
    rest_time_max: int = 10
    # Carryover cooking estimate (degrees C)
    carryover_temp_c: int = 3
    # Supported cooking methods for this cut
    supported_methods: list[CookingMethod] = field(default_factory=list)


@dataclass
class CutType:
    """A type/category of cuts (e.g., Steaks, Roasts)."""

    id: int
    name: str
    cuts: list[MeatCut] = field(default_factory=list)


@dataclass
class Meat:
    """An animal type within a category (e.g., Cow in Beef category)."""

    id: int
    name: str
    description: str
    cut_types: list[CutType] = field(default_factory=list)


@dataclass
class MeatCategory:
    """A top-level meat category (e.g., Beef, Pork, Poultry)."""

    id: int
    name: str
    color_hex: str
    meats: list[Meat] = field(default_factory=list)


# ============================================================================
# TEMPERATURE RANGE DEFINITIONS
# ============================================================================

# Common doneness levels - Beef/Lamb style
DONENESS_RARE = TemperatureRange(
    id=1,
    name="rare",
    description="Cool red center",
    target_temp_c=49,
    target_temp_f=120,
    min_temp_c=46,
    min_temp_f=115,
    max_temp_c=52,
    max_temp_f=125,
    usda_safe=False,
    start_hex="#FF0000",
    end_hex="#FF3333",
)

DONENESS_MEDIUM_RARE = TemperatureRange(
    id=2,
    name="medium_rare",
    description="Warm red center",
    target_temp_c=54,
    target_temp_f=130,
    min_temp_c=52,
    min_temp_f=125,
    max_temp_c=57,
    max_temp_f=135,
    usda_safe=False,
    is_meater_recommended=True,
    start_hex="#FF3333",
    end_hex="#FF6666",
)

DONENESS_MEDIUM = TemperatureRange(
    id=3,
    name="medium",
    description="Warm pink center",
    target_temp_c=60,
    target_temp_f=140,
    min_temp_c=57,
    min_temp_f=135,
    max_temp_c=63,
    max_temp_f=145,
    usda_safe=False,
    start_hex="#FF6666",
    end_hex="#FF9999",
)

DONENESS_MEDIUM_WELL = TemperatureRange(
    id=4,
    name="medium_well",
    description="Slightly pink center",
    target_temp_c=66,
    target_temp_f=150,
    min_temp_c=63,
    min_temp_f=145,
    max_temp_c=68,
    max_temp_f=155,
    usda_safe=True,
    start_hex="#FF9999",
    end_hex="#FFCCCC",
)

DONENESS_WELL_DONE = TemperatureRange(
    id=5,
    name="well_done",
    description="No pink, fully cooked",
    target_temp_c=71,
    target_temp_f=160,
    min_temp_c=68,
    min_temp_f=155,
    max_temp_c=77,
    max_temp_f=170,
    usda_safe=True,
    start_hex="#FFCCCC",
    end_hex="#FFFFFF",
)

# Pulled/Braised - for collagen breakdown
DONENESS_PULLED = TemperatureRange(
    id=6,
    name="pulled",
    description="Shreddable, collagen broken down",
    target_temp_c=93,
    target_temp_f=200,
    min_temp_c=88,
    min_temp_f=190,
    max_temp_c=96,
    max_temp_f=205,
    usda_safe=True,
    start_hex="#8B4513",
    end_hex="#A0522D",
)

# Pork specific - USDA minimum is 145°F with rest
PORK_MEDIUM = TemperatureRange(
    id=10,
    name="medium",
    description="Slightly pink, juicy",
    target_temp_c=63,
    target_temp_f=145,
    min_temp_c=60,
    min_temp_f=140,
    max_temp_c=66,
    max_temp_f=150,
    usda_safe=True,
    is_meater_recommended=True,
    start_hex="#FFB6C1",
    end_hex="#FFC0CB",
)

PORK_WELL_DONE = TemperatureRange(
    id=11,
    name="well_done",
    description="No pink, fully cooked",
    target_temp_c=71,
    target_temp_f=160,
    min_temp_c=68,
    min_temp_f=155,
    max_temp_c=77,
    max_temp_f=170,
    usda_safe=True,
    start_hex="#FFC0CB",
    end_hex="#FFFFFF",
)

# Poultry - must be cooked through
POULTRY_SAFE = TemperatureRange(
    id=20,
    name="safe",
    description="Cooked through, safe to eat",
    target_temp_c=74,
    target_temp_f=165,
    min_temp_c=74,
    min_temp_f=165,
    max_temp_c=77,
    max_temp_f=170,
    usda_safe=True,
    is_meater_recommended=True,
    start_hex="#FFFACD",
    end_hex="#FFFFFF",
)

# Dark meat poultry - higher temp for better texture
POULTRY_DARK_MEAT = TemperatureRange(
    id=21,
    name="dark_meat_optimal",
    description="Dark meat optimal texture",
    target_temp_c=77,
    target_temp_f=170,
    min_temp_c=74,
    min_temp_f=165,
    max_temp_c=82,
    max_temp_f=180,
    usda_safe=True,
    is_meater_recommended=True,
    start_hex="#DEB887",
    end_hex="#D2B48C",
)

# Fish temperatures
FISH_MEDIUM_RARE = TemperatureRange(
    id=30,
    name="medium_rare",
    description="Translucent center",
    target_temp_c=49,
    target_temp_f=120,
    min_temp_c=46,
    min_temp_f=115,
    max_temp_c=52,
    max_temp_f=125,
    usda_safe=False,
    start_hex="#FFA07A",
    end_hex="#FA8072",
)

FISH_MEDIUM = TemperatureRange(
    id=31,
    name="medium",
    description="Barely translucent center",
    target_temp_c=54,
    target_temp_f=130,
    min_temp_c=52,
    min_temp_f=125,
    max_temp_c=57,
    max_temp_f=135,
    usda_safe=False,
    is_meater_recommended=True,
    start_hex="#FA8072",
    end_hex="#E9967A",
)

FISH_WELL_DONE = TemperatureRange(
    id=32,
    name="well_done",
    description="Opaque throughout",
    target_temp_c=63,
    target_temp_f=145,
    min_temp_c=60,
    min_temp_f=140,
    max_temp_c=66,
    max_temp_f=150,
    usda_safe=True,
    start_hex="#E9967A",
    end_hex="#FFFFFF",
)

# Tuna specific - often served very rare
TUNA_RARE = TemperatureRange(
    id=35,
    name="rare",
    description="Cool red center, seared exterior",
    target_temp_c=43,
    target_temp_f=110,
    min_temp_c=40,
    min_temp_f=105,
    max_temp_c=46,
    max_temp_f=115,
    usda_safe=False,
    is_meater_recommended=True,
    start_hex="#DC143C",
    end_hex="#FF0000",
)

# Duck breast - often served medium-rare
DUCK_MEDIUM_RARE = TemperatureRange(
    id=40,
    name="medium_rare",
    description="Pink and juicy",
    target_temp_c=54,
    target_temp_f=130,
    min_temp_c=52,
    min_temp_f=125,
    max_temp_c=57,
    max_temp_f=135,
    usda_safe=False,
    is_meater_recommended=True,
    start_hex="#8B0000",
    end_hex="#B22222",
)

DUCK_MEDIUM = TemperatureRange(
    id=41,
    name="medium",
    description="Slightly pink",
    target_temp_c=60,
    target_temp_f=140,
    min_temp_c=57,
    min_temp_f=135,
    max_temp_c=63,
    max_temp_f=145,
    usda_safe=False,
    start_hex="#B22222",
    end_hex="#CD5C5C",
)


# ============================================================================
# BEEF CATEGORY
# ============================================================================

BEEF_STEAKS = [
    MeatCut(
        id=100,
        name="ribeye_steak",
        name_long="Ribeye Steak",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
        supported_methods=[
            CookingMethod.PAN_SEAR,
            CookingMethod.PAN_FRY,
            CookingMethod.OVEN_ROAST,
            CookingMethod.SOUS_VIDE,
            CookingMethod.AIR_FRYER,
            CookingMethod.GRILL,
        ],
    ),
    MeatCut(
        id=101,
        name="sirloin_steak",
        name_long="Sirloin Steak",
        cut_order=2,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
        supported_methods=[
            CookingMethod.PAN_SEAR,
            CookingMethod.PAN_FRY,
            CookingMethod.OVEN_ROAST,
            CookingMethod.SOUS_VIDE,
            CookingMethod.AIR_FRYER,
            CookingMethod.GRILL,
        ],
    ),
    MeatCut(
        id=102,
        name="filet_mignon",
        name_long="Filet Mignon / Tenderloin Steak",
        cut_order=3,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=103,
        name="ny_strip",
        name_long="New York Strip",
        cut_order=4,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=104,
        name="t_bone",
        name_long="T-Bone / Porterhouse",
        cut_order=5,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=105,
        name="flank_steak",
        name_long="Flank Steak",
        cut_order=6,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=2,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=106,
        name="skirt_steak",
        name_long="Skirt Steak",
        cut_order=7,
        estimated_thickness_mm=15,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
    MeatCut(
        id=107,
        name="flat_iron",
        name_long="Flat Iron Steak",
        cut_order=8,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=2,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=108,
        name="hanger_steak",
        name_long="Hanger Steak",
        cut_order=9,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
    MeatCut(
        id=109,
        name="tri_tip",
        name_long="Tri-Tip",
        cut_order=10,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    # Additional cuts from MEATER app reference (2025)
    # NOTE: Temperature values from USDA/FDA guidelines, structure from MEATER
    MeatCut(
        id=110,
        name="tomahawk",
        name_long="Tomahawk Steak",
        cut_order=11,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=111,
        name="picanha",
        name_long="Picanha",
        cut_order=12,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
]

BEEF_ROASTS = [
    MeatCut(
        id=120,
        name="prime_rib",
        name_long="Prime Rib / Standing Rib Roast",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=121,
        name="beef_tenderloin_roast",
        name_long="Beef Tenderloin Roast",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=6,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=122,
        name="top_round_roast",
        name_long="Top Round Roast",
        cut_order=3,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=123,
        name="sirloin_tip_roast",
        name_long="Sirloin Tip Roast",
        cut_order=4,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    # Additional roast cuts from MEATER app reference (2025)
    MeatCut(
        id=124,
        name="roasting_joint",
        name_long="Roasting Joint",
        cut_order=5,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=125,
        name="round_roast",
        name_long="Round Roast",
        cut_order=6,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=126,
        name="rump_roast",
        name_long="Rump Roast",
        cut_order=7,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
]

BEEF_BRAISING = [
    MeatCut(
        id=130,
        name="chuck_roast",
        name_long="Chuck Roast / Pot Roast",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=131,
        name="brisket",
        name_long="Brisket",
        cut_order=2,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=30,
        rest_time_max=60,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=132,
        name="short_ribs",
        name_long="Short Ribs",
        cut_order=3,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=133,
        name="beef_shank",
        name_long="Beef Shank / Osso Buco",
        cut_order=4,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
]

BEEF_GROUND = [
    MeatCut(
        id=140,
        name="beef_burger",
        name_long="Beef Burger / Ground Beef Patty",
        cut_order=1,
        estimated_thickness_mm=20,
        usda_safe_c=71,  # Ground beef must be 160°F
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[
            # Only well-done is USDA safe for ground beef
            TemperatureRange(
                id=141,
                name="well_done",
                description="USDA Safe - No pink",
                target_temp_c=71,
                target_temp_f=160,
                min_temp_c=71,
                min_temp_f=160,
                max_temp_c=77,
                max_temp_f=170,
                usda_safe=True,
                is_meater_recommended=True,
            ),
        ],
    ),
    MeatCut(
        id=142,
        name="meatloaf",
        name_long="Meatloaf",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=[
            TemperatureRange(
                id=143,
                name="done",
                description="Cooked through",
                target_temp_c=71,
                target_temp_f=160,
                min_temp_c=71,
                min_temp_f=160,
                max_temp_c=77,
                max_temp_f=170,
                usda_safe=True,
                is_meater_recommended=True,
            ),
        ],
    ),
]

# Additional beef cuts from MEATER app reference (2025) - Offal/Other
BEEF_OFFAL = [
    MeatCut(
        id=145,
        name="beef_liver",
        name_long="Beef Liver",
        cut_order=1,
        estimated_thickness_mm=15,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[
            TemperatureRange(
                id=146,
                name="medium",
                description="Slightly pink inside",
                target_temp_c=63,
                target_temp_f=145,
                min_temp_c=60,
                min_temp_f=140,
                max_temp_c=66,
                max_temp_f=150,
                usda_safe=False,
            ),
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=147,
        name="beef_tongue",
        name_long="Beef Tongue",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=148,
        name="beef_shin",
        name_long="Beef Shin",
        cut_order=3,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=149,
        name="beef_rib",
        name_long="Beef Rib",
        cut_order=4,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
]


# ============================================================================
# PORK CATEGORY
# ============================================================================

PORK_CHOPS = [
    MeatCut(
        id=200,
        name="pork_chop",
        name_long="Pork Chop",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=[PORK_MEDIUM, PORK_WELL_DONE],
    ),
    MeatCut(
        id=201,
        name="pork_tenderloin",
        name_long="Pork Tenderloin",
        cut_order=2,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=[PORK_MEDIUM, PORK_WELL_DONE],
    ),
    # Additional pork steaks from MEATER app reference (2025)
    MeatCut(
        id=202,
        name="pork_loin_steak",
        name_long="Pork Loin Steak",
        cut_order=3,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=[PORK_MEDIUM, PORK_WELL_DONE],
    ),
    MeatCut(
        id=203,
        name="pork_shoulder_steak",
        name_long="Pork Shoulder Steak",
        cut_order=4,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[PORK_MEDIUM, PORK_WELL_DONE],
    ),
    MeatCut(
        id=204,
        name="secreto",
        name_long="Secreto (Ibérico Pork)",
        cut_order=5,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[PORK_MEDIUM, PORK_WELL_DONE],
    ),
]

PORK_ROASTS = [
    MeatCut(
        id=210,
        name="pork_loin_roast",
        name_long="Pork Loin Roast",
        cut_order=1,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[PORK_MEDIUM, PORK_WELL_DONE],
    ),
    MeatCut(
        id=211,
        name="pork_shoulder",
        name_long="Pork Shoulder / Boston Butt",
        cut_order=2,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=20,
        rest_time_max=45,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=212,
        name="pork_belly",
        name_long="Pork Belly",
        cut_order=3,
        estimated_thickness_mm=40,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=3,
        temperature_ranges=[
            PORK_WELL_DONE,
            TemperatureRange(
                id=213,
                name="crispy",
                description="Crispy and rendered",
                target_temp_c=90,
                target_temp_f=195,
                min_temp_c=85,
                min_temp_f=185,
                max_temp_c=95,
                max_temp_f=203,
                usda_safe=True,
            ),
        ],
    ),
    # Additional pork roasts from MEATER app reference (2025)
    MeatCut(
        id=214,
        name="pork_leg",
        name_long="Pork Leg Roast",
        cut_order=4,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[PORK_MEDIUM, PORK_WELL_DONE],
    ),
    MeatCut(
        id=215,
        name="virginia_ham",
        name_long="Virginia Ham",
        cut_order=5,
        estimated_thickness_mm=100,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            TemperatureRange(
                id=216,
                name="heated_through",
                description="Heated through",
                target_temp_c=60,
                target_temp_f=140,
                min_temp_c=57,
                min_temp_f=135,
                max_temp_c=63,
                max_temp_f=145,
                usda_safe=True,
                is_meater_recommended=True,
            ),
        ],
    ),
]

PORK_RIBS = [
    MeatCut(
        id=220,
        name="baby_back_ribs",
        name_long="Baby Back Ribs",
        cut_order=1,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=221,
        name="spare_ribs",
        name_long="Spare Ribs",
        cut_order=2,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=222,
        name="st_louis_ribs",
        name_long="St. Louis Style Ribs",
        cut_order=3,
        estimated_thickness_mm=45,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
]

PORK_HAM = [
    MeatCut(
        id=230,
        name="fresh_ham",
        name_long="Fresh Ham",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=[PORK_MEDIUM, PORK_WELL_DONE],
    ),
    MeatCut(
        id=231,
        name="cured_ham",
        name_long="Cured Ham (Pre-cooked)",
        cut_order=2,
        estimated_thickness_mm=100,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            TemperatureRange(
                id=232,
                name="heated_through",
                description="Heated through",
                target_temp_c=60,
                target_temp_f=140,
                min_temp_c=57,
                min_temp_f=135,
                max_temp_c=63,
                max_temp_f=145,
                usda_safe=True,
                is_meater_recommended=True,
            ),
        ],
    ),
]

PORK_GROUND = [
    MeatCut(
        id=240,
        name="pork_sausage",
        name_long="Pork Sausage",
        cut_order=1,
        estimated_thickness_mm=30,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[PORK_WELL_DONE],
    ),
    MeatCut(
        id=241,
        name="ground_pork",
        name_long="Ground Pork",
        cut_order=2,
        estimated_thickness_mm=20,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[PORK_WELL_DONE],
    ),
]

# Additional pork cuts from MEATER app reference (2025) - Offal/Other
PORK_OFFAL = [
    MeatCut(
        id=245,
        name="pork_jowl",
        name_long="Pork Jowl / Guanciale",
        cut_order=1,
        estimated_thickness_mm=30,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=246,
        name="pork_cheek",
        name_long="Pork Cheek",
        cut_order=2,
        estimated_thickness_mm=40,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=3,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=247,
        name="pork_liver",
        name_long="Pork Liver",
        cut_order=3,
        estimated_thickness_mm=15,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[PORK_WELL_DONE],
    ),
    MeatCut(
        id=248,
        name="pork_tongue",
        name_long="Pork Tongue",
        cut_order=4,
        estimated_thickness_mm=60,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
]


# ============================================================================
# POULTRY CATEGORY
# ============================================================================

CHICKEN_WHOLE = [
    MeatCut(
        id=300,
        name="whole_chicken",
        name_long="Whole Chicken",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[POULTRY_SAFE],
    ),
]

CHICKEN_BREAST = [
    MeatCut(
        id=310,
        name="chicken_breast",
        name_long="Chicken Breast",
        cut_order=1,
        estimated_thickness_mm=30,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=[POULTRY_SAFE],
    ),
    MeatCut(
        id=311,
        name="chicken_breast_bone_in",
        name_long="Chicken Breast (Bone-in)",
        cut_order=2,
        estimated_thickness_mm=40,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=[POULTRY_SAFE],
    ),
]

CHICKEN_DARK_MEAT = [
    MeatCut(
        id=320,
        name="chicken_thigh",
        name_long="Chicken Thigh",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=[POULTRY_SAFE, POULTRY_DARK_MEAT],
    ),
    MeatCut(
        id=321,
        name="chicken_leg",
        name_long="Chicken Leg / Drumstick",
        cut_order=2,
        estimated_thickness_mm=35,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=[POULTRY_SAFE, POULTRY_DARK_MEAT],
    ),
    MeatCut(
        id=322,
        name="chicken_wing",
        name_long="Chicken Wing",
        cut_order=3,
        estimated_thickness_mm=20,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=2,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=[POULTRY_SAFE, POULTRY_DARK_MEAT],
    ),
    # Additional turkey cuts from MEATER app reference (2025)
    MeatCut(
        id=333,
        name="turkey_thigh",
        name_long="Turkey Thigh",
        cut_order=4,
        estimated_thickness_mm=60,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=4,
        temperature_ranges=[POULTRY_SAFE, POULTRY_DARK_MEAT],
    ),
]

# Goose - from MEATER app reference (2025)
GOOSE = [
    MeatCut(
        id=345,
        name="whole_goose",
        name_long="Whole Goose",
        cut_order=1,
        estimated_thickness_mm=120,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=20,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[POULTRY_SAFE],
    ),
    MeatCut(
        id=346,
        name="goose_breast",
        name_long="Goose Breast",
        cut_order=2,
        estimated_thickness_mm=30,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=[DUCK_MEDIUM_RARE, DUCK_MEDIUM, POULTRY_SAFE],
    ),
    MeatCut(
        id=347,
        name="goose_thigh",
        name_long="Goose Thigh",
        cut_order=3,
        estimated_thickness_mm=50,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=4,
        temperature_ranges=[POULTRY_SAFE, POULTRY_DARK_MEAT],
    ),
    MeatCut(
        id=348,
        name="goose_leg",
        name_long="Goose Leg",
        cut_order=4,
        estimated_thickness_mm=60,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=4,
        temperature_ranges=[POULTRY_SAFE, POULTRY_DARK_MEAT],
    ),
]

DUCK = [
    MeatCut(
        id=340,
        name="duck_breast",
        name_long="Duck Breast",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=74,  # USDA says 165, but many serve at lower temps
        usda_safe_f=165,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=[DUCK_MEDIUM_RARE, DUCK_MEDIUM, POULTRY_SAFE],
    ),
    MeatCut(
        id=341,
        name="whole_duck",
        name_long="Whole Duck",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[POULTRY_SAFE],
    ),
    MeatCut(
        id=342,
        name="duck_leg_confit",
        name_long="Duck Leg Confit",
        cut_order=3,
        estimated_thickness_mm=40,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[POULTRY_DARK_MEAT],
    ),
]

GROUND_POULTRY = [
    MeatCut(
        id=350,
        name="ground_chicken",
        name_long="Ground Chicken",
        cut_order=1,
        estimated_thickness_mm=20,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=2,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=[POULTRY_SAFE],
    ),
    MeatCut(
        id=351,
        name="ground_turkey",
        name_long="Ground Turkey",
        cut_order=2,
        estimated_thickness_mm=20,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=2,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=[POULTRY_SAFE],
    ),
    # Additional ground poultry from MEATER app reference (2025)
    MeatCut(
        id=352,
        name="chicken_burger",
        name_long="Chicken Burger",
        cut_order=3,
        estimated_thickness_mm=20,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[POULTRY_SAFE],
    ),
    MeatCut(
        id=353,
        name="turkey_burger",
        name_long="Turkey Burger",
        cut_order=4,
        estimated_thickness_mm=20,
        usda_safe_c=74,
        usda_safe_f=165,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[POULTRY_SAFE],
    ),
]


# ============================================================================
# FISH & SEAFOOD CATEGORY
# ============================================================================

SALMON = [
    MeatCut(
        id=400,
        name="salmon_fillet",
        name_long="Salmon Fillet",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_MEDIUM_RARE, FISH_MEDIUM, FISH_WELL_DONE],
    ),
    MeatCut(
        id=401,
        name="salmon_steak",
        name_long="Salmon Steak",
        cut_order=2,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=3,
        temperature_ranges=[FISH_MEDIUM_RARE, FISH_MEDIUM, FISH_WELL_DONE],
    ),
]

TUNA = [
    MeatCut(
        id=410,
        name="tuna_steak",
        name_long="Tuna Steak",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[TUNA_RARE, FISH_MEDIUM_RARE, FISH_MEDIUM],
    ),
]

WHITE_FISH = [
    MeatCut(
        id=420,
        name="cod_fillet",
        name_long="Cod Fillet",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_MEDIUM, FISH_WELL_DONE],
    ),
    MeatCut(
        id=421,
        name="halibut_fillet",
        name_long="Halibut Fillet",
        cut_order=2,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=3,
        temperature_ranges=[FISH_MEDIUM, FISH_WELL_DONE],
    ),
    MeatCut(
        id=422,
        name="sea_bass",
        name_long="Sea Bass",
        cut_order=3,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_MEDIUM, FISH_WELL_DONE],
    ),
    MeatCut(
        id=423,
        name="swordfish",
        name_long="Swordfish Steak",
        cut_order=4,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_MEDIUM, FISH_WELL_DONE],
    ),
    MeatCut(
        id=424,
        name="mahi_mahi",
        name_long="Mahi-Mahi",
        cut_order=5,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_MEDIUM, FISH_WELL_DONE],
    ),
    # Additional white fish from MEATER app reference (2025)
    MeatCut(
        id=425,
        name="haddock",
        name_long="Haddock Fillet",
        cut_order=6,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_MEDIUM, FISH_WELL_DONE],
    ),
    MeatCut(
        id=426,
        name="hake",
        name_long="Hake Fillet",
        cut_order=7,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_MEDIUM, FISH_WELL_DONE],
    ),
    MeatCut(
        id=427,
        name="trout",
        name_long="Trout Fillet",
        cut_order=8,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_MEDIUM_RARE, FISH_MEDIUM, FISH_WELL_DONE],
    ),
]

SHELLFISH = [
    MeatCut(
        id=430,
        name="shrimp",
        name_long="Shrimp",
        cut_order=1,
        estimated_thickness_mm=15,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=0,
        carryover_temp_c=1,
        temperature_ranges=[FISH_WELL_DONE],
    ),
    MeatCut(
        id=431,
        name="lobster_tail",
        name_long="Lobster Tail",
        cut_order=2,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[FISH_WELL_DONE],
    ),
    MeatCut(
        id=432,
        name="scallops",
        name_long="Scallops",
        cut_order=3,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=0,
        rest_time_max=0,
        carryover_temp_c=2,
        temperature_ranges=[
            TemperatureRange(
                id=433,
                name="medium_rare",
                description="Translucent center",
                target_temp_c=46,
                target_temp_f=115,
                min_temp_c=43,
                min_temp_f=110,
                max_temp_c=49,
                max_temp_f=120,
                usda_safe=False,
                is_meater_recommended=True,
            ),
            FISH_WELL_DONE,
        ],
    ),
]


# ============================================================================
# LAMB CATEGORY
# ============================================================================

LAMB_ROASTS = [
    MeatCut(
        id=500,
        name="leg_of_lamb",
        name_long="Leg of Lamb",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=501,
        name="rack_of_lamb",
        name_long="Rack of Lamb",
        cut_order=2,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=502,
        name="lamb_shoulder",
        name_long="Lamb Shoulder",
        cut_order=3,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
]

LAMB_CHOPS = [
    MeatCut(
        id=510,
        name="lamb_chops",
        name_long="Lamb Chops",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=511,
        name="lamb_loin_chops",
        name_long="Lamb Loin Chops",
        cut_order=2,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    # Additional lamb chops from MEATER app reference (2025)
    MeatCut(
        id=512,
        name="lamb_neck_filet",
        name_long="Lamb Neck Filet",
        cut_order=3,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=513,
        name="lamb_cutlet",
        name_long="Lamb Cutlet",
        cut_order=4,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
]

# Additional lamb roasts from MEATER app reference (2025)
LAMB_ROASTS_ADDITIONAL = [
    MeatCut(
        id=503,
        name="lamb_loin_roast",
        name_long="Lamb Loin Roast",
        cut_order=4,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=504,
        name="lamb_brisket",
        name_long="Lamb Brisket",
        cut_order=5,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=505,
        name="lamb_rump",
        name_long="Lamb Rump",
        cut_order=6,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=506,
        name="lamb_shank",
        name_long="Lamb Shank",
        cut_order=7,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
    MeatCut(
        id=507,
        name="lamb_rib",
        name_long="Lamb Rib",
        cut_order=8,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
]

LAMB_GROUND = [
    MeatCut(
        id=520,
        name="ground_lamb",
        name_long="Ground Lamb",
        cut_order=1,
        estimated_thickness_mm=20,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=[DONENESS_WELL_DONE],
    ),
    MeatCut(
        id=521,
        name="lamb_kofta",
        name_long="Lamb Kofta / Kebab",
        cut_order=2,
        estimated_thickness_mm=25,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=[DONENESS_WELL_DONE],
    ),
    # Additional from MEATER app reference (2025)
    MeatCut(
        id=522,
        name="lamb_burger",
        name_long="Lamb Burger",
        cut_order=3,
        estimated_thickness_mm=20,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[DONENESS_WELL_DONE],
    ),
]


# ============================================================================
# GAME CATEGORY
# ============================================================================

VENISON = [
    MeatCut(
        id=600,
        name="venison_steak",
        name_long="Venison Steak",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=601,
        name="venison_roast",
        name_long="Venison Roast",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
    MeatCut(
        id=602,
        name="venison_loin",
        name_long="Venison Loin",
        cut_order=3,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
]

WILD_BOAR = [
    MeatCut(
        id=610,
        name="wild_boar_chop",
        name_long="Wild Boar Chop",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=71,  # Must be cooked through
        usda_safe_f=160,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=[PORK_WELL_DONE],
    ),
    MeatCut(
        id=611,
        name="wild_boar_shoulder",
        name_long="Wild Boar Shoulder",
        cut_order=2,
        estimated_thickness_mm=100,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
]

BISON = [
    MeatCut(
        id=620,
        name="bison_steak",
        name_long="Bison Steak",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=621,
        name="bison_burger",
        name_long="Bison Burger",
        cut_order=2,
        estimated_thickness_mm=20,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[DONENESS_WELL_DONE],
    ),
    MeatCut(
        id=622,
        name="bison_roast",
        name_long="Bison Roast",
        cut_order=3,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
]

# Additional game meats from MEATER app reference (2025)
REINDEER = [
    MeatCut(
        id=630,
        name="reindeer_steak",
        name_long="Reindeer Steak",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=631,
        name="reindeer_roast",
        name_long="Reindeer Roast",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
]

MOOSE = [
    MeatCut(
        id=640,
        name="moose_steak",
        name_long="Moose Steak",
        cut_order=1,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=641,
        name="moose_roast",
        name_long="Moose Roast",
        cut_order=2,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
]

BUFFALO = [
    MeatCut(
        id=650,
        name="buffalo_steak",
        name_long="Buffalo Steak",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=651,
        name="buffalo_roast",
        name_long="Buffalo Roast",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
]

OSTRICH = [
    MeatCut(
        id=660,
        name="ostrich_steak",
        name_long="Ostrich Steak",
        cut_order=1,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
    MeatCut(
        id=661,
        name="ostrich_fillet",
        name_long="Ostrich Fillet",
        cut_order=2,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
]

MUTTON = [
    MeatCut(
        id=670,
        name="mutton_chop",
        name_long="Mutton Chop",
        cut_order=1,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=671,
        name="mutton_leg",
        name_long="Mutton Leg Roast",
        cut_order=2,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=672,
        name="mutton_shoulder",
        name_long="Mutton Shoulder",
        cut_order=3,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
]

KANGAROO = [
    MeatCut(
        id=680,
        name="kangaroo_steak",
        name_long="Kangaroo Steak",
        cut_order=1,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
    MeatCut(
        id=681,
        name="kangaroo_fillet",
        name_long="Kangaroo Fillet",
        cut_order=2,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_RARE,
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
        ],
    ),
]

GOAT = [
    MeatCut(
        id=690,
        name="goat_chop",
        name_long="Goat Chop",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=691,
        name="goat_leg",
        name_long="Goat Leg Roast",
        cut_order=2,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[
            DONENESS_MEDIUM_RARE,
            DONENESS_MEDIUM,
            DONENESS_MEDIUM_WELL,
            DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=692,
        name="goat_shoulder",
        name_long="Goat Shoulder",
        cut_order=3,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=[DONENESS_PULLED],
    ),
]


# ============================================================================
# VEGETABLES CATEGORY
# ============================================================================

# Vegetable doneness levels
VEG_TENDER = TemperatureRange(
    id=700,
    name="tender",
    description="Fully tender, fork-pierces easily",
    target_temp_c=95,
    target_temp_f=203,
    min_temp_c=90,
    min_temp_f=195,
    max_temp_c=100,
    max_temp_f=212,
    usda_safe=True,
    is_meater_recommended=True,
    start_hex="#228B22",
    end_hex="#32CD32",
)

VEG_CRISP_TENDER = TemperatureRange(
    id=701,
    name="crisp_tender",
    description="Slightly firm with some bite",
    target_temp_c=85,
    target_temp_f=185,
    min_temp_c=80,
    min_temp_f=175,
    max_temp_c=90,
    max_temp_f=195,
    usda_safe=True,
    start_hex="#32CD32",
    end_hex="#90EE90",
)

VEG_CARAMELIZED = TemperatureRange(
    id=702,
    name="caramelized",
    description="Golden brown, enhanced sweetness",
    target_temp_c=160,
    target_temp_f=320,
    min_temp_c=150,
    min_temp_f=300,
    max_temp_c=175,
    max_temp_f=350,
    usda_safe=True,
    start_hex="#DAA520",
    end_hex="#FFD700",
)

VEG_CHARRED = TemperatureRange(
    id=703,
    name="charred",
    description="Charred exterior with smoky flavor",
    target_temp_c=200,
    target_temp_f=390,
    min_temp_c=175,
    min_temp_f=350,
    max_temp_c=230,
    max_temp_f=450,
    usda_safe=True,
    start_hex="#696969",
    end_hex="#2F4F4F",
)

ROOT_VEGETABLES = [
    MeatCut(
        id=700,
        name="baked_potato",
        name_long="Baked Potato",
        cut_order=1,
        estimated_thickness_mm=80,
        rest_time_min=0,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[VEG_TENDER],
        supported_methods=[
            CookingMethod.OVEN_BAKE,
            CookingMethod.AIR_FRYER,
        ],
    ),
    MeatCut(
        id=701,
        name="roasted_potatoes",
        name_long="Roasted Potatoes",
        cut_order=2,
        estimated_thickness_mm=30,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.AIR_FRYER,
        ],
    ),
    MeatCut(
        id=702,
        name="roasted_carrots",
        name_long="Roasted Carrots",
        cut_order=3,
        estimated_thickness_mm=20,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.AIR_FRYER,
            CookingMethod.SAUTE,
        ],
    ),
    MeatCut(
        id=703,
        name="roasted_parsnips",
        name_long="Roasted Parsnips",
        cut_order=4,
        estimated_thickness_mm=20,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.AIR_FRYER,
        ],
    ),
    MeatCut(
        id=704,
        name="roasted_beets",
        name_long="Roasted Beets",
        cut_order=5,
        estimated_thickness_mm=60,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[VEG_TENDER],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
        ],
    ),
    MeatCut(
        id=705,
        name="roasted_sweet_potato",
        name_long="Roasted Sweet Potato",
        cut_order=6,
        estimated_thickness_mm=60,
        rest_time_min=0,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.OVEN_BAKE,
            CookingMethod.AIR_FRYER,
        ],
    ),
]

GREEN_VEGETABLES = [
    MeatCut(
        id=710,
        name="broccoli",
        name_long="Broccoli",
        cut_order=1,
        estimated_thickness_mm=40,
        rest_time_min=0,
        rest_time_max=1,
        carryover_temp_c=1,
        temperature_ranges=[VEG_CRISP_TENDER, VEG_TENDER],
        supported_methods=[
            CookingMethod.STEAM,
            CookingMethod.OVEN_ROAST,
            CookingMethod.AIR_FRYER,
            CookingMethod.SAUTE,
        ],
    ),
    MeatCut(
        id=711,
        name="brussels_sprouts",
        name_long="Brussels Sprouts",
        cut_order=2,
        estimated_thickness_mm=30,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.AIR_FRYER,
            CookingMethod.SAUTE,
            CookingMethod.PAN_FRY,
        ],
    ),
    MeatCut(
        id=712,
        name="asparagus",
        name_long="Asparagus",
        cut_order=3,
        estimated_thickness_mm=12,
        rest_time_min=0,
        rest_time_max=1,
        carryover_temp_c=1,
        temperature_ranges=[VEG_CRISP_TENDER, VEG_TENDER],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.SAUTE,
            CookingMethod.STEAM,
            CookingMethod.GRILL,
        ],
    ),
    MeatCut(
        id=713,
        name="green_beans",
        name_long="Green Beans",
        cut_order=4,
        estimated_thickness_mm=8,
        rest_time_min=0,
        rest_time_max=1,
        carryover_temp_c=1,
        temperature_ranges=[VEG_CRISP_TENDER, VEG_TENDER],
        supported_methods=[
            CookingMethod.STEAM,
            CookingMethod.SAUTE,
            CookingMethod.BOIL,
            CookingMethod.OVEN_ROAST,
        ],
    ),
    MeatCut(
        id=714,
        name="spinach",
        name_long="Spinach",
        cut_order=5,
        estimated_thickness_mm=5,
        rest_time_min=0,
        rest_time_max=0,
        carryover_temp_c=0,
        temperature_ranges=[VEG_TENDER],
        supported_methods=[
            CookingMethod.SAUTE,
            CookingMethod.STEAM,
        ],
    ),
]

ALLIUM_VEGETABLES = [
    MeatCut(
        id=720,
        name="roasted_onion",
        name_long="Roasted Onion",
        cut_order=1,
        estimated_thickness_mm=50,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.SAUTE,
            CookingMethod.GRILL,
        ],
    ),
    MeatCut(
        id=721,
        name="caramelized_onions",
        name_long="Caramelized Onions",
        cut_order=2,
        estimated_thickness_mm=5,
        rest_time_min=0,
        rest_time_max=0,
        carryover_temp_c=0,
        temperature_ranges=[VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.SAUTE,
            CookingMethod.PAN_FRY,
        ],
    ),
    MeatCut(
        id=722,
        name="roasted_garlic",
        name_long="Roasted Garlic",
        cut_order=3,
        estimated_thickness_mm=30,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=2,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
        ],
    ),
    MeatCut(
        id=723,
        name="leeks",
        name_long="Leeks",
        cut_order=4,
        estimated_thickness_mm=20,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.BRAISE,
            CookingMethod.SAUTE,
            CookingMethod.OVEN_ROAST,
        ],
    ),
]

SQUASH_VEGETABLES = [
    MeatCut(
        id=730,
        name="zucchini",
        name_long="Zucchini",
        cut_order=1,
        estimated_thickness_mm=25,
        rest_time_min=0,
        rest_time_max=1,
        carryover_temp_c=1,
        temperature_ranges=[VEG_CRISP_TENDER, VEG_TENDER],
        supported_methods=[
            CookingMethod.SAUTE,
            CookingMethod.OVEN_ROAST,
            CookingMethod.AIR_FRYER,
            CookingMethod.GRILL,
        ],
    ),
    MeatCut(
        id=731,
        name="butternut_squash",
        name_long="Butternut Squash",
        cut_order=2,
        estimated_thickness_mm=40,
        rest_time_min=0,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.STEAM,
            CookingMethod.PRESSURE_COOKER,
        ],
    ),
    MeatCut(
        id=732,
        name="acorn_squash",
        name_long="Acorn Squash",
        cut_order=3,
        estimated_thickness_mm=50,
        rest_time_min=0,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=[VEG_TENDER],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.OVEN_BAKE,
        ],
    ),
    MeatCut(
        id=733,
        name="spaghetti_squash",
        name_long="Spaghetti Squash",
        cut_order=4,
        estimated_thickness_mm=100,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[VEG_TENDER],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.OVEN_BAKE,
        ],
    ),
]

CRUCIFEROUS_VEGETABLES = [
    MeatCut(
        id=740,
        name="cauliflower",
        name_long="Cauliflower",
        cut_order=1,
        estimated_thickness_mm=50,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.AIR_FRYER,
            CookingMethod.STEAM,
            CookingMethod.SAUTE,
        ],
    ),
    MeatCut(
        id=741,
        name="cabbage",
        name_long="Cabbage",
        cut_order=2,
        estimated_thickness_mm=30,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=[VEG_CRISP_TENDER, VEG_TENDER],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.BRAISE,
            CookingMethod.SAUTE,
        ],
    ),
]

PEPPER_VEGETABLES = [
    MeatCut(
        id=750,
        name="bell_peppers",
        name_long="Bell Peppers",
        cut_order=1,
        estimated_thickness_mm=8,
        rest_time_min=0,
        rest_time_max=1,
        carryover_temp_c=1,
        temperature_ranges=[VEG_CRISP_TENDER, VEG_CHARRED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.SAUTE,
            CookingMethod.GRILL,
            CookingMethod.AIR_FRYER,
        ],
    ),
]

MUSHROOMS = [
    MeatCut(
        id=760,
        name="button_mushrooms",
        name_long="Button/Cremini Mushrooms",
        cut_order=1,
        estimated_thickness_mm=20,
        rest_time_min=0,
        rest_time_max=1,
        carryover_temp_c=1,
        temperature_ranges=[VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.SAUTE,
            CookingMethod.OVEN_ROAST,
            CookingMethod.GRILL,
        ],
    ),
    MeatCut(
        id=761,
        name="portobello_mushrooms",
        name_long="Portobello Mushrooms",
        cut_order=2,
        estimated_thickness_mm=40,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.GRILL,
            CookingMethod.SAUTE,
            CookingMethod.AIR_FRYER,
        ],
    ),
]

CORN = [
    MeatCut(
        id=770,
        name="corn_on_cob",
        name_long="Corn on the Cob",
        cut_order=1,
        estimated_thickness_mm=50,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=[VEG_TENDER, VEG_CHARRED],
        supported_methods=[
            CookingMethod.BOIL,
            CookingMethod.STEAM,
            CookingMethod.GRILL,
            CookingMethod.OVEN_ROAST,
        ],
    ),
]

EGGPLANT = [
    MeatCut(
        id=780,
        name="eggplant",
        name_long="Eggplant / Aubergine",
        cut_order=1,
        estimated_thickness_mm=30,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=[VEG_TENDER, VEG_CHARRED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.GRILL,
            CookingMethod.AIR_FRYER,
            CookingMethod.PAN_FRY,
        ],
    ),
]

TOMATOES = [
    MeatCut(
        id=790,
        name="roasted_tomatoes",
        name_long="Roasted Tomatoes",
        cut_order=1,
        estimated_thickness_mm=40,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=[VEG_TENDER, VEG_CARAMELIZED],
        supported_methods=[
            CookingMethod.OVEN_ROAST,
            CookingMethod.OVEN_BROIL,
        ],
    ),
]


# ============================================================================
# ASSEMBLE FULL DATA STRUCTURE
# ============================================================================

MEAT_CATEGORIES = [
    MeatCategory(
        id=1,
        name="beef",
        color_hex="#8B0000",
        meats=[
            Meat(
                id=10,
                name="cow",
                description="Beef cuts from cattle",
                cut_types=[
                    CutType(id=100, name="Steaks", cuts=BEEF_STEAKS),
                    CutType(id=101, name="Roasts", cuts=BEEF_ROASTS),
                    CutType(id=102, name="Braising Cuts", cuts=BEEF_BRAISING),
                    CutType(id=103, name="Ground", cuts=BEEF_GROUND),
                    CutType(id=104, name="Other / Offal", cuts=BEEF_OFFAL),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=2,
        name="pork",
        color_hex="#FFB6C1",
        meats=[
            Meat(
                id=20,
                name="pig",
                description="Pork cuts from pig",
                cut_types=[
                    CutType(id=200, name="Chops & Tenderloin", cuts=PORK_CHOPS),
                    CutType(id=201, name="Roasts", cuts=PORK_ROASTS),
                    CutType(id=202, name="Ribs", cuts=PORK_RIBS),
                    CutType(id=203, name="Ham", cuts=PORK_HAM),
                    CutType(id=204, name="Ground", cuts=PORK_GROUND),
                    CutType(id=205, name="Other / Offal", cuts=PORK_OFFAL),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=3,
        name="poultry",
        color_hex="#FFD700",
        meats=[
            Meat(
                id=30,
                name="chicken",
                description="Chicken cuts",
                cut_types=[
                    CutType(id=300, name="Whole", cuts=CHICKEN_WHOLE),
                    CutType(id=301, name="Breast", cuts=CHICKEN_BREAST),
                    CutType(id=302, name="Dark Meat", cuts=CHICKEN_DARK_MEAT),
                ],
            ),
            Meat(
                id=31,
                name="turkey",
                description="Turkey cuts",
                cut_types=[
                    CutType(id=310, name="Turkey", cuts=TURKEY),
                ],
            ),
            Meat(
                id=32,
                name="duck",
                description="Duck cuts",
                cut_types=[
                    CutType(id=320, name="Duck", cuts=DUCK),
                ],
            ),
            Meat(
                id=34,
                name="goose",
                description="Goose cuts",
                cut_types=[
                    CutType(id=345, name="Goose", cuts=GOOSE),
                ],
            ),
            Meat(
                id=33,
                name="ground_poultry",
                description="Ground poultry",
                cut_types=[
                    CutType(id=330, name="Ground", cuts=GROUND_POULTRY),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=4,
        name="fish",
        color_hex="#4682B4",
        meats=[
            Meat(
                id=40,
                name="salmon",
                description="Salmon cuts",
                cut_types=[
                    CutType(id=400, name="Salmon", cuts=SALMON),
                ],
            ),
            Meat(
                id=41,
                name="tuna",
                description="Tuna cuts",
                cut_types=[
                    CutType(id=410, name="Tuna", cuts=TUNA),
                ],
            ),
            Meat(
                id=42,
                name="white_fish",
                description="White fish varieties",
                cut_types=[
                    CutType(id=420, name="White Fish", cuts=WHITE_FISH),
                ],
            ),
            Meat(
                id=43,
                name="shellfish",
                description="Shellfish and crustaceans",
                cut_types=[
                    CutType(id=430, name="Shellfish", cuts=SHELLFISH),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=5,
        name="lamb",
        color_hex="#800020",
        meats=[
            Meat(
                id=50,
                name="lamb",
                description="Lamb cuts",
                cut_types=[
                    CutType(id=500, name="Roasts", cuts=LAMB_ROASTS + LAMB_ROASTS_ADDITIONAL),
                    CutType(id=501, name="Chops", cuts=LAMB_CHOPS),
                    CutType(id=502, name="Ground", cuts=LAMB_GROUND),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=6,
        name="game",
        color_hex="#2F4F4F",
        meats=[
            Meat(
                id=60,
                name="venison",
                description="Venison (deer) cuts",
                cut_types=[
                    CutType(id=600, name="Venison", cuts=VENISON),
                ],
            ),
            Meat(
                id=61,
                name="wild_boar",
                description="Wild boar cuts",
                cut_types=[
                    CutType(id=610, name="Wild Boar", cuts=WILD_BOAR),
                ],
            ),
            Meat(
                id=62,
                name="bison",
                description="Bison / Buffalo cuts",
                cut_types=[
                    CutType(id=620, name="Bison", cuts=BISON),
                ],
            ),
            # Additional game meats from MEATER app reference (2025)
            Meat(
                id=63,
                name="reindeer",
                description="Reindeer cuts",
                cut_types=[
                    CutType(id=630, name="Reindeer", cuts=REINDEER),
                ],
            ),
            Meat(
                id=64,
                name="moose",
                description="Moose cuts",
                cut_types=[
                    CutType(id=640, name="Moose", cuts=MOOSE),
                ],
            ),
            Meat(
                id=65,
                name="buffalo",
                description="Buffalo (water buffalo) cuts",
                cut_types=[
                    CutType(id=650, name="Buffalo", cuts=BUFFALO),
                ],
            ),
            Meat(
                id=66,
                name="ostrich",
                description="Ostrich cuts",
                cut_types=[
                    CutType(id=660, name="Ostrich", cuts=OSTRICH),
                ],
            ),
            Meat(
                id=67,
                name="mutton",
                description="Mutton (mature sheep) cuts",
                cut_types=[
                    CutType(id=670, name="Mutton", cuts=MUTTON),
                ],
            ),
            Meat(
                id=68,
                name="kangaroo",
                description="Kangaroo cuts",
                cut_types=[
                    CutType(id=680, name="Kangaroo", cuts=KANGAROO),
                ],
            ),
            Meat(
                id=69,
                name="goat",
                description="Goat cuts",
                cut_types=[
                    CutType(id=690, name="Goat", cuts=GOAT),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=7,
        name="vegetables",
        color_hex="#228B22",
        meats=[
            Meat(
                id=70,
                name="root_vegetables",
                description="Root vegetables like potatoes, carrots, beets",
                cut_types=[
                    CutType(id=700, name="Root Vegetables", cuts=ROOT_VEGETABLES),
                ],
            ),
            Meat(
                id=71,
                name="green_vegetables",
                description="Green vegetables like broccoli, asparagus, beans",
                cut_types=[
                    CutType(id=710, name="Green Vegetables", cuts=GREEN_VEGETABLES),
                ],
            ),
            Meat(
                id=72,
                name="alliums",
                description="Onions, garlic, leeks",
                cut_types=[
                    CutType(id=720, name="Alliums", cuts=ALLIUM_VEGETABLES),
                ],
            ),
            Meat(
                id=73,
                name="squash",
                description="Zucchini, butternut squash, and other squash",
                cut_types=[
                    CutType(id=730, name="Squash", cuts=SQUASH_VEGETABLES),
                ],
            ),
            Meat(
                id=74,
                name="cruciferous",
                description="Cauliflower, cabbage, and related vegetables",
                cut_types=[
                    CutType(id=740, name="Cruciferous", cuts=CRUCIFEROUS_VEGETABLES),
                ],
            ),
            Meat(
                id=75,
                name="peppers",
                description="Bell peppers and other peppers",
                cut_types=[
                    CutType(id=750, name="Peppers", cuts=PEPPER_VEGETABLES),
                ],
            ),
            Meat(
                id=76,
                name="mushrooms",
                description="Various mushroom varieties",
                cut_types=[
                    CutType(id=760, name="Mushrooms", cuts=MUSHROOMS),
                ],
            ),
            Meat(
                id=77,
                name="corn",
                description="Corn on the cob and corn dishes",
                cut_types=[
                    CutType(id=770, name="Corn", cuts=CORN),
                ],
            ),
            Meat(
                id=78,
                name="eggplant",
                description="Eggplant / Aubergine",
                cut_types=[
                    CutType(id=780, name="Eggplant", cuts=EGGPLANT),
                ],
            ),
            Meat(
                id=79,
                name="tomatoes",
                description="Roasted and cooked tomatoes",
                cut_types=[
                    CutType(id=790, name="Tomatoes", cuts=TOMATOES),
                ],
            ),
        ],
    ),
]


def get_all_categories() -> list[MeatCategory]:
    """Return all meat categories."""
    return MEAT_CATEGORIES


def get_category_by_name(name: str) -> MeatCategory | None:
    """Get a category by its name."""
    for category in MEAT_CATEGORIES:
        if category.name.lower() == name.lower():
            return category
    return None


def get_cut_by_id(cut_id: int) -> MeatCut | None:
    """Get a cut by its ID."""
    for category in MEAT_CATEGORIES:
        for meat in category.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    if cut.id == cut_id:
                        return cut
    return None


def get_cut_by_name(name: str) -> MeatCut | None:
    """Get a cut by its internal name."""
    for category in MEAT_CATEGORIES:
        for meat in category.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    if cut.name.lower() == name.lower():
                        return cut
    return None


def get_doneness_for_cut(cut: MeatCut, doneness_name: str) -> TemperatureRange | None:
    """Get a specific doneness level for a cut."""
    for temp_range in cut.temperature_ranges:
        if temp_range.name.lower() == doneness_name.lower():
            return temp_range
    return None


def get_recommended_doneness(cut: MeatCut) -> TemperatureRange | None:
    """Get the MEATER-recommended doneness for a cut."""
    for temp_range in cut.temperature_ranges:
        if temp_range.is_meater_recommended:
            return temp_range
    # Fall back to first range if no recommendation
    if cut.temperature_ranges:
        return cut.temperature_ranges[0]
    return None


def search_cuts(query: str) -> list[MeatCut]:
    """Search for cuts by name."""
    query_lower = query.lower()
    results = []
    for category in MEAT_CATEGORIES:
        for meat in category.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    if (
                        query_lower in cut.name.lower()
                        or query_lower in cut.name_long.lower()
                    ):
                        results.append(cut)
    return results
