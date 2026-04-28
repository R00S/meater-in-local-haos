<!-- KCE:CUT
type: cut
slug: lamb_rump
name: Lamb Rump
name_sv: Lammrumstek
category: lamb
meat: lamb
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- grill
- oven_roast
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
quality_assessed: 2026-04-27
-->
# Lamb Rump — Cut Overview

## Cut profile

Lamb rump is the triangular rear-end muscle mass — primarily the biceps femoris and associated gluteal muscles — sitting above the hind leg and below the loin. Each portion weighs 150–280 g with a generous fat cap on one face that self-bastes the meat during roasting. The rump is moderately worked: more flavourful than the loin, yet still tender enough for quick-roast medium-rare cookery. Unlike shoulder or neck it does not require long, slow heat — a rapid sear followed by 4–8 minutes at 200–230 °C produces a deeply browned crust and a rosy interior.

**Anatomy and structure**: the rump is a compact, tapering muscle with grain running lengthways. The fat cap (external fat, not intramuscular) should be scored before cooking to aid rendering. Intramuscular fat is moderate — more than loin, less than shoulder — giving good flavour and juiciness at medium-rare without being excessively fatty. No bones present.

**Temperature target**: medium-rare at 52–57 °C / 125–135 °F (target 54 °C / 130 °F) is the culinary standard, confirmed explicitly by Richard Corrigan (GBC): "55–60 °C when tested with a meat thermometer." USDA minimum is 63 °C / 145 °F for whole cuts; most culinary preparations finish below this. Resting is essential — 6–10 minutes for a 180–250 g portion.

**Probe placement**: insert from the tapered end of the rump portion, pushing the tip to the geometric centre of the thickest part. Run the probe parallel to the muscle grain, not into the fat cap. If multiple rumps are in the pan, probe the largest.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Oven Roast | `lamb_rump-oven_roast.md` | ⚠️ In progress — 3 Group B sources (Corrigan, Kitchin, Koffmann); needs Groups A, C, D |
| Grill | *not yet created* | ⬜ |
| Pan Sear | *not yet created* | ⬜ |

## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Culinary Group B tradition covered (oven_roast leaf) | +1 | ✅ Done (Corrigan, Kitchin, Koffmann) |
| Oven roast leaf has source recipes with safe temps | +3 | ✅ Done (55–60 °C explicit pull from Corrigan) |
| Culinary preferred temp research present | +4 | ✅ Done (oven_roast leaf) |
| Per-method temp research present | +2 | ✅ Done — oven_roast leaf |
| Cooking methods not researched | −8 | pending — grill and pan_sear still unresearched |
| Missing Culinary Group A tradition | −1 | pending |
| Missing Culinary Group C tradition | −1 | pending |
| Missing Culinary Group D tradition | −1 | pending |

### Improvement priorities

1. **−8** · Cooking methods not researched — research grill method and pan_sear method; add leaf files; then set `cooking_methods_researched: 1`
2. **−3** · Missing Culinary Groups A, C, D — add source recipes from Group A (Korean spiced lamb rump), Group C (Moroccan harissa lamb rump), Group D (Scandinavian juniper lamb rump) to existing or new leaf files

*Score will increase toward ~14/20 once Groups A, C, and D sources are added to the oven_roast leaf.*
