<!-- KCE:CUT
type: cut
slug: buffalo_burger
name: Burger
name_sv: Buffelburgare
name_da: Bøffelburger
category: game
meat: buffalo
cut_type: Buffalo
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- air_fryer
- grill
- pan_fry
- smoker
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
improvement_potential: 16
cooking_methods_researched: 1 # Method survey completed 2026-10-26 on fetched pages only. Declared + leafed: grill, pan_fry (both rewritten), air_fryer and smoker (both discovered this pass and registered in cooking_data.py id 632). Queued leads (widening before declaring): charcoal_grill (Wrågården's "glöden gråvit" ember grill and Basil and Bubbly's "use a charcoal grill instead of a gas grill" are both notes inside other leaves; BBQGuys' charcoal/cast-iron buffalo burger returns 403), oven_bake (Healthy Delicious fetches: 2+2 min cast-iron sear then 300 °F oven 4–8 min for medium-rare — a real sear-then-oven record, needs 2–3 more sources before it earns a leaf), reverse_sear (With the Woodruffs describes it as a finish on its smoker recipe). Documented searched-negative 2026-10-26: Culinary Group A — carabeef/carabao and Indian/Nepali buffalo-mince patty recipes return only social-media posts, no fetchable recipe.
quality_assessed: 2026-10-26
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Burger — Cut Overview

## Cut profile

"Buffalo burger" is not one animal. The English-language usage covers patties made from
**American bison** (*Bison bison*), from **water buffalo** (carabeef, *carabao* in the
Philippines), and from **beefalo**; the fetched US recipes are all bison, while South Asian and
Italian water-buffalo cookery is a different meat with different fat. This hub's corpus is
bison-led, and one of its four leaves records a **60 % bison / 40 % pork** Swedish product —
flagged in place rather than smoothed into "buffalo".

Anatomically the cut has no single muscle. A burger patty is **ground** meat, most often from
the shoulder (chuck), the round, or a trim blend, and grinding destroys the muscle structure
that every whole-cut profile in this project is built around: there is no grain to cut across,
no fat cap to render, and no connective tissue to dissolve. What replaces those variables is
**particle size and fat ratio**. Bison is leaner than commodity beef — the fetched recipes name
**90/10**, **94 % lean**, and one producer's blend adds pork to reach a workable fat level — so
the patty has very little internal fat to lubricate it or to insulate it from heat. That single
fact explains the whole cut: bison patties cook faster than beef patties, dry out sooner, and
can crumble because lean mince binds poorly. The corpus answers with three techniques, all
recorded in the leaves: **binders** (egg with panko or breadcrumbs; grated onion, herbs and a
ten-minute chill), **stuffing** (bacon, cheddar and chipotle worked through the middle), and
**speed** (thin patties on a very hot surface).

Ground meat also changes the safety question. Grinding distributes surface bacteria throughout
the mass, so the USDA treats ground meat as requiring **71 °C / 160 °F** with no whole-muscle
exception, and this cut's registry carries `well_done` as its only band for that reason. The
corpus is honest about the tension: four of the fourteen fetched records cook to 63–65 °C
because they prefer the texture, and one smoker record replaces the instant-read threshold with
a **time-at-temperature pasteurisation** (140 °F held 12 minutes), citing ThermoWorks/HITM and
Serious Eats. Both positions are recorded in the leaves rather than averaged; the cut stays at
`well_done`, and the per-method notes say where the disagreement lives.

Patty geometry is the practical control: **1.5–2 cm thick** and 115–170 g is the corpus's
working range (`estimated_thickness_mm: 20` in the registry), probe horizontally from the side
into the geometric centre, indent the middle with a thumb so the patty does not dome, and rest
2–5 minutes — carryover is small but measured (one source pulls at 155 °F specifically to land
at 160 °F after the rest).

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Counted sources | Observed numerical evidence | Applied target | Gate status |
|---|---|---|---|---|---|
| Grill | [grill](./buffalo_burger-grill.md) | 4 (US ×2, Levantine, SE) | 160 °F endpoint (US); **at least 70 °C** (SE); pull 155 → final 160 °F (US, uncounted temp-only record) | 71 °C / 160 °F | ✅ count + distinct met |
| Pan fry | [pan_fry](./buffalo_burger-pan_fry.md) | 3 (US ×2, SE) | 160 °F (US); **at least 70 °C** (SE); smash record verbal only | 71 °C / 160 °F | ⚠️ count below 4 |
| Air fryer | [air_fryer](./buffalo_burger-air_fryer.md) | 4 (US ×4) | 160 °F ×2; 145–160 °F range; 145 °F preferred | 71 °C / 160 °F | ⚠️ distinct row open (US ×4) |
| Smoker | [smoker](./buffalo_burger-smoker.md) | 2 (US, CA) | 140 °F held 12 min (pasteurisation); 150 °F (CA) | 71 °C / 160 °F, hold protocol recorded | ⚠️ count below 4 |

## Styckesprofil

"Buffelburgare" är inte ett djur. Bruket omfattar amerikansk bison, vattenbuffel (carabeef,
*carabao* på Filippinerna) och beefalo; de hämtade amerikanska recepten är alla bison, medan
sydayasisk och italiensk vattenbuffel är ett annat kött med annan fetthalt. Det här snittets
material är bisonlett, och ett av de fyra bladen dokumenterar en **svensk produkt med 60 %
bison och 40 % fläsk** — flaggad på plats i stället för bortputsad.

Anatomiskt har snittet ingen enskild muskel. En burgare är **malet** kött, oftast från bog,
runt eller en trimmblandning, och malningen förstör den muskelstruktur som alla andra
styckesprofiler i projektet bygger på: det finns ingen fiberriktning att skära emot, inget
fettlock att rendera och ingen bindväv att lösa upp. Det som ersätter de variablerna är
**partikelstorlek och fettkvot**. Bison är magrare än vanligt nötkött — recepten anger **90/10**,
**94 % magert** och en producent tillsätter fläsk för att nå en arbetsbar fetthalt — så biffen
har mycket lite internt fett att smörja sig med eller isolera sig med. Därför går bisonburgare
snabbare än nötburgare, torkar tidigare och kan falla sönder, eftersom magert kött binder
sämre. Materialet svarar med tre tekniker: **bindemedel** (ägg med panko eller ströbröd; riven
lök, örter och tio minuters kyla), **fyllning** (bacon, cheddar och chipotle genom mitten) och
**fart** (tunna biffar på mycket het yta).

Malet kött ändrar också säkerhetsfrågan: malningen fördelar ytbakterier genom hela massan, så
USDA kräver **71 °C / 160 °F** för malet kött utan undantag för hela muskler, och registret har
därför `well_done` som enda band. Innertemperatur: **71 °C (160 °F)**. Eftertillagning: 2 °C
över 2–5 minuters vila — ett källbelagt mått, en källa drar vid 155 °F just för att landa på
160 °F. Sond horisontellt från sidan in mot biffens geometriska mitt, inte genom kanten. Forma
**1,5–2 cm tjocka** biffar på 115–170 g och tryck en grop i mitten så att de inte kupar sig.

## Research files by cooking method

- [Air Fryer](./buffalo_burger-air_fryer.md) — 4 sources (US ×4); ⚠️ distinct row open (US only); records the 63 °C-vs-71 °C split most fully
- [Grill](./buffalo_burger-grill.md) — 4 sources (US ×2, Levantine kafta, Swedish farm producer); ✅ count + distinct met; carries the pull-155-rest-to-160 measurement
- [Pan Fry](./buffalo_burger-pan_fry.md) — 3 sources (US ×2, Swedish farm producer); ⚠️ count below 4; records the press/no-press disagreement (smash vs gentle sear)
- [Smoker](./buffalo_burger-smoker.md) — 2 sources (US pellet, Canadian charcoal); ⚠️ count below 4; carries the pasteurisation-hold protocol (140 °F / 12 min)

## Improvement potential

**Improvement potential: 16 / 20** — assessed 2026-10-26 (was 8 on 2026-04-26)

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | ✓ fixed 2026-10-26 (survey on fetched pages; `grill` and `pan_fry` confirmed, `air_fryer` and `smoker` discovered and registered in `cooking_data.py` id 632; leads and searched-negatives recorded in the frontmatter comment) |
| Culinary Group A covered | ✗ absent cut-wide — searched 2026-10-26 (carabeef/carabao, Indian and Nepali buffalo mince); only social-media posts found, no fetchable recipe — **−1** |
| Culinary Group B covered | ✓ (US across all four leaves; Canada in smoker) |
| Culinary Group C covered | ✓ (Levantine bison kafta in grill — the only Group C record, form-flagged) |
| Culinary Group D covered | ✓ (Swedish farm producer in grill and pan_fry) |
| `## Cut profile` + anatomy | ✓ (rewritten: ground-meat anatomy, fat-ratio and binders, species ambiguity, pasteurisation reasoning; the old "adding fat prevents dryness" claim is replaced by what the sources actually do) |
| Method leaf files exist | ✓ (4 leaves, was 2; every declared method has a leaf) |
| Safe temperature research evidence | ✓ (explicit pull line in all four leaves; sources' own values quoted verbatim; house guidance marked wherever a source publishes none) |
| Preferred-temperature research evidence | ✓ (the corpus's 63–71 °C split documented method by method, verbatim, instead of averaged) |
| Per-method temperature data | ✓ (table in Cut profile above) |
| Leaf below the 4-source count gate — `pan_fry` (3) | **−1** |
| Leaf below the 4-source count gate — `smoker` (2) | **−1** |
| Leaf failing the distinct-tradition gate (binary) — `air_fryer` (US ×4) | **−1** |

**Deductions**: −1 Group A · −1 pan_fry count · −1 smoker count · −1 air_fryer distinct = −4 → **16**

### Integrity work recorded this pass (why the old number's rows were wrong)

Both pre-ToR leaves gave **every one of their sources the same pull of 70–72 °C (158–162 °F)**,
presented as the sources' own numbers. Fresh fetches show that figure belongs to none of them:
the Food Network, Chefkoch, BBC Good Food, Madensverden and RecipeTin Eats records had no such
bison value, two of them are **beef** patty pages rather than buffalo ones, and Chefkoch now
returns **403** (re-checked 2026-10-26). Those invented records are **retracted**, not carried
forward; nothing in the four leaves is inherited from the old files. The hub's own prose was
also corrected: it claimed "most American recipes cook to medium (63 °C)", which the fetched
corpus contradicts — one source calls 145 °F "a solid medium", another calls 145 °F
medium-rare, and a third calls 160 °F medium. Doneness naming across sources is inconsistent
and is now recorded as such rather than asserted.

**Uncounted references, not sources:** J Bar S Ranch's "Basics of Bison Meat" (a producer's
cooking guide, not a recipe: corroborates 160 °F for burgers, 145–160 °F for steaks); Hey Grill
Hey's grilled bison burger (recipe card did not render, so no quantities — its 155 → 160 °F
pull/final statement is quoted in the grill leaf but excluded from the gate); Traeger's
"Smoked Bison Burgers" (a 450 °F hot-grill recipe, filed under `grill`).

### Improvement priorities

1. **−1** · Culinary Group A: a fetchable South or Southeast Asian buffalo-mince patty recipe — carabeef keema, a Nepali/Indian buffalo cutlet written as a full recipe, or a Filipino carabao burger. Social posts and video results are not citable.
2. **−1** · Widen `smoker` to four sources (a third bison-smoker recipe from the US or Australia/New Zealand would clear the count row in one step).
3. **−1** · Widen `pan_fry` to four sources with a non-US record (a German, Danish or French cast-iron bison patty would clear both the count row and add tradition depth).
4. **−1** · `air_fryer`'s distinct row: one non-US air-fryer bison recipe (UK, Australian or Nordic) clears it; if none exists, the row is structural and should be argued rather than chased.
5. Queued leaves to declare next pass: `charcoal_grill` (Wrågården's ember grill + Basil and Bubbly's charcoal preference noted in-line; BBQGuys 403) and `oven_bake` (Healthy Delicious' sear-then-300 °F-home-oven record needs company before it earns a leaf).
6. Doneness: the cut is settled at `well_done`/71 °C by USDA ground-meat rules. The corpus's minority preference for 63–65 °C is recorded in every leaf; any future change should come from a doneness pass with pasteurisation tables, not from preference alone.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
