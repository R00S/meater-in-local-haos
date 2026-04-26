<!-- KCE:CUT
type: cut
slug: pork_sausage
name: Pork Sausage
category: pork
meat: pig
cut_type: Ground
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- grill
- pan_fry
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 15
quality_assessed: 2026-04-26
-->
# Pork Sausage — Cut Overview

## Cut profile

Pork sausage is a processed meat product made from finely minced or coarsely ground pork, seasoned with salt, pepper, herbs and spices, and encased in natural pig intestine or synthetic collagen casing. Fat content is typically 20–30%, essential for juiciness and flavour development. Fresh sausages require cooking to a minimum internal temperature of 71°C (160°F); pre-cooked or smoked sausages require only reheating to serving temperature (60–65°C). The casing is the critical monitoring challenge: if it ruptures early, moisture and fat escape and the sausage dries out. Probing from one end into the centre avoids puncturing the casing mid-body. Carryover is 2–3°C.


Target internal temperatures (grill):
- Fully cooked/safe: **71–75 °C (160–167 °F)**
- ⚠️ Do not pull before 71 °C — pork sausage must be fully cooked


## Research files by cooking method

- [Grill](./pork_sausage-grill.md)
- [Pan Fry](./pork_sausage-pan_fry.md)
## Quality score

**Score: 15 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Missing Eastern tradition | −1 |
| Missing Southern tradition | −1 |
| Method file `pork_sausage-grill.md` copies parent cut profile | −1 |
| Method file `pork_sausage-pan_fry.md` copies parent cut profile | −1 |
| Method file `pork_sausage-grill.md` copies `pork_sausage-pan_fry.md` | −1 |

### Improvement priorities

1. **−2** · Missing Eastern and Southern tradition(s) — add Eastern and Southern source recipes to method leaf files — each tradition needs at least one recipe across the method files
2. **−1** · Method file `pork_sausage-grill.md` copies `pork_sausage-pan_fry.md` — rewrite `pork_sausage-grill.md`'s cut profile — it must describe what the pan fry method does to this cut, not repeat another method's prose
3. **−1** · Method file `pork_sausage-grill.md` copies parent cut profile — rewrite `pork_sausage-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `pork_sausage-pan_fry.md` copies parent cut profile — rewrite `pork_sausage-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
