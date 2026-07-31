# Branch Timeline: danish-panel-i18n 0.10.2.x

**Branch:** `feat/danish-panel-i18n`
**Parent:** `feat/danish-measurements` / upstream PR #120
**Started:** 2026-07-31
**Purpose:** Add Danish as a first-class custom-panel and AI recipe language.

## Scope

- Add a complete Danish panel translation dictionary.
- Accept and persist `da` through the language preference API.
- Render language choices from translation metadata instead of hard-coded buttons.
- Generalize locale and localized-field helpers beyond binary English/Swedish checks.
- Add explicit Danish AI recipe instructions and examples.
- Keep Danish language mapped to the international temperature-data tree.
- Add translation parity and prompt regression tests.

## Progress

- [x] Create stacked branch and timeline.
- [x] Implement language registry and frontend selection.
- [x] Add and validate Danish panel strings.
- [x] Generalize core locale-sensitive helpers.
- [x] Implement Danish AI recipe generation.
- [x] Regenerate and verify panel output.
- [ ] Push branch and open upstream PR.

## Implementation Notes

- `SUPPORTED_LANGUAGES` is shared by API and storage validation; invalid stored
  values fall back to English.
- The selector is generated from `_meta` fields in each translation dictionary.
- Locale metadata drives dates and collation (`en-GB`, `sv-SE`, `da-DK`).
- `_localizedField()` and `_localizedProfile()` provide generic language suffix
  lookup with English fallback for later catalog and profile data PRs.
- Danish maps explicitly to the international temperature-data source. Language,
  data source, and measurement system remain independently selectable.
- AI prompts require Danish human-facing text while preserving schema-controlled
  values such as difficulty, phase mode, and appliance IDs.
- The Home Assistant conversation call now receives the selected language.
- Recipe steps recognize `Trin`, Danish ingredient stopwords, and locale-aware
  number formatting.

## Verification

- `python3 -m unittest discover -s tests -v`: 17 tests passed.
- Translation dictionaries have exact leaf-key, placeholder, and HTML-tag parity.
- Every literal panel `_t()` reference resolves in English, Swedish, and Danish.
- `python3 -m compileall -q custom_components/kitchen_cooking_engine`: passed.
- `node --check custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js`: passed.
- Browser smoke test confirmed three metadata-driven language buttons, `da-DK`
  date/number formatting, Danish `Trin` labels, localized-field lookup, and the
  international data-source mapping.

## Deferred Content

The panel intentionally falls back to English for structured catalog, cuisine,
ingredient, and cut-profile values that do not yet have `*_da` data. Those values
are split into the following content PRs so this language/AI implementation remains
reviewable.
