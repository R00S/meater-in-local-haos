<!-- KCE:CUT
type: cut
slug: buffalo_burger
name: Burger
name_sv: Buffelburgare
category: game
meat: buffalo
cut_type: Buffalo
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- grill
- pan_fry
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: -7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Burger — Cut Overview

## Cut profile

Buffalo/bison burger (ground buffalo patty, grilled) is one of the most popular preparations in North America and increasingly in Europe. The lean ground meat makes for a firm, flavourful patty — it dries out quickly so most American recipes cook to medium (63 °C) rather than well-done. Adding a small amount of fat (bacon fat, olive oil) to the mix prevents dryness.


Target internal temperature: **70–74 °C (158–165 °F)** (ground meat food safety standard in the US and EU); some chefs serve at 63 °C (medium) as a restaurant preference.


## Styckesprofil

Buffalo/bisonburgare (malet bison, grillad) är en populär beredning i Nordamerika. Det magra malade köttet ger en fast, smakrik biff. Bisonens extrema magerhet innebär att grillbiffar behöver kortare tillagningstid än nötkötsbiffar — övervaka noggrant för att undvika torr konsistens.

Att tillsätta en liten mängd fett till blandningen förhindrar torrhet. Innertemperatur: **71 °C (160 °F)** USDA-minimum för malet kött. Eftertillagning: 2–3 °C. Tillagningstid: 3–4 minuter per sida vid medel-hög grillvärme. Sond från sidan in mot mitten av biffens tjockaste del.

## Research files by cooking method

- [Grill](./buffalo_burger-grill.md)
- [Pan Fry](./buffalo_burger-pan_fry.md)
## Quality score

**Score: -7 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `buffalo_burger-grill.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `buffalo_burger-grill.md` copies parent cut profile — rewrite `buffalo_burger-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
