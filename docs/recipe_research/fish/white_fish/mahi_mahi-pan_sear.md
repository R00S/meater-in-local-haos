# Mahi-Mahi × Pan Sear — Recipe Temperature Research

## Cut profile
Mahi-mahi (dolphinfish) is a tropical, mildly flavoured white fish with moderately
firm texture and low fat content. Popular in US, Caribbean, and Hawaiian cuisine.
Pan searing produces a golden crust in 3-4 minutes per side. Unlike salmon, mahi-mahi
should be cooked fully through to 145°F / 63°C — the lean white flesh dries rapidly
above 150°F, so accuracy matters. A 1-inch fillet at medium-high heat takes 3-4
minutes per side.

## Source recipes

### 1. J. Kenji López-Alt — Pan-Seared Mahi-Mahi (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Dry, season, medium-high heat with neutral oil, 3-4 min per side.
- **Target**: **140-145°F / 60-63°C**

### 2. Bobby Flay — Mahi-Mahi with Tropical Fruit Salsa (Food Network)
- **Source**: foodnetwork.com/bobby-flay
- **Method**: Season, hot cast iron, 3-4 min per side.
- **Target**: **145°F / 63°C** at centre

### 3. Leila Lindholm (adapted) — Stekt mahi-mahi
- **Source**: Swedish adaptation
- **Method**: Butter + oil, medium-high heat, 3-4 min per side.
- **Target**: **60-63°C**

### 4. Hawaiian tradition — Grilled/Seared Mahi
- **Source**: Hawaiian culinary tradition / aloha-seafood.com
- **Method**: Garlic + butter sear, 3 min per side.
- **Target**: **145°F / 63°C** — "opaque throughout"

### 5. Gordon Ramsay — Pan-Seared Mahi-Mahi
- **Source**: gordonramsay.com
- **Method**: Very hot pan, olive oil, 3-4 min per side.
- **Target**: **140-145°F / 60-63°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Bobby Flay | 145°F / 63°C | White fish standard |
| Hawaii | 145°F / 63°C | "Opaque throughout" |
| Sweden / UK | 60-63°C | Aligns with USDA |

**Consensus: 145°F / 63°C.** Maps to `well_done` in fish doneness.

## What makes this method special
Pan searing mahi-mahi delivers the only caramelised crust a lean tropical fish can
achieve — the moderate firmness holds up to direct heat while the mild flavour accepts
bold accompaniments (mango salsa, garlic butter, tahini) that would overwhelm more
delicate fish.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `air_fryer`
- `recommended_doneness`: `"well_done"` (145°F/63°C white fish standard)
