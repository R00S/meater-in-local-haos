# Branch Timeline: update-select-cut-menu (v0.6.4.x)

## Purpose

Fix the "Select Cut" step in the MEATER setup flow: it was rendered as a `<select>` HTML
dropdown instead of the button grid used by all other selector steps (Select Cut Type,
Doneness Level). The fix makes the UI consistent throughout.

## v0.6.4.7 — 2026-04-28

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
