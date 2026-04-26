<!-- KCE:CUT
type: cut
slug: venison_roast
name: Venison Roast
category: game
meat: venison
cut_type: Venison
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- braise
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
quality_score: 7
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Venison Roast — Cut Overview

## Cut profile

Venison haunch or saddle roast is a classic British, German, French, and Scandinavian festive dish. The typical method: dry-age if possible, then sear all over in a hot pan and finish in the oven (180–200 °C for medium/well, or low 120–140 °C for precision doneness with a probe). The saddle in particular is a show-piece roast in Michelin-star British cooking.


Target internal temperature: **55–60 °C (131–140 °F)** for a pink, moist result. Some German recipes use the "Niedergarmethode" (low-temperature method) at 80–90 °C to hit exactly 58 °C core.


## Research files by cooking method

- [Oven Roast](./venison_roast-oven_roast.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `venison_roast-braise.md` | −1 |
| Missing Eastern tradition | −1 |
| Missing Southern tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `venison_roast-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `venison_roast-braise.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Eastern and Southern tradition(s) — add Eastern and Southern source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
5. **−1** · Method file `venison_roast-oven_roast.md` copies parent cut profile — rewrite `venison_roast-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
