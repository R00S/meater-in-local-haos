# Branch Timeline — create-salmon-cut-file (0.10.1.x)

## 2026-05-26
- Initialized timeline file as required before starting task work.
- Task: create a new cut file for whole salmon with cut-method leafs according to RECIPE_COLLECTION_TOR.md and IMPROVE_CUT_FILES.md.

## Session start

### Output 1 — Culinary group definitions (verbatim from `RECIPE_COLLECTION_TOR.md`)

|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Bengali, Ceylon, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

### Output 2 — Analysis gate rule (verbatim from `RECIPE_ANALYSIS_TOR.md`)

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

### Output 3 — Source integrity rule (verbatim from `SOURCE_SURVEY.md`)

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

### Output 4 — My understanding of this file

The primary task is to create and improve cut files by adding real, verifiable recipe research in parent cut files and method leaf files, not by filling gaps with assumptions. “This is not a race” means quality and source integrity take priority over speed or score-chasing, and partial but honest progress is still valid progress. After step 1 is complete, the workflow says to continue with CHORES.md, but only after the cut-file work is done.

## Discovery log

- Required files in this repository are under `custom_components/kitchen_cooking_engine/www/recipes/` (not `docs/recipe_research/`).
- `whole_salmon` does not currently exist in `cooking_data.py`; this task is focused on creating recipe research files.
- Verified whole/whole-side salmon source pages with retrievable content:
  - Jamie Oliver whole roasted salmon (whole fish, oven)
  - Taste of Home baked whole salmon (whole fish, oven)
  - Savor the Best whole baked salmon (whole fish, oven)
  - Madens Verden honningmarineret laks (whole side, oven + grill)
  - Ricardo whole grilled salmon fillet (whole side, grill)
  - Barbecue Bible planked salmon and cedar-smoked wild salmon (whole side/large fillet, grill or grill+oven variants)

## Requirement update (user clarification)

- User clarified scope: whole salmon means an intact whole fish (bones + both sides + skin), head optional.
- Implemented files were constrained to whole-fish sources only; fillet/side-only sources were excluded from authored leaf content.

## Implementation log

- Added parent cut file: `custom_components/kitchen_cooking_engine/www/recipes/fish/salmon/whole_salmon.md`.
- Added method leaf: `custom_components/kitchen_cooking_engine/www/recipes/fish/salmon/whole_salmon-oven_bake.md`.
- Added method leaf: `custom_components/kitchen_cooking_engine/www/recipes/fish/salmon/whole_salmon-grill.md`.
- Grill leaf currently contains 3 verified whole-fish sources; a fourth verified whole-fish source from a distinct tradition was not reliably retrievable in-session without dropping source-quality standards.

## 2026-05-26 (follow-up: smoked leaf request)

- New task: add a smoked leaf for `whole_salmon`.
- Re-validated scope: `whole_salmon` in this repo remains intact whole fish only (bones + both sides + skin, head optional).
- Conducted source survey for whole-fish smoked salmon across previously-validated and additional candidate domains.
- Outcome: no credible, authoritative whole-fish smoked-salmon source recipes were found that satisfy project integrity requirements; available hits were mostly fillet/side recipes, weak authority pages, or generic technique posts.
- Implemented `whole_salmon-smoker.md` as a ToR-compliant placeholder stub (`No Recipes Found`) with search log, and linked `smoker` in the parent cut file.
