# Prime Rib × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Prime rib (standing rib roast) is the king of beef roasts — 2-7 bones of rib-eye
roast weighing 2-7 kg / 4-15 lb. The goal: a deep brown crust over a uniformly
medium-rare interior (57°C / 135°F) throughout the entire roast, with no grey band.
The reverse-sear method (low 250°F / 120°C oven then blast at 500°F / 260°C) has
largely replaced traditional high-heat-first methods in professional kitchens
because it produces a 100% edge-to-edge medium-rare result.

## Source recipes

### 1. J. Kenji López-Alt — Reverse-Sear Prime Rib (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-best-prime-rib-recipe
- **Method**: Season 1-3 days, oven 250°F / 120°C to 120°F / 49°C pull, rest 30 min,
  blast 500°F / 260°C for 15 min for crust.
- **Target**: **120-125°F / 49-52°C** pull; **130-135°F / 54-57°C** final after blast
- **Note**: Kenji's reverse-sear is now the definitive prime rib method — the
  250°F oven produces a completely even gradient with zero grey band.

### 2. Thomas Keller — Standing Rib Roast (Ad Hoc at Home / Bouchon)
- **Source**: Ad Hoc at Home (Workman)
- **Method**: Season generously, sear in hot pan, roast 400°F / 200°C to 130°F / 54°C.
  Rest 30-45 min tented.
- **Target**: **130-135°F / 54-57°C** at thickest point after rest

### 3. Leila Lindholm — Rostbiff / Revbensstek (leila.se)
- **Source**: leila.se/recept
- **Method**: Season + sear, oven 125°C / 260°F low-and-slow to 58-60°C.
  Rest 20-30 min.
- **Target**: **58-60°C** (Swedish "rosa" standard for roast beef)

### 4. Heston Blumenthal — Perfect Roast Prime Rib (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: 60°C / 140°F oven for 5-8 hours. Final temperature IS bath temperature.
  Blast at 250°C / 480°F for 30 min for crust.
- **Target**: **57-60°C / 135-140°F** at thickest point

### 5. Gordon Ramsay — Perfect Roast Rib of Beef (Kitchen / Ramsay's Best Menus)
- **Source**: gordonramsay.com
- **Method**: Season generously, sear, 220°C / 425°F for 20 min then 160°C for 20 min
  per 500 g. Rest 20-30 min.
- **Target**: **57-60°C / 135-140°F** at thickest after rest

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller | 130-135°F / 54-57°C | Reverse-sear standard |
| Sweden / Leila | 58-60°C | "Rosa" roast beef |
| Heston Blumenthal | 57-60°C | Low-oven standard |
| Gordon Ramsay | 57-60°C | Restaurant standard |

**Consensus: 57-60°C / 135-140°F medium-rare.** Maps to `medium_rare` in beef doneness.

## What makes this method special
Prime rib is the grandest beef roast — a multi-bone, multi-kilogram centrepiece that
feeds a table. The reverse-sear method transformed prime rib cookery by eliminating
the grey band that plagued traditional high-heat methods. An edge-to-edge pink prime
rib is a technical achievement as much as a culinary one.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`
- `recommended_doneness`: `"medium_rare"` (57-60°C consensus)
