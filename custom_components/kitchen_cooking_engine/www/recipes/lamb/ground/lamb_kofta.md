<!-- KCE:CUT
type: cut
slug: lamb_kofta
name: Kofta / Kebab
category: lamb
meat: lamb
cut_type: Ground
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- grill
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
quality_score: 7
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Kofta / Kebab — Cut Overview

## Cut profile

Lamb kofta (köfte, kefta, kafta, kufta — many spelling variations) is one of the most widespread grilled preparations in the world, found from Morocco to Turkey, Iran, Pakistan, Afghanistan, India, and across the Levant. The ground lamb is mixed with onion, spices, and fresh herbs, shaped onto flat metal skewers, and grilled over high heat. It cooks very quickly (3–4 minutes per side) and must be cooked through. Inserting a MEATER probe into the thickest kofta is the recommended technique.


Target internal temperature: **74 °C (165 °F)** for food-safe ground meat.


## Research files by cooking method

- [Grill](./lamb_kofta-grill.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `lamb_kofta-oven_roast.md` | −1 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `lamb_kofta-grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `lamb_kofta-oven_roast.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group B and Culinary Group D tradition(s) — add Culinary Group B and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
5. **−1** · Method file `lamb_kofta-grill.md` copies parent cut profile — rewrite `lamb_kofta-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
