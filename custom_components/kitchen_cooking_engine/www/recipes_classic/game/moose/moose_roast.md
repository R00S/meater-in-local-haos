<!-- KCE:CUT
type: cut
slug: moose_roast
name: Moose Roast
category: game
meat: moose
cut_type: Moose
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
quality_score: 8
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Moose Roast — Cut Overview

## Cut profile

Moose (*Alces alces*) — called älg in Swedish, elg in Norwegian, and Elch in German — is the largest deer species in the Northern Hemisphere. The hindquarter roast (haunch/shoulder) has deep, dark red meat with minimal fat and a distinctive game flavour. Moose roast is best cooked slowly: high initial heat to develop a crust, then low, slow oven roasting (125–160 °C) with basting, aiming for a core temperature that gives a pink but safe result. The Swedish tradition uses cream and lingonberry as accompaniments.


Target internal temperature: **60–65 °C (140–149 °F)** for medium (pink centre); **70 °C (158 °F)** for fully cooked. The Swedish national tradition prefers 60–65 °C.


## Research files by cooking method

- [Oven Roast](./moose_roast-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `moose_roast-braise.md` | −1 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `moose_roast-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `moose_roast-braise.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `moose_roast-oven_roast.md` copies parent cut profile — rewrite `moose_roast-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
