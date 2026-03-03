# Chicken Leg (Whole) × Oven Roast — Recipe Temperature Research

## Cut profile
Whole chicken leg (drumstick + thigh, attached) is the most forgiving chicken cut
for oven roasting — more fat and collagen than breast, and the skin crisps beautifully
at high heat. Target: 165°F / 74°C at the thickest part near the bone (USDA), which
produces juicy dark meat. Roasting at 400-425°F / 200-220°C for 35-45 minutes (bone-in)
produces crispy skin. Thighs and drumsticks can be taken to 175°F / 79°C for even
better texture.

## Source recipes

### 1. J. Kenji López-Alt — Crispy Oven-Roasted Chicken Legs (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Pat dry, season generously, rack on baking sheet, 425°F for 35-40 min.
- **Target**: **165-170°F / 74-77°C** at thickest near bone

### 2. Thomas Keller — Roasted Chicken Leg (Ad Hoc at Home)
- **Source**: Ad Hoc at Home (Workman)
- **Method**: Season overnight, roast 425°F for 35-40 min.
- **Target**: **165°F / 74°C** at bone

### 3. Gordon Ramsay — Roasted Chicken Legs (Kitchen)
- **Source**: gordonramsay.com
- **Method**: Season, olive oil, 200°C for 40-45 min.
- **Target**: **74°C** at bone

### 4. Leila Lindholm — Ugnsrostad kycklinglår (leila.se)
- **Source**: leila.se/recept
- **Method**: Krydda, ugn 200°C i 40-45 min.
- **Target**: **74-77°C** near bone

### 5. Yotam Ottolenghi — Za'atar Roasted Chicken Legs (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Za'atar + lemon marinade, 200°C for 40-45 min.
- **Target**: **165°F / 74°C** — "juices run clear"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA | 165°F / 74°C | Poultry minimum |
| Kenji | 165-170°F / 74-77°C | Near bone, dark meat |
| Sweden | 74-77°C | |
| UK / Ramsay | 74°C | |

**Consensus: 165-175°F / 74-79°C.** Maps to `well_done` in poultry doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `grill`, `air_fryer`
- `recommended_doneness`: `"well_done"` (165°F+/74°C+ USDA poultry)
