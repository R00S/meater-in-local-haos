# Pork Loin Steak × Pan Fry — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Pork loin steak (also called pork chop without bone, schnitzel cut, or escalope) is
cut from the loin — the same muscle as pork chop but boneless and often 1-2 cm thin.
Pan frying at medium-high heat produces a golden crust in 3-4 minutes per side.
Because it is thinner than a pork chop, it cooks faster and the risk of drying out
is higher — USDA 145°F / 63°C with a 3-minute rest is both safe and juicy.

## Source recipes

### 1. Gordon Ramsay — Pan-Fried Pork Loin Steak
- **Source**: gordonramsay.com / Kitchen
- **Method**: Season, clarified butter + oil, medium-high heat, 3-4 min per side.
  Baste with thyme + garlic butter.
- **Target**: **145°F / 63°C** at thickest

### 2. Leila Lindholm — Stekt fläskfilé / fläskkotlett (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör + olja, medelhög värme, 3-4 min per sida.
- **Target**: **63-68°C** (Swedish pork standard)

### 3. J. Kenji López-Alt — Pan-Seared Pork Chop method (boneless) (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Pat dry, season, medium-high cast iron, 3-4 min per side.
- **Target**: **140-145°F / 60-63°C** — "slightly pink is fine, USDA allows 145°F"

### 4. America's Test Kitchen — Pan-Fried Pork Loin Steak
- **Source**: americastestkitchen.com
- **Method**: Salt 45 min in advance, medium-high skillet, 3-4 min per side.
- **Target**: **145°F / 63°C** — ATK always uses USDA minimum

### 5. Nigel Slater — Pan-Fried Pork Loin (Tender)
- **Source**: Tender (Fourth Estate)
- **Method**: Butter, medium heat, 3-4 min per side.
- **Target**: **63-70°C** — "white throughout, no pink"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / ATK | 145°F / 63°C | New USDA standard (2011) |
| Kenji | 140-145°F / 60-63°C | Slight pink accepted |
| Sweden / Leila | 63-68°C | Standard |
| UK / Nigel / Ramsay | 63-70°C | "White throughout" |

**Consensus: 145°F / 63°C (USDA). Swedish / UK: 63-68°C.**
Maps to `well_done` in pork doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `grill`, `air_fryer`
- `recommended_doneness`: `"well_done"` (145°F/63°C standard)
