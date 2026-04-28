<!-- KCE:CUT
type: cut
slug: chicken_leg
name: Chicken Leg / Drumstick
name_sv: Kycklingklubba
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Chicken Leg / Drumstick — Cut Overview

## Cut profile

The chicken leg comprises the thigh (femur bone and surrounding muscle) and the drumstick (tibiotarsus bone and surrounding muscle). In retail, *drumstick* refers specifically to the lower section below the knee joint; *leg quarter* includes the thigh. Both are dark meat, characterised by higher myoglobin content, more intramuscular fat, and significantly more connective tissue (collagen) than breast. This composition makes the leg the most forgiving chicken cut to cook — it does not dry out at safe temperatures, and improves in texture as temperature rises from 165 °F (74 °C) to 175–180 °F (79–82 °C) as collagen converts to gelatin.

The drumstick has a single bone (tibia/fibula) with a club-shaped muscle mass around it. The bone conducts heat and can make the innermost meat near the joint run slightly below the surface temperature. The MEATER probe is inserted from the meaty end along the bone axis, into the largest muscle mass, avoiding the bone itself.


## Styckesprofil

Kycklinglägg består av låret (lårben och omgivande muskel) och trommelstocken (skenben och omgivande muskel). I detaljhandeln avser *trommelstock* specifikt den nedre sektionen nedan knäleden.

Ugnsrostning: 200–220 °C, 35–45 minuter med vändning. Innertemperatur: **74 °C (165 °F)** USDA-minimum (mörk kyckling kräver alltid 74 °C; rosa kött vid benet vid 74 °C är okej pga myoglobin). Eftertillagning: 2–3 °C. Sond längsmed trommelstockens tjockaste del, borta från tibiabenet.

## Research files by cooking method

- [`chicken_leg-oven_roast.md`](chicken_leg-oven_roast.md) — 4 sources: Group A (Swasthi Shreekanth/Indian), Group B (Jessica Gavin/American, BBC Good Food/British), Group D (Natasha's Kitchen/Ukrainian-American counted as Group B in prior assessment)

## Quality score

**Score: 8 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods researched (full survey) | − **NOT DONE** |
| Cut profile written with anatomy | ✓ (fixed 2026-04-27) |
| Oven roast leaf exists with 4 sources | ✓ |
| Grill leaf | − missing |
| Air fryer leaf | − missing |
| Culinary Group A covered | ✓ (oven_roast: Swasthi/Indian) |
| Culinary Group B covered | ✓ (oven_roast: Jessica Gavin, BBC Good Food) |
| Culinary Group C covered | − missing |
| Culinary Group D covered | − missing (Natasha's Kitchen assessed as Group B, no confirmed Group D source) |
| Oven_roast cut profile method-specific | ✓ (fixed 2026-04-27) |

**Deductions**: −8 methods not researched · −1 missing grill leaf · −1 missing air_fryer leaf · −1 Group C · −1 Group D = −12 → 20−12 = **8**

### Improvement priorities

1. **−8** · Cooking methods not researched — survey all cooking methods for chicken legs/drumsticks; update `methods:` list; set `cooking_methods_researched: 1`
2. **−1 each** · Grill and air fryer leaves missing — create `chicken_leg-grill.md` and `chicken_leg-air_fryer.md` with verified sources
3. **−1** · Group C tradition missing — find an African, Arabic, or Caribbean drumstick recipe
4. **−1** · Group D tradition missing — find a Swedish, Polish, Baltic, or Slavic/Ukrainian drumstick recipe

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
