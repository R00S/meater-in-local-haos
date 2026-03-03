# Pork Chop × Pan Fry — Recipe Temperature Research

## Cut profile
Pork chops are cross-sectional cuts from the loin running along the pig's spine.
They can be bone-in (more flavour) or boneless (faster cooking). Pan frying in
moderate oil over medium-high heat produces a golden crust while keeping the
interior juicy at the USDA minimum of 145°F/63°C + 3-minute rest.
Thickness is critical: 1-inch / 25 mm chops cook evenly without drying.

## Source recipes

### 1. J. Kenji López-Alt — The Food Lab Pork Chops (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-the-case-for-well-done-juicy-pork
- **Method**: Dry-brine 45 min, cast-iron medium-high, 3-4 min per side, rest 5 min.
- **Target**: **140-145°F / 60-63°C** pull (USDA 145°F with 3-min rest achieves safe pink centre)
- **Note**: Argues pink pork is safe at 145°F — modern standard since 2011 USDA revision.

### 2. America's Test Kitchen — Perfect Pan-Fried Pork Chops
- **Source**: cooks.com / americastestkitchen.com
- **Method**: Pat dry, season, 2 Tbsp oil in stainless, medium-high. Sear 3-4 min per
  side. Rest on rack 5 min.
- **Target**: **145°F / 63°C** at thickest point
- **Note**: Recommends reverse sear for thick (≥1.5 in) chops.

### 3. Leila Lindholm — Stekt kotlett (leila.se / ICA)
- **Source**: leila.se/recept · ica.se/recept
- **Method**: Smör + lite olja (butter + oil), medium heat, 3-4 min per side.
- **Target**: **68°C** (Swedish food standard — slightly above USDA minimum for visible
  white but still juicy interior)
- **Note**: Swedish tradition prefers slightly firmer pork for food-safety confidence.

### 4. Raymond Blanc — Côtelette de porc à la moutarde (Raymond Blanc Kitchen Secrets)
- **Source**: raymondblanc.com / bbc.co.uk/food/raymond_blanc
- **Method**: Mustard + herb crust, clarified butter, medium heat 4 min per side.
  Rest 3-5 min tented.
- **Target**: **62-65°C** at centre
- **Note**: French tradition allows slightly lower temp than USDA, relying on 3-5 min
  rest and carryover to reach 63°C serving temperature.

### 5. Hank Shaw — Wild-game-style pork chop (Hunter Angler Gardener Cook)
- **Source**: honest-food.net/pan-fried-pork-chops
- **Method**: Cast iron, high heat initially then reduced, baste with pan drippings.
- **Target**: **140-145°F / 60-63°C** pull temp
- **Note**: Emphasises not overcooking lean pork — resting is essential for juice
  redistribution.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Serious Eats | 145°F / 63°C | With 3-min rest — safe pink interior |
| Sweden (Livsmedelsverket) | 68°C | Slightly higher for consumer safety confidence |
| France (Blanc) | 62-65°C | Rest-temp method, similar to USDA |
| UK / BBC Good Food | 63-70°C | Range accounts for bone-in vs boneless |

**Consensus: 63-68°C final serving temperature.** Maps to `medium` in our pork doneness range.

## What makes this method special
Pan frying pork chops in a neutral oil + butter combination gives the Maillard crust
depth of a restaurant finish without drying the lean loin meat. Moderate heat (vs
screaming-hot sear) allows carryover to finish the job without overshooting.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `pan_sear`, `grill`, `charcoal_grill`, `oven_roast`, `air_fryer`
- `recommended_doneness`: `"medium"` (USDA 63°C consensus)
