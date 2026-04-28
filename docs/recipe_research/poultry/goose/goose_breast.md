<!-- KCE:CUT
type: cut
slug: goose_breast
name: Goose Breast
category: poultry
meat: goose
cut_type: Goose
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: medium_rare
methods:
- oven_roast
- pan_sear
doneness:
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
- name: safe
  target_c: 74
  target_f: 165
  min_c: 74
  min_f: 165
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Goose Breast — Cut Overview

## Cut profile

Goose breast is a rich, deeply flavoured dark meat with a substantial fat layer, similar in character to duck breast but larger and more assertively flavoured. Like duck breast, it is often served medium-rare to medium (145–155 °F / 63–68 °C) by many European chefs, though USDA guidelines require 165 °F (74 °C). The oven-roast method for goose breast mirrors duck breast technique: stovetop fat rendering followed by oven finishing. Goose breast dries out at high oven temperatures, so a moderate 350–375 °F oven with careful temperature monitoring is essential.


Target internal temperature: **145–155 °F (63–68 °C)** — medium; pull at 140 °F and rest. USDA safe minimum: 165 °F (74 °C) — pull at 160 °F and rest.


## Research files by cooking method

- [Oven Roast](./goose_breast-oven_roast.md)
- [Pan Sear](./goose_breast-pan_sear.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `goose_breast-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group B and Culinary Group C tradition(s) — add Culinary Group B and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `goose_breast-oven_roast.md` copies parent cut profile — rewrite `goose_breast-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
