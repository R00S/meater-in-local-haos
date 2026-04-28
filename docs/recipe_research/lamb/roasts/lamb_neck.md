<!-- KCE:CUT
type: cut
slug: lamb_neck
name: Lamb Neck
category: lamb
meat: lamb
cut_type: Roasts
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Lamb Neck — Cut Overview

## Cut profile

Lamb neck comprises the cervical vertebrae and associated muscles — primarily the *longissimus colli*, *semispinalis*, *multifidus*, and *trapezius* layers. These are heavily worked postural muscles, densely threaded with connective tissue seams and interspersed fat pockets. The neck is the most collagen-rich section of the lamb; it is structurally similar to osso buco but smaller, and can be purchased as a whole neck for pot-roasting or cross-cut (*lamb neck slices*) for braising. The high collagen load means it needs sustained time at 88–93 °C internal to fully convert connective tissue to gelatin, releasing the characteristic unctuous quality that defines well-braised lamb neck. MEATER probe into the thickest cross-section of neck meat, away from the vertebrae.


Target internal temperature: **85–90 °C (185–194 °F)** for full braised tenderness.


## Research files by cooking method

- [Braise](./lamb_neck-braise.md)
- [Oven Roast](./lamb_neck-oven_roast.md)
- [Slow Cooker](./lamb_neck-slow_cooker.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Method file `lamb_neck-braise.md` copies parent cut profile | −1 |
| Method file `lamb_neck-oven_roast.md` copies parent cut profile | −1 |
| Method file `lamb_neck-braise.md` copies `lamb_neck-oven_roast.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `lamb_neck-braise.md` copies `lamb_neck-oven_roast.md` — rewrite `lamb_neck-braise.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
3. **−1** · Method file `lamb_neck-braise.md` copies parent cut profile — rewrite `lamb_neck-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `lamb_neck-oven_roast.md` copies parent cut profile — rewrite `lamb_neck-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
