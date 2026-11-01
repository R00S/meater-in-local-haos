<!-- KCE:CUT
type: cut
slug: flat_iron
name: Flat Iron Steak
name_sv: Flat Iron
name_da: Flat iron-steak
category: beef
meat: cow
cut_type: Steaks
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- air_fryer
- charcoal_grill
- grill
- oven_roast
- pan_fry
- pan_sear
- sous_vide
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
improvement_potential: 2567
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-11-01
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 2
-->
# Flat Iron Steak — Cut Overview

## Cut profile

The flat iron steak is taken from the infraspinatus muscle of the beef shoulder blade, separated from the central band of tough gristle that runs through the full top blade. Because the infraspinatus performs relatively little work, it retains outstanding intramuscular fat for a non-loin cut, producing deeply beefy, slightly buttery flavour comparable to ribeye at a fraction of the cost. Individual steaks are typically 200–350 g and 2–3 cm thick — a dimension that fits the air fryer's compact hot-air cabinet well. The air fryer's high-velocity convection at 200–205 °C dries the surface rapidly and drives the Maillard reaction without a dedicated grill or stovetop. Carryover is moderate, typically 2–3 °C after leaving the basket, so pulling 3 °C below the intended serving temperature is standard practice.

## Styckesprofil

Flat iron steak tas från infraspinatus i skulderbladet, separerad från det centrala gristle-bandet som löper genom top blade. Eftersom infraspinatus arbetar lite behåller den enastående intramuskulärt fett för ett icke-ländsnitt, vilket ger djup nötig, något smörig smak jämförbar med ribeye till en bråkdel av priset. Individuella biffar är typiskt 200–350 g och 2–3 cm tjocka – en storlek som passar air fryerns kompakta varmluftsskåp väl. Air fryerns hög-hastighetskonvektion vid 200–205 °C torkar ytan snabbt och driver Maillard-reaktionen utan dedikerad grill eller spis. Eftervärmen är måttlig, vanligtvis 2–3 °C efter uttag från korgen, så att dra 3 °C under avsedd serveringstemperatur är standard.
## Research files by cooking method

- [Air Fryer](./flat_iron-air_fryer.md)
- [Charcoal Grill](./flat_iron-charcoal_grill.md)
- [Grill](./flat_iron-grill.md)
- [Oven Roast](./flat_iron-oven_roast.md)
- [Pan Fry](./flat_iron-pan_fry.md)
- [Pan Sear](./flat_iron-pan_sear.md)
- [Sous Vide](./flat_iron-sous_vide.md)
## Improvement potential

**2567** — rated from scratch on 2026-11-01 against `IMPROVEMENT_POTENTIAL_SYSTEM.md`. The earlier reading is discarded, not adjusted.

| Reduction | Instances | Points | Deducted |
|---|---|---|---|
| Cut file exists | 1 | 128 | 128 |
| Finished cut-method leaves | 0 of 7 | 96 | 0 |
| Stub cut-method leaves | 7 | 8 | 56 |
| Verified recipes in this cut file | 0 | 64 + 32 per group | 0 |
| Verified recipes in the leaves | 0 | 32 + 32 per group | 0 |
| Culinary preferred temperatures of the cut | 0 | 64 | 0 |
| Safe temperatures | 1 | 32 | 32 |
| Meat and fat behaviour at different temperatures — cut file | 0 | 96 per language | 0 |
| Meat and fat behaviour at different temperatures — per leaf | 7 (English) | 32 | 224 |
| Method and tradition description — per leaf | 7 (English) | 32 | 224 |
| Method-specific preferred temperatures — per leaf | 7 (English) | 32 | 224 |
| **Deducted** | | | **888** |

3455 − 888 = **2567**.

**Why the recipes earn nothing.** All 35 recipes in the seven leaves are attributed as *inspired by* cookbook authors, and the seven files together contain no URL at all. A recipe counts only when it is saved from a fetched source and verified as human-created; a reconstruction without a fetched source is not evidence, so the recipe and culinary-group rows stay at zero. This is the largest gap in the file: re-verifying those 35 recipes would remove 1 120 points before any group bonus is counted.

**Why the leaves are stubs.** Each leaf is structurally complete — profile in two languages, five recipes, consensus table, summary — but its recipe research cannot be called concluded while no source is saved and no culinary group is assigned. They therefore take the 8-point stub reduction rather than the 96-point finished one. Reclassifying all seven as finished after re-verification would remove a further 616 points, which is why the recipe work, not the presentation, is what this reading is measuring.

**What was credited.** Every leaf reasons about its method at more than one temperature, which earns the per-leaf behaviour row; every leaf names the traditions its method is common in, which earns the description row; every leaf carries its own temperature consensus, which earns the method-specific preferred-temperature row. All three are English-only, because the Swedish profiles carry no temperature reasoning. The cut file earns the safe-temperature row only: its doneness block is generated data, and it holds no fetched culinary preferred temperature.

### Improvement priorities

1. Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. Method file `flat_iron-air_fryer.md` copies parent cut profile — rewrite `flat_iron-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
