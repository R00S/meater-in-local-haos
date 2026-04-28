<!-- KCE:CUT
type: cut
slug: chicken_breast
name: Chicken Breast
category: poultry
meat: chicken
cut_type: Breast
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- air_fryer
- grill
- oven_bake
- oven_roast
- pan_sear
- sous_vide
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
quality_score: 7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Chicken Breast — Cut Overview

## Cut profile

Chicken breast is the *pectoralis major* muscle — the largest muscle of the bird, positioned on the sternum. Because domesticated chickens rarely fly or flap vigorously, this muscle has almost no connective tissue or intramuscular fat. It is white meat: lower myoglobin content, lighter colour, leaner composition, and a more delicate flavour than dark meat. Typical uncooked weight: 170–280 g per single breast (boneless, skinless). Thicker breasts often have an uneven cross-section that creates doneness gradients — the thick end overcooks before the thin end is safe. The USDA minimum safe temperature is 74 °C (165 °F); at this temperature white meat is cooked through but not dry if pulled immediately.


## Research files by cooking method

- [Air Fryer](./chicken_breast-air_fryer.md)
- [Grill](./chicken_breast-grill.md)
- [Oven Bake](./chicken_breast-oven_bake.md)
- [Pan Sear](./chicken_breast-pan_sear.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 6 declared) | −2 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `chicken_breast-air_fryer.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `chicken_breast-oven_roast.md`, `chicken_breast-sous_vide.md`
3. **−2** · Missing Culinary Group B and Culinary Group D tradition(s) — add Culinary Group B and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `chicken_breast-air_fryer.md` copies parent cut profile — rewrite `chicken_breast-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
