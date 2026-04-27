<!-- KCE:CUT
type: cut
slug: tri_tip
name: Tri-Tip
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
- smoker
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
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Tri-Tip — Cut Overview

## Cut profile

Tri-tip on charcoal benefits from the classic Santa Maria barbecue tradition — the original Californian preparation. The key is a 2-zone charcoal setup: sear directly over the coals first for a crust, then finish on the indirect side to bring the interior to temperature safely. The tapered shape means the thin end will always be more done; probe the thickest section. Red oak is the traditional Santa Maria wood; hickory and mesquite are alternatives.


Target internal temperatures (charcoal grill):
- Medium-rare: **pull at 54–57 °C (129–135 °F)**


## Research files by cooking method

- [Charcoal Grill](./tri_tip-charcoal_grill.md)
- [Grill](./tri_tip-grill.md)
- [Oven Roast](./tri_tip-oven_roast.md)
- [Pan Sear](./tri_tip-pan_sear.md)
- [Smoker](./tri_tip-smoker.md)
- [Sous Vide](./tri_tip-sous_vide.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `tri_tip-charcoal_grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `tri_tip-charcoal_grill.md` copies parent cut profile — rewrite `tri_tip-charcoal_grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
