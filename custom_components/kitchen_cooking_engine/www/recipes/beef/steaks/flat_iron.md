<!-- KCE:CUT
type: cut
slug: flat_iron
name: Flat Iron Steak
name_sv: Flat Iron
category: beef
meat: cow
cut_type: Steaks
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- air_fryer
- charcoal_grill
- grill
- oven_roast
- pan_fry
- pan_sear
- sous_vide
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
quality_score: 11
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Flat Iron Steak — Cut Overview

## Cut profile

The flat iron steak is taken from the infraspinatus muscle of the beef shoulder blade, separated from the central band of tough gristle that runs through the full top blade. Because the infraspinatus performs relatively little work, it retains outstanding intramuscular fat for a non-loin cut, producing deeply beefy, slightly buttery flavour comparable to ribeye at a fraction of the cost. Individual steaks are typically 200–350 g and 2–3 cm thick — a dimension that fits the air fryer's compact hot-air cabinet well. The air fryer's high-velocity convection at 200–205 °C dries the surface rapidly and drives the Maillard reaction without a dedicated grill or stovetop. Carryover is moderate, typically 2–3 °C after leaving the basket, so pulling 3 °C below the intended serving temperature is standard practice.


## Styckesprofil

Flat iron-biffen tas från *infraspinatus*-muskeln i nötdjurets skulderparti — specifikt det övre bladbenet. Det är det näst möraste snittet av hela djuret efter filén, med utmärkt marmorering och intensiv smak. Airfryer-tillagning ger intensiv cirkulerad luft runt biffen; effekten är jämförbar med snabb konvektionsugn. Innertemperatur: 54–57 °C medium-rare. Eftertillagning: 2–3 °C. Avsluta gärna med ett kort searing i het panna för optimal yta.

## Research files by cooking method

- [Air Fryer](./flat_iron-air_fryer.md)
- [Charcoal Grill](./flat_iron-charcoal_grill.md)
- [Grill](./flat_iron-grill.md)
- [Oven Roast](./flat_iron-oven_roast.md)
- [Pan Fry](./flat_iron-pan_fry.md)
- [Pan Sear](./flat_iron-pan_sear.md)
- [Sous Vide](./flat_iron-sous_vide.md)
## Quality score

**Score: 11 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `flat_iron-air_fryer.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `flat_iron-air_fryer.md` copies parent cut profile — rewrite `flat_iron-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
