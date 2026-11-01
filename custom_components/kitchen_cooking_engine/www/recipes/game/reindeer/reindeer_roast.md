<!-- KCE:CUT
type: cut
slug: reindeer_roast
name: Reindeer Roast
name_sv: Renstek
name_da: Rensdyrsteg
category: game
meat: reindeer
cut_type: Reindeer
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- braise
- oven_roast
- smoker
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
improvement_potential: 17
cooking_methods_researched: 1
quality_assessed: 2026-10-27
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 5
-->
# Reindeer Roast — Cut Overview

## Cut profile

The reindeer roast is the boned and rolled round of *Rangifer tarandus* — the topside (*innanlår*), the
silverside (*ytterlår*), or the saddle — and it is the festive joint of the Sámi and Scandinavian north, from
Finnmark and Swedish Lapland to Finnish Lapland and across to the Siberian herders. The animal is a browser of
lichen and birch scrub that migrates hundreds of kilometres a year, so the haunch muscle is long-fibred, very
dark and extremely lean: roughly 1–2 % fat, with almost none between the muscles and only a thin silverskin
cap over the round. That fat figure is the defining fact about the cut — leaner than moose, leaner than hare,
and with none of the intramuscular marbling that lets a beef roast survive a hot oven.

The bone and the shape of the joint matter for cooking. A bone-in *poronpaisti* is a large, irregular piece
with an internal bone and a thin fat layer on one face; the boned and rolled *surret reinsdyrstek* is compact
and even, and cooks far faster per kilogram. Trimmed, the round is nearly cylindrical, which is why the
Nordic instruction is always "sear, then a very low oven, then a thermometer" — there is no fat to protect
the surface and no collagen bulk to justify a long braise.

Because it is so lean, reindeer is also the one game cut where the temperature argument is genuinely open:
the sources in the oven-roast leaf span 55–75 °C for the same joint, and the disagreement is cultural rather
than technical. The probe goes in from the thick end, into the centre of the largest muscle, clear of the
silverskin and of the seam between topside and silverside.

## Styckesprofil

Rensteken är den urbenta och ihopbundna rundan av *Rangifer tarandus* — innanlår, ytterlår eller sadel — och
den är den festliga steken i det samiska och skandinaviska norr, från Finnmark och svenska Lappland till
finska Lappland och vidare till de sibiriska renskötarna. Renen betar lav och björkris och vandrar hundratals
kilometer om året, så bakmuskulaturen är långfibrig, mycket mörk och extremt mager: 1–2 % fett, nästan inget
mellan musklerna och bara en tunn silverhinna över rundan. Benet och styckningens form spelar roll — en benfast
*poronpaisti* är stor och oregelbunden med ben inuti, medan den urbenta och ihopbundna *surret reinsdyrstek* är
kompakt och går mycket snabbare per kilo. Sond från den tjocka änden in i mitten av den största muskeln.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Oven roast | [reindeer_roast-oven_roast.md](./reindeer_roast-oven_roast.md) | ✅ 3 fetched sources (Swedish Köket.se, Finnish HS.fi, Norwegian NJFF), 2026-10-27 — **one record short of the 4-source gate** |
| Braise | — | ⬜ Owed. Confirmed by matprat.no *reinsdyrstek i gryte* (125 °C, 2–3 h, 60–65 °C); not yet collected |
| Smoker | [reindeer_roast-smoker.md](./reindeer_roast-smoker.md) | ⚠️ Stub — the *savuporo* / *røkt reinsdyr* tradition is real, but no written recipe has been fetched |

## Improvement potential

| Criterion | Points | Evidence |
|-----------|--------|----------|
| Cooking methods not researched (`cooking_methods_researched: 0`) | — | survey 2026-10-27: oven roast confirmed with three fetched recipes; **braise and smoker confirmed** and declared (matprat *reinsdyrstek i gryte*; the *savuporo* tradition) |
| Missing Culinary Group D | — | Swedish, Norwegian and Finnish leaves |
| `## Cut profile` … lacks anatomy | — | anatomy written 2026-10-27: which muscle groups, silverskin cap, 1–2 % fat, bone-in vs rolled shape |
| No method leaf files exist | — | one leaf exists |
| Safe-temperature evidence | — | the leaf's pulls (60–70 °C) bracket the cut's 63 °C floor; NJFF's 62 °C medium is the closest published value |
| Preferred-temperature evidence | — | 55–75 °C on the NJFF scale alone, 60–70 °C across three traditions |
| Per-method temperature data | — | oven roast 58–70 °C; no per-method data for the two newly declared methods yet |
| Description duplication | — | the leaf profile was a verbatim copy of this hub's and is now method-specific (rewritten 2026-10-27) |

**Points: −3 → 17.**

**What the number cannot see.** Two declared methods (`braise`, `smoker`) have no usable leaf, and the
oven-roast leaf has three records where the gate asks for four. The table has no row for either, so this
number describes the evidence that exists, not the work that remains.

### Data state and gaps

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `leaf_below_gate` | open | oven-roast has 3 records; a fourth tradition has not been found in a form the TOR accepts | M | one Swedish/Norwegian/Finnish 4th source, or a compliant caribou record |
| `group_B_absent` | searched-negative | caribou: Churchill Wild (tenderloin, wrong cut), recipeland and cdkitchen (aggregators, excluded by TOR) | — | none this pass |
| `unwritten_leaf:braise` | open | matprat.no *reinsdyrstek i gryte*, 125 °C, 2–3 h, 60–65 °C medium | M | 4 braised-reindeer records |
| `stub_leaf:smoker` | open | *savuporo* (Finnish) and *røkt reinsdyr* (Norwegian) are real hot-smoking traditions; no written recipe fetched | M | 4 smoked-reindeer records |
| `recommended_doneness` | recorded | the cut's default is `medium_rare` 54 °C, and no fetched source pulls below 55 °C — NJFF's floor | S | decide whether to move the default to 58–60 °C |

### Improvement priorities

1. **Owed leaf** · `braise` — a confirmed Norwegian method with a published temperature band, no leaf.
2. **Stub leaf** · `smoker` — the smoking tradition is real; either four written sources or removal of the stub.
3. **Gate shortfall** · the oven-roast leaf needs one more tradition to meet 4–6 records.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
