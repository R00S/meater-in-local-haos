# Lamb Shoulder × Oven Roast — Recipe Temperature Research

## Cut profile
Lamb shoulder is a heavily worked, collagen-rich muscle that rewards slow roasting.
Unlike the lean leg, shoulder has abundant fat and connective tissue that convert
to a rich, unctuous gelatin when cooked low-and-slow to 80-90°C / 175-195°F over
3-4 hours at 160°C / 320°F. The result: "falling off the bone" tender pulled lamb
that cannot be achieved with quick roasting. A 2 kg / 4 lb shoulder serves 6-8.

## Source recipes

### 1. Yotam Ottolenghi — Slow-Roasted Lamb Shoulder (SIMPLE / Jerusalem)
- **Source**: SIMPLE (Appetite by Random House)
- **Method**: Spice rub, garlic + anchovy studs, oven 170°C / 340°F for 4-5 hours
  covered, then 200°C / 390°F uncovered 30 min.
- **Target**: **85-90°C / 185-195°F** — "falling off the bone"
- **Note**: Ottolenghi's Middle Eastern spice approach: za'atar, cumin, preserved
  lemon. Shoulder texture at 85°C+ is completely different from leg at 58°C.

### 2. Heston Blumenthal — Perfect Slow-Roasted Shoulder (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: 80°C / 175°F oven, 12-16 hours. The extreme gentleness produces
  extraordinary tenderness.
- **Target**: **80-82°C / 175-180°F** at thickest point (extreme low-slow)
- **Note**: Blumenthal's ultra-low approach requires 12+ hours but produces
  texturally unique lamb — juicier than higher-temp slow roasting.

### 3. Leila Lindholm — Långlagad lammskuldra (leila.se)
- **Source**: leila.se/recept
- **Method**: Garlic + herb studding, 160°C oven 3-4 hours covered. Rest 20 min.
- **Target**: **85-88°C** at thickest point

### 4. Fergus Henderson — Slow Shoulder of Lamb (Nose to Tail Eating)
- **Source**: Nose to Tail Eating (Bloomsbury)
- **Method**: Season well, oven 160°C / 320°F for 4-5 hours, very little liquid.
  "The shoulder will be sticky, falling apart."
- **Target**: **88-92°C / 190-198°F** — "slides a probe in with no resistance"

### 5. Jamie Oliver — Greek-Style Slow Roast Shoulder (Jamie's Ministry of Food)
- **Source**: jamieoliver.com
- **Method**: Oregano + lemon + garlic, oven 170°C 4 hours covered + 200°C 30 min.
- **Target**: **85-90°C** — "meat falls off the bone when pulled"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Ottolenghi | 85-90°C / 185-195°F | Pull-apart tender |
| Heston Blumenthal | 80-82°C | Ultra-low, 12 hours |
| Leila / Sweden | 85-88°C | 4-hour standard |
| Fergus Henderson | 88-92°C | "Slides through" test |
| Jamie Oliver | 85-90°C | Greek-style |

**Consensus: 85-90°C / 185-195°F for pull-apart shoulder.**
Maps to `well_done` in lamb doneness.

## What makes this method special
Slow-roasted lamb shoulder is the definitive "low effort, high reward" dish —
4 hours of oven time produces a centrepiece as impressive as any restaurant dish
without the skill requirement of medium-rare roasting. The collagen conversion
at 85°C creates a sticky, gelatinous texture that makes every forkful intensely
satisfying.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `braise`, `slow_cooker`
- `recommended_doneness`: `"well_done"` (85-90°C pull-apart texture)
