# Rack of Lamb × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Rack of lamb (côte d'agneau rôtie) is the pinnacle of lamb cookery — 8 rib bones
frenched and exposed, the entire loin eye in one piece. Target: 130-135°F / 54-57°C
(medium-rare), which produces a deep pink interior with a golden, herb-crusted
exterior. Method: sear all sides in a very hot pan (2-3 min per side), then oven
at 400-425°F / 200-220°C for 12-18 minutes to target temperature. Rest 5-8 minutes.

## Source recipes

### 1. Thomas Keller — Rack of Lamb with Sauce Paloise (Bouchon / French Laundry)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Sear all sides, Dijon + breadcrumb crust, 425°F / 220°C oven
  12-15 min to 130°F / 54°C. Rest 8 min.
- **Target**: **130-135°F / 54-57°C** medium-rare

### 2. Gordon Ramsay — Herb-Crusted Rack of Lamb (Kitchen)
- **Source**: gordonramsay.com / Kitchen cookbook
- **Method**: Season, sear 2-3 min per side, Dijon + herb crust, 200°C oven 12-15 min.
- **Target**: **130-135°F / 54-57°C** — "pink and rested"

### 3. J. Kenji López-Alt — Rack of Lamb (Serious Eats)
- **Source**: seriouseats.com/perfect-rack-of-lamb
- **Method**: Reverse-sear option: 250°F / 120°C to 115°F pull, then blast 500°F
  for 8-10 min for crust. Rest 5 min.
- **Target**: **115-120°F / 46-49°C** pull; 130-135°F / 54-57°C final

### 4. Leila Lindholm — Lammbog / lammkotletter (leila.se)
- **Source**: leila.se/recept
- **Method**: Bryn, dijonsmör, ugn 200°C ca 15-18 min.
- **Target**: **57-60°C** — "rosa"

### 5. Yotam Ottolenghi — Roasted Rack of Lamb (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Herb marinade, 220°C for 15-20 min.
- **Target**: **130-135°F / 54-57°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| France / Keller / Kenji | 130-135°F / 54-57°C | Medium-rare (canonical) |
| UK / Ramsay | 130-135°F / 54-57°C | |
| Sweden / Leila | 57-60°C | "Rosa" |
| USDA | 145°F / 63°C | Minimum safe |

**Consensus: 130-135°F / 54-57°C medium-rare.** Maps to `medium_rare` in lamb doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `grill`
- `recommended_doneness`: `"medium_rare"` (54-57°C professional consensus)
