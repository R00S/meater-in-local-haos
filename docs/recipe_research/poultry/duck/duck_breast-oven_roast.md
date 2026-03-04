# Duck Breast × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Duck breast oven roasting is the restaurant's primary technique — score the fat cap,
start skin-down in a cold pan to render fat, then finish in a 375-400°F / 190-200°C
oven. Unlike chicken, duck breast is red meat and can legitimately be served at
130-135°F / 54-57°C (medium-rare) per French culinary tradition. USDA recommends
165°F / 74°C but most chefs consider this overcooked for duck breast.

## Source recipes

### 1. Thomas Keller — Pan-Roasted Duck Breast (Bouchon)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Score fat, cold pan skin-down 5-6 min, flip 1 min, oven 375°F 8-10 min
  to 130-135°F, rest 8 min.
- **Target**: **130-135°F / 54-57°C** medium-rare

### 2. Gordon Ramsay — Roasted Duck Breast (Kitchen)
- **Source**: gordonramsay.com
- **Method**: Score fat, cold pan skin-down 6 min, oven 180°C for 6-8 min.
  Rest 5 min.
- **Target**: **135-140°F / 57-60°C** — "pink, rested"

### 3. J. Kenji López-Alt — Duck Breast (Serious Eats)
- **Source**: seriouseats.com/crispy-pan-roasted-duck-breast
- **Method**: Score, cold pan skin-down 10 min at medium-low, flip 2 min, rest.
  (No oven needed for thin breast if fat renders sufficiently.)
- **Target**: **130-135°F / 54-57°C** medium-rare

### 4. Leila Lindholm — Ankbröst (leila.se)
- **Source**: leila.se/recept
- **Method**: Rista fettet, kall panna fettsida ned 6-8 min, vänd, 5 min.
- **Target**: **57-60°C** — "rosa inuti, rött är OK för Magret"

### 5. Yotam Ottolenghi — Duck Breast with Fig Sauce (Plenty More)
- **Source**: Plenty More (Ten Speed Press)
- **Method**: Score, pan-render + oven 190°C 8 min.
- **Target**: **135°F / 57°C** medium-rare

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| France / Keller / Kenji | 130-135°F / 54-57°C | Medium-rare (canonical) |
| Gordon Ramsay | 135-140°F / 57-60°C | Medium |
| Sweden / Leila | 57-60°C | "Rosa" |
| UK / Ottolenghi | 57°C | Medium-rare |
| USDA (all poultry) | 165°F / 74°C | Minimum (considered overdone by chefs) |

**Culinary consensus: 57-60°C / 135-140°F (medium to medium-rare).**
USDA minimum is 165°F / 74°C.
Maps to `medium_rare` in doneness; use `well_done` note for USDA.

## What makes this method special
Duck breast bridges poultry and red meat cookery — it is the only poultry cut
where medium-rare is not just accepted but expected in French cuisine. The unique
fat-rendering technique (cold pan, skin-side down, long slow render) is different
from all other meat cookery and is essential to the perfect duck breast.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `oven_roast`, `sous_vide`
- `recommended_doneness`: `"medium_rare"` (57-60°C French/professional standard)
