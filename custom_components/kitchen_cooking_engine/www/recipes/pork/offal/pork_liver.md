<!-- KCE:CUT
type: cut
slug: pork_liver
name: Pork Liver
category: pork
meat: pig
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- pan_fry
- pan_sear
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Pork Liver — Cut Overview

## Cut profile

Pork liver is milder, slightly sweeter and more delicate in texture than beef liver — a paler chestnut-brown rather than the deep mahogany of beef, with a finer-grained hepatocyte structure and a thinner capsule. The same mineral-iron flavour profile is present but at lower intensity. The standard preparation across European traditions is identical to the beef-liver pan-fry: brief soak in milk to mellow the iron, dust in flour, sear hard in fat, and pull while the centre is still faintly pink. The narrower flavour also means pork liver tolerates assertive aromatics — onions, sage, juniper, allspice, capers — better than the more bold-tasting calf's or beef liver. Carryover is small (1–2 °C); slices continue cooking on the plate, so serve immediately.


## Research files by cooking method

- [Pan Fry](./pork_liver-pan_fry.md)
- [Pan Sear](./pork_liver-pan_sear.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group C tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `pork_liver-pan_fry.md` copies parent cut profile | −1 |
| Method file `pork_liver-pan_sear.md` copies parent cut profile | −1 |
| Method file `pork_liver-pan_fry.md` copies `pork_liver-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `pork_liver-pan_fry.md` copies `pork_liver-pan_sear.md` — rewrite `pork_liver-pan_fry.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose
4. **−1** · Method file `pork_liver-pan_fry.md` copies parent cut profile — rewrite `pork_liver-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Method file `pork_liver-pan_sear.md` copies parent cut profile — rewrite `pork_liver-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
6. **−1** · Missing Culinary Group C tradition(s) — add Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
