<!-- KCE:CUT
type: cut
slug: hake
name: Hake Fillet
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- oven_roast
- pan_fry
- steam
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
quality_score: 5
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Hake Fillet — Cut Overview

## Cut profile

Hake (*Merluccius merluccius*, European hake; *Merluccius capensis/paradoxus*, Cape hake; *Merluccius productus*, Pacific hake) is a lean white fish with firm, dense, large-flaked flesh and a mild, slightly sweet flavour. It occupies a central position in Iberian and Basque cuisine — in Spain (*merluza*) and Portugal (*pescada*) it is arguably the most important food fish — and is also important in Moroccan and West African seafood traditions. The flesh is slightly softer than cod when raw but firms up well under heat to produce the characteristic large, clean flakes. Pan frying is one of the dominant preparations: simply floured and pan-fried in olive oil (*merluza a la plancha*) is a Spanish staple; batter-fried (*pescada frita*) is a Portuguese and Moroccan tradition. Carryover is minimal (2–3 °C); pull at 60–63 °C for moist flakes.


## Research files by cooking method

- [Pan Fry](./hake-pan_fry.md)
## Quality score

**Score: 5 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `hake-pan_fry.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `hake-oven_roast.md`, `hake-steam.md`
3. **−3** · Missing Culinary Group A, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group A, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
5. **−1** · Method file `hake-pan_fry.md` copies parent cut profile — rewrite `hake-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
