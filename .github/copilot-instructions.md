# Kitchen Cooking Engine - Copilot Instructions

```
████████████████████████████████████████████████████████████████████████████████
█                                                                              █
█   🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑   █
█                                                                              █
█   BEFORE YOU TOUCH kitchen-cooking-panel.js, YOU MUST UNDERSTAND:            █
█                                                                              █
█   THE JS FILE HAS TWO PARTS:                                                 █
█                                                                              █
█   PART 1: HEADER + DATA (lines 1 to "class KitchenCookingPanel")             █
█           ❌ THIS GETS OVERWRITTEN WHEN USER INSTALLS ❌                      █
█           → Changes you make here will DISAPPEAR on user's system            █
█           → To change data: edit cooking_data.py instead                     █
█                                                                              █
█   PART 2: CLASS CODE ("class KitchenCookingPanel" to end of file)            █
█           ✅ THIS IS PRESERVED ✅                                             █
█           → Changes you make here WILL work                                  █
█           → BUT ONLY IF YOU ALSO BUMP PANEL_VERSION (see below)              █
█                                                                              █
█   🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑   █
█                                                                              █
████████████████████████████████████████████████████████████████████████████████

████████████████████████████████████████████████████████████████████████████████
█                                                                              █
█   EVERY TIME YOU EDIT THE JS FILE, DO THIS CHECKLIST:                        █
█                                                                              █
█   □ 1. Make your changes to the CLASS CODE section (after line ~3500)        █
█                                                                              █
█   □ 2. Bump PANEL_VERSION in const.py:                                       █
█        Find: PANEL_VERSION = "34"                                            █
█        Change to: PANEL_VERSION = "35" (or next number)                      █
█                                                                              █
█   □ 3. Bump PANEL_VERSION at BOTTOM of kitchen-cooking-panel.js:             █
█        Find: const PANEL_VERSION = "34";                                     █
█        Change to: const PANEL_VERSION = "35"; (SAME number as const.py)      █
█                                                                              █
█   □ 4. Commit BOTH files together                                            █
█                                                                              █
█   IF YOU SKIP STEPS 2-4: YOUR CHANGES WILL BE INVISIBLE TO THE USER!         █
█   (This happened 10+ times before. Don't repeat the mistake.)                █
█                                                                              █
████████████████████████████████████████████████████████████████████████████████
```

## Quick Commands

```bash
# Check current PANEL_VERSION in both files (MUST match):
grep "PANEL_VERSION" custom_components/kitchen_cooking_engine/const.py
grep "const PANEL_VERSION" custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js
```

## What File to Edit for Each Change

| I want to change... | Edit this file | Notes |
|---------------------|----------------|-------|
| Meat/cut names, temperatures | `cooking_data.py` | NOT the JS file! |
| Swedish meat data | `swedish_cooking_data.py` | NOT the JS file! |
| UI buttons, graph, layout | `kitchen-cooking-panel.js` CLASS section | Bump PANEL_VERSION! |
| Sensor attributes | `sensor.py` | |
| Services | `sensor.py` + `services.yaml` | |
| Config options | `config_flow.py` | |

---

## Why This Matters

When a user installs/updates via HACS:
1. `generate_frontend_data.py` runs
2. It **OVERWRITES** the header of `kitchen-cooking-panel.js` with fresh data from Python
3. It **PRESERVES** everything from `class KitchenCookingPanel` onwards
4. Home Assistant loads the panel using the name `kitchen-cooking-panel-vXX` where XX comes from `const.py`

If the PANEL_VERSION in `const.py` doesn't match the one in the JS file:
- HA looks for `kitchen-cooking-panel-v35` (from const.py)
- But JS only registered `kitchen-cooking-panel-v34`
- **Result: Panel doesn't load, your changes are invisible**

---

---

## Project Overview

This is a Home Assistant custom integration for kitchen temperature cooking (MEATER probes, etc.). It provides:
- Temperature monitoring with cooking sessions
- Meat/protein selection with doneness levels
- Dynamic ETA calculation
- Notifications (mobile, TTS, persistent)
- Indicator light control
- Cook history with notes

## Key Files

### Backend (Python)
| File | Purpose |
|------|---------|
| `__init__.py` | Integration setup, panel registration |
| `sensor.py` | Cooking session sensor entity |
| `cooking_data.py` | International meat/cut data (source of truth) |
| `swedish_cooking_data.py` | Swedish meat/cut data |
| `const.py` | Constants including PANEL_VERSION |
| `generate_frontend_data.py` | Regenerates JS data from Python, syncs PANEL_VERSION |

### Frontend (JavaScript)
| File | Purpose |
|------|---------|
| `www/kitchen-cooking-panel.js` | Lovelace panel UI (partially overwritten on install - see above) |

---

## Safe Workflow for Frontend Changes

### Option 1: Edit JS Only (When You Need to)
1. Edit `www/kitchen-cooking-panel.js`
2. Find the PANEL_VERSION at the bottom of the file
3. **Immediately** edit `const.py` to match
4. Commit both files together

### Option 2: Run the Generator (Safer)
```bash
cd custom_components/kitchen_cooking_engine
python3 generate_frontend_data.py
```
This regenerates data from Python AND syncs PANEL_VERSION automatically.

---

## Backend Changes

For Python changes:
1. Edit the relevant `.py` file
2. If adding new attributes to the sensor, also update `services.yaml`
3. Update `manifest.json` version number

---

## Version Numbering

Format: `v0.1.X.YY`
- `0` = Beta
- `1` = First feature batch
- `X` = Agent number (increments when a new agent takes over)
- `YY` = Release number with current agent

---

## Testing

User tests via HACS:
1. Create a GitHub release from the branch
2. User downloads in HACS
3. User restarts Home Assistant

No automated tests exist - all testing is manual on real HAOS.

---

## Common Mistakes to Avoid

1. ❌ Editing JS file without updating PANEL_VERSION in const.py
2. ❌ Editing data constants in JS (they get overwritten on install)
3. ❌ Forgetting to commit both const.py and JS file together
4. ❌ Using deprecated HA APIs (check HA 2024.1.0+ compatibility)
