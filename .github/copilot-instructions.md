# Kitchen Cooking Engine - Copilot Instructions

```
████████████████████████████████████████████████████████████████████████████████
█                                                                              █
█   🛑 CRITICAL: SOURCE OF TRUTH FOR DIFFERENT DATA 🛑                        █
█                                                                              █
█   ⚠️  DO NOT DUPLICATE DATA BETWEEN FILES! Each has ONE source of truth:    █
█                                                                              █
█   UI CODE (buttons, graph, layout, behavior):                                █
█     → Edit: www/panel-class-template.js                                      █
█                                                                              █
█   COOKING DATA (meats, cuts, temperatures, doneness):                        █
█     → Edit: cooking_data.py (International) or swedish_cooking_data.py       █
█     → NEVER put cooking data in the JS template!                             █
█                                                                              █
█   AUTO-GENERATED (combines UI + data):                                       █
█     → www/kitchen-cooking-panel.js ← DO NOT EDIT THIS DIRECTLY               █
█                                                                              █
█   WORKFLOW:                                                                  █
█   □ 1. Edit the appropriate SOURCE file (template.js OR cooking_data.py)    █
█   □ 2. Run: python3 generate_frontend_data.py                                █
█   □ 3. Commit ALL changed files                                              █
█                                                                              █
█   The generator automatically keeps PANEL_VERSION in sync!                   █
█                                                                              █
████████████████████████████████████████████████████████████████████████████████
```

## Quick Commands

```bash
# After editing panel-class-template.js OR cooking_data.py, regenerate:
cd custom_components/kitchen_cooking_engine
python3 generate_frontend_data.py

# Check current PANEL_VERSION (should match after regeneration):
grep "PANEL_VERSION" custom_components/kitchen_cooking_engine/const.py
grep "const PANEL_VERSION" custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js
```

## What File to Edit for Each Change

| I want to change... | Source of Truth | Then run |
|---------------------|-----------------|----------|
| UI buttons, graph, layout, behavior | `www/panel-class-template.js` | `python3 generate_frontend_data.py` |
| Meat/cut names, temperatures, doneness | `cooking_data.py` | `python3 generate_frontend_data.py` |
| Swedish meat data | `swedish_cooking_data.py` | `python3 generate_frontend_data.py` |
| Sensor attributes | `sensor.py` | - |
| Services | `sensor.py` + `services.yaml` | - |
| Config options | `config_flow.py` | - |

### ⚠️ DANGER: Duplicate Data

**NEVER** put cooking data (MEAT_CATEGORIES, DONENESS_OPTIONS, etc.) in panel-class-template.js!
- The template should only have UI code (the class definition)
- Cooking data constants are injected by the generator from the Python files
- If you duplicate data, it WILL get out of sync and cause bugs

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

### Backend (Python) - Sources of Truth
| File | Purpose |
|------|---------|
| `cooking_data.py` | **SOURCE OF TRUTH** - International meat/cut/temp data |
| `swedish_cooking_data.py` | **SOURCE OF TRUTH** - Swedish meat/cut/temp data |
| `sensor.py` | Cooking session sensor entity |
| `const.py` | Constants including PANEL_VERSION |
| `generate_frontend_data.py` | Generates JS from template + data |
| `__init__.py` | Integration setup, panel registration |

### Frontend (JavaScript)
| File | Purpose |
|------|---------|
| `www/panel-class-template.js` | **SOURCE OF TRUTH** - UI class code ONLY |
| `www/kitchen-cooking-panel.js` | **AUTO-GENERATED** - DO NOT EDIT |

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
2. ❌ Putting cooking data in panel-class-template.js (causes duplicates!)
3. ❌ Forgetting to run generate_frontend_data.py after editing
4. ❌ Forgetting to commit ALL changed files (template + generated + data)
5. ❌ Using deprecated HA APIs (check HA 2024.1.0+ compatibility)
