<!-- KCE:CUT
type: cut
slug: buffalo_steak
name: Buffalo Steak
name_sv: Buffelbiff
category: game
meat: buffalo
cut_type: Buffalo
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- charcoal_grill
- grill
- pan_sear
doneness:
- name: rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
- name: medium_rare
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: medium
  target_c: 60
  target_f: 140
  min_c: 57
  min_f: 135
  max_c: 63
  max_f: 145
  usda_safe: false
- name: medium_well
  target_c: 66
  target_f: 150
  min_c: 63
  min_f: 145
  max_c: 68
  max_f: 155
  usda_safe: true
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Buffalo Steak — Cut Overview

## Cut profile

> **Context note**: In this project, *buffalo* refers to **water buffalo** (*Bubalus bubalis* — carabao in the Philippines, bhaisa in India) rather than American bison (which is in the `bison/` category). Water buffalo is the most widely eaten large ruminant in Asia, with very large production in India, China, Pakistan, the Philippines, Vietnam, and Indonesia. It is also consumed in parts of Africa and South America.

Water buffalo steak is cut from the same primal positions as beef (loin, rib, rump) — the *longissimus dorsi*, *biceps femoris*, and *psoas major* are the main steak muscles. The meat is similar in structure to lean beef: deep red, slightly sweeter than standard bovine beef, with lower intramuscular fat. Because it is leaner than grain-fed beef, it cooks faster and becomes tough above 70 °C. Medium-rare to medium (57–63 °C) is the recommended range across all culinary traditions using this cut.


## Styckesprofil

> **Kontextanmärkning**: I detta projekt avser *buffalo* **vattenbuffel** (*Bubalus bubalis* — carabao på Filippinerna, bhaisa i Indien) snarare än amerikansk bison. Vattenbuffel är det mest ätna stora idisslaren i Asien med mycket stor produktion i Indien, Kina, Pakistan, Filippinerna och Vietnam.

Köttet (*carabeef*) är magert, mörkrött och fast, med en smak liknande magert nötkött men något sötare och med lägre fettinnehåll. Det används i alla kulinariska tillämpningar som nötkött — bräsering, ugnsstekning, grillning, pannstekning — men kräver kortare tillagningstider på grund av magreten. Innertemperatur: **60–65 °C** (medium till genomstekt). Eftertillagning: 3–4 °C.

## Research files by cooking method

- [Grill](./buffalo_steak-grill.md)
- [Pan Sear](./buffalo_steak-pan_sear.md)
## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Status |
|-----------|--------|
| Cooking methods not researched | − **NOT DONE** (−8) |
| Cut profile anatomy | ✓ (fixed 2026-04-27) |
| Grill cut profile method-specific | ✓ (fixed 2026-04-27) |
| Charcoal grill leaf missing | − missing (−1) |
| Culinary Group C covered | − missing (−1) |
| Culinary Group D covered | − missing (−1) |
| Culinary Groups A, B | ✓ |

**Deductions**: −8 methods · −1 missing charcoal grill leaf · −1 Group C · −1 Group D = −11 → 20−11 = **9**

### Improvement priorities

1. **−8** · Cooking methods not researched
2. **−1** · Missing `buffalo_steak-charcoal_grill.md`
3. **−1** · Group C tradition missing
4. **−1** · Group D tradition missing

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
