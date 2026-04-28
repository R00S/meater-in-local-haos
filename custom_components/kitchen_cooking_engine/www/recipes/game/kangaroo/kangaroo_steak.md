<!-- KCE:CUT
type: cut
slug: kangaroo_steak
name: Kangaroo Steak
name_sv: Kängurufilé
category: game
meat: kangaroo
cut_type: Kangaroo
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 2
-->
# Kangaroo Steak — Cut Overview

## Cut profile

Kangaroo (*Macropus* spp.) steak, most commonly from the hindquarter/rump or loin fillet, is one of the leanest red meats available — typically less than 2% fat. The meat is deep crimson, with a slightly gamy, iron-rich flavour. Because of its extreme leanness, kangaroo must be cooked hot and fast to prevent drying: pan-searing for 2–3 minutes per side over high heat achieves a seared crust while keeping the interior rare to medium-rare. Cooking beyond medium results in a dry, liver-textured product.


Target internal temperature: **54–57 °C (130–135 °F)** for medium-rare. Many Australian cooks pull at 50–52 °C for a warm-red centre. Well-done is strongly discouraged.


## Styckesprofil

Känguru (*Macropus* spp.) stek — vanligast från rumpen eller loin-filén — är ett av världens magraste röda kött (typiskt under 2 % fett), djupt karmosinrött med lätt viltaktig, järnrik smak. Den extrema magreten kräver hett och snabbt tillagning — pannstekning i 2–3 minuter per sida vid hög värme ger searad skorpa med rare till medium-rare inre.

Alla tillagningsmetoder (grill, panna, ugn) kräver kortare tider och lägre sluttemperaturer jämfört med nötkött. Innertemperatur: **54–57 °C (130–135 °F)** för medium-rare. Välgenomstekt avråds starkt — kött som överstiger 63 °C torkar ut och förlorar sin karakteristiska konsistens.

## Research files by cooking method

- [Grill](./kangaroo_steak-grill.md)
- [Pan Sear](./kangaroo_steak-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `kangaroo_steak-pan_sear.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Group A, Culinary Group C and Culinary Group D tradition(s) — add Culinary Group A, Culinary Group C and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `kangaroo_steak-pan_sear.md` copies parent cut profile — rewrite `kangaroo_steak-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
