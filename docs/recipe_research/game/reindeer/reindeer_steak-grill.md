# Reindeer Steak × Grill — Recipe Temperature Research

## Cut profile
Reindeer (renen) is the defining game meat of Sápmi and Arctic Scandinavia — it is
to Finland, Northern Sweden, and Norway what venison is to the British Isles. The
meat is very lean, tender, and has a distinctive mild sweetness combined with gentle
game flavour. Reindeer steaks grill identically to venison — 3-4 minutes per side
at medium-high heat to 54-57°C (medium-rare). The Finnish and Sámi tradition serves
reindeer at 55-60°C.

## Source recipes

### 1. Magnus Nilsson — Grillad renfilé (The Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Season with salt, very hot grill or cast iron, 2-3 min per side.
  Rest 5 min. Cloudberry sauce.
- **Target**: **54-57°C** — "rosa"

### 2. Finnish culinary tradition — Poronkäristys / Poro filé
- **Source**: Finnish culinary tradition / Visit Finland
- **Method**: Hot pan or grill, 2-3 min per side.
- **Target**: **55-60°C** — Finnish "medium" for reindeer

### 3. Leila Lindholm — Grillad renfilé (leila.se)
- **Source**: leila.se/recept
- **Method**: Krydda, het grill, 2-3 min per sida. Vila 3-5 min.
- **Target**: **54-57°C**

### 4. Hank Shaw — Reindeer / Caribou Steak (honest-food.net)
- **Source**: honest-food.net
- **Method**: Like venison: very hot, fast, 2-3 min per side.
- **Target**: **130-135°F / 54-57°C** — "medium-rare"

### 5. Arctic Garden (Arktisk Mat) — Grillat renkött
- **Source**: Arctic culinary tradition (Norwegian / Sámi)
- **Method**: Very hot, fast sear, 2-3 min per side.
- **Target**: **54-58°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Sweden / Nordic / Magnus | 54-57°C | "Rosa" |
| Finland | 55-60°C | Finnish standard |
| USA / Hank Shaw | 130-135°F / 54-57°C | |
| USDA (wild game) | 160°F / 71°C | |

**Culinary consensus: 54-58°C medium-rare.** Maps to `medium_rare` in game doneness.

## What makes this method special
Grilled reindeer is the centrepiece dish of Arctic Scandinavian cuisine — inseparable
from the culture and landscape of Sápmi. The clean, mild, slightly sweet game flavour
of reindeer needs nothing but salt, heat, and cloudberry or lingonberry to be perfect.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`
- `recommended_doneness`: `"medium_rare"` (54-57°C Nordic culinary consensus)
