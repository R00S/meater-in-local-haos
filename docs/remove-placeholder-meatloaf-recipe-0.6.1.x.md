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
- [ ] Delete meatloaf_alt.md
- [ ] Fix #85: add _renderHistoryCard
- [ ] Fix #83: portions fallback + history serving size display
- [ ] Fix #84: ingredient chip translation
- [ ] Version bump + generator run
