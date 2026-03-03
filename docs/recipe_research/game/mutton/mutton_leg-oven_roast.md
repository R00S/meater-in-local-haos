# Mutton Leg Roast × Oven Roast — Recipe Temperature Research

## Cut profile
Mutton leg roast is a Welsh and British tradition experiencing global revival.
A whole leg of mutton (2-3 kg / 4-7 lb) roasts low-and-slow to develop the
complex mutton fat flavours, unlike the quick-roast approach for young lamb leg.
Most authorities recommend 160-165°C / 320-330°F for 3-3.5 hours for a
medium result (65-70°C / 149-158°F) or 4+ hours for a softer pulled result
at 80-85°C / 175-185°F. The stronger flavour compared to lamb benefits from
longer cook times that mellow the fat.

## Source recipes

### 1. Fergus Henderson — Whole Leg of Mutton (Beyond Nose to Tail)
- **Source**: Beyond Nose to Tail (Bloomsbury)
- **Method**: Stud with garlic + anchovy, roast 160°C / 320°F for 3-4 hours.
- **Target**: **65-70°C / 149-158°F** — medium to medium-well
- **Note**: Henderson argues mutton leg at medium-well (65-70°C) produces better
  texture and flavour than the medium-rare used for lamb.

### 2. Jamie Oliver — Slow Roasted Mutton Leg (Jamie's Great Britain)
- **Source**: Jamie's Great Britain (Hyperion)
- **Method**: Anchovy + rosemary studs, 160°C for 3.5-4 hours covered + uncover
  last 30 min.
- **Target**: **75-80°C** for "falling-apart tender" texture
- **Note**: Oliver's approach produces pull-apart mutton — a completely different
  style from Henderson's sliced leg.

### 3. Yotam Ottolenghi — Slow-Roasted Mutton Shoulder/Leg (SIMPLE)
- **Source**: SIMPLE (Appetite by Random House)
- **Method**: Middle Eastern spice + yogurt rub, 160°C for 4-5 hours.
- **Target**: **80-85°C** — "falling from the bone" slow-roasted style

### 4. Magnus Nilsson — Ugnsrostat fårlår (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Traditional Nordic preparation, 160°C 3 hours.
- **Target**: **65-70°C** (Swedish fårkött roast standard)

### 5. BBC Wales / Traditional Welsh Mutton
- **Source**: bbc.co.uk/food / Welsh food tradition
- **Method**: Rosemary + garlic, 160°C for 3 hours.
- **Target**: **65-70°C** — "juices run nearly clear, slightly pink"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| UK / Henderson | 65-70°C / 149-158°F | Medium-well, sliced |
| UK / Jamie Oliver | 75-80°C | Pull-apart style |
| Middle East / Ottolenghi | 80-85°C | Slow-braised style |
| Sweden / Nilsson | 65-70°C | Nordic standard |
| Wales tradition | 65-70°C | "Juices nearly clear" |

**Consensus: 65-70°C / 149-158°F for sliced medium-well mutton leg;**
**80-85°C / 175-185°F for pull-apart slow-roasted style.**
Maps to `medium` or `well_done` in mutton doneness depending on style.

## What makes this method special
Mutton leg roast is the original British Sunday joint — a tradition dating centuries.
The slow roast allows the characteristically strong mutton fat to render and mellow
while the connective tissue softens. The result is deeper, more complex than lamb
— a flavour profile that pairs with strong accompaniments like mint sauce, redcurrant
jelly, or capers.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `braise`, `slow_cooker`
- `recommended_doneness`: `"medium"` (65-70°C sliced standard)
