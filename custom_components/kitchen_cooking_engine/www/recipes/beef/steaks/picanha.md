<!-- KCE:CUT
type: cut
slug: picanha
name: Picanha
name_sv: Picanha
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
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
rest_time_min: 10
rest_time_max: 15
carryover_temp_c: 5
-->
# Picanha — Cut Overview

## Cut profile

Picanha (*alcatra de capa* in Portuguese; *coulotte* in French; *sirloin cap* or *rump cap* in English) is cut from the top of the rump, between the hip bone and the start of the loin. Anatomically, it consists of the *biceps femoris* muscle capped by a thick layer of subcutaneous fat — the fat cap is its defining structural feature. The muscle itself is lean with moderate marbling for a rump-region cut, delivering a bold, beefy flavour that punches above its marbling level. The fat cap serves two culinary functions: it protects the lean meat from drying out during cooking, and it renders and bastes the muscle from above in high-heat methods.

Picanha is the most prized cut in Brazilian *churrasco* culture, where it is often cooked whole on skewers. Outside Brazil, it is increasingly recognised as an alternative to more expensive premium steaks. Typical whole weight: 800 g – 1.5 kg. In English-speaking countries it is often sold trimmed or further divided, losing the fat cap; ensure the fat cap is intact before purchase.

- [Charcoal Grill](./picanha-charcoal_grill.md)
- [Grill](./picanha-grill.md)
- [Oven Roast](./picanha-oven_roast.md)
- [Pan Sear](./picanha-pan_sear.md)
## Styckesprofil

Picanha (*alcatra de capa* på portugisiska; *coulotte* på franska; *sirloin cap* eller *rump cap* på engelska) skärs från toppen av rumpprimalen, mellan höftbenet och kotlettens start. Anatomiskt består den av *biceps femoris*-muskeln täckt av ett tjockt subcutant fettlager — fettlisten är styckdelens definierande drag och hålls alltid intakt. Det är det mest firade snittet i brasiliansk *churrasco*-kultur. Innertemperatur: 52–57 °C medium-rare. Eftertillagning: 2–4 °C.

## Quality score

**Score: 10 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods researched (full survey) | − **NOT DONE** |
| Cut profile written with anatomy | ✓ (fixed 2026-04-27) |
| All declared method leaves exist | ✓ (charcoal_grill, grill, oven_roast, pan_sear) |
| Method cut profiles distinct (no copies) | ✓ (all fixed 2026-04-27) |
| Culinary Group A covered | ✓ (charcoal_grill leaf: Brazilian/South American is closest to Group B, but Group A may be covered elsewhere) |
| Culinary Group B covered | ✓ |
| Culinary Group C covered | − missing |
| Culinary Group D covered | − missing |

**Deductions**: −8 methods not researched · −1 Group C missing · −1 Group D missing = −10 → 20−10 = **10**

### Improvement priorities

1. **−8** · Cooking methods not researched — survey all cooking methods appropriate for picanha; update `methods:` list; set `cooking_methods_researched: 1`
2. **−1** · Group C tradition missing — find a Moroccan, Turkish, Lebanese, or other Group C picanha-adjacent recipe
3. **−1** · Group D tradition missing — find a Polish, Swedish, or other Group D recipe using rump cap or sirloin cap cut

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
