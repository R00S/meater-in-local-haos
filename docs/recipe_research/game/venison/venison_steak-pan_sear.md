# Venison Steak × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Venison (deer) steak — typically from the loin or haunch (back leg) — is the leanest
red-meat steak in common culinary use. The extreme leanness (2-4% fat vs 15-30% for
beef ribeye) means it dries out faster and demands lower temperatures than beef.
USDA game meat standard is 160°F / 71°C; culinary tradition overwhelmingly targets
medium-rare (130-135°F / 54-57°C) for loin cuts, accepting that the USDA standard
produces dry, game-tasting venison. A very hot cast-iron pan (500°F+) with tallow
or duck fat, 90-120 seconds per side, produces maximum crust with minimum
heat penetration into the lean interior.

## Source recipes

### 1. Hank Shaw — Pan-Seared Venison Steak (Hunter Angler Gardener Cook)
- **Source**: honest-food.net/pan-seared-venison-steak
- **Method**: Dry 24 hours uncovered in fridge, cast iron maximum heat with tallow,
  90-120 sec per side, baste with butter + thyme. Rest 5 min.
- **Target**: **130-135°F / 54-57°C** (medium-rare — the definitive venison target)
- **Note**: Shaw is the foremost authority on wild game cookery in English. He
  explicitly states venison cooked above 145°F/63°C is "dried out" and loses
  the characteristic sweet, iron-rich flavour.

### 2. Gordon Ramsay — Pan-Seared Venison with Braised Red Cabbage (Kitchen Secrets)
- **Source**: bbc.co.uk/food/gordon_ramsay / gordonramsay.com
- **Method**: Season with juniper, hot pan with oil + butter, 2 min per side.
  Baste 30 sec. Rest 5 min.
- **Target**: **54-57°C / 130-135°F** (pink throughout — "venison should always be
  served medium-rare")
- **Note**: Ramsay is categorical: venison served above medium is overcooked.

### 3. Magnus Nilsson — Stekt hjortfilé (Fäviken / Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon) / fävikenmagasinet.se
- **Method**: Aged loin, brown butter with juniper, maximum heat 90 sec per side.
- **Target**: **52-55°C / 126-131°F** (Nilsson's Nordic standard — slightly lower
  than Ramsay for maximum silkiness in Swedish deer)
- **Note**: Wild Swedish deer (rådjur/hjort) at Fäviken was always served at 52-55°C —
  the mineral, clean flavour of the wild animal is best expressed at this temperature.

### 4. Fergus Henderson — Pan-Seared Venison Haunch Steak (Beyond Nose to Tail)
- **Source**: Beyond Nose to Tail (Bloomsbury)
- **Method**: Hot skillet, beef dripping, 2 min per side, rest 5 min.
- **Target**: **54-57°C / 130-135°F** — "ruby red at the centre, barely warm"
- **Note**: Henderson pairs venison with forceful accompaniments (celeriac purée,
  chestnuts) that match the strong flavour of properly cooked game.

### 5. Lars Almgren — Älgbiff i stekpanna (Swedish game cookbook tradition)
- **Source**: Svenska viltmaträtter / published Swedish game cookbooks
- **Method**: Smör (butter), very hot pan, 2 min per side, rest 5-8 min.
- **Target**: **55-58°C** (Swedish hjort/älg standard — "rödrosa" = red-pink)
- **Note**: Swedish game cuisine standards for all deer species (älg = moose,
  hjort = deer) uniformly target 55-58°C internal for loin steaks.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw | 130-135°F / 54-57°C | Game cookery authority |
| Gordon Ramsay | 54-57°C / 130-135°F | "Always medium-rare" |
| Nordic / Nilsson | 52-55°C | Wild Swedish game standard |
| UK / Henderson | 54-57°C | Ruby red centre |
| Sweden / Almgren | 55-58°C | Älg/hjort tradition |
| USDA game minimum | 160°F / 71°C | Safe, but dry by culinary standard |

**Culinary consensus: 52-57°C / 126-135°F medium-rare.**
Maps to `medium_rare` in our game/venison doneness range.
USDA 160°F is the safe standard for vulnerable populations.

## What makes this method special
Pan searing is the only method that delivers the deep Maillard crust on venison in
time to prevent the lean interior from overcooking. The screaming-hot pan must work
faster than the heat penetrates into the lean muscle — a 90-second window per side.
Tallow or duck fat basting adds back the fat the lean meat lacks, creating a self-
basting effect impossible with olive oil.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `charcoal_grill`, `oven_roast`
- `recommended_doneness`: `"medium_rare"` (52-57°C culinary consensus)
