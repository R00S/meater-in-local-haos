# Salmon Fillet × Sous Vide — Recipe Temperature Research

## Cut profile
Sous vide salmon produces the most precisely controlled result of any cooking method:
set the water bath to the exact desired final temperature and the fish cannot
overcook. The most common professional target is 115-122°F / 46-50°C for 30-40
minutes — producing a silky, barely-set texture far more moist than any dry-heat
method. After the bath, a 30-second skin-side sear in a very hot pan adds a crispy
skin finish. At 130°F/54°C for 30+ minutes, salmon is pasteurised (FDA time-temp).

## Source recipes

### 1. J. Kenji López-Alt — Sous Vide Salmon (Serious Eats)
- **Source**: seriouseats.com/sous-vide-salmon-recipe
- **Method**: Season, bag skin-side together, 122°F / 50°C bath 40 min. Pat dry,
  30 sec skin-side sear in screaming-hot pan.
- **Target**: **122°F / 50°C** bath temperature (medium — supple, slightly translucent)
- **Note**: Kenji provides a range: 104°F for translucent/raw texture, 115°F for
  barely translucent, 122°F for medium, 130°F for well-done. 122°F is his preference.

### 2. ChefSteps / Joule — Sous Vide Salmon Precision Guide
- **Source**: chefsteps.com
- **Method**: 115°F / 46°C for 30 min for "translucent and silky"; 125°F / 52°C
  for "medium-firm".
- **Target**: **115-125°F / 46-52°C** depending on texture preference
- **Note**: ChefSteps' temperature comparison demonstrates the dramatic texture
  difference every 5°F step produces in salmon.

### 3. Thomas Keller — Sous Vide Salmon (Under Pressure)
- **Source**: Under Pressure (Artisan Books)
- **Method**: Confit in olive oil + aromatics at 59°C / 138°F for 30 min.
  (A variant: water bath 55°C / 131°F for 30 min.)
- **Target**: **55-59°C / 131-138°F** (Keller's preference — slightly firmer than
  typical culinary sous vide)
- **Note**: Keller's approach is slightly different: he targets a firmer, more
  "cooked" texture consistent with classic French presentation.

### 4. Heston Blumenthal — Salmon Sous Vide (Fat Duck Research)
- **Source**: hestonfromhome.com
- **Method**: 50°C / 122°F bath 20-30 min. Pat dry, very brief sear or no sear.
- **Target**: **50°C / 122°F** — "barely set, silky as raw but perfectly safe
  (time-temperature pasteurised)"
- **Note**: Blumenthal uses sous vide specifically to achieve textures impossible
  by conventional cooking; 50°C for 30 min is food-safe per FDA time-temp tables.

### 5. Magnus Nilsson — Sous vide lax (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: 52°C bath 30-40 min. Skin-side quick crisp in iron pan 30 sec.
- **Target**: **52°C / 126°F** (Nordic salmon standard)
- **Note**: 52°C is almost universally used in Scandinavian professional kitchens
  for sous vide salmon — matches the traditional poached salmon texture.

## Temperature consensus

| Tradition | Bath temperature | Notes |
|-----------|-----------------|-------|
| USA / Kenji / ChefSteps | 115-122°F / 46-50°C | Silky medium |
| Thomas Keller | 55-59°C / 131-138°F | Firmer, classic French |
| Heston Blumenthal | 50°C / 122°F | Barely set |
| Nordic / Nilsson | 52°C / 126°F | Nordic professional standard |

**Consensus: 50-55°C / 122-131°F.** Maps to `medium` in fish doneness.

## What makes this method special
Sous vide salmon achieves a texture impossible by any dry-heat method: a uniform
silkiness from surface to centre, without the dry exterior that always forms when
cooking salmon in a pan or oven. The bath temperature IS the final temperature —
no guessing, no overcooking, perfect consistency every time.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (50-55°C / 122-131°F bath consensus)
