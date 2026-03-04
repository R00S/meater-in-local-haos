# Ground Lamb × Pan Fry — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Ground lamb is used for Middle Eastern kofta, Greek moussaka, British shepherd's pie,
and as a burger substitute. Like all ground meat, USDA requires 160°F / 71°C for
food safety. Ground lamb is fattier than ground beef (typically 20-25% fat), producing
a rich, aromatic mince with distinctive lamb flavour. Pan-frying in a hot skillet
for 5-8 minutes produces browned, richly flavoured crumbles.

## Source recipes

### 1. Yotam Ottolenghi — Spiced Ground Lamb (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Spiced ground lamb (cumin + coriander + cinnamon + allspice),
  hot pan 5-8 min until browned and cooked through.
- **Target**: **160°F / 71°C** (fully cooked for mince)

### 2. Gordon Ramsay — Ground Lamb for Shepherd's Pie
- **Source**: gordonramsay.com
- **Method**: Medium-high heat, brown then simmer in sauce.
- **Target**: **160°F / 71°C**

### 3. J. Kenji López-Alt — Lamb Mince (Serious Eats)
- **Source**: seriouseats.com
- **Method**: High heat, fat renders, press and don't move for 2 min for crust.
- **Target**: **160°F / 71°C** (USDA ground meat)

### 4. Leila Lindholm — Stekt lammfärs (leila.se)
- **Source**: leila.se/recept
- **Method**: Medelhög värme, 5-8 min, bryn väl.
- **Target**: **70-72°C**

### 5. Rick Stein — Greek Lamb Mince (Mediterranean Escapes)
- **Source**: Rick Stein's Mediterranean Escapes (BBC Books)
- **Method**: Olive oil, high heat, 5-8 min.
- **Target**: **160°F / 71°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA | 160°F / 71°C | Ground meat mandatory |
| Sweden | 70-72°C | |
| UK / all | 71-74°C | "Fully cooked" |

**Consensus: 160°F / 71°C (USDA ground meat standard).**
Maps to `well_done` in lamb doneness (ground meat safety).

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `grill`
- `recommended_doneness`: `"well_done"` (160°F/71°C ground meat safety)
