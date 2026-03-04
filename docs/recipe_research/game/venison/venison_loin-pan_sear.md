# Venison Loin × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Venison loin (backstrap) is the finest venison cut — the equivalent of beef
tenderloin, running along the spine. It is extremely lean, very tender, and
extremely easy to overcook. The consensus of every serious venison authority:
serve at 130-135°F / 54-57°C (medium-rare). Above 140°F / 60°C, venison loin
becomes dry and loses its characteristic delicate gamey flavour. Pan-sear 2-3
minutes per side in very hot butter/oil, rest 3-5 minutes.

## Source recipes

### 1. Hank Shaw — Pan-Seared Venison Loin (honest-food.net)
- **Source**: honest-food.net/venison-backstrap
- **Method**: Pat absolutely dry, clarified butter + neutral oil in cast iron,
  screaming hot, 2-3 min per side. No moving. Rest 5 min.
- **Target**: **130-135°F / 54-57°C** medium-rare
- **Note**: "Venison backstrap cooked beyond medium is a sin"

### 2. Gordon Ramsay — Pan-Seared Venison Loin (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Season, very hot pan, 2-3 min per side, juniper berry + game stock jus.
- **Target**: **130-140°F / 54-60°C** — "pink, rested"

### 3. Magnus Nilsson — Hjortloin (The Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Brown butter, very hot pan, 2-3 min per side.
- **Target**: **54-57°C** — Nordic standard for venison

### 4. Leila Lindholm — Stekt hjortlår / rygg (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör + olja, het gjutjärnspanna, 2-3 min per sida.
- **Target**: **54-57°C** at thickest

### 5. Tom Parker Bowles — Venison Backstrap (Let's Eat Meat)
- **Source**: Let's Eat Meat (Pavilion)
- **Method**: Hot pan, lard + oil, 2 min per side, rest 5 min.
- **Target**: **54-57°C / 130-135°F**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw | 130-135°F / 54-57°C | The canonical venison standard |
| UK / Ramsay / Parker Bowles | 130-140°F / 54-60°C | Medium-rare to medium |
| Sweden / Magnus Nilsson | 54-57°C | Nordic venison |
| USDA (game) | 160°F / 71°C | Conservative game meat standard |

**Culinary consensus: 130-135°F / 54-57°C medium-rare.**
Maps to `medium_rare` in game doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `oven_roast`, `sous_vide`
- `recommended_doneness`: `"medium_rare"` (54-57°C canonical)
