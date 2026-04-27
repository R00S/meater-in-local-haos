<!-- KCE:CUT
type: cut
slug: t_bone
name: T-Bone / Porterhouse
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
quality_score: 6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# T-Bone / Porterhouse — Cut Overview

## Cut profile

Air-frying a T-bone steak is practical for steaks up to 3 cm thick and 700 g — the bone makes the T-bone bulkier than simple steak cuts, so it must fit in the air fryer basket. Air fryers circulate extremely hot air at 200–220 °C and produce a crisped surface resembling oven-roasted rather than pan-seared beef, without the mess of oil splatter. The two-muscle T-bone geometry (striploin + fillet) requires monitoring the striploin temperature — the MEATER probe goes in the striploin side, away from the bone. The result is less dramatic in crust quality than a cast-iron sear, but significantly more convenient for weeknight cooking. Carryover from the air fryer basket is 3–5 °C.


## Research files by cooking method

- [Air Fryer](./t_bone-air_fryer.md)
- [Charcoal Grill](./t_bone-charcoal_grill.md)
- [Grill](./t_bone-grill.md)
- [Oven Roast](./t_bone-oven_roast.md)
- [Pan Sear](./t_bone-pan_sear.md)
## Quality score

**Score: 6 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `t_bone-air_fryer.md` copies parent cut profile | −1 |
| Method file `t_bone-grill.md` copies `t_bone-oven_roast.md` | −1 |
| Method file `t_bone-grill.md` copies `t_bone-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Group A, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group A, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `t_bone-air_fryer.md` copies parent cut profile — rewrite `t_bone-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `t_bone-grill.md` copies `t_bone-oven_roast.md` — rewrite `t_bone-grill.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
5. **−1** · Method file `t_bone-grill.md` copies `t_bone-pan_sear.md` — rewrite `t_bone-grill.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
