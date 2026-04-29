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
- [ ] Create `langoustine.md` (cut overview)
- [ ] Create `langoustine-grill.md` (method file, 5 verified grill sources)
- [ ] Run generator, verify clean
- [ ] Bump version
