# Halibut Fillet × Pan Sear — Recipe Temperature Research

## Cut profile
Halibut is a large, very firm flatfish with pure white, dense flesh and mild flavour.
Its firmness makes it one of the best white fish for pan searing — it holds together
perfectly, develops a golden crust, and can be flipped without breaking. Target:
130-140°F / 54-60°C for a just-cooked translucent interior (medium), or 145°F /
63°C for USDA fully cooked. A 1-inch fillet needs 4-5 minutes per side in a medium-hot
pan with butter and oil.

## Source recipes

### 1. J. Kenji López-Alt — Pan-Seared Halibut (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Dry completely, clarified butter, medium-high heat, 4-5 min per side.
- **Target**: **130-140°F / 54-60°C** — "just set, barely opaque"
- **Note**: Halibut becomes dry quickly above 145°F due to its low fat content.

### 2. Thomas Keller — Pan-Roasted Halibut (The French Laundry)
- **Source**: The French Laundry Cookbook (Artisan)
- **Method**: Season, clarified butter, sear 4 min, oven-finish at 375°F 3-4 min.
- **Target**: **130-135°F / 54-57°C** at thickest point

### 3. Gordon Ramsay — Pan-Seared Halibut (Kitchen Secrets / MasterClass)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Medium-high heat, butter, 4-5 min per side. Baste with thyme butter.
- **Target**: **130-140°F / 54-60°C** — "white and firm but not dry"

### 4. Leila Lindholm — Stekt hälleflundra (leila.se)
- **Source**: leila.se/recept
- **Method**: Butter + oil, medium heat, 4-5 min per side.
- **Target**: **52-57°C** (Swedish white fish culinary standard — "just set")

### 5. Eric Ripert — Pan-Roasted Halibut (Le Bernardin Cookbook)
- **Source**: Le Bernardin Cookbook (Clarkson Potter)
- **Method**: Canola oil very hot, 4 min per side, baste with herb butter.
- **Target**: **130-135°F / 54-57°C** — "barely set at the centre"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller / Ripert | 130-140°F / 54-60°C | Barely set |
| UK / Ramsay | 130-140°F / 54-60°C | "White but not dry" |
| Sweden | 52-57°C | "Just set" culinary |
| USDA minimum | 145°F / 63°C | Fully safe |

**Consensus: 54-60°C / 130-140°F (medium).** Maps to `well_done` per USDA.
Culinary standard is slightly lower: `medium` at 54-60°C.

## What makes this method special
Halibut's firm, dense flesh makes it the ideal pan-seared white fish — it doesn't
fall apart during searing. A properly seared halibut fillet has a golden, almost
meaty crust contrasting with pure white interior. The butter-basting technique
adds dairy richness to an inherently mild fish.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `oven_bake`, `grill`
- `recommended_doneness`: `"well_done"` (USDA 63°C standard; 54-60°C culinary)
