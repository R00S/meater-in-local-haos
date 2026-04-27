<!-- KCE:CUT
type: cut
slug: reindeer_roast
name: Reindeer Roast
category: game
meat: reindeer
cut_type: Reindeer
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- oven_roast
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
quality_score: 8
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Reindeer Roast — Cut Overview

## Cut profile

Reindeer roast (renstek) is a traditional Sami and Scandinavian festive dish. The round/topside (innanlår) or saddle is the most common cut. The Scandinavian method: sear in a hot pan, then finish in a very low oven (100–125 °C) with the probe inserted to achieve precise doneness without risk of overcooking the lean meat. The traditional accompaniment is cream sauce with lingonberries.


Target internal temperature: **57–62 °C (135–144 °F)** for medium. Pull at 55 °C and rest.


## Research files by cooking method

- [Oven Roast](./reindeer_roast-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `reindeer_roast-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Group A, Culinary Group B and Culinary Group C tradition(s) — add Culinary Group A, Culinary Group B and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `reindeer_roast-oven_roast.md` copies parent cut profile — rewrite `reindeer_roast-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
