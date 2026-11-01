<!-- KCE:CUT
type: cut
slug: ground_lamb
name: Ground Lamb
name_sv: Lammfärs
name_da: Hakket lammekød
category: lamb
meat: lamb
cut_type: Ground
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- grill
- oven_bake
- pan_fry
- simmer
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
improvement_potential: 2495
cooking_methods_researched: 0 # Survey 2026-10-24 found +2 methods (oven_bake, simmer, both registered with leaves), but enum inventory still has plausible unverified leads (braise, saute, air_fryer, sous_vide, and dumpling-bound mince preparations) — stays 0 until collected or ruled out.
quality_assessed: 2026-10-24
rest_time_min: 2
rest_time_max: 3
carryover_temp_c: 2
-->
# Ground Lamb — Cut Overview

## Cut profile

Ground (minced) lamb is used in countless traditions — from Middle Eastern kibbeh and North African merguez to Greek moussaka, Indian keema, and Turkish Adana kebab.

**Anatomy**: ground lamb is not one muscle but the carcass's trim — typically shoulder, breast, flank and leg trimmings — passed through a grinder plate and usually set at 15–25 % fat. What defines the cut is the grind itself: mincing destroys the muscle structure that gives whole cuts their temperature gradient, multiplies the surface area many times over, and (in commercially minced meat) distributes surface bacteria through the whole mass. That is why ground lamb carries a higher contamination risk than whole cuts and must be cooked completely — no pink centre. It is also why the aromatics sautéed with the mince (onion, garlic, and each tradition's spice canon) are as important to the finished dish as the meat itself, and why fat content governs the result: lean mince dries in minutes, while 15–25 % fat keeps it moist and self-basting.

**Temperature targets**: USDA safe internal for ground meats is **71 °C / 160 °F** — the value registered in this file's frontmatter and in `cooking_data.py`. (The earlier claim here of "74 °C (165 °F) for food-safe ground lamb" contradicted both and has been corrected 2026-10-24.) The single measured source in this collection cooks its keema filling to **72 °C / 161 °F**, just above the safe line. No fetched source treats ground lamb as a pink-cooking meat; `well_done` (71 °C target) is the only doneness target supported by evidence.

## Styckesprofil

Malet lamm används i otaliga traditioner — kibbeh, merguez, moussaka, keema, köfte. Pannstekning kräver fullständig genomkokning. Det höga fettinnehållet i malet lamm (15–25 %) gör beredningen mer smakrik och fuktig men ökar stänk i pannan.

Tillagning tills köttet är helt genomstekt och lätt brynnat. Innertemperatur: **71 °C (160 °F)** enligt USDA för malet kött (det tidigare påstådda 72–75 °C stämde inte med filens eget data och rättades 2026-10-24). Eftertillagning: 2–3 °C. Sond in i tjockaste delen av biff eller köttfärsklump. Gäller för alla former av malet lamm (löst, biffar, köfte).

## Research files by cooking method

- [Pan Fry](./ground_lamb-pan_fry.md) — ⚠️ partial, 2 fetched sources (RU kotlety, IN keema filling with the collection's only stated endpoint 72 °C/161 °F); rebuilt 2026-10-24 after source-integrity repair
- [Grill](./ground_lamb-grill.md) — ⚠️ partial, 1 fetched source (TR Adana kebab on charcoal)
- [Oven Bake](./ground_lamb-oven_bake.md) — ⚠️ partial, 1 fetched source (GR moussaka) + 1 unverified lead (TR kıymalı patates) — **new method 2026-10-24**
- [Simmer](./ground_lamb-simmer.md) — ⚠️ partial, 1 fetched source (IN keema matar) — **new method 2026-10-24**
## Improvement potential

2495

### Improvement priorities

1. Raise the leaves to the 4–6-source gate: oven_bake (+3 — kibbeh bil sanieh, shepherd's pie, baked kibbeh), grill (+3 — Lebanese kafta and other kebab traditions), simmer (+3), pan_fry (+2).
2. Verify or rule out remaining enum methods — braise, saute, air_fryer, sous_vide, and dumpling-bound mince (manti/khinkali boil or steam) — then re-assess `cooking_methods_researched`.
3. Deepen the temperature record: the collection has exactly one measured ground-lamb endpoint (72 °C). Sources with explicit targets (or explicit pink-mince practice, if any tradition has it) are the highest-value additions.
4. Collect the labelled leads: the redirected Swasthi keema-curry page and the Turkish kıymalı patates bake (once lamb mince is verifiable).

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
