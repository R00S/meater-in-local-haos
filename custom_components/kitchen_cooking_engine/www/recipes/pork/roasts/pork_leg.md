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
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Pork Leg Roast — Cut Overview

## Cut profile

Pork leg (*Schweinshaxe*, German/Austrian — actually this is hock/shank; *stinco di maiale*, Italian; *pernil*, Caribbean/Filipino; *jamón fresco*, Spanish) refers to two distinct retail cuts in different markets: (1) the whole fresh leg (4–8 kg), used for *pernil* and Spanish-style roasting; (2) the hock/shank — the lower joint of the leg where the *tibia/fibula* meet the ankle, heavily worked, collagen-dense, and the quintessential braise cut. The hock muscle is primarily composed of *flexor digitorum profundus* and *extensor* layers bound in thick collagen sheets. Both cuts need prolonged cooking to develop tenderness: whole leg roasts at 65–75 °C over 3–5 hours (low-and-slow); hock braised to 88–95 °C over 2–3 hours. MEATER probe into the thickest muscle mass, away from the bone.


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
| Missing Culinary Group C tradition | −1 |
| Method file `pork_leg-braise.md` copies parent cut profile | −1 |
| Method file `pork_leg-oven_roast.md` copies parent cut profile | −1 |
| Method file `pork_leg-braise.md` copies `pork_leg-oven_roast.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `pork_leg-braise.md` copies `pork_leg-oven_roast.md` — rewrite `pork_leg-braise.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
3. **−1** · Method file `pork_leg-braise.md` copies parent cut profile — rewrite `pork_leg-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `pork_leg-oven_roast.md` copies parent cut profile — rewrite `pork_leg-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group C tradition(s) — add Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
