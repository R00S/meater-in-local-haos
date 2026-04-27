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
- [x] pork_tenderloin-grill → Thai Moo Ping (hot-thai-kitchen.com/bbq-pork-skewers/) + Chinese Char Siu BBQ (thewoksoflife.com/bbq-char-siu-grill/)
- [x] pork_tenderloin-pan_sear → Chinese Pork & Pepper Stir-fry 辣椒小炒肉 (thewoksoflife.com/pork-pepper-stir-fry/)
- [x] pork_tenderloin-air_fryer → Creole Air Fryer Pork Tenderloin/Southern Creole/West African (africanbites.com/air-fryer-pork-chops/)
- [x] pork_chop-pan_sear → Southern US Creole Smothered Pork Chops (africanbites.com/smothered-pork-chops/)
- [x] pork_belly-pan_fry → Korean Crispy Pork Belly Kimchi Bowls (thewoksoflife.com/pork-belly-kimchi-bowls/)
- [x] pork_shoulder-oven_roast → Puerto Rican Pernil/Caribbean (africanbites.com/pernil-puerto-rican-roast-pork/)
- [x] ribeye_steak-grill → Chinese-American Soy Butter Glaze (thewoksoflife.com/grilled-ribeye-soy-butter-glaze/)
- [x] rack_of_lamb-oven_roast → Mediterranean/Egyptian Garlic Herb Rack (themediterraneandish.com/roast-lamb-rack-recipe/)
- [x] leg_of_lamb-oven_roast → Mediterranean/Egyptian leg of lamb with potatoes (themediterraneandish.com/mediterranean-style-leg-of-lamb-recipe-with-potatoes/)
- [x] Generator run successful (PANEL_VERSION 307, 516 recipe files)
- [ ] pork_tenderloin-sous_vide — still all-European (Danish, Austrian, Italian); no verified Asian sous vide pork tenderloin source found on reachable sites
- [ ] ny_strip-pan_sear — still all-Western (5 recipes: American, British, French, British Modernist, Australian); no verified non-Western strip steak pan-sear source found on reachable sites

---

## v0.6.2.04 — cooking_methods_researched quality field

### Changes

Added `cooking_methods_researched: 0` to all 185 cut index files in `docs/recipe_research/`.

This new frontmatter field tracks whether the `methods:` list for a cut has been deliberately
researched and verified across culinary sources, as opposed to being auto-populated from
`cooking_data.py` with no verification. The field defaults to `0` on every file. Set it to `1`
once research is complete and the list has been reviewed.

**Scoring impact:**
- `RECIPE_COLLECTION_TOR.md`: New `### Appropriate cooking method research` criterion section added.
  Deduction: **−8** if `cooking_methods_researched: 0`.
- Scoring summary table updated; maximum total deduction updated from −19 to −27 (+ method files).
- All 185 cut files: `quality_score` reduced by 8, `| Cooking methods not researched | −8 |` row
  added to each file's `## Quality score` table, deduction added as #1 improvement priority.

**Score distribution after this change:**

| Score | Count |
|-------|-------|
| 0 | 52 |
| 4 | 1 |
| 5 | 4 |
| 6 | 5 |
| 7 | 25 |
| 8 | 36 |
| 9 | 31 |
| 10 | 21 |
| 11 | 9 |
| 12 | 1 |

52 files at 0 are the highest-priority improvement targets.

### Status
- [x] `cooking_methods_researched: 0` added to all 185 cut index files
- [x] `quality_score` reduced by 8 on all files
- [x] Deduction row and improvement priority added to each file's Quality score section
- [x] `RECIPE_COLLECTION_TOR.md` updated with new criterion + scoring table
- [x] Version bumped to 0.6.2.04 in all 4 locations
- [x] USER_GUIDE.md version header updated to 0.6.2.04

---

## v0.6.2.05 — Contextual help buttons on every GUI screen

### Changes

Added a **"?" help button** to every navigable screen in the Kitchen Cooking Engine panel.
Each button opens the relevant section of `USER_GUIDE.md` on GitHub in a new tab.

**Implementation:**

- New `_openHelp(anchor)` method added to `KitchenCookingPanel` class — opens
  `https://github.com/R00S/meater-in-local-haos/blob/main/docs/USER_GUIDE.md{anchor}`.
- New `.help-btn` CSS class — small circular `?` button, `position: absolute; top: 0; right: 0`
  relative to the containing header.
- `.path-header` and `.welcome-header` updated to `position: relative` so the button anchors correctly.
- `.recipe-cook-help-btn` modifier class makes the button white/semi-transparent on the
  colour-filled recipe cook header background.

**Screens wired up:**

| Screen | Anchor |
|--------|--------|
| Welcome | `#41-welcome-screen` |
| MEATER probe path (path buttons) | `#5-meater-probe-cooking` |
| MEATER probe path (setup form) | `#51-starting-a-cook` |
| MEATER+ experimental (path buttons) | `#59-meater-experimental--cut-profile--recipe-links` |
| MEATER+ experimental (setup form) | `#51-starting-a-cook` |
| Recent MEATER cooks | `#57-recent-meater-cooks` |
| Ninja Combi path | `#6-ninja-combi-cooking` |
| Ninja built-in recipes | `#61-built-in-recipes` |
| Recent Ninja cooks | `#64-recent-ninja-cooks` |
| AI Recipe Builder path | `#7-ai-recipe-builder` |
| AI ingredient selection | `#72-selecting-ingredients` |
| AI cooking style selection | `#73-choosing-a-cooking-style` |
| Previous cooks / history | `#11-cook-history` |
| Shelf management | `#9-shelf-management` |
| Shopping list | `#10-shopping-list` |
| Recipe cook flow | `#8-recipe-cook-flow` |

**CHORES.md updated:** The "Update the user guide" chore now includes the requirement to also
update the GUI help link anchors when user guide section headings change.

### Status
- [x] `_openHelp()` method added
- [x] `.help-btn` CSS added; `.path-header` and `.welcome-header` made `position: relative`
- [x] Help button added to all 16 screen variants listed above
- [x] `generate_frontend_data.py` run successfully — PANEL_VERSION 308
- [x] Version bumped to 0.6.2.05 in all 4 locations
- [x] USER_GUIDE.md version header updated to 0.6.2.05
- [x] CHORES.md expanded with help-link update requirement

---

## v0.6.2.06 — Fix model leaf ribeye_steak-pan_sear.md; verify sample leaf quality

### Context

The previous session's new-requirement work found that `ribeye_steak-pan_sear.md` —
the leaf cited as the reference standard in `RECIPE_COLLECTION_TOR.md` — was itself
non-conformant. The `ribeye_steak.md` cut index also flagged it with a `−1` deduction:
*"Method file ribeye_steak-pan_sear.md copies parent cut profile."*

The file had five complete source recipes but was missing all four mandatory TOR analysis
sections and carried a cut profile copied verbatim from the parent cut index.

### Changes

**`docs/recipe_research/beef/steaks/ribeye_steak-pan_sear.md`**
- Rewrote `## Cut profile` to be method-specific: fat rendering dynamics in a hot pan,
  carryover mechanics and why they differ from oven roast, probe placement considerations
  for boneless vs bone-in cuts and the fat-seam pitfall.
- Added `## Temperature consensus` — table of all five traditions + range analysis
  (44–54 °C pull; Wagyu outlier vs 49–54 °C mainstream medium-rare consensus).
- Added `## What makes this method special` — pan sear physics on fat-rich ribeye:
  conductive heat, Maillard on a fat-enriched exterior, rapid-flip vs single-flip
  technique comparison.
- Added `## Data applied to cooking_data.py` — actionable coding decisions.
- Added `## Summary` — ≤4 sentences.
- Added `> ✅ CONFORMS TO TOR` marker.

### CHORES
- Version bumped 0.6.1.32 → 0.6.2.06 in manifest.json, __init__.py (×2), const.py.
- `generate_frontend_data.py` run — PANEL_VERSION 310 → 311.
- USER_GUIDE.md version header updated to 0.6.2.06.

### Status
- [x] `ribeye_steak-pan_sear.md` cut profile rewritten (method-specific)
- [x] All four TOR analysis sections added
- [x] CONFORMS TO TOR marker added
- [x] Version bumped to 0.6.2.06 in all 4 locations
- [x] PANEL_VERSION auto-incremented to 311
- [x] USER_GUIDE.md version header updated to 0.6.2.06

---

## v0.6.2.07 — short_ribs-braise.md leaf + short_ribs.md cut profile

### Context

`short_ribs.md` was one of many quality_score: 0 cut index files (placeholder cut profile,
no leaf files). Task: create the braise leaf with real verified sources, write the cut
profile, update the cut index.

### Sources verified

All 5 source recipes were fetched via `web_fetch` from live URLs before being written:

| # | Chef / Author | Tradition | URL verified |
|---|---------------|-----------|-------------|
| 1 | Nagi Maehashi | Australian modern | recipetineats.com/braised-beef-short-ribs-in-red-wine-sauce/ |
| 2 | Suzy Karadsheh | Mediterranean/American | themediterraneandish.com/braised-beef-short-ribs-and-potatoes/ |
| 3 | Judy & Kaitlin Leung | Chinese-American fusion | thewoksoflife.com/asian-braised-short-ribs-with-chili-lime-potatoes/ |
| 4 | Kicki Malmö (TV amateur) | Swedish home | koket.se/shortribs-braserade-i-applemust |
| 5 | Erik Videgård (pro chef) | Swedish × Japanese | koket.se/shortribs-erik-videgards-recept |

### Changes

- Created `docs/recipe_research/beef/braising/short_ribs-braise.md` — 5 verified source
  recipes, all TOR analysis sections, CONFORMS TO TOR marker.
- Updated `docs/recipe_research/beef/braising/short_ribs.md` — replaced placeholder cut
  profile with full anatomy + method discussion; updated quality_score 0 → 8;
  `cooking_methods_researched`: 0 → 1; added method research status table.
- Version bumped to 0.6.2.07 in all 4 locations.
- `generate_frontend_data.py` run — PANEL_VERSION 312 → 313.
- USER_GUIDE.md version header updated to 0.6.2.07.

### Status
- [x] `short_ribs-braise.md` created — 5 verified sources, full TOR analysis
- [x] `short_ribs.md` cut profile written; quality_score updated 0 → 8
- [x] Version bumped to 0.6.2.07 in all 4 locations
- [x] PANEL_VERSION auto-incremented to 313
- [x] USER_GUIDE.md version header updated to 0.6.2.07

---

## 2026-04-27 — Create IMPROVE_CUT_FILES.md work queue (v0.6.2.08)

**Task:** "Create a file called IMPROVE_CUT_FILES.md in the experimental recipe directory
with the 50 lowest-scoring cut files and instructions for improving them (also create/improve
child cut-method files for those cuts if needed)."

### Work done

- Scanned all 166 cut index files in `docs/recipe_research/` — extracted `quality_score`,
  `methods:`, `cooking_methods_researched:`, and existing leaf file inventory for every cut.
- Sorted by score ascending, took the 50 lowest (scores 0–7).
- Created `docs/recipe_research/IMPROVE_CUT_FILES.md`:
  - 32 score-0 cuts (no research at all)
  - 1 score-4 cut (one leaf missing)
  - 4 score-5 cuts (partial research)
  - 6 score-6 cuts (most leaves done, cut profile needs improvement)
  - 7 score-7 cuts (some leaves missing)
  - Per-cut table with: slug, file path, existing leaves, missing leaves
  - Priority order (single-method cuts first)
  - How-to-improve guide referencing TOR and SOURCE_SURVEY rules
- Version bumped to 0.6.2.08 in all 4 locations.
- `generate_frontend_data.py` run — PANEL_VERSION 313 → 314.
- USER_GUIDE.md version header updated to 0.6.2.08.

### Status
- [x] `docs/recipe_research/IMPROVE_CUT_FILES.md` created — 50 lowest-scoring cuts, prioritised
- [x] Version bumped to 0.6.2.08 in all 4 locations
- [x] PANEL_VERSION auto-incremented to 314
- [x] USER_GUIDE.md version header updated to 0.6.2.08

---

## v0.6.2.09 — Improve 50 lowest-scoring cut files

### Task
Execute `IMPROVE_CUT_FILES.md`: improve the 50 lowest-scoring cut index files in
`docs/recipe_research/`, creating cut profiles and child cut-method leaf files with
verified real source recipes fetched from confirmed-working sites (SOURCE_SURVEY.md).

Commits between cut files as required.

### Status
- [x] Version bumped to 0.6.2.09 in all 4 locations
- [x] PANEL_VERSION auto-incremented to 315
- [x] USER_GUIDE.md version header updated to 0.6.2.09
- [ ] Cut file improvements in progress (see individual commits)
