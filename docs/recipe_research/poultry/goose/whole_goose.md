<!-- KCE:CUT
type: cut
slug: whole_goose
name: Whole Goose
category: poultry
meat: goose
cut_type: Goose
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: thigh_rendered
methods:
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
- name: thigh_rendered
  target_c: 84
  target_f: 183
  min_c: 82
  min_f: 180
  max_c: 88
  max_f: 190
  usda_safe: true
  recommended: true
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Whole Goose — Cut Overview

## Cut profile

A whole goose (typically 4–6 kg / 9–13 lb) is by far the fattiest of the common roasting birds — a significant proportion of its body weight is subcutaneous fat that must be rendered away during cooking. This sets it apart from chicken and turkey: the cook's main task is not to avoid dryness but to efficiently remove vast quantities of fat while keeping the dark, richly flavoured meat from toughening. Goose legs and thighs need 165–175 °F (74–79 °C) to become tender; the breast is best at a lower temperature but in whole-bird cookery inevitably finishes higher. The USDA minimum for whole goose (like all whole poultry) is **165 °F (74 °C)** measured deep in the thigh without touching bone. Many European recipes roast to 175–185 °F (80–85 °C) in the thigh to ensure the dark meat is fully tender and the fat rendered. Carryover adds 3–5 °C after resting.

A medium goose (4.5 kg / 10 lb) typically takes 2.5–3 hours at 190 °C (375 °F) when started breast-side-up. Fat must be drained from the roasting tin every 30–45 minutes or it will smoke aggressively.


A whole goose (typically 4–6 kg / 9–13 lb) is by far the fattiest of the common roasting birds — a significant proportion of its body weight is subcutaneous fat that must be rendered away during cooking. This sets it apart from chicken and turkey: the cook's main task is not to avoid dryness but to efficiently remove vast quantities of fat while keeping the dark, richly flavoured meat from toughening. Goose legs and thighs need 165–175 °F (74–79 °C) to become tender; the breast is best at a lower temperature but in whole-bird cookery inevitably finishes higher. The USDA minimum for whole goose (like all whole poultry) is **165 °F (74 °C)** measured deep in the thigh without touching bone. Many European recipes roast to 175–185 °F (80–85 °C) in the thigh to ensure the dark meat is fully tender and the fat rendered. Carryover adds 3–5 °C after resting.
A medium goose (4.5 kg / 10 lb) typically takes 2.5–3 hours at 190 °C (375 °F) when started breast-side-up. Fat must be drained from the roasting tin every 30–45 minutes or it will smoke aggressively.


## Research files by cooking method

- [Oven Roast](./whole_goose-oven_roast.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
