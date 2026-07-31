# Branch Timeline: danish-catalog-labels 0.10.2.x

**Branch:** `feat/danish-catalog-labels`
**Parent:** `feat/danish-panel-i18n` / upstream PR #121
**Started:** 2026-07-31
**Purpose:** Add Danish short labels to the live cooking and AI catalogs.

## Scope

- Add Danish names for temperature categories, meat groups, cut types, and cuts.
- Add Danish labels for the global doneness options.
- Add Danish cooking-style and AI ingredient-category headings.
- Preserve Danish labels in generated protein-category and cut data.
- Cover every cooking-method ID used by the live cut catalog.
- Add source and generated-data completeness tests.

## Decisions

- Danish continues to use the international temperature data; only labels change.
- Cut names live in each canonical `KCE:CUT` overview alongside English and Swedish.
- Repeated category, meat, cut-type, and doneness labels use generator maps.
- Doneness descriptions remain out of scope because the live source has none.
- Long-form profiles, cuisines, ingredient names, appliances, and Android remain
  split into later work.
- Danish coverage includes all live labels even where existing Swedish maps are
  incomplete.

## Progress

- [x] Create stacked branch and inventory the live catalogs.
- [x] Add canonical Danish catalog labels.
- [x] Propagate labels through generated frontend data.
- [x] Add catalog-localization regression tests.
- [x] Regenerate and verify panel output.
- [x] Push branch and open upstream PR: https://github.com/R00S/meater-in-local-haos/pull/122

## Inventory

- 7 temperature categories.
- 35 meat or ingredient-type groups.
- 42 unique cut-type labels across 48 tree nodes.
- 186 canonical cuts.
- 20 global doneness labels.
- 14 AI cooking styles and 5 AI ingredient-category headings.

## Implementation Notes

- Each of the 186 canonical cut overviews now carries `name_da` beside `name_sv`.
- Generator maps cover every live category, meat group, cut type, and global
  doneness ID.
- Derived AI protein data preserves `name_da` and exposes Danish category maps.
- The panel selects Danish AI category maps and uses localized doneness text in
  the temperature-reset control instead of displaying a raw slug.
- All 17 cooking-method IDs used by cut overviews resolve in every i18n file.
- Generator recipe reads now close their file handles; output semantics are unchanged.
- Set-derived protein IDs are sorted before emission to keep generation reproducible.
- Release version is `0.10.2.5`; generated panel version is `635`.

## Verification

- `python3 -m unittest discover -s tests -v`: 23 tests passed.
- Catalog tests cover 7 categories, 35 meat groups, 48 cut-type nodes using 42
  unique labels, 186 cuts, 20 doneness options, and 159 derived protein cuts.
- `python3 -m compileall -q custom_components/kitchen_cooking_engine tests`: passed.
- `node --check custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js`: passed.
- `generate_js_data()` produced the same normalized SHA-256 under
  `PYTHONHASHSEED=1` and `PYTHONHASHSEED=2`.
- Browser smoke test returned `Oksekød`, `Okse`, `Bøffer`, `Ribeyebøf`,
  `Gennemstegt`, `Kulgrill`, and locale `da-DK` from the generated element.

## Deferred Content

- Cuisine regions, cuisine names, descriptions, and cuisine ingredient content.
- AI ingredient-name mappings, staples, and ingredient notes.
- Cut and cooking-method profile prose and recipe titles.
- Appliance feature localization and user-configured appliance names.
- Native Android Danish support.
