# Agent Handoff Document

## Project Status: Ready for Phase 1 Implementation

This document summarizes the current state and provides guidance for the next development agent.

## What's Working Now

### BLE Client (`meater.yaml`)
- ✅ Reads tip temperature from MEATER+ probe
- ✅ Reads ambient temperature from MEATER+ probe  
- ✅ Reads battery level
- ✅ Reads firmware version
- ✅ Reads RSSI signal strength
- ✅ Uses `!secret` references for all credentials
- ✅ Tested and verified working

### Data Flow
```
MEATER+ Probe → ESP32 (BLE Client) → Home Assistant → Sensors available for automation
```

## What Needs to Be Built (Phase 1)

See `docs/TERMS_OF_REFERENCE.md` for full specification.

### Priority 1: Local MEATER Cooking Algorithm
Reproduce MEATER app's core cooking features:
- **Target temperatures by protein + cut + doneness** (see `docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md` for tables)
- **Dynamic ETA prediction** using tip + ambient temperatures
- **Resting phase prediction** (carryover cooking)
- **Notifications** at key moments (approaching target, remove now, rest complete)

### Priority 2: Lovelace UI
- Cook session view with temperature graph
- Protein/cut/doneness selector
- ETA countdown
- Step-by-step instructions (when integrated with recipes)

### Priority 3: Recipe Integration
- Connect to Mealie for recipe database
- Link recipes to cook sessions
- Pull cooking instructions and temperatures from recipes

## Key Design Principles

1. **Low user workload** - Never require excessive data entry
2. **Inspiration over strict filtering** - Inventory biases AI toward ideas, not just matching
3. **Progressive improvement** - Data accuracy improves over time, not enforced upfront
4. **Local-first** - No cloud dependencies required

## Important Files

| File | Purpose |
|------|---------|
| `docs/TERMS_OF_REFERENCE.md` | Complete project specification |
| `docs/FEATURE_REQUIREMENTS.md` | Detailed feature specs |
| `docs/USE_CASES.md` | 12 real-world scenarios |
| `docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md` | Temperature tables, protein cuts, doneness levels |
| `meater.yaml` | Working BLE client configuration |
| `secrets.yaml.example` | Template for credentials |
| `meater_app/` | Decompiled MEATER app (for algorithm research) |

## Halted Development (For Reference)

### BLE Server Emulation (`halted-ble-server-dev/`)
- 🟡 **Status**: Promising but needs MEATER Block for BLE sniffing
- Could advertise as MEATER device but couldn't maintain stable app connection
- All GATT structure implemented correctly
- **Resume when**: MEATER Block available for traffic analysis

### UDP/MEATER Link Protocol (`halted-udp-server-dev/`)
- 🔴 **Status**: Hard to complete
- Complex protobuf protocol with 30+ message types
- Would require weeks/months of effort
- **Recommendation**: Focus on BLE approach if resuming

## Recommended Open Source Stack

| Component | Tool | Purpose |
|-----------|------|---------|
| Recipe Database | Mealie | Recipes, meal planning, HA integration |
| Inventory | Grocy | Pantry tracking, recipe consumption |
| Temperature Cooking | Grill Buddy (starting point) | Basic probe cooking management |
| AI Assistant | RecipeLLM / Chefmate AI | Local LLM cooking assistance |

## Phase 2+ (Future)

- Baking, pastries, fermentation, slow cooking modules
- AI grocery recognition (receipt + photo)
- Combustion Inc probe support (open BLE protocol)
- Advanced cooking algorithms with ML

## Getting Started

1. Read `docs/TERMS_OF_REFERENCE.md` thoroughly
2. Review the temperature tables in `docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md`
3. Study the decompiled app in `meater_app/` for cooking algorithm insights
4. Start with the cooking algorithm implementation (Priority 1)

## Questions?

Check the PR discussions for context on design decisions. The conversation covers extensive requirements gathering and rationale for the current approach.
