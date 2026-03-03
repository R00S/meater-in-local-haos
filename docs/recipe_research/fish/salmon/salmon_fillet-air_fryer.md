# Salmon Fillet × Air Fryer — Recipe Temperature Research

## Cut profile
Air frying salmon at 375-400°F / 190-200°C for 8-10 minutes produces a crispy,
slightly caramelised exterior with a moist interior — faster than oven baking and
easier than pan searing (no splatter, no sticking). The convection air mimics
oven conditions but with more intensity; pull salmon at 125°F / 52°C for medium
or 145°F / 63°C for USDA fully cooked. Skin-on fillets work slightly better
than skinless in the air fryer.

## Source recipes

### 1. Serious Eats — Air Fryer Salmon
- **Source**: seriouseats.com
- **Method**: Pat dry, season, skin-side down in preheated 400°F air fryer, 8-10 min.
- **Target**: **125-130°F / 52-54°C** at thickest point
- **Note**: Serious Eats targets culinary medium, not USDA well-done, for best texture.

### 2. America's Test Kitchen — Air Fryer Salmon Fillets
- **Source**: americastestkitchen.com
- **Method**: Dry, oil lightly, 400°F / 200°C air fryer 10 min.
- **Target**: **125°F / 52°C** — "just cooked through, still moist"
- **Note**: ATK testing confirmed 400°F 10 min gives the best balance of speed
  and texture for standard 6-oz salmon fillets.

### 3. Ninja / Cosori appliance guides
- **Source**: ninjakitchen.com / cosori.com
- **Method**: 390°F / 200°C, 8-10 min.
- **Target**: **145°F / 63°C** (appliance manufacturers align with USDA)
- **Note**: Home appliance makers specify USDA safe minimum; experienced cooks
  use the same settings but pull at 125°F for culinary quality.

### 4. ICA Sweden — Luftfritöslax (ica.se)
- **Source**: ica.se/recept
- **Method**: Season with lemon + dill, 200°C air fryer 8-10 min.
- **Target**: **52-55°C** at thickest point (Swedish salmon standard)
- **Note**: Swedish recipe databases use 52-55°C as the standard salmon target
  across all cooking methods.

### 5. Gordon Ramsay (technique adapted to air fryer) — Crispy Air Fryer Salmon
- **Source**: gordonramsay.com technique adapted
- **Method**: Season well including skin, 200°C preheated air fryer, skin-side up,
  8 min.
- **Target**: **52-55°C** visual medium — "colour up the side"
- **Note**: The visual cue of colour rising 60-70% up the side of the fillet
  corresponds to 52-55°C internal temperature.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Serious Eats / ATK | 125-130°F / 52-54°C | Culinary medium |
| Sweden | 52-55°C | Nordic standard |
| USDA / appliance guides | 145°F / 63°C | Safe for all |

**Consensus: 52-55°C / 125-131°F for quality; 63°C for USDA safety.**
Maps to `medium` in fish doneness.

## What makes this method special
Air frying is the easiest and least messy way to cook salmon at home — no oil
splatter, no sticking, no flipping required. The convection air produces a slightly
caramelised exterior that improves on plain oven baking, and the speed (8-10 min
vs 25-30 min in oven) makes it the go-to weeknight salmon method.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (52-55°C global consensus)
