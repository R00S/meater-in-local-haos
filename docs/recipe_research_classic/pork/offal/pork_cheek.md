<!-- KCE:CUT
type: cut
slug: pork_cheek
name: Pork Cheek
category: pork
meat: pig
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
- oven_roast
- pan_fry
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
quality_score: 4
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Pork Cheek — Cut Overview

## Cut profile

Pork cheek (*carrillera de cerdo*, *guanciale di maiale*, *griskind*) is the small dense muscle of the jaw — roughly 80–120 g per cheek, marbled with thin sheets of intramuscular fat and rich in collagen from the constant chewing motion the muscle performs in life. For pan frying (rather than the more common braise), the cheeks are typically butterflied to expose the interior, dusted lightly, and seared at high heat — the goal is to crust the surface while keeping the centre at a tender medium-rare. This works because the cheek's collagen network, while extensive, is fine-grained enough that a brief flash sear (rather than a long braise) leaves the muscle bouncy rather than rubbery. The carryover is small (2–3 °C) given the thin butterflied cuts.


## Research files by cooking method

- [Braise](./pork_cheek-braise.md)
- [Oven Roast](./pork_cheek-oven_roast.md)
- [Pan Fry](./pork_cheek-pan_fry.md)
## Quality score

**Score: 4 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `pork_cheek-slow_cooker.md` | −1 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `pork_cheek-braise.md` copies parent cut profile | −1 |
| Method file `pork_cheek-oven_roast.md` copies parent cut profile | −1 |
| Method file `pork_cheek-pan_fry.md` copies parent cut profile | −1 |
| Method file `pork_cheek-braise.md` copies `pork_cheek-oven_roast.md` | −1 |
| Method file `pork_cheek-braise.md` copies `pork_cheek-pan_fry.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `pork_cheek-slow_cooker.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `pork_cheek-braise.md` copies `pork_cheek-oven_roast.md` — rewrite `pork_cheek-braise.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
5. **−1** · Method file `pork_cheek-braise.md` copies `pork_cheek-pan_fry.md` — rewrite `pork_cheek-braise.md`'s cut profile — it must describe what the pan fry method does to this cut, not repeat another method's prose
6. **−1** · Method file `pork_cheek-braise.md` copies parent cut profile — rewrite `pork_cheek-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
7. **−1** · Method file `pork_cheek-oven_roast.md` copies parent cut profile — rewrite `pork_cheek-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
8. **−1** · Method file `pork_cheek-pan_fry.md` copies parent cut profile — rewrite `pork_cheek-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
