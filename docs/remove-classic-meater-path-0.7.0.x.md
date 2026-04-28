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

### 2026-04-28 (Session 4 — single source of truth)
- Moved 4 meta-docs (README, TOR-filer, SOURCE_SURVEY) till `www/recipes/`
- Uppdaterade `generate_frontend_data.py`: läser alltid från `www/recipes/` (inget `docs/`-fallback)
- Tog bort `copy_recipe_files_to_www()` funktion och anrop, tog bort oanvänd `import shutil`
- Ersatte `docs/recipe_research/` (katalog) med git-symlänk → `custom_components/kitchen_cooking_engine/www/recipes`
- Generator verifierad: 539 filer, 164 cuts, inga fel
