# Swordfish Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Swordfish is a dense, meaty fish often compared to tuna in texture. Unlike delicate
white fish, swordfish steaks (2-3 cm thick) are almost steak-like — they sear
beautifully in a very hot pan or grill. USDA requires 145°F / 63°C, and uniquely
among white fish, swordfish at 145°F is not considered overcooked by most authorities —
the firmer flesh holds moisture better than flaky fish. Target: 130-140°F / 54-60°C
for medium-rare (pink interior) or 145°F/63°C for opaque well-done.

## Source recipes

### 1. J. Kenji López-Alt — Swordfish Steak (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Cast iron, very hot, 3-4 min per side. Rest 3 min.
- **Target**: **130-140°F / 54-60°C** — medium (slight translucency at centre)

### 2. Gordon Ramsay — Pan-Seared Swordfish
- **Source**: gordonramsay.com / Kitchen
- **Method**: High heat, 3-4 min per side, rest 3 min.
- **Target**: **140-145°F / 60-63°C** — "firm but still moist"

### 3. Leila Lindholm — Stekt svärdfisk (leila.se)
- **Source**: leila.se/recept
- **Method**: Butter + oil, medium-high, 3-4 min per side.
- **Target**: **55-62°C** (Swedish white fish standard)

### 4. Steve Raichlen — Grilled/Seared Swordfish (Planet Barbecue)
- **Source**: Planet Barbecue (Workman)
- **Method**: Marinate in herb oil, maximum heat, 3-4 min per side.
- **Target**: **145°F / 63°C** — Raichlen recommends well-done for swordfish

### 5. Thomas Keller — Swordfish Preparation (French Laundry)
- **Source**: French Laundry techniques
- **Method**: Clarified butter, medium-high, 3-4 min per side.
- **Target**: **130-135°F / 54-57°C** at centre

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller | 130-140°F / 54-60°C | Medium |
| Gordon Ramsay / Raichlen | 140-145°F / 60-63°C | Well-done |
| Sweden | 55-62°C | Culinary range |

**Consensus: 130-145°F / 54-63°C.** Maps to `well_done` (USDA) or `medium` culinary.

## What makes this method special
Swordfish is the "steak" of the fish world — its dense, meaty texture holds up to
the same high-heat searing as beef. A properly seared swordfish steak has a golden
crust and just-set interior with almost no flaking — completely different from the
delicate texture of most white fish.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `charcoal_grill`
- `recommended_doneness`: `"well_done"` (USDA 145°F; culinary medium at 130-140°F)
