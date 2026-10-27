<!-- KCE:CUT
type: cut
slug: roasted_tomatoes
name: Roasted Tomatoes
name_sv: Rostade tomater
name_da: Bagte tomater
category: vegetables
meat: tomatoes
cut_type: Tomatoes
methods:
- air_fryer
- oven_broil
- oven_roast
- grill
- pan_fry
doneness:
- name: tender
  target_c: 95
  target_f: 203
  min_c: 90
  min_f: 195
  max_c: 100
  max_f: 212
  usda_safe: true
  recommended: true
- name: caramelized
  target_c: 160
  target_f: 320
  min_c: 150
  min_f: 300
  max_c: 175
  max_f: 350
  usda_safe: true
improvement_potential: 19
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-10-27
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 1
-->
# Roasted Tomatoes — Cut Overview

## Cut profile

Tomatoes (*Solanum lycopersicum*) in the air fryer roast in 8–15 minutes depending on size and target: cherry tomatoes burst and caramelise in 8–10 minutes at 200 °C; halved plum tomatoes take 12–15 minutes to collapse and blister. The circulating air dehydrates the surface faster than a conventional oven, producing crisper, slightly wrinkled edges with concentrated sweetness. Air-fried tomatoes are particularly useful as fast toppings for pasta, pizza, bruschetta, or eggs. Pull temperature for burst cherry tomatoes (serving as-is) is 82–88 °C (180–190 °F); for halved plum tomatoes intended as a sauce base, 88–95 °C (190–203 °F). A MEATER probe is most practical in a larger tomato; for cherry tomatoes, rely on appearance (bursting, blistered) and time, or insert in the largest specimen. Carryover is negligible.

**Anatomy, and why it decides the method.** A tomato is a berry: a thin, waxy outer skin over a thick
pericarp wall (the "meat"), with two to five seed chambers — locules — filled with gel and seeds in the
middle, and a watery core running from stem to blossom end. Three consequences follow. The skin is only
slightly permeable, so any enclosed heat turns the water inside into steam and the half balloons and splits
before the pericarp has time to concentrate; that is why air frying and broiling, which drive water off the
cut face fast, work better than a sealed oven. The locule gel is 90 % water and collapses long before the
pericarp is tender, which is why a tomato can look collapsed and still taste raw. And the pericarp is the
only part with structure worth measuring — the probe target whenever one is used — while the gel around it
is thermally irrelevant.


## Styckesprofil

Tomater (*Solanum lycopersicum*) i airfryern rostas på 8–15 minuter beroende på storlek och mål: körsbärstomater brister och karameliseras på 8–10 minuter vid 200 °C; halverade plomtomater i 12–15 minuter. Klar när karameliserade och mjuka med koncentrerad smak.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Air fryer | [roasted_tomatoes-air_fryer.md](./roasted_tomatoes-air_fryer.md) | ✅ 3 traditions (Thai, Indian, Turkish), numbers published |
| Oven roast | [roasted_tomatoes-oven_roast.md](./roasted_tomatoes-oven_roast.md) | ✅ 3 records (Mexican, Italian, Levantine), numbers published |
| Oven broil | [roasted_tomatoes-oven_broil.md](./roasted_tomatoes-oven_broil.md) | ⚠️ Partial — 4 records, **no internal temperature anywhere** (2026-10-27) |
| Grill | — | ⬜ Owed. *Pomodori grigliati* named on the Italian source page fetched 2026-10-27; no recipe fetched yet |
| Pan fry | — | ⬜ Owed. *Pomodori gratinati in padella* named on the same page; no recipe fetched yet |
## Improvement potential

**Improvement potential: 19 / 20** — assessed 2026-10-27 (supersedes the 2026-04-26 number 8, which was
produced by a table that charged −8 for an unstarted method survey and −1 for a missing leaf while never
looking at the two leaves that already existed).

| Criterion | Points | Evidence |
|-----------|--------|----------|
| Cooking methods not researched (`cooking_methods_researched: 1`) | — | survey re-run 2026-10-27: air fryer, oven roast, oven broil confirmed; **grill and pan fry discovered** and declared, leaves owed |
| Missing Culinary Group A | — | Thai and Indian air-fryer records |
| Missing Culinary Group B | — | Mexican, Italian, US, Italian-American records |
| Missing Culinary Group C | — | Turkish, Moroccan, Lebanese oven records |
| Missing Culinary Group D | **−1** | no Scandinavian, Baltic, Slavic or Russian tomato record in any leaf |
| `## Cut profile` … lacks anatomy | — | anatomy added 2026-10-27: skin, pericarp, locules, gel, and what each does under heat |
| No method leaf files exist | — | three leaves exist; two more are owed by the methods declared this pass |
| Safe-temperature evidence | — | not a USDA-controlled product; no safe-temp row applies |
| Preferred-temperature evidence | — | 86–95 °C across air-fryer and oven-roast records |
| Per-method temperature data | — | separate bands per leaf |
| Description duplication | — | `air_fryer` profile rewritten to be method-specific 2026-10-27; sibling leaves distinct |

**Points: −1 Group D → 19.**

**What the number cannot see.** Two leaves are owed (`grill`, `pan_fry`) and the oven-broil leaf contains no
temperature at all. The table has no row for a declared-but-unwritten leaf, so this number describes the
evidence that exists, not the work that remains.

### Data state and gaps

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `leaf_without_temperature` (oven_broil) | open | 4 broil records, 0 internal temperatures | S | one record from a kitchen that probes a tomato under the grill |
| `group_D_absent` | searched-negative | "ugnsrostade tomater", "печёные помидоры" — Swedish and Russian pages exist but publish no temperature and no distinct technique | — | none found this pass |
| `unwritten_leaf:grill` | open | *Pomodori grigliati* page named on blog.giallozafferano.it (fetched 2026-10-27) | M | 4 grilled-tomato records from distinct traditions |
| `unwritten_leaf:pan_fry` | open | *Pomodori gratinati in padella* named on the same page | M | 4 pan records |
| `inherited_doneness` | recorded | the hub's `tender` 95 °C and `caramelized` 160 °C are inherited coding values; the broil leaf has nothing to support them | S | decide in `cooking_data.py` whether to keep, lower or mark unsourced |

### Improvement priorities

1. **−1** · Group D: a Swedish or Russian oven/slow-roast tomato record with a temperature.
2. **Owed leaves** · `grill` and `pan_fry` — both named by the Italian source, neither fetched.
3. **Oven-broil evidence** · the only leaf in this cut with no number at all; one probing source would change it.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
