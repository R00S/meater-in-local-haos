# Salmon Fillet × Oven Bake — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Baking salmon in the oven at 275-400°F / 135-200°C produces a moist, evenly cooked
fillet without the crispy skin of pan searing. Lower temperatures (275°F / 135°C
for 25-30 min) produce the most gentle, silky texture; higher temperatures
(400°F / 200°C for 12-15 min) are faster but risk a dry exterior. Either way,
the target internal of 120-130°F / 49-54°C for medium yields the best texture.
This is the most forgiving salmon method for home cooks.

## Source recipes

### 1. America's Test Kitchen — Easy Baked Salmon
- **Source**: americastestkitchen.com / Cook's Illustrated
- **Method**: 275°F / 135°C oven, salmon on oiled rack, 25-30 min to 125°F / 52°C.
  Simple glaze last 5 min.
- **Target**: **125°F / 52°C** at thickest point
- **Note**: ATK found 275°F gives the most uniformly translucent/silky interior —
  slow heat prevents the exterior from overcooking before the centre is done.

### 2. Samin Nosrat — Oven-Baked Salmon (Salt Fat Acid Heat)
- **Source**: Salt Fat Acid Heat (Simon & Schuster)
- **Method**: Brine 30 min, pat dry, 325°F / 163°C oven 20-25 min.
- **Target**: **125-130°F / 52-54°C** at thickest point
- **Note**: Nosrat's brine step allows pulling at 125°F while maintaining
  exceptional juiciness; un-brined salmon may benefit from 130°F instead.

### 3. Leila Lindholm — Ugnslagad lax (leila.se / Arla)
- **Source**: leila.se/recept
- **Method**: Season with dill + lemon, 180°C / 355°F oven 15-20 min.
- **Target**: **52-55°C** at thickest point (Swedish salmon standard)
- **Note**: Swedish baked salmon tradition targets 52-55°C with dill/butter as the
  classic Nordic flavour profile.

### 4. Heston Blumenthal — Very Slow Baked Salmon (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: 50°C / 120°F oven for 30-40 min. Deceptively simple: the oven
  temperature IS the target temperature.
- **Target**: **50°C / 122°F** — the oven temperature equals the target temp
- **Note**: This ultra-low method produces a near-raw, barely-set texture that
  Blumenthal describes as "uniquely silky." Only achievable with a precise oven
  or probe-alarm setup.

### 5. Nobu Matsuhisa — Slow-Baked Black Cod (adapted to salmon)
- **Source**: Nobu: The Cookbook (Kodansha International) — cod technique applied
- **Method**: Miso-marinate 2 days, 200°F / 93°C oven 20-25 min.
- **Target**: **45-50°C / 113-122°F** at centre (Nobu's medium-rare for fish)
- **Note**: Nobu's extremely low oven approach works only with sushi-grade salmon
  or equivalent — the very slow heat pasteurises without conventional cooking.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / ATK / Nosrat | 125-130°F / 52-54°C | Slow oven, very moist |
| Sweden | 52-55°C | Nordic dill-butter style |
| Heston Blumenthal | 50°C | Ultra-slow, barely set |
| Japan / Nobu | 45-50°C | Sushi-grade only |
| USDA minimum | 145°F / 63°C | Safe for immunocompromised |

**Consensus: 52-55°C / 125-131°F.** Maps to `medium` in fish doneness.

## What makes this method special
Oven baking is the most forgiving salmon method — no risk of burning, no flip required,
easy to scale for multiple portions, and the gentle heat produces an evenly moist
result throughout the fillet. The lower the oven temperature, the silkier the result.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (52-55°C global consensus for baked salmon)
