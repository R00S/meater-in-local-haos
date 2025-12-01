# Project Status - Kitchen Cooking Engine

**Last Updated:** 2025-12-01

## Project Direction

This project has evolved from a MEATER BLE proxy into a comprehensive **Kitchen Cooking Engine** - a local-first, AI-assisted cooking system for Home Assistant.

## ✅ Current Status

### Working Now (v0.1.1.0)
- **MEATER+ BLE Client**: ESP32 connects to real MEATER+ probe and reads temperature data
- **Home Assistant Integration**: Tip temp, ambient temp, battery level, RSSI exposed as sensors
- **No Cloud Required**: All data stays local via ESPHome
- **Cooking Panel UI**: Select protein, cut, doneness, and cooking method
- **Swedish Temperature Data**: Full Swedish cut tree with temperatures from Livsmedelsverket, Stekguiden.se, Gårdssällskapet
- **Temperature Fine-Tuning**: Adjust target temperature before starting cooks
- **Recommended Doneness**: Pre-selected recommended doneness for each cut

### New in v0.1.1.0
- **Swedish Data Source**: Choose between International (USDA) or Swedish (Livsmedelsverket) temperature recommendations
- **Merged Protein Lists**: Comprehensive list of cuts from both data sources
- **Temperature Fine-Tuning UI**: Slider and input controls to adjust target temperature
- **Recommended Doneness**: ⭐ indicator for recommended doneness levels
- **Swedish Cuts**: Full Swedish butcher-style cuts including:
  - Nötkött: Entrecôte, Ryggbiff, Oxfilé, Högrev, Bringa, etc.
  - Fläsk: Fläskkotlett, Fläskkarré, Revbensspjäll, Julskinka, etc.
  - Lamm: Lammstek, Lammrack, Lammkotletter, etc.
  - Vilt: Älgfilé, Renfilé, Rådjursfilé, Hjortfilé, Vildsvin, etc.
  - Fågel: Kyckling, Kalkon, Anka
  - Fisk: Lax, Torsk, Sik, Röding, Gös, etc.

### Documented & Planned
- **Terms of Reference**: Complete project specification in `docs/TERMS_OF_REFERENCE.md`
- **Feature Requirements**: Detailed specs in `docs/FEATURE_REQUIREMENTS.md`
- **Use Cases**: 12 real-world scenarios in `docs/USE_CASES.md`
- **Temperature Research**: Protein tables, doneness levels, cooking methods

## 🎯 Phase 1 Goals

Build a smart cooking engine that:
1. **Uses MEATER hardware without cloud** ✅ (working)
2. **Reproduces MEATER's cooking algorithm locally** (planned)
3. **Supports multiple cuts and cooking styles** ✅ (working - International + Swedish)
4. **Provides dynamic ETA predictions** (planned)
5. **Includes resting-phase forecasts** (planned)
6. **Shows graphs and notifications** (planned)
7. **Integrates with recipes (Mealie) and inventory (Grocy)** (planned)
8. **Offers AI-powered meal planning** (planned)

## 📁 Repository Structure

```
├── meater.yaml                 # Working BLE client config
├── secrets.yaml.example        # Credentials template
├── docs/                       # Project documentation
│   ├── TERMS_OF_REFERENCE.md   # Full project spec
│   ├── FEATURE_REQUIREMENTS.md # Detailed features
│   ├── USE_CASES.md            # 12 scenarios
│   └── ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md
├── meater_app/                 # Decompiled MEATER app (for research)
├── halted-ble-server-dev/      # [ON HOLD] BLE server emulation
└── halted-udp-server-dev/      # [ON HOLD] UDP/MEATER Link protocol
```

## 🔬 Halted Development Paths

### BLE Server Emulation (ON HOLD - Promising with Block) 🟡
- **Goal**: Make ESP32 appear as a MEATER probe to the official app
- **Status**: Could advertise but couldn't maintain stable connection
- **Resumption**: **Likely possible** with a MEATER Block available for BLE sniffing
- **Files**: Moved to `halted-ble-server-dev/`

### UDP/MEATER Link Protocol (ON HOLD - Hard) 🔴
- **Goal**: Emulate a MEATER Block on LAN
- **Status**: Protocol is complex (protobuf-based, 30+ message types)
- **Resumption**: **Difficult** - weeks/months of effort, uncertain outcome
- **Files**: Moved to `halted-udp-server-dev/`

## 🚀 Next Steps

1. **Implement local cooking algorithm** using MEATER data in Home Assistant
2. **Evaluate Grill Buddy** for temperature-based cooking management
3. **Set up Mealie** for recipe integration
4. **Build Lovelace dashboard** for unified cooking UI
5. **Add AI meal planning** (natural language → recipe suggestions)

## 📚 Documentation

| Document | Description |
|----------|-------------|
| [Terms of Reference](docs/TERMS_OF_REFERENCE.md) | Complete project specification |
| [Feature Requirements](docs/FEATURE_REQUIREMENTS.md) | Detailed feature specs |
| [Use Cases](docs/USE_CASES.md) | 12 real-world scenarios |
| [Temperature Research](docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md) | Probes, temps, methods |

## 🔗 Key Resources

- **Grill Buddy**: https://github.com/jeroenterheerdt/grillbuddy
- **Mealie**: https://github.com/mealie-recipes/mealie
- **Grocy**: https://github.com/grocy/grocy
- **MEATER BLE Protocol**: https://github.com/nathanfaber/meaterble
