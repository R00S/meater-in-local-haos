<!-- KCE:CUT
type: cut
slug: hanger_steak
name: Hanger Steak
name_sv: Hängare
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
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 3
-->
# Hanger Steak — Cut Overview

## Cut profile

Hanger steak over live charcoal adds an important dimension to this already intensely flavoured cut. The fat-and-flavour drippings from the hanging muscle hit the hot coals and combust into brief flare-ups, depositing charred aromatic compounds onto the steak surface. This combination of deep beef flavour + charcoal smoke + char edge makes the hanger steak over charcoal one of the most intensely flavoured steak preparations achievable. The sinew-containing version (some butchers leave the central connective tissue) is convenient to cook whole and split post-resting; the sinew-removed version cooks as two thin separate muscles. Carryover from a very hot charcoal fire is 5–7 °C.


## Styckesprofil

Hängarbiff över levande träkol tillsätter en viktig dimension till detta redan intensivt smakrika snitt. Fettet och smakdroppar från den hängande muskeln träffar de heta kolarna och antänds till korta uppflammor som deponerar förkolnade aromatiska föreningar på biffytan. Denna kombination av djup nötsmak och rökig träkolskaraktär är skälet till att onglet är så firat i franska bistro-köket. Det är kritiskt att skära tvärs mot fibern — snittet har en grov, oregelbunden fiberstruktur som kräver rätt skärning för att bli mört i munnen. Innertemperatur: 52–57 °C. Eftertillagning: 2–3 °C.

## Research files by cooking method

- [Charcoal Grill](./hanger_steak-charcoal_grill.md)
- [Grill](./hanger_steak-grill.md)
- [Pan Fry](./hanger_steak-pan_fry.md)
- [Pan Sear](./hanger_steak-pan_sear.md)
## Quality score

**Score: -5 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `hanger_steak-charcoal_grill.md` copies parent cut profile | −1 |
| Method file `hanger_steak-pan_fry.md` copies `hanger_steak-pan_sear.md` | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `hanger_steak-charcoal_grill.md` copies parent cut profile — rewrite `hanger_steak-charcoal_grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Method file `hanger_steak-pan_fry.md` copies `hanger_steak-pan_sear.md` — rewrite `hanger_steak-pan_fry.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
