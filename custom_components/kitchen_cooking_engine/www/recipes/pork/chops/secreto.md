<!-- KCE:CUT
type: cut
slug: secreto
name: Secreto (Ibérico Pork)
name_sv: Secreto
name_da: Secreto af iberisk gris
category: pork
meat: pig
cut_type: Chops & Tenderloin
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- braise
- charcoal_grill
- grill
- oven_roast
- pan_sear
- sous_vide
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
improvement_potential: 11
cooking_methods_researched: 1 # Enum-wide survey 2026-10-26, fetched sources for this exact cut. Confirmed+leafed: pan_sear, grill, charcoal_grill, oven_roast, braise, sous_vide. Queued leads (widening before leafing): air_fryer (recetasairfryernuria.com plancha-style air-fryer page; Cookpad "Secreto Ibérico en Airfryer"), slow_cooker (Cookpad "Secreto de cerdo en Crockpot"), smoker (informal social posts only: smoked at 250 °F to 125 °F internal, then grilled to 135 °F), pressure_cooker (Katy's guisado uses a pressure pot as a braise variant — no separate pressure-cooker recipe found). Documented negatives 2026-10-26: steam, poach, simmer, boil, saute — no cut-specific recipes found in the traditions searched; oven_bake/oven_broil treated as oven_roast variants for this cut (Recetas con Sazón's grill-function finish is recorded inside oven_roast).
quality_assessed: 2026-10-26
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 3
-->
# Secreto (Ibérico Pork) — Cut Overview

## Cut profile

The *secreto* (Spanish: "secret") is cut from the junction between the shoulder blade and the belly of the Iberian pig — the *serratus ventralis* and *subscapularis* muscles in the deepest layer of the shoulder, running diagonally. It is called "secret" because it is hidden beneath the outer shoulder and was historically an undiscovered, unadvertised cut consumed by the butcher. Standard dimensions: roughly 30–40 cm long × 5–8 cm wide × 1–2 cm thick; irregular in shape, covered with coarse intramuscular fat seams. In Iberian-breed pigs specifically, the fat carries acorn-derived oleic acids and the characteristic *bellota* aroma. Non-Iberian secreto has similar structure but milder flavour.

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Sources | Observed numerical evidence | Measured band | Gate status |
|---|---|---|---|---|---|
| Pan sear | [pan_sear](./secreto-pan_sear.md) | 5 | 55–60 °C "rosa / medium rare" (CH); four sources silent | 55–60 °C | ⚠️ distinct row open (ES ×2, CH ×2) |
| Grill | [grill](./secreto-grill.md) | 4 | 135–140 °F pull → 145 °F served (US) | 57–63 °C | ✅ CONFORMS (4 traditions) |
| Charcoal grill | [charcoal_grill](./secreto-charcoal_grill.md) | 3 | 65 °C kamado core target (IT) | 65 °C | ⚠️ count row open |
| Oven roast | [oven_roast](./secreto-oven_roast.md) | 3 | none — 50–60 min colour endpoints at 180–200 °C | — (house 68 °C) | ⚠️ count + distinct open (ES ×2) |
| Braise | [braise](./secreto-braise.md) | 3 | none — strips/dice simmered minutes in sauce | — (no probe in tradition) | ⚠️ count + distinct open (ES ×2) |
| Sous vide | [sous_vide](./secreto-sous_vide.md) | 3 | 55 °C/2 h (US), 57 °C/24 h (NL), 62 °C/3 h (IT) | 55–62 °C (bath = core) | ⚠️ count row open |

## Styckesprofil

*Secreto* (spanska: "hemlighet") skärs från korsningen mellan skulderblad och magen på det iberiska grisen — *serratus ventralis*- och *subscapularis*-musklerna i det djupaste lagret av skuldern. Det kallas "hemligt" snitt eftersom det traditionellt förbehölls slaktaren.

Köttet är extremt marmorerat med distinkt intramuskulärt fett och en unik fjärillad form. Det är en delikatess i den iberiska *bellota*-traditionen och tillagas i traditionell *plancha*-teknik. Innertemperatur: **60–65 °C (140–149 °F)** för medium. Eftertillagning: 2–3 °C. Sond insatt längsvis in till mitten av det tunnaste snittet.

## Research files by cooking method

- [Braise](./secreto-braise.md) — 3 sources (ES ×2, international home blog); ⚠️ count + distinct open
- [Charcoal Grill](./secreto-charcoal_grill.md) — 3 sources (US, IT, NL-braai technique); ⚠️ count open
- [Grill](./secreto-grill.md) — 4 sources (ES, US, BE, NO); ✅ both gates met
- [Oven Roast](./secreto-oven_roast.md) — 3 sources (ES ×2, JP); ⚠️ count + distinct open
- [Pan Sear](./secreto-pan_sear.md) — 5 sources (ES ×2, DE, CH ×2); ⚠️ distinct row open
- [Sous Vide](./secreto-sous_vide.md) — 3 sources (IT, US, NL); ⚠️ count open

## Improvement potential

11

### Improvement priorities

1. Raise `charcoal_grill`, `oven_roast`, `braise` and `sous_vide` to the 4-source count — one further fetched source per leaf (Portuguese *grelhado*/German grill for charcoal; Portuguese *assado* or a German/Scandinavian oven source; Portuguese *estufado* or Greek *stifado* for braise; a Spanish/German precision-cooking page — dehesium.com is a preserved lead — for sous_vide)
2. Clear the three distinct-tradition rows: one non-Spanish, non-Swiss plancha source (pan_sear), one non-Spanish oven source (oven_roast), one unambiguous non-Spanish braise source (braise)
3. Group C source for the cut anywhere (a true South-African *braai* secreto plate, or Moroccan/Turkish/Caribbean treatment) — the −1 stands as documented gap until a source is fetched
4. Group A depth — a second method carrying a Japanese/Korean/Chinese/Thai source (currently only the oven_roast roulade)
5. Queued method leads to widen next pass: `air_fryer` (recetasairfryernuria.com, Cookpad), `slow_cooker` (Cookpad Crockpot), `smoker` (informal social posts), `pressure_cooker` (none separate from braise)
6. Cut-level doneness decision queued for one deliberate pass: the measured 55–62 °C cluster is now three leaves strong (sous_vide ×3 measured, pan_sear 55–60 °C, grill 57–60 °C pull) against a whole-cut `well_done` default; method keys already read `medium` for grill, charcoal_grill and sous_vide. Not changed piecemeal.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
