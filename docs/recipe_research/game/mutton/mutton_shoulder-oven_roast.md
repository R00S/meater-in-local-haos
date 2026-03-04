# Mutton Shoulder × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Mutton shoulder is even more collagen-rich than lamb shoulder, and benefits greatly
from very slow cooking (150-160°C / 300-320°F) for 4-6 hours. The long time allows
the strong mutton fat and connective tissue to render down fully, eliminating any
harsh or gamy notes while creating extraordinary depth of flavour. The target for
pulled mutton shoulder is 82-90°C / 180-195°F — identical to pulled pork temperature.
This is the method behind South Asian "nihari" and Welsh cawl traditions.

## Source recipes

### 1. Fergus Henderson — Shoulder of Mutton (Beyond Nose to Tail)
- **Source**: Beyond Nose to Tail (Bloomsbury)
- **Method**: Season + stud with garlic, 150°C / 300°F for 5-6 hours covered.
- **Target**: **85-90°C / 185-195°F** — "falling off the bone, fat completely rendered"

### 2. Yotam Ottolenghi — Slow-Cooked Mutton Shoulder with Dill (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Middle Eastern spice rub, 150°C oven 5-6 hours tightly covered.
- **Target**: **85-90°C** — "completely fork-tender"

### 3. Jamie Oliver — Slow Mutton Shoulder (Jamie's Great Britain)
- **Source**: Jamie's Great Britain (Hyperion)
- **Method**: Anchovy + rosemary, 160°C 4 hours covered + uncover 1 hour.
- **Target**: **82-88°C** — "peeling away from the bone"

### 4. Magnus Nilsson — Långlagad fårskulder (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Nordic spice + juniper, 140°C for 7-8 hours.
- **Target**: **80-85°C** (very gentle Nordic approach)

### 5. Hank Shaw — Slow-Roasted Mutton Shoulder (honest-food.net)
- **Source**: honest-food.net
- **Method**: Dry rub + red wine baste, 325°F / 163°C for 4-5 hours.
- **Target**: **185-195°F / 85-91°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| UK / Henderson | 85-90°C / 185-195°F | 5-6 hours pulled |
| Middle East / Ottolenghi | 85-90°C | Spiced pulled |
| UK / Jamie Oliver | 82-88°C | 4+ hours |
| Sweden / Nilsson | 80-85°C | Very gentle 7-8 hours |
| USA / Hank Shaw | 185-195°F / 85-91°C | Standard pull |

**Consensus: 82-90°C / 180-195°F for pulled mutton shoulder.**
Maps to `well_done` in mutton doneness.

## What makes this method special
Slow-roasted mutton shoulder is among the most complex-flavoured braises in any
culinary tradition — the combination of older sheep fat, collagen, and long rendering
time produces a depth of flavour that young lamb simply cannot match. This is the
method that converted mutton from being seen as a tough old ingredient into a
celebrated centrepiece in modern British and Middle Eastern cooking.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (82-90°C pulled shoulder target)
