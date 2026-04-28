<!-- KCE:CUT
type: cut
slug: rump_roast
name: Rump Roast
name_sv: Rumpstek
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
# Rump Roast — Cut Overview

## Cut profile

The rump roast is cut from the primal **round** — the hindquarter hip area. In North American
butchery this encompasses the top round, bottom round, eye of round, and rump roast proper.
In British butchery the same anatomical region produces **topside** (inner thigh, the leanest)
and **top rump** / thick flank (slightly higher and more marbled). In Finnish cooking this cut
is called **paahtopaisti** and is the classic joint for Sunday oven roast beef.

**Anatomy**: Rump and round cuts are large, well-exercised muscles with relatively low
intramuscular fat but tight, even grain. Connective tissue content is modest compared to chuck
or brisket. This means rump roast does not require braising temperatures for collagen-dissolution
— it responds well to moderate dry heat up to 60–65 °C.

**Best uses**: Oven roasting (dry heat, 120–220 °C), braising (covered with liquid,
low-and-slow), and slow cooker. For oven roasting, two approaches are documented: (1) high
start (220–240 °C) then reduce to 160–190 °C; (2) low-and-slow throughout (120–130 °C). For
braising, covered cooking with wine/stock transforms the cut into pull-apart tender pot roast.

**Slicing**: Always slice against the grain for the most tender result. The tight grain of
round/rump cuts makes slicing direction critical.

## Styckesprofil

Rumpbiffstek skärs från primalen **rundbotten** — höftpartiet vid bakkvarteret. I Nordamerika är "rump roast" ett snitt från övre bakkvarteret med måttlig mörhet, inte jämförbart med de mörare brittiska/australiensiska rumpsnitten. Det är ett magrare, tät muskelverk med viss intramuskulär fettinlagring. Lång, långsam ugnsstekning till antingen medium (60–63 °C) eller pull-apart-mörhet (88–95 °C vid brässering) ger bäst resultat. Eftertillagning: 3–5 °C vid normal ugnsstekning.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| oven_roast | rump_roast-oven_roast.md | ✅ 4 sources (Groups B×2, C, D) |
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

1. **−8** · Cooking methods not researched — research remaining methods (braise, slow_cooker); set `cooking_methods_researched: 1`
2. **−1** · Group A gap — add a Group A source to oven_roast leaf or a new method leaf
3. Create `rump_roast-braise.md` leaf (pot-roast style, BBC / Moroccan / Polish / Chinese)
4. Create `rump_roast-slow_cooker.md` leaf

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
