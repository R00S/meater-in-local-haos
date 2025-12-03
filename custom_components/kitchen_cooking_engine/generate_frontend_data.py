#!/usr/bin/env python3
"""
Generate frontend cooking data from backend Python files.

This script generates the JavaScript cooking data constants that are embedded
in kitchen-cooking-panel.js from the canonical backend data sources:
- cooking_data.py (International/USDA data)
- swedish_cooking_data.py (Swedish data)

Run this script at install/update time to ensure frontend matches backend.

Usage:
    python3 generate_frontend_data.py
    
This will regenerate www/kitchen-cooking-panel.js with data from the backend.
"""

import json
import sys
import os
from datetime import datetime, timezone, timedelta

# Lazy-loaded module references
_INT_CATEGORIES = None
_SWE_CATEGORIES = None


def _load_cooking_data():
    """Load cooking data modules on demand to avoid blocking at import time."""
    global _INT_CATEGORIES, _SWE_CATEGORIES
    
    if _INT_CATEGORIES is not None:
        return
    
    base_dir = os.path.dirname(os.path.abspath(__file__))
    
    # Load cooking_data module
    import importlib.util
    cooking_spec = importlib.util.spec_from_file_location(
        "cooking_data",
        os.path.join(base_dir, "cooking_data.py")
    )
    cooking_data = importlib.util.module_from_spec(cooking_spec)
    sys.modules["cooking_data"] = cooking_data
    cooking_spec.loader.exec_module(cooking_data)
    
    _INT_CATEGORIES = cooking_data.MEAT_CATEGORIES
    
    # Load Swedish data
    swedish_file = os.path.join(base_dir, "swedish_cooking_data.py")
    with open(swedish_file, "r", encoding="utf-8") as f:
        swedish_code = f.read()
    
    swedish_code = swedish_code.replace("from .cooking_data import", "from cooking_data import")
    
    swedish_globals = {
        "__name__": "swedish_cooking_data",
        "__file__": swedish_file,
    }
    exec(swedish_code, swedish_globals)
    
    _SWE_CATEGORIES = swedish_globals.get("SWEDISH_MEAT_CATEGORIES", [])


def get_category_icon(name):
    """Get icon for category name."""
    icons = {
        "beef": "🥩", "nötkött": "🥩",
        "pork": "🐷", "fläsk": "🐷",
        "poultry": "🍗", "fågel": "🍗",
        "lamb": "🐑", "lamm": "🐑",
        "game": "🦌", "vilt": "🦌",
        "fish": "🐟", "fisk": "🐟",
        "shellfish": "🦐", "skaldjur": "🦐",
        "vegetable": "🥬",
        "kalv": "🐄",
    }
    return icons.get(name.lower(), "🍖")


def cut_to_js(cut):
    """Convert a MeatCut to JS object format."""
    doneness_keys = [tr.name for tr in cut.temperature_ranges]
    
    result = {
        "id": cut.id,
        "name": cut.name_long or cut.name,
        "doneness": doneness_keys,
    }
    if cut.recommended_doneness:
        result["recommended_doneness"] = cut.recommended_doneness
    return result


def category_to_js(category):
    """Convert a MeatCategory to JS object format."""
    meats_js = []
    for meat in category.meats:
        cut_types_js = []
        for cut_type in meat.cut_types:
            cuts_js = [cut_to_js(cut) for cut in cut_type.cuts]
            cut_types_js.append({
                "id": cut_type.id,
                "name": cut_type.name,
                "cuts": cuts_js,
            })
        
        meats_js.append({
            "id": meat.id,
            "name": meat.name,
            "cutTypes": cut_types_js,
        })
    
    return {
        "id": category.id,
        "name": category.name.title(),
        "icon": get_category_icon(category.name),
        "color": category.color_hex,
        "meats": meats_js,
    }


def get_doneness_levels(categories):
    """Extract unique doneness levels from all cuts."""
    doneness = {}
    icons = {
        "rare": "🔴", "blodig": "🔴",
        "medium_rare": "🟠",
        "medium": "🟡",
        "medium_well": "🟤",
        "well_done": "⚪", "genomstekt": "⚪",
        "pulled": "🍖", "långkokt": "🍖",
        "safe": "✅",
        "dark_meat_optimal": "🍗",
        "crispy": "🥓",
        "heated_through": "♨️",
        "done": "✓",
        "tender": "🥔",
        "crisp_tender": "🥦",
        "caramelized": "🧅",
        "charred": "🔥",
    }
    for cat in categories:
        for meat in cat.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    for tr in cut.temperature_ranges:
                        if tr.name not in doneness:
                            doneness[tr.name] = {
                                "value": tr.name,
                                "name": tr.name.replace("_", " ").title(),
                                "icon": icons.get(tr.name, "🔥"),
                                "description": tr.description,
                                "temp_c": tr.target_temp_c,
                                "temp_f": tr.target_temp_f,
                            }
    return doneness


def get_cet_timestamp():
    """Get current time in CET/CEST as a human-readable string."""
    # CET is UTC+1, CEST is UTC+2
    # For simplicity, use CET (UTC+1) - Central European Time
    cet = timezone(timedelta(hours=1))
    now_cet = datetime.now(cet)
    return now_cet.strftime("%d %b %Y, %H:%M CET")


def generate_js_data():
    """Generate the JavaScript data section."""
    _load_cooking_data()
    
    # Convert categories
    int_categories = {}
    for category in _INT_CATEGORIES:
        int_categories[category.name.lower()] = category_to_js(category)
    
    swe_categories = {}
    for category in _SWE_CATEGORIES:
        swe_categories[category.name.lower()] = category_to_js(category)
    
    # Extract doneness levels
    int_doneness = get_doneness_levels(_INT_CATEGORIES)
    swe_doneness = get_doneness_levels(_SWE_CATEGORIES)
    
    cet_time = get_cet_timestamp()
    
    lines = []
    lines.append(f"// AUTO-GENERATED DATA - DO NOT EDIT")
    lines.append(f"// Generated from cooking_data.py and swedish_cooking_data.py")
    lines.append(f"// Last generated: {cet_time}")
    lines.append("")
    lines.append("// Doneness option definitions (International/USDA)")
    lines.append(f"const DONENESS_OPTIONS = {json.dumps(int_doneness, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Swedish doneness option definitions")
    lines.append(f"const SWEDISH_DONENESS_OPTIONS = {json.dumps(swe_doneness, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// International meat categories")
    lines.append(f"const MEAT_CATEGORIES = {json.dumps(int_categories, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Swedish meat categories")
    lines.append(f"const SWEDISH_MEAT_CATEGORIES = {json.dumps(swe_categories, indent=2, ensure_ascii=False)};")
    
    return "\n".join(lines)


def regenerate_panel():
    """Regenerate the panel JS file with fresh data from backend.
    
    This function:
    1. Reads the class code from panel-class-template.js (the source of truth for UI code)
    2. Generates fresh data constants from the Python cooking data files
    3. Combines them into a new kitchen-cooking-panel.js
    
    The template file contains the UI class code and is updated by developers.
    The data constants are generated from cooking_data.py and swedish_cooking_data.py.
    """
    _load_cooking_data()
    
    base_dir = os.path.dirname(os.path.abspath(__file__))
    panel_file = os.path.join(base_dir, "www", "kitchen-cooking-panel.js")
    template_file = os.path.join(base_dir, "www", "panel-class-template.js")
    
    # Read the class template (source of truth for UI code)
    if not os.path.exists(template_file):
        print(f"ERROR: Template file not found: {template_file}", file=sys.stderr)
        print("The template file contains the UI class code and must exist.", file=sys.stderr)
        return False
    
    with open(template_file, "r", encoding="utf-8") as f:
        class_code = f.read()
    
    if "class KitchenCookingPanel" not in class_code:
        print("ERROR: Template file does not contain 'class KitchenCookingPanel'", file=sys.stderr)
        return False
    
    # Generate new header with current CET timestamp
    cet_time = get_cet_timestamp()
    header = f"""/**
 * Kitchen Cooking Engine Panel
 * 
 * ╔══════════════════════════════════════════════════════════════════════════════╗
 * ║  ⛔ STOP! BEFORE EDITING THIS FILE, READ THIS:                              ║
 * ╠══════════════════════════════════════════════════════════════════════════════╣
 * ║                                                                              ║
 * ║  This file is AUTO-GENERATED. Do not edit it directly!                      ║
 * ║                                                                              ║
 * ║  TO CHANGE UI/BEHAVIOR:                                                      ║
 * ║    1. Edit www/panel-class-template.js (the source of truth for UI code)    ║
 * ║    2. Run: python3 generate_frontend_data.py                                ║
 * ║    3. This regenerates kitchen-cooking-panel.js with your changes           ║
 * ║                                                                              ║
 * ║  TO CHANGE COOKING DATA:                                                     ║
 * ║    1. Edit cooking_data.py or swedish_cooking_data.py                       ║
 * ║    2. Run: python3 generate_frontend_data.py                                ║
 * ║                                                                              ║
 * ║  PANEL_VERSION is automatically kept in sync between const.py and this file ║
 * ║                                                                              ║
 * ╚══════════════════════════════════════════════════════════════════════════════╝
 * 
 * AUTO-GENERATED: {cet_time}
 * Data generated from cooking_data.py and swedish_cooking_data.py
 * UI class from panel-class-template.js
 * 
 * Temperature values are suggestions based on cooking style, not just safety.
 */

import {{
  LitElement,
  html,
  css,
}} from "https://unpkg.com/lit-element@2.4.0/lit-element.js?module";


"""
    
    # Build new panel
    new_content = header
    new_content += "\n// Data source options\n"
    new_content += 'const DATA_SOURCE_INTERNATIONAL = "international";\n'
    new_content += 'const DATA_SOURCE_SWEDISH = "swedish";\n\n'
    new_content += generate_js_data()
    new_content += "\n\n// Cooking methods\n"
    new_content += """const COOKING_METHODS = [
  { value: "oven_roast", name: "Oven Roast" },
  { value: "oven_bake", name: "Oven Bake" },
  { value: "pan_sear", name: "Pan Sear" },
  { value: "pan_fry", name: "Pan Fry" },
  { value: "grill", name: "Grill" },
  { value: "smoker", name: "Smoker" },
  { value: "air_fryer", name: "Air Fryer" },
  { value: "sous_vide", name: "Sous Vide" },
  { value: "slow_cooker", name: "Slow Cooker" },
];

"""
    new_content += class_code
    
    # Update panel version in JS
    old_version_line = 'const PANEL_VERSION = "'
    version_idx = new_content.find(old_version_line)
    new_version = "25"
    if version_idx != -1:
        version_end = new_content.find('"', version_idx + len(old_version_line))
        old_version = new_content[version_idx + len(old_version_line):version_end]
        try:
            new_version = str(int(old_version) + 1)
        except:
            new_version = "25"
        new_content = new_content[:version_idx + len(old_version_line)] + new_version + new_content[version_end:]
        print(f"Updated PANEL_VERSION in JS: {old_version} -> {new_version}")
    
    # Write new panel
    with open(panel_file, "w", encoding="utf-8") as f:
        f.write(new_content)
    
    # Also update const.py to keep PANEL_VERSION in sync
    const_file = os.path.join(base_dir, "const.py")
    if os.path.exists(const_file):
        with open(const_file, "r", encoding="utf-8") as f:
            const_content = f.read()
        
        const_version_line = 'PANEL_VERSION = "'
        const_idx = const_content.find(const_version_line)
        if const_idx != -1:
            const_end = const_content.find('"', const_idx + len(const_version_line))
            old_const_version = const_content[const_idx + len(const_version_line):const_end]
            const_content = const_content[:const_idx + len(const_version_line)] + new_version + const_content[const_end:]
            
            with open(const_file, "w", encoding="utf-8") as f:
                f.write(const_content)
            print(f"Updated PANEL_VERSION in const.py: {old_const_version} -> {new_version}")
    
    print(f"Regenerated {panel_file}")
    print(f"  International categories: {len(_INT_CATEGORIES)}")
    print(f"  Swedish categories: {len(_SWE_CATEGORIES)}")
    
    # Count cuts
    int_cuts = sum(len(ct.cuts) for cat in _INT_CATEGORIES for m in cat.meats for ct in m.cut_types)
    swe_cuts = sum(len(ct.cuts) for cat in _SWE_CATEGORIES for m in cat.meats for ct in m.cut_types)
    print(f"  International cuts: {int_cuts}")
    print(f"  Swedish cuts: {swe_cuts}")
    
    return True


if __name__ == "__main__":
    if len(sys.argv) > 1 and sys.argv[1] == "--data-only":
        print(generate_js_data())
    else:
        success = regenerate_panel()
        sys.exit(0 if success else 1)
