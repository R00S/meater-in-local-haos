<!-- KCE:CUT
type: cut
slug: baltic_herring
name: Baltic Herring
name_sv: Strömming
name_da: Østersøsild
category: fish
meat: oily_fish
cut_type: Oily Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
- oven_bake
- smoker
- grill
- boil
doneness:
- name: medium
  target_c: 57
  target_f: 135
  min_c: 54
  min_f: 130
  max_c: 60
  max_f: 140
  usda_safe: false
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 68
  max_f: 154
  usda_safe: true
  recommended: true
quality_score: 3
cooking_methods_researched: 1
quality_assessed: 2026-10-23
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Baltic Herring — Cut Overview

## Cut profile

Baltic herring (Clupea harengus membras) is the subspecies of Atlantic herring native to the Baltic Sea. It is smaller and leaner than Atlantic herring but cooks in broadly the same manner: gutted whole or as butterflied "flundra" (butterfly-opened fillet). The classic Swedish preparation is strömmingsflundra — two butterflied halves folded together around a filling of parsley and leek, then baked or pan-fried. The smaller size (typically 15–25 cm, 40–80 g whole) means cooking times are very short. Probe placement, if used, targets the thickest part of the joined fillets. Sources do not typically cite internal temperatures; visual cues (opaque flesh, set skin) and time are used. Carryover is minimal. Baltic herring is the defining fish of the Nordic region and Scandinavian cuisine in particular.

## Styckesprofil

Strömming (Clupea harengus membras) är underarten av atlantisk sill som är inhemsk i Östersjön. Den är mindre och magrare än atlantisk sill men tillagas i stort sett på samma sätt: hel rensad eller som strömmingsflundra (fjärilsöppnad filé). Den klassiska svenska beredningen är strömmingsflundra — två sammanfällda halvor med fyllning av persilja och purjolök, sedan gräddade eller stekta. Den mindre storleken (typiskt 15–25 cm, 40–80 g hel) innebär mycket korta tillagningstider. Sond placeras, om den används, i tjockaste partiet av de hopsatta filéerna. Källor anger vanligtvis inte innertemperatur; visuella tecken (ogenomskinligt kött, satt skinn) och tid används. Eftervärme är minimal. Strömming är den definierande fisken i det nordiska köket och i synnerhet den svenska mattraditionen.

## Research files by cooking method

- [Pan Fry](./baltic_herring-pan_fry.md) — 3 fetched sources (SE ×2, FI ×1); rye-dredged butter fry; no source states a pull temperature.
- [Oven Bake](./baltic_herring-oven_bake.md) — 3 fetched sources (SE ×2, FI ×1); strömmingslåda 225 °C; no source states a pull temperature.
- [Smoker](./baltic_herring-smoker.md) — 2 fetched sources (SE ×2); böckling; hot smoke 75–85 °C / cold smoke ~20 °C are process settings, not pull targets.
- [Grill](./baltic_herring-grill.md) — 1 fetched source (SE archival); glödstekt/halstrad tradition; newly discovered method, registered in `cooking_data.py`.
- [Boil](./baltic_herring-boil.md) — 1 fetched source (SE archival); kokt saltströmming tradition; newly discovered method, registered in `cooking_data.py`.

Method survey completed 2026-10-23: archival documentation (Matkult.se) records the full historical method inventory for strömming — stekning, ugnsbakning, rökning, glödstekt/halstrad, kokning — plus non-thermal preservation (salting, pickling, fermenting surströmming, drying) which are not thermal enum methods. All five thermal methods now have a leaf and a `cooking_data.py` entry.

## Quality score

**Score: 3 / 20** — assessed 2026-10-23 (from-scratch reassessment; supersedes 2026-05-31 score 6). The score fell despite substantial content improvement because the previous assessment omitted the temperature-evidence deductions (HOW_I_INFLATE_CUT_FILES_SCORES_AND_WHY.md Pattern 8: unchecked criteria marked as passing). Self-assessed at creation time (Pattern 4) — treat as an initial estimate.

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | — (done: survey found and registered `grill` + `boil` beyond the auto-populated list; non-thermal preservation methods documented as out of scope; `cooking_methods_researched: 1`) |
| Missing method leaf files | — (none; all 5 declared methods have a leaf) |
| Partial leaf files (< 4 verified sources): pan_fry (3), oven_bake (3), smoker (2), grill (1), boil (1) | −5 |
| Method leaf copies parent cut profile | — (none; all five profiles are method-specific) |
| Missing Culinary Group A tradition | −1 (no verified East Asian source located; strömming is a Baltic Sea fish but no search documented a Group A preparation) |
| Missing Culinary Group B tradition | −1 (no verified Western/Central European source located; same-tradition Nordic duplication is pervasive across all leaves) |
| Missing Culinary Group C tradition | −1 (no verified Group C source located) |
| Missing Culinary Group D tradition | — (covered: SE/FI sources across all five leaves) |
| Temperature data: safe (63 °C) not supported by research evidence | −3 (no source in the collection states any internal temperature; the leaves record the published absences — this is the collection's biggest flaw) |
| Temperature data: culinary preferred temps not supported by research evidence | −4 (no doneness target appears in any fetched source) |
| Per-method temp data missing | −2 (no leaf carries per-method temperature ranges) |

**Deduction**: −5 (partial leaves) −3 (Groups A/B/C) −3 (safe temp) −4 (preferred temps) −2 (per-method) = **3 / 20**.

Same-tradition duplication (SE ×2 in pan_fry, oven_bake, smoker) is pervasive and already reflected in the Group deductions and partial-leaf status; no separate row is applied. This cut's temperature criteria can only pass when a source with explicit internal-temperature data is found or the cut profile gains sourced safe-temperature discussion.

### Improvement priorities

1. **−9** · Temperature evidence (safe −3, preferred −4, per-method −2) — search for any baltic-herring/strömming source that states an internal temperature or a sourced doneness discussion (e.g. contemporary Swedish food-media or Finnish sources with thermometer guidance). This single gap dominates the score.
2. **−5** · Bring each partial leaf to the 4–6-source gate — starting with grill and boil (1 source each, archival method documentation only).
3. **−1 each** · Culinary Groups A, B, C — search for preparations equivalent by name lookup only (no guessed names); Group B (German/Dutch herring traditions) is the most likely recoverable.

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
