<!-- KCE:CUT
type: cut
slug: cod_fillet
name: Cod Fillet
name_sv: Torskfilé
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- air_fryer
- oven_bake
- oven_roast
- pan_fry
doneness:
- name: medium
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
quality_score: 10
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Cod Fillet — Cut Overview

## Cut profile

Atlantic cod (*Gadus morhua*) fillet is cut from the sides of the fish; the flesh is firm, bright white when raw and milky white when cooked, with large moist flakes separated by thin layers of connective tissue. Cod is lean (less than 1% fat), which means it has no internal fat to provide self-basting protection during high-heat cooking; the natural moisture and gelatin in the connective tissue are the primary sources of perceived juiciness. Pan frying is a very common preparation — the high heat of the pan produces a golden-brown crust on the thin, flour- or breadcrumb-coated exterior while the interior cooks gently. Battered cod (fish and chips) uses the batter as insulation; simple pan-fried cod relies on a light coating of seasoned flour or the naked flesh. Carryover is minimal (2–3 °C) given the lean composition; the flesh transitions from moist-and-flaky to dry-and-crumbly rapidly above 65 °C.


## Styckesprofil

Atlantisk torsk (*Gadus morhua*) är skärd från fisksidorna; köttet är fast, klart vitt rått och mjölkvitt kokt, med stora fuktiga fjäll separerade av tunna lager bindväv. Torsk är mager (under 1% fett), vilket innebär att den inte har internt fett för att ge självbastande skydd under höghets-tillagning; den naturliga fuktigheten och gelatinet i bindväven är de primära källorna till upplevd saftighet.

Pannstekning är en mycket vanlig beredning — den höga ledningsvärmen i pannan producerar en gyllenbrun skorpa på den tunna, mjöl- eller ströbrödsbelagda ytan medan insidan tillagar varsamt. Battrerad torsk (fish and chips) använder battern som isolering; enkel pannstekt torsk förlitar sig på en lätt beläggning av kryddad mjöl eller det nakna köttet. Eftertillagning är minimal (2–3 °C) given den magra sammansättningen; köttet övergår snabbt från fuktigt-och-fjälligt till torrt-och-smulande ovanför 65 °C. Innertemperatur: 60–63 °C.

## Research files by cooking method

- [Air Fryer](./cod_fillet-air_fryer.md)
- [Oven Bake](./cod_fillet-oven_bake.md)
- [Pan Fry](./cod_fillet-pan_fry.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | − **NOT DONE** (−8) |
| Missing method leaf file `cod_fillet-oven_roast.md` | − pending (−1) |
| Missing Culinary Group D tradition | − pending (−1) |
| Method file `cod_fillet-air_fryer.md` copies parent cut profile | ✓ fixed 2026-04-27 |
| Method file `cod_fillet-oven_bake.md` copies parent cut profile | ✓ fixed 2026-04-27 |
| Method file `cod_fillet-pan_fry.md` copies parent cut profile | ✓ fixed 2026-04-27 |
| Method file `cod_fillet-air_fryer.md` copies `cod_fillet-oven_bake.md` | ✓ fixed 2026-04-27 |
| Method file `cod_fillet-air_fryer.md` copies `cod_fillet-pan_fry.md` | ✓ fixed 2026-04-27 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `cod_fillet-oven_roast.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
