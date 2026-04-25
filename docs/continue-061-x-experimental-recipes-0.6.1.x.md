# Branch Timeline: continue-061-x-experimental-recipes — v0.6.1.x

Branch: `copilot/continue-061-x-experimental-recipes`
Version series: `0.6.1.x`
Continued from: `copilot/implement-phase-8` (same version series)
Started: 2026-04-24

---

## Goal

Complete all remaining recipe leaf stubs under `docs/recipe_research/`. The previous
branch (`implement-phase-8`) accumulated a large backlog of unfilled or partially-filled
leaves. This branch finishes them.

---

## Remaining work at branch start

### Poultry — missing 3rd source (13 files)

- `poultry/chicken/chicken_breast-pan_sear.md`
- `poultry/chicken/chicken_burger-air_fryer.md`
- `poultry/chicken/chicken_thigh-grill.md`
- `poultry/chicken/chicken_thigh-oven_roast.md`
- `poultry/chicken/chicken_wing-air_fryer.md`
- `poultry/chicken/ground_chicken-braise.md`
- `poultry/chicken/ground_chicken-pan_fry.md`
- `poultry/duck/duck_breast-oven_roast.md`
- `poultry/goose/goose_breast-oven_roast.md`
- `poultry/goose/goose_breast-pan_sear.md`
- `poultry/goose/goose_leg-braise.md`
- `poultry/goose/goose_leg-oven_roast.md`
- `poultry/goose/goose_thigh-braise.md`

### Vegetables — empty stubs (79 files)

All files under `docs/recipe_research/vegetables/` except the 5 already completed:
- `alliums/` (9 files)
- `corn/` (4 files remaining)
- `cruciferous/` (7 files)
- `eggplant/` (4 files)
- `green_vegetables/` (15 files)
- `mushrooms/` (7 files)
- `peppers/` (4 files)
- `root_vegetables/` (13 files)
- `squash/` (9 files)
- `tomatoes/` (2 files)

---

## Progress

### 2026-04-24 — Branch timeline file created

---


### 2026-04-24 — All vegetable recipe stubs completed (v0.6.1.14)

All 79 vegetable stub files have been filled with full recipe research content.
Each file contains 4 source recipes from globally diverse published cookbooks
(non-Western sources prioritised), with cut profiles, pull temperatures,
MEATER probe placement instructions, and a tree-position table.

**Completed by category:**

| Category | Files filled |
|----------|-------------|
| alliums/ | 9 (caramelized_onions ×2, leeks ×3, roasted_garlic ×1, roasted_onion ×3) |
| corn/ | 4 (air_fryer, boil, grill, oven_roast; steam was pre-filled) |
| cruciferous/ | 7 (cabbage braise/grill/saute; cauliflower air_fryer/oven_roast/steam/whole_roast) |
| eggplant/ | 4 (air_fryer, grill, oven_roast, saute; pan_fry was pre-filled) |
| green_vegetables/ | 18 (asparagus ×4, broccoli ×4, brussels_sprouts ×4, green_beans ×4, spinach ×2) |
| mushrooms/ | 8 (button ×4, portobello ×4; grill pre-filled) |
| peppers/ | 4 (bell_peppers: air_fryer, grill, oven_roast, saute) |
| root_vegetables/ | 13 (baked_potato ×2, roasted_beets ×1, roasted_carrots ×3, roasted_parsnips ×2, roasted_potatoes ×2, roasted_sweet_potato ×3) |
| squash/ | 11 (acorn_squash ×2, butternut_squash ×3, spaghetti_squash ×2, zucchini ×4) |
| tomatoes/ | 2 (roasted_tomatoes: air_fryer, oven_roast) |

**Version bumped:** 0.6.1.13 → 0.6.1.14

---

## 2026-04-25 — 12 missing meat recipe research files created

All 12 previously missing recipe research files were created, completing the pork/roasts,
lamb/roasts, poultry/chicken, poultry/turkey, and game/mutton collections.

**Files created:**

| File | Sources | Traditions covered |
|------|---------|-------------------|
| pork/roasts/pork_leg-braise.md | 4 | German, Chinese, Italian, Danish |
| pork/roasts/pork_leg-slow_cooker.md | 4 | German, Chinese, Danish, Italian |
| pork/roasts/pork_leg-oven_roast.md | 4 | German, Italian, Austrian, Danish |
| lamb/roasts/lamb_shank-slow_cooker.md | 5 | Turkish, German, Greek, Italian, Danish |
| lamb/roasts/lamb_shank-oven_roast.md | 4 | Turkish, Greek, Italian, Danish |
| lamb/roasts/lamb_neck-braise.md | 4 | Turkish, Italian, German, Danish |
| lamb/roasts/lamb_neck-slow_cooker.md | 4 | Turkish, German, Italian, Greek |
| lamb/roasts/lamb_neck-oven_roast.md | 4 | Turkish, Greek, Italian, German |
| poultry/chicken/ground_chicken-grill.md | 4 | Turkish, Israeli/Levantine, Jamaican, South African |
| poultry/turkey/ground_turkey-grill.md | 4 | Turkish, Israeli/Levantine, German, South African |
| game/mutton/mutton_shoulder-braise.md | 4 | Indian, Turkish, Italian, German |
| game/mutton/mutton_shoulder-slow_cooker.md | 4 | Indian, Turkish, German, Greek |

**Sources fetched and used:**
- nefisyemektarifleri.com — Turkish lamb shank, neck, shoulder, chicken köfte, turkey köfte
- chefkoch.de — German pork hock (braise, crockpot, oven), lamb neck, lamb shanks slow cooker, turkey burger
- thewoksoflife.com — Chinese red-braised Ti Pang (pork shank)
- giallozafferano.it — Italian stinco (pork shank oven/braise), agnello al forno, spalla d'agnello
- blog.giallozafferano.it — Italian collo di agnello stufato nel coccio (clay-pot lamb neck)
- madensverden.dk — Danish pork hank, lamb shank red wine, svineskank ovnbagt
- valdemarsro.dk — Danish braised pork neck
- ichkoche.at — Austrian crispy roasted Schweinsstelze
- argiro.gr — Greek lamb shank gastra, Greek lamb tray-bake
- toriavey.com — Israeli/Levantine Mediterranean turkey/chicken burgers (165°F explicit)
- africanbites.com — Jamaican chicken patties
- taste.co.za — South African chicken patties with preserved lemon
- indianhealthyrecipes.com — Indian Mutton Korma

**Temperature benchmarks established:**
- Pork hock (braise/slow cooker): 75–80 °C sliceable; 85–90 °C pull-apart
- Pork hock (oven roast): 75–85 °C (Giallo Zafferano explicitly stated)
- Lamb/mutton shank and neck: 85–90 °C fall-off-the-bone
- Mutton shoulder: 88–95 °C (older animal, denser tissue)
- Ground poultry (grill): 74 °C / 165 °F USDA minimum (Tori Avey explicitly stated)


---

### 2026-04-24 — Recipe files integrated into experimental MEATER GUI (v0.6.1.15)

**Task:** "Incorporate the recipe files into the GUI in the experimental MEATER cooking path. When clicking a cut, the cut profile text should show plus links to the (local:: not URLs) recipes."

#### What was changed

**`generate_frontend_data.py`**
- Added `import re, shutil`
- Added `build_recipe_index(base_dir)` — scans `docs/recipe_research/**/*.md`, extracts the `## Cut profile` section from each file, and builds:
  - `RECIPE_INDEX`: `{ cut_slug: { method_slug: "/kitchen_cooking_engine_panel/recipes/..." } }`
  - `CUT_PROFILES`: `{ cut_slug: "profile paragraph text" }`
- Added `copy_recipe_files_to_www(base_dir)` — copies all 331 recipe `.md` files from `docs/recipe_research/` into `www/recipes/` (clean copy on every regeneration), making them accessible at `/kitchen_cooking_engine_panel/recipes/...` via HA's static file server
- Added `"slug": cut.name` to `cut_to_js()` output so the panel JS can look up the recipe index by slug
- Injected `RECIPE_INDEX` and `CUT_PROFILES` as new JS constants in the generated panel
- Called `copy_recipe_files_to_www()` at the end of `regenerate_panel()`

**`www/panel-class-template.js`**
- Added `_renderCutProfileCard()` helper method — looks up `CUT_PROFILES[slug]` and `RECIPE_INDEX[slug]`, renders a `<ha-card>` with the profile paragraph and pill-link buttons per method
- Wired into `_renderExpSetupForm()`: inserted `${this._selectedCut ? this._renderCutProfileCard() : ''}` between Step 4 (cut selector) and Step 5 (doneness selector)

**`www/recipes/`** (new directory)
- 331 Markdown files copied from `docs/recipe_research/` preserving subfolder structure; served at `/kitchen_cooking_engine_panel/recipes/`

#### Generator output after regeneration
```
Recipe index: 331 files across 133 cuts
Copied 331 recipe files → www/recipes/
Updated PANEL_VERSION in JS: 117 -> 273
```

#### Version bump
- `0.6.1.14` → `0.6.1.15`

#### User guide updated
- Added section 5.9 "MEATER+ (experimental) — Cut Profile & Recipe Links"
- Updated the feature comparison table in 5.8 to show the two new rows

---

### 2026-04-24 — CHORES (v0.6.1.15)

- Version bumped: 0.6.1.14 → 0.6.1.15 in manifest.json, __init__.py, const.py
- Branch timeline updated with entries for recipe GUI integration and CHORES
- USER_GUIDE.md updated: new section 5.9, updated 5.8 comparison table

---

### 2026-04-25 — Lock experimental MEATER path to international data (v0.6.1.17)

**Task (revised plan):**
- POSTPONED: "Give every cookable cut an explicit recipe reference"
- IN SCOPE: "Remove Swedish from the experimental MEATER path for now"

#### Background

The experimental MEATER path was honouring `this._dataSource` (Swedish vs international). When Swedish was selected, cut slugs (e.g. `entrecote`, `lammbringa`) did not match the recipe filenames under `docs/recipe_research/`, which use English slugs (e.g. `ribeye_steak`, `brisket`). A hand-written `_RECIPE_SLUG_MAP` in `generate_frontend_data.py` tried to bridge this, but accumulated unverified, fabricated cross-species translations (e.g. `abborrfile→sea_bass`, `lammbringa→brisket`) that produced wrong recipe cards. See Rule 2 in `.github/copilot-instructions.md` ("Data Mappings: Only Map What You Can Verify").

#### What was changed

**`www/panel-class-template.js`** — `_getDataCategories()` and `_getDonenessOptions()` now return `MEAT_CATEGORIES` / `DONENESS_OPTIONS` unconditionally when `this._currentPath === 'meater_experimental'`, regardless of `_dataSource`. The standard MEATER path and all other paths are unchanged.

**`generate_frontend_data.py`**
- Removed `_RECIPE_SLUG_MAP` (~80 entries, all unverified or fabricated). Replaced with an explanatory note pointing at Rule 2.
- `cut_to_js()` now only emits `recipe_slug` when a cut explicitly defines `MeatCut.recipe_slug` (none currently do). Swedish cuts no longer carry a fabricated `recipe_slug`.
- Added a coverage report after `build_recipe_index()`:
  ```
  International cut → recipe coverage: 134 matched, 53 unmatched
  (unmatched cuts simply show no recipe card)
  ```

**Files NOT changed:**
- `cooking_data.py`, `swedish_cooking_data.py`, `MeatCut` dataclass — `recipe_slug` field kept for future explicit per-cut overrides
- Standard MEATER path — still honours `_dataSource`
- Swedish data structures — still generated, still used everywhere except the experimental path
- Recipe files themselves

#### Version bump
- `0.6.1.16` → `0.6.1.17` (manifest.json, __init__.py `__version__` + Last Change, const.py Last Change)
- PANEL_VERSION auto-bumped: `277` → `278`

#### Generator output
```
Recipe index: 331 files across 133 cuts
International cut → recipe coverage: 134 matched, 53 unmatched
Updated PANEL_VERSION in JS: 117 -> 278
Updated PANEL_VERSION in const.py: 277 -> 278
```

---

### 2026-04-25 — Add missing recipe-backed cuts to experimental MEATER tree (v0.6.1.18)

**Task:** The v0.6.1.17 coverage report showed `134 matched, 53 unmatched`. Investigating the *other* direction — recipe files that have no corresponding cut in `MEAT_CATEGORIES` — surfaced 3 cuts whose recipes were on disk but unreachable through the experimental MEATER UI:

| Recipe slug | Recipe folder | Methods on disk |
|-------------|---------------|-----------------|
| `ground_beef` | `beef/ground/` | `braise`, `pan_fry` |
| `goat_shank` | `game/goat/` | `braise`, `oven_roast` |
| `lamb_neck` | `lamb/roasts/` | `braise`, `oven_roast`, `slow_cooker` |

#### What was changed

**`cooking_data.py`** — added three `MeatCut` entries with verified id-range, slug = recipe filename stem, and `supported_methods` matching exactly the methods present on disk:

- `BEEF_GROUND` += `ground_beef` (id=150, USDA 71°C / 160°F well-done only — same safety target as `beef_burger`).
- `LAMB_ROASTS` += `lamb_neck` (id=508, pulled — collagen-rich, low-and-slow profile mirroring `lamb_shoulder`).
- `GOAT` += `goat_shank` (id=695, pulled — collagen-rich shank profile).

No `recipe_slug` override needed for any of them: each cut's `name` already equals the recipe filename stem, so the existing `cut.recipe_slug || cut.slug` lookup in `_renderCutProfileCard()` resolves directly.

**Files NOT changed** — the JS template, the generator, the recipe files, the `MeatCut` dataclass, Swedish data, and the standard MEATER path are all untouched. This is a pure data addition.

#### Version bump
- `0.6.1.17` → `0.6.1.18` (manifest.json, __init__.py `__version__` + Last Change, const.py Last Change)
- PANEL_VERSION auto-bumped: `279` → `280`

#### Generator output
```
Recipe index: 331 files across 133 cuts
  International cut → recipe coverage: 137 matched, 53 unmatched
International cuts: 190 (was 187)
```

Verification: every `cut_slug` produced by `build_recipe_index()` now has a corresponding `MeatCut.name` in `MEAT_CATEGORIES`.

---

### 2026-04-25 — Two-tier recipe files: full frontmatter + inline viewer (v0.6.1.19)

**Task (new requirement):** Formalise the two-tier recipe file structure and make
all 464 files self-contained, with every file marked by type and tree position in
YAML frontmatter. Update the GUI to display cut/method files inline within the
panel (no new-tab links). Lay groundwork for a future dynamic tree built from
files alone.

#### Two file types

| Type | Filename | Purpose | Shown in GUI |
|------|----------|---------|--------------|
| `cut` | `{slug}.md` | General cut profile; carries full cooking spec | When user selects a cut |
| `cut_method` | `{slug}-{method}.md` | Method-specific research | When user clicks a method button |

#### Cut file frontmatter (full spec — future-proof)

Every `{slug}.md` now carries:
```yaml
---
type: cut
slug: ribeye_steak
name: Ribeye Steak
category: beef
meat: cow
cut_type: Steaks
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
  - pan_sear
  - grill
  - …
doneness:
  - {name: rare,        target_c: 49, target_f: 120, min_c: 46, max_c: 52, usda_safe: false}
  - {name: medium_rare, target_c: 54, …, recommended: true}
  - …
---
```
This makes the file self-contained: a future tree builder reads only the cut files
and cooking_data.py is no longer required to add a new cut to the GUI.

#### Cut-method file frontmatter (minimal — tree position only)

Every `{slug}-{method}.md` carries:
```yaml
---
type: cut_method
slug: ribeye_steak
method: grill
name: Ribeye Steak × Grill
category: beef
meat: cow
cut_type: Steaks
---
```

#### Future dynamic tree (NOT implemented now)

When the time comes: scan `docs/recipe_research/**/{slug}.md` → read frontmatter
→ build MEAT_CATEGORIES in memory → render GUI tree. Adding a new cut requires
only: (a) a new `{slug}.md` with complete frontmatter, and (b) optionally one or
more `{slug}-{method}.md` files. No changes to `cooking_data.py` needed.

#### GUI changes

**`www/panel-class-template.js`**
- `_renderCutProfileCard()` — "Cut Overview" and method buttons now toggle an
  inline markdown viewer instead of opening new browser tabs.
- `_openRecipeFile(url)` — fetches the file via `fetch()` and stores content in
  `_recipeFileContent`. Clicking the active button closes the viewer.
- `_stripFileFrontmatter(text)` — strips `--- … ---` block before rendering.
- `_mdToHtml(md)` — markdown-to-HTML converter (headings, bold, italic, code,
  links, lists, hr, paragraphs). Renders inline via `.innerHTML` property binding.
- Three new reactive properties: `_recipeFileContent`, `_recipeFileUrl`,
  `_recipeFileLoading`.
- `_selectCut()` now clears the recipe viewer when the cut changes.

**`generate_frontend_data.py`** — `build_recipe_index()` now handles plain cut
files (no hyphen in stem): adds `"overview"` key to RECIPE_INDEX and reads the
cut file as the authoritative profile source (preferred over method-file fallback).

#### Files changed

- 133 cut files: frontmatter updated with full cooking spec
- 331 method files: minimal frontmatter unchanged (type, slug, method, tree pos)
- `www/panel-class-template.js`: inline viewer + helper methods
- `generate_frontend_data.py`: handle cut files in build_recipe_index()
- `manifest.json`, `__init__.py`, `const.py`: 0.6.1.18 → 0.6.1.19

#### Generator output
```
Recipe index: 464 files across 133 cuts
  International cut → recipe coverage: 137 matched, 53 unmatched
  Copied 464 recipe files → www/recipes/
Updated PANEL_VERSION in JS: 117 -> 281
```
