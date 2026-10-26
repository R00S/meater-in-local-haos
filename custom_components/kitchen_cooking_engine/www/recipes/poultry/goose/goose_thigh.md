<!-- KCE:CUT
type: cut
slug: goose_thigh
name: Goose Thigh
name_sv: Gåslår
name_da: Gåseoverlår
category: poultry
meat: goose
cut_type: Goose
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: dark_meat_optimal
methods:
- braise
- oven_roast
doneness:
- name: safe
  target_c: 74
  target_f: 165
  min_c: 74
  min_f: 165
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
- name: dark_meat_optimal
  target_c: 77
  target_f: 170
  min_c: 74
  min_f: 165
  max_c: 82
  max_f: 180
  usda_safe: true
  recommended: true
quality_score: 15
cooking_methods_researched: 1 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-10-26
rest_time_min: 10
rest_time_max: 15
carryover_temp_c: 4
-->
# Goose Thigh — Cut Overview

## Cut profile

Goose thigh (*gåslår*, Swedish; *Gänseschenkel*, German; *cuisse d'oie*, French; *gęsie nogi*,
Polish) is the top portion of the leg — the *biceps femoris*, *semitendinosus*,
*semimembranosus* and *gracilis* muscles around the femur. Goose thigh is much richer and fattier
than chicken or turkey thigh: a goose's subcutaneous and intramuscular fat is higher in oleic
acid, giving it a silkier texture when rendered. The combination of highly worked muscle fibres
and a thick fat layer means the thigh is the darkest, most flavourful part of the goose — more so
even than the leg — and that fat is what makes a long oven cook possible without drying.

### Why this cut wants a temperature most poultry would call overcooked

The eight fetched records across the two leaves settle this cut's central question, and they
agree: goose thigh is done at **75–85 °C**, with **80 °C** as the number three independent German
sources name. That is 6 °C *above* the 74 °C USDA poultry minimum, and it is not carelessness —
it is the collagen. At 74 °C the meat is safe but still firm and the skin has not fully rendered;
by 80 °C the connective tissue has converted to gelatine, the leg loosens from the bone (NDR's
physical test), and the fat has run out into the tray or the sauce.

So this cut carries two bands and recommends the higher one:

| Band | Target | Reads as |
|---|---|---|
| `safe` | 74 °C / 165 °F | USDA minimum — safe, still chewy |
| `dark_meat_optimal` | 77 °C / 170 °F, up to 82 °C | **recommended** — inside the corpus's 75–85 °C window |

The record that publishes the widest band (eat.de) gives **75–79 °C for rosa** and **80–85 °C for
durch**, which brackets both registry bands and justifies recommending the upper one.

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Sources | Observed numerical evidence | Measured band | Gate status |
|---|---|---|---|---|---|
| Braise | [braise](./goose_thigh-braise.md) | 4 (DE ×4) | 80 °C gar (Die Frau am Grill); ≥80 °C (NDR); 75–79 / 80–85 °C (eat.de); 1 silent | 75–85 °C | ⚠️ distinct row open (DE ×4) |
| Oven roast | [oven_roast](./goose_thigh-oven_roast.md) | 4 (UK, PL, DE, US) | no leg temperature in any source; breast 55 °C (Raymond Blanc) | none published for the leg | ✅ count + distinct met |

## Styckesprofil

Gåslår (*Gåseoverlår*; *Gänseschenkel*; *cuisse d'oie*; *gęsie nogi*) är den övre delen av benet —
*biceps femoris*, *semitendinosus*, *semimembranosus* och *gracilis* kring lårbenet. Det är
betydligt fetare och mörkare än kyckling- och kalkonlår: gåsens fett är rikare på oljesyra, vilket
ger en silkeslenare textur när det renderar, och fettlagret under skinnet är det som gör att låret
tål en lång ugnstillagning utan att torka.

Åtta hämtade recept i de två bladen ger samma svar: gåslåret är klart vid **75–85 °C**, och **80
°C** är siffran tre oberoende tyska källor anger. Det ligger 6 °C över USDA:s minimitemperatur för
fågel (74 °C) och är avsiktligt: vid 74 °C är köttet säkert men segt och skinnet har inte renderat
färdigt; vid 80 °C har bindväven blivit gelé och låret släpper från benet. Dra därför vid
**77 °C** och räkna med 3–4 °C eftertillagning, eller gå till 80 °C om du vill ha det
genomstekt och skinet knaprigt. Vila 10–15 minuter.

**Metodskillnad:** bräserat lår (150–180 °C i Bräter, 1–1,5 timme, gärna med vin eller fond) ger
såsen på köpet; ugnsrostade lår (150–200 °C på bädd av frukt eller ben, 2,5–3 timmar, eller
kortare med grill-final) kräver i stället att skinnet prickas, torkas och saltas före rostning.

## Research files by cooking method

- [Braise](./goose_thigh-braise.md) — 4 sources (DE ×4); ⚠️ distinct row open; carries the cut's numeric evidence (75–85 °C, 80 °C practical) and the low-temperature 80 °C variant
- [Oven Roast](./goose_thigh-oven_roast.md) — 4 sources (UK, PL, DE, US); ✅ count + distinct met; technique-only — no source publishes a leg temperature for this method

## Quality score

**Score: 15 / 20** — assessed 2026-10-26 (was 8 on 2026-04-26)

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | ✓ fixed 2026-10-26 (both declared methods confirmed against eight fetched recipes; `cooking_methods_researched: 1`; **`confit` discovered but not registered** — see below) |
| Culinary Group A covered | ⚠️ missing — no South/Southeast/East Asian goose-thigh record was found — − **−1** |
| Culinary Group B covered | ✓ (British/French and US records in oven_roast) |
| Culinary Group C covered | ⚠️ missing — no African, Caribbean, Levantine or Persian record — − **−1** |
| Culinary Group D covered | ✓ (German ×5, Polish) |
| `## Cut profile` + anatomy | ✓ (rewritten: the 74-vs-80 °C argument and the band table are now explicit) |
| Method leaf files exist | ⚠️ 2 of the 4-leaf target — − **−2** |
| Safe temperature research evidence | ✓ (the 80 °C done point is cited to three sources including a public broadcaster; the 74 °C minimum is kept as the separate `safe` band rather than dropped) |
| Preferred-temperature research evidence | ✓ (the 75–79 / 80–85 °C split is recorded, and the roast leaf states honestly that no leg temperature exists for that method) |
| Per-method temperature data | ✓ (table in Cut profile above) |
| Source counts (4 per leaf) | ✓ (4 / 4) |
| Leaf files failing the distinct-tradition gate (binary): braise (DE ×4) | − **−1** |

**Deductions**: −1 Group A · −1 Group C · −2 leaf target · −1 braise distinct = −5 → **15**

### Registry correction recorded this pass

`goose_thigh` in `cooking_data.py` declared `recommended_doneness="well_done"`, a band this cut
does **not** define — its bands are `safe` and `dark_meat_optimal` (the same class of bug found on
`cured_ham` in the previous pass). It now declares `dark_meat_optimal`, which is also what the
corpus supports.

### Method discovered but not registered

**Confit.** The French corpus for this cut is overwhelmingly confit — goose legs salted overnight
and poached slowly in their own fat (12-hour cooks appear repeatedly, e.g. Québec's FédéCP and
Sentier Chasse-Pêche records). There is no `confit` value in `CookingMethod`, and inventing one
would require a `CookingMethodInfo` entry, an AI-style mapping and panel support, so it is
**recorded as a queued system change rather than faked as `braise`**. This is the single biggest
missing method on this cut.

### Improvement priorities

1. **−2** · Two more leaves: `confit` once the enum supports it (the highest-value addition, with
   four French sources already identified), and `smoker` (Wildfowl's pulled goose legs and Idaho
   Fish & Game's smoked goose; the Wildfowl page is paywalled and Idaho's is breast-focused, so
   both need verification before they can be counted)
2. **−1 each** · Groups A and C — searched and not found on this pass; record the searched-negatives
   if a second attempt also fails
3. **−1** · Braise distinct row: one non-German braised goose-leg source (Swedish *gåslår i ugn*
   or Danish *gåselår* would fix it and would also widen Group D's internal diversity)

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
