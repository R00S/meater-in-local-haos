# Baby Back Ribs × Oven Roast — Recipe Temperature Research

## Cut profile
Baby back ribs come from the top of the rib cage adjacent to the spine, shorter
and leaner than spare ribs. Oven roasting uses the 3-2-1 method (3 hours unwrapped,
2 hours foil-wrapped, 1 hour unwrapped sauced) at 225-250°F / 107-120°C, or a
faster high-heat method at 300-325°F / 150-163°C for 2-2.5 hours. The target
internal temperature for "done" ribs is 185-203°F / 85-95°C — the point where
collagen converts but the meat still clings to the bone (competition standard: meat
pulls clean with a bite but does not fall off).

## Source recipes

### 1. J. Kenji López-Alt — Oven-Baked Baby Back Ribs (Serious Eats)
- **Source**: seriouseats.com/oven-baked-baby-back-ribs
- **Method**: Remove membrane, dry rub, 300°F / 150°C oven unwrapped 2.5-3 hours.
  Sauce last 30 min. Internal 195-203°F / 91-95°C.
- **Target**: **195-203°F / 91-95°C** at thickest meat section
- **Note**: Kenji found 300°F gives a better bark than lower-and-slower in the oven
  (unlike a smoker, ovens don't add smoke to justify the extra time).

### 2. America's Test Kitchen — Perfect Oven Ribs
- **Source**: americastestkitchen.com / Cook's Illustrated magazine
- **Method**: Dry rub, 250°F oven wrapped in foil 2 hours + unwrapped 1 hour for glaze.
- **Target**: **195-200°F / 91-93°C** — meat pulls cleanly from bone with light tug
- **Note**: ATK's foil-wrapped phase steams the ribs, accelerating collagen breakdown.

### 3. Steve Raichlen — Oven Ribs with Smoke (How to Grill)
- **Source**: How to Grill (Workman) / barbecuebible.com
- **Method**: Season, wrap with liquid smoke + spices in foil, 250°F 2 hours + unwrapped
  1.5 hours at 300°F for glaze.
- **Target**: **190-200°F / 88-93°C**
- **Note**: Liquid smoke adds some of the smoker-style flavour to oven ribs.

### 4. Leila Lindholm — Ugnsbakade revbensspjäll (leila.se)
- **Source**: leila.se/recept
- **Method**: Dry rub overnight, 125°C oven 3 hours (foil-wrapped), finish 200°C
  20 min with glaze.
- **Target**: **90-95°C** at thickest meat
- **Note**: Swedish approach uses similar principle to US 3-2-1 but with slightly
  lower temperatures consistent with European oven conventions.

### 5. Heston Blumenthal — Ribs "sous vide + blowtorch" adapted for oven
- **Source**: hestonfromhome.com
- **Method**: 70°C / 160°F oven for 12 hours (ultra-low), then blast at 230°C / 445°F
  for 15 min for bark.
- **Target**: **70°C minimum** at meat (USDA pork), **85-90°C** preferred for tenderness
- **Note**: Blumenthal's ultra-low method produces extraordinary tenderness but
  requires 12 hours; bark from the 230°C blast compensates for the pale exterior.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / ATK | 195-203°F / 91-95°C | Competition standard |
| Steve Raichlen | 190-200°F / 88-93°C | Practical home standard |
| Sweden / Leila | 90-95°C | 3-hour low + high-blast |
| Heston Blumenthal | 85-90°C minimum | Ultra-low method |

**Consensus: 88-95°C (190-203°F) for clean-pull tenderness.**
Maps to `well_done` in pork doneness.

## What makes this method special
Oven roasting is the only indoor method that reliably replicates smoker-style rib
tenderness. The extended low heat converts the collagen-rich intercostal muscles to
gelatin, giving that characteristic slide-off-the-bone quality. A foil wrap phase
speeds the process; uncovering for the final hour allows the glaze to set.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `grill`, `smoker`, `air_fryer`
- `recommended_doneness`: `"well_done"` (88-95°C collagen conversion target)
