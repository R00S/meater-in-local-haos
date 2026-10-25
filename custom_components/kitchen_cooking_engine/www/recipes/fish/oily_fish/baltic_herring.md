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
quality_score: 6
cooking_methods_researched: 1
quality_assessed: 2026-10-24
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

- [Pan Fry](./baltic_herring-pan_fry.md) — 5 fetched sources (SE ×2, FI-Swedish, Scottish, German); rye-dredged butter fry and oatmeal crust; **Group B now covered**; no source states a pull temperature.
- [Oven Bake](./baltic_herring-oven_bake.md) — 3 fetched sources (SE ×2, FI ×1); strömmingslåda 225 °C; no source states a pull temperature.
- [Smoker](./baltic_herring-smoker.md) — 2 fetched sources (SE ×2); böckling; hot smoke 75–85 °C / cold smoke ~20 °C are process settings, not pull targets.
- [Grill](./baltic_herring-grill.md) — 4 fetched sources (SE ×3 incl. archival, CA ×1); glödstekt/halstrad tradition plus quantified modern recipes (3–5 min per side); registered in `cooking_data.py`.
- [Boil](./baltic_herring-boil.md) — 4 fetched sources (SE archival, FI ×3); kokt saltströmming and Finnish silakkakeitto; registered in `cooking_data.py`.

Method survey completed 2026-10-23, re-verified 2026-10-24: archival documentation (Matkult.se) records the full historical method inventory for strömming — stekning, ugnsbakning, rökning, glödstekt/halstrad, kokning — plus non-thermal preservation (salting, pickling, fermenting surströmming, drying) which are not thermal enum methods. The 2026-10-24 session searched specifically for further thermal methods across traditions (including poach/simmer candidates such as Swedish "sill i dillsås", which is a pickled-product preparation, not a thermal method for fresh strömming) and found none beyond the five; all five thermal methods have a leaf and a `cooking_data.py` entry.

## Quality score

**Score: 6 / 20** — assessed 2026-10-24 (from-scratch reassessment after the 2026-10-24 collection session; supersedes the 2026-10-23 score 3, which itself superseded 2026-05-31 score 6). Eight new fetched sources and the first real temperature evidence were added this session; the deductions below are unchanged in kind from the previous assessment and each remaining row is checked against evidence (HOW_I_INFLATE_CUT_FILES_SCORES_AND_WHY.md Patterns 4 and 8).

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | — (done; 2026-10-24 re-verification searched for further thermal methods across traditions and found none beyond the five; `cooking_methods_researched: 1`) |
| Missing method leaf files | — (none; all 5 declared methods have a leaf) |
| Partial leaf files — source count below 4: oven_bake (3), smoker (2) | −2 |
| Leaf files failing the distinct-tradition gate (documented same-tradition duplication): pan_fry (SE ×2 of 5), grill (SE ×3 of 4), boil (FI ×3 of 4) | −3 |
| Method leaf copies parent cut profile | — (none; all five profiles are method-specific) |
| Missing Culinary Group A tradition | −1 (searches on 2026-10-24 found Pacific-herring Japanese preparations (*nishin*, different species) and pickled-product uses of strömming; no Group A preparation of Baltic herring verified) |
| Missing Culinary Group B tradition | — (**covered 2026-10-24**: Scottish herring-in-oatmeal and German gebratene Heringe/Brathering in pan_fry, Canadian grilled herring in grill) |
| Missing Culinary Group C tradition | −1 (searched 2026-10-24: Caribbean smoked-herring traditions use the smoked product, not fresh-strömming cooking; no Group C fresh-cook preparation verified) |
| Missing Culinary Group D tradition | — (covered: SE/FI sources across all five leaves) |
| Temperature data: safe (63 °C) supported only by generic fish-safety guidance, not strömming-specific sources | −1 (FSA 63 °C via fetched Thermapen UK fish guide; Livsmedelsverket ~70 °C core-temperature guidance via fetched Kontrollwiki; Köket.se fish internal-temperature table fetched but has no herring row; **no source recipe for this cut states any internal temperature**) |
| Temperature data: culinary preferred temps not supported by research evidence | −4 (no doneness target for strömming appears in any fetched source; the Köket.se table's ranges are for other species) |
| Per-method temp data missing | −2 (no leaf carries per-method temperature ranges) |

**Deduction**: −2 (source count) −3 (tradition gate) −2 (Groups A, C) −1 (safe temp generic-only) −4 (preferred temps) −2 (per-method) = **6 / 20**.

Leaves reaching the 4–6-source count this session (pan_fry 5, grill 4, boil 4) still carry `⚠️ PARTIAL RESEARCH` markers because each fails the distinct-tradition gate; they are therefore counted in the −3 row rather than treated as conformant. This cut's preferred-temperature criteria can only pass when a source with an explicit strömming internal temperature or doneness discussion is found.

### Improvement priorities

1. **−6** · Temperature evidence for the doneness model (preferred −4, per-method −2) — search for any strömming/silakka source that states an internal temperature or a sourced doneness discussion (contemporary Swedish or Finnish food media with thermometer guidance). Generic fish guidance is now in hand; the species-specific gap remains.
2. **−3** · Widen tradition spread in the three updated leaves — an Estonian (*keedetud räim* / *praetud räim*), Latvian or German-language strömming source would clear the distinct-tradition gate where the count gate is already met.
3. **−2** · oven_bake and smoker to the 4-source gate (3 and 2 sources today).
4. **−2** · Culinary Groups A and C — name lookups only (no guessed names); 2026-10-24 searches found Pacific-herring and smoked-product traditions but no verified fresh-strömming preparation.

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
