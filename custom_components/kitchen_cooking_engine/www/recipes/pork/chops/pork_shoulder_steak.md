<!-- KCE:CUT
type: cut
slug: pork_shoulder_steak
name: Pork Shoulder Steak
category: pork
meat: pig
cut_type: Chops & Tenderloin
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- braise
- grill
- pan_fry
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
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
# Pork Shoulder Steak — Cut Overview

## Cut profile

Pork shoulder steak (nakkesteak, Schweinenackensteak / Schopfsteak) is from the neck/collar area — more marbled than loin steak, more forgiving, and ideal for pan frying. The fat renders during cooking, basting the meat from the inside. 3–4 minutes per side on medium-high heat is the standard, and it can withstand a slightly higher final temperature (68–70 °C) without drying out. The Austrian Schopfsteak is an iconic example of this cut.


Target internal temperatures (pan fry):
- Juicy: **65–68 °C (149–154 °F)**
- Well done: **70–72 °C (158–162 °F)**


## Research files by cooking method

- [Pan Fry](./pork_shoulder_steak-pan_fry.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `pork_shoulder_steak-pan_fry.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `pork_shoulder_steak-braise.md`, `pork_shoulder_steak-grill.md`
3. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `pork_shoulder_steak-pan_fry.md` copies parent cut profile — rewrite `pork_shoulder_steak-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
