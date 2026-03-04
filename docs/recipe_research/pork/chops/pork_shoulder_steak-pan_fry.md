# Pork Shoulder Steak × Pan Fry — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Pork shoulder steak (also called Boston butt steak or picnic steak) is cut from the
shoulder — it has more marbling, more connective tissue, and more flavour than loin
steaks. Because of its higher fat and collagen content, it can withstand longer
cooking and benefits from going slightly over USDA minimum. Pan frying at medium
heat for 4-5 minutes per side produces a richly flavoured, juicy result at 145-155°F
/ 63-68°C.

## Source recipes

### 1. J. Kenji López-Alt — Pork Shoulder Steak (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Medium-high cast iron, 4-5 min per side. Rest 3-5 min.
- **Target**: **145-155°F / 63-68°C** — "fat renders, flavour is better"

### 2. Leila Lindholm — Stekt fläskkarré (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör + olja, medelhög värme, 4-5 min per sida.
- **Target**: **65-70°C**

### 3. Gordon Ramsay — Pork Shoulder Steak
- **Source**: gordonramsay.com
- **Method**: Season, medium-high heat, 4-5 min per side. Baste with garlic butter.
- **Target**: **145-155°F / 63-68°C**

### 4. Hank Shaw — Pork Shoulder Steak (honest-food.net)
- **Source**: honest-food.net
- **Method**: Cast iron, medium-high, 4-5 min per side.
- **Target**: **145°F / 63°C** minimum, "better at 155°F for shoulder"

### 5. America's Test Kitchen — Pork Shoulder Steak
- **Source**: americastestkitchen.com
- **Method**: Salt 45 min, medium-high, 4-5 min per side.
- **Target**: **145°F / 63°C** — USDA, but notes shoulder benefits from 150°F

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA | 145°F / 63°C | Minimum safe |
| Kenji / Hank Shaw | 145-155°F / 63-68°C | Better flavour at higher temp |
| Sweden | 65-70°C | Standard |
| UK / Ramsay | 63-68°C | |

**Consensus: 145-155°F / 63-68°C.** Maps to `well_done` in pork doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `grill`, `braise`
- `recommended_doneness`: `"well_done"` (145-155°F/63-68°C)
