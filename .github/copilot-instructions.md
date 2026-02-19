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
6. ❌ **FABRICATING method/property names instead of reading the source code** (see below)

---

## 🛑 NEVER Fabricate Code — Always Read the Source First

**This is the #1 cause of failed releases.** AI agents tend to generate plausible-sounding
method names from patterns instead of reading the actual source code. This ALWAYS fails.

### The Rule
When writing ANY new code that calls existing methods or references existing properties:
1. **OPEN and READ the actual source file** where the method/property is defined
2. **FIND the real method name** by reading the code, not by guessing from patterns
3. **COPY the exact name** from the source into your new code

### What NOT to Do
- ❌ Generate method names from naming patterns (e.g. seeing 15 `_get*` methods and inventing `_getEntities()`)
- ❌ Assume a method exists because "it should" or "it makes sense"
- ❌ Write code that references methods you haven't verified exist in the current codebase

### Why This Matters
In v0.5.0.66, the agent wrote `this._getEntities()` — a method that **does not exist anywhere
in the codebase**. It was fabricated from the dominant `_get*` naming pattern (15+ such methods).
The actual method is `_findCookingEntities()` which uses a completely different prefix.
This caused a TypeError crash and a failed release. The agent would have seen this immediately
if it had simply opened panel-class-template.js and read the method list.

### Success Rate Impact
| Approach | Success Rate |
|----------|-------------|
| Code where source was READ first | 80-95% |
| Code with FABRICATED names (guessed from patterns) | **0%** |

---

## Project Goals & Architecture (from SKILL.md)

### Terms of Reference (ToR)
- **Objective**: Develop a robust cooking engine that integrates seamlessly with a variety of kitchen appliances and enhances user experience.
- **Scope**: Cover multiple culinary processes, from preparation to cooking and cleanup.

### HAOS Compatibility Guidelines
- Ensure full compliance with Home Assistant Operating System (HAOS) standards.
- Use HAOS APIs for integration with other smart home devices.
- Maintain backward compatibility with previous HAOS versions.

### Data Separation Principles
- Ensure clear segregation of configuration, user data, and operational logs.
- Use designated folders for different data types within the application.
- Implement encryption where necessary to protect sensitive user information.

### Multi-appliance Support
- Design the system architecture to support various kitchen appliances regardless of manufacturer.
- Create abstraction layers to handle communication with different appliance protocols.
- Support appliance discovery using HAOS standard methods for a plug-and-play experience.

### Architecture
- Modular architecture that allows for easy updates and maintenance.
- Clear API documentation for all service interfaces.

### Development Workflows
- `main` for stable releases, feature branches for new development.
- CI/CD pipelines to automate testing and deployment.

### Best Practices
- Follow coding standards to ensure code maintainability.
- Conduct code reviews to improve code quality.
- Document all APIs, workflows, and system components.
- Regularly update dependencies to patch vulnerabilities.
