<!-- KCE:CUT
type: cut
slug: spinach
name: Spinach
name_sv: Spenat
category: vegetables
meat: green_vegetables
cut_type: Green Vegetables
methods:
- saute
- steam
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 0
carryover_temp_c: 0
-->
# Spinach — Cut Overview

## Cut profile

Spinach (*Spinacia oleracea*) sautéed wilts dramatically in 1–3 minutes in a hot pan with a small amount of oil or butter — fresh spinach loses approximately 90 % of its volume on cooking as moisture is expelled. The target: bright-green, just-wilted leaves with no excess water pooled in the pan. If a pool of water accumulates, the spinach is steaming not sautéing. Internal temperature at just-wilted doneness: 68–75 °C (154–167 °F) — above 75 °C the chlorophyll degrades and the colour turns army-drab. MEATER probe placed horizontally into the densest centre of the spinach pile in the pan.


## Styckesprofil

Spenat (*Spinacia oleracea*) sauterad vissnar dramatiskt på 1–3 minuter i het panna med lite olja eller smör — färsk spenat förlorar ungefär 90 % av volymen vid tillagning. Klar när fullständigt vissnad och ljusgrön. Salta efter vissning för att undvika för mycket vätska.

## Research files by cooking method

- [Sauté](./spinach-saute.md)
- [Steam](./spinach-steam.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `spinach-saute.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group C and Culinary Group D tradition(s) — add Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `spinach-saute.md` copies parent cut profile — rewrite `spinach-saute.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
