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
quality_score: 6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Hake Fillet — Cut Overview

## Cut profile

Hake (*Merluccius merluccius*, European hake; *Merluccius capensis/paradoxus*, Cape hake; *Merluccius productus*, Pacific hake) is a slender, elongated fish of the family Merlucciidae. The fillet is cut from the flanks, running from behind the pectoral fins to the tail; the flesh is lean (< 1% fat), firm when raw, and produces large clean flakes when cooked. The lateral muscle is composed of W-shaped myotomes separated by collagen-rich myosepta; this structure gives hake its characteristically large flake and means it separates cleanly at the natural seams when cooked. The flesh is slightly softer than cod raw but firms to a similar texture under heat. It is the dominant food fish of Iberian cuisine (*merluza* in Spanish, *pescada* in Portuguese) and important in Moroccan, West African, and British traditions. Carryover is minimal (2–3 °C); pull at 60–63 °C for moist flakes.


## Research files by cooking method

- [Pan Fry](./hake-pan_fry.md)
## Quality score

**Score: 6 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | − **NOT DONE** (−8) |
| Missing method leaf files (2 of 3 declared) | − pending (−2) |
| Missing Culinary Group A tradition | − pending (−1) |
| Missing Culinary Group C tradition | − pending (−1) |
| Missing Culinary Group D tradition | − pending (−1) |
| Cut profile lacks anatomy | ✓ fixed 2026-04-27 |
| Method file `hake-pan_fry.md` copies parent cut profile | ✓ fixed 2026-04-27 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `hake-oven_roast.md`, `hake-steam.md`
3. **−3** · Missing Culinary Group A, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group A, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
