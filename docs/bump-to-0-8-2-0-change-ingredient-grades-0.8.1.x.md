# Branch: bump-to-0-8-2-0-change-ingredient-grades

## Version target: 0.8.2.0

## Task
1. Bump version from 0.8.1.14 → 0.8.2.0
2. Change cuisine ingredient grades from `very_common`/`common` to `bulk`/`local`
   - `signature` stays (identity of cuisine)
   - `bulk` = consumed a lot according to statistics (previously `very_common`) → common=True
   - `local` = produced and/or widely used in the country (previously `common`) → common=False

## Plan
- [ ] Create timeline file
- [ ] Update generator: _grade_common map + docstring (very_common/common → bulk/local)
- [ ] Update swedish.md: remap very_common→bulk, common→local
- [ ] Update IMPROVE_CUISINE_DATA.md: document new grade system
- [ ] Bump version to 0.8.2.0 in manifest.json, __init__.py, const.py
- [ ] Run generator
- [ ] Verify output

## Session log
- 2026-05-03: Started. Current version 0.8.1.14. Only cuisine file: swedish.md.
