<!-- KCE:CUT
type: cut
slug: shrimp
name: Shrimp
category: fish
meat: shellfish
cut_type: Shellfish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
doneness:
- name: just_cooked
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 126
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
quality_score: 10
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Shrimp — Cut Overview

## Cut profile

Shrimp (called prawns in British, Australian, and much of Asian-English usage) are the most widely consumed shellfish globally; the species most commonly used for pan frying include tiger prawns (*Penaeus monodon*), white leg shrimp (*Litopenaeus vannamei*), spot prawns (*Pandalus platyceros*), and Gulf shrimp (*Farfantepenaeus aztecus*). The edible flesh is the tail muscle, which contracts rapidly under heat and curls the tail from the characteristic C-shape of a live shrimp to a tighter O-shape when overcooked. Pan frying over high heat produces a caramelised exterior on the natural sugars in the shell or flesh, and in shell-on preparations the shell acts as a protective layer. The protein in shrimp begins to denature around 50 °C and is fully set at 60 °C; the culinary window for moist, tender shrimp is extremely narrow, typically 3–4 minutes total cook time for medium prawns in a very hot pan. Carryover is 2–3 °C.


## Research files by cooking method

- [Pan Fry](./shrimp-pan_fry.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Northern tradition | −1 |
| Method file `shrimp-pan_fry.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `shrimp-pan_fry.md` copies parent cut profile — rewrite `shrimp-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Northern tradition(s) — add Northern source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
