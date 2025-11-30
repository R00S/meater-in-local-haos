# Feature Requirements: Local MEATER Cooking System

**Created:** 2025-11-30  
**Status:** Feature requirements for building a comprehensive local cooking management system

---

## Vision

Build a **local, cloud-free cooking management system** that replicates and extends MEATER app functionality, integrated with Home Assistant and open-source recipe management platforms.

---

## Core Requirements (MEATER App Replacement)

### ✅ Temperature Monitoring
- [x] Use MEATER hardware without cloud dependency
- [x] Read tip temperature (internal meat temperature)
- [x] Read ambient temperature (cooking environment)
- [x] Support for multiple probes simultaneously
- [x] Real-time temperature updates in Home Assistant

### ✅ Cooking Algorithm
- [ ] Reproduce MEATER's full cooking algorithm locally
- [ ] Use both tip + ambient temperatures for calculations
- [ ] Support multiple cuts and cooking styles
- [ ] Dynamic ETA predictions based on temperature curves
- [ ] Resting-phase forecasts (carryover cooking prediction)
- [ ] Account for ambient temperature changes during cook

### ✅ User Interface
- [ ] Graphs showing temperature over time (tip + ambient)
- [ ] Progress indicators (% done, time remaining)
- [ ] Notifications (goal reached, temperature alerts, cook stages)
- [ ] Home Assistant dashboard integration (Lovelace cards)
- [ ] Mobile-friendly interface

---

## Extended Features (Beyond MEATER App)

### 📋 Guided Cooking
- [ ] Step-by-step cooking instructions in Lovelace
- [ ] Ingredient lists with quantities
- [ ] Timing prompts for each step
- [ ] Visual guides for techniques

### 📸 Ingredient & Photo Management
- [ ] Photos of bought ingredients
- [ ] Photos of ingredients used in cooks
- [ ] Photos of cleaned out / depleted ingredients
- [ ] Cook history with photos

### 🍳 Recipe Integration
- [ ] Connection to recipe databases (Mealie, Tandoor Recipes)
- [ ] Import recipes from URLs
- [ ] Link recipes to temperature profiles
- [ ] Associate cooks with specific recipes
- [ ] Shopping list generation

### 📊 Cook History & Analytics
- [ ] Log all cooks with temperatures, times, results
- [ ] Rate/review completed cooks
- [ ] Notes for future reference
- [ ] Temperature curve storage for reference
- [ ] Success/failure tracking

### 🔄 Easily Expandable System
- [ ] Plugin architecture for new features
- [ ] Custom protein/cut definitions
- [ ] User-defined temperature profiles
- [ ] Custom notification rules
- [ ] API for third-party integrations

---

## System Architecture

### Temperature Data Layer
```
MEATER+ Probe → BLE → ESP32/HA Bluetooth → Home Assistant Sensors
```

### Cooking Management Layer
```
Home Assistant → Grill Buddy (or custom integration) → Notifications
                                                     → Dashboard
                                                     → Automations
```

### Recipe & Ingredient Layer
```
Mealie/Tandoor ← API → Home Assistant → Lovelace Dashboard
      ↓
Recipe Database
Meal Planning
Shopping Lists
Ingredient Photos
```

---

## Open Source Platforms to Build Upon

### 1. Mealie 🌟 (RECOMMENDED for Recipe Management)

**Repository:** [`mealie-recipes/mealie`](https://github.com/mealie-recipes/mealie)  
**Stars:** 10,600+  
**Language:** Python/Vue.js

**Why Mealie:**
- **Official Home Assistant integration** (native, not custom)
- Self-hosted recipe manager with beautiful UI
- Import recipes from URLs automatically
- Meal planning and shopping lists
- REST API for full integration
- Multi-user/group support
- Docker deployment

**Home Assistant Integration Features:**
- Sensors for recipes, categories, tags
- Actions for meal plans, recipe details
- Import recipes directly from HA
- Calendar integration for meal plans
- Shopping list sync

**Setup:**
```yaml
# docker-compose.yml
services:
  mealie:
    image: ghcr.io/mealie-recipes/mealie:latest
    ports:
      - "9000:9000"
    volumes:
      - mealie-data:/app/data
    environment:
      - ALLOW_SIGNUP=true
```

---

### 2. Tandoor Recipes (Alternative)

**Repository:** [`vabene1111/recipes`](https://github.com/vabene1111/recipes)  
**Features:**
- OCR for scanning physical cookbooks
- Powerful meal planning
- Automatic grocery list generation
- No analytics/tracking (privacy-focused)
- Community Home Assistant integration available

---

### 3. Grocy (Inventory + Recipes)

**Website:** [grocy.info](https://grocy.info/)  
**Features:**
- Web-based ERP for household
- Stock/inventory tracking
- Recipe management with ingredient tracking
- Barcode scanning
- Chores and tasks
- Home Assistant integration via API

**Best For:** Complete kitchen inventory management alongside recipes

---

### 4. KitchenOwl (Shopping + Recipes)

**Repository:** [`TomBursch/kitchenowl`](https://github.com/TomBursch/kitchenowl)  
**Features:**
- Recipe manager + grocery list
- Expense tracking
- Mobile apps (iOS/Android)
- Self-hosted with Docker

---

## Integration Architecture

### Recommended Stack

```
┌─────────────────────────────────────────────────────────────┐
│                    HOME ASSISTANT                            │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────────────┐  │
│  │   MEATER+   │  │ Grill Buddy │  │    Mealie API      │  │
│  │  Sensors    │  │ Integration │  │    Integration     │  │
│  └─────────────┘  └─────────────┘  └─────────────────────┘  │
│         │                │                    │              │
│         ▼                ▼                    ▼              │
│  ┌─────────────────────────────────────────────────────┐    │
│  │              LOVELACE DASHBOARD                      │    │
│  │  • Temperature graphs    • Recipe cards              │    │
│  │  • Cook progress         • Ingredient lists          │    │
│  │  • Notifications         • Step-by-step guides       │    │
│  │  • History/analytics     • Shopping lists            │    │
│  └─────────────────────────────────────────────────────┘    │
└─────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────┐
│                      MEALIE                                  │
│  • Recipe database         • Meal planning                  │
│  • Import from URLs        • Shopping lists                 │
│  • Ingredient photos       • REST API                       │
│  • Cook history notes      • Multi-user support             │
└─────────────────────────────────────────────────────────────┘
```

---

## Implementation Phases

### Phase 1: Core Temperature Monitoring (DONE)
- [x] MEATER+ → Home Assistant data flow
- [x] Basic temperature sensors in HA

### Phase 2: Cooking Management
- [ ] Install and configure Grill Buddy
- [ ] Add custom protein/cut definitions
- [ ] Set up notifications for cook events
- [ ] Create Lovelace dashboard for cooking

### Phase 3: Recipe Integration
- [ ] Deploy Mealie with Docker
- [ ] Configure Home Assistant Mealie integration
- [ ] Create recipe cards linking to temperature profiles
- [ ] Build unified cooking dashboard

### Phase 4: Extended Features
- [ ] Step-by-step cooking guides in Lovelace
- [ ] Ingredient photo management
- [ ] Cook history and analytics
- [ ] Shopping list automation

### Phase 5: Custom Development (If Needed)
- [ ] Custom Home Assistant integration for advanced cooking algorithms
- [ ] Machine learning for temperature prediction (like MEATER)
- [ ] Mobile app or PWA for cooking interface

---

## Hardware Requirements

- **MEATER+ probe** (already owned)
- **Home Assistant** (already running)
- **Docker host** for Mealie (can be same as HA or separate)
- **ESP32** (optional, for extended BLE range)

---

## Next Steps

1. **Immediate:** Configure Grill Buddy with comprehensive protein/cut definitions
2. **Short-term:** Deploy Mealie and integrate with Home Assistant
3. **Medium-term:** Build custom Lovelace dashboard combining temperature + recipes
4. **Long-term:** Develop custom integration for advanced cooking algorithms

---

## References

### Home Assistant Integrations
- [Mealie Integration](https://www.home-assistant.io/integrations/mealie)
- [Grill Buddy](https://github.com/jeroenterheerdt/grillbuddy)

### Recipe Management
- [Mealie](https://github.com/mealie-recipes/mealie)
- [Tandoor Recipes](https://github.com/vabene1111/recipes)
- [Grocy](https://grocy.info/)
- [KitchenOwl](https://github.com/TomBursch/kitchenowl)

### Related Projects
- [RecipeLLM](https://github.com/wsargent/recipellm) - AI agent for walking through recipes with Mealie
