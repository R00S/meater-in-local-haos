<!-- KCE:CUT
type: cut
slug: duck_leg_confit
name: Duck Leg Confit
name_sv: Andlår confit
category: poultry
meat: duck
cut_type: Duck
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- oven_roast
doneness:
- name: confit
  target_c: 88
  target_f: 190
  min_c: 85
  min_f: 185
  max_c: 93
  max_f: 200
  usda_safe: true
  recommended: true
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 3
-->
# Duck Leg Confit — Cut Overview

## Cut profile

Duck leg confit (_confit de canard_) refers specifically to the bone-in, skin-on duck leg (thigh + drumstick, known as the *maryland* cut in Australia) prepared by the traditional French confit method: a preliminary dry cure followed by very slow cooking fully submerged in rendered duck fat at low oven temperature. This preparation has its origins in the Gascony and Périgord regions of south-western France, where it was developed as a preservation technique before refrigeration.

**Anatomy and structure**: the duck leg is composed of the thigh and drumstick. The thigh (haut de cuisse) contains the femur with a thick cap of densely worked muscle — primarily the *biceps femoris* and *semitendinosus* — bound by dense sheets of collagen and layered with intramuscular fat. The drumstick (pilon) is thinner, with a tightly wound fibrous muscle structure around the tibia and fibula. Both sections are heavily exercised muscles with high collagen content and significant intramuscular and subcutaneous fat. Raw, the meat is deep red-brown, dense, and would be tough if cooked quickly.

**Why confit works on this cut**: at the slow-cook temperature of 85–100 °C, the collagen in the connective tissue hydrolyses into gelatin over 3–8 hours, the intramuscular fat renders, and the subcutaneous skin softens into a supple, fat-saturated layer ready to be crisped at high heat. The fat bath maintains even moisture (no drying) and acts as a heat-transfer medium and flavour carrier. The result — meltingly tender, pull-apart meat with crackling skin — is not achievable by any faster dry-heat method: the skin would char before the collagen dissolved.

**Skin crisping step**: confit requires a two-phase oven process. Phase 1 (the confit) runs at 85–100 °C / 185–210 °F for 3–8 hours submerged in fat; the duck emerges pale and flabby-skinned but fully cooked and ultra-tender. Phase 2 runs at 220–240 °C / 430–465 °F for 15–40 minutes with the duck on a rack; this desiccates the subcutaneous fat and crisps the skin to a golden crackle.

**Probe placement**: insert the probe from the thick cut end of the thigh, pushing the tip toward the geometric centre of the thigh muscle. The tip must be in the lean muscle, not resting against the femur or in a fat pocket. Do not probe the drumstick — it is thinner and will equilibrate faster, giving a false-high reading for the thigh. Insert the probe before the duck goes into the fat bath.

## Styckesprofil

Anklägg confit (*confit de canard*) avser specifikt anklägg med ben och skinn (lår + trumpinne, känd som *maryland*-snittet i Australien) tillagad med den traditionella franska confit-metoden. Innertemperatur: 82–85 °C. Confit-beredda anklägg är sedan krispiga i het panna eller ugn vid 220 °C i 15 minuter för knaprig skinnyta.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Oven roast (confit) | `duck_leg_confit-oven_roast.md` | ⚠️ In progress — 2 Group B sources, needs A/C/D |

## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Culinary Group B tradition covered (oven_roast leaf) | +1 | ✅ Done |
| Oven_roast leaf has source recipes with safe temps | +3 | ✅ Done |
| Culinary preferred temp research present | +4 | ✅ Done |
| Per-method temp research present | +2 | ✅ Done — oven_roast leaf |
| Cooking methods not researched | −8 | pending |
| Missing Culinary Group A tradition | −1 | pending |
| Missing Culinary Group C tradition | −1 | pending |
| Missing Culinary Group D tradition | −1 | pending |

### Improvement priorities

1. **−8** · Cooking methods not researched — research whether methods beyond `oven_roast` (e.g. air fryer confit, sous vide confit) have credible recipes; if so add them to `cooking_data.py` and create leaf files; then set `cooking_methods_researched: 1`
2. **−3** · Missing Groups A, C, D — add source recipes from Asian, African/Arab, and Scandinavian/Slavic traditions to `duck_leg_confit-oven_roast.md`; note that duck confit is a French technique with limited direct equivalents outside Group B

*Score will increase toward ~15/20 once the three missing culinary tradition groups are researched.*
