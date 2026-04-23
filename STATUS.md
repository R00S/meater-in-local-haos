# Project Status - Kitchen Cooking Engine

**Last Updated:** 23 April 2026  
**Current Version:** v0.6.0.05  
**Status:** Development release (GUI Redesign Phases 1–7 complete — Phase 7: Multilingual & Measurement Systems shipped)

## Project Direction

This project has evolved from a MEATER BLE proxy into a comprehensive **Kitchen Cooking Engine** — a local-first, multi-appliance cooking system for Home Assistant with AI-powered recipe generation, step-by-step cook flow, and temperature monitoring.

---

## 🔄 Current Status — v0.6.0.05 (Development)

### GUI Redesign Progress (from [GUI Redesign ToR](docs/GUI_REDESIGN_TERMS_OF_REFERENCE.md))

| Phase | Description | Status |
|-------|-------------|--------|
| Phase 1 | Foundation — Welcome screen, path routing, navigation | ✅ Complete |
| Phase 2 | MEATER Path — Cooking interface, recent cooks, custom temp cook | ✅ Complete |
| Phase 3 | Previous Cooks Path — History, detail view, restart | ✅ Complete |
| Phase 4 | Recipe Cook Flow — Steps, timer, ratings, overview | ✅ Complete |
| Phase 5 | Ninja Combi Path — Recipe builder, built-in recipes, AI link | ✅ Complete |
| Phase 6 | AI Recipe Builder Path — Ingredients, styles, cuisines, generation, cook flow, save/restart | ✅ Complete |
| Phase 7 | Multilingual & Measurement Systems | ✅ Complete (v0.6.0.x) |
| Phase 8 | Ingredient Levels & Cooking Modes | ⬜ Not started |
| Phase 9 | Polish & Testing | ⬜ Not started |

**Phase 7 — Multilingual & Measurement Systems (v0.6.0.x):**
- ✅ Swedish measurement system — metric, imperial, and Swedish (dl/msk/tsk) unit catalogs; API endpoint; persisted per user
- ✅ Full `_t()` i18n coverage — every user-facing panel string translated; zero hardcoded English
- ✅ AI recipes in the right language — system prompt includes language directive; prevents Danish/English bleed-through
- ✅ AI recipes in the right units — `measurement_system` sent with every AI request; ingredient text converted as safety net
- ✅ Swedish ingredient display — `_ingDisplayName()` helper; staples, categories, cooking styles also translated
- ✅ Per-step ingredient tagging — `ingredients` array in AI JSON; active ingredients highlighted during cook flow
- ✅ Swedish ingredient corrections — `Chiliflingor`, plus 7 missing entries added (`horseradish`, `balsamic`, `beans`, `ciabatta`, `flat_bread`, `flour_tortillas`, `taco_shells`)
- ✅ Swedish decimal comma — numbers formatted as `2,4 dl` when language is Swedish
- ✅ Hide-other-language-tree checkbox — Temperaturdata card; `localStorage`-persisted
- ✅ On-the-fly target temperature adjustment — slider/buttons UI in active MEATER cook view; `set_target` service registered

**Navigation & Paths:**
- ✅ Welcome screen with appliance selector (MEATER, Ninja Combi, Other Appliance, Previous Cooks)
- ✅ Ongoing cooks badge on welcome screen showing active MEATER + recipe cooks with live status
- ✅ Path routing with back navigation throughout
- ✅ 🏠 Home button in all active cook views to return to welcome screen
- ✅ MEATER Path: Start cooking, recent MEATER cooks
- ✅ Ninja Combi Path: Recipe builder, built-in recipes, AI recipes, recent cooks
- ✅ AI Recipe Builder Path: Full 3-step flow (ingredients → style → generate)
- ✅ Previous Cooks Path: Browse, view details, restart any cook type

**Stability & UX (v0.5.4.x):**
- ✅ Welcome screen auto-refresh: exited cooks disappear immediately without manual refresh
- ✅ Blank tab fix: detects WebSocket reconnect + forces Shadow DOM repaint on return
- ✅ Recipe cook persistence: sessionStorage survives HA sidebar navigation
- ✅ Parallel recipe cooks: multiple recipe cooks running simultaneously (array-based state)
- ✅ Cross-device cook visibility: recipe cooks visible on all devices via server sync
- ✅ MEATER restart improvements: session dropdown on waiting screen, unknown entity handling
- ✅ MEATER cook rating screen: rate ease & result (1–5 stars) after cook completion
- ✅ MEATER cook restart with Swedish data source: cooks with Swedish cuts now restart correctly
- ✅ Mobile responsive: welcome screen cards fit properly in portrait and landscape on companion app

**AI Enhancements (v0.5.4.x):**
- ✅ AI ingredient ceilings: style-dependent limits (50%–200% extra) scaled by complexity
- ✅ Honest cooking time: AI includes all prep time (soaking, brining, marinating) in estimates

**Multi-Appliance Management (v0.5.2.x):**
- ✅ Configure multiple kitchen appliances (Ninja Combi, MultiFry, Oven, Stovetop, Microwave, Custom)
- ✅ Feature type classification: Standard / Modified / Special per feature per appliance
- ✅ 30+ cooking features in centralized feature catalog
- ✅ Feature modification notes: editable from both Appliances tab and AI Recipe Builder appliance path
- ✅ Per-appliance feature notes saved via REST API
- ✅ AI recipe builder considers feature types and modification notes when generating recipes

**MEATER Probe Cooking:**
- ✅ Protein/cut/doneness selection with International (USDA) and Swedish data
- ✅ Custom temperature cook (30–100°C, any target without protein selection)
- ✅ Real-time temperature monitoring with graph
- ✅ Dynamic ETA calculation
- ✅ Notifications (mobile, TTS, persistent, indicator light)
- ✅ Cook history with notes

**AI Recipe Builder:**
- ✅ Ingredient selection (300+ categorized ingredients: proteins, produce, grains, dairy, spices)
- ✅ Cuisine-specific ingredient lists with region fallback
- ✅ 11 cooking styles with style-dependent complexity defaults
- ✅ Complexity slider (1–5: Very Simple → Chef Level)
- ✅ Portions slider (1–8 servings)
- ✅ 70+ cuisines in 11 collapsible regions (Nordic, East Asian, Southeast Asian, South Asian, Middle Eastern, European, North American, Latin American, Caribbean, African, Oceanian)
- ✅ Multi-cuisine selection for fusion recipes
- ✅ AI generation with cancelable loading dialog
- ✅ 4 diverse recipe suggestions per request with 📖 Classic / 🤖 Original badges
- ✅ Full recipe detail fetch before cook flow
- ✅ Recipe cook flow with step-by-step navigation
- ✅ Star rating (ease + result) on completion
- ✅ Save to cook history with full recipe data
- ✅ Restart AI recipes from Previous Cooks

**Recipe Cook Flow:**
- ✅ Overview page with ingredients and timeline
- ✅ Step-by-step navigation (back/next)
- ✅ Elapsed timer since "Start Cooking"
- ✅ Finish page with star ratings and notes
- ✅ Save completed cook to history

**Ninja Combi:**
- ✅ 17 built-in recipes with metric conversions (US cups→dl, oz→g, lb→kg, °F→°C)
- ✅ 12 cooking modes
- ✅ MEATER probe integration for temperature monitoring
- ✅ Recipe builder for custom Ninja Combi recipes

### What's Not Yet Implemented

- ⬜ **Ingredient Levels / pantry state** (Phase 8) — No shelf/fridge/freezer tracking yet
- ⬜ **Cooking Modes** (Phase 8) — Ignore Shelf (A), Cook Now (B), Cook Later (C) not yet built
- ⬜ **MEATER probe as subprocess** in recipe cook — Button exists in ToR but not implemented
- ⬜ **Deselectable secondary appliances** — ToR specifies checkboxes, not yet built
- ⬜ **View Assist dashboard** — Attempted in v0.5.0.71–72, removed in v0.5.0.73 (was creating broken HA panels, not proper View Assist views). Blueprint kept.

### Known Deviations from ToR

See [GUI Redesign ToR § 15. Implementation Deviations](#) for a full list of deviations.

---

## 📁 Repository Structure

```
├── custom_components/kitchen_cooking_engine/  # HACS Custom Integration
│   ├── __init__.py            # Integration setup (v0.6.0.05)
│   ├── config_flow.py         # Configuration UI (multi-appliance)
│   ├── const.py               # Constants (Panel v256)
│   ├── cooking_data.py        # International cooking data (USDA)
│   ├── swedish_cooking_data.py # Swedish cooking data (Livsmedelsverket)
│   ├── measurements.py        # Measurement unit catalog (metric/imperial/Swedish)
│   ├── ninja_combi_data.py    # Ninja Combi recipes (with metric conversions)
│   ├── ai_recipe_builder.py   # AI recipe generation engine
│   ├── ai_recipe_data.py      # AI recipe ingredients, cuisines, styles data
│   ├── sensor.py              # Cooking session sensor entity
│   ├── storage.py             # Cook history persistence
│   ├── api.py                 # REST API endpoints (incl. AI recipe, appliance, measurements APIs)
│   ├── appliance_manager.py   # Multi-appliance management
│   ├── i18n/                  # Translation files (en.json, sv.json)
│   ├── custom_sentences/      # Voice command definitions
│   ├── blueprints/            # Automation blueprints (View Assist)
│   ├── appliances/            # Appliance implementations & feature catalog
│   ├── generate_frontend_data.py # Generates JS from template + data
│   ├── services.yaml          # Service definitions
│   ├── manifest.json          # HACS manifest (v0.6.0.05)
│   └── www/                   # Frontend panel
│       ├── panel-class-template.js   # UI source (edit this)
│       └── kitchen-cooking-panel.js  # Auto-generated (do not edit)
├── meater.yaml                 # ESPHome BLE client config
├── hacs.json                   # HACS repository config
├── docs/                       # Project documentation
└── README.md                   # Installation & usage guide
```

## 🚀 Next Steps — Phase 8 & 9

### Phase 8: Ingredient Levels & Cooking Modes
1. **Compulsory Ingredients** — Clickable badges to mark must-include ingredients
2. **Shelf Management** — Optional fridge/larder/freezer/shelf tracking
3. **Cooking Modes** — Ignore Shelf (A), Cook Now (B), Cook Later (C)
4. **Post-Cook Shelf Update** — Deduct used ingredients, generate shopping list
5. **Self-implemented ingredient database** — HA-native pantry state (Option C decided over Grocy/Mealie)

### Phase 9: Polish & Testing
1. **Visual design refinement** — Consistent styling across all paths
2. **Mobile responsive** — Optimize for small screens
3. **Edge case handling** — Empty states, error recovery
4. **MEATER probe as recipe subprocess** — Start probe monitoring from within recipe steps
5. **Ingredient bolding** — Highlight ingredients used in current step
6. **Performance optimization** — Large recipe rendering

See [Agent Handoff Document](docs/AGENT_HANDOFF.md) for detailed guidance for the next development agent.

## 📚 Documentation

| Document | Description |
|----------|-------------|
| [Terms of Reference](docs/TERMS_OF_REFERENCE.md) | Original project specification |
| [GUI Redesign ToR](docs/GUI_REDESIGN_TERMS_OF_REFERENCE.md) | GUI redesign specification (Phase 1-8) |
| [AI Recipe Builder](docs/AI_RECIPE_BUILDER.md) | AI recipe feature documentation |
| [Feature Requirements](docs/FEATURE_REQUIREMENTS.md) | Detailed feature specs |
| [Use Cases](docs/USE_CASES.md) | 12 real-world scenarios |
| [View Assist Integration](docs/VIEW_ASSIST_INTEGRATION.md) | Voice control setup |
| [Ninja Combi Guide](docs/NINJA_COMBI_GUIDE.md) | Ninja Combi integration guide |
| [Agent Handoff](docs/AGENT_HANDOFF.md) | Handoff doc for next development agent |

## 🔗 Key Resources

- **MEATER BLE Protocol**: https://github.com/nathanfaber/meaterble
- **View Assist**: https://github.com/dinki/View-Assist
- **Grill Buddy**: https://github.com/jeroenterheerdt/grillbuddy
