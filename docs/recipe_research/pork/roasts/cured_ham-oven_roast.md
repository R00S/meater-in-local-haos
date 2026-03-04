# Cured Ham × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Cured ham (including gammon, glazed ham, Schinken) is pre-cured pork leg — already
treated with salt, sugar, and (usually) nitrite. Unlike fresh pork, cured ham is safe
to eat cold from the package. Oven roasting refers to heating a pre-cooked (smoked or
boiled) cured ham to an internal temperature of 140°F / 60°C throughout, with a glaze
applied in the final 30-45 minutes to caramelise. This is the Christmas/Easter ham.

## Source recipes

### 1. Leila Lindholm — Julskinka (leila.se) — Swedish Christmas Ham
- **Source**: leila.se/recept
- **Method**: Boil or steam ham to 74°C, cool, coat with mustard + breadcrumbs +
  egg wash, oven at 225°C for 20-25 min until golden.
- **Target**: **74°C** (post-braise internal); glaze step brings surface to golden

### 2. Nigel Slater — Glazed Christmas Ham (Nigella / Guardian)
- **Source**: The Kitchen Diaries (Fourth Estate)
- **Method**: Boil ham 3-4 hours, peel skin, score, honey + mustard glaze, oven
  190°C 35-40 min.
- **Target**: **140-145°F / 60-63°C** at centre (for glazing warmth)

### 3. Nigella Lawson — Magnificent Molasses Glazed Ham (Feast)
- **Source**: Feast (Chatto & Windus)
- **Method**: Simmer in cola 3-4 hours, score, molasses + mustard glaze, oven
  240°C 30 min.
- **Target**: **140°F / 60°C** at centre when glaze is done

### 4. Gordon Ramsay — Honey-Glazed Ham
- **Source**: gordonramsay.com
- **Method**: Steam/boil, then oven 200°C with honey + mustard glaze 30-40 min.
- **Target**: **60-65°C** at centre

### 5. USA USDA ham guidelines
- **Source**: usda.gov/food-safety
- **Method**: Pre-cooked ham reheating standard.
- **Target**: **140°F / 60°C** throughout (pre-cooked ham; 165°F for raw/fresh ham)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Sweden / Leila (julskinka) | 74°C (boil) + golden glaze | Post-braise |
| UK / Nigella / Ramsay | 60-65°C | Reheating standard |
| USA / USDA | 140°F / 60°C | Pre-cooked ham reheating |

**Consensus: 60-65°C / 140-149°F for reheating pre-cooked cured ham.**
Maps to `well_done` in pork doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`
- `recommended_doneness`: `"well_done"` (60-65°C reheat to safe serving temp)
