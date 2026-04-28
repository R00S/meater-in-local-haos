<!-- KCE:CUT
type: cut
slug: ground_turkey
name: Ground Turkey
category: poultry
meat: ground_poultry
cut_type: Ground
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- braise
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Ground Turkey — Cut Overview

## Cut profile

Ground turkey (minced turkey) is made by grinding dark meat (thigh and leg), white meat (breast), or a blend. A dark-meat-inclusive blend (typically 93/7 lean/fat) has noticeably better flavour and moisture retention than pure breast-meat grinds. Because turkey is poultry, the USDA minimum safe internal temperature is 74°C (165°F) with no reduction for resting. Ground turkey cooks faster than beef or pork at the same mass due to its lower fat content and should be monitored closely to avoid dryness. Carryover is 1–2°C.

Ground turkey is primarily used in North American cooking as a leaner substitute for ground beef in burgers, meatballs, patties, and mince-based sauces. It appears in Eastern European cuisine as kotlety (pan-fried patties, often mixed with pork or veal). Turkish and Middle Eastern cuisines use it in köfte/kofta, though lamb and beef are more traditional. Italian cuisine uses tacchino macinato for hamburger e polpette.


## Research files by cooking method

- [Braise](./ground_turkey-braise.md)
- [Grill](./ground_turkey-grill.md)
- [Pan Fry](./ground_turkey-pan_fry.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `ground_turkey-braise.md` copies parent cut profile | −1 |
| Method file `ground_turkey-pan_fry.md` copies parent cut profile | −1 |
| Method file `ground_turkey-braise.md` copies `ground_turkey-pan_fry.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `ground_turkey-braise.md` copies `ground_turkey-pan_fry.md` — rewrite `ground_turkey-braise.md`'s cut profile — it must describe what the pan fry method does to this cut, not repeat another method's prose
3. **−1** · Method file `ground_turkey-braise.md` copies parent cut profile — rewrite `ground_turkey-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `ground_turkey-pan_fry.md` copies parent cut profile — rewrite `ground_turkey-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
