<!-- KCE:CUT
type: cut
slug: goose_leg
name: Goose Leg
name_sv: Gåslår
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
quality_score: -6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 15
carryover_temp_c: 4
-->
# Goose Leg — Cut Overview

## Cut profile

Goose legs are large, tough, highly flavoured cuts rich in connective tissue and intramuscular fat. Braising — browning the legs in fat, then cooking them submerged or partially submerged in aromatic liquid at low heat for 2–3 hours — is the optimal method for transforming this tough cut into fork-tender, fall-off-the-bone meat. The collagen-rich connective tissue converts to gelatin above 160 °F, but the most tender, succulent results come at 175–185 °F (79–85 °C) after extended braising. USDA minimum for poultry is 165 °F. Unlike duck confit, braising adds moisture; the braising liquid becomes a rich, gelatin-laden sauce.


Target internal temperature: **175–185 °F (79–85 °C)** — well above USDA minimum; extended time at this temperature melts collagen and produces best texture. Minimum safe: 165 °F (74 °C).


## Styckesprofil

Gåsben är stora, sega, intensivt smakrika snitt rika på bindväv. Innertemperatur: 80–85 °C (mört, faller lätt från benet). Eftertillagning: försumbar. Bräsering eller confit är de klassiska metoderna.

## Research files by cooking method

- [Braise](./goose_leg-braise.md)
- [Oven Roast](./goose_leg-oven_roast.md)
## Quality score

**Score: -6 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `goose_leg-braise.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group B and Culinary Group C tradition(s) — add Culinary Group B and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `goose_leg-braise.md` copies parent cut profile — rewrite `goose_leg-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
