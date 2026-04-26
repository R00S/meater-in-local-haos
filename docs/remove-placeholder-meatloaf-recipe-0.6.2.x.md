# Branch: remove-placeholder-meatloaf-recipe — v0.6.2.x

## Task
Bug fixes: remove placeholder meatloaf recipe, address issues #83, #84, #85.

> **Note:** The first agent on this branch incorrectly kept the version at `0.6.1.x` instead of
> bumping the agent number to `0.6.2`. Work was done under the wrong versions `0.6.1.31` and
> `0.6.1.32`. The correct starting version was `0.6.2.00`. The version was corrected (0.6.1.32 →
> 0.6.2.00) and PANEL_VERSION incremented (303 → 304) in the version-correction commit.
> The old timeline file `remove-placeholder-meatloaf-recipe-0.6.1.x.md` has been deleted.

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

## Status (corrected version numbers)

Work done under wrong version `0.6.1.31` (should have been `0.6.2.00`):
- [x] Delete meatloaf_alt.md from docs and www/recipes
- [x] Fix #85: add `_renderHistoryCard(cook)` — resolves TypeError causing blank-screen flash
- [x] Fix #83: use `_aiPortions` as fallback on suggestions page + show serving_size in cook detail
- [x] Fix #84: add `_lookupIngDisplayName(name)` helper; ingredient chips now translated
- [x] Add i18n keys `history.serving_size_label` (EN + SV)

Work done under wrong version `0.6.1.32` (should have been `0.6.2.01`):
- [x] Generator three-tier safety mapping fixed (binary → three-tier: safe/caution/unsafe)
- [x] `usda_safe_c`/`usda_safe_f` forwarded to EXP_TREE cut objects
- [x] Safety legend restored in Doneness card (🟢 safe · 🟠 caution · 🔴 below guidelines)
- [x] USDA minimum warning note added in Target Temperature card

## v0.6.2.00 — Correct version bump (agent number 1→2, release counter reset)

### Changes
- `manifest.json`, `__init__.py`, `const.py`: `0.6.1.32` → `0.6.2.00`
- Generator run: PANEL_VERSION 303 → 304
- Timeline file renamed from `remove-placeholder-meatloaf-recipe-0.6.1.x.md` to `remove-placeholder-meatloaf-recipe-0.6.2.x.md`
- `docs/USER_GUIDE.md` version header updated to `0.6.2.00`

### Status
- [x] All 4 version locations updated to 0.6.2.00
- [x] Generator run successful (516 recipe files, PANEL_VERSION 304)
- [x] Correct timeline file created
- [x] Wrong timeline file deleted
- [x] User guide version header updated

## v0.6.2.01 — Lovelace custom card (Option A)

### Changes
- `panel-class-template.js`: Added `setConfig()` and `getCardSize()` (Lovelace card interface)
- `panel-class-template.js`: Registered stable `kitchen-cooking-card` element alias
- `__init__.py`: Added `_async_register_lovelace_resource()` — auto-registers panel JS as a Lovelace module resource on startup, removes stale entries from previous versions; graceful fallback with log warning if Lovelace is in YAML mode
- `manifest.json`, `__init__.py`, `const.py`: `0.6.2.00` → `0.6.2.01`
- Generator run: PANEL_VERSION 304 → 305

### Usage
```yaml
type: custom:kitchen-cooking-card
```
Drop into any dashboard view. Sidebar panel continues to work unchanged.
The resource is auto-registered on HA startup — no manual Lovelace resource configuration needed.

### Compatibility
- Targets HA 2026.4.x (`hass.data["lovelace"].resources` API, stable since 2023.x)
- Falls back gracefully if Lovelace is in YAML mode

### Status
- [x] `setConfig()` + `getCardSize()` added to template
- [x] `kitchen-cooking-card` stable alias added to template
- [x] `_async_register_lovelace_resource()` added to `__init__.py`
- [x] Version bumped to 0.6.2.01 in all 4 locations
- [x] Generator run successful (515 recipe files, PANEL_VERSION 305)

---

## v0.6.2.02 — Global recipe diversity expansion

### Problem
Recipe research files across many cut-method combinations were dominated by European
(especially Danish, German, Austrian, Spanish) sources, lacking representation from
Asian, African, South American, and Middle Eastern culinary traditions. This is not
in line with the Recipe Collection Terms of Reference, which calls for globally diverse
sources that represent authentic traditions rather than Western adaptations.

### Scope
- Confirmed which sites are reachable from the Copilot sandbox (SOURCE_SURVEY.md)
- Audited all existing cut-method files for geographic diversity
- Added authentic non-Western recipes to files where the tradition gap was greatest

### Changes
**Chicken files (9 files updated):**
- `chicken_thigh-grill.md`: Added Thai Gai Yang ไก่ย่าง (hot-thai-kitchen.com)
- `chicken_thigh-oven_roast.md`: Added Egyptian-spiced Baked Chicken (themediterraneandish.com)
- `chicken_thigh-air_fryer.md`: Added West African Creole Chicken (africanbites.com)
- `chicken_breast-grill.md`: Added Thai Gai Yang breast variant (hot-thai-kitchen.com)
- `chicken_breast-oven_bake.md`: Added Indian Tandoori Chicken (indianhealthyrecipes.com)
- `chicken_breast-air_fryer.md`: Added Indian Chicken Tikka (indianhealthyrecipes.com)
- `chicken_breast-pan_sear.md`: Added Vietnamese Gà Xào Sả Ớt lemongrass sauté (hungryhuy.com)
- `chicken_leg-oven_roast.md`: Added Indian Tandoori drumsticks (indianhealthyrecipes.com)
- `chicken_wing-air_fryer.md`: Added Thai Fish Sauce Wings (hot-thai-kitchen.com)
- `whole_chicken-oven_roast.md`: Added Egyptian/Mediterranean roasted chicken (themediterraneandish.com)

**Pork files (5 files updated):**
- `pork_chop-grill.md`: Added Vietnamese Sườn Nướng (hungryhuy.com)
- `pork_chop-oven_roast.md`: Added West African/Caribbean oven pork (africanbites.com)
- `pork_chop-pan_fry.md`: Added Thai Garlic Pepper Pork หมูทอดกระเทียมพริกไทย (hot-thai-kitchen.com)
- `pork_chop-air_fryer.md`: Added West African Creole air-fryer pork chops (africanbites.com)
- `pork_tenderloin-oven_roast.md`: Added West African Creole pork tenderloin (africanbites.com)

**Version bump:** `0.6.2.01` → `0.6.2.02` · PANEL_VERSION `305` → `306`

### Status
- [x] All chicken cut-method files updated with Asian/African/ME tradition recipes
- [x] High-priority all-European pork files updated
- [x] Cut profile text preserved (anatomy descriptions retained per user requirement)
- [x] Version bumped in all 4 locations
- [x] Generator run successful (PANEL_VERSION 306)
- [ ] pork_tenderloin grill/pan_sear/air_fryer/sous_vide — still all-European (ongoing)
- [ ] ribeye_steak-grill — still all-European (ongoing)
- [ ] ny_strip-pan_sear — still all-western (ongoing)
- [ ] pork_belly-pan_fry, pork_shoulder-oven_roast — still all-European (ongoing)
- [ ] rack_of_lamb-oven_roast, leg_of_lamb-oven_roast — still limited diversity (ongoing)
