<!-- KCE:CUT
type: cut
slug: bell_peppers
name: Bell Peppers
name_sv: Paprika
category: vegetables
meat: peppers
cut_type: Peppers
methods:
- air_fryer
- grill
- oven_roast
- saute
doneness:
- name: crisp_tender
  target_c: 85
  target_f: 185
  min_c: 80
  min_f: 175
  max_c: 90
  max_f: 195
  usda_safe: true
- name: charred
  target_c: 200
  target_f: 390
  min_c: 175
  min_f: 350
  max_c: 230
  max_f: 450
  usda_safe: true
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Bell Peppers — Cut Overview

## Cut profile

Bell peppers (*Capsicum annuum*) sautéed in strips or rings are one of the most globally versatile vegetable preparations, appearing in Chinese stir-fries, Indian sabzis, Spanish pisto, French ratatouille, Korean bokkeum, and beyond. The sweet, watery flesh softens quickly in a hot, oiled pan; at 180–200 °C contact temperature, the cut surfaces caramelise while the interior remains tender-crisp to soft depending on cooking time. The target internal temperature for a tender-but-intact sauté is 80–88 °C (176–190 °F): at 80–82 °C the strips are tender-crisp (still with a slight bite); at 85–88 °C they are fully softened but hold their shape. A MEATER probe inserted horizontally into the thickest part of a strip (or the wall of a halved pepper) reads representative flesh temperature; carryover is negligible due to the high water content.


## Styckesprofil

Paprika (*Capsicum annuum*) sauterade i strimlor eller ringar är en av de mest globalt mångsidiga grönsaksberedningarna. Sautera i het olja i 8–12 minuter. Klar när mjuka och lätt gyllenbruna med karameliserade kanter.

## Research files by cooking method

- [Air Fryer](./bell_peppers-air_fryer.md)
- [Grill](./bell_peppers-grill.md)
- [Oven Roast](./bell_peppers-oven_roast.md)
- [Sauté](./bell_peppers-saute.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `bell_peppers-saute.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `bell_peppers-saute.md` copies parent cut profile — rewrite `bell_peppers-saute.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
