<!-- KCE:CUT
type: cut
slug: lamb_loin_chops
name: Lamb Loin Chops
name_sv: Lammlårkotlett
category: lamb
meat: lamb
cut_type: Chops
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
rest_time_min: 3
rest_time_max: 5
carryover_temp_c: 3
-->
# Lamb Loin Chops — Cut Overview

## Cut profile

Lamb loin chops are the T-bone of lamb — cut from the saddle, containing both the loin and the small section of tenderloin. They are larger and meatier than rib chops, with a characteristic T-shaped bone. In the UK they are sold as "lamb chump chops" (slightly different cut, from the rump). They are pan-seared 4–5 minutes per side to medium.

Target: **57–62 °C (135–144 °F)** for medium (slightly pink). Africanbites.com: 135–140°F (57–60°C).


## Styckesprofil

Lammryggstek (lumbarsnitt, T-ben) är lammets T-ben — innehåller både loin och en liten del av filén. De är större och köttigare än ryggkotletter. I UK säljs de som "lamb chump chops" (något annorlunda snitt, från rumpen). 

Het gjutjärns- eller tung panna, 4–5 minuter per sida, sedan vila. Sond in i den tjockaste loin-muskeldelen borta från benet. Innertemperatur: **57–63 °C (135–145 °F)** för medium-rare till medium. Eftertillagning: 3–4 °C. Basta med rosmarin-vitlökssmör under de sista minuterna.

## Research files by cooking method

- [Pan Sear](./lamb_loin_chops-pan_sear.md)
## Quality score

**Score: -6 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `lamb_loin_chops-grill.md` | −1 |
| Missing Culinary Group A tradition | −1 |
| Method file `lamb_loin_chops-pan_sear.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `lamb_loin_chops-grill.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−1** · Method file `lamb_loin_chops-pan_sear.md` copies parent cut profile — rewrite `lamb_loin_chops-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
