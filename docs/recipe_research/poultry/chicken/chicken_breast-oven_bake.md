# Chicken Breast × Oven Bake — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Baking chicken breast at 375-425°F / 190-220°C is the most common weeknight method
worldwide — simple, hands-off, and producing moist results with minimal skill.
A standard 170-200 g / 6-7 oz boneless skinless breast bakes to 165°F / 74°C in
18-22 minutes at 400°F / 200°C. Overcooking to 180°F+ produces the "chicken sawdust"
texture most home cooks have experienced — dry, fibrous, and unpleasant. Accurate
thermometer use is the single most important skill for baked chicken.

## Source recipes

### 1. America's Test Kitchen — Baked Chicken Breast
- **Source**: americastestkitchen.com
- **Method**: Brine 30 min, 425°F oven 18-22 min on rack over sheet pan. Probe to
  160°F; rest 5 min to reach 165°F.
- **Target**: **160°F / 71°C** pull (FDA time-temp safe at 160°F for 15+ seconds)

### 2. Ina Garten — Lemon Chicken Breast (Barefoot Contessa)
- **Source**: foodnetwork.com / Barefoot Contessa cookbook
- **Method**: Marinate in lemon + garlic, roast 400°F 25-30 min.
- **Target**: **165°F / 74°C** at thickest point

### 3. Leila Lindholm — Ugnsbakad kycklingfilé (leila.se)
- **Source**: leila.se/recept
- **Method**: Marinade or herb rub, 200°C oven 20-25 min.
- **Target**: **74°C** (Swedish poultry standard)

### 4. Samin Nosrat — Baked Spatchcock Chicken (Salt Fat Acid Heat — adapted)
- **Source**: Salt Fat Acid Heat
- **Method**: Salt overnight, 425°F 20-22 min for breast portion.
- **Target**: **160-165°F / 71-74°C**

### 5. Jamie Oliver — Baked Chicken Breast (Jamie's Quick & Easy Food)
- **Source**: jamieoliver.com
- **Method**: Marinade, 200°C oven 18-22 min.
- **Target**: **74°C / 165°F** — "juices run completely clear"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Ina / Samin | 160-165°F / 71-74°C | Pull at 160, rest to 165 |
| Sweden | 74°C | Standard poultry |
| UK / Jamie | 74°C | "Juices run clear" |

**Consensus: 165°F / 74°C at thickest point.**
Maps to `well_done` in poultry doneness.

## What makes this method special
Oven baking is the simplest, most forgiving method for chicken breast — no flipping,
no monitoring, no risk of burning. The gentle oven heat produces even cooking
throughout the breast. Brining before baking is the single most impactful upgrade —
30 minutes in salted water reduces moisture loss by 10-15% during baking.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (165°F/74°C universal poultry standard)
