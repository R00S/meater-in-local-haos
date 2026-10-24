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
quality_score: 8
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
## Quality score

**Score: 8 / 20** — assessed 2026-10-24. From-scratch reassessment on the deduction
scale (no anchoring to the previous number — inflation doc Patterns 4 and 9). The four
fixes the 2026-04-26 table listed (missing grill leaf, Group D, anatomy, pan_fry profile
copy) are all done; the number coincides only because the old table's −4 of leaf-level
fixes is replaced by −4 of partial-leaf deductions.

| Criterion | Deduction | Evidence |
|-----------|-----------|----------|
| Cooking methods not researched (`cooking_methods_researched: 0`) | −8 | Survey 2026-10-24 found and registered 2 methods beyond the declared list (oven_bake — GR moussaka; simmer — IN keema matar), but the enum inventory is not complete: braise, saute, air_fryer, sous_vide and dumpling-bound mince preparations (manti, khinkali) remain plausible and unverified. Field stays 0 until collected or cleanly ruled out. |
| Partial leaves (< 4 fetched sources): pan_fry (2), grill (1), oven_bake (1), simmer (1) | −4 | −1 per partial leaf (branch convention). All 4 leaves are partial. |

**Total deduction −12 → 8/20.** Criteria checked with evidence and receiving **0 deduction**:

- **Culinary Groups A/B/C/D all covered** — A: Indian keema (pan_fry filling, simmer); B: Greek moussaka (oven_bake); C: Turkish Adana kebab (grill); D: Russian kotlety (pan_fry). The 2026-04-26 Group D gap is closed.
- `## Cut profile` now carries anatomy (trim origins, grinder mechanics, 15–25 % fat, contamination logic) — the old −1 is retired.
- Method leaf files exist — 4 of them (grill created and oven_bake/simmer registered 2026-10-24).
- **USDA safe temperature supported by research evidence** — the Swasthi keema-filling source states an explicit **72 °C / 161 °F** doneness figure; the profile's incorrect 74 °C / 165 °F claim was corrected to the registered 71 °C / 160 °F ground-meat standard.
- **Culinary preferred temperatures supported by research evidence** — the only doneness target (`well_done` 71 °C) is exercised by the measured 72 °C source and by every source's complete-cooking practice.
- Per-method temperature nuance carried by each leaf's own consensus section.
- No description copy-paste: `ground_lamb-pan_fry.md`'s profile was rewritten method-specific (the old −1 is retired) and every leaf's `## Cut profile` is now distinct.

**Source-integrity repair (2026-10-24):** the old `ground_lamb-pan_fry.md` recorded three recipes "via web search" with invented probe/final temperatures ("Verify 74 °C", "Final temperature: 74–76 °C"). Re-fetching showed the Nefisyemektarifleri record is an oven-baked dish with mince of unspecified species, the IndianHealthyRecipes /keema/ URL now serves a different recipe, and the BBC Good Food moussaka page is subscription-walled. All three records and their invented temperatures were removed; replacements are fetched pages, with the two redirected/unverifiable ones retained as labelled leads.

### Improvement priorities

1. Raise the leaves to the 4–6-source gate: oven_bake (+3 — kibbeh bil sanieh, shepherd's pie, baked kibbeh), grill (+3 — Lebanese kafta and other kebab traditions), simmer (+3), pan_fry (+2).
2. Verify or rule out remaining enum methods — braise, saute, air_fryer, sous_vide, and dumpling-bound mince (manti/khinkali boil or steam) — then re-assess `cooking_methods_researched`.
3. Deepen the temperature record: the collection has exactly one measured ground-lamb endpoint (72 °C). Sources with explicit targets (or explicit pink-mince practice, if any tradition has it) are the highest-value additions.
4. Collect the labelled leads: the redirected Swasthi keema-curry page and the Turkish kıymalı patates bake (once lamb mince is verifiable).

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
