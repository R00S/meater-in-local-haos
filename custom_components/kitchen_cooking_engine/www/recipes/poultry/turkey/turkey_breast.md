<!-- KCE:CUT
type: cut
slug: turkey_breast
name: Turkey Breast
name_sv: Kalkonfilé
category: poultry
meat: turkey
cut_type: Turkey
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 5
-->
# Turkey Breast — Cut Overview

## Cut profile

Turkey breast can be purchased bone-in (half breast on the rib rack, 1.5–2.5 kg / 3–5.5 lb) or boneless (rolled and tied, 1–2 kg / 2–4.5 lb). Both have dramatically less fat than dark turkey meat and will dry out rapidly if taken past 165 °F (74 °C); the sweet spot for juicy, food-safe turkey breast is **160–165 °F (71–74 °C)** at the thickest point (the USDA minimum is 165 °F; pulling at 160 °F and resting 10–15 minutes under foil achieves safe temperatures via carryover). Bone-in breasts conduct heat more slowly near the bone and need accurate probe placement to the geometric centre of the thickest part. Boneless rolled breasts cook more evenly. At 190–200 °C oven temperature, a 1.5 kg bone-in breast takes approximately 60–75 minutes.


## Styckesprofil

Kalkonbröst kan köpas med ben (halvbröst på revbensstål, 1,5–2,5 kg) eller benfritt (rullat och bundet, 1–2 kg). Båda har dramatiskt lägre fett än mörkt kalkonkött och torkar ut lätt. Ugnsstekning: 160–180 °C i 1,5–2,5 timmar beroende på storlek. Innertemperatur: 74 °C. Eftertillagning: 4–6 °C. Basteras regelbundet.

## Research files by cooking method

- [Oven Roast](./turkey_breast-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `turkey_breast-smoker.md` | −1 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `turkey_breast-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `turkey_breast-smoker.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group A and Culinary Group D tradition(s) — add Culinary Group A and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `turkey_breast-oven_roast.md` copies parent cut profile — rewrite `turkey_breast-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
