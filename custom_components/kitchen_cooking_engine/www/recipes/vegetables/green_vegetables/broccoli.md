<!-- KCE:CUT
type: cut
slug: broccoli
name: Broccoli
name_sv: Broccoli
category: vegetables
meat: green_vegetables
cut_type: Green Vegetables
methods:
- air_fryer
- oven_roast
- saute
- steam
doneness:
- name: crisp_tender
  target_c: 85
  target_f: 185
  min_c: 80
  min_f: 175
  max_c: 90
  max_f: 195
  usda_safe: true
- name: tender
  target_c: 95
  target_f: 203
  min_c: 90
  min_f: 195
  max_c: 100
  max_f: 212
  usda_safe: true
  recommended: true
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Broccoli — Cut Overview

## Cut profile

Broccoli (*Brassica oleracea* var. *italica*) sautéed in a hot pan — or stir-fried in a wok — produces golden-blistered florets with a caramelised stem and bright-green colour. The pan must be very hot; broccoli must be completely dry; it should not be crowded. Cooking time: 6–8 minutes. Pull temperature: 78–83 °C (172–181 °F) for tender-crisp, golden broccoli. MEATER probe through the stem of the largest floret.


## Research files by cooking method

- [Air Fryer](./broccoli-air_fryer.md)
- [Oven Roast](./broccoli-oven_roast.md)
- [Sauté](./broccoli-saute.md)
- [Steam](./broccoli-steam.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `broccoli-saute.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `broccoli-saute.md` copies parent cut profile — rewrite `broccoli-saute.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
