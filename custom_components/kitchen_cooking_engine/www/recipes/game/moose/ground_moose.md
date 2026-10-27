<!-- KCE:CUT
type: cut
slug: ground_moose
name: Minced Moose
name_sv: Älgfärs
name_da: Hakket elgkød
category: game
meat: moose
cut_type: Moose
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- pan_fry
- grill
- oven_bake
- simmer
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
improvement_potential: 15
cooking_methods_researched: 1 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-10-26
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Minced Moose — Cut Overview

## Cut profile

Minced moose (*älgfärs*, *hakket elgkød*, *hirven jauheliha*, *лосятина*) is the moose
equivalent of ground beef: loin, haunch and shoulder trim put through a grinder, sold loose or
formed into patties, meatballs and burger shapes. It is even leaner than the whole-muscle cuts
it comes from — moose carries almost no intramuscular fat — so mince is typically blended with
pork fat, bacon, cream or stock to keep it from crumbling, which is why Nordic mince recipes so
often pair it with cream, egg and potato flour rather than treating it as a plain burger.

**This is ground meat, not a whole muscle, and the temperature rule changes with that.** The
whole-muscle moose cuts in this project target 63 °C / 145 °F, because bacteria stay on the
surface of an intact steak. Grinding spreads that surface through the mass, so the USDA
ground-meat minimum applies: **71 °C / 160 °F**, and there is no rare or medium-rare option
here the way there is for a moose steak. Carryover is small (1–2 °C) because a thin patty or a
loose pan of mince transfers heat quickly, so pull at the target rather than below it.

Lean game mince also dries fast once it passes the safety point: the same rule that makes rare
moose steak good makes well-done moose mince dry, so fat or liquid has to be built into the
mixture rather than relied on from the meat.

### What the sixteen fetched sources actually say about temperature

This is the cut's most important finding and it is not flattering to the corpus. Of sixteen
recipes across four leaves, **only three publish an internal temperature**, and of those three
**two are unsafe**:

- **160 °F / 71 °C, probed** — Reader's Digest Canada (Katie Hayes, Newfoundland) and Cast Iron
  Skillet Cooking (US). Correct ground-meat targets.
- **150 °F / 65.6 °C** — All-About-Moose (Canada) meatloaf. 5.6 °C *below* the USDA ground-meat
  minimum, for a loaf of ground moose in an oven.
- **"rare to medium rare (do not over cook)"** — From Field to Table (US) moose burgers.
- **"medium doneness, 4–5 minutes per side"** — Lawrence Bay Lodge (Canada) moose burgers.
- The remaining eleven recipes — every Swedish, Danish, Finnish and Russian record — publish **no
  temperature at all** and judge doneness by colour, time, or a lid.

So the 71 °C / 160 °F band carried by this cut comes from the USDA rule plus the two correct
records; it is not a consensus of the corpus, and two of the four leaves had to record sources
whose doneness advice is unsafe. That is written down here rather than smoothed over.

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Sources | Observed numerical evidence | Measured band | Gate status |
|---|---|---|---|---|---|
| Pan fry | [pan_fry](./ground_moose-pan_fry.md) | 4 (SE ×2, DK, RU) | **no source publishes a temperature**; all four finish under a lid or in sauce | none published | ⚠️ distinct row open (Group D ×4) |
| Grill | [grill](./ground_moose-grill.md) | 4 (CA ×3, US) | 160 °F probed (CA); "rare to medium rare" (US); "medium doneness" (CA); 1 silent | 71 °C (one source) | ⚠️ distinct row open (CA ×3) |
| Oven bake | [oven_bake](./ground_moose-oven_bake.md) | 4 (CA, US, FI, SE) | 160 °F minimum stated (US); **150 °F** (CA); 2 silent | 65.6–71 °C | ✅ count + distinct met |
| Simmer | [simmer](./ground_moose-simmer.md) | 4 (SE ×3, FI) | **no source publishes a temperature**; 10 min to 6 h cooks | none published | ⚠️ distinct row open (Nordic ×4) |

## Styckesprofil

Älgfärs (*hakket elgkød*, *hirven jauheliha*, *лосятина*) är motsvarigheten till nötfärs: rygg,
bakdel och bog körda genom kvarn, sålda lösa eller formade till biffar, köttbullar och burgare.
Färsen är ännu magrare än hela musklerna — älg har nästan inget intramuskulärt fett — så den
blandas typiskt med fläskfett, bacon, grädde eller buljong för att inte smula sönder, vilket är
varför nordiska färsrecept så ofta kombinerar den med grädde, ägg och potatismjöl.

**Detta är malet kött, inte en hel muskel, och temperaturregeln ändras med det.**
Helmuskelsnitten i projektet siktar på 63 °C / 145 °F eftersom bakterierna sitter på ytan av en
intakt stek. Malningen fördelar ytan genom hela massan, så USDA:s gräns för malet kött gäller:
**71 °C / 160 °F**, och det finns ingen rare- eller medium-rare-möjlighet här på samma sätt som
för en älgbiff. Eftertillagningen är liten (1–2 °C) eftersom en tunn biff eller lös färs i panna
överför värme snabbt — dra vid måltemperaturen, inte under den.

Mager viltfärs torkar dessutom fort när den passerat säkerhetspunkten: samma regel som gör
älgbiffen god vid rare gör älgfärsen torr vid well done, så fett eller vätska måste byggas in i
smeten i stället för att förväntas komma från köttet. I det hämtade materialet syns det som tre
återkommande knep: panad av ströbröd och grädde (svenskt), bacon malet in i färsen 80/20
(kanadensiskt/amerikanskt) och fläskfett eller grädde i såsen (ryskt och finskt).

## Research files by cooking method

- [Pan Fry](./ground_moose-pan_fry.md) — 4 sources (SE ×2, DK, RU); ⚠️ distinct row open (Group D ×4); the leaf that establishes the cut's main technique finding (sear, then lid or sauce)
- [Grill](./ground_moose-grill.md) — 4 sources (CA ×3, US); ⚠️ distinct row open; carries the only probed 160 °F burger and two unsafe "cook it rare" instructions
- [Oven Bake](./ground_moose-oven_bake.md) — 4 sources (CA, US, FI, SE); ✅ count + distinct met; carries the 150 °F vs 160 °F contradiction
- [Simmer](./ground_moose-simmer.md) — 4 sources (SE ×3, FI); ⚠️ distinct row open; 10-minute meatball braise to 6-hour moose ragù

## Data state and gaps

<!-- ledger-state: leaves=4 sources=16 silent=11 silent_leaves=1 methods=grill,oven_bake,pan_fry,simmer -->

State on 2026-10-26: four leaves, sixteen source records, eleven of them declaring that they publish
no internal temperature, one leaf with no temperature anywhere in its records, two source records
carrying doneness advice that is unsafe for ground meat.

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `leaf_without_any_temperature` | open | `ground_moose-simmer.md` - four records, none publishes a °C target | M | the cut's simmer method has no measurement at all; a Nordic or Baltic source that probes would be the first number on it |
| `recorded_unsafe_source` | open | `ground_moose-grill.md` ("rare to medium rare", "medium doneness"), `ground_moose-oven_bake.md` (150 °F) | S | re-check the three pages for updates; if unchanged, keep them excluded and say so |
| `group_A_absent` | searched-negative | "minced moose curry", "hirvenjauheliha curry", "котлеты из лосятины соус" - no citable Group A record using moose mince | - | none; a moose-specific South Asian or East Asian recipe does not appear to exist in a citable form |
| `group_C_absent` | searched-negative | "moose mince tagine", "elk kefta", "ground moose berbere" - nothing citable | - | none |
| `braise_unresolved` | open | the cut declares `simmer`, not `braise`; a sealed-pot moose-mince ragù was found only in Finnish oven forms | M | would justify re-adding `braise` as its own method with evidence |
| `system_backlog:confit` | not applicable | confit is a goose/duck method; recorded here only because the same pass discovered it on `goose_thigh` | L | - |

Not derivable by the sweep, recorded here so the next pass inherits it: the eleven silent records are
eight Nordic/Russian pan-fry and simmer records plus two Nordic oven records and one grill record; the
corpus for this cut measures temperatures only in the North American burger and meatloaf records.

## Improvement potential

**Improvement potential: 15 / 20** — assessed 2026-10-26 (was 8 when the cut was created the same day, with no leaves)

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | ✓ fixed 2026-10-26 (four methods confirmed from sixteen fetched recipes; `cooking_methods_researched: 1`; `braise` replaced by `simmer` after the corpus showed sauces and *hautua* rather than a sealed-pot braise) |
| Culinary Group A covered | ⚠️ missing — no South/Southeast/East Asian record uses minced moose — − **−1** |
| Culinary Group B covered | ✓ (Canadian ×3 and US ×2 across grill and oven_bake) |
| Culinary Group C covered | ⚠️ missing — no African, Caribbean, Levantine or Persian record — − **−1** |
| Culinary Group D covered | ✓ (Swedish ×5, Danish, Finnish ×2, Russian across pan_fry, oven_bake and simmer) |
| `## Cut profile` + anatomy | ✓ (ground-vs-whole-muscle distinction stated, and the corpus's temperature failures tabulated) |
| Method leaf files exist | ✓ (4 leaves, one per confirmed method; average 4 per cut met) |
| Safe temperature research evidence | ✓ (every leaf states what its sources do and do not publish; the USDA 71 °C floor is cited to the source that states it and separated from the 150 °F and "rare" instructions that contradict it) |
| Preferred-temperature research evidence | ✓ (the cut's own finding: this corpus has no preferred-temperature tradition for mince — three numbers in sixteen recipes, two of them unsafe) |
| Per-method temperature data | ✓ (table in Cut profile above) |
| Source counts (4 per leaf) | ✓ (4 / 4 / 4 / 4) |
| Leaf files failing the distinct-tradition gate (binary): pan_fry (Group D ×4), grill (CA ×3), simmer (SE ×3 + FI) | − **−3** |

**Deductions**: −1 Group A · −1 Group C · −3 distinct-tradition rows = −5 → **15**

### Integrity notes recorded this pass

- Two leaves (pan_fry, simmer) contain **no temperature at all** across eight sources. That is a
  property of the corpus, not an omission: Nordic mince cooking is done by eye. The leaves say so
  instead of importing a number.
- Two grill sources and one oven_bake source publish unsafe doneness advice for ground meat
  ("rare to medium rare", "medium", 150 °F). All three are quoted verbatim, flagged, and excluded
  from the cut's band.
- `venisonfordinner.com` and `girlheartfood.com` both record moose burgers; only the first is
  counted (the second is a cast-iron pan recipe with a passing mention of grilling), so the grill
  leaf is not padded.
- `sportchief.com`'s moose meatloaf was fetched and rejected as a source: the page body carries no
  readable recipe, only an introduction, so no ingredients or numbers could be verified from it.

### Improvement priorities

1. **−1 each** · Groups A and C: the honest route is not to invent a moose curry — it is to look
   for North American Indigenous and settler mince traditions (Group B already covered) and for
   Russian/Siberian minority cuisines that fall inside Group D, and to accept that a moose-specific
   Group A or C source may simply not exist in a citable form. Record searched-negatives if so.
2. **−1 each** · Distinct-tradition rows: pan_fry needs one non-Nordic source (a German or
   Canadian cast-iron färsbiff), grill needs a non-Canadian burger record, simmer needs one
   non-Nordic long-cook mince sauce
3. Queued method leads: `braise` (a sealed-pot moose-mince ragù would justify re-adding it
   separately from `simmer`), `smoker` (Bradley's smoked moose meatloaf was found but not yet
   fetched and verified), `air_fryer` (no moose-mince record found yet — searched-negative)
4. Doneness is settled at `well_done` / 71 °C and the band is defensible; the open question is
   whether the two unsafe sources should be re-checked for updates rather than left as recorded

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
