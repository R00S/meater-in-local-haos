<!-- KCE:CUT
type: cut
slug: pork_belly
name: Pork Belly
category: pork
meat: pig
cut_type: Roasts
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- air_fryer
- braise
- grill
- oven_roast
- pan_fry
- slow_cooker
- smoker
- sous_vide
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
- name: crispy
  target_c: 90
  target_f: 195
  min_c: 85
  min_f: 185
  max_c: 95
  max_f: 203
  usda_safe: true
quality_score: 8
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Pork Belly — Cut Overview

## Cut profile

Pork belly (svinekam/flæskesteg in Danish; Schweinebauch in German/Austrian) is the quintessential Nordic and German Sunday roast. Key to success is the crackling (svær / Kruste): the rind must be deeply scored, generously salted, and positioned flat in the oven. Danish flæskesteg is cooked at high temperature (225°C) the whole way; German Krustenbraten often starts with browning, then medium oven; a simpler approach boils the belly first then glazes in a very hot oven. Target internal for pork belly: **65–75 °C** — unlike the leaner loin, belly has so much fat that it stays juicy and safe at 65 °C.


## Research files by cooking method

- [Air Fryer](./pork_belly-air_fryer.md)
- [Braise](./pork_belly-braise.md)
- [Grill](./pork_belly-grill.md)
- [Oven Roast](./pork_belly-oven_roast.md)
- [Pan Fry](./pork_belly-pan_fry.md)
- [Slow Cooker](./pork_belly-slow_cooker.md)
- [Smoker](./pork_belly-smoker.md)
- [Sous Vide](./pork_belly-sous_vide.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Southern tradition | −1 |
| Method file `pork_belly-air_fryer.md` copies parent cut profile | −1 |
| Method file `pork_belly-grill.md` copies parent cut profile | −1 |
| Method file `pork_belly-air_fryer.md` copies `pork_belly-grill.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `pork_belly-air_fryer.md` copies `pork_belly-grill.md` — rewrite `pork_belly-air_fryer.md`'s cut profile — it must describe what the grill method does to this cut, not repeat another method's prose
3. **−1** · Method file `pork_belly-air_fryer.md` copies parent cut profile — rewrite `pork_belly-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `pork_belly-grill.md` copies parent cut profile — rewrite `pork_belly-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Southern tradition(s) — add Southern source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
