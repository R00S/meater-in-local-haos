# Branch Timeline: implement-phase-8 — v0.6.1.x

Branch: `copilot/implement-phase-8`
Version series: `0.6.1.x`
Started: 2026-04-23

---

## Goal

Implement Phase 8: Ingredient Levels & Cooking Modes as specified in
`docs/GUI_REDESIGN_TERMS_OF_REFERENCE.md §5.6`.

Five sub-tasks: 8a (Compulsory Ingredients), 8b (Shelf Management), 8c (Cooking
Modes A/B/C), 8d (Post-Cook Shelf Update), 8e (External Bridges — deferred).

---

## Progress

### v0.6.1.00 — 2026-04-23
- Version bumped from 0.6.0.05 to 0.6.1.00 across all 4 locations.
- Branch timeline file created.

### v0.6.1.01 — 2026-04-23
**Bugfix: Blank screen crash on "Create AI Recipe"**

- Root cause: `_startAIRecipeBuilder` seeded `_selectedIngredients` with a plain
  string (`["use Ninja Combi programs"]`), but all Phase 8 render/filter callbacks
  call `i.name.toLowerCase()`. `i.name` is `undefined` on a plain string → TypeError
  crashed the LitElement render → "Reloading Kitchen Cooking Engine…" loop.
- Fix: Changed initialisation to `[{name: "use ...", compulsory: false}]`.
- Fix: `user_ingredients` in both `get_recipe_detail` API calls now uses
  `.map(i => i.name)` to extract strings before sending to backend.
- Fix: Defensive `i.name &&` guards added to all `.find()` / `.filter()` callbacks
  (`_toggleIngredient`, `_addCustomIngredient`, `_removeIngredient`,
  `_renderIngredientCheckbox`) to prevent the same crash from any stale plain string.
- PANEL_VERSION bumped 259 → 260 (auto by generator).

### v0.6.1.00 — (in progress)
- 8a: `_selectedIngredients` changed to `Array<{name, compulsory}>`.
- 8a: Compulsory badge toggle UI (click body to toggle ⭐, × to remove).
- 8a: `ai_recipe_builder.py` accepts `compulsory_ingredients`, injects MUST-use directive.
- 8a: i18n keys added for `ai_recipe.compulsory_toggle_hint` and `ai_recipe.compulsory_badge_label`.
- 8b: `storage.py` — `SHELF_INVENTORY_FILE`, `async_load_shelf_inventory`, `async_save_shelf_inventory`.
- 8b: `api.py` — `ShelfInventoryView` (GET/POST/DELETE), PATCH on `UserPreferencesView` for `shelf_enabled`.
- 8b: Frontend — "Enable Shelf Management" toggle in welcome settings cards.
- 8b: Frontend — `_renderShelfManagement()` screen with grouped locations, add-item form, remove.
- 8b: i18n keys for shelf management.
- 8c: Frontend — `_cookingMode` state, radio group shown when `_shelfEnabled`.
- 8c: `ai_recipe_builder.py` — Mode B (restrict to shelf), Mode C (shopping list prepended).
- 8c: Frontend — passes `cooking_mode` + `shelf_items` in generate call.
- 8c: i18n keys for mode labels.
- 8d: `storage.py` — `SHOPPING_LIST_FILE`, `async_load_shopping_list`, `async_save_shopping_list`.
- 8d: `api.py` — `ShoppingListView` (GET/POST/PATCH/DELETE).
- 8d: Frontend — post-cook shelf-update prompt after rating screen.
- 8d: Frontend — `_renderShoppingList()` screen.
- 8d: i18n keys for post-cook and shopping list.
- Regenerated `kitchen-cooking-panel.js`.

---

## Notes / Discoveries

- `_selectedIngredients` was a flat `string[]`; changed to `{name, compulsory}[]`.
  All callers updated: `_toggleIngredient`, `_addCustomIngredient`, `_removeIngredient`,
  `_proceedToCookingStyle` guard, `_generateAIRecipes` request body,
  `_renderIngredientCheckbox` (`.includes` → `.find`), badge render in selected-ingredients section.

- `UserPreferencesView` only had a `GET`; added `PATCH` for `shelf_enabled` and `cooking_mode`.

- `_saveRecipeCook` triggers the post-cook shelf-update flow (stored in
  `this._pendingShelfUpdate`) before navigating away — existing save logic untouched.

- Cooking Mode C uses a second `_call_openai` call in `ai_recipe_builder.py` to
  cross-reference recipe ingredients against the combined set, then prepends a
  "Step 0 — Shopping & Preparation List" when items are missing.
