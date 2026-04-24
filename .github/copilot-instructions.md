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

## Branch Timeline Files

```
████████████████████████████████████████████████████████████████████████████████
█                                                                              █
█   🛑 READ THE BRANCH TIMELINE BEFORE DOING ANYTHING 🛑                      █
█                                                                              █
█   Every branch has a timeline file:                                         █
█     docs/<branch-name-without-prefix>-<A.B.C.x>.md                         █
█                                                                              █
█   Example: branch copilot/implement-branch-history-system, version 0.6.0.01 █
█     → docs/implement-branch-history-system-0.6.0.x.md                      █
█                                                                              █
█   HOW TO FIND IT:                                                            █
█     BRANCH=$(git branch --show-current | sed 's|.*/||')                     █
█     VERSION=$(python3 -c "import json; d=json.load(open('custom_components/kitchen_cooking_engine/manifest.json')); print('.'.join(d['version'].split('.')[:3]))") █
█     FILE="docs/${BRANCH}-${VERSION}.x.md"                                   █
█                                                                              █
█   RULES:                                                                     █
█     1. Read it FIRST — before reading any other file or writing code.        █
█     2. If it does not exist, CREATE it before doing anything else.           █
█     3. After each discovery, failed attempt, or implemented fix — UPDATE it. █
█     4. This prevents debug loops and lost discoveries across agent sessions. █
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

### 🛑 MANDATORY: Version Update Checklist

**Every release MUST update ALL 4 version locations.** Mismatches cause broken releases.

When bumping the version (e.g. from `0.5.1.0` to `0.5.1.1`):

```
□ 1. manifest.json        → "version": "0.5.1.1"
□ 2. __init__.py           → __version__ = "0.5.1.1"
□ 3. __init__.py           → Last Change: v0.5.1.1 - <description>
□ 4. const.py              → Last Change: v0.5.1.1 - <description>
     (PANEL_VERSION is auto-incremented by generate_frontend_data.py)
```

**Quick verification command:**
```bash
grep '"version"' custom_components/kitchen_cooking_engine/manifest.json
grep '__version__' custom_components/kitchen_cooking_engine/__init__.py
grep 'PANEL_VERSION' custom_components/kitchen_cooking_engine/const.py
```

**All 3 version strings MUST match.** If they don't, fix them before committing.

This has caused failed releases multiple times (v0.5.0.72, v0.5.1.0) where code
changes were committed but version numbers were left stale or inconsistent.

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
6. ❌ **FABRICATING method/property names instead of reading the source code** (see Rule 1 below)
7. ❌ **FABRICATING data mappings — mapping cuts to wrong species/cuts** (see Rule 2 below)

---

## 🛑 DO NOT TRY TO PLEASE — BE HONEST

**The owner of this project would rather hear "I don't know" than discover later that you faked a solution.**

Trying to appear helpful by producing plausible-looking output that isn't actually correct is
the most damaging thing an agent can do here. It wastes the owner's time, erodes trust, and
forces them to audit everything you touch.

The specific failure mode: **trying to please by trying to fool** — generating something that
looks like a solution so the owner feels progress is being made, when it isn't.

### When you don't know something, say it explicitly:

- "There is no recipe research file for `abborrfile`. I cannot map it."
- "I don't know what the correct English slug for `innanlaar` is without a matching recipe file."
- "This cut has no recipe data. The card will show no recipes."

### Do NOT do this:

- ❌ Map a cut to a "similar" cut from a different species to avoid showing nothing
- ❌ Write a partial fix and present it as complete
- ❌ Add placeholder code to look like progress
- ❌ Move on to the next task while the current one is broken and unverified
- ❌ Leave syntax errors or half-implemented features in the codebase

### What actually happened (April 2026, session on this branch):

An agent added ~20 fabricated slug mappings (abborre→sea_bass, gös→sea_bass, sik→cod,
veal→pork, lamb→beef, etc.), broke the generator with a syntax error, added incomplete
state properties to the JS template without implementing the corresponding methods,
and left the build broken — all while reporting progress at each step.

The owner had to find every problem themselves.

### The correct behaviour:

1. If a step is done and verified — say so and show the verification output.
2. If a step cannot be done — say so clearly and stop.
3. If you are unsure — ask. Do not guess and present it as fact.
4. Run `python3 generate_frontend_data.py` and confirm it succeeds before claiming any generator-related task is complete.

---

### Rule 1 — Code: Always Read the Source First

When writing ANY new code that calls existing methods or references existing properties:
1. **OPEN and READ the actual source file** where the method/property is defined
2. **FIND the real name** by reading the code, not by guessing from patterns
3. **COPY the exact name** from the source into your new code

**What NOT to Do**
- ❌ Generate method names from naming patterns (e.g. seeing 15 `_get*` methods and inventing `_getEntities()`)
- ❌ Assume a method exists because "it should" or "it makes sense"
- ❌ Write code that references methods you haven't verified exist in the current codebase

**Why This Matters**
In v0.5.0.66, the agent wrote `this._getEntities()` — a method that **does not exist anywhere
in the codebase**. It was fabricated from the dominant `_get*` naming pattern (15+ such methods).
The actual method is `_findCookingEntities()` which uses a completely different prefix.
This caused a TypeError crash and a failed release.

---

### Rule 2 — Data Mappings: Only Map What You Can Verify

`_RECIPE_SLUG_MAP` in `generate_frontend_data.py` maps Swedish cut names → English recipe slugs.
**Every entry must be verifiable. No approximate or "close enough" mappings.**

**The only acceptable reasons to add an entry:**

| Reason | Example | Acceptable? |
|--------|---------|-------------|
| Same species, same cut | `torskfile` → `cod_fillet` (torsk = cod) | ✅ Yes |
| Same species, whole fish → fillet of same fish | `hel_torsk_pa_ben` → `cod_fillet` | ✅ Yes |
| Same genus, effectively identical cut | `kalvfile` → `filet_mignon` (veal/beef tenderloin) | ✅ Yes |
| "Similar cooking profile" across different species | `abborrfile` → `sea_bass` (perch ≠ sea bass) | ❌ **No** |
| "Closest available" across different species | `sikfile` → `cod_fillet` (whitefish ≠ cod) | ❌ **No** |
| Different species, same cut type | `kalvkotlett` → `pork_chop` (veal ≠ pork) | ❌ **No** |
| Different animal, similar cooking | `lammbringa` → `brisket` (lamb ≠ beef) | ❌ **No** |
| Ground meat → whole-muscle steak | `algfarsbiff` → `venison_steak` (burger ≠ steak) | ❌ **No** |

**If there is no matching recipe file for a cut, the correct answer is: no mapping.**
A missing recipe card is honest. A wrong recipe card is deceptive.

**Before adding ANY entry:**
1. Read `swedish_cooking_data.py` — find the exact `name=` field for the cut
2. Check `docs/recipe_research/` — verify a recipe file for that **exact species** exists
3. If no file exists, do NOT add a mapping

**What happened in this codebase (April 2026):**
An agent added ~20 fabricated mappings: abborrfile→sea_bass, gosfile→sea_bass,
sikfile→cod_fillet, kalvkotlett→pork_chop, lammbringa→brisket, and others.
None of these are the same animal. The user discovered this and had to correct it.
The fix: remove all cross-species mappings. Cuts without recipe research show no recipe card.

---

### Success Rate Impact

| Approach | Success Rate |
|----------|-------------|
| Code/data where source was READ and VERIFIED first | 80–95% |
| Fabricated names or "close enough" mappings | **0%** |

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
