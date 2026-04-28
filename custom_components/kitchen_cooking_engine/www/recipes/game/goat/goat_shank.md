<!-- KCE:CUT
type: cut
slug: goat_shank
name: Goat Shank
name_sv: Getlägg
category: game
meat: goat
cut_type: Goat
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- braise
- oven_roast
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 5
-->
# Goat Shank — Cut Overview

## Cut profile

The goat shank (*getlägg*, Swedish; *jarrete de cabra*, Spanish; *kuzu kolu*, Turkish; *paaya*, Urdu) is the lower portion of the leg — the *radius/ulna* (fore) or *tibia/fibula* (hind) segments and the surrounding musculature. The shank muscles are among the most heavily worked in the carcass; they are dense, tight-fibred, and packed with collagen-rich connective tissue and bone marrow. Goat shank is leaner than lamb shank but has the same collagen density and braise requirement: prolonged moist heat at 88–93 °C internal for 1.5–2 hours to fully convert collagen to gelatin. A single shank serves one person. The bone marrow enriches braising liquid significantly. MEATER probe horizontally through the thickest part of the muscle, parallel to the bone.


## Styckesprofil

Getlägg (*getlägg*, svenska; *jarrete de cabra*, spanska; *kuzu kolu*, turkiska; *paaya*, urdu) är den nedre delen av benet — *radius/ulna* (fram) eller *tibia/fibula* (bak) och omgivande muskulatur. Skaftmusklerna är bland de mest hårt arbetade i slaktkroppen: täta, hårt fibriga och packade med kollagenrik bindväv och benmärg.

Getlägg skiljer sig från lammlägg i att get i allmänhet slaktas vid äldre ålder (6–18 månader), vilket innebär tätare kollagen och starkare smak med längre braiseringsperiod (2,5–3 timmar). Innertemperatur: **88–95 °C** för fall-från-benet-möra resultat. Eftertillagning: försumbar.

## Research files by cooking method

- [Braise](./goat_shank-braise.md)
- [Oven Roast](./goat_shank-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Method file `goat_shank-braise.md` copies parent cut profile | −1 |
| Method file `goat_shank-oven_roast.md` copies parent cut profile | −1 |
| Method file `goat_shank-braise.md` copies `goat_shank-oven_roast.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `goat_shank-braise.md` copies `goat_shank-oven_roast.md` — rewrite `goat_shank-braise.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
3. **−1** · Method file `goat_shank-braise.md` copies parent cut profile — rewrite `goat_shank-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `goat_shank-oven_roast.md` copies parent cut profile — rewrite `goat_shank-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
