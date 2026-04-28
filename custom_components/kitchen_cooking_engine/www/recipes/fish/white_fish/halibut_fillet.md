<!-- KCE:CUT
type: cut
slug: halibut_fillet
name: Halibut Fillet
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
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Halibut Fillet — Cut Overview

## Cut profile

Pacific halibut (*Hippoglossus stenolepis*) and Atlantic halibut (*Hippoglossus hippoglossus*) are the largest flatfish; the fillet — cut from the meaty upper or lower side of the fish — is thick, firm, brilliant white, and lean with large, tight muscle flakes. The flesh has little connective tissue relative to its density, which gives a satisfying firm bite when properly cooked but transitions quickly to a dry, chalky texture above 60 °C. Pan searing is one of the most technically demanding preparations for halibut because the thick, lean flesh must be cooked through to approximately 58–62 °C without surface scorching; a common technique is to sear in a screaming-hot pan to set the crust, then finish in a moderate oven or with basting, treating it more like a thick beef steak than most fish. Carryover is significant — 4–5 °C for a thick fillet — so pulling early is essential.


## Research files by cooking method

- [Pan Sear](./halibut_fillet-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group C tradition | −1 |
| Method file `halibut_fillet-pan_sear.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `halibut_fillet-grill.md`, `halibut_fillet-oven_roast.md`
3. **−1** · Method file `halibut_fillet-pan_sear.md` copies parent cut profile — rewrite `halibut_fillet-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group C tradition(s) — add Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
