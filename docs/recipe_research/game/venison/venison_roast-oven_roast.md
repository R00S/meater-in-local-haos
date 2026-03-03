# Venison Roast × Oven Roast — Recipe Temperature Research

## Cut profile
Venison roast (haunches, shoulder, or saddle) weighing 1-3 kg / 2-6 lb requires
a two-phase approach: high-heat sear for crust (230°C / 445°F, 15 min) then
low oven (140-160°C / 285-320°F) to the target internal. The lean meat dries
more readily than beef roast at equivalent temperatures; a marinade or barding
with bacon/salt pork compensates. Target: 57-63°C / 135-145°F for medium-rare
to medium (culinary standard), or 74°C / 165°F for the USDA game standard.

## Source recipes

### 1. Hank Shaw — Roast Venison Haunch (honest-food.net)
- **Source**: honest-food.net/venison-roast
- **Method**: Bard with bacon, brown on stovetop, oven 325°F / 163°C to 130°F /
  54°C internal. Rest 20 min tented.
- **Target**: **130-135°F / 54-57°C** — medium-rare haunch
- **Note**: Barding (wrapping with bacon fat) is essential for haunch roast —
  the lean muscle would dry without a fat source.

### 2. Gordon Ramsay — Roast Haunch of Venison (Kitchen Secrets)
- **Source**: gordonramsay.com / Kitchen Secrets
- **Method**: Marinate 24 hours, sear, roast 160°C / 320°F for 20 min per 500 g.
- **Target**: **55-60°C / 131-140°F** at centre

### 3. Fergus Henderson — Roast Haunch of Venison (Beyond Nose to Tail)
- **Source**: Beyond Nose to Tail (Bloomsbury)
- **Method**: Season, lard with fat, oven 200°C / 390°F for first 15 min, then
  160°C for 20 min per 500 g.
- **Target**: **57-60°C / 135-140°F**

### 4. Magnus Nilsson — Ugnsrostad hjort (Fäviken)
- **Source**: Fäviken cookbook (Phaidon)
- **Method**: Aged, dry, oven 140°C for 30-40 min per 500 g.
- **Target**: **55-58°C** at thickest point

### 5. Lars Almgren — Älgstek i ugn (Swedish game tradition)
- **Source**: Svenska viltmaträtter
- **Method**: Bacon-barded älg shoulder, oven 175°C for 25 min per 500 g.
- **Target**: **58-62°C** (Swedish game roast standard "rödrosa")

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw | 130-135°F / 54-57°C | Barded, medium-rare |
| Gordon Ramsay | 55-60°C | Standard medium-rare |
| Fergus Henderson | 57-60°C | Larded, pink |
| Nordic / Nilsson | 55-58°C | Fäviken-style |
| Sweden (game tradition) | 58-62°C | "Rödrosa" |

**Consensus: 55-60°C / 131-140°F medium-rare.**
Maps to `medium_rare` in game doneness.

## What makes this method special
Roasting a whole venison haunch is the great-occasion game dish: spectacular on
the table, requiring patience and skill, but producing sliced game meat of
extraordinary quality. Barding with bacon or larding with fat is the key
technique that separates good roast venison from dry, disappointing game.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `braise`
- `recommended_doneness`: `"medium_rare"` (55-60°C consensus)
