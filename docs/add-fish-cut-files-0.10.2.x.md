# Branch Timeline — add-fish-cut-files-0.10.2.x

## Session start

### Output 1 — Culinary group definitions

|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Bengali, Ceylon, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

### Output 2 — Analysis gate rule

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

### Output 3 — Source integrity rule

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

### Output 4 — Understanding

The task here is to add the new oily fish cut files and their method leaves by gathering real, verifiable recipe sources and using them to populate the MEATER recipe tree without guessing. “This is not a race” means I should prefer accurate, sourced incremental progress over rushing, fabricating, or skipping validation. After the session-start gate is complete, I should do the actual research work method by method, create the new recipe files, update the generator input, and verify the generator still runs.

---

## Session 1 (2026-05-26) — Research complete, files not yet created

Previous agent completed full source research for all 8 method leaves. All sources verified via web_fetch. No files were created (ran out of time).

**Sources identified:**
- Herring pan_fry: madensverden.dk (Danish stegt sild), koket.se Tareq Taylor (Swedish stekt sill), chefkoch.de (German gebratene Heringe) — 3 sources
- Herring grill: BBC Good Food Sep 2005 (grilled herrings with mustard butter) — 1 source
- Herring oven_bake: BBC Good Food Oct 2008 (herrings rolled with mustard & pancetta, 220°C 15–20 min) — 1 source
- Baltic herring pan_fry: koket.se strömmingsflundror — 1 source
- Baltic herring oven_bake: koket.se strömmingslåda (225°C 20–30 min) — 1 source
- Mackerel grill: koket.se grillad makrill — 1 source
- Mackerel pan_fry: koket.se smörstekt makrill, Alexandra Zazzi — 1 source
- Mackerel oven_bake: Just One Cookbook saba shioyaki (200°C), BBC Good Food chermoula (180°C) — 2 sources

**Swedish names confirmed:** Sill (herring), Strömming (Baltic herring), Makrill (mackerel)

## Session 2 (2026-05-31) — Files created, generator verified

Created all 11 files using previous session's research:

**Parent cut files created:**
- `www/recipes/fish/oily_fish/herring.md` — quality_score: 10
- `www/recipes/fish/oily_fish/baltic_herring.md` — quality_score: 9
- `www/recipes/fish/oily_fish/mackerel.md` — quality_score: 12

**Method leaf files created:**
- `www/recipes/fish/oily_fish/herring-pan_fry.md` (3 sources: DK, SE, DE)
- `www/recipes/fish/oily_fish/herring-grill.md` (1 source: BBC Good Food Sep 2005)
- `www/recipes/fish/oily_fish/herring-oven_bake.md` (1 source: BBC Good Food Oct 2008)
- `www/recipes/fish/oily_fish/baltic_herring-pan_fry.md` (1 source: koket.se strömmingsflundror)
- `www/recipes/fish/oily_fish/baltic_herring-oven_bake.md` (1 source: koket.se strömmingslåda — fetched directly)
- `www/recipes/fish/oily_fish/mackerel-grill.md` (1 source: koket.se grillad makrill — fetched directly)
- `www/recipes/fish/oily_fish/mackerel-pan_fry.md` (1 source: koket.se smörstekt makrill)
- `www/recipes/fish/oily_fish/mackerel-oven_bake.md` (2 sources: Just One Cookbook saba shioyaki, BBC Good Food chermoula)

**cooking_data.py:** Added OILY_FISH array (ids 800–802: herring, baltic_herring, mackerel); added Meat(id=44, name="oily_fish") to fish MeatCategory; CutType(id=440, name="Oily Fish").

**generate_frontend_data.py:** Added "oily_fish": "Fet fisk" to meat Swedish name dict; added "Oily Fish": "Fet fisk" to _CUT_TYPE_NAME_SV.

**Generator:** Ran clean. herring, mackerel, baltic_herring, oily_fish, "Fet fisk", "Oily Fish" all present in generated panel JS.

## Session 3 (2026-05-31) — Smoker stubs created for all missing cuts

Created 24 smoker stub leaf files across beef, pork, poultry, game, lamb, and fish.
All stubs have the KCE:CUT_METHOD frontmatter (tree-registered) and a `⚠️ STATUS: STUB` marker.
Source collection deferred to future sessions.

**Beef:**
- `www/recipes/beef/braising/brisket-smoker.md`
- `www/recipes/beef/braising/chuck_roast-smoker.md`
- `www/recipes/beef/braising/short_ribs-smoker.md`

**Pork:**
- `www/recipes/pork/ribs/spare_ribs-smoker.md`
- `www/recipes/pork/ribs/st_louis_ribs-smoker.md`
- `www/recipes/pork/chops/pork_tenderloin-smoker.md`
- `www/recipes/pork/chops/pork_chop-smoker.md`
- `www/recipes/pork/roasts/pork_loin_roast-smoker.md`
- `www/recipes/pork/roasts/cured_ham-smoker.md`

**Poultry:**
- `www/recipes/poultry/chicken/whole_chicken-smoker.md`
- `www/recipes/poultry/chicken/chicken_thigh-smoker.md`
- `www/recipes/poultry/chicken/chicken_wing-smoker.md`
- `www/recipes/poultry/turkey/whole_turkey-smoker.md`
- `www/recipes/poultry/turkey/turkey_breast-smoker.md`
- `www/recipes/poultry/duck/duck_breast-smoker.md`
- `www/recipes/poultry/duck/whole_duck-smoker.md`

**Game:**
- `www/recipes/game/venison/venison_roast-smoker.md`
- `www/recipes/game/wild_boar/wild_boar_shoulder-smoker.md`
- `www/recipes/game/moose/moose_roast-smoker.md`
- `www/recipes/game/reindeer/reindeer_roast-smoker.md`

**Lamb:**
- `www/recipes/lamb/roasts/leg_of_lamb-smoker.md`
- `www/recipes/lamb/roasts/lamb_shoulder-smoker.md`

**Fish:**
- `www/recipes/fish/white_fish/haddock-smoker.md`
- `www/recipes/fish/tuna/tuna_steak-smoker.md`

## Session 4 (2026-05-31) — Abu-röken research; missing fish & poultry cut stubs added

Research focus: abu-röken (Swedish stovetop box smoker), wok smoking, tea smoking, and traditional Scandinavian freshwater/market fish cuts not yet in the tree.

**New oily fish stubs (cuts without dedicated parent files):**
- `www/recipes/fish/oily_fish/eel.md` — ål (id=803); classic abu-röken fish, methods: grill, pan_fry, oven_bake, smoker

**New white fish stubs — Scandinavian freshwater:**
- `www/recipes/fish/white_fish/perch.md` — abborre (id=428)
- `www/recipes/fish/white_fish/arctic_char.md` — röding (id=429)
- `www/recipes/fish/white_fish/whitefish.md` — sik (id=434)
- `www/recipes/fish/white_fish/pike.md` — gädda (id=435)
- `www/recipes/fish/white_fish/flounder.md` — flundra (id=436)
- `www/recipes/fish/white_fish/plaice.md` — rödspätta (id=437)
- `www/recipes/fish/white_fish/grayling.md` — harr (id=438)
- `www/recipes/fish/white_fish/burbot.md` — lake (id=439)
- `www/recipes/fish/white_fish/pikeperch.md` — gös (id=441)

**New white fish stubs — market/premium fish:**
- `www/recipes/fish/white_fish/redfish.md` — uer/kungsfisk (id=442)
- `www/recipes/fish/white_fish/gilt_head_bream.md` — guldspirad (id=443)
- `www/recipes/fish/white_fish/turbot.md` — piggvar (id=444)
- `www/recipes/fish/white_fish/sole.md` — sjötunga (id=445)
- `www/recipes/fish/white_fish/pollock.md` — sei (id=446)
- `www/recipes/fish/white_fish/monkfish.md` — marulk (id=447)

**New poultry stub (wok/tea smoking connection):**
- `www/recipes/poultry/quail/quail.md` — vaktel (id=355, new Meat id=35 + CutType id=355)

**cooking_data.py:** Added WHITE_FISH MeatCut entries ids 428–429, 434–439, 441–447; OILY_FISH 803 (eel); QUAIL array + Meat id=35 / CutType id=355.

**generate_frontend_data.py:** Added "quail"→"Vaktel" in _MEAT_NAME_SV; "Quail"→"Vaktel" in _CUT_TYPE_NAME_SV.

**Generator:** Ran clean. 186 cuts across 7 categories.

## Session 5 (2026-05-31) — IMPROVE_CUT_FILES: 5 stubs improved with sourced method leaves

Executed IMPROVE_CUT_FILES.md for 5 freshwater/oily fish stubs. Each leaf was written from real fetched sources and includes both an English `## Cut profile` section and a Swedish `## Styckesprofil` section. Four source recipes each, from diverse culinary traditions. Parent cut files updated to `quality_score: 5`, `cooking_methods_researched: 1`.

**Leaf files created (docs/recipe_research/ + www/recipes/ mirrors):**

- `fish/white_fish/arctic_char-pan_sear.md` — röding, pan sear
  - Sources: Köket.se (SE), ichkoche.at (AT), Chefkoch.de (DE), Chef Simon (FR)
  - Pull range 54–61°C; recommended_doneness: medium

- `fish/white_fish/pikeperch-pan_fry.md` — gös/zander/sandre, pan fry
  - Sources: Köket.se (SE), Chefkoch.de (DE), Kogebog.dk (DK), Chef Simon (FR)
  - Pull range 59–61°C; recommended_doneness: well_done

- `fish/white_fish/perch-pan_fry.md` — abborre/Barsch/perche, pan fry
  - Sources: Köket.se (SE), Chefkoch.de (DE), Soppa365.fi (FI), Swissmilk (CH)
  - Pull range 59–61°C; recommended_doneness: well_done

- `fish/oily_fish/eel-smoker.md` — ål, hot smoker
  - Sources: Alsterbro smokehouse (SE), Palingkopen.nl (NL), Chefkoch.de (DE), BestRecipes24 (RU)
  - Pull range 64–65°C; recommended_doneness: well_done

- `fish/white_fish/whitefish-oven_bake.md` — sik/siika/Felchen, oven bake
  - Sources: Soppa365.fi (FI), Köket.se (SE), ichkoche.at (AT/CH), Lake Michigan Angler (US)
  - Pull range 60–61°C; recommended_doneness: well_done

## Session 5 (2026-05-31) — Session start

### Output 1 — Culinary group definitions

|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

### Output 2 — Analysis gate rule

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

### Output 3 — Source integrity rule

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

### Output 4 — Understanding

This task is to improve five fish cut stubs by creating one real, sourced method leaf for each requested cut-method pair in `docs/recipe_research/`, with bilingual profiles and 4–6 complete saved recipes per leaf. “This is not a race” means I must verify every URL with `web_fetch`, avoid guessing missing details, and prefer honest incremental progress over unsupported completion claims. After this gate, I should research each leaf methodically, create the files from verified sources, update the parent cut scores, and validate that the repository changes are structurally correct.


## Session 8 (2026-05-31) — Session start

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

### Output 4 — My understanding of this file (own words)

The primary task is to improve five freshwater/oily fish cut files (arctic_char, pikeperch, perch, eel, whitefish) by researching and creating their missing cut-method leaves. Each leaf requires 4–6 real, fetched-and-verified source recipes from diverse culinary traditions before the analysis sections may be written. "This is not a race" means I will fetch every URL before citing it, will not fill gaps with training-data memory, will work incrementally committing between cuts, and will accept that reaching small improvements on hard-to-source cuts is still valid progress. After all five cuts have at least one additional leaf each, the CHORES.md step may follow.

---

## Session 7 (2026-05-31) — Session start

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

### Output 4 — My understanding of this file (own words)

The primary task is to use real, sourced research to thoroughly improve five fish cut stubs — each needing one complete method leaf — by finding 4–6 real, verifiable, human-created recipe sources per leaf, writing full structured recipe entries with probe instructions and explicit temperatures, and producing the temperature consensus, what-makes-it-special, data-applied, and summary sections. "This is not a race" means I will spend whatever time and tokens are needed to fetch and verify every source URL, will not guess or paraphrase from training memory, and will prefer genuine incremental progress over false completeness claims. After this session's five leaf files are fully verified and the ✅ CONFORMS TO TOR markers added, I update the parent cut file quality scores and then check whether CHORES.md is warranted.

---

## Session 6 (2026-05-31) — Fish leaf research written

Created five new method leaves in `docs/recipe_research/`:
- `fish/white_fish/arctic_char-pan_sear.md`
- `fish/white_fish/pikeperch-pan_fry.md`
- `fish/white_fish/perch-pan_fry.md`
- `fish/oily_fish/eel-smoker.md`
- `fish/white_fish/whitefish-oven_bake.md`

Research sources actually fetched and used included Köket.se, Chefkoch.de, ichkoche.at, Soppa365.fi, Swissmilk, Kogebog.dk, Palingkopen.nl, Alsterbro, BestRecipes24, Lake Michigan Angler, and Chef Simon. Parent cut stubs for arctic_char, pikeperch, perch, eel, and whitefish were updated from quality score 0 / researched 0 to quality score 5 / researched 1.

---

## Session 9 (2026-05-31) — IMPROVE_CUT_FILES: focus on finding more cooking methods

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

### Output 4 — Understanding (own words)

The primary task is to improve the 8 lowest-scoring cut files (all quality_score: 0 fish stubs — burbot, flounder, gilt_head_bream, grayling, monkfish, pike, plaice, pollock) by actively researching cooking methods used for each cut across culinary traditions, finding methods not yet listed, and creating fully sourced method leaf files. "This is not a race" means I will fetch every URL, verify the content before citing, not fill gaps with training-data memory, and accept that small incremental improvements are valid — stopping early because a cut is hard or has few sources would be wrong. After all 8 cuts have had their methods researched and at least some new leaf files created, I do CHORES.md.


---

## Session 9 continued (2026-05-31) — New method leaf files created

Identified 5 new cooking methods for lowest-scoring fish cuts and created all leaf files:

**cooking_data.py additions:**
- Pike (id 435): added BRAISE
- Flounder (id 436): added STEAM
- Plaice (id 437): added STEAM
- Pollock (id 446): added GRILL
- Monkfish (id 447): added SOUS_VIDE

**New leaf files created:**
- `docs/recipe_research/fish/white_fish/pike-braise.md` — 4 recipes (DE/FR/SE/DE), pull 60°C, well_done
- `docs/recipe_research/fish/white_fish/pollock-grill.md` — 4 recipes (GB/DE/SE/NO), pull 60°C, well_done
- `docs/recipe_research/fish/white_fish/plaice-steam.md` — 4 recipes (CN/TH/VN/DE), pull 60°C, well_done
- `docs/recipe_research/fish/white_fish/flounder-steam.md` — 4 recipes (CN/TH/VN/DE), pull 60°C, well_done
- `docs/recipe_research/fish/white_fish/monkfish-sous_vide.md` — 3 recipes (UK/UK/USA), bath 45–54°C, medium (partial TOR conformance — no non-Western sous vide sources found)

All leaf files written to the single real directory (docs/recipe_research/fish/white_fish/ = custom_components/.../www/recipes/fish/white_fish/ same inode). Parent stub files updated with new methods and research links. generate_frontend_data.py run: 624 recipe files, 186 cuts, PANEL_VERSION updated.

---

## Session 10 (2026-05-31) — Focus: finding more cooking methods suitable for cuts

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

### Output 4 — Understanding (own words)

The primary task is to improve the 8 lowest-scoring cut files — all with quality_score: 0 — by actively researching what cooking methods are used for each cut across culinary traditions, finding methods not yet listed in the `methods:` frontmatter, and creating fully sourced method leaf files. The problem statement specifically calls out "finding more cooking methods suitable for the cuts," which means step (a) of the IMPROVE_CUT_FILES process is the core focus: assume the current methods lists are incomplete and investigate what real cooks in different traditions actually do with each cut. "This is not a race" means I will use web_search to discover methods, then verify with web_fetch before citing any source — fabricating or paraphrasing recipe content is wrong even when sources are sparse, and a genuine partial improvement is more valuable than a dishonest complete one. After this session's leaf files are created and parent cuts updated, CHORES.md follows.

---

### Method inventory — cuts to be researched this session

**Cuts with no leaf files (priority):**
- gilt_head_bream: current methods [pan_sear, oven_bake, grill, charcoal_grill] — research additional
- turbot: current methods [pan_sear, oven_bake, grill, sous_vide] — research additional
- sole: current methods [pan_fry, pan_sear, oven_bake, grill] — research additional
- grayling: current methods [pan_fry, grill, smoker, oven_bake] — research additional
- burbot: current methods [pan_fry, oven_bake, smoker, braise] — research additional
- redfish: current methods [pan_fry, pan_sear, oven_bake, grill, smoker] — research additional
- quail: current methods [grill, oven_roast, pan_fry, smoker] — research additional

**Cuts with one leaf file (secondary):**
- pike: current methods [pan_fry, oven_bake, grill, smoker, braise] — has pike-braise.md
- flounder: current methods [pan_fry, grill, oven_bake, smoker, steam] — has flounder-steam.md
- plaice: current methods [pan_fry, oven_bake, grill, smoker, steam] — has plaice-steam.md
- pollock: current methods [pan_fry, oven_bake, air_fryer, smoker, grill] — has pollock-grill.md
- monkfish: current methods [pan_sear, oven_roast, grill, braise, sous_vide] — has monkfish-sous_vide.md

---

## Session 10 continued (2026-05-31) — Leaf files created + parent files updated

### New methods discovered and confirmed

**gilt_head_bream — STEAM** (new method, not previously in cooking_data.py):
- Confirmed real recipe URLs (web_fetch verified): thewoksoflife.com (CN), hot-thai-kitchen.com (TH), chefkoch.de (DE), ichkoche.at (AT)
- Added `CookingMethod.STEAM` to cooking_data.py gilt_head_bream (id=443)
- Created `gilt_head_bream-steam.md` — Groups A+B, pull 60°C, well_done

**sole — PAN_FRY** (method already in cooking_data.py, first leaf file):
- Confirmed real recipe URLs: bbcgoodfood.com (GB), chefkoch.de (DE), ricette.giallozafferano.it (IT), ichkoche.at (AT)
- Created `sole-pan_fry.md` — all Group B Western European (sole meunière is inherently European), pull 60°C, well_done

**redfish — PAN_FRY** (method already in cooking_data.py, first leaf file):
- Confirmed real recipe URLs: chefkoch.de (DE), ichkoche.at (AT), madensverden.dk (DK), recipetineats.com (AU)
- Created `redfish-pan_fry.md` — Groups B+D, pull 60°C, well_done

### Parent files updated — cooking_methods_researched: 1

All 8 fish cut parent files updated:
- `gilt_head_bream.md`: added steam to methods list, research link, cooking_methods_researched: 1
- `sole.md`: cooking_methods_researched: 1
- `redfish.md`: cooking_methods_researched: 1
- `pike.md`: cooking_methods_researched: 1 (leaf file pike-braise.md from Session 9)
- `flounder.md`: cooking_methods_researched: 1 (leaf file flounder-steam.md from Session 9)
- `plaice.md`: cooking_methods_researched: 1 (leaf file plaice-steam.md from Session 9)
- `pollock.md`: cooking_methods_researched: 1 (leaf file pollock-grill.md from Session 9)
- `monkfish.md`: cooking_methods_researched: 1 (leaf file monkfish-sous_vide.md from Session 9)

### Methods deferred (insufficient confirmed sources)

- **grayling pan_fry**: No grayling-specific pan-fry recipes found on confirmed whitelist sites (chefkoch.de Äsche search returned 0 results; ichkoche.at has poached and steamed grayling but not pan-fried). Deferred.
- **quail braise**: chefkoch.de Caille aux Raisins URLs returned 404s in Session 10; main site giallozafferano.it had no braised quail. Deferred.
- **turbot steam/braise**: Not researched — deferred to future session.
- **burbot**: Not researched — deferred.

### generate_frontend_data.py

Run after all changes. 627 recipe files across 187 cuts, PANEL_VERSION 627.

---

## Session 11 (2026-05-31) — Execute IMPROVE_CUT_FILES.md: 8 lowest-scoring cuts

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

### Output 4 — Understanding (own words)

The primary task is to improve the 8 lowest-scoring cut files (all at quality_score: 0) by doing thorough sourced research for each — finding real cooking methods across culinary traditions via web_fetch, then creating method leaf files (targeting an average of 4 per cut) that each contain 4–6 fully sourced recipes. "This is not a race" means I will verify each source via web_fetch before citing it, spend real effort finding methods from Groups A–D, and not abandon hard cuts just because they are difficult to research. Partial improvement is always better than a fabricated complete improvement. After all 8 cut files are improved, CHORES.md follows.

### 8 lowest-scoring cut files identified

All at quality_score: 0:

| Cut | cooking_methods_researched | Existing leaf files |
|-----|--------------------------|---------------------|
| grayling | 0 | none |
| turbot | 0 | none |
| burbot | 0 | none |
| monkfish | 1 | monkfish-sous_vide.md (3 sources, Group B only) |
| plaice | 1 | plaice-steam.md (4 sources, Groups A+B) |
| flounder | 1 | flounder-steam.md (4 sources, Groups A+B) |
| sole | 1 | sole-pan_fry.md (4 sources, Group B only) |
| gilt_head_bream | 1 | gilt_head_bream-steam.md (4 sources, Groups A+B) |

_(Session 11 ended at session-start gate; no new files were created.)_

---

## Session 12 (2026-05-31) — Honest rescoring of 23 cut files

**Problem discovered:** 5 stub files had blanket `−15` score-deduction rows inserted by an earlier agent session ("Fix scoring for 5 stub files"). A subsequent revert removed those rows, but 23 cut files still contained inaccurate scoring rows inherited from that pattern or had quality_score values that did not reflect the honest state of the file.

**Actions:**
- Reviewed all 23 affected cut files from scratch against the IMPROVE_CUT_FILES scoring rubric.
- Removed blanket `−15` deduction rows where they were dishonest (stub files with no leaf research do not earn negative rows; they just earn 0 for absent items).
- Corrected `quality_score` values in each file to match what the file actually contains (not an aspirational or deducted score).
- Re-ran `generate_frontend_data.py` → PANEL_VERSION 628 → 629.

**Files updated (23 total):**
- `fish/oily_fish/baltic_herring.md`, `eel.md`, `herring.md`, `mackerel.md`
- `fish/salmon/salmon_fillet.md`
- `fish/white_fish/arctic_char.md`, `burbot.md`, `cod_fillet.md`, `flounder.md`, `gilt_head_bream.md`, `grayling.md`, `monkfish.md`, `perch.md`, `pike.md`, `pikeperch.md`, `plaice.md`, `pollock.md`, `redfish.md`, `sole.md`, `trout.md`, `turbot.md`, `whitefish.md`
- `poultry/quail/quail.md`

**CHORES.md (this session):**
- Version bumped to `0.10.2.2` in `manifest.json`, `__init__.py`, `const.py`.
- `docs/USER_GUIDE.md` updated: version header, fish/poultry cut examples in §5.2, section 15 TOC/heading aligned.
- Branch timeline updated (this entry).
- `_openHelp` anchors in `panel-class-template.js` verified — all match current USER_GUIDE headings, no changes needed.

---

## Session 13 (2026-06-01) — IMPROVE_CUT_FILES for 1 cut file (no rescoring)

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

This task is to improve cut files with real, verifiable recipe research by adding missing method leaf files and keeping each leaf tied to fetched sources. “This is not a race” means I should favor data quality and source integrity over speed, avoid guessing, and accept incremental improvements as valid progress. For this session I am doing one cut file only, and I will leave quality-score rescoring for the next agent. After this one-cut improvement is complete, CHORES.md is next.

## Execution notes

- Target cut: `fish/white_fish/haddock.md`.
- Added one researched method leaf: `fish/white_fish/haddock-oven_roast.md` (4 fetched sources).
- Updated parent cut method links to include oven-roast leaf.
- Per user instruction, no quality-score rescoring was performed in this session.
