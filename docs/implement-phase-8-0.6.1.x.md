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

### v0.6.1.00 — 2026-04-23 (Phase 8 features)
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

### v0.6.1.02 — 2026-04-23
**Features: MEATER probe subprocess, HA todo bridge, AI serving scaling**

#### MEATER Probe as Recipe Subprocess
- `_startMeaterSubprocess()`: finds a cooking session entity, calls `start_simple_probe_cook`
  service, stores `{entityId, targetTempC}` in `state.meaterSubprocess`.
- `_stopMeaterSubprocess()`: detaches probe from recipe (probe session keeps running).
- `_renderMeaterProbeInfo()`: now reads `hass.states[entityId].attributes.current_temp`
  for live temperature display; replaced hardcoded 45°C stub.
- `_renderRecipeCookStep()`: adds a "🌡️ Start MEATER Probe" card when `recipe.use_probe`
  is true, `recipe.target_temp_c` is set, and no subprocess is active yet.
- i18n keys added: `recipe_cook.start_meater_btn`, `recipe_cook.meater_detach_hint` (en + sv).

#### HA `todo.add_item` Bridge
- `_findHATodoEntity()`: returns `todo.shopping_list` (or first `todo.*` entity) from
  `hass.states`, or null if none found.
- `_pushToHATodo(names)`: calls `todo.add_item` service for each name; warns to console on
  failure; returns number of successfully pushed items.
- Shopping list view: "📤 Export to HA Shopping List" button added; only shown when unchecked
  items exist; displays success/error feedback toast.
- Post-cook shelf update: "Add to Shopping List" button now also calls `_pushToHATodo`
  (fire-and-forget after KCE internal list write).
- i18n keys added: `shopping_list.export_to_ha`, `shopping_list.exported_to_ha`,
  `shopping_list.ha_todo_not_found` (en + sv).

#### AI Recipe In-Cook Serving Scaling
- AI recipe suggestion cards now have a live serving size `<input>` spinner (same as Ninja
  Combi detail view), wired to `_updateRecipeServings()`.
- `_startCookingFromAIRecipe()` now passes `fullRecipe._adjustedServings` to `_startRecipeCook`.
- `_renderRecipeCookOverview()` uses `recipe._adjustedIngredients` (falls back to `recipe.ingredients`).
- `_renderRecipeCookStep()` uses `recipe._adjustedIngredients` for the active/inactive
  ingredient colour-coding lists.
- `_updateRecipeServings()` refactored to call new `_smartRound(value)` helper.
- `_smartRound(value)`: rounds to nearest 5 (≥50), integer (≥10), 0.5 (≥2),
  or 0.25 (<2); avoids impractical outputs like 1.333.
- Fraction strings like "1/2" in ingredient text are now parsed correctly before scaling.
- Handles Swedish commas in numbers and Swedish/English unit abbreviations (tsk, msk, dl, kg, etc.).

#### ToR Cleanup
- Removed language auto-detect from HA config from ToR §9.1 and this plans file.
  Language defaults to English; user selects from welcome screen settings.
- PANEL_VERSION bumped 260 → 261 (auto by generator).



### v0.6.1.04 — 2026-04-23
**Bugfix: "Hide other language tree" checkbox placed in wrong screen**

- Checkbox was rendered inside the MEATER cook-start screen, inside the
  "Temperature Data Source" card (after the Swedish description text).
- Moved to the welcome screen Language card, directly below the 🇸🇪/🇬🇧 buttons.
- This is the correct UX location: it's a language/data-source preference, not a
  per-cook choice, so it belongs with the other persistent settings on the welcome screen.
- No i18n changes needed (`meater.hide_other_tree` key already existed in both en/sv).
- PANEL_VERSION bumped 262 → 263 (auto by generator).

### v0.6.1.03 — 2026-04-23
**Docs: Comprehensive user guide**

- Created `docs/USER_GUIDE.md` — 14 sections covering installation, all 7 appliance
  types (MEATER+, Ninja Combi, MultiFry, Standard Oven, Stovetop, Microwave, Custom),
  every cooking path (MEATER probe flow, Ninja built-in/builder, AI Recipe Builder),
  recipe cook flow (overview, serving scaling, step-by-step, probe subprocess, ratings,
  parallel cooks), shelf management (locations, cooking modes A/B/C, post-cook update),
  shopping list (add/check/export to HA todo), cook history, language & measurement
  settings, full developer services reference (all 7 HA services with field tables),
  and troubleshooting (8 common issues).
- README: Added `## 📖 User Guide` section linking to `docs/USER_GUIDE.md`.
- No code changes; PANEL_VERSION unchanged at 262.

### v0.6.1.05 — 2026-04-23
**Feature: Hide entire Temperaturdata card when "Hide other language tree" is checked**

- When `_hideOtherDataSource` is true the entire "🌍 Temperaturdata" `<ha-card>` (Data
  Source Selector) is now hidden from the MEATER cook-start screen.
- Previously only the inactive language button was hidden; the card itself remained
  visible. Now the whole card disappears, giving a cleaner cook-start flow for users
  who have committed to one data source.
- The previously active source stays selected; it is still changeable from the
  welcome screen by unchecking the box and switching source.
- PANEL_VERSION bumped 263 → 264 (auto by generator).
- CHORES.md items ticked: versions updated, branch timeline updated, user guide updated.

### v0.6.1.07 — 2026-04-23
**Bugfix: Swedish category names not shown when hide-other-tree is active (fresh browser)**

- Root cause of v0.6.1.06 fix being incomplete: `_loadLanguagePreference()` is **async**
  (API call). `_loadHideOtherDataSourcePreference()` runs synchronously before the API
  resolves, so `_language` is still `'en'` when the data source check runs. In a fresh
  browser with no `kce_data_source` in localStorage, `_dataSource` stayed `international`
  regardless of the persisted language preference.
- Fix: `_loadLanguagePreference()` — after the API resolves and `_language` is set, if
  `_hideOtherDataSource` is true, immediately set `_dataSource` to match
  (`'sv'` → `DATA_SOURCE_SWEDISH`, else `DATA_SOURCE_INTERNATIONAL`).
- Fix: `_saveLanguagePreference()` — when the user switches language on the welcome screen,
  if `_hideOtherDataSource` is true, also update `_dataSource` to match the new language.
- Fix: `_toggleHideOtherDataSource()` — when the checkbox is toggled **on**, set
  `_dataSource` to match the current `_language` immediately.
- Combined effect: the data source is always kept in sync with the UI language whenever
  the hide-selector flag is active, regardless of localStorage state or browser freshness.
- PANEL_VERSION bumped 265 → 266 (auto by generator).
- CHORES: versions updated, branch timeline updated, user guide §5.3 updated.


**Bugfix: Swedish data source not persisted — reloads showed International tree**

- Root cause: `_dataSource` was never saved to localStorage. On reload, it reset to
  `DATA_SOURCE_INTERNATIONAL`. With `_hideOtherDataSource = true` the selector card
  is hidden, so users who had selected Swedish were silently switched to International
  with no way to change it back.
- Fix: `_switchDataSource()` now calls
  `localStorage.setItem('kce_data_source', source)` after updating the reactive property.
- Fix: `_loadHideOtherDataSourcePreference()` now also reads `kce_data_source` from
  localStorage and restores `_dataSource` (validated to `'swedish'` or `'international'`).
- PANEL_VERSION bumped 264 → 265 (auto by generator).
- CHORES: versions updated, branch timeline updated, user guide §5.3 updated.

---
  All callers updated: `_toggleIngredient`, `_addCustomIngredient`, `_removeIngredient`,
  `_proceedToCookingStyle` guard, `_generateAIRecipes` request body,
  `_renderIngredientCheckbox` (`.includes` → `.find`), badge render in selected-ingredients section.

- `UserPreferencesView` only had a `GET`; added `PATCH` for `shelf_enabled` and `cooking_mode`.

- `_saveRecipeCook` triggers the post-cook shelf-update flow (stored in
  `this._pendingShelfUpdate`) before navigating away — existing save logic untouched.

- Cooking Mode C uses a second `_call_openai` call in `ai_recipe_builder.py` to
  cross-reference recipe ingredients against the combined set, then prepends a
  "Step 0 — Shopping & Preparation List" when items are missing.
