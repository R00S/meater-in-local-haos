<!-- KCE:CUT
type: cut
slug: rack_of_lamb
name: Rack of Lamb
name_sv: Lammracks
category: lamb
meat: lamb
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- oven_roast
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
# Rack of Lamb — Cut Overview

## Cut profile

Rack of lamb (the rib section with 7–8 French-trimmed rib bones) is one of the most prestigious and visually dramatic roasting cuts in European and North American cooking. A Frenched rack of lamb, coated in a herb crust (persillade or Dijon-breadcrumb), seared in a pan, then roasted in a hot oven 20–25 minutes, is a classic dinner-party centrepiece.

Because the meat is from the loin and has very little connective tissue, rack of lamb must be treated like a premium steak and never overcooked.


Target internal temperature: **52–57 °C (126–135 °F)** for medium-rare (the universal preference). Pull at 50–52 °C.


## Styckesprofil

Rack of lamb (rev-sektionen med 7–8 frenserade revbensben) är ett av de mest prestigefyllda rostningsstycken. En Frenchad rack, belagd med örtkorpa, är ett imponerande festmåltidsstycke. Ugnsrostning ger mest kontrollerade resultat.

Sear all om i het panna (1–2 minuter per sida), belägg med senap och örtkorpa (*persillade*), rosta i ugn vid 200–220 °C tills sonden visar måltemperaturen. Innertemperatur: **57–63 °C (135–145 °F)** för medium-rare. Eftertillagning: 4–5 °C. Sond in i *longissimus dorsi*-muskeln borta från benet. Vila 5–8 minuter täckt.

## Research files by cooking method

- [Oven Roast](./rack_of_lamb-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `rack_of_lamb-grill.md` | −1 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Method file `rack_of_lamb-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `rack_of_lamb-grill.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group A and Culinary Group D tradition(s) — add Culinary Group A and Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `rack_of_lamb-oven_roast.md` copies parent cut profile — rewrite `rack_of_lamb-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
