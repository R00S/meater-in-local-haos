<!-- KCE:CUT
type: cut
slug: whole_turkey
name: Whole Turkey
name_sv: Hel kalkon
category: poultry
meat: turkey
cut_type: Turkey
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: thigh_optimal
methods:
- oven_roast
- smoker
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
- name: thigh_optimal
  target_c: 77
  target_f: 170
  min_c: 74
  min_f: 165
  max_c: 82
  max_f: 180
  usda_safe: true
  recommended: true
quality_score: -7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 20
rest_time_max: 45
carryover_temp_c: 8
-->
# Whole Turkey — Cut Overview

## Cut profile

A whole turkey presents the same fundamental challenge as a whole chicken but at larger scale and with more extreme differences between breast and leg/thigh: the breast meat is lean and prone to drying above 160–165 °F (71–74 °C), while the legs and thighs are dark, collagen-rich and benefit from 165–175 °F (74–79 °C) to become properly tender. A 4.5 kg / 10 lb turkey feeds 6–8 people; a 7 kg / 15 lb turkey feeds 10–12. The USDA minimum for whole turkey is **165 °F (74 °C)** measured in the thigh at its thickest point, well away from bone. Probe placement in the thigh (not the breast) is the authoritative food-safety measurement. Modern approaches — brining, spatchcocking, basting — all aim to let the thigh reach 165 °F without pushing the breast past 165 °F.

Typical roasting time at 190 °C (375 °F): ~13–15 minutes per 450 g (1 lb) unstuffed. A 4.5 kg (10 lb) bird takes approximately 2.5–3 hours; a 7 kg (15 lb) bird takes approximately 3.5–4 hours.


A whole turkey presents the same fundamental challenge as a whole chicken but at larger scale and with more extreme differences between breast and leg/thigh: the breast meat is lean and prone to drying above 160–165 °F (71–74 °C), while the legs and thighs are dark, collagen-rich and benefit from 165–175 °F (74–79 °C) to become properly tender. A 4.5 kg / 10 lb turkey feeds 6–8 people; a 7 kg / 15 lb turkey feeds 10–12. The USDA minimum for whole turkey is **165 °F (74 °C)** measured in the thigh at its thickest point, well away from bone. Probe placement in the thigh (not the breast) is the authoritative food-safety measurement. Modern approaches — brining, spatchcocking, basting — all aim to let the thigh reach 165 °F without pushing the breast past 165 °F.
Typical roasting time at 190 °C (375 °F): ~13–15 minutes per 450 g (1 lb) unstuffed. A 4.5 kg (10 lb) bird takes approximately 2.5–3 hours; a 7 kg (15 lb) bird takes approximately 3.5–4 hours.


## Styckesprofil

En hel kalkon presenterar samma utmaning som hel kyckling men i stor skala. Innertemperatur: 74 °C (bröst), 80 °C (lår). Eftertillagning: 6–10 °C. Tillaga alltid med bröstsidan ned de första 2 timmarna för saftigare bröst; vänd sedan.

## Research files by cooking method

- [Oven Roast](./whole_turkey-oven_roast.md)
## Quality score

**Score: -7 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `whole_turkey-smoker.md` | −1 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `whole_turkey-smoker.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−3** · Missing Culinary Group A, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group A, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
