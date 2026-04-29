<!-- KCE:CUT
type: cut
slug: duck_breast
name: Duck Breast
name_sv: Andbröst
category: poultry
meat: duck
cut_type: Duck
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: medium_rare
methods:
- oven_roast
- pan_sear
- sous_vide
doneness:
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
- name: safe
  target_c: 74
  target_f: 165
  min_c: 74
  min_f: 165
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
quality_score: 17
cooking_methods_researched: 1
quality_assessed: 2026-04-29
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 4
-->
# Duck Breast — Cut Overview

## Cut profile

Duck breast is a dark, rich cut with a thick layer of subcutaneous fat beneath a scored skin. Unlike chicken breast, duck breast is best cooked to medium-rare (135–145 °F / 57–63 °C), where the meat remains pink, juicy, and tender. The oven-roast method typically follows a stovetop fat-rendering sear: the breast starts skin-side down in a cold or lightly warmed oven-safe pan to slowly render the fat cap, then transfers to a moderate oven to finish gently and evenly without overshooting the internal temperature.


Target internal temperature: **135–145 °F (57–63 °C)** — medium-rare, pull at 130 °F and rest; carryover brings it to target. For well-done (USDA), pull at 160 °F for a final resting temp of 165 °F.


## Styckesprofil

Ankbröst är ett mörkt, rikt snitt med tjockt subcutant fett. Till skillnad från kycklingbröst tillagas det bäst till medium-rare (57–63 °C). Innertemperatur: 57–60 °C. Eftertillagning: 3–4 °C. Alltid börja med kallt panna (skinnsidan ned) för att smälta fettet långsamt.

## Research files by cooking method

- [Oven Roast](./duck_breast-oven_roast.md)
- [Pan Sear](./duck_breast-pan_sear.md)

## Quality score

**Score: 17 / 20** — assessed 2026-04-29

| Criterion | Status |
|-----------|--------|
| Cooking methods researched | ✓ — survey completed 2026-04-29 (pan_sear, oven_roast, sous_vide confirmed; pan_sear is the primary method; oven_roast follows stovetop fat-render; sous_vide is widely used in professional and modern home cooking) |
| Culinary Group A tradition covered | ✓ (covered in pan_sear leaf) |
| Culinary Group B tradition covered | ✓ (BBC Good Food, French tradition) |
| Culinary Group C tradition covered | − missing (Moroccan duck pastilla and similar dishes use duck but not standalone breast; no accessible Group C duck breast recipe found) |
| Culinary Group D tradition covered | − missing (Scandinavian/Eastern European duck breast recipes not found in accessible sources) |
| oven_roast leaf cut profile fixed (was copy of parent) | ✓ (rewritten 2026-04-29) |
| sous_vide leaf | − pending (method in list; leaf not yet created) |

**Deduction**: −1 (Group C) −1 (Group D) −1 (sous_vide leaf pending) = **17**

### Improvement priorities

1. **−1 each** · Groups C and D missing — add sources from Moroccan/Middle Eastern or Scandinavian/Eastern European duck breast preparations
2. Create `duck_breast-sous_vide.md` — method in list, leaf pending; sous vide duck breast is widely covered on seriouseats.com (when accessible)

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
