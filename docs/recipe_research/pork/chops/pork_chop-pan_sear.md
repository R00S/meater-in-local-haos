# Pork Chop × Pan Sear — Recipe Temperature Research

## Cut profile
Pan searing pork chops differs from pan frying in intensity: a very hot pan (450-500°F
surface) creates a thick mahogany crust in 2 minutes per side, then the heat is reduced
or the chop moves to a 400°F oven to finish. This reverse-sear or sear-and-finish
approach is ideal for thick bone-in chops (1.5 in / 38 mm).

## Source recipes

### 1. J. Kenji López-Alt — Pan-Seared Thick-Cut Pork Chops (Serious Eats)
- **Source**: seriouseats.com/pan-seared-thick-cut-bone-in-pork-chops
- **Method**: Dry-brine overnight, screaming-hot cast iron 2 min per side, finish in
  400°F oven to 140°F internal. Rest 5 min.
- **Target**: **140°F / 60°C** pull; **145°F / 63°C** after 5-min rest
- **Note**: Reverse sear prevents overcooked grey band around the exterior.

### 2. Gordon Ramsay — Seared Pork Chop with Apple Sauce (Gordon Ramsay Restaurants)
- **Source**: gordonramsay.com/gr/recipes
- **Method**: Hot pan with oil, sear 2 min each side plus fat cap, then oven 4-5 min at
  200°C. Rest 5 min.
- **Target**: **65-68°C** at centre after rest
- **Note**: Ramsay's approach emphasises rendering the fat cap vertical in the pan
  before searing the flat faces.

### 3. Thomas Keller — Pork Chop Brine & Sear (Ad Hoc at Home)
- **Source**: Ad Hoc at Home cookbook (workman.com)
- **Method**: 8-hour brine, pat dry, clarified butter in carbon-steel pan, sear 3 min
  per side, oven finish at 375°F to 138-140°F. Rest 10 min.
- **Target**: **138-140°F / 59-60°C** pull; 145°F/63°C after rest
- **Note**: Brining dramatically reduces moisture loss at any given final temperature.

### 4. Swedish tradition — Pannstekt fläskkotlett (Allt om Mat / Hemmets Journal)
- **Source**: alltommat.se · hemmetsjurnal.se
- **Method**: Rapeseed oil, high heat, 2-3 min per side, reduce heat, cover loose 3 min.
- **Target**: **68-70°C** at thickest point (Swedish preference for fully safe pork)
- **Note**: Swedish recipes uniformly target higher internal temp than US/French for
  consumer safety margin, especially for bone-in cuts.

### 5. Francis Mallmann — Chuleta de cerdo a la plancha (Seven Fires)
- **Source**: Seven Fires cookbook (Artisan Books)
- **Method**: Cast-iron plancha or griddle, high heat, coarse salt only. 3 min per side.
- **Target**: **63-65°C** at centre after 3-min rest
- **Note**: Argentine approach uses intense dry heat with no fat, relying on the
  natural pork fat for basting.

## Temperature consensus

| Tradition | Pull temp | Final serving temp |
|-----------|-----------|-------------------|
| USA / Serious Eats / Keller | 140°F/60°C | 145°F/63°C |
| Gordon Ramsay | — | 65-68°C |
| Sweden | — | 68-70°C |
| Argentina (Mallmann) | — | 63-65°C |

**Consensus: 63-68°C final serving temp.** Maps to `medium` (63-68°C) in pork doneness.

## What makes this method special
High-heat searing creates the deepest Maillard crust available for pork, adding
caramelised sugars and rendered fat flavour to the exterior. An oven finish prevents
the hard overcooked exterior that comes from cooking thick chops entirely on the stove.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (global consensus 63-68°C)
