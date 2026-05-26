#!/usr/bin/env python3
"""
Generate frontend cooking data from backend Python files.

This script generates the JavaScript cooking data constants that are embedded
in kitchen-cooking-panel.js from:
- www/recipes/ KCE:CUT tagged files (EXP_TREE — single source of truth)
- ninja_combi_data.py (Ninja Combi recipes)
- measurements.py (measurement systems)
- i18n/*.json (translation strings)

Run this script at install/update time to ensure frontend matches backend.

Usage:
    python3 generate_frontend_data.py
    
This will regenerate www/kitchen-cooking-panel.js with data from the backend.
"""

import json
import re
import sys
import os
import yaml
from datetime import datetime, timezone, timedelta

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


# ---------------------------------------------------------------------------
# Protein name → subcat patterns used by build_cuisine_data().
#
# When a cuisine ingredient has cat="p" and its `id` is not a well-known key
# in PROTEIN_TO_SUBCAT, we try to infer the tree subcat from the ingredient's
# `name` field.  This lets cuisine files use file-specific IDs (e.g.
# ua_pork_sig, vn_beef_sig) without breaking protein tree highlighting.
#
# Rules (ordered — first match wins, case-insensitive):
#   • Game patterns come first to catch "wild boar" before the plain "boar" rule
#   • Generic "fish" is last (catches any remaining fish/seafood names)
# ---------------------------------------------------------------------------
# Each tuple: (pattern, subcat, base_id)
# base_id is the canonical species keyword used to prefix-match recipe tree cut IDs
# (e.g. "cod" matches "cod_fillet"; "salmon" matches "salmon_fillet", "salmon_steak").
# The JS stores base_id in cuisineCommonProteinIds so expanded subcat cut badges light up
# for cuisines that use file-scoped ingredient IDs (e.g. nor_prot_sig_cod, ua_pork_sig).
_PROTEIN_NAME_PATTERNS = [
    # Game
    (r'wild[\s\-]?boar',   'game',    'wild_boar'),
    (r'\bvenison\b',       'game',    'venison'),
    (r'\bmoose\b',         'game',    'moose'),
    (r'\belk\b',           'game',    'elk'),
    (r'\breindeer\b',      'game',    'reindeer'),
    (r'\bcaribou\b',       'game',    'caribou'),
    (r'\bdeer\b',          'game',    'deer'),
    (r'\bhare\b',          'game',    'hare'),
    (r'\bkangaroo\b',      'game',    'kangaroo'),
    (r'\brabbit\b',        'game',    'rabbit'),
    (r'\bboar\b',          'game',    'boar'),
    (r'\bbushmeat\b',      'game',    'bushmeat'),
    (r'\bgame\b',          'game',    'game'),    # "Wild game", "Game meat", etc.
    (r'\blamb\b',          'lamb',    'lamb'),
    (r'\bmutton\b',        'lamb',    'mutton'),
    (r'\bsheep\b',         'lamb',    'sheep'),
    (r'\bgoat\b',          'lamb',    'goat'),
    # Beef
    (r'\bbeef\b',          'beef',    'beef'),
    (r'\bveal\b',          'beef',    'veal'),
    (r'\bcattle\b',        'beef',    'cattle'),
    (r'\box\b',            'beef',    'ox'),
    (r'\bwagyu\b',         'beef',    'wagyu'),
    (r'\bangus\b',         'beef',    'angus'),
    (r'\bzebu\b',          'beef',    'zebu'),
    (r'\byak\b',           'beef',    'yak'),
    # Pork
    (r'\bpork\b',          'pork',    'pork'),
    (r'\bpig\b',           'pork',    'pig'),
    (r'\bhog\b',           'pork',    'hog'),
    (r'\bsuckling\b',      'pork',    'suckling'),
    (r'\blard\b',          'pork',    'lard'),
    # Poultry
    (r'\bchicken\b',       'poultry', 'chicken'),
    (r'\bturkey\b',        'poultry', 'turkey'),
    (r'\bduck\b',          'poultry', 'duck'),
    (r'\bgoose\b',         'poultry', 'goose'),
    (r'\bgeese\b',         'poultry', 'geese'),
    (r'\bquail\b',         'poultry', 'quail'),
    (r'guinea\s*fowl',     'poultry', 'guinea_fowl'),
    (r'\bpartridge\b',     'poultry', 'partridge'),
    (r'\bpheasant\b',      'poultry', 'pheasant'),
    (r'\bpigeon\b',        'poultry', 'pigeon'),
    (r'\bsquab\b',         'poultry', 'squab'),
    (r'\bcapon\b',         'poultry', 'capon'),
    (r'\bpoussin\b',       'poultry', 'poussin'),
    (r'\bmallard\b',       'poultry', 'mallard'),
    # Fish & seafood (specific species / types first, generic "fish" last)
    (r'\bsalmon\b',        'fish',    'salmon'),
    (r'\btrout\b',         'fish',    'trout'),
    (r'\bherring\b',       'fish',    'herring'),
    (r'\bmackerel\b',      'fish',    'mackerel'),
    (r'\bsardine',         'fish',    'sardine'),   # sardine / sardines
    (r'\bancho[vy]',       'fish',    'anchovy'),   # anchovy / anchovies
    (r'\btuna\b',          'fish',    'tuna'),
    (r'\bcod\b',           'fish',    'cod'),
    (r'\bcatfish\b',       'fish',    'catfish'),
    (r'\bshrimp\b',        'fish',    'shrimp'),
    (r'\bprawn\b',         'fish',    'prawn'),
    (r'\bcrab\b',          'fish',    'crab'),
    (r'\blobster\b',       'fish',    'lobster'),
    (r'\bmussel\b',        'fish',    'mussel'),
    (r'\bclam\b',          'fish',    'clam'),
    (r'\boyster\b',        'fish',    'oyster'),
    (r'\boctopus\b',       'fish',    'octopus'),
    (r'\bsquid\b',         'fish',    'squid'),
    (r'\bcuttlefish\b',    'fish',    'cuttlefish'),
    (r'\blangoustine\b',   'fish',    'langoustine'),
    (r'\bcrayfish\b',      'fish',    'crayfish'),
    (r'\bcrawfish\b',      'fish',    'crawfish'),
    (r'\bscallop\b',       'fish',    'scallop'),
    (r'sea\s*bass',        'fish',    'sea_bass'),
    (r'sea\s*bream',       'fish',    'sea_bream'),
    (r'\bsnapper\b',       'fish',    'snapper'),
    (r'\bbass\b',          'fish',    'bass'),
    (r'\bbream\b',         'fish',    'bream'),
    (r'\bcarp\b',          'fish',    'carp'),
    (r'\btilapia\b',       'fish',    'tilapia'),
    (r'\bperch\b',         'fish',    'perch'),
    (r'\bpike\b',          'fish',    'pike'),
    (r'\bzander\b',        'fish',    'zander'),
    (r'\bpollock\b',       'fish',    'pollock'),
    (r'\bhalibut\b',       'fish',    'halibut'),
    (r'\bflounder\b',      'fish',    'flounder'),
    (r'\bsole\b',          'fish',    'sole'),
    (r'\bhake\b',          'fish',    'hake'),
    (r'\bhaddock\b',       'fish',    'haddock'),
    (r'\beel\b',           'fish',    'eel'),
    (r'\bwolffish\b',      'fish',    'wolffish'),
    (r'\bwhitefish\b',     'fish',    'whitefish'),
    (r'\bvendace\b',       'fish',    'vendace'),
    (r'\bhamachi\b',       'fish',    'hamachi'),
    (r'\byellowtail\b',    'fish',    'yellowtail'),
    (r'\bhamour\b',        'fish',    'hamour'),
    (r'\bkingfish\b',      'fish',    'kingfish'),
    (r'\bbarramundi\b',    'fish',    'barramundi'),
    (r'\bpikeperch\b',     'fish',    'pikeperch'),
    (r'\bsprat\b',         'fish',    'sprat'),
    (r'\bgoby\b',          'fish',    'goby'),
    (r'\bfish\b',          'fish',    'fish'),   # generic — must be last
]
_PROTEIN_NAME_RE = [(re.compile(pat, re.IGNORECASE), sc, bid) for pat, sc, bid in _PROTEIN_NAME_PATTERNS]


def build_cuisine_data(base_dir):
    """Read www/cuisines/*.md KCE:CUISINE files (ground truth for the AI recipe builder).

    Files live in docs/cuisines/ (www/cuisines is a symlink to that directory).
    Adding a new file is enough — no other file needs to be edited.

    File format uses standard YAML frontmatter followed by markdown sections:

        ---
        KCE: CUISINE
        id: swedish
        name: Swedish
        name_sv: Svensk
        icon: 🇸🇪
        region: nordic
        region_name: Nordic
        region_icon: ❄️
        research_done: 1
        ---

        ## Proteins
        - {id: salmon, grade: signature, rating: 10, name: Salmon, name_sv: "Lax", notes: "..."}
        ...

    Grades:
        signature — identity of the cuisine (lights up protein tree)
        bulk      — high consumption by statistics (lights up protein tree)
        local     — produced/widely used locally (does NOT light up protein tree; hidden under "More")

    Rating (1–10):
        How important the ingredient is within its grade for this cuisine.
        The top 3 per grade per category are shown by default; the rest are hidden under "More".
        Default: 5 if not specified.

    Returns (cuisine_ingredients, cuisine_to_region, cuisine_regions, cuisine_descriptions) where:
        cuisine_ingredients:  {cuisine_id: [{id, name, name_sv?, cat, grade, rating}, ...]}
        cuisine_to_region:    {cuisine_id: region_str}
        cuisine_regions:      [{id, name, icon, cuisines: [{id, name, name_sv?, icon, description?, description_sv?}]}]
                              — ordered by first appearance; drives AI_CUISINE_REGIONS in the JS.
        cuisine_descriptions: {cuisine_id: {description: str, description_sv?: str}}
                              — flat lookup used by AI_CUISINE_DESCRIPTIONS in the JS.
    """
    _section_to_cat = {
        "proteins":                  "p",
        # Produce / Vegetables
        "produce":                   "v",
        "vegetables":                "v",
        # Grains & Starches
        "grains & starches":         "g",
        "grains":                    "g",
        # Dairy, Oils & Sauces
        "dairy, oils & sauces":      "d",
        "dairy & eggs":              "d",
        "dairy":                     "d",
        # Spices, Nuts & Seasonings
        "spices, nuts & seasonings": "s",
        "spices & seasonings":       "s",
        "spices":                    "s",
        "condiments":                "s",
        "other":                     "s",
    }
    _valid_grades = {"signature", "bulk", "local"}

    cuisines_dir = os.path.join(base_dir, "www", "cuisines")
    cuisine_ingredients = {}
    cuisine_to_region = {}
    cuisine_descriptions = {}
    # region_id → {id, name, icon, cuisines: [...]}; ordered dict preserves insertion order
    regions_map = {}

    if not os.path.isdir(cuisines_dir):
        return cuisine_ingredients, cuisine_to_region, [], cuisine_descriptions

    for filename in sorted(os.listdir(cuisines_dir)):
        if not filename.endswith(".md"):
            continue
        filepath = os.path.join(cuisines_dir, filename)
        try:
            with open(filepath, "r", encoding="utf-8") as f:
                content = f.read()
        except Exception as e:
            print(f"Warning: Could not read cuisine file {filename}: {e}")
            continue

        # Parse YAML frontmatter between the first and second "---" lines
        if not content.startswith("---"):
            continue
        end_fm = content.find("\n---", 3)
        if end_fm == -1:
            continue
        fm_text = content[4:end_fm]
        try:
            fm = yaml.safe_load(fm_text)
        except yaml.YAMLError as e:
            print(f"Warning: Could not parse frontmatter in {filename}: {e}")
            continue

        if not isinstance(fm, dict) or fm.get("KCE") != "CUISINE":
            continue

        cuisine_id = fm.get("id")
        if not cuisine_id:
            continue

        region = str(fm.get("region", fm.get("culinary_group", "")))
        cuisine_to_region[cuisine_id] = region

        # Build the region/cuisine tree entry
        cuisine_entry = {"id": cuisine_id, "name": fm.get("name", cuisine_id.replace("_", " ").title())}
        if fm.get("name_sv"):
            cuisine_entry["name_sv"] = fm["name_sv"]
        if fm.get("icon"):
            cuisine_entry["icon"] = fm["icon"]
        if fm.get("description"):
            cuisine_entry["description"] = fm["description"]
        if fm.get("description_sv"):
            cuisine_entry["description_sv"] = fm["description_sv"]

        if region:
            if region not in regions_map:
                regions_map[region] = {
                    "id": region,
                    "name": fm.get("region_name", region.replace("_", " ").title()),
                    "icon": fm.get("region_icon", "🌍"),
                    "cuisines": [],
                }
            regions_map[region]["cuisines"].append(cuisine_entry)

        # Collect description into flat lookup dict
        if fm.get("description"):
            desc_entry = {"description": fm["description"]}
            if fm.get("description_sv"):
                desc_entry["description_sv"] = fm["description_sv"]
            cuisine_descriptions[cuisine_id] = desc_entry

        # Parse ingredient sections from markdown body
        body = content[end_fm + 4:]
        ingredients = []
        current_cat = "s"

        for line in body.splitlines():
            stripped = line.strip()
            # Section header: ## Proteins, ## Vegetables, etc.
            if stripped.startswith("## "):
                section_name = stripped[3:].strip().lower()
                current_cat = _section_to_cat.get(section_name, "s")
                continue
            # Ingredient line: - {id: ..., grade: ..., name: ..., ...}
            if stripped.startswith("- {") and stripped.endswith("}"):
                try:
                    item = yaml.safe_load(stripped[2:])
                except yaml.YAMLError:
                    continue
                if not isinstance(item, dict):
                    continue
                ing_id = item.get("id")
                grade = str(item.get("grade", "local"))
                if not ing_id or grade not in _valid_grades:
                    continue
                entry = {
                    "id": ing_id,
                    "name": item.get("name", ing_id.replace("_", " ").title()),
                    "cat": current_cat,
                    "grade": grade,
                    "rating": int(item.get("rating", 5)),
                }
                if item.get("name_sv"):
                    entry["name_sv"] = item["name_sv"]
                if item.get("notes"):
                    entry["notes"] = item["notes"]
                if item.get("notes_sv"):
                    entry["notes_sv"] = item["notes_sv"]
                # For protein entries, infer the protein-tree subcat from the
                # ingredient name so the JS can exclude these items from the
                # badge area and light up the correct tree button — even when
                # the cuisine file uses a file-specific ID (e.g. ua_pork_sig)
                # that is not a key in AI_PROTEIN_TO_SUBCAT.
                # Also emit base_id (e.g. "cod", "salmon") so the JS can
                # prefix-match recipe tree cut IDs (e.g. "cod_fillet") and
                # highlight the right cut badges inside an expanded subcat.
                if current_cat == "p":
                    for _pat, _sc, _bid in _PROTEIN_NAME_RE:
                        if _pat.search(entry["name"]):
                            entry["subcat"] = _sc
                            entry["base_id"] = _bid
                            break
                ingredients.append(entry)

        if ingredients:
            cuisine_ingredients[cuisine_id] = ingredients

    cuisine_regions = list(regions_map.values())
    return cuisine_ingredients, cuisine_to_region, cuisine_regions, cuisine_descriptions


def build_recipe_index(base_dir, *, recipe_dir=None, url_prefix="recipes"):
    """Scan recipe files and build index, cut profiles, method profiles and recipe titles.

    When ``recipe_dir`` is None the function reads from www/recipes/ — the
    single source of truth for recipe markdown files.

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
        recipe_dir = os.path.join(base_dir, "www", "recipes")
        if not os.path.isdir(recipe_dir):
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
    recipe_dir = os.path.join(base_dir, "www", "recipes")
    if not os.path.isdir(recipe_dir):
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
            rest_time_min = data.get("rest_time_min")
            rest_time_max = data.get("rest_time_max")
            carryover_temp_c = data.get("carryover_temp_c")

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
            if rest_time_min is not None:
                cut_obj["rest_time_min"] = rest_time_min
            if rest_time_max is not None:
                cut_obj["rest_time_max"] = rest_time_max
            if carryover_temp_c is not None:
                cut_obj["carryover_temp_c"] = carryover_temp_c

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

    # Second pass: collect rest/carryover overrides from KCE:CUT_METHOD leaf files
    # and attach them as method_overrides to each cut in the tree.
    method_override_map: dict = {}
    for root, _dirs, files in os.walk(recipe_dir):
        for filename in sorted(files):
            if not filename.endswith(".md"):
                continue
            stem = filename[:-3]
            if "-" not in stem:
                continue
            try:
                content = open(os.path.join(root, filename), encoding="utf-8").read()
            except Exception:
                continue
            mdata = _parse_kce_tag(content, "CUT_METHOD")
            if mdata is None:
                continue
            m_slug = mdata.get("slug") or stem.rsplit("-", 1)[0]
            m_method = mdata.get("method") or (stem.rsplit("-", 1)[1] if "-" in stem else "")
            if not m_slug or not m_method:
                continue
            override = {}
            if mdata.get("rest_time_min") is not None:
                override["rest_time_min"] = mdata["rest_time_min"]
            if mdata.get("rest_time_max") is not None:
                override["rest_time_max"] = mdata["rest_time_max"]
            if mdata.get("carryover_temp_c") is not None:
                override["carryover_temp_c"] = mdata["carryover_temp_c"]
            if override:
                method_override_map.setdefault(m_slug, {})[m_method] = override

    # Attach method_overrides to cuts inside exp_tree
    for cat in exp_tree.values():
        for meat in cat.get("meats", []):
            for ct in meat.get("cutTypes", []):
                for cut in ct.get("cuts", []):
                    slug = cut.get("slug") or cut.get("id")
                    if slug and slug in method_override_map:
                        cut["method_overrides"] = method_override_map[slug]

    return exp_tree, exp_doneness


def generate_js_data():
    """Generate the JavaScript data section."""
    base_dir = os.path.dirname(os.path.abspath(__file__))
    
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
    ai_cuisine_regions = []
    ai_cuisine_descriptions = {}
    ai_ingredient_categories = {}
    ai_category_labels = {}
    ai_category_labels_sv = {}
    ai_category_order = []
    ai_assumed_staples = []
    ai_assumed_staples_sv = []
    ai_ingredient_names_sv = {}
    ai_protein_to_subcat = {}
    ai_generic_protein_ids = []
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
        ai_ingredient_categories = getattr(ai_data_module, 'INGREDIENT_CATEGORIES', {})
        ai_category_labels = getattr(ai_data_module, 'CATEGORY_LABELS', {})
        ai_category_labels_sv = getattr(ai_data_module, 'CATEGORY_LABELS_SV', {})
        ai_category_order = getattr(ai_data_module, 'CATEGORY_ORDER', [])
        ai_assumed_staples = getattr(ai_data_module, 'ASSUMED_STAPLES', [])
        ai_assumed_staples_sv = getattr(ai_data_module, 'ASSUMED_STAPLES_SV', [])
        ai_ingredient_names_sv = getattr(ai_data_module, 'INGREDIENT_NAMES_SV', {})
        ai_protein_to_subcat = getattr(ai_data_module, 'PROTEIN_TO_SUBCAT', {})
        ai_generic_protein_ids = list(getattr(ai_data_module, 'GENERIC_PROTEIN_IDS', set()))
    except Exception as e:
        print(f"Warning: Could not load AI Recipe Builder data: {e}")
    # Derived data; initialised before enrichment so they always exist
    ai_common_ingredients_flat = []
    ai_protein_subcats = {}
    ai_protein_subcat_labels = {}
    ai_protein_subcat_labels_sv = {}

    # Load cuisine ingredients from docs/cuisines/*.md (KCE:CUISINE files) via www/cuisines symlink.
    # These files are the single source of truth for AI_CUISINE_REGIONS and AI_CUISINE_TO_REGION.
    # Adding a new file is all that is needed — no other file must be edited.
    _file_cuisine_ingredients, _file_cuisine_to_region, _file_cuisine_regions, _file_cuisine_descriptions = build_cuisine_data(base_dir)
    if _file_cuisine_ingredients:
        ai_cuisine_ingredients = _file_cuisine_ingredients
        ai_cuisine_to_region = {cid: r for cid, r in _file_cuisine_to_region.items() if r}
        ai_cuisine_regions = _file_cuisine_regions
        ai_cuisine_descriptions = _file_cuisine_descriptions
        print(
            f"  Cuisines: {len(ai_cuisine_ingredients)} cuisine file(s) loaded "
            f"({sum(len(v) for v in ai_cuisine_ingredients.values())} ingredients total)"
        )
    else:
        print("  Cuisines: no docs/cuisines/*.md files found — AI_CUISINE_INGREDIENTS will be empty")

    # Enrich cuisine ingredients with category from INGREDIENT_CATEGORIES map
    # (only for legacy entries without a cat field already set by build_cuisine_data)
    if ai_ingredient_categories:
        enriched_cuisine = {}
        for cuisine_id, ings in ai_cuisine_ingredients.items():
            enriched = []
            for ing in ings:
                # Skip enrichment if cat is already set (e.g. from KCE:CUISINE file)
                if "cat" in ing:
                    enriched.append(ing)
                    continue
                cat = ai_ingredient_categories.get(ing["id"], "s")  # default to spices
                item = {"id": ing["id"], "name": ing["name"], "cat": cat}
                if "grade" in ing:
                    item["grade"] = ing["grade"]
                if "rating" in ing:
                    item["rating"] = ing["rating"]
                enriched.append(item)
            enriched_cuisine[cuisine_id] = enriched
        ai_cuisine_ingredients = enriched_cuisine

    # Build AI_COMMON_INGREDIENTS — a flat array with {id, name, cat, featured} per item.
    # Maps the category-dict structure of COMMON_INGREDIENTS into category codes used by the UI.
    # Note: these items have no grade/rating (they are not cuisine-specific).
    _cat_key_to_code = {
        "proteins": "p",
        "vegetables": "v",
        "grains": "g",
        "dairy": "d",
        "spices": "s",
    }
    ai_common_ingredients_flat = []
    if isinstance(ai_ingredients, dict):
        for cat_key, items in ai_ingredients.items():
            cat_code = _cat_key_to_code.get(cat_key, "s")
            for ing in items:
                enriched_item = {
                    "id": ing["id"],
                    "name": ing["name"],
                    "cat": ai_ingredient_categories.get(ing["id"], cat_code),
                    "featured": ing.get("featured", True),
                }
                ai_common_ingredients_flat.append(enriched_item)

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

    # Build AI_PROTEIN_SUBCATS from the experimental tree.
    # Expose protein categories (beef, pork, poultry, fish, lamb, game) as drill-down groups.
    _protein_categories = {"beef", "pork", "poultry", "fish", "lamb", "game"}
    for cat_id, cat_data in exp_tree.items():
        if cat_id not in _protein_categories:
            continue
        seen_slugs = set()
        cuts_for_cat = []
        for meat in cat_data.get("meats", []):
            for cut_type in meat.get("cutTypes", []):
                for cut in cut_type.get("cuts", []):
                    slug = cut.get("id") or cut.get("slug")
                    if not slug or slug in seen_slugs:
                        continue
                    seen_slugs.add(slug)
                    entry = {
                        "id": slug,
                        "name": cut.get("name", slug.replace("_", " ").title()),
                        "cat": "p",
                    }
                    if cut.get("name_sv"):
                        entry["name_sv"] = cut["name_sv"]
                    cuts_for_cat.append(entry)
        if cuts_for_cat:
            ai_protein_subcats[cat_id] = cuts_for_cat
            ai_protein_subcat_labels[cat_id] = cat_data.get("name", cat_id.title())
            ai_protein_subcat_labels_sv[cat_id] = (
                cat_data.get("name_sv") or cat_data.get("name", cat_id.title())
            )
    print(
        f"  AI_PROTEIN_SUBCATS: {sum(len(v) for v in ai_protein_subcats.values())} cuts "
        f"across {len(ai_protein_subcats)} protein categories"
    )

    
    cet_time = get_cet_timestamp()
    
    lines = []
    lines.append(f"// AUTO-GENERATED DATA - DO NOT EDIT")
    lines.append(f"// Generated from www/recipes/ KCE:CUT files, ninja_combi_data.py,")
    lines.append(f"// measurements.py, and i18n/*.json")
    lines.append(f"// Last generated: {cet_time}")
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
    lines.append("// AI Recipe Builder - Common Ingredients (flat array with cat + common flags)")
    lines.append(f"const AI_COMMON_INGREDIENTS = {json.dumps(ai_common_ingredients_flat, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Protein subcategories derived from recipe files")
    lines.append(f"const AI_PROTEIN_SUBCATS = {json.dumps(ai_protein_subcats, indent=2, ensure_ascii=False)};")
    lines.append(f"const AI_PROTEIN_SUBCAT_LABELS = {json.dumps(ai_protein_subcat_labels, indent=2, ensure_ascii=False)};")
    lines.append(f"const AI_PROTEIN_SUBCAT_LABELS_SV = {json.dumps(ai_protein_subcat_labels_sv, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Cuisine-specific Ingredients (28 per cuisine)")
    lines.append(f"const AI_CUISINE_INGREDIENTS = {json.dumps(ai_cuisine_ingredients, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Cuisine to Region mapping")
    lines.append(f"const AI_CUISINE_TO_REGION = {json.dumps(ai_cuisine_to_region, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Region/cuisine tree (ground truth: docs/cuisines/*.md)")
    lines.append(f"const AI_CUISINE_REGIONS = {json.dumps(ai_cuisine_regions, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Cuisine descriptions {cuisine_id: {description, description_sv?}}")
    lines.append(f"const AI_CUISINE_DESCRIPTIONS = {json.dumps(ai_cuisine_descriptions, indent=2, ensure_ascii=False)};")
    lines.append("")
    lines.append("// AI Recipe Builder - Protein ingredient → subcat key (beef/pork/poultry/fish/lamb/game)")
    lines.append(f"const AI_PROTEIN_TO_SUBCAT = {json.dumps(ai_protein_to_subcat, indent=2, ensure_ascii=False)};")
    lines.append("// Generic protein IDs that duplicate subcat button labels — filtered from badge list")
    lines.append(f"const AI_GENERIC_PROTEIN_IDS = {json.dumps(ai_generic_protein_ids, ensure_ascii=False)};")
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
    lines.append("")
    lines.append("// Recipe index: slug (or slug-method) → relative path under www/recipes/")
    lines.append("// Used by the Android app to load the correct .md asset file.")
    recipe_index = _build_recipe_index(base_dir)
    lines.append(f"const EXP_RECIPE_INDEX = {json.dumps(recipe_index, indent=2, ensure_ascii=False)};")

    return "\n".join(lines)


def _build_recipe_index(base_dir):
    """Return {slug: relative_path, slug-method: relative_path, ...} for all KCE:CUT .md files."""
    import re as _re
    recipes_dir = os.path.join(base_dir, "www", "recipes")
    index = {}
    if not os.path.isdir(recipes_dir):
        return index
    for root, dirs, files in os.walk(recipes_dir):
        dirs.sort()
        for fname in sorted(files):
            if not fname.endswith(".md"):
                continue
            fpath = os.path.join(root, fname)
            try:
                with open(fpath, encoding="utf-8") as fp:
                    head = fp.read(2000)  # only need the frontmatter
            except Exception:
                continue
            # Must be a KCE:CUT or KCE:CUT_METHOD file
            if "KCE:CUT" not in head:
                continue
            slug_m = _re.search(r"slug:\s*(\S+)", head)
            if not slug_m:
                continue
            slug = slug_m.group(1)
            method_m = _re.search(r"method:\s*(\S+)", head)
            key = f"{slug}-{method_m.group(1)}" if method_m else slug
            rel = os.path.relpath(fpath, recipes_dir).replace("\\", "/")
            index[key] = rel
    return index


def regenerate_panel():
    """Regenerate the panel JS file with fresh data from backend.
    
    This function:
    1. Reads the class code from panel-class-template.js (the source of truth for UI code)
    2. Generates fresh data constants from www/recipes/ KCE:CUT files
    3. Combines them into a new kitchen-cooking-panel.js
    
    The template file contains the UI class code and is updated by developers.
    The data constants are generated from www/recipes/ recipe markdown files.
    """
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
 * ║    1. Edit www/recipes/ KCE:CUT markdown files (single source of truth)     ║
 * ║    2. Run: python3 generate_frontend_data.py                                ║
 * ║                                                                              ║
 * ║  PANEL_VERSION is automatically kept in sync between const.py and this file ║
 * ║                                                                              ║
 * ╚══════════════════════════════════════════════════════════════════════════════╝
 * 
 * AUTO-GENERATED: {cet_time}
 * Data generated from www/recipes/ KCE:CUT files and ninja_combi_data.py
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

    # Copy the generated panel JS to the Android assets directory so the Android
    # app (CookingDataRepository) can read EXP_TREE / EXP_DONENESS_OPTIONS from it.
    # The assets copy is git-ignored — kitchen-cooking-panel.js lives only in www/
    # in the repo; the copy is a build artifact produced by this generator.
    import shutil as _shutil
    android_assets = os.path.normpath(
        os.path.join(base_dir, "..", "..", "android", "app", "src", "main", "assets")
    )
    if os.path.isdir(android_assets):
        # Write Android-specific copy with CDN import replaced by local asset.
        # kitchen-cooking-panel.js imports LitElement from https://unpkg.com/…
        # which requires internet access and is forbidden per ToR §4.2.
        # The Android copy imports from ./lit-element-bundle.js instead
        # (a bundled file tracked in git alongside this generator).
        with open(panel_file, "r", encoding="utf-8") as _f:
            _panel_src = _f.read()
        _panel_android = _panel_src.replace(
            '"https://unpkg.com/lit-element@2.4.0/lit-element.js?module"',
            '"./lit-element-bundle.js"'
        )
        android_panel = os.path.join(android_assets, "kitchen-cooking-panel.js")
        with open(android_panel, "w", encoding="utf-8") as _f:
            _f.write(_panel_android)
        print(f"Copied panel JS to Android assets ({android_assets}) [CDN import rewritten to local]")
        # Also copy the recipe .md files so the Android app can display recipe content.
        recipes_src = os.path.join(base_dir, "www", "recipes")
        recipes_dst = os.path.join(android_assets, "recipes")
        if os.path.isdir(recipes_src):
            if os.path.isdir(recipes_dst):
                _shutil.rmtree(recipes_dst)
            _shutil.copytree(recipes_src, recipes_dst)
            print(f"Copied recipe files to Android assets ({recipes_dst})")
    else:
        print(f"  Note: Android assets dir not found, skipping copy to Android")

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
