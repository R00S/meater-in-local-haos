<!-- KCE:CUT
type: cut
slug: shrimp
name: Shrimp
name_sv: Räkor
category: fish
meat: shellfish
cut_type: Shellfish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
doneness:
- name: just_cooked
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 126
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
rest_time_min: 0
rest_time_max: 0
carryover_temp_c: 1
-->
# Shrimp — Cut Overview

## Cut profile

Shrimp (called prawns in British, Australian, and much of Asian-English usage) are the most widely consumed shellfish globally; the species most commonly used for pan frying include tiger prawns (*Penaeus monodon*), white leg shrimp (*Litopenaeus vannamei*), spot prawns (*Pandalus platyceros*), and Gulf shrimp (*Farfantepenaeus aztecus*). The edible flesh is the tail muscle, which contracts rapidly under heat and curls the tail from the characteristic C-shape of a live shrimp to a tighter O-shape when overcooked. Pan frying over high heat produces a caramelised exterior on the natural sugars in the shell or flesh, and in shell-on preparations the shell acts as a protective layer. The protein in shrimp begins to denature around 50 °C and is fully set at 60 °C; the culinary window for moist, tender shrimp is extremely narrow, typically 3–4 minutes total cook time for medium prawns in a very hot pan. Carryover is 2–3 °C.


## Styckesprofil

Räkor (kallade *prawns* i brittisk, australiensisk och stor del av asiatisk-engelsk användning) är de mest konsumerade skaldjuren globalt; de arter som vanligast används för pannstekning inkluderar tigergarnaler (*Penaeus monodon*), vitbensräkor (*Litopenaeus vannamei*), prickräkor (*Pandalus platyceros*) och gulfräkor (*Farfantepenaeus aztecus*).

Det ätliga köttet är svansmuskeln, som drar ihop sig snabbt under värme och curlar svansen från den karakteristiska C-formen hos en levande räka till en tightare O-form när de är genomkokta. Pannstekning över hög värme producerar en karameliserad yta på de naturliga sockerarterna i skalet eller köttet, och i skal-på-beredningar fungerar skalet som ett skyddslager. Proteinet i räkor börjar denaturera runt 50 °C och är fullständigt satt vid 60 °C; det kulinariska fönstret för fuktiga, möra räkor är extremt smalt — typiskt 3–4 minuter total tillagningstid för medelstora räkor i en mycket het panna. Eftertillagning: 2–3 °C. Innertemperatur: 60 °C (USDA 63 °C).

## Research files by cooking method

- [Pan Fry](./shrimp-pan_fry.md)
## Quality score

**Score: 10 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Method file `shrimp-pan_fry.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `shrimp-pan_fry.md` copies parent cut profile — rewrite `shrimp-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
