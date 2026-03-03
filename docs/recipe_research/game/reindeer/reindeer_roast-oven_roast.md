# Reindeer Roast × Oven Roast — Recipe Temperature Research

## Cut profile
Reindeer roast (saddle, haunch or shoulder) is a traditional Scandinavian Christmas
and festive dish. The haunch (lår) or saddle (rygg) at 1-2 kg / 2-4 lb roasts at
160-175°C / 320-350°F for 20-25 minutes per 500 g. Target: 55-60°C / 131-140°F
for medium-rare (the universal Scandinavian preference). A juniper-berry and thyme
rub, with barding using thin slices of salt pork or bacon to compensate for leanness,
is the classic preparation.

## Source recipes

### 1. Magnus Nilsson — Ugnsrostad rensadel (Fäviken / Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Juniper + thyme rub, bard with salt pork, 160°C / 320°F oven
  20-25 min per 500 g. Rest 15 min.
- **Target**: **55-58°C / 131-136°F** at thickest point

### 2. Traditional Norwegian / Swedish reindeer roast recipe
- **Source**: Norwegian food tradition / norgesmat.no / viltmat.se
- **Method**: Bard with lard, 175°C oven 20 min per 500 g. Rest 15 min tented.
- **Target**: **55-60°C / 131-140°F** (Scandinavian "rödrosa")

### 3. Leila Lindholm — Rendjursstek (leila.se)
- **Source**: leila.se/recept
- **Method**: Juniper + smör coating, 175°C oven, 25 min per 500 g.
- **Target**: **58-60°C** at thickest point

### 4. Inge Eriksson — Roast reindeer (Swedish viltmat tradition)
- **Source**: viltmat.se / Swedish game cookbooks
- **Method**: Classical preparation: bard, herbs, 160°C for 25-30 min per 500 g.
- **Target**: **55-58°C** at haunch

### 5. Hank Shaw — Adapted reindeer roast (honest-food.net venison method)
- **Source**: honest-food.net
- **Method**: Reverse-sear at 250°F to 130°F / 54°C, blast at 500°F for crust.
- **Target**: **130-135°F / 54-57°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Nordic professional / Nilsson | 55-58°C / 131-136°F | Fäviken standard |
| Norwegian/Swedish tradition | 55-60°C | "Rödrosa" festive roast |
| Leila / Swedish mainstream | 58-60°C | Standard home cook target |
| USA / Hank Shaw | 130-135°F / 54-57°C | Venison-equivalent |

**Consensus: 55-60°C / 131-140°F medium-rare.**
Maps to `medium_rare` in game doneness.

## What makes this method special
Reindeer roast is the Nordic equivalent of the British Sunday joint — a festive,
convivial centrepiece with deep cultural significance in Scandinavian and Sámi
traditions. The lean meat barded with salt pork and scented with juniper is
unmistakably Nordic, producing an extraordinary flavour that no other animal or
method can replicate.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `braise`
- `recommended_doneness`: `"medium_rare"` (55-60°C Nordic standard)
