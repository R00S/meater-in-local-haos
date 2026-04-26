<!-- KCE:CUT
type: cut
slug: pork_leg
name: Pork Leg Roast
category: pork
meat: pig
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- braise
- oven_roast
- slow_cooker
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 8
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Pork Leg Roast — Cut Overview

## Cut profile

Pork leg and hock (Schweinshaxe / stinco di maiale / kuzu incik) is a collagen-rich cut with thick connective tissue, bone marrow, and heavily worked muscle. Braising unlocks the cut's full potential: 2–3 hours of moist heat at low temperature converts collagen to gelatin, creating sticky, unctuous, fall-off-the-bone meat surrounded by a richly reduced sauce. Popular braised in beer across Bavaria, Central Europe, and the British Isles; in soy and spices across East Asia; and in wine with herbs across Mediterranean Europe. The MEATER probe is placed deep into the thickest muscle mass of the leg or hock, away from the bone, to track internal temperature accurately.


Target internal temperature: **75–80 °C (167–176 °F)** for sliceable, tender; **85–90 °C (185–194 °F)** for pull-apart.


## Research files by cooking method

- [Braise](./pork_leg-braise.md)
- [Oven Roast](./pork_leg-oven_roast.md)
- [Slow Cooker](./pork_leg-slow_cooker.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Southern tradition | −1 |
| Method file `pork_leg-braise.md` copies parent cut profile | −1 |
| Method file `pork_leg-oven_roast.md` copies parent cut profile | −1 |
| Method file `pork_leg-braise.md` copies `pork_leg-oven_roast.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `pork_leg-braise.md` copies `pork_leg-oven_roast.md` — rewrite `pork_leg-braise.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
3. **−1** · Method file `pork_leg-braise.md` copies parent cut profile — rewrite `pork_leg-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `pork_leg-oven_roast.md` copies parent cut profile — rewrite `pork_leg-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Southern tradition(s) — add Southern source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
