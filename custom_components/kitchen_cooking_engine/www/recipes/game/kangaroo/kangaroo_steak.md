<!-- KCE:CUT
type: cut
slug: kangaroo_steak
name: Kangaroo Steak
name_sv: Kängurubiff
name_da: Kængurubøf
category: game
meat: kangaroo
cut_type: Kangaroo
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- pan_sear
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
  usda_safe: true
improvement_potential: 12
cooking_methods_researched: 1 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-10-26
rest_time_min: 3
rest_time_max: 10
carryover_temp_c: 2
-->
# Kangaroo Steak — Cut Overview

## Cut profile

Kangaroo steak (*kängurubiff*, *kængurubøf*; also sold as kangaroo fillet) comes from the loin and
haunch of *Macropus* species, farmed and wild-harvested in Australia under a regulated industry.
It is the **leanest red meat in this project**: roughly 1–2 g of fat per 100 g, one source giving
2.6 % fat and 23.2 % protein against beef's 15.8 % fat and 19.0 % protein. The meat is deep
red, iron-rich, with a clean gamey flavour, and it behaves nothing like beef on the heat: with no
marbling to slow heat transfer and no fat cap to baste it, there is a narrow window between
browned and dry, and the window closes fast.

Every one of the seven fetched Australian records says the same thing in different words — **hot
surface, short cook, real rest, slice across the grain**. Several say it as a warning: "stop
treating it like beef", "kangaroo should be cooked to medium-rare at most", "if you like your
steak well done, 'roo probably isn't for you". The two methods in this cut (pan sear and grill) are
the same technique applied to two heat sources.

### What the corpus does and does not settle

Seven sources across two leaves, and **only one publishes an internal temperature** — and it is
second-hand: McLaren Vale Cellars cites "Paroo Kangaroo recipe guidance" at **50–52 °C for
medium-rare**, resting 4–5 minutes. That figure sits **2–5 °C below this cut's current
medium-rare band (52–57 °C)**, which is a real discrepancy and is recorded rather than smoothed
over. Australian kangaroo practice pulls lower than the generic game bands the project uses.

What the corpus does publish instead:

- **Grate temperature**: 375–400 °F / 190–200 °C (Grillhound — the only explicit grill setup)
- **Timings across a 2× spread**: 2–3 min/side (HelloFresh), 3–4 min/side (A Bloke Who Can Cook,
  K-ROO BBQ), 4–5 min/side (K-ROO packet), 40 min indirect smoke + 3 min/side (Craig Cooks)
- **Rests from 4 to 10 minutes**, including one warm-oven rest at 75 °C
- **One doneness test that is not a number**: the hand-firmness test, with an explicit instruction
  never to cut the steak to check

The cut's `medium_rare` recommendation is therefore supported by Australian practice and only
loosely by a measurement. Resolving 50–52 °C against 52–57 °C belongs to a doneness pass, not to
this leaf-level research.

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Sources | Observed numerical evidence | Measured band | Gate status |
|---|---|---|---|---|---|
| Pan sear | [pan_sear](./kangaroo_steak-pan_sear.md) | 4 (AU ×4) | 50–52 °C medium-rare (cited); 2–3 / 3–4 / 4–5 min per side; 3 silent on numbers | 50–52 °C | ⚠️ distinct row open (AU ×4) |
| Grill | [grill](./kangaroo_steak-grill.md) | 3 (AU ×3) | **no internal temperature in any source**; grate 190–200 °C; 2–3 / 3–4 min per side | none published | ⚠️ count + distinct open (AU ×3) |

## Styckesprofil

Kängurubiff (*kængurubøf*; även såld som kängurufilé) kommer från rygg och bakdel av
*Macropus*-arter, uppfödda och vilt skördade i Australien inom en reglerad industri. Det är
**projektets magraste röda kött**: ungefär 1–2 g fett per 100 g — en källa anger 2,6 % fett och
23,2 % protein mot nötköttets 15,8 % fett och 19,0 % protein. Köttet är djuprött, järnrikt och har
en ren, viltig smak, och det beter sig inte som nötkött över värme: utan marmorering som bromsar
värmen och utan fettlock som öser det finns ett smalt fönster mellan brynt och torrt — och det
stängs snabbt.

Alla sju hämtade australiska recept säger samma sak med olika ord: **het yta, kort tid, ordentlig
vila, skär mot fibrerna**. Flera säger det som en varning: behandla den inte som nötkött, och
"kangaroo should be cooked to medium-rare at most". Innertemperatur: dra vid **50–52 °C** enligt
den enda källan som anger ett mått (andrahandsciterat), vilket ligger 2–5 °C under projektets
medium-rare-band (52–57 °C) — en verklig avvikelse som är dokumenterad, inte bortförklarad. Vila
**4–10 minuter** och skär mot fibrerna. Eftertillagning: 2–3 °C.

## Research files by cooking method

- [Grill](./kangaroo_steak-grill.md) — 3 sources (AU ×3); ⚠️ count + distinct open; carries the only grate temperature (190–200 °C) and the Kangaroo Industry Association's smoked-then-seared fillet
- [Pan Sear](./kangaroo_steak-pan_sear.md) — 4 sources (AU ×4); ⚠️ distinct row open; carries the only published pull temperature (50–52 °C, cited) and the hand-firmness doneness test

## Improvement potential

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | ✓ fixed 2026-10-26 (both declared methods confirmed against seven fetched Australian sources; `cooking_methods_researched: 1`; no additional method discovered — smoking exists only as a finish inside the grill leaf) |
| Culinary Group B covered | ✓ (Australasian — every source in both leaves) |
| `## Cut profile` + anatomy | ✓ (rewritten: leanness mechanism, the 50–52 vs 52–57 °C discrepancy, and the timing spread all stated) |
| Safe temperature research evidence | ✓ (every leaf states what its sources publish and what they do not; the one number is flagged as second-hand) |
| Preferred-temperature research evidence | ✓ (50–52 °C recorded against the registry's 52–57 °C band, with the conflict left open for a doneness pass) |
| Per-method temperature data | ✓ (table in Cut profile above) |

### Integrity notes recorded this pass

- `quitelike.com`'s peppered kangaroo steaks page was fetched and **rejected**: the body carries only
  the dish introduction, no ingredient list or method, so nothing could be verified from it.
- The `kangaroo_fillet` hub and its two leaves are a separate cut and were **not** touched; the
  same Australian sources would serve it, and that is noted here rather than used to pad this cut.
- "Inspired by" records are dated 2026-10-26 throughout; each leaf names its own source count and
  its own gate status rather than repeating the hub's.
- `name_sv` was corrected from *Kängurufilé* to **Kängurubiff**: the cut is a steak, and the file's
  own English name says so — a fillet is a different cut in this catalog (`kangaroo_fillet`).

### Improvement priorities

1. Two more leaves: `sous_vide` (Australian precision-cooking pages exist and would give
   this cut its first repeatable temperature) and `slow_cooker`/`pressure_cooker` for the tougher
   haunch steaks — both are leads, not yet verified
2. Grill source count: a fourth verified Australian grill record; the Facebook and TikTok
   records found this pass are not citable
3. **−1 each** · Groups A, C and D — for D this is a genuine searched-negative; for A the route
   would be a non-Australian source using kangaroo in a South-East Asian preparation (Indonesia and
   Japan both import kangaroo meat), which needs verification before it can be claimed
4. **Doneness pass** · Reconcile 50–52 °C (cited Australian practice) with the registry's
   52–57 °C medium-rare band

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
