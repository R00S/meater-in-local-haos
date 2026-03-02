# Ribeye Steak × Oven Roast (Reverse Sear) — Recipe Temperature Research

## Cut profile
"Oven roast" for a single ribeye steak means the reverse-sear technique: a low oven
(100-135°C / 210-275°F) brings the steak to within 10°C of the target temperature with
almost no surface moisture loss, then a 90-second screaming-hot sear builds the crust.
This produces the most uniform interior of all dry-heat methods — zero gray band — because
the slow heat denatures proteins gradually and activates tenderising enzymes. Called
"basse température + saisie" in France, "Rückwärtsgaren" in Germany.

## Source recipes

### 1. J. Kenji López-Alt — The Reverse Sear (Serious Eats)
- **Source**: seriouseats.com/reverse-seared-steak-recipe
- **Oven**: 225°F / 107°C on a wire rack over a sheet pan.
- **Pull from oven** (medium-rare): 110-120°F / **43-49°C**
- **Final after 90-sec sear + 5 min rest**: 130°F / **54°C**
- **Why superior**: Drier surface → better Maillard sear. Uniform pink from edge to edge.
  "I now use this method for every thick steak."

### 2. Thermapen UK (ThermoWorks) — How to Cook Ribeye: Reverse-Sear Method
- **Source**: thermapen.co.uk/recipes/post/how-to-cook-ribeye-steak
- **Oven**: 120°C (UK domestic oven standard for this technique)
- **Pull temp**: 48-50°C — "take from oven when ~10°C below your final target"
- **Final**: medium-rare = **54-57°C**

### 3. The Meatlovers Germany — Reverse Seared Ribeye (Rückwärtsgaren)
- **Source**: themeatlovers.de/pages/rezepte/reverse-seared-tutorial-rib-eye
- **Backofen**: 130°C Ober-/Unterhitze
- **Ziel-Kerntemperatur medium-rare**: **54-57°C** ("englisch/medium rare")
- **Aus dem Ofen nehmen bei**: 48°C — then sear 1-2 min per side.
- **Note**: German culinary tradition aligns with British/American for this technique.

### 4. Cuisson basse température (France) — Bistecca au four basse température
- **Source**: recettenomade.com · marecettefacile.fr
- **Four (oven)**: 100-120°C
- **Température à cœur (medium-rare / à point)**: **55-57°C** at finish
- **Tirer du four à**: 48-50°C, saisir à feu vif 1-2 min.
- **Note**: France calls 55-57°C "à point" for rib steak — equivalent to medium-rare.

### 5. Systembolaget / Mathem Sverige — Ugnslagad entrecôte (reversed)
- **Source**: mathem.se · Koket.se
- **Ugn**: 100-120°C
- **Innertemp rosa (medium rare)**: **55-57°C** — pull at ~48°C, vila 5 min, bryn sedan.
- **Swedish note**: "Ugnslagning ger en helt jämn rosa färg rakt igenom" (oven gives
  uniform pink colour throughout) — confirming the reverse-sear advantage.

## Temperature consensus

| Source | Pull from oven | Final target | Verdict |
|--------|---------------|--------------|---------|
| Kenji / Serious Eats | 43-49°C | 54°C | medium-rare |
| Thermapen UK | 48-50°C | 54-57°C | medium-rare |
| The Meatlovers DE | 48°C | 54-57°C | medium-rare |
| France (basse temp) | 48-50°C | 55-57°C | à point |
| Sweden (Mathem) | ~48°C | 55-57°C | medium-rare |

All regions converge: **pull oven at 48-50°C, final serving temp 54-57°C (medium-rare)**.
Carryover from the final sear (not from the oven) adds ~5-7°C.

## What makes reverse sear different from pan sear only
The oven phase dries the surface so that the final sear creates the deepest possible crust
in the shortest time — minimising the gray band entirely. The slow low-temperature phase
also activates proteolytic enzymes that tenderise the meat over the ~20-40 minute oven
time, creating slightly more tenderness than a quick pan sear. Interior temperature target
is identical (54-57°C), but the TEXTURE at that temperature is subtly more even.

## Data applied
- No `method_temperature_ranges` override needed — same final target as pan sear.
- `method_doneness["oven_roast"]` = not needed (same as `recommended_doneness`).
