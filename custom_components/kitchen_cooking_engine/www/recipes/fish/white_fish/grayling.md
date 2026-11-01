<!-- KCE:CUT
type: cut
slug: grayling
name: Grayling
name_sv: Harr
name_da: Stalling
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
- grill
- smoker
- oven_bake
- boil
- poach
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
improvement_potential: 1702
cooking_methods_researched: 1
quality_assessed: 2026-11-01
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 2
-->
# Grayling — Cut Overview

## Cut profile

European grayling (*Thymallus thymallus*, Swedish: harr, German: Äsche, French: ombre commun, Finnish: harjus) is a salmonid freshwater fish (family Salmonidae) native to fast-flowing, clear, cold rivers and streams across Europe from the UK to Russia. It is closely related to trout and whitefish but has its own genus. The flesh is lean (1–2 g fat per 100 g), white to off-white, fine-textured, and exceptionally delicate. Freshly caught grayling has a distinctive faint thyme-like aroma that inspired the old Latin name *Thymallus*; this aroma dissipates quickly after death, making freshness critical — grayling is best cooked the same day it is caught. It is considered a highly prized game fish in Austria, Bavaria, and Scandinavia, but also an important food fish. Pan-frying whole (gutted, scaled) in butter is the classic preparation in Alpine regions and Scandinavia. Hot smoking whole grayling in a stovetop box smoker (*abu-röken*, *Tischräucherofen*) is a traditional Scandinavian practice — the small size (typically 200–400 g) makes it perfect for box smoking in one session. Grilling whole over moderate heat is popular in Austria and Bavaria. The delicate flesh does not tolerate overcooking; it dries out quickly above 65 °C. Probe placement: insert into the thickest cross-section behind the head.

## Styckesprofil

Harr (*Thymallus thymallus*; tyska: Äsche; franska: ombre commun; finska: harjus) är en salmonid sötvattenfisk i snabba, klara, kalla åar och floder. Köttet är magert (1–2 g fett/100 g), vitt, finstrukturerat och exceptionellt delikat. Färsk harr har en karakteristisk svag timjanliknande arom — denna försvinner snabbt efter döden, vilket gör att harr måste tillagas helst samma dag som den fångats. Pannstekning hel (rensad, fjällad) i smör är klassisk beredning i Alpregionerna och Skandinavien. Varmrökning hel i röklåda (abu-röken) är traditionell i Skandinavien — den lilla storleken (200–400 g) gör den perfekt för en hel röktning. Sond placeras i tjockaste tvärsnittet bakom huvudet.

## Research files by cooking method

- [Pan Fry](./grayling-pan_fry.md) — 6 fetched sources (AT/DE ×2 = Group B; SE×2/RU/PL = Group D); no source states a pull temperature; Groups A and C absent, and the Polish source states neither timings nor quantities.
- [Grill](./grayling-grill.md) — 2 fetched sources (UK/SE); no stated pull temperatures.
- [Smoker](./grayling-smoker.md) — 2 fetched sources (UK Group B, numeric 55 °C core; RU Group D, non-numeric).
- [Oven Bake](./grayling-oven_bake.md) — 4 fetched sources (SE×2/RU = Group D, UK = Group B); oven settings and times only, no internal target.
- [Boil](./grayling-boil.md) — 2 fetched sources (SE×2); qualitative endpoints only.
- [Poach](./grayling-poach.md) — 2 fetched sources (SE×2, Group D); one states 55 °C, one qualitative.

All six declared methods now have a leaf file. Two leaves (`pan_fry`, `oven_bake`) meet the 4–6-source count but no leaf yet meets the four-distinct-tradition gate, so every leaf still carries an explicit partial-research marker. Groups A and C remain absent from the whole cut — a finding with in-language searches behind it in every leaf.

## Improvement potential

**1702** — rated 2026-11-01 against `IMPROVEMENT_POTENTIAL_SYSTEM.md`. The 0–20 reading is discarded.

| Row | Applied | Deduction |
|---|---|---|
| The cut file itself | 1 cut file | 128 |
| Finished leaves | none — all six carry `⚠️ PARTIAL RESEARCH` | 0 |
| Stub leaves | all six | 6 × 8 = 48 |
| Recipes in the cut file | none in this file | 0 |
| Recipes in leaves | pan_fry 6 · oven_bake 4 · grill 2 · boil 2 · poach 2 · smoker 2 = 18 | 544 |
| Culinary groups per leaf | pan_fry 2 · grill 2 · oven_bake 2 · boil 1 · poach 1 · smoker 2 = 10 | 320 |
| Culinary preferred temperatures for the cut | 55 °C is the endpoint both the poach and the smoker sources state, against a 63 °C safe line | 64 |
| Safe temperatures | `usda_safe_c` 63, discussed explicitly in the smoker consensus | 32 |
| Behaviour/fat-render reasoning for the cut | the English profile names one temperature (65 °C) and the Swedish one names none; neither reasons across temperatures nor states that no data exists | 0 |
| Leaf behaviour rows, English | boil and poach state explicitly that no source quantifies carryover; the other four neither reason across temperatures nor declare an absence | 2 × 32 = 64 |
| Leaf behaviour rows, Swedish | grill and smoker state the absence in Swedish | 2 × 32 = 64 |
| Leaf method-and-tradition description | English in all six; Swedish in grill, oven_bake, pan_fry and smoker — boil and poach carry no Swedish profile | 10 × 32 = 320 |
| Leaf method-specific preferred temperatures | poach and smoker carry a source-derived band with reasoning; the other four hold only appliance settings or nothing | 2 × 32 = 64 |
| **Total** | | **1 648** |
| **Reading** | 3350 − 1 648 | **1702** |

The recipe row is tiered, because this is a fish and the threshold is 4 rather than 8: pan_fry's six recipes take four at the full 32 and two at half, 160 rather than 192. Its two groups and every other leaf's counts sit inside the threshold and are not tiered.

**What moved since the last reading.** `smoker` gained a second source — a Russian fishing-club field account from Krasnoyarsk that salts, air-dries for a day and hot-smokes this exact fish over aspen shavings, judging doneness by the dorsal fin. It is Group D, which the leaf lacked, and non-numeric, so it is stored as a comparator and the range still rests on the single UK source. Two candidates were rejected and are logged in the leaf rather than quietly dropped: one page declares its own origin as AI-generated and so is not human-created, and a German public-broadcaster smoking guide that never mentions Äsche and explicitly advises against smoking lean fish.

**Why the reading barely moved.** Adding a source that no leaf can turn into a finished leaf changes very little under this system, and that is the honest result: the number is dominated by the six stub reductions and by a corpus in which no leaf can clear the four-distinct-tradition gate. Groups A and C are absent from every leaf — a finding that now has in-language searches behind it in pan_fry, oven_bake, grill, boil, poach and smoker, which is what separates a documented wall from an unverified assumption.

### Improvement priorities

1. **Four leaves sit at two sources each** — `grill`, `boil`, `poach` and `smoker` — and each needs two more from traditions it does not hold. `pan_fry` (6) and `oven_bake` (4) have the count but not the diversity, so adding to them first buys the least.
2. **`grayling-pan_fry.md` holds two Swedish sources.** Replace one with a distinct tradition, or add a fifth source from a new one; the count gate is met and the diversity gate is not.
3. **Culinary Group A** — absent from every leaf, with in-language searches already logged in pan_fry, oven_bake, grill, boil, poach and smoker. *Thymallus thymallus* is a European river fish, so this may be a structural wall rather than a work gap; that claim would need a demonstrated search in Japanese, Chinese and Korean for *harr*/grayling before it could be proposed as an exception, and an exception needs the user's approval.
4. **Culinary Group C** — absent from every leaf for the same reason, with the same evidence owed: an in-language search across Turkish, Persian and Arabic sources for grayling preparations before any wall is claimed.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
