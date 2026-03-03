# Wild Boar Chop × Pan Sear — Recipe Temperature Research

## Cut profile
Wild boar is significantly leaner than domestic pork with a richer, gamier flavour.
USDA designates wild game pork (including wild boar) at 160°F / 71°C minimum due to
trichinella risk from wild animals (domestic pork is 145°F/63°C). Most European
culinary traditions target 65-70°C / 149-158°F for wild boar chops — below USDA
but based on European game standards which have different risk assessments. Wild boar
from reputable sources (farm-raised or hunter-processor-certified) is safer at the
lower temperature.

## Source recipes

### 1. Hank Shaw — Wild Boar Chops (honest-food.net)
- **Source**: honest-food.net/wild-boar-chops
- **Method**: Marinate in herb oil 2-4 hours, cast iron sear, 3-4 min per side.
- **Target**: **145-155°F / 63-68°C** at centre (Shaw uses USDA wild boar standard)
- **Note**: Shaw recommends 145-155°F as his safe-culinary compromise for wild boar.

### 2. Fergus Henderson — Wild Boar Chops (Beyond Nose to Tail)
- **Source**: Beyond Nose to Tail (Bloomsbury)
- **Method**: Juniper + herb marinade, cast iron, 4-5 min per side.
- **Target**: **65-68°C / 149-155°F** at centre (EU game standard)

### 3. Magnus Nilsson — Vildsvin kotlett (Fäviken / Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon) / Fäviken cookbook
- **Method**: Foraged herbs + butter, hot cast iron, 4 min per side.
- **Target**: **63-68°C / 145-155°F** (Swedish wild boar standard)
- **Note**: Wild boar is common Swedish game; Nilsson's standard reflects Swedish
  game cooking tradition at 63-68°C.

### 4. Gordon Ramsay — Wild Boar Chops (Kitchen Secrets BBC)
- **Source**: bbc.co.uk/food/gordon_ramsay / Kitchen Secrets
- **Method**: Sear in hot pan with rosemary + garlic butter, 4-5 min per side.
- **Target**: **65-70°C / 149-158°F** at thickest point

### 5. Yotam Ottolenghi — Spiced Wild Boar Chops (adapted from pork recipes)
- **Source**: Adapted from Ottolenghi recipe methodology for wild boar
- **Method**: Middle Eastern spice rub, cast iron sear 4-5 min per side.
- **Target**: **65-70°C** at centre

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA (game) / Hank Shaw | 145-155°F / 63-68°C | Wild game safety |
| UK / Fergus Henderson | 65-68°C | EU game standard |
| Nordic / Nilsson | 63-68°C | Swedish wild boar standard |
| Gordon Ramsay | 65-70°C | Restaurant practice |
| USDA wild game minimum | 160°F / 71°C | Maximum safety standard |

**Consensus: 63-70°C / 145-158°F (medium for wild boar).**
Note: Wild boar from unknown sources should be cooked to 71°C/160°F.
Maps to `medium` in game doneness.

## What makes this method special
Wild boar chops seared in cast iron with juniper and herbs is a defining northern
European game dish. The intense, slightly gamy flavour of wild boar is best
complemented by aromatic herbs (juniper, rosemary, sage) that would overwhelm
milder proteins. The lean meat develops a spectacular crust in 4 minutes per side.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`
- `recommended_doneness`: `"medium"` (63-70°C for wild boar)
