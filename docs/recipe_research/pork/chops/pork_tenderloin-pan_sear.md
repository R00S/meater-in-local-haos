# Pork Tenderloin × Pan Sear (+ Oven Finish) — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Pork tenderloin is the most tender, leanest cut on the pig — a narrow tapered muscle
(300-450 g / 10-16 oz) that runs along the inner backbone. It cooks extremely fast
and dries out quickly above 155°F / 68°C. The classic method: sear all sides in a
very hot ovenproof pan (2-3 min), then finish in a 400°F / 200°C oven to an internal
of 140-145°F / 60-63°C. Rest is essential — this lean cut loses more than 5% moisture
if sliced immediately.

## Source recipes

### 1. J. Kenji López-Alt — Pan-Seared Pork Tenderloin (Serious Eats)
- **Source**: seriouseats.com/pan-seared-pork-tenderloin-recipe
- **Method**: Season, high-heat cast iron, roll continuously for 6-8 min, finish in
  oven at 375°F to 140°F internal. Rest 5-10 min.
- **Target**: **140°F / 60°C** pull; **145°F / 63°C** after rest
- **Note**: Kenji's "rolling" technique avoids flat spots and gives an even crust around
  the full circumference of the cylinder.

### 2. Gordon Ramsay — Herb-Crusted Pork Tenderloin (Gordon Ramsay Restaurants / YouTube)
- **Source**: gordonramsayrestaurants.com
- **Method**: Roll in mustard + herb crust, sear all sides in butter 3-4 min, oven
  200°C for 10-12 min. Rest 5 min.
- **Target**: **63-65°C** at thickest point (slight pink interior)
- **Note**: Herb-mustard crust adds flavour but also slightly insulates, so oven time
  may need 2-3 extra minutes.

### 3. Leila Lindholm — Ugnsfilé av fläsk (leila.se / Koket.se)
- **Source**: leila.se/recept · koket.se
- **Method**: Sear in butter 3-4 min all sides, wrap in prosciutto optional, oven 200°C
  10-15 min to 68°C. Rest 5 min.
- **Target**: **68°C** (Swedish standard for pork fillet)
- **Note**: Prosciutto wrap adds salt and fat, helping keep the tenderloin moist while
  reaching the slightly higher Swedish standard.

### 4. Thomas Keller — Herb-Brined Pork Tenderloin (Bouchon Bistro / Per Se)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: 4-hour brine, sear in clarified butter, oven 350°F to 138-140°F. Rest 8 min.
- **Target**: **138-140°F / 59-60°C** pull; 145°F/63°C after rest
- **Note**: Keller's brine technique makes the final temperature range wider without
  drying — brined pork at 63°C still feels moist.

### 5. Hank Shaw — Wild-Pork Tenderloin Method (honest-food.net)
- **Source**: honest-food.net/pork-tenderloin
- **Method**: Trim silver skin completely, sear 2 min all sides, oven finish at 350°F.
  Do NOT overcook — this is the pig's most tender cut.
- **Target**: **140-145°F / 60-63°C** pull temp, never exceed 150°F/66°C
- **Note**: Shaw emphasises that pork tenderloin dries faster than almost any other
  cut — the lean muscle has almost no intramuscular fat to provide moisture.

## Temperature consensus

| Tradition | Pull temp | Final serving temp |
|-----------|-----------|-------------------|
| USA / Kenji / Keller / Shaw | 138-140°F/59-60°C | 145°F/63°C |
| Gordon Ramsay | — | 63-65°C |
| Sweden (Leila / ICA) | — | 68°C |

**Consensus: 63-68°C final, never over 70°C.** Maps to `medium` in pork doneness.

## What makes this method special
Pan searing all sides of pork tenderloin gives a deep mahogany crust on a cut that
would otherwise emerge from the oven pale and under-caramelised. The oven finish
brings the interior up gently and evenly, preventing the overcooked grey ring that
results from finishing the entire cook in the pan.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `oven_roast`, `grill`, `air_fryer`, `sous_vide`
- `recommended_doneness`: `"medium"` (global consensus 63°C)
