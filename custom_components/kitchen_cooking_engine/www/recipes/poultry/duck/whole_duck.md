<!-- KCE:CUT
type: cut
slug: whole_duck
name: Whole Duck
name_sv: Hel and
category: poultry
meat: duck
cut_type: Duck
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: leg_rendered
methods:
- oven_roast
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
- name: leg_rendered
  target_c: 82
  target_f: 180
  min_c: 79
  min_f: 175
  max_c: 88
  max_f: 190
  usda_safe: true
  recommended: true
quality_score: -7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 5
-->
# Whole Duck — Cut Overview

## Cut profile

A whole duck presents a significant cooking challenge: the breast meat is best at medium-rare (135–145 °F) while the legs and thighs need higher temperatures (165–175 °F) to break down their tougher connective tissue. This conflict is resolved either by accepting slightly overcooked breast in exchange for properly done legs, or by using a low-and-slow approach that slowly renders the abundant subcutaneous fat while keeping the breast moist. The USDA minimum for whole poultry is 165 °F measured in the thigh. Whole ducks weigh 4–6 lb (1.8–2.7 kg) on average and carry far more fat than chicken — that fat must be rendered out to achieve crackling skin.


Target internal temperature: **165 °F (74 °C) in the thigh** — USDA minimum for whole poultry. Breast will be well-done at this point; accept this or use the low-and-slow method which keeps breast juicier.


## Styckesprofil

En hel anka presenterar en tillagningsutmaning: bröstet är bäst vid 57–63 °C medan benen och låren behöver 74–80 °C. Innertemperatur: 63 °C (mäts i bröstet). Eftertillagning: 4–6 °C. Tillagnings tid: 2–2,5 timmar totalt för en 2–3 kg anka.

## Research files by cooking method

- [Oven Roast](./whole_duck-oven_roast.md)
## Quality score

**Score: -7 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `whole_duck-oven_roast.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Group A, Culinary Group B and Culinary Group C tradition(s) — add Culinary Group A, Culinary Group B and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `whole_duck-oven_roast.md` copies parent cut profile — rewrite `whole_duck-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
