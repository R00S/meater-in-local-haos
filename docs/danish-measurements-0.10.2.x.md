# Branch Timeline: danish-measurements 0.10.2.x

**Branch:** `feat/danish-measurements`
**Base:** `main` at `a313140e`
**Started:** 2026-07-31
**Purpose:** Add a Danish recipe measurement system independently of UI language.

## Scope

- Add the `dk` measurement system with Celsius, metric mass/volume, `tsk`, and `spsk`.
- Make unit symbols follow the selected measurement system rather than UI language.
- Accept and persist `dk` through the preference API.
- Add Danish-unit instructions to AI recipe generation.
- Extend free-text conversion for Danish and metric source units.
- Add focused regression tests and regenerate the panel.

## Decisions

- `1 tsk = 5 ml` and `1 spsk = 15 ml`.
- `knsp` remains qualitative text and is not converted numerically.
- Danish output uses decimal commas.
- Danish volume preferences are `l >= 1000 ml`, `dl >= 50 ml`, `spsk >= 15 ml`,
  `cl >= 10 ml`, `tsk >= 5 ml`, then `ml`.
- Danish mass preferences are `kg >= 1000 g`, then `g`.

## Progress

- [x] Create branch and timeline.
- [x] Implement catalog and API support.
- [x] Implement frontend selection and conversion.
- [x] Implement AI prompt support.
- [x] Add tests and documentation.
- [x] Regenerate and verify panel output.
- [ ] Push branch and open upstream PR.

## Implementation Notes

- Added invariant unit symbols while retaining `abbr_en` and `abbr_sv` in the
  generated payload for compatibility. This keeps `tsk`, `msk`, and `spsk`
  tied to their measurement systems rather than the UI language.
- API and storage validation now use the central `MEASUREMENT_SYSTEMS` registry.
- The free-text converter accepts English, Swedish, Danish, and metric aliases,
  dotted Danish abbreviations, comma decimals, and Unicode fractions.
- Converted values use temporary tokens so one conversion cannot be converted a
  second time by a later unit pattern.

## Verification

- `python3 -m unittest discover -s tests -v`: 8 tests passed.
- `python3 -m compileall -q custom_components/kitchen_cooking_engine`: passed.
- `node --check custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js`: passed.
- Browser smoke test against the generated custom element returned `2,4 dl` for
  one cup, `1 spsk` for one tablespoon, `1 tsk` for one teaspoon, and `204°C`
  for `400°F`.

## Existing Generator Issue Observed

A clean worktree regeneration reproduces a large reordering of `EXP_TREE` and
`EXP_DONENESS_OPTIONS`. The generator relies on unsorted `os.walk()` directory
order and keeps the first duplicate doneness definition, so a fresh checkout can
produce a different generated order and duplicate-doneness value than the
committed panel. No cooking-data source files were changed on this branch; the
generated output is retained because it matches a fresh-checkout generation and
the repository requires generated panel changes to be committed.
