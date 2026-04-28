<!-- KCE:CUT
type: cut
slug: mutton_chop
name: Mutton Chop
name_sv: Fårkotlett
category: game
meat: mutton
cut_type: Mutton
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Mutton Chop — Cut Overview

## Cut profile

Mutton refers to the meat of a sheep older than one year (typically 2–4 years), with a stronger, more pronounced flavour than lamb. Mutton chops (loin or shoulder chops) are popular in Germany, the UK, the Middle East, and South Asia. The stronger flavour benefits from aromatic seasoning (garlic, onion, thyme, cumin) and the meat is typically cooked through — medium to well-done — rather than pink.


Target internal temperature: **70–74 °C (158–165 °F)**.


## Styckesprofil

Fårkött avser köttet från ett får äldre än ett år (typiskt 2–4 år), med starkare, mer uttalad smak än lamm. Fårköttkotletter är populära i tyska, brittiska, mellanösternska och sydasiatiska traditioner. Den starkare smaken gynnas av aromatisk kryddning (vitlök, lök, timjan, spiskummin) och köttet tillagas typiskt genomstekt.

Fårköttets röda fiber och täta muskelstruktur tål höga temperaturer utan att bli torrt i samma utsträckning som lamm. Pannsteka i smör med rosmarin och vitlök tills genomstekt — 4–5 minuter per sida. Innertemperatur: **70–74 °C (158–165 °F)**. Eftertillagning: 3–4 °C.

## Research files by cooking method

- [Grill](./mutton_chop-grill.md)
- [Pan Sear](./mutton_chop-pan_sear.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `mutton_chop-grill.md` copies parent cut profile | −1 |
| Method file `mutton_chop-pan_sear.md` copies parent cut profile | −1 |
| Method file `mutton_chop-grill.md` copies `mutton_chop-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `mutton_chop-grill.md` copies `mutton_chop-pan_sear.md` — rewrite `mutton_chop-grill.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose
3. **−1** · Method file `mutton_chop-grill.md` copies parent cut profile — rewrite `mutton_chop-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `mutton_chop-pan_sear.md` copies parent cut profile — rewrite `mutton_chop-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
