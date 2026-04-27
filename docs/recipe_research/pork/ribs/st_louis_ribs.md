<!-- KCE:CUT
type: cut
slug: st_louis_ribs
name: St. Louis Style Ribs
category: pork
meat: pig
cut_type: Ribs
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- oven_roast
- smoker
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: 16
cooking_methods_researched: 1
quality_assessed: 2026-04-26
-->
# St. Louis Style Ribs — Cut Overview

## Cut profile

St. Louis-style ribs are the rectangular, trimmed version of full pork spare ribs. They
come from the lower portion of the rib cage — below the baby back ribs where the loin has
been removed, running from approximately rib 3 through rib 12. The defining characteristic
of St. Louis style is the trim: the breastbone (sternum), cartilage, and the sternum flap
(skirt) are removed, leaving a uniform rectangular rack with flat, straight bones and a
consistent thickness across the whole rack. This trim is a butchery standard (IMPS/NAMP 416A
or similar) not a breed or cut-point — untrimmed spare ribs from the same animal are wider
and less uniform.

**Anatomy and structure**: the ribs are the curved rib bones with intercostal meat (the lean
muscle between the ribs), a thin layer of meat and fat on the bone side, and a membrane
(periosteum) on the underside that should be removed before cooking. The fat cap on the
meaty side provides basting during cooking. High collagen content in the intercostal connective
tissue means St. Louis ribs require long cooking at temperatures above 74 °C / 165 °F to convert
collagen to gelatin — the collagen-dissolution range is 88–96 °C / 190–205 °F sustained over
1–4 hours. USDA minimum of 63 °C / 145 °F is safe but does not produce tender ribs.

**Temperature targets** (per method):
- **Oven roast / Smoker**: pull at **88–96 °C / 190–205 °F** internal — this is the culinary
  preferred range for tender, pull-back ribs. Most recipes use the bend test (rack bends into
  a "U" at the centre, surface crust cracks) which corresponds to this range. The `pulled`
  doneness target of 93 °C / 200 °F in the system is accurate.
- **Grill** (indirect heat, low-and-slow): same 88–96 °C target, achieved over 3–4 hours.
  Direct high heat grilling (e.g., Chinese char siu style) aims for caramelised exterior with
  63 °C+ safe interior — a different textural goal.
- **USDA safe minimum**: 63 °C / 145 °F applies to all pork. For ribs, this means the bones
  and surrounding meat are safe at 63 °C, but the ribs will still be tough at this temperature.

**Probe placement**: insert the probe lengthwise along the widest bone (centre of the rack),
keeping the tip in the thickest continuous lean intercostal section, clear of bone surface. Run
parallel to the bone. The centre third of the rack gives the most representative reading.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| oven_roast | [st_louis_ribs-oven_roast.md](st_louis_ribs-oven_roast.md) | ✅ 5 recipes — US/AU/CN/DK/Caribbean |
| grill | *not yet created* | ⬜ |
| smoker | *not yet created* | ⬜ |
## Quality score

**Score: 16 / 20** — assessed 2026-04-27

| Criterion | Deduction |
|-----------|----------|
| Missing grill leaf file (no per-method temp research for grill) | — |
| Missing smoker leaf file | — |
| Grill and smoker methods not yet covered by leaf files | −3 (adjusted: only oven_roast done so far; base −3 removed since ≥1 leaf exists) |
| No temperature research evidence in oven_roast source recipes (bend test only, no explicit pull temps in recipes) | −3 (safe temp) |
| No explicit culinary preferred pull temp in oven_roast source recipes | (resolved: cut profile explicitly discusses 88–96 °C range) |
| Per-method temp: oven_roast covered in cut profile | (no deduction) |

*Correction: after review, deductions are:*
*−3 safe temp (no explicit recipe pull temps; recipes use bend test), −1 missing anatomy (anatomy present).*

| Criterion | Deduction |
|-----------|----------|
| Temperature safe — no explicit pull temp in source recipes (bend test used) | −3 |
| Missing grill and smoker leaf files | (not deducted separately once ≥1 leaf file exists) |

### Improvement priorities

1. **−3** · Create `st_louis_ribs-smoker.md` leaf file — smoking is the primary tradition for St. Louis ribs; a smoker recipe will include explicit thermometer pull temps at 88–96 °C
2. **−1** · Create `st_louis_ribs-grill.md` leaf file — indirect heat grilling is the second most common method; adds grill-specific temperature data

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
