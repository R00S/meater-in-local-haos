<!-- KCE:CUT
type: cut
slug: spare_ribs
name: Spare Ribs
category: pork
meat: pig
cut_type: Ribs
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- oven_roast
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
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Spare Ribs — Cut Overview

## Cut profile

Spare ribs (revelsben/kamben in Danish; Spareribs in German/Austrian) are the lower belly ribs, larger and flatter than baby back ribs with more fat and connective tissue. They benefit particularly from low-and-slow oven cooking: either pre-boiled then finished high, or foil-wrapped at low heat then glazed. The higher fat content makes them more forgiving than baby backs. Target internal: 88–95 °C, the same range as baby back ribs — collagen renders at these temperatures giving the characteristic tender, pull-off-bone texture and glossy glaze.


Target internal temperatures (oven roast):
- Fall-off-bone tender: **88–95 °C (190–203 °F)**
- ⚠️ Below 80 °C spare ribs are food-safe but still tough


## Research files by cooking method

- [Oven Roast](./spare_ribs-oven_roast.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Eastern tradition | −1 |
| Missing Southern tradition | −1 |
| Method file `spare_ribs-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `spare_ribs-grill.md`, `spare_ribs-smoker.md`
3. **−2** · Missing Eastern and Southern tradition(s) — add Eastern and Southern source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `spare_ribs-oven_roast.md` copies parent cut profile — rewrite `spare_ribs-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
