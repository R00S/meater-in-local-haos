# Feature Requirements: Local MEATER Cooking System

**Created:** 2025-11-30  
**Status:** Feature requirements for building a comprehensive local cooking management system

---

## Vision

Build a **local, cloud-free cooking management system** that replicates and extends MEATER app functionality, integrated with Home Assistant, AI-powered meal planning, and open-source recipe management platforms.

**Ultimate Goal:** An intelligent cooking assistant where users can say:

> *"You know my current ingredients. I want to have a nice seafood dinner for me and 5 friends. They can shop a few things on the way here. I have 2h of prep time and they can help me cooking for 1h when they arrive. Give me 3 recipes based on my gear and stuff that we can make and let me pick."*

The system should then:
- Analyze available ingredients (from inventory)
- Suggest 3 suitable recipes matching constraints
- Let user pick one
- Generate step-by-step prep instructions in Lovelace
- Create a todo-list for the user's prep work
- Generate a shopping list for friends to bring

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

## 🔮 Future Cooking Categories (Phase 2+)

### 🥖 Baking
- [ ] Bread baking with proofing temperature monitoring
- [ ] Internal bread temperature for doneness
- [ ] Oven temperature tracking and alerts
- [ ] Timer integrations for bake times

### 🥐 Pastries
- [ ] Laminated dough temperature monitoring (butter layer temps)
- [ ] Proofing environment control
- [ ] Pastry cream and custard temperature targets
- [ ] Choux pastry internal temperatures

### 🧫 Fermentation
- [ ] **Yogurt** - Temperature hold at 43-46°C (110-115°F) for 6-12 hours
- [ ] **Sourdough** - Proofing temperature monitoring (24-27°C / 75-80°F)
- [ ] **Kombucha** - Fermentation temperature (20-30°C / 68-86°F) over days/weeks
- [ ] **Kefir, Kimchi, Sauerkraut** - Long-term fermentation tracking
- [ ] Ambient environment monitoring
- [ ] Multi-day/week tracking with notifications

### 🍲 Slow Cooking
- [ ] Extended cook time support (8-24+ hours)
- [ ] Low temperature holds (90-95°C / 195-205°F)
- [ ] Overnight cook safety monitoring
- [ ] Power failure detection and alerts
- [ ] Braising and stewing temperature curves

### Integration Considerations
These categories require:
- Extended time tracking (hours to weeks vs minutes to hours)
- Ambient/environment temperature monitoring (not just probe)
- Different notification patterns (periodic check-ins vs goal alerts)
- Historical tracking for fermentation batches

---

## 🤖 AI-Powered Meal Planning Assistant

### Natural Language Meal Planning
- [ ] Accept natural language queries about meal planning
- [ ] Understand constraints: number of guests, prep time, cooking time, dietary restrictions
- [ ] Know what help is available (friends can shop, help cook)
- [ ] Suggest multiple recipe options based on constraints

### Ingredient Inventory Awareness
- [ ] Track current ingredients in pantry/fridge (via Grocy or Mealie)
- [ ] Know what's running low or expired
- [ ] Suggest recipes based on available ingredients
- [ ] Identify what needs to be purchased

### 📷 AI-Powered Grocery Recognition & Inventory

#### Low-Effort Grocery Intake (No Barcode Scanning)

**Two inputs only:**
1. **Receipt photo/scan** → OCR extracts items, quantities, prices, expiry hints
2. **One photo of all groceries** on kitchen table → AI vision identifies items

- [ ] Receipt OCR to extract items, quantities, prices
- [ ] Single photo of groceries on table for AI identification
- [ ] Cross-reference receipt + photo for accuracy
- [ ] Auto-add identified items to inventory (Grocy/Mealie)
- [ ] Match purchased items to shopping list, mark as complete

#### Label Printing Integration (Optional)
- [ ] Generate labels for identified items
- [ ] Include: item name, purchase date, expiry date, storage location
- [ ] Print via ESPHome label printer or network printer
- [ ] QR codes linking to inventory entry

#### Automatic Inventory Depletion
- [ ] Track expiry dates from receipts/packaging
- [ ] AI estimates expiry for items without dates (e.g., produce)
- [ ] Notifications before items expire
- [ ] Suggest recipes that use soon-to-expire ingredients first
- [ ] **Auto-remove expired items from inventory**
- [ ] **Auto-deduct ingredients when used in cooks**
- [ ] Track partial usage (e.g., used half the onions)
- [ ] Link cook sessions to ingredient consumption

#### Inventory Removal Triggers
| Trigger | Action |
|---------|--------|
| Item expires | Auto-remove from inventory, log as waste |
| Item used in cook | Deduct quantity, link to recipe/cook session |
| Item marked spoiled | Remove, log as waste, update expiry estimates |
| Item manually consumed | Deduct via UI or voice command |

#### Inventory Flow
```
Groceries arrive → Photo on kitchen table → AI identifies items
       ↓
Receipt scanned → Prices/expiry extracted → Label printed
       ↓
Items added to Grocy/Mealie inventory → Expiry tracked
       ↓
┌─────────────────────────────────────────────────────┐
│                 ITEM LIFECYCLE                       │
├─────────────────────────────────────────────────────┤
│ Approaching expiry → Notification + recipe suggest  │
│ Used in cook → Auto-deduct from inventory           │
│ Expired → Auto-remove + log as waste                │
│ Spoiled early → Manual remove + adjust AI estimates │
└─────────────────────────────────────────────────────┘
```

### Smart Recipe Suggestions
- [ ] Filter by cuisine type, dietary needs, cooking skill level
- [ ] Match recipes to available equipment (oven, grill, sous vide, etc.)
- [ ] Consider prep time + cooking time constraints
- [ ] Account for multi-dish meal coordination

### Dynamic Task Generation
- [ ] Generate prep todo-list in Lovelace
- [ ] Create cooking step-by-step instructions
- [ ] Time-synchronized prompts ("start rice now, it'll be ready when fish is done")
- [ ] Assign tasks to helpers when available

### Shopping List Generation
- [ ] Auto-generate shopping list for missing ingredients
- [ ] Split list by store sections (produce, meat, dairy)
- [ ] Share shopping list with guests/helpers
- [ ] Track what's been purchased

### Example Workflow
```
User: "Seafood dinner for 6, 2h prep, friends can shop and help cook 1h"
     ↓
AI: Analyzes inventory, suggests 3 recipes:
    1. Grilled Salmon with Roasted Vegetables
    2. Shrimp Scampi with Garlic Bread
    3. Seafood Paella
     ↓
User: Picks "Seafood Paella"
     ↓
System generates:
    • Prep todo-list for user (2h before guests arrive)
    • Shopping list for friends (shared via HA app)
    • Cooking instructions for when friends arrive (1h)
    • MEATER probe target temps for proteins
    • Timing coordination for all components
```

---

## Open Source AI Cooking Projects

### 1. RecipeLLM 🌟 (RECOMMENDED - Integrates with Mealie)

**Repository:** [`wsargent/recipellm`](https://github.com/wsargent/recipellm)  
**Description:** AI Agent that walks you through cooking recipes

**Features:**
- Integrates directly with **Mealie** (recipe manager)
- Uses **Letta** (formerly MemGPT) for AI memory
- **ntfy** for notifications
- Step-by-step recipe guidance
- Docker deployment

**Why RecipeLLM:**
- Already combines Mealie + AI + Notifications
- Designed for Home Assistant-style workflows
- Open source and self-hosted

---

### 2. Chefmate AI

**Repository:** [`ThakkarVidhi/chefmate-ai`](https://github.com/ThakkarVidhi/chefmate-ai)  
**Description:** AI cooking assistant with RAG and local LLM

**Features:**
- Retrieval-Augmented Generation (RAG) for recipes
- Local LLM (Mistral 7B) - no cloud needed
- Semantic search with MiniLM embeddings
- FAISS vector database for recipe retrieval
- Dietary filter support
- Chat interface for queries

**Why Chefmate:**
- Fully local/private - no external APIs
- Can query "what can I make with X ingredients"
- Conversational interface

---

### 3. Home Assistant Cooking Proof of Concept

**Source:** [HA Community Thread](https://community.home-assistant.io/t/cooking-with-home-assistant-proof-of-concept/815041)

**Features:**
- Recipe storage and retrieval via HA
- Set current dinner
- List ingredients
- Step-by-step instructions
- Avoids AI hallucination by using stored recipes

---

## Open Source Inventory & Receipt Tools

### 1. Grocy 🌟 (RECOMMENDED for Inventory)

**Website:** [grocy.info](https://grocy.info/)  
**Description:** ERP beyond your fridge - self-hosted groceries & household management

**Features:**
- Stock/inventory tracking with expiry dates
- Manual entry or API-based intake
- Recipe management with ingredient consumption
- **Auto-consume ingredients when cooking recipes**
- Shopping list generation
- Chores and tasks management
- REST API for integration
- Home Assistant integration available

**Why Grocy:**
- Mature, well-maintained project
- Built-in recipe → inventory consumption
- Tracks expiry and sends notifications
- Perfect for the "use in cooks" requirement

---

### 2. Receipt Wrangler

**Website:** [receiptwrangler.io](https://receiptwrangler.io/)  
**Description:** Open-source receipt management with AI extraction

**Features:**
- OCR scanning of receipts
- AI extraction of line items, prices, dates
- Email integration for digital receipts
- Self-hosted, privacy-focused
- API for integration

**Use Case:** Photo of grocery receipt → extract items → add to Grocy inventory

---

### 3. Receipt-OCR

**Repository:** [`bhimrazy/receipt-ocr`](https://github.com/bhimrazy/receipt-ocr)  
**Description:** Efficient OCR engine for receipt image processing

**Features:**
- Tesseract OCR + AI models (OpenAI/Gemini/Groq)
- FastAPI web service
- Docker deployment
- Batch processing
- Structured data extraction (items, prices, dates)

---

## System Architecture

### Complete Integrated System
```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           KITCHEN MANAGEMENT SYSTEM                          │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                              │
│  ┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐       │
│  │   MEATER+ Probe │     │  Kitchen Camera │     │ Receipt Scanner │       │
│  │   (Temperature) │     │ (Grocery Photos)│     │    (OCR/AI)     │       │
│  └────────┬────────┘     └────────┬────────┘     └────────┬────────┘       │
│           │                       │                       │                 │
│           ▼                       ▼                       ▼                 │
│  ┌─────────────────────────────────────────────────────────────────┐       │
│  │                      HOME ASSISTANT                              │       │
│  │  ┌─────────────┐  ┌─────────────┐  ┌─────────────────────────┐  │       │
│  │  │ Temperature │  │   AI/LLM    │  │    Grocy Integration    │  │       │
│  │  │   Sensors   │  │   Layer     │  │      (Inventory)        │  │       │
│  │  └─────────────┘  └─────────────┘  └─────────────────────────┘  │       │
│  │         │                │                      │                │       │
│  │         ▼                ▼                      ▼                │       │
│  │  ┌─────────────────────────────────────────────────────────┐    │       │
│  │  │              LOVELACE DASHBOARD                          │    │       │
│  │  │  • Cook progress      • Inventory status                 │    │       │
│  │  │  • Recipe steps       • Shopping lists                   │    │       │
│  │  │  • Todo lists         • Expiry warnings                  │    │       │
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

### Data Flow: Grocery → Cook → Depletion
```
1. GROCERY INTAKE
   Groceries arrive → Photo/Receipt → AI identifies → Added to Grocy
                                                    → Labels printed
                                                    → Expiry tracked

2. MEAL PLANNING
   User asks AI → "Seafood dinner for 6"
   AI checks Grocy → Suggests recipes using available ingredients
   User picks recipe → Todo list generated → Shopping list for missing items

3. COOKING
   Recipe started → Step-by-step in Lovelace
   MEATER+ monitors temps → Alerts when done
   Recipe completed → Ingredients auto-deducted from Grocy

4. LIFECYCLE MANAGEMENT
   Items approaching expiry → AI suggests recipes to use them
   Items expired → Auto-removed from inventory
   Items used in cook → Auto-deducted from inventory
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
- Manual and API-based entry
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
