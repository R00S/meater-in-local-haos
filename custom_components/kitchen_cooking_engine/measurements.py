"""Measurement systems for Kitchen Cooking Engine.

Defines measurement units, conversion rules, and display preferences.
Measurement system is INDEPENDENT of language — a user can choose e.g.
English language with Swedish measurements, or Swedish language with US
measurements.

Supported measurement systems:
  - SE  (Swedish)  — krm, tsk, msk, cl, dl, l, g, hg, kg.  °C only.
  - UK  (British)  — tsp, tbsp, ml, dl, l, g, kg.  °C.
  - US  (American) — tsp, tbsp, cup, fl oz, oz, lb, °F.

Swedish rules (from user specification):
  - Cups are NEVER used.  dl is preferred over cl when ≥ 0.5 dl (5 cl).
  - L is used for whole or multiple litres.
  - cl is preferred over ml when ≥ 1 cl (10 ml).
  - hg is preferred over g when ≥ 1 hg (100 g).
  - kg is preferred over hg when ≥ 0.5 kg (500 g).
  - Temps are always °C.
  - Small volumes: krm (1 ml), tsk (5 ml), msk (15 ml).

UK rules (researched):
  - Uses tsp (5 ml), tbsp (15 ml) for small volumes.
  - ml for < 100 ml, dl for 100-999 ml, l for ≥ 1000 ml.
  - g/kg for mass.  No oz/lb.
  - Temps in °C.

US rules (researched):
  - Uses tsp (5 ml), tbsp (15 ml), cup (240 ml) for volume.
  - fl oz (29.57 ml) for liquid between tbsp and cup.
  - oz/lb for mass.  g/kg also available.
  - Temps in °F (with °C shown in parentheses).

Adding a new measurement system = adding a new MeasurementSystem entry
to MEASUREMENT_SYSTEMS.

Last Updated: 16 Mar 2026
"""

from __future__ import annotations

from dataclasses import dataclass
from typing import Any


# ============================================================================
# UNIT DEFINITIONS
# ============================================================================

@dataclass(frozen=True)
class MeasurementUnit:
    """A single measurement unit."""
    id: str             # e.g. "dl", "tsp", "g"
    abbr_sv: str        # Swedish abbreviation
    abbr_en: str        # English abbreviation
    type: str           # "volume" or "mass"
    to_base: float      # multiplier to convert to base unit (ml or g)


# --- Volume units (base = ml) ---

UNIT_ML    = MeasurementUnit("ml",    "ml",    "ml",    "volume", 1.0)
UNIT_CL    = MeasurementUnit("cl",    "cl",    "cl",    "volume", 10.0)
UNIT_DL    = MeasurementUnit("dl",    "dl",    "dl",    "volume", 100.0)
UNIT_L     = MeasurementUnit("l",     "l",     "L",     "volume", 1000.0)
UNIT_KRM   = MeasurementUnit("krm",   "krm",   "pinch", "volume", 1.0)
UNIT_TSK   = MeasurementUnit("tsk",   "tsk",   "tsp",   "volume", 5.0)
UNIT_MSK   = MeasurementUnit("msk",   "msk",   "tbsp",  "volume", 15.0)
UNIT_CUP   = MeasurementUnit("cup",   "cup",   "cup",   "volume", 240.0)
UNIT_TSP   = MeasurementUnit("tsp",   "tsp",   "tsp",   "volume", 5.0)
UNIT_TBSP  = MeasurementUnit("tbsp",  "tbsp",  "tbsp",  "volume", 15.0)
UNIT_FL_OZ = MeasurementUnit("fl_oz", "fl oz", "fl oz", "volume", 29.5735)
UNIT_PINT  = MeasurementUnit("pint",  "pint",  "pint",  "volume", 473.176)
UNIT_QUART = MeasurementUnit("quart", "quart", "quart", "volume", 946.353)

# --- Mass units (base = g) ---

UNIT_G  = MeasurementUnit("g",  "g",  "g",  "mass", 1.0)
UNIT_HG = MeasurementUnit("hg", "hg", "hg", "mass", 100.0)
UNIT_KG = MeasurementUnit("kg", "kg", "kg", "mass", 1000.0)
UNIT_OZ = MeasurementUnit("oz", "oz", "oz", "mass", 28.3495)
UNIT_LB = MeasurementUnit("lb", "lb", "lb", "mass", 453.592)


# ============================================================================
# PREFERENCE RULES
# ============================================================================
# Each rule is: (unit_id, min_base_value)
# Rules are evaluated top-to-bottom; the FIRST rule whose min_base_value is
# satisfied wins.  This means larger units should come first.

@dataclass
class PreferenceRule:
    """When to prefer a particular unit."""
    unit_id: str
    min_base_value: float  # minimum value in base unit (ml or g) to use this unit


# --- SE (Swedish) ---

SE_VOLUME_PREFS: list[PreferenceRule] = [
    PreferenceRule("l",   1000.0),   # ≥ 1 L → use L
    PreferenceRule("dl",  50.0),     # ≥ 0.5 dl (50 ml) → dl preferred over cl
    PreferenceRule("msk", 15.0),     # ≥ 1 msk (15 ml) → spoon measure
    PreferenceRule("cl",  10.0),     # ≥ 1 cl (10 ml) → cl preferred over ml
    PreferenceRule("tsk", 5.0),      # ≥ 1 tsk (5 ml) → spoon measure
    PreferenceRule("krm", 0.0),      # anything smaller
]

SE_MASS_PREFS: list[PreferenceRule] = [
    PreferenceRule("kg", 500.0),     # ≥ 0.5 kg → kg preferred over hg
    PreferenceRule("hg", 100.0),     # ≥ 1 hg → hg preferred over g
    PreferenceRule("g",  0.0),       # anything smaller
]

# --- UK (British) ---

UK_VOLUME_PREFS: list[PreferenceRule] = [
    PreferenceRule("l",    1000.0),  # ≥ 1 L
    PreferenceRule("dl",   100.0),   # ≥ 1 dl
    PreferenceRule("tbsp", 15.0),    # ≥ 1 tbsp
    PreferenceRule("tsp",  5.0),     # ≥ 1 tsp
    PreferenceRule("ml",   0.0),     # anything smaller
]

UK_MASS_PREFS: list[PreferenceRule] = [
    PreferenceRule("kg",  1000.0),   # ≥ 1 kg
    PreferenceRule("g",   0.0),      # anything else → g
]

# --- US (American) ---

US_VOLUME_PREFS: list[PreferenceRule] = [
    PreferenceRule("quart", 946.353),  # ≥ 1 quart
    PreferenceRule("cup",   240.0),    # ≥ 1 cup
    PreferenceRule("fl_oz", 29.57),    # ≥ 1 fl oz
    PreferenceRule("tbsp",  15.0),     # ≥ 1 tbsp
    PreferenceRule("tsp",   5.0),      # ≥ 1 tsp
    PreferenceRule("ml",    0.0),      # anything smaller
]

US_MASS_PREFS: list[PreferenceRule] = [
    PreferenceRule("lb",  453.592),  # ≥ 1 lb
    PreferenceRule("oz",  28.35),    # ≥ 1 oz
    PreferenceRule("g",   0.0),      # anything smaller
]


# ============================================================================
# MEASUREMENT SYSTEMS (independent of language)
# ============================================================================

@dataclass
class MeasurementSystem:
    """Complete measurement system."""
    id: str                                     # "se", "uk", or "us"
    name_sv: str                                # Swedish display name
    name_en: str                                # English display name
    flag: str                                   # Flag emoji
    temp_unit: str                              # "C" or "F"
    show_alt_temp: bool                         # Show alternative temp in parentheses
    volume_prefs: list[PreferenceRule]
    mass_prefs: list[PreferenceRule]
    volume_units: list[MeasurementUnit]         # All available volume units
    mass_units: list[MeasurementUnit]           # All available mass units


MEASUREMENT_SYSTEM_SE = MeasurementSystem(
    id="se",
    name_sv="🇸🇪 Svenska mått",
    name_en="🇸🇪 Swedish",
    flag="🇸🇪",
    temp_unit="C",
    show_alt_temp=False,
    volume_prefs=SE_VOLUME_PREFS,
    mass_prefs=SE_MASS_PREFS,
    volume_units=[UNIT_KRM, UNIT_TSK, UNIT_MSK, UNIT_CL, UNIT_DL, UNIT_L],
    mass_units=[UNIT_G, UNIT_HG, UNIT_KG],
)

MEASUREMENT_SYSTEM_UK = MeasurementSystem(
    id="uk",
    name_sv="🇬🇧 Brittiska mått",
    name_en="🇬🇧 UK Metric",
    flag="🇬🇧",
    temp_unit="C",
    show_alt_temp=False,
    volume_prefs=UK_VOLUME_PREFS,
    mass_prefs=UK_MASS_PREFS,
    volume_units=[UNIT_ML, UNIT_TSP, UNIT_TBSP, UNIT_DL, UNIT_L],
    mass_units=[UNIT_G, UNIT_KG],
)

MEASUREMENT_SYSTEM_US = MeasurementSystem(
    id="us",
    name_sv="🇺🇸 Amerikanska mått",
    name_en="🇺🇸 US Customary",
    flag="🇺🇸",
    temp_unit="F",
    show_alt_temp=True,      # Shows °F with (°C) in parentheses
    volume_prefs=US_VOLUME_PREFS,
    mass_prefs=US_MASS_PREFS,
    volume_units=[UNIT_ML, UNIT_TSP, UNIT_TBSP, UNIT_FL_OZ, UNIT_CUP, UNIT_PINT, UNIT_QUART],
    mass_units=[UNIT_G, UNIT_OZ, UNIT_LB, UNIT_KG],
)

# Registry — easy to extend with new measurement systems
MEASUREMENT_SYSTEMS: dict[str, MeasurementSystem] = {
    "se": MEASUREMENT_SYSTEM_SE,
    "uk": MEASUREMENT_SYSTEM_UK,
    "us": MEASUREMENT_SYSTEM_US,
}

DEFAULT_MEASUREMENT_SYSTEM = "se"


# ============================================================================
# UNIT LOOKUP TABLE  (id → MeasurementUnit)
# ============================================================================

ALL_UNITS: dict[str, MeasurementUnit] = {}
for _u in [
    UNIT_ML, UNIT_CL, UNIT_DL, UNIT_L, UNIT_KRM, UNIT_TSK, UNIT_MSK,
    UNIT_CUP, UNIT_TSP, UNIT_TBSP, UNIT_FL_OZ, UNIT_PINT, UNIT_QUART,
    UNIT_G, UNIT_HG, UNIT_KG, UNIT_OZ, UNIT_LB,
]:
    ALL_UNITS[_u.id] = _u


# ============================================================================
# CONVERSION FUNCTIONS
# ============================================================================

def convert_quantity(
    value: float,
    from_unit_id: str,
    measurement_system: str = "se",
) -> tuple[float, str]:
    """Convert a quantity to the preferred unit for the given measurement system.

    Args:
        value: The numeric quantity.
        from_unit_id: The source unit id (e.g. "ml", "g", "cup").
        measurement_system: Target system id ("se", "uk", or "us").

    Returns:
        Tuple of (converted_value, target_unit_id).
    """
    system = MEASUREMENT_SYSTEMS.get(measurement_system, MEASUREMENT_SYSTEM_SE)
    unit = ALL_UNITS.get(from_unit_id)
    if not unit:
        return (value, from_unit_id)

    # Convert to base unit
    base_value = value * unit.to_base

    # Pick preference list
    prefs = system.volume_prefs if unit.type == "volume" else system.mass_prefs

    for rule in prefs:
        target_unit = ALL_UNITS.get(rule.unit_id)
        if not target_unit:
            continue
        if base_value >= rule.min_base_value:
            converted = base_value / target_unit.to_base
            return (converted, rule.unit_id)

    # Fallback: return in base unit
    return (base_value, "ml" if unit.type == "volume" else "g")


def format_quantity(
    value: float,
    from_unit_id: str,
    measurement_system: str = "se",
    language: str = "sv",
) -> str:
    """Convert and format a quantity for display.

    Returns a human-readable string like "2.5 dl" or "500 g".
    """
    converted, unit_id = convert_quantity(value, from_unit_id, measurement_system)
    target_unit = ALL_UNITS.get(unit_id)
    if not target_unit:
        return f"{converted} {unit_id}"

    # Smart rounding
    if converted == int(converted):
        num_str = str(int(converted))
    elif converted < 10:
        num_str = f"{converted:.1f}".rstrip("0").rstrip(".")
    else:
        num_str = str(round(converted))

    display_name = target_unit.abbr_sv if language == "sv" else target_unit.abbr_en
    return f"{num_str} {display_name}"


def convert_temperature(temp_c: float, measurement_system: str = "se") -> str:
    """Format a temperature for display in the given measurement system.

    SE/UK: °C only.
    US: °F with (°C) in parentheses.
    """
    system = MEASUREMENT_SYSTEMS.get(measurement_system, MEASUREMENT_SYSTEM_SE)
    if system.temp_unit == "F":
        f_val = round(temp_c * 9.0 / 5.0 + 32)
        return f"{f_val}°F ({round(temp_c)}°C)"
    return f"{round(temp_c)}°C"


# ============================================================================
# EXPORT FOR FRONTEND (used by generate_frontend_data.py)
# ============================================================================

def get_measurement_systems_js() -> dict[str, Any]:
    """Return measurement systems as a JSON-serialisable dict for the frontend.

    Structure:
    {
      "se": {
        "id": "se",
        "name_sv": "🇸🇪 Svenska mått",
        "name_en": "🇸🇪 Swedish",
        "flag": "🇸🇪",
        "temp_unit": "C",
        "show_alt_temp": false,
        "volume_prefs": [{"unit": "l", "min_ml": 1000}, ...],
        "mass_prefs": [{"unit": "kg", "min_g": 500}, ...],
        "units": {"ml": {"abbr_sv": "ml", "abbr_en": "ml", "type": "volume", "to_base": 1}, ...}
      },
      "uk": { ... },
      "us": { ... }
    }
    """
    result = {}
    for sys_id, system in MEASUREMENT_SYSTEMS.items():
        units_dict = {}
        for u in system.volume_units + system.mass_units:
            units_dict[u.id] = {
                "abbr_sv": u.abbr_sv,
                "abbr_en": u.abbr_en,
                "type": u.type,
                "to_base": u.to_base,
            }

        vol_prefs = [
            {"unit": r.unit_id, "min_ml": r.min_base_value}
            for r in system.volume_prefs
        ]
        mass_prefs = [
            {"unit": r.unit_id, "min_g": r.min_base_value}
            for r in system.mass_prefs
        ]

        result[sys_id] = {
            "id": sys_id,
            "name_sv": system.name_sv,
            "name_en": system.name_en,
            "flag": system.flag,
            "temp_unit": system.temp_unit,
            "show_alt_temp": system.show_alt_temp,
            "volume_prefs": vol_prefs,
            "mass_prefs": mass_prefs,
            "units": units_dict,
        }
    return result
