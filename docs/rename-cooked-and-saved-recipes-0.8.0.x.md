# Branch Timeline: rename-cooked-and-saved-recipes (v0.8.0.x)

## Goal

1. **Save recipe without cooking** — After AI recipe generation, add a "Save for later" button that stores the recipe in cook history with `comment = "Saved, not yet cooked"`.
2. **Rename "Previous Cooks"** — Rename to "Cooked and Saved recipes" everywhere (badge, screen title, navigation, i18n strings, documentation, user guide). Add two toggle buttons to hide saved-only or cooked-only entries.
3. **AI shortcut from MEATER cut selection** — When an end leaf (cut or cut-method) is selected in the MEATER path and AI is configured, show a weight input box and a button to jump to the AI suggestion stage (4 suggested recipes) pre-seeded with that cut and weight.

## Session Log

### 2026-04-29 — v0.8.0.0 — Initial version bump

- Bumped version to 0.8.0.0 in all 4 required locations.
- Timeline file created.

### 2026-04-29 — v0.8.0.0 — All three features implemented

**Feature 1 — Save for Later (clarification: button on fully generated recipe, not suggestion cards)**
- Added `_saveRecipeForLater()` method in `panel-class-template.js` — calls `ai_recipes/save_cook` API with `duration_seconds=0`, no ratings, `comment='Saved, not yet cooked'`, then exits the cook flow.
- Added "Save for Later" button at the bottom of `_renderRecipeCookOverview()` (the overview/step-−1 page).
- Updated `api.py` `AIRecipeSaveCookView.post()` to include `comment` field in stored cook data.
- New i18n keys: `ai_recipe.save_for_later`, `ai_recipe.save_for_later_hint`, `messages.recipe_saved_for_later_title`, `messages.recipe_saved_for_later`.

**Feature 2 — Rename + filters**
- Renamed in `en.json` + `sv.json`: `history.previous_cooks_title`, `meater.previous_cooks`, `welcome.previous_cooks_description`.
- Added filter toggle buttons to `_renderPreviousCooksPath()` (Hide saved / Hide cooked).
- Updated `_renderHistory()` to filter by `_hideSaved` / `_hideCooked` based on `cook.comment === 'Saved, not yet cooked'`.
- Updated `_renderHistoryCard()` to show a "💾 Saved" badge on saved-not-yet-cooked entries.
- New i18n keys: `history.filter_hide_saved`, `history.filter_hide_cooked`, `history.saved_badge`, `history.no_saved_visible`.

**Feature 3 — AI shortcut from MEATER cut selection**
- Added `_goToAISuggestionsForCut()` method: pre-seeds ingredients (cut name + weight, cooking method as context), maps MEATER method slug to AI cooking style, navigates to `ai_recipe_builder` path with `_showAIRecipeSuggestions = true`, sets `_meaterAiFromShortcut = true`, calls `_generateAIRecipes()`.
- Added AI shortcut card (weight input + button) in `_renderExpSetupForm()`, shown only when `_aiAgentId` is set and a doneness/method is selected.
- Updated back button in `_renderAIRecipeSuggestions()` to return to `meater_experimental` when `_meaterAiFromShortcut` is true.
- New i18n keys: `meater.ai_for_cut`, `meater.ai_weight_label`, `meater.ai_weight_placeholder`, `meater.ai_for_cut_hint`, `nav.back_to_cut_selection`.

**Documentation**
- Updated `docs/USER_GUIDE.md`: section 11 renamed to "Cooked and Saved Recipes", added sections 11.2 (Save for Later) and 11.3 (Filtering).

**Generator**
- `python3 generate_frontend_data.py` ran successfully; PANEL_VERSION bumped 117 → 381.

## Status

- [x] Feature 1: Save recipe without cooking — button on fully generated recipe overview
- [x] Feature 2: Rename Previous Cooks → Cooked and Saved Recipes + toggle filters + saved badge
- [x] Feature 3: AI shortcut from MEATER cut selection (weight input + jump to suggestions)
- [x] Documentation / user guide updates (USER_GUIDE.md section 11)
- [x] api.py comment field, i18n en+sv, generator run
