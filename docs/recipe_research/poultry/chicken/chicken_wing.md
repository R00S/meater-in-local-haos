<!-- KCE:CUT
type: cut
slug: chicken_wing
name: Chicken Wing
name_sv: Kycklingvinge
category: poultry
meat: chicken
cut_type: Dark Meat
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
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
- name: dark_meat_optimal
  target_c: 77
  target_f: 170
  min_c: 74
  min_f: 165
  max_c: 82
  max_f: 180
  usda_safe: true
  recommended: true
quality_score: 11
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Chicken Wing — Cut Overview

## Cut profile

Chicken wings consist of three sections: the drumette (the single-bone upper section, anatomically the humerus), the flat/wingette (the two-bone middle section, radius and ulna), and the tip (the distal cartilaginous section with no significant meat). In retail, wings are sold whole or already split into drumettes and flats ("party wings"); tips are typically discarded or used for stock. The meat is dark meat, meaning higher myoglobin content, more intramuscular fat, and more connective tissue than white-meat breast. This dark-meat composition makes wings highly forgiving at the grill — they do not dry out as quickly as breast — and explains why they respond well to high-heat methods (grill, air fryer, oven at 220°C+) that render the fat under the skin and promote Maillard browning. The high skin-to-meat ratio is the defining structural feature: wings have more skin per gram of meat than any other chicken part, making the quality of the skin the primary determinant of the eating experience.

Because dark-meat chicken is safe at 165 °F (74 °C) but more palatable (less chewy, more tender) at 170–175 °F (77–79 °C), most cooks target the upper end of the safe range. The thin bones conduct heat quickly; carryover is minimal (1–2 °C).


## Research files by cooking method

- [`chicken_wing-air_fryer.md`](chicken_wing-air_fryer.md) — 4 sources: Group A (Pailin/Thai), Group B (Natasha's Kitchen/USA, Skinnytaste/USA), Group C (Immaculate Bites/Cameroonian)
- [`chicken_wing-grill.md`](chicken_wing-grill.md) — 2 sources, in-progress: Group B (Taste of Home/USA), Group C (Immaculate Bites/Cameroonian)
- [`chicken_wing-oven_roast.md`](chicken_wing-oven_roast.md) — 1 source, in-progress: Group B (Taste of Home/USA)
## Quality score

**Score: 11 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods researched (full survey) | − **NOT DONE** — methods list inherited from placeholder, not verified |
| Cut profile written with anatomy | ✓ (fixed 2026-04-27) |
| Air fryer leaf exists with 4 sources | ✓ |
| Grill leaf exists (in-progress) | ✓ (2 sources, Group D missing) |
| Oven roast leaf exists (in-progress) | ✓ (1 source, Groups A/C/D missing) |
| Culinary Group A covered | ✓ (air fryer: Pailin/Thai) |
| Culinary Group B covered | ✓ (air fryer: Natasha's Kitchen, Skinnytaste; grill: Taste of Home; oven: Taste of Home) |
| Culinary Group C covered | ✓ (air fryer: Immaculate Bites; grill: Immaculate Bites) |
| Culinary Group D covered | − missing from all leaves |

**Deductions**: −8 methods not researched · −1 Group D missing = −9 total → 20−9 = **11**

### Improvement priorities

1. **−8** · Cooking methods not researched — do a proper survey of all cooking methods for chicken wings; update `methods:` list and set `cooking_methods_researched: 1` only after that survey
2. **−1** · Group D tradition missing — find Swedish, Polish, Baltic or Slavic/Ukrainian chicken wing recipe; add to any leaf file (air_fryer, grill, or oven_roast)
3. **grill leaf in-progress** — add Group A and Group D sources to reach 4+ sources
4. **oven_roast leaf in-progress** — add Groups A, C, D sources to reach 4+ sources

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
