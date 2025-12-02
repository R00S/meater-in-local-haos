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
from datetime import datetime

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

INT_CATEGORIES = cooking_data.MEAT_CATEGORIES

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

SWE_CATEGORIES = swedish_globals.get("SWEDISH_MEAT_CATEGORIES", [])


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


def generate_js_data():
    """Generate the JavaScript data section."""
    # Convert categories
    int_categories = {}
    for category in INT_CATEGORIES:
        int_categories[category.name.lower()] = category_to_js(category)
    
    swe_categories = {}
    for category in SWE_CATEGORIES:
        swe_categories[category.name.lower()] = category_to_js(category)
    
    # Extract doneness levels
    int_doneness = get_doneness_levels(INT_CATEGORIES)
    swe_doneness = get_doneness_levels(SWE_CATEGORIES)
    
    lines = []
    lines.append(f"// AUTO-GENERATED DATA - DO NOT EDIT")
    lines.append(f"// Generated from cooking_data.py and swedish_cooking_data.py")
    lines.append(f"// Last generated: {datetime.now().isoformat()}")
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
    """Regenerate the panel JS file with fresh data from backend."""
    
    panel_file = os.path.join(base_dir, "www", "kitchen-cooking-panel.js")
    
    # Read existing panel
    with open(panel_file, "r", encoding="utf-8") as f:
        content = f.read()
    
    # Find where the data ends and the class begins
    # Look for "class KitchenCookingPanel"
    class_marker = "class KitchenCookingPanel"
    class_idx = content.find(class_marker)
    
    if class_idx == -1:
        print("ERROR: Could not find 'class KitchenCookingPanel' in panel file", file=sys.stderr)
        return False
    
    # Find the start of data (after the imports)
    # Look for "// Data source options" or similar
    data_start_markers = [
        "// AUTO-GENERATED DATA",
        "// Doneness option definitions",
        "// Data source options",
        "const DONENESS_OPTIONS",
    ]
    
    data_start = -1
    for marker in data_start_markers:
        idx = content.find(marker)
        if idx != -1 and (data_start == -1 or idx < data_start):
            data_start = idx
    
    if data_start == -1:
        # Fall back to after imports
        import_end = content.rfind("from \"https://unpkg.com/lit-element")
        if import_end != -1:
            data_start = content.find("\n", import_end) + 1
        else:
            data_start = 0
    
    # Extract the parts we want to keep
    # Header: from start to data_start
    # Footer: from class definition to end
    header = content[:data_start]
    footer = content[class_idx:]
    
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
    new_content += footer
    
    # Update panel version
    old_version_line = 'const PANEL_VERSION = "'
    version_idx = new_content.find(old_version_line)
    if version_idx != -1:
        version_end = new_content.find('"', version_idx + len(old_version_line))
        old_version = new_content[version_idx + len(old_version_line):version_end]
        try:
            new_version = str(int(old_version) + 1)
        except:
            new_version = "25"
        new_content = new_content[:version_idx + len(old_version_line)] + new_version + new_content[version_end:]
        print(f"Updated PANEL_VERSION: {old_version} -> {new_version}")
    
    # Write new panel
    with open(panel_file, "w", encoding="utf-8") as f:
        f.write(new_content)
    
    print(f"Regenerated {panel_file}")
    print(f"  International categories: {len(INT_CATEGORIES)}")
    print(f"  Swedish categories: {len(SWE_CATEGORIES)}")
    
    # Count cuts
    int_cuts = sum(len(ct.cuts) for cat in INT_CATEGORIES for m in cat.meats for ct in m.cut_types)
    swe_cuts = sum(len(ct.cuts) for cat in SWE_CATEGORIES for m in cat.meats for ct in m.cut_types)
    print(f"  International cuts: {int_cuts}")
    print(f"  Swedish cuts: {swe_cuts}")
    
    return True


if __name__ == "__main__":
    if len(sys.argv) > 1 and sys.argv[1] == "--data-only":
        print(generate_js_data())
    else:
        success = regenerate_panel()
        sys.exit(0 if success else 1)
