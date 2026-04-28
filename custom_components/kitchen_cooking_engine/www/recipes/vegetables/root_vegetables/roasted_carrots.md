<!-- KCE:CUT
type: cut
slug: roasted_carrots
name: Roasted Carrots
name_sv: Rostade morötter
category: vegetables
meat: root_vegetables
cut_type: Root Vegetables
methods:
- air_fryer
- oven_roast
- saute
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
rest_time_max: 2
carryover_temp_c: 1
-->
# Roasted Carrots — Cut Overview

## Cut profile

Carrots (*Daucus carota*) sautéed in a hot pan — whether as Chinese stir-fried matchsticks, Japanese *kimpira gobo*-style glazed rounds, Indian tempering with spices, or French *carottes glacées* — develop a sweet, lightly caramelised character while retaining their structural texture. Carrots should be cut thinly (coins, matchsticks, julienne) for sautéing — 3–5 mm thick — so the centre cooks through before the surface over-colours. Pull temperature: 82–88 °C (180–190 °F) for tender-crisp glazed carrots. MEATER probe inserted along the long axis of the thickest piece (or into the densest pile).


## Styckesprofil

Morötter (*Daucus carota*) sauterade i het panna — kinesiska wokade matchsticks, japanska *kimpira gobo*-glassade rundlar, indisk tempering eller franska *carottes glacées* — ger karameliserade, söta morötter. Sautera i 6–10 minuter. Klar när gyllenbrun och genomstekt.

## Research files by cooking method

- [Air Fryer](./roasted_carrots-air_fryer.md)
- [Oven Roast](./roasted_carrots-oven_roast.md)
- [Sauté](./roasted_carrots-saute.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `roasted_carrots-saute.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `roasted_carrots-saute.md` copies parent cut profile — rewrite `roasted_carrots-saute.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
