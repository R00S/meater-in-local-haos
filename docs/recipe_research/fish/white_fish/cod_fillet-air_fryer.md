# Cod Fillet × Air Fryer — Recipe Temperature Research

## Cut profile
Air frying cod at 380-400°F / 193-200°C for 10-12 minutes produces a crispy, golden
exterior with moist, flaky interior — resembling light pan-frying without the oil.
The dry, circulating air removes surface moisture rapidly, creating the crust that
plain oven baking struggles to achieve. Cod fillets 3/4-1 inch thick work best;
thinner fillets may dry out. A light oil spray and seasoning before cooking
help develop colour.

## Source recipes

### 1. Serious Eats — Air Fryer Cod
- **Source**: seriouseats.com
- **Method**: Pat dry, season, light oil spray, 400°F air fryer 10-12 min until
  golden and flaking.
- **Target**: **145°F / 63°C** at thickest point
- **Note**: Air fryer dries cod faster than oven — check at 8 min for thin fillets.

### 2. America's Test Kitchen — Air Fryer White Fish
- **Source**: americastestkitchen.com
- **Method**: Panko crust + egg wash, 400°F air fryer 10 min.
- **Target**: **145°F / 63°C** internal
- **Note**: Breaded cod in air fryer replicates fish-and-chips style without deep frying.

### 3. Ninja Kitchen — Air Fryer Cod Recipe
- **Source**: ninjakitchen.com
- **Method**: Season, 375°F for 12-14 min.
- **Target**: **145°F / 63°C** (appliance USDA alignment)

### 4. ICA/Coop Sweden — Luftfritöstorsk (ica.se)
- **Source**: ica.se/recept
- **Method**: 190°C air fryer, 10-12 min.
- **Target**: **55-60°C** at thickest point (Swedish white fish guidance)

### 5. Nigella Lawson — Air Fryer Crispy Fish (nigella.com)
- **Source**: nigella.com
- **Method**: Flour-seasoned cod, air fryer 200°C 12-15 min.
- **Target**: **65-70°C** — "completely opaque, flakes freely"
- **Note**: Flour coating and UK "fully done" standard targets 65-70°C.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA | 145°F / 63°C | Standard safe minimum |
| Sweden | 55-60°C | Culinary white fish standard |
| UK | 65-70°C | "Fully done" British standard |

**Consensus: 63°C / 145°F standard.** Maps to `well_done` in fish doneness.

## What makes this method special
Air frying cod delivers a crispy, breadcrumb-style exterior without deep frying.
For families seeking a healthier fish-and-chips substitute, air-fried cod in panko
breadcrumbs is the closest indoor alternative to traditional deep-fried battered fish.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (63°C white fish standard)
