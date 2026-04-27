<!-- KCE:CUT
type: cut
slug: lamb_shoulder
name: Shoulder
category: lamb
meat: lamb
cut_type: Ground
usda_safe_c: 63
usda_safe_f: 145
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
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Shoulder — Cut Overview

## Cut profile

Lamb shoulder is fattier and more flavourful than leg, with more connective tissue that melts into gelatin during long, slow roasting. It is the cut for slow-roasted lamb dishes — 4–6 hours at 150–160 °C (or 7–8 hours at 130 °C). The result is pull-apart meat that falls off the bone with a fork. The MEATER probe target is **85–90 °C (185–194 °F)** for pull-apart.


## Research files by cooking method

- [Oven Roast](./lamb_shoulder-oven_roast.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `lamb_shoulder-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `lamb_shoulder-braise.md`, `lamb_shoulder-slow_cooker.md`
3. **−2** · Missing Culinary Group A and Culinary Group D tradition(s) — add Culinary Group A and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `lamb_shoulder-oven_roast.md` copies parent cut profile — rewrite `lamb_shoulder-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
