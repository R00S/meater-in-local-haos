<!-- KCE:CUT
type: cut
slug: tomahawk
name: Tomahawk Steak
category: beef
meat: cow
cut_type: Steaks
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- charcoal_grill
- grill
- oven_roast
- pan_sear
- sous_vide
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
quality_score: 9
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Tomahawk Steak — Cut Overview

## Cut profile

The tomahawk over charcoal is the premier outdoor cooking experience — the enormous bone handle allows it to stand upright beside the coals for resting. Charcoal-grilled tomahawk requires the same reverse-sear principle as gas grill: indirect heat to bring the core up safely, then direct high heat for the crust. The Maillard reaction on the fat-cap over charcoal produces flavour compounds unavailable from gas. Use hardwood charcoal (oak, holm oak, beech) for best flavour.


Target internal temperatures (charcoal grill):
- Medium-rare: **core 55–57 °C (131–135 °F)** · pull at **52–54 °C (126–129 °F)**
- Medium: **core 60–63 °C (140–145 °F)**


## Research files by cooking method

- [Charcoal Grill](./tomahawk-charcoal_grill.md)
- [Grill](./tomahawk-grill.md)
- [Oven Roast](./tomahawk-oven_roast.md)
- [Pan Sear](./tomahawk-pan_sear.md)
- [Sous Vide](./tomahawk-sous_vide.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Eastern tradition | −1 |
| Missing Southern tradition | −1 |
| Method file `tomahawk-charcoal_grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Eastern and Southern tradition(s) — add Eastern and Southern source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `tomahawk-charcoal_grill.md` copies parent cut profile — rewrite `tomahawk-charcoal_grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
