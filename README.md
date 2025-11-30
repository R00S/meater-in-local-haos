# Kitchen Cooking Engine

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

**Phase 1: Planning & Foundation** ✅

- ✅ MEATER+ temperature data flowing into Home Assistant via ESPHome BLE client
- ✅ Comprehensive Terms of Reference documented
- ✅ Feature requirements defined
- ✅ Use cases captured
- ✅ Open source stack identified (Mealie, Grocy, Grill Buddy)
- ⏳ Implementation pending

See [STATUS.md](STATUS.md) for detailed project status.

## 🏗️ Architecture

```
MEATER+ Probe ──→ ESP32 (BLE Client) ──→ Home Assistant
                                              │
                    ┌─────────────────────────┼─────────────────────────┐
                    │                         │                         │
                    ▼                         ▼                         ▼
             Grill Buddy              Mealie (Recipes)           Grocy (Inventory)
          (Cooking Management)        + AI Assistant            + Grocery Intake
                    │                         │                         │
                    └─────────────────────────┼─────────────────────────┘
                                              ▼
                                    Lovelace Dashboard
                                   (Unified Cooking UI)
```

## 📁 Repository Structure

```
├── meater.yaml                 # ESPHome BLE client config (working)
├── secrets.yaml.example        # Template for credentials
├── docs/
│   ├── TERMS_OF_REFERENCE.md   # Full project specification
│   ├── FEATURE_REQUIREMENTS.md # Detailed feature specs
│   ├── USE_CASES.md            # 12 real-world scenarios
│   └── ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md
├── meater_app/                 # Decompiled MEATER app (for cooking algorithm research)
├── halted-ble-server-dev/      # [ON HOLD] BLE server emulation work
└── halted-udp-server-dev/      # [ON HOLD] UDP/MEATER Link protocol work
```

## 🚀 Quick Start

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
   - Tip temperature, ambient temperature, battery level, and RSSI available

### Finding Your MEATER MAC Address
- Use a BLE scanner app (nRF Connect, BLE Scanner, LightBlue)
- Look for a device named "MEATER"
- Note the MAC address (format: XX:XX:XX:XX:XX:XX)

## 📋 Documentation

| Document | Description |
|----------|-------------|
| [Terms of Reference](docs/TERMS_OF_REFERENCE.md) | Complete project specification with Phase 1 & 2+ scope |
| [Feature Requirements](docs/FEATURE_REQUIREMENTS.md) | Detailed feature specifications |
| [Use Cases](docs/USE_CASES.md) | 12 real-world cooking scenarios |
| [Temperature Research](docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md) | Alternative probes, temperature tables, cooking methods |

## 🍖 Core Features (Phase 1)

### Local MEATER Cooking Algorithm
Reproduce MEATER's cooking features locally:
- Tip + ambient temperature monitoring
- Dynamic ETA prediction
- Resting phase (carryover cooking)
- Target temperature by protein/cut/doneness
- Notifications at key moments

### AI-Powered Meal Planning
Natural language requests:
> *"Seafood dinner for 6, I have 2h prep alone, friends can help cook for 1h when they arrive"*

System will:
- Analyze your inventory
- Suggest recipes matching constraints
- Generate prep todo-list
- Create shopping list for friends
- Coordinate cooking times

### Comprehensive Protein Support
- **Beef**: Steaks (ribeye, sirloin, filet), roasts, brisket, short ribs
- **Pork**: Chops, tenderloin, shoulder, belly, ribs
- **Poultry**: Whole, breast, thighs, legs, wings
- **Fish**: Salmon, tuna, cod, halibut, swordfish
- **Lamb**: Leg, rack, chops, shoulder
- **Game**: Venison, duck, wild boar

### Six Doneness Levels
Rare → Medium-Rare → Medium → Medium-Well → Well-Done → Pulled/Braised

### Kitchen Cooking Methods
Oven roasting, stove-top (pan fry, sear, sauté, braise, poach), air fryer, sous vide, slow cooker, pressure cooker

## 🔮 Future Features (Phase 2+)

- 🥖 **Baking** - Bread proofing, internal doneness, oven tracking
- 🥐 **Pastries** - Laminated dough, proofing, custard temps
- 🧫 **Fermentation** - Yogurt, sourdough, kombucha, kefir, kimchi
- 🍲 **Slow Cooking** - Extended cook times, overnight safety monitoring
- 🌡️ **Combustion Inc** - Alternative probe with open BLE protocol
- 📷 **Grocery Recognition** - Receipt + photo → inventory

## 🛠️ Open Source Stack

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

## 📂 Halted Development Work

Previous attempts at MEATER app integration are preserved for reference:

- **`halted-ble-server-dev/`** - BLE server emulation (could advertise but couldn't maintain connection)
- **`halted-udp-server-dev/`** - UDP/MEATER Link protocol (complex protobuf-based system)

The `meater_app/` folder contains decompiled MEATER app code that may help understand:
- How the app handles guided cooks
- Cooking algorithms and predictions
- Temperature calculation formulas

## 🙏 Credits

- MEATER BLE protocol research: [nathanfaber/meaterble](https://github.com/nathanfaber/meaterble)
- ESPHome BLE integration: [Home Assistant Community](https://community.home-assistant.io/)

## 📄 License

See repository license file.
