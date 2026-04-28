<!-- KCE:CUT
type: cut
slug: cheek
name: Cheek
category: pork
meat: pig
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
- slow_cooker
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Cheek — Cut Overview

## Cut profile

Pork cheek (also catalogued as `pork_cheek` in this system) is the small, intensely worked jaw muscle of the pig — roughly 80–120 g per cheek — made up of densely packed, collagen-rich muscle fibres with thin sheets of intramuscular fat distributed throughout. Because the jaw is in nearly constant motion throughout the pig's life, the cheek develops an exceptional density of connective tissue relative to its size. This makes it wholly unsuitable for quick dry-heat methods but ideal for long, moist-heat preparations (braising, slow cooker) that break down the collagen into gelatin, producing an extraordinarily silky, self-basting, meltingly tender result.

**Anatomy and structure**: each cheek is a singular, ovoid muscle mass with little variation in thickness. It may be sold whole, trimmed of its outer silver-skin (periosteum), or butterflied. The fat marbling is fine-grained and relatively uniform. The absence of large fat pockets or intermuscular fat separations makes the cheek cook evenly in a braise — unlike belly or shoulder, every part of a cheek reaches the pull temperature at the same time.

**Temperature target**: braised pork cheek reaches optimal texture at 88–96 °C / 190–205 °F internal, when collagen has fully hydrolysed to gelatin. USDA minimum is 71 °C / 160 °F (internal for whole cuts). In practice no braised pork cheek preparation targets the USDA minimum — the low-collagen result at 71 °C would still be firm and fibrous. The `pulled` doneness target (88–96 °C, target 93 °C) is correct.

**Probe placement**: insert from the thickest end of the cheek, pushing the tip to the geometric centre of the muscle. The probe should run parallel to the length of the cheek. There are no bones to avoid. If cheeks are placed in a braise vessel, insert the probe horizontally into the largest cheek in the pan, keeping the probe cable clear of the liquid surface.

**Relationship to `pork_cheek` entry**: both this slug (`cheek`) and the `pork_cheek` slug represent the same anatomical cut. `pork_cheek` has a broader `methods:` list (braise, oven_roast, pan_fry, slow_cooker) and its own leaf files. The research here is independently useful; additional recipe sources are cross-referenced in `pork_cheek-braise.md`.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Braise | `cheek-braise.md` | ⚠️ In progress — 1 Group B source, needs A/C/D |
| Slow cooker | *not yet created* | ⬜ |

## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Culinary Group B tradition covered (braise leaf) | +1 | ✅ Done |
| Braise leaf has source recipes with safe temps | +3 | ✅ Done |
| Culinary preferred temp research present | +4 | ✅ Done |
| Per-method temp research present | +2 | ✅ Done — braise leaf |
| Cooking methods not researched | −8 | pending |
| Missing Culinary Group A tradition | −1 | pending |
| Missing Culinary Group C tradition | −1 | pending |
| Missing Culinary Group D tradition | −1 | pending |

### Improvement priorities

1. **−8** · Cooking methods not researched — research slow_cooker method for pork cheek; add leaf file; then set `cooking_methods_researched: 1`
2. **−3** · Missing Groups A, C, D — add source recipes from Asian (e.g. Chinese red-braised pork cheek), C (e.g. Moroccan-spiced braised cheek), D (e.g. Scandinavian slow-braised cheek)

*Score will increase toward ~14/20 once Groups A, C, and D sources are added.*
