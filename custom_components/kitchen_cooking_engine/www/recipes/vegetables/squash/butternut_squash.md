<!-- KCE:CUT
type: cut
slug: butternut_squash
name: Butternut Squash
name_sv: Butternutpumpa
category: vegetables
meat: squash
cut_type: Squash
methods:
- oven_roast
- pressure_cooker
- steam
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 5
carryover_temp_c: 2
-->
# Butternut Squash — Cut Overview

## Cut profile

Butternut squash (*Cucurbita moschata*) in a pressure cooker cooks in 8–12 minutes at high pressure (cubed), producing very soft, fully cooked flesh suitable for soups and purées. Pull temperature (measured via MEATER before sealing, or in the depressurised pot): 95–98 °C (203–208 °F). MEATER probe into the thickest cube before closing the lid.


## Styckesprofil

Butternut-squash (*Cucurbita moschata*) i tryckkokare tillagas på 8–12 minuter vid högtryck (tärnad), vilket ger mycket mjukt, fullt tillagat kött lämpat för soppor och pureer. Klar när fullständigt genomstekt och lätt att mosa.

## Research files by cooking method

- [Oven Roast](./butternut_squash-oven_roast.md)
- [Pressure Cooker](./butternut_squash-pressure_cooker.md)
- [Steam](./butternut_squash-steam.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `butternut_squash-pressure_cooker.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `butternut_squash-pressure_cooker.md` copies parent cut profile — rewrite `butternut_squash-pressure_cooker.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
