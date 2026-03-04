# Chicken Breast × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Chicken breast is the most widely cooked poultry cut globally — boneless, skinless
or skin-on, it cooks in 12-15 minutes in a medium-high pan. USDA requires 165°F /
74°C. Modern food-science cooking targets 155-160°F / 68-71°C with a 3-5 minute
rest (pasteurisation by time-temperature at 155°F is equivalent to instantaneous
165°F per FDA tables). The challenge: chicken breast overcooks rapidly above 165°F,
becoming dry and chalky. The culinary consensus is "as close to 165°F as possible
without exceeding it."

## Source recipes

### 1. J. Kenji López-Alt — Perfect Pan-Seared Chicken Breast (Serious Eats)
- **Source**: seriouseats.com/pan-seared-chicken-breast-recipe
- **Method**: Pound to even thickness, medium heat, 6-7 min skin-side, flip 3-4 min.
  Rest 5 min.
- **Target**: **155-160°F / 68-71°C** — "juicy, with carryover to 165°F"
- **Note**: Kenji cites FDA time-temperature pasteurisation tables: at 155°F/68°C
  held for 15 seconds, chicken is safe. 165°F is instantaneous safety.

### 2. Thomas Keller — Pan-Roasted Chicken Breast (Bouchon Bistro)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Skin-on, medium heat, 6-8 min skin-side, oven finish 375°F 5 min.
- **Target**: **160-165°F / 71-74°C** at thickest point

### 3. Leila Lindholm — Stekt kycklingbröst (leila.se / Arla)
- **Source**: leila.se/recept
- **Method**: Medium heat butter + oil, 5-6 min per side, rest 3-5 min.
- **Target**: **74°C** (Swedish poultry standard)

### 4. Gordon Ramsay — Pan-Seared Chicken Breast (MasterClass)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Skin-on, hot pan, skin-side first 5-6 min, flip 4-5 min.
- **Target**: **165°F / 74°C** at thickest point — "juices run clear"

### 5. Heston Blumenthal — Perfect Chicken Breast (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: Brine 2 hours, pat dry, medium-low heat 8-10 min per side, rest 5 min.
- **Target**: **155-160°F / 68-71°C** pull (pasteurised by time-temperature)
- **Note**: Blumenthal's low-and-slow approach produces the most tender, moist
  breast but sacrifices some crust development compared to medium-high heat.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Ramsay | 165°F / 74°C | Instantaneous safe standard |
| USA / Kenji / Blumenthal | 155-160°F / 68-71°C | Time-temp pasteurisation |
| Sweden (Livsmedelsverket) | 74°C | Aligns with USDA |
| Thomas Keller | 160-165°F / 71-74°C | French professional |

**Consensus: 165°F / 74°C (165°F target, never below 155°F).**
Maps to `well_done` in poultry doneness. There is no medium-rare chicken.

## What makes this method special
Pan searing chicken breast with skin delivers the crispiest skin possible on the
most widely eaten boneless poultry cut. The key is medium heat (not screaming hot)
and patience — 6-8 minutes skin-side without moving allows the skin to render and
crisp without burning the breast below.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `pan_fry`, `oven_bake`, `grill`, `air_fryer`, `sous_vide`, `poach`
- `recommended_doneness`: `"well_done"` (165°F/74°C USDA universal)
