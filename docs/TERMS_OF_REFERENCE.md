# Terms of Reference

## Kitchen Cooking Engine – Local Smart Cooking Planner

**Version:** 1.0  
**Created:** 2025-11-30  
**Status:** Active Development

---

## 1. Purpose of the Project

The goal is to create a **local-first, AI-assisted kitchen cooking system** that helps users plan, prepare, and execute meals using:

- The ingredients they have (imperfect but "good enough" inventory)
- Their kitchen equipment (gear awareness)
- Their time constraints
- Their recipes (from local recipe managers)
- Optional temperature sensors (e.g., MEATER probe via ESPHome)

The system aims to reduce user workload, improve inspiration, and offer intelligent meal planning without requiring perfect data or cloud services.

---

## 2. Vision

To build a smart cooking engine that behaves like a highly capable kitchen assistant:

- Understands available ingredients
- Understands available gear
- Knows user constraints (time, guests, assistance)
- Finds or adapts appropriate recipes
- Creates a time plan and step-by-step instructions
- Uses temperature probes when relevant
- Works entirely locally (Home Assistant + local apps)

And eventually expands into specialized domains like baking, pastries, fermentation, and slow cooking.

### Ultimate Goal Example

A user should be able to say:

> *"You know my current ingredients. I want to have a nice seafood dinner for me and 5 friends. They can shop a few things on the way here. I have 2h of prep time and they can help me cooking for 1h when they arrive. Give me 3 recipes based on my gear and stuff that we can make and let me pick."*

The system should then:
- Analyze available ingredients from inventory
- Match against available kitchen gear
- Suggest 3 suitable recipes matching all constraints
- Let user pick one
- Generate step-by-step prep instructions in Lovelace
- Create a todo-list for the user's prep work
- Generate a shopping list for friends to bring
- Coordinate cooking times with temperature monitoring

---

## 3. Scope (Phase 1 – Core System)

### 3.1 Functional Scope

The core system includes:

#### Recipe Integration

- Use **Mealie** or similar local recipe manager for full recipes, images, tags, steps
- Recipe metadata: equipment needed, prep time, cook time, tags, servings
- Ability to select recipes manually or via AI suggestions
- Import recipes from URLs automatically

#### Ingredient Awareness ("Good Enough Inventory")

- Maintain an imperfect but useful inventory (manual + Grocy)
- Inventory is a hint, not a strict truth
- Allow short shopping lists if only a few items are missing
- Allow attaching a photo of groceries on a table for a given cook session
- (Optionally) AI can analyze photos later, but not required now

#### Inventory Lifecycle Management

Items are added and removed from inventory via multiple triggers:

| Trigger | Action |
|---------|--------|
| Manual entry | Add item to inventory |
| Grocery photo (Phase 2) | AI identifies → adds items |
| Receipt scan (Phase 2) | OCR extracts → adds items |
| Item expires | Auto-remove, log as waste |
| **Item used in cook** | **Auto-deduct quantity** |
| Item marked spoiled | Remove, update expiry estimates |

#### Gear / Equipment Awareness

- Keep a list of common kitchen equipment:
  - Pots, pans, burners, oven, toaster oven, mixer, kettle, knives, etc.
  - Specialty: sous vide, air fryer, slow cooker, pressure cooker, smoker
- Recipes may declare required gear
- Planner matches recipes to available gear
- Missing gear does not block a recipe; suggestions for alternatives allowed

#### Conversational Planning

Natural language requests such as:

> "You know my current ingredients… seafood dinner for 6… I have 2h prep and 1h with help… give me 3 possible menus."

System interprets:
- Ingredient availability
- Gear availability
- Guest count
- Time windows
- Cooking methods

Returns 3 recipe/menu options with:
- Steps
- Required ingredients (mark what is already available)
- What to buy
- Equipment list
- Time plan (prep now, prep with helpers, serving time)

#### Cook Session

A structured "cooking event" with:
- Chosen recipe(s)
- Ingredients snapshot
- Attached grocery photo(s)
- Guests & servings
- Start time & time limits
- Step-by-step cooking instructions
- Optional temperature probe integration

**On cook completion:**
- Ingredients automatically deducted from inventory
- Cook logged to history
- User can rate/review the cook

#### Temperature Integration (Optional)

Support MEATER or other probes through ESPHome + Home Assistant.

**Current Status:** MEATER+ temperature data already flows into Home Assistant via BLE. The hardware integration works.

Use tip + ambient sensor data for:
- Roasting
- Oven cooking
- Internal temperature tracking
- Can add a dynamic ETA model later

**Comprehensive Temperature Reference:**

| Protein Category | Cuts Supported |
|-----------------|----------------|
| **Beef** | Ribeye, Sirloin, Filet, Roasts, Pot Roast, Brisket, Short Ribs |
| **Pork** | Chops, Tenderloin, Loin Roast, Shoulder, Belly, Ribs, Ham |
| **Poultry** | Whole, Breast, Thighs, Legs, Wings |
| **Fish** | Salmon, Tuna, Cod, Halibut, Bass, Swordfish |
| **Lamb** | Leg, Rack, Chops, Shoulder |
| **Game** | Venison, Duck, Wild Boar |
| **Vegetables** | Various with cooking methods |

**Doneness Levels (6):**
- Rare
- Medium-Rare
- Medium
- Medium-Well
- Well-Done
- Pulled/Braised

**Kitchen Cooking Methods:**
- Oven roasting/baking
- Stove-top (pan fry, sear, sauté, braise, poach)
- Air fryer
- Sous vide
- Slow cooker
- Pressure cooker

#### Lovelace UI

- Step-by-step cooking view
- Ingredient checklist
- Timeline
- Probe temperature graph (optional)
- Shopping list integration
- Todo-list for prep tasks
- Cook history

#### AI Cooking Assistance

Optional AI helper that:
- Suggests recipes based on inventory + gear + time
- Adjusts recipes for available ingredients
- Suggests substitutions
- Helps plan multi-course meals
- Answers cooking questions in context
- Coordinates timing across multiple dishes

---

## 4. Out-of-Scope (Phase 1)

These features are explicitly **not** part of the first development stage:

- Baking & pastry-specific rules
- Fermentation workflows (yogurt, sourdough, kombucha)
- Sous vide profiles / slow cooking frameworks
- Full automated pantry accuracy
- Complex MEATER-style cooking algorithms (predictions, rest modeling)
- AI-powered grocery recognition from photos
- Receipt OCR processing
- Label printing integration
- Alternative temperature probes (Combustion Inc, iGrill)

These will be added in later phases.

---

## 5. System Architecture (Phase 1 Overview)

The system will use:

### Home Assistant
- Central coordinator
- UI / Lovelace
- Automations
- Sensor data

### Recipe Backend (Preferred: Mealie)
- Full recipe storage, steps, images, metadata
- Meal plans and tags
- REST API and HA integration
- **Official Home Assistant integration** (native, not custom)
- 10,600+ stars, actively maintained

### Inventory / Gear Backend (Preferred: Grocy)
- Pantry items with expiry tracking
- Kitchen equipment list
- Shopping lists
- Recipe consumption (auto-deduct ingredients)
- REST API and HA integration

### AI Layer
- Receives structured context from HA
- Returns ranked recipe suggestions
- Builds step-by-step plans
- Interprets natural language queries

**Open Source AI Options:**
- **RecipeLLM** ([`wsargent/recipellm`](https://github.com/wsargent/recipellm)) - AI agent with Mealie integration
- **Chefmate AI** ([`ThakkarVidhi/chefmate-ai`](https://github.com/ThakkarVidhi/chefmate-ai)) - Local LLM cooking assistant with RAG

### Temperature Backend (Optional)
- ESPHome + BLE MEATER proxy
- Tip & ambient temperature
- Battery and RSSI
- Graphs and ETA (later)

### Architecture Diagram

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           KITCHEN COOKING ENGINE                             │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                              │
│  ┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐       │
│  │   MEATER+ Probe │     │   User Input    │     │   AI Assistant  │       │
│  │   (Temperature) │     │ (Natural Lang.) │     │  (Local LLM)    │       │
│  └────────┬────────┘     └────────┬────────┘     └────────┬────────┘       │
│           │                       │                       │                 │
│           ▼                       ▼                       ▼                 │
│  ┌─────────────────────────────────────────────────────────────────┐       │
│  │                      HOME ASSISTANT                              │       │
│  │  ┌─────────────┐  ┌─────────────┐  ┌─────────────────────────┐  │       │
│  │  │ Temperature │  │   Mealie    │  │    Grocy Integration    │  │       │
│  │  │   Sensors   │  │ Integration │  │      (Inventory)        │  │       │
│  │  └─────────────┘  └─────────────┘  └─────────────────────────┘  │       │
│  │         │                │                      │                │       │
│  │         ▼                ▼                      ▼                │       │
│  │  ┌─────────────────────────────────────────────────────────┐    │       │
│  │  │              LOVELACE DASHBOARD                          │    │       │
│  │  │  • Cook progress      • Inventory status                 │    │       │
│  │  │  • Recipe steps       • Shopping lists                   │    │       │
│  │  │  • Todo lists         • Temperature graphs               │    │       │
│  │  │  • Notifications      • AI meal suggestions              │    │       │
│  │  └─────────────────────────────────────────────────────────┘    │       │
│  └─────────────────────────────────────────────────────────────────┘       │
│           │                       │                       │                 │
│           ▼                       ▼                       ▼                 │
│  ┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐       │
│  │   Grill Buddy   │     │     Mealie      │     │      Grocy      │       │
│  │ (Cook Management│     │ (Recipe Database│     │   (Inventory)   │       │
│  │   + Temps)      │     │  + Meal Plans)  │     │                 │       │
│  └─────────────────┘     └─────────────────┘     └─────────────────┘       │
│                                   │                       │                 │
│                                   └───────────┬───────────┘                 │
│                                               ▼                             │
│                                  ┌─────────────────────┐                   │
│                                  │   COOK A RECIPE     │                   │
│                                  │   → Ingredients     │                   │
│                                  │     auto-deducted   │                   │
│                                  │     from inventory  │                   │
│                                  └─────────────────────┘                   │
│                                                                              │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## 6. Design Principles

1. **Local-first** – No cloud dependence required
2. **Low user workload** – Don't push users through heavy data entry
3. **"Good enough" ingredient accuracy** – Perfect pantry tracking is not required
4. **Flexible & expandable** – All features should be modular
5. **Kitchen-first** – Not grill-oriented; supports everyday indoor cooking
6. **Human interaction first** – Natural language conversation and intuitive UI
7. **Start simple, grow over time** – Phase 1 builds the foundation
8. **Open source preference** – Use existing open source tools where possible

---

## 7. Deliverables (Phase 1)

### Data Models
- Recipes (via Mealie)
- Ingredients (soft inventory via Grocy)
- Gear/Equipment list
- Cook session structure
- Time planning model

### Specifications
- Conversation planner specification
- AI prompt structure for menu planning
- Temperature reference tables (proteins, cuts, doneness, methods)

### User Interface
- Basic Lovelace UI layout
- Step-by-step cooking view
- Ingredient checklist
- Shopping list view

### Integrations
- Mealie (recipes)
- Grocy (inventory)
- Home Assistant sensors
- Grill Buddy (temperature-based cooking)

### Optional
- Probe integration (MEATER+)
- ETA logic for roast cooking

---

## 8. Success Criteria (Phase 1)

The system is considered successful when:

### A user can ask:

> "I want to cook for 6 people with 2h prep and limited ingredients — suggest 3 menus."

### …and the system returns:

Three plausible menus matching:
- Available ingredients
- Available gear
- Time constraints
- Number of guests

### And the user can:

1. Select one menu/recipe
2. See the steps
3. See what to buy (shopping list)
4. See what gear is needed
5. Follow the plan in a Lovelace UI
6. (Optional) Monitor temperature with probes
7. Have ingredients auto-deducted on completion

**With no barcodes and minimal data entry.**

---

## 9. Future Scope (Phase 2+)

To be added after Phase 1:

### 🥖 Baking Modules
- Bread proofing temperature monitoring
- Internal bread temperature for doneness
- Oven temperature tracking and alerts
- Timer integrations for bake times

### 🥐 Pastry Modules
- Laminated dough temperature monitoring (butter layer temps)
- Proofing environment control
- Pastry cream and custard temperature targets
- Choux pastry internal temperatures

### 🧫 Fermentation Workflows
- **Yogurt** - Temperature hold at 43-46°C (110-115°F) for 6-12 hours
- **Sourdough** - Proofing temperature monitoring (24-27°C / 75-80°F)
- **Kombucha** - Fermentation temperature (20-30°C / 68-86°F) over days/weeks
- **Kefir, Kimchi, Sauerkraut** - Long-term fermentation tracking
- Ambient environment monitoring
- Multi-day/week tracking with notifications

### 🍲 Slow Cooking & Sous Vide
- Extended cook time support (8-24+ hours)
- Low temperature holds (90-95°C / 195-205°F)
- Overnight cook safety monitoring
- Power failure detection and alerts
- Braising and stewing temperature curves
- Sous vide profiles and water bath monitoring

### 📷 AI-Powered Grocery Recognition

**Low-effort grocery intake** (no barcode scanning required):
1. **Receipt photo/scan** → OCR extracts items, quantities, prices, expiry hints
2. **One photo of all groceries** on kitchen table → AI identifies items and matches them to receipt

- AI matches visible items to receipt line items for verification
- Auto-add identified items to inventory (Grocy)
- Label printing with QR codes (optional)

**Open Source Tools for Phase 2:**
- **Receipt Wrangler** ([receiptwrangler.io](https://receiptwrangler.io/)) - Receipt OCR
- **Receipt-OCR** ([`bhimrazy/receipt-ocr`](https://github.com/bhimrazy/receipt-ocr)) - FastAPI receipt processing

### 🌡️ Alternative Temperature Probes

**Combustion Inc Predictive Thermometer** - Has officially documented, open BLE protocol:
- Full BLE spec: [`combustion-inc/combustion-documentation`](https://github.com/combustion-inc/combustion-documentation)
- Official SDKs (iOS, Android, Python)
- Existing HA integration: [`legrego/homeassistant-combustion`](https://github.com/legrego/homeassistant-combustion)
- 8 temperature sensors (vs MEATER's 2)
- Predictive cooking with ML

### 🔬 Advanced Cooking Algorithms
- Complex MEATER-style predictions
- Rest time modeling (carryover cooking)
- Dynamic ETA based on temperature curves
- Multi-probe coordination

### 🍽️ Smart Dietary Preferences
- Allergen tracking
- Dietary restrictions (vegetarian, vegan, gluten-free, etc.)
- Nutritional calculations
- Calorie/macro tracking

### 🍱 Multi-Recipe Coordinated Meal Planning
- Coordinate timing across multiple dishes
- Shared ingredient optimization
- Course sequencing (appetizer → main → dessert)
- Kitchen resource scheduling (oven, burners, etc.)

---

## 10. Open Source Resources

### Recipe Management
- **Mealie** ([`mealie-recipes/mealie`](https://github.com/mealie-recipes/mealie)) - 10,600+ stars, official HA integration
- **Tandoor Recipes** ([`vabene1111/recipes`](https://github.com/vabene1111/recipes)) - OCR for scanning cookbooks

### Inventory Management
- **Grocy** ([grocy.info](https://grocy.info/)) - Kitchen ERP with recipe consumption

### AI Cooking Assistants
- **RecipeLLM** ([`wsargent/recipellm`](https://github.com/wsargent/recipellm)) - AI agent with Mealie + ntfy
- **Chefmate AI** ([`ThakkarVidhi/chefmate-ai`](https://github.com/ThakkarVidhi/chefmate-ai)) - Local LLM with RAG

### Temperature Probes
- **esphome-igrill** ([`bendikwa/esphome-igrill`](https://github.com/bendikwa/esphome-igrill)) - iGrill ESPHome integration
- **homeassistant-combustion** ([`legrego/homeassistant-combustion`](https://github.com/legrego/homeassistant-combustion)) - Combustion Inc HA integration

### Home Assistant Cooking
- **Grill Buddy** ([`jeroenterheerdt/grillbuddy`](https://github.com/jeroenterheerdt/grillbuddy)) - Cooking management integration
- **HA Cooking PoC** ([Community Thread](https://community.home-assistant.io/t/cooking-with-home-assistant-proof-of-concept/815041))

---

## 11. Document History

| Version | Date | Changes |
|---------|------|---------|
| 1.0 | 2025-11-30 | Initial ToR based on project discussions |

---

## 12. Appendix: Related Documents

- `docs/FEATURE_REQUIREMENTS.md` - Detailed feature requirements and AI vision
- `docs/ALTERNATIVE_TEMPERATURE_PROBES_RESEARCH.md` - Research on alternative probes and protocols
- `STATUS.md` - Current project status
