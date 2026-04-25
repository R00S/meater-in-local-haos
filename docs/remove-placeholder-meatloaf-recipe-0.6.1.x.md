# Branch: remove-placeholder-meatloaf-recipe — v0.6.1.x

## Task
Bug fixes: remove placeholder meatloaf recipe, address issues #83, #84, #85.

## Issues
- **Meatloaf placeholder**: `meatloaf_alt.md` is a duplicate placeholder — needs deletion.
- **#83 - Portions not propagating**: AI recipe portions set on screen 1 don't carry to screen 2 (suggestions), always shows 4. Also no visible serving size in cook history when restarting.
- **#84 - Ingredient chips not translated**: Selected ingredient chips always show English names regardless of active language.
- **#85 - Blank screen on tab return**: `_renderHistoryCard` is called in `_renderRecentNinjaCooks` and `_renderRecentApplianceRecipes` but never defined — throws TypeError → error boundary flashes blank before resetting to welcome.

## Plan
1. Delete `meatloaf_alt.md` from docs and www/recipes
2. Fix #85: add `_renderHistoryCard(cook)` method to template
3. Fix #83: change portions fallback from `4` to `this._aiPortions` on suggestions page; show serving_size in detail view; add i18n keys
4. Fix #84: add `_lookupIngDisplayName(name)` helper; use it for ingredient chips
5. Bump version, run generator, commit all

## Status
- [x] Timeline created
- [x] Delete meatloaf_alt.md from docs and www/recipes
- [x] Fix #85: add `_renderHistoryCard(cook)` — resolves TypeError causing blank-screen flash
- [x] Fix #83: use `_aiPortions` as fallback on suggestions page + show serving_size in cook detail
- [x] Fix #84: add `_lookupIngDisplayName(name)` helper; ingredient chips now translated
- [x] Add i18n keys `history.serving_size_label` (EN + SV)
- [x] Version bump to 0.6.1.31, PANEL_VERSION auto-incremented to 302
- [x] Generator run successful (515 recipe files, 0 meatloaf_alt)

## v0.6.1.32 — Restore safety/culinary duality in experimental MEATER path

### Task
The experimental MEATER path had lost its core differentiator: safety-level dots were silently `null`
for `rare`, `medium_rare`, and `medium` (the exact temps that need warnings), and the per-cut USDA
minimum safe temperature was parsed from KCE:CUT tags but never forwarded to the frontend.

### Changes
- **Generator** (`generate_frontend_data.py`): replaced binary `"safe" if usda_safe else None` with
  three-tier logic — `usda_safe: true` → `"safe"`, `usda_safe: false` + `target_c < 52` → `"unsafe"`,
  otherwise → `"caution"`. Matches the tiers in `cooking_data.py`.
- **Generator**: read `usda_safe_c` / `usda_safe_f` from KCE:CUT tag and include in EXP_TREE cut objects.
- **Template**: safety legend `🟢 safe · 🟠 caution (widely practised) · 🔴 below guidelines` added
  below the Doneness Level header.
- **Template**: USDA safe minimum warning note added in the Target Temperature card, shown only when
  the culinary pull temp is below `cutUsdaSafeC`.
- Generator run: 515 recipe files, PANEL_VERSION 302 → 303.

### Status
- [x] Generator three-tier safety mapping fixed
- [x] `usda_safe_c`/`usda_safe_f` forwarded to EXP_TREE cut objects
- [x] Safety legend restored in Doneness card
- [x] USDA minimum warning note added in Target Temperature card
- [x] Version bump to 0.6.1.32, PANEL_VERSION auto-incremented to 303
- [x] Generator run successful
