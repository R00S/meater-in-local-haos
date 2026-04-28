<!-- KCE:CUT
type: cut
slug: scallops
name: Scallops
category: fish
meat: shellfish
cut_type: Shellfish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_sear
doneness:
- name: medium_rare
  target_c: 46
  target_f: 115
  min_c: 43
  min_f: 110
  max_c: 49
  max_f: 120
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Scallops — Cut Overview

## Cut profile

Sea scallops (*Pecten maximus* in Europe; *Placopecten magellanicus*, the Atlantic sea scallop, in North America) are the large adductor muscle that opens and closes the bivalve shell. The flesh is cream-white, sweet, and extremely tender with almost no connective tissue; it is composed mainly of striated muscle fibres held in a dense but delicate matrix. Pan searing is the defining method for large sea scallops because extreme heat produces rapid caramelisation of the natural sugars on the flat cut surfaces — the golden-brown crust contrasts dramatically with the cool, almost raw centre that is the mark of a well-executed scallop. Overcooking tightens the fibres sharply and produces a rubbery, squeaky texture. The critical requirements are: completely dry exterior, a blazing pan, and a very short cook time. Carryover is significant relative to the small mass — 3–5 °C — so pull early.


## Research files by cooking method

- [Pan Sear](./scallops-pan_sear.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `scallops-pan_sear.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group C and Culinary Group D tradition(s) — add Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `scallops-pan_sear.md` copies parent cut profile — rewrite `scallops-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
