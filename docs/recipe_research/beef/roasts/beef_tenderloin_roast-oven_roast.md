# Beef Tenderloin Roast × Oven Roast — Recipe Temperature Research

## Cut profile
Whole beef tenderloin (filet de boeuf, chateaubriand) is the most expensive, most
tender beef roast — a tapered 1.5-2 kg / 3-4 lb muscle with virtually no fat or
connective tissue. It must be seared on all sides for crust, then roasted at
400-425°F / 200-220°C for 20-30 minutes to 130-135°F / 54-57°C (medium-rare).
Overcooking is the primary risk — there is no fat to protect the lean muscle from
drying at higher temperatures.

## Source recipes

### 1. J. Kenji López-Alt — Roasted Beef Tenderloin (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-roast-beef-tenderloin
- **Method**: Sear all sides in cast iron, roast 250°F for 45 min to 120°F, blast
  500°F 15 min. Rest 10 min.
- **Target**: **120-125°F / 49-52°C** pull; 130-135°F / 54-57°C final
- **Note**: Reverse-sear is ideal for tenderloin — the tapered shape means the
  narrow end overcooks before the thick end is done in traditional roasting.

### 2. Thomas Keller — Beef Tenderloin (The French Laundry / Bouchon)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Season, sear all sides, oven 425°F to 125°F / 52°C. Rest 10-15 min.
- **Target**: **125-130°F / 52-54°C** pull; 130-135°F / 54-57°C final

### 3. Gordon Ramsay — Beef Wellington (gordon ramsay restaurants)
- **Source**: gordonramsay.com
- **Method**: Sear all sides, mushroom duxelles + prosciutto wrap, 425°F / 220°C
  puff pastry 25-30 min to 125°F / 52°C.
- **Target**: **52-54°C** pull temp; 57°C after rest (medium-rare for Wellington)

### 4. Leila Lindholm — Rostbiff (hel) / Oxfilé (leila.se)
- **Source**: leila.se/recept
- **Method**: Sear, oven 125°C to 58°C. Rest 20 min.
- **Target**: **58-60°C** (Swedish "rosa" standard)

### 5. Heston Blumenthal — Perfect Beef Tenderloin (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: 55°C / 131°F oven for 2-3 hours. Blast finish 250°C for 15 min.
- **Target**: **54-57°C / 130-135°F** at thickest point

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller | 120-125°F / 49-52°C | Pull temp (reverse-sear) |
| Gordon Ramsay (Wellington) | 52-54°C pull | 57°C final |
| Sweden | 58-60°C | "Rosa" |
| Heston | 54-57°C | Low-oven |

**Consensus: 54-57°C / 130-135°F medium-rare.** Maps to `medium_rare` in beef doneness.

## What makes this method special
Whole roasted beef tenderloin is the definitive dinner-party beef dish — spectacular
presentation, minimal prep, and the most tender beef possible. The reverse-sear method
eliminates the grey band and produces uniform pink throughout the tapered muscle.
Beef Wellington transforms this further with the pastry crust as the ultimate showpiece.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`
- `recommended_doneness`: `"medium_rare"` (54-57°C consensus)
