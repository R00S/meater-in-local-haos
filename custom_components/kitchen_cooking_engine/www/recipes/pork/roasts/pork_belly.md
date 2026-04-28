<!-- KCE:CUT
type: cut
slug: pork_belly
name: Pork Belly
name_sv: Sidfläsk
category: pork
meat: pig
cut_type: Roasts
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- air_fryer
- braise
- grill
- oven_roast
- pan_fry
- slow_cooker
- smoker
- sous_vide
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
- name: crispy
  target_c: 90
  target_f: 195
  min_c: 85
  min_f: 185
  max_c: 95
  max_f: 203
  usda_safe: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 15
carryover_temp_c: 3
-->
# Pork Belly — Cut Overview

## Cut profile

Pork belly (*svinekam* / *flæskesteg*, Danish; *Schweinebauch*, German; *pancetta tesa*, Italian; *lardo*, cured Italian; *bak kwa*, Chinese) is the ventral thoracic wall — the layered structure of skin, subcutaneous fat, *serratus ventralis* muscle, more fat, intercostal fat, and the *transversus abdominis* muscle layers. This layered structure is the defining anatomical feature: alternating lean muscle and fat sheets running in a horizontal laminar pattern across the cross-section. Skin-on pork belly has a thick dermis (*svær* / *Schwarte*) that — when properly scored and salted — blisters and crackles into one of the most texturally complex foods in all of cooking. Belly fat content is high (20–35%), making it one of the most forgiving pork cuts — it retains moisture at wide temperature ranges (65–80 °C).


## Styckesprofil

Fläskbuk (*svinekam* / *flæskesteg* danska; *Schweinebauch* tyska; *pancetta tesa* italienska) är den ventrala bröstkorgsväggen — den skiktade strukturen av hud, subcutant fett, interkostalsmuskler och intramuskulärt fett. Det är det fetaste snittet av grisen.

Denna fettrikedom gör det idealisk för långsam tillagning (sous vide, bräsering, rök) som smälter ned fettet och bindväven till silkig textur, men också för hög-temperatur-rosting där svålen karameliserar till kris. Innertemperatur: **80–88 °C** för genomstekt (ugn/grill); **72–78 °C** för sous vide.

## Research files by cooking method

- [Air Fryer](./pork_belly-air_fryer.md)
- [Braise](./pork_belly-braise.md)
- [Grill](./pork_belly-grill.md)
- [Oven Roast](./pork_belly-oven_roast.md)
- [Pan Fry](./pork_belly-pan_fry.md)
- [Slow Cooker](./pork_belly-slow_cooker.md)
- [Smoker](./pork_belly-smoker.md)
- [Sous Vide](./pork_belly-sous_vide.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group C tradition | −1 |
| Method file `pork_belly-air_fryer.md` copies parent cut profile | −1 |
| Method file `pork_belly-grill.md` copies parent cut profile | −1 |
| Method file `pork_belly-air_fryer.md` copies `pork_belly-grill.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `pork_belly-air_fryer.md` copies `pork_belly-grill.md` — rewrite `pork_belly-air_fryer.md`'s cut profile — it must describe what the grill method does to this cut, not repeat another method's prose
3. **−1** · Method file `pork_belly-air_fryer.md` copies parent cut profile — rewrite `pork_belly-air_fryer.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `pork_belly-grill.md` copies parent cut profile — rewrite `pork_belly-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group C tradition(s) — add Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
