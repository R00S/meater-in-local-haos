# Branch Timeline: bump-to-0-6-4-0-again — v0.6.4.x

## Session start

### Output 1 — Culinary group definitions (verbatim from `RECIPE_COLLECTION_TOR.md`)

| Culinary Group | Includes |
|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

---

### Output 2 — Analysis gate rule (verbatim from `RECIPE_ANALYSIS_TOR.md`)

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

---

### Output 3 — Source integrity rule (verbatim from `SOURCE_SURVEY.md`)

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

---

### Output 4 — My understanding of this file (my own words)

The primary task is to incrementally improve the 50 lowest-scoring cut files in `docs/recipe_research/` by adding real, sourced recipes found via `web_fetch`/`web_search` and following the RECIPE_COLLECTION_TOR and RECIPE_ANALYSIS_TOR. "This is not a race" means I must never fabricate recipe content, never map cuts to wrong species, never add unverified data to look like progress — a small genuine improvement is worth more than a large fabricated one. I commit after each cut file and continue to the next without stopping. After all 50 are done, I execute CHORES.md.

---

## Version bump: 0.6.3.5 → 0.6.4.0

- manifest.json, __init__.py, const.py all updated to 0.6.4.0
- generate_frontend_data.py run successfully; PANEL_VERSION auto-incremented

---

## Cut file improvement log

### 50 lowest-scoring files (assessed 2026-04-27)

Score 0 (23 files):
1. beef/roasts/sirloin_tip_roast.md
2. game/buffalo/buffalo_roast.md
3. game/kangaroo/kangaroo_fillet.md
4. game/mutton/mutton_shoulder_alt.md
5. game/ostrich/ostrich_fillet.md
6. game/reindeer/reindeer_loin.md
7. game/venison/venison_leg.md
8. game/venison/venison_shoulder.md
9. lamb/chops/lamb_neck_filet.md
10. lamb/ground/lamb_crown_roast.md
11. lamb/ground/lamb_rib_rack.md
12. lamb/roasts/lamb_brisket.md
13. lamb/roasts/lamb_loin_roast.md
14. lamb/roasts/lamb_rib.md
15. lamb/roasts/lamb_rump.md
16. pork/offal/cheek.md
17. pork/offal/liver_pork.md
18. pork/offal/pork_jowl.md
19. pork/ribs/st_louis_ribs.md
20. poultry/chicken/chicken_breast_bone_in.md
21. poultry/duck/duck_leg_confit.md
22. poultry/turkey/turkey_ground.md
23. poultry/turkey/turkey_thigh.md

Score 4 (1 file):
24. pork/offal/pork_cheek.md

Score 5 (4 files):
25. beef/steaks/sirloin_steak.md
26. fish/white_fish/cod_fillet.md
27. fish/white_fish/hake.md
28. poultry/chicken/chicken_wing.md

Score 6 (5 files):
29. beef/steaks/picanha.md
30. beef/steaks/t_bone.md
31. poultry/chicken/chicken_leg.md
32. poultry/chicken/whole_chicken.md
33. vegetables/root_vegetables/roasted_potatoes.md

Score 7 (first 17 alphabetically):
34. beef/braising/brisket.md
35. beef/braising/chuck_roast.md
36. beef/roasts/round_roast.md
37. beef/roasts/rump.md
38. beef/roasts/rump_roast.md
39. beef/roasts/top_round_roast.md
40. beef/steaks/ny_strip.md
41. beef/steaks/ribeye_steak.md
42. fish/white_fish/haddock.md
43. fish/white_fish/mahi_mahi.md
44. fish/white_fish/swordfish.md
45. game/bison/bison_steak.md
46. game/buffalo/buffalo_steak.md
47. game/goat/goat_leg.md
48. game/ostrich/ostrich_steak.md
49. game/reindeer/reindeer_steak.md
50. game/venison/venison_loin.md

---

### Cut file progress

| # | File | Score before | Score after | Status |
|---|------|-------------|-------------|--------|
| 1 | beef/roasts/sirloin_tip_roast.md | 0 | — | pending |
| 2 | game/buffalo/buffalo_roast.md | 0 | — | pending |
| 3 | game/kangaroo/kangaroo_fillet.md | 0 | — | pending |
| 4 | game/mutton/mutton_shoulder_alt.md | 0 | — | pending |
| 5 | game/ostrich/ostrich_fillet.md | 0 | — | pending |
| 6 | game/reindeer/reindeer_loin.md | 0 | — | pending |
| 7 | game/venison/venison_leg.md | 0 | — | pending |
| 8 | game/venison/venison_shoulder.md | 0 | — | pending |
| 9 | lamb/chops/lamb_neck_filet.md | 0 | — | pending |
| 10 | lamb/ground/lamb_crown_roast.md | 0 | — | pending |
| 11 | lamb/ground/lamb_rib_rack.md | 0 | — | pending |
| 12 | lamb/roasts/lamb_brisket.md | 0 | — | pending |
| 13 | lamb/roasts/lamb_loin_roast.md | 0 | — | pending |
| 14 | lamb/roasts/lamb_rib.md | 0 | — | pending |
| 15 | lamb/roasts/lamb_rump.md | 0 | — | pending |
| 16 | pork/offal/cheek.md | 0 | — | pending |
| 17 | pork/offal/liver_pork.md | 0 | — | pending |
| 18 | pork/offal/pork_jowl.md | 0 | — | pending |
| 19 | pork/ribs/st_louis_ribs.md | 0 | — | pending |
| 20 | poultry/chicken/chicken_breast_bone_in.md | 0 | — | pending |
| 21 | poultry/duck/duck_leg_confit.md | 0 | — | pending |
| 22 | poultry/turkey/turkey_ground.md | 0 | — | pending |
| 23 | poultry/turkey/turkey_thigh.md | 0 | — | pending |
| 24 | pork/offal/pork_cheek.md | 4 | — | pending |
| 25 | beef/steaks/sirloin_steak.md | 5 | — | pending |
| 26 | fish/white_fish/cod_fillet.md | 5 | — | pending |
| 27 | fish/white_fish/hake.md | 5 | — | pending |
| 28 | poultry/chicken/chicken_wing.md | 5 | — | pending |
| 29 | beef/steaks/picanha.md | 6 | — | pending |
| 30 | beef/steaks/t_bone.md | 6 | — | pending |
| 31 | poultry/chicken/chicken_leg.md | 6 | — | pending |
| 32 | poultry/chicken/whole_chicken.md | 6 | — | pending |
| 33 | vegetables/root_vegetables/roasted_potatoes.md | 6 | — | pending |
| 34 | beef/braising/brisket.md | 7 | — | pending |
| 35 | beef/braising/chuck_roast.md | 7 | — | pending |
| 36 | beef/roasts/round_roast.md | 7 | — | pending |
| 37 | beef/roasts/rump.md | 7 | — | pending |
| 38 | beef/roasts/rump_roast.md | 7 | — | pending |
| 39 | beef/roasts/top_round_roast.md | 7 | — | pending |
| 40 | beef/steaks/ny_strip.md | 7 | — | pending |
| 41 | beef/steaks/ribeye_steak.md | 7 | — | pending |
| 42 | fish/white_fish/haddock.md | 7 | — | pending |
| 43 | fish/white_fish/mahi_mahi.md | 7 | — | pending |
| 44 | fish/white_fish/swordfish.md | 7 | — | pending |
| 45 | game/bison/bison_steak.md | 7 | — | pending |
| 46 | game/buffalo/buffalo_steak.md | 7 | — | pending |
| 47 | game/goat/goat_leg.md | 7 | — | pending |
| 48 | game/ostrich/ostrich_steak.md | 7 | — | pending |
| 49 | game/reindeer/reindeer_steak.md | 7 | — | pending |
| 50 | game/venison/venison_loin.md | 7 | — | pending |
