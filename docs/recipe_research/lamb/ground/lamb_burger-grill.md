# Lamb Burger × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Lamb burgers are a flavourful alternative to beef — the higher fat content of lamb
(typically 20-25%) produces a juicy, aromatic burger. Because they are ground meat,
USDA requires 160°F / 71°C internal temperature. The distinctive lamb flavour pairs
naturally with Mediterranean toppings (tzatziki, feta, tomatoes). Target: 160°F /
71°C for full safety, which for a lamb burger is still juicy due to the higher fat.

## Source recipes

### 1. Yotam Ottolenghi — Lamb Burgers (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Za'atar + onion + coriander, hot grill, 4-5 min per side.
- **Target**: **160°F / 71°C** — "well-done but juicy with lamb fat"

### 2. J. Kenji López-Alt — Lamb Burger (Serious Eats)
- **Source**: seriouseats.com
- **Method**: 20% fat ground lamb, 3/4 inch patty, grill 4-5 min per side.
- **Target**: **160°F / 71°C** (USDA ground meat)

### 3. Gordon Ramsay — Lamb Burger (Kitchen)
- **Source**: gordonramsay.com
- **Method**: Season with cumin + coriander, medium-high grill, 4-5 min per side.
- **Target**: **160°F / 71°C**

### 4. Leila Lindholm — Lammhamburgare (leila.se)
- **Source**: leila.se/recept
- **Method**: Kryddat lammfärs, grill medium-hög, 4-5 min per sida.
- **Target**: **70-72°C**

### 5. Rick Stein — Lamb Kebab/Burger (Mediterranean Escapes)
- **Source**: Rick Stein's Mediterranean Escapes (BBC Books)
- **Method**: Ground lamb + herbs, grill 4-5 min per side.
- **Target**: **71°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA | 160°F / 71°C | Ground meat mandatory |
| Sweden | 70-72°C | |
| UK / all | 71-74°C | "Fully cooked" |

**Consensus: 160°F / 71°C.** Maps to `well_done` in lamb doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `grill`, `pan_fry`
- `recommended_doneness`: `"well_done"` (160°F/71°C ground meat safety)
