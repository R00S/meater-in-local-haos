# Bison Roast × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Bison roast (round, sirloin tip, or chuck) benefits from low-and-slow oven roasting
at 250-275°F / 120-135°C due to the extreme leanness of bison. A 1.5-2.5 kg /
3-5 lb bison sirloin tip roast at 250°F takes 2-3 hours to reach 135-140°F /
57-60°C internal (medium-rare to medium). Chuck roast for braising targets
185-195°F / 85-91°C. The absence of intramuscular fat makes bison more prone to
drying than beef at equivalent temperatures — pull earlier, rest longer.

## Source recipes

### 1. Hank Shaw — Bison Roast (honest-food.net)
- **Source**: honest-food.net/bison-roast
- **Method**: Reverse-sear: 250°F / 120°C oven to 130°F / 54°C, then blast sear.
- **Target**: **130-135°F / 54-57°C** at thickest point (medium-rare)

### 2. Ted Turner Montana Grill — Roast Preparation
- **Source**: ted-turners-montana-grill.com
- **Method**: Slow roast to 135°F / 57°C for medium-rare serving.

### 3. National Bison Association — Home Cooking Guide
- **Source**: bisoncentral.com
- **Method**: 325°F / 163°C oven, 20 min per pound, rest 15 min.
- **Target**: **135-145°F / 57-63°C** at thickest point

### 4. Steve Raichlen — Bison Roast (Planet Barbecue adapted)
- **Source**: Planet Barbecue / barbecuebible.com
- **Method**: Herb-rubbed, 275°F oven 2.5 hours to 130-135°F.
- **Target**: **130-135°F / 54-57°C** pull

### 5. Leila Lindholm (adapted from viltmat / Swedish game tradition)
- **Method**: 160°C oven, 25 min per 500 g, rest 15 min.
- **Target**: **54-58°C** (Nordic game roast standard)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw / NBA | 130-145°F / 54-63°C | Medium-rare to medium |
| Ted Turner standard | 135°F / 57°C | Restaurant medium-rare |
| Nordic adapted | 54-58°C | Game tradition |

**Consensus: 130-140°F / 54-60°C for sliced bison roast.**
Maps to `medium_rare` in game doneness.

## What makes this method special
Oven-roasted bison is extraordinarily lean — the low-and-slow method at 250°F
is almost mandatory to prevent the outside drying before the centre is done.
A properly roasted bison round has a clean, slightly sweet flavour and firm but
tender texture that beef sirloin can't match.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `smoker`
- `recommended_doneness`: `"medium_rare"` (54-57°C consensus)
