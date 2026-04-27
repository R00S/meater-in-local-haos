<!-- KCE:CUT
type: cut
slug: ostrich_steak
name: Ostrich Steak
category: game
meat: ostrich
cut_type: Ostrich
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
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
quality_score: 7
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Ostrich Steak — Cut Overview

## Cut profile

Ostrich (*Struthio camelus*) steak is produced primarily in South Africa, Namibia, and increasingly in France, Belgium, and Germany. Despite being a bird, ostrich meat is red, very low in fat, and treated culinarily exactly like beef or venison. Fan fillet (outerfilé) and top loin are the main steak cuts. The meat is extremely lean and must not be overcooked: medium-rare (54–57 °C) is the South African standard. Above 70 °C the meat becomes tough and liver-like.


Target internal temperature: **54–57 °C (129–135 °F)** for medium-rare. Pull at 52 °C and rest.


## Research files by cooking method

- [Grill](./ostrich_steak-grill.md)
- [Pan Sear](./ostrich_steak-pan_sear.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `ostrich_steak-grill.md` copies parent cut profile | −1 |
| Method file `ostrich_steak-pan_sear.md` copies parent cut profile | −1 |
| Method file `ostrich_steak-grill.md` copies `ostrich_steak-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group D tradition(s) — add Culinary Group A and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `ostrich_steak-grill.md` copies `ostrich_steak-pan_sear.md` — rewrite `ostrich_steak-grill.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose
4. **−1** · Method file `ostrich_steak-grill.md` copies parent cut profile — rewrite `ostrich_steak-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Method file `ostrich_steak-pan_sear.md` copies parent cut profile — rewrite `ostrich_steak-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
