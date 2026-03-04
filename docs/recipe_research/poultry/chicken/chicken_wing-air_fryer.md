# Chicken Wing × Air Fryer — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Air fryer chicken wings have become one of the most popular air fryer applications —
the circulating hot air renders fat and crisps skin without deep frying. Wings cook
at 380-400°F / 193-200°C for 20-25 minutes, shaking halfway. The result: crispy skin
with juicy meat at 165°F / 74°C. Flat wings (wingettes) and drums cook at the same
rate. Sauce is added after cooking.

## Source recipes

### 1. J. Kenji López-Alt — Air Fryer Chicken Wings (Serious Eats)
- **Source**: seriouseats.com/air-fryer-chicken-wings
- **Method**: Pat dry, no oil, 380°F / 193°C for 20-25 min shaking every 8 min.
- **Target**: **165°F / 74°C** — "skin is golden and crispy"

### 2. Gordon Ramsay — Air Fryer Wings (MasterClass)
- **Source**: masterclass.com/gordon-ramsay
- **Method**: Season, no oil, 400°F for 20 min, flip at 10 min.
- **Target**: **165°F / 74°C**

### 3. America's Test Kitchen — Air Fryer Buffalo Wings
- **Source**: americastestkitchen.com
- **Method**: Pat very dry, season, 400°F for 20 min, toss with buffalo sauce.
- **Target**: **165°F / 74°C** — ATK always uses USDA minimum

### 4. Leila Lindholm — Airfryervingar (adapted) (leila.se)
- **Source**: leila.se/recept
- **Method**: Torka av, krydda, airfryer 200°C 20-25 min, skaka halvvägs.
- **Target**: **74°C** internal

### 5. Tasty / Buzzfeed Food — Air Fryer Chicken Wings
- **Source**: tasty.co
- **Method**: 380°F for 24 min shaking every 8 min.
- **Target**: **165°F / 74°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / ATK | 165°F / 74°C | Poultry mandatory |
| Gordon Ramsay | 165°F / 74°C | |
| Sweden | 74°C | |

**Consensus: 165°F / 74°C.** Maps to `well_done` in poultry doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `air_fryer`, `oven_roast`, `grill`
- `recommended_doneness`: `"well_done"` (165°F/74°C USDA poultry)
