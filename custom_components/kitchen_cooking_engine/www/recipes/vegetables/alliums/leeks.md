<!-- KCE:CUT
type: cut
slug: leeks
name: Leeks
name_sv: Purjolök
category: vegetables
meat: alliums
cut_type: Alliums
methods:
- braise
- oven_roast
- saute
doneness:
- name: tender
  target_c: 95
  target_f: 203
  min_c: 90
  min_f: 195
  max_c: 100
  max_f: 212
  usda_safe: true
  recommended: true
- name: caramelized
  target_c: 160
  target_f: 320
  min_c: 150
  min_f: 300
  max_c: 175
  max_f: 350
  usda_safe: true
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 1
-->
# Leeks — Cut Overview

## Cut profile

Leeks (*Allium ampeloprasum* var. *porrum*) braised are one of the most refined of all vegetable preparations. The long white shafts soften over 20–40 minutes of gentle simmering in stock, wine, or butter-enriched liquid, their sharp raw flavour mellowing to a delicate sweetness. The technique — covering with a cartouche (buttered paper) or lid and cooking barely at simmer — is classical French *étuvée*, used also in British and Flemish cuisines. Leeks are cut in half lengthwise, or left whole and halved after cooking. The internal temperature of a fully braised leek is 82–88 °C (180–190 °F), where the cell walls have fully softened and the shaft is yielding to a paring knife but not collapsed. A MEATER probe is inserted along the axis of the leek into the thickest part of the white base, as far from the cut ends as possible to get a representative reading.


## Styckesprofil

Purjolök (*Allium ampeloprasum* var. *porrum*) bräserad är en av de mest raffinerade av alla grönsaksberedningar. De långa vita stjälkarna mjuknar under 20–40 minuter av varsam sjudning i fond, vin eller smör-vatten. Innertemperatur: inte relevant — serveras när mjuk och genomkokt (kärnan vid 70–75 °C).

## Research files by cooking method

- [Braise](./leeks-braise.md)
- [Oven Roast](./leeks-oven_roast.md)
- [Sauté](./leeks-saute.md)
## Quality score

**Score: -5 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Cut profile lacks anatomy | −1 |
| Method file `leeks-braise.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `leeks-braise.md` copies parent cut profile — rewrite `leeks-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
