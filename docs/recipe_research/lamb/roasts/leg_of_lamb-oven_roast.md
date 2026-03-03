# Leg of Lamb × Oven Roast — Recipe Temperature Research

## Cut profile
Leg of lamb (gigot) is the classic Easter and Sunday-roast centrepiece across Europe,
the Middle East, and the Americas. A whole bone-in leg (2-3 kg / 4-7 lb) roasts
at 160-180°C / 325-350°F for 1.5-2.5 hours depending on size and target doneness.
Lamb can safely be served medium-rare (internal 57-63°C) unlike poultry, because
USDA mandates only 145°F / 63°C + 3-min rest. Most culinary traditions prefer
medium-rare to medium for leg of lamb.

## Source recipes

### 1. J. Kenji López-Alt — Roast Leg of Lamb (Serious Eats)
- **Source**: seriouseats.com/slow-roasted-boneless-leg-of-lamb-recipe
- **Method**: Stud with garlic, rub with herb paste. Low 250°F / 120°C oven for
  3-4 hours to 130°F / 54°C, then blast 500°F / 260°C 15 min for crust.
- **Target**: **130-135°F / 54-57°C** for medium-rare (pink, juicy centre)
- **Note**: Kenji's reverse-sear approach ensures even doneness throughout the
  large muscle without the grey ring of conventional high-temp roasting.

### 2. Heston Blumenthal — Perfect Roast Leg of Lamb (Heston at Home / The Fat Duck)
- **Source**: hestonfromhome.com
- **Method**: Stud with anchovy + garlic, 60°C / 140°F oven for 5-6 hours (bath-style
  oven roast). Blast 230°C / 445°F for 30 min for crust.
- **Target**: **57-60°C / 135-140°F** at thickest point
- **Note**: Blumenthal's ultra-low oven approach is the most gentle available —
  the low oven temperature cannot exceed the target temp, eliminating overcooking.

### 3. Leila Lindholm — Lammstek (leila.se / ICA Sverige)
- **Source**: leila.se/recept · ica.se
- **Method**: Rosemary + garlic studding, 175°C oven, 25-30 min per 500 g. Rest 20 min.
- **Target**: **58-60°C** at thickest point (Swedish "rosa" / rose doneness for lamb)
- **Note**: Swedish lamb tradition targets 58-60°C — described as "rosa" (pink), the
  universally preferred doneness in Scandinavian lamb recipes.

### 4. Yotam Ottolenghi — Slow-Cooked Leg of Lamb (Jerusalem / SIMPLE)
- **Source**: Jerusalem (Ten Speed Press) / SIMPLE (Appetite by Random House)
- **Method**: Middle Eastern spice rub, 130°C / 265°F for 5-6 hours. Rest 30 min.
- **Target**: **70-80°C** (for pull-apart texture in the slow-braised Middle Eastern
  tradition — a different style goal from European medium-rare)
- **Note**: Ottolenghi's slow-braised style produces a completely different texture —
  fork-tender and falling off the bone — vs European medium-rare sliced lamb.

### 5. Paul Bocuse — Gigot rôti (Bocuse in Your Kitchen)
- **Source**: Bocuse in Your Kitchen (Flammarion)
- **Method**: Lard with garlic, mustard rub, 220°C / 428°F oven 15 min then 180°C
  for 20 min per 500 g. Rest 15 min.
- **Target**: **55-57°C** at thickest (French "rosé" standard — medium-rare)
- **Note**: French tradition is unambiguous: gigot should be "rosé" (medium-rare)
  at 55-57°C. "Bien cuit" (well done) is considered a culinary failure for lamb.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Blumenthal | 130-135°F / 54-57°C | Reverse-sear medium-rare |
| Sweden / Leila | 58-60°C | "Rosa" — pink medium-rare |
| France / Bocuse | 55-57°C | "Rosé" — classic French |
| Middle East / Ottolenghi | 70-80°C | Slow-braised pull-apart style |

**European consensus: 55-60°C / 131-140°F medium-rare.**
Maps to `medium_rare` in lamb doneness. Middle Eastern slow style maps to `well_done`.

## What makes this method special
Roasting a whole leg of lamb is a celebratory, convivial act — the aromas of lamb
fat, garlic, and rosemary fill the house. No other method scales to feeding 8-10
people from a single cut with such dramatic presentation. The bone-in version
produces superior flavour through marrow-enriched pan drippings.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `grill`
- `recommended_doneness`: `"medium_rare"` (55-60°C European consensus)
