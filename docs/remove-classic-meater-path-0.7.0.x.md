# Branch Timeline: remove-classic-meater-path — v0.7.0.x

## Goal
Remove the classic MEATER path (`_currentPath = 'meater'`) and make the experimental path (`meater_experimental`) the only path.

## Scope of Changes

### panel-class-template.js
- [x] `_routeToAppliancePath`: route MEATER to experimental (not classic)
- [x] Welcome screen: remove extra experimental card; single card goes to experimental
- [x] `_getDataCategories()`: always return EXP_TREE (remove classic branch)
- [x] `_getDonenessOptions()`: always return EXP_DONENESS_OPTIONS (remove classic branch)
- [x] `_getRecipeIndex/CutProfiles/CutProfilesSv/CutMethodProfiles/RecipeTitles`: remove ternary, always return live set
- [x] Remove `_navigateToMeaterPath()` function
- [x] Remove `_renderMeaterPath()` function
- [x] Remove `_renderSetupForm()` function (dead code, ~315 lines)
- [x] Switch-case: remove `case 'meater':`
- [x] `_renderRecentMeaterCooks`: back button → `meater_experimental`
- [x] Legacy fallback (line ~6747): `'meater'` → `'meater_experimental'`
- [x] `_renderMeaterExperimental()`: remove "experimental" badge from heading
- [x] `_openHelp` anchor updated: `#59-meater-experimental--cut-profile--recipe-links` → `#59-meater--cut-profile--recipe-links`

### generate_frontend_data.py
- [x] Remove classic recipe index building block
- [x] Remove CLASSIC_* constant generation (CLASSIC_RECIPE_INDEX, CLASSIC_CUT_PROFILES, etc.)
- [x] `copy_recipe_files_to_www()`: remove classic tree copy

### Cleanup
- [x] Delete `docs/recipe_research_classic/`
- [x] Delete `www/recipes_classic/`
- [x] Run `python3 generate_frontend_data.py` ✅

### Single source of truth for recipe files
- [x] Move 4 meta-docs (README, TOR-filer, SOURCE_SURVEY) till `www/recipes/`
- [x] `generate_frontend_data.py`: läser alltid från `www/recipes/`, tar bort `docs/recipe_research/`-prioritet
- [x] Ta bort `copy_recipe_files_to_www()` funktion och anrop
- [x] Ta bort oanvänd `import shutil`
- [x] Ersätt `docs/recipe_research/` med git-symlänk → `www/recipes/`
- [x] Generator verifierad: 539 filer, inga fel

### CHORES
- [x] Bump version `0.7.0.0` → `0.7.0.1`
- [x] Update USER_GUIDE.md: version line, section 5, 5.3, 5.8, 5.9, ToC
- [x] Update `_openHelp` anchors in panel-class-template.js

## Session Log

### 2026-04-28 (Session 1)
- Created timeline file

### 2026-04-28 (Session 2 — main work)
- Removed `_routeToAppliancePath` classic branch; MEATER routes to experimental
- Removed dual-card welcome screen (experimental card alongside regular); now single card
- Simplified `_getDataCategories()`, `_getDonenessOptions()`, all 5 recipe getters (always return live set)
- Removed `_navigateToMeaterPath()` (~20 lines)
- Removed `_renderMeaterPath()` (~65 lines)
- Removed `case 'meater':` from render switch
- Fixed `_renderRecentMeaterCooks` back button and legacy restart fallback to `meater_experimental`
- Stripped `🧪` and "(experimental)" from `_renderMeaterExperimental()` headings
- Removed classic recipe index build from `generate_frontend_data.py`
- Removed all 5 CLASSIC_* constant outputs from generator
- Removed classic tree copy from `copy_recipe_files_to_www()`
- Deleted `docs/recipe_research_classic/` and `www/recipes_classic/`
- Generator verified: PANEL_VERSION 346→347, 0 CLASSIC_ refs in output
- Bumped version to `0.7.0.0`

### 2026-04-28 (Session 3 — CHORES)
- Removed dead `_renderSetupForm()` (~315 lines; only called by the now-deleted `_renderMeaterPath`)
- Updated `_openHelp('#59-meater-experimental--cut-profile--recipe-links')` → `#59-meater--cut-profile--recipe-links`
- Updated USER_GUIDE.md:
  - Version `0.6.4.5` → `0.7.0.1`
  - Section 5 intro: single MEATER+ card
  - Section 5.3: removed Swedish temperature tree option; explained it is now always international
  - Section 5.8: renamed heading (removed "(experimental)"); removed "alongside regular MEATER+ card" preamble; removed "Differences from the standard MEATER path" comparison table
  - Section 5.9: renamed heading (removed "(experimental)"); updated body text; removed two-fork table; updated generator description (no more CLASSIC_* constants)
  - ToC anchors updated for 5.8 and 5.9
- Bumped version to `0.7.0.1`
- Generator: PANEL_VERSION 347→348

### 2026-04-28 (Session 6 — start_cook bug fixes v0.7.0.10)
- **Root cause found**: `PLATFORMS = [Platform.SENSOR]` was never defined in `__init__.py`
  - This caused `NameError: name 'PLATFORMS' is not defined` at line 479
  - ALL 5 config entries failed to set up → sensor entities never stored in `hass.data[DOMAIN]`
  - `_get_cooking_session_entities()` returned empty list → every service call silently failed
- **Fix 1**: Added `PLATFORMS = [Platform.SENSOR]` immediately after `_LOGGER` (line ~70)
- **Fix 2**: `_get_exp_cut_data` used `os.walk()` + `open()` inside async event loop
  - HA detected blocking calls and logged warnings for each service invocation
  - Fixed by wrapping call with `await hass.async_add_executor_job(_get_exp_cut_data, cut_id, cooking_method)`
- Bumped version to `0.7.0.10` in all 3 locations (manifest.json, __init__.py, const.py)
- Generator: PANEL_VERSION 358→359
- Git history audit: scanned all commits touching `www/recipes/` that did NOT touch `docs/recipe_research/`; confirmed all 8 such commits were generator copies (www and docs content identical at each commit) — no data loss
- Bumped version to `0.7.0.8`
- Updated README: added `v0.7.0.x Changes` section summarising all work done in this branch
- Updated `docs/USER_GUIDE.md` version line `0.7.0.1` → `0.7.0.8`
- Generator: PANEL_VERSION 355→356
- Moved 4 meta-docs (README, TOR-filer, SOURCE_SURVEY) till `www/recipes/`
- Uppdaterade `generate_frontend_data.py`: läser alltid från `www/recipes/` (inget `docs/`-fallback)
- Tog bort `copy_recipe_files_to_www()` funktion och anrop, tog bort oanvänd `import shutil`
- Ersatte `docs/recipe_research/` (katalog) med git-symlänk → `custom_components/kitchen_cooking_engine/www/recipes`
- Generator verifierad: 539 filer, 164 cuts, inga fel

### 2026-04-28 (Session 7 — start_cook EXP_TREE slug support v0.7.0.9)
- `start_cook` service now accepts a string `cut_id` (EXP_TREE slug, e.g. `"ribeye_steak"`) in addition to legacy integer IDs
- `_get_exp_cut_data(cut_id, cooking_method)` helper added: reads `KCE:CUT` and `KCE:CUT_METHOD` frontmatter from recipe markdown files to extract target temperatures, rest times, and carryover values
- `generate_frontend_data.py` updated: reads `rest_time_min`, `rest_time_max`, `carryover_temp_c` from `KCE:CUT` frontmatter (first pass) and per-method overrides from `KCE:CUT_METHOD` files (second pass); populates them into `EXP_TREE`
- Bumped version to `0.7.0.9`
- Generator: PANEL_VERSION 357→358

### 2026-04-28 (Session 8 — PLATFORMS fix & blocking I/O fix v0.7.0.10)
- **Root cause**: `PLATFORMS = [Platform.SENSOR]` was missing from `__init__.py` entirely; this caused a `NameError` at line 479 on every config entry setup → all sensor entities failed to register → every service call silently returned empty
- **Fix 1**: Added `PLATFORMS = [Platform.SENSOR]` immediately after `_LOGGER`
- **Fix 2**: `_get_exp_cut_data` called `os.walk()` + `open()` directly in the async event loop; moved to `await hass.async_add_executor_job(...)` to avoid HA blocking-call warnings
- Bumped version to `0.7.0.10`
- Generator: PANEL_VERSION 358→359

### 2026-04-28 (Session 9 — CHORES v0.7.0.11)
- Bumped version to `0.7.0.11`
- Updated `docs/USER_GUIDE.md`:
  - Version line `0.7.0.8` → `0.7.0.11`
  - `start_cook` service table: `cut_id` type updated to `string or integer` with description of slug vs legacy int
  - KCE:CUT required fields table: added `rest_time_min`, `rest_time_max`, `carryover_temp_c` as optional fields
  - KCE:CUT_METHOD section: split YAML block from body template; added optional fields table and explanation
- Updated `README.md`:
  - Version `v0.7.0.8` → `v0.7.0.11`
  - Added `v0.7.0.9–0.7.0.11 Changes` changelog section
  - `start_cook` example updated to show slug usage (legacy int shown as secondary example)
- Generator: PANEL_VERSION 359→360

### 2026-04-28 (Session 10 — integer cut_id removed v0.7.0.12)
- Removed legacy integer `cut_id` path from `start_cook` service handler
- `cut_id` validator changed from `vol.Any(int, str)` → `str` only
- Removed `_get_protein_name_for_cut` and `_get_protein_name_for_cut_with_categories` helper functions (were only used on the classic path)
- Removed remaining imports from `cooking_data.py` and `swedish_cooking_data.py` that were no longer referenced
- Removed `isinstance(cut_id, str)` branch guard — the handler now processes every call directly as a slug
- Bumped version to `0.7.0.12`
- Generator: PANEL_VERSION 360→361

### 2026-04-28 (Session 11 — CHORES v0.7.0.13)
- Bumped version to `0.7.0.13`
- Updated `docs/USER_GUIDE.md`:
  - Version line `0.7.0.11` → `0.7.0.13`
  - Fixed `start_multi_appliance_cook` table: field was incorrectly documented as `cut_id (integer)` — actual parameter is `recipe_id (string or integer)`
- Updated `README.md`:
  - Version `v0.7.0.11` → `v0.7.0.13`
  - Added `v0.7.0.12–0.7.0.13 Changes` changelog section
- Generator: PANEL_VERSION 361→362
