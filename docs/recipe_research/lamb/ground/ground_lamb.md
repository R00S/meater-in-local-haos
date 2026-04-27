<!-- KCE:CUT
type: cut
slug: ground_lamb
name: Ground Lamb
category: lamb
meat: lamb
cut_type: Ground
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- grill
- pan_fry
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Ground Lamb — Cut Overview

## Cut profile

Ground (minced) lamb is used in countless traditions — from Middle Eastern kibbeh and North African merguez to Greek moussaka, Indian keema, and Turkish Akçaabat köfte. Pan-frying ground lamb requires thorough cooking (ground meat has higher bacterial contamination risk than whole cuts). The aromatics sautéed with the mince are as important as the meat itself.


Target internal temperature: **74 °C (165 °F)** for food-safe ground lamb.


## Research files by cooking method

- [Pan Fry](./ground_lamb-pan_fry.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `ground_lamb-grill.md` | −1 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `ground_lamb-pan_fry.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `ground_lamb-grill.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `ground_lamb-pan_fry.md` copies parent cut profile — rewrite `ground_lamb-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
