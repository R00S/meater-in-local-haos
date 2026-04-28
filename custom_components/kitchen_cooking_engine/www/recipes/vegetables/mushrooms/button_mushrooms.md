<!-- KCE:CUT
type: cut
slug: button_mushrooms
name: Button/Cremini Mushrooms
name_sv: Champinjoner
category: vegetables
meat: mushrooms
cut_type: Mushrooms
methods:
- air_fryer
- grill
- oven_roast
- saute
doneness:
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
-->
# Button/Cremini Mushrooms — Cut Overview

## Cut profile

Button mushrooms (*Agaricus bisporus*, immature white form) are roughly 92 % water held in a sponge-like network of chitin-rich fungal cell walls. On a hot grill the surface water flashes off in seconds, the cap caramelises and the mushroom collapses to perhaps two-thirds its raw volume. The grill imparts charred Maillard browning concentrated where the gills or cap touch the bars. Threading mushrooms onto skewers (or using a grill basket) is the only way to keep them from rolling and falling through. Carryover is small but real — about 2–3 °C — because the dehydrated cap insulates the moist interior. Brushing with oil before grilling is essential; mushrooms will stick badly to bare grates.


## Research files by cooking method

- [Air Fryer](./button_mushrooms-air_fryer.md)
- [Grill](./button_mushrooms-grill.md)
- [Oven Roast](./button_mushrooms-oven_roast.md)
- [Sauté](./button_mushrooms-saute.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `button_mushrooms-grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `button_mushrooms-grill.md` copies parent cut profile — rewrite `button_mushrooms-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
