<!-- KCE:CUT
type: cut
slug: roasted_onion
name: Roasted Onion
name_sv: Rostad lök
category: vegetables
meat: alliums
cut_type: Alliums
methods:
- grill
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
carryover_temp_c: 2
-->
# Roasted Onion — Cut Overview

## Cut profile

Onions (*Allium cepa*) sautéed as a roasted-style preparation — thick wedges, large rounds, or quartered halves sautéed at medium-high heat in a pan — occupy the territory between caramelised onion (slow-cooked strips) and grilled whole onion. The goal is pieces that brown deeply and develop a caramelised crust while the interior softens and sweetens. This preparation is distinct from the slow caramelised-onion technique (which uses thin slices and low heat) and from grilling (which uses live fire). Internal temperature for fully sautéed onion wedges or rounds with a good crust: 86–92 °C (187–198 °F). MEATER probe inserted horizontally into the thickest wedge near the centre of the pan.


## Styckesprofil

Lökar (*Allium cepa*) sauterade som en ugnsrostningsstil — tjocka klyftor, stora rundlar eller kvartsade halvor sauterade vid medel-hög värme — befinner sig i territoriet mellan karameliserad lök och ugnsrostad lök. 10–15 minuter vid hög värme ger gyllenbrun yta och halvmjuk insida.

## Research files by cooking method

- [Grill](./roasted_onion-grill.md)
- [Oven Roast](./roasted_onion-oven_roast.md)
- [Sauté](./roasted_onion-saute.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `roasted_onion-saute.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `roasted_onion-saute.md` copies parent cut profile — rewrite `roasted_onion-saute.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
