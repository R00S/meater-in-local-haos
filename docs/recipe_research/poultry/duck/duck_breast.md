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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
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

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `duck_breast-sous_vide.md` | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `duck_breast-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `duck_breast-sous_vide.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group C and Culinary Group D tradition(s) — add Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `duck_breast-oven_roast.md` copies parent cut profile — rewrite `duck_breast-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
