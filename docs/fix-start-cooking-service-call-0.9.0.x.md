# Branch Timeline: fix-start-cooking-service-call — v0.9.0.x

## Goal
Fix the `start_cook` service so that legacy numeric `cut_id` values (e.g. `"122"`) are still accepted alongside the new slug-based IDs (e.g. `"top_round_roast"`).

## Root Cause
In v0.7.0.9, the `start_cook` service was migrated to accept only EXP_TREE slug strings. Legacy integer-based `cut_id` values (used in existing automations/buttons) were silently dropped without a migration path, causing the error:

```
EXP_TREE cut slug '122' not found in recipe files
```

## Fix Plan
- [x] Identify the mapping: old numeric IDs → slug names via `get_cut_by_id()` in `cooking_data.py`
- [x] Verify cut ID 122 = `top_round_roast`, which has a recipe file at `www/recipes/beef/roasts/top_round_roast.md`
- [x] Add backward-compat logic in `handle_start_cook`: if `cut_id` is a numeric string, resolve it to a slug using `get_cut_by_id()` and log a deprecation warning
- [x] Add `get_cut_by_id` and `get_swedish_cut_by_id` to the imports from `cooking_data` and `swedish_cooking_data`
- [x] Update error message to suggest using a slug when numeric ID resolution fails
- [x] Bump version to 0.9.0.1
- [x] Run generator (PANEL_VERSION auto-incremented 600→601)

## Session Log

### 2026-05-20 (Session 1 — fix numeric cut_id backward compat)
- Investigated issue: `cut_id: "122"` in user's automation → `_get_exp_cut_data("122", ...)` fails because no `122.md` recipe file exists
- Fix: resolve numeric strings to slug via `get_cut_by_id(int(cut_id)).name` in the service handler
- cooking_data.py `MEAT_CATEGORIES` still exists (verified), `get_cut_by_id(122)` returns `top_round_roast`
- swedish_cooking_data.py has `get_swedish_cut_by_id()` for Swedish data source
