<!-- KCE:CUT
type: cut
slug: buffalo_roast
name: Buffalo Roast
name_sv: Buffelstek
name_da: Bøffelsteg
category: game
meat: buffalo
cut_type: Buffalo
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
improvement_potential: 11
cooking_methods_researched: 1 # Survey re-run 2026-10-26 on fetched pages. Declared + leafed: oven_roast (rewritten, was zero recipes), braise (rewritten, 1 → 3), smoker (discovered this pass and registered in the cut file id 651, which had listed only oven_roast). Queued leads (need sources before declaring): slow_cooker (Food Network's pot roast gives an 8-hour low slow-cooker option inside a braise recipe; Back in Time Bison Ranch's chuck method is "best done in a crock pot" — no standalone slow-cooker bison-roast recipe fetched yet), pressure_cooker (beckandbulow fetches a full Instant Pot bison pot roast, 1 hour high pressure — a second source is needed for a leaf), sous_vide (Bison Ridge Farms states it became their preferred method and links out to a separate recipe not yet fetched), reverse_sear (JH Buffalo's reverse-seared prime rib is a real record, currently filed inside oven_roast because it is an oven method with a 450 °F finish). Documented searched-negative 2026-10-26: Culinary Groups A, C and D — no fetchable bison or water-buffalo roast recipe was found in South/Southeast/East Asian, African/Levantine/Persian or Nordic/Baltic/Slavic traditions; a Moroccan "bison tagine" search returned zero results.
quality_assessed: 2026-10-26
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 5
-->
# Buffalo Roast — Cut Overview

## Cut profile

A bison roast is a whole-muscle piece from the shoulder/chuck, sirloin tip, round or rib, weighing
roughly 1–2 kg, and it differs from its beef equivalent in one decisive structural fact: **there
is almost no intramuscular fat**. Bison carries about 2.4 g of fat per 100 g of cooked meat
against 10 g or more for comparable beef cuts, and the external fat layer is thin or absent. The
buildup that solves this in beef — marbling that renders from within, a fat cap that bastes the
surface — does not exist here. What the cut does have is **collagen**: dense, well-used shoulder
and round muscles are wrapped in connective-tissue sheaths, and the two great methods for this
cut are defined by what they do to it. A hot, dry oven leaves the collagen contracted and the
lean fibres squeezing out water; a long, moist braise or a wrapped smoke converts it to gelatine
and makes the roast fork-tender.

That gives the cut a genuine methodological fork, and the corpus follows it:

- **Premium sub-cuts** (rib, sirloin tip) are treated like a lean steak writ large — a low oven
  (225 °F), a short high-heat burst for crust, and a probe target of **52–57 °C (125–135 °F)** at
  the table. This is the only part of the cut where the engine's doneness bands apply.
- **Working sub-cuts** (chuck, round) are cooked **past** every doneness band in the registry to
  **91–99 °C (195–210 °F)**, either braised at 250–300 °F or smoked and wrapped at 165 °F. The
  probe here measures progress, not preference; the real signal is a fork.

Carryover is the largest in this cut's corpus and is measured rather than assumed: one recorded
roast pulls at **125 °F and rests to 135 °F** (a 5 °C rise over 20 minutes) and another is run at
two oven stages specifically so the final climb happens in the oven. Resting is 10–30 minutes.
The old profile's claim that the National Bison Association recommends 145 °F for "medium rare" is
kept below as a producer-convention note, not as the cut's target: the fetched recipe corpus pulls
premium roasts at 52–54 °C and takes only the driest sub-cut to 63 °C.

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Counted sources | Observed numerical evidence | Applied target | Gate status |
|---|---|---|---|---|---|
| Braise | [braise](./buffalo_roast-braise.md) | 3 (US ×3, one Indigenous NA) | no source publishes an internal temp; ovens 180 / 250 / 300 °F, 2½–8 h | 93 °C / 199 °F fork-tender (house) | ⚠️ count + distinct open |
| Oven roast | [oven_roast](./buffalo_roast-oven_roast.md) | 3 (US ×3) | 115 / 125 / 130 / 140 / 145 °F pulls; 125 → 135 °F measured carryover | 54 °C / 130 °F → 57 °C final | ⚠️ count + distinct open |
| Smoker | [smoker](./buffalo_roast-smoker.md) | 3 (US ×3) | wrap at 145 or 165 °F; finish 195 °F (slice) / 205–210 °F (pull) | 74 °C wrap → 91–99 °C finish | ⚠️ count + distinct open |

## Styckesprofil

En bisonstek är en hel muskel från bog, sirloin tip, runt eller revben, ungefär 1–2 kg, och skiljer
sig från sin nötköttsekvivalent i ett avgörande strukturellt faktum: **det finns nästan inget
intramuskulärt fett**. Bison har cirka 2,4 g fett per 100 g kokt kött mot 10 g eller mer för
jämförbara nötköttsnitt, och det yttre fettlagret är tunt eller saknas. Det som bygger saftighet i
nötkött — marmorering som smälter inifrån och ett fettlock som bastar ytan — finns inte här. Det
som finns är **kollagen**: tätt använda bog- och rundmuskler är omgivna av bindvävshinnor, och de
två stora metoderna för snittet definieras av vad de gör med dem.

Det ger snittet en tydlig metodgaffel: **premiumdelar** (revben, sirloin tip) behandlas som en mager
biff i storformat — låg ugn (107 °C), kort hög värme för skorpa och **52–57 °C** vid bordet.
**Arbetsdelar** (bog, runt) tillagas **förbi** alla doneness-band till **91–99 °C**, antingen
bräserade vid 120–150 °C eller rökta och inlindade vid 74 °C. Sonden mäter där framsteg, inte
önskemål; den verkliga signalen är en gaffel.

Eftertillagning är den största i snittets material och är uppmätt, inte antagen: en stek dras vid
**52 °C och vilar till 57 °C** (5 °C på 20 minuter). Vila 10–30 minuter. Innertemperatur:
**54 °C (130 °F)** för premiumdelar, **93 °C (199 °F)** för bräserade/rökta arbetsdelar. Sond i
den tjockaste muskeldelen, borta från ben och fettfickor.

## Research files by cooking method

- [Braise](./buffalo_roast-braise.md) — 3 sources (US Wyoming ranch cookery, US food media, Lakota Indigenous cookery); ⚠️ count + distinct rows open; no source publishes an internal temperature, recorded honestly
- [Oven Roast](./buffalo_roast-oven_roast.md) — 3 sources (US ×3); ⚠️ count + distinct rows open; carries the measured 125 → 135 °F carryover and the only separate rare track
- [Smoker](./buffalo_roast-smoker.md) — 3 sources (US ×3); ⚠️ count + distinct rows open; carries the wrap-at-145-vs-165 °F split

## Improvement potential

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | ✓ fixed 2026-10-26 (survey on fetched pages; `oven_roast` and `braise` confirmed and rewritten, `smoker` discovered and registered — id 651 had listed **only** `oven_roast`, so `braise` had been declared in the hub without ever being registered; leads recorded in the frontmatter comment) |
| Culinary Group B covered | ✓ (US across all three leaves, including Lakota Indigenous cookery) |
| `## Cut profile` + anatomy | ✓ (rewritten around the absence of marbling, the collagen sheath, and the premium-vs-working sub-cut fork; the unsourced "135 °C maximum" and "reverse searing gives the best result" claims from the old oven leaf are gone) |
| Method leaf files exist | ✓ (3 leaves, was 2 — and the oven leaf went from **zero** source recipes to three) |
| Safe temperature research evidence | ✓ (explicit pull lines in all three leaves; every published value quoted verbatim; the braise and smoker leaves state plainly that the sources publish no internal temperature and mark their own numbers as house guidance) |
| Preferred-temperature research evidence | ✓ (the premium-cut 52–54 °C consensus and the working-cut 91–99 °C target are both documented, and the leaf text notes the registry bands only apply to the former) |
| Per-method temperature data | ✓ (table in Cut profile above) |

### Integrity work recorded this pass

The oven-roast leaf it replaces contained **no source recipes at all** — a "collection not yet
started" banner and two guide references whose own text admitted they were not recipes — yet the
hub already claimed the cut was "cooking_methods_researched: 1" and its profile cited a National
Bison Association 145 °F target. Both are now handled honestly: the 145 °F producer convention is
recorded as a convention alongside the fetched corpus's 52–54 °C premium pulls, and the
`cooking_methods_researched` flag reflects a survey that was actually completed. The braise leaf
it replaces held one record (a thekitchn.com adaptation) plus an unsourced "88–95 °C held 2–3
hours" claim presented as fact; the same Sean Sherman recipe is now recorded from its Red Cliff
publication with real quantities, and the invented temperature claim is gone.

**Uncounted references, not sources:** Nebraska Bison's oven-bake guide (130–135 °F medium-rare /
140–145 °F medium, rest 15–20 min) and Bison Ridge Farms' guide (275 °F; rare 125/135, medium-rare
135/145, medium 145/155 °F; "undercook by 10° and rest 20 minutes") — both fetched, both producer
instruction pages without ingredient quantities.

### Improvement priorities

1. **−1 each** · Groups A, C and D: fetchable non-North-American bison or water-buffalo roast recipes. The Group C search returned literally nothing for "bison tagine"; a Levantine/Persian braise of buffalo chuck or an Indian *nihari*-style buffalo roast would be the realistic routes.
2. **−1 each** · Widen all three leaves past three sources — the fastest route is one more US recipe per leaf, which clears the count rows without touching the distinct rows.
3. **−1 each** · The three distinct rows: one Canadian (very plausible — Canadian bison ranching is large and mostly unexplored in this corpus), German or Nordic roast record per leaf would clear them.
4. Queued leaves: `pressure_cooker` (beckandbulow's Instant Pot bison pot roast is fully fetched and needs one companion source), `slow_cooker` (an 8-hour crock-pot bison chuck recipe), `sous_vide` (Bison Ridge Farms links to its own sous-vide recipe — unfetched).
5. Data gap worth a future schema pass: braised and smoked roasts finish at 91–99 °C, which no existing doneness band covers. The leaves record the house 93 °C figure; the engine cannot yet express it.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
