<!-- KCE:CUT
type: cut
slug: chicken_leg
name: Chicken Leg / Drumstick
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
quality_score: 6
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Chicken Leg / Drumstick — Cut Overview

## Cut profile

Chicken drumsticks (the lower portion of the leg) are dark-meat cuts with more fat and connective tissue than breast, making them forgiving and flavourful. High-heat oven roasting renders the fat, crisps the skin, and breaks down collagen for juicy, tender meat. USDA minimum is 165 °F (74 °C), but dark meat is best at 170–175 °F (77–79 °C) where collagen converts to gelatin.


Target internal temperature: **170–175 °F (77–79 °C)** — recommended for dark meat drumsticks


## Research files by cooking method

- [Oven Roast](./chicken_leg-oven_roast.md)
## Quality score

**Score: 6 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `chicken_leg-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `chicken_leg-air_fryer.md`, `chicken_leg-grill.md`
3. **−3** · Missing Culinary Group B, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group B, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `chicken_leg-oven_roast.md` copies parent cut profile — rewrite `chicken_leg-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
