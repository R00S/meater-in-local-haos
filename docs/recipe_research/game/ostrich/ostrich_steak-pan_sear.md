# Ostrich Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Ostrich is a red meat (not poultry despite being a bird) with an exceptionally lean
profile — less fat than even venison. Ostrich fan (inner thigh) or leg steak is dark
red, with a mild, slightly sweet beef-like flavour. USDA categorises ostrich as
poultry with a safety standard of 165°F / 74°C, but ostrich steak is universally
cooked to medium-rare by culinary tradition (130-145°F / 54-63°C) because the
very lean muscle becomes dry and unpleasant above 150°F / 65°C. A very hot pan
and maximum 90-120 seconds per side is essential.

## Source recipes

### 1. Hank Shaw — Ostrich Steak (honest-food.net)
- **Source**: honest-food.net/ostrich-steak
- **Method**: Cast iron, tallow or duck fat (ostrich has essentially no fat),
  maximum heat, 90-120 sec per side. Rest 5 min.
- **Target**: **130-140°F / 54-60°C** — medium-rare (treat like very lean beef)
- **Note**: Shaw notes ostrich has essentially zero intramuscular fat — this is
  truly the leanest "steak" in common culinary use.

### 2. South African Braai tradition — Volstruis steak (Braaimaster)
- **Source**: braaimaster.co.za / South African braai tradition
- **Method**: Marinate in red wine + garlic + herbs, hot griddle or pan, 2-3 min
  per side.
- **Target**: **54-60°C / 130-140°F** — "rooi-pienk van binne" (red-pink inside)
- **Note**: South African braai culture, where ostrich is most commonly cooked,
  universally targets medium-rare for ostrich steak.

### 3. Gordon Ramsay — Ostrich Steak (Kitchen Secrets)
- **Source**: bbc.co.uk/food/gordon_ramsay / Kitchen Secrets
- **Method**: Hot cast iron, duck fat, 2 min per side.
- **Target**: **54-57°C / 130-135°F** — "it has no fat to protect it, cook it rare"
- **Note**: Ramsay explicitly states ostrich should be rare to medium-rare.

### 4. Magazine Culinaire (France) — Steak d'autruche
- **Source**: French culinary tradition / academie-culinaire.com
- **Method**: Butter + thyme, très chaud (very hot), 2 min per face.
- **Target**: **54-57°C** — French medium-rare standard for red-meat game birds

### 5. Leila Lindholm (adapted) — Stekt strutsfilé
- **Source**: Swedish adaptation of ostrich cooking
- **Method**: Smör, het panna (hot pan), 2 min per side, vila (rest) 5 min.
- **Target**: **55-58°C** (Swedish red-meat-style standard)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw | 130-140°F / 54-60°C | Treat as lean beef |
| South Africa | 54-60°C | Braai culture standard |
| Gordon Ramsay | 54-57°C | "Rare to medium-rare" |
| France | 54-57°C | Red game bird |
| Sweden (adapted) | 55-58°C | Nordic standard |
| USDA (poultry) | 165°F / 74°C | Legal minimum in USA |

**Culinary consensus: 54-60°C / 130-140°F medium-rare.**
Maps to `medium_rare` in game doneness. Note: USDA classifies ostrich as
poultry (165°F standard), but culinary tradition treats it as lean red meat.

## What makes this method special
Pan-seared ostrich steak in tallow is a paradox — it tastes like an exceptionally
clean, lean beef fillet but comes from a bird. The complete absence of intramuscular
fat means the Maillard crust must be created in under 2 minutes per side or the
interior reaches the "dry-out point" simultaneously with the crust forming.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`
- `recommended_doneness`: `"medium_rare"` (54-60°C culinary consensus)
