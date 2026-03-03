# Pork Tenderloin × Air Fryer — Recipe Temperature Research

## Cut profile
Cooking a whole pork tenderloin in an air fryer (375-400°F / 190-200°C) takes
20-22 minutes and delivers an even brown exterior with a juicy interior. The air
fryer's high convection velocity compensates for the lack of a direct flame or
pan contact. Key: let the machine preheat fully, and rotate the tenderloin halfway
for even browning. Pull at 140°F / 60°C and rest 5 minutes.

## Source recipes

### 1. Serious Eats — Air Fryer Pork Tenderloin
- **Source**: seriouseats.com
- **Method**: Season, 400°F / 200°C air fryer preheated, 18-20 min rotating at 10 min.
- **Target**: **145°F / 63°C** at thickest point
- **Note**: Air fryer environment is drier than oven, so pork tenderloin without
  a marinade can dry slightly faster — marinating or dry-brining recommended.

### 2. Ninja Kitchen — Air Fryer Pork Tenderloin Recipe
- **Source**: ninjakitchen.com / cosori.com
- **Method**: 375°F / 190°C, 20-22 min turning once at 10 min. Probe to 145°F.
- **Target**: **145°F / 63°C**
- **Note**: Most air fryer manufacturers align with USDA 145°F for pork.

### 3. Alton Brown — Air Fryer Techniques (Good Eats Reloaded)
- **Source**: foodnetwork.com/shows/good-eats-reloaded
- **Method**: Dry-brine 1 hour, 380°F air fryer 18-20 min, pull at 140°F, rest 5 min.
- **Target**: **140°F / 60°C** pull; 145°F/63°C after rest
- **Note**: Brown emphasises pulling at 140°F since air fryer carryover heat is
  significant — 3-5°C rise during rest is typical.

### 4. ICA / Coop Sweden — Fläskfilé i luftfritös
- **Source**: ica.se/recept · coop.se/recept
- **Method**: 200°C air fryer 20 min, probe to 68°C. Rest 5 min.
- **Target**: **68°C** at thickest point
- **Note**: Swedish guidance targets 68°C for all air-fried pork preparations.

### 5. Jamie Oliver — Pork Fillet in the Air Fryer (jamieoliver.com)
- **Source**: jamieoliver.com/recipes
- **Method**: Spice-rubbed, 200°C air fryer 18-20 min. "Pierce and check the juices
  run clear."
- **Target**: **70°C** (UK home-cooking visual standard)
- **Note**: Oliver's "juices run clear" guidance maps to 68-70°C internal.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Serious Eats | 145°F / 63°C | With 5-min rest |
| Sweden | 68°C | Standard guidance |
| UK / Jamie Oliver | 70°C | "Juices run clear" |

**Consensus: 63-68°C.** Maps to `medium` in pork doneness.

## What makes this method special
The air fryer delivers oven-like results in 40% less time, with better surface
browning than a standard oven for a tenderloin. Ideal for weeknight cooking when
the oven is occupied or when a single small tenderloin doesn't warrant preheating
a full oven for 20 minutes.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (global consensus 63°C)
