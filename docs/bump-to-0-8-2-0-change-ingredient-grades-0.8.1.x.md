# Branch: bump-to-0-8-2-0-change-ingredient-grades

## Version target: 0.8.2.0

## Task
1. Bump version from 0.8.1.14 → 0.8.2.0
2. Change cuisine ingredient grades from `very_common`/`common` to `bulk`/`local`
   - `signature` stays (identity of cuisine)
   - `bulk` = consumed a lot according to statistics (previously `very_common`) → common=True
   - `local` = produced and/or widely used in the country (previously `common`) → common=False

## Plan
- [x] Create timeline file
- [x] Update generator: _grade_common map + docstring (very_common/common → bulk/local)
- [x] Update swedish.md: remap very_common→bulk, common→local
- [x] Update IMPROVE_CUISINE_DATA.md: document new grade system
- [x] Bump version to 0.8.2.0 in manifest.json, __init__.py, const.py
- [x] Run generator
- [x] Verify output
- [x] Add rating field per ingredient + top-3-per-grade display logic
- [x] Protein tree/badge split + grade-colored tree buttons (dark green = signature/local, light green = bulk-only)
- [x] Rewrite IMPROVE_CUISINE_DATA.md: quality-first tone, remove obsolete sections, dig-deeper instead of skip
- [x] Rename `culinary_group` → `region` in cuisine files; use proper geographic region IDs; wire into generator → AI_CUISINE_TO_REGION
- [x] Bump version to 0.8.2.2

## Session log
- 2026-05-03: Started. Current version 0.8.1.14. Only cuisine file: swedish.md.
- 2026-05-03 (session 1): Bumped to 0.8.2.0. Migrated cuisine grades: very_common→bulk, common→local. Updated generator, swedish.md, IMPROVE_CUISINE_DATA.md.
- 2026-05-03 (session 2): Added `rating` (1-10) field per ingredient. Implemented top-3-per-grade display logic (top 3 by rating per grade shown by default; rest behind More button). Added ratings to all 29 swedish.md ingredients.
- 2026-05-03 (session 3): Protein tree/badge split. Tree-mapped cuisine proteins no longer show as badges — they light up the subcat button instead (dark green = signature/local, light green = bulk-only). Rewrote IMPROVE_CUISINE_DATA.md with quality-first tone, removed obsolete _ing/_inge sections.
- 2026-05-03 (session 4): Updated IMPROVE_CUISINE_DATA.md to replace "skip/omit" guidance with dig-deeper directive. Bumped 0.8.2.0 → 0.8.2.1. Updated USER_GUIDE.md section 7.2.
- 2026-05-03 (session 5): Fixed `culinary_group` confusion. Renamed field to `region` in swedish.md and IMPROVE_CUISINE_DATA.md example. Updated generator to read `region` field (with `culinary_group` as fallback for old files), merge into AI_CUISINE_TO_REGION. Added frontmatter fields table to IMPROVE_CUISINE_DATA.md. Bumped 0.8.2.1 → 0.8.2.2.
