<!-- KCE:CUT
type: cut
slug: halibut_fillet
name: Halibut Fillet
name_sv: Hälleflundrafilé
name_da: Helleflynderfilet
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- oven_roast
- pan_sear
- steam
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
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
improvement_potential: unrated
cooking_methods_researched: 1 # 2026-10-24: survey completed and recorded below; grill, oven_roast, pan_sear and steam all have leaves built on fetched sources. Remaining enum methods recorded as leads, not silently dropped.
quality_assessed: 2026-10-24
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 3
-->
# Halibut Fillet — Cut Overview

## Cut profile

Pacific halibut (*Hippoglossus stenolepis*) and Atlantic halibut (*Hippoglossus hippoglossus*) are the largest flatfish; the fillet — cut from the meaty upper or lower side of the fish — is thick, firm, brilliant white, and lean with large, tight muscle flakes. The flesh has little connective tissue relative to its density, which gives a satisfying firm bite when properly cooked but transitions quickly to a dry, chalky texture above 60 °C. Pan searing is one of the most technically demanding preparations for halibut because the thick, lean flesh must be cooked through to approximately 58–62 °C without surface scorching; a common technique is to sear in a screaming-hot pan to set the crust, then finish in a moderate oven or with basting, treating it more like a thick beef steak than most fish. Carryover is significant — 4–5 °C for a thick fillet — so pulling early is essential.

## Styckesprofil

Hellefisk (*Hippoglossus stenolepis*, Stillahavshellefisk; *Hippoglossus hippoglossus*, Atlantisk hellefisk) är de största flatfiskarna; fileten — skärd från de köttstarka övre eller undre sidorna av fisken — är tjock, fast, klart vit och mager med stora, täta muskelknippen. Det är ett av de absolut renaste, mest delikata vitköttade fiskarterna. Pannsearing ger bäst resultat: het panna, smör, 3–4 minuter per sida. Innertemperatur: 58–60 °C.

## Research files by cooking method

- [Pan Sear](./halibut_fillet-pan_sear.md) — six fetched sources (US ×3, Indian/UK, Chinese-American, Spanish-language US brand); two state 130–135 °F, one 145 °F.
- [Grill](./halibut_fillet-grill.md) — five fetched sources (Moroccan-style, Thai, Korean, Cambodian, Jamaican-jerk); no temperatures published.
- [Oven Roast](./halibut_fillet-oven_roast.md) — six fetched sources (Asian-style, French-style, Indian, US ×2, Moroccan-style tagine); no temperatures published.
- [Steam](./halibut_fillet-steam.md) — four fetched sources (Cantonese, Chinese-Malaysian, Thai, US-Asian-inspired); no temperatures published.

All four declared methods have a leaf and all four meet the 4–6-source collection gate. Only the pan-sear and the Momsdish recipe inside it publish an internal temperature; the other three leaves are time-and-cue only.

## Method inventory — 2026-10-24 (completed survey)

| Enum method | Disposition |
|---|---|
| pan_sear | leaf, six fetched recipes |
| grill | leaf, five fetched recipes |
| oven_roast | leaf, six fetched recipes |
| steam | leaf, four fetched recipes |
| poach, simmer, braise, saute, sous_vide, air_fryer, pressure_cooker, slow_cooker, boil, oven_bake, oven_broil, smoker | no species-specific halibut recipe fetched this session; recorded as an unexhausted negative search, not as absence of the method |
| curing / gravlax / smoked-and-cured | not enum methods; out of scope |

`cooking_data.py` was corrected in the same pass: `steam` stays registered because its leaf now exists, while `slow_cooker` and `pressure_cooker` — registered without any evidence, leaf or cut-file entry — were removed. Panel and engine now list the same four methods.

## Improvement potential

Not yet rated under the current system — read the criteria in `IMPROVEMENT_POTENTIAL_SYSTEM.md` and record a reading before using this file to order the queue.

### Improvement priorities

1. Fetch measured sources for grill, oven_roast and steam; at present only pan-searing has a published reading.
2. Culinary Group D: halibut (*hellefisk*) is fished and eaten in Norway, Iceland and Greenland; no Nordic recipe has been fetched yet.
3. Diversify publishers away from the two magazine kitchens that supply most of the current sources.
4. The 145 °F / 130–135 °F split needs a third measured tradition before any band can be preferred.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
