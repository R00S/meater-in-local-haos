<!-- KCE:CUT
type: cut
slug: buffalo_steak
name: Buffalo Steak
category: game
meat: buffalo
cut_type: Buffalo
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- charcoal_grill
- grill
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
quality_score: 7
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Buffalo Steak — Cut Overview

## Cut profile

**Context note**: In this project, *buffalo* refers to **water buffalo** (*Bubalus bubalis* — carabao in the Philippines, bhaisa in India) rather than American bison (which is in the `bison/` category). Water buffalo is the most widely eaten large ruminant in Asia, with large production in India, China, Pakistan, and Southeast Asia. The lean, slightly sweeter, darker-red meat is typically treated like beef in most culinary traditions.

Grilling water buffalo steak (carabeef) is common in India, Vietnam, and the Philippines. The meat is slightly tougher than beef and benefits from marinating.


Target internal temperature: **57–63 °C (135–145 °F)** for medium-rare to medium. The meat is leaner than beef and becomes tough above 70 °C.


## Research files by cooking method

- [Grill](./buffalo_steak-grill.md)
- [Pan Sear](./buffalo_steak-pan_sear.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `buffalo_steak-charcoal_grill.md` | −1 |
| Missing Southern tradition | −1 |
| Missing Northern tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `buffalo_steak-grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `buffalo_steak-charcoal_grill.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−2** · Missing Southern and Northern tradition(s) — add Southern and Northern source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
5. **−1** · Method file `buffalo_steak-grill.md` copies parent cut profile — rewrite `buffalo_steak-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
