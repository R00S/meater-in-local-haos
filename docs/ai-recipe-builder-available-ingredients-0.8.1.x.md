# Branch Timeline: ai-recipe-builder-available-ingredients (v0.8.1.x)

## Goal

Improve the AI Recipe Builder ingredient selector:

- **A**: Expand the selectable ingredient pool (partly based on recipe files)
- **B**: When a cuisine is selected, ingredient set also partly based on recipe files
- **C**: Same base size as now but each category has a "More" button to reveal extended set
- **D**: Second-level drill-down for proteins (meat/fish → subcategories of cuts)
- **E**: If shelf is activated, shelf items pop up in ingredient picker

## Implementation Plan

1. `ai_recipe_data.py` — expand COMMON_INGREDIENTS with `common: True/False` flags, add spices section
2. `generate_frontend_data.py` — extract protein subcats from `exp_tree` → `AI_PROTEIN_SUBCATS` JS constant
3. `panel-class-template.js` — "More" button per category, protein subcategory drill-down, shelf integration
4. Regenerate frontend
5. Bump version 0.8.1.0 → 0.8.1.1

## Sessions

### Session 1 (2026-04-30)

**Discoveries:**
- COMMON_INGREDIENTS was: 9 proteins + 12 vegetables + 5 grains + 5 dairy = 31 items (no spices)
- CUISINE_INGREDIENTS: 41 cuisines/regions × ~28 items each
- INGREDIENT_CATEGORIES maps ~200+ IDs to categories (p/v/g/d/s)
- `exp_tree` built from KCE:CUT recipe files: 164 cut files across beef/pork/poultry/fish/lamb/game/vegetables
- Shelf items: `{ id, name, location (fridge|larder|freezer|spices), quantity }`
- Recipe method files have ingredients in prose (not structured) — only KCE:CUT overview files have structured frontmatter
- The `common: True` field exists on COMMON_INGREDIENTS items but was NOT used in UI rendering

**Work done:**

1. **`ai_recipe_data.py`** — expanded COMMON_INGREDIENTS from 31 → 111 items:
   - Added `common` flag to every item (True = base set, False = extended/More set)
   - New **Spices & Seasonings** category (27 items): cumin, paprika, garam masala, turmeric, berbere, ras el hanout, saffron, etc.
   - Proteins: added turkey; Vegetables: added fennel, peas; Grains: added polenta; Dairy: added butter
   - Fixed INGREDIENT_CATEGORIES for new items (turkey→p, fennel→v, polenta→g, butter→d)
   - Fixed INGREDIENT_NAMES_SV for fennel→"Fänkål", polenta→"Polenta", peas→"Ärtor"
   - Added clarifying comment to `dairy` category: it maps to "Dairy, Oils & Sauces" UI label and intentionally includes non-dairy pantry staples

2. **`generate_frontend_data.py`** — new JS constants emitted:
   - `AI_COMMON_INGREDIENTS` — flat array of `{id, name, cat, common}` enriched from INGREDIENT_CATEGORIES (111 items)
   - `AI_PROTEIN_SUBCATS` — 137 cuts across 6 protein categories (beef/pork/poultry/fish/lamb/game) extracted from EXP_TREE
   - `AI_PROTEIN_SUBCAT_LABELS` / `AI_PROTEIN_SUBCAT_LABELS_SV` — display names for each category
   - Moved protein subcats build to after `exp_tree` is built (ordering fix)

3. **`panel-class-template.js`** — new/changed methods:
   - `_startAIRecipeCreation` / `_startAIWithNinjaCombi` now use `AI_COMMON_INGREDIENTS` directly (no API round-trip); falls back to API if constant not present
   - New state: `_ingredientExpandedCats` (array of category codes with "More" expanded), `_ingredientProteinSubcat` (active protein sub-group)
   - `_renderCategorizedIngredients` rewritten: groups categories, separates base/extended items, renders "More (+N)" / "Show less" button per category; delegates protein category to new method
   - `_renderProteinCategory` (new): renders protein sub-group tabs (🐄🐷🍗🐟🐑🦌), shows cuts from `AI_PROTEIN_SUBCATS` when a tab is active, falls back to standard ingredient list otherwise
   - `_renderShelfIngredientSuggestions` (new): when shelf is enabled and populated, renders "🗄️ From Your Shelf" section above ingredient grid with location-coded chips (🧊🏺❄️🌿); tapping adds item via `_addCustomIngredient`
   - `_ingDisplayName` updated: falls back to inline `name_sv` for recipe-file cuts not in `AI_INGREDIENT_NAMES_SV`
   - `_lookupIngDisplayName` updated: also searches `AI_COMMON_INGREDIENTS` and `AI_PROTEIN_SUBCATS`
   - Back button handler: resets `_ingredientExpandedCats` and `_ingredientProteinSubcat` on exit

4. **`i18n/en.json` + `i18n/sv.json`**: added keys `more_ingredients`, `show_less`, `from_shelf`, `from_recipe_files`

5. **`docs/USER_GUIDE.md`** §7.2: updated to describe new features (shelf section, "More" button, protein drill-down)

**Versions released:**
- v0.8.1.1 — feature + review fixes (PANEL_VERSION 391)
- v0.8.1.2 — CHORES (version bump + docs)

### Session 2 (2026-04-30)

**Discoveries:**
- `CUISINE_INGREDIENTS` in `ai_recipe_data.py` only had ~5 items per cuisine (no common/extended split)
- `AI_PROTEIN_TO_SUBCAT` and `AI_GENERIC_PROTEIN_IDS` already designed in `ai_recipe_data.py` but not exported by generator or used in JS
- Drill-down cut IDs in `AI_PROTEIN_SUBCATS` use compound slugs (e.g. `salmon_fillet`) while CUISINE_INGREDIENTS uses base IDs (e.g. `salmon`) — need prefix matching

**Work done:**

1. **`ai_recipe_data.py`** — expanded `CUISINE_INGREDIENTS` from ~41 cuisines × 5 items to 86 cuisines × ~26 items (2 260 total):
   - Every cuisine entry uses `_ing()` (common=True) / `_inge()` (common=False) helpers
   - Base set (common=True) kept at ~12 items per cuisine; extended set behind "More"
   - 45 new specific cuisines added (regional, national and tribal)
   - `PROTEIN_TO_SUBCAT` dict added: maps ~50 protein ingredient IDs → subcat key (beef/pork/poultry/fish/lamb/game)
   - `GENERIC_PROTEIN_IDS` set added: bare category names (beef, chicken, fish…) that duplicate subcat buttons

2. **`generate_frontend_data.py`** — new exports:
   - `AI_PROTEIN_TO_SUBCAT` — maps ingredient ID → protein subcat key
   - `AI_GENERIC_PROTEIN_IDS` — list of generic IDs to filter from badge list

3. **`panel-class-template.js`** — `_renderProteinCategory` updated:
   - Reads selected cuisines + their `common=True` ingredients
   - Maps those through `AI_PROTEIN_TO_SUBCAT` → builds `cuisineHighlightedSubcats` set
   - Subcat buttons (Beef/Pork/Poultry/Fish/Lamb/Game) highlighted blue (outline + subtle fill + bold) when cuisine has common proteins in that group
   - Drill-down cuts highlighted blue + prefixed with ★ when matching common cuisine protein via prefix match (`salmon` → `salmon_fillet`, `salmon_steak`)
   - Generic protein IDs (beef, chicken, fish…) filtered from flat badge list — subcat button already represents them

**Versions released:**
- v0.8.1.5 — B/C: expanded CUISINE_INGREDIENTS (PANEL_VERSION 398)
- v0.8.1.6 — A: cuisine-aware protein subcat highlighting (PANEL_VERSION 399)
- v0.8.1.7 — CHORES (version bump + docs)

### Session 3 (2026-05-xx)

**Task:** Expand CUISINE_INGREDIENTS for 15 European/Nordic cuisines to hit minimums: v≥16, g≥6, d≥7, s≥7.

**Method:**
1. Web-searched real recipes for each cuisine to confirm ingredients appear in ≥3 recipes
2. Added `_inge()` entries only for verified ingredients from the global ingredient ID list

**Results (all hit targets exactly):**
- swedish: v=16 g=6 d=7 s=7
- danish: v=16 g=6 d=7 s=7
- norwegian: v=16 g=6 d=7 s=7
- finnish: v=16 g=6 d=7 s=7
- icelandic: v=16 g=6 d=7 s=7
- british: v=16 g=6 d=7 s=7
- german: v=16 g=6 d=7 s=7
- french: v=16 g=6 d=7 s=7
- polish: v=16 g=6 d=7 s=7
- hungarian: v=16 g=6 d=7 s=7
- balkan: v=16 g=6 d=7 s=7
- portuguese: v=16 g=6 d=7 s=7
- spanish: v=16 g=6 d=7 s=7
- italian: v=16 g=6 d=8 s=7 (dairy already ≥7)
- greek: v=16 g=6 d=7 s=7

**No duplicates in any cuisine list. File parses cleanly.**

### Session 4 (2026-05-xx)

**Task:** Expand CUISINE_INGREDIENTS for 13 Middle East / North African cuisines to hit minimums: v≥16, g≥6, d≥7, s≥7.

**Method:**
1. Read current entries for each cuisine to identify deficits
2. Web-searched authentic recipes (Turkish, Persian, Emirati, Moroccan, etc.) to confirm ≥3 appearances
3. Added `_inge()` entries only for verified ingredients from the global palette ID list
4. Verified with Python script that all counts hit targets, no ceiling exceeded, no duplicates

**Results (all targets met):**
- middle_east: v=16 g=6 d=7 s=12
- turkish: v=16 g=6 d=7 s=10
- persian: v=16 g=6 d=7 s=12 (tarragon/tarkhun verified in kuku, ash, khoresh)
- lebanese: v=16 g=6 d=7 s=10
- israeli: v=16 g=6 d=7 s=8
- syrian: v=16 g=6 d=7 s=8
- iraqi: v=16 g=6 d=7 s=11
- yemeni: v=16 g=6 d=7 s=9
- emirati: v=16 g=6 d=7 s=11 (okra verified in machboos)
- palestinian: v=16 g=6 d=7 s=9
- moroccan: v=16 g=6 d=7 s=13 (artichokes verified in tagine bil qar3oub)
- tunisian: v=16 g=6 d=7 s=7
- egyptian: v=16 g=6 d=7 s=7

**No duplicates. AST parses cleanly. 117 lines added.**


### Session 5 (2026-05-xx)

**Task:** Expand CUISINE_INGREDIENTS for 10 African cuisines to hit minimums: v≥16, g≥6, d≥7, s≥7.

**Method:**
1. Read current entries for each cuisine to identify deficits
2. Web-searched authentic recipes (jollof, egusi, yassa, doro wat, nyama choma, pilau, etc.)
3. Added `_inge()` entries only for verified ingredients from global palette
4. Fixed dropped `_ing()` base entries for Ethiopian (lentils, chickpeas) and Tanzanian (fish, rice, corn, onions, tomatoes, coconut_milk, garlic) caused by earlier edit-tool bug

**Results (all targets met):**
- nigerian: v=16 g=6 d=7 s=7
- ghanaian: v=16 g=6 d=7 s=7
- senegalese: v=16 g=6 d=7 s=7
- west_african: v=16 g=6 d=7 s=7
- african: v=16 g=6 d=7 s=7
- ethiopian: v=16 g=6 d=7 s=7 (restored dropped lentils + chickpeas)
- east_african: v=16 g=6 d=7 s=7
- kenyan: v=16 g=6 d=7 s=7
- tanzanian: v=16 g=6 d=7 s=7 (restored 7 dropped base _ing() entries)
- south_african: v=16 g=6 d=7 s=7

**No duplicates. AST parses cleanly. Version bumped to 0.8.1.8, PANEL_VERSION=401.**
