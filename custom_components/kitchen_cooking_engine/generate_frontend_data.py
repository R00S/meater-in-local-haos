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
import re
import shutil
import sys
import os
import yaml
from datetime import datetime, timezone, timedelta

# Lazy-loaded module references
_INT_CATEGORIES = None
_SWE_CATEGORIES = None

# NOTE on Swedish→English recipe slug mapping
#
# A previous version of this file maintained a hand-written `_RECIPE_SLUG_MAP`
# dict that translated Swedish cut slugs to the English recipe-filename slugs
# under `docs/recipe_research/`. That map accumulated unverified, fabricated
# cross-species translations (e.g. abborrfile→sea_bass, lammbringa→brisket)
# and was producing wrong recipe cards in the experimental MEATER path.
#
# The map has been removed. The experimental MEATER path is now locked to
# international (`MEAT_CATEGORIES`) data on the frontend, where every
# `MeatCut.name` already matches the recipe-filename slug directly, so no
# translation layer is needed. Swedish support on the experimental path is
# postponed; when it returns, every entry MUST be backed by a real recipe
# file for the same species and cut (see `.github/copilot-instructions.md`
# Rule 2 — "Data Mappings: Only Map What You Can Verify").
#
# `MeatCut.recipe_slug` is still honoured below for explicit per-cut overrides
# defined in cooking_data.py / swedish_cooking_data.py.


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
        "slug": cut.name,
        "doneness": doneness_keys,
    }
    if cut.recommended_doneness:
        result["recommended_doneness"] = cut.recommended_doneness
    if cut.supported_methods:
        result["supported_methods"] = [m.value for m in cut.supported_methods]
    if cut.method_doneness:
        result["method_doneness"] = cut.method_doneness
    if cut.method_temperature_ranges:
        result["method_doneness_options"] = {
            method: [tr.name for tr in ranges]
            for method, ranges in cut.method_temperature_ranges.items()
        }
    # recipe_slug: only emit when the cut explicitly defines one (see note at
    # the top of this file about the removed Swedish slug map).
    explicit = getattr(cut, "recipe_slug", None)
    if explicit and explicit != cut.name:
        result["recipe_slug"] = explicit
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
        "thigh_optimal": "🍗",
        "thigh_rendered": "🦢",
        "leg_rendered": "🦆",
        "confit": "🦆",
        "crispy": "🥓",
        "heated_through": "♨️",
        "done": "✓",
        "tender": "🥔",
        "crisp_tender": "🥦",
        "caramelized": "🧅",
        "charred": "🔥",
        "just_cooked": "🦐",
        "braised_tender": "🐙",
        "quick_sear": "⚡",
    }
    for cat in categories:
        for meat in cat.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    # Collect from default temperature_ranges
                    for tr in cut.temperature_ranges:
                        if tr.name not in doneness:
                            doneness[tr.name] = {
                                "value": tr.name,
                                "name": tr.name.replace("_", " ").title(),
                                "icon": icons.get(tr.name, "🔥"),
                                "description": tr.description,
                                "temp_c": tr.target_temp_c,
                                "temp_f": tr.target_temp_f,
                                "safety_level": getattr(tr, "safety_level", None),
                            }
                    # Also collect from per-method temperature range overrides
                    for ranges in getattr(cut, "method_temperature_ranges", {}).values():
                        for tr in ranges:
                            if tr.name not in doneness:
                                doneness[tr.name] = {
                                    "value": tr.name,
                                    "name": tr.name.replace("_", " ").title(),
                                    "icon": icons.get(tr.name, "🔥"),
                                    "description": tr.description,
                                    "temp_c": tr.target_temp_c,
                                    "temp_f": tr.target_temp_f,
                                    "safety_level": getattr(tr, "safety_level", None),
                                }
    return doneness


def get_cet_timestamp():
    """Get current time in CET/CEST as a human-readable string."""
    # CET is UTC+1, CEST is UTC+2
    # For simplicity, use CET (UTC+1) - Central European Time
    cet = timezone(timedelta(hours=1))
    now_cet = datetime.now(cet)
    return now_cet.strftime("%d %b %Y, %H:%M CET")


def recipe_to_js(recipe):
    """Convert a NinjaCombiRecipe to JS object format."""
    phases_js = []
    for phase in recipe.phases:
        phases_js.append({
            "mode": phase.mode.value,
            "temperature_c": phase.temperature_c,
            "temperature_f": phase.temperature_f,
            "duration_minutes": phase.duration_minutes,
            "description": phase.description,
            "steam_enabled": phase.steam_enabled,
        })
    
    result = {
        "id": recipe.id,
        "name": recipe.name,
        "description": recipe.description,
        "mode": recipe.mode.value,
        "tray_position": recipe.tray_position.value,
        "phases": phases_js,
        "use_probe": recipe.use_probe,
        "ingredients": recipe.ingredients,
        "instructions": recipe.instructions,
        "prep_time_minutes": recipe.prep_time_minutes,
        "cook_time_minutes": recipe.cook_time_minutes,
        "servings": recipe.servings,
        "difficulty": recipe.difficulty,
        "tips": recipe.tips,
        "notes": recipe.notes,
    }
    
    if recipe.target_temp_c:
        result["target_temp_c"] = recipe.target_temp_c
        result["target_temp_f"] = recipe.target_temp_f
    
    return result


def _parse_kce_tag(content, tag_name):
    """Extract and parse the YAML body from a KCE HTML-comment tag.

    Files are tagged with explicit named markers so regexp has an unambiguous
    anchor point:

        <!-- KCE:CUT
        type: cut
        slug: ribeye_steak
        ...
        -->

    Pattern: ``<!-- KCE:{tag_name}\\n(.*?)\\n-->`` anchored to file start.
    Returns a dict or None.
    """
    opening = f"<!-- KCE:{tag_name}\n"
    closing = "\n-->"
    if not content.startswith(opening):
        return None
    end_idx = content.find(closing, len(opening))
    if end_idx == -1:
        return None
    yaml_text = content[len(opening):end_idx]
    try:
        return yaml.safe_load(yaml_text)
    except yaml.YAMLError:
        return None


def _extract_recipe_titles(content):
    """Return a list of recipe titles from a file's ## Source recipes section.

    Uses the existing ``### N.`` heading convention already present in every
    recipe file.  Called only from the Python generator — regex is intentional
    here so the JavaScript panel never needs to parse file content at runtime.
    """
    src_m = re.search(r"## Source recipes\n+([\s\S]*)$", content, re.DOTALL)
    if not src_m:
        return []
    titles = []
    for m in re.finditer(r"^### (?:\d+\.\s+)?(.+?)$", src_m.group(1), re.MULTILINE):
        titles.append(m.group(1).strip())
    return titles


def build_recipe_index(base_dir, *, recipe_dir=None, url_prefix="recipes"):
    """Scan recipe files and build index, cut profiles, method profiles and recipe titles.

    When ``recipe_dir`` is None the function uses the standard resolution order:
    docs/recipe_research/ first (developer environment), then www/recipes/
    (pre-populated in HACS releases on real HA installs).

    Pass an explicit ``recipe_dir`` path and a matching ``url_prefix`` to build
    an index for a different tree (e.g. the frozen classic fork).

    File types are identified via KCE tags:
      <!-- KCE:CUT ...        -->  cut overview files ({slug}.md)
      <!-- KCE:CUT_METHOD ... -->  method research files ({slug}-{method}.md)

    Returns:
        recipe_index:        {cut_slug: {method_slug: url_path}}
        cut_profiles:        {cut_slug: "profile text (en)"}
        cut_profiles_sv:     {cut_slug: "profile text (sv)"} — from ## Styckesprofil section
        cut_method_profiles: {cut_slug: {method_slug: "en text", method_slug+"_sv": "sv text"}}
        recipe_titles:       {cut_slug: {method_slug: ["title", ...]}}
    """
    if recipe_dir is None:
        repo_root = os.path.abspath(os.path.join(base_dir, "..", ".."))
        docs_recipe_dir = os.path.join(repo_root, "docs", "recipe_research")
        www_recipe_dir = os.path.join(base_dir, "www", "recipes")

        if os.path.isdir(docs_recipe_dir):
            recipe_dir = docs_recipe_dir
        elif os.path.isdir(www_recipe_dir):
            recipe_dir = www_recipe_dir
            print("  (using www/recipes/ as recipe source — docs/recipe_research/ not found)")
        else:
            return {}, {}, {}, {}
    elif not os.path.isdir(recipe_dir):
        return {}, {}, {}, {}

    _excluded = {
        "README.md", "RECIPE_COLLECTION_TOR.md",
        "RECIPE_ANALYSIS_TOR.md", "SOURCE_SURVEY.md",
    }

    recipe_index = {}
    cut_profiles = {}
    cut_profiles_sv = {}
    cut_method_profiles = {}
    recipe_titles = {}

    _profile_re    = re.compile(r"## Cut profile\n+(.*?)(?=\n\n##|\Z)", re.DOTALL)
    _profile_sv_re = re.compile(r"## Styckesprofil\n+(.*?)(?=\n\n##|\Z)", re.DOTALL)

    for root, _dirs, files in os.walk(recipe_dir):
        for filename in sorted(files):
            if not filename.endswith(".md") or filename in _excluded:
                continue

            path = os.path.join(root, filename)
            rel = os.path.relpath(path, recipe_dir).replace(os.sep, "/")
            url_path = f"/kitchen_cooking_engine_panel/{url_prefix}/{rel}"

            try:
                content = open(path, encoding="utf-8").read()
            except Exception:
                continue

            stem = filename[:-3]

            # --- Cut overview file ---
            data = _parse_kce_tag(content, "CUT")
            if data is not None:
                cut_slug = data.get("slug") or stem
                recipe_index.setdefault(cut_slug, {})["overview"] = url_path

                m = _profile_re.search(content)
                if m:
                    cut_profiles[cut_slug] = m.group(1).strip()

                m_sv = _profile_sv_re.search(content)
                if m_sv:
                    cut_profiles_sv[cut_slug] = m_sv.group(1).strip()
                continue

            # --- Cut-method file ---
            data = _parse_kce_tag(content, "CUT_METHOD")
            if data is not None:
                cut_slug = data.get("slug") or stem.split("-")[0]
                method_slug = data.get("method") or (stem.split("-", 1)[1] if "-" in stem else stem)
                recipe_index.setdefault(cut_slug, {})[method_slug] = url_path

                m = _profile_re.search(content)
                if m:
                    desc = m.group(1).strip()
                    cut_method_profiles.setdefault(cut_slug, {})[method_slug] = desc
                    # Fallback: populate cut overview description if no dedicated overview file
                    if cut_slug not in cut_profiles:
                        cut_profiles[cut_slug] = desc

                # Swedish method description — prefer ## Styckesprofil body over
                # the single-line description_sv: YAML field (body is multi-paragraph)
                m_sv = _profile_sv_re.search(content)
                if m_sv:
                    cut_method_profiles.setdefault(cut_slug, {})[method_slug + "_sv"] = m_sv.group(1).strip()
                    if cut_slug not in cut_profiles_sv:
                        cut_profiles_sv[cut_slug] = m_sv.group(1).strip()
                else:
                    # Fall back to single-line YAML field for backwards compatibility
                    desc_sv = data.get("description_sv")
                    if desc_sv:
                        cut_method_profiles.setdefault(cut_slug, {})[method_slug + "_sv"] = desc_sv

                titles = _extract_recipe_titles(content)
                if titles:
                    recipe_titles.setdefault(cut_slug, {})[method_slug] = titles
                continue

            # File has no KCE tag — fall back to filename-based detection for
            # backwards compatibility with any files not yet migrated.
            if "-" not in stem:
                cut_slug = stem
                recipe_index.setdefault(cut_slug, {})["overview"] = url_path
            else:
                hyphen = stem.index("-")
                cut_slug = stem[:hyphen]
                method_slug = stem[hyphen + 1:]
                recipe_index.setdefault(cut_slug, {})[method_slug] = url_path
                m = _profile_re.search(content)
                if m:
                    cut_method_profiles.setdefault(cut_slug, {})[method_slug] = m.group(1).strip()
                    if cut_slug not in cut_profiles:
                        cut_profiles[cut_slug] = m.group(1).strip()
                titles = _extract_recipe_titles(content)
                if titles:
                    recipe_titles.setdefault(cut_slug, {})[method_slug] = titles

    return recipe_index, cut_profiles, cut_profiles_sv, cut_method_profiles, recipe_titles


# Category display data (mirrors cooking_data.py MeatCategory definitions)
_CATEGORY_META = {
    "beef":       {"icon": "🥩", "color": "#8B0000", "name_sv": "Nötkött"},
    "pork":       {"icon": "🐷", "color": "#FFB6C1", "name_sv": "Fläskkött"},
    "poultry":    {"icon": "🍗", "color": "#FFD700", "name_sv": "Fågel"},
    "fish":       {"icon": "🐟", "color": "#4682B4", "name_sv": "Fisk"},
    "lamb":       {"icon": "🐑", "color": "#800020", "name_sv": "Lamm"},
    "game":       {"icon": "🦌", "color": "#2F4F4F", "name_sv": "Vilt"},
    "vegetables": {"icon": "🥬", "color": "#228B22", "name_sv": "Grönsaker"},
}

# Swedish names for meat-level groupings (meat id → Swedish name)
_MEAT_NAME_SV = {
    "cow":            "Nöt",
    "pig":            "Gris",
    "chicken":        "Kyckling",
    "turkey":         "Kalkon",
    "duck":           "And",
    "goose":          "Gås",
    "lamb":           "Lamm",
    "salmon":         "Lax",
    "white_fish":     "Vit fisk",
    "tuna":           "Tonfisk",
    "shellfish":      "Skaldjur",
    "venison":        "Hjort",
    "reindeer":       "Ren",
    "moose":          "Älg",
    "wild_boar":      "Vildsvin",
    "rabbit":         "Kanin",
    "ostrich":        "Struts",
    "kangaroo":       "Känguru",
    "bison":          "Bison",
    "buffalo":        "Buffel",
    "mutton":         "Får",
    "goat":           "Get",
    "root_vegetables":"Rotfrukter",
    "green_vegetables":"Gröna grönsaker",
    "alliums":        "Lökväxter",
    "mushrooms":      "Svamp",
    "squash":         "Squash",
    "peppers":        "Paprika",
    "eggplant":       "Aubergine",
    "cruciferous":    "Kålväxter",
    "tomatoes":       "Tomater",
    "corn":           "Majs",
}

# Swedish names for cut_type-level groupings (cut_type display name → Swedish name)
_CUT_TYPE_NAME_SV = {
    "Steaks":           "Biffar",
    "Roasts":           "Stekar",
    "Braising Cuts":    "Grytbitar",
    "Ground":           "Färs",
    "Offal":            "Innanmäte",
    "Other / Offal":    "Övrigt / Innanmäte",
    "Chops":            "Kotletter",
    "Chops & Tenderloin":"Kotletter & Filé",
    "Ribs":             "Revben",
    "Ham":              "Skinka",
    "Dark Meat":        "Mörkt kött",
    "Whole":            "Hel",
    "Breast":           "Bröst",
    "Legs":             "Ben",
}

_DONENESS_ICONS = {
    "rare": "🔴", "blodig": "🔴",
    "medium_rare": "🟠",
    "medium": "🟡",
    "medium_well": "🟤",
    "well_done": "⚪", "genomstekt": "⚪",
    "pulled": "🍖", "långkokt": "🍖",
    "safe": "✅",
    "dark_meat_optimal": "🍗",
    "thigh_optimal": "🍗",
    "thigh_rendered": "🦢",
    "leg_rendered": "🦆",
    "confit": "🦆",
    "crispy": "🥓",
    "heated_through": "♨️",
    "done": "✓",
    "tender": "🥔",
    "crisp_tender": "🥦",
    "caramelized": "🧅",
    "charred": "🔥",
    "just_cooked": "🦐",
    "braised_tender": "🐙",
    "quick_sear": "⚡",
}


def build_experimental_tree(base_dir):
    """Build the EXP_TREE and EXP_DONENESS_OPTIONS from KCE:CUT tags.

    Reads every ``<!-- KCE:CUT ... -->`` tagged cut overview file and assembles
    the same JSON structure that MEAT_CATEGORIES uses, so the experimental
    MEATER path can be driven entirely by the cut files — no cooking_data.py
    import needed.

    Returns:
        exp_tree: {category_id: {id, name, icon, color, meats: [...]}}
        exp_doneness: {doneness_name: {value, name, icon, temp_c, temp_f, ...}}
    """
    repo_root = os.path.abspath(os.path.join(base_dir, "..", ".."))
    docs_recipe_dir = os.path.join(repo_root, "docs", "recipe_research")
    www_recipe_dir = os.path.join(base_dir, "www", "recipes")

    if os.path.isdir(docs_recipe_dir):
        recipe_dir = docs_recipe_dir
    elif os.path.isdir(www_recipe_dir):
        recipe_dir = www_recipe_dir
    else:
        return {}, {}

    _excluded = {
        "README.md", "RECIPE_COLLECTION_TOR.md",
        "RECIPE_ANALYSIS_TOR.md", "SOURCE_SURVEY.md",
    }

    # category_key → {meta, _meats: {meat_key → {meta, _cut_types: {ct_key → {meta, cuts: []}}}}}
    cats = {}
    exp_doneness = {}

    for root, _dirs, files in os.walk(recipe_dir):
        for filename in sorted(files):
            if not filename.endswith(".md") or filename in _excluded:
                continue
            # Only cut overview files (no hyphen in stem)
            stem = filename[:-3]
            if "-" in stem:
                continue

            try:
                content = open(os.path.join(root, filename), encoding="utf-8").read()
            except Exception:
                continue

            data = _parse_kce_tag(content, "CUT")
            if data is None:
                continue

            category = data.get("category")
            meat = data.get("meat")
            cut_type_name = data.get("cut_type")
            slug = data.get("slug") or stem
            name = data.get("name") or slug.replace("_", " ").title()
            name_sv = data.get("name_sv")
            description_sv = data.get("description_sv")
            rec_doneness = data.get("recommended_doneness")
            methods = data.get("methods") or []
            doneness_list = data.get("doneness") or []
            usda_safe_c = data.get("usda_safe_c")
            usda_safe_f = data.get("usda_safe_f")

            if not (category and meat and cut_type_name):
                continue

            # Collect doneness option definitions
            doneness_keys = []
            for d in doneness_list:
                if not isinstance(d, dict):
                    continue
                d_name = d.get("name")
                if not d_name:
                    continue
                doneness_keys.append(d_name)
                if d_name not in exp_doneness:
                    target_c = d.get("target_c")
                    if d.get("usda_safe"):
                        safety_level = "safe"
                    elif target_c is not None and target_c < 52:
                        safety_level = "unsafe"
                    elif not d.get("usda_safe") and target_c is not None:
                        safety_level = "caution"
                    else:
                        safety_level = None
                    entry = {
                        "value": d_name,
                        "name": d_name.replace("_", " ").title(),
                        "icon": _DONENESS_ICONS.get(d_name, "🔥"),
                        "description": None,
                        "temp_c": target_c,
                        "temp_f": d.get("target_f"),
                        "safety_level": safety_level,
                    }
                    if d.get("name_sv"):
                        entry["name_sv"] = d["name_sv"]
                    exp_doneness[d_name] = entry

            # Build hierarchy
            if category not in cats:
                meta = _CATEGORY_META.get(category, {"icon": "🍖", "color": "#888888"})
                cats[category] = {
                    "id": category,
                    "name": category.title(),
                    "name_sv": meta.get("name_sv"),
                    "icon": meta["icon"],
                    "color": meta["color"],
                    "_meats": {},
                }

            cat = cats[category]
            if meat not in cat["_meats"]:
                meat_entry = {
                    "id": meat,
                    "name": meat.replace("_", " ").title(),
                    "_cut_types": {},
                }
                meat_sv = _MEAT_NAME_SV.get(meat)
                if meat_sv:
                    meat_entry["name_sv"] = meat_sv
                cat["_meats"][meat] = meat_entry

            meat_obj = cat["_meats"][meat]

            # Normalise cut_type to a safe id: lowercase, spaces/slashes → underscore
            ct_id = re.sub(r"[^a-z0-9]+", "_", cut_type_name.lower()).strip("_")
            if ct_id not in meat_obj["_cut_types"]:
                ct_entry = {
                    "id": ct_id,
                    "name": cut_type_name,
                    "cuts": [],
                }
                ct_sv = _CUT_TYPE_NAME_SV.get(cut_type_name)
                if ct_sv:
                    ct_entry["name_sv"] = ct_sv
                meat_obj["_cut_types"][ct_id] = ct_entry

            cut_obj = {
                "id": slug,
                "name": name,
                "slug": slug,
                "doneness": doneness_keys,
            }
            if name_sv:
                cut_obj["name_sv"] = name_sv
            if description_sv:
                cut_obj["description_sv"] = description_sv
            if rec_doneness:
                cut_obj["recommended_doneness"] = rec_doneness
            if methods:
                cut_obj["supported_methods"] = methods
            if usda_safe_c is not None:
                cut_obj["usda_safe_c"] = usda_safe_c
            if usda_safe_f is not None:
                cut_obj["usda_safe_f"] = usda_safe_f

            meat_obj["_cut_types"][ct_id]["cuts"].append(cut_obj)

    # Flatten private _meats/_cut_types dicts to lists (matching MEAT_CATEGORIES shape)
    exp_tree = {}
    for cat_key, cat in cats.items():
        meats_list = []
        for meat_obj in cat["_meats"].values():
            cut_types_list = list(meat_obj["_cut_types"].values())
            # Remove the private key
            for ct in cut_types_list:
                ct.pop("_cut_types", None)
            meat_entry = {
                "id": meat_obj["id"],
                "name": meat_obj["name"],
                "cutTypes": cut_types_list,
            }
            if meat_obj.get("name_sv"):
                meat_entry["name_sv"] = meat_obj["name_sv"]
            meats_list.append(meat_entry)
        cat_entry = {
            "id": cat["id"],
            "name": cat["name"],
            "icon": cat["icon"],
            "color": cat["color"],
            "meats": meats_list,
        }
        if cat.get("name_sv"):
            cat_entry["name_sv"] = cat["name_sv"]
        exp_tree[cat_key] = cat_entry

    return exp_tree, exp_doneness


def copy_recipe_files_to_www(base_dir):
    """Copy recipe markdown files from docs/ to www/ for serving by HA.

    Copies:
      docs/recipe_research/ → www/recipes/

    Only runs in the developer environment (when docs/recipe_research/ exists).
    On real HA installs, www/recipes/ is pre-populated by the HACS package and
    must NOT be wiped — so this function is a no-op when the source is absent.
    """
    repo_root = os.path.abspath(os.path.join(base_dir, "..", ".."))

    _trees = [
        (
            os.path.join(repo_root, "docs", "recipe_research"),
            os.path.join(base_dir, "www", "recipes"),
        ),
    ]

    _excluded = {
        "README.md", "RECIPE_COLLECTION_TOR.md",
        "RECIPE_ANALYSIS_TOR.md", "SOURCE_SURVEY.md",
    }

    for recipe_dir, www_recipes_dir in _trees:
        if not os.path.isdir(recipe_dir):
            # On HA installs the www/ directory is already in place from the
            # HACS package.  Do NOT delete it; just leave it as-is.
            continue

        # Remove and recreate target directory for a clean copy
        if os.path.exists(www_recipes_dir):
            shutil.rmtree(www_recipes_dir)

        for root, _dirs, files in os.walk(recipe_dir):
            for filename in files:
                if not filename.endswith(".md") or filename in _excluded:
                    continue
                src = os.path.join(root, filename)
                rel = os.path.relpath(src, recipe_dir)
                dst = os.path.join(www_recipes_dir, rel)
                os.makedirs(os.path.dirname(dst), exist_ok=True)
                shutil.copy2(src, dst)

        count = sum(
            len([f for f in files if f.endswith(".md")])
            for _, _, files in os.walk(www_recipes_dir)
        )
        label = os.path.basename(www_recipes_dir)
        print(f"  Copied {count} recipe files → www/{label}/")


def generate_js_data():
    """Generate the JavaScript data section."""
    _load_cooking_data()
    
    base_dir = os.path.dirname(os.path.abspath(__file__))
    
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
    
    # Load Ninja Combi recipes
    ninja_combi_recipes = []
    try:
        import importlib.util
        ninja_spec = importlib.util.spec_from_file_location(
            "ninja_combi_data",
            os.path.join(base_dir, "ninja_combi_data.py")
        )
        ninja_module = importlib.util.module_from_spec(ninja_spec)
        ninja_spec.loader.exec_module(ninja_module)
        
        for recipe in ninja_module.NINJA_COMBI_RECIPES:
            ninja_combi_recipes.append(recipe_to_js(recipe))
    except Exception as e:
        print(f"Warning: Could not load Ninja Combi recipes: {e}")
    
    # Load AI Recipe Builder data
    ai_cooking_styles = []
    ai_ingredients = {}
    ai_cuisine_ingredients = {}
    ai_cuisine_to_region = {}
    try:
        import importlib.util
        ai_data_spec = importlib.util.spec_from_file_location(
            "ai_recipe_data",
            os.path.join(base_dir, "ai_recipe_data.py")
        )
        ai_data_module = importlib.util.module_from_spec(ai_data_spec)
        ai_data_spec.loader.exec_module(ai_data_module)
        
        ai_cooking_styles = ai_data_module.COOKING_STYLES
        ai_ingredients = ai_data_module.COMMON_INGREDIENTS
        ai_cuisine_ingredients = ai_data_module.CUISINE_INGREDIENTS
        ai_cuisine_to_region = ai_data_module.CUISINE_TO_REGION
        ai_ingredient_categories = getattr(ai_data_module, 'INGREDIENT_CATEGORIES', {})
        ai_category_labels = getattr(ai_data_module, 'CATEGORY_LABELS', {})
        ai_category_labels_sv = getattr(ai_data_module, 'CATEGORY_LABELS_SV', {})
        ai_category_order = getattr(ai_data_module, 'CATEGORY_ORDER', [])
        ai_assumed_staples = getattr(ai_data_module, 'ASSUMED_STAPLES', [])
        ai_assumed_staples_sv = getattr(ai_data_module, 'ASSUMED_STAPLES_SV', [])
        ai_ingredient_names_sv = getattr(ai_data_module, 'INGREDIENT_NAMES_SV', {})
    except Exception as e:
        print(f"Warning: Could not load AI Recipe Builder data: {e}")
    
    # Enrich cuisine ingredients with category from INGREDIENT_CATEGORIES map
    if ai_ingredient_categories:
        enriched_cuisine = {}
        for cuisine_id, ings in ai_cuisine_ingredients.items():
            enriched = []
            for ing in ings:
                cat = ai_ingredient_categories.get(ing["id"], "s")  # default to spices
                enriched.append({"id": ing["id"], "name": ing["name"], "cat": cat})
            enriched_cuisine[cuisine_id] = enriched
        ai_cuisine_ingredients = enriched_cuisine
    
    # Load measurement systems from measurements.py
    measurement_systems = {}
    try:
        import importlib.util
        meas_spec = importlib.util.spec_from_file_location(
            "measurements",
            os.path.join(base_dir, "measurements.py")
        )
        meas_module = importlib.util.module_from_spec(meas_spec)
        sys.modules["measurements"] = meas_module  # Required for dataclass resolution
        meas_spec.loader.exec_module(meas_module)
        measurement_systems = meas_module.get_measurement_systems_js()
    except Exception as e:
        print(f"Warning: Could not load measurement systems: {e}")
    
    # Load translation files from i18n/
    translations = {}
    i18n_dir = os.path.join(base_dir, "i18n")
    if os.path.isdir(i18n_dir):
        for filename in sorted(os.listdir(i18n_dir)):
            if filename.endswith(".json"):
                lang_code = filename[:-5]  # e.g. "sv", "en"
                filepath = os.path.join(i18n_dir, filename)
                try:
                    with open(filepath, "r", encoding="utf-8") as f:
                        translations[lang_code] = json.load(f)
                except Exception as e:
                    print(f"Warning: Could not load translation {filename}: {e}")

    # Build recipe index from docs/recipe_research/
    recipe_index, cut_profiles, cut_profiles_sv, cut_method_profiles, recipe_titles = build_recipe_index(base_dir)
    print(f"  Recipe index: {sum(len(v) for v in recipe_index.values())} files across {len(recipe_index)} cuts")

    # Report international cut → recipe coverage. The MEATER path is locked to
    # international data (see panel-class-template.js _getDataCategories), and every international MeatCut.name is expected to
    # match a recipe filename slug under docs/recipe_research/. Cuts with no
    # match simply show no recipe card — that is correct behaviour, not an
    # error. We surface the breakdown so coverage can be tracked over time.
    int_matched = []
    int_unmatched = []
    for cat in _INT_CATEGORIES:
        for meat in cat.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    explicit = getattr(cut, "recipe_slug", None)
                    key = explicit or cut.name
                    if key in recipe_index:
                        int_matched.append(cut.name)
                    else:
                        int_unmatched.append(cut.name)
    print(
        f"  International cut → recipe coverage: "
        f"{len(int_matched)} matched, {len(int_unmatched)} unmatched "
        f"(unmatched cuts simply show no recipe card)"
    )

    # Build the experimental tree from KCE:CUT tagged cut files
    exp_tree, exp_doneness = build_experimental_tree(base_dir)
    exp_cut_count = sum(
        len(ct["cuts"])
        for cat in exp_tree.values()
        for meat in cat["meats"]
        for ct in meat["cutTypes"]
    )
    print(
        f"  EXP_TREE: {exp_cut_count} cuts across "
        f"{len(exp_tree)} categories from KCE:CUT tags"
    )

    
    cet_time = get_cet_timestamp()
    
    lines = []
    lines.append(f"// AUTO-GENERATED DATA - DO NOT EDIT")
    lines.append(f"// Generated from cooking_data.py, swedish_cooking_data.py, ninja_combi_data.py,")
    lines.append(f"// measurements.py, and i18n/*.json")
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
    lines.append("")
    lines.append("// Ninja Combi recipes")
    lines.append(f"const NINJA_COMBI_RECIPES = {json.dumps(ninja_combi_recipes, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Cooking Styles")
    lines.append(f"const AI_COOKING_STYLES = {json.dumps(ai_cooking_styles, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Common Ingredients")
    lines.append(f"const AI_INGREDIENTS = {json.dumps(ai_ingredients, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Cuisine-specific Ingredients (28 per cuisine)")
    lines.append(f"const AI_CUISINE_INGREDIENTS = {json.dumps(ai_cuisine_ingredients, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Cuisine to Region mapping")
    lines.append(f"const AI_CUISINE_TO_REGION = {json.dumps(ai_cuisine_to_region, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Ingredient category labels and order")
    lines.append(f"const AI_CATEGORY_LABELS = {json.dumps(ai_category_labels, indent=2, ensure_ascii=False)};")
    lines.append(f"const AI_CATEGORY_LABELS_SV = {json.dumps(ai_category_labels_sv, indent=2, ensure_ascii=False)};")
    lines.append(f"const AI_CATEGORY_ORDER = {json.dumps(ai_category_order, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Assumed staples (always available, not shown in picker)")
    lines.append(f"const AI_ASSUMED_STAPLES = {json.dumps(ai_assumed_staples, ensure_ascii=False)};")
    lines.append(f"const AI_ASSUMED_STAPLES_SV = {json.dumps(ai_assumed_staples_sv, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Swedish ingredient display names (id → Swedish)")
    lines.append(f"const AI_INGREDIENT_NAMES_SV = {json.dumps(ai_ingredient_names_sv, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Phase 7: Measurement systems (SE, UK, US)")
    lines.append(f"const MEASUREMENT_SYSTEMS = {json.dumps(measurement_systems, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Phase 7: Translation strings (sv, en, ...)")
    lines.append(f"const I18N_STRINGS = {json.dumps(translations, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Recipe research index: cut_slug → { method_slug: url_path }")
    lines.append(f"const RECIPE_INDEX = {json.dumps(recipe_index, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Cut profile texts extracted from recipe research files")
    lines.append(f"const CUT_PROFILES = {json.dumps(cut_profiles, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Swedish cut profile texts — from ## Styckesprofil sections in research files")
    lines.append(f"const CUT_PROFILES_SV = {json.dumps(cut_profiles_sv, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Cut × method profile texts: {cut_slug: {method_slug: description}}")
    lines.append(f"const CUT_METHOD_PROFILES = {json.dumps(cut_method_profiles, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// Recipe titles per cut × method: {cut_slug: {method_slug: [title, ...]}}")
    lines.append(f"const RECIPE_TITLES_INDEX = {json.dumps(recipe_titles, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// MEATER tree — built from KCE:CUT tagged cut files")
    lines.append(f"const EXP_TREE = {json.dumps(exp_tree, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// MEATER doneness options — collected from KCE:CUT doneness blocks")
    lines.append(f"const EXP_DONENESS_OPTIONS = {json.dumps(exp_doneness, indent=2, ensure_ascii=False)};")

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
 * ║    1. Edit cooking_data.py, swedish_cooking_data.py, or ninja_combi_data.py ║
 * ║    2. Run: python3 generate_frontend_data.py                                ║
 * ║                                                                              ║
 * ║  PANEL_VERSION is automatically kept in sync between const.py and this file ║
 * ║                                                                              ║
 * ╚══════════════════════════════════════════════════════════════════════════════╝
 * 
 * AUTO-GENERATED: {cet_time}
 * Data generated from cooking_data.py, swedish_cooking_data.py, and ninja_combi_data.py
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
  { value: "braise", name: "Braise" },
  { value: "air_fryer", name: "Air Fryer" },
  { value: "sous_vide", name: "Sous Vide" },
  { value: "slow_cooker", name: "Slow Cooker" },
];

"""
    new_content += class_code

    # Copy recipe files to www/recipes/ so they can be served by HA
    copy_recipe_files_to_www(base_dir)
    
    # Update panel version in JS - increment from const.py version
    # Read current version from const.py first
    const_file = os.path.join(base_dir, "const.py")
    current_version = "55"  # Default fallback
    if os.path.exists(const_file):
        with open(const_file, "r", encoding="utf-8") as f:
            const_content = f.read()
        
        const_version_line = 'PANEL_VERSION = "'
        const_idx = const_content.find(const_version_line)
        if const_idx != -1:
            const_end = const_content.find('"', const_idx + len(const_version_line))
            current_version = const_content[const_idx + len(const_version_line):const_end]
    
    # Increment version for cache busting
    new_version = str(int(current_version) + 1)
    
    old_version_line = 'const PANEL_VERSION = "'
    version_idx = new_content.find(old_version_line)
    if version_idx != -1:
        version_end = new_content.find('"', version_idx + len(old_version_line))
        old_version = new_content[version_idx + len(old_version_line):version_end]
        new_content = new_content[:version_idx + len(old_version_line)] + new_version + new_content[version_end:]
        print(f"Updated PANEL_VERSION in JS: {old_version} -> {new_version}")
    
    # Write new panel
    with open(panel_file, "w", encoding="utf-8") as f:
        f.write(new_content)
    
    # Also update const.py to keep PANEL_VERSION in sync
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
    
    # Count Ninja Combi recipes
    try:
        base_dir = os.path.dirname(os.path.abspath(__file__))
        import importlib.util
        ninja_spec = importlib.util.spec_from_file_location(
            "ninja_combi_data",
            os.path.join(base_dir, "ninja_combi_data.py")
        )
        ninja_module = importlib.util.module_from_spec(ninja_spec)
        ninja_spec.loader.exec_module(ninja_module)
        print(f"  Ninja Combi recipes: {len(ninja_module.NINJA_COMBI_RECIPES)}")
    except Exception as e:
        print(f"  Ninja Combi recipes: Error loading ({e})")
    
    return True


if __name__ == "__main__":
    if len(sys.argv) > 1 and sys.argv[1] == "--data-only":
        print(generate_js_data())
    else:
        success = regenerate_panel()
        sys.exit(0 if success else 1)
