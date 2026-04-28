<!-- KCE:CUT
type: cut
slug: lamb_rib
name: Lamb Rib
name_sv: Lammrev
category: lamb
meat: lamb
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- oven_roast
- grill
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
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 3
-->
# Lamb Rib — Cut Overview

## Cut profile

Lamb rib covers two related but culinarily distinct cuts: (1) **rack of lamb** — the French-trimmed rib section (ribs 6–13, eye of rib = longissimus dorsi), sold whole (6–8 bones, 750–900 g) or as individual rib chops (lollipops, 80–120 g each); and (2) **lamb spare ribs / breast** — the lower, fattier rib section which behaves more like pork ribs and requires a long slow cook.

**Anatomy (rack-style)**: the rack is a curved slab of rib bones with a compact, tender eye muscle and a fat cap on the outer face. When frenched (French-trimmed), the rib bones are scraped clean for presentation. The eye-of-rib muscle has low connective tissue content and very little internal fat banding — it is genuinely tender and should be cooked fast to medium-rare, exactly like a prime rib-eye steak.

**Anatomy (spare rib / breast)**: the breast ribs are flatter, wider bones with more fat and collagen-rich intercostal meat. These require 1–2 hours at low heat (175–180 °C sealed in foil or braised) to become fall-off-the-bone tender at ≥ 77 °C / 170 °F.

**Temperature target (rack-style)**: medium-rare at 52–57 °C / 125–135 °F (target 54 °C / 130 °F). Carryover in a full rack is 2–3 °C; pull early. Dominic Chapman (GBC): medium-rare finish for a full rack at 180 °C in 10 minutes after pan-searing.

**Temperature target (spare ribs)**: fall-off-bone tender at 77–82 °C / 170–180 °F. The Mediterranean Dish: "quite tender" at 175 °C sealed in foil for 1.5 hours.

**Probe placement (rack)**: insert from one end of the rack into the eye-of-rib, parallel to the rib bones, tip at the geometric centre of the eye. Do not insert into the fat cap or through a bone — both give misleading readings. For individual chops, insert from the side of the chop.

## Styckesprofil

Lammrev täcker två relaterade men kulinariskt distinkt snitt: (1) **rack of lamb** — frenserade rev-sektionen (revben 6–13, ögon av revben = *longissimus dorsi*), såld hel (6–8 ben, 750–900 g) eller som individuella kotletter (80–120 g vardera); och (2) **lammspjäll / bröst** — den nedre, fetare rev-sektionen med mer bindväv.

Rack: **57–63 °C** för medium-rare; bröst: **88–95 °C** för fall-från-benet. Sond i loin-muskeln borta från benet. Eftertillagning: 3–4 °C (rack); försumbar (bröst). Vila rack täckt 5–8 minuter före skärning.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Oven Roast | `lamb_rib-oven_roast.md` | ⚠️ In progress — 2 sources (Group B + C); needs Groups A + D |
| Grill | *not yet created* | ⬜ |

## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Culinary Group B tradition covered (oven_roast leaf) | +1 | ✅ Done (Chapman, GBC) |
| Oven roast leaf has source recipes with safe temps | +3 | ✅ Done (52–55 °C pull from Chapman) |
| Culinary preferred temp research present | +4 | ✅ Done (oven_roast leaf) |
| Per-method temp research present | +2 | ✅ Done — oven_roast leaf |
| Cooking methods not researched | −8 | pending — grill unresearched |
| Missing Culinary Group A tradition | −1 | pending |
| Missing Culinary Group D tradition | −1 | pending |

### Improvement priorities

1. **−8** · Cooking methods not researched — research grill method (rack of lamb on grill / BBQ); add `lamb_rib-grill.md`; then set `cooking_methods_researched: 1`
2. **−2** · Missing Culinary Groups A and D — add Group A (Korean/Japanese rack of lamb) and Group D (Scandinavian lammkarre) sources to `lamb_rib-oven_roast.md`

*Score will increase toward ~14/20 once Groups A and D sources are added and the grill leaf is created.*
