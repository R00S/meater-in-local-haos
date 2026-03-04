# Pork Tenderloin × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Roasting pork tenderloin whole in a hot oven (400-425°F / 200-220°C) produces a
consistent, evenly-cooked result in 20-25 minutes. The high oven temperature promotes
light surface browning, though a brief stovetop sear first gives far better crust
development. Pork tenderloin is forgiving as long as the oven stays hot (lower temps
produce a steamed, grey exterior). A proper rest of 5-10 minutes is non-negotiable.

## Source recipes

### 1. America's Test Kitchen — Roasted Pork Tenderloin
- **Source**: americastestkitchen.com / cooks.com
- **Method**: 425°F oven on oiled rack over sheet pan, 20-25 min to 140°F. Rest 5 min.
- **Target**: **140-145°F / 60-63°C**
- **Note**: ATK's testing confirmed 425°F gives the best exterior colour without
  requiring a stovetop sear step.

### 2. Ina Garten — Herb-Marinated Pork Tenderloins (Barefoot Contessa)
- **Source**: foodnetwork.com/recipes/ina-garten
- **Method**: Marinate 3 hours, roast 425°F 25 min to 137-140°F. Rest 10 min.
- **Target**: **137-140°F / 58-60°C** pull; rises to 145°F/63°C
- **Note**: Garten pulls early, relying on rest time to reach the safe serving temp.

### 3. Swedish tradition — Helstekt fläskfilé (Allt om Mat / Arla)
- **Source**: alltommat.se · arla.se/recept
- **Method**: Brown in butter first, oven 200°C 20-25 min, rest 10 min.
- **Target**: **68°C** at thickest point
- **Note**: Swedish home-cooking guidance consistently targets 68°C for whole pork
  tenderloin for consumer confidence.

### 4. Nigel Slater — Roast Pork Fillet (Tender / The Kitchen Diaries)
- **Source**: Tender cookbook (Fourth Estate)
- **Method**: Oil + thyme, oven 200°C 20-22 min. Rest loosely tented 8 min.
- **Target**: **65-68°C** at centre after rest
- **Note**: Slater's UK approach bridges the gap between US 63°C and Swedish 68°C.

### 5. Samin Nosrat — Salt-Brined Pork Tenderloin (Salt Fat Acid Heat)
- **Source**: Salt Fat Acid Heat cookbook
- **Method**: Overnight salt brine, pat dry, 425°F oven 20 min, rest 10 min.
- **Target**: **145°F / 63°C** at thickest point
- **Note**: Nosrat notes that a well-brined tenderloin stays juicy even if slightly
  over 145°F, giving more margin for home cooks.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / ATK / Nosrat | 140-145°F / 60-63°C | With 5-10 min rest |
| UK / Slater | 65-68°C | Slight pink acceptable |
| Sweden | 68°C | Standard home-cook guidance |

**Consensus: 63-68°C.** Maps to `medium` in pork doneness.

## What makes this method special
Oven roasting pork tenderloin whole is the most hands-off approach with the most
consistent results. The entire cut reaches the target simultaneously without the
risk of a charred exterior from pan contact on a lean, narrow muscle.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (63°C global consensus)
