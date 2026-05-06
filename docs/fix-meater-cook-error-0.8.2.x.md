# Branch: copilot/fix-meater-cook-error — v0.8.2.x

## Problem

Some MEATER cooks fail to start:
- **Whole chicken** (and whole_turkey, whole_duck, whole_goose, duck_leg_confit, shrimp): visible HA error — `value must be one of [...]` — because the doneness name in the cut file (e.g. `thigh_optimal`, `confit`, `leg_rendered`, `thigh_rendered`, `just_cooked`) is not in the `vol.In` validator in `__init__.py`.
- **Chicken breast** (and ~35 other cuts): silent failure — no start, no visible error — because `recommended_doneness: well_done` was used as a placeholder in all these cut files, but `well_done` is not in their actual doneness list. The service call passes schema validation but the handler returns silently.
- **Chicken thigh** works because it has saved user preferences with a valid doneness.

## Root cause

1. `SERVICE_START_COOK_SCHEMA` in `__init__.py` missing: `thigh_optimal`, `just_cooked`, `confit`, `leg_rendered`, `thigh_rendered`
2. `recommended_doneness: well_done` used as a placeholder in 40+ cut files — value doesn't exist in the cut's actual doneness list.

## Fix plan

- [x] Add missing doneness names to `vol.In` in `__init__.py`
- [x] Add same names to `services.yaml` selector
- [x] Fix `recommended_doneness` in all 40 mismatched cut files
- [x] Run generator
- [x] Bump version

## Sessions

### Session 1 (2026-05-06)
- Discovered both bugs via scan of all 164 cut files
- Applied all fixes
