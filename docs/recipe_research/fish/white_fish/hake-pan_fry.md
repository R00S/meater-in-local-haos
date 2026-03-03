# Hake Fillet × Pan Fry — Recipe Temperature Research

## Cut profile
Hake (merluza, merlu) is enormously popular in Spain, Portugal, Italy, and France —
arguably the most-eaten white fish in Southern Europe. It has a mild, slightly sweet
flavour and a fine, tender flake. Hake is more delicate than cod and needs careful
handling — it breaks apart easily when overcooked or moved too often. Pan frying
skin-on at medium heat for 3-4 minutes skin-side produces a crispy skin over a
barely-set, very moist interior at 52-57°C / 126-135°F (Southern European preference)
or 63°C / 145°F (USDA standard).

## Source recipes

### 1. José Pizarro — Pan-Fried Hake (José Tapas / bbc.co.uk)
- **Source**: bbc.co.uk/food/jose_pizarro
- **Method**: Skin-on, olive oil, high heat, skin-side 4-5 min pressing flat, flip 1 min.
- **Target**: **52-57°C** — Spanish culinary standard (slightly translucent is fine)
- **Note**: Pizarro, the leading Spanish chef in the UK, emphasises that Spanish
  tradition treats hake differently from British tradition — lower temperature, more moist.

### 2. Gordon Ramsay — Pan-Fried Hake (Kitchen Secrets BBC)
- **Source**: bbc.co.uk/food/gordon_ramsay
- **Method**: Medium-high heat, butter + olive oil, 4 min skin-side, 2 min flesh-side.
- **Target**: **130-140°F / 54-60°C** at centre

### 3. Rick Stein — Merluza a la Gallega (Spain... on a plate)
- **Source**: Spain on a plate (BBC Books)
- **Method**: Olive oil, skin-side 4 min, flip 1 min.
- **Target**: **52-57°C** — Galician standard (barely set)

### 4. Leila Lindholm — Stekt kummel (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör + olja, medium heat, 3-4 min per side.
- **Target**: **55-60°C**

### 5. Nigel Slater — Pan-Fried Hake (Tender)
- **Source**: Tender (Fourth Estate)
- **Method**: Butter, medium heat, skin-side 4-5 min, flip gently 1-2 min.
- **Target**: **55-60°C** — "silky white, barely set"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Spain / Pizarro / Rick Stein | 52-57°C | Barely set, traditional |
| UK / Ramsay / Slater | 54-60°C | "Just set" |
| Sweden / Leila | 55-60°C | Nordic standard |
| USDA minimum | 145°F / 63°C | Safe |

**Consensus: 52-57°C / 126-135°F (culinary medium — European tradition).**
Maps to `well_done` per USDA; culinary `medium` for Southern European tradition.

## What makes this method special
Hake is the foundational fish of Iberian and French Atlantic coastal cooking —
the merluza of the Basque Country, the merlu of Brittany. Pan-frying skin-on
in olive oil (not butter — olive oil is traditional) produces a crispy skin over
extraordinarily delicate, barely-set white flesh. The low serving temperature of
the Spanish tradition (52-57°C) is what makes this fish so different from the
British-style hake at 63°C.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `oven_bake`, `steam`
- `recommended_doneness`: `"well_done"` (USDA standard; culinary medium at 52-57°C)
