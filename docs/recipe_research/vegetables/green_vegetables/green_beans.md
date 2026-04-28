<!-- KCE:CUT
type: cut
slug: green_beans
name: Green Beans
name_sv: Haricots verts
category: vegetables
meat: green_vegetables
cut_type: Green Vegetables
methods:
- boil
- oven_roast
- saute
- steam
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Green Beans — Cut Overview

## Cut profile

Green beans (*Phaseolus vulgaris* and *Vigna unguiculata* — runner beans, French haricots verts, yard-long beans) boiled is the classic preparation in French haute cuisine, American home cooking, and the base technique in almost every global kitchen that uses fresh green beans. The target for boiled green beans is bright-green and tender-crisp: 78–82 °C (172–180 °F) inside the bean. Overcooked beans turn army-green, drab and mushy at 88+ °C. The classic French technique is to boil rapidly in a large quantity of salted water (blanching) for 3–5 minutes, then shock in ice water (*refresh*) to stop cooking and fix the bright green. MEATER probe: insert horizontally through the side of the longest/thickest bean at the mid-point; the probe must be in the water and not reading ambient air.


## Research files by cooking method

- [Boil](./green_beans-boil.md)
- [Oven Roast](./green_beans-oven_roast.md)
- [Sauté](./green_beans-saute.md)
- [Steam](./green_beans-steam.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `green_beans-boil.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `green_beans-boil.md` copies parent cut profile — rewrite `green_beans-boil.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
