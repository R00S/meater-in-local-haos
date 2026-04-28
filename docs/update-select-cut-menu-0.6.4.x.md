# Branch Timeline: update-select-cut-menu (v0.6.4.x)

## Purpose

Fix the "Select Cut" step in the MEATER setup flow: it was rendered as a `<select>` HTML
dropdown instead of the button grid used by all other selector steps (Select Cut Type,
Doneness Level). The fix makes the UI consistent throughout.

---

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
