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
