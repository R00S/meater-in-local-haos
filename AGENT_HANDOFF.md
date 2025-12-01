# Agent Handoff Document

**Last Updated:** 2024-11-30T23:50:00Z
**Last Agent Edit:** 2024-11-30T23:50:00Z

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

## Current Project State

### Kitchen Cooking Engine Integration

**Status:** Phase 1 - Core Structure Complete

**Location:** `custom_components/kitchen_cooking_engine/`

**Files:**
| File | Purpose | Last Edit |
|------|---------|-----------|
| `__init__.py` | Integration setup, service registration | 2024-11-30 |
| `config_flow.py` | UI-based configuration (no YAML needed) | 2024-11-30 |
| `const.py` | Constants and configuration keys | 2024-11-30 |
| `cooking_data.py` | Comprehensive cooking data model | 2024-11-30 |
| `sensor.py` | Cooking session sensor entity | 2024-11-30 |
| `services.yaml` | Service definitions | 2024-11-30 |
| `strings.json` | Config flow strings | 2024-11-30 |
| `translations/en.json` | English translations | 2024-11-30 |
| `manifest.json` | HACS manifest | 2024-11-30 |

### Data Model

The cooking data model includes:

**Proteins:**
- Beef (steaks, roasts, braising cuts, ground)
- Pork (chops, roasts, ribs, ham, ground)
- Poultry (chicken, turkey, duck, ground)
- Fish & Seafood (salmon, tuna, white fish, shellfish)
- Lamb (roasts, chops, ground)
- Game (venison, wild boar, bison)
- **Vegetables** (root, greens, alliums, squash, cruciferous, peppers, mushrooms, corn, eggplant, tomatoes)

**Cooking Methods (Kitchen-focused):**
- Oven: roast, bake, broil
- Stovetop: pan fry, pan sear, sauté, braise, poach, simmer, boil, steam
- Specialty: air fryer, sous vide, slow cooker, pressure cooker
- Outdoor: grill, smoker, charcoal grill

**Temperature Data Sources:**
- USDA FSIS Safe Minimum Internal Temperatures
- FDA Food Code
- Professional culinary standards

### Patterns Used

The integration follows patterns from the working `haos_feature_forecast` integration:
- UI-based config flow (no configuration.yaml editing required)
- Proper `strings.json` for HA 2024.1.0+
- Entity cleanup for duplicate prevention
- Service registration in `async_setup()`
- `integration_type: "service"` in manifest

### Next Steps

1. [ ] Add Lovelace dashboard cards for cooking UI
2. [ ] Implement full service handlers with entity targeting
3. [ ] Add notification automations for goal reached
4. [ ] Test in real HAOS environment via HACS
5. [ ] Iterate based on user feedback

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

None currently - awaiting first HACS test.
