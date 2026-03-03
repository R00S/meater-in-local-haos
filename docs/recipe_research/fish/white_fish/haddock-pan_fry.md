# Haddock Fillet × Pan Fry — Recipe Temperature Research

## Cut profile
Haddock is the most popular white fish in the British Isles — the classic fish-and-chips
fish. Skinless or skin-on fillets pan-fry in butter/oil at medium-high heat (375°F /
190°C) for 3-4 minutes per side. Haddock's delicate, slightly sweet flesh is more
prone to falling apart than cod; gentle handling is needed. Target: 145°F / 63°C
(USDA), which is also the culinary target for this lean, mild fish.

## Source recipes

### 1. Gordon Ramsay — Pan-Fried Haddock (Kitchen Secrets)
- **Source**: gordonramsay.com / BBC Kitchen Secrets
- **Method**: Season, clarified butter, medium-high heat, skin-on 4-5 min skin-side,
  flip gently 2 min. Rest 2 min.
- **Target**: **140-145°F / 60-63°C** at thickest

### 2. Nigel Slater — Pan-Fried Haddock (The Kitchen Diaries)
- **Source**: The Kitchen Diaries (Fourth Estate)
- **Method**: Butter + oil, medium heat, 3-4 min per side. Rest briefly.
- **Target**: **60-65°C** at thickest — "white, opaque, flakes at touch"

### 3. Leila Lindholm — Stekt kolja (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör + olja, medium heat, 3-4 min per side.
- **Target**: **55-60°C** (Swedish culinary white fish target)

### 4. Hank Shaw — Pan-Fried Haddock (honest-food.net)
- **Source**: honest-food.net
- **Method**: Light flour dredge, clarified butter, medium heat 3-4 min per side.
- **Target**: **145°F / 63°C** — "flakes, white, no translucency"

### 5. Jamie Oliver — Pan-Fried Haddock (Jamie's Comfort Food)
- **Source**: jamieoliver.com
- **Method**: Lemon butter, medium heat, 3-4 min per side.
- **Target**: **63-70°C** — UK "fully done white fish" standard

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Hank Shaw | 145°F / 63°C | USDA fish standard |
| UK / Ramsay / Nigel / Jamie | 60-70°C | British fully-done standard |
| Sweden | 55-60°C | Culinary "barely set" |

**Consensus: 63°C / 145°F for fully cooked haddock.**
Maps to `well_done` in fish doneness.

## What makes this method special
Pan-fried haddock in butter is British comfort food at its finest — the buttery,
browned crust over sweet, flaky white flesh has been a staple of British cooking
for centuries. The flour-dredge variant creates a light, golden crust that falls
between battered fish and plain pan-fried.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `oven_bake`, `air_fryer`
- `recommended_doneness`: `"well_done"` (63°C/145°F standard)
