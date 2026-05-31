<!-- KCE:CUT
type: cut
slug: pork_chop
name: Pork Chop
name_sv: Fläskkotlett
category: pork
meat: pig
cut_type: Chops & Tenderloin
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- air_fryer
- grill
- oven_roast
- pan_fry
- pan_sear
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: -3
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 3
-->
# Pork Chop — Cut Overview

## Cut profile

A pork chop is a cross-sectional cut of the pork loin taken from the back of the pig between the shoulder and the leg. Depending on position along the loin, it may be a rib chop (one rib bone, mostly loin muscle), loin chop (between two vertebrae, sometimes with tenderloin attached), or sirloin chop (hip end, irregular shape). Bone-in chops have more flavour and better moisture retention. The lean loin muscle dries rapidly above 68°C; modern food-safety guidelines (USDA 2011, Livsmedelsverket) allow a pull temperature of 63°C (145°F) with a 3-minute rest. Carryover is 3–5°C.


Target internal temperatures (air fryer):
- Juicy/slightly pink: **63–65 °C (145–149 °F)**


## Styckesprofil

En fläskkotlett är ett tvärsnitt av fläskloinen. Sous vide-metod för fläskkotlett: 58–60 °C i 1–4 timmar (beroende på tjocklek), sedan snabb searing i het panna för yta. Ger perfekt jämnt rosa resultat från kant till kant.

Innertemperatur: **58–63 °C (136–145 °F)** för sous vide. Med pasteurisering vid 58 °C hållen i 65 minuter är fläskkotletten helt säker med lätt rosa mitt. USDA-standard: 63 °C, 3 minuters vila. Eftertillagning: försumbar (sous vide). Sond insatt horisontellt in till mitten.

## Research files by cooking method

- [Air Fryer](./pork_chop-air_fryer.md)
- [Grill](./pork_chop-grill.md)
- [Oven Roast](./pork_chop-oven_roast.md)
- [Pan Fry](./pork_chop-pan_fry.md)
- [Pan Sear](./pork_chop-pan_sear.md)
## Quality score

**Score: -3 / 20**

| Criterion | Deduction |
|-----------|-----------|
| Cooking methods not researched | −8 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
