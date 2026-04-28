<!-- KCE:CUT
type: cut
slug: goat_chop
name: Goat Chop
name_sv: Getkotlett
category: game
meat: goat
cut_type: Goat
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- pan_sear
doneness:
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Goat Chop — Cut Overview

## Cut profile

Goat loin chops (*côtelettes de chèvre*; Indian *bakri ki champ*; Arabic *karrī lahm al-maāz*) come from the loin section between the last rib and the hip — the same anatomical position as a lamb loin chop. They are T-bone-shaped (bone-in) or boneless, 2–3 cm thick, with the *longissimus dorsi* muscle on one side and the *psoas minor* on the other. Goat meat is leaner than lamb at comparable age — lower fat marbling, lighter pink-red colour, and a slightly stronger, more aromatic flavour from the higher proportion of capric and caprylic fatty acids. Fat content in the loin is typically 3–5%. Unlike lamb, goat loin is at its best at medium to well-done (68–74 °C) because the leaner muscle dries less noticeably at higher temperatures than the fattier lamb equivalent.


Target internal temperature: **70–74 °C (158–165 °F)**.


## Research files by cooking method

- [Grill](./goat_chop-grill.md)
- [Pan Sear](./goat_chop-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Method file `goat_chop-grill.md` copies parent cut profile | −1 |
| Method file `goat_chop-pan_sear.md` copies parent cut profile | −1 |
| Method file `goat_chop-grill.md` copies `goat_chop-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `goat_chop-grill.md` copies `goat_chop-pan_sear.md` — rewrite `goat_chop-grill.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose
3. **−1** · Method file `goat_chop-grill.md` copies parent cut profile — rewrite `goat_chop-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `goat_chop-pan_sear.md` copies parent cut profile — rewrite `goat_chop-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
