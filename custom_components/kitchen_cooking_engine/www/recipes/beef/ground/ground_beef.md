<!-- KCE:CUT
type: cut
slug: ground_beef
name: Ground Beef
name_sv: Nötfärs
category: beef
meat: cow
cut_type: Ground
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Ground Beef — Cut Overview

## Cut profile

Ground beef (minced beef) is made by grinding beef, most commonly from the chuck primal or a blend of trimmings. The fat-to-lean ratio is the primary quality variable: 80/20 is standard for most preparations; 85/15 is leaner; 70/30 is richer and juicier. Because grinding ruptures muscle cells and distributes surface bacteria throughout the mass, the USDA and equivalent international food-safety authorities require a minimum internal temperature of 71°C (160°F) — there is no medium-rare option for ground beef the way there is for whole steaks. Carryover is minimal (1–2°C) given the fine grind and rapid heat transfer.


## Styckesprofil

Malet nötkött (köttfärs) framställs av nötmalning, vanligast från fransyska, bringa eller blandningar av dessa, och innehåller 15–30 % fett. Till skillnad från hela muskelstycken saknar köttfärs inre bindvävsstruktur — malningen har redan söndrat muskelfibrerna — så "brässering" av malet nötkött innebär att man kokar det i vätska för att mjuka smöret, absorbera smaker och eventuellt tjockna en sås snarare än att omvandla kollagen. Fuktigt tillagad köttfärs producerar ett mjukt, grynigt resultat; den interna temperaturen bör nå 74 °C av livsmedelssäkerhetsskäl (inte av texturskäl som för hela muskler).

## Research files by cooking method

- [Braise](./ground_beef-braise.md)
- [Pan Fry](./ground_beef-pan_fry.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `ground_beef-braise.md` copies parent cut profile | −1 |
| Method file `ground_beef-pan_fry.md` copies parent cut profile | −1 |
| Method file `ground_beef-braise.md` copies `ground_beef-pan_fry.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `ground_beef-braise.md` copies `ground_beef-pan_fry.md` — rewrite `ground_beef-braise.md`'s cut profile — it must describe what the pan fry method does to this cut, not repeat another method's prose
3. **−1** · Method file `ground_beef-braise.md` copies parent cut profile — rewrite `ground_beef-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `ground_beef-pan_fry.md` copies parent cut profile — rewrite `ground_beef-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
