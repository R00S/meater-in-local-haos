<!-- KCE:CUT
type: cut
slug: meatloaf
name: Meatloaf
name_sv: Köttfärslimpa
category: beef
meat: cow
cut_type: Ground
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: done
methods:
- oven_roast
doneness:
- name: done
  target_c: 71
  target_f: 160
  min_c: 71
  min_f: 160
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 15
carryover_temp_c: 5
-->
# Meatloaf — Cut Overview

## Cut profile

Meatloaf is a free-formed loaf of seasoned, bound ground meat (typically beef alone or a beef-pork-veal blend) baked in a moderate oven until cooked through. Structurally it is a colloid of ground muscle held by a panade (bread or breadcrumbs soaked in milk or stock) and bound with egg; the panade is critical because it absorbs and re-releases moisture during the bake, preventing the dry, dense loaf that pure meat-plus-egg produces. Oven temperatures of 175–190 °C give enough time for the centre to reach safe temperature without over-rendering the surface. Carryover is significant — 5–8 °C in a typical 1 kg loaf — because the loaf shape stores heat well; a 5–10 minute rest is mandatory both for carryover and for the proteins to re-absorb expressed liquid.


## Styckesprofil

Köttfärslimpa är en fritt formad limpa av kryddad, bunden malet kött (vanligtvis nötkött alternativt blandningar med fläsk eller kalv) bakad i ugn. Bindningen — ägg, ströbröd, mjölk — håller loafen sammanhållen under tillagningen och bevarar fukt. Till skillnad från hela musklar har köttfärslimpa ingen kollagenstruktur att bryta ner; målet är att värma igenom till 74 °C för livsmedelssäkerhet medan ytan glaseras eller karameliseras. Eftertillagning är måttlig (3–5 °C) beroende på limpans tjocklek och ugnstemperatur.

## Research files by cooking method

- [Oven Roast](./meatloaf-oven_roast.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `meatloaf-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `meatloaf-oven_roast.md` copies parent cut profile — rewrite `meatloaf-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
