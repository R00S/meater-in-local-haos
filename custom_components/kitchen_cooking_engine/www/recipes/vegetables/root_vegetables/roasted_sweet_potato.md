<!-- KCE:CUT
type: cut
slug: roasted_sweet_potato
name: Roasted Sweet Potato
name_sv: Rostad sötpotatis
category: vegetables
meat: root_vegetables
cut_type: Root Vegetables
methods:
- air_fryer
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
- name: caramelized
  target_c: 160
  target_f: 320
  min_c: 150
  min_f: 300
  max_c: 175
  max_f: 350
  usda_safe: true
quality_score: -6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 5
carryover_temp_c: 2
-->
# Roasted Sweet Potato — Cut Overview

## Cut profile

Whole baked sweet potato (*Ipomoea batatas*) in the conventional oven at 190–200 °C achieves a deeply caramelised, slightly wrinkled skin and a soft, jammy interior in 50–70 minutes depending on size. The low-and-slow heat allows the amylase enzymes in the sweet potato to convert starches to sugars, producing an intensely sweet result (particularly with Japanese *satsuma-imo* varieties). Pull temperature: 96–98 °C (205–208 °F) at the thickest centre. MEATER probe along long axis into the geometric centre.


## Styckesprofil

Hel bakad sötpotatis (*Ipomoea batatas*) i konventionell ugn vid 190–200 °C uppnår en djupt karameliserad, lätt skrumpna yta och mjuk, syltliknande insida på 50–70 minuter. Klar när insidan är 98–100 °C och sötpotatisskalet är knaprig och karameliserad.

## Research files by cooking method

- [Air Fryer](./roasted_sweet_potato-air_fryer.md)
- [Oven Bake](./roasted_sweet_potato-oven_bake.md)
- [Oven Roast](./roasted_sweet_potato-oven_roast.md)
## Quality score

**Score: -6 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group B tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `roasted_sweet_potato-oven_bake.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `roasted_sweet_potato-oven_bake.md` copies parent cut profile — rewrite `roasted_sweet_potato-oven_bake.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group B tradition(s) — add Culinary Group B source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
