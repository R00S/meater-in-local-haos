# Duck Breast × Pan Sear — Recipe Temperature Research

## Cut profile
Duck breast (magret de canard) behaves more like red meat than poultry — it can
and should be served medium-rare. The fat-cap side (thick layer of subcutaneous
fat) must be rendered slowly in a cold-pan start (NOT hot pan) before the flesh
side is seared. The cold-start-to-medium-heat approach renders the fat without
burning the skin, producing a shatteringly crispy exterior. USDA categorises
duck as poultry (165°F / 74°C), but culinary tradition universally targets
130-135°F / 54-57°C (medium-rare) for duck breast.

## Source recipes

### 1. J. Kenji López-Alt — Duck Breast (Serious Eats)
- **Source**: seriouseats.com/pan-seared-duck-breast
- **Method**: Score fat cap in crosshatch, fat-side-down in COLD pan, medium heat.
  Render 6-8 min, flip 2-3 min flesh side, rest 5 min.
- **Target**: **130-135°F / 54-57°C** at thickest part of flesh (not fat)
- **Note**: Critical: cold pan start. Hot pan instantly burns the skin before the
  fat renders — the most common duck breast mistake.

### 2. Thomas Keller — Magret de Canard (Bouchon Bistro)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Score fat, cold pan start, render 8 min, flip 2 min, rest 8 min.
- **Target**: **130-135°F / 54-57°C** — "pink-red interior, crispy exterior"

### 3. Gordon Ramsay — Pan-Seared Duck Breast (MasterClass / Kitchen Secrets)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Score fat deeply, cold pan, render 5-6 min until golden, flip 3-4 min.
- **Target**: **135-140°F / 57-60°C** (medium-rare to medium)
- **Note**: Ramsay: "Duck breast is a red meat — it should be pink, not grey."

### 4. Magnus Nilsson — Stekt andbröst (Fäviken / Nordic Cookbook)
- **Source**: Fäviken cookbook (Phaidon) / The Nordic Cookbook (Phaidon)
- **Method**: Cold pan start, render duck fat 8-10 min, flip 2 min, rest 8-10 min.
- **Target**: **52-57°C / 126-135°F** (Nordic medium-rare standard for duck)

### 5. Leila Lindholm — Stekt ankbröst (leila.se / koket.se)
- **Source**: leila.se/recept · koket.se
- **Method**: Score fat, cold pan start, render 6-8 min, flip 3 min.
- **Target**: **55-58°C** at flesh (Swedish duck breast standard)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller | 130-135°F / 54-57°C | Red-meat style medium-rare |
| Gordon Ramsay | 135-140°F / 57-60°C | Medium-rare to medium |
| Nordic / Nilsson | 52-57°C / 126-135°F | Fäviken standard |
| Sweden / Leila | 55-58°C | Mainstream Swedish |
| USDA (poultry) | 165°F / 74°C | Legally required in foodservice USA |

**Culinary consensus: 52-57°C / 126-135°F medium-rare.**
Maps to `medium_rare` in poultry (duck) doneness.
Note: USDA requires 165°F for poultry in commercial settings; home cooks and
professional kitchens outside the US routinely target 130-135°F.

## What makes this method special
Duck breast pan searing with the cold-start fat-rendering technique produces the
most dramatic contrast in any poultry preparation: shatteringly crispy, deeply
caramelised fat cap over vibrantly pink, juicy red meat. The cold-pan technique
is the key insight — it takes patience but produces restaurant-quality duck in
15 minutes.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `oven_roast`, `grill`, `sous_vide`
- `recommended_doneness`: `"medium_rare"` (52-57°C culinary consensus — duck breast)
