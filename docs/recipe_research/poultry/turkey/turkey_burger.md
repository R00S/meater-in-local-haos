<!-- KCE:CUT
type: cut
slug: turkey_burger
name: Turkey Burger
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
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Turkey Burger — Cut Overview

## Cut profile

A grilled turkey burger is a 150–180 g shaped patty made from coarsely-ground turkey thigh — the standard for moisture and flavour because turkey breast (1–4 % fat) dries out on the high heat of a grill before reaching the food-safety threshold for ground poultry. Ground thigh carries 8–14 % fat plus the gelatinous connective tissue that holds patties together without binders. The cooking goal: drive the centre past 74 °C (165 °F) — the FDA/USDA threshold for ground poultry — while developing crisp, lacquered grill marks. Turkey patties tolerate slightly more aggressive aromatics than chicken because the meat is somewhat blander; sage, rosemary, mustard, paprika and lemon all carry well. Probe the geometric centre of the largest patty horizontally; carryover is small (1–2 °C).


## Research files by cooking method

- [Air Fryer](./turkey_burger-air_fryer.md)
- [Grill](./turkey_burger-grill.md)
- [Pan Fry](./turkey_burger-pan_fry.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Method file `turkey_burger-grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `turkey_burger-grill.md` copies parent cut profile — rewrite `turkey_burger-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
