# Agent Handoff Document

**Last Updated:** 3 Dec 2025, 01:00 CET

```
████████████████████████████████████████████████████████████████████████████████
█                                                                              █
█   🛑🛑🛑 STOP! SOURCE OF TRUTH - NEVER DUPLICATE DATA! 🛑🛑🛑                █
█                                                                              █
█   UI CODE (buttons, graph, layout, behavior):                                █
█     → SOURCE: www/panel-class-template.js                                    █
█     → Contains ONLY the class KitchenCookingPanel                            █
█     → NO cooking data (meats, cuts, temps) should be here!                   █
█                                                                              █
█   COOKING DATA (meats, cuts, temperatures, doneness):                        █
█     → SOURCE: cooking_data.py (International)                                █
█     → SOURCE: swedish_cooking_data.py (Swedish)                              █
█     → Generator injects this data into the JS file                           █
█                                                                              █
█   AUTO-GENERATED FILE (DO NOT EDIT!):                                        █
█     → www/kitchen-cooking-panel.js                                           █
█     → Created by: python3 generate_frontend_data.py                          █
█     → Combines: header + cooking data + template class code                  █
█                                                                              █
█   WORKFLOW:                                                                  █
█   □ 1. Edit the SOURCE file (template.js for UI, cooking_data.py for data)  █
█   □ 2. Run: python3 generate_frontend_data.py                                █
█   □ 3. Commit ALL changed files                                              █
█                                                                              █
█   ⚠️ DANGER: If you put cooking data in panel-class-template.js, you will   █
█   create DUPLICATE DATA that WILL get out of sync and cause bugs!            █
█                                                                              █
████████████████████████████████████████████████████████████████████████████████
```

## Quick Reference: What File to Edit

| I want to change... | Source of Truth | Then run |
|---------------------|-----------------|----------|
| Meat/cut data, temperatures, doneness | `cooking_data.py` | `python3 generate_frontend_data.py` |
| Swedish data | `swedish_cooking_data.py` | `python3 generate_frontend_data.py` |
| UI, graph, buttons, behavior | `www/panel-class-template.js` | `python3 generate_frontend_data.py` |
| Sensor attributes | `sensor.py` | Nothing |
| Services | `sensor.py` + `services.yaml` | Nothing |

## Quick Commands

```bash
# After editing ANY source file, regenerate:
cd custom_components/kitchen_cooking_engine
python3 generate_frontend_data.py

# Check PANEL_VERSION (must match!):
grep "PANEL_VERSION" custom_components/kitchen_cooking_engine/const.py
grep "const PANEL_VERSION" custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js
```

---

## 🚨 Frontend Panel Regeneration Behavior

### How kitchen-cooking-panel.js Works

The file `custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js` has **special regeneration behavior** that you MUST understand:

When a user installs/updates this integration, `generate_frontend_data.py` runs and **REGENERATES** the panel file:

1. **REPLACED on user's system**: The header and all data constants (DONENESS_OPTIONS, MEAT_CATEGORIES, etc.)
2. **PRESERVED on user's system**: Everything from `class KitchenCookingPanel` onwards (all the UI/behavior code)

**This means:**
- ❌ Changes to DATA CONSTANTS in kitchen-cooking-panel.js will be LOST on user's installation
- ✅ Changes to CLASS CODE in kitchen-cooking-panel.js WILL be deployed when user updates

**For AI Agents / Developers:**
| What you want to change | Where to edit |
|------------------------|---------------|
| Cooking data (temps, cuts, doneness) | `cooking_data.py` or `swedish_cooking_data.py` |
| UI behavior, rendering, graph code | Class code in `kitchen-cooking-panel.js` (it gets preserved) |

**After editing class code:** You MUST COMMIT the changes to the repo. The user must UPDATE their integration to get class code changes.

See `generate_frontend_data.py` for the regeneration logic (specifically the `regenerate_panel()` function).

---

## 🚨 PRIORITY TODO FOR NEXT AGENT (v0.1.2.x)

The following items are the **FIRST PRIORITY** for the next agent session:

### 1. Merge and Deduplicate Cut/Protein Lists
**Problem:** There are two separate lists of cuts/proteins that got out of sync:
- `cooking_data.py` - 151 MeatCut definitions (used by Python backend for temperature validation)
- `kitchen-cooking-panel.js` - 188 cut definitions in `MEAT_CATEGORIES` (used by UI rendering)

**Solution:**
- Create a **single source of truth** for all cuts/proteins
- Option A: Create a WebSocket API endpoint that serves the Python data to the frontend
- Option B: Generate the JS data from Python at build time
- Ensure NO cuts are lost when merging - combine both lists

### 2. Doneness Selection for All Proteins
**Problem:** Currently doneness selection may only work properly for beef. All proteins should have:
- Proper doneness options (Fish: medium/well, Poultry: safe, Lamb: rare-well, etc.)
- **Suggested doneness** that auto-selects based on the cut
- User should be able to **edit the suggestion** before starting the cook

**Implementation:**
- Each cut should have a `recommended_doneness` field
- UI should pre-select the recommended doneness
- User can change it via the doneness buttons before clicking "Start Cooking"

---

## Release Numbering

Release versions follow this pattern: `v0.1.X.YY` (removed "dev" suffix per user request)

| Position | Meaning | Current |
|----------|---------|---------|
| `0` | Still in beta | 0 |
| `1` | First batch of features | 1 |
| `X` | Agent number at this stage | 0 = first agent, 1 = second agent, etc. |
| `YY` | Release number with this agent (0-indexed) | e.g., 16 = 17th release |

**Examples:**
- `v0.1.0.0` = First release by first agent in beta/first-features stage
- `v0.1.0.16` = 17th release by first agent (CURRENT)
- `v0.1.1.0` = First release by second agent at this stage (NEXT)
- `v0.2.0.0` = First release in second batch of features

## Development Workflow

The development workflow for this project is:

1. **AI Agent edits code files** - All code changes are made by the AI agent
2. **Timestamp each edit** - Add timestamp at top of file with time and last edit info
3. **User imports via HACS** - User uses HACS to import the integration into HAOS
4. **User tests in HAOS** - User tests the integration in Home Assistant
5. **Iterate** - Repeat the cycle based on feedback

### ⚠️ CRITICAL: Version Compatibility Check

**Before asking the user to test ANY implementation, ALWAYS verify that:**

1. The code is compatible with the **latest stable version of Home Assistant** (YYYY.MM.x where MM is current or last month)
2. Check the Home Assistant developer documentation for any API changes
3. Test imports and function signatures match what's available in the target HA version
4. Do NOT use deprecated APIs or `hass.components.*` patterns that may not work in newer versions

**Example issues to avoid:**
- Using `hass.components.frontend.async_register_built_in_panel()` → Use imported `async_register_built_in_panel(hass, ...)` instead
- Using deprecated helper functions that were removed in recent HA versions
- Relying on internal APIs that are subject to change

**When unsure:**
- Check the HA core source code on GitHub for the current implementation
- Reference the official Home Assistant developer documentation
- Look at how other well-maintained custom integrations handle similar functionality

### Timestamp Format

When editing code files, use the following format at the top of each file:

```
Last Updated: D MMM YYYY, HH:MM CET
Last Change: Brief description of what was changed
```

**Example:**
```python
"""Module description.

Last Updated: 1 Dec 2025, 12:31 CET
Last Change: Added event firing for state transitions
"""
```

**Rules:**
- Use Central European Time (CET/CEST) timezone
- Use human-readable date format: `D MMM YYYY` (e.g., "1 Dec 2025")
- Use 24-hour time format: `HH:MM` (e.g., "12:31")
- Keep the "Last Change" description short (under 60 characters)
- Update timestamp on every edit, even small ones

### Important Notes

- **Code files are ONLY edited by the AI agent** - You can be confident that any code is never edited by anyone else
- **Documentation MAY be edited by the user** - The user may update documentation files
- **HACS testing** - The integration is tested by importing via HACS into a real Home Assistant instance
- **NO manual file editing on HAOS** - For HAOS integrity, all file changes must come through HACS imports

### Development Workflow Options

There are two ways to test development branches:

#### Option 1: Manual Installation (Recommended for Dev Testing)

Since HACS 2.0 no longer supports branch selection (only releases/tags), use this method for rapid iteration:

1. **SSH into your Home Assistant** or use the File Editor add-on
2. **Navigate to** `/config/custom_components/`
3. **Download the branch directly** using Terminal:
   ```bash
   cd /config/custom_components
   rm -rf kitchen_cooking_engine  # Remove existing if present
   wget https://github.com/R00S/meater-in-local-haos/archive/refs/heads/copilot/setup-workflow-with-dev-branches.zip
   unzip setup-workflow-with-dev-branches.zip
   mv meater-in-local-haos-copilot-setup-workflow-with-dev-branches/custom_components/kitchen_cooking_engine .
   rm -rf meater-in-local-haos-copilot-setup-workflow-with-dev-branches setup-workflow-with-dev-branches.zip
   ```
4. **Restart Home Assistant** to apply changes

#### Option 2: Merge PR to Main

For production-ready changes:
1. Merge the PR to `main`
2. HACS will automatically detect the update
3. Redownload via HACS → Integrations → Kitchen Cooking Engine → ⋮ → Redownload

#### Option 3: Create a Release from Branch (Recommended - No Merge Required)

**This is the best solution for HACS + dev branches without merging:**

You can create a GitHub release directly from any branch - no merge to main required! HACS will then show it in the version dropdown.

**Step 1: Go to GitHub Releases**
1. Go to: https://github.com/R00S/meater-in-local-haos/releases/new

**Step 2: Create the Release**
1. Click "Choose a tag" → type a new tag like `v0.1.0-dev` → click "Create new tag"
2. **IMPORTANT**: Click "Target: main" dropdown → select the dev branch (e.g., `copilot/setup-workflow-with-dev-branches`)
3. Fill in:
   - **Release title**: `v0.1.0-dev - Dev Testing`
   - **Description**: `Development release for testing`
4. Check ☑️ "Set as a pre-release" (optional, marks it as non-production)
5. Click **"Publish release"**

**Step 3: Download in HACS**
1. In HACS → Integrations → Kitchen Cooking Engine
2. Click ⋮ → Redownload
3. Select the new version (e.g., `v0.1.0-dev`) from the dropdown
4. Click Download → Restart HA

**For subsequent updates:**
- Create new releases (v0.1.1-dev, v0.1.2-dev, etc.) from the same branch as changes are pushed
- HACS will show all versions in the dropdown

> **Note:** HACS 2.0 [removed branch selection](https://github.com/hacs/integration/issues/4203). Only releases/tags appear in the version dropdown.

### GitHub Actions Workflow

A HACS validation workflow runs automatically on:
- Every push to any branch
- Every pull request
- Daily scheduled runs
- Manual trigger (workflow_dispatch)

The workflow file is at `.github/workflows/hacs-validation.yml` and validates that the repository structure is HACS-compliant. Check the GitHub Actions tab to see validation results for any branch before downloading via HACS.

---

## 🚀 PHASE 1 COMPLETE - Kitchen Cooking Engine Integration

### What Was Built

A HACS-compatible Home Assistant integration in `custom_components/kitchen_cooking_engine/`:

| File | Purpose | Last Edit |
|------|---------|-----------|
| `__init__.py` | Integration setup, service registration | 2024-12-01 |
| `config_flow.py` | UI-based configuration (no YAML needed) | 2024-12-01 |
| `const.py` | Constants and configuration keys | 2024-12-01 |
| `cooking_data.py` | Comprehensive cooking data model (~2600 lines) | 2024-12-01 |
| `sensor.py` | Cooking session sensor entity | 2024-12-01 |
| `services.yaml` | Service definitions | 2024-12-01 |
| `strings.json` | Config flow strings | 2024-12-01 |
| `translations/en.json` | English translations | 2024-12-01 |
| `manifest.json` | HACS manifest | 2024-12-01 |

### Data Model Implemented

**Proteins & Cuts:**
- Beef (steaks, roasts, braising cuts, ground)
- Pork (chops, roasts, ribs, ham, ground)
- Poultry (chicken, turkey, duck, ground)
- Fish & Seafood (salmon, tuna, white fish, shellfish)
- Lamb (roasts, chops, ground)
- Game (venison, wild boar, bison)
- **Vegetables** (root, greens, alliums, squash, cruciferous, peppers, mushrooms, corn, eggplant, tomatoes)

**Cooking Methods (Kitchen-focused, NOT grill-focused):**
- Oven: roast, bake, broil
- Stovetop: pan fry, pan sear, sauté, braise, poach, simmer, boil, steam
- Specialty: air fryer, sous vide, slow cooker, pressure cooker
- Outdoor: grill, smoker, charcoal grill (for completeness)

**Temperature Data Sources:**
- USDA FSIS Safe Minimum Internal Temperatures
- FDA Food Code
- Professional culinary standards
- Structure informed by MEATER app's `meatCutStructure` package (but data from public sources)

### Patterns Used (Critical for HA 2024.1.0+ Compatibility)

The integration follows patterns from the working `haos_feature_forecast` integration:
- UI-based config flow (no configuration.yaml editing required)
- Proper `strings.json` for HA 2024.1.0+
- Entity cleanup for duplicate prevention
- Service registration in `async_setup()`
- `integration_type: "service"` in manifest
- Simple vol.Schema in config_flow (no fancy selectors)

### HACS Repository Setup

- `hacs.json` at repo root
- `custom_components/kitchen_cooking_engine/` directory structure
- `manifest.json` with `config_flow: true`
- README.md with HACS installation instructions

---

## What's Next for Phase 2

### PRIORITY (for next agent v0.1.1.0):
1. [ ] **Merge cut/protein lists** - Deduplicate cooking_data.py and kitchen-cooking-panel.js (see TODO above)
2. [ ] **Doneness for all proteins** - Add recommended doneness that user can edit (see TODO above)

### Already Completed:
1. [x] **Full service handlers** - ✅ Implemented start_cook, stop_cook, start_rest, complete_session with entity targeting
2. [x] **Notification automations** - ✅ Events fired for approaching_target and goal_reached
3. [x] **Sidebar panel** - ✅ MEATER app structure with Steak/Roast/Other flow

### Future Work:
4. [ ] **Test via HACS** - After PR merge, import via HACS and test config flow
5. [ ] **Temperature history** - Store temperature curves for ETA predictions
6. [ ] **Swedish language tree** - Add Swedish butcher cut names
7. [ ] **Integration with Mealie/Grocy** - Link recipes to cooking sessions

---

## Reference Repositories

- **haos_feature_forecast** - Working HACS integration pattern: https://github.com/R00S/haos_feature_forecast
- **MEATER app decompiled** - Data structure reference in `meater_app/`

## Technical Notes

### Home Assistant Version Compatibility

- Minimum HA version: 2024.1.0
- Tested on: 2025.10, 2025.11

### HACS Requirements

- `hacs.json` at repo root with proper configuration
- `custom_components/<domain>/` structure
- `manifest.json` with `config_flow: true`
- `strings.json` for config flow UI

### Known Issues

- HACS shows "Repository structure for main is not compliant" until PR is merged to main (expected behavior)
- Config flow needs testing in real HAOS environment after merge
