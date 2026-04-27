<!-- KCE:CUT
type: cut
slug: wild_boar_shoulder
name: Wild Boar Shoulder
category: game
meat: wild_boar
cut_type: Wild Boar
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
- oven_roast
- slow_cooker
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: 7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Wild Boar Shoulder — Cut Overview

## Cut profile

Wild boar shoulder is a large, heavily worked muscle containing significant connective tissue. It benefits from long, slow roasting (3–4 hours) at moderate temperature (160–200 °C) in a braising liquid to achieve pull-apart tenderness. The German tradition uses wine, game stock, juniper, and root vegetables; the Italian and French traditions add tomato and herbs.


Target internal temperature: **80–90 °C (176–194 °F)** for fall-apart texture. Food-safety minimum is 70 °C (158 °F) for safe serving, but the collagen conversion to gelatin that makes the shoulder delicious requires 80+ °C.


## Research files by cooking method

- [Oven Roast](./wild_boar_shoulder-oven_roast.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `wild_boar_shoulder-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `wild_boar_shoulder-braise.md`, `wild_boar_shoulder-slow_cooker.md`
3. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `wild_boar_shoulder-oven_roast.md` copies parent cut profile — rewrite `wild_boar_shoulder-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
