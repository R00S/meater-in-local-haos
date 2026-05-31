<!-- KCE:CUT
type: cut
slug: caramelized_onions
name: Caramelized Onions
name_sv: Karamelliserade lökar
category: vegetables
meat: alliums
cut_type: Alliums
methods:
- pan_fry
- saute
doneness:
- name: caramelized
  target_c: 160
  target_f: 320
  min_c: 150
  min_f: 300
  max_c: 175
  max_f: 350
  usda_safe: true
quality_score: -6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 0
carryover_temp_c: 0
-->
# Caramelized Onions — Cut Overview

## Cut profile

Caramelised onions via pan-frying refers to the style in which sliced or halved onions are cooked in generous hot fat over medium-to-high heat, with deliberate browning as the primary goal, contrasted with the slow-sauté method. At 170–190 °C pan temperature, the natural sugars (roughly 5 % of the onion's weight) undergo both caramelisation and Maillard reactions with the amino acids, producing deeply browned, almost crispy-edged onions with intense sweetness and bitterness in balance. This technique appears in South Asian birista (fried garnish), Alsatian Zwiebelkuchen bases, French *soubise* shortcuts, and Japanese-style glazed onion sides. A MEATER probe inserted horizontally into a thick half-onion near the centre reads the internal transition from crisp-dense (~60 °C) to fully soft (85–92 °C). Carryover is small but the browned rings crisp up further as they cool on a wire rack.


## Styckesprofil

Karameliserade lökar via pannstekning avser stilen där skivad eller halvad lök tillagas i rikligt hett fett vid medel till hög värme, med medveten bryning som primärt mål. Löken mjuknar och sötar sig under 15–25 minuter. Sötman från Maillard-reaktion och sockerkaramellisering skapar djupa, komplexa smaker. Innertemperatur: inte relevant — stek tills djupt guldenbrun och mjuk.

## Research files by cooking method

- [Pan Fry](./caramelized_onions-pan_fry.md)
- [Sauté](./caramelized_onions-saute.md)
## Quality score

**Score: -6 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `caramelized_onions-pan_fry.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
3. **−1** · Method file `caramelized_onions-pan_fry.md` copies parent cut profile — rewrite `caramelized_onions-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
