# Salmon Fillet × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Grilling salmon presents a challenge: fish sticks to grill grates and breaks apart.
Solutions: use a preheated, well-oiled grill at 400-450°F / 200-230°C; leave the
fillet undisturbed for 4-5 minutes before attempting to flip; or use a fish basket
or plank. Cedar-plank grilling (indirect heat) is especially popular in North America,
producing a smoky, aromatic result without the sticking risk. Internal target:
130-140°F / 54-60°C for the grill (slightly higher than pan sear due to smoke
flavour masking the texture difference).

## Source recipes

### 1. J. Kenji López-Alt — Grilled Salmon (Serious Eats)
- **Source**: seriouseats.com/grilled-salmon
- **Method**: Preheat grill to very hot, clean + oil grates thoroughly, skin-side
  down. Leave 4-5 min without touching. Flip carefully, 1-2 min flesh-side.
- **Target**: **125-130°F / 52-54°C** at thickest point
- **Note**: Kenji's key insight: salmon unsticks naturally once the exterior proteins
  set — forcing an early flip causes it to tear.

### 2. Weber Grills — Cedar Plank Salmon
- **Source**: weber.com/grilling-inspiration
- **Method**: Soak plank, preheat grill medium-high, plank on indirect zone, salmon
  skin-side down on plank, lid closed 15-20 min.
- **Target**: **145°F / 63°C** (Weber aligns with USDA for plank method)
- **Note**: Cedar plank insulates the bottom heat; the salmon cooks gently from above
  in the enclosed smoky environment.

### 3. Steve Raichlen — Grilled Salmon (How to Grill)
- **Source**: How to Grill (Workman) / barbecuebible.com
- **Method**: Oil-brushed skin, 3-zone fire, direct medium-high 4-5 min skin-side,
  flip gently, 2 min flesh-side.
- **Target**: **135-140°F / 57-60°C** — slightly higher to account for grill
  temperature variability
- **Note**: Raichlen targets slightly higher than ATK to give margin for the less
  precise temperature control of charcoal grills.

### 4. Magnus Nilsson — Grillad lax (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Hot grill, skin-side down, 5-6 min barely touching, no flip.
  (Serve skin-side down, flesh-up)
- **Target**: **52-55°C** at centre (Norwegian/Swedish salmon standard)
- **Note**: Nordic tradition often serves grilled salmon without flipping —
  skin on grill to the end, flesh barely opaque on top, very moist.

### 5. Gordon Ramsay — Grilled Salmon (Ramsay's Home Cooking)
- **Source**: gordonramsay.com
- **Method**: Season generously, very hot oiled grill, skin-side first 4-5 min.
  Flip only once; total 6-7 min.
- **Target**: Visual cue: "opaque with slight translucency at thickest point"
  (~52-55°C / 126-131°F)
- **Note**: Ramsay's visual standard for properly cooked grilled salmon.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Raichlen | 125-140°F / 52-60°C | Range from medium to medium-well |
| Nordic / Nilsson | 52-55°C | Moist, nearly raw centre |
| Gordon Ramsay | 52-55°C | Visual medium standard |
| Weber / USDA | 145°F / 63°C | Safe for all populations |

**Consensus: 52-57°C / 126-135°F (culinary medium).** Maps to `medium` in fish doneness.

## What makes this method special
Grilling adds a charred, smoky exterior to salmon that oven baking cannot replicate.
Cedar-plank grilling adds an additional aromatic dimension (woody, slightly sweet)
from the cedar's resins. Direct-grilled salmon with crisp char marks is the
quintessential summer seafood preparation.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (52-57°C global culinary consensus)
