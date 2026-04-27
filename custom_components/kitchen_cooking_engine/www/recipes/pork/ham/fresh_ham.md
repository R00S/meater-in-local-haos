<!-- KCE:CUT
type: cut
slug: fresh_ham
name: Fresh Ham
category: pork
meat: pig
cut_type: Ham
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- oven_roast
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Fresh Ham — Cut Overview

## Cut profile

A fresh (uncured, unsmoked) ham is the entire hind leg of a pig — bone-in, skin-on, with the femur and aitchbone running through the centre and a thick layer of subcutaneous fat under the rind. Anatomically distinct from cured (julskinka) or smoked ham preparations: the muscle has its full natural moisture, the rind is supple rather than salted-firm, and the fat has not been altered by brine. Roasting requires a long, moderate-temperature cook (140–160 °C) that drives the centre to safe temperature without overcooking the surface meat under the fat. Carryover is significant — 4–6 °C in a 4–6 kg leg — because the bone, fat and dense muscle store heat well. Rest 30–45 minutes loosely tented before carving.


## Research files by cooking method

- [Oven Roast](./fresh_ham-oven_roast.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Method file `fresh_ham-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `fresh_ham-oven_roast.md` copies parent cut profile — rewrite `fresh_ham-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
