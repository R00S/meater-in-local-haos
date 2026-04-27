<!-- KCE:CUT
type: cut
slug: rabbit_legs
name: Rabbit Legs
category: game
meat: rabbit
cut_type: Rabbit
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: dark_meat_optimal
methods:
- braise
- oven_roast
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
- name: dark_meat_optimal
  target_c: 77
  target_f: 170
  min_c: 74
  min_f: 165
  max_c: 82
  max_f: 180
  usda_safe: true
  recommended: true
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: 9
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Rabbit Legs — Cut Overview

## Cut profile

Rabbit (*Oryctolagus cuniculus*) legs (front and hind) are the most commonly braised cut. The hind legs carry more meat and are the prime braising cut; the front legs are often included for flavour. Rabbit is lean, low in fat, and prone to drying if overcooked — braising in wine, stock, or cream keeps the meat moist while allowing the connective tissue to break down.

The French tradition (lapin aux pruneaux, lapin à la moutarde) is the most internationally recognised; German, Italian, and British traditions also have strong recipes. Braising time: 45–75 minutes. The meat should be fork-tender and pulling away from the bone.


Target internal temperature: **74–77 °C (165–175 °F)** — rabbit, like chicken, should be cooked through. Fork-tender braised rabbit reads 74–80 °C.


## Research files by cooking method

- [Braise](./rabbit_legs-braise.md)
- [Oven Roast](./rabbit_legs-oven_roast.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `rabbit_legs-braise.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `rabbit_legs-braise.md` copies parent cut profile — rewrite `rabbit_legs-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
