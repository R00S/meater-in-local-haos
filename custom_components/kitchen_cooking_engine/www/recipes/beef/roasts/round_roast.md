<!-- KCE:CUT
type: cut
slug: round_roast
name: Round Roast
name_sv: Rundstek
category: beef
meat: cow
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium
methods:
- braise
- oven_roast
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
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 11
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 5
-->
# Round Roast — Cut Overview

## Cut profile

"Round roast" is a generic term for any oven roast cut from the round primal — the large
hindquarter hip/thigh muscle group. The round primal encompasses several sub-primals: top
round (inner thigh, leanest), bottom round (outer thigh, slightly tougher), and eye of round
(central cylindrical muscle, very lean and uniform). A recipe labelled simply "round roast"
may use any of these, making this the most interchangeable of the round-family slugs.

Round muscles are heavily exercised, producing lean, tight-grained meat with low intramuscular
fat. Connective tissue is modest — enough to benefit from slow heat, not enough to require
braising temperatures. At 54–65 °C the muscle fibres remain moist and the round becomes
sliceable; above ~68 °C the roast turns dry. Africanbites.com explicitly lists eye of round,
top round, bottom round, and top sirloin roast as interchangeable in a round-roast recipe,
confirming that the same method and temperature targets apply across these sub-cuts.

**Best uses**: Oven roasting (high-start or low-and-slow), braising (for pull-apart pot roast),
slow cooker.

**Slicing**: Always slice against the grain — essential for all round cuts.

## Styckesprofil

"Rundbitsstek" är ett generiskt begrepp för ugnstek skärd från rundbotten — nötdjurets bakkvartersprimerområde. Det är en mager, tät muskelgrupp med lite intramuskulärt fett; hårt arbete under djurets hela liv ger tät fiberstruktur. Överkokad rundbitsteks torkar ut snabbt. Tillagning till rare eller medium-rare (54–60 °C) med omvänd searing (låg ugn, hög avslutningsvärme) ger bäst resultat. Eftertillagning är 3–5 °C beroende på stekets storlek.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| oven_roast | round_roast-oven_roast.md | ✅ 4 sources (Groups B×2, C, D) |
| braise | *not yet created* | ⬜ |
| slow_cooker | *not yet created* | ⬜ |

## Quality score

**Score: 11 / 20** — assessed 2026-04-27

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Groups B, C, D covered in oven_roast leaf | −0 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research remaining methods; set `cooking_methods_researched: 1`
2. **−1** · Group A gap — add a Group A source to oven_roast leaf
3. Create `round_roast-braise.md` and `round_roast-slow_cooker.md` leaves

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
