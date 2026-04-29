# Branch Timeline: create-cut-file-havskraeftor — v0.7.0.x

## Goal
Create cut file for havskräftor (Norway lobster / langoustine).

## Session 2026-04-29

### Discovery
- Branch was already active. User asked whether the classic MEATER tree had been removed.
- Investigation showed:
  - Frontend template (`panel-class-template.js`): already uses only `EXP_TREE` / `EXP_DONENESS_OPTIONS`
  - `MEAT_CATEGORIES` / `SWEDISH_MEAT_CATEGORIES` were still being generated as dead JS constants
  - `api.py` still exposed two unused API endpoints (`CookingDataView`, `DonenessOptionsView`) driven by the classic Python data
  - `cooking_data.py` still needed by `__init__.py` for `CookingMethod` (service schema) — keep
  - `swedish_cooking_data.py` not used by anything after removal — keep file but stop reading it in generator/api

### Plan
- [x] Remove `CookingDataView` + `DonenessOptionsView` from `api.py` (+ helper functions + imports + registration)
- [x] Remove `_load_cooking_data()` and all classic-tree code from `generate_frontend_data.py`
- [x] Remove `MEAT_CATEGORIES`, `SWEDISH_MEAT_CATEGORIES`, `DONENESS_OPTIONS`, `SWEDISH_DONENESS_OPTIONS` from generated JS
- [x] Run generator, verify clean output
- [x] Bump version, commit
