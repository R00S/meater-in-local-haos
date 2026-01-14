# Kitchen Cooking Engine

[![HACS Badge](https://img.shields.io/badge/HACS-Custom-41BDF5.svg)](https://github.com/hacs/integration)
[![Home Assistant](https://img.shields.io/badge/Home%20Assistant-2024.1.0+-blue.svg)](https://www.home-assistant.io/)

A local-first, AI-assisted kitchen cooking system for Home Assistant that helps you plan, prepare, and execute meals using your ingredients, equipment, time constraints, recipes, and temperature sensors.

## 🎯 Project Vision

Build a smart cooking engine that behaves like a highly capable kitchen assistant:
- Understands your available ingredients and kitchen gear
- Knows your time constraints (prep time, helper time, serving time)
- Finds or adapts appropriate recipes
- Creates step-by-step cooking instructions
- Uses temperature probes when relevant (MEATER+, etc.)
- Works entirely locally (Home Assistant + local apps)

## 📊 Current Status

**Phase 6: AI-Powered Recipe Integration** ✅ Complete (v0.3.5.0)

### v0.3.5.0 Features (Current - January 2026)
- ✅ **AI Recipe Builder** - Generate custom recipes with OpenAI based on your ingredients and cooking style
- ✅ **Intelligent ingredient selection** - Choose from proteins, vegetables, grains, dairy, and spices
- ✅ **Multiple cooking styles** - Quick & Easy, Gourmet, Healthy, Comfort Food, Family Friendly, and more
- ✅ **4 diverse recipe suggestions** - AI generates 4 quite different recipes from your selections
- ✅ **Detailed recipe instructions** - Full ingredients, step-by-step instructions, cooking phases, and tips
- ✅ **Appliance-aware** - AI considers your available kitchen equipment when generating recipes
- ✅ **OpenAI conversation integration** - Uses Home Assistant's conversation component for AI generation
- ✅ **Multi-appliance support** - Ninja Combi, MultiFry, Standard Oven, Stovetop, Microwave, Custom appliances
- ✅ **Unified configuration** - All appliances use identical backend logic
- ✅ **Dynamic feature management** - Enable/disable features per appliance
- ✅ **Feature type system** - Standard/Modified/Special implementations with color-coded UI
- ✅ **Architectural unification** - Predefined appliances indistinguishable from custom once created
- ✅ **Enhanced UI** - Expandable appliance cards with grouped features
- ✅ **Settings on all appliances** - Gear icon for feature editing on every appliance
- ✅ MEATER+ temperature data flowing into Home Assistant via ESPHome BLE client
- ✅ Comprehensive cooking data model (185+ international cuts, 89 Swedish cuts)
- ✅ **Swedish data source** with proper terminology (helstekt, skiva)
- ✅ **Temperature fine-tuning** with slider (35-100°C)
- ✅ **Recommended doneness** per cut with ⭐ indicator
- ✅ **Data source selector** - Switch between International (USDA) and Swedish
- ✅ **Auto-generated frontend data** - No discrepancy between frontend/backend
- ✅ HACS-compatible custom integration structure
- ✅ Kitchen-focused cooking methods (oven, stovetop, air fryer, sous vide, etc.)
- ✅ Vegetable support (root vegetables, greens, squash, mushrooms, etc.)
- ✅ **Ambient temperature sensor** - Optional sensor for better ETA predictions
- ✅ **Battery level sensor** - Monitor MEATER probe battery status (displayed in UI)
- ✅ **Dynamic ETA calculation** - Time-to-target based on temperature rise rate
- ✅ **Indicator light control** - RGB light changes color as cooking progresses (blue→red)
- ✅ **Rest phase light transition** - Light transitions from red→white during rest
- ✅ **Mobile push notifications** - Direct notifications via Home Assistant Companion app
- ✅ **TTS voice announcements** - Audible alerts on any speaker
- ✅ **Persistent notifications** - Home Assistant notification panel alerts
- ✅ **Cooking events** - Approaching target, 5 min remaining, goal reached, rest complete
- ✅ **Cook history** - Log completed cooks with timestamps, peak temp, final temp
- ✅ **Remember last doneness** - Remembers your preferences per cut (including fine-tuning)
- ✅ **Temperature graph** - Real-time graph showing tip/ambient temps from cook start
- ✅ **Cooking notes** - Add notes during cooks, saved with history
- ✅ **White screen fix** - Reliable tab switching without blank screens
- ✅ **Ninja Combi support** - Full integration with recipes and cooking modes for Ninja Combi SFP700EU oven
- ✅ **MultiFry support** - DeLonghi MultiFry with all cooking modes
- ✅ **View Assist integration** - Voice command "start cooking" opens panel on View Assist devices

### Previous Releases
- **v0.3.4.0** (January 2026) - Multi-appliance infrastructure complete
- **v0.3.3.1** (January 2026) - View Assist integration with voice commands
- **v0.3.3.0** (January 2026) - Multi-appliance infrastructure
- **v0.1.2.18** (December 2025) - Initial HACS integration with MEATER+ support

See [STATUS.md](STATUS.md) for detailed project status.

---

## 🤖 AI Recipe Builder Setup

The AI Recipe Builder requires the OpenAI conversation integration to be configured in Home Assistant.

### Setting up OpenAI Conversation

1. Go to **Settings** → **Voice Assistants**
2. Click **Add Assistant**
3. Select **OpenAI Conversation**
4. Enter your OpenAI API key
5. Configure your preferred model (GPT-4 recommended for best results)
6. Save the configuration

Once configured, the AI Recipe Builder will automatically detect the integration and become available in the Kitchen Cooking Engine panel.

### Using the AI Recipe Builder

1. Open the Kitchen Cooking Engine panel
2. Click the **🤖 AI Recipe Builder** button
3. Select your cooking style (Quick & Easy, Gourmet, etc.)
4. Choose your available ingredients
5. Click **Generate 4 Recipe Ideas**
6. Browse the suggestions and select one for full details
7. Follow the detailed instructions to cook

The AI will consider your available kitchen appliances when generating recipes and optimize them for your equipment!

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

## 🎤 View Assist Voice Control

The Kitchen Cooking Engine integrates with [View Assist](https://github.com/dinki/View-Assist) to provide voice-controlled panel navigation on your smart display devices.

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

The integration includes custom sentences and a ready-to-use automation blueprint for seamless voice control.

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
│       ├── config_flow.py         # Configuration UI
│       ├── const.py               # Constants
│       ├── cooking_data.py        # Comprehensive cooking data
│       ├── sensor.py              # Cooking session sensor
│       ├── services.yaml          # Service definitions
│       ├── manifest.json          # HACS manifest
│       └── translations/          # Localization
├── meater.yaml                    # ESPHome BLE client config
├── hacs.json                      # HACS repository config
├── docs/
│   ├── TERMS_OF_REFERENCE.md      # Project specification
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
| [Terms of Reference](docs/TERMS_OF_REFERENCE.md) | Complete project specification |
| [Feature Requirements](docs/FEATURE_REQUIREMENTS.md) | Detailed feature specifications |
| [Use Cases](docs/USE_CASES.md) | 12 real-world cooking scenarios |
| [Temperature Research](docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md) | Alternative probes, temperature tables |
| [View Assist Integration](docs/VIEW_ASSIST_INTEGRATION.md) | Voice control setup and troubleshooting |

## 🔮 Future Features (Phase 2+)

- 🥖 **Baking** - Bread proofing, internal doneness, oven tracking
- 🥐 **Pastries** - Laminated dough, proofing, custard temps
- 🧫 **Fermentation** - Yogurt, sourdough, kombucha, kefir, kimchi
- 🍲 **Slow Cooking** - Extended cook times, overnight safety monitoring
- 🌡️ **Combustion Inc** - Alternative probe with open BLE protocol
- 📷 **Grocery Recognition** - Receipt + photo → inventory
- 🤖 **AI Recipe Integration** - Natural language meal planning

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

## 📄 License

See repository license file.
