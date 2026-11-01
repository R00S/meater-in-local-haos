<!-- KCE:CUT
type: cut
slug: quail
name: Quail
name_sv: Vaktel
name_da: Vagtel
category: poultry
meat: quail
cut_type: Quail
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: well_done
methods:
- grill
- oven_roast
- pan_fry
- smoker
- braise
doneness:
- name: well_done
  target_c: 74
  target_f: 165
  min_c: 71
  min_f: 160
  max_c: 80
  max_f: 176
  usda_safe: true
  recommended: true
improvement_potential: unrated
cooking_methods_researched: 1
quality_assessed: 2026-10-23
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 2
-->
# Quail — Cut Overview

## Cut profile

Quail — primarily Japanese quail (*Coturnix japonica*, the main farmed species worldwide) and common/European quail (*Coturnix coturnix*) — are small game birds weighing 100–200 g whole, served one to two per person. The flesh is dark, flavourful, and slightly gamey, with a fat content and texture comparable to a small chicken. Because of the tiny size, the bones are thin and easily chewed through; the birds are classically served whole (spatchcocked or intact). USDA safe temperature is 165 °F (74 °C) as for all poultry. Common cooking methods span the globe: grilling and oven roasting are the most widespread (French *caille rôtie*, Italian *quaglie arrosto*); pan-frying whole or spatchcocked is popular in Spanish (*codornices a la española*), Egyptian, and Indian cuisines; stovetop box smoking and wok/tea smoking are important East Asian methods — Chinese wok-smoked quail (*茶熏鹌鹑*, tea-smoked quail) is a classic banquet dish and a direct parallel of Scandinavian abu-röken. China is the world's largest producer and consumer of quail meat. Quail is also popular in Middle Eastern, Mexican, and North African cuisines. Probe placement: insert into the thickest part of the breast, avoiding the wishbone.

## Styckesprofil

Vaktel — främst japansk vaktel (*Coturnix japonica*, huvudsaklig odlad art globalt) och europeisk vaktel (*Coturnix coturnix*) — är en liten, smakrik fågel på 100–200 g hel, serveras en till två per person. Köttet är mörkt, smakfullt och lite viltigt, med fetthalt och textur jämförbar med en liten kyckling. Benen är tunna och enkla att tugga igenom, varför fåglarna klassiskt serveras hela (fjärilsöppnade eller intakta). USDA-säker temperatur är 74 °C (165 °F) liksom för övrig fjäderfä. Vaktel rostas i ugn (*caille rôtie*), grillas, steks i panna och röks — kinesisk wok-rökning och te-rökning (*茶熏鹌鹑*) är klassiska bankettberedningar som är direkt parallella med skandinavisk röklåde-rökning (abu-röken). Kina är världens största producent. Sond placeras i tjockaste delen av bröstet, fri från bröstbenet.

## Research files by cooking method

- [Grill](./quail-grill.md) — 2 fetched sources (US Group B with 150–155 °F breast endpoint; TR Group C).
- [Oven Roast](./quail-oven_roast.md) — 5 fetched sources (CN Group A, ES/IT Group B, TR Group C, RU Group D); collection gate met, no source states a pull temperature.
- [Pan Fry](./quail-pan_fry.md) — 2 fetched sources (TR Group C, IT Group B).
- [Smoker](./quail-smoker.md) — 1 fetched source (US/Chinese technique); book lead (Neil Perry, *Rockpool*) recorded, not collected.
- [Braise](./quail-braise.md) — 2 fetched sources (US/Greek and ES, both Group B); newly discovered method, registered in `cooking_data.py`.

All five declared methods have a leaf file. Only `oven_roast` meets the 4–6-source collection gate; the others carry explicit partial-research markers.

## Improvement potential

Not yet rated under the current system — read the criteria in `IMPROVEMENT_POTENTIAL_SYSTEM.md` and record a reading before using this file to order the queue.

### Improvement priorities

1. Bring each partial leaf to the 4–6-source gate — starting with `quail-smoker.md` (1 source; collect the Chinese 茶熏鹌鹑 primaries and the Neil Perry *Rockpool* book recipe).
2. Expand Group A coverage beyond the single oven_roast source into other methods (grill, smoker, braise) — Japanese *uzura* and Chinese preparations are documented traditions.
3. Add a Group C source to `quail-braise.md` (Moroccan/Egyptian quail tagine) and a Group A or D source to `quail-grill.md` and `quail-pan_fry.md`.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
