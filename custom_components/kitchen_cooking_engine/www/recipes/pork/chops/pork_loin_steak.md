<!-- KCE:CUT
type: cut
slug: pork_loin_steak
name: Pork Loin Steak
name_sv: Karré
name_da: Kotelet uden ben
category: pork
meat: pig
cut_type: Chops & Tenderloin
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- air_fryer
- braise
- charcoal_grill
- grill
- oven_roast
- pan_fry
- sous_vide
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
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
improvement_potential: 14
cooking_methods_researched: 1 # Method survey 2026-10-26 (enum-wide sweep across culinary traditions): 3 declared methods confirmed (pan_fry, grill, air_fryer) and 4 discovered + registered with leaves (oven_roast, sous_vide, charcoal_grill, braise). Queued single-source leads with fetched evidence but below this pass's leaf bar — pan_sear (RecipeTeacher), oven_broil (America's Test Kitchen), smoker (AmazingRibs), steam (Anova steam oven), slow_cooker (The Country Cook — cut form not confirmed loin), pressure_cooker (Pressure Cooking Today — no temperature) — documented in the branch timeline. Negative searches: poach and saute returned no fetchable cut-specific recipe; simmer only behind a 403 (Allrecipes).
quality_assessed: 2026-10-26
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 3
-->
# Pork Loin Steak — Cut Overview

## Cut profile

Pork loin steak (*koteletsteg* in Danish, *Lendensteak vom Schwein* in German) is cut from the *longissimus dorsi* muscle of the pork loin — the same muscle as a boneless pork chop but without the rib bone. It is lean, uniform in cross-section (typically 2–3 cm thick), and composed primarily of fast-twitch white muscle fibres with minimal intramuscular fat. Because of its lean composition, it dries out faster than shoulder steak and must be pulled at a lower temperature.

### Temperature application by method (from the fetched leaf evidence, 2026-10-26)

| Method | Observed evidence | Application for this cut |
|---|---|---|
| `pan_fry` | 62–65 °C stated across 5 sources (DK/AT/ES), 2 sources silent (JP/UK) | Pull **62–63 °C**, carryover to 63–65 °C; 1.5–4 min/side |
| `grill` | 60–71 °C stated by 3 of 5 sources (AU 70 °C, JM 160 °F, IN 140 °F), 2 silent (KR/MX) | Probe-guided; early-pull tradition lands 60–63 °C, closed-lid traditions push to 71 °C |
| `air_fryer` | 60.4–63 °C (140 °F pull → 145 °F carryover; 145 °F direct), 2 of 4 sources | Pull **140–145 °F (60.4–63 °C)** at 200–204 °C basket, 8–14 min |
| `oven_roast` | 63 °C (145 °F) from 3 of 4 sources, 1 silent (ES) | Pull at **145 °F (63 °C)**, 15–20 min at 200–228 °C |
| `sous_vide` | Primary baths 60–64 °C (ladders 57–71 °C), all 5 sources state bath settings | Bath **60–62 °C**, 45 min–4 h, then 30–60 s/side sear |
| `charcoal_grill` | Stated targets 60–63 °C (140–145 °F), recipe + technique guide | Two-zone 190–204 °C; pull **140 °F**, rest 10 min; brine first |
| `braise` | No internal temperature in either source; time-and-texture endpoints only | Short wet phase on thick steaks; no probe tradition exists in this leaf |

## Styckesprofil

Fläskloin-stek (*koteletsteg* danska, *Lendensteak vom Schwein* tyska) är skuren från *longissimus dorsi*-muskeln i fläskloinen — samma muskel som en benfri fläskkotlett men utan revbensbenet. Den är mager, enhetlig i tvärsnitt (typiskt 2,5–3,5 cm tjockt) och behöver kortare tillagningstid än kotletter.

Pannstekning: 3–4 minuter per sida i smör vid hög värme. Innertemperatur: **63–65 °C (145–149 °F)** USDA (med 3 minuters vila); **70 °C** genomstekt. Eftertillagning: 3–4 °C. Sond insatt horisontellt från sidan in till mitten. Vila 5 minuter täckt.

## Research files by cooking method

- [Air Fryer](./pork_loin_steak-air_fryer.md) — 4 sources (US ×2, UK, AU); ⚠️ distinct-tradition gate open (US ×2)
- [Braise](./pork_loin_steak-braise.md) — 2 sources (US, CN); ⚠️ below 4-source count
- [Charcoal Grill](./pork_loin_steak-charcoal_grill.md) — 1 exact-cut recipe + 1 technique guide (US); ⚠️ below count and single-tradition
- [Grill](./pork_loin_steak-grill.md) — 5 sources (AU, KR, JM, MX, IN); ✅ both gates met
- [Oven Roast](./pork_loin_steak-oven_roast.md) — 4 sources (US ×3, ES); ⚠️ distinct-tradition gate open (US ×3)
- [Pan Fry](./pork_loin_steak-pan_fry.md) — 5 sources (DK, AT, ES, JP, UK); ✅ both gates met
- [Sous Vide](./pork_loin_steak-sous_vide.md) — 5 sources (US ×4, UK); ⚠️ distinct-tradition gate open (US ×4)

Survey leads **not yet leafed** (queued, evidence in the branch timeline): `pan_sear`, `oven_broil`, `smoker`, `steam`, `slow_cooker`, `pressure_cooker` — each has one fetched recipe with the cut-form caveat noted there. Negative searches this pass: `poach`, `saute` (no fetchable cut-specific recipe), `simmer` (only a 403).

## Improvement potential

| Criterion | Points |
|-----------|----------|
| Cooking methods not researched | — (seven-method survey completed 2026-10-26; enum-wide sweep with documented negative searches and queued leads in the frontmatter comment; `cooking_methods_researched: 1`) |
| Missing method leaf files | — (none among the 7 declared methods; the six single-source survey leads are documented as queued above and are not declared, so this row counts declared methods honestly) |
| Method leaf copies parent cut profile | — (none; all seven profiles are method-specific) |
| Missing Culinary Group A tradition | — (**covered**: Japanese tonteki in pan_fry; Korean BBQ and Indian tandoori in grill; Chinese red-braise in braise) |
| Missing Culinary Group B tradition | — (covered: Denmark, Austria, Spain, UK in pan_fry; Australia, Mexico in grill; US across four leaves) |
| Missing Culinary Group C tradition | — (**covered**: Caribbean/Jamaican jerk in grill) |
| Missing Culinary Group D tradition | — (covered: Danish two-phase butter baste in pan_fry) |
| Temperature data: USDA safe temperature supported by cut-specific research evidence | — (covered: oven_roast's three sources state 145 °F for this exact cut; air_fryer states 145 °F with a 140 °F pull; grill states 70 °C; pan_fry's Danish/Austrian/Spanish sources state 62–65 °C cores — all fetched) |
| Temperature data: culinary preferred temps supported by research evidence | — (covered: pan_fry 62–65 °C cluster, grill 60–71 °C span, sous_vide 60–64 °C primary baths, charcoal_grill 60–63 °C targets — per-method bands from fetched sources) |
| Per-method temp data missing | — (the cut profile body above now carries the per-method application table; every leaf carries its own temperature consensus) |

**Remaining wall evidence — none claimed.** All six failed rows are ordinary incomplete collection, not hard walls: the US-heavy corpora for air_fryer, oven_roast, sous_vide and charcoal_grill are what these English-language appliance/precision-cooking ecosystems publish, but non-US sources for every one of them are plainly fetchable (a Filipino or Korean air-fryer chop, a European oven-chop, a French/Dutch/Japanese sous-vide publication, an Argentine *asado* or Korean *gogigui* charcoal source), and braise needs two more traditions. None of these rows carries a user-approved exception; all are open work.

### Improvement priorities

1. **−1 each** · Break the US duplication in `sous_vide` (US ×4), `oven_roast` (US ×3), `air_fryer` (US ×2) and `charcoal_grill` — fetch one or two sources from continental Europe / East Asia / Latin America per leaf.
2. Raise `braise` from 2 sources to 4 and `charcoal_grill` from 1+guide to 4 (Korean, Argentine, South African or Japanese charcoal traditions are the plausible homes).
3. **Queue** · Leaf the six surveyed single-source leads (`pan_sear`, `oven_broil`, `smoker`, `steam`, `slow_cooker`, `pressure_cooker`), widening each to the 4-source gate as it is written.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
