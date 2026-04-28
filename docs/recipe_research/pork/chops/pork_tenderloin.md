<!-- KCE:CUT
type: cut
slug: pork_tenderloin
name: Pork Tenderloin
name_sv: Fläskfilé
category: pork
meat: pig
cut_type: Chops & Tenderloin
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- air_fryer
- grill
- oven_roast
- pan_sear
- sous_vide
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
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
# Pork Tenderloin — Cut Overview

## Cut profile

Pork tenderloin (*svinemørbrad*, Danish/Norwegian; *Schweinefilet*, German; *solomillo de cerdo*, Spanish; *filet mignon de porc*, French) is the *psoas major* — the long, tapered, loin muscle that runs along the inside of the lumbar vertebrae. Because this muscle does essentially no physical work (it stabilises the spine), it is the leanest and most tender cut on the pig: virtually no fat, no connective tissue, and very fine muscle fibres. Average weight: 400–600 g per tenderloin. The lean composition means it dries out faster than any other pork cut above 70 °C; the optimal temperature range is 63–68 °C (slightly pink to just-cooked). It must be trimmed of the *silverskin* (*fascia lata* connective tissue) before cooking — leaving it on causes the tenderloin to curl and cook unevenly.


Target internal temperatures (grill):
- Juicy/slightly pink: **63–65 °C (145–149 °F)**


## Research files by cooking method

- [Air Fryer](./pork_tenderloin-air_fryer.md)
- [Grill](./pork_tenderloin-grill.md)
- [Oven Roast](./pork_tenderloin-oven_roast.md)
- [Pan Sear](./pork_tenderloin-pan_sear.md)
- [Sous Vide](./pork_tenderloin-sous_vide.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Cut profile lacks anatomy | −1 |
| Method file `pork_tenderloin-grill.md` copies parent cut profile | −1 |
| Method file `pork_tenderloin-pan_sear.md` copies parent cut profile | −1 |
| Method file `pork_tenderloin-grill.md` copies `pork_tenderloin-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `pork_tenderloin-grill.md` copies `pork_tenderloin-pan_sear.md` — rewrite `pork_tenderloin-grill.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose
4. **−1** · Method file `pork_tenderloin-grill.md` copies parent cut profile — rewrite `pork_tenderloin-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Method file `pork_tenderloin-pan_sear.md` copies parent cut profile — rewrite `pork_tenderloin-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
