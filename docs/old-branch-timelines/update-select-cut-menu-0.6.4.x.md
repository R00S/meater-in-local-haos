# Branch Timeline: update-select-cut-menu (v0.6.4.x)

## Purpose

Fix the "Select Cut" step in the MEATER setup flow: it was rendered as a `<select>` HTML
dropdown instead of the button grid used by all other selector steps (Select Cut Type,
Doneness Level). The fix makes the UI consistent throughout.

## v0.6.5.0 — 2026-04-28

### CHORES

- Bumped version 0.6.4.9 → 0.6.5.0 (agent handoff increment: 4 → 5).
- Updated `USER_GUIDE.md`:
  - §5.8 Differences table: added **Language support** and **Measurement system** rows.
  - §5.8 Safety note: updated hardcoded `54°C (130°F)` example to unit-aware prose,
    noted that all temps follow the Measurement System setting.
  - §5.9: Added "Measurement system in recipes" callout box; added "Language support"
    subsection with table showing how Swedish names are provided per element (category,
    meat, cut_type, cut, doneness, UI labels, method descriptions).
  - §5.10 KCE:CUT example: added `name_sv:` at cut level and `name_sv:` per doneness entry;
    added `## Styckesprofil` as second body section for Swedish cut description.
  - §5.10 KCE:CUT fields table: documented `name_sv` as optional field.
  - §5.10 doneness entry docs: noted `name_sv:` option with reference table.
  - §5.10 KCE:CUT_METHOD example: replaced `description_sv:` YAML field with
    `## Styckesprofil` body section (multi-paragraph Swedish description).
  - §12 Measurement settings: expanded paragraph to mention experimental path conversion.
- No help-button anchor changes needed (all existing anchors match current heading text).

### Bug fix: Styckesprofil and Tillagningsmetod descriptions not translated

**Problem**: After v0.6.4.8, the body text in the "Styckesprofil" card and the method
description in "Tillagningsmetod" were always shown in English regardless of UI language.
Two root causes:
1. `CUT_PROFILES` had no Swedish equivalent — only `## Cut profile` was extracted.
2. The `description_sv:` YAML field (a single line) was structurally wrong for the
   multi-paragraph description body shown in "Tillagningsmetod".

**Fix**:
- Added `## Styckesprofil` as the Swedish counterpart to `## Cut profile` in markdown files.
- Generator now extracts `## Styckesprofil` sections and produces two new JS constants:
  `CUT_PROFILES_SV` and `CLASSIC_CUT_PROFILES_SV`.
- For method files, `## Styckesprofil` populates `CUT_METHOD_PROFILES[slug][method + '_sv']`
  (preferred over the old single-line `description_sv:` YAML field, which is kept as fallback).
- Added `_getCutProfilesSv()` getter in JS.
- In `_renderCutProfileCard()`: `profileEn` / `profileSv` split; Swedish shown when language
  is `sv` and a Swedish section exists, falls back to English otherwise.
- Added `## Styckesprofil` sections to `beef_shank.md`, `beef_shank-braise.md`, and
  `beef_shank-slow_cooker.md` as the first three fully-translated cut files.

**Contributor workflow**: Add `## Styckesprofil` to any cut overview or method file to
provide Swedish description text. Files without this section fall back to English gracefully.

### Files changed
- `generate_frontend_data.py` — `_profile_sv_re`, `cut_profiles_sv`, new return value, `CUT_PROFILES_SV`/`CLASSIC_CUT_PROFILES_SV` output
- `www/panel-class-template.js` — `_getCutProfilesSv()`, `profileEn`/`profileSv` in `_renderCutProfileCard()`
- `www/kitchen-cooking-panel.js` — auto-generated (PANEL_VERSION 339 → 340)
- `docs/recipe_research/beef/braising/beef_shank.md` — `## Styckesprofil` added
- `docs/recipe_research/beef/braising/beef_shank-braise.md` — `## Styckesprofil` added
- `docs/recipe_research/beef/braising/beef_shank-slow_cooker.md` — `## Styckesprofil` added
- `manifest.json` — version 0.6.4.9 → 0.6.5.0
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change (PANEL_VERSION auto-updated by generator)
- `docs/USER_GUIDE.md` — §5.8, §5.9, §5.10, §12 updated
- `docs/update-select-cut-menu-0.6.4.x.md` — this file

## v0.6.4.9 — 2026-04-28

### Problem
Code review after v0.6.4.8 identified two issues:

1. The generator used the **first-seen cut's `name_sv`** as the Swedish name for the entire
   meat grouping (e.g. "Entrecôte" would become the Swedish name for "Cow") and for the
   cut_type grouping — incorrectly conflating cut names with group names.
2. The **classic `_renderSetupForm()` cut selector** (line ~3348) still used
   `cut.name_long || cut.name` without checking `name_sv`, making it inconsistent with the
   experimental path.

### Fixes
- Replaced propagation logic with two dedicated dicts in `generate_frontend_data.py`:
  - `_MEAT_NAME_SV` — 33 entries mapping meat IDs to correct Swedish names (e.g. `"cow" → "Nöt"`)
  - `_CUT_TYPE_NAME_SV` — 14 entries mapping cut_type display names (e.g. `"Steaks" → "Biffar"`)
- Classic cut selector now uses `(this._language === 'sv' && cut.name_sv) ? cut.name_sv : (cut.name_long || cut.name)`.
- Re-ran generator → PANEL_VERSION 335 → 336.

### Files changed
- `custom_components/kitchen_cooking_engine/generate_frontend_data.py` — two new dicts, propagation removed
- `www/panel-class-template.js` — classic cut selector fix
- `www/kitchen-cooking-panel.js` — auto-generated
- `manifest.json` — 0.6.4.8 → 0.6.4.9
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change

## v0.6.4.8 — 2026-04-28

### Problem
The experimental MEATER+ path did not respect the user's language or measurement-system
selection made on the front screen. All labels were hardcoded English, all temperatures
were hardcoded °C, and category/cut/doneness names had no Swedish equivalents.

### Fixes — four layers

**Layer 1 — UI strings**: All hardcoded English strings in `_renderMeaterExperimental()`,
`_renderExpSetupForm()`, and `_renderCutProfileCard()` replaced with `_t()` calls.
- Landing-page path buttons: `start_meater_cooking`, `start_meater_desc`, `recent_meater_cooks`, `recent_meater_desc`
- Status banner, session selector, category heading, meat/cut-type/cut step headings, doneness heading
- Safety legend, safety dot tooltips, safety warning block (culinary preferred / USDA minimum / risk text)
- Temperature fine-tune panel: heading, custom indicator, done/fine-tune toggles, reset label
- Cooking method panel: heading, method names via `cooking_methods.*` keys, recipe loading indicator
- Cut profile card: heading, method research label, close button, back-to-recipes button
- Start cooking button
- New i18n keys added to both `en.json` and `sv.json`:
  `safety_dot_safe`, `safety_dot_caution`, `safety_dot_unsafe`, `safety_legend`,
  `culinary_preferred`, `usda_safe_minimum`, `undercooked_risk`,
  `cut_profile`, `method_research`, `back_to_recipes`, `close_research`,
  `research_label`, `fine_tune_temp`, `reset_to`, `select_type`

**Layer 2 — Temperatures and measurements**: Every temperature display uses `_convertTemp()`.
- Doneness button temp hints
- Custom cook target temp display
- Fine-tuning: target temp display, safety warning values (culinary preferred + USDA safe minimum)
- Reset-to label in fine-tune panel
- Start cooking at temp label
- Recipe markdown content piped through `_convertIngredientText()` before `_mdToHtml()` in both
  the inline method panel and the cut profile research panel — so ingredient measurements and
  temperatures in recipe text automatically convert to the user's units

**Layer 3 — EXP_TREE Swedish names**: Infrastructure + data for `name_sv` in exp tree nodes.
- `_CATEGORY_META` extended with `name_sv` for all 7 categories
- Generator reads `name_sv` from KCE:CUT tag; propagates to cut objects, cut_type objects,
  and meat objects (first cut seen provides the name), and category objects
- `name_sv` added to KCE:CUT header blocks in 163 recipe research files
- JS display in category, meat, cut-type, cut buttons uses `name_sv` when `_language === 'sv'`
- `name_sv` also read from doneness entries in KCE:CUT doneness list

**Layer 4 — Swedish method descriptions**: Infrastructure for `description_sv` in method profiles.
- Generator reads `description_sv` field from KCE:CUT_METHOD YAML tag; stores it as
  `{method_slug}_sv` key in `CUT_METHOD_PROFILES` and `CLASSIC_CUT_METHOD_PROFILES`
- JS method description display uses `description_sv` when `_language === 'sv'`
- Data entry (adding `description_sv:` to individual method files) is incremental — any file
  without the field shows no Swedish description (falls back to English or nothing)

### Files changed
- `www/panel-class-template.js` — all four layers
- `www/kitchen-cooking-panel.js` — auto-generated (PANEL_VERSION 333 → 334)
- `i18n/en.json` — 15 new keys added
- `i18n/sv.json` — 15 new keys added (Swedish translations)
- `generate_frontend_data.py` — `_CATEGORY_META` name_sv, exp tree name_sv propagation, CUT_METHOD description_sv
- `docs/recipe_research/**/*.md` — 163 KCE:CUT files updated with `name_sv:`
- `manifest.json` — version 0.6.4.7 → 0.6.4.8
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change (PANEL_VERSION auto-updated by generator)
- `docs/update-select-cut-menu-0.6.4.x.md` — this file updated


### Problems reported (screenshot)
The MEATER+ (experimental) setup form showed three bugs:
1. **"← Back to MEATER Path"** navigated to experimental landing page (confusing, as the landing page is never used — experimental always enters directly into setup form) and label implied classic MEATER path.
2. **Title** showed `🌡️ MEATER+ (bt_proxy_meater_tip_temperature)` — the raw appliance entity name, same format as classic path.
3. **Temperature Data Source card** was displayed even though the experimental path always uses International (USDA) and has no source choice.

### Fixes
- `_renderMeaterExperimental()` setup-form back button: changed action to `_navigateToWelcome()` and label to `this._t('nav.back_to_appliances')`.
- Title changed from `🌡️ ${appliance.name}` to `🧪🌡️ MEATER+ (experimental)` (static, matches welcome-screen card label).
- Removed the entire `<ha-card>` Temperature Data Source block from `_renderExpSetupForm()`.
- Re-ran generator → PANEL_VERSION 332 → 333.
- Bumped version 0.6.4.6 → 0.6.4.7.

### Files changed
- `www/panel-class-template.js` — back btn + title + remove data-source card
- `www/kitchen-cooking-panel.js` — auto-generated
- `manifest.json` — version bump
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change
- `docs/USER_GUIDE.md` — section 5.9 note updated
- `docs/update-select-cut-menu-0.6.4.x.md` — this file updated

## v0.6.4.6 — 2026-04-28

### Problem discovered
The **Select Cut** card used a `<select>` dropdown element while every other selector step
(Select Meat, Select Cut Type, Doneness Level) used a row of `<button>` elements.
This was visible in both the standard MEATER path and the MEATER+ (experimental) path.

### Root cause
In `panel-class-template.js` both render paths (`_renderSetupForm` around line 3343 and the
experimental render path around line 4592) contained a `<select>/<option>` block for the cut
step, while all other steps used `<div class="button-group">` with `<button class="category-btn">`.

### Fix applied
- Replaced both `<select>` blocks in `www/panel-class-template.js` with `<div class="button-group">` +
  `<button class="category-btn">` pattern (matching the cut-type selector).
- Re-ran `python3 generate_frontend_data.py` → PANEL_VERSION bumped 331 → 332.
- Bumped integration version 0.6.4.5 → 0.6.4.6.
- Updated USER_GUIDE.md to reflect that Select Cut now uses buttons.

### Files changed
- `www/panel-class-template.js` — both Select Cut render blocks
- `www/kitchen-cooking-panel.js` — auto-generated
- `manifest.json` — version bump
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change (PANEL_VERSION auto-updated by generator)
- `docs/USER_GUIDE.md` — select cut description updated
- `docs/update-select-cut-menu-0.6.4.x.md` — this file (created)
