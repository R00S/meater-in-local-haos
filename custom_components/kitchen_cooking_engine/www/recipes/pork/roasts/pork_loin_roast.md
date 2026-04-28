<!-- KCE:CUT
type: cut
slug: pork_loin_roast
name: Pork Loin Roast
name_sv: Karréstek
category: pork
meat: pig
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- oven_roast
- slow_cooker
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Pork Loin Roast — Cut Overview

## Cut profile

Pork loin roast (svinekam in Danish; Schweinerücken / Kotelettstrang in German/Austrian) with rind (svær / Schwarte) is the quintessential Scandinavian and German Sunday dinner. The loin is leaner than the belly so it needs more careful temperature management — pull too early and it's under-safe; pull too late and it dries out. The Danish approach targets **65°C** for a juicy, slightly rosy result; German recipes often go to 72–75°C for a firmer texture. For a MEATER probe, 65°C is an excellent target with a high-heat crackling finish.


Target internal temperatures (oven roast):
- Juicy, slightly rosy (Danish-style): **60–65 °C (140–149 °F)**
- Traditional firm, fully white (German-style): **70–75 °C (158–167 °F)**


## Styckesprofil

Fläskloin-stek (*svinekam* danska; *Schweinerücken* / *Kotelettstrang* tyska) med svål är den nordiska och tyska söndagsmiddagens kärna. Djup ritsning av svålen, salt i ritsorna, ugnsrostning vid 180–200 °C.

Innertemperatur: **68–72 °C (154–162 °F)** för genomstekt, saftig loin. USDA-minimum: **63 °C** med 3 min vila. Eftertillagning: 3–4 °C. Sond in i tjockaste köttmassan, borta från benet och svålen. Vila täckt 15 minuter. Avsluta alltid under grillelementet för knäppande svål.

## Research files by cooking method

- [Oven Roast](./pork_loin_roast-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `pork_loin_roast-slow_cooker.md` | −1 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `pork_loin_roast-oven_roast.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `pork_loin_roast-slow_cooker.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `pork_loin_roast-oven_roast.md` copies parent cut profile — rewrite `pork_loin_roast-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
