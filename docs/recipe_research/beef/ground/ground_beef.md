<!-- KCE:CUT
type: cut
slug: ground_beef
name: Ground Beef
category: beef
meat: cow
cut_type: Ground
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
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
quality_score: 17
quality_assessed: 2026-04-26
-->
# Ground Beef — Cut Overview

## Cut profile

Ground beef (minced beef) is made by grinding beef, most commonly from the chuck primal or a blend of trimmings. The fat-to-lean ratio is the primary quality variable: 80/20 is standard for most preparations; 85/15 is leaner; 70/30 is richer and juicier. Because grinding ruptures muscle cells and distributes surface bacteria throughout the mass, the USDA and equivalent international food-safety authorities require a minimum internal temperature of 71°C (160°F) — there is no medium-rare option for ground beef the way there is for whole steaks. Carryover is minimal (1–2°C) given the fine grind and rapid heat transfer.


## Research files by cooking method

- [Braise](./ground_beef-braise.md)
- [Pan Fry](./ground_beef-pan_fry.md)
## Quality score

**Score: 17 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Method file `ground_beef-braise.md` copies parent cut profile | −1 |
| Method file `ground_beef-pan_fry.md` copies parent cut profile | −1 |
| Method file `ground_beef-braise.md` copies `ground_beef-pan_fry.md` | −1 |

### Improvement priorities

1. **−1** · Method file `ground_beef-braise.md` copies `ground_beef-pan_fry.md` — rewrite `ground_beef-braise.md`'s cut profile — it must describe what the pan fry method does to this cut, not repeat another method's prose
2. **−1** · Method file `ground_beef-braise.md` copies parent cut profile — rewrite `ground_beef-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
3. **−1** · Method file `ground_beef-pan_fry.md` copies parent cut profile — rewrite `ground_beef-pan_fry.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
