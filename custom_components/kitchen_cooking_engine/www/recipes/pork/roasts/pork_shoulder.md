<!-- KCE:CUT
type: cut
slug: pork_shoulder
name: Pork Shoulder / Boston Butt
name_sv: Fläskbog
category: pork
meat: pig
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- oven_roast
- slow_cooker
- smoker
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Pork Shoulder / Boston Butt — Cut Overview

## Cut profile

Pork shoulder / neck (nakkefilet / nakkekam / svinekølle in Danish; Schweinenacken / Schweineschulter in German/Austrian) is one of the most forgiving cuts for the oven — its fat marbling prevents drying out and it develops deep flavour at virtually any oven temperature. The Danish approach covers with foil at 200°C for 105 minutes (firm but juicy); the Norwegian approach targets 75°C core at 175°C oven; the German approach uses the Krustenbraten method at 180°C × 2 hrs. Unlike the leaner loin, shoulder can be taken higher without losing juiciness.


Target internal temperatures (oven roast):
- Juicy, sliceable: **72–75 °C (162–167 °F)**
- Very tender (approaching pulled): **80–85 °C (176–185 °F)**


## Styckesprofil

Fläskbog / nacke (*nakkefilet* / *nakkekam* danska; *Schweinenacken* / *Schweineschulter* tyska) — ett av de mest förlåtande snitten. Fettmarmoreringen förhindrar uttorkning. Ugnsrostning vid 160–200 °C i 2–4 timmar.

Innertemperatur: **75–80 °C (167–176 °F)** för genomstekt, saftig bog; **88–95 °C** för pull-apart. Eftertillagning: 3–5 °C. Sond in i tjockaste köttmassan, borta från skulderbladsben. Vila täckt 15–20 minuter. Fläskbog är ett av de mest kollagenrika snitten och belönar lång tillagning.

## Research files by cooking method

- [Oven Roast](./pork_shoulder-oven_roast.md)
- [Slow Cooker](./pork_shoulder-slow_cooker.md)
- [Smoker](./pork_shoulder-smoker.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Method file `pork_shoulder-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `pork_shoulder-oven_roast.md` copies parent cut profile — rewrite `pork_shoulder-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
