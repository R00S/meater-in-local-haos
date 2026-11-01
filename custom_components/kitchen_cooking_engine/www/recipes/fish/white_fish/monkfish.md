<!-- KCE:CUT
type: cut
slug: monkfish
name: Monkfish
name_sv: Marulk
name_da: Havtaske
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_sear
- oven_roast
- grill
- braise
- sous_vide
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
improvement_potential: 12
cooking_methods_researched: 1
quality_assessed: 2026-05-31
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Monkfish — Cut Overview

## Cut profile

Monkfish (*Lophius piscatorius*, Swedish: marulk / havsfisk, German: Seeteufel / Anglerfisch, French: lotte / baudroie, Spanish: rape, Italian: coda di rospo) is a large, bizarre-looking bottom-dwelling fish of the family Lophiidae, found throughout the North Atlantic and into the Mediterranean. Only the tail section is sold — cleaned of its thick, grey-purple skin to reveal firm, bright white, boneless flesh with a single central bone along the spine. It is sometimes called the "poor man's lobster" due to its firm, sweet, slightly rubbery texture reminiscent of lobster tail when cooked. Fat content is very low (less than 1 g per 100 g). The thick, meaty tail steaks and fillets suit treatment like meat: pan-searing in butter (developing a golden crust), oven-roasting on the bone, and grilling. It is one of the few fish that can be braised and benefits from it. It holds together well on the grill and in stews. Monkfish is widely sold at Scandinavian fish counters and is popular in Spanish, French, Italian, and UK fine and home cooking. Its firm texture means it does not flake apart easily and can be cooked to a higher internal temperature than delicate white fish without becoming dry. Probe placement: insert lengthwise into the thickest part of the tail fillet, clear of the central spine.

## Styckesprofil

Marulk (*Lophius piscatorius*; tyska: Seeteufel; franska: lotte/baudroie; spanska: rape) är en stor bottenfisk i familjen Lophiidae — endast stjärtdelen säljs, rensad på det tjocka skinnet till fast, kritvitt, benfritt kött med ett centralt ryggben. Kallas ibland "fattigmans hummer" på grund av sin fasta, söta textur påminnande om hummersvans. Fetthalt under 1 g/100 g. De tjocka, köttiga stjärtskivorna och filéerna lämpar sig som kött: pannsteks i smör med gyllenbrun skorpa, ugnssteks på benet, grillas. En av de få fiskar som klarar bräsering väl. Sond placeras längsvis in i tjockaste delen av stjärtfilén, fri från ryggraden.

## Research files by cooking method

- Pan Sear — no research file yet
- [Oven Roast](./monkfish-oven_roast.md)
- Grill — no research file yet
- Braise — no research file yet
- [Sous Vide](./monkfish-sous_vide.md)

## Improvement potential

| Criterion | Points |
|-----------|----------|
| Cooking methods not researched | — (done: `cooking_methods_researched: 1`) |
| Missing method leaf files (4 of 5 declared) | −4 |
| Partial leaf file `monkfish-sous_vide.md` (3 sources, < 4) | −1 |
| Method leaf copies parent cut profile | — (none; sous_vide profile is method-specific) |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | — (covered: UK/USA in monkfish-sous_vide.md) |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |

Groups A, C, D absent — the only existing leaf (`monkfish-sous_vide.md`) covers Group B (UK/USA) only and is marked ⚠️ PARTIAL (3 sources). No East Asian, African/Arabic, or Scandinavian sous vide monkfish recipe with verifiable URLs was found. Other methods (pan_sear, oven_roast, grill, braise) have no leaves.

### Improvement priorities

1. Missing method leaf files — create `monkfish-pan_sear.md`, `monkfish-oven_roast.md`, `monkfish-grill.md`, and `monkfish-braise.md`, each with 4–6 diverse source recipes.
2. Partial leaf `monkfish-sous_vide.md` — add a 4th verified source recipe; search Group A, C or D traditions for sous vide monkfish.
3. Missing Culinary Groups A, C, D — add representative source recipes across method leaves.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*

## Data state and gaps

<!-- ledger-state: leaves=2 sources=7 silent=0 silent_leaves=0 methods=oven_roast,sous_vide -->

State on 2026-10-26: two leaves (sous_vide, oven_roast), seven source records, five naming an internal
temperature. The cut declares five methods and has data for two.

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `hub_method_without_leaf:pan_sear` | open | hub declares `pan_sear`; no leaf. Spanish *rape a la plancha* and Italian *coda di rospo in padella* were fetched this pass and publish no internal temperature, only times (5 min + residual heat; 10 min turning once) | M | a pan-sear leaf would be a silent-method leaf unless a source with a probe is found; the technique evidence is already collected and is recorded here rather than written into a leaf |
| `hub_method_without_leaf:grill` | open | hub declares `grill`; no leaf. One Swedish record found (vivavinomat.se: 4 min per side to about 42 °C, then rest) but not fetched | S | a grill leaf with four records; the 42 °C rest-then-rise pattern is worth capturing |
| `hub_method_without_leaf:braise` | open | hub declares `braise`; no leaf. Monkfish is braised in French *lotte* cookery and in Spanish *caldereta*, neither fetched this pass | M | a braise leaf; note that the cut also declares `sous_vide`, so braise must earn its place against it |
| `duplicate_tradition` (oven_roast) | open | `monkfish-oven_roast.md` - four of four records Swedish or Swedish-Norwegian | M | a French, Spanish or Italian *lotte* / *rape* oven record with a temperature |
| `well_done_unsupported` | open | hub recommends `well_done` (63 °C); the four oven_roast records pull at 46-52 °C and the Svenskfisk band tops out at 58 °C | M | same doneness question as the other white fish in this category |
| `pan_sear_silent_sources` | recorded | directoalpaladar.com (ES) - 5 min, then heat off and finish in residual warmth, no temperature; agrodolce.it (IT) - no more than 10 minutes, turned once, no temperature | - | two verified technique records waiting for a leaf, if a leaf below the four-source minimum is acceptable |
