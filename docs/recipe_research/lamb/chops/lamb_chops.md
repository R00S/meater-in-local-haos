<!-- KCE:CUT
type: cut
slug: lamb_chops
name: Lamb Chops
name_sv: Lammkotlett
category: lamb
meat: lamb
cut_type: Chops
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- pan_sear
doneness:
- name: rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
- name: medium_rare
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: medium
  target_c: 60
  target_f: 140
  min_c: 57
  min_f: 135
  max_c: 63
  max_f: 145
  usda_safe: false
- name: medium_well
  target_c: 66
  target_f: 150
  min_c: 63
  min_f: 145
  max_c: 68
  max_f: 155
  usda_safe: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 11
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Lamb Chops — Cut Overview

## Cut profile

Lamb rib chops and loin chops are the classic cuts for grilling, popular worldwide from Australia and New Zealand (the world's largest lamb exporters) to the UK, Mediterranean, Middle East, and West Africa. Rib chops are smaller, leaner, and more delicate; loin chops are larger and fattier. Both benefit from high direct heat on a barbecue or grill pan. The rib or 'rack' end is typically served slightly pink (medium-rare to medium).


Target internal temperatures (from Africanbites.com):
- Rib chops: **55 °C (131 °F)** for medium-rare
- Loin chops: **57–60 °C (135–140 °F)** for medium


## Styckesprofil

Lammkotletter (rygg- och lumbarkotletter) är de klassiska grillningssnitten. Ryggkotletter är mindre och magrare; lumbarkotletter är större och fetare. Grilla vid direkt medel-hög värme, 4–5 minuter per sida.

Fettet behöver tid att smälta ned — att placera kotletterna på sidan för att renda fettlisten är ett professionellt trick som förhindrar flammor. Sond in i den tjockaste muskeldelen borta från benet. Innertemperatur: **57–63 °C (135–145 °F)** för medium-rare till medium. Eftertillagning: 3–4 °C.

## Research files by cooking method

- [Grill](./lamb_chops-grill.md)
- [Pan Sear](./lamb_chops-pan_sear.md)
## Quality score

**Score: 11 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `lamb_chops-grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `lamb_chops-grill.md` copies parent cut profile — rewrite `lamb_chops-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
