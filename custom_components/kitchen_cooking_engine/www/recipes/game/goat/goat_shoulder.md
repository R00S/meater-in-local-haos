<!-- KCE:CUT
type: cut
slug: goat_shoulder
name: Goat Shoulder
name_sv: Getskuldra
category: game
meat: goat
cut_type: Goat
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
quality_score: -4
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 15
rest_time_max: 30
carryover_temp_c: 5
-->
# Goat Shoulder — Cut Overview

## Cut profile

Goat shoulder (Swedish *getskuldra* / *getbog*) is the upper foreleg — heavily worked, dense with collagen and intramuscular fat. Like the lamb shoulder, it is a quintessentially low-and-slow cut: tough beyond chewing if cooked to medium-rare, but transformed by long, wet cooking into fork-tender, gelatin-rich meat that pulls in long strands. Internal temperature is necessary but insufficient: the cut needs time at 88–93 °C internal for 2–3 hours after reaching that temperature. Probe horizontally through the thickest part of the muscle, away from bone or large connective sheets.


## Styckesprofil

Getaxel (*getskuldra* / *getbog*, svenska) är den övre frambenet — hårt arbetat, tätt med kollagen och intramuskulärt fett. Som lammaxeln är det ett quintessentiellt lågt-och-långsamt-snitt: för segt att äta om det tillagas till medium-rare, men förvandlat av lång, fuktig tillagning till gaffelömt, gelatin-rikt kött.

Innertemperaturen är nödvändig men otillräcklig: snittet behöver tid vid 88–93 °C i 2–3 timmar efter att ha nått den temperaturen. Sond horisontellt genom den tjockaste delen av muskeln, borta från ben eller stora bindvävsark. Innertemperatur: **88–93 °C** (190–199 °F). Eftertillagning: försumbar.

## Research files by cooking method

- [Braise](./goat_shoulder-braise.md)
- [Oven Roast](./goat_shoulder-oven_roast.md)
- [Slow Cooker](./goat_shoulder-slow_cooker.md)
## Quality score

**Score: -4 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `goat_shoulder-braise.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `goat_shoulder-braise.md` copies parent cut profile — rewrite `goat_shoulder-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
