<!-- KCE:CUT
type: cut
slug: goose_thigh
name: Goose Thigh
name_sv: Gåslår
category: poultry
meat: goose
cut_type: Goose
usda_safe_c: 74
usda_safe_f: 165
recommended_doneness: dark_meat_optimal
methods:
- braise
- oven_roast
doneness:
- name: safe
  target_c: 74
  target_f: 165
  min_c: 74
  min_f: 165
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
- name: dark_meat_optimal
  target_c: 77
  target_f: 170
  min_c: 74
  min_f: 165
  max_c: 82
  max_f: 180
  usda_safe: true
  recommended: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 15
carryover_temp_c: 4
-->
# Goose Thigh — Cut Overview

## Cut profile

Goose thigh (*gåslår*, Swedish; *Gänseschenkel*, German; *cuisse d'oie*, French) is the top portion of the leg — the *biceps femoris*, *semitendinosus*, *semimembranosus*, and *gracilis* muscles surrounding the femur. Goose thigh is much richer and fattier than chicken or turkey thigh: a goose's subcutaneous and intramuscular fat is higher in oleic acid, giving it a silkier texture when rendered. The combination of highly worked muscle fibres and extensive fat means the thigh is the darkest, most flavourful part of the goose — more so even than the leg. Because of the fat and collagen load, goose thigh needs sustained moist heat to reach tenderness: target 79–85 °C internal. The abundant rendered goose fat enriches any braising liquid or serves as the confit medium.


Target internal temperature: **175–185 °F (79–85 °C)** — optimal for collagen breakdown; USDA minimum: 165 °F (74 °C).


## Styckesprofil

Gåslår (*gåslår*, svenska; *Gänseschenkel*, tyska; *cuisse d'oie*, franska) är den övre delen av benet — *biceps femoris*, *semitendinosus*, *semimembranosus* och *gracilis*-musklerna omgivna av eget fett. Innertemperatur: 80–85 °C. Eftertillagning: 3–5 °C.

## Research files by cooking method

- [Braise](./goose_thigh-braise.md)
- [Oven Roast](./goose_thigh-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Method file `goose_thigh-braise.md` copies parent cut profile | −1 |
| Method file `goose_thigh-oven_roast.md` copies parent cut profile | −1 |
| Method file `goose_thigh-braise.md` copies `goose_thigh-oven_roast.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `goose_thigh-braise.md` copies `goose_thigh-oven_roast.md` — rewrite `goose_thigh-braise.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
3. **−1** · Method file `goose_thigh-braise.md` copies parent cut profile — rewrite `goose_thigh-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `goose_thigh-oven_roast.md` copies parent cut profile — rewrite `goose_thigh-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
