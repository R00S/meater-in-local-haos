# Ninja Meal Builder UI Specification

## Overview

This document provides the complete UI/UX specification for the Ninja Meal Builder interface, inspired by the official Ninja Speedi Recipe Builder. The design creates an intuitive, visual, step-by-step wizard that makes building custom meals easy for users of all skill levels.

## Design Philosophy

**Principles:**
- **Visual First:** Large ingredient cards with images over text-heavy lists
- **Progressive Disclosure:** Show only relevant options at each step
- **Immediate Feedback:** Real-time preview updates as selections are made
- **Error Prevention:** Disable incompatible combinations automatically
- **Mobile-Friendly:** Responsive design works on all screen sizes

**Inspiration:** Official Ninja Speedi Recipe Builder (https://ninjatestkitchen.eu/speedi-recipe-builder/)

---

## 5-Step Wizard Flow

### Step 1: Choose Your Base
**Purpose:** Select the foundation grain, pasta, or legume for the meal

**Layout:**
- Header: "Step 1 of 5: Choose Your Base"
- Progress bar: 20% complete
- Grid of ingredient cards (3-4 columns, responsive)
- Categories with collapsible sections:
  - **Rice** (6 types): White, Brown, Jasmine, Sushi, Coconut, Easy-Cook
  - **Pasta** (5 types): Plain, Tomato Sauce, Creamy, Béchamel, Gluten-Free
  - **Grains** (4 types): Quinoa, Bulgur Wheat, Risotto, Couscous  
  - **Legumes** (2 types): Red Lentils, Green Lentils
  - **Potatoes** (1 type): New Potatoes

**Ingredient Card Design:**
```
┌─────────────────────┐
│                     │
│   [INGREDIENT IMG]  │  200x200px
│                     │
├─────────────────────┤
│  White Rice    ✓    │  Bold name + checkmark if selected
│  Cook: 15 min       │  Timing info
│  💧 4 cups water    │  Water amount icon
└─────────────────────┘
```

**Color Scheme:** Yellow/Gold theme (#F9A825)

**Interactions:**
- **Click card:** Select base (single selection)
- **Selected state:** Blue border, checkmark, slight elevation
- **Hover:** Subtle shadow, slight scale (1.05x)

**Right Sidebar Preview:**
```
Your Meal (Live Preview)
━━━━━━━━━━━━━━━━━━━━━━
🍚 Base: White Rice
   Water: 4 cups
   Cook time: 15 min

[Continue to Step 2 →]
```

---

### Step 2: Select Your Protein
**Purpose:** Choose the main protein for the meal

**Layout:**
- Header: "Step 2 of 5: Select Your Protein"
- Progress bar: 40% complete
- Tabbed categories:
  - **Chicken** (7 types)
  - **Beef** (5 types)
  - **Pork** (3 types)
  - **Seafood** (5 types)
  - **Lamb** (2 types)
  - **Plant-Based** (5 types)

**Ingredient Card Design:**
```
┌─────────────────────┐
│                     │
│   [PROTEIN IMG]     │  200x200px
│   🌡️ 74°C/165°F    │  MEATER+ temp badge (if probe-compatible)
│                     │
├─────────────────────┤
│  Chicken Breast ✓   │  Bold name
│  Cook: 18 min       │  Timing
│  🥩 Fresh          │  Fresh/Frozen badge
└─────────────────────┘
```

**Color Scheme:** Red/Pink theme (#E53935)

**Protein Type Badges:**
- 🥩 Fresh - Green badge
- ❄️ Frozen - Blue badge
- 🌱 Plant-Based - Green leaf badge

**MEATER+ Indicator:**
- Show temp badge on all probe-compatible proteins
- Hover shows "Monitor with MEATER+ probe"

**Right Sidebar Preview:**
```
Your Meal
━━━━━━━━━━━━━━━━━━━━━━
🍚 Base: White Rice (15 min)
🍗 Protein: Chicken Breast (18 min)
   🌡️ Target: 74°C / 165°F

Total Cook Time: 18 min
Oven Temp: 390°F

[← Back] [Continue to Step 3 →]
```

---

### Step 3: Pick Your Vegetables
**Purpose:** Add up to 3 vegetables to the meal

**Layout:**
- Header: "Step 3 of 5: Pick Your Vegetables (up to 3)"
- Progress bar: 60% complete
- Selection counter: "2 of 3 selected"
- Grid of vegetable cards (4-5 columns)
- Filter chips at top:
  - All | Fresh | Frozen | High-Protein | Quick-Cook

**Ingredient Card Design:**
```
┌─────────────────────┐
│                     │
│   [VEGGIE IMG]      │  180x180px
│                     │
├─────────────────────┤
│  Broccoli      2/3  │  Name + selection count
│  🕒 +2 min         │  Time impact
└─────────────────────┘
```

**Color Scheme:** Green theme (#43A047)

**Multi-Select Behavior:**
- Click to select (up to 3)
- Show selection count (1/3, 2/3, 3/3)
- Disable remaining cards when 3 selected
- Click selected card to deselect

**Time Impact Indicator:**
- Show how much time each veggie adds
- "+2 min" = adds 2 minutes to cook time
- "No change" = cooks with existing time

**Right Sidebar Preview:**
```
Your Meal
━━━━━━━━━━━━━━━━━━━━━━
🍚 White Rice
🍗 Chicken Breast (🌡️ 74°C)
🥦 Broccoli
🥕 Carrots
🌶️ Bell Peppers

Total Cook Time: 20 min
Oven Temp: 390°F
Water: 4 cups
Tray: Lower (crisper) + Middle (base)

[← Back] [Continue to Step 4 →]
```

---

### Step 4: Add Toppings (Optional)
**Purpose:** Select flavor boosters and finishing touches

**Layout:**
- Header: "Step 4 of 5: Add Toppings (Optional)"
- Progress bar: 80% complete
- Subtitle: "These add flavor after cooking"
- Smaller cards (150x150px) in grid
- Categories:
  - **Herbs & Greens:** Fresh Herbs, Spinach, Arugula
  - **Crunchy:** Crispy Onions, Nuts, Seeds
  - **Creamy:** Cheese, Avocado, Hummus
  - **Sauces:** Pesto, Salsa, Tzatziki, Soy Sauce
  - **Pickled:** Pickled Vegetables, Kimchi

**Topping Card Design:**
```
┌───────────────┐
│   [ICON]      │  100x100px
│               │
│  Sesame       │  Name
│  Seeds    ✓   │  Checkmark
└───────────────┘
```

**Color Scheme:** Orange theme (#FF9800)

**Multi-Select:** Unlimited selections allowed

**Right Sidebar Preview:**
```
Your Meal
━━━━━━━━━━━━━━━━━━━━━━
🍚 White Rice
🍗 Chicken Breast (🌡️ 74°C)
🥦 Broccoli
🥕 Carrots
🌶️ Bell Peppers

Toppings:
+ Sesame Seeds
+ Soy Sauce

Total Cook Time: 20 min
Serves: 4 people

[← Back] [Skip] [Review Meal →]
```

---

### Step 5: Review & Cook
**Purpose:** Final review of complete meal with nutrition, instructions, and START COOK button

**Layout:**
- Header: "Your Custom Meal is Ready!"
- Large meal preview card (center)
- Recipe name input field
- Cooking instructions (expandable sections)
- Nutrition facts (expandable)
- **Large START COOK button**

**Meal Preview Card:**
```
┌────────────────────────────────────────┐
│                                        │
│    [GENERATED MEAL IMAGE PLACEHOLDER]  │
│              400x300px                 │
│                                        │
├────────────────────────────────────────┤
│  Chicken & Vegetable Rice Bowl        │  Recipe name (editable)
│                                        │
│  🕒 Cook Time: 20 minutes              │
│  🌡️ Oven Temp: 390°F / 200°C         │
│  👥 Serves: 4 people                   │
│  ⭐ Difficulty: Easy                   │
│  🌡️ MEATER+ Probe: 74°C / 165°F      │
│                                        │
├────────────────────────────────────────┤
│  INGREDIENTS                           │
│  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━  │
│  Level 1 (Combi Cooker Pan - Base):   │
│  • 2 cups white rice, rinsed           │
│  • 4 cups water                        │
│                                        │
│  Level 2 (Crisper Tray):               │
│  • 2 lbs chicken breast                │
│  • 2 cups broccoli florets             │
│  • 2 cups sliced carrots               │
│  • 1 cup bell peppers                  │
│  • 2 tbsp olive oil                    │
│  • Salt & pepper                       │
│                                        │
│  Toppings:                             │
│  • Sesame seeds                        │
│  • Soy sauce for serving               │
│                                        │
└────────────────────────────────────────┘

[▼ Show Cooking Instructions]
[▼ Show Nutrition Facts]

┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
┃  🌡️ START COOK WITH MEATER+ PROBE   ┃  Large green button
┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

[← Start Over] [💾 Save Recipe] [📧 Share]
```

**Cooking Instructions (Expandable):**
```
COOKING INSTRUCTIONS
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

PREPARATION (5 minutes):
1. Rinse rice under cold water until water runs clear
2. Season chicken breasts with salt, pepper, and olive oil
3. Prep vegetables: cut broccoli into florets, slice carrots, dice peppers
4. Insert MEATER+ probe into thickest part of chicken (avoid bone)

ASSEMBLY:
1. Add rice and water to Combi Cooker Pan (Level 1)
2. Place crisper tray on lower rack position
3. Arrange chicken breasts on crisper tray
4. Add vegetables around chicken
5. Set SmartSwitch to COMBI position

COOKING:
1. Select COMBI-MEAL mode
2. Set temperature: 390°F / 200°C
3. Set cook time: 20 minutes
4. Press START
5. Monitor MEATER+ probe in Home Assistant
6. Notification when chicken reaches 74°C / 165°F

FINISHING:
1. Let chicken rest 5 minutes (temp will rise to 76°C)
2. Fluff rice with fork
3. Top with sesame seeds and serve with soy sauce
```

**START COOK Button Click:**
Opens Home Assistant service call modal:
```
┌─────────────────────────────────────────┐
│  Start Cooking in Home Assistant        │
├─────────────────────────────────────────┤
│                                         │
│  Recipe: Chicken & Vegetable Rice Bowl  │
│  Target Temp: 74°C / 165°F              │
│  Cook Time: 20 minutes                  │
│                                         │
│  ┌───────────────────────────────────┐ │
│  │ 1. Insert MEATER+ probe into     │ │
│  │    chicken breast                │ │
│  │                                  │ │
│  │ 2. Place ingredients in oven    │ │
│  │    as shown above                │ │
│  │                                  │ │
│  │ 3. Click below to start         │ │
│  │    monitoring in Home Assistant │ │
│  └───────────────────────────────────┘ │
│                                         │
│  [🚀 Start Cooking Session]            │
│                                         │
│  [Cancel]                               │
└─────────────────────────────────────────┘
```

---

## Responsive Design

### Desktop (> 1024px)
- 3-4 ingredient cards per row
- Sidebar preview always visible
- Full wizard width: 1200px max
- Card size: 200x200px

### Tablet (768px - 1024px)
- 2-3 ingredient cards per row
- Sidebar preview collapsible
- Card size: 180x180px
- Larger touch targets (min 44x44px)

### Mobile (< 768px)
- 1-2 ingredient cards per row (portrait/landscape)
- Sidebar preview at bottom (fixed, scrollable)
- Card size: 150x150px
- Full-width buttons
- Simplified navigation (back/forward arrows)

---

## Color Coding System

**Category Colors:**
- 🟡 Grains/Bases: Yellow/Gold (#F9A825)
- 🔴 Proteins: Red/Pink (#E53935)
- 🟢 Vegetables: Green (#43A047)
- 🟠 Toppings: Orange (#FF9800)
- 🔵 Instructions: Blue (#1E88E5)

**Status Colors:**
- Selected: Blue (#2196F3) border, blue checkmark
- Hover: Gray (#EEEEEE) background
- Disabled: Gray (#BDBDBD), 50% opacity
- Error: Red (#F44336) border and text

**MEATER+ Badge:**
- Background: #FF5722 (deep orange)
- Icon: 🌡️ white thermometer
- Text: White, bold

---

## Accessibility

**WCAG 2.1 Level AA Compliance:**
- Minimum contrast ratio 4.5:1 for text
- All interactive elements keyboard accessible
- Focus indicators visible on all cards
- Screen reader labels on all images
- ARIA landmarks for page sections
- ARIA live regions for preview updates

**Keyboard Navigation:**
- Tab: Move between cards
- Enter/Space: Select card
- Arrow keys: Navigate grid
- Esc: Go back one step
- Ctrl+Enter: Advance to next step

**Screen Reader Announcements:**
- "Step 1 of 5: Choose Your Base"
- "White Rice selected, 4 cups water needed, 15 minute cook time"
- "2 of 3 vegetables selected"
- "Meal complete, ready to start cooking"

---

## Animations & Transitions

**Card Interactions:**
- Hover: scale(1.05) + shadow (200ms ease-out)
- Select: border color change (150ms ease-in)
- Deselect: reverse animation (150ms ease-out)

**Step Transitions:**
- Slide in from right (300ms ease-in-out)
- Fade out previous step (200ms)
- Progress bar fills smoothly (400ms ease-in-out)

**Preview Sidebar:**
- Items slide in from bottom as selected (250ms)
- Values update with fade transition (150ms)
- Total time updates with number counter animation (500ms)

---

## Popular Combinations Sidebar

**Feature:** Show 3-5 popular meal combinations at each step

**Example (Step 2 - After selecting White Rice):**
```
💡 Popular with White Rice
━━━━━━━━━━━━━━━━━━━━━━━━━
1. Chicken Breast
   (⭐ Most Popular)
   
2. Salmon Fillet
   (🌡️ MEATER+ Compatible)
   
3. Tofu
   (🌱 Plant-Based)
```

**Click on suggestion:** Auto-selects that ingredient and advances

---

## Dietary Filter Badges

**Filters at top of each step:**
```
[All] [🌱 Vegetarian] [🌿 Vegan] [🌾 Gluten-Free] [💪 High-Protein] [⚡ Quick (<15min)]
```

**Badge Display on Cards:**
- 🌱 Vegetarian - Green badge
- 🌿 Vegan - Dark green badge
- 🌾 Gluten-Free - Yellow badge
- 💪 High-Protein - Red badge
- ⚡ Quick - Blue badge

**Filter Behavior:**
- Click filter: Show only matching ingredients
- Multiple filters: AND logic (must match all)
- Active filters highlighted
- Count shown: "12 of 24 items match"

---

## SmartSwitch Position Indicator

**Visual Guide:**
```
┌─────────────────────────┐
│  SMARTSWITCH POSITION   │
├─────────────────────────┤
│                         │
│     ┌─────────┐         │
│     │ ○─────○ │ ←       │  Toggle switch graphic
│     │ COMBI  │          │  Left position
│     └─────────┘         │
│                         │
│  Use COMBI position     │
│  for this recipe        │
└─────────────────────────┘
```

**Positions:**
- COMBI: For Rapid Cook, Combi-Crisp, Combi-Bake, Combi-Roast
- AIR FRY: For Air Fry, Broil, Dehydrate
- STOVETOP: For Sear/Saute, Slow Cook

---

## Water Level Gauge

**Visual Indicator:**
```
💧 WATER LEVEL
┌────────────┐
│████████████│ 4 cups (max)
│████████████│
│████████████│
│████████    │ 3 cups
│████████    │
│████        │ 2 cups
│████        │
│            │ 1 cup
│            │
│            │ 0 cups
└────────────┘

Add 4 cups water to Combi Cooker Pan
```

---

## Tray Position Diagram

**Visual Guide:**
```
TRAY PLACEMENT
━━━━━━━━━━━━━━━━━━━━━━━━━━
┌────────────────────────┐
│  🔼 UPPER RACK         │  (Grilling, Broiling)
│                        │
│  ─────────────────────│
│                        │
│  🔲 MIDDLE RACK        │  (Baking, Roasting)
│    [Crisper Tray]     │  ← Your meal here
│  ─────────────────────│
│                        │
│  🔽 LOWER RACK         │  (Combi Cooker Pan)
│    [Base Layer]        │  ← Rice goes here
│                        │
│  💧 DRIP TRAY          │  (Bottom)
└────────────────────────┘
```

---

## Error States & Validation

**Invalid Combinations:**
```
⚠️  INCOMPATIBLE COMBINATION

Frozen proteins require Rapid Cook mode.
Current selection uses Combi-Roast.

Suggestions:
• Switch to Rapid Cook mode
• Choose fresh protein instead
• Defrost chicken first

[Change Mode] [Change Protein] [Learn More]
```

**Missing Required Fields:**
- Highlight step in progress bar with red dot
- Show inline error message
- Disable "Continue" button until resolved

---

## Implementation Notes for Home Assistant

**Panel Integration:**
```javascript
// Add to Kitchen Cooking Engine panel
<ha-card>
  <div class="card-header">
    <div class="name">Ninja Meal Builder</div>
  </div>
  <div class="card-content">
    <mwc-button @click="${this._openMealBuilder}">
      🥘 Build Your Meal
    </mwc-button>
  </div>
</ha-card>

// Opens modal with wizard
_openMealBuilder() {
  this._showDialog({
    dialogTag: "ninja-meal-builder-dialog",
    dialogImport: () => import("./ninja-meal-builder-dialog"),
  });
}
```

**State Management:**
```javascript
// Store meal builder state
this._mealBuilderState = {
  currentStep: 1,
  selections: {
    base: null,
    protein: null,
    vegetables: [],
    toppings: []
  },
  preview: {
    cookTime: 0,
    ovenTemp: 0,
    waterAmount: 0,
    probeTemp: null
  }
};
```

---

## Summary

This UI specification provides a complete blueprint for implementing an intuitive, visual meal builder interface inspired by the Ninja Speedi recipe builder. The design prioritizes:

1. **Visual clarity** with large ingredient cards and images
2. **Progressive steps** that guide users through the process
3. **Real-time feedback** with live preview updates
4. **Error prevention** with smart validation
5. **Mobile responsiveness** for all device sizes
6. **Accessibility** meeting WCAG 2.1 AA standards
7. **Integration** with Home Assistant and MEATER+ probe monitoring

**Next Steps for Frontend Development:**
1. Create UI components library (ingredient cards, progress bar, preview sidebar)
2. Implement wizard navigation logic
3. Connect to backend recipe builder API
4. Add MEATER+ probe integration
5. Implement responsive layouts
6. Add animations and transitions
7. Test accessibility compliance
8. Deploy to Home Assistant panel

**Total Estimated Development Time:** 40-60 hours for complete implementation
