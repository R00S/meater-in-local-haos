# Ground Pork × Pan Fry — Recipe Temperature Research

## Cut profile
Ground pork (minced pork) is used in dumplings, meatballs, bolognese, Asian stir-fries,
and as a standalone protein. Like all ground meats, USDA requires 160°F / 71°C —
grinding distributes surface bacteria throughout. Ground pork is fattier than ground
beef (typically 20-30% fat), which means it stays juicy even when fully cooked.
Pan-fried ground pork in a hot skillet takes 5-8 minutes to brown and reach 160°F.

## Source recipes

### 1. J. Kenji López-Alt — Crispy Ground Pork (Serious Eats / The Wok)
- **Source**: seriouseats.com / The Wok (W.W. Norton)
- **Method**: High-heat wok or skillet, press pork flat and don't stir for 2 min
  to develop crust, then break and continue cooking.
- **Target**: **160°F / 71°C** throughout

### 2. Momofuku (David Chang) — Pork Mince for Bao (Momofuku)
- **Source**: Momofuku cookbook (Clarkson Potter)
- **Method**: Wok or skillet, very high heat, cook until all pink is gone.
- **Target**: **165°F / 74°C** (Chang cooks pork through completely for bao filling)

### 3. Leila Lindholm — Stekt köttfärs (fläsk) (leila.se)
- **Source**: leila.se/recept
- **Method**: Medium-high heat, 5-8 min, bryn väl.
- **Target**: **70-72°C** (Swedish ground pork standard)

### 4. Rick Stein — Chinese Steamed Pork Dumplings filling
- **Source**: Rick Stein's Far Eastern Odyssey (BBC Books)
- **Method**: Ground pork cooked in skillet to 160°F before using as filling.
- **Target**: **160°F / 71°C**

### 5. USDA Ground Meat Guidelines
- **Source**: usda.gov/food-safety
- **Target**: **160°F / 71°C** — mandatory for all ground pork

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA | 160°F / 71°C | Ground meat mandatory |
| Sweden | 70-72°C | Ground meat standard |
| Momofuku | 165°F / 74°C | Full cook for fillings |

**Consensus: 160°F / 71°C (USDA ground pork standard).**
Maps to `well_done` in pork doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `braise`
- `recommended_doneness`: `"well_done"` (160°F/71°C ground meat safety)
