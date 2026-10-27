<!-- KCE:CUT
type: cut
slug: moose_roast
name: Moose Roast
name_sv: Älgstek
name_da: Elgsteg
category: game
meat: moose
cut_type: Moose
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- braise
- oven_roast
- slow_cooker
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
improvement_potential: 18
cooking_methods_researched: 1
quality_assessed: 2026-10-27
rest_time_min: 15
rest_time_max: 30
carryover_temp_c: 8
-->
# Moose Roast — Cut Overview

## Cut profile

The moose roast is taken from the hindquarter — the topside (*innanlår*), silverside or the sirloin tip —
or from the boned shoulder, and it is the whole-muscle cut most Nordic households actually cook, as opposed
to the moose steak. Anatomically the haunch is a set of long, fine-fibred muscles bound by thin silvery
seams rather than the thick collagen sheets of a beef chuck: the animal walks through snow and browse, so the
muscle is well exercised and dark, but the connective tissue is fine and short. The defining property is the
fat: roughly 1–3 % total, almost none of it intermuscular, so a roast has no self-basting layer and loses
moisture faster than any farmed red meat at the same oven setting.

That has two consequences the temperature data bears out. First, every tradition roasts it low (100–160 °C)
and almost every one puts liquid in the pan, because there is no fat to protect the surface. Second, the
target is a steak target, not a braise target: moose haunch has so little collagen that holding it at 88–96 °C
— the treatment a beef short rib needs — would simply dry it to fibre. Nordic sources pull the roast
anywhere between 58 and 70 °C, and the spread is cultural rather than technical.

The bone sits inside the haunch cut of the shoulder; in a boned and rolled topside there is none. Either way
the probe goes in from the thick end, into the centre of the largest muscle, clear of the silvery seam that
divides topside from silverside — that seam reads low and lags the meat around it by several degrees.

## Styckesprofil

Älgsteken tas från bakdelen — innanlår, ytterlår eller ryggbiffen — eller från den urbenta bogen, och den är
den hela muskeldel som de flesta nordiska hushåll faktiskt tillagar. Anatomin är långa, finfibriga muskler
bundna av tunna silverhinnor, inte av de tjocka kollagenplattor som en nötbringa har: djuret går i snö och
betar, så muskeln är välanvänd och mörk, men bindväven är fin. Det avgörande är fettet — 1–3 % och nästan
inget mellan musklerna — så steken har inget självbastande lager och tappar fukt snabbare än något annat rött
kött i samma ugn. Därför rostar alla traditioner lågt (100–160 °C) med vätska i formen, och därför är
måltemperaturen en biffstemperatur och inte en bräseringstemperatur: 58–70 °C beroende på tradition.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Braise | [moose_roast-braise.md](./moose_roast-braise.md) | ✅ 4 fetched sources (Swedish, Norwegian, Canadian, Russian), 2026-10-27 |
| Oven roast | [moose_roast-oven_roast.md](./moose_roast-oven_roast.md) | ✅ 4 fetched sources (German, Swedish, Norwegian, Finnish), 2026-10-27 |
| Slow cooker | — | ⬜ Owed. Confirmed as a Canadian method, not yet collected (see gap table) |
| Smoker | [moose_roast-smoker.md](./moose_roast-smoker.md) | ⚠️ Stub — no source recipes yet |

## Improvement potential

**Improvement potential: 18 / 20** — assessed 2026-10-27. The previous reading (8, dated 2026-04-26) charged
−8 for an unstarted method survey and counted a single leaf; the survey is now done, two leaves carry eight
fetched sources, and the number is read fresh off the criteria rather than adjusted from the old one.

| Criterion | Points | Evidence |
|-----------|--------|----------|
| Cooking methods not researched (`cooking_methods_researched: 0`) | — | survey 2026-10-27: braise and oven roast confirmed with eight fetched recipes; **slow cooker and smoker confirmed** and now declared (`girlheartfood.com` slow-cooker moose roast; 20-hour smoked moose pot roast) |
| Missing Culinary Group A | **−1** | no South/Southeast/East Asian moose record exists in any leaf — searched negatively, see gaps |
| Missing Culinary Group B | — | Canadian (BC) Dutch-oven braise; German cream-braised *Elchbraten* |
| Missing Culinary Group C | **−1** | no African, Arabic, Levantine, Persian or Turkish moose record in any leaf — searched negatively |
| Missing Culinary Group D | — | Swedish, Norwegian and Finnish leaves |
| `## Cut profile` … lacks anatomy | — | anatomy rewritten 2026-10-27: haunch muscle groups, silver seams, 1–3 % fat, bone |
| No method leaf files exist | — | two leaves exist |
| Safe-temperature evidence | — | Canadian source applies the 145 °F / 63 °C whole-muscle floor; the cut's `usda_safe_c` is that value |
| Preferred-temperature evidence | — | 58–70 °C across four traditions in two leaves |
| Per-method temperature data | — | oven roast 58–70 °C; braise 63–70 °C — different bands, recorded separately |
| Description duplication | — | both leaf profiles rewritten method-specific 2026-10-27; the oven-roast profile had been a verbatim copy of this hub's |

**Points: −2 → 18.**

**What the number cannot see.** Two declared methods (`slow_cooker`, `smoker`) have no usable leaf: the
smoker file is a stub and the slow-cooker leaf does not exist. The table has no row for a declared-but-unwritten
leaf, so this number describes the evidence that exists, not the work that remains.

### Data state and gaps

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `group_A_absent` | searched-negative | Japanese *shika*, Chinese and Korean cuisines have no moose; *Alces alces* is not eaten in the region | — | none exists |
| `group_C_absent` | searched-negative | no moose tradition in African, Levantine, Persian or Turkish cooking | — | none exists |
| `unwritten_leaf:slow_cooker` | open | girlheartfood.com "Slow Cooker Moose Roast and Vegetables" (high 5–6 h / low 8–10 h); bcoutdoorsmagazine.com crockpot moose roast | M | 4 Canadian/US slow-cooker records |
| `stub_leaf:smoker` | open | a 20-hour smoked moose pot roast exists (FrozenSmoke BBQ); no written recipe fetched yet | M | 4 smoked-moose records, if four written sources can be found |
| `recommended_doneness` | recorded | the cut's default is `medium_rare` 54 °C, but **no fetched source pulls below 58 °C** | S | decide whether to move the default to 60–62 °C |
| `well_done_band` | open | Norwegian and German sources name 68–70 °C as fully cooked; `cooking_data.py` has no `well_done` band for this cut (added 2026-10-27 alongside these leaves) | — | engine can now express what the sources do |

### Improvement priorities

1. **Owed leaf** · `slow_cooker` — the method is confirmed by two Canadian pages; the leaf would add a fourth
   method and a North American cooking style not yet covered.
2. **Stub leaf** · `smoker` — either four written sources or removal of the stub.
3. **−2 groups** · genuinely absent traditions; recorded as searched-negative rather than claimed as walls.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
