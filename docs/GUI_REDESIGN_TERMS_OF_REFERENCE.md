# Terms of Reference: Kitchen Cooking Engine GUI Redesign

**Version:** 2.0  
**Created:** 2026-01-16  
**Status:** Planning  
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
   - Show selected main appliance name
   - Display main appliance features
   - List all available secondary appliances (names only, no features)
   - **Secondary appliances are deselectable** (checkboxes to include/exclude)

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
│   AI Recipe Builder                        │
├────────────────────────────────────────────┤
│                                            │
│   Main Appliance: DeLonghi MultiFry       │
│   Features: Air Fry, Grill, Bake, Roast   │
│                                            │
│   Secondary Appliances Available:          │
│   ☑ Stovetop                               │
│   ☑ Microwave                              │
│   ☑ MEATER+ Probe                          │
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
│                                 (timer)     │
└────────────────────────────────────────────┘
```
- Recipe title (top left)
- Timer showing elapsed time since "Start Cooking" pressed (top right)
- Format: MM:SS or HH:MM:SS for long cooks

#### Ingredients List
```
┌────────────────────────────────────────────┐
│   Ingredients:                             │
│                                            │
│   • 6 chicken thighs                       │
│   • 2 tbsp olive oil                       │
│   • **1 tsp paprika**                      │
│   • **Salt & pepper**                      │
│   • 1 lemon, quartered                     │
└────────────────────────────────────────────┘
```
- **Source from specification:** "Below the title close to the top, a list of ingreadents with amounts. Ingredients that are used in the current guilde step are bold."
- List all ingredients with quantities
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
}
```

#### Recipe Object
```typescript
interface Recipe {
  id: string;
  title: string;
  source: 'ninja_combi_recipe_builder' | 'ninja_builtin' | 'ai_recipe_builder';
  main_appliance: string;
  secondary_appliances?: string[];  // Deselectable list
  ingredients: Ingredient[];
  steps: RecipeStep[];  // Guide steps
  total_time_minutes: number;
  meater_integration?: boolean;  // Can use meater as subprocess
}
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
- [ ] From welcome screen, user can identify all available cooking options
- [ ] User understands which appliance to select for desired cooking mode
- [ ] Navigation path is clear and predictable

### 11.2 All Cook Types Are Accessible
- [ ] Meater probe cook can be started (type 6.1)
- [ ] Recipe cook can be started (type 6.2 - includes Ninja combi and AI recipes)
- [ ] Ninja combi recipes (built-in and builder) can be accessed and cooked
- [ ] AI recipe generation works for all appliances
- [ ] Previous cooks can be browsed and restarted

### 11.3 Recipe Cook Flow Functions Completely
- [ ] Recipe overview displays correctly (first guide page)
- [ ] Guide step navigation works (next/back buttons)
- [ ] Ingredients bold correctly based on current guide step
- [ ] Timer displays elapsed time accurately since pressing Start Cooking
- [ ] MEATER probe can be started as subprocess (not a meater probe cook)
- [ ] Star ratings can be entered (ease and result, 1-5 stars)
- [ ] Pressing finish button saves cook to previous cooks with all data

### 11.4 Previous Cooks System Works
- [ ] All completed cooks appear in previous cook path
- [ ] Cooks display with correct metadata (sorted by latest first)
- [ ] Detail view shows full cook information (ingredients, ratings, notes)
- [ ] Restart functionality works for all cook types
- [ ] Filtered views work in path-specific recent lists (recent recipes)

### 11.5 Visual Design Is Cohesive
- [ ] Welcome screen is attractive and clear
- [ ] Path screens follow consistent design language (meater path, ninja combi path, ai recipe builder path, previous cook path)
- [ ] Recipe cook interface is clean and readable
- [ ] Mobile responsive design works on small screens
- [ ] Icons and visual elements are intuitive

---

## 12. Implementation Phases

### Phase 1: Foundation (Weeks 1-2)
- [ ] Implement welcome screen with appliance selector
- [ ] Build path routing logic
- [ ] Create basic path screens (skeleton views)
- [ ] Set up navigation state management

### Phase 2: Meater Path (Week 3)
- [ ] Integrate existing MEATER cooking interface
- [ ] Implement filtered recent recipes for MEATER
- [ ] Test meater only cook flow end-to-end

### Phase 3: Previous Cook Path (Week 4)
- [ ] Build cook history data model
- [ ] Create previous cooks list component
- [ ] Implement cook detail view
- [ ] Add restart functionality
- [ ] Build filtering system for path-specific views (recent recipes)

### Phase 4: Recipe Cook Flow (Weeks 5-6)
- [ ] Build recipe cook screen layout
- [ ] Implement guide step navigation
- [ ] Add timer functionality (time since pressing Start Cooking)
- [ ] Build ingredient list with guide step highlighting
- [ ] Create overview and detail guide pages
- [ ] Implement MEATER probe subprocess integration (not a meater probe cook)
- [ ] Build star rating interface (ease and result)
- [ ] Wire up finish button to save to previous cooks

### Phase 5: Ninja combi Path (Week 7)
- [ ] Integrate existing Ninja combi recipe builder
- [ ] Connect ninja combi recipe selector (built-in recipes)
- [ ] Link to AI Recipe Builder path with Ninja combi preselected
- [ ] Implement filtered recent recipes for Ninja combi
- [ ] Test full Ninja combi recipe cook flow

### Phase 6: AI Recipe Builder Path (Week 8)
- [ ] Build AI Recipe Builder path screen
- [ ] Display appliance features
- [ ] Add deselectable secondary appliances (checkboxes)
- [ ] Integrate existing AI recipe generation
- [ ] Connect to recipe cook flow
- [ ] Implement filtered recent recipes for selected appliance
- [ ] Test full AI recipe cook workflow

### Phase 7: Polish & Testing (Weeks 9-10)
- [ ] Visual design refinement
- [ ] Mobile responsive testing
- [ ] Edge case handling
- [ ] Performance optimization
- [ ] User acceptance testing
- [ ] Documentation updates

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

## 15. Related Documents

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
| **Secondary Appliances** | Additional deselectable appliances available for recipe generation |
| **Path** | A navigation flow within the GUI (meater path, ninja combi path, ai recipe builder path, previous cook path) |
| **Previous Cooks** | History list showing all completed cooking sessions |
| **Recipe Cook Flow** | A structured cooking session with step-by-step guide, started by "Start Cooking" button |
| **Subprocess** | MEATER probe monitoring running within a recipe cook (not a meater probe cook, just a sub process) |
| **Welcome Screen** | Initial landing page with appliance selector |

---

## 17. Document History

| Version | Date | Changes | Author |
|---------|------|---------|--------|
| 2.0 | 2026-01-16 | Initial GUI redesign ToR based on Cooking gui.odt | AI Agent |
| 2.1 | 2026-01-16 | Corrected terminology to match ODT exactly: paths/cooks naming, guide steps, recipe cooks as unified type. Added deselectable secondary appliances. | AI Agent |
| 2.2 | 2026-01-16 | Simplified cook type names: "Meater probe cook" and "Recipe cook". Changed back to "recipe cook flow". Never abbreviate "Ninja combi" to just "Ninja". | AI Agent |

---

## 18. Approval

This document requires approval from:
- [ ] Project Owner
- [ ] Lead Developer
- [ ] UX Designer
- [ ] Product Manager

**Status:** Draft - Awaiting Review
