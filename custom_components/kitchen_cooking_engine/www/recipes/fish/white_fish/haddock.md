<!-- KCE:CUT
type: cut
slug: haddock
name: Haddock Fillet
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- air_fryer
- oven_roast
- pan_fry
doneness:
- name: medium
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
quality_score: 7
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Haddock Fillet — Cut Overview

## Cut profile

Haddock (*Melanogrammus aeglefinus*, Norwegian: hyse/kolje, German: Schellfisch, Swedish:
kolja) is a lean white-fleshed cold-water fish closely related to cod. It has a mild,
slightly sweet flavour and firm but fine-grained flesh that flakes beautifully when cooked.
Haddock is central to British cuisine (fish & chips), Norwegian everyday cooking, and the
German North Sea fishing tradition. The fillets are typically 1–2 cm thick, making them
fast-cooking pan fish: 2–4 minutes per side at medium to medium-high heat in butter or
oil is sufficient for a fillet of normal thickness. The internal flesh reaches safe serving
temperature (63 °C / 145 °F USDA minimum for finfish) quickly; overcooking past 65 °C
produces dry, rubbery fish. The MEATER probe must be inserted laterally (from the thick
edge) in thin fillets. Flouring the fillets before frying (as in the German and British
traditions) creates a protective crust that helps moisture retention and even browning.


## Research files by cooking method

- [Pan Fry](./haddock-pan_fry.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group A tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `haddock-pan_fry.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `haddock-air_fryer.md`, `haddock-oven_roast.md`
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `haddock-pan_fry.md` copies parent cut profile — rewrite `haddock-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
