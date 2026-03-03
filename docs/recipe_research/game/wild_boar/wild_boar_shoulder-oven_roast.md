# Wild Boar Shoulder × Oven Roast — Recipe Temperature Research

## Cut profile
Wild boar shoulder, like domestic pork shoulder, is collagen-rich and ideal for
slow roasting to the pull-apart temperature of 88-95°C / 190-203°F. Unlike domestic
pork shoulder, wild boar shoulder carries more game flavour and slightly less fat,
making a marinade or barding highly recommended. Low-and-slow at 140-160°C /
285-320°F for 4-6 hours produces pulled wild boar with a complex, gamier flavour
than domestic pulled pork.

## Source recipes

### 1. Hank Shaw — Pulled Wild Boar (honest-food.net)
- **Source**: honest-food.net/wild-boar-shoulder
- **Method**: Dry rub, 275°F / 135°C oven 5-6 hours.
- **Target**: **195-200°F / 91-93°C** — pulls apart easily

### 2. Fergus Henderson — Braised Wild Boar Shoulder (Beyond Nose to Tail)
- **Source**: Beyond Nose to Tail (Bloomsbury)
- **Method**: Browned, wine + vegetables, 150°C oven 4-5 hours.
- **Target**: **88-92°C / 190-198°F**

### 3. Magnus Nilsson — Vildsvin skuldra (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Apple cider + juniper braise, 140°C 6-8 hours.
- **Target**: **90-95°C**

### 4. Gordon Ramsay — Wild Boar Shoulder Braise (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Red wine + aromatic vegetables, 160°C 4-5 hours covered.
- **Target**: **88-92°C**

### 5. Steve Raichlen — Smoked Wild Boar Shoulder (Planet Barbecue)
- **Source**: Planet Barbecue (Workman) / barbecuebible.com
- **Method**: 225°F smoker 8-10 hours (or 275°F oven as substitute).
- **Target**: **195-200°F / 91-93°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw / Raichlen | 195-200°F / 91-93°C | Pulled |
| UK / Fergus Henderson | 88-92°C | Braise |
| Nordic / Nilsson | 90-95°C | Long braise |
| Gordon Ramsay | 88-92°C | Wine braise |

**Consensus: 88-95°C / 190-203°F for pull-apart wild boar shoulder.**
Maps to `well_done` in game doneness.

## What makes this method special
Pulled wild boar shoulder combines the technique of American pulled pork with the
flavour complexity of game meat — the result has all the textural luxury of pulled
pork but with a deeper, more complex, slightly gamey flavour profile. One of the
great crossover dishes between BBQ culture and European game cooking traditions.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `braise`, `slow_cooker`, `smoker`
- `recommended_doneness`: `"well_done"` (88-95°C pulled standard)
