<!-- KCE:CUT
type: cut
slug: wild_boar_chop
name: Wild Boar Chop
name_sv: Vildsvinskotlett
category: game
meat: wild_boar
cut_type: Wild Boar
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- grill
- pan_sear
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: -7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 3
-->
# Wild Boar Chop — Cut Overview

## Cut profile

Wild boar (*Sus scrofa*) loin chops (Wildschwein-Koteletts / côtelettes de sanglier) are taken from the back of the animal and include a rib bone, similar to pork chops but with darker, denser meat and a pronounced game aroma. Fat content varies by season — boars shot in autumn carry more fat than those taken in spring. The meat benefits from brief marinades in oil, herbs, and acidic components to tenderise.


Target internal temperature: **70–72 °C (158–162 °F)** for safe consumption of wild-caught pork. Some grillmasters pull at 65 °C for a pink interior.


## Styckesprofil

Vildsvinskotletter (*Sus scrofa*) tas från ryggens bakre del med revbenslben kvar. Köttet är mörkare, tätare och mer viltartat än tamsvins fläsk. Tillagningstid: 4–5 minuter per sida vid medel-hög värme (panna) eller 20–25 minuter i ugn vid 180 °C.

USDA rekommenderar vildfångad vildsvin till 70 °C (160 °F) internt på grund av risk för trikinella. Marinering 24 timmar i rödvin och kryddor mjukar upp den täta muskeln och minskar viltsmaken. Innertemperatur: **70 °C (160 °F)** USDA-minimum. Eftertillagning: 3–4 °C. Sond i tjockaste muskeldelen borta från benet.

## Research files by cooking method

- [Grill](./wild_boar_chop-grill.md)
- [Pan Sear](./wild_boar_chop-pan_sear.md)
## Quality score

**Score: -7 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `wild_boar_chop-grill.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Group A, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group A, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `wild_boar_chop-grill.md` copies parent cut profile — rewrite `wild_boar_chop-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
