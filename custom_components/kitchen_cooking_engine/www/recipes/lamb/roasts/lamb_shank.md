<!-- KCE:CUT
type: cut
slug: lamb_shank
name: Shank
name_sv: Lammlägg
category: lamb
meat: lamb
cut_type: Ground
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: pulled
methods:
- braise
- oven_roast
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
quality_score: -5
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 5
-->
# Shank — Cut Overview

## Cut profile

Lamb shank (the lower leg, hind or fore) is one of the most prized braising cuts in the world. The dense connective tissue, bone marrow, and rich muscle fibres transform through 2–3 hours of moist heat into fall-off-the-bone, gelatinous, deeply flavoured meat. It is the flagship dish of Mediterranean cooking (Italy, Greece, Turkey, France), the Middle East (Persian mahiche), and Australia. The target is **pull-apart tender** at 82–88 °C internal — not medium-pink as with steaks. A MEATER probe is inserted into the thickest part of the shank meat (above the bone) to verify doneness.


Target internal temperature: **82–88 °C (180–190 °F)** for fall-off-the-bone tender. USDA minimum for lamb is 63 °C, but for braised shanks this is far too early — braising is not complete until collagen has dissolved.


## Styckesprofil

Lammlägg (underbenet) är ett av de mest prisbelönta braiseringsnittten globalt. Den täta bindväven och benmärgen omvandlas under 2–3 timmars fuktig värme till fall-från-benet-mört, gelatinöst kött. Det är flaggskeppsrätten i hela Medelhavsregionen, Mellanöstern och nordafrikansk matlagning.

Innertemperatur: **88–95 °C (190–203 °F)** för fall-från-benet. Eftertillagning: försumbar. Sond in i tjockaste köttmassan, borta från benet. Ugnsbraisering: 160–170 °C i täckt form 2–3 timmar med fond, vin, lök, vitlök, tomat och kryddor.

## Research files by cooking method

- [Braise](./lamb_shank-braise.md)
- [Oven Roast](./lamb_shank-oven_roast.md)
- [Slow Cooker](./lamb_shank-slow_cooker.md)
## Quality score

**Score: -5 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| Method file `lamb_shank-braise.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `lamb_shank-braise.md` copies parent cut profile — rewrite `lamb_shank-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Missing Culinary Group A tradition(s) — add Culinary Group A source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
