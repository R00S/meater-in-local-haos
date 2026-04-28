<!-- KCE:CUT
type: cut
slug: brisket
name: Brisket
category: beef
meat: cow
cut_type: Braising Cuts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- braise
- oven_roast
- slow_cooker
- smoker
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
# Brisket — Cut Overview

## Cut profile

Beef brisket is taken from the breast and lower chest of the animal, comprising two muscles — the flat (*pectoralis profundus*) and the point (*pectoralis superficialis*) — that together support much of the animal's standing weight. The flat is a large, lean slab of dense muscle; the point (also called the deckle) lies over and across the flat, separated by a fat seam, and is more heavily marbled. Both muscles are extremely collagen-dense from a lifetime of supporting the animal's weight. Collagen begins softening at around 70 °C but fully converts to gelatin only with prolonged cooking at or above 85–90 °C. At gelatin conversion, the brisket transforms from a tough, chewy slab to a silky, pull-apart masterpiece.


## Research files by cooking method

- [Oven Roast](./brisket-oven_roast.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (3 of 4 declared) | −3 |
| Missing Culinary Group D tradition | −1 |
| Method file `brisket-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing method leaf files — create the following 3 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `brisket-braise.md`, `brisket-slow_cooker.md`, `brisket-smoker.md`
3. **−1** · Method file `brisket-oven_roast.md` copies parent cut profile — rewrite `brisket-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
