# Agent Handoff Document

**Last Updated:** 2024-12-01T00:35:00Z
**Last Agent Edit:** 2024-12-01T00:35:00Z

## Development Workflow

The development workflow for this project is:

1. **AI Agent edits code files** - All code changes are made by the AI agent
2. **Timestamp each edit** - Add timestamp at top of file with time and last edit info
3. **User imports via HACS** - User uses HACS to import the integration into HAOS
4. **User tests in HAOS** - User tests the integration in Home Assistant
5. **Iterate** - Repeat the cycle based on feedback

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

#### Option 3: Create a Release Tag (For Version Selection in HACS)

HACS 2.0 only shows releases/tags in the version selector. To enable version selection:
1. Create a GitHub release with a tag (e.g., `v0.1.0-dev`)
2. In HACS, the release will appear in the version dropdown when redownloading

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

1. [ ] **Test via HACS** - After PR merge, import via HACS and test config flow
2. [ ] **Lovelace dashboard cards** - Create cooking UI cards
3. [ ] **Full service handlers** - Implement start_cook, stop_cook, etc. with entity targeting
4. [ ] **Notification automations** - Goal reached, approaching target alerts
5. [ ] **Temperature history** - Store temperature curves for ETA predictions
6. [ ] **Integration with Mealie/Grocy** - Link recipes to cooking sessions

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
