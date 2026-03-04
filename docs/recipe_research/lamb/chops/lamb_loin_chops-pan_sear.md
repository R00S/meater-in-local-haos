# Lamb Loin Chops × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Lamb loin chops are double-cut chops from the saddle — like a T-bone steak in lamb,
with a loin section on one side of the bone and a smaller filet section on the other.
They are among the most luxurious lamb cuts. Pan searing at high heat for 3-4 minutes
per side develops a deep golden crust while keeping the interior pink at 130-135°F /
54-57°C (medium-rare). Thicker than rib chops — 2.5-3 cm.

## Source recipes

### 1. Thomas Keller — Pan-Seared Lamb Loin Chops (Bouchon)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Season generously, clarified butter, very hot pan, 3-4 min per side.
  Garlic + thyme + rosemary baste last 2 min. Rest 5 min.
- **Target**: **130-135°F / 54-57°C** medium-rare

### 2. Gordon Ramsay — Lamb Loin Chops (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Medium-high heat, butter + rosemary, 3-4 min per side.
- **Target**: **130-140°F / 54-60°C**

### 3. J. Kenji López-Alt — Lamb Loin Chops (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Cast iron, high heat, 3 min per side. Butter + garlic baste.
- **Target**: **130-135°F / 54-57°C**

### 4. Leila Lindholm — Stekta lammkotletter (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör, het gjutjärnspanna, 3-4 min per sida.
- **Target**: **57-60°C** — "rosa"

### 5. Yotam Ottolenghi — Pan-Seared Lamb Loin Chops
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Za'atar + garlic rubbed, medium-high heat, 3 min per side.
- **Target**: **130-140°F / 54-60°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| France / Keller | 130-135°F / 54-57°C | Medium-rare |
| UK / Ramsay / Ottolenghi | 130-140°F / 54-60°C | Medium-rare to medium |
| Sweden | 57-60°C | "Rosa" |
| USDA | 145°F / 63°C | Minimum safe |

**Consensus: 130-135°F / 54-57°C medium-rare.** Maps to `medium_rare` in lamb doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`
- `recommended_doneness`: `"medium_rare"` (54-57°C canonical)
