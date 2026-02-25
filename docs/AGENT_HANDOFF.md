# Agent Handoff Document

## Project Status: Ready for Phase 7 & 8 Implementation

**Current Version:** v0.5.1.7  
**Last Updated:** 25 February 2026  
**Previous Agent:** Completed Phases 1–6 of GUI Redesign

This document provides guidance for the next development agent taking over Phase 7 (Multilingual & Measurement Systems) and Phase 8 (Polish & Testing).

---

## What's Working Now (v0.5.1.7)

### GUI Redesign — Phases 1–6 Complete
- ✅ Welcome screen with appliance selector (MEATER, Ninja Combi, Other Appliance, Previous Cooks)
- ✅ MEATER Path: Protein/cut/doneness cook, custom temp cook (30–100°C), recent MEATER cooks
- ✅ Ninja Combi Path: Recipe builder, 17 built-in recipes, AI recipes, recent cooks
- ✅ AI Recipe Builder: Ingredients → style/complexity/portions/cuisines → AI generation → cook flow → rate → save
- ✅ Previous Cooks: Browse history, view details, restart any cook type
- ✅ Recipe Cook Flow: Overview → step-by-step → finish with star ratings + notes
- ✅ Cook history persistence (cook_history.json via storage.py)
- ✅ View Assist blueprint (blueprints/view_assist_open_cooking_panel.yaml)

### Data Flow
```
MEATER+ Probe → ESP32 (BLE Client) → Home Assistant → Kitchen Cooking Engine
                                                          ↓
User → Panel UI → Path Routing → Cook Flow / AI Generation → History
```

---

## What Needs to Be Built

### Phase 7: Multilingual & Measurement Systems

See [GUI Redesign ToR](GUI_REDESIGN_TERMS_OF_REFERENCE.md) § 4.3.1, § 4.3.2, § 4.3.3 for full specification.

#### 7.1 Translation Infrastructure (i18n)
- All UI text in `panel-class-template.js` is currently hardcoded English
- Need: Translation system for all UI text, labels, buttons, error messages
- **Languages to implement:** Swedish (sv), English (en)
- **Default:** Follow Home Assistant's configured language
- **Approach options:**
  - JSON translation files loaded at startup
  - Home Assistant's built-in translation system
  - Inline translation object in the panel JS

#### 7.2 Measurement System Conversion
- **Swedish** (default): dl, msk (tablespoon), tsk (teaspoon), krm (spice measure), g, hg, kg, °C
- **UK**: Imperial where applicable, °C
- **US**: cups, tbsp, tsp, oz, lb, °F
- **Pure Metric**: ml, cl, dl, l, g, kg, °C
- Need: User-selectable preference in settings, persistent across sessions
- Need: Real-time conversion of all ingredient quantities and temperatures
- **Note:** Ninja Combi recipes already have inline metric conversions (US cups→dl, oz→g) — these need to be replaced with dynamic conversion

#### 7.3 Serving Size Scaling
- AI recipes already have a portions slider (1–8) sent to AI during generation
- Need: Automatic ingredient scaling for ALL recipes (not just AI)
- Need: Intelligent rounding (e.g., "1.33 eggs" → "1–2 eggs")
- Need: +/- buttons or dropdown in recipe overview before starting cook
- Need: Display original vs adjusted serving count

#### Translation Scope
Everything that needs translation:
- Path names and navigation buttons
- Category names and cooking methods
- Protein, cut, doneness names
- Recipe instructions and ingredient names
- Error messages and system notifications
- Button labels and headers
- Guide step instructions

### Phase 8: Polish & Testing

#### 8.1 Visual Design
- Consistent styling across all paths
- Proper spacing, alignment, colors
- Clear visual hierarchy

#### 8.2 Mobile Responsive
- Test and optimize for phone-sized screens
- Touch-friendly button sizes
- Scrollable content areas

#### 8.3 Missing Features from ToR
These were specified in the ToR but not yet implemented:
- **MEATER probe as recipe subprocess** — "Start MEATER Probe" button in recipe cook steps (ToR § 7.2, § 7.4)
- **Ingredient bolding** — Bold ingredients used in current guide step (ToR § 7.2)
- **Deselectable secondary appliances** — Checkboxes in AI Recipe Builder path (ToR § 5.4)

#### 8.4 Edge Cases
- Empty states (no history, no appliances, no AI agent)
- Error recovery (API failures, network issues)
- Large recipe rendering performance
- Timer accuracy across browser tabs

---

## Important Files

### Source of Truth

| File | Purpose | Edit? |
|------|---------|-------|
| `www/panel-class-template.js` | **UI source code** (all frontend logic) | ✅ Edit this |
| `www/kitchen-cooking-panel.js` | Auto-generated from template + data | ❌ Never edit |
| `cooking_data.py` | International meat/cut/temp data | ✅ Edit for data |
| `swedish_cooking_data.py` | Swedish meat/cut/temp data | ✅ Edit for data |
| `ninja_combi_data.py` | Ninja Combi recipes (with metric) | ✅ Edit for data |
| `ai_recipe_builder.py` | AI recipe generation logic | ✅ Edit for AI |
| `ai_recipe_data.py` | AI ingredient & style definitions | ✅ Edit for AI data |
| `generate_frontend_data.py` | Generates JS from template + data | ✅ Run after edits |

### Other Key Files

| File | Purpose |
|------|---------|
| `__init__.py` | Integration setup, service registration, panel registration |
| `sensor.py` | Cooking session sensor entity |
| `api.py` | REST API endpoints (AI recipe, appliance, etc.) |
| `storage.py` | Cook history persistence (cook_history.json) |
| `config_flow.py` | Configuration UI |
| `const.py` | Constants (PANEL_VERSION auto-incremented by generator) |
| `services.yaml` | HA service definitions |
| `manifest.json` | HACS manifest (version must match __init__.py) |

### Documentation

| File | Purpose |
|------|---------|
| `docs/GUI_REDESIGN_TERMS_OF_REFERENCE.md` | Full GUI specification (Phase 1–8) |
| `docs/AI_RECIPE_BUILDER.md` | AI recipe feature docs |
| `docs/TERMS_OF_REFERENCE.md` | Original project specification |
| `.github/copilot-instructions.md` | Agent instructions (DO NOT read directly) |

---

## Build Workflow

```bash
# After editing panel-class-template.js OR cooking_data.py:
cd custom_components/kitchen_cooking_engine
python3 generate_frontend_data.py

# Version files to update (ALL must match):
# 1. manifest.json → "version"
# 2. __init__.py → __version__
# 3. __init__.py → Last Change comment
# 4. const.py → Last Change comment (PANEL_VERSION auto-incremented)

# Verify:
grep '"version"' manifest.json
grep '__version__' __init__.py
grep 'PANEL_VERSION' const.py
```

---

## Key Design Principles

1. **Source of truth**: UI in `panel-class-template.js`, data in Python files, generated JS is output
2. **Low user workload** — Never require excessive data entry
3. **Local-first** — No cloud dependencies (except AI generation via user's chosen agent)
4. **Progressive disclosure** — Show relevant options at each navigation level
5. **Appliance-centric** — Appliances are first-class navigation elements
6. **Recipe flexibility** — Recipes work with or without MEATER probe

---

## Common Pitfalls (from Previous Agent Experience)

1. ❌ **Editing kitchen-cooking-panel.js directly** — Gets overwritten by generator
2. ❌ **Fabricating method names** — Always READ source code, never guess from patterns
3. ❌ **Forgetting to run generate_frontend_data.py** — Panel won't reflect changes
4. ❌ **Version mismatch** — manifest.json, __init__.py, and const.py must all match
5. ❌ **View Assist dashboard** — Was removed (v0.5.0.73). Don't re-add without understanding how View Assist views work
6. ❌ **AI recipe data format** — Suggestions have `main_ingredients[]`, Detail has `ingredients[]` and `instructions[]` — different APIs return different shapes

---

## Getting Started

1. Read `docs/GUI_REDESIGN_TERMS_OF_REFERENCE.md` — especially § 4.3 (multilingual), § 4.3.2 (measurements), § 4.3.3 (serving size), and § 15 (deviations)
2. Read `www/panel-class-template.js` — this is the entire frontend
3. Understand the path routing: `_currentPath` switch in `_renderContent()`
4. Run `python3 generate_frontend_data.py` to verify the build workflow
5. Start with the translation infrastructure (Phase 7.1) as it touches every UI string
