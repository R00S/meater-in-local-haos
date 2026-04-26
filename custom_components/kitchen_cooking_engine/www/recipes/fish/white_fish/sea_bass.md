<!-- KCE:CUT
type: cut
slug: sea_bass
name: Sea Bass
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- oven_roast
- pan_sear
doneness:
- name: medium_rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
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
quality_score: 8
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Sea Bass — Cut Overview

## Cut profile

European sea bass (*Dicentrarchus labrax*, Italian: branzino/spigola, Turkish: levrek,
Swedish: havsabborre) is a prized lean white fish with moderately firm, flaky white flesh
and a thin but distinctly flavoured skin that renders beautifully crisp in a hot pan.
Pan searing is its most iconic preparation, particularly in Mediterranean cuisine.
Because the flesh is lean (< 3 % fat), it cooks extremely quickly and dries out if
overcooked. The standard technique is skin-side down first, pressing gently to prevent
curling, cooking 80–90 % through on the skin side, then flipping for a brief 30–60-second
finish. Internal temperature is the most reliable doneness indicator: the flesh transitions
from translucent to opaque at approximately 55–58 °C and is fully cooked at 60–63 °C
(USDA minimum for finfish: 63 °C / 145 °F). Many professional cooks pull at 58–60 °C.
A MEATER probe in thin fillets must be inserted from the edge (laterally) rather than
from above; in thicker whole or butterflied fish it is inserted into the thickest shoulder.


## Research files by cooking method

- [Pan Sear](./sea_bass-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Northern tradition | −1 |
| Method file `sea_bass-pan_sear.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `sea_bass-grill.md`, `sea_bass-oven_roast.md`
3. **−1** · Method file `sea_bass-pan_sear.md` copies parent cut profile — rewrite `sea_bass-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Northern tradition(s) — add Northern source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
