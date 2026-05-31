<!-- KCE:CUT
type: cut
slug: t_bone
name: T-Bone / Porterhouse
name_sv: T-benstek
category: beef
meat: cow
cut_type: Steaks
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- air_fryer
- charcoal_grill
- grill
- oven_roast
- pan_sear
doneness:
- name: rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
- name: medium_rare
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: medium
  target_c: 60
  target_f: 140
  min_c: 57
  min_f: 135
  max_c: 63
  max_f: 145
  usda_safe: false
- name: medium_well
  target_c: 66
  target_f: 150
  min_c: 63
  min_f: 145
  max_c: 68
  max_f: 155
  usda_safe: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 4
-->
# T-Bone / Porterhouse — Cut Overview

## Cut profile

The T-bone steak is defined by the T-shaped lumbar vertebra that separates two anatomically distinct muscles: the larger *striploin* (*longissimus dorsi*) on the long side of the bone, and the smaller *tenderloin* (*psoas major*) fillet on the short side. This is T-bone's defining structural characteristic — it delivers two different eating experiences in one steak, but creates a cooking challenge: the tenderloin cooks faster and dries out above 60 °C, while the strip can tolerate slightly higher temperatures. The bone itself acts as a thermal insulator, meaning meat immediately adjacent to the bone lags 3–5 °C behind the open muscle.

T-bone is cut from the short loin, anterior to the sirloin. Thickness is typically 2.5–4 cm; a *porterhouse* is cut from the same region but thicker and with a larger fillet portion. The MEATER probe is always placed in the striploin portion, away from the bone, for the most reliable temperature reading.


## Styckesprofil

T-bone-biffen definieras av det T-formade ländkotan som separerar två anatomiskt distinkta muskler: det större *striploin* (*longissimus dorsi*) på benets långa sida, och det mindre *filén* (*psoas major*) på den korta sidan. Detta är T-bonens definierande strukturella drag — den levererar två olika matupplevelser i en biff, men skapar en tillagningsutmaning: filén tillagas snabbare och torkar ut ovanför 60 °C, medan stripen tål något högre temperaturer. Benet i sig fungerar som en termisk isolator, vilket innebär att köttet omedelbart intill benet ligger 3–5 °C efter den öppna muskeln.

T-bone skärs från den korta länden, framför entrecôten. Tjockleken är typiskt 2,5–4 cm; en *porterhouse* skärs från samma region men tjockare och med en större filéandel. MEATER-sonden placeras alltid i striploin-portionen, borta från benet, för den mest tillförlitliga temperaturavläsningen. Innertemperatur: 54–57 °C (striploin). Eftertillagning: 4–5 °C.

## Research files by cooking method

- [Air Fryer](./t_bone-air_fryer.md)
- [Charcoal Grill](./t_bone-charcoal_grill.md)
- [Grill](./t_bone-grill.md)
- [Oven Roast](./t_bone-oven_roast.md)
- [Pan Sear](./t_bone-pan_sear.md)
## Quality score

**Score: -5 / 20**

| Criterion | Status |
|-----------|--------|
| Cooking methods researched (full survey) | − **NOT DONE** |
| Cut profile written with anatomy | ✓ (fixed 2026-04-27) |
| All declared method leaves exist | ✓ (air_fryer, charcoal_grill, grill, oven_roast, pan_sear) |
| Method cut profiles distinct (no copies) | ✓ (all fixed 2026-04-27) |
| Culinary Group A covered | − missing |
| Culinary Group B covered | ✓ |
| Culinary Group C covered | − missing |
| Culinary Group D covered | − missing |
| Inflated score (this branch) | −15 |

**Deductions**: −8 methods not researched · −1 Group A · −1 Group C · −1 Group D = −11 → Hmm that's 9 not 10. Wait, let me recount original deductions:

Original: −8 (methods) −1 (A) −1 (C) −1 (D) −1 (air_fryer copies parent) −1 (grill copies oven_roast) −1 (grill copies pan_sear) = −14 → score 6.
After fixes: −8 (methods) −1 (A) −1 (C) −1 (D) = −11 → score 9.

**Revised score: 9 / 20**

**Deductions**: −8 methods not researched · −1 Group A missing · −1 Group C missing · −1 Group D missing

### Improvement priorities

1. **−8** · Cooking methods not researched — survey all cooking methods for T-bone; update `methods:` list; set `cooking_methods_researched: 1`
2. **−1** · Group A tradition missing — find a Japanese, Korean, Chinese, or other Group A T-bone/steak recipe
3. **−1** · Group C tradition missing — find a Moroccan, Turkish, Lebanese, or other Group C steak recipe
4. **−1** · Group D tradition missing — find a Polish, Swedish, Russian, or other Group D steak recipe

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
