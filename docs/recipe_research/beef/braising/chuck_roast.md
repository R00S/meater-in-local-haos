<!-- KCE:CUT
type: cut
slug: chuck_roast
name: Chuck Roast / Pot Roast
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
# Chuck Roast / Pot Roast — Cut Overview

## Cut profile

Chuck roast is cut from the shoulder region of the animal (the chuck primal, roughly ribs 1–5 and the neck). The shoulder muscles endure constant movement throughout the animal's life, producing densely bundled muscle fibres interlaced with thick seams of connective tissue (*collagen*) and intermuscular fat — a structure that is aggressively tough at low internal temperatures but transforms into richly flavoured, pull-apart tenderness after prolonged cooking. The chuck encompasses multiple muscles: *triceps brachii*, *supraspinatus*, *infraspinatus*, and the *longissimus costarum*. Most are heavily worked, heavily collagen-rich, and unsuitable for quick cooking methods.


## Research files by cooking method

- [Braise](./chuck_roast-braise.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `chuck_roast-braise.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `chuck_roast-oven_roast.md`, `chuck_roast-slow_cooker.md`
3. **−2** · Missing Culinary Group C and Culinary Group D tradition(s) — add Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `chuck_roast-braise.md` copies parent cut profile — rewrite `chuck_roast-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
