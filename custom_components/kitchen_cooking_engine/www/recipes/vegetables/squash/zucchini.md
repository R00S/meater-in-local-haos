<!-- KCE:CUT
type: cut
slug: zucchini
name: Zucchini
name_sv: Zucchini
category: vegetables
meat: squash
cut_type: Squash
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
- name: tender
  target_c: 95
  target_f: 203
  min_c: 90
  min_f: 195
  max_c: 100
  max_f: 212
  usda_safe: true
  recommended: true
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 1
carryover_temp_c: 1
-->
# Zucchini — Cut Overview

## Cut profile

Zucchini (*Cucurbita pepo* var. *cylindrica*) cut into 1–2 cm rounds, half-moons or spears air-fried at 190–200 °C for 8–12 minutes produces golden, slightly crisp exteriors with tender centres. Because zucchini is mostly water, the air fryer's forced hot air quickly drives off surface moisture to give browning that is difficult to achieve in an oven. Pull temperature: 82–85 °C (180–185 °F) at the thickest piece — at this temperature the flesh is fully tender while still holding its shape. MEATER probe inserted lengthwise into the thickest spear or along the flat face of the largest round.


## Styckesprofil

Zucchini (*Cucurbita pepo* var. *cylindrica*) skuren i 1–2 cm rundlar, halvmånar eller stavar airfryed vid 190–200 °C i 8–12 minuter ger gyllenbrun, lätt knaprig exteriör med mör insida. Klar när gyllenbrun och genomstekt.

## Research files by cooking method

- [Air Fryer](./zucchini-air_fryer.md)
- [Grill](./zucchini-grill.md)
- [Oven Roast](./zucchini-oven_roast.md)
- [Sauté](./zucchini-saute.md)
## Quality score

**Score: -5 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Method file `zucchini-air_fryer.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `zucchini-air_fryer.md` copies parent cut profile — rewrite `zucchini-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
