# Kitchen Cooking Engine

[![HACS Badge](https://img.shields.io/badge/HACS-Custom-41BDF5.svg)](https://github.com/hacs/integration)
[![Home Assistant](https://img.shields.io/badge/Home%20Assistant-2024.1.0+-blue.svg)](https://www.home-assistant.io/)
[![Alpha](https://img.shields.io/badge/Status-ALPHA-orange.svg)](https://github.com/R00S/meater-in-local-haos)
[![Buy Me A Coffee](https://img.shields.io/badge/Buy%20Me%20A%20Coffee-Support-yellow?style=flat&logo=buy-me-a-coffee)](https://buymeacoffee.com/R00S)

A free, local-first, optionally AI-assisted, kitchen cooking system for Home Assistant that helps you plan, prepare, and cook meals using your ingredients, equipment, time constraints and recipes. 

For users of wireless temperature probes, like MEATER, INKBIRD etc, KCE provides an extensive tree of cuts and cooking methods ranging from meat and game to fish and veg. In addition to that, KCE adds knowledge and descriptions on how different meats and cuts behave and classic recipes for you to try or just read out of pure interest.

This is a stable mid dev release — Core cooking engine, AI recipe builder, MEATER probe integration, ingredient tracking, cook history, and a standalone Android app are all working. Phase 9 polish is wrapping up. Phase 10 will add shelf intelligence: recipe scanning from photos/URLs, shelf population from receipts and barcodes, and optional sync with Grocy/Mealie/HA shopping lists.

## 📖 User Guide

Full installation, configuration, and feature documentation:
**[→ docs/USER_GUIDE.md](docs/USER_GUIDE.md)**

- **Get started with your wireless probe:** [docs/GETTING_STARTED_MEATER.md](docs/GETTING_STARTED_MEATER.md)
- **Get started with your other kitchen appliance:** [docs/GETTING_STARTED_AI_RECIPE.md](docs/GETTING_STARTED_AI_RECIPE.md)

## 🎯 Project Vision

### 🌡️ Wireless Probe Cooking

Build a cooking assistant that helps you master every cut and technique:
- Guides you through protein and cut selection with descriptions and classic recipes
- Shows you the right cooking method for each cut — pan-fry, roast, braise, grill, and more
- Monitors internal temperature live with your wireless probe (MEATER+, INKBIRD, Govee, Combustion Inc, iGrill/Weber, ToGrill-compatible devices, and most unbranded BLE meat thermometers)
- Tracks doneness levels and calculates ETA in real time
- Works entirely locally (Home Assistant + local apps)

### 🤖 Other Appliances & AI Recipes

Build a smart cooking engine for your kitchen appliances:
- Supports multiple appliances (Ninja Combi, MultiFry, standard oven, stovetop, and more)
- Generates custom AI recipes using your available ingredients (OpenAI via Home Assistant conversation agents)
- Creates step-by-step cooking instructions with timers
- Understands your available ingredients and kitchen gear
- Works entirely locally (Home Assistant + local apps)

## 🌡️ Supported Wireless Probe Hardware

> ⭐ **Quickest path — Local MEATER+ without extra hardware**
> Install **[Emkraan/homeassistant-meater](https://github.com/Emkraan/homeassistant-meater)** from HACS. It reads the MEATER+ probe directly via BLE — no ESP32 or cloud account required.
> ✅ No cloud required &nbsp;·&nbsp; ✅ No extra hardware &nbsp;·&nbsp; ✅ All sensors available (tip, ambient, battery)
> → See the **[HACS integrations](#hacs-integrations)** table below for entity names.
>
> ⭐ **Alternative with better range — Local MEATER+ with ESP32**
> Use a **MEATER+** probe (only the Plus model) with any ESP32 board running the ESPHome config included in this repo.
> → See **[Quick Start with MEATER+](#-quick-start-with-meater)** below.

KCE's temperature-probe cook path works with **any** Home Assistant sensor entity that exposes a numeric temperature value — no matter which probe brand or integration you use. You simply enter the entity IDs during setup and KCE reads their state.

### Built-in HA integrations (zero extra installs)

| Probe / Brand | HA Integration | Tip sensor | Ambient sensor | Battery sensor | Notes |
|--------------|---------------|-----------|----------------|----------------|-------|
| **MEATER / MEATER+** | [MEATER](https://www.home-assistant.io/integrations/meater/) (Cloud) | `sensor.*_internal` | `sensor.*_ambient` | ❌ | Requires MEATER Cloud account |
| **INKBIRD IBT-2X / 4XS / 6XS** | [INKBIRD](https://www.home-assistant.io/integrations/inkbird/) (Local BLE) | `sensor.*_probe_1` … `_N` | ❌ | ⚠️ model-dependent | 2, 4, or 6 wired probes |
| **Rubicson / ToGrill-compatible OEM devices** | [ToGrill](https://www.home-assistant.io/integrations/togrill/) (Local BLE) | `sensor.*_temperature` | ❌ | ✅ `sensor.*_battery` | Covers many cheap rebrand BBQ probes |
| **Govee H5191 / 5181–5198** | [Govee BLE](https://www.home-assistant.io/integrations/govee_ble/) (Local BLE) | `sensor.*_probe_N_temperature` | ❌ | ✅ | Multi-probe wired units |
| **ThermoWorks Smoke** | [ThermoWorks Smoke](https://www.home-assistant.io/integrations/thermoworks_smoke/) (WiFi Gateway) | `sensor.*_probe_1/2` (**°F only**) | ❌ | ❌ | Set KCE measurement unit to US (°F) |
| **ThermoPro TempSpike (TP960 / TP962 / TP970)** | [ThermoPro](https://www.home-assistant.io/integrations/thermopro/) (Local BLE) | `sensor.*_temperature` — check HA device page after discovery | ❌ | ✅ | Auto-discovered once Bluetooth integration is enabled; no extra installs |

### HACS integrations

| Probe / Brand | HA Integration | Tip sensor | Ambient sensor | Battery | Notes |
|--------------|---------------|-----------|----------------|---------|-------|
| **MEATER / MEATER+** | [homeassistant-meater](https://github.com/Emkraan/homeassistant-meater) (Local BLE) | `sensor.*_tip_temp` | `sensor.*_ambient_temp` | ✅ `sensor.*_battery` | No cloud, no ESP32 — pure BLE. MEATER+ only. |
| **Combustion Inc Predictive Thermometer** | [homeassistant-combustion](https://github.com/legrego/homeassistant-combustion) (Local BLE) | `sensor.*_core_temperature` | `sensor.*_ambient_temperature` | ❌ binary | 8-sensor predictive probe; open BLE protocol |

### Via ESPHome (ESP32 as BLE proxy)

| Probe / Brand | Component | Tip sensor | Battery | Notes |
|--------------|----------|-----------|---------|-------|
| **iGrill mini / V2 / V202 / V3, Weber Pulse 1000/2000** | [esphome-igrill](https://github.com/bendikwa/esphome-igrill) | `sensor.*_temp_probe_1` … `_4` | ✅ | ESP32 bridges the exclusive BLE connection |
| **AT-02, ThermoPro TP904, generic AliExpress BBQ probes, any unbranded BLE probe** | ESPHome `ble_client` custom component | Custom name | Optional | Protocol must be reverse-engineered; community configs exist for many models |

> **No probe listed here?** If your probe exposes a `sensor.*` entity in Home Assistant — even via MQTT or a DIY ESPHome setup — it will work with KCE. Just enter the entity ID in the setup form.

📖 **[Full compatibility reference with entity details](docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md#kce-probe-compatibility)**

---

## 🤖 AI Recipe Builder

The AI Recipe Builder generates custom recipes using AI (OpenAI or any HA conversation agent) based on your ingredients, cooking style, cuisine preferences, and available kitchen equipment.

### Features

- **30+ Common Ingredients** — Proteins (9), Vegetables (12), Grains (5), Dairy (5), plus custom ingredient input
- **14 Cooking Styles** — Quick & Easy, Gourmet, Healthy, Comfort Food, Family Friendly, Meal Prep, One Pot, Slow Cook, Barbeque, Baking, Low Carb, High Protein, Vegetarian, Vegan
- **70+ World Cuisines** — 11 collapsible regions: Nordic & Scandinavian, East Asian, Southeast Asian, South Asian, Middle Eastern, European, North American, Latin American, Caribbean, African, Oceanian — select multiple for fusion
- **Complexity Slider** — 1 (Very Simple) to 5 (Chef Level), with style-dependent defaults
- **Portions Slider** — 1 to 8 servings
- **4 Diverse Suggestions** — AI generates 4 quite different recipes from your selections
- **Full Cook Flow** — Step-by-step instructions with elapsed timer, then star ratings on completion
- **Save & Restart** — Completed AI recipe cooks saved to history with full recipe data; restartable from Cooked and Saved Recipes
- **Save for Later** — Save a fully generated recipe to history without cooking it (💾 button on the recipe overview page); pick it up from Cooked and Saved Recipes later
- **Jump to AI from MEATER** — In the MEATER cut-selection path, once you pick a doneness/method, a weight input + "Get AI Recipe Suggestions" shortcut appears (requires AI agent configured); pre-seeds the AI builder with the selected cut and carries the target temperature through to the cook flow automatically
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
13. Recipe saved to **Cooked and Saved Recipes** for future restart

### ✅ Tested With

The following AI agents have been verified to work well with the AI Recipe Builder:

| Provider | Model | HA Integration | Recommended settings |
|----------|-------|----------------|----------------------|
| Google Gemini | `gemini-2.5-pro` | [Google Generative AI Conversation](https://www.home-assistant.io/integrations/google_generative_ai_conversation/) | Temperature 1, Top P 0.95, Top K 129, Max tokens 20000, all safety filters: Block none |
| Google Gemini | `gemini-flash-latest` | [Google Generative AI Conversation](https://www.home-assistant.io/integrations/google_generative_ai_conversation/) | Temperature 1, Top P 0.95, Top K 128, Max tokens 18000, all safety filters: Block none |

**System prompt (Instructions field):**
```
You are a master chef providing the user with recipes and cooking ideas.
```

> ⚠️ Safety filters must be set to **Block none** for all four categories, otherwise common cooking ingredients and techniques can trigger false positives that abort recipe generation.

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

## 📱 Android App

A standalone Android app is available for controlling your MEATER+ from your phone without needing KCE or any internet connection.

> ⚠️ **Alpha stage** — core features work but the app has not yet been tested on real hardware end-to-end. Expect rough edges. See [Section 15 of the User Guide](docs/USER_GUIDE.md#15-standalone-android-app-v01015-alpha) for known gaps.

**[⬇️ Download latest APK](https://github.com/R00S/meater-in-local-haos/raw/main/android/apk/meater-kitchen-latest.apk)** — <!--APK_VERSION-->v0.10.1.5<!--/APK_VERSION-->

> Tip: GitHub caches the `meater-kitchen-latest.apk` URL aggressively. If your download still shows an older version, force-refresh or use the versioned link: `android/apk/meater-kitchen-<!--APK_VERSION_PATH-->0.10.1.5<!--/APK_VERSION_PATH-->.apk`.

> The APK is built on demand and stored in the repo. Enable "Install from unknown sources" in your Android settings before installing.

**Android v0.10.1.5 highlights**
- Visual in-app cook alerts in the dashboard
- Phone notifications with sound + vibration for:
  - cooking started
  - 5 minutes remaining
  - target reached / acknowledge rest
  - rest complete / acknowledge done
- Explicit acknowledgement flow for cooking → rest and rest → done
- Ambient + inner-temperature fallback auto-transitions if acknowledgement is delayed

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
  cut_id: ribeye_steak  # EXP_TREE slug
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
│       ├── measurements.py        # Measurement unit catalog (metric/imperial/Swedish)
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
│       ├── i18n/                  # Translation files (en.json, sv.json)
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

## 🔮 Future Features

### Phase 9 — Polish & Language (in progress)
- 🌍 **Full Swedish / English i18n** — Language selector, all UI strings translated
- 📐 **Measurement conversion** — Metric ↔ US with serving-size scaling
- 📱 **Mobile layout** — Remaining responsive edge cases

### Phase 10 — Shelf Intelligence & Integration (planned)
- 🛒 **Shelf from photos** — Receipt photos, barcode scanning and fridge photos populate your pantry inventory automatically
- 📋 **Recipe scanning** — Import any recipe from a URL or photo; cook it straight away
- 🔗 **External sync** — Optional two-way bridges to Grocy, Mealie, and HA Shopping List

### Future Ideas
- 🥖 **Baking** - Bread proofing, internal doneness, oven tracking
- 🥐 **Pastries** - Laminated dough, proofing, custard temps
- 🧫 **Fermentation** - Yogurt, sourdough, kombucha, kefir, kimchi
- 🍲 **Slow Cooking** - Extended cook times, overnight safety monitoring
- 🌡️ **Combustion Inc** - Alternative probe with open BLE protocol

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

## 📊 Current Status

**v0.9.0.0** — Development release (May 2026)

Both the sidebar panel and the `type: custom:kitchen-cooking-card` Lovelace card are now fully functional. See [STATUS.md](STATUS.md) for full progress tracking.

### v0.9.0.x Changes — MEATER cook fixes & cuisine ingredient improvements (May 2026)
- ✅ **MEATER cook start failures fixed** — Added missing doneness validators (`thigh_optimal`, `just_cooked`, `confit`, `leg_rendered`, `thigh_rendered`) to `__init__.py` and `services.yaml` that were preventing whole chicken, whole turkey, whole duck, whole goose, duck leg confit, and shrimp cooks from starting
- ✅ **40+ cut file fixes** — Fixed `recommended_doneness` mismatches where placeholder `well_done` value didn't exist in actual doneness lists, causing silent cook start failures for chicken breast and 35+ other cuts
- ✅ **Cuisine protein tree lighting** — Fixed protein tree badges not lighting up for cuisine files using file-specific protein IDs; added pattern-based subcat mapping in generator so 1752 proteins across 102 cuisine files now correctly illuminate tree buttons
- ✅ **Language-aware ingredient tooltips** — Fixed Swedish tooltips appearing for English users; tooltip system now shows `notes_sv` for Swedish mode and `notes` for English mode; Swedish cuisine file updated with proper field separation

### v0.8.0.x Changes — Cooked and Saved Recipes, Save for Later, AI shortcut from MEATER (April 2026)
- ✅ **Rename: Previous Cooks → Cooked and Saved Recipes** — Badge, screen title, navigation, and all i18n strings (en + sv) updated everywhere
- ✅ **Filter toggles** — Two toggle buttons on the Cooked and Saved Recipes screen let you hide saved-only entries or cooked-only entries independently
- ✅ **💾 Saved badge** — Entries saved without cooking show a distinct "💾 Saved" badge in the list
- ✅ **Save for Later** — New button on the AI recipe overview page saves a fully generated recipe to history with `comment = "Saved, not yet cooked"` so you can cook it another time without going through the AI builder again
- ✅ **Jump to AI from MEATER cut selection** — When an end leaf (cut or cut-method) is selected and an AI agent is configured, a weight input box and "Get AI Recipe Suggestions" button appear; tapping it pre-seeds the AI builder with the selected cut + weight, sets the cooking style to match the MEATER method, and carries the correct target temperature through to the recipe cook flow (guaranteed even if the AI omits `use_probe` / `target_temp_c`)

### v0.7.0.x Changes — Classic MEATER path removed; single recipe source of truth (April 2026)
- ✅ **Classic MEATER path retired** — The old `_currentPath = 'meater'` code path (~400 lines including `_renderMeaterPath`, `_renderSetupForm`, `_navigateToMeaterPath`) has been deleted. MEATER+ now routes directly to the experimental path
- ✅ **Simplified data getters** — `_getDataCategories()`, `_getDonenessOptions()`, and all 5 recipe getters (`_getRecipeIndex`, `_getCutProfiles`, `_getCutProfilesSv`, `_getCutMethodProfiles`, `_getRecipeTitles`) always return the live EXP_TREE set; no more ternary on `_currentPath`
- ✅ **UI cleanup** — Welcome screen reduced to a single MEATER+ card; "(experimental)" badge and label removed from the MEATER+ heading; `_renderRecentMeaterCooks` back button updated
- ✅ **Generator cleaned up** — `CLASSIC_RECIPE_INDEX`, `CLASSIC_CUT_PROFILES`, `CLASSIC_CUT_PROFILES_SV`, `CLASSIC_CUT_METHOD_PROFILES`, `CLASSIC_RECIPE_TITLES` constants removed from generator output; `docs/recipe_research_classic/` and `www/recipes_classic/` deleted
- ✅ **Single source of truth for recipe files** — `www/recipes/` is now the ONLY source. `generate_frontend_data.py` reads directly from `www/recipes/`; `copy_recipe_files_to_www()` removed. `docs/recipe_research/` is now a git symlink pointing to `www/recipes/` so both paths remain browsable
- ✅ **Swedish pork terminology fixes** — `fläskaxel` → `fläskbog` everywhere; `Bogkotlett` (trade name) → `Bogskiva`; `görs av fläskbog` vs `görs av bogfläsk` (ingredient context) fixed in ground pork files
- ✅ **`start_cook` accepts EXP_TREE slugs** — `cut_id` is a string slug (e.g. `"ribeye_steak"`); the service looks up temperatures and rest times from the recipe markdown files
- ✅ **Rest time and carryover data in KCE:CUT** — `rest_time_min`, `rest_time_max`, and `carryover_temp_c` optional fields added to the cut overview format; the generator populates these into `EXP_TREE` for use by the cooking engine
- ✅ **Per-method rest/carryover overrides in KCE:CUT_METHOD** — braise, sous_vide, and slow_cooker files can now override the cut-level rest/carryover defaults for their specific method
- ✅ **`start_cook` accepts only EXP_TREE slugs** — Legacy integer `cut_id` support removed. `cut_id` is now strictly a string slug (e.g. `"ribeye_steak"`). The system has exactly one path: give it a slug, it reads the cut file, that's it
- ✅ **Simplified `start_cook` handler** — Integer branch, `_get_protein_name_for_cut` helpers, and all remaining imports from `cooking_data.py` / `swedish_cooking_data.py` removed from `__init__.py`
- ✅ **Full-screen recipe viewer** — Clicking any recipe title button in the MEATER path (both in the Tillagningsmetod card and the Cut Profile research card) now opens the recipe full-screen using the same header style as the AI recipe cook flow, with a ← back button to return
- ✅ **Start Cook from recipe view** — A "Start Cooking" button appears at the bottom of the full-screen recipe viewer (when a doneness is already selected), allowing the cook to be started without leaving the recipe
- ✅ **Live MEATER cook monitor** — After starting a cook from the recipe view, the recipe stays on screen and a compact monitor card appears below it showing: current temperature, target temperature, progress bar, ETA/rest time, and Start Rest / Complete / Stop buttons. The user can read the recipe and watch the cook simultaneously
- ✅ **🏠 Go to full active-cook view** — When monitoring is active, a home button in the header navigates to the full active-cook view (with temperature graph, notes, etc.) while keeping the cook running

### v0.6.5.x Changes — Swedish cut profiles & translation quality (April 2026)
- ✅ **Swedish cut-profile body text** — `## Styckesprofil` sections now cover all 163 experimental-path cuts; the **Styckesprofil** card and **Tillagningsmetod** method-description area render in Swedish when UI language is set to Svenska (falls back to English when no Swedish section exists)
- ✅ **Full translation pipeline** — `generate_frontend_data.py` extracts `## Styckesprofil` into `CUT_PROFILES_SV`, `CLASSIC_CUT_PROFILES_SV`, and per-method `_sv` keys in `CUT_METHOD_PROFILES`; all 163 cut overview files and their method leaves carry Swedish descriptions
- ✅ **30 beef cut profiles enriched** — Detailed Swedish anatomy descriptions for ribeye, T-bone, NY strip, sirloin, hanger, flank, skirt, flat iron, picanha, tomahawk, prime rib, and several roasts; sourced from Grok's richer translation set where it outperformed the initial Copilot translations

### v0.6.4.x Changes — Recipe research quality pass & data fixes (April 2026)
- ✅ **50+ cut files improved** — Anatomy-based cut profiles, new method leaf files, and additional recipe sources across beef, pork, lamb, poultry, fish, and game
- ✅ **Culinary group renames** — Direction names (Eastern/Western/etc.) replaced with Group A/B/C/D labels repo-wide to prevent name-based guessing in future research sessions

### v0.6.3.x Fixes — Blank screen & custom card registration (April 2026)

### v0.6.2.x Features — Bug fixes, Lovelace card, help buttons, recipe research (April 2026)
- ✅ **Lovelace custom card** — Drop `type: custom:kitchen-cooking-card` into any dashboard view; auto-registered as a Lovelace resource on startup — no manual resource configuration needed
- ✅ **Contextual help buttons** — Every navigable screen now has a `?` button that opens the relevant section of the User Guide in a new tab
- ✅ **USDA safety legend restored** — Doneness card shows 🟢 safe · 🟠 caution · 🔴 below guidelines with USDA minimum warning
- ✅ **189 international cuts, 198 Swedish cuts** — ongoing recipe research expansion; `cooking_methods_researched` quality field added across all cut index files

### v0.6.1.x Features — Experimental MEATER path & CI (April 2026)
- ✅ **File-driven experimental cut tree** — `EXP_TREE` is built from `<!-- KCE:CUT … -->` tags in recipe `.md` files; no `cooking_data.py` edit needed to add a cut to the experimental MEATER path
- ✅ **Inline recipe viewer** — selecting a cut shows a cut profile card; clicking a method button opens the recipe Markdown inline inside the panel
- ✅ **186 cuts, 517 recipe files** — full recipe research coverage across beef, pork, lamb, poultry, game, fish, and vegetables
- ✅ **Automated generator in CI** — the release workflow (`create-test-release.yml`) runs `generate_frontend_data.py` automatically, so developers never need to regenerate the panel JS locally before releasing
- ✅ **Compulsory Ingredients** — Click an ingredient badge to mark it ⭐ must-include; AI is instructed it MUST appear in every suggested recipe
- ✅ **Shelf Management** — Optional fridge/larder/freezer/cupboard inventory; items grouped by location; add/remove items inline; toggle on/off in settings
- ✅ **Cooking Modes A / B / C** — Shown when shelf is enabled: Mode A (ignore shelf), Mode B (restrict AI to shelf items only), Mode C (AI generates recipes and prepends a shopping list for missing ingredients)
- ✅ **Post-Cook Shelf Update** — After rating screen prompts to deduct used ingredients from shelf inventory
- ✅ **Shopping List** — Standalone screen to view, check off, and delete shopping items; items carried over from Mode C

### v0.6.0.x Features — Phase 7: Multilingual & Measurement Systems (April 2026)
- ✅ **Swedish measurement system** — Metric, Imperial, and Swedish (dl/msk/tsk) unit catalogs with an API endpoint; persisted per user
- ✅ **Full i18n (`_t()`) coverage** — Every user-facing string in the panel template is now translated; zero hardcoded English
- ✅ **AI recipes in the right language** — AI prompt includes a language directive so recipes come back in English or Swedish (no Danish bleed-through)
- ✅ **AI recipes in the right units** — Frontend sends `measurement_system` with every AI request; ingredient text is converted as a safety net
- ✅ **Swedish ingredient display** — `_ingDisplayName()` helper returns Swedish name when language is `sv`; staples, categories, and cooking styles are also translated
- ✅ **Per-step ingredient tagging** — AI recipe JSON carries an `ingredients` array per step so active ingredients are highlighted during the cook flow
- ✅ **Swedish ingredient corrections** — `Chiliflingor` (was "Röda pepparflingor"), plus 7 missing Swedish ingredient entries added
- ✅ **Swedish decimal comma** — Numbers formatted as `2,4 dl` when language is Swedish
- ✅ **Hide-other-language-tree checkbox** — Temperaturdata card: when checked, only the active data-source button is shown; preference persisted to `localStorage`
- ✅ **On-the-fly target temperature adjustment** — Slider, ±1°C buttons, and confirm button in the active MEATER cook view; `set_target` HA service registered and wired end-to-end

### v0.5.5.x Features (March 2026)
- ✅ **Tab navigation preserved** — Returning to the panel after switching browser tabs or OS windows no longer resets to the welcome screen; all navigation paths are preserved
- ✅ **Real backend refresh on return** — Appliances, AI settings, and active recipe cooks are reloaded whenever the panel becomes visible again
- ✅ **AI recipe appliance targeting** — Opening the AI Recipe Builder with an appliance selected auto-injects `"use <ApplianceName> programs"` as the first ingredient; the chip is removable for fully generic recipes

### v0.5.4.x Features (March 2026)
- ✅ **Ongoing cooks badge** — Welcome screen shows active MEATER + recipe cooks with live status
- ✅ **Parallel recipe cooks** — Multiple recipe cooks running simultaneously (one per appliance)
- ✅ **Cross-device cook visibility** — Recipe cooks visible on all devices via server sync
- ✅ **MEATER cook rating screen** — Rate ease & result (1–5 stars) after MEATER cook completion
- ✅ **AI ingredient ceilings** — Style-dependent ingredient limits prevent overly complex recipes
- ✅ **Honest cooking time** — AI includes all prep time (soaking, brining, marinating) in estimates
- ✅ **Recipe cook persistence** — sessionStorage survives HA sidebar navigation
- ✅ **Welcome screen auto-refresh** — Exited cooks disappear immediately without manual refresh
- ✅ **MEATER restart improvements** — Session dropdown on waiting screen, unknown entity handling
- ✅ **🏠 Home button** — Navigate back to welcome from any active cook view
- ✅ **MEATER Swedish cook restart** — Cooks with Swedish data source restart correctly from Cooked and Saved Recipes
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
- ✅ **AI recipe save & restart** — Full recipe data saved to cook history, restartable from Cooked and Saved Recipes
- ✅ **Cancelable generation** — Loading dialog with Cancel button and time estimate
- ✅ **Custom temperature cook** — Set any target temp (30–100°C) in MEATER path without protein selection
- ✅ **Metric conversions** — All Ninja Combi recipes include metric equivalents (cups→dl, oz→g, lb→kg, °F→°C)

### Core Features (all versions)
- ✅ **MEATER+ BLE integration** — Real-time temperature monitoring via ESPHome
- ✅ **189+ international cuts** (USDA) + **198+ Swedish cuts** (Livsmedelsverket)
- ✅ **31 built-in Ninja Combi recipes** with 12 cooking modes
- ✅ **Multi-appliance support** — Ninja Combi, MultiFry, Standard Oven, Stovetop, Microwave, Custom appliances
- ✅ **Dynamic ETA** — Time-to-target based on temperature rise rate
- ✅ **Notifications** — Mobile push, TTS voice, persistent, indicator light (blue→red→white)
- ✅ **Cook history** — Log, review, and restart previous cooks
- ✅ **View Assist** — Blueprint for voice navigation to cooking panel

See [STATUS.md](STATUS.md) for detailed project status.

---

## 🙏 Credits

- MEATER BLE protocol research: [nathanfaber/meaterble](https://github.com/nathanfaber/meaterble)
- ESPHome BLE integration: [Home Assistant Community](https://community.home-assistant.io/)

## ☕ Support

If you find this project useful, consider buying me a coffee!

[![Buy Me A Coffee](https://img.shields.io/badge/Buy%20Me%20A%20Coffee-Support-yellow?style=flat&logo=buy-me-a-coffee)](https://buymeacoffee.com/R00S)

## 📄 License

See repository license file.
