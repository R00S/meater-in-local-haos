<!-- KCE:CUT
type: cut
slug: skirt_steak
name: Skirt Steak
name_sv: Skirt
category: beef
meat: cow
cut_type: Steaks
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- charcoal_grill
- grill
- pan_fry
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 2
-->
# Skirt Steak — Cut Overview

## Cut profile

Skirt steak is cut from the plate section of the beef carcass, comprising two distinct muscles: the *outside skirt* (*diaphragm* muscle, *diaphragmaticus*) and the *inside skirt* (*transverse abdominal oblique*, *transversus abdominis*). The outside skirt is the more prized cut — thicker, more heavily marbled, and more intensely flavoured than the inside skirt. Both muscles are characterised by coarse, heavily-grained long muscle fibres running along the length of the steak, with prominent fat seams between the fibre bundles. The grain structure means skirt steak must be sliced against the grain after resting or it will be unpleasantly chewy. Fat content is high (well-marbled); it is the defining cut for Mexican *arrachera* and *fajitas*, Argentine *asado* (as *entraña*), and Spanish *fraldinha*. Target: 52–57 °C (medium-rare) for maximum tenderness before muscle fibres tighten.


## Styckesprofil

Skirt steak skärs från nötdjurets tallriksdel och omfattar två distinkta muskler: *ytterskirten* (*diaphragm*-muskel, *diaphragmaticus*) och *innerskirten* (*transverse abdominal oblique*, *transversus abdominis*). Ytterskirten är det mer uppskattade snittet — tjockare, mer välmarmorerat och mer intensivt smakfull än innerskirten. Båda musklerna kännetecknas av grova, kraftigt fibriga långa muskelfibrer längs biffens längd, med framträdande fettseam mellan fibrerbuntarna.

Fiberstrukturen innebär att skirt steak alltid måste skäras tvärs mot fibern efter vilning annars blir den obehagligt seg. Fettinnehållet är högt (välmarmorerat); det är det definierande snittet för mexikansk *arrachera* och *fajitas*, argentinsk *asado* (som *entraña*) och spansk *fraldinha*. Innertemperatur: 52–57 °C (medium-rare) för maximal mörhet innan muskelfibrerna drar ihop sig.

## Research files by cooking method

- [Charcoal Grill](./skirt_steak-charcoal_grill.md)
- [Grill](./skirt_steak-grill.md)
- [Pan Fry](./skirt_steak-pan_fry.md)
- [Pan Sear](./skirt_steak-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Method file `skirt_steak-charcoal_grill.md` copies parent cut profile | −1 |
| Method file `skirt_steak-grill.md` copies `skirt_steak-pan_fry.md` | −1 |
| Method file `skirt_steak-grill.md` copies `skirt_steak-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `skirt_steak-charcoal_grill.md` copies parent cut profile — rewrite `skirt_steak-charcoal_grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Method file `skirt_steak-grill.md` copies `skirt_steak-pan_fry.md` — rewrite `skirt_steak-grill.md`'s cut profile — it must describe what the pan fry method does to this cut, not repeat another method's prose
4. **−1** · Method file `skirt_steak-grill.md` copies `skirt_steak-pan_sear.md` — rewrite `skirt_steak-grill.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose
5. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
