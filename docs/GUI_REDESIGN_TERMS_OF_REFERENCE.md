# Terms of Reference: Kitchen Cooking Engine GUI Redesign

**Version:** 3.2  
**Created:** 2026-01-16  
**Updated:** 2026-03-15  
**Status:** Phases 1–6 Complete + v0.5.2.x appliance features + v0.5.4.x stability & UX, Phases 7–8 Remaining  
**Supersedes:** Current single-path GUI implementation

---

## 1. Executive Summary

This document defines the requirements for redesigning the Kitchen Cooking Engine user interface to support multiple cooking workflows through a unified, appliance-centric navigation system. The redesign introduces a welcome screen with appliance selection that routes users to appropriate cooking paths based on their chosen appliance type.

---

## 2. Purpose

The GUI redesign aims to:

1. **Simplify Navigation** - Provide a single, intuitive entry point for all cooking workflows
2. **Support Multiple Appliances** - Enable distinct workflows for different cooking appliances
3. **Improve Discoverability** - Make all available features and cooking paths visible from the welcome screen
4. **Enable Recipe Reuse** - Provide easy access to previous cooks across all appliance types
5. **Unify User Experience** - Create a consistent interaction pattern across all cooking modes

---

## 3. Scope

### 3.1 In Scope

- Welcome screen with appliance selector
- Three main cooking paths:
  1. MEATER Probe Path
  2. Ninja Combi Path
  3. AI Recipe Builder Path
- Previous cooks history and restart functionality
- Recipe cook flow with step-by-step guidance
- MEATER probe integration within recipe cook
- Star rating system for completed cooks
- **Multilingual support**:
  - Swedish and English implemented
  - Architecture supports adding more languages in the future
- **Measurement systems**:
  - Swedish measurements (default)
  - UK measurements (if different from Swedish)
  - US measurements
  - Pure metric (g, kg, cl, dl, l)
  - User-selectable with system-wide preference
- **Serving size adjustment**:
  - Number of servings selectable in all recipes
  - Automatic ingredient scaling based on servings

### 3.2 Out of Scope

- Adding new appliance types (limited to existing: MEATER, Ninja Combi, other appliances)
- Advanced meal planning features
- Multi-recipe coordination
- Inventory management integration
- Shopping list generation
- These features remain candidates for future phases

---

## 4. System Architecture

### 4.1 Navigation Flow

```
┌─────────────────────────────────────────────────────────────────┐
│                        WELCOME SCREEN                            │
│                   (Appliance Selector)                           │
│                                                                  │
│  ┌──────────┐  ┌──────────┐  ┌──────────┐  ┌──────────┐       │
│  │  MEATER  │  │  Ninja   │  │  Other   │  │ Previous │       │
│  │  Probe   │  │  Combi   │  │Appliance │  │  Cooks   │       │
│  └──────────┘  └──────────┘  └──────────┘  └──────────┘       │
└─────────────────────────────────────────────────────────────────┘
       │              │              │              │
       ▼              ▼              ▼              ▼
┌───────────┐  ┌───────────┐  ┌───────────┐  ┌───────────┐
│  MEATER   │  │  NINJA    │  │    AI     │  │ PREVIOUS  │
│   PATH    │  │   PATH    │  │  RECIPE   │  │   COOKS   │
│           │  │           │  │  BUILDER  │  │   PATH    │
└───────────┘  └───────────┘  └───────────┘  └───────────┘
```

### 4.2 Path Selection Logic

| User Clicks | System Action | Destination Path |
|-------------|---------------|------------------|
| MEATER Probe | Check appliance type = MEATER | MEATER Probe Path |
| Ninja Combi | Check appliance type = Ninja combi | Ninja Combi Path |
| Any Other Appliance | Check appliance type ≠ MEATER/Ninja combi | AI Recipe Builder Path |
| Previous Cooks | Navigate to history | Previous Cooks Path |

### 4.3 Global System Features

These features apply system-wide across all paths and cook types:

#### 4.3.1 Multilingual Support

**Requirement:** The system must be multilingual with Swedish and English implemented, and the ability to add more languages in the future.

**Implementation:**
- All UI text, labels, buttons, and messages must be translatable
- Language selector in system settings
- **Default language:** Based on Home Assistant's configured language
- **Implemented languages:** Swedish (sv), English (en)
- **Future extensibility:** Architecture supports adding additional languages through translation files

**Translation coverage:**
- All UI elements (buttons, labels, headers)
- Path names and navigation
- Cook type names
- Recipe instructions and ingredient names
- Error messages and notifications
- Guide step instructions
- System messages and alerts

**Format:** Use i18n/l10n standard approach (e.g., JSON translation files or Home Assistant's translation system)

#### 4.3.2 Measurement Systems

**Requirement:** Measurements and scales should be selectable with Swedish measurements as default, UK (if different from Swedish), US, and pure metric as options.

**Measurement System Options:**

1. **Swedish** (default)
   - **Mass:** gram (g), hektogram (hg), kilogram (kg)
   - **Volume:** kryddmått (krm), tesked (tsk), matsked (msk), centiliter (cl), deciliter (dl), liter (l)
   - **Temperature:** Celsius (°C)
   - **Standard conversions:**
     - 1 krm = 1 ml (spice measure)
     - 1 tsk = 5 ml = 5 krm (teaspoon)
     - 1 msk = 15 ml = 3 tsk (tablespoon)
     - 1 dl = 100 ml = 10 cl
     - 1 hg = 100 g (hectogram, common in Swedish grocery stores)
   - **Note:** Swedish cooking traditionally uses kryddmått, tesked, and matsked. **Cups are NOT used** in Swedish recipes. Deciliter (dl) is commonly used for both liquids and dry goods like flour and sugar.
   
2. **UK** (if different from Swedish)
   - Imperial measurements where applicable
   - Temperature: Celsius (°C)
   
3. **US**
   - **Mass:** ounces (oz), pounds (lb)
   - **Volume:** teaspoon (tsp), tablespoon (tbsp), cup, pint, quart, gallon
   - **Temperature:** Fahrenheit (°F)
   
4. **Pure Metric**
   - **Mass:** gram (g), kilogram (kg)
   - **Volume:** milliliter (ml), centiliter (cl), deciliter (dl), liter (l)
   - **Temperature:** Celsius (°C)
   - **Note:** Pure metric (without tsk/msk/krm) is becoming more common in Swedish baking recipes, especially professional and modern recipes.

**Implementation:**
- Measurement system selector in system settings
- Real-time conversion of all ingredient quantities
- Temperature conversion for all cooking targets
- Persistent preference across sessions
- Applies to all recipes regardless of source (Ninja combi, AI, etc.)

**Swedish Measurement Conversion Reference:**

| Swedish Unit | Abbreviation | Metric Equivalent | Notes |
|--------------|--------------|-------------------|-------|
| Kryddmått | krm | 1 ml | Spice measure, smallest unit |
| Tesked | tsk | 5 ml | Teaspoon = 5 krm |
| Matsked | msk | 15 ml | Tablespoon = 3 tsk = 15 krm |
| Centiliter | cl | 10 ml | Rarely used in recipes |
| Deciliter | dl | 100 ml | Very common for both liquid and dry |
| Liter | l | 1000 ml | Standard liquid measure |
| Gram | g | 1 g | Standard weight for baking/cooking |
| Hektogram | hg | 100 g | Common in grocery stores |
| Kilogram | kg | 1000 g | Larger quantities |

**Common Swedish Recipe Patterns:**
- Flour: typically measured in dl (e.g., "6 dl vetemjöl")
- Sugar: typically measured in dl (e.g., "2 dl socker")
- Butter: typically measured in g (e.g., "100 g smör")
- Spices: typically measured in tsk, msk, or krm
- Liquids: typically measured in dl or l

#### 4.3.3 Serving Size Adjustment

**Requirement:** Number of servings should be selectable in all recipes.

**Implementation:**
- **Default servings:** Display recipe's original serving count
- **Serving selector:** Dropdown or +/- buttons to adjust servings
- **Range:** Typically 1-12 servings (configurable per recipe)
- **Automatic scaling:** All ingredient quantities scale proportionally
- **Display:** Show both "Original: 4 servings" and "Adjusted: 6 servings"
- **Rounding:** Intelligent rounding for practical measurements (e.g., "1.33 eggs" → "1-2 eggs")

**Applies to:**
- Ninja combi recipe builder recipes
- Ninja combi built-in recipes
- AI recipe builder recipes
- Previous cooks when restarted (can adjust before starting)

**Location in UI:**
- Recipe detail view (before clicking "Start Cooking")
- Recipe cook flow (adjustable during active cook if needed)
- Previous cooks detail view (when restarting)

---

## 5. User Interface Specification

### 5.1 Welcome Screen

**Purpose:** Central hub for all cooking activities

**Layout Requirements:**
- Clean, modern design with appliance-focused UI
- Display all configured appliances as clickable cards/buttons
- Each appliance card shows:
  - Appliance name
  - Appliance type/icon
  - Status indicator (if applicable)
- "Previous Cooks" button prominently displayed
- Responsive design supporting mobile and desktop

**Visual Hierarchy:**
```
┌────────────────────────────────────────────┐
│   Kitchen Cooking Engine                   │
├────────────────────────────────────────────┤
│                                            │
│   Select Your Appliance                    │
│                                            │
│   ┌─────────┐  ┌─────────┐  ┌─────────┐  │
│   │ [ICON]  │  │ [ICON]  │  │ [ICON]  │  │
│   │ MEATER+ │  │  Ninja  │  │ DeLonghi│  │
│   │         │  │  Combi  │  │MultiFry │  │
│   └─────────┘  └─────────┘  └─────────┘  │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │     📋 Previous Cooks            │   │
│   └──────────────────────────────────┘   │
└────────────────────────────────────────────┘
```

### 5.2 MEATER Probe Path

**Purpose:** Temperature-based cooking with MEATER probe

**Components:**
1. **Main Cooking Mode** (Button 1)
   - Access to existing MEATER cooking interface
   - Select temperature source
   - Choose protein/cut
   - Set target temperature/doneness
   - Start temperature monitoring

2. **Recent MEATER Cooks** (Button 2)
   - Filtered list showing only MEATER probe cooks
   - Reuses Previous Cooks Path component
   - Filter: `appliance_type == "meater_probe"`

**Layout:**
```
┌────────────────────────────────────────────┐
│   MEATER Probe Cooking                     │
├────────────────────────────────────────────┤
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  🌡️  Start MEATER Cooking       │   │
│   │                                  │   │
│   │  Select protein, set target,     │   │
│   │  monitor temperature             │   │
│   └──────────────────────────────────┘   │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  📋  Recent MEATER Cooks         │   │
│   │                                  │   │
│   │  View and restart previous       │   │
│   │  temperature-based cooks         │   │
│   └──────────────────────────────────┘   │
└────────────────────────────────────────────┘
```

### 5.3 Ninja Combi Path

**Purpose:** Multi-function oven cooking with Ninja Combi

**Components:**
1. **Ninja Combi Recipe Builder** (Button 1)
   - Access existing recipe builder
   - Create custom recipes with Ninja combi modes

2. **Ninja Combi Recipe Selector** (Button 2)
   - Browse built-in Ninja combi recipes
   - Access existing recipe database

3. **AI Recipe Builder with Ninja combi** (Button 3)
   - Launch AI Recipe Builder
   - Pre-select Ninja combi as main appliance

4. **Recent Ninja combi Cooks** (Button 4)
   - Filtered list showing only Ninja combi recipes
   - Reuses Previous Cooks Path component
   - Filter: `main_appliance == "ninja_combi"`

**Layout:**
```
┌────────────────────────────────────────────┐
│   Ninja Combi Cooking                      │
├────────────────────────────────────────────┤
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  🎨  Recipe Builder              │   │
│   └──────────────────────────────────┘   │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  📖  Built-in Recipes            │   │
│   └──────────────────────────────────┘   │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  🤖  AI Recipe with Ninja combi  │   │
│   └──────────────────────────────────┘   │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  📋  Recent Ninja combi Cooks    │   │
│   └──────────────────────────────────┘   │
└────────────────────────────────────────────┘
```

### 5.4 AI Recipe Builder Path

**Purpose:** AI-generated recipes for any appliance

**Components:**
1. **Appliance Information Display**
   - Show selected main appliance name with 📝 button to toggle inline feature notes editor
   - Display main appliance features (collapsed: comma list; expanded: grouped by Standard/Modified/Special with editable notes)
   - List all available secondary appliances (names only, no features)
   - **Secondary appliances are deselectable** (checkboxes to include/exclude) — *Deferred to Phase 8*

2. **Start AI Recipe Builder** (Button 1)
   - Launch AI Recipe Builder
   - Pre-select current appliance as main appliance
   - Access to ingredient selection
   - Cooking style selection
   - Recipe generation

3. **Recent Recipes for This Appliance** (Button 2)
   - Filtered list showing recipes for selected appliance
   - Reuses Previous Cooks Path component
   - Filter: `main_appliance == selected_appliance`

**Layout:**
```
┌────────────────────────────────────────────┐
│   🤖 AI Recipe Builder                     │
├────────────────────────────────────────────┤
│                                            │
│   Main Appliance: DeLonghi MultiFry    📝 │
│   Features: Air Fry, Grill, Bake, Roast   │
│                                            │
│   (When 📝 toggled, shows expandable       │
│   feature notes editor with Standard/      │
│   Modified/Special grouping and Save       │
│   Notes button)                            │
│                                            │
│   Secondary Appliances Available:          │
│   • Stovetop                               │
│   • Microwave                              │
│   • MEATER+ Probe                          │
│   (Deselectable checkboxes: Phase 8)       │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  🤖  Create AI Recipe            │   │
│   │                                  │   │
│   │  Generate custom recipes using   │   │
│   │  your appliances and ingredients │   │
│   └──────────────────────────────────┘   │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  📋  Recent MultiFry Recipes     │   │
│   │                                  │   │
│   │  View and restart previous AI    │   │
│   │  recipes for this appliance      │   │
│   └──────────────────────────────────┘   │
└────────────────────────────────────────────┘
```

### 5.5 Previous Cooks Path

**Purpose:** Browse, review, and restart past cooking sessions

**Features:**
- Display all completed cooks in reverse chronological order (latest first)
- Each cook entry shows:
  - Cook name/recipe title
  - Main appliance used
  - Date/time
  - Duration
  - User star rating (if available)
- Click on a cook to view full details:
  - Complete timeline
  - Ingredients used
  - Temperature data (if applicable)
  - User notes
  - Star ratings (ease and result quality)
- "Restart Cook" button to replay any previous session

**List View:**
```
┌────────────────────────────────────────────┐
│   Previous Cooks                           │
├────────────────────────────────────────────┤
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  Combi-Crisp Chicken Thighs      │   │
│   │  Ninja Combi • 45 min            │   │
│   │  Jan 15, 2026 • ⭐⭐⭐⭐⭐       │   │
│   └──────────────────────────────────┘   │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  Ribeye Steak Medium-Rare        │   │
│   │  MEATER+ • 32 min                │   │
│   │  Jan 14, 2026 • ⭐⭐⭐⭐          │   │
│   └──────────────────────────────────┘   │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  AI Italian Pasta                │   │
│   │  Stovetop • 28 min               │   │
│   │  Jan 13, 2026 • ⭐⭐⭐⭐⭐       │   │
│   └──────────────────────────────────┘   │
└────────────────────────────────────────────┘
```

**Detail View:**
```
┌────────────────────────────────────────────┐
│   ← Back to List                           │
├────────────────────────────────────────────┤
│   Combi-Crisp Chicken Thighs               │
│   Ninja Combi • Jan 15, 2026               │
│                                            │
│   Duration: 45 minutes                     │
│   Temperature: 75°C reached                │
│                                            │
│   Ingredients:                             │
│   • 6 chicken thighs                       │
│   • 2 tbsp olive oil                       │
│   • 1 tsp paprika                          │
│   • Salt & pepper                          │
│                                            │
│   Ratings:                                 │
│   Ease: ⭐⭐⭐⭐⭐                        │
│   Result: ⭐⭐⭐⭐⭐                       │
│                                            │
│   Notes: "Crispy skin was perfect!"       │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │        🔄 Restart This Cook      │   │
│   └──────────────────────────────────┘   │
└────────────────────────────────────────────┘
```

---

## 6. Cook Types

The system supports three distinct cook types as defined in the source specification:

### 6.1 Meater probe cook
- Temperature-based cooking with MEATER probe
- Protein/cut selection with target temperature
- Real-time temperature monitoring
- ETA calculation
- Notifications at key milestones
- **This is standalone MEATER monitoring**, not part of a recipe

### 6.2 Recipe cook
This is a **unified cook type** that encompasses:
- **Ninja combi recipe builder recipes** - Custom recipes created with Ninja combi builder
- **Ninja combi recipe** - Pre-defined built-in Ninja combi recipes
- **AI recipe builder recipes** - AI-generated custom recipes for any appliance

**All recipe cook share the same flow:**
- Started by clicking "Start Cooking" button in recipe detail view
- Full recipe with ingredients list and step-by-step instructions
- Recipe title on top with elapsed timer
- Step-by-step guide with overview page + detail pages
- Ingredients that are used in current guide step are **bolded**
- Optional MEATER probe integration as subprocess within the recipe
- Final rating page with two 1-5 star selectors (ease and result)
- Navigation: Back button (left), MEATER info (center if active), Next/Finish button (right)

**Important distinction:** When MEATER probe is used within a recipe cook, **it is a subprocess of the recipe cook**, not a standalone "meater probe cook".

### 6.3 Can Also Use a Meater
- Recipe cook (type 6.2) can optionally integrate MEATER probe monitoring
- This is activated via "Start MEATER probe" button in relevant recipe steps
- The probe monitors temperature during the recipe
- This is **not** a separate cook type, but a feature within recipe cook
- MEATER data is saved as part of the recipe cook history

---

## 7. Recipe Cook Flow (Detailed Specification)

### 7.1 Starting a Recipe Cook

**Source from specification:** "Recipe cooks - These are started from a new button in added in Ninja combi recipes and ai recipe builder recipes called 'Start cooking'."

**Pre-Start Configuration:**

Before clicking "Start Cooking", user can configure:

**Serving Size Selector:**
```
┌────────────────────────────────────────────┐
│   Servings:  [−]  4  [+]                   │
│   Original recipe: 4 servings              │
└────────────────────────────────────────────┘
```
- Adjust number of servings (1-12 typical range)
- Ingredient quantities automatically scale
- Shows original serving count for reference

**Measurement System:**
- Applied from user's system-wide preference
- All quantities shown in selected measurement system (Swedish, UK, US, or Pure Metric)

**Language:**
- Applied from user's language preference (Swedish or English)
- All text, labels, and instructions in selected language

**Trigger:** User clicks "Start Cooking" button in:
- Ninja combi recipe detail view (built-in recipes)
- Ninja combi recipe builder created recipe
- AI Recipe Builder generated recipe
- Previous cooks detail view (restart any recipe cook)

### 7.2 Recipe Cook Screen Components

**Source from specification:** "It has: A recipe title on top with a timer with the time passed since pressing Start cooking in the top right corner."

#### Header Section
```
┌────────────────────────────────────────────┐
│   Combi-Crisp Chicken Thighs         45:32 │
│   6 servings                     (timer)   │
└────────────────────────────────────────────┘
```
- Recipe title (top left)
- Number of servings (below title)
- Timer showing elapsed time since "Start Cooking" pressed (top right)
- Format: MM:SS or HH:MM:SS for long cooks

#### Ingredients List
```
┌────────────────────────────────────────────┐
│   Ingredients: (6 servings)                │
│                                            │
│   • 9 chicken thighs                       │
│   • 3 tbsp olive oil                       │
│   • **1½ tsp paprika**                     │
│   • **Salt & pepper**                      │
│   • 1-2 lemons, quartered                  │
└────────────────────────────────────────────┘
```
- **Source from specification:** "Below the title close to the top, a list of ingreadents with amounts. Ingredients that are used in the current guilde step are bold."
- List all ingredients with quantities (scaled to selected servings)
- Quantities shown in user's selected measurement system
- **Bold** ingredients currently used in active guide step
- Position: Below title, near top of screen

#### Step-by-Step Guide (Middle Section)

**Source from specification:** "A step by step guide guilde in the middle. First guide page is a step overview with expected time of each step. The other guilde pages are detailed guide for each step."

**First Page: Overview**
```
┌────────────────────────────────────────────┐
│   Cook Overview                            │
│                                            │
│   1. Prep ingredients           5 min      │
│   2. Season chicken            2 min       │
│   3. Steam phase              15 min       │
│   4. Crisp phase              20 min       │
│   5. Rest                      5 min       │
│                                            │
│   Total estimated time: 47 minutes         │
└────────────────────────────────────────────┘
```
- Shows all steps with expected duration
- Provides complete timeline overview
- User can see full cook plan before starting

**Subsequent Pages: Step Details**
```
┌────────────────────────────────────────────┐
│   Step 2 of 5: Season Chicken              │
│                                            │
│   1. Pat chicken thighs dry with paper     │
│      towels                                │
│                                            │
│   2. In a small bowl, mix paprika, salt,   │
│      and pepper                            │
│                                            │
│   3. Rub seasoning mixture all over        │
│      chicken thighs, including under skin  │
│                                            │
│   4. Drizzle with olive oil                │
│                                            │
│   ⏱️  Estimated time: 2 minutes            │
│                                            │
│   💡 Tip: Lifting the skin and seasoning   │
│   underneath creates more flavor!          │
└────────────────────────────────────────────┘
```
- One step per page
- Detailed instructions with substeps
- Time estimate per step
- Optional tips/notes
- Clear indication of current step (X of Y)

**Optional: MEATER Probe Integration**

**Source from specification:** "They can also have a start meater probe button that starts a the use of a probe with the info used at the button. This is not a meater probe cook, just a sub process of the recipe cook"

```
┌────────────────────────────────────────────┐
│   Step 3 of 5: Steam Phase                 │
│                                            │
│   1. Place chicken thighs on tray in       │
│      position 2                            │
│                                            │
│   2. Add 500ml water to reservoir          │
│                                            │
│   ┌──────────────────────────────────┐   │
│   │  🌡️  Start MEATER Probe          │   │
│   │                                  │   │
│   │  Target: 75°C                     │   │
│   │  Doneness: Well-Done              │   │
│   └──────────────────────────────────┘   │
│                                            │
│   3. Select Combi-Steam mode, 100°C       │
│                                            │
│   4. Set timer for 15 minutes              │
└────────────────────────────────────────────┘
```
- Button to start MEATER probe monitoring
- Pre-populated with recipe target temp and info
- **This is not a meater probe cook, just a sub process of the recipe cook**
- Temperature progress shown in footer

**Final Page: Rating**

**Source from specification:** "Last guide page has two 1-5 star selectors, one for how easy it was and one for how good the result was."
```
┌────────────────────────────────────────────┐
│   Cook Complete! 🎉                        │
│                                            │
│   How easy was this recipe?                │
│   ⭐ ⭐ ⭐ ⭐ ⭐  (1-5 stars)            │
│                                            │
│   How was the result?                      │
│   ⭐ ⭐ ⭐ ⭐ ⭐  (1-5 stars)            │
│                                            │
│   Optional Notes:                          │
│   ┌──────────────────────────────────┐   │
│   │                                  │   │
│   │                                  │   │
│   └──────────────────────────────────┘   │
└────────────────────────────────────────────┘
```
- Two separate 1-5 star selectors
- Ease rating: How simple was the recipe?
- Result rating: How good was the final dish?
- Optional text field for notes

#### Footer Controls

**Source from specification:** "At the button there is a: Back button to the left, Meater probe info with progress, target and stop probe button in the middle, A next/finish button to the right."

```
┌────────────────────────────────────────────┐
│                                            │
│   [← Back]    🌡️ 68°C / 75°C [Stop]   [Next →]  │
│                     Progress: 91%          │
└────────────────────────────────────────────┘
```

**Left: Back button**
- Navigate to previous guide step
- Disabled on first page (overview)

**Center: Meater probe info** (if probe active)
- Current temperature / Target temperature
- Progress percentage
- "Stop probe" button to end probe monitoring
- Hidden if probe not in use

**Right: Next/Finish button**
- "Next" on all pages except last
- "Finish" on final (rating) page
- Advances to next guide step

### 7.3 Cook Completion and Saving

**Source from specification:** "One a Recipe cook is finished by pressing the finish button it is saved and can be revied or restarted from previous recipes."

When user presses "Finish" on final page:

1. **Capture Data:**
   - Recipe name and full details
   - Actual cook duration (from timer)
   - Star ratings (ease and result)
   - Optional user notes
   - Temperature data (if MEATER was used)
   - Timestamp

2. **Save to History:**
   - Store as completed cook
   - Make available in Previous Cooks
   - Enable restart functionality

3. **Return to Welcome:**
   - Navigate back to welcome screen
   - Reset all session state
   - Ready for next cook

### 7.4 MEATER Probe as Subprocess

**Source from specification:** "They can also have a start meater probe button that starts a the use of a probe with the info used at the button. This is not a meater probe cook, just a sub process of the recipe cook"

**Important Distinction:**
- Recipe cook (type 6.2) is the parent process
- MEATER monitoring is a subprocess
- **This is not a meater probe cook, just a sub process of the recipe cook**
- Probe data enhances recipe, doesn't define it

**Integration Points:**
- "Start MEATER Probe" button appears in relevant guide steps
- Pre-configured with recipe-specific targets and info
- Temperature displayed in footer during active monitoring
- Can be stopped independently without ending recipe cook
- Temperature data saved with recipe cook history

---

## 8. Technical Requirements

### 8.1 Data Model

#### Appliance Object
```typescript
interface Appliance {
  id: string;
  name: string;
  type: 'meater_probe' | 'ninja_combi' | 'other';
  features: string[];
  status?: 'available' | 'in_use' | 'offline';
}
```

#### Cook History Object
```typescript
interface CookHistory {
  id: string;
  recipe_name: string;
  cook_type: 'meater_probe_cook' | 'recipe_cook';
  // recipe_cook encompasses:
  //  - ninja combi recipe builder recipes
  //  - ninja combi recipe (built-in)
  //  - ai recipe builder recipes
  main_appliance: string;
  start_time: Date;
  end_time: Date;
  duration_minutes: number;
  ingredients?: Ingredient[];
  steps?: RecipeStep[];
  temperature_data?: TemperatureLog[];
  rating_ease?: number;  // 1-5 stars
  rating_result?: number;  // 1-5 stars
  notes?: string;
  peak_temp_c?: number;
  final_temp_c?: number;
  servings?: number;  // Number of servings for this cook
  measurement_system?: 'swedish' | 'uk' | 'us' | 'metric';  // Measurement system used
  language?: string;  // Language used (e.g., 'sv', 'en')
}
```

#### Recipe Object
```typescript
interface Recipe {
  id: string;
  title: string;
  title_translations?: Record<string, string>;  // Multilingual titles
  source: 'ninja_combi_recipe_builder' | 'ninja_builtin' | 'ai_recipe_builder';
  main_appliance: string;
  secondary_appliances?: string[];  // Deselectable list
  ingredients: Ingredient[];
  steps: RecipeStep[];  // Guide steps
  total_time_minutes: number;
  meater_integration?: boolean;  // Can use meater as subprocess
  default_servings: number;  // Original serving count
  servings_range?: [number, number];  // Min and max servings (e.g., [1, 12])
}
```

#### Ingredient Object
```typescript
interface Ingredient {
  id: string;
  name: string;
  name_translations?: Record<string, string>;  // Multilingual names
  quantity: number;  // Base quantity for default servings
  unit: string;  // Unit in base system
  unit_translations?: Record<string, string>;  // Translated units if needed
  scaling_behavior?: 'linear' | 'stepped' | 'fixed';  // How it scales with servings
}
```

#### User Preferences Object
```typescript
interface UserPreferences {
  language: string;  // 'sv' (Swedish) or 'en' (English), extensible
  measurement_system: 'swedish' | 'uk' | 'us' | 'metric';
  temperature_unit: 'celsius' | 'fahrenheit';
}
```
```

#### Recipe Step Object (Guide Step)
```typescript
interface RecipeStep {
  step_number: number;
  title: string;
  instructions: string[];
  estimated_time_minutes: number;
  ingredients_used?: string[];  // Refs to ingredient IDs (will be bolded)
  meater_config?: {
    target_temp_c: number;
    doneness: string;
    cut_id?: number;
  };
  tips?: string;
}
```

### 8.2 Navigation State Management

The system must maintain:
- Current navigation path (meater path, ninja combi path, ai recipe builder path, previous cook path)
- Active appliance selection
- Recipe cook session state
- MEATER subprocess state (if active within recipe cook)
- Guide step navigation history

### 8.3 Component Reusability

**Shared Components:**
- Previous Cooks List (used in multiple paths with different filters)
- Appliance Card
- Recipe Step Display
- Star Rating Widget
- MEATER Status Display
- Navigation Footer

**Path-Specific Components:**
- Welcome Screen Appliance Grid
- MEATER Cooking Interface
- Ninja Combi Mode Selector
- AI Recipe Builder Form
- Recipe Cook Guide

### 8.4 Backend Services Required

```yaml
# New services needed
kitchen_cooking_engine.start_recipe_cook:
  description: Start a recipe cook session (includes ninja combi/ai recipes)
  fields:
    recipe_id: string
    appliance_id: string

kitchen_cooking_engine.advance_guide_step:
  description: Move to next guide step in recipe cook
  fields:
    session_id: string
    direction: 'next' | 'previous'

kitchen_cooking_engine.start_meater_subprocess:
  description: Start MEATER probe as subprocess in recipe cook (not a meater probe cook)
  fields:
    session_id: string
    target_temp_c: number
    cut_id: number
    doneness: string

kitchen_cooking_engine.complete_recipe_cook:
  description: Finish recipe cook by pressing finish button and save to history
  fields:
    session_id: string
    rating_ease: number
    rating_result: number
    notes: string

kitchen_cooking_engine.restart_cook:
  description: Restart a previous cook from previous cooks path
  fields:
    history_id: string
```

### 8.5 Persistence Requirements

**Local Storage:**
- Appliance configurations
- Recipe database
- Cook history
- User ratings and notes

**Session Storage:**
- Active recipe cook state
- Current guide step index
- Timer start time
- MEATER subprocess state

---

## 9. Design Principles

### 9.1 Progressive Disclosure
- Show only relevant options at each navigation level
- Avoid overwhelming users with all features at once
- Deepen information as user progresses through flow

### 9.2 Clear Navigation Hierarchy
- Welcome → Path → Action is always clear
- Back button behavior is predictable
- User always knows where they are in the flow

### 9.3 Appliance-Centric Design
- Appliances are first-class navigation elements
- Each appliance type has distinct but consistent workflow
- Appliance features drive available options

### 9.4 Recipe Flexibility
- Recipes work with or without MEATER probe
- User controls probe activation during cook
- Probe is enhancement, not requirement

### 9.5 History as Learning Tool
- All cooks saved for future reference
- Ratings help users remember what worked
- Easy restart encourages recipe reuse

---

## 10. User Flows

### 10.1 Temperature Cooking with MEATER (Meater probe cook)
```
Welcome Screen
  → Click MEATER appliance
  → Meater Path
  → Click "Start MEATER Cooking"
  → Select protein/cut
  → Set target/doneness
  → Monitor temperature
  → Complete cook
  → Save to history (as meater_probe_cook)
```

### 10.2 Ninja combi Built-in Recipe (Recipe cook)
```
Welcome Screen
  → Click Ninja combi appliance
  → Ninja combi Path
  → Click "Built-in Recipes" (ninja combi recipe selector)
  → Browse/select recipe
  → Click "Start Cooking"
  → Recipe Cook Flow
    → View overview (first guide page)
    → Follow guide steps
    → (Optional) Start MEATER probe as subprocess
    → Rate cook (ease and result)
  → Press finish button
  → Complete and save to previous cooks
```

### 10.3 AI-Generated Recipe for Any Appliance (Recipe cook)
```
Welcome Screen
  → Click any appliance (e.g., MultiFry)
  → AI Recipe Builder Path
    → See appliance features
    → See secondary appliances (deselectable checkboxes)
  → Click "Create AI Recipe"
  → Select ingredients
  → Choose cooking style
  → Generate recipes
  → Pick recipe
  → Click "Start Cooking"
  → Recipe Cook Flow
    → Follow generated guide steps
    → Rate cook
  → Press finish button
  → Complete and save to previous cooks
```

### 10.4 Restart Previous Cook
```
Welcome Screen
  → Click "Previous Cooks"
  → Previous Cook Path
  → Browse history list (sorted by latest first)
  → Click specific cook
  → View full details (ingredients, ratings, notes)
  → Click "Restart This Cook"
  → System determines cook type and launches appropriate flow
    → meater_probe_cook: Go to MEATER interface with saved settings
    → recipe_cook: Go to Recipe Cook Flow with saved recipe
```

---

## 11. Success Criteria

The GUI redesign is considered successful when:

### 11.1 User Can Navigate Intuitively
- [x] From welcome screen, user can identify all available cooking options
- [x] User understands which appliance to select for desired cooking mode
- [x] Navigation path is clear and predictable

### 11.2 All Cook Types Are Accessible
- [x] Meater probe cook can be started (type 6.1)
- [x] Recipe cook can be started (type 6.2 - includes Ninja combi and AI recipes)
- [x] Ninja combi recipes (built-in and builder) can be accessed and cooked
- [x] AI recipe generation works for all appliances
- [x] Previous cooks can be browsed and restarted

### 11.3 Recipe Cook Flow Functions Completely
- [x] Recipe overview displays correctly (first guide page)
- [x] Guide step navigation works (next/back buttons)
- [ ] Ingredients bold correctly based on current guide step — **Deferred to Phase 8**
- [x] Timer displays elapsed time accurately since pressing Start Cooking
- [ ] MEATER probe can be started as subprocess (not a meater probe cook) — **Deferred to Phase 8**
- [x] Star ratings can be entered (ease and result, 1-5 stars)
- [x] Pressing finish button saves cook to previous cooks with all data

### 11.4 Previous Cooks System Works
- [x] All completed cooks appear in previous cook path
- [x] Cooks display with correct metadata (sorted by latest first)
- [x] Detail view shows full cook information (ingredients, ratings, notes, servings used)
- [x] Restart functionality works for all cook types
- [x] Filtered views work in path-specific recent lists (recent recipes)

### 11.5 Visual Design Is Cohesive
- [x] Welcome screen is attractive and clear
- [x] Path screens follow consistent design language (meater path, ninja combi path, ai recipe builder path, previous cook path)
- [x] Recipe cook interface is clean and readable
- [ ] Mobile responsive design works on small screens — **Phase 8 polish**
- [x] Icons and visual elements are intuitive

### 11.6 Multilingual Support Works — ⬜ Phase 7
- [ ] Language selector in system settings
- [ ] Swedish language fully implemented
- [ ] English language fully implemented
- [ ] All UI text translates correctly
- [ ] Language preference persists across sessions
- [ ] System defaults to Home Assistant's configured language

### 11.7 Measurement Systems Work — ⬜ Phase 7
- [ ] Measurement system selector in system settings
- [ ] Swedish measurements (default) work correctly
- [ ] UK measurements work correctly (if different from Swedish)
- [ ] US measurements work correctly
- [ ] Pure metric measurements work correctly
- [ ] Ingredient quantities convert accurately
- [ ] Temperature values convert between °C and °F
- [ ] Measurement preference persists across sessions

### 11.8 Serving Size Adjustment Works — ⬜ Phase 7
- [ ] Serving size selector appears in all recipes
- [ ] +/- buttons or dropdown adjust servings (1-12 range)
- [ ] All ingredient quantities scale proportionally
- [ ] Intelligent rounding for practical measurements
- [ ] Original serving count shown for reference
- [ ] Adjusted serving count displayed in recipe cook flow
- [ ] Serving size can be adjusted before starting cook
- [x] Serving size saved in cook history

---

## 12. Implementation Phases

### Phase 1: Foundation (Weeks 1-2) — ✅ COMPLETE (v0.5.0.58)
- [x] Implement welcome screen with appliance selector
- [x] Build path routing logic
- [x] Create basic path screens (skeleton views)
- [x] Set up navigation state management

### Phase 2: Meater Path (Week 3) — ✅ COMPLETE (v0.5.0.67)
- [x] Integrate existing MEATER cooking interface
- [x] Implement filtered recent recipes for MEATER
- [x] Test meater only cook flow end-to-end
- [x] **Added (not in original ToR):** Custom temperature cook (30–100°C) without protein selection (v0.5.1.4)

### Phase 3: Previous Cook Path (Week 4) — ✅ COMPLETE (v0.5.0.64)
- [x] Build cook history data model
- [x] Create previous cooks list component
- [x] Implement cook detail view
- [x] Add restart functionality
- [x] Build filtering system for path-specific views (recent recipes)

### Phase 4: Recipe Cook Flow (Weeks 5-6) — ✅ PARTIALLY COMPLETE (v0.5.0.65)
- [x] Build recipe cook screen layout
- [ ] Implement serving size selector with scaling — **Deferred to Phase 7**
- [x] Implement guide step navigation
- [x] Add timer functionality (time since pressing Start Cooking)
- [x] Build ingredient list (without guide step highlighting — **deferred to Phase 8**)
- [ ] Apply measurement system conversion to ingredients — **Deferred to Phase 7**
- [x] Create overview and detail guide pages
- [ ] Implement MEATER probe subprocess integration — **Deferred to Phase 8**
- [x] Build star rating interface (ease and result)
- [x] Wire up finish button to save to previous cooks

### Phase 5: Ninja combi Path (Week 7) — ✅ COMPLETE (v0.5.0.69)
- [x] Integrate existing Ninja combi recipe builder
- [x] Connect ninja combi recipe selector (built-in recipes)
- [x] Link to AI Recipe Builder path with Ninja combi preselected
- [x] Implement filtered recent recipes for Ninja combi
- [x] Test full Ninja combi recipe cook flow
- [x] **Added (not in original ToR):** Inline metric conversions for all Ninja recipes (cups→dl, oz→g, lb→kg, °F→°C)

### Phase 6: AI Recipe Builder Path (Week 8) — ✅ COMPLETE (v0.5.1.7)
- [x] Build AI Recipe Builder path screen
- [x] Display appliance features
- [ ] Add deselectable secondary appliances (checkboxes) — **Deferred to Phase 8**
- [x] Integrate existing AI recipe generation
- [x] Connect to recipe cook flow
- [x] Implement filtered recent recipes for selected appliance
- [x] Test full AI recipe cook workflow
- [x] **Added (not in original ToR):** Complexity slider (1–5) with style-dependent defaults
- [x] **Added (not in original ToR):** Portions slider (1–8 servings)
- [x] **Added (not in original ToR):** 70+ world cuisines in 11 collapsible regions with multi-select for fusion
- [x] **Added (not in original ToR):** Cancelable loading dialog with time estimate
- [x] **Added (not in original ToR):** Full recipe data saved in cook history for restart

### Phase 7: Multilingual & Measurement Systems (Week 9) — ⬜ NOT STARTED
- [ ] Implement translation infrastructure (i18n)
- [ ] Create Swedish translation files
- [ ] Create English translation files
- [ ] Build language selector in settings
- [ ] Implement measurement system conversion engine
- [ ] Build measurement system selector in settings
- [ ] Test Swedish measurement system (default)
- [ ] Test UK measurement system
- [ ] Test US measurement system
- [ ] Test pure metric system
- [ ] Test language switching across all screens
- [ ] Validate ingredient scaling with all measurement systems

### Phase 8: Polish & Testing (Week 10) — ⬜ NOT STARTED
- [ ] Visual design refinement
- [ ] Mobile responsive testing
- [ ] Edge case handling
- [ ] Performance optimization
- [ ] User acceptance testing in both languages
- [ ] Test all measurement system conversions
- [ ] Test serving size scaling edge cases
- [ ] Documentation updates
- [ ] **Remaining from Phase 4:** MEATER probe subprocess integration
- [ ] **Remaining from Phase 4:** Ingredient bolding based on current guide step
- [ ] **Remaining from Phase 6:** Deselectable secondary appliances

---

## 13. Open Questions

1. **Cook Type Detection:** How does the system determine which type of flow to use when restarting a cook from history?
   - Answer: Use `cook_type` field in history object

2. **MEATER Subprocess Data:** Should MEATER temperature data be saved separately or as part of recipe cook data?
   - Answer: Store within recipe cook history object

3. **Appliance Status:** Should welcome screen show real-time appliance status (e.g., "MEATER probe battery low")?
   - Answer: Nice-to-have for Phase 2+

4. **Step Timing:** Should recipe cook enforce step timing or just provide estimates?
   - Answer: Estimates only, user controls pace

5. **Rating Requirement:** Are star ratings required or optional?
   - Answer: Optional but encouraged

---

## 14. Future Enhancements (Post-Implementation)

### Multi-Cook Coordination
- Start multiple cooks simultaneously
- Coordinate timing across dishes
- Unified timeline view

### Recipe Editing
- Edit AI-generated recipes before cooking
- Save modified versions
- Share recipes with other users

### Voice Integration
- Voice commands to advance steps
- Hands-free timer control
- Voice-activated MEATER start

### Photos
- Add photos at each recipe step
- Photo gallery in cook history
- Before/after comparisons

### Advanced Analytics
- Cook success rate by recipe
- Average cook times vs. estimates
- Temperature curve analysis
- Personalized recommendations

---

## 15. Implementation Deviations

This section documents deviations from the original ToR specification as of v0.5.2.8 (Phase 6 complete + v0.5.2.x features).

### 15.1 Features Added Beyond ToR

| Feature | Version | Description |
|---------|---------|-------------|
| Custom Temperature Cook | v0.5.1.4 | MEATER path allows setting any target temp (30–100°C) without protein/cut/doneness selection. Uses `start_simple_probe_cook` service. |
| Complexity Slider | v0.5.1.5 | AI Recipe Builder has 1–5 complexity slider with style-dependent defaults. Included in AI prompt. |
| Portions Slider | v0.5.1.5 | AI Recipe Builder has 1–8 portions slider. Sent to AI as `servings` parameter. |
| 70+ World Cuisines | v0.5.1.6 | 11 collapsible cuisine regions with multi-select for fusion. Not in original ToR. |
| Cancelable Generation | v0.5.1.5 | AI generation dialog has Cancel button instead of OK, with time estimate. |
| AI Recipe Save/Restart | v0.5.1.7 | Full `recipe_data` saved in cook_history.json via REST API. Restartable from Previous Cooks. |
| Inline Metric Conversions | v0.5.0.69–70 | All Ninja Combi recipes include metric equivalents (cups→dl, oz→g, lb→kg, °F→°C). This is a stop-gap until Phase 7's dynamic conversion engine. |
| Multi-Appliance Management | v0.5.2.1+ | Configure multiple kitchen appliances simultaneously. Central ApplianceManager service. |
| Feature Type Classification | v0.5.2.1+ | 3-tier feature classification (Standard/Modified/Special) per feature per appliance. 30+ features in centralized catalog. |
| Feature Modification Notes | v0.5.2.3+ | Editable notes for modified/special features, stored per-appliance. AI builder injects notes into recipe prompts. |
| Feature Notes in Appliance Path | v0.5.2.8 | 📝 button in AI Recipe Builder appliance path header toggles inline feature notes editor (issue #61). |
| Categorized AI Ingredients | v0.5.2.1+ | 300+ ingredients organized by category (proteins, produce, grains, dairy, spices) with cuisine-specific lists. |
| Cuisine-Specific Ingredients | v0.5.2.1+ | Authentic ingredient lists per cuisine/region. Enforces pre-Columbian accuracy (e.g., no tomatoes in Indian/Middle Eastern). |
| Recipe Origin Badges | v0.5.2.1+ | AI suggestions labeled 📖 Classic (known/googleable) or 🤖 Original (AI-created). |
| Ongoing Cooks Badge | v0.5.4.1 | Welcome screen shows count and status of all active MEATER + recipe cooks. Clicking navigates to the cook. |
| MEATER Cook Rating Screen | v0.5.4.0 | After MEATER cook completion, users rate ease & result (1–5 stars). Ratings saved to cook history via PATCH API. |
| Blank Tab Fix | v0.5.4.2 | Detects WebSocket reconnect + forces Shadow DOM repaint on return. Prevents blank panel after navigating away. |
| Recipe Cook Persistence | v0.5.4.3 | Recipe cook state persisted to sessionStorage, survives HA sidebar navigation. Restored on panel re-creation. |
| Parallel Recipe Cooks | v0.5.4.4 | Multiple recipe cooks can run simultaneously (one per appliance). Array-based state management with unique IDs. |
| Cross-Device Cook Visibility | v0.5.4.4 | Active recipe cooks synced to server, visible on all devices. Adopts remote cooks on click. |
| 🏠 Home Button | v0.5.4.4 | Navigate back to welcome from any active cook view (MEATER or recipe). |
| AI Ingredient Ceilings | v0.5.4.0 | Style-dependent ingredient limits (50%–200% extra) scaled by complexity (±20% per step from baseline 3). |
| Honest Cooking Time | v0.5.4.0 | AI includes all prep time (soaking, brining, marinating) in estimates. Critical rule in both suggestion and detail prompts. |
| MEATER Restart Improvements | v0.5.4.5 | Session dropdown on waiting screen, handles unknown entity gracefully, timeout protection. |
| Welcome Screen Auto-Refresh | v0.5.4.6 | Exited cooks disappear immediately; `_navigateToWelcome()` refreshes server data on every navigation. |

### 15.2 Features Deferred from Original Phase

| ToR Feature | Original Phase | Deferred To | Reason |
|-------------|---------------|-------------|--------|
| Serving size selector with scaling | Phase 4 | Phase 7 | Requires measurement conversion engine first |
| Measurement system conversion | Phase 4 | Phase 7 | Dedicated phase for this complex feature |
| Ingredient bolding by step | Phase 4 | Phase 8 | Polish item, not blocking core flow |
| MEATER probe as recipe subprocess | Phase 4 | Phase 8 | Complex integration, not blocking core recipe flow |
| Deselectable secondary appliances | Phase 6 | Phase 8 | UI enhancement, AI works without it |

### 15.3 Features Attempted and Removed

| Feature | Versions | Outcome |
|---------|----------|---------|
| View Assist Dashboard | v0.5.0.71–73 | Created broken HA sidebar panels instead of proper View Assist views. Removed entirely. Blueprint kept. Do NOT re-add without understanding View Assist's view system (they are not regular HA dashboards). |

### 15.4 API Deviations

| ToR Specification | Actual Implementation |
|-------------------|----------------------|
| `kitchen_cooking_engine.save_recipe_cook` service | REST API: `POST /api/kitchen_cooking_engine/ai_recipes/save_cook` — implemented as API endpoint instead of HA service because recipe cook saving is a panel-only action |
| `kitchen_cooking_engine.start_recipe_cook` service | Not implemented — recipe cook is entirely frontend-driven (state machine in panel JS) |
| `kitchen_cooking_engine.advance_guide_step` service | Not implemented — step navigation is frontend-only |
| `kitchen_cooking_engine.complete_recipe_cook` service | Not implemented — completion handled by frontend `_saveRecipeCook()` calling REST API |
| `kitchen_cooking_engine.restart_cook` service | Not implemented — restart handled by frontend `_restartCook()` which re-enters cook flow with saved data |
| Not in ToR: Appliance APIs | Added: `GET /api/kitchen_cooking_engine/appliances` (list with feature types/notes), `POST .../appliances/{entry_id}/feature_notes` (save notes), `GET .../available_features` (aggregated), `GET .../recipes/compatible` (recipe matching) |
| Not in ToR: AI Settings API | Added: `GET/POST /api/kitchen_cooking_engine/ai_settings` — AI agent ID stored in panel preferences, not config flow |
| Not in ToR: Active Recipe Cook API | Added (v0.5.4.4): `GET/POST/DELETE /api/kitchen_cooking_engine/active_recipe_cook` — Cross-device visibility of active recipe cooks. Supports both list (parallel cooks) and dict (legacy single-cook) formats. |
| Not in ToR: Cook History PATCH API | Added (v0.5.4.0): `PATCH /api/kitchen_cooking_engine/cook_history/{cook_id}` — Update individual cook entries (ease_rating, result_rating). Used by MEATER cook rating screen. |

### 15.5 Data Model Deviations

| ToR Specification | Actual Implementation |
|-------------------|----------------------|
| Cook history uses `cook_type: 'meater_probe_cook' \| 'recipe_cook'` | History uses flat dict with optional fields: `recipe_data` (AI recipes), `cut_id`/`doneness` (MEATER cooks), `recipe_name` (Ninja recipes) |
| `Recipe.title_translations` for multilingual | Not implemented — English only until Phase 7 |
| `Ingredient.scaling_behavior` (linear/stepped/fixed) | Not implemented — no ingredient scaling yet |
| `UserPreferences` object (language, measurement) | Not implemented — hardcoded English, no measurement selector |
| Not in ToR: Feature types | Added: `FeatureType` enum (STANDARD/MODIFIED/SPECIAL). Per-appliance feature classification with 30+ features in `FEATURE_CATALOG`. Config flow has per-feature type editing. |
| Not in ToR: Feature notes | Added: `feature_notes` dict per appliance. Editable from panel UI (Appliances tab + AI Recipe Builder path). Injected into AI prompts as modification context. |
| Not in ToR: Ingredient categories | Added: `INGREDIENT_CATEGORIES` mapping 300+ ingredients to categories (p/v/g/d/s). `CUISINE_INGREDIENTS` for cuisine-specific lists. `ASSUMED_STAPLES` excluded from lists. |
| Not in ToR: Active recipe cooks array | Added (v0.5.4.4): `_activeRecipeCooks` array with unique IDs per cook. Persisted to sessionStorage + server. Supports parallel recipe cooks. |
| Not in ToR: MEATER cook rating state | Added (v0.5.4.0): `_meaterCookRatingState` object for post-cook rating flow. `ease_rating`/`result_rating` (1–5) saved to cook history entry. |
| Cook history entry limit removed | v0.5.4.4: `MAX_HISTORY_ENTRIES = 100` cap removed. Cook history grows unbounded. |

---

## 16. Related Documents

- `docs/TERMS_OF_REFERENCE.md` - Original project ToR
- `docs/FEATURE_REQUIREMENTS.md` - Detailed feature specifications
- `docs/NINJA_COMBI_GUIDE.md` - Ninja Combi integration details
- `docs/NINJA_MEAL_BUILDER_UI_SPEC.md` - UI design inspiration
- `docs/USE_CASES.md` - Real-world cooking scenarios
- `STATUS.md` - Current project status
- `README.md` - Project overview

---

## 16. Glossary

| Term | Definition |
|------|------------|
| **Appliance** | A cooking device configured in the system (MEATER probe, Ninja combi, etc.) |
| **Cook** | A cooking session from start to completion |
| **Cook Type** | Category of cooking session: "Meater probe cook" (type 6.1) or "Recipe cook" (type 6.2) |
| **Meater probe cook** | Standalone temperature monitoring with MEATER probe (cook type 6.1) |
| **Recipe cook** | Unified cook type encompassing ninja combi recipe builder, ninja combi recipe (built-in), and ai recipe builder recipes (cook type 6.2) |
| **Guide Step** | Individual step in the recipe cook flow |
| **Main Appliance** | Primary cooking device used in a recipe cook |
| **Measurement System** | User's preferred unit system: Swedish (default), UK, US, or Pure Metric |
| **Multilingual** | System support for multiple languages (Swedish and English implemented, extensible) |
| **Path** | A navigation flow within the GUI (meater path, ninja combi path, ai recipe builder path, previous cook path) |
| **Previous Cooks** | History list showing all completed cooking sessions |
| **Recipe Cook Flow** | A structured cooking session with step-by-step guide, started by "Start Cooking" button |
| **Secondary Appliances** | Additional deselectable appliances available for recipe generation |
| **Serving Size** | Number of portions a recipe makes; selectable and scales ingredient quantities |
| **Subprocess** | MEATER probe monitoring running within a recipe cook (not a meater probe cook, just a sub process) |
| **Welcome Screen** | Initial landing page with appliance selector |

---

## 17. Document History

| Version | Date | Changes | Author |
|---------|------|---------|--------|
| 2.0 | 2026-01-16 | Initial GUI redesign ToR based on Cooking gui.odt | AI Agent |
| 2.1 | 2026-01-16 | Corrected terminology to match ODT exactly: paths/cooks naming, guide steps, recipe cooks as unified type. Added deselectable secondary appliances. | AI Agent |
| 2.2 | 2026-01-16 | Simplified cook type names: "Meater probe cook" and "Recipe cook". Changed back to "recipe cook flow". Never abbreviate "Ninja combi" to just "Ninja". | AI Agent |
| 2.3 | 2026-01-16 | Added three major features: (a) Multilingual support (Swedish/English), (b) Measurement systems (Swedish default, UK, US, Pure Metric), (c) Serving size adjustment for all recipes. | AI Agent |
| 2.4 | 2026-01-16 | Research-based update of Swedish measurements: Added accurate abbreviations (krm, tsk, msk, hg), conversion table, and common recipe patterns. Clarified that cups are NOT used in Swedish recipes and dl is standard for flour/sugar. | AI Agent |
| 3.0 | 2026-02-25 | Updated phases 1-6 to COMPLETE with actual version numbers. Added § 15 Implementation Deviations documenting: features added beyond ToR (custom cook, complexity, cuisines, etc.), features deferred to later phases, removed features (View Assist dashboard), API deviations, data model deviations. | AI Agent |
| 3.1 | 2026-02-26 | Updated for v0.5.2.8 merge preparation. Added v0.5.2.x deviations: multi-appliance management, feature type classification, feature modification notes (panel + appliance path), categorized AI ingredients (300+), cuisine-specific ingredients, recipe origin badges, appliance APIs, AI settings API. Conformed ToR to actual implementation. | AI Agent |

---

## 18. Approval

This document requires approval from:
- [ ] Project Owner
- [ ] Lead Developer
- [ ] UX Designer
- [ ] Product Manager

**Status:** Draft - Awaiting Review
