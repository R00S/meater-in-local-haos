<!-- KCE:CUT
type: cut
slug: lamb_cutlet
name: Lamb Cutlet
name_sv: Lammkotlett
category: lamb
meat: lamb
cut_type: Chops
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- pan_fry
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Lamb Cutlet — Cut Overview

## Cut profile

Lamb cutlets (thin, Frenched rib chops) are the most refined lamb cut — a single rib bone with the meat formed into a small medallion. They are a bistro classic in France and the UK, a restaurant staple in Australia and New Zealand, and are popular as party food throughout the Middle East and South Asia. Cooking time is very brief — 2–3 minutes per side — making them ideal for a pan with butter basting.

Target: **52–57 °C (126–135 °F)** for medium-rare. They overcook rapidly given their thin cross-section.


## Styckesprofil

Lammfilékotletter (tunna, Frenchade ryggkotletter) är det mest förfinade lammskivesnittet — ett enskilt revbenslben med köttet format till en liten medaljon. De är ett bistroklassiker i Frankrike och UK, ett restaurangmärke i Australien och Nya Zeeland, och populärt festmat i Mellanöstern och Sydasien.

Sear vid hög värme, 2–3 minuter per sida. Sond in i den tjockaste muskeldelen borta från benet. Innertemperatur: **57–63 °C (135–145 °F)** för medium-rare till medium. Eftertillagning: 2–3 °C. Vila täckt 3–5 minuter. Tunnare snitt (< 2 cm) kokar mer sällan än tjockare snitt.

## Research files by cooking method

- [Pan Fry](./lamb_cutlet-pan_fry.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `lamb_cutlet-grill.md` | −1 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `lamb_cutlet-pan_fry.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `lamb_cutlet-grill.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `lamb_cutlet-pan_fry.md` copies parent cut profile — rewrite `lamb_cutlet-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
