<!-- KCE:CUT
type: cut
slug: roasted_tomatoes
name: Roasted Tomatoes
name_sv: Rostade tomater
category: vegetables
meat: tomatoes
cut_type: Tomatoes
methods:
- air_fryer
- oven_broil
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Roasted Tomatoes — Cut Overview

## Cut profile

Tomatoes (*Solanum lycopersicum*) in the air fryer roast in 8–15 minutes depending on size and target: cherry tomatoes burst and caramelise in 8–10 minutes at 200 °C; halved plum tomatoes take 12–15 minutes to collapse and blister. The circulating air dehydrates the surface faster than a conventional oven, producing crisper, slightly wrinkled edges with concentrated sweetness. Air-fried tomatoes are particularly useful as fast toppings for pasta, pizza, bruschetta, or eggs. Pull temperature for burst cherry tomatoes (serving as-is) is 82–88 °C (180–190 °F); for halved plum tomatoes intended as a sauce base, 88–95 °C (190–203 °F). A MEATER probe is most practical in a larger tomato; for cherry tomatoes, rely on appearance (bursting, blistered) and time, or insert in the largest specimen. Carryover is negligible.


## Research files by cooking method

- [Air Fryer](./roasted_tomatoes-air_fryer.md)
- [Oven Roast](./roasted_tomatoes-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `roasted_tomatoes-oven_broil.md` | −1 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `roasted_tomatoes-air_fryer.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `roasted_tomatoes-oven_broil.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `roasted_tomatoes-air_fryer.md` copies parent cut profile — rewrite `roasted_tomatoes-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
