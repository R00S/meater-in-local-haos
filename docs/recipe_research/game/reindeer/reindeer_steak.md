<!-- KCE:CUT
type: cut
slug: reindeer_steak
name: Reindeer Steak
category: game
meat: reindeer
cut_type: Reindeer
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- pan_sear
doneness:
- name: rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
- name: medium_rare
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: medium
  target_c: 60
  target_f: 140
  min_c: 57
  min_f: 135
  max_c: 63
  max_f: 145
  usda_safe: false
- name: medium_well
  target_c: 66
  target_f: 150
  min_c: 63
  min_f: 145
  max_c: 68
  max_f: 155
  usda_safe: true
quality_score: 7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Reindeer Steak — Cut Overview

## Cut profile

Reindeer (*Rangifer tarandus*) is the traditional game meat of Sápmi (Lapland), northern Finland, Norway, and Sweden. The fillet (renfilé) and backstrap (sadel) are the premium cuts for pan searing. Reindeer meat is very lean, deep red, and has a delicate sweet-earthy flavour milder than moose. Because of its leanness it must be treated like venison: high heat, short cooking time, pulled well below well-done. Medium-rare (57 °C) is the Nordic standard.


Target internal temperature: **55–57 °C (131–135 °F)** for medium (Nordic preference). Pull at 52 °C.


## Research files by cooking method

- [Grill](./reindeer_steak-grill.md)
- [Pan Sear](./reindeer_steak-pan_sear.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `reindeer_steak-grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Group A, Culinary Group B and Culinary Group C tradition(s) — add Culinary Group A, Culinary Group B and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `reindeer_steak-grill.md` copies parent cut profile — rewrite `reindeer_steak-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
