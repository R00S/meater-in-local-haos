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
- smoker
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
quality_assessed: 2026-05-31
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
- [Smoker](./trout-smoker.md)
## Quality score

**Score: 8 / 20** — assessed 2026-05-31

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not fully researched yet (`cooking_methods_researched: 0`) | −8 |
| Missing method leaf files (2 of 4 declared: grill, oven_roast) | −2 |
| Partial leaf files | — (none; pan_sear has 5 sources, smoker has 4 sources) |
| Method leaf `trout-pan_sear.md` copies parent cut profile | −1 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | — (covered: BBC Good Food UK / Chefkoch.de DE / Giallozafferano IT in pan_sear; DE/NA in smoker) |
| Missing Culinary Group C tradition | — (covered: Suzy Karadsheh Palestinian-American in pan_sear) |
| Missing Culinary Group D tradition | — (covered: Matprat.no NO in pan_sear; FI/DK in smoker) |

Group A absent — no East Asian (Japanese, Chinese, Korean, Thai, Vietnamese) trout recipe found across existing leaves. Methods survey incomplete. `trout-pan_sear.md` has a generic trout cut profile identical to the parent hub file rather than a pan_sear-specific profile.

### Improvement priorities

1. **−8** · Complete broad method-survey research for trout across culinary traditions; update `cooking_methods_researched` to `1` only when thorough.
2. **−2** · Missing method leaf files — create `trout-grill.md` and `trout-oven_roast.md`, each with 4–6 diverse source recipes.
3. **−1** · Method leaf `trout-pan_sear.md` copies parent cut profile — rewrite the cut profile section with method-specific analysis: Maillard crust on trout skin, basting with brown butter, timing for thin fillets vs. thick.
4. **−1** · Missing Culinary Group A tradition — add at least one verified East Asian trout recipe (Japanese *nijimasu*, Korean trout, Thai trout, etc.).

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
