<!-- KCE:CUT
type: cut
slug: liver_pork
name: Liver
category: pork
meat: pig
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- pan_fry
- pan_sear
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
quality_assessed: 2026-04-27
-->
# Liver — Cut Overview

## Cut profile

Pork liver is a large, smooth, mahogany-brown organ weighing 1–1.5 kg as a whole lobe, most commonly sold pre-sliced into 6–12 mm portions. It is milder and less intensely mineral than beef liver, with a finer-grained hepatocyte structure and a thinner outer capsule. Because it contains virtually no connective tissue, it responds entirely to direct dry heat: the goal is a rapid sear on both sides to develop a deeply browned Maillard crust while leaving the centre pink and just-safe at 60–71 °C / 140–160 °F.

**Anatomy and structure**: pork liver is a single-lobe organ, uniform in texture when sliced, with no intramuscular fat or collagen bands to break down. There is nothing to slow-cook — the only textural objective is hard surface browning while the interior stays soft and pink. Overcooking beyond 75 °C produces a dry, grainy, strongly mineral-tasting result with a sharply unpleasant aroma.

**Temperature target**: culinary standard across French, Italian and Scandinavian traditions is 60–65 °C / 140–149 °F (pink centre). USDA compliance requires 71 °C / 160 °F. Carryover in thin slices is only 1–2 °C; pull early. The `well_done` doneness target in the frontmatter (71 °C / 160 °F, target_c) satisfies the USDA standard. In practice most European recipes target 60–65 °C ("rose-pink").

**Probe placement**: insert horizontally into the centre of the thickest slice in the pan, tip at the geometric centre of the slice. There are no bones to avoid. Avoid placing the probe in a very thin or edge slice — it will overcook before the thick centre reaches target temperature.

**Relationship to `pork_liver` entry**: both this slug (`liver_pork`) and the `pork_liver` slug represent the same anatomical cut. The `pork_liver` slug has additional method leaf files (`pork_liver-pan_fry.md`, `pork_liver-pan_sear.md`) with further source recipes.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Pan Fry | `liver_pork-pan_fry.md` | ⚠️ In progress — 2 sources (Groups B + D); needs Groups A + C |
| Pan Sear | *not yet created* | ⬜ (see `pork_liver-pan_sear.md` for cross-reference sources) |

## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Culinary Group B tradition covered (pan_fry leaf) | +1 | ✅ Done (Hazan, Group B) |
| Pan fry leaf has source recipes with safe temps | +3 | ✅ Done (60–63 °C pull) |
| Culinary preferred temp research present | +4 | ✅ Done (pan_fry leaf) |
| Per-method temp research present | +2 | ✅ Done — pan_fry leaf |
| Cooking methods not researched | −8 | pending — set to 1 once pan_sear also researched |
| Missing Culinary Group A tradition | −1 | pending |
| Missing Culinary Group C tradition | −1 | pending |

### Improvement priorities

1. **−8** · Cooking methods not researched — add Group A (Chinese stir-fried pork liver) and Group C (Lebanese/Moroccan sautéed liver) to `liver_pork-pan_fry.md`; then create `liver_pork-pan_sear.md`; then set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Groups A and C — add source recipes from Asian (thewoksoflife.com — stir-fried pork liver) and C (marocmama.com or cheftariq.com — North African or Arabic preparation)

*Score will increase toward ~14/20 once Groups A and C sources are added to the pan_fry leaf.*
