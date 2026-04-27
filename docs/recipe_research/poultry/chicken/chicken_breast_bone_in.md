<!-- KCE:CUT
type: cut
slug: chicken_breast_bone_in
name: Chicken Breast (Bone-in)
category: poultry
meat: chicken
cut_type: Breast
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Chicken Breast (Bone-in) — Cut Overview

## Cut profile

Bone-in, skin-on chicken breast is the largest section of the bird — the split or halved breast — with the sternum, ribs, and sometimes the wishbone still attached, covered by its skin. It is distinct from boneless skinless breast in two important ways: the bone acts as an insulating heat buffer (slowing cooking and helping retain moisture), and the intact skin bastes the meat from above during oven roasting, delivering flavour and protecting the surface from drying.

**Anatomy and structure**: the breast meat is composed almost entirely of the pectoralis major — a large, fast-twitch, nearly pure white muscle with very little connective tissue or intramuscular fat. This lean, low-collagen structure is the reason chicken breast overcooks so easily: there is no collagen to hold moisture at high temperatures, no fat to self-baste, and the fibres seize rapidly once the target temperature is passed. For bone-in breast, the bone and skin both mitigate this fragility: the bone conducts heat from inside the breast while slowing the rate of heat penetration from below; the skin seals the upper surface against evaporative moisture loss.

**Temperature target**: USDA minimum safe temperature for poultry is 74 °C / 165 °F. Unlike beef or pork, there is no culinary tradition for chicken breast that uses a lower temperature (unlike thighs, which are often cooked past safe temp for tenderness) — 74 °C (165 °F) is both the food safety minimum and the culinary pull target. Cooking beyond 77 °C (170 °F) causes noticeable dryness in breast meat. The `safe` doneness band (74–77 °C / 165–170 °F) is the correct coding target.

**Probe placement**: insert the probe horizontally from the thickest end of the breast (the larger end), keeping the tip in the geometric centre of the thickest part of the muscle, parallel to the bone and at least 1 cm away from it. Do not probe through the skin. The probe tip must not rest against the breast bone (sternum), keel, or a rib — bone heats slower and reads false-low. The centre of the thick end of the pectoralis major gives the representative read.

**Comparison with boneless breast**: boneless, skinless breast cooks faster (typically 15–20 min at 220 °C / 425 °F vs. 30–40 min at 190–220 °C for bone-in) but has the same 165 °F internal temperature target. Cook time differences are solely from the thermal insulation of the bone; the pull temperature and doneness criteria are identical.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Oven roast | `chicken_breast_bone_in-oven_roast.md` | ⚠️ In progress — 2 sources (Group B + C), needs A and D |
| Grill | *not yet created* | ⬜ |
| Air fryer | *not yet created* | ⬜ |

## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Culinary Group B tradition covered (oven_roast leaf) | +1 | ✅ Done |
| Culinary Group C tradition covered (oven_roast leaf) | +1 | ✅ Done |
| Oven_roast leaf has source recipes with safe temps | +3 | ✅ Done |
| Culinary preferred temp research present | +4 | ✅ Done |
| Per-method temp research present | +2 | ✅ Done — oven_roast leaf |
| Cooking methods not researched | −8 | pending |
| Missing Culinary Group A tradition | −1 | pending |
| Missing Culinary Group D tradition | −1 | pending |
| No grill leaf | − | pending |
| No air fryer leaf | − | pending |

### Improvement priorities

1. **−8** · Cooking methods not researched — research grill and air fryer methods for bone-in breast; add leaves; then set `cooking_methods_researched: 1`
2. **−2** · Missing Groups A and D — add recipes from Asian and Scandinavian/Slavic traditions to `chicken_breast_bone_in-oven_roast.md`; grill and air_fryer leaves should also cover these traditions

*Score will increase toward ~14/20 once Groups A and D are covered.*
