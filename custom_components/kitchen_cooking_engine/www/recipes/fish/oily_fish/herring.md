<!-- KCE:CUT
type: cut
slug: herring
name: Herring
name_sv: Sill
name_da: Sild
category: fish
meat: oily_fish
cut_type: Oily Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
- grill
- oven_bake
- smoker
- braise
- pressure_cooker
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
improvement_potential: 10
cooking_methods_researched: 0
quality_assessed: 2026-10-25
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Herring — Cut Overview

## Cut profile

Herring (Clupea harengus) is a small, highly oily pelagic fish found widely in the North Atlantic and Baltic. For hot-cooking purposes the fish is typically used whole (gutted, scaled) or as butterflied fillets — the very thin bones and rich fat content make it a fast-cooking fish. The high fat content (up to 15–20 g per 100 g depending on season and origin) self-bastes during pan-frying and grilling, producing crispy skin and moist flesh at modest temperatures. Overcooking above about 68 °C produces a dry, crumbly texture. Because herring is a small fish, probe placement targets the thickest cross-section behind the shoulder, clear of the spine. Carryover is low (1–2 °C) due to small mass. Herring is central to Nordic, German, Dutch, and Eastern European cuisines and carries distinct flavour identities across culinary traditions.

## Styckesprofil

Sill (Clupea harengus) är en liten, mycket fet pelagisk fisk utbredd i Nordatlanten och Östersjön. Vid varmtillagning används fisken typiskt hel (rensad, fjällad) eller som flundra (fjärilsöppnad filé) — de tunna benen och det höga fettinnehållet gör den till en snabb fisk att tillaga. Det höga fettinnehållet (upp till 15–20 g per 100 g beroende på säsong och ursprung) självbastar under stekning och grillning, vilket ger krispigt skinn och saftigt kött vid måttliga temperaturer. Överstekning över ca 68 °C ger torrt, smulande kött. Sond placeras i tjockaste partiet bakom skuldran, fri från ryggbenet. Eftervärme är låg (1–2 °C) pga liten massa. Sill är central i nordiska, tyska, holländska och östeuropeiska kök och bär distinkta smakidentiteter i olika kulinariska traditioner.

## Research files by cooking method

- [Pan Fry](./herring-pan_fry.md) — ✅ Done — 4 fetched sources (Swedish, Russian, Japanese, Faroese), 4 distinct national traditions; no source states a temperature (completed 2026-10-25)
- [Grill](./herring-grill.md) — ✅ Done — 4 fetched sources (British, Japanese, Russian, Egyptian), all four culinary groups; no source states a temperature (completed 2026-10-25)
- [Oven Bake](./herring-oven_bake.md) — ✅ Done — 4 fetched sources (British, Russian, US-published, Swedish); no source states a temperature; Groups A and C still absent from this leaf (completed 2026-10-25)
- [Smoker](./herring-smoker.md) — ⚠️ Partial — 1 fetched source, below the 4–6 gate
- [Braise](./herring-braise.md) — ⚠️ Partial — 1 fetched source, below the 4–6 gate
- [Pressure Cooker](./herring-pressure_cooker.md) — ✅ Done — 4 fetched sources (Japanese, Korean, Russian, United States), 4 distinct national traditions, Groups A/B/D; no source states a temperature; no Group C source found for this method (completed 2026-10-25)

## Improvement potential

The per-method missing-leaf penalty is not applied because all six declared methods have leaves. Leaf temperature analysis remains explicitly invalid until each source collection meets the 4–6-source gate; no inferred temperature was added.

### Improvement priorities

1. Continue the broad method survey across traditions and methods; keep `cooking_methods_researched: 0` until the survey is genuinely thorough. This is the largest single point and is deliberately left in place: to clear it the survey must establish that the six declared methods (`pan_fry`, `grill`, `oven_bake`, `smoker`, `braise`, `pressure_cooker`) are the complete supported set — which means checking, with fetched evidence, whether the other enum methods (e.g. `poach`, `simmer`, `steam`, `sous_vide`, `boil`, `pan_sear`) are or are not used for herring. If any is genuinely used it must be added to `methods:` and given its own leaf, which adds partial-leaf gaps until those collections also reach 4–6 sources. Do not set `cooking_methods_researched: 1` merely to raise the number (Patterns 7/9).
2. Two leaves are still partial — `smoker` and `braise`, one fetched source each; expand each verified collection toward 4–6 sources from distinct traditions. `pressure_cooker` clears the gate but still has no Group C source; close that gap in a later pass as a stated gap, not a point.
3. `oven_bake` now clears the source gate but still carries no Group A or Group C source; close that collection gap in a later pass — it is a gap to state, not a point under the criteria above. Across all leaves, keep seeking independently sourced safety and culinary temperature evidence; these are research gaps, not quantified points, and no temperature may be inferred before a leaf passes the 4–6-source gate.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
