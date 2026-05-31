<!-- KCE:CUT
type: cut
slug: mutton_leg
name: Mutton Leg Roast
name_sv: Fårlår
category: game
meat: mutton
cut_type: Mutton
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium
methods:
- oven_roast
doneness:
- name: medium_rare
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: medium
  target_c: 60
  target_f: 140
  min_c: 57
  min_f: 135
  max_c: 63
  max_f: 145
  usda_safe: false
- name: medium_well
  target_c: 66
  target_f: 150
  min_c: 63
  min_f: 145
  max_c: 68
  max_f: 155
  usda_safe: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 15
rest_time_max: 30
carryover_temp_c: 8
-->
# Mutton Leg Roast — Cut Overview

## Cut profile

A whole mutton leg (bone-in, 2–3 kg) is a festive cut in the Middle East, Pakistan, Afghanistan, UK, and parts of Europe. Its strong, mature flavour benefits from marinating and long, slow oven roasting. Most traditions roast at 160–180 °C for 2.5–4 hours, covered for the majority of the time to prevent drying.


Target internal temperature: **75–80 °C (167–176 °F)** for fully cooked, still juicy. Some Pakistani and Indian recipes cook to 85 °C for fall-apart texture.


## Styckesprofil

Ett helt fårben (med ben, 2–3 kg) är ett festsnitt i Mellanöstern, Pakistan, Afghanistan, Storbritannien och delar av Europa. Den starka, mogna smaken gynnas av marinering och lång, långsam ugnsstekning vid 160–180 °C i 2,5–4 timmar, täckt för majoriteten av tiden.

Fårbenets starka smak kräver kraftfull kryddning — spiskummin, kardemumma, ingefära, vitlök och yoghurt är gemensamma marinadelement. Vila 15–20 minuter täckt före skärning. Innertemperatur: **75–80 °C (167–176 °F)** för fullt genomstekt, fortfarande saftigt. 85 °C för fall-apart. Eftertillagning: 3–5 °C. Sond i tjockaste köttdelen borta från lårbenet.

## Research files by cooking method

- [Oven Roast](./mutton_leg-oven_roast.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group C tradition | −1 |
| Method file `mutton_leg-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `mutton_leg-oven_roast.md` copies parent cut profile — rewrite `mutton_leg-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Culinary Group C tradition(s) — add Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
