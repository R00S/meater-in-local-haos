<!-- KCE:CUT
type: cut
slug: st_louis_ribs
name: St. Louis Style Ribs
name_sv: St. Louis-revben
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
quality_score: 9
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
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

## Styckesprofil

St. Louis-style ribs är den rektangulära, trimmade versionen av hela fläskspareribs, skurna från revbenens nedre del — under baby back ribs, från ca revben 3 till 12. De är tjockare, fetare och köttiga än baby back ribs och kräver längre tillagningstid.

Innertemperatur: **88–95 °C (190–203 °F)** för fall-från-benet. Eftertillagning: försumbar. Sond längs benets riktning in till köttmassan, borta från benet. Tillagningstid: 3–4 timmar vid 150 °C i folie, sedan 20–30 min öppen med BBQ-glasering.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Oven roast | `st_louis_ribs-oven_roast.md` | ⚠️ In progress — 2 sources (Groups A + B), needs C and D |
| Grill | *not yet created* | ⬜ |
| Smoker | *not yet created* | ⬜ |

## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Culinary Group A tradition covered (oven_roast leaf) | +1 | ✅ Done |
| Culinary Group B tradition covered (oven_roast leaf) | +1 | ✅ Done |
| Oven_roast leaf has source recipes with safe temps | +3 | ✅ Done |
| Culinary preferred temp research present | +4 | ✅ Done (low-and-slow 88–93 °C) |
| Per-method temp research present | +2 | ✅ Done — oven_roast leaf |
| Cooking methods not researched | −8 | pending |
| Missing Culinary Group C tradition | −1 | pending |
| Missing Culinary Group D tradition | −1 | pending |
| No grill leaf | − | pending |
| No smoker leaf | − | pending |

### Improvement priorities

1. **−8** · Cooking methods not researched — research grill (direct vs indirect) and smoker methods for St. Louis ribs; create leaf files; then set `cooking_methods_researched: 1`
2. **−2** · Missing Groups C and D — add Caribbean, West African, or North African oven rib source to `st_louis_ribs-oven_roast.md`; add German/Polish/Slavic oven rib source

*Score will increase toward ~14/20 once Groups C and D are covered.*
