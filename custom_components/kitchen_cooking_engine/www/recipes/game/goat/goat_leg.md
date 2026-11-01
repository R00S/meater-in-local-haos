<!-- KCE:CUT
type: cut
slug: goat_leg
name: Goat Leg Roast
name_sv: Getlår
name_da: Gedekølle
category: game
meat: goat
cut_type: Goat
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- braise
- grill
- oven_roast
- pressure_cooker
- slow_cooker
doneness:
- name: medium_rare
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
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
  recommended: true
improvement_potential: unrated
cooking_methods_researched: 0 # Survey 2026-10-24 found +2 methods (grill, pressure_cooker, both registered with leaves), but enum inventory still has plausible unverified leads (smoker, sous_vide, boil/steam for bone-in leg pieces) — stays 0 until collected or ruled out.
quality_assessed: 2026-10-24
rest_time_min: 15
rest_time_max: 30
carryover_temp_c: 8
-->
# Goat Leg Roast — Cut Overview

## Cut profile

Whole goat leg (*Capra hircus*) is the hind limb, comprising the femur and the major muscles: *biceps femoris*, *semimembranosus*, *semitendinosus*, and *quadriceps femoris*. Unlike lamb leg — which can be served pink at 60–65 °C — goat leg has more connective tissue and a more assertive, gamey fat profile; most culinary traditions prefer it cooked to 75–82 °C where the connective tissue has softened and the stronger flavour compounds have mellowed. Marinating in acid (yoghurt, wine, buttermilk, citrus) before cooking is strongly recommended to reduce gaminess and tenderise the outer muscle layers.

Goat leg is a defining ingredient in Caribbean (curried goat), West African (pepper soup, oven-roasted), Greek (katsiki sto fourno), and Middle Eastern (whole roast with spices) festive cooking.

## Styckesprofil

Hel getlägg (*Capra hircus*) är baklemmen, bestående av lårbenet och de stora musklerna: *biceps femoris*, *semimembranosus*, *semitendinosus* och *quadriceps femoris*. Till skillnad från lammbenet — som kan serveras rosa vid 60–65 °C — har getbenet mer bindväv och en mer kraftfull, viltig fettprofil.

De flesta kulinariska traditioner föredrar getbenet tillagat till 75–82 °C där bindväven har mjuknat och smakens viltighet mildrats. Vid dessa temperaturer har köttet fortfarande struktur — det är inte fall-från-benet-mörat om det inte tillagas ännu längre (88+ °C). Innertemperatur: **75–82 °C** (167–180 °F). Eftertillagning: 3–5 °C.

## Research files by cooking method

- [Oven Roast](./goat_leg-oven_roast.md) — ✅ gate met, 4 fetched sources (DE, GR, RU, IN/PK); guidance 70–74 °C; integrity-repaired 2026-10-24
- [Braise](./goat_leg-braise.md) — ⚠️ partial, 3 fetched sources (JM curry goat, MX birria, EC seco de chivo)
- [Slow Cooker](./goat_leg-slow_cooker.md) — ⚠️ partial, 2 fetched sources (JM, IN)
- [Grill](./goat_leg-grill.md) — ⚠️ partial, 2 fetched sources (JM indirect charcoal, US butterflied 135–140 °F) — **new method 2026-10-24**
- [Pressure Cooker](./goat_leg-pressure_cooker.md) — ⚠️ partial, 1 fetched source (Caribbean Instant Pot) — **new method 2026-10-24**
## Improvement potential

Not yet rated under the current system — read the criteria in `IMPROVEMENT_POTENTIAL_SYSTEM.md` and record a reading before using this file to order the queue.

happens to coincide but the basis is different: the old table deducted for missing leaves
under a different rule and counted Group A/D gaps that are now closed).

- **Culinary Groups A/B/C/D all covered** — A: Indian-Pakistani raan (oven_roast), Indian slow-cooker curry (slow_cooker); B: German (oven_roast), Greek (oven_roast), US (grill), Mexican (braise); C: Jamaican/Caribbean (braise ×2, slow_cooker, grill, pressure_cooker); D: Russian (oven_roast). The 2026-04-27 Group A and D gaps are closed.
- `## Cut profile` present with anatomical placement (femur, biceps femoris, semimembranosus, semitendinosus, quadriceps femoris).
- Method leaf files exist — 5 of them (braise and slow_cooker created 2026-10-24, grill and pressure_cooker new methods).
- **USDA safe temperature supported by research evidence** — oven_roast leaf carries explicit internal guidance (≈70 °C Greek goat guidance; 160–165 °F fork-tender guidance in the raan source); the grill leaf's 135–140 °F pull is recorded as published below-safe divergence.
- **Culinary preferred temperatures supported by research evidence** — measured guidance lands 70–74 °C (well_done band) for long-roast practice; the US grill source publishes a 57–60 °C medium-rare target as deliberate divergence. Both are recorded as published.
- Per-method temperature nuance carried by each leaf's own consensus section.
- No description copy-paste: every leaf's `## Cut profile` is method-specific.

**Source-integrity repair (2026-10-24):** the previous `goat_leg-oven_roast.md` contained invented pull/final temperatures ("Verify 80 °C", "Pull at 80–82 °C", "Final temperature: 82–85 °C", a synthesised pull-range table) that no source published, a transcription of "asun" that did not match the fetched African Bites page at all (the real page boils smoked goat pieces, broils and stir-fries them — not a leg roast), and the seco de chivo stovetop braise misfiled as oven roast. All invented temperatures are removed; the fabricated asun record is removed (real page recorded as a lead for another method); seco de chivo now lives in `goat_leg-braise.md`.

### Improvement priorities

1. **Reconcile the doneness recommendation**: the frontmatter says `recommended_doneness: well_done` while the `doneness` block marks `medium_rare` as `recommended: true`. The oven-roast evidence supports well-done; the grill evidence shows a real medium-rare tradition. Decide deliberately.
2. Verify or rule out remaining enum methods — smoker, sous_vide, boil/steam for leg pieces — then re-assess `cooking_methods_researched`.
3. Raise the four partial leaves to the 4–6-source gate: pressure_cooker (+3), grill (+2), slow_cooker (+2), braise (+1).
4. Resolve the grill-leaf doneness split (Caribbean tenderness vs US 135–140 °F medium-rare) with more traditions before any method-specific temperature band is committed.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
