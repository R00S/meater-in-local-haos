# Goat Shoulder × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Goat shoulder (or neck + shoulder combined) is the most common cut for slow cooking
worldwide — used in Caribbean curried goat, Middle Eastern mansaf, Indian biryani,
and Moroccan mechoui. The shoulder has abundant collagen and fat relative to the
lean leg, making it ideal for multi-hour slow roasting (150-165°C / 300-330°F)
to the pull-apart temperature of 82-90°C / 180-195°F.

## Source recipes

### 1. Yotam Ottolenghi — Slow-Cooked Goat Shoulder (Jerusalem / Extra Good Things)
- **Source**: Extra Good Things (Appetite by Random House)
- **Method**: Ras el hanout + lemon + yogurt coating, oven 150°C for 5-6 hours tightly
  covered. Rest 20 min.
- **Target**: **85-90°C / 185-195°F** — "meat slides off bone"

### 2. Hank Shaw — Goat Shoulder Slow Roast (honest-food.net)
- **Source**: honest-food.net
- **Method**: Mexican-spiced, low oven 300-325°F for 4-5 hours.
- **Target**: **180-190°F / 82-88°C**

### 3. Rick Stein — Braised Goat Shoulder (Rick Stein's India)
- **Source**: Rick Stein's India (BBC Books)
- **Method**: Onion + ginger + spice, covered braise 160°C 3-4 hours.
- **Target**: **82-88°C**

### 4. Caribbean Curried Goat tradition (Shoulder)
- **Source**: Traditional Caribbean recipes
- **Method**: Curry + scotch bonnet, braise 3-4 hours stovetop or oven.
- **Target**: **85-90°C** — "meat falls from bone"

### 5. Claudia Roden — Mechoui-style Goat Shoulder (A Book of Middle Eastern Food)
- **Source**: A Book of Middle Eastern Food (Knopf)
- **Method**: Butter-basted, oven 160°C 4 hours.
- **Target**: **85-90°C** — traditional mechoui standard

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| All major traditions | 82-90°C / 180-195°F | Slow-pulled standard |

**Consensus: 82-90°C / 180-195°F pull-apart.** Maps to `well_done` in goat doneness.

## What makes this method special
Slow-roasted goat shoulder is arguably the most widely shared meat preparation
in the world — some version of this dish exists in nearly every food culture.
The universal technique (long slow heat, spice paste, sealed environment) demonstrates
that the science of collagen conversion is the same everywhere; only the spices change.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (82-90°C pulled standard)
