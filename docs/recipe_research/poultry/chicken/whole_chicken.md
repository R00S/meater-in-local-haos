<!-- KCE:CUT
type: cut
slug: whole_chicken
name: Whole Chicken
category: poultry
meat: chicken
cut_type: Whole
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: thigh_optimal
methods:
- air_fryer
- grill
- oven_roast
doneness:
- name: safe
  target_c: 74
  target_f: 165
  min_c: 74
  min_f: 165
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
- name: thigh_optimal
  target_c: 79
  target_f: 175
  min_c: 77
  min_f: 170
  max_c: 85
  max_f: 185
  usda_safe: true
  recommended: true
quality_score: 14
quality_assessed: 2026-04-26
-->
# Whole Chicken — Cut Overview

## Cut profile

A whole roasted chicken presents a fundamental challenge: the breast and thigh finish at different temperatures, so technique matters. Starting breast-side down lets the thigh meat begin rendering while protecting the breast. High initial heat (475 °F / 246 °C) produces crackling golden skin. The breast should reach 160–165 °F (71–74 °C) while the thigh reaches 165–170 °F (74–77 °C); a well-rested bird allows both to equalise. Average 3–4 lb bird takes 55–70 minutes total.


Target internal temperatures: **Breast 160–165 °F (71–74 °C)** · **Thigh 165–170 °F (74–77 °C)**


## Research files by cooking method

- [Oven Roast](./whole_chicken-oven_roast.md)
## Quality score

**Score: 14 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Eastern tradition | −1 |
| Missing Western tradition | −1 |
| Missing Northern tradition | −1 |
| Method file `whole_chicken-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `whole_chicken-air_fryer.md`, `whole_chicken-grill.md`
2. **−3** · Missing Eastern, Western and Northern tradition(s) — add Eastern, Western and Northern source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `whole_chicken-oven_roast.md` copies parent cut profile — rewrite `whole_chicken-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
