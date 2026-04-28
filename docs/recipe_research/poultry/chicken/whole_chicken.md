<!-- KCE:CUT
type: cut
slug: whole_chicken
name: Whole Chicken
name_sv: Hel kyckling
category: poultry
meat: chicken
cut_type: Whole
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: thigh_optimal
methods:
- air_fryer
- grill
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
- name: thigh_optimal
  target_c: 79
  target_f: 175
  min_c: 77
  min_f: 170
  max_c: 85
  max_f: 185
  usda_safe: true
  recommended: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Whole Chicken — Cut Overview

## Cut profile

A whole chicken is a complete bird — comprising breast meat (white, lean *pectoralis major*), thighs (*biceps femoris* and surrounding dark meat), drumsticks, wings, and the backbone, all connected by skin. The fundamental cooking challenge with a whole bird is the simultaneous presence of two very different muscle types: white breast meat, which dries out if taken above 165 °F (74 °C), and dark thigh/drumstick meat, which benefits from reaching 170–175 °F (77–79 °C) to convert collagen to gelatin. The temperature differential between breast and thigh at the moment of pulling is typically 5–15 °C.

Techniques to manage this differential include: starting the bird breast-side down, trussing to compact the bird and slow the breast, using a high-temperature start to colour the skin before reducing heat, and inserting the probe into the thigh (the slowest-cooking part) rather than the breast. Carryover for a whole 1.5–2 kg bird is 4–7 °C in the breast and 3–5 °C in the thigh.


## Styckesprofil

En hel kyckling är en komplett fågel — bestående av bröstködet (vitt, magert *pectoralis major*), låren (*biceps femoris* och omgivande mörkt kött), trumpinnarna, vingarna och ryggraden, alla förbundna av skinn. Innertemperatur: 74 °C (bröst), 80 °C (lår). Eftertillagning: 4–6 °C.

## Research files by cooking method

- [`whole_chicken-oven_roast.md`](whole_chicken-oven_roast.md) — 4 sources: Group B (Jessica Gavin/American, BBC Good Food/British, Natasha's Kitchen/Ukrainian-American counted as Group B), Group C (Suzy Karadsheh/Egyptian)

## Quality score

**Score: 8 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods researched (full survey) | − **NOT DONE** |
| Cut profile written with anatomy | ✓ (fixed 2026-04-27) |
| Oven roast leaf exists with 4 sources | ✓ |
| Air fryer leaf | − missing |
| Grill leaf | − missing |
| Culinary Group A covered | − missing |
| Culinary Group B covered | ✓ (Jessica Gavin, BBC Good Food) |
| Culinary Group C covered | ✓ (Suzy Karadsheh/Egyptian) |
| Culinary Group D covered | − missing (Natasha's Kitchen assessed as Group B) |
| Oven_roast cut profile method-specific | ✓ (fixed 2026-04-27) |

**Deductions**: −8 methods · −1 missing air_fryer · −1 missing grill · −1 Group A · −1 Group D = −12 → 20−12 = **8**

### Improvement priorities

1. **−8** · Cooking methods not researched — survey all methods for whole chicken; update `methods:` list; set `cooking_methods_researched: 1`
2. **−1 each** · Air fryer and grill leaves missing — create with verified sources
3. **−1** · Group A tradition missing — find a Chinese, Japanese, Korean, or Indian whole-chicken recipe
4. **−1** · Group D tradition missing — find a Swedish, Polish, Baltic, or Slavic whole-chicken recipe

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
