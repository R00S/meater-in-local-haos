<!-- KCE:CUT
type: cut
slug: chicken_wing
name: Chicken Wing
category: poultry
meat: chicken
cut_type: Dark Meat
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- air_fryer
- grill
- oven_roast
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
- name: dark_meat_optimal
  target_c: 77
  target_f: 170
  min_c: 74
  min_f: 165
  max_c: 82
  max_f: 180
  usda_safe: true
  recommended: true
quality_score: 5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Chicken Wing — Cut Overview

## Cut profile

Chicken wings (wingettes and drumettes) are small, high-surface-area dark-meat pieces that become irresistibly crispy in the air fryer without deep frying. The single most effective technique for extra-crispy skin is tossing wings with a small amount of baking powder before cooking — it raises the skin's pH, causing it to blister and brown faster. Patting wings dry is equally critical.


Target internal temperature: **165 °F (74 °C)** — USDA minimum for poultry


## Research files by cooking method

- [Air Fryer](./chicken_wing-air_fryer.md)
## Quality score

**Score: 5 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `chicken_wing-air_fryer.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `chicken_wing-grill.md`, `chicken_wing-oven_roast.md`
3. **−3** · Missing Culinary Group B, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group B, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
5. **−1** · Method file `chicken_wing-air_fryer.md` copies parent cut profile — rewrite `chicken_wing-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
