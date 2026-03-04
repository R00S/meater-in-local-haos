# Lamb Cutlet × Pan Fry — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Lamb cutlets are frenched rib chops — individual ribs from the rack, with the bone
exposed. They are thin (1-2 cm thick) and cook extremely fast: 2-3 minutes per side
in a very hot pan. Because they are thin, they reach medium-rare (130-135°F / 54-57°C)
quickly. Over-resting or slow cooking at lower temperature will result in medium to
well-done before you know it. Speed is essential.

## Source recipes

### 1. Gordon Ramsay — Pan-Fried Lamb Cutlets (Kitchen)
- **Source**: gordonramsay.com
- **Method**: Very hot pan, olive oil + butter, 2-3 min per side. Herb finish.
- **Target**: **130-135°F / 54-57°C** at thickest (between rack eye and rib)

### 2. Yotam Ottolenghi — Lamb Cutlets (Plenty More)
- **Source**: Plenty More (Ten Speed Press)
- **Method**: Herb rub, hot pan or plancha, 2-3 min per side.
- **Target**: **130-140°F / 54-60°C** — "pink at centre"

### 3. Thomas Keller — Côtelettes d'Agneau (French Laundry)
- **Source**: The French Laundry Cookbook (Artisan)
- **Method**: Clarified butter, very high heat, 2 min per side. Rosemary jus.
- **Target**: **125-130°F / 52-54°C** — Keller's rare standard

### 4. Leila Lindholm — Lammkotletter (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör, het panna, 2-3 min per sida.
- **Target**: **57-60°C** at thickest

### 5. J. Kenji López-Alt — Lamb Cutlets (Serious Eats)
- **Source**: seriouseats.com
- **Method**: High-heat cast iron, 2 min per side. Fast — thin chops overcook fast.
- **Target**: **130-135°F / 54-57°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| France / Keller | 125-130°F / 52-54°C | Rare to medium-rare |
| UK / Ramsay / Ottolenghi | 130-140°F / 54-60°C | Medium-rare |
| USA / Kenji | 130-135°F / 54-57°C | Medium-rare |
| Sweden | 57-60°C | "Rosa" |

**Consensus: 130-135°F / 54-57°C medium-rare.** Maps to `medium_rare` in lamb doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `grill`
- `recommended_doneness`: `"medium_rare"` (54-57°C consensus)
