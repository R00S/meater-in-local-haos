# Kitchen Cooking Engine - Copilot Instructions

## 🚨 CRITICAL: READ THIS FIRST - PANEL_VERSION SYNC

When editing `kitchen-cooking-panel.js`, you MUST keep PANEL_VERSION synchronized:

| File | Variable |
|------|----------|
| `custom_components/kitchen_cooking_engine/const.py` | `PANEL_VERSION = "XX"` |
| `custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js` | `const PANEL_VERSION = "XX";` |

**If these don't match, the panel will NOT load on the user's Home Assistant!**

The safest approach is to run `generate_frontend_data.py` which syncs both automatically.

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
| `generate_frontend_data.py` | Regenerates JS data from Python |

### Frontend (JavaScript)
| File | Purpose |
|------|---------|
| `www/kitchen-cooking-panel.js` | Lovelace panel UI |

## Frontend Panel Behavior

The `kitchen-cooking-panel.js` file has **special regeneration behavior**:

When a user installs/updates via HACS, `generate_frontend_data.py` runs and:
1. **REPLACES**: Header and data constants (DONENESS_OPTIONS, MEAT_CATEGORIES, etc.)
2. **PRESERVES**: Everything from `class KitchenCookingPanel` onwards

### What This Means For You

| What you want to change | Where to edit |
|------------------------|---------------|
| Cooking data (temps, cuts, doneness) | `cooking_data.py` or `swedish_cooking_data.py` |
| UI behavior, rendering, graphs | Class code in `kitchen-cooking-panel.js` |
| **Any JS change** | Also update PANEL_VERSION in BOTH files |

### The PANEL_VERSION Trap (Why Your Changes Don't Work)

If you edit the JS file but the PANEL_VERSION in `const.py` is different:
- Home Assistant looks for `kitchen-cooking-panel-vXX` (from const.py)
- But the JS registers `kitchen-cooking-panel-vYY` (from the JS file)
- **Result: Your changes are INVISIBLE to the user**

This is why 10+ commits of graph changes had no effect - the version was mismatched.

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
