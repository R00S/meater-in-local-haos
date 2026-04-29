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

---

## Session 2026-04-29 (continued — mandatory gate)

### Output 1 — Culinary group definitions (verbatim from RECIPE_COLLECTION_TOR.md)

| Culinary Group | Includes |
|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Bengali, Ceylon, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

### Output 2 — Analysis gate rule (verbatim from RECIPE_ANALYSIS_TOR.md)

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

### Output 3 — Source integrity rule (verbatim from SOURCE_SURVEY.md)

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

### Output 4 — My understanding of this file

The primary task is to create a KCE:CUT file and at least one KCE:CUT_METHOD file for havskräftor (langoustine, *Nephrops norvegicus*). "This is not a race" means I must find and verify real recipe sources from the internet before writing them into the method files — I cannot fabricate or recall from training data. I must complete the source research (4–6 verifiable sources per leaf) before writing the final recipe content. After the cut/method files are created, complete, and committed, I proceed to CHORES.md only if explicitly directed.

### Source research completed

Verified URLs found and fetched via web_fetch / IA:

| Source | URL | Culinary Group | Method |
|--------|-----|----------------|--------|
| BBC Good Food (UK) | https://www.bbcgoodfood.com/recipes/griddled-langoustines-hazelnut-butter | B | grill |
| madensverden.dk (Danish) | https://madensverden.dk/grillede-jomfruhummere/ | D | grill |
| chefsimon.com (French) | https://chefsimon.com/gourmets/chef-simon/recettes/langoustines-et-gambas-grillees | B | grill |
| kaderickenkuizinn.com (French) | https://kaderickenkuizinn.com/2013/09/langoustines-plancha-beurre-herbes/ | B | grill/plancha |
| giallozafferano.it (Italian) | https://ricette.giallozafferano.it/Scampi-al-forno.html | B | oven |
| koket.se (Swedish, Lisa Lemke) | https://www.koket.se/lisa-lemke/forratt/fisk-och-skaldjur/grillade-havskraftor-med-vitloks--och-citronsmor | D | grill |

Gap: Culinary Groups A and C not found for grill method. Honest note in quality score.

### Plan
- [x] Mandatory gate in timeline
- [x] Create `langoustine.md` (cut overview, quality score 16/20)
- [x] Create `langoustine-grill.md` (method file, 6 verified grill sources — Groups B + D)
- [x] Run generator, verify clean (164 cuts, EXP_TREE +1)
- [x] Bump version to 0.7.0.15, commit all files

---

## CHORES — 2026-04-29

Items from `CHORES.md`:

### 1. Version bump
- 0.7.0.15 → 0.7.0.16 (docs/guide update for CHORES)
- Updated in: `manifest.json`, `__init__.py` (`__version__` + Last Change), `const.py` (Last Change)
- PANEL_VERSION auto-incremented by generator

### 2. Branch history update
- This section fulfils that requirement

### 3. USER_GUIDE updates
- Version header updated: 0.7.0.13 → 0.7.0.16
- Cut count updated: "all 163 MEATER+ cut overview files" → "all 164 MEATER+ cut overview files"
- Fish category example row extended to include shellfish examples (langoustine, scallops, shrimp)

### 4. GUI help button anchor check
All anchors in `panel-class-template.js` verified against `USER_GUIDE.md` headings.
No heading changes were made in this branch — all anchors remain valid.

| Anchor in JS | USER_GUIDE heading | Status |
|---|---|---|
| `#41-welcome-screen` | `### 4.1 Welcome Screen` | ✅ |
| `#9-shelf-management` | `## 9. Shelf Management` | ✅ |
| `#10-shopping-list` | `## 10. Shopping List` | ✅ |
| `#51-starting-a-cook` | `### 5.1 Starting a Cook` | ✅ |
| `#59-meater--cut-profile--recipe-links` | `### 5.9 MEATER+ — Cut Profile & Recipe Links` | ✅ |
| `#57-recent-meater-cooks` | `### 5.7 Recent MEATER Cooks` | ✅ |
| `#6-ninja-combi-cooking` | `## 6. Ninja Combi Cooking` | ✅ |
| `#7-ai-recipe-builder` | `## 7. AI Recipe Builder` | ✅ |
| `#61-built-in-recipes` | `### 6.1 Built-in Recipes` | ✅ |
| `#64-recent-ninja-cooks` | `### 6.4 Recent Ninja Cooks` | ✅ |
| `#72-selecting-ingredients` | `### 7.2 Selecting Ingredients` | ✅ |
| `#73-choosing-a-cooking-style` | `### 7.3 Choosing a Cooking Style` | ✅ |
| `#11-cook-history` | `## 11. Cook History` | ✅ |
| `#8-recipe-cook-flow` | `## 8. Recipe Cook Flow` | ✅ |


---

## Session start — 2026-04-29 (IMPROVE_CUT_FILES.md execution)

### Output 1 — Culinary group definitions (verbatim from RECIPE_COLLECTION_TOR.md)

| Culinary Group | Includes |
|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Bengali, Ceylon, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

### Output 2 — Analysis gate rule (verbatim from RECIPE_ANALYSIS_TOR.md)

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

### Output 3 — Source integrity rule (verbatim from SOURCE_SURVEY.md)

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

### Output 4 — My understanding of this file

The primary task is to incrementally improve the 8 lowest-scoring cut files by adding real, verifiable sourced recipes to their method leaf files and doing proper cooking methods surveys. "This is not a race" means I will not fabricate, guess, or skip hard files because they are difficult — small improvements are still improvements and I commit between each cut file. Methods survey (setting `cooking_methods_researched: 1`) is itself a valid improvement. Only after all 8 cut files are improved do I proceed to CHORES.md.

---

## Salvage — 2026-04-29

### Problem
Branch was created from `v0.7.0.13-beta.main` (merge of PR #92 / remove-classic-meater-path).
PR #93 (fix-issue-85) was merged to main afterward, adding 11 commits this branch was missing:
- Fullscreen recipe viewer with live MEATER cook monitor
- History fix (shows all cook types, `_renderHistoryCard` refactor)
- Atomic history writes (`storage.py`)
- Module-level recovery for blank screen after HA suspension
- README + USER_GUIDE updates for v0.7.0.14–17

### Resolution
- Ran `git merge origin/main` — 5 conflicts (manifest.json, __init__.py, const.py, kitchen-cooking-panel.js, USER_GUIDE.md)
- Resolved all conflicts:
  - Version: 0.7.0.17 (main) + 0.7.0.16 (branch) → 0.7.0.18 (merged)
  - `kitchen-cooking-panel.js`: took main's version as base, then re-ran generator
  - `USER_GUIDE.md`: took main's version, re-applied cut count 163 → 164 and shellfish example
  - `__init__.py` / `const.py` / `manifest.json`: took main's code, bumped version to 0.7.0.18
- Generator output: 164 cuts, PANEL_VERSION 368 — clean
- True merge commit with both parents preserved

---

## IMPROVE_CUT_FILES session — 2026-04-29

### What was done
Methods surveys completed for 12 cuts (cooking_methods_researched set to 1, methods lists updated, quality scores improved):

| Cut | Score before | Score after | New method leaves |
|-----|-------------|-------------|------------------|
| lamb_brisket | 5 | 17 | oven_roast added |
| turkey_thigh | 5 | 16 | braise/smoker confirmed |
| brisket | 8 | 19 | methods surveyed |
| skirt_steak | 8 | 19 | — |
| lobster_tail | 8 | 19 | — |
| goat_shank | 8 | 19 | slow_cooker added |
| venison_steak | 8 | 17 | pan_sear leaf fixed |
| duck_breast | 8 | 17 | oven_roast leaf fixed |
| pork_belly | 8 | 19 | air_fryer leaf fixed |
| chicken_thigh | 8 | 17 | air_fryer leaf fixed |
| whole_chicken | 8 | 18 | methods surveyed |
| chicken_breast | 8 | 18 | methods surveyed |
| chicken_leg | 8 | 18 | methods surveyed |
| rack_of_lamb | 8 | 18 | oven_roast leaf fixed |
| lamb_shoulder | 8 | 18 | methods surveyed |
| lamb_neck | 8 | 19 | braise leaf fixed |

### Rule clarification recorded
"The most important part of methods research is to find MORE methods, not to question existing ones." Priority: discover and add new valid cooking methods for a cut.

---

## CHORES — 2026-04-29 (post-IMPROVE_CUT_FILES)

### 1. Version bump
- 0.7.0.18 → 0.7.0.19
- Updated: manifest.json, __init__.py (__version__ + Last Change), const.py (Last Change)
- PANEL_VERSION auto-incremented: 377 → 378

### 2. Branch history update
- This section fulfils that requirement

### 3. USER_GUIDE updates
- Version header updated: 0.7.0.18 → 0.7.0.19
- Cut count "all 164 MEATER+ cut overview files" remains accurate (no new cut overview files added)
- No user-visible feature changes to document

### 4. GUI help button anchor check
No heading changes in this session — all anchors remain valid (see previous CHORES section for full table).

---

## Getting Started Guides — 2026-04-29

### Task
Create two minimal getting-started guides for new users.

### Files created
- `docs/GETTING_STARTED_MEATER.md` — MEATER probe path (install KCE → add probe appliance → first cook)
- `docs/GETTING_STARTED_AI_RECIPE.md` — AI recipe path (install KCE → add custom/pre-configured appliance → set AI agent → generate first recipe)

### Version bump
- 0.7.0.19 → 0.7.0.20 (manifest.json, __init__.py, const.py, USER_GUIDE.md)
- PANEL_VERSION 378 → 379
