<!-- KCE:CUT
type: cut
slug: chicken_thigh
name: Chicken Thigh
name_sv: Kycklinglår
category: poultry
meat: chicken
cut_type: Dark Meat
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- air_fryer
- braise
- grill
- oven_roast
- pan_fry
doneness:
- name: safe
  target_c: 74
  target_f: 165
  min_c: 74
  min_f: 165
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
- name: dark_meat_optimal
  target_c: 77
  target_f: 170
  min_c: 74
  min_f: 165
  max_c: 82
  max_f: 180
  usda_safe: true
  recommended: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 3
-->
# Chicken Thigh — Cut Overview

## Cut profile

Chicken thighs are a forgiving, flavourful dark-meat cut. Their higher fat content makes them well-suited to the air fryer's rapid circulating heat, which renders the fat and crisps the skin beautifully without drying the meat out. Bone-in skin-on thighs take longer than boneless but deliver the crispiest skin. Dark meat benefits from cooking above the USDA minimum to 175 °F (79 °C), where collagen fully converts to gelatin.


Target internal temperature: **165 °F (74 °C)** minimum — **175 °F (79 °C)** preferred for dark meat


## Styckesprofil

Kycklinglår är ett förlåtande, smakramt mörkt köttsnitt. Air fryer: 180–200 °C, 22–28 minuter med vändning halvvägs, ger krisp skinn och saftig insida.

Innertemperatur: **74 °C (165 °F)** USDA-minimum. Eftertillagning: 2–3 °C. Sond längsmed lårets tjockaste del, borta från femurbenet. Vila 5 minuter täckt. Lår tolererar överkokning bättre än bröst — vid 82–85 °C är de fortfarande saftiga, till skillnad från bröst som torkar snabbt ovanför 74 °C.

## Research files by cooking method

- [Air Fryer](./chicken_thigh-air_fryer.md)
- [Grill](./chicken_thigh-grill.md)
- [Oven Roast](./chicken_thigh-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 5 declared) | −2 |
| Missing Culinary Group D tradition | −1 |
| Method file `chicken_thigh-air_fryer.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `chicken_thigh-braise.md`, `chicken_thigh-pan_fry.md`
3. **−1** · Method file `chicken_thigh-air_fryer.md` copies parent cut profile — rewrite `chicken_thigh-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
