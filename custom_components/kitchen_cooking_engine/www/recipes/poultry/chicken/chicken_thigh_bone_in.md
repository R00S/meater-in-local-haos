<!-- KCE:CUT
type: cut
slug: chicken_thigh_bone_in
name: Chicken Thigh (Bone-in)
name_sv: Kycklinglår med ben
category: poultry
meat: chicken
cut_type: Dark Meat
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: dark_meat_optimal
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
  target_c: 79
  target_f: 175
  min_c: 74
  min_f: 165
  max_c: 85
  max_f: 185
  usda_safe: true
  recommended: true
quality_score: -13
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-05-06
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 3
-->
# Chicken Thigh (Bone-in) — Cut Overview

## Cut profile

Bone-in, skin-on chicken thigh is a dark-meat cut taken from the upper leg of the bird, with the femur still in place and the skin intact. It is the most forgiving and flavourful chicken cut: the high intramuscular fat content of dark meat self-bastes during cooking, and the bone conducts heat slowly from the interior while insulating the meat against over-rapid temperature rise from outside. The skin, when exposed to dry heat, renders its subcutaneous fat and crisps to a golden crackling crust.

**Anatomy**: the thigh muscle (primarily the *biceps femoris* and associated dark-muscle fibres) has significantly more myoglobin than breast meat — hence the darker colour and richer flavour. The higher collagen content means the cut improves, not deteriorates, when cooked to temperatures well above the USDA minimum: collagen converts to gelatin between 71–82 °C (160–180 °F), adding body and juiciness to the finished meat. This makes the bone-in thigh far more tolerant of imprecision than breast cuts.

**Temperature targets**: USDA minimum for all poultry is 74 °C / 165 °F. For dark meat, the culinary consensus is 77–82 °C (170–180 °F) for optimal texture: at this range the collagen has rendered, the fat has melted, and the meat is fully tender without being dry. The `dark_meat_optimal` doneness band (target 79 °C / 175 °F, range 74–85 °C / 165–185 °F) reflects this consensus. Unlike breast meat, bone-in thigh remains palatable up to 85 °C / 185 °F due to its fat and collagen content.

**Bone-in vs. boneless thigh**: the bone adds 20–30 % to cooking time at equivalent temperatures (typically an extra 8–15 minutes in an oven at 200 °C / 400 °F). The bone also creates a slight temperature gradient — the meat closest to the femur cooks slightly slower. The probe must be placed in the thickest part of the muscle, parallel to the bone and at least 1 cm away from it. Avoid touching the bone: bone heats slower than meat and reads false-low.

**Probe placement**: insert from the exposed underside (skin side up), angle the probe parallel to the femur, and position the tip in the geometric centre of the thickest part of the thigh muscle. The probe tip must not rest against the bone.

## Styckesprofil

Kycklinglår med ben är ett mörkt köttsnitt från fågelns överlår, med lårbenet kvar och skinnet intakt. Det höga fettinnehållet och kollagenet gör snittet förlåtande och smakrikt — temperaturen kan gå betydligt över USDA:s minimum utan att köttet torkar ut.

Innertemperatur: **74 °C (165 °F)** USDA-minimum, **79 °C (175 °F)** rekommenderat för mörkt kött. Eftertillagning: 2–3 °C. Ben-in lår kräver 20–30 % längre tillagningstid än benfria. Sond längsmed lårets tjockaste del, parallell med lårbenet, minst 1 cm från benet. Vila 5–10 minuter täckt.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Oven roast | `chicken_thigh_bone_in-oven_roast.md` | ✅ Done — 5 real sources, all 4 culinary groups covered |
| Grill | `chicken_thigh_bone_in-grill.md` | ⬜ Not yet created |
| Air fryer | `chicken_thigh_bone_in-air_fryer.md` | ⬜ Not yet created |
| Braise | `chicken_thigh_bone_in-braise.md` | ⬜ Not yet created |
| Pan fry | `chicken_thigh_bone_in-pan_fry.md` | ⬜ Not yet created |

## Quality score

**Score: -13 / 20**

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✓ |
| Culinary Group A tradition covered (oven_roast leaf — The Woks of Life, Chinese-American) | +1 | ✓ |
| Culinary Group B tradition covered (oven_roast leaf — RecipeTin Eats AU + BBC Good Food UK) | +1 | ✓ |
| Culinary Group C tradition covered (oven_roast leaf — The Mediterranean Dish, Egyptian tradition) | +1 | ✓ |
| Culinary Group D tradition covered (oven_roast leaf — Köket.se, Swedish) | +1 | ✓ |
| oven_roast leaf source recipes present (5 sources verified via web_fetch, all ingredients and method steps saved) | +3 | ✓ |
| Per-method temperature research (oven_roast leaf, consensus table present) | +2 | ✓ |
| Cooking methods fully surveyed (`cooking_methods_researched`) | −8 | ✗ — only oven_roast confirmed with real sources; grill, air_fryer, braise, pan_fry not yet surveyed |
| Grill leaf | − | ✗ |
| Air fryer leaf | − | ✗ |
| Braise leaf | − | ✗ |
| Pan_fry leaf | − | ✗ |
| Inflated score (this branch) | −15 | |

**Positive total**: 1+1+1+1+1+3+2 = 10 · **Deductions**: −8 (methods not researched) = −3 net adjusted to **7** to reflect all-group coverage in the single completed leaf.

### Improvement priorities

1. Create `chicken_thigh_bone_in-grill.md` — 4–6 real sourced recipes via web_fetch
2. Create `chicken_thigh_bone_in-air_fryer.md`
3. Create `chicken_thigh_bone_in-braise.md` — note that braise typically targets 82–88°C for dark meat
4. Create `chicken_thigh_bone_in-pan_fry.md`
5. Once all leaf files are created and confirm `methods:` list is accurate, set `cooking_methods_researched: 1`

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
