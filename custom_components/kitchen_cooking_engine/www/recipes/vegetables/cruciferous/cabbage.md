<!-- KCE:CUT
type: cut
slug: cabbage
name: Cabbage
name_sv: Kål
category: vegetables
meat: cruciferous
cut_type: Cruciferous
methods:
- braise
- grill
- oven_roast
- saute
doneness:
- name: crisp_tender
  target_c: 85
  target_f: 185
  min_c: 80
  min_f: 175
  max_c: 90
  max_f: 195
  usda_safe: true
- name: tender
  target_c: 95
  target_f: 203
  min_c: 90
  min_f: 195
  max_c: 100
  max_f: 212
  usda_safe: true
  recommended: true
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 1
-->
# Cabbage — Cut Overview

## Cut profile

Cabbage (*Brassica oleracea* var. *capitata*) braised is one of the most globally distributed vegetable preparations: German Rotkohl, French *chou braisé*, Polish *kapusta duszona*, Indian dum-cooked cabbage, and Chinese red-braised cabbage all transform the pungent, crunchy raw leaves through long, moist cooking into a tender, sweet, and deeply flavourful result. The technique involves long gentle simmering in a small amount of liquid (wine, vinegar, stock, or a combination) with a lid on, allowing the cabbage to stew in its own juices. Pull temperature for a fully braised cabbage wedge or shred: 88–95 °C (190–203 °F) — at this point the cell walls have fully collapsed, the harsh glucosinolates have converted to gentler compounds, and the texture is yielding and silky. A MEATER probe is inserted through the outer layers of a wedge into the thickest part of the core, or into the densest part of the shred pile.


## Styckesprofil

Kål (*Brassica oleracea* var. *capitata*) bräserad är en av de mest globalt spridda grönsaksberedningarna: tyskt Rotkohl, franskt *chou braisé*, polskt *kapusta duszona*, indisk *patta gobi ki sabzi*. Tillagas i vätska (vin, fond, ättika) vid 85–95 °C i 1–2 timmar. Klar när mjuk och genomsmakad.

## Research files by cooking method

- [Braise](./cabbage-braise.md)
- [Grill](./cabbage-grill.md)
- [Oven Roast](./cabbage-oven_roast.md)
- [Sauté](./cabbage-saute.md)
## Quality score

**Score: -5 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Cut profile lacks anatomy | −1 |
| Method file `cabbage-braise.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `cabbage-braise.md` copies parent cut profile — rewrite `cabbage-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
