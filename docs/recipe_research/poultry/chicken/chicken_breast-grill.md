# Chicken Breast × Grill — Recipe Temperature Research

## Cut profile
Grilling chicken breast requires careful management: the breast is lean, it cooks
fast, and direct grilling of a whole thick breast leads to charred exterior and raw
interior. Three solutions: (1) pound to even thickness (2 cm), (2) butterfly
(butterfly/flatten), or (3) use indirect heat then sear. All aim at USDA 165°F / 74°C
throughout. A properly grilled breast takes 6-8 minutes per side at 350-400°F /
175-200°C (medium grill heat).

## Source recipes

### 1. J. Kenji López-Alt — Grilled Chicken Breast (Serious Eats)
- **Source**: seriouseats.com/the-best-grilled-chicken-breasts-recipe
- **Method**: Brine 30 min, pound to even thickness, medium direct grill 400°F,
  6-7 min per side.
- **Target**: **160-165°F / 71-74°C** at thickest (carryover brings to 165°F)

### 2. Gordon Ramsay — Grilled Chicken Breast (Kitchen)
- **Source**: gordonramsay.com
- **Method**: Marinate, medium-high grill, 6-8 min per side.
- **Target**: **165°F / 74°C** — "juices run clear, 74°C confirmed"

### 3. Weber Grills — Grilled Chicken Breast Guide
- **Source**: weber.com/grilling-guide/chicken-breast
- **Method**: Direct medium heat 180°C, 8-10 min per side.
- **Target**: **165°F / 74°C**

### 4. Leila Lindholm — Grillad kycklingfilé (leila.se)
- **Source**: leila.se/recept
- **Method**: Marinera, direkt medelvärme, 6-8 min per sida.
- **Target**: **74°C** — USDA safe

### 5. Bobby Flay — Grilled Chicken Breast (BBQ Addiction)
- **Source**: foodnetwork.com/bobby-flay / BBQ Addiction cookbook
- **Method**: Pound even, season well, high heat grill 4-5 min per side.
- **Target**: **165°F / 74°C** at thickest

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Weber | 165°F / 74°C | Poultry mandatory |
| Gordon Ramsay | 165°F / 74°C | "Juices run clear" |
| Sweden | 74°C | Standard |
| Bobby Flay | 165°F / 74°C | |

**Consensus: 165°F / 74°C.** Maps to `well_done` in poultry doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `grill`, `pan_sear`, `oven_bake`, `air_fryer`
- `recommended_doneness`: `"well_done"` (165°F/74°C USDA poultry)
