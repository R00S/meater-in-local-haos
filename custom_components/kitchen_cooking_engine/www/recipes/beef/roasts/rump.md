<!-- KCE:CUT
type: cut
slug: rump
name: Rump
category: beef
meat: cow
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- oven_roast
- pan_sear
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
quality_score: 7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Rump (Beef) — Cut Overview

## Cut profile

The beef rump is cut from the rump primal — the top of the hindquarter, at the junction between
the sirloin and the round. In British and Australian butchery, **rump steak** is a popular
budget-premium steak; more flavourful than topside due to intramuscular fat and the mix of
muscles, but less tender than sirloin or ribeye. In Swedish butchery it is called **rumpstek**.

**Anatomy**: Rump comprises several overlapping muscles (mainly the biceps femoris, tensor
fasciae latae, and gluteus medius). Because the rump is from a moderately exercised area, it
has both more fat and more connective tissue than the round, contributing to fuller flavour.
The composite nature of the cut means it benefits from slicing against the grain.

**Steak vs roast**: At steak thickness (2–3 cm), rump is best served medium-rare at 54–60 °C
via pan-sear or grill. As a whole joint, it can be oven-roasted.

**Best uses**: Pan sear (most common), grill (charcoal or grill pan), oven roast (less common).
Not typically braised in Western traditions.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| pan_sear | rump-pan_sear.md | ✅ 4 sources (Groups B×3, D) |
| grill | *not yet created* | ⬜ |
| oven_roast | *not yet created* | ⬜ |

## Quality score

**Score: 7 / 20** — assessed 2026-04-27

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Groups A, C | −2 (honest gaps) |
| Groups B, D covered in pan_sear leaf | −0 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research grill and oven_roast methods; set `cooking_methods_researched: 1`
2. **−2** · Group A/C gap — find a Group A (Asian) or Group C (African/Middle Eastern) rump steak pan-sear source
3. Create `rump-grill.md` and `rump-oven_roast.md` leaves

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
