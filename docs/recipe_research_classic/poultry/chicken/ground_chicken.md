<!-- KCE:CUT
type: cut
slug: ground_chicken
name: Ground Chicken
category: poultry
meat: ground_poultry
cut_type: Ground
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- braise
- grill
- pan_fry
doneness:
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
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Ground Chicken — Cut Overview

## Cut profile

Ground chicken braised in liquid is a moist-heat method that keeps the lean meat from drying out and develops a flavourful sauce simultaneously. Because ground poultry is mixed throughout with bacteria (unlike whole muscle), every part of the meat must reach safe temperature. Braising is forgiving — the surrounding liquid prevents the meat from going above 212 °F (100 °C), but interior temp still easily exceeds 165 °F (74 °C) with adequate cooking time.


Target internal temperature: **165 °F (74 °C)** — USDA minimum for ground poultry; visual: no pink inside


## Research files by cooking method

- [Braise](./ground_chicken-braise.md)
- [Grill](./ground_chicken-grill.md)
- [Pan Fry](./ground_chicken-pan_fry.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Western tradition | −1 |
| Missing Northern tradition | −1 |
| Method file `ground_chicken-braise.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Western and Northern tradition(s) — add Western and Northern source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `ground_chicken-braise.md` copies parent cut profile — rewrite `ground_chicken-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
