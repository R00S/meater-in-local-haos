# Chicken Thigh × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Chicken thighs (bone-in, skin-on) are widely considered the best part of the chicken
for oven roasting: the dark meat has more fat and collagen, stays moist at higher
temperatures, and produces exceptional crispy skin. Unlike breast, chicken thighs
benefit from cooking to 170-175°F / 77-79°C (above USDA minimum of 165°F/74°C)
because the additional temperature converts collagen to gelatin, producing a more
tender, succulent result. Oven at 400-425°F / 200-220°C for 35-45 minutes.

## Source recipes

### 1. J. Kenji López-Alt — The Best Crispy Oven-Baked Chicken Thighs (Serious Eats)
- **Source**: seriouseats.com/crispy-baked-chicken-thighs
- **Method**: Cold pan start (not hot oven), skin-side down in ovenproof skillet,
  375°F oven 40-45 min. Flip for final 5 min.
- **Target**: **170-175°F / 77-79°C** at thickest point — "thighs benefit from
  going past 165°F, the extra 10°F converts collagen"
- **Note**: Kenji's cold-pan start renders maximum fat from the skin before
  crisping; the fat renders more efficiently when starting in a cold pan.

### 2. Thomas Keller — Pan-Roasted Chicken Thighs (Ad Hoc at Home)
- **Source**: Ad Hoc at Home (Workman)
- **Method**: Season, sear skin-side down in ovenproof pan, oven 375°F 25-30 min.
- **Target**: **165-170°F / 74-77°C** at bone — juices clear at bone

### 3. Leila Lindholm — Ugnsrostade kycklinglår (leila.se / Arla)
- **Source**: leila.se/recept
- **Method**: Herb oil rub, 200°C oven 35-40 min, last 10 min increased to 220°C
  for skin crisping.
- **Target**: **74°C** minimum at thickest (Swedish standard — thigh dark meat
  can be taken to 80°C without drying, unlike breast)

### 4. Samin Nosrat — Crispy Chicken Thighs (Salt Fat Acid Heat)
- **Source**: Salt Fat Acid Heat (Simon & Schuster)
- **Method**: Salt overnight, high oven 425°F, skin-side down on rack, 35-40 min.
- **Target**: **165-170°F / 74-77°C** — juices run clear at bone

### 5. Gordon Ramsay — Roasted Chicken Thighs (Ramsay's Home Cooking)
- **Source**: gordonramsay.com
- **Method**: Season, skin-on, 200°C oven 35-40 min.
- **Target**: **165-170°F / 74-77°C** at bone

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA minimum | 165°F / 74°C | Safe standard |
| USA / Kenji / Nosrat | 170-175°F / 77-79°C | Preferred for texture |
| Sweden | 74°C minimum | Standard guidance |
| Thomas Keller | 165-170°F / 74-77°C | Professional kitchen |
| Gordon Ramsay | 165-170°F / 74-77°C | Restaurant standard |

**Preferred culinary target: 170-175°F / 77-79°C (above USDA minimum).**
This converts collagen for a more tender, succulent result in dark meat.
Maps to `well_done` in poultry doneness.

## What makes this method special
Chicken thigh at 175°F/79°C is one of the rare cases where cooking above the USDA
minimum actually IMPROVES the result — the dark meat collagen converts to gelatin
between 165°F and 180°F, creating the "juicy yet firm" texture that makes chicken
thighs universally preferred over breast by professional cooks.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `grill`, `air_fryer`, `pan_fry`, `braise`
- `recommended_doneness`: `"well_done"` (170-175°F / 77-79°C preferred)
