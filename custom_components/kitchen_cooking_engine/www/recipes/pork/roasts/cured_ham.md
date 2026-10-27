<!-- KCE:CUT
type: cut
slug: cured_ham
name: Cured Ham (Pre-cooked)
name_sv: Rökt skinka
name_da: Saltet, forkogt skinke
category: pork
meat: pig
cut_type: Ham
usda_safe_c: 60
usda_safe_f: 140
recommended_doneness: heated_through
methods:
- oven_roast
- smoker
doneness:
- name: heated_through
  target_c: 60
  target_f: 140
  min_c: 57
  min_f: 135
  max_c: 63
  max_f: 145
  usda_safe: true
  recommended: true
improvement_potential: 17
cooking_methods_researched: 1 # Survey completed 2026-10-26 on fetched pages. Declared + leafed: oven_roast (rewritten, 4 sources) and smoker (stub replaced, 3 sources, newly registered in cooking_data.py). Queued leads (need full recipe text before declaring): slow_cooker (Spend With Pennies' crock-pot ham was fetched but its card did not render — glaze quantities missing; Kawaling Pinoy links to its own slow-cooker pineapple ham, unfetched), boil/poach as a standalone method (the Danish record boils a smoked ham 35-40 min before glazing and the Filipino record poaches 50-60 min — both are currently recorded inside the oven_roast leaf as first stages rather than as a separate leaf), grill (no fetched record), air_fryer (ham steaks only — a different cut form). Documented searched-negative 2026-10-26: Culinary Group C — a Caribbean Christmas ham search returned only thisbagogirl.com, whose recipe bakes an UNCURED fresh ham to 145 F (a different product), so it is not counted; cookingwithria.com (Trinidad) was fetched and its recipe body did not render.
quality_assessed: 2026-10-26
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 5
-->
# Cured Ham (Pre-cooked) — Cut Overview

## Cut profile

A cured ham is the pig's **hind leg** — the group of muscles around the femur (principally the
*biceps femoris*, *semitendinosus* and *semimembranosus*), left whole, cured in brine or dry salt,
usually smoked, and sold with the **rind and a layer of subcutaneous fat** still on. The curing
is what defines the cut structurally: salt has drawn water out, the proteins are partly
denatured, and the meat is **already cooked and safe** before it reaches the kitchen. In the
spiral-sliced form that dominates the English-language corpus, the leg has then been cut in one
continuous spiral, so it is simultaneously a whole joint and a stack of slices.

That combination — already cooked, bone-in, rind-on, pre-sliced — makes this the only cut in the
project where the probe is confirming a **reheat** rather than measuring doneness. Every fetched
record in both leaves targets the same plateau, **140 °F (60 °C)**, which is also the registry's
`usda_safe_c`; the one source that pulls lower (120 °F, smoking-meat.com) does so because the ham
is fully cooked and the endpoint it is judging is the crispness of the outer slices. Carryover is
deliberate but small: one US source pulls at **135 °F specifically to land at 140 °F**, and rests
are 10–20 minutes.

The rind and fat layer are the method's working parts. They insulate the meat from oven or smoker
air, they hold the diamond scoring that lets a glaze reach the surface, and they are what whole
cloves are pressed into. A ham with the fat trimmed away behaves like a lean roast and dries at
the edges — which is why the two-stage records (boil-then-glaze, poach-then-bake) both exist:
they heat the interior in liquid first and use dry heat only for the crust.

**Cut-form caution.** Two records in the corpus concern hams that are not this cut: a Caribbean
Christmas ham baked from an **uncured** fresh leg to 145 °F, and ham *steaks*. Neither is used as
evidence here. This hub covers the cured, pre-cooked, rind-on joint.

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Counted sources | Observed numerical evidence | Applied target | Gate status |
|---|---|---|---|---|---|
| Oven roast | [oven_roast](./cured_ham-oven_roast.md) | 4 (DK, US ×2, PH) | **140 °F** ×3; pull 135 °F → 140 °F; 1 source publishes none | 60 °C / 140 °F | ✅ count + distinct met |
| Smoker | [smoker](./cured_ham-smoker.md) | 3 (US ×3) | **140 °F** ×2; **120 °F** finish (uncooked-safety argument) | 60 °C / 140 °F | ⚠️ count + distinct open |

## Styckesprofil

En härdad skinka är grisens **bakben** — muskelgruppen kring lårbenet (*biceps femoris*,
*semitendinosus*, *semimembranosus*), hel, saltad eller lagad i saltlake, vanligen rökt och såld
med **svål och underhudsfett** kvar. Härdningen definierar snittet strukturellt: saltet har dragit
ut vatten, proteinerna är delvis denaturerade och köttet är **redan tillagat och säkert** innan
det når köket. I den spiral-skurna form som dominerar materialet är benet sedan skuret i en
sammanhängande spiral, så det är på samma gång en hel stek och en stapel skivor.

Det gör detta till projektets enda snitt där sonden bekräftar en **uppvärmning** i stället för att
mäta doneness. Varje hämtat recept i båda bladen siktar på samma platå, **60 °C (140 °F)**, som
också är registrets `usda_safe_c`; den enda källan som drar lägre (49 °C, smoking-meat.com) gör det
eftersom skinkan redan är färdig och slutpunkten den bedömer är den yttre skivans krispighet.
Eftertillagning: 5 °C över 10–20 minuters vila; en källa drar vid 57 °C just för att landa på
60 °C.

Svålen och fettlagret är metodens arbetsdelar: de isolerar mot ugns- eller rökluft, de håller
rutmönstret som glasyren fäster i, och de är där kryddnejlikorna trycks in. Innertemperatur:
**60 °C (140 °F)**. Sond i den tjockaste köttmassan, borta från lårbenets kärna. Vila 10–20
minuter täckt.

## Research files by cooking method

- [Oven Roast](./cured_ham-oven_roast.md) — 4 sources (Denmark, US ×2, Philippines); ✅ count + distinct met; covers Groups A, B and D
- [Smoker](./cured_ham-smoker.md) — 3 sources (US ×3); ⚠️ count + distinct rows open; carries the 140 °F vs 120 °F divergence

## Improvement potential

**Improvement potential: 17 / 20** — assessed 2026-10-26 (was 8 on 2026-04-26)

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | ✓ fixed 2026-10-26 (survey on fetched pages; `oven_roast` confirmed and rewritten, `smoker` discovered — its leaf had been a bare stub and the method was never registered — both now in `cooking_data.py`) |
| Culinary Group A covered | ✓ (Filipino *hamon*, poach-then-bake, in oven_roast) |
| Culinary Group B covered | ✓ (US ×2 in oven_roast, US ×3 in smoker) |
| Culinary Group C covered | ✗ — the Caribbean search produced only an uncured-ham recipe (different product) and one page whose body did not render — **−1** |
| Culinary Group D covered | ✓ (Danish glazed ham in oven_roast) |
| `## Cut profile` + anatomy | ✓ (rewritten around the hind-leg muscle group, the rind-and-fat layer, and the fact that this is a reheat cut; the old profile's "70–75 °C" target was unsourced and is replaced by the corpus's 140 °F) |
| Method leaf files exist | ✓ (2 leaves — the smoker leaf went from a stub to three sources; **−1** recorded below because the cut still averages 2 leaves against the 4-leaf target) |
| Safe temperature research evidence | ✓ (explicit pull lines in both leaves; three published 140 °F figures quoted verbatim; the Danish record states plainly that it publishes none) |
| Preferred-temperature research evidence | ✓ (140 °F plateau documented independently by three sources across two methods, with the 120 °F outlier analysed rather than averaged) |
| Per-method temperature data | ✓ (table in Cut profile above) |
| Cut below the 4-leaf target (2 leaves) — branch convention row | **−1** |
| Leaf below the 4-source count gate — `smoker` (3) | **−1** |
| Leaf failing the distinct-tradition gate — `smoker` (US ×3) | **−1** |

**Deductions**: −1 Group C · −1 leaf target · −1 smoker count · −1 smoker distinct = −4 → **17**

### Integrity work recorded this pass

The oven-roast leaf it replaces had given **all three of its sources the same 70–75 °C pull** and
had inserted "MEATER probe" steps into recipes that contain none — a Danish glazed ham whose page
publishes no internal temperature and judges the ham by the colour of its glaze, and two Chefkoch
pages that now return **403** (re-checked 2026-10-26). Those records are retracted; the Danish
recipe is kept but rewritten from the live page, and the two Chefkoch records are gone. The
smoker leaf was a literal stub — no profile, no sources, no analysis — yet the cut's
`cooking_data.py` entry listed only `oven_roast`, so the stub had never been reachable. It is now
a real leaf and the method is registered.

**Registry bug fixed this pass:** `cooking_data.py` gave this cut `recommended_doneness="well_done"`,
a band the cut does not define (its only range is `heated_through`, 57–63 °C). It now reads
`heated_through`, matching both the recipe hub and the fetched corpus.

### Improvement priorities

1. **−1** · Culinary Group C: a real cured-ham record from a Caribbean, African, Levantine or Persian tradition. Trinidad is the obvious route and cookingwithria.com's page exists but did not render — a mirror or a different Trinidadian/Jamaican recipe would clear it.
2. **−1** · Widen `smoker` to four sources and add one non-US record (a Canadian or UK double-smoked ham would clear both rows at once).
3. **−1** · Add a third method leaf: `slow_cooker` is the cheapest (Spend With Pennies' crock-pot ham needs only its card re-fetched, and Kawaling Pinoy publishes its own slow-cooker pineapple ham), with `boil` as a possible fourth given that both the Danish and Filipino records already contain a full boil/poach stage.
4. The 120 °F finish in smoking-meat.com should be revisited if this cut ever gets a pasteurisation-style doneness pass — it is a legitimate reheat temperature for an already-cooked ham but sits well below the registry's floor.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
