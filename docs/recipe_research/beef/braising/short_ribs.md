<!-- KCE:CUT
type: cut
slug: short_ribs
name: Short Ribs
category: beef
meat: cow
cut_type: Braising Cuts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- braise
- oven_roast
- slow_cooker
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
quality_score: 8
cooking_methods_researched: 1
quality_assessed: 2026-04-27
-->
# Short Ribs — Cut Overview

## Cut profile

Short ribs are cut from the lower portion of the beef rib cage — either the chuck short ribs (ribs 1–5, with thicker meat and more marbling) or the plate short ribs (ribs 6–10, the longer, meatier "dino rib" cut favoured in American barbecue). The meat consists of the intercostal muscles and the serratus ventralis, muscles that are among the most heavily worked in the animal: constant movement builds dense, collagen-rich fibre bundles that would be inedibly tough cooked quickly. That same density of connective tissue is the source of their culinary value — after sustained low-and-slow cooking the collagen dissolves into gelatin, the intramuscular fat renders, and the result is a self-basting, pull-apart texture with extraordinary depth of flavour.

The bone runs along the underside of each rib section; in the English cut (bone-in cross-cut pieces), the bone and surrounding marrow are visible in cross-section. English-cut short ribs are the standard braising and slow-cooker format. Flanken-cut short ribs slice across multiple bones into thin strips — the Korean galbi format — and are suited to quick grilling rather than long braising. Boneless short ribs are sometimes sold as "beef spare ribs"; they cook similarly to bone-in but finish slightly faster because the bone acts as a heat buffer.

Korean short rib preparations (galbi-jjim for braising, galbi for grilling) treat the cut as a secondary category in `cooking_data.py` under the name `short_ribs` with method `grill`. The temperatures and methods differ substantially from the Western braising tradition: bone-in short ribs for galbi are sliced thinly across the ribs and marinated overnight in a soy-pear-sesame brine before grilling to medium-rare, which corresponds to a different doneness target than the braised pulled preparation.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Braise | `short_ribs-braise.md` | ✅ Complete — 5 recipes, CONFORMS TO TOR |
| Oven roast | `short_ribs-oven_roast.md` | ⬜ Not yet created |
| Slow cooker | `short_ribs-slow_cooker.md` | ⬜ Not yet created |
| Smoker | `short_ribs-smoker.md` | ⬜ Not yet created |

## Quality score

**Score: 8 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Braise method researched (1 of 4 methods) | +2 | ✅ Done |
| Braise leaf has 5 diverse source recipes | +3 | ✅ Done |
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Culinary Group B tradition covered (braise leaf) | +1 | ✅ Done |
| Asian tradition covered (braise leaf) | +1 | ✅ Done |
| Oven roast not yet researched | −0 | pending |
| Slow cooker not yet researched | −0 | pending |
| Smoker not yet researched | −0 | pending |

### Improvement priorities

1. **High** · Create `short_ribs-oven_roast.md` — 4–6 source recipes from diverse traditions covering dry-roasting short ribs (e.g. Korean kalbi-jjim oven variant, American Sunday roast style, German *Rinderbraten* approach)
2. **High** · Create `short_ribs-slow_cooker.md` — 4–6 source recipes from slow cooker traditions
3. **Medium** · Create `short_ribs-smoker.md` — 4–6 BBQ/smoke traditions (Texas, Kansas City, Korean)

*Score will increase to ~16/20 once the three remaining method leaves are complete.*

