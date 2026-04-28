<!-- KCE:CUT
type: cut
slug: pork_cheek
name: Pork Cheek
name_sv: Fläskkind
category: pork
meat: pig
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
- oven_roast
- pan_fry
- slow_cooker
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Pork Cheek — Cut Overview

## Cut profile

Pork cheek (*carrillera de cerdo*, *guanciale di maiale*, *griskind*) is the small dense jaw muscle — roughly 80–120 g per cheek — composed of tightly interleaved fast-twitch fibres permeated by a dense collagen network built up through the animal's constant chewing. This makes it one of the toughest muscles on the pig at rest but one of the most flavourful and texturally rewarding when properly cooked. Intramuscular fat is distributed in thin sheets between the muscle bundles, basting the meat from within during long cooking. Depending on method: braising and slow cooking dissolve the collagen fully into gelatin, producing a spoon-tender or pull-apart result (91–94 °C); oven roasting in shallow liquid gives a caramelised crust with a fork-tender interior (91–93 °C); pan frying with butterflied cheeks creates a quick-crusted result at a lower internal temperature (65–67 °C) where the collagen hasn't converted but the fine-grained fibre structure remains bouncy rather than rubbery. The cut weighs 80–120 g per cheek, making precise probe placement critical.


## Research files by cooking method

- [Braise](./pork_cheek-braise.md)
- [Oven Roast](./pork_cheek-oven_roast.md)
- [Pan Fry](./pork_cheek-pan_fry.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | − **NOT DONE** (−8) |
| Missing method leaf file `pork_cheek-slow_cooker.md` | − pending (−1) |
| Missing Culinary Group A tradition | − pending (−1) |
| Missing Culinary Group C tradition | − pending (−1) |
| Method file `pork_cheek-braise.md` copies parent cut profile | ✓ fixed 2026-04-27 |
| Method file `pork_cheek-oven_roast.md` copies parent cut profile | ✓ fixed 2026-04-27 |
| Method file `pork_cheek-pan_fry.md` copies parent cut profile | ✓ fixed 2026-04-27 |
| Method file `pork_cheek-braise.md` copies `pork_cheek-oven_roast.md` | ✓ fixed 2026-04-27 |
| Method file `pork_cheek-braise.md` copies `pork_cheek-pan_fry.md` | ✓ fixed 2026-04-27 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `pork_cheek-slow_cooker.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
