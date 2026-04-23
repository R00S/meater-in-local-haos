# Phase 1 Testing Guide

## Quick Start

After deploying this update, the Kitchen Cooking Engine panel will display a new welcome screen.

---

## Visual Testing Checklist

### Welcome Screen

**What to expect:**
```
🍳 Kitchen Cooking Engine
Select Your Appliance

┌─────────────┐  ┌─────────────┐  ┌─────────────┐
│    🌡️      │  │    🥘      │  │    🍳      │
│  MEATER+    │  │Ninja Combi  │  │ DeLonghi   │
│             │  │             │  │ MultiFry   │
│ MEATER Plus │  │ Ninja SL400 │  │DeLonghi XYZ│
└─────────────┘  └─────────────┘  └─────────────┘

┌────────────────────────────────────────────┐
│  📋        Previous Cooks                  │
│  View and restart your past cooking        │
│  sessions                                  │
└────────────────────────────────────────────┘
```

**Test:**
- [ ] Welcome screen displays on first load
- [ ] All configured appliances shown as cards
- [ ] Icons display correctly for each appliance type
- [ ] Appliance names and models visible
- [ ] Cards have hover effect (slight lift)
- [ ] Previous Cooks button visible at bottom
- [ ] Responsive on mobile (cards stack)

---

### MEATER Path

**Click on MEATER appliance to see:**
```
← Back to Appliances
🌡️ MEATER+ (or your appliance name)

┌────────────────────────────────────────────┐
│  🌡️       Start MEATER Cooking            │
│  Select protein, set target, monitor      │
│  temperature                              │
└────────────────────────────────────────────┘

┌────────────────────────────────────────────┐
│  📋       Recent MEATER Cooks              │
│  View and restart previous temperature-   │
│  based cooks                              │
└────────────────────────────────────────────┘
```

**Test:**
- [ ] Path displays after clicking MEATER appliance
- [ ] Back button returns to welcome screen
- [ ] Appliance name shown in header
- [ ] Two buttons visible
- [ ] Clicking buttons shows "Coming Soon" message
- [ ] Cards have hover effect

---

### Ninja Combi Path

**Click on Ninja Combi appliance to see:**
```
← Back to Appliances
🥘 Ninja Combi SL400 (or your appliance name)

┌────────────────────────────────────────────┐
│  🎨       Recipe Builder                   │
│  Create custom recipes with Ninja Combi   │
│  modes                                    │
└────────────────────────────────────────────┘

┌────────────────────────────────────────────┐
│  📖       Built-in Recipes                 │
│  Browse pre-configured Ninja Combi        │
│  recipes                                  │
└────────────────────────────────────────────┘

┌────────────────────────────────────────────┐
│  🤖       AI Recipe with Ninja Combi       │
│  Generate AI recipes using your Ninja     │
│  Combi                                    │
└────────────────────────────────────────────┘

┌────────────────────────────────────────────┐
│  📋       Recent Ninja Combi Cooks         │
│  View and restart previous Ninja Combi    │
│  recipes                                  │
└────────────────────────────────────────────┘
```

**Test:**
- [ ] Path displays after clicking Ninja Combi
- [ ] Back button works
- [ ] Four buttons visible
- [ ] Clicking buttons shows "Coming Soon" message

---

### AI Recipe Builder Path

**Click on any other appliance (e.g., MultiFry) to see:**
```
← Back to Appliances
🤖 AI Recipe Builder

┌────────────────────────────────────────────┐
│ Main Appliance: DeLonghi MultiFry         │
│ Features: air_fry, grill, bake, roast     │
│                                            │
│ Secondary Appliances Available:           │
│ ☑ Stovetop                                │
│ ☑ Microwave                               │
│ ☑ MEATER+                                 │
└────────────────────────────────────────────┘

┌────────────────────────────────────────────┐
│  🤖       Create AI Recipe                 │
│  Generate custom recipes using your       │
│  appliances and ingredients               │
└────────────────────────────────────────────┘

┌────────────────────────────────────────────┐
│  📋       Recent MultiFry Recipes          │
│  View and restart previous AI recipes     │
│  for this appliance                       │
└────────────────────────────────────────────┘
```

**Test:**
- [ ] Path displays for non-MEATER/non-Ninja appliances
- [ ] Main appliance info shown
- [ ] Features list displayed
- [ ] Secondary appliances with checkboxes (if multiple appliances)
- [ ] Two buttons visible
- [ ] Checkboxes are clickable (logs to console)

---

### Previous Cooks Path

**Click on "Previous Cooks" to see:**
```
← Back to Appliances
📋 Previous Cooks

[Existing history view - unchanged]
```

**Test:**
- [ ] History displays after clicking Previous Cooks
- [ ] Back button returns to welcome screen
- [ ] All past cooks shown
- [ ] Existing functionality preserved

---

## Expected Behavior

### Navigation Flow

1. **Start**: Welcome screen
2. **Click appliance**: Routes to appropriate path based on type
3. **Click back**: Returns to welcome screen
4. **Click Previous Cooks**: Shows history with back button

### Appliance Type Detection

The system detects appliance type by analyzing brand/model/name:

- **MEATER** path if contains: "meater"
- **Ninja Combi** path if contains: "ninja" AND "combi"
- **AI Recipe Builder** path for all others

### Active Cook Override

**Important**: If a cook is currently active, the system will show the active cook interface regardless of navigation path. This is correct behavior.

To test paths: Ensure no cook is active.

---

## Known "Coming Soon" Features

Clicking these buttons will show "Coming Soon" dialogs (this is expected):

**MEATER Path:**
- Start MEATER Cooking → Phase 2
- Recent MEATER Cooks → Phase 3

**Ninja Combi Path:**
- Recipe Builder → Phase 5
- Built-in Recipes → Phase 5
- AI Recipe with Ninja Combi → Phase 6
- Recent Ninja Combi Cooks → Phase 3

**AI Recipe Builder Path:**
- Create AI Recipe → Phase 6
- Recent [Appliance] Recipes → Phase 3

**Secondary Appliances:**
- Checkboxes toggle (logs to console) → Phase 6

---

## Common Issues

### "No appliances configured"

**Cause**: No appliances set up in integration  
**Fix**: Add appliances in Kitchen Cooking Engine settings

### Appliance routes to wrong path

**Check**:
1. Appliance brand/model/name spelling
2. Expected detection:
   - MEATER: brand/model/name contains "meater"
   - Ninja Combi: brand contains "ninja" AND model contains "combi"

### Welcome screen doesn't appear

**Possible causes**:
1. Active cook in progress (this is correct - active cook takes priority)
2. Browser cache (hard refresh: Ctrl+Shift+R)
3. Panel version mismatch (check developer console for errors)

### Cards don't have hover effect

**Check**: CSS may not be loaded. Hard refresh browser.

---

## Developer Console

Open browser developer tools (F12) to check:

**Expected logs:**
```
(no errors on page load)
```

**When clicking secondary appliance checkbox:**
```
Toggle secondary appliance [id]: true/false
```

---

## Success Criteria

✅ Phase 1 is successfully implemented if:

1. Welcome screen displays with appliance cards
2. Clicking appliances routes to correct path
3. Back buttons return to welcome screen
4. Previous Cooks button works
5. All paths display skeleton views
6. "Coming Soon" messages show for placeholder actions
7. No JavaScript errors in console
8. Responsive design works on mobile

---

## Reporting Issues

If you encounter problems:

1. **Check browser console** for JavaScript errors
2. **Take screenshot** of the issue
3. **Note which appliance** you clicked (if applicable)
4. **Check panel version**: Should be "93" in browser dev tools
5. **Try hard refresh** (Ctrl+Shift+R)

---

## Next Phase Preview

**Phase 2** (Week 3) will implement:
- Actual MEATER cooking interface (replacing "Coming Soon")
- Full temperature monitoring
- Protein/cut selection
- Start/stop cook functionality

**Phase 3** (Week 4) will implement:
- Filtered history views
- "Recent Cooks" buttons will show filtered lists
- Cook type differentiation in history

---

## Questions?

See: [PHASE_1_IMPLEMENTATION.md](PHASE_1_IMPLEMENTATION.md) for detailed technical documentation.
