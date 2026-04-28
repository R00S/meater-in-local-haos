<!-- KCE:CUT
type: cut
slug: rabbit_saddle
name: Rabbit Saddle
name_sv: Kaninsadel
category: game
meat: rabbit
cut_type: Rabbit
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- oven_roast
- pan_sear
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
# Rabbit Saddle — Cut Overview

## Cut profile

The rabbit saddle is the backbone section of the rabbit bearing two boneless loins
and, when left bone-in, thin belly flaps that protect the loins during roasting.
Oven roasting suits the saddle particularly when it is stuffed, tied, or cooked
bone-in as a whole piece: the oven's dry, even heat browns the exterior more gently
and uniformly than a stovetop pan, and the belly flaps — which would burn in a pan
— insulate the loins and add a thin layer of fat that bastes the meat from the
inside. The saddle is lean enough that it needs a hot oven (190–200°C) to brown
before the interior overcooks; conversely, finishing times are short (10–15 minutes)
and carryover is 2–3°C, so the cut demands close monitoring. Stuffed or rolled
saddle (farce or ballotine style) can tolerate a slightly lower oven and longer
time because the stuffing moderates heat transfer into the loin.


inside. The saddle is lean enough that it needs a hot oven (190–200°C) to brown
and carryover is 2–3°C, so the cut demands close monitoring. Stuffed or rolled


## Styckesprofil

Kaninryggen (sadelstycket) är ryggradens sektion med de mest möra, magraste musklerna. Ugnsrostning passar ryggen bra — speciellt hel med ben, fylld eller knuten. Stekningstid är kort: 20–25 minuter vid 180 °C för en hel rygg.

Innertemperatur: **65–72 °C (149–162 °F)** för fullt genomstekt och saftig. Överskrid inte 75 °C — den magra muskeln torkar snabbt. Eftertillagning: 2–3 °C. Sond insatt längsvis i den tjockaste ländryggen, parallellt med ryggraden. Vila 5–8 minuter täckt före skärning.

## Research files by cooking method

- [Oven Roast](./rabbit_saddle-oven_roast.md)
- [Pan Sear](./rabbit_saddle-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `rabbit_saddle-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Group A, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group A, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `rabbit_saddle-oven_roast.md` copies parent cut profile — rewrite `rabbit_saddle-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
