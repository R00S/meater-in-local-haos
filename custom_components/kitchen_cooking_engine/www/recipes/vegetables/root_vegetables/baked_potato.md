<!-- KCE:CUT
type: cut
slug: baked_potato
name: Baked Potato
name_sv: Bakad potatis
category: vegetables
meat: root_vegetables
cut_type: Root Vegetables
methods:
- air_fryer
- oven_bake
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
quality_score: -6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 5
carryover_temp_c: 2
-->
# Baked Potato — Cut Overview

## Cut profile

Whole baked potato (*Solanum tuberosum*) in the conventional oven is the archetype of long, slow dry-heat cooking: 60–80 minutes at 200–220 °C, producing a deeply crispy, salt-encrusted skin and a fluffy, steamy interior. The internal temperature at complete doneness is 96–98 °C (205–208 °F) — below this, the centre remains dense and waxy; above it, the texture is optimal and floury. Russet (Idaho) and baking potatoes (high-starch varieties) achieve the best results; waxy varieties produce a gluey, dense result. A MEATER probe is inserted along the long axis into the geometric centre of the potato before it goes in the oven.


## Styckesprofil

Hel bakad potatis (*Solanum tuberosum*) i konventionell ugn är arketypen av lång, långsam torrvärme-tillagning: 60–80 minuter vid 200–220 °C, vilket ger ett djupt knaprig, saltinkrustat skinn och en helt fluffig, ångande insida. Klar när insidan är 98–100 °C.

## Research files by cooking method

- [Air Fryer](./baked_potato-air_fryer.md)
- [Oven Bake](./baked_potato-oven_bake.md)
## Quality score

**Score: -6 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `baked_potato-oven_bake.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `baked_potato-oven_bake.md` copies parent cut profile — rewrite `baked_potato-oven_bake.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
