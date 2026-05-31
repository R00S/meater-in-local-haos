<!-- KCE:CUT
type: cut
slug: acorn_squash
name: Acorn Squash
name_sv: Ekolonpumpa
category: vegetables
meat: squash
cut_type: Squash
methods:
- oven_bake
- oven_roast
doneness:
- name: tender
  target_c: 95
  target_f: 203
  min_c: 90
  min_f: 195
  max_c: 100
  max_f: 212
  usda_safe: true
  recommended: true
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 5
carryover_temp_c: 2
-->
# Acorn Squash — Cut Overview

## Cut profile

Acorn squash (*Cucurbita pepo* var. *turbinata*) oven-baked whole or halved at 180–200 °C is a classic American autumn preparation. Halved and seed-scooped, then baked cut-face-down (30–40 min) or cut-face-up with a filling (35–50 min). Pull temperature: 90–95 °C (194–203 °F) at the thickest flesh wall. MEATER probe inserted through the skin into the thickest part of the flesh wall.


## Styckesprofil

Ekollon-squash (*Cucurbita pepo* var. *turbinata*) ugnsbakas hel eller halverad vid 180–200 °C. Halverad och urholkad, sedan bakad med snittytan ned. 40–50 minuter. Klar när köttet är genomstekt och lätt brynt vid kanterna.

## Research files by cooking method

- [Oven Bake](./acorn_squash-oven_bake.md)
- [Oven Roast](./acorn_squash-oven_roast.md)
## Quality score

**Score: -5 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Cut profile lacks anatomy | −1 |
| Method file `acorn_squash-oven_bake.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `acorn_squash-oven_bake.md` copies parent cut profile — rewrite `acorn_squash-oven_bake.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
