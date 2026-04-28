<!-- KCE:CUT
type: cut
slug: beef_liver
name: Beef Liver
category: beef
meat: cow
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- pan_fry
- pan_sear
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: false
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Beef Liver — Cut Overview

## Cut profile

Beef liver is the hepatic organ — a large, lobed, dark-chocolate-coloured mass of hepatocyte tissue with an extremely fine, smooth texture and a thin connective-tissue capsule (*Glisson's capsule*). It is one of the most nutrient-dense foods available: extremely high in iron (haem iron), vitamin A, B12, zinc, and copper. The intense metallic flavour, characteristic of the high iron and bile compound content, is reduced by soaking in milk for 30–60 minutes before cooking — a near-universal preparatory step in European traditions. Retail beef liver is sold as thin slices (6–10 mm), which is the correct format for pan frying. Fat content is very low; the thin slices have minimal carryover (1–2 °C) and must be pulled before the centre passes 65 °C to avoid chalky grey-brown dry meat.


## Research files by cooking method

- [Pan Fry](./beef_liver-pan_fry.md)
- [Pan Sear](./beef_liver-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group C tradition | −1 |
| Method file `beef_liver-pan_fry.md` copies parent cut profile | −1 |
| Method file `beef_liver-pan_sear.md` copies parent cut profile | −1 |
| Method file `beef_liver-pan_fry.md` copies `beef_liver-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `beef_liver-pan_fry.md` copies `beef_liver-pan_sear.md` — rewrite `beef_liver-pan_fry.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose
3. **−1** · Method file `beef_liver-pan_fry.md` copies parent cut profile — rewrite `beef_liver-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `beef_liver-pan_sear.md` copies parent cut profile — rewrite `beef_liver-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group C tradition(s) — add Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
