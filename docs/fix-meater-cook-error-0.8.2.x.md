# Branch: copilot/fix-meater-cook-error — v0.8.2.x

## Problem

Some MEATER cooks fail to start:
- **Whole chicken** (and whole_turkey, whole_duck, whole_goose, duck_leg_confit, shrimp): visible HA error — `value must be one of [...]` — because the doneness name in the cut file (e.g. `thigh_optimal`, `confit`, `leg_rendered`, `thigh_rendered`, `just_cooked`) is not in the `vol.In` validator in `__init__.py`.
- **Chicken breast** (and ~35 other cuts): silent failure — no start, no visible error — because `recommended_doneness: well_done` was used as a placeholder in all these cut files, but `well_done` is not in their actual doneness list. The service call passes schema validation but the handler returns silently.
- **Chicken thigh** works because it has saved user preferences with a valid doneness.

## Root cause

1. `SERVICE_START_COOK_SCHEMA` in `__init__.py` missing: `thigh_optimal`, `just_cooked`, `confit`, `leg_rendered`, `thigh_rendered`
2. `recommended_doneness: well_done` used as a placeholder in 40+ cut files — value doesn't exist in the cut's actual doneness list.

## Fix plan

- [x] Add missing doneness names to `vol.In` in `__init__.py`
- [x] Add same names to `services.yaml` selector
- [x] Fix `recommended_doneness` in all 40 mismatched cut files
- [x] Run generator
- [x] Bump version

## Sessions

### Session 1 (2026-05-06)
- Discovered both bugs via scan of all 164 cut files
- Applied all fixes

### Session 2 (2026-05-06) — create chicken_thigh_bone_in.md

## Session start

### Output 1 — Culinary group definitions (verbatim from RECIPE_COLLECTION_TOR.md)

|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

### Output 2 — Analysis gate rule (verbatim from RECIPE_ANALYSIS_TOR.md)

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

### Output 3 — Source integrity rule (verbatim from SOURCE_SURVEY.md)

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

### Output 4 — My understanding of this file

The primary task is to create a new `chicken_thigh_bone_in.md` cut overview file to the same quality standard as existing cut files. "This is not a race" means I do not guess, approximate, or shortcut — I base all temperature data on real sources, I clearly state what is and is not yet researched, and I give an honest quality score. After the overview file is created and the generator runs successfully, the session is complete; method leaf files are a separate future task.
