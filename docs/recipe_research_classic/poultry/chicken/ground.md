<!-- KCE:CUT
type: cut
slug: ground
name: Ground
category: poultry
meat: chicken
cut_type: Whole
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- grill
- pan_fry
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
quality_score: 0
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Ground — Cut Overview

## Cut profile

*Placeholder — cut profile research not yet completed.*

## Research files by cooking method

*No research files yet.*
## Quality score

**Score: 0 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Cut profile is a placeholder | −1 |
| No method leaf files | −3 |
| No temperature research (safe temps) | −3 |
| No temperature research (culinary preferred) | −4 |
| No per-method temp research | −2 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−4** · Missing all four traditions tradition(s) — add all four traditions source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−4** · No temperature research (culinary preferred) — add method leaf files whose source recipes include explicit pull temperatures — frontmatter values alone are not enough
4. **−3** · No method leaf files — create `ground-{method}.md` leaf files for each supported cooking method, each with 4–6 diverse source recipes
5. **−3** · No temperature research (safe temps) — add method leaf files whose source recipes include explicit pull temperatures — frontmatter values alone are not enough
6. **−2** · No per-method temp research — ensure each method leaf file includes explicit pull temperatures from source recipes
7. **−1** · Cut profile is a placeholder — replace the placeholder with a full cut profile — anatomy, structure, connective tissue, and cooking behaviour

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
