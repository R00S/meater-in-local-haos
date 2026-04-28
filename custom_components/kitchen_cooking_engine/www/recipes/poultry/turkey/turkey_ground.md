<!-- KCE:CUT
type: cut
slug: turkey_ground
name: Ground
category: poultry
meat: turkey
cut_type: Turkey
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
quality_score: 6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Ground Turkey — Cut Overview

## Cut profile

Ground turkey (minced turkey) is produced by grinding turkey meat — typically dark meat (thigh and leg), white meat (breast), or a blend. The most commonly sold blend in North America is 93% lean / 7% fat, which includes some dark meat for moisture and flavour. Pure-breast grinds (99% lean) are leaner but noticeably drier. Turkey mince has a mild, slightly sweet flavour that takes well to bold seasonings.

Ground turkey is primarily used in North American cooking as a leaner substitute for ground beef in burgers, meatballs, patties, and mince-based sauces. It appears in Eastern European cuisine as kotlety (pan-fried patties, often mixed with pork or veal). Turkish and Middle Eastern cuisines use it in köfte/kofta, though lamb and beef are more traditional. Italian cuisine uses tacchino macinato for hamburger and polpette.

Compared to ground beef, turkey mince:
- Has lower fat content (7% vs 15–20% for 80/20 beef) — prone to drying out if overcooked
- Requires more binding agents (egg, breadcrumbs, grated onion) to hold shape
- Should be handled gently to preserve juiciness
- Must reach USDA minimum of 74°C (165°F) — no rare or pink serving for ground poultry

**Note**: This cut (`turkey_ground`) is nearly identical to `ground_turkey` in the system, which also represents ground turkey with the same methods and temperature ranges. The two entries appear to originate from different data sources in the frontend merge (2025).

Target internal temperature: **165 °F (74 °C)** — USDA minimum for all ground poultry; no culinary "preference" to cook below this.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| grill | [turkey_ground-grill.md](./turkey_ground-grill.md) | 🔄 in progress (2 sources, Group B only) |
| pan_fry | [turkey_ground-pan_fry.md](./turkey_ground-pan_fry.md) | 🔄 in progress (3 sources, Groups B/C/D) |

## Quality score

**Score: 6 / 20** — assessed 2026-04-27

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Grill leaf: Group C and D missing | −1 |
| Pan fry leaf: no explicit temperatures in sources | −2 |
| Both leaves: collection incomplete | −2 |

### Improvement priorities

1. **−8** · Cooking methods not researched — oven bake is a probable method (turkey meatballs, baked patties) not yet researched; search when accessible sources are available
2. **−1** · Missing Culinary Group A tradition — Group A sources not found: no accessible SE/East Asian standalone ground turkey recipe. Korean turkey bulgogi and Japanese turkey hambagu may exist but were not accessible (maangchi.com: 403; justonecookbook.com: 403)
3. **−2** · Pan fry leaf: no explicit temperatures — all 3 pan_fry sources use time-based doneness ("no longer pink", "cook through"); no source states a probe temperature; all imply 74°C (165°F) USDA minimum
4. **−2** · Both leaves collection incomplete — grill: 2 sources (need 2 more), pan_fry: 3 sources (need 1 more)

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
