<!-- KCE:CUT
type: cut
slug: mutton_shoulder_alt
name: Shoulder
name_sv: Fårskuldra
category: game
meat: mutton
cut_type: Mutton
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: pulled
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
quality_score: 14
cooking_methods_researched: 1
quality_assessed: 2026-04-27
rest_time_min: 15
rest_time_max: 30
carryover_temp_c: 5
-->
# Shoulder — Cut Overview

## Cut profile

This entry (`mutton_shoulder_alt`, `name_long: "Shoulder"`) is a system-duplicate of `mutton_shoulder` introduced during a frontend data merge. The cut is identical to the mutton shoulder: the heavily worked forelimb muscle mass of mature sheep (12 months+), characterised by deep flavour, high collagen content, and a large central blade bone. All culinary properties — deep, assertive flavour; dense connective tissue requiring long low-temperature cooking; suitability for braising, slow roasting, and slow cooker methods to reach pulled/fall-off-bone doneness at 88–96°C (190–205°F) — are described in the primary entry.

See the primary research documentation at `docs/recipe_research/game/mutton/mutton_shoulder.md` and its method leaf files:
- [mutton_shoulder-braise.md](./mutton_shoulder-braise.md)
- [mutton_shoulder-oven_roast.md](./mutton_shoulder-oven_roast.md)
- [mutton_shoulder-slow_cooker.md](./mutton_shoulder-slow_cooker.md)

## Styckesprofil

Fåraxel (systemduplicat av primärfil) är den hårt arbetade framlemmsmuskelmassan hos mogna får (12+ månader), karakteriserad av djup kraftfull smak, högt kollageninnehåll och en stor central skulderbladsben. Alla kulinariska egenskaper — djup smak; tät bindväv som kräver lång lågtemperaturtillagning; lämplighet för bräsering, långsam ugnsstekning och slow cooker för att nå pull-apart-mörhet vid 88–96 °C — är identiska med primärposten.

Se primär dokumentation i `docs/recipe_research/game/mutton/mutton_shoulder.md`. Innertemperatur: **88–96 °C** (190–205 °F) för pull-apart.

## Research files by cooking method

All methods inherit from the primary `mutton_shoulder` entry. Independent leaf files are not created here to avoid data duplication. Any cut-specific research (not covered by `mutton_shoulder`) would be added here.

## Quality score

**Score: 14 / 20** — assessed 2026-04-27

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −0 *(inherited from mutton_shoulder; set cooking_methods_researched: 1)* |
| Cut profile references mutton_shoulder rather than being stand-alone | −2 |
| No independent method leaf files (relies on mutton_shoulder) | −4 |

### Improvement priorities

1. **System issue** · This duplicate entry should be reviewed — if `mutton_shoulder` and `mutton_shoulder_alt` are truly the same cut, the alt entry may be removable from cooking_data.py
2. **−4** · No independent leaf files — if a distinct culinary identity is found for the "Shoulder" entry (e.g., a tradition where "shoulder" is treated differently from "mutton shoulder"), add independent leaf files
3. **−2** · Cut profile is a cross-reference — add a stand-alone cut profile if this entry is kept

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
