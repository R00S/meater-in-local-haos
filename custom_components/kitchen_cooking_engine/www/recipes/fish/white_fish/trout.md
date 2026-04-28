<!-- KCE:CUT
type: cut
slug: trout
name: Trout Fillet
name_sv: Forell
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium
methods:
- grill
- oven_roast
- pan_sear
doneness:
- name: medium_rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 2
-->
# Trout Fillet — Cut Overview

## Cut profile

Rainbow trout (*Oncorhynchus mykiss*) and brown trout (*Salmo trutta*, Swedish: forell,
Norwegian: ørret, German: Forelle, Italian: trota) are among the most widely cooked fresh-
water fish in Northern Europe and North America. The flesh is delicate, flaky, and mildly
flavoured with a slightly nutty quality; colour ranges from white to orange-pink depending
on diet. Trout fillets are typically thin (1–2 cm), which means they cook very quickly in a
pan — 3–5 minutes per side at medium-high heat. The skin crisps beautifully in butter or
olive oil. The key risk is overcooking: lean, thin trout flesh dries out rapidly past 65 °C.
Internal doneness is the same as for other finfish: 60–63 °C (140–145 °F, USDA minimum)
for fully cooked flesh that is just opaque. The MEATER probe must be inserted from the
thickest edge (lateral insertion) in thin fillets, or through the shoulder of a whole fish.


## Styckesprofil

Regnbågsforell (*Oncorhynchus mykiss*) och brun öring (*Salmo trutta*, svenska: forell, norska: ørret, tyska: Forelle, italienska: trota) är bland de mest kokta sötvattensfiskarna i norra Europa och Nordamerika. Köttet är delikat, med ett milt sötvattensmak och en rosa till vit kötttjäll. Pannsearing av forell — hela fisken eller filé med skinn — ger knaprig yta och saftig insida. Skinnsidan ned i het smörpanna i 3–4 minuter; vänd för 2 minuter. Innertemperatur: 58–62 °C.

## Research files by cooking method

- [Pan Sear](./trout-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Culinary Group A tradition | −1 |
| Method file `trout-pan_sear.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `trout-grill.md`, `trout-oven_roast.md`
3. **−1** · Method file `trout-pan_sear.md` copies parent cut profile — rewrite `trout-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
