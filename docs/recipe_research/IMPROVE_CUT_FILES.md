# IMPROVE_CUT_FILES.md — 50 Lowest-Scoring Cut Index Files

This file is the work queue for improving the 50 lowest-scoring cut index files in the
experimental recipe path (`docs/recipe_research/`). For each cut, the required work is:

1. **Improve the cut index file** — replace any placeholder cut profile with a real anatomy
   and cooking-behaviour description; update `quality_score`, `cooking_methods_researched`,
   and `quality_assessed` in the frontmatter once research is complete.
2. **Create any missing cut-method leaf files** (`{slug}-{method}.md`) — each leaf must
   conform fully to the `RECIPE_COLLECTION_TOR.md` (read it before starting any cut).
3. **No shortcuts, no fabricated sources.** Every source recipe must be web-fetched or
   otherwise verified before being written into a leaf file. If a source cannot be verified,
   do not write it. See `RECIPE_COLLECTION_TOR.md` and `SOURCE_SURVEY.md` for rules.
4. **One cut at a time.** Research each cut fully before moving to the next. Do not batch
   or parallel-write leaf files — the TOR requires per-recipe verification and method-specific
   cut profiles, not generic summaries.

> Generated 2026-04-27. Re-run the score scan script after improving any file to update scores.

---

## Score 0 — No research at all (32 files)

These cuts have `quality_score: 0` and no leaf files. Every line of the cut profile and every
source recipe in every leaf must be found and verified from scratch.

| # | Cut name | Slug | File | Methods needing research |
|---|----------|------|------|--------------------------|
| 1 | Buffalo Roast | `buffalo_roast` | `game/buffalo/buffalo_roast.md` | `oven_roast` |
| 2 | Cheek (Pork) | `cheek` | `pork/offal/cheek.md` | `braise`, `slow_cooker` |
| 3 | Chicken Breast (Bone-in) | `chicken_breast_bone_in` | `poultry/chicken/chicken_breast_bone_in.md` | `air_fryer`, `grill`, `oven_roast` |
| 4 | Duck Leg Confit | `duck_leg_confit` | `poultry/duck/duck_leg_confit.md` | `oven_roast` |
| 5 | Ham | `ham` | `pork/roasts/ham.md` | `oven_roast` |
| 6 | Kangaroo Fillet | `kangaroo_fillet` | `game/kangaroo/kangaroo_fillet.md` | `grill`, `pan_sear` |
| 7 | Lamb Brisket | `lamb_brisket` | `lamb/roasts/lamb_brisket.md` | `braise`, `slow_cooker` |
| 8 | Crown Roast (Lamb) | `lamb_crown_roast` | `lamb/ground/lamb_crown_roast.md` | `oven_roast` |
| 9 | Lamb Loin Roast | `lamb_loin_roast` | `lamb/roasts/lamb_loin_roast.md` | `oven_roast` |
| 10 | Lamb Neck Filet | `lamb_neck_filet` | `lamb/chops/lamb_neck_filet.md` | `braise`, `pan_sear`, `slow_cooker` |
| 11 | Lamb Rib | `lamb_rib` | `lamb/roasts/lamb_rib.md` | *(no methods listed — research and add)* |
| 12 | Rib Rack (Lamb) | `lamb_rib_rack` | `lamb/ground/lamb_rib_rack.md` | `grill`, `oven_roast` |
| 13 | Lamb Rump | `lamb_rump` | `lamb/roasts/lamb_rump.md` | `grill`, `oven_roast`, `pan_sear` |
| 14 | Pork Liver | `liver_pork` | `pork/offal/liver_pork.md` | `pan_fry`, `pan_sear` |
| 15 | Mutton Shoulder | `mutton_shoulder_alt` | `game/mutton/mutton_shoulder_alt.md` | `braise`, `oven_roast`, `slow_cooker` |
| 16 | Ostrich Fillet | `ostrich_fillet` | `game/ostrich/ostrich_fillet.md` | `grill`, `pan_sear` |
| 17 | Pork Jowl / Guanciale | `pork_jowl` | `pork/offal/pork_jowl.md` | `braise`, `oven_roast`, `pan_fry` |
| 18 | Reindeer Loin | `reindeer_loin` | `game/reindeer/reindeer_loin.md` | `oven_roast`, `pan_sear` |
| 19 | Roasting Joint (Beef) | `roasting_joint` | `beef/roasts/roasting_joint.md` | `oven_roast` |
| 20 | Round Roast | `round_roast` | `beef/roasts/round_roast.md` | `braise`, `oven_roast`, `slow_cooker` |
| 21 | Rump (Beef steak) | `rump` | `beef/roasts/rump.md` | `grill`, `oven_roast`, `pan_sear` |
| 22 | Rump Roast | `rump_roast` | `beef/roasts/rump_roast.md` | `braise`, `oven_roast`, `slow_cooker` |
| 23 | Salmon Steak | `salmon_steak` | `fish/salmon/salmon_steak.md` | `grill`, `oven_roast`, `pan_sear` |
| 24 | Sirloin Roast | `sirloin_roast` | `beef/roasts/sirloin_roast.md` | `oven_roast` |
| 25 | Sirloin Tip Roast | `sirloin_tip_roast` | `beef/roasts/sirloin_tip_roast.md` | `braise`, `oven_roast` |
| 26 | St. Louis Style Ribs | `st_louis_ribs` | `pork/ribs/st_louis_ribs.md` | `grill`, `oven_roast`, `smoker` |
| 27 | Top Round Roast | `top_round_roast` | `beef/roasts/top_round_roast.md` | `braise`, `oven_roast`, `slow_cooker` |
| 28 | Turkey Ground | `turkey_ground` | `poultry/turkey/turkey_ground.md` | `grill`, `pan_fry` |
| 29 | Turkey Leg | `turkey_leg` | `poultry/turkey/turkey_leg.md` | `oven_roast`, `smoker` |
| 30 | Turkey Thigh | `turkey_thigh` | `poultry/turkey/turkey_thigh.md` | `oven_roast` |
| 31 | Venison Leg | `venison_leg` | `game/venison/venison_leg.md` | `braise`, `oven_roast` |
| 32 | Venison Shoulder | `venison_shoulder` | `game/venison/venison_shoulder.md` | `braise`, `oven_roast`, `slow_cooker` |

---

## Score 4 — One method partially researched (1 file)

| # | Cut name | Slug | File | Score | Existing leaves | Missing leaves |
|---|----------|------|------|-------|-----------------|----------------|
| 33 | Pork Cheek | `pork_cheek` | `pork/offal/pork_cheek.md` | 4 | `braise`, `oven_roast`, `pan_fry` | `slow_cooker` |

---

## Score 5 — Some methods researched (4 files)

| # | Cut name | Slug | File | Score | Existing leaves | Missing leaves |
|---|----------|------|------|-------|-----------------|----------------|
| 34 | Chicken Wing | `chicken_wing` | `poultry/chicken/chicken_wing.md` | 5 | `air_fryer` | `grill`, `oven_roast` |
| 35 | Cod Fillet | `cod_fillet` | `fish/white_fish/cod_fillet.md` | 5 | `air_fryer`, `oven_bake`, `pan_fry` | `oven_roast` |
| 36 | Hake Fillet | `hake` | `fish/white_fish/hake.md` | 5 | `pan_fry` | `oven_roast`, `steam` |
| 37 | Sirloin Steak | `sirloin_steak` | `beef/steaks/sirloin_steak.md` | 5 | all 7 leaves exist | *(cut index quality score is low — improve cut profile and update score)* |

---

## Score 6 — Most methods researched but cut index needs improvement (6 files)

| # | Cut name | Slug | File | Score | Existing leaves | Missing leaves |
|---|----------|------|------|-------|-----------------|----------------|
| 38 | Chicken Leg / Drumstick | `chicken_leg` | `poultry/chicken/chicken_leg.md` | 6 | `oven_roast` | `air_fryer`, `grill` |
| 39 | Picanha | `picanha` | `beef/steaks/picanha.md` | 6 | all 4 leaves exist | *(cut index — improve profile and update score)* |
| 40 | Roasted Potatoes | `roasted_potatoes` | `vegetables/root_vegetables/roasted_potatoes.md` | 6 | all 2 leaves exist | *(cut index — improve profile and update score)* |
| 41 | T-Bone / Porterhouse | `t_bone` | `beef/steaks/t_bone.md` | 6 | all 5 leaves exist | *(cut index — improve profile and update score)* |
| 42 | Whole Chicken | `whole_chicken` | `poultry/chicken/whole_chicken.md` | 6 | `oven_roast` | `air_fryer`, `grill` |
| 43 | Short Ribs | `short_ribs` | `beef/braising/short_ribs.md` | 8¹ | `braise` | `oven_roast`, `slow_cooker`, `smoker` |

> ¹ `short_ribs` has been improved to score 8 (braise leaf completed 2026-04-27) and is no longer
> score 6; it is listed here as the next highest-priority braising cut still needing leaf work.

---

## Score 7 — Most leaves done but gaps remain (7 files)

| # | Cut name | Slug | File | Score | Existing leaves | Missing leaves |
|---|----------|------|------|-------|-----------------|----------------|
| 44 | Bison Steak | `bison_steak` | `game/bison/bison_steak.md` | 7 | `grill`, `pan_sear` | `charcoal_grill` |
| 45 | Brisket | `brisket` | `beef/braising/brisket.md` | 7 | `oven_roast` | `braise`, `slow_cooker`, `smoker` |
| 46 | Buffalo Steak | `buffalo_steak` | `game/buffalo/buffalo_steak.md` | 7 | `grill`, `pan_sear` | `charcoal_grill` |
| 47 | Chicken Breast | `chicken_breast` | `poultry/chicken/chicken_breast.md` | 7 | `pan_sear`, `grill`, `oven_bake`, `air_fryer` | `oven_roast`, `sous_vide` |
| 48 | Chuck Roast / Pot Roast | `chuck_roast` | `beef/braising/chuck_roast.md` | 7 | `braise` | `oven_roast`, `slow_cooker` |
| 49 | Goat Leg Roast | `goat_leg` | `game/goat/goat_leg.md` | 7 | `oven_roast` | `braise`, `slow_cooker` |
| 50 | Lamb Burger | `lamb_burger` | `lamb/ground/lamb_burger.md` | 7 | `grill` | `pan_fry` |

---

## How to improve a cut file

### Step 1 — Read the TOR and SOURCE_SURVEY first
- `docs/recipe_research/RECIPE_COLLECTION_TOR.md` — mandatory structure for every leaf file
- `docs/recipe_research/RECIPE_ANALYSIS_TOR.md` — mandatory analysis sections after the recipes
- `docs/recipe_research/SOURCE_SURVEY.md` — approved source domains and quality rules

### Step 2 — Improve the cut index file
Open `{cut_slug}.md`. Check whether:
- The `## Cut profile` section is a real anatomy+method description (not a placeholder)
- The `methods:` list in the frontmatter is complete and correct
- `quality_score:` and `cooking_methods_researched:` match the actual state of the leaf files

### Step 3 — Create each missing leaf file
For each missing `{method}` in the table above, create `{slug}-{method}.md` in the same directory.
Each leaf file **must**:
1. Begin with a `KCE:CUT_METHOD` frontmatter comment block (copy format from any existing leaf)
2. Have a method-specific `## Cut profile` (NOT a copy of the parent cut index profile)
3. Have **4–6 source recipes** from distinct culinary traditions (see SOURCE_SURVEY.md for approved sources)
4. Each recipe must have: full ingredients with quantities, numbered method steps, explicit MEATER probe placement instruction, **bolded pull temperature in °C and °F**, **bolded final serving temperature**
5. Have `## Temperature consensus` table covering all source recipes
6. Have `## What makes this method special` section
7. Have `## Data applied to cooking_data.py` section
8. Have `## Summary` (≤4 sentences)
9. End with `✅ CONFORMS TO TOR — Verified {date}.`

### Step 4 — Update the cut index
After all leaf files for a cut are done:
- Update `quality_score:` to reflect the new state
- Update `cooking_methods_researched:` to the number of completed method leaves
- Update `quality_assessed:` to today's date
- Update the `## Research files by cooking method` table in the cut index body

### Step 5 — Run the generator and commit
```bash
cd custom_components/kitchen_cooking_engine
python3 generate_frontend_data.py
```
Confirm it exits cleanly, then commit all changed files together (cut index + leaf files + generated JS).

---

## Priority order

Work from top to bottom in this list. Do NOT skip ahead to score-7 files while score-0 files remain.
Within score-0 cuts, prefer cuts with **fewer methods** first (easier to complete fully in one session)
so that each commit leaves a cut in a fully-researched state rather than partially done.

Suggested order for score-0 cuts based on number of missing methods:

| Priority | Cut | Missing methods |
|----------|-----|-----------------|
| 1st | Ham | 1 (`oven_roast`) |
| 2nd | Sirloin Roast | 1 (`oven_roast`) |
| 3rd | Duck Leg Confit | 1 (`oven_roast`) |
| 4th | Roasting Joint | 1 (`oven_roast`) |
| 5th | Lamb Loin Roast | 1 (`oven_roast`) |
| 6th | Crown Roast (Lamb) | 1 (`oven_roast`) |
| 7th | Turkey Thigh | 1 (`oven_roast`) |
| 8th | Buffalo Roast | 1 (`oven_roast`) |
| 9th | Kangaroo Fillet | 2 (`grill`, `pan_sear`) |
| 10th | Ostrich Fillet | 2 (`grill`, `pan_sear`) |
| … | … | … |
