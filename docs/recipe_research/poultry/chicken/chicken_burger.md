<!-- KCE:CUT
type: cut
slug: chicken_burger
name: Chicken Burger
name_sv: Kycklingburgare
category: poultry
meat: ground_poultry
cut_type: Ground
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- air_fryer
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Chicken Burger — Cut Overview

## Cut profile

Ground chicken burgers are formed patties made from minced chicken, typically 85–93% lean. Because ground poultry must be cooked to a higher internal temperature than whole muscle, and because the meat is lean and prone to drying out, adding binders (egg, breadcrumbs, or cooked rice) helps retain moisture. The air fryer circulates hot air to brown the exterior without deep frying.


Target internal temperature: **165 °F (74 °C)** — USDA minimum for ground poultry


## Research files by cooking method

- [Air Fryer](./chicken_burger-air_fryer.md)
- [Grill](./chicken_burger-grill.md)
- [Pan Fry](./chicken_burger-pan_fry.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `chicken_burger-air_fryer.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Group A, Culinary Group B and Culinary Group D tradition(s) — add Culinary Group A, Culinary Group B and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `chicken_burger-air_fryer.md` copies parent cut profile — rewrite `chicken_burger-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
