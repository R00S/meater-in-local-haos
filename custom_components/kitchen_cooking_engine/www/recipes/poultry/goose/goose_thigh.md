<!-- KCE:CUT
type: cut
slug: goose_thigh
name: Goose Thigh
category: poultry
meat: goose
cut_type: Goose
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- braise
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
- name: dark_meat_optimal
  target_c: 77
  target_f: 170
  min_c: 74
  min_f: 165
  max_c: 82
  max_f: 180
  usda_safe: true
  recommended: true
quality_score: 8
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Goose Thigh — Cut Overview

## Cut profile

Goose thigh is perhaps the most flavourful part of the goose — richer than the leg and with a higher ratio of intramuscular fat and connective tissue. Braising is ideal: the moist-heat environment keeps the thigh succulent while sustained heat above 160 °F converts collagen to gelatin. Target 175–185 °F (79–85 °C) for the most tender, silky texture. The braising liquid, enriched by rendered goose fat and gelatin, reduces to an intensely flavourful sauce. Goose thighs are widely used in European traditional cooking, similar to duck confit but with a braise instead of a fat immersion.


Target internal temperature: **175–185 °F (79–85 °C)** — optimal for collagen breakdown; USDA minimum: 165 °F (74 °C).


## Research files by cooking method

- [Braise](./goose_thigh-braise.md)
- [Oven Roast](./goose_thigh-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Eastern tradition | −1 |
| Method file `goose_thigh-braise.md` copies parent cut profile | −1 |
| Method file `goose_thigh-oven_roast.md` copies parent cut profile | −1 |
| Method file `goose_thigh-braise.md` copies `goose_thigh-oven_roast.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `goose_thigh-braise.md` copies `goose_thigh-oven_roast.md` — rewrite `goose_thigh-braise.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
3. **−1** · Method file `goose_thigh-braise.md` copies parent cut profile — rewrite `goose_thigh-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `goose_thigh-oven_roast.md` copies parent cut profile — rewrite `goose_thigh-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Eastern tradition(s) — add Eastern source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
