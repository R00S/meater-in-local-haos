# Goat Leg Roast × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Goat leg roast (birria, mechado, Caribbean roast goat, Indian mutton rogan josh) is
a globally beloved preparation that varies from quick-roasted medium (63-68°C /
145-155°F) to low-and-slow pulled (82-90°C / 180-195°F). A whole goat leg (1.5-2.5
kg / 3-5 lb) typically roasts at 160-170°C / 320-340°F for 2.5-4 hours depending
on the target doneness. The connective-tissue-rich leg of goat responds very well
to both approaches, though the slow-pulled style is most common globally.

## Source recipes

### 1. Yotam Ottolenghi — Slow-Roasted Goat Leg (Jerusalem / NOPI)
- **Source**: NOPI (Ten Speed Press)
- **Method**: Spice paste (ras el hanout + yogurt), oven 160°C for 4-5 hours covered.
- **Target**: **85-90°C / 185-195°F** — "meat pulls from bone"

### 2. Hank Shaw — Slow-Roasted Goat Leg (honest-food.net)
- **Source**: honest-food.net/goat-leg-roast
- **Method**: Mexican chile paste, 325°F / 163°C oven 3-4 hours.
- **Target**: **180-190°F / 82-88°C** — "probe slides in, meat shreds easily"

### 3. Rick Stein — Braised Goat Leg (Rick Stein's India)
- **Source**: Rick Stein's India (BBC Books)
- **Method**: Indian spice paste, oven braise 160°C for 3 hours.
- **Target**: **82-88°C** — fork-tender

### 4. Caribbean tradition — Jamaican Curried Goat (Leg)
- **Source**: Jamaican cooking tradition / jamaicans.com
- **Method**: Curry paste, braise in pot or oven 3-4 hours.
- **Target**: **82-88°C** — "completely tender, falls from bone"

### 5. Magnus Nilsson (adapted) — Getlår i ugn
- **Source**: Adapted from Scandinavian game tradition
- **Method**: Nordic herb + juniper, 160°C 3-4 hours.
- **Target**: **75-82°C** (Nilsson style: slightly less rendered for cleaner slices)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Middle East / Ottolenghi | 85-90°C / 185-195°F | Pulled style |
| USA / Hank Shaw | 180-190°F / 82-88°C | Shredded |
| UK / Rick Stein | 82-88°C | Indian braise |
| Caribbean | 82-88°C | Curried falling-bone |
| Nordic adapted | 75-82°C | Sliced style |

**Consensus: 82-90°C / 180-195°F for pull-apart goat leg;**
**63-68°C / 145-155°F for sliced medium preparation.**
Maps to `well_done` in goat doneness.

## What makes this method special
Slow-roasted goat leg is one of the great world dishes — celebrated from Jamaica
to Morocco to Kerala. The goat's lean, collagen-rich leg transforms over hours
into something extraordinary: deeply fragrant from the spice paste, meltingly
tender from the collagen conversion, with a rich braising liquid that concentrates
into the most complex sauce. No shortcut method comes close.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `braise`, `slow_cooker`
- `recommended_doneness`: `"well_done"` (82-90°C pulled style standard)
