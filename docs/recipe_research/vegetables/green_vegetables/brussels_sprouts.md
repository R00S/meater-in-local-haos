<!-- KCE:CUT
type: cut
slug: brussels_sprouts
name: Brussels Sprouts
name_sv: Brysselkål
category: vegetables
meat: green_vegetables
cut_type: Green Vegetables
methods:
- air_fryer
- oven_roast
- pan_fry
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
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Brussels Sprouts — Cut Overview

## Cut profile

Brussels sprouts (*Brassica oleracea* var. *gemmifera*) pan-fried (halved, cut-face-down in a hot pan) is the fastest technique for intensely caramelised results: 8–12 minutes in a cast-iron or heavy pan achieves charred cut faces and a tender interior. Unlike sautéing (which involves frequent tossing), pan-frying holds the cut face in contact with the hot surface for an extended sear. Pull temperature: 82–88 °C (180–190 °F). MEATER probe through outer leaves of the largest sprout into the core.


## Styckesprofil

Brysselkål (*Brassica oleracea* var. *gemmifera*) pannstekta (halverade, snittytan ned i het panna) är den snabbaste tekniken för intensivt karameliserade resultat: 8–12 minuter i het olja. Klar när snittytan är djupt gyllenbrun och kärnan genomstekt.

## Research files by cooking method

- [Air Fryer](./brussels_sprouts-air_fryer.md)
- [Oven Roast](./brussels_sprouts-oven_roast.md)
- [Pan Fry](./brussels_sprouts-pan_fry.md)
- [Sauté](./brussels_sprouts-saute.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Cut profile lacks anatomy | −1 |
| Method file `brussels_sprouts-pan_fry.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `brussels_sprouts-pan_fry.md` copies parent cut profile — rewrite `brussels_sprouts-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
