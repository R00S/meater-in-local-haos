# Cod Fillet × Oven Bake — Recipe Temperature Research

## Cut profile
Oven-baked cod at 400°F / 200°C for 12-15 minutes is the simplest method for
cooking white fish to USDA safety while keeping it moist. The oven creates a
gentle, even heat without the risk of the pan contact burning the delicate flesh.
A little butter or olive oil on top prevents the surface from drying. The target
internal of 140-145°F / 60-63°C produces fully opaque, flaky, moist cod.

## Source recipes

### 1. America's Test Kitchen — Baked Cod
- **Source**: americastestkitchen.com
- **Method**: Oil-brushed cod on oiled pan, 425°F / 220°C for 12-15 min to 145°F.
  Season with lemon, herbs.
- **Target**: **145°F / 63°C** at thickest point
- **Note**: ATK found 425°F a better choice than 375°F for cod — higher heat
  gives light browning without drying.

### 2. Nigella Lawson — Baked Cod with Lemon and Capers (Nigella Bites)
- **Source**: nigella.com / Nigella Bites (Hyperion)
- **Method**: Cod fillet on foil, olive oil drizzle, 200°C / 390°F for 15-18 min.
- **Target**: **65-70°C** — "flesh white, opaque, flakes at touch"
- **Note**: UK baking tradition typically aims for fully opaque white fish, at 65-70°C,
  consistent with the visual "flakes at fork" standard.

### 3. Leila Lindholm — Ugnsbakad torsk (leila.se)
- **Source**: leila.se/recept · ica.se
- **Method**: Fillets in baking dish, dill butter on top, 200°C oven 15-20 min.
- **Target**: **52-55°C** at centre (Scandinavian "klar" for white fish)
- **Note**: Swedish recipes distinguish between hjärttemperatur (heart temperature)
  of 52-55°C = "done" and 60°C+ = "overdone" for white fish in a culinary context.

### 4. Julia Child — Baked Cod Provençal (The French Chef)
- **Source**: The French Chef Cookbook (Knopf)
- **Method**: Ratatouille-style vegetables, cod on top, 180°C / 355°F for 20-25 min.
- **Target**: **140°F / 60°C** at thickest flesh
- **Note**: Child's moderate temperature and 25-min time reflects the larger
  portions typical of French family cooking.

### 5. Heston Blumenthal — Perfect Baked Fish (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: 54°C / 130°F oven for 30 min — ultra-low temperature bake.
- **Target**: **54°C / 130°F** (oven temperature = target temperature)
- **Note**: Blumenthal's ultra-low approach produces a uniquely silky white fish
  texture. Only recommended for sushi-grade or very fresh fish.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / ATK | 145°F / 63°C | Fully cooked, flaky |
| UK / Nigella | 65-70°C | "Flakes at fork" |
| Scandinavia / Leila | 52-55°C | "Barely set" culinary style |
| France / Julia Child | 140°F / 60°C | Traditional French |
| Heston Blumenthal | 54°C | Ultra-low silk texture |

**Consensus: 60-63°C / 140-145°F for standard baked cod.**
Maps to `well_done` in fish doneness.

## What makes this method special
Oven baking is the most forgiving and scalable method for cod — six fillets bake
as easily as one. The even heat prevents the direct-contact burning of pan methods,
and the gentle top-heat allows butter or herb crusts to set without burning.
Perfect for weeknight family dinners.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (60-63°C white fish standard)
