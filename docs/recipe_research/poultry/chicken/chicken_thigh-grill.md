# Chicken Thigh × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Grilled chicken thigh is widely considered superior to grilled breast — the higher
fat content, connective tissue, and flavour of the dark meat makes it more forgiving
and more delicious. Bone-in skin-on thighs are the gold standard for grilling:
indirect heat first to 155°F / 68°C, then direct heat to render the skin and reach
165-175°F / 74-79°C. Boneless thighs grill faster (8-10 min total direct).

## Source recipes

### 1. J. Kenji López-Alt — The Best Grilled Chicken Thighs (Serious Eats)
- **Source**: seriouseats.com/best-grilled-chicken-thighs
- **Method**: Score skin, salt overnight, two-zone fire, indirect until 155°F,
  direct for skin crisping to 165-170°F.
- **Target**: **165-170°F / 74-77°C** at thickest near bone

### 2. Aaron Franklin — Smoked/Grilled Chicken Thighs (Franklin concept)
- **Source**: Franklin Barbecue (Ten Speed Press) — adapted
- **Method**: Dry rub, indirect smoke-grill until 165°F, direct for char.
- **Target**: **165-175°F / 74-79°C** — thighs can go higher without drying

### 3. Gordon Ramsay — Grilled Chicken Thighs (Kitchen)
- **Source**: gordonramsay.com
- **Method**: Marinate, grill skin-down medium heat 8-10 min, flip 5-6 min.
- **Target**: **165°F / 74°C** at bone

### 4. Leila Lindholm — Grillad kycklingklubba / lår (leila.se)
- **Source**: leila.se/recept
- **Method**: Marinera, grill medium värme, 8-10 min per sida.
- **Target**: **74-77°C** near bone

### 5. Weber Grills — Grilled Bone-In Chicken Thigh
- **Source**: weber.com
- **Method**: Two-zone grill, indirect 30 min then direct 5 min per side.
- **Target**: **165°F / 74°C** near bone

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Weber | 165°F / 74°C | Minimum safe |
| Kenji / Franklin | 165-175°F / 74-79°C | Better at higher temp |
| Gordon Ramsay | 165°F / 74°C | |
| Sweden | 74-77°C | |

**Consensus: 165-175°F / 74-79°C.** Higher end produces better texture in dark meat.
Maps to `well_done` in poultry doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `grill`, `oven_roast`, `air_fryer`, `pan_fry`, `braise`
- `recommended_doneness`: `"well_done"` (165-175°F/74-79°C)
