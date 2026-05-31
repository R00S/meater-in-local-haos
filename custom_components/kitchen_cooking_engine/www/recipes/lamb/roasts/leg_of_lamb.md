<!-- KCE:CUT
type: cut
slug: leg_of_lamb
name: Leg of Lamb
name_sv: Lammlår
category: lamb
meat: lamb
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- oven_roast
doneness:
- name: rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
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
quality_score: -4
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 15
rest_time_max: 30
carryover_temp_c: 8
-->
# Leg of Lamb — Cut Overview

## Cut profile

Leg of lamb is the quintessential festive roast throughout the Mediterranean, Middle East, British Isles, Australia, and New Zealand. A bone-in leg typically weighs 2–3 kg and is roasted at 160–175 °C with a garlic-herb rub, either to medium-pink (internal 54–60 °C) or slow-roasted to fall-apart (80–90 °C). The choice between these two approaches is the fundamental split in leg of lamb cooking.

**Temperature guide** (from The Mediterranean Dish, fetched 2026-04-24):
- Rare: 52 °C (125 °F) — 15 min/lb
- Medium-rare: 54–57 °C (130–135 °F) — 20 min/lb
- Medium: 57–63 °C (135–145 °F) — 25 min/lb
- Well-done: 68–74 °C (155–165 °F) — 30 min/lb
- Falling apart: 80 °C (175 °F) — 40 min/lb (slow 6 hours+)


Leg of lamb is the quintessential festive roast throughout the Mediterranean, Middle East, British Isles, Australia, and New Zealand. A bone-in leg typically weighs 2–3 kg and is roasted at 160–175 °C with a garlic-herb rub, either to medium-pink (internal 54–60 °C) or slow-roasted to fall-apart (80–90 °C). The choice between these two approaches is the fundamental split in leg of lamb cooking.
- Rare: 52 °C (125 °F) — 15 min/lb
- Medium-rare: 54–57 °C (130–135 °F) — 20 min/lb
- Medium: 57–63 °C (135–145 °F) — 25 min/lb
- Well-done: 68–74 °C (155–165 °F) — 30 min/lb
- Falling apart: 80 °C (175 °F) — 40 min/lb (slow 6 hours+)


## Styckesprofil

Lammben är den quintessentiella festrostningen globalt. Ugnsrostning vid 160–175 °C med vitlöks-örtmarinad, antingen till medium-rosa eller genomstekt beroende på kulinarisk tradition. Spetsa köttet med vitlöksklyftor och ingnid ytan med rosmarin-olja-salt är standardteknik.

Innertemperatur: **57–65 °C (135–149 °F)** för medium-rare till medium; **70–74 °C** för genomstekt (mellanösternsk). Eftertillagning: 4–6 °C. Sond in i tjockaste köttmassan, borta från lårbenet. Vila täckt 15–20 minuter. Tillagningstid: 20–25 minuter per 500 g + 20 minuter extra.

## Research files by cooking method

- [Grill](./leg_of_lamb-grill.md)
- [Oven Roast](./leg_of_lamb-oven_roast.md)
## Quality score

**Score: -4 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
