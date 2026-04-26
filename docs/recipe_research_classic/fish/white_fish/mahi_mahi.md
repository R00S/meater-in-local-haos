<!-- KCE:CUT
type: cut
slug: mahi_mahi
name: Mahi-Mahi
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- air_fryer
- grill
- pan_sear
doneness:
- name: medium
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
quality_score: 7
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Mahi-Mahi — Cut Overview

## Cut profile

Mahi-mahi (*Coryphaena hippurus*), also called dolphinfish or dorado, is a large tropical and subtropical pelagic fish; the fillet is firm, moist, and moderately lean with a sweet, mild flavour and a distinctive large-flake texture. The skin is tough and not typically eaten — most preparations use skinless fillets. Mahi-mahi is popular across the Caribbean, Hawaiian, and American Gulf Coast cuisines, and is widely available as a sustainable fish choice. Pan searing produces a beautifully golden crust on the firm flesh; the natural moisture and slight fat content prevent drying out at moderate pull temperatures. The flesh transitions from moist-and-flaky to dry and stringy above 65 °C, so pulling at 60–62 °C is the target. Carryover is 3–4 °C.


## Research files by cooking method

- [Pan Sear](./mahi_mahi-pan_sear.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf files (2 of 3 declared) | −2 |
| Missing Northern tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Method file `mahi_mahi-pan_sear.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−2** · Missing method leaf files — create the following 2 missing files, each with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources: `mahi_mahi-air_fryer.md`, `mahi_mahi-grill.md`
3. **−1** · Cut profile lacks anatomy — expand the cut profile with anatomical details: where on the animal, which muscle/structure, why it matters for cooking
4. **−1** · Method file `mahi_mahi-pan_sear.md` copies parent cut profile — rewrite `mahi_mahi-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Northern tradition(s) — add Northern source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
