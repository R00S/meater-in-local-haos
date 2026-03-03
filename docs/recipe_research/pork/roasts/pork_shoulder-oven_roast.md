# Pork Shoulder × Oven Roast — Recipe Temperature Research

## Cut profile
Pork shoulder (Boston butt / picnic) is a heavily worked muscle with significant
collagen and intramuscular fat, making it the ideal braising and slow-roasting cut.
Roasting low-and-slow (225-250°F / 107-120°C) for 8-12 hours converts collagen to
gelatin and renders fat, producing pull-apart pulled pork. For sliced shoulder roast
(not pulled), a higher temp (325°F / 163°C) for 3-4 hours targets 160-165°F / 71-74°C.

## Source recipes

### 1. J. Kenji López-Alt — The Ultimate Pulled Pork (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-complete-guide-to-slow-cooked-pulled-pork
- **Method**: Dry rub overnight, 250°F / 120°C oven 8-12 hours, unwrapped. Pull at
  195-205°F / 91-96°C internal.
- **Target**: **195-205°F / 91-96°C** (collagen fully converted to gelatin)
- **Note**: The 195-205°F window matters for *pulled* pork — at 185°F the meat is
  cooked but still too tight to pull cleanly.

### 2. Aaron Franklin — Backyard Pulled Pork (Franklin Barbecue)
- **Source**: Franklin Barbecue (Ten Speed Press)
- **Method**: Dry rub, 225-250°F / 107-120°C for 8-12 hours. Wrap in butcher paper
  at 165°F stall, continue to 200-205°F. Rest 1+ hours.
- **Target**: **200-205°F / 93-96°C** — probe slides in with no resistance
- **Note**: Franklin considers 200-205°F the minimum for competition-quality pulled
  pork; lower temps give good flavour but tougher texture.

### 3. Steve Raichlen — Planet Barbecue Pork Shoulder (barbecuebible.com)
- **Source**: Planet Barbecue cookbook / barbecuebible.com
- **Method**: Mustard binder, dry rub, 225°F / 107°C oven or indirect grill 10-12 hours.
- **Target**: **195-200°F / 91-93°C**
- **Note**: Raichlen's standard matches Franklin's; he also notes the "bone wiggle test"
  — when the bone wiggles freely in the shoulder, it's done.

### 4. Leila Lindholm — Långlagad fläskkarré / pulled pork (leila.se)
- **Source**: leila.se/recept
- **Method**: Dry rub, 100-110°C oven 10-12 hours, foil at stall.
- **Target**: **90-95°C** at thickest point (Swedish pulled pork standard)
- **Note**: Swedish low-temperature oven standards run cooler than American; 90°C
  produces pull-apart texture equivalent to 200°F in conventional ovens.

### 5. Fergus Henderson — Slow-Roasted Shoulder of Pork (St. JOHN)
- **Source**: Nose to Tail Eating (Bloomsbury)
- **Method**: Dry-brine overnight, roast 160°C / 320°F for 6-8 hours. Rest 30 min.
  Serve pulled or sliced.
- **Target**: **90-95°C / 195-203°F** for pull-apart texture
- **Note**: Henderson uses slightly higher oven temperature for shorter time; result
  is slightly less rendered than 225°F all-day smoke, but still very tender.

## Temperature consensus

| Tradition | Target internal temp | Style |
|-----------|---------------------|-------|
| USA / Kenji / Franklin / Raichlen | 195-205°F / 91-96°C | Pulled pork |
| Sweden / Leila | 90-95°C | Pulled or thinly sliced |
| UK / Fergus Henderson | 90-95°C | Long braise/roast |

**Consensus: 91-96°C (195-205°F) for pulled.** Maps to `well_done` in pork doneness.
For sliced shoulder: 71-74°C (160-165°F).

## What makes this method special
Low-and-slow oven roasting is the only method that reliably converts pork shoulder
from tough and chewy to silky, pull-apart tender. The collagen-to-gelatin conversion
happens above 85°C but needs time — hours of sustained heat, not a quick high blast.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `slow_cooker`, `smoker`
- `recommended_doneness`: `"well_done"` (91-96°C for pulled / 71-74°C sliced)
