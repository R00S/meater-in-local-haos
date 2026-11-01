# To fix later

Open items found during the recipe source-of-truth cleanup. Not done yet.

## 1. Duplicate AI ingredient list

- `COMMON_INGREDIENTS` is defined in both `custom_components/kitchen_cooking_engine/ai_recipe_data.py` and `custom_components/kitchen_cooking_engine/ai_recipe_builder.py` (about line 146).
- The runtime uses the builder's copy through `get_common_ingredients`, which imports from `ai_recipe_data`.
- Fix: keep one list in `ai_recipe_data.py` and delete the copy in `ai_recipe_builder.py`, or generate both from one data source.

## 2. Failing catalog localization tests

- `tests/test_catalog_localization.py` has 3 failing tests: `test_ai_catalog_has_complete_danish_labels`, `test_canonical_cut_names_have_danish_parity`, `test_generated_temperature_tree_has_complete_danish_labels`.
- They fail on the pre-change commit `a356a057` as well, so they predate the recipe source-of-truth change.
- The counts are stale: the tests expect 187 cuts and 160 protein cuts, but the recipe files now give 188 and 161. The Danish label parity checks also need looking at.

## 3. Legacy "Data applied to cooking_data.py" sections

- About 200 per-leaf research files under `www/recipes/` and `android/app/src/main/assets/recipes/` still have a section titled "Data applied to cooking_data.py".
- The file is deleted. These headings are legacy names. Rename them, for example to "Data applied to recipe files", in a separate bulk pass.
- `docs/USER_GUIDE.md` (about line 810) has the same heading.

## 4. Naming of the MEATER+ "experimental" path

- The panel still uses `meater_experimental` as the path name, and the backend uses `EXP_TREE` and `EXP_DONENESS_OPTIONS`.
- The classic tree is gone, so these names only mean "the MEATER+ tree". Renaming them touches the panel, the backend and the frontend data, so it is a separate change.
