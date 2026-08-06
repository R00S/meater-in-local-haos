# Branch Timeline: danish-cuisine-data 0.10.2.x

**Branch:** `feat/danish-cuisine-data`
**Parent:** `feat/danish-catalog-labels` / upstream PR #122
**Started:** 2026-07-31
**Purpose:** Add Danish names and descriptions to the structured cuisine catalog.

## Scope

- Add `name_da` and `description_da` to all 102 canonical cuisine files.
- Render all 11 region headings through the existing localized i18n labels.
- Preserve Danish cuisine metadata in generated frontend constants.
- Add canonical-source and checked-in-panel parity tests.

## Decisions

- This branch covers short cuisine metadata, not ingredient inventory content.
- The 12,738 cuisine ingredient display names are split into a following stacked
  branch because they are a substantially larger review unit.
- Ingredient notes remain English fallback. There are no canonical `notes_sv`
  fields to establish Swedish parity, and the corpus contains over 400,000 words.
- Existing `cuisines.<region_id>` i18n keys are authoritative for region headings;
  repeated `region_name` values in cuisine files remain English source metadata.
- Native dish names, protected terms, and culturally specific proper nouns remain
  unchanged inside translated descriptions.

## Progress

- [x] Create stacked branch and inventory cuisine localization.
- [x] Add Danish cuisine names and descriptions.
- [x] Propagate Danish fields through the generator and panel.
- [x] Add cuisine-localization regression tests.
- [x] Regenerate and verify panel output.
- [ ] Push branch and open upstream PR.

## Inventory

- 102 canonical cuisine files across 11 regions.
- 102 Danish cuisine names.
- 102 Danish short descriptions.
- 11 region labels already present in each panel i18n dictionary.

## Deferred Content

- 12,738 cuisine-specific ingredient display names.
- General AI ingredient mappings and assumed staples.
- Ingredient research notes and tooltips.
- Cut profiles, method profiles, appliance content, and Android UI.

## Implementation Notes

- Every canonical cuisine frontmatter record now carries `name_da` and
  `description_da`; each of the 102 source-file diffs contains exactly those two
  additions and no deletions.
- Danish descriptions were reviewed for terminology, grammar, cultural context,
  and Danish decimal, thousands, percentage, and approximation notation.
- `build_cuisine_data()` preserves the Danish fields in both the region tree and
  the flat description lookup used by the generated panel.
- `_localizedRegionName()` resolves region IDs through the panel i18n dictionary
  and falls back to the canonical region name when no translation exists.
- Danish region labels use geographic nouns such as `Norden`, `Østasien`,
  `Mellemøsten`, and `Caribien` rather than adjectival forms.
- Release version is `0.10.2.6`; generated panel version is `636`.

## Verification

- `python3 -m unittest discover -s tests -p 'test_*.py'`: 27 tests passed.
- `python3 -m compileall -q custom_components/kitchen_cooking_engine tests`: passed.
- JavaScript syntax checks passed for the panel template and generated panel.
- Danish i18n and manifest JSON validation passed.
- Generated output contains 102 Danish cuisine names and 204 Danish description
  fields across the region tree and flat lookup.
- `git diff --check`: passed.
- Browser smoke loaded the generated module and returned 11 regions, 102 cuisines,
  102 descriptions, `Norden`, `Tysk`, the Danish German description, canonical
  fallback for an unknown region, and panel version `636`.
