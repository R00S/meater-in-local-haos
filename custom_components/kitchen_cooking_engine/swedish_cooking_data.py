"""
Swedish cooking data for Kitchen Cooking Engine.

Last Updated: 1 Dec 2025, 17:00 CET
Last Change: Initial creation with Swedish cut names and temperatures

This module contains comprehensive Swedish cooking data including proteins, cuts,
doneness levels, and target temperatures based on Swedish sources.

DATA SOURCES (Swedish):
- Stekguiden.se - Aggregated data from Livsmedelsverket, Svenskt Kött
- Gårdssällskapet - Cut-heavy Swedish butcher style data
- Scan Köttguiden - Detailed cut and temperature guide
- ICA.se - Temperature & innertemperatur guide
- Köket.se - "Vilken temperatur ska köttet ha?"
- Livsmedelsverket (Swedish Food Agency) - Official food safety guidelines
- Mathem - Innertemperaturer för kött, fågel och fisk
- Innertemperatur.nu / Perfekttemp.se - Swedish temp guides
- Professional Secrets - Swedish pro-chefs' guide

STRUCTURE:
The Swedish data uses the same structure as the main cooking_data.py but with:
- Swedish cut names (name_sv field)
- Temperature recommendations from Swedish sources
- Swedish doneness level names (blodig, medium, genomstekt, etc.)
"""

from dataclasses import dataclass, field
from typing import Optional

from .cooking_data import (
    TemperatureRange,
    MeatCut,
    CutType,
    Meat,
    MeatCategory,
    CookingMethod,
)


# ============================================================================
# SWEDISH DONENESS LEVELS
# ============================================================================

# Swedish doneness terminology:
# - Blodig (Rare) = Cool red center
# - Medium-Rare = Warm red center (sometimes called "rosa")
# - Medium = Warm pink center
# - Medium-Well = Slightly pink
# - Genomstekt (Well Done) = No pink

# Swedish beef doneness levels based on Stekguiden.se, Gårdssällskapet
SWEDISH_DONENESS_RARE = TemperatureRange(
    id=1001,
    name="blodig",
    description="Blodig - Sval röd kärna",
    target_temp_c=50,
    target_temp_f=122,
    min_temp_c=48,
    min_temp_f=118,
    max_temp_c=52,
    max_temp_f=126,
    usda_safe=False,
    is_meater_recommended=False,
    start_hex="#FF0000",
    end_hex="#FF3333",
)

SWEDISH_DONENESS_MEDIUM_RARE = TemperatureRange(
    id=1002,
    name="medium_rare",
    description="Medium Rare - Rosa kärna",
    target_temp_c=54,
    target_temp_f=129,
    min_temp_c=52,
    min_temp_f=126,
    max_temp_c=56,
    max_temp_f=133,
    usda_safe=False,
    is_meater_recommended=True,
    start_hex="#FF3333",
    end_hex="#FF6666",
)

SWEDISH_DONENESS_MEDIUM = TemperatureRange(
    id=1003,
    name="medium",
    description="Medium - Varm rosa kärna",
    target_temp_c=58,
    target_temp_f=136,
    min_temp_c=56,
    min_temp_f=133,
    max_temp_c=62,
    max_temp_f=144,
    usda_safe=False,
    start_hex="#FF6666",
    end_hex="#FF9999",
)

SWEDISH_DONENESS_MEDIUM_WELL = TemperatureRange(
    id=1004,
    name="medium_well",
    description="Medium Well - Nästan genomstekt",
    target_temp_c=64,
    target_temp_f=147,
    min_temp_c=62,
    min_temp_f=144,
    max_temp_c=68,
    max_temp_f=154,
    usda_safe=True,
    start_hex="#FF9999",
    end_hex="#FFCCCC",
)

SWEDISH_DONENESS_WELL_DONE = TemperatureRange(
    id=1005,
    name="genomstekt",
    description="Genomstekt - Ingen rosa färg",
    target_temp_c=70,
    target_temp_f=158,
    min_temp_c=68,
    min_temp_f=154,
    max_temp_c=74,
    max_temp_f=165,
    usda_safe=True,
    start_hex="#FFCCCC",
    end_hex="#FFFFFF",
)

# Pulled/Braised - långkokt för kollagenbrytning
SWEDISH_DONENESS_PULLED = TemperatureRange(
    id=1006,
    name="långkokt",
    description="Långkokt - Strimlningsbart",
    target_temp_c=92,
    target_temp_f=198,
    min_temp_c=88,
    min_temp_f=190,
    max_temp_c=95,
    max_temp_f=203,
    usda_safe=True,
    start_hex="#8B4513",
    end_hex="#A0522D",
)

# Pork Swedish temperatures (per Livsmedelsverket)
SWEDISH_PORK_MEDIUM = TemperatureRange(
    id=1010,
    name="medium",
    description="Medium - Saftigt med lite rosa",
    target_temp_c=63,
    target_temp_f=145,
    min_temp_c=60,
    min_temp_f=140,
    max_temp_c=66,
    max_temp_f=151,
    usda_safe=True,
    is_meater_recommended=True,
    start_hex="#FFB6C1",
    end_hex="#FFC0CB",
)

SWEDISH_PORK_WELL_DONE = TemperatureRange(
    id=1011,
    name="genomstekt",
    description="Genomstekt - Ingen rosa färg",
    target_temp_c=70,
    target_temp_f=158,
    min_temp_c=68,
    min_temp_f=154,
    max_temp_c=74,
    max_temp_f=165,
    usda_safe=True,
    start_hex="#FFC0CB",
    end_hex="#FFFFFF",
)

# Poultry Swedish (must be cooked through per Livsmedelsverket)
SWEDISH_POULTRY_SAFE = TemperatureRange(
    id=1020,
    name="genomstekt",
    description="Genomstekt - Säker att äta",
    target_temp_c=72,
    target_temp_f=162,
    min_temp_c=72,
    min_temp_f=162,
    max_temp_c=76,
    max_temp_f=169,
    usda_safe=True,
    is_meater_recommended=True,
    start_hex="#FFFACD",
    end_hex="#FFFFFF",
)

# Fish Swedish temperatures (per Livsmedelsverket)
SWEDISH_FISH_MEDIUM = TemperatureRange(
    id=1030,
    name="medium",
    description="Medium - Genomskinlig i mitten",
    target_temp_c=52,
    target_temp_f=126,
    min_temp_c=50,
    min_temp_f=122,
    max_temp_c=56,
    max_temp_f=133,
    usda_safe=False,
    is_meater_recommended=True,
    start_hex="#FA8072",
    end_hex="#E9967A",
)

SWEDISH_FISH_WELL_DONE = TemperatureRange(
    id=1031,
    name="genomstekt",
    description="Genomstekt - Helt igenom",
    target_temp_c=60,
    target_temp_f=140,
    min_temp_c=58,
    min_temp_f=136,
    max_temp_c=63,
    max_temp_f=145,
    usda_safe=True,
    start_hex="#E9967A",
    end_hex="#FFFFFF",
)

# Game (Vilt) Swedish temperatures
SWEDISH_GAME_RARE = TemperatureRange(
    id=1040,
    name="blodig",
    description="Blodig - Röd kärna",
    target_temp_c=52,
    target_temp_f=126,
    min_temp_c=50,
    min_temp_f=122,
    max_temp_c=55,
    max_temp_f=131,
    usda_safe=False,
    start_hex="#8B0000",
    end_hex="#B22222",
)

SWEDISH_GAME_MEDIUM = TemperatureRange(
    id=1041,
    name="medium",
    description="Medium - Rosa kärna",
    target_temp_c=58,
    target_temp_f=136,
    min_temp_c=55,
    min_temp_f=131,
    max_temp_c=62,
    max_temp_f=144,
    usda_safe=False,
    is_meater_recommended=True,
    start_hex="#B22222",
    end_hex="#CD5C5C",
)


# ============================================================================
# SWEDISH BEEF (NÖTKÖTT)
# ============================================================================

# Swedish beef cuts from Stekguiden.se, Gårdssällskapet, Scan Köttguiden
SWEDISH_BEEF_STEAKS = [
    MeatCut(
        id=2100,
        name="entrecote",
        name_long="Entrecôte",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
        supported_methods=[
            CookingMethod.PAN_SEAR,
            CookingMethod.PAN_FRY,
            CookingMethod.GRILL,
        ],
    ),
    MeatCut(
        id=2101,
        name="ryggbiff",
        name_long="Ryggbiff",
        cut_order=2,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2102,
        name="oxfile",
        name_long="Oxfilé",
        cut_order=3,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2103,
        name="flankstek",
        name_long="Flankstek",
        cut_order=4,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=2,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=2104,
        name="flatiron",
        name_long="Flat Iron",
        cut_order=5,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=2,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2105,
        name="flapsteak",
        name_long="Flapsteak (Bavette)",
        cut_order=6,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=2,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=2106,
        name="tomahawk",
        name_long="Tomahawk",
        cut_order=7,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2107,
        name="picanha",
        name_long="Picanha",
        cut_order=8,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2108,
        name="njurtapp",
        name_long="Njurtapp",
        cut_order=9,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
        ],
    ),
    MeatCut(
        id=2109,
        name="hanger_steak",
        name_long="Hanger Steak (Onglet)",
        cut_order=10,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
        ],
    ),
]

SWEDISH_BEEF_ROASTS = [
    MeatCut(
        id=2120,
        name="rostbiff",
        name_long="Rostbiff",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[
            SWEDISH_DONENESS_RARE,
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2121,
        name="innanlaar",
        name_long="Innanlår",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2122,
        name="ytterlaar",
        name_long="Ytterlår",
        cut_order=3,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2123,
        name="fransyska",
        name_long="Fransyska",
        cut_order=4,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=[
            SWEDISH_DONENESS_MEDIUM_RARE,
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
    MeatCut(
        id=2124,
        name="rulle",
        name_long="Nötrulle",
        cut_order=5,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[
            SWEDISH_DONENESS_MEDIUM,
            SWEDISH_DONENESS_MEDIUM_WELL,
            SWEDISH_DONENESS_WELL_DONE,
        ],
    ),
]

SWEDISH_BEEF_BRAISING = [
    MeatCut(
        id=2130,
        name="hogrev",
        name_long="Högrev",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=3,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
    MeatCut(
        id=2131,
        name="bringa",
        name_long="Bringa (Brisket)",
        cut_order=2,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=30,
        rest_time_max=60,
        carryover_temp_c=5,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
    MeatCut(
        id=2132,
        name="bog",
        name_long="Bog",
        cut_order=3,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
    MeatCut(
        id=2133,
        name="oxsvans",
        name_long="Oxsvans",
        cut_order=4,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=3,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
    MeatCut(
        id=2134,
        name="lagg",
        name_long="Lägg",
        cut_order=5,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=3,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
    MeatCut(
        id=2135,
        name="oxkind",
        name_long="Oxkind",
        cut_order=6,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=3,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
    MeatCut(
        id=2136,
        name="margpipa",
        name_long="Märgpipa",
        cut_order=7,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=3,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
]


# ============================================================================
# SWEDISH PORK (FLÄSK)
# ============================================================================

# Skiva/Kotlett - sliced pork cuts
SWEDISH_PORK_STEAKS = [
    MeatCut(
        id=2200,
        name="flaskkotlett_med_ben",
        name_long="Fläskkotlett med ben",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2204,
        name="flaskkotlett_utan_ben",
        name_long="Fläskkotlett utan ben",
        cut_order=2,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2205,
        name="flaskfileskiva",
        name_long="Fläskfiléskiva",
        cut_order=3,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=2,
        rest_time_max=4,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2202,
        name="karrekoteletter",
        name_long="Karrékoteletter",
        cut_order=4,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2203,
        name="secreto",
        name_long="Secreto (Ibérico)",
        cut_order=5,
        estimated_thickness_mm=20,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
]

# Helstekt - whole roasted pork cuts
SWEDISH_PORK_ROASTS = [
    MeatCut(
        id=2201,
        name="flaskfile",
        name_long="Fläskfilé",
        cut_order=1,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2215,
        name="flaskytterfile",
        name_long="Fläskytterfilé",
        cut_order=2,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2216,
        name="flaskkotlett_med_ben_helstekt",
        name_long="Fläskkotlett med ben",
        cut_order=3,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2217,
        name="flaskkotlett_utan_ben_helstekt",
        name_long="Fläskkotlett utan ben",
        cut_order=4,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2210,
        name="flasksida",
        name_long="Fläsksida",
        cut_order=5,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2211,
        name="flaskkarre",
        name_long="Fläskkarré",
        cut_order=6,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2212,
        name="skinka",
        name_long="Skinka",
        cut_order=7,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=[SWEDISH_PORK_MEDIUM, SWEDISH_PORK_WELL_DONE],
    ),
    MeatCut(
        id=2213,
        name="julskinka",
        name_long="Julskinka (kokt)",
        cut_order=4,
        estimated_thickness_mm=100,
        usda_safe_c=70,
        usda_safe_f=158,
        rest_time_min=30,
        rest_time_max=60,
        carryover_temp_c=5,
        temperature_ranges=[SWEDISH_PORK_WELL_DONE],
    ),
    MeatCut(
        id=2214,
        name="flaskbog",
        name_long="Fläskbog",
        cut_order=5,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=20,
        rest_time_max=45,
        carryover_temp_c=5,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
]

SWEDISH_PORK_RIBS = [
    MeatCut(
        id=2220,
        name="revbensspjall",
        name_long="Revbensspjäll",
        cut_order=1,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=3,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
    MeatCut(
        id=2221,
        name="sidflaask_revben",
        name_long="Sidfläsk med revben",
        cut_order=2,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=3,
        temperature_ranges=[SWEDISH_DONENESS_PULLED],
    ),
]


# ============================================================================
# SWEDISH VEAL (KALV)
# Based on Stekguiden.se temperatures for kalv
# ============================================================================

# All Swedish doneness levels available for user preference
SWEDISH_FULL_DONENESS = [
    SWEDISH_DONENESS_RARE,
    SWEDISH_DONENESS_MEDIUM_RARE,
    SWEDISH_DONENESS_MEDIUM,
    SWEDISH_DONENESS_MEDIUM_WELL,
    SWEDISH_DONENESS_WELL_DONE,
    SWEDISH_DONENESS_PULLED,
]

SWEDISH_VEAL_ROASTS = [
    MeatCut(
        id=2700,
        name="kalvstek",
        name_long="Kalvstek",
        cut_order=1,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2701,
        name="kalvfile",
        name_long="Kalvfilé",
        cut_order=2,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium_rare",
    ),
    MeatCut(
        id=2702,
        name="kalvfransyska",
        name_long="Kalvfransyska",
        cut_order=3,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2703,
        name="kalvrostbiff",
        name_long="Kalvrostbiff",
        cut_order=4,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
]

SWEDISH_VEAL_CHOPS = [
    MeatCut(
        id=2710,
        name="kalvkotlett",
        name_long="Kalvkotlett",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2711,
        name="kalvschnitzel",
        name_long="Kalvschnitzel",
        cut_order=2,
        estimated_thickness_mm=10,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=1,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2712,
        name="kalvlever",
        name_long="Kalvlever",
        cut_order=3,
        estimated_thickness_mm=15,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=1,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
]

SWEDISH_VEAL_BRAISING = [
    MeatCut(
        id=2720,
        name="kalvbog",
        name_long="Kalvbog",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="långkokt",
    ),
    MeatCut(
        id=2721,
        name="kalvlagg",
        name_long="Kalvlägg",
        cut_order=2,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="långkokt",
    ),
    MeatCut(
        id=2722,
        name="kalvbringa",
        name_long="Kalvbringa",
        cut_order=3,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=30,
        rest_time_max=60,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="långkokt",
    ),
]


# ============================================================================
# SWEDISH LAMB (LAMM)
# ============================================================================

SWEDISH_LAMB_ROASTS = [
    MeatCut(
        id=2500,
        name="lammstek",
        name_long="Lammstek",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium_rare",
    ),
    MeatCut(
        id=2501,
        name="lammrack",
        name_long="Lammrack",
        cut_order=2,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium_rare",
    ),
    MeatCut(
        id=2502,
        name="lammbog",
        name_long="Lammbog",
        cut_order=3,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="långkokt",
    ),
    MeatCut(
        id=2503,
        name="lammsadel",
        name_long="Lammsadel",
        cut_order=4,
        estimated_thickness_mm=60,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium_rare",
    ),
]

SWEDISH_LAMB_CHOPS = [
    MeatCut(
        id=2510,
        name="lammkotletter",
        name_long="Lammkotletter",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium_rare",
    ),
    MeatCut(
        id=2511,
        name="lammhalsfile",
        name_long="Lammhalsfilé",
        cut_order=2,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium_rare",
    ),
]


# ============================================================================
# SWEDISH GAME (VILT)
# ============================================================================

SWEDISH_VENISON = [
    MeatCut(
        id=2600,
        name="hjortfile",
        name_long="Hjortfilé",
        cut_order=1,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2601,
        name="hjortstek",
        name_long="Hjortstek",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2602,
        name="radjursfile",
        name_long="Rådjursfilé",
        cut_order=3,
        estimated_thickness_mm=30,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2603,
        name="radjursstek",
        name_long="Rådjursstek",
        cut_order=4,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
]

SWEDISH_MOOSE = [
    MeatCut(
        id=2610,
        name="algfile",
        name_long="Älgfilé",
        cut_order=1,
        estimated_thickness_mm=50,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2611,
        name="algstek",
        name_long="Älgstek",
        cut_order=2,
        estimated_thickness_mm=100,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=8,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2612,
        name="algfarsbiff",
        name_long="Älgfärsbiff",
        cut_order=3,
        estimated_thickness_mm=20,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=2,
        rest_time_max=5,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="genomstekt",
    ),
]

SWEDISH_REINDEER = [
    MeatCut(
        id=2620,
        name="renfile",
        name_long="Renfilé",
        cut_order=1,
        estimated_thickness_mm=40,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2621,
        name="renstek",
        name_long="Renstek",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=63,
        usda_safe_f=145,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium",
    ),
]

SWEDISH_WILD_BOAR = [
    MeatCut(
        id=2630,
        name="vildsvinsfile",
        name_long="Vildsvinsfil",
        cut_order=1,
        estimated_thickness_mm=40,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2631,
        name="vildsvinsstek",
        name_long="Vildsvinsstek",
        cut_order=2,
        estimated_thickness_mm=100,
        usda_safe_c=71,
        usda_safe_f=160,
        rest_time_min=15,
        rest_time_max=30,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="långkokt",
    ),
]


# ============================================================================
# SWEDISH POULTRY (FÅGEL)
# ============================================================================

# Poultry with full range (including genomstekt and långkokt for pulled)
SWEDISH_POULTRY_FULL = [
    SWEDISH_DONENESS_MEDIUM,
    SWEDISH_POULTRY_SAFE,
    SWEDISH_DONENESS_PULLED,
]

SWEDISH_CHICKEN = [
    MeatCut(
        id=2300,
        name="hel_kyckling",
        name_long="Hel kyckling",
        cut_order=1,
        estimated_thickness_mm=100,
        usda_safe_c=72,
        usda_safe_f=162,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_POULTRY_FULL,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2301,
        name="kycklingbrost",
        name_long="Kycklingbröst",
        cut_order=2,
        estimated_thickness_mm=30,
        usda_safe_c=72,
        usda_safe_f=162,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_POULTRY_FULL,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2302,
        name="kycklinglar",
        name_long="Kycklingleår",
        cut_order=3,
        estimated_thickness_mm=35,
        usda_safe_c=72,
        usda_safe_f=162,
        rest_time_min=3,
        rest_time_max=5,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_POULTRY_FULL,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2303,
        name="kycklingvingar",
        name_long="Kycklingvingar",
        cut_order=4,
        estimated_thickness_mm=20,
        usda_safe_c=72,
        usda_safe_f=162,
        rest_time_min=2,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_POULTRY_FULL,
        recommended_doneness="genomstekt",
    ),
]

SWEDISH_TURKEY = [
    MeatCut(
        id=2310,
        name="kalkon_hel",
        name_long="Hel kalkon",
        cut_order=1,
        estimated_thickness_mm=150,
        usda_safe_c=72,
        usda_safe_f=162,
        rest_time_min=20,
        rest_time_max=45,
        carryover_temp_c=8,
        temperature_ranges=SWEDISH_POULTRY_FULL,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2311,
        name="kalkonbrost",
        name_long="Kalkonbröst",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=72,
        usda_safe_f=162,
        rest_time_min=10,
        rest_time_max=20,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_POULTRY_FULL,
        recommended_doneness="genomstekt",
    ),
]

SWEDISH_DUCK = [
    MeatCut(
        id=2320,
        name="ankbrost",
        name_long="Ankbröst",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=72,
        usda_safe_f=162,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FULL_DONENESS,
        recommended_doneness="medium_rare",
    ),
    MeatCut(
        id=2321,
        name="hel_anka",
        name_long="Hel anka",
        cut_order=2,
        estimated_thickness_mm=80,
        usda_safe_c=72,
        usda_safe_f=162,
        rest_time_min=10,
        rest_time_max=15,
        carryover_temp_c=5,
        temperature_ranges=SWEDISH_POULTRY_FULL,
        recommended_doneness="genomstekt",
    ),
]


# ============================================================================
# SWEDISH FISH (FISK)
# ============================================================================

# Fish with full range - including blodig for tuna/salmon
SWEDISH_FISH_FULL = [
    SWEDISH_DONENESS_RARE,
    SWEDISH_DONENESS_MEDIUM_RARE,
    SWEDISH_FISH_MEDIUM,
    SWEDISH_FISH_WELL_DONE,
]

SWEDISH_SALMON = [
    MeatCut(
        id=2400,
        name="laxfile",
        name_long="Laxfilé",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2401,
        name="gravad_lax",
        name_long="Gravad lax (uppvärmd)",
        cut_order=2,
        estimated_thickness_mm=15,
        usda_safe_c=52,
        usda_safe_f=126,
        rest_time_min=0,
        rest_time_max=0,
        carryover_temp_c=1,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2402,
        name="hel_lax_pa_ben",
        name_long="Hel lax på ben",
        cut_order=3,
        estimated_thickness_mm=60,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
]

# Tuna category
SWEDISH_TUNA = [
    MeatCut(
        id=2430,
        name="tonfiskskiva",
        name_long="Tonfiskskiva",
        cut_order=1,
        estimated_thickness_mm=25,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=1,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="blodig",
    ),
]

SWEDISH_COD = [
    MeatCut(
        id=2410,
        name="torskfile",
        name_long="Torskfilé",
        cut_order=1,
        estimated_thickness_mm=30,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2411,
        name="torskrygg",
        name_long="Torskrygg",
        cut_order=2,
        estimated_thickness_mm=40,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2412,
        name="hel_torsk_pa_ben",
        name_long="Hel torsk på ben",
        cut_order=3,
        estimated_thickness_mm=80,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
]

SWEDISH_OTHER_FISH = [
    MeatCut(
        id=2420,
        name="sikfile",
        name_long="Sikfilé",
        cut_order=1,
        estimated_thickness_mm=20,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2425,
        name="hel_sik_pa_ben",
        name_long="Hel sik på ben",
        cut_order=2,
        estimated_thickness_mm=40,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2421,
        name="rodingfile",
        name_long="Rödingfilé",
        cut_order=3,
        estimated_thickness_mm=20,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2426,
        name="hel_roding_pa_ben",
        name_long="Hel röding på ben",
        cut_order=4,
        estimated_thickness_mm=40,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2422,
        name="abborrfile",
        name_long="Abborrfilé",
        cut_order=5,
        estimated_thickness_mm=15,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=1,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2427,
        name="hel_abborre_pa_ben",
        name_long="Hel abborre på ben",
        cut_order=6,
        estimated_thickness_mm=30,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=3,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="genomstekt",
    ),
    MeatCut(
        id=2423,
        name="gosfile",
        name_long="Gösfilé",
        cut_order=7,
        estimated_thickness_mm=25,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=2,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2428,
        name="hel_gos_pa_ben",
        name_long="Hel gös på ben",
        cut_order=8,
        estimated_thickness_mm=50,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=5,
        rest_time_max=10,
        carryover_temp_c=4,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
    MeatCut(
        id=2424,
        name="haelleflundra",
        name_long="Hälleflundra",
        cut_order=9,
        estimated_thickness_mm=30,
        usda_safe_c=60,
        usda_safe_f=140,
        rest_time_min=0,
        rest_time_max=3,
        carryover_temp_c=2,
        temperature_ranges=SWEDISH_FISH_FULL,
        recommended_doneness="medium",
    ),
]


# ============================================================================
# ASSEMBLE SWEDISH DATA STRUCTURE
# ============================================================================

SWEDISH_MEAT_CATEGORIES = [
    MeatCategory(
        id=2001,
        name="nötkött",
        color_hex="#8B0000",
        meats=[
            Meat(
                id=2010,
                name="nötkreatur",
                description="Nötköttsstyckningar",
                cut_types=[
                    CutType(id=2100, name="Skiva", cuts=SWEDISH_BEEF_STEAKS),
                    CutType(id=2101, name="Helstekt", cuts=SWEDISH_BEEF_ROASTS),
                    CutType(id=2102, name="Grytbitar/Långkok", cuts=SWEDISH_BEEF_BRAISING),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=2002,
        name="fläsk",
        color_hex="#FFB6C1",
        meats=[
            Meat(
                id=2020,
                name="gris",
                description="Fläskstyckningar",
                cut_types=[
                    CutType(id=2200, name="Skiva/Kotlett", cuts=SWEDISH_PORK_STEAKS),
                    CutType(id=2201, name="Helstekt", cuts=SWEDISH_PORK_ROASTS),
                    CutType(id=2202, name="Revben", cuts=SWEDISH_PORK_RIBS),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=2003,
        name="fågel",
        color_hex="#FFD700",
        meats=[
            Meat(
                id=2030,
                name="kyckling",
                description="Kycklingstyckningar",
                cut_types=[
                    CutType(id=2300, name="Kyckling", cuts=SWEDISH_CHICKEN),
                ],
            ),
            Meat(
                id=2031,
                name="kalkon",
                description="Kalkonstyckningar",
                cut_types=[
                    CutType(id=2310, name="Kalkon", cuts=SWEDISH_TURKEY),
                ],
            ),
            Meat(
                id=2032,
                name="anka",
                description="Ankstyckningar",
                cut_types=[
                    CutType(id=2320, name="Anka", cuts=SWEDISH_DUCK),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=2004,
        name="fisk",
        color_hex="#4682B4",
        meats=[
            Meat(
                id=2040,
                name="lax",
                description="Laxstyckningar",
                cut_types=[
                    CutType(id=2400, name="Lax", cuts=SWEDISH_SALMON),
                ],
            ),
            Meat(
                id=2041,
                name="torsk",
                description="Torskstyckningar",
                cut_types=[
                    CutType(id=2410, name="Torsk", cuts=SWEDISH_COD),
                ],
            ),
            Meat(
                id=2042,
                name="tonfisk",
                description="Tonfiskstyckningar",
                cut_types=[
                    CutType(id=2430, name="Tonfisk", cuts=SWEDISH_TUNA),
                ],
            ),
            Meat(
                id=2043,
                name="övrig_fisk",
                description="Övriga fiskar",
                cut_types=[
                    CutType(id=2420, name="Övrig fisk", cuts=SWEDISH_OTHER_FISH),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=2007,
        name="kalv",
        color_hex="#DEB887",
        meats=[
            Meat(
                id=2070,
                name="kalv",
                description="Kalvstyckningar",
                cut_types=[
                    CutType(id=2700, name="Helstekt", cuts=SWEDISH_VEAL_ROASTS),
                    CutType(id=2710, name="Skiva/Kotlett", cuts=SWEDISH_VEAL_CHOPS),
                    CutType(id=2720, name="Långkok", cuts=SWEDISH_VEAL_BRAISING),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=2005,
        name="lamm",
        color_hex="#800020",
        meats=[
            Meat(
                id=2050,
                name="lamm",
                description="Lammstyckningar",
                cut_types=[
                    CutType(id=2500, name="Helstekt", cuts=SWEDISH_LAMB_ROASTS),
                    CutType(id=2510, name="Skiva/Kotlett", cuts=SWEDISH_LAMB_CHOPS),
                ],
            ),
        ],
    ),
    MeatCategory(
        id=2006,
        name="vilt",
        color_hex="#2F4F4F",
        meats=[
            Meat(
                id=2060,
                name="hjort_rådjur",
                description="Hjort och rådjur",
                cut_types=[
                    CutType(id=2600, name="Hjort/Rådjur", cuts=SWEDISH_VENISON),
                ],
            ),
            Meat(
                id=2061,
                name="älg",
                description="Älgstyckningar",
                cut_types=[
                    CutType(id=2610, name="Älg", cuts=SWEDISH_MOOSE),
                ],
            ),
            Meat(
                id=2062,
                name="ren",
                description="Renstyckningar",
                cut_types=[
                    CutType(id=2620, name="Ren", cuts=SWEDISH_REINDEER),
                ],
            ),
            Meat(
                id=2063,
                name="vildsvin",
                description="Vildsvinstyckningar",
                cut_types=[
                    CutType(id=2630, name="Vildsvin", cuts=SWEDISH_WILD_BOAR),
                ],
            ),
        ],
    ),
]


def get_all_swedish_categories() -> list[MeatCategory]:
    """Return all Swedish meat categories."""
    return SWEDISH_MEAT_CATEGORIES


def get_swedish_category_by_name(name: str) -> MeatCategory | None:
    """Get a Swedish category by its name."""
    for category in SWEDISH_MEAT_CATEGORIES:
        if category.name.lower() == name.lower():
            return category
    return None


def get_swedish_cut_by_id(cut_id: int) -> MeatCut | None:
    """Get a Swedish cut by its ID."""
    for category in SWEDISH_MEAT_CATEGORIES:
        for meat in category.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    if cut.id == cut_id:
                        return cut
    return None


def get_swedish_cut_by_name(name: str) -> MeatCut | None:
    """Get a Swedish cut by its internal name."""
    for category in SWEDISH_MEAT_CATEGORIES:
        for meat in category.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    if cut.name.lower() == name.lower():
                        return cut
    return None
