# Cod Fillet × Pan Fry — Recipe Temperature Research

## Cut profile
Cod is a mild white fish with thick, flaky flesh and moderate moisture content.
Pan frying (3-4 min per side in a medium-hot pan with butter and oil) produces
a golden, crispy exterior with moist flaky interior at 145°F / 63°C / 63°C.
Unlike salmon, cod is universally cooked fully through — the USDA 145°F / 63°C
target IS the preferred culinary target for white fish. Skin-on fillets hold
together better; skinless fillets need gentle handling.

## Source recipes

### 1. J. Kenji López-Alt — Pan-Fried Cod (Serious Eats)
- **Source**: seriouseats.com/pan-fried-fish-recipe
- **Method**: Pat dry completely (critical for browning), season, medium-high heat
  in equal parts butter + oil. 3-4 min per side for 3/4-inch fillet.
- **Target**: **140-145°F / 60-63°C** at thickest point (flakes easily)
- **Note**: Kenji emphasises that dry surface = golden crust; moisture = steaming
  and sticking. Paper towels 5 min before cooking.

### 2. Gordon Ramsay — Pan-Fried Cod with Crushed Peas (MasterClass)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Seasoned skin-on cod, butter + rapeseed oil, skin-side down medium-high,
  3-4 min until golden and releases naturally. Flip, 1-2 min.
- **Target**: **145°F / 63°C** — "flesh should flake at a touch of the fork"
- **Note**: Ramsay uses skin-on cod; the skin creates a natural barrier preventing
  the delicate flesh from making direct contact with the pan too early.

### 3. Leila Lindholm — Stekt torsk (leila.se / ICA)
- **Source**: leila.se/recept
- **Method**: Butter + oil medium heat. Skin-on 4-5 min skin-side, flip 2 min.
- **Target**: **52°C** at thickest point (Swedish white fish standard —
  cod served more lightly done than USDA in Scandinavian tradition)
- **Note**: Scandinavian tradition for white fish targets 52°C — the flesh is
  "barely set" and very moist, a different texture ideal from fully-flaked Anglo-American style.

### 4. Raymond Blanc — Cabillaud poêlé (Raymond Blanc's Kitchen Secrets)
- **Source**: bbc.co.uk/food/raymond_blanc
- **Method**: Clarified butter, medium-high, skin-side down pressing gently, 3-4 min.
  Flip to flesh side briefly, finish with herbs.
- **Target**: **56-58°C** at centre (French white fish standard — medium)
- **Note**: French culinary tradition targets a slightly lower temperature for cod
  than USDA, relying on the fish's visual translucency change as the doneness cue.

### 5. Nigel Slater — Pan-Fried Cod with Herb Butter (Kitchen Diaries)
- **Source**: The Kitchen Diaries (Fourth Estate)
- **Method**: Lemon butter baste, medium heat, 3-4 min per side. Serve immediately.
- **Target**: **60-65°C** — "milky white curds, no translucency remains, flakes
  at the gentlest pressure"
- **Note**: Slater's British standard aligns more closely with USDA than French
  tradition — well-done by French standards but ideal by British preference.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Kenji / Ramsay | 140-145°F / 60-63°C | Fully cooked, flaky |
| France / Blanc | 56-58°C | Medium, slight translucency |
| Scandinavia / Leila | 52°C | "Barely set" Scandinavian style |
| UK / Slater | 60-65°C | Fully opaque and flaky |

**Consensus: 60-63°C / 140-145°F for standard cod preparation.**
Scandinavian "barely set" at 52°C is a legitimate style variant.
Maps to `well_done` in fish doneness for standard preparation.

## What makes this method special
Pan frying cod with butter produces the Maillard browning and butter-basting
that transforms a mild fish into a flavour-rich dish. The butter browns into
noisette (hazelnut) aroma that perfectly complements the mild, sweet flesh.
No other method gives this level of butter-integration and golden crust
to white fish in such a short time.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `oven_bake`, `air_fryer`, `steam`, `poach`
- `recommended_doneness`: `"well_done"` (60-63°C USDA standard for white fish)
