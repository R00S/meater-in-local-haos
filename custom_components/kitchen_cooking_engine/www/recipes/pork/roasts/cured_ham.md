<!-- KCE:CUT
type: cut
slug: cured_ham
name: Cured Ham (Pre-cooked)
name_sv: Rökt skinka
category: pork
meat: pig
cut_type: Ham
usda_safe_c: 60
usda_safe_f: 140
recommended_doneness: well_done
methods:
- oven_roast
doneness:
- name: heated_through
  target_c: 60
  target_f: 140
  min_c: 57
  min_f: 135
  max_c: 63
  max_f: 145
  usda_safe: true
  recommended: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Cured Ham (Pre-cooked) — Cut Overview

## Cut profile

Cured ham (skinke in Danish; Schinken in German/Austrian) for the oven roast method encompasses both pre-boiled glazed ham and straight-to-oven versions. The classic approach is to boil a mild-cured or smoked ham first (removing excess salt and pre-cooking the meat), then score the rind and glaze it in a hot oven until caramelised. Low-and-slow oven variants skip the boiling and use very low temperatures (80°C oven) to achieve even, juicy results.


Target internal temperature for safe, juicy cured ham: **70–75 °C** — the curing keeps the meat safe at slightly lower temps than fresh pork, but 75 °C is the standard target for glazed results.

Target internal temperatures (oven roast):
- Juicy, glazed: **70–75 °C (158–167 °F)**
- Very low-and-slow: **75 °C** (when oven is held at 80 °C)


## Styckesprofil

Härdad skinka (*skinke* danska; *Schinken* tyska) för ugnsrostning — från förkokt glaserad till direkt-till-ugn. Det klassiska tillvägagångssättet: förskållning i vatten (tar bort överskottssalt), sedan glasering och avslutning i 200–220 °C ugn.

Innertemperatur: **68–75 °C (154–167 °F)** för varm, saftig härdad skinka. Eftertillagning: 3–4 °C. Sond in i tjockaste köttmassan, borta från lårbenets kärna. Vila 15–20 minuter täckt. Glaseringen (senap+socker eller honungssenap) appliceras de sista 20–30 minuterna.

## Research files by cooking method

- [Oven Roast](./cured_ham-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `cured_ham-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `cured_ham-oven_roast.md` copies parent cut profile — rewrite `cured_ham-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
