# Reindeer Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Reindeer (Rangifer tarandus) is a staple of Scandinavian and Sámi culinary tradition.
The loin or haunch steak is extremely lean (even leaner than venison in many cases)
with a mild, clean, slightly sweet game flavour. Traditional Sámi preparation is
simple: hot pan, butter, brief cook. The lean meat demands brief cooking — 2 minutes
per side maximum for a 1-inch steak. Target: 52-58°C / 126-136°F (medium-rare to
medium by Nordic standards). USDA game standard of 160°F/71°C applies in the US
but is universally considered overcooking in Scandinavia.

## Source recipes

### 1. Magnus Nilsson — Stekt renfilé (Fäviken / Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon) / Fäviken cookbook (Phaidon)
- **Method**: Clarified butter or tallow, maximum heat, 90 sec per side, rest 5 min.
- **Target**: **52-55°C / 126-131°F** — "barely warm at centre, vibrant pink"
- **Note**: Nilsson's standard for reindeer is the same as for deer (hjort) —
  the philosophy being that wild Scandinavian game should be barely cooked.

### 2. Traditional Sámi preparation — Boazobiergu (reindeer meat)
- **Source**: Sámi culinary tradition / samemad.net
- **Method**: Cast iron or steatite pan, reindeer fat or butter, 2 min per side.
- **Target**: **52-58°C** (traditional Sámi standard — "röd-rosa" in modern Swedish)
- **Note**: Sámi tradition has served reindeer at near-raw to medium-rare for
  centuries; this is not a modern food-safety-first approach.

### 3. Leila Lindholm — Stekt renfilé (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör (butter), het stekpanna (hot pan), 2 min per sida (each side).
- **Target**: **55-58°C** (Swedish mainstream reindeer standard)

### 4. Inge Eriksson — Renfilé i smör (Swedish game cookbooks)
- **Source**: Traditional Swedish game cookbooks / viltmat.se
- **Method**: Brown butter, maximum heat, 2 min per side, rest 5-8 min.
- **Target**: **54-58°C** — "rödrosa" (red-pink)

### 5. Hank Shaw — Reindeer-style Venison Preparation (honest-food.net)
- **Source**: honest-food.net — applied to reindeer
- **Method**: Tallow or butter, hot cast iron, 90-120 sec per side.
- **Target**: **130-135°F / 54-57°C** (same as venison standard)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Nordic professional / Nilsson | 52-55°C / 126-131°F | Fäviken standard |
| Sámi tradition | 52-58°C | Traditional game |
| Swedish mainstream | 55-58°C | Standard "rödrosa" |
| USA / Hank Shaw | 130-135°F / 54-57°C | Venison-equivalent |
| USDA (game) | 160°F / 71°C | US safe minimum |

**Consensus: 52-58°C / 126-136°F medium-rare.**
Maps to `medium_rare` in game doneness (reindeer follows Nordic game standard).

## What makes this method special
Pan-searing reindeer steak in butter is the cornerstone of Sámi and Scandinavian
game cookery — perhaps the simplest and most culturally significant game preparation
in Northern Europe. The clean, sweet flavour of reindeer loin needs nothing beyond
butter and heat. Any more complexity would obscure what makes this meat special.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`
- `recommended_doneness`: `"medium_rare"` (52-58°C Nordic consensus)
