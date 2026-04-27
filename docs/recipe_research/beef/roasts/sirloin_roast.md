<!-- KCE:CUT
type: cut
slug: sirloin_roast
name: Sirloin Roast
category: beef
meat: cow
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- oven_roast
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
cooking_methods_researched: 1
quality_assessed: 2026-04-27
-->
# Sirloin Roast — Cut Overview

## Cut profile

The sirloin roast (top sirloin roast in North American butchery, *contrefilet rôti* in French, *rôti de boeuf* from the sirloin section) is a boneless or bone-in joint from the short loin or top sirloin — the posterior section of the loin, behind the rib and forward of the round. Weight range: typically 1–2.5 kg for a whole joint; larger restaurant-quantity cuts extend to 4–5 kg.

**Anatomy**: The joint consists primarily of the top sirloin cap muscle (gluteus medius) with the fat cap on the dorsal face. It is significantly leaner than rib roast: intramuscular fat is moderate rather than heavy, and connective tissue content is modest. This is not a collagen-rich cut — braising to collagen-dissolving temperatures (88+ °C) would overcook and dry out the lean fibres. The dominant culinary method worldwide is oven roasting to medium-rare (50–57 °C).

**Cooking behaviour**: The lean muscle fibres tighten quickly above 60 °C; the fat cap renders and bastes the exterior during roasting when the joint is positioned fat-side up. Carryover is 4–8 °C on the standard high-low method (initial sear + moderate oven), and near zero on ultra-low temperature methods (70–80 °C oven for several hours). See `sirloin_roast-oven_roast.md` for the full temperature consensus table.

**Probe placement**: Insert from the end of the joint into the geometric centre of the lean muscle, avoiding the fat cap (fat is a poor thermal conductor and gives falsely low readings) and keeping at least 1.5 cm from any bone if present.

**Methods researched**: Oven roasting is the primary confirmed culinary method across European, North American, and Scandinavian traditions. No whole-joint braise tradition specific to the sirloin cut was found (the Woks of Life *Asian Pot Roast* uses chuck roast, a different cut). No Group A oven-roast source was found on the verified site list.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| oven_roast | [sirloin_roast-oven_roast.md](sirloin_roast-oven_roast.md) | ✅ 4 recipes — Groups B, C, D; Group A gap noted |

## Quality score

**Score: 9 / 20** — assessed 2026-04-27

| Criterion | Deduction |
|-----------|----------|
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group A (oven_roast leaf) | (covered by above) |

### Notes

- `cooking_methods_researched: 1` — oven_roast confirmed as the primary method; no verified whole-joint braise or other method for this specific cut found
- 4 source recipes with explicit pull temperatures across Groups B, C, D
- Group A gap: oven-roasting a whole sirloin joint is not a documented tradition in confirmed reachable South/East/SE Asian sources; gap noted in leaf file

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
