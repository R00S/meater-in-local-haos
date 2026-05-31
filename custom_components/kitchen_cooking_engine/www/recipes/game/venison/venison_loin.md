<!-- KCE:CUT
type: cut
slug: venison_loin
name: Venison Loin
name_sv: Hjortfilé
category: game
meat: venison
cut_type: Venison
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- oven_roast
- pan_sear
- sous_vide
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
quality_score: -6
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-28
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 4
-->
# Venison Loin — Cut Overview

## Cut profile

Venison loin (also: backstrap, saddle, or haunch steak — depending on country) from roe deer (*Capreolus capreolus*) or red deer (*Cervus elaphus*) is the premium lean cut from the back muscle running alongside the spine. The meat is very lean, deep red-brown, and has a rich, gamey flavour prized throughout European and South Asian cooking. It has negligible fat or connective tissue, which means it cooks quickly and must be pulled early (medium-rare to medium) to avoid drying out. It is structurally comparable to beef tenderloin but with a more pronounced flavour.

Pan-searing 2–3 minutes per side over high heat is the most common technique. Oven-roasting (sear + finish in oven) is used for whole loins and for larger restaurant presentations. Sous vide at 54–57 °C gives excellent control for the medium-rare target. The USDA safe temperature is 63 °C (145 °F); most culinary sources recommend serving below this for optimal texture.

Temperature guide (from Köket.se, Sweden — accessed 2026-04-27):
- Rådjur/hjort ytterfilé & filé: rare 52 °C, medium 57 °C, well done 65 °C
- Stekdetaljer: 55/62/68 °C


## Styckesprofil

Viltrygghbiff (ryggsträng, sadel eller haunche-stek) från rådjur eller kronhjort är det magra snittet från ryggsmuskulaturen längs ryggraden. Köttet är mycket magert, djupt rödbrunt och har en rik viltartig smak uppskattad i hela europeisk matlagning.

Pannstekning vid hög värme är den viktigaste metoden: 3–4 minuter per sida ger en karameliserad yta med ett rosa inre. Sond insatt från sidan in till mitten. Innertemperatur: **57–63 °C (135–145 °F)** för medium-rare till medium. Välgenomstekt avråds starkt. Eftertillagning: 3–4 °C.

## Research files by cooking method

- [Pan Sear](./venison_loin-pan_sear.md) — 4 sources: Group B (2× British, 1× German), in-progress (Groups A/C/D missing)
- [Oven Roast](./venison_loin-oven_roast.md) — 🔄 in progress (2 sources: Group B British, Group A Indian)

## Quality score

**Score: -6 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| sous_vide leaf missing | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — pan_sear and oven_roast are confirmed methods. sous_vide is declared but not yet verified via source research. Conduct a proper survey of all methods used for this cut and set `cooking_methods_researched: 1` only after that is done.
2. **−1** · sous_vide leaf missing — `venison_loin-sous_vide.md` not yet created; requires 4–6 diverse source recipes with method-specific cut profile and temperature data
3. **−1** · Missing Culinary Group C tradition — no Group C sources in any leaf; venison loin is uncommon in African/Middle Eastern/Caribbean cuisine; extensive search conducted
4. **−1** · Missing Culinary Group D tradition — no Group D sources in any leaf; Swedish temperature data cited in cut profile but no full recipe from a Group D source found yet

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
