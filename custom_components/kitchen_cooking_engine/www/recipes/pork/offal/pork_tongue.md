<!-- KCE:CUT
type: cut
slug: pork_tongue
name: Pork Tongue
category: pork
meat: pig
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
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
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Pork Tongue — Cut Overview

## Cut profile

Pork tongue is the smaller, more delicate sibling of beef tongue — typically 250–400 g per tongue versus 1.5–2 kg for beef. The structure is identical: a single dense lingual muscle wrapped in a thick, papillae-covered skin that must be peeled after cooking. The smaller mass means a shorter braise (60–90 minutes rather than 3–4 hours) and a milder, sweeter flavour. Pork tongue is fundamental to many traditions — Mexican *lengua de cerdo*, Chinese cha-shu pig tongue, French *langue de porc sauce ravigote*, Polish *ozór wieprzowy*. The peel-while-warm rule still applies, and the tongue is best sliced thin and either dressed with a sharp vinaigrette or warmed in a piquant sauce. Carryover is essentially zero (the surrounding liquid buffers temperature).


## Research files by cooking method

- [Braise](./pork_tongue-braise.md)
- [Slow Cooker](./pork_tongue-slow_cooker.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group C tradition | −1 |
| Method file `pork_tongue-braise.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `pork_tongue-braise.md` copies parent cut profile — rewrite `pork_tongue-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Culinary Group C tradition(s) — add Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
