<!-- KCE:CUT
type: cut
slug: top_round_roast
name: Top Round Roast
name_sv: Innanlårstek
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
-->
# Top Round Roast — Cut Overview

## Cut profile

The top round roast is the single large inner-thigh muscle of the round primal — the
hindquarter hip area. In British butchery the anatomical equivalent is **topside**. It is
the leanest of the round sub-primals (top round, bottom round, eye of round), with a flat,
uniform grain and minimal intramuscular fat. This lean profile means it does not tolerate
high temperatures well: above ~68 °C the muscle fibres tighten and the roast becomes dry.
The cut benefits from oven roasting at moderate temperatures (120–190 °C) to 54–65 °C
internal.

**Slicing**: Always slice against the grain — the tight, flat grain of top round makes
slicing direction the primary determinant of tenderness in the finished roast.

## Styckesprofil

Övre innanlårsstek är den enda stora inre lårmuskeln i rundbottenprimalen — höftpartiet i bakkvarteret. I brittisk styckningsnomenklatur är den anatomiska motsvarigheten **topside**. Det är det magraste av rundbottendelprimalerna (övre innanlår, nedre innanlår, runda innanlår), med en plan, enhetlig fiber och minimalt intramuskulärt fett. Denna magra profil innebär att det inte tolererar höga temperaturer väl: ovanför ~68 °C drar muskelfibrerna ihop sig och steket blir torrt. Snittet gynnas av ugnsstekning vid måttliga temperaturer (120–190 °C) till 54–65 °C inre temperatur.

**Skärning**: Skär alltid tvärs mot fibern — det platta, täta fibrermönstret i övre innanlår gör skärriktningen till den primära avgöraren för mörhet i det färdiga steket. Innertemperatur: 54–60 °C. Eftertillagning: 3–5 °C.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| oven_roast | top_round_roast-oven_roast.md | ✅ 4 sources (Groups B×2, C, D) |
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
3. Create `top_round_roast-braise.md` and `top_round_roast-slow_cooker.md` leaves

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
