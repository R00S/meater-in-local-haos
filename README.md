# Kitchen Cooking Engine

[![HACS Badge](https://img.shields.io/badge/HACS-Custom-41BDF5.svg)](https://github.com/hacs/integration)
[![Home Assistant](https://img.shields.io/badge/Home%20Assistant-2024.1.0+-blue.svg)](https://www.home-assistant.io/)
[![Alpha](https://img.shields.io/badge/Status-ALPHA-orange.svg)](https://github.com/R00S/meater-in-local-haos)
[![Buy Me A Coffee](https://img.shields.io/badge/Buy%20Me%20A%20Coffee-Support-yellow?style=flat&logo=buy-me-a-coffee)](https://buymeacoffee.com/R00S)

⚠️ **DEVELOPMENT RELEASE** — GUI Redesign Phases 1–6 complete + v0.5.5.x stability & UX features. Functional but not yet production-ready. Phase 7 (Multilingual/Measurements) and Phase 8 (Polish) are **not yet started**.

A local-first, AI-assisted kitchen cooking system for Home Assistant that helps you plan, prepare, and execute meals using your ingredients, equipment, time constraints, recipes, and temperature sensors.

## 🎯 Project Vision

Build a smart cooking engine that behaves like a highly capable kitchen assistant:
- Understands your available ingredients and kitchen gear
- Generates custom recipes with AI (OpenAI via Home Assistant conversation agents)
- Creates step-by-step cooking instructions with timer
- Uses temperature probes when relevant (MEATER+, etc.)
- Supports multiple appliances (Ninja Combi, MultiFry, etc.)
- Works entirely locally (Home Assistant + local apps)

## 📊 Current Status

**v0.5.5.90** — Development release (March 2026)

GUI Redesign Phases 1–6 complete + v0.5.2.x appliance features + v0.5.4.x stability & UX + v0.5.5.x tab navigation & AI targeting. Phase 7 (Multilingual & Measurement Systems) and Phase 8 (Polish & Testing) are **not yet started**. See [STATUS.md](STATUS.md) for full progress tracking.

### v0.5.5.x Features (March 2026)
- ✅ **Tab navigation preserved** — Returning to the panel after switching browser tabs or OS windows no longer resets to the welcome screen; all navigation paths are preserved
- ✅ **hasChanged fix** — Panel re-renders correctly after Home Assistant state changes (was silently skipping re-renders before)
- ✅ **Real backend refresh on return** — Appliances, AI settings, and active recipe cooks are reloaded whenever the panel becomes visible again
- ✅ **AI recipe appliance targeting** — Opening the AI Recipe Builder with an appliance selected auto-injects `"use <ApplianceName> programs"` as the first ingredient; the chip is removable for fully generic recipes

### v0.5.4.x Features (March 2026)
- ✅ **Ongoing cooks badge** — Welcome screen shows active MEATER + recipe cooks with live status
- ✅ **Parallel recipe cooks** — Multiple recipe cooks running simultaneously (one per appliance)
- ✅ **Cross-device cook visibility** — Recipe cooks visible on all devices via server sync
- ✅ **MEATER cook rating screen** — Rate ease & result (1–5 stars) after MEATER cook completion
- ✅ **AI ingredient ceilings** — Style-dependent ingredient limits prevent overly complex recipes
- ✅ **Honest cooking time** — AI includes all prep time (soaking, brining, marinating) in estimates
- ✅ **Blank tab fix** — Detects WebSocket reconnect + forces Shadow DOM repaint on return
- ✅ **Recipe cook persistence** — sessionStorage survives HA sidebar navigation
- ✅ **Welcome screen auto-refresh** — Exited cooks disappear immediately without manual refresh
- ✅ **MEATER restart improvements** — Session dropdown on waiting screen, unknown entity handling
- ✅ **🏠 Home button** — Navigate back to welcome from any active cook view
- ✅ **MEATER Swedish cook restart** — Cooks with Swedish data source restart correctly from Previous Cooks
- ✅ **Mobile responsive** — Welcome screen cards fit properly in portrait and landscape on companion app

### v0.5.2.x Features (February 2026)
- ✅ **Multi-appliance management** — Configure multiple appliances (Ninja Combi, MultiFry, Standard Oven, Stovetop, Microwave, Custom)
- ✅ **Feature type classification** — Standard/Modified/Special per feature per appliance, with a 30+ feature catalog
- ✅ **Feature modification notes** — Editable notes for modified/special features, saved inline from the appliance path view
- ✅ **Categorized AI ingredients** — 300+ ingredients organized by category (proteins, produce, grains, dairy, spices)
- ✅ **Cuisine-specific ingredients** — Authentic ingredient lists per cuisine, with region fallback
- ✅ **Recipe origin badges** — 📖 Classic (known/googleable) or 🤖 Original (AI-created) on suggestion cards
- ✅ **Appliance-aware AI recipes** — AI considers feature types and modification notes when generating recipes

### v0.5.1.x Features (February 2026)
- ✅ **Complete GUI Redesign** — Welcome screen → appliance paths → cooking flows
- ✅ **AI Recipe Builder** — Full 3-step flow: select ingredients → choose style/cuisines → generate recipes
- ✅ **70+ world cuisines** — 11 collapsible regions (Nordic, East/SE/South Asian, Middle Eastern, European, N/S American, Caribbean, African, Oceanian) with multi-select for fusion
- ✅ **Complexity & portions** — Adjustable complexity (1–5) and portions (1–8) per recipe
- ✅ **Recipe cook flow** — Step-by-step navigation with elapsed timer and star ratings
- ✅ **AI recipe save & restart** — Full recipe data saved to cook history, restartable from Previous Cooks
- ✅ **Cancelable generation** — Loading dialog with Cancel button and time estimate
- ✅ **Custom temperature cook** — Set any target temp (30–100°C) in MEATER path without protein selection
- ✅ **Metric conversions** — All Ninja Combi recipes include metric equivalents (cups→dl, oz→g, lb→kg, °F→°C)

### Core Features (all versions)
- ✅ **MEATER+ BLE integration** — Real-time temperature monitoring via ESPHome
- ✅ **185+ international cuts** (USDA) + **89 Swedish cuts** (Livsmedelsverket)
- ✅ **17 built-in Ninja Combi recipes** with 12 cooking modes
- ✅ **Multi-appliance support** — Ninja Combi, MultiFry, Standard Oven, Stovetop, Microwave, Custom appliances
- ✅ **Dynamic ETA** — Time-to-target based on temperature rise rate
- ✅ **Notifications** — Mobile push, TTS voice, persistent, indicator light (blue→red→white)
- ✅ **Cook history** — Log, review, and restart previous cooks
- ✅ **View Assist** — Blueprint for voice navigation to cooking panel

See [STATUS.md](STATUS.md) for detailed project status.

---

## 🤖 AI Recipe Builder

The AI Recipe Builder generates custom recipes using AI (OpenAI or any HA conversation agent) based on your ingredients, cooking style, cuisine preferences, and available kitchen equipment.

### Features

- **30+ Common Ingredients** — Proteins (9), Vegetables (12), Grains (5), Dairy (5), plus custom ingredient input
- **11 Cooking Styles** — Quick & Easy, Gourmet, Healthy, Comfort Food, Family Friendly, Meal Prep, One Pot, Low Carb, High Protein, Vegetarian, Vegan
- **70+ World Cuisines** — 11 collapsible regions: Nordic & Scandinavian, East Asian, Southeast Asian, South Asian, Middle Eastern, European, North American, Latin American, Caribbean, African, Oceanian — select multiple for fusion
- **Complexity Slider** — 1 (Very Simple) to 5 (Chef Level), with style-dependent defaults
- **Portions Slider** — 1 to 8 servings
- **4 Diverse Suggestions** — AI generates 4 quite different recipes from your selections
- **Full Cook Flow** — Step-by-step instructions with elapsed timer, then star ratings on completion
- **Save & Restart** — Completed AI recipe cooks saved to history with full recipe data; restartable from Previous Cooks
- **Cancelable Generation** — Cancel button during AI generation with time estimate (10–30 seconds)
- **Appliance-Aware** — AI considers your configured appliances when generating recipes
- **User-Configurable Agent** — Choose which AI conversation agent to use via settings (⚙️ button)

### Setup Requirements

1. **Install an AI Conversation Integration** (choose one):
   - **Extended OpenAI Conversation** (recommended) - Most flexible, supports advanced features
   - **OpenAI Conversation** (standard) - Built-in Home Assistant integration
   - **Home Assistant Cloud** - If you have Nabu Casa subscription

2. **Configure Your AI Assistant:**
   - Go to **Settings** → **Voice Assistants** → **Add Assistant**
   - Select your preferred AI integration
   - Enter API key (if required)
   - **Important:** Set **max_tokens** to **2000 or higher** (prevents response cut-off)
   - Configure your preferred model (GPT-4 recommended for best results)

3. **Configure AI Recipe Builder:**
   - Open Kitchen Cooking Engine panel
   - Click **⚙️ AI Recipe Builder Settings** card on the welcome screen
   - Enter your AI conversation agent ID
   - **To find your agent ID:** Developer Tools → States → Search for "conversation." → Copy entity ID
   - Common agent IDs:
     - `extended_openai_conversation_2` (Extended OpenAI Conversation)
     - `conversation.openai_conversation` (Standard OpenAI Conversation)
     - `conversation.home_assistant_cloud` (Nabu Casa Cloud)

### Using the AI Recipe Builder

1. Open the Kitchen Cooking Engine panel
2. Click an appliance or **🤖 AI Recipe Builder** button
3. Select your **available ingredients** (minimum 2, click to toggle)
   - If you opened the builder from an appliance, `"use <ApplianceName> programs"` is pre-filled as the first ingredient so the AI targets that appliance's cooking programs. Click **×** to remove it for fully generic recipes.
4. Click **Next: Choose Cooking Style**
5. Choose your **cooking style** (Quick & Easy, Gourmet, etc.)
6. Adjust **complexity** (1–5) and **portions** (1–8)
7. Optionally select **cuisines** from the region dropdowns (multi-select for fusion)
8. Click **Generate AI Recipes**
9. Browse the 4 AI-generated suggestions (name, description, cook time, difficulty)
10. Click **Start Cooking This Recipe** on your preferred recipe
11. Follow the **step-by-step cook flow** with elapsed timer
12. **Rate** the recipe (ease + result, 1–5 stars) and add optional notes
13. Recipe saved to **Previous Cooks** for future restart

### Troubleshooting

**"Failed to generate recipes" errors:**
- Check your AI agent configuration in Settings (⚙️ button)
- Verify your API key is valid and has available credits
- Ensure max_tokens is set to 2000 or higher

**"MAX_TOKENS" or "response was cut off" errors:**
- Increase max_tokens setting in your AI assistant configuration
- Recommended: 2000 or higher for recipe generation

**"Content violations" errors:**
- Try different ingredient combinations
- Try a different cooking style
- This can be a false positive - try again with slight variations

**Agent ID not working:**
- Check Developer Tools → States for correct agent entity ID
- Update agent ID in AI Recipe Builder settings (⚙️ button)
- Restart Home Assistant after changing configuration

The AI Recipe Builder works entirely through Home Assistant's conversation component - no additional cloud services or accounts required beyond your chosen AI provider!

---

## 🏗️ Installation via HACS

### Prerequisites

- Home Assistant 2024.1.0 or newer
- [HACS](https://hacs.xyz/) installed and configured

### Step 1: Add Custom Repository

1. Open Home Assistant
2. Go to **HACS** → **Integrations**
3. Click the **⋮** (three dots) menu in the top right
4. Select **Custom repositories**
5. Enter the repository URL:
   ```
   https://github.com/R00S/meater-in-local-haos
   ```
6. Select **Integration** as the category
7. Click **Add**

### Step 2: Install the Integration

1. In HACS → Integrations, click **+ Explore & Download Repositories**
2. Search for **Kitchen Cooking Engine**
3. Click on it and then click **Download**
4. **Restart Home Assistant**

### Step 3: Configure the Integration

1. Go to **Settings** → **Devices & Services**
2. Click **+ Add Integration**
3. Search for **Kitchen Cooking Engine**
4. Select your temperature sensor (e.g., MEATER probe sensor)
5. Optionally configure additional sensors and notifications:
   - **Ambient Temperature Sensor** - For better ETA predictions
   - **Battery Level Sensor** - Monitor probe battery
   - **Indicator Light** - RGB light that changes color during cooking
   - **Notify Service** - Mobile app push notifications
   - **TTS Entity** - Text-to-speech for voice announcements
   - **Media Player** - Speaker for TTS announcements
6. Choose your preferred temperature unit (Celsius/Fahrenheit)
7. Click **Submit**

> **Note:** No `configuration.yaml` editing is required! The integration is fully configured through the UI.

### Step 4: Access the Cooking Panel

After installation, a **"Cooking"** entry will appear in your Home Assistant sidebar. Click it to access the cooking interface.

The sidebar panel provides:
- **Data Source**: Choose between International (USDA) or Swedish temperature standards
- **Protein Selection**: Choose from Beef, Pork, Poultry, Fish, Lamb, Game
- **Cut Selection**: Pick the specific cut you're cooking (185+ international, 89 Swedish cuts)
- **Doneness Levels**: Visual buttons with ⭐ for recommended doneness per cut
- **Temperature Fine-tuning**: Slider to adjust target temperature (35-100°C)
- **Cooking Methods**: Oven, Pan, Grill, Air Fryer, and more
- **Live Monitoring**: Real-time temperature and progress tracking
- **Temperature Graph**: Visual graph of tip and ambient temps from cook start
- **Cook History**: View past cooks with peak temps and notes
- **Cooking Notes**: Add notes during active cooks
- **Control Actions**: Stop cook, start rest, complete session

### Manual Installation (Alternative)

If you prefer not to use HACS:

1. Download the `custom_components/kitchen_cooking_engine` folder from this repository
2. Copy it to your Home Assistant's `config/custom_components/` directory
3. Restart Home Assistant
4. Configure via Settings → Devices & Services → Add Integration

---

### 🇸🇪 Swedish Cuts (Svenska)

The integration includes Swedish-specific cuts with proper Swedish terminology:

| Category | Swedish Name | Examples |
|----------|--------------|----------|
| **Nötkött** | Beef | Entrecôte, Ryggbiff, Oxfilé, Högrev, Bringa, Oxsvans |
| **Fläsk** | Pork | Fläskkotlett, Fläskfilé, Fläskytterfilé, Julskinka, Revbensspjäll |
| **Lamm** | Lamb | Lammstek, Lammrack, Lammkotletter |
| **Kalv** | Veal | Kalvstek, Kalvfilé, Kalvkotlett, Kalvschnitzel |
| **Vilt** | Game | Älgfilé, Renfilé, Rådjursfilé, Hjortfilé, Vildsvin |
| **Fågel** | Poultry | Kycklingbröst, Kycklinglegg, Kalkonbröst, Ankbröst |
| **Fisk** | Fish | Laxfilé, Torskfilé, Tonfiskskiva, Hel lax/torsk/sik/röding på ben |

Swedish doneness levels: blodig, medium_rare, medium, medium_well, genomstekt, långkokt

## 🍖 Supported Proteins & Cuts

### Beef
- **Steaks**: Ribeye, Sirloin, Filet Mignon, NY Strip, T-Bone, Flank, Skirt, Flat Iron, Hanger, Tri-Tip
- **Roasts**: Prime Rib, Beef Tenderloin, Top Round, Sirloin Tip
- **Braising**: Chuck Roast, Brisket, Short Ribs, Beef Shank
- **Ground**: Burgers, Meatloaf

### Pork
- **Chops & Tenderloin**: Pork Chops, Pork Tenderloin
- **Roasts**: Pork Loin, Pork Shoulder/Boston Butt, Pork Belly
- **Ribs**: Baby Back, Spare Ribs, St. Louis Style
- **Ham**: Fresh Ham, Cured Ham
- **Ground**: Pork Sausage

### Poultry
- **Chicken**: Whole, Breast, Thigh, Leg, Wing
- **Turkey**: Whole, Breast, Leg
- **Duck**: Breast, Whole, Leg Confit
- **Ground**: Ground Chicken, Ground Turkey

### Fish & Seafood
- **Salmon**: Fillet, Steak
- **Tuna**: Steak
- **White Fish**: Cod, Halibut, Sea Bass, Swordfish, Mahi-Mahi
- **Shellfish**: Shrimp, Lobster Tail, Scallops

### Lamb
- **Roasts**: Leg of Lamb, Rack of Lamb, Lamb Shoulder
- **Chops**: Lamb Chops, Lamb Loin Chops
- **Ground**: Ground Lamb, Lamb Kofta

### Game
- **Venison**: Steak, Roast, Loin
- **Wild Boar**: Chop, Shoulder
- **Bison**: Steak, Burger

### 🥬 Vegetables
- **Root**: Baked Potato, Roasted Potatoes, Carrots, Parsnips, Beets, Sweet Potato
- **Greens**: Broccoli, Brussels Sprouts, Asparagus, Green Beans, Spinach
- **Alliums**: Roasted Onion, Caramelized Onions, Roasted Garlic, Leeks
- **Squash**: Zucchini, Butternut Squash, Acorn Squash, Spaghetti Squash
- **Cruciferous**: Cauliflower, Cabbage
- **Other**: Bell Peppers, Mushrooms, Corn, Eggplant, Tomatoes

## 🍳 Supported Cooking Methods

### Kitchen (Indoor)
| Method | Description |
|--------|-------------|
| **Oven Roasting** | Dry heat for roasts and whole poultry |
| **Oven Baking** | Gentle heat for fish and chicken |
| **Oven Broiling** | Direct high heat from above |
| **Pan Frying** | Direct heat in pan with oil |
| **Pan Searing** | High heat for crust, often + oven finish |
| **Sautéing** | Quick cooking with movement |
| **Braising** | Slow cooking in liquid |
| **Poaching** | Gentle cooking in liquid |
| **Simmering** | Gentle bubbling for soups/sauces |
| **Boiling** | Vigorous bubbling |
| **Steaming** | Cooking with steam |
| **Air Fryer** | Rapid hot air circulation |
| **Sous Vide** | Precision water bath |
| **Slow Cooker** | Low, slow moist heat |
| **Pressure Cooker** | High-pressure steam cooking |

### Outdoor (Also Supported)
| Method | Description |
|--------|-------------|
| **Grill** | Direct radiant heat |
| **Smoker** | Low heat with smoke |
| **Charcoal Grill** | Traditional charcoal grilling |

## 🥷 Ninja Combi SFP700EU Support

The Kitchen Cooking Engine includes comprehensive support for the **Ninja Combi (SFP700EU)** multi-function oven, featuring:

### 12 Cooking Modes
- **Standard Modes** (use existing recipes): Convection, Air Fryer, Steamer, Proving
- **Modified Modes** (adapted recipes): Searing, Grilling, Rice/Pasta, Slow Cook
- **Combi Modes** (signature features): Combi-Crisp, Combi-Bake, Combi-Roast, Combi-Meal

### 17 Built-in Recipes
Including Combi-Crisp Chicken Thighs, Combi-Crisp Roasted Potatoes (better than traditional roasting!), Artisan Bread, Whole Chicken, Salmon Complete Meal, and more.

### MEATER+ Probe Integration
- **9 recipes** include temperature monitoring
- Real-time temperature tracking through multi-phase cooking
- Notifications when target temperature reached
- Works in all modes including steam phase
- Perfect doneness every time - no guesswork

### Features
- Multi-phase cooking programs (steam + air fry/bake/roast)
- Tray position guidance
- Temperature monitoring with MEATER probe
- Recipe conversion guidelines
- Troubleshooting tips

📖 **[Complete Ninja Combi Guide](docs/NINJA_COMBI_GUIDE.md)** - Detailed cooking modes, recipes, MEATER+ integration, and tips

The Ninja Combi excels at combining cooking methods (like steam + air fry) to create results that aren't possible with traditional single-function appliances. The integration with MEATER+ probe monitoring ensures perfect results every time - monitor internal temperature through steam phases and track progress as the exterior crisps.

## 🔔 Notifications & Alerts

### Indicator Light Control

Configure an RGB light to provide visual feedback during cooking:

| Phase | Color | Description |
|-------|-------|-------------|
| **Cooking** | Blue → Red | Color transitions from cold blue (23°C) through orange to deep red (target temperature) |
| **Resting** | Red → White | Color transitions from red to white as rest time progresses |
| **Action Needed** | Flashing Green | Flashes when target is reached or rest is complete |

The light automatically saves its state before cooking and restores it when the session ends.

### Mobile Push Notifications (HAOS 2025.11+)

To receive push notifications on your phone:

1. Go to **Settings** → **Devices & Services** → **Kitchen Cooking Engine** → **Configure**
2. In the "Notify Service" field, enter your mobile app service name
3. **To find your service name:**
   - Go to **Developer Tools** → **Actions**
   - Search for `notify.mobile_app`
   - Your service will look like `notify.mobile_app_johns_iphone`
   - Enter just the part after `notify.` → `mobile_app_johns_iphone`

### TTS Voice Announcements

To receive voice announcements on a speaker:

1. Go to **Settings** → **Devices & Services** → **Kitchen Cooking Engine** → **Configure**
2. In the "TTS Entity" field, enter your TTS entity (e.g., `tts.google_en_com`)
3. In the "Media Player" field, enter your speaker entity (e.g., `media_player.living_room_speaker`)
4. **To find your TTS entity:** Developer Tools → Actions → search `tts.speak`
5. **To find your media player:** Settings → Devices & Services → find your speaker

### Notification Events

The integration fires these events which can be used in automations:

| Event | Trigger |
|-------|---------|
| `kitchen_cooking_engine_approaching_target` | Temperature within 5°C of target |
| `kitchen_cooking_engine_five_minutes_remaining` | ETA ≤5 minutes |
| `kitchen_cooking_engine_goal_reached` | Target temperature hit |
| `kitchen_cooking_engine_rest_start` | Rest period begins |
| `kitchen_cooking_engine_rest_complete` | Rest period ends |
| `kitchen_cooking_engine_cook_started` | Cooking session starts |
| `kitchen_cooking_engine_cook_stopped` | Cooking session ends |
| `kitchen_cooking_engine_eta_changed` | ETA changes by >2 minutes |

## 🔧 Using Services

The integration provides services to control cooking sessions. You can call these from automations, scripts, or the Developer Tools → Services panel.

### Start a Cook

```yaml
service: kitchen_cooking_engine.start_cook
target:
  entity_id: sensor.cooking_session
data:
  cut_id: 100  # Ribeye Steak
  doneness: medium_rare
  cooking_method: pan_sear
```

### Start a Simple Probe Cook (NEW in v0.4.2.01)

For temperature-only monitoring without requiring cut/doneness selection:

```yaml
service: kitchen_cooking_engine.start_simple_probe_cook
target:
  entity_id: sensor.cooking_session
data:
  target_temp_c: 65  # Target temperature in Celsius
  session_name: "Ninja Combi Chicken"  # Optional display name
```

This service is perfect for:
- Monitoring temperature during appliance-specific recipes (Ninja Combi, MultiFry)
- Recipe guide sub-processes where cut/doneness isn't relevant
- Simple temperature-based cooking without full meat cut tracking

### Common Cut IDs

| Cut ID | Cut Name |
|--------|----------|
| 100 | Ribeye Steak |
| 101 | Sirloin Steak |
| 102 | Filet Mignon |
| 103 | New York Strip |
| 200 | Pork Chop |
| 201 | Pork Tenderloin |
| 300 | Whole Chicken |
| 310 | Chicken Breast |
| 400 | Salmon Fillet |

### Stop a Cook

```yaml
service: kitchen_cooking_engine.stop_cook
target:
  entity_id: sensor.cooking_session
```

### Start Resting Phase

```yaml
service: kitchen_cooking_engine.start_rest
target:
  entity_id: sensor.cooking_session
```

### Complete Session

```yaml
service: kitchen_cooking_engine.complete_session
target:
  entity_id: sensor.cooking_session
```

### Automation Example

Notify when approaching target temperature:

```yaml
automation:
  - alias: "Cooking Alert - Approaching Target"
    trigger:
      - platform: event
        event_type: kitchen_cooking_engine_approaching_target
    action:
      - service: notify.mobile_app
        data:
          title: "🍖 Almost Ready!"
          message: "{{ trigger.event.data.cut_display }} is approaching target ({{ trigger.event.data.target_temp_c }}°C)"
```

Notify when goal is reached:

```yaml
automation:
  - alias: "Cooking Alert - Goal Reached"
    trigger:
      - platform: event
        event_type: kitchen_cooking_engine_goal_reached
    action:
      - service: notify.mobile_app
        data:
          title: "✅ Done Cooking!"
          message: "{{ trigger.event.data.cut_display }} is ready! Rest for {{ trigger.event.data.rest_time_min }}-{{ trigger.event.data.rest_time_max }} minutes."
```

## 🎤 View Assist Integration

The Kitchen Cooking Engine provides integration with [View Assist](https://github.com/dinki/View-Assist) smart display devices via an automation blueprint.

### Blueprint Setup

Import the included blueprint to navigate View Assist devices to the cooking panel with a voice command:
- **Blueprint location:** `blueprints/view_assist_open_cooking_panel.yaml`
- **Voice command:** "Start cooking" → opens the Kitchen Cooking Engine panel on your View Assist device

To access the cooking interface on View Assist:
1. Navigate to Settings → Dashboards
2. Look for "Kitchen Cooking (View Assist)" 
3. Or navigate directly to `/cooking-va`
4. View Assist can navigate to this dashboard via voice commands or automations

### Voice Commands

Say: **"[wake word] start cooking"** to instantly open the cooking panel on your View Assist device.

Other supported phrases:
- "open cooking"
- "show cooking panel"
- "open cooking panel"

### Quick Setup

1. Install **Browser Mod** via HACS
2. Import the included automation blueprint
3. Say "**start cooking**" to your View Assist device

📖 **[Complete View Assist Setup Guide](docs/VIEW_ASSIST_INTEGRATION.md)** - Detailed installation, configuration, and troubleshooting

### Requirements
- Home Assistant Assist configured with wake word
- Browser Mod integration (for navigation)
- View Assist Companion App (recommended)

The integration includes custom sentences, a ready-to-use automation blueprint, and automatic dashboard creation for seamless voice control.

## 🌡️ Temperature Data Sources

All temperature data comes from publicly available sources:
- **USDA FSIS** - Safe Minimum Internal Temperatures
- **FDA Food Code** - Temperature requirements
- **Professional culinary standards** - Le Cordon Bleu, CIA, Serious Eats

The data structure is informed by the MEATER app's organization (for comprehensive coverage) but all temperature values are sourced from public guidelines.

## 📁 Repository Structure

```
├── custom_components/
│   └── kitchen_cooking_engine/    # HACS Custom Integration
│       ├── __init__.py            # Integration setup
│       ├── config_flow.py         # Configuration UI (multi-appliance)
│       ├── const.py               # Constants
│       ├── cooking_data.py        # International cooking data (USDA)
│       ├── swedish_cooking_data.py # Swedish cooking data (Livsmedelsverket)
│       ├── ninja_combi_data.py    # Ninja Combi recipes (with metric)
│       ├── ai_recipe_builder.py   # AI recipe generation engine
│       ├── ai_recipe_data.py      # AI ingredients, cuisines, styles data
│       ├── sensor.py              # Cooking session sensor entity
│       ├── storage.py             # Cook history persistence
│       ├── api.py                 # REST API endpoints
│       ├── appliance_manager.py   # Multi-appliance coordination
│       ├── appliances/            # Appliance implementations & feature catalog
│       ├── generate_frontend_data.py # Generates JS from template + data
│       ├── services.yaml          # Service definitions
│       ├── manifest.json          # HACS manifest
│       ├── translations/          # Localization
│       └── www/                   # Frontend panel
│           ├── panel-class-template.js   # UI source (edit this)
│           └── kitchen-cooking-panel.js  # Auto-generated (do not edit)
├── meater.yaml                    # ESPHome BLE client config
├── hacs.json                      # HACS repository config
├── docs/
│   ├── TERMS_OF_REFERENCE.md      # Original project specification
│   ├── GUI_REDESIGN_TERMS_OF_REFERENCE.md # GUI redesign specification
│   ├── AI_RECIPE_BUILDER.md       # AI recipe feature documentation
│   ├── AGENT_HANDOFF.md           # Handoff doc for next agent
│   ├── FEATURE_REQUIREMENTS.md    # Feature specs
│   ├── USE_CASES.md               # Real-world scenarios
│   └── ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md
└── meater_app/                    # Decompiled app (reference)
```

## 🚀 Quick Start with MEATER+

### Hardware Required
- ESP32-C3 board (ESP32-C3-DevKitM-1 recommended)
- MEATER+ probe

### Setup

1. **Create your secrets file**:
   ```bash
   cp secrets.yaml.example secrets.yaml
   ```
   Edit with your WiFi credentials, API key, and MEATER MAC address.

2. **Flash the ESP32**:
   ```bash
   esphome run meater.yaml
   ```

3. **Add to Home Assistant**:
   - The ESP32 will connect to your MEATER+ probe via BLE
   - Temperature sensors appear automatically in Home Assistant
   - Install Kitchen Cooking Engine via HACS
   - Configure with your MEATER temperature sensor

### Finding Your MEATER MAC Address
- Use a BLE scanner app (nRF Connect, BLE Scanner, LightBlue)
- Look for a device named "MEATER"
- Note the MAC address (format: XX:XX:XX:XX:XX:XX)

## 📋 Documentation

| Document | Description |
|----------|-------------|
| [Terms of Reference](docs/TERMS_OF_REFERENCE.md) | Original project specification |
| [GUI Redesign ToR](docs/GUI_REDESIGN_TERMS_OF_REFERENCE.md) | GUI redesign specification (Phase 1–8) |
| [AI Recipe Builder](docs/AI_RECIPE_BUILDER.md) | AI recipe feature documentation |
| [Feature Requirements](docs/FEATURE_REQUIREMENTS.md) | Detailed feature specifications |
| [Use Cases](docs/USE_CASES.md) | 12 real-world cooking scenarios |
| [Temperature Research](docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md) | Alternative probes, temperature tables |
| [View Assist Integration](docs/VIEW_ASSIST_INTEGRATION.md) | Voice control setup and troubleshooting |

## 🔮 Future Features (Not Yet Started)

### Phase 7 — Multilingual & Measurement Systems
- ⬜ i18n infrastructure — Translation system for all UI text
- ⬜ Swedish + English — Full translations for both languages
- ⬜ Measurement system selector (Swedish dl/msk/tsk, UK, US, pure metric)
- ⬜ Serving size scaling with automatic ingredient conversion

### Phase 8 — Polish & Testing
- ⬜ Mobile responsive optimization — Fine-tuning for small screens
- ⬜ MEATER probe as subprocess within recipe cook steps
- ⬜ Ingredient bolding during cook steps
- ⬜ Visual design refinement and edge case handling

### Future Ideas
- 🥖 **Baking** - Bread proofing, internal doneness, oven tracking
- 🥐 **Pastries** - Laminated dough, proofing, custard temps
- 🧫 **Fermentation** - Yogurt, sourdough, kombucha, kefir, kimchi
- 🍲 **Slow Cooking** - Extended cook times, overnight safety monitoring
- 🌡️ **Combustion Inc** - Alternative probe with open BLE protocol
- 📷 **Grocery Recognition** - Receipt + photo → inventory

## 🛠️ Related Open Source Projects

| Component | Purpose | Link |
|-----------|---------|------|
| **Mealie** | Recipe management | [github.com/mealie-recipes/mealie](https://github.com/mealie-recipes/mealie) |
| **Grocy** | Inventory management | [github.com/grocy/grocy](https://github.com/grocy/grocy) |
| **Grill Buddy** | Temperature cooking | [github.com/jeroenterheerdt/grillbuddy](https://github.com/jeroenterheerdt/grillbuddy) |

## 🎨 Design Principles

1. **Local-first** - No cloud dependence required
2. **Low user workload** - Never require barcodes or excessive manual entry
3. **Progressive improvement** - Inventory and gear are hints, not strict requirements
4. **Inspiration over strict filtering** - AI biases toward creative ideas using what you have
5. **Kitchen-first** - Not grill-oriented; supports everyday indoor cooking

## 🙏 Credits

- MEATER BLE protocol research: [nathanfaber/meaterble](https://github.com/nathanfaber/meaterble)
- ESPHome BLE integration: [Home Assistant Community](https://community.home-assistant.io/)

## ☕ Support

If you find this project useful, consider buying me a coffee!

[![Buy Me A Coffee](https://img.shields.io/badge/Buy%20Me%20A%20Coffee-Support-yellow?style=flat&logo=buy-me-a-coffee)](https://buymeacoffee.com/R00S)

## 📄 License

See repository license file.
