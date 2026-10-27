<!-- KCE:CUT
type: cut
slug: lamb_cutlet
name: Lamb Cutlet
name_sv: Lammkotlett
name_da: Lammekotelet
category: lamb
meat: lamb
cut_type: Chops
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- pan_fry
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
improvement_potential: 17
cooking_methods_researched: 1 # 2026-10-24: survey completed and recorded below — grill and pan_fry each have a gate-meeting leaf; remaining enum methods dispositioned as leads.
quality_assessed: 2026-10-24
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 2
-->
# Lamb Cutlet — Cut Overview

## Cut profile

Lamb cutlets (thin, Frenched rib chops) are the most refined lamb cut — a single rib bone with the meat formed into a small medallion. They are a bistro classic in France and the UK, a restaurant staple in Australia and New Zealand, and are popular as party food throughout the Middle East and South Asia. Cooking time is very brief — 2–3 minutes per side — making them ideal for a pan with butter basting.

Target: **52–57 °C (126–135 °F)** for medium-rare. They overcook rapidly given their thin cross-section.

## Styckesprofil

Lammfilékotletter (tunna, Frenchade ryggkotletter) är det mest förfinade lammskivesnittet — ett enskilt revbenslben med köttet format till en liten medaljon. De är ett bistroklassiker i Frankrike och UK, ett restaurangmärke i Australien och Nya Zeeland, och populärt festmat i Mellanöstern och Sydasien.

Sear vid hög värme, 2–3 minuter per sida. Sond in i den tjockaste muskeldelen borta från benet. Innertemperatur: **57–63 °C (135–145 °F)** för medium-rare till medium. Eftertillagning: 2–3 °C. Vila täckt 3–5 minuter. Tunnare snitt (< 2 cm) kokar mer sällan än tjockare snitt.

## Research files by cooking method

- [Grill](./lamb_cutlet-grill.md) — five fetched sources (Indian, Turkish, Moroccan, Greek, Korean); two publish a target reading (125 °F; 135–145 °F).
- [Pan Fry](./lamb_cutlet-pan_fry.md) — five fetched sources (Indian, Cantonese, Turkish, Australian, Greek); two publish a target reading (135 °F; 145–150 °F). Rebuilt 2026-10-24 after all three previous source URLs returned 404.

Both declared methods have a leaf and both meet the 4–6-source gate. No source in either leaf uses
a butter-basting finish, so the parent cut file's "butter basting" sentence is not supported by the
fetched record and should be treated as inherited text until a source is found.

## Method inventory — 2026-10-24 (completed survey)

| Enum method | Disposition |
|---|---|
| grill | leaf, five fetched recipes (Groups A, B, C) |
| pan_fry | leaf, five fetched recipes (Groups A, B, C) |
| oven_roast, oven_broil | no cutlet-specific recipe fetched; large bone-in racks are a different format — recorded as a lead |
| braise, simmer, poach, boil | no cutlet recipe fetched; the cut is too thin for a wet cook to be traditional in any source read |
| smoker, air_fryer, sous_vide, pressure_cooker, slow_cooker, saute, pan_sear, steam | no species- and cut-specific recipe fetched; recorded as uncollected leads, not as absence |

`cooking_methods_researched: 1` records that both declared methods have gate-meeting leaves and the
rest of the enum has been dispositioned. It does not claim the oven and smoker surveys are
exhausted.

## Improvement potential

**Improvement potential: 17 / 20** — assessed 2026-10-24 (from-scratch recount; supersedes 8 recorded 2026-04-26, which deducted −8 for an unstarted survey, −1 for a missing grill leaf, −2 for missing Groups A and C, and −1 for a copied profile — all four now resolved). Self-assessed (HOW_I_INFLATE_CUT_FILES_AND_WHY.md Pattern 4).

| Criterion | Points |
|-----------|----------|
| Cooking methods researched (`cooking_methods_researched: 1`, inventory above) | — |
| Missing declared method leaves (0 of 2 missing) | — |
| Leaves below the 4–6-source gate (grill 5, pan_fry 5) | — |
| Culinary Group A (Indian, Cantonese) and Group C (Turkish, Moroccan) | — |
| No Culinary Group D tradition (Nordic/Baltic lamb cutlet recipe not fetched) | −1 |
| Recommended doneness `medium_rare` (54 °C) sits below every fetched reading (57 °C; 63–66 °C) | −1 |
| Published endpoints span 125–150 °F across the two leaves with no measured third tradition to reconcile them | −1 |
| Cut profile anatomy | — (anatomical profile present) |
| Method-file duplication of the parent profile (pan_fry re-profiled 2026-10-24) | — |

### Improvement priorities

1. **−1** · The recommendation and the evidence disagree: either find a source that recommends 54 °C for cutlets or move `recommended_doneness` up to medium. This is a cut-level decision, not a text edit.
2. **−1** · Reconcile the 125–150 °F spread with a measured source from a third tradition (e.g. a US test-kitchen page with a probe target).
3. **−1** · Culinary Group D is unrepresented; no Nordic or Baltic cutlet recipe has been fetched.
4. Note: the parent's "butter basting" and the pan-fry leaf's butter-free record do not match; either find a basting source or amend the profile sentence.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
