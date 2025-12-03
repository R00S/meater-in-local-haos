# Kitchen Cooking Engine - Copilot Instructions

```
████████████████████████████████████████████████████████████████████████████████
█                                                                              █
█   🛑 CRITICAL: HOW THE FRONTEND FILES WORK 🛑                                █
█                                                                              █
█   There are TWO frontend files:                                              █
█                                                                              █
█   1. panel-class-template.js  ← EDIT THIS ONE for UI changes                 █
█      Contains: class KitchenCookingPanel and all UI code                     █
█      This is the SOURCE OF TRUTH for UI code                                 █
█                                                                              █
█   2. kitchen-cooking-panel.js ← DO NOT EDIT THIS DIRECTLY                    █
█      This is AUTO-GENERATED from template + cooking data                     █
█      Gets regenerated on every install/update                                █
█                                                                              █
█   WORKFLOW FOR UI CHANGES:                                                   █
█   □ 1. Edit www/panel-class-template.js                                      █
█   □ 2. Run: python3 generate_frontend_data.py                                █
█   □ 3. Commit BOTH files (template + generated kitchen-cooking-panel.js)     █
█                                                                              █
█   The generator automatically keeps PANEL_VERSION in sync!                   █
█                                                                              █
████████████████████████████████████████████████████████████████████████████████
```

## Quick Commands

```bash
# After editing panel-class-template.js, regenerate the panel:
cd custom_components/kitchen_cooking_engine
python3 generate_frontend_data.py

# Check current PANEL_VERSION (should match after regeneration):
grep "PANEL_VERSION" custom_components/kitchen_cooking_engine/const.py
grep "const PANEL_VERSION" custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js
```

## What File to Edit for Each Change

| I want to change... | Edit this file | Then run |
|---------------------|----------------|----------|
| UI buttons, graph, layout | `www/panel-class-template.js` | `python3 generate_frontend_data.py` |
| Meat/cut names, temperatures | `cooking_data.py` | `python3 generate_frontend_data.py` |
| Swedish meat data | `swedish_cooking_data.py` | `python3 generate_frontend_data.py` |
| Sensor attributes | `sensor.py` | - |
| Services | `sensor.py` + `services.yaml` | - |
| Config options | `config_flow.py` | - |

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
| `generate_frontend_data.py` | Generates JS from template + data |

### Frontend (JavaScript)
| File | Purpose |
|------|---------|
| `www/panel-class-template.js` | **EDIT THIS** - UI class code (source of truth) |
| `www/kitchen-cooking-panel.js` | Auto-generated - DO NOT EDIT DIRECTLY |

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

1. ❌ Editing kitchen-cooking-panel.js directly (it gets overwritten!)
2. ❌ Forgetting to run generate_frontend_data.py after editing template
3. ❌ Forgetting to commit both template AND generated file
4. ❌ Using deprecated HA APIs (check HA 2024.1.0+ compatibility)
