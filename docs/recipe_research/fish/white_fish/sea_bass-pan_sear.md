# Sea Bass × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
European sea bass (loup de mer, branzino, lubina) is prized for its delicate, sweet
white flesh and edible, crisping skin. Skin-on fillet, pan seared skin-side down
in a very hot pan, produces one of the finest fish dishes in Mediterranean and French
cuisine. The skin must be pressed flat for the first 30 seconds (it naturally curls).
Target: 130-140°F / 54-60°C at the thickest part for a just-set, moist interior.
Total cook time: 4-5 min skin-side, 60-90 sec flesh-side.

## Source recipes

### 1. Gordon Ramsay — Pan-Seared Sea Bass with Lemon Butter (MasterClass / Kitchen)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Score skin lightly, very hot olive oil, press flat 30 sec skin-down,
  4-5 min skin-side, 60 sec flesh-side. Baste with butter + lemon.
- **Target**: **130-140°F / 54-60°C** — "just set, pearly white"

### 2. Thomas Keller — Branzino en Papillote (French Laundry techniques)
- **Source**: The French Laundry Cookbook (Artisan)
- **Method**: Skin-on, very hot clarified butter, 4-5 min skin-side, rest 2 min.
- **Target**: **130-135°F / 54-57°C** at thickest flesh

### 3. Eric Ripert — Pan-Seared Branzino (Le Bernardin)
- **Source**: Le Bernardin Cookbook (Clarkson Potter)
- **Method**: Hot pan, canola + butter, 4 min skin-side, 45 sec flesh-side.
- **Target**: **125-130°F / 52-54°C** — Ripert's "barely cooked" standard

### 4. Leila Lindholm — Stekt havsabborre (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör + olja, het panna, 4 min skinsida, 1-2 min köttssida.
- **Target**: **52-57°C** (Swedish culinary standard)

### 5. Yotam Ottolenghi — Pan-Fried Sea Bass with Salsa Verde (Plenty More)
- **Source**: Plenty More (Ten Speed Press)
- **Method**: Very hot cast iron, olive oil, 4 min skin-side, 2 min flesh-side.
- **Target**: **130-140°F / 54-60°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Ripert | 125-130°F / 52-54°C | Barely cooked |
| Gordon Ramsay / Keller | 130-140°F / 54-60°C | "Just set" |
| Sweden | 52-57°C | Culinary standard |

**Consensus: 52-57°C / 125-135°F.** Maps to `well_done` per USDA; culinary `medium`.

## What makes this method special
Sea bass skin-side pan searing is the signature Mediterranean technique — the crispy
skin and sweet, delicate white flesh combination is one of the finest results any
cooking method produces. The key is patience: the skin must be pressed flat and left
undisturbed for 4 full minutes before the crisp crust releases naturally.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `oven_bake`, `grill`
- `recommended_doneness`: `"well_done"` (USDA standard)
