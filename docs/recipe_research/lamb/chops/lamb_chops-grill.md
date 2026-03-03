# Lamb Chops × Grill — Recipe Temperature Research

## Cut profile
Grilled lamb chops over high heat (400-500°F / 200-260°C) is the definitive lamb
preparation across North Africa, the Middle East, and the Mediterranean — from
Moroccan mechoui to Greek grilled paidakia. Marinating in olive oil, garlic, and
herbs for 1-2 hours before grilling is nearly universal. The grill adds a smoky
char impossible to replicate indoors, while the fat renders and drips, creating
flare-up aromas that flavour the exterior.

## Source recipes

### 1. J. Kenji López-Alt — Grilled Lamb Chops (Serious Eats)
- **Source**: seriouseats.com/grilled-lamb-chops
- **Method**: Marinate 1 hour, grill 450°F direct heat, 3-4 min per side.
  Fat-cap sear first on edges.
- **Target**: **130-135°F / 54-57°C** pull; 135-140°F/57-60°C after rest

### 2. Yotam Ottolenghi — Spiced Grilled Lamb Chops (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Middle Eastern spice + yogurt marinade, hot grill 3-4 min per side.
- **Target**: **57-60°C / 135-140°F** — pink interior, char marks on fat

### 3. Francis Mallmann — Grilled Lamb Chops over Open Fire (Seven Fires)
- **Source**: Seven Fires (Artisan Books)
- **Method**: Hardwood fire, direct intense heat, salt only, 3-4 min per side.
- **Target**: **57-63°C / 135-145°F** — Argentine-Mediterranean tradition

### 4. Gordon Ramsay — Grilled Lamb Cutlets with Mint Salsa
- **Source**: gordonramsay.com
- **Method**: Marinate in garlic + herbs, very hot grill, 2-3 min per side.
- **Target**: **57-60°C / 135-140°F** (medium-rare, must be pink)

### 5. Leila Lindholm — Grillade lammkotletter (leila.se)
- **Source**: leila.se/recept
- **Method**: Olive oil + rosemary marinade, hot grill, 3 min per side.
- **Target**: **58-62°C** at loin eye

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji | 130-135°F / 54-57°C | Pull temp |
| Middle East / Ottolenghi | 57-60°C | Spiced grilled |
| Argentina / Mallmann | 57-63°C | Open fire |
| Gordon Ramsay | 57-60°C | Restaurant standard |
| Sweden | 58-62°C | Nordic grilling |

**Consensus: 55-60°C / 131-140°F.** Maps to `medium_rare` in lamb doneness.

## What makes this method special
Grilled lamb chops with char marks and dripping-fat smoke flavour represent the
cooking tradition shared across three continents. The grill's open flame interacts
with the lamb fat to produce a distinctively smoky, caramelised exterior that pan
searing cannot replicate. The most ancient and universal lamb preparation method.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium_rare"` (55-60°C consensus)
