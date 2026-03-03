# Pork Sausage × Pan Fry — Recipe Temperature Research

## Cut profile
Fresh pork sausages (bratwurst, bangers, Italian sausage, merguez) are ground pork
(or mixed meat) in casings. Internal fat and seasoning make them self-basting during
cooking. USDA requires 160°F / 71°C for ground pork products because grinding
distributes surface bacteria throughout the meat. Pan frying in a covered pan over
medium heat (300-325°F / 150-163°C surface) for 12-15 minutes allows the exterior
to brown without bursting the casing.

## Source recipes

### 1. J. Kenji López-Alt — How to Cook Sausage (Serious Eats)
- **Source**: seriouseats.com/the-best-way-to-cook-sausages
- **Method**: Add sausages + 6mm water to pan, cook covered medium heat until water
  evaporates (8 min), then brown uncovered 3-5 min. Internal to 160°F / 71°C.
- **Target**: **160°F / 71°C** internal
- **Note**: Water steam prevents casing burst from direct heat shock while allowing
  internal temp to rise. Browning only starts once water evaporates.

### 2. Gordon Ramsay — Pan-Fried Sausages (Ramsay's Kitchen Nightmares / Home Cooking)
- **Source**: gordonramsay.com
- **Method**: Medium heat, 3-4 tbsp oil, turn every 2-3 min, 12-15 min total.
  Internal to 160°F / 71°C.
- **Target**: **160-165°F / 71-74°C**
- **Note**: Ramsay emphasises low-to-medium heat — blasting sausages on high heat
  produces burnt casing and raw centre (a common mistake).

### 3. Leila Lindholm — Stekta korvar (leila.se / ICA)
- **Source**: leila.se/recept · ica.se
- **Method**: Medium heat with butter, turn every 2 min, 10-12 min total for thin
  Swedish falukorv-style sausage.
- **Target**: **70-72°C** (Swedish standard for all pork products including sausage)
- **Note**: Swedish thick sausages (falukorv, prinskorv) require probe verification
  since the casing hides the interior colour.

### 4. Hank Shaw — Wild Sausage Pan-Fry (Hunter Angler Gardener Cook)
- **Source**: honest-food.net/pan-fry-sausage
- **Method**: Medium-low heat, covered first 10 min, uncover to brown 5 min.
  Always probe — visual cues unreliable for game sausages.
- **Target**: **160°F / 71°C** (game sausage standard same as pork)
- **Note**: Shaw points out that game/pork sausages must always be probed because
  casing colour and texture provide no reliable doneness cue.

### 5. Raymond Blanc — Saucisses à la lyonnaise (Raymond Blanc Kitchen Secrets)
- **Source**: bbc.co.uk/food/raymond_blanc
- **Method**: Butter + oil, medium heat, 3-4 min per side then reduce, 15 min total.
- **Target**: **72-75°C** at centre (French standard for saucisse fraîche)
- **Note**: French tradition targets slightly above USDA to compensate for thicker
  sausage casings used in French charcuterie.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Kenji | 160°F / 71°C | Ground pork standard |
| Sweden (Livsmedelsverket) | 70-72°C | Swedish pork/sausage standard |
| UK / France | 72-75°C | Slightly above USDA |

**Consensus: 71-74°C (160-165°F).** Maps to `well_done` in pork doneness range
(ground/sausage always cooked fully through).

## What makes this method special
Pan frying with the water-steam technique is the safest method for sausages
because it raises the internal temperature gently before the exterior browns,
eliminating the risk of a charred casing over a raw interior that comes from
starting in a too-hot dry pan.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `grill`
- `recommended_doneness`: `"well_done"` (ground pork 160°F USDA minimum)
