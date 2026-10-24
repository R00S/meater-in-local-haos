<!-- KCE:CUT
type: cut
slug: chicken_thigh_bone_in
name: Chicken Thigh (Bone-in)
name_sv: Kycklinglår med ben
name_da: Kyllingeoverlår med ben
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
- pressure_cooker
- slow_cooker
- smoker
- sous_vide
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
quality_score: 5
cooking_methods_researched: 0 # Cross-tradition survey done 2026-10-24 (4 methods discovered and added), but enum inventory still has credible-but-uncollected leads (simmer/boil/charcoal_grill) — stays 0 until those are collected or cleanly ruled out.
quality_assessed: 2026-10-24
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
| Grill | `chicken_thigh_bone_in-grill.md` | ⚠️ Partial — 3 fetched sources (US barbecue 160 °F, Indian tandoori, Greek 165 °F) |
| Air fryer | `chicken_thigh_bone_in-air_fryer.md` | ✅ Done — 4 fetched sources (Moroccan, Japanese, UK, Indian tandoori); endpoints 165–195 °F |
| Braise | `chicken_thigh_bone_in-braise.md` | ✅ Done — 4 fetched sources (French, Korean, Jamaican, Senegalese); 175 °F thigh preference stated |
| Pan fry | `chicken_thigh_bone_in-pan_fry.md` | ⚠️ Partial — 3 fetched sources (Chinese-American, American, Russian) |
| Smoker | `chicken_thigh_bone_in-smoker.md` | ⚠️ Partial — 1 fetched source (US barbecue); 165 → 170–175 °F two-stage endpoint |
| Slow cooker | `chicken_thigh_bone_in-slow_cooker.md` | ⚠️ Partial — 1 fetched source (Korean); no stated temperature |
| Pressure cooker | `chicken_thigh_bone_in-pressure_cooker.md` | ⚠️ Partial — 1 fetched source (Korean); no stated temperature |
| Sous vide | `chicken_thigh_bone_in-sous_vide.md` | ⚠️ Partial — 1 fetched source (US); 66–74 °C bath chart |

## Quality score

**Score: 5 / 20** — assessed 2026-10-24. From-scratch reassessment per
`HOW_I_INFLATE_CUT_FILES_SCORES_AND_WHY.md` (deduction scale from
`RECIPE_COLLECTION_TOR.md`); deliberately **not** anchored to the previous 7
(Pattern 9 — score momentum). The old table used a +points scheme and a manual
"net adjusted to 7" fudge that the deduction scale does not support.

| Criterion | Deduction | Evidence |
|-----------|-----------|----------|
| Cooking methods not researched (`cooking_methods_researched: 0`) | −8 | Deliberate cross-tradition survey WAS done 2026-10-24 and found 4 methods beyond the declared list (smoker, slow_cooker, pressure_cooker, sous_vide — all added with leaves), but the enum inventory is not complete: credible-but-uncollected leads remain (simmer/boil — bone-in thigh soups such as tinola, sinigang na manok; charcoal_grill variants). Field stays 0 until those are collected or cleanly ruled out (same treatment as the herring cut). |
| Partial method leaves (< 4 fetched sources): pan_fry (3), grill (3), smoker (1), slow_cooker (1), pressure_cooker (1), sous_vide (1) | −6 | −1 per partial leaf (branch convention). air_fryer (4 sources) and braise (4 sources) meet the collection gate. |
| pan_fry source-tradition overlap | −1 | Two US-based sources (Made With Lau, Chinese-American; Cooked by Julie, American) can be read as one national tradition. |

**Total deduction −15 → 5/20.** Criteria checked with evidence and receiving **0 deduction**:

- **Culinary Groups A/B/C/D all covered** across the method leaves — A: Chinese-American (pan_fry), Japanese (air_fryer), Indian (air_fryer, grill), Korean (braise, slow_cooker, pressure_cooker); B: American (pan_fry, grill, sous_vide, smoker), UK (air_fryer), French (braise), Greek (grill); C: Moroccan (air_fryer), Jamaican (braise), Senegalese (braise); D: Russian (pan_fry).
- `## Cut profile` present with anatomical placement (femur, biceps femoris, myoglobin/collagen, subcutaneous fat).
- Method leaf files exist — 9 of them (oven_roast plus 8 created 2026-10-24).
- **USDA safe temperature supported by research evidence** — explicit 165 °F / 74 °C endpoints in pan_fry (×2), air_fryer, grill, braise, smoker and oven_roast leaves.
- **Culinary preferred temperatures supported by research evidence** — braise leaf's Senegalese source states 175 °F "more tender results if using just thighs"; smoker 170–175 °F; air-fryer tandoori 195 °F; grill 160 °F (below the safe line — recorded as published divergence, not guidance).
- Per-method temperature nuance carried by each leaf's own consensus section.
- No description copy-paste: every leaf's `## Cut profile` is method-specific and distinct from siblings and from this file.

Note on definitions: this file's `doneness` block gives `dark_meat_optimal` as target 79 °C / 175 °F (74–85 °C), while the global `POULTRY_DARK_MEAT` range in `cooking_data.py` is target 77 °C / 170 °F (74–82 °C). Recorded as an observation only; the shared global range was not edited.

### Improvement priorities

1. Collect the remaining enum methods with credible recipe evidence — `simmer`/`boil` (bone-in thigh soups and stews: tinola, sinigang na manok, chicken soups) and `charcoal_grill` variants — then re-assess `cooking_methods_researched`.
2. Raise the six partial leaves to the 4–6-source gate: pan_fry and grill each need 1–3 more traditions (Group C/D grilling; a non-US stovetop pan-fry); smoker, slow_cooker, pressure_cooker and sous_vide need 3+ more sources each.
3. Resolve the endpoint divergence record: air_fryer sources span 165–195 °F and grill spans 160–165 °F; consider a `method_temperature_ranges` override for air_fryer once a 4–6-source collection exists.
4. Re-fetch the Serious Eats cold-start skillet and air-fryer thigh pages (HTTP 403 on 2026-10-24) — they carry the only located US 175 °F pan-fry endpoint.

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
