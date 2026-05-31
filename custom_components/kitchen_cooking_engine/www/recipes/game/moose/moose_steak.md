<!-- KCE:CUT
type: cut
slug: moose_steak
name: Moose Steak
name_sv: Älgbiff
category: game
meat: moose
cut_type: Moose
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
quality_score: -6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 3
-->
# Moose Steak — Cut Overview

## Cut profile

Moose steak (Elchsteak / älgbiff) is cut from the loin or haunch. It is very lean with a rich, earthy flavour. Grilling over high heat for a short time is the traditional Nordic approach; the meat should be seared quickly and pulled at medium-rare to prevent dryness. Marinating in oil and acidic components (wine, vinegar, lemon) before grilling is standard practice.


Target internal temperature: **57–62 °C (135–144 °F)** for medium-rare to medium.


## Styckesprofil

Älgstek (*Elchsteak* / älgbiff) skärs från ryggen eller haunch. Mycket magert med rik, jordig viltsmak. Grillning vid hög värme under kort tid är det traditionella nordiska tillvägagångssättet. Marinering i olja och syrliga komponenter (vin, vinäger, citron) rekommenderas för att mjuka upp fibern och tillföra fukt.

Tillagningstid: 3–4 minuter per sida vid direkt hög värme. Innertemperatur: **57–62 °C (135–144 °F)** för medium-rare till medium. Eftertillagning: 3–4 °C. Dra alltid tidigt — älg straffar hårt för överkokning: vid 68 °C börjar köttet torka och vid 74 °C är det tufft och torrliknande.

## Research files by cooking method

- [Grill](./moose_steak-grill.md)
- [Pan Sear](./moose_steak-pan_sear.md)
## Quality score

**Score: -6 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `moose_steak-grill.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `moose_steak-grill.md` copies parent cut profile — rewrite `moose_steak-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
