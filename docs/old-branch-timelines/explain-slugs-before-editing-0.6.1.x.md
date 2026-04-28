# Branch timeline: explain-slugs-before-editing — v0.6.1.x

## Purpose
Fork the recipe library into a **frozen classic** fork (`docs/recipe_research_classic/`)
and the existing **experimental active** fork (`docs/recipe_research/`).

The classic fork is a one-time snapshot that feeds the classic MEATER path.
The experimental fork continues active development (including upgrading stubs).
When experimental is declared stable, classic is deleted and experimental becomes default.

## Session 2026-04-26 — v0.6.1.32

### What was done

1. **Created `docs/recipe_research_classic/`** — full `cp -r` snapshot of `docs/recipe_research/`
   at fork time (520 `.md` files, stubs included as frozen placeholders).

2. **Updated `generate_frontend_data.py`**:
   - `build_recipe_index(base_dir, *, recipe_dir=None, url_prefix="recipes")` — new optional
     parameters allow scanning any dir with any URL prefix.
   - Called twice in `generate_js_data()`:
     - `docs/recipe_research/` → `RECIPE_INDEX`, `CUT_PROFILES`, `CUT_METHOD_PROFILES`,
       `RECIPE_TITLES_INDEX` (experimental path, url prefix `recipes`).
     - `docs/recipe_research_classic/` → `CLASSIC_RECIPE_INDEX`, `CLASSIC_CUT_PROFILES`,
       `CLASSIC_CUT_METHOD_PROFILES`, `CLASSIC_RECIPE_TITLES_INDEX` (classic path, url prefix
       `recipes_classic`).
   - `copy_recipe_files_to_www()` now copies both trees:
     `docs/recipe_research/` → `www/recipes/` and
     `docs/recipe_research_classic/` → `www/recipes_classic/`.

3. **Updated `panel-class-template.js`**:
   - Added four helper methods after `_getDonenessOptions()`:
     `_getRecipeIndex()`, `_getCutProfiles()`, `_getCutMethodProfiles()`, `_getRecipeTitles()`.
   - Each returns the `CLASSIC_*` constant for every path except `meater_experimental`,
     which returns the live `RECIPE_*` constant.
   - Updated all four lookup sites in `_renderCutProfileCard()` and the inline
     method-description block to use the helpers.

4. **Regenerated `kitchen-cooking-panel.js`** — generator ran clean:
   - Experimental: 515 files / 184 cuts
   - Classic: 515 files / 184 cuts (identical at fork time, will diverge as experimental grows)
   - All four `CLASSIC_*` constants present in generated JS.

5. **Updated `docs/USER_GUIDE.md`** — section 5.9 "How the cut tree and recipe links are
   built" rewritten to document the two-fork structure.

6. **Version bumped to `v0.6.1.32`** in manifest.json, __init__.py, and const.py.

### Cutover instructions (when experimental is stable)
1. Delete `docs/recipe_research_classic/` and `www/recipes_classic/`.
2. In `panel-class-template.js`: remove the `CLASSIC_*` branch in each of the four helpers
   so they always return the live constants.
3. In `generate_frontend_data.py`: remove the second `build_recipe_index()` call and the
   `CLASSIC_*` `lines.append(...)` blocks.
4. Regenerate.

### Status
- [x] Classic fork created
- [x] Generator updated
- [x] Template updated
- [x] Panel regenerated
- [x] USER_GUIDE.md updated
- [x] Version bumped to 0.6.1.32
