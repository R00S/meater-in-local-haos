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

**Phase 1: Kitchen Cooking Engine HACS Integration** 🚧 In Development

- ✅ MEATER+ temperature data flowing into Home Assistant via ESPHome BLE client
- ✅ Comprehensive cooking data model (proteins, cuts, cooking methods, doneness levels)
- ✅ HACS-compatible custom integration structure
- ✅ Kitchen-focused cooking methods (oven, stovetop, air fryer, sous vide, etc.)
- ✅ Vegetable support (root vegetables, greens, squash, mushrooms, etc.)
- ⏳ Service implementation for cooking sessions
- ⏳ Lovelace dashboard cards
- ⏳ AI-powered recipe integration

See [STATUS.md](STATUS.md) for detailed project status.

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
5. Optionally select an ambient temperature sensor
6. Choose your preferred temperature unit (Celsius/Fahrenheit)
7. Click **Submit**

> **Note:** No `configuration.yaml` editing is required! The integration is fully configured through the UI.

### Step 4: Access the Cooking Panel

After installation, a **"Cooking"** entry will appear in your Home Assistant sidebar. Click it to access the cooking interface.

The sidebar panel provides:
- **Protein Selection**: Choose from Beef, Pork, Poultry, Fish, or Lamb
- **Cut Selection**: Pick the specific cut you're cooking
- **Doneness Levels**: Visual buttons for Rare through Well Done
- **Cooking Methods**: Oven, Pan, Grill, Air Fryer, and more
- **Live Monitoring**: Real-time temperature and progress tracking
- **Control Actions**: Stop cook, start rest, complete session

### Manual Installation (Alternative)

If you prefer not to use HACS:

1. Download the `custom_components/kitchen_cooking_engine` folder from this repository
2. Copy it to your Home Assistant's `config/custom_components/` directory
3. Restart Home Assistant
4. Configure via Settings → Devices & Services → Add Integration

---

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
