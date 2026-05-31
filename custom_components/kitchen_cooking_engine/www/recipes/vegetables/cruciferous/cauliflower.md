<!-- KCE:CUT
type: cut
slug: cauliflower
name: Cauliflower
name_sv: Blomkål
category: vegetables
meat: cruciferous
cut_type: Cruciferous
methods:
- air_fryer
- oven_roast
- saute
- steam
- whole_roast
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
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 1
-->
# Cauliflower — Cut Overview

## Cut profile

Cauliflower (*Brassica oleracea* var. *botrytis*) is a tightly clustered head of immature flower buds (curd) attached to a thick fibrous stem. The curd is roughly 92 % water, with delicate cell walls and a very small amount of free sugar — when sautéed in a hot, fat-coated pan, the surface dehydrates quickly and the residual sugars caramelise into a brown, nutty crust while the interior softens but retains some structural integrity. Sauteing differs from roasting in that contact-area browning is concentrated on whichever face touches the pan: success depends on cutting florets with a flat side and not crowding the pan. Carryover is small but real because the dense curd traps heat in its centre after removal — pulling 1–2 °C below the target preserves a touch of bite.


## Styckesprofil

Blomkål (*Brassica oleracea* var. *botrytis*) är ett tätt klustring av omogna blomknoppar fästa på en tjock fibrös stam. Sauteras i het olja-smord panna i 8–12 minuter. Klar när gyllenbrun och genomstekt.

## Research files by cooking method

- [Air Fryer](./cauliflower-air_fryer.md)
- [Oven Roast](./cauliflower-oven_roast.md)
- [Sauté](./cauliflower-saute.md)
- [Steam](./cauliflower-steam.md)
- [Whole Roast](./cauliflower-whole_roast.md)
## Quality score

**Score: -5 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Cut profile lacks anatomy | −1 |
| Method file `cauliflower-saute.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `cauliflower-saute.md` copies parent cut profile — rewrite `cauliflower-saute.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
