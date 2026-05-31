<!-- KCE:CUT
type: cut
slug: bison_burger
name: Bison Burger
name_sv: Bisonburgare
category: game
meat: bison
cut_type: Bison
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- grill
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
quality_score: -6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Bison Burger — Cut Overview

## Cut profile

Bison burger patties are made from ground bison meat, typically sourced from the shoulder, chuck, or round — the same primal cuts used for beef hamburgers. Bison is notably leaner than beef, often containing only 2–7% fat depending on the grind, compared to 15–20% in a typical beef burger blend. This leanness is both the appeal and the challenge: bison has a clean, slightly sweet, mineral-forward flavour but is prone to drying out if overcooked or if insufficient fat is present.

Because ground bison is so lean, fat management is critical. Many cooks either blend pure ground bison with a fattier cut (e.g., bison back fat or beef suet) to reach roughly 10–15% total fat, or they compensate with binding ingredients such as egg, mustard, and ketchup that add moisture and help hold the patty together. Cooking over high direct heat — whether on charcoal, a gas grill, or a cast-iron pan — is the preferred method, as it quickly builds a crust that seals in juices before the lean meat has time to dry out.

Food safety regulations in most countries classify ground meat as a high-risk product requiring thorough cooking: the USDA standard for ground meat is 71 °C / 160 °F internal temperature. BBC Good Food echoes this at 70 °C. However, gourmet and restaurant preparations for trusted-source ground bison sometimes target 63–65 °C for a medium result with a pink centre. The appropriate pull temperature depends on the intended doneness, the diners' preferences, and local food safety guidelines.

A MEATER probe inserted sideways into a patty gives reliable internal readings even for thin cuts, provided it is placed horizontally through the thickest part of the patty, keeping the tip and ambient sensor both clear of the grill grates.


## Styckesprofil

Bisonburgerbiffar är gjorda av malet bisonkött, vanligtvis från skulder, fransyska eller bakkvarter — samma primärsnitt som används för nöthamburgare. Bison är märkbart magrare än nötkött, ofta med bara 2–7 % fett beroende på malning, jämfört med 15–25 % för standard hamburgerfärs. Den lägre fetthalten innebär att bisonburgare kokar fortare och torkar ut vid lägre temperatur. Innertemperatur: 71 °C (för säkerhet). Tillagnings tid: kortare än nötkött.

## Research files by cooking method

- [Grill](./bison_burger-grill.md)
- [Pan Fry](./bison_burger-pan_fry.md)
## Quality score

**Score: -6 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Method file `bison_burger-grill.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Group A and Culinary Group C tradition(s) — add Culinary Group A and Culinary Group C source recipes to method leaf files — each tradition needs at least one recipe across the method files
3. **−1** · Method file `bison_burger-grill.md` copies parent cut profile — rewrite `bison_burger-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
