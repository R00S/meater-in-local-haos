# Turkey Breast × Oven Roast — Recipe Temperature Research

## Cut profile
Turkey breast (bone-in half breast, 1.5-3 kg) is the easiest way to serve a crowd
without roasting a whole bird. It dries out more quickly than dark meat — the white
breast meat has very little fat. Best result: low-and-slow at 300°F / 150°C or
reverse-sear to 155°F / 68°C then blast at 425°F / 220°C for 15 min (carryover to
165°F). Dry-brining the night before is critical for moisture retention.

## Source recipes

### 1. J. Kenji López-Alt — Roasted Turkey Breast (Serious Eats)
- **Source**: seriouseats.com/best-roast-turkey-breast-recipe
- **Method**: Dry-brine overnight, 300°F oven to 150°F / 66°C, blast 450°F
  for 10-15 min for skin. Rest 15 min.
- **Target**: **150°F / 66°C** pull (carryover + blast brings to 165°F / 74°C)

### 2. Thomas Keller — Roasted Turkey Breast (Ad Hoc)
- **Source**: Ad Hoc at Home (Workman)
- **Method**: Brine 12 hours, roast 400°F to 155°F, rest 15 min tented.
- **Target**: **155-160°F / 68-71°C** pull; 165°F after rest

### 3. Gordon Ramsay — Perfect Roast Turkey Breast
- **Source**: gordonramsay.com
- **Method**: Herb butter under skin, 180°C for 20 min per 500g + 20 min.
- **Target**: **165°F / 74°C** at thickest point

### 4. Leila Lindholm — Ugnsrostad kalkonbröst (leila.se)
- **Source**: leila.se/recept
- **Method**: Örtkryddat, ugn 180°C till 74°C internal.
- **Target**: **74°C** at thickest

### 5. America's Test Kitchen — Roast Turkey Breast
- **Source**: americastestkitchen.com
- **Method**: V-rack, 425°F for 45-60 min.
- **Target**: **165°F / 74°C** — USDA poultry standard

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / ATK | 165°F / 74°C | Poultry mandatory |
| Kenji / Keller | 150-155°F pull | 165°F after carryover |
| Gordon Ramsay | 165°F / 74°C | |
| Sweden | 74°C | |

**Consensus: 165°F / 74°C.** Maps to `well_done` in poultry doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `smoker`
- `recommended_doneness`: `"well_done"` (165°F/74°C USDA)
