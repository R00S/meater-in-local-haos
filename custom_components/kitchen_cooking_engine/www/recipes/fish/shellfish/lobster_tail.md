<!-- KCE:CUT
type: cut
slug: lobster_tail
name: Lobster Tail
name_sv: Hummersvans
category: fish
meat: shellfish
cut_type: Shellfish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- oven_roast
doneness:
- name: tender
  target_c: 57
  target_f: 135
  min_c: 54
  min_f: 130
  max_c: 60
  max_f: 140
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Lobster Tail — Cut Overview

## Cut profile

Lobster tail is the tail segment of a lobster (*Homarus americanus* — American/Maine lobster; *Homarus gammarus* — European/Breton lobster; or *Panulirus argus* — Caribbean spiny lobster) separated from the body and claws. The edible flesh is the large tail muscle (*pleopod* and *telson* musculature), which is firm, white-to-pale-pink, sweet, and rich in natural glutamates. The segmented exoskeleton (shell) is a built-in heat shield that protects the flesh from overcooking and acts as a flavour-retaining vessel. Standard tail dimensions for cooking: 170–280 g (6–10 oz) spiny lobster tails, 3–5 cm thick at the broadest cross-section. Overcooking is the primary risk — muscle proteins tighten sharply above 62 °C; the pull window for moist, sweet meat is 58–62 °C. USDA minimum for lobster is 63 °C (145 °F).


## Styckesprofil

Hummersvans är svanssegmentet av en hummer (*Homarus americanus* — amerikansk/Maine-hummer; *Homarus gammarus* — europeisk/bretonsk hummer; eller *Panulirus argus* — karibisk spinhummer) separerat från kroppen och klorna. Det ätliga köttet är den stora svansmuskeln (*pleopod*- och *telson*-muskulatur), som är fast, vit till blekrosa, söt och rik på naturliga glutamater.

Det segmenterade ytterskalet (skalet) är ett inbyggt värmeskydd som skyddar köttet från överkokning och fungerar som en smakförstärkande behållare. Standardmåtten för tillagning: 170–280 g (6–10 oz) spinhummersvansen, 3–5 cm tjockt vid den bredaste tvärsnittsprofilen. Överkokning är den primära risken — muskelproteinerna stramar kraftigt ovanför 62 °C; dragfönstret för fuktigt, sött kött är 58–62 °C. USDA-minimum för hummer är 63 °C (145 °F). Innertemperatur: 58–62 °C.

## Research files by cooking method

- [Grill](./lobster_tail-grill.md)
- [Oven Roast](./lobster_tail-oven_roast.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group C tradition | −1 |
| Method file `lobster_tail-grill.md` copies parent cut profile | −1 |
| Method file `lobster_tail-oven_roast.md` copies parent cut profile | −1 |
| Method file `lobster_tail-grill.md` copies `lobster_tail-oven_roast.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `lobster_tail-grill.md` copies `lobster_tail-oven_roast.md` — rewrite `lobster_tail-grill.md`'s cut profile — it must describe what the oven roast method does to this cut, not repeat another method's prose
3. **−1** · Method file `lobster_tail-grill.md` copies parent cut profile — rewrite `lobster_tail-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `lobster_tail-oven_roast.md` copies parent cut profile — rewrite `lobster_tail-oven_roast.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group C tradition(s) — add Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
