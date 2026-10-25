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
quality_score: 7
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
- [Grill](./herring-grill.md)
- [Oven Bake](./herring-oven_bake.md)
- [Smoker](./herring-smoker.md)
- [Braise](./herring-braise.md)
- [Pressure Cooker](./herring-pressure_cooker.md)

## Quality score

**Score: 7 / 20** — reassessed 2026-10-25 (was 6 on 2026-10-24); deduction scale unchanged

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not fully researched (`cooking_methods_researched: 0`) | −8 |
| Partial leaf `herring-grill.md` (3 fetched recipes, below 4–6) | −1 |
| Partial leaf `herring-oven_bake.md` (3 fetched recipes, below 4–6) | −1 |
| Partial leaf `herring-smoker.md` (1 fetched recipe, below 4–6) | −1 |
| Partial leaf `herring-braise.md` (1 fetched recipe, below 4–6) | −1 |
| Partial leaf `herring-pressure_cooker.md` (1 fetched recipe, below 4–6) | −1 |
| Missing method leaves | — (`braise` and `pressure_cooker` leaves created and registered this session) |
| Missing Culinary Group A across cut leaves | — (Cookpad JP in grill and pan_fry) |
| Missing Culinary Group B | — (UK sources in grill/oven bake; Swedish pan-fry) |
| Missing Culinary Group C | — (Caribbean braise) |
| Missing Culinary Group D | — (Russian grill/pan-fry; Nordic sources) |

Current score: 20 − 8 − 5 = **7/20** (reassessed 2026-10-25; `pan_fry` left the partial set after gaining a 4th distinct-tradition source — Faroese — and is now ✅ conformant). The collection has 5 partial leaves and the method survey is still incomplete (−8); Groups A/B/C/D are represented by at least one verified leaf. No independent recipe evidence supports the safety or doneness values, but the repository scoring criteria deduct only for a missing `## Cut profile`, missing anatomy, missing method research, absent method leaves, missing groups, missing temperature evidence, and description duplication. Do not invent extra score deductions; retain the temperature evidence gap as an unquantified priority.

The per-method missing-leaf penalty is not applied because all six declared methods have leaves. Leaf temperature analysis remains explicitly invalid until each source collection meets the 4–6-source gate; no inferred temperature was added.

### Improvement priorities

1. **−8** · Continue the broad method survey across traditions and methods; keep `cooking_methods_researched: 0` until the survey is genuinely thorough. This is the largest single deduction and is deliberately left in place: to clear it the survey must establish that the six declared methods (`pan_fry`, `grill`, `oven_bake`, `smoker`, `braise`, `pressure_cooker`) are the complete supported set — which means checking, with fetched evidence, whether the other enum methods (e.g. `poach`, `simmer`, `steam`, `sous_vide`, `boil`, `pan_sear`) are or are not used for herring. If any is genuinely used it must be added to `methods:` and given its own leaf, which adds partial-leaf deductions until those collections also reach 4–6 sources. Do not set `cooking_methods_researched: 1` merely to raise the score (Patterns 7/9).
2. **−6** · All six method leaves are partial; expand verified collections toward 4–6 sources from distinct traditions per leaf.
3. Expand source collections and seek independently sourced safety and culinary temperature evidence. These are research gaps, not additional quantified score deductions under the criteria applied above; do not infer temperatures or analyze a leaf before it passes the 4–6-source gate.

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
