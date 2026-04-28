<!-- KCE:CUT
type: cut
slug: venison_roast
name: Venison Roast
category: game
meat: venison
cut_type: Venison
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- braise
- oven_roast
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Venison Roast — Cut Overview

## Cut profile

Venison roast refers primarily to the haunch (hind leg, *femur* and surrounding muscles: *biceps femoris*, *semimembranosus*, *semitendinosus*, and *quadriceps*) and the saddle (*longissimus dorsi* and *psoas* muscles, bone-in). Both are the premium roasting joints of the red and roe deer carcass, prized for festive cooking across British, German, French, and Scandinavian traditions.

The muscles are very lean — even less marbled than beef from the same primal positions — with a deep red colour (high myoglobin), and a characteristic earthy, slightly sweet game flavour. The lack of intramuscular fat means venison dries out more readily than beef at equivalent temperatures; the optimal internal temperature range (55–60 °C for a pink result) is lower than most other roasts.


## Research files by cooking method

- [Oven Roast](./venison_roast-oven_roast.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | − **NOT DONE** (−8) |
| Cut profile anatomy | ✓ (fixed 2026-04-27) |
| Oven_roast cut profile method-specific | ✓ (fixed 2026-04-27) |
| Braise leaf missing | − missing (−1) |
| Culinary Group A covered | − missing (−1) |
| Culinary Group C covered | − missing (−1) |
| Culinary Groups B, D | ✓ |

**Deductions**: −8 methods · −1 missing braise · −1 Group A · −1 Group C = −11 → 20−11 = **9**

### Improvement priorities

1. **−8** · Cooking methods not researched
2. **−1** · Missing `venison_roast-braise.md` — create with verified sources
3. **−1** · Group A tradition missing
4. **−1** · Group C tradition missing

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
