<!-- KCE:CUT
type: cut
slug: picanha
name: Picanha
category: beef
meat: cow
cut_type: Steaks
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium
methods:
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
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Picanha — Cut Overview

## Cut profile

Picanha over live charcoal is the definitive Brazilian *churrasco* preparation — in Brazil, the whole *rump cap* is threaded onto long metal skewers in a horseshoe shape (fat cap outside) and rotated continuously above the charcoal fire of the *churrascaria*, the fat dripping and basting the meat as it cooks. At home on a kettle or kamado grill, the rotisserie method can be replicated or a simplified two-zone direct-then-indirect approach is used. The charcoal smoke compounds penetrate the fat cap and impart a distinctive aroma that is a signature of Brazilian *churrasco*. Carryover from a hot charcoal fire is 5–7 °C.


## Research files by cooking method

- [Charcoal Grill](./picanha-charcoal_grill.md)
- [Grill](./picanha-grill.md)
- [Oven Roast](./picanha-oven_roast.md)
- [Pan Sear](./picanha-pan_sear.md)
## Quality score

**Score: 6 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Southern tradition | −1 |
| Missing Northern tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `picanha-charcoal_grill.md` copies parent cut profile | −1 |
| Method file `picanha-grill.md` copies `picanha-oven_roast.md` | −1 |
| Method file `picanha-grill.md` copies `picanha-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Southern and Northern tradition(s) — add Southern and Northern source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `picanha-charcoal_grill.md` copies parent cut profile — rewrite `picanha-charcoal_grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Method file `picanha-grill.md` copies `picanha-oven_roast.md` — rewrite `picanha-grill.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
6. **−1** · Method file `picanha-grill.md` copies `picanha-pan_sear.md` — rewrite `picanha-grill.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
