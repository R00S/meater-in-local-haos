<!-- KCE:CUT
type: cut
slug: roasted_parsnips
name: Roasted Parsnips
name_sv: Rostade palsternackor
category: vegetables
meat: root_vegetables
cut_type: Root Vegetables
methods:
- air_fryer
- oven_roast
doneness:
- name: tender
  target_c: 95
  target_f: 203
  min_c: 90
  min_f: 195
  max_c: 100
  max_f: 212
  usda_safe: true
  recommended: true
- name: caramelized
  target_c: 160
  target_f: 320
  min_c: 150
  min_f: 300
  max_c: 175
  max_f: 350
  usda_safe: true
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Roasted Parsnips — Cut Overview

## Cut profile

Parsnips (*Pastinaca sativa*) in the air fryer become golden, caramelised and crispy at the tips in 16–20 minutes at 190–200 °C — faster than oven roasting (25–30 minutes). Parsnips have a high natural sugar content (≈ 12 g/100 g — significantly higher than carrots) and caramelise readily. They should be cut into batons or long wedges, oil-coated and placed in a single layer. Pull temperature: 86–90 °C (187–194 °F) for caramelised, fluffy-interior parsnips. MEATER probe inserted along the long axis of the thickest baton.


## Research files by cooking method

- [Air Fryer](./roasted_parsnips-air_fryer.md)
- [Oven Roast](./roasted_parsnips-oven_roast.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Cut profile lacks anatomy | −1 |
| Method file `roasted_parsnips-air_fryer.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `roasted_parsnips-air_fryer.md` copies parent cut profile — rewrite `roasted_parsnips-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
