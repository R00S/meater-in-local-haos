<!-- KCE:CUT
type: cut
slug: spaghetti_squash
name: Spaghetti Squash
name_sv: Spagettipumpa
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Spaghetti Squash — Cut Overview

## Cut profile

Spaghetti squash (*Cucurbita pepo*) is baked whole or halved at 180–200 °C until the flesh separates into noodle-like strands when scraped with a fork. Halved baked cut-face-down (35–45 min); whole baked (50–65 min with fork pricks). Pull temperature: 90–95 °C (194–203 °F) at the thickest flesh wall. MEATER probe inserted through the skin into the flesh for whole baking, or through the skin of a half. The defining visual cue — flesh pulling into strands — coincides with 90–95 °C.


## Research files by cooking method

- [Oven Bake](./spaghetti_squash-oven_bake.md)
- [Oven Roast](./spaghetti_squash-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `spaghetti_squash-oven_bake.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group D tradition(s) — add Culinary Group A and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `spaghetti_squash-oven_bake.md` copies parent cut profile — rewrite `spaghetti_squash-oven_bake.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
