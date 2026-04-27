<!-- KCE:CUT
type: cut
slug: pork_jowl
name: Pork Jowl / Guanciale
category: pork
meat: pig
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
- oven_roast
- pan_fry
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: 1
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-27
-->
# Pork Jowl / Guanciale — Cut Overview

## Cut profile

Pork jowl is the cheek and jaw area of the pig, encompassing both the buccinator (the same muscle as `cheek`/`pork_cheek`) and the surrounding subcutaneous fat and skin. It is most commonly prepared in one of two ways: (1) **cured as guanciale** — salt-cured and dried for 3–4 weeks, the classic Italian cured-meat preparation used in pasta all'amatriciana and carbonara; or (2) **braised or slow-cooked fresh** — the uncured jowl, which is almost entirely composed of fat and skin with some intercostal muscle, makes an extraordinarily rich braise or oven-roast when cooked to 88–96 °C / 190–205 °F.

**Anatomy and structure**: the jowl is loosely defined in different butchery traditions. In American BBQ, "pork jowl" typically refers to the entire facial fat plate — a large, flat, heavily fatty slab (400–800 g) used for smoking or braising. In Italian tradition, guanciale is a smaller cured lobe. In Korean and Chinese cooking, pork jowl (항정살 / 猪颈肉) refers specifically to the neck-jowl muscle, a more lean, firm muscle grilled at high heat. The fat-to-lean ratio in uncured fresh jowl is very high compared to belly.

**Temperature target (braised/slow-cooked)**: the `pulled` doneness target (88–96 °C, target 93 °C) is correct. At this temperature the collagen has fully converted to gelatin and the subcutaneous fat has rendered, producing the characteristic silky-unctuous texture. Below 82 °C the fat remains waxy and the skin does not soften.

**Temperature target (grilled — Korean style)**: when the neck-jowl muscle is grilled as individual portions, the target is well-done at 71 °C / 160 °F as the USDA requires for pork.

**Probe placement (braise)**: insert from one end of the jowl, tip at the geometric centre of the thickest meat (not into a fat pocket). In a braise vessel with multiple pieces, insert into the largest. For flat BBQ-style slabs, insert horizontally from the side.

## Research files by cooking method

*No research files yet.*

## Quality score

**Score: 1 / 20** — assessed 2026-04-27

| Criterion | Points | Status |
|-----------|--------|--------|
| Cut profile written (not a placeholder) | +1 | ✅ Done |
| Cooking methods not researched | −8 | pending |
| Missing Culinary Group A tradition | −1 | pending |
| Missing Culinary Group B tradition | −1 | pending |
| Missing Culinary Group C tradition | −1 | pending |
| Missing Culinary Group D tradition | −1 | pending |
| No method leaf files | −3 | pending |
| No temperature research (safe temps) | −3 | pending |
| No temperature research (culinary preferred) | −4 | pending |
| No per-method temp research | −2 | pending |

### Improvement priorities

1. **−8** · Cooking methods not researched — research braise (fresh jowl) and grill (Korean neck-jowl) methods; create leaf files; then set `cooking_methods_researched: 1`
2. **−4** · Missing all four traditions — prioritise Group A (Korean 항정살구이 jowl grill), Group B (Italian guanciale braise or British braised jowl), Group C (Chinese hong shao zhu jowl braise), Group D (Polish or Scandinavian braised jowl)
3. **Sources to check**: greatbritishchefs.com (search "pork jowl"), koreanbapsang.com (항정살), thewoksoflife.com (red-braised pork face/jowl), cookinpolish.com

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
