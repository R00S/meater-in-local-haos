# Moose Roast × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Moose roast (älgstek) — typically the haunch (lår), saddle (sadel), or shoulder (bog)
— is one of the great festive centrepieces of Swedish and Norwegian home cooking.
A 2-3 kg / 4-7 lb haunch roasts at 150-175°C / 300-350°F for 25-30 minutes per
500 g. Target: 55-60°C / 131-140°F for the traditional "rödrosa" (pink-red)
Scandinavian standard. Barding with salt pork or rubbing with butter is essential
to compensate for the very lean muscle.

## Source recipes

### 1. Magnus Nilsson — Älgstek i ugn (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Bard with lard, juniper + thyme rub, 160°C / 320°F for 25 min per 500 g.
  Rest 15 min tented.
- **Target**: **55-58°C / 131-136°F** at thickest point

### 2. Leila Lindholm — Helstekt älgstek (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör coating + lingonberry jelly glaze, 175°C oven, 25 min per 500 g.
- **Target**: **58-60°C** at thickest (Leila's mainstream Swedish target)

### 3. Swedish viltmat tradition — älgsadel
- **Source**: viltmat.se / Swedish game tradition
- **Method**: Bard + herbs, 160°C oven 20-25 min per 500 g. Rest 15 min.
- **Target**: **55-60°C** ("rödrosa" standard)

### 4. Norwegian elgstek tradition
- **Source**: norgesmat.no / Norwegian culinary tradition
- **Method**: Smør + einebær (juniper), 160°C 25-30 min per 500 g.
- **Target**: **55-58°C** (Norwegian standard matches Swedish)

### 5. Hank Shaw — Moose Roast (honest-food.net)
- **Source**: honest-food.net
- **Method**: Low-and-slow reverse sear, 250°F to 130°F, blast finish.
- **Target**: **130-135°F / 54-57°C** (medium-rare)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Nordic / Nilsson | 55-58°C / 131-136°F | Fäviken standard |
| Sweden / Leila | 58-60°C | Mainstream Swedish |
| Norway | 55-58°C | Norwegian standard |
| USA / Hank Shaw | 130-135°F / 54-57°C | Game standard |

**Consensus: 55-60°C / 131-140°F medium-rare.**
Maps to `medium_rare` in game doneness.

## What makes this method special
Moose roast (älgstek) is the crown jewel of Scandinavian home cooking —
a tradition going back centuries when moose hunting was subsistence, not sport.
Served with lingonberry jam, pressed cucumber salad, and brown butter roasting
juices, it represents Swedish culinary culture at its most authentic and seasonal.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `braise`
- `recommended_doneness`: `"medium_rare"` (55-60°C Nordic standard)
