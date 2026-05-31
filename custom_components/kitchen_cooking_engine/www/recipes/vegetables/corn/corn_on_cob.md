<!-- KCE:CUT
type: cut
slug: corn_on_cob
name: Corn on the Cob
name_sv: Majskolv
category: vegetables
meat: corn
cut_type: Corn
methods:
- air_fryer
- boil
- grill
- oven_roast
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
- name: charred
  target_c: 200
  target_f: 390
  min_c: 175
  min_f: 350
  max_c: 230
  max_f: 450
  usda_safe: true
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 1
-->
# Corn on the Cob — Cut Overview

## Cut profile

Corn on the cob (*Zea mays*) boiled is the simplest and most globally common cooking method, used in North America, Mexico, Peru, Japan, India, China, and Africa. Boiling achieves even cooking from all sides simultaneously, and the hot water transfers heat efficiently into the dense cob structure. The debate between "boil to order" (3–5 minutes for very fresh corn) vs. "bring to a boil then leave" (5–10 minutes for slightly older corn) hinges on the age of the corn — as the sugars in the kernels convert to starch over time. Internal kernel temperature (at the cob interface) of fully boiled corn: 88–95 °C (190–203 °F). A MEATER probe inserted through the kernels into the cob core monitors this; since the water temperature is ≈ 100 °C, the probe prevents overcooking by showing exactly when the kernel temperature has risen high enough.


## Styckesprofil

Majs på kolven (*Zea mays*) kokt är den enklaste och mest globalt vanliga tillagningsmetoden. Kokning uppnår jämn värmedistribution som mjukar alla kärnor på en gång. Koka i osaltat vatten 5–8 minuter. Klar när kärnorna är mjuka och söta.

## Research files by cooking method

- [Air Fryer](./corn_on_cob-air_fryer.md)
- [Boil](./corn_on_cob-boil.md)
- [Grill](./corn_on_cob-grill.md)
- [Oven Roast](./corn_on_cob-oven_roast.md)
- [Steam](./corn_on_cob-steam.md)
## Quality score

**Score: -5 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Cut profile lacks anatomy | −1 |
| Method file `corn_on_cob-boil.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `corn_on_cob-boil.md` copies parent cut profile — rewrite `corn_on_cob-boil.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
