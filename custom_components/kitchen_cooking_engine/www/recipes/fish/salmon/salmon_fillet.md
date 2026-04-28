<!-- KCE:CUT
type: cut
slug: salmon_fillet
name: Salmon Fillet
name_sv: Laxfilé
category: fish
meat: salmon
cut_type: Salmon
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium
methods:
- air_fryer
- grill
- oven_bake
- pan_sear
- sous_vide
doneness:
- name: medium_rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
- name: medium
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
quality_score: 11
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 2
-->
# Salmon Fillet — Cut Overview

## Cut profile

Salmon fillet comes from the side of the fish, running the full length of the body from behind the head to the tail, with the pin bones removed. The flesh is divided into distinct fat-layered muscle segments (myotomes) separated by connective tissue (myocommata); that connective tissue softens and gives the characteristic flaking texture when the protein reaches its set point. Atlantic and Pacific salmon differ in fat distribution — farmed Atlantic salmon is uniformly rich, while wild sockeye and king salmon have denser, more mineral flesh. Pan searing suits salmon because the high conductive heat of a stainless or cast-iron pan rapidly crisps the skin (if skin-on) and caramelises the exposed flesh, producing textural contrast between crust and interior. Carryover in a seared salmon fillet is modest — 2–3 °C — because the thin geometry dissipates heat quickly, so accurate pull timing is essential to avoid overcooking.


## Styckesprofil

Laxfilé kommer från sidan av fisken, längs hela kroppens längd från bakom huvudet till stjärten, med pinnbenen borttagna. Köttet är indelat i distinkta fettskiktade muskelsegment (myotomer) separerade av bindväv (myokommat); den bindväven mjuknar och ger den karakteristiska fjälliga texturen när proteinet når sin sättningspunkt.

Atlantisk och stillahavslax skiljer sig åt i fettfördelning — odlad atlantlax är jämnt rik, medan vild sockeye och kung-lax har tätare, mer mineraliskt kött. Pannstekning passar lax eftersom den höga ledningsvärmen i en rostfri eller gjutjärnspanna snabbt krispar skinnet (om skinnet är på) och karameliserar det exponerade köttet, vilket skapar texturkontrast mellan skorpa och insida. Eftertillagning är blygsam — 2–3 °C — eftersom den tunna geometrin sprider värme snabbt, varför exakt dragtidpunkt är avgörande för att undvika överkokning. Innertemperatur: 52–60 °C.

## Research files by cooking method

- [Air Fryer](./salmon_fillet-air_fryer.md)
- [Grill](./salmon_fillet-grill.md)
- [Oven Bake](./salmon_fillet-oven_bake.md)
- [Pan Sear](./salmon_fillet-pan_sear.md)
- [Sous Vide](./salmon_fillet-sous_vide.md)
## Quality score

**Score: 11 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `salmon_fillet-pan_sear.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `salmon_fillet-pan_sear.md` copies parent cut profile — rewrite `salmon_fillet-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
