# Salmon Fillet × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Salmon fillet is the most widely eaten fish worldwide. A skin-on fillet placed
skin-side-down in a very hot (400-425°F / 200-220°C surface) pan with a neutral
oil gives a shatteringly crisp skin in 4-5 minutes, then the fillet is flipped
briefly or finished in a 400°F oven. Target internal: 120-130°F / 49-54°C for
medium (Japanese/culinary standard, opaque but just translucent at centre)
or 145°F / 63°C for USDA well-done. The majority of authoritative recipes
target the lower range for maximum moisture and texture.

## Source recipes

### 1. J. Kenji López-Alt — Perfect Pan-Seared Salmon (Serious Eats)
- **Source**: seriouseats.com/pan-seared-salmon
- **Method**: Skin-side down in preheated stainless + oil, press gently for first
  30 sec to prevent buckling, 5-6 min skin-side, flip, 30 sec flesh-side.
- **Target**: **115-120°F / 46-49°C** pull (medium — slight translucency at centre)
- **Note**: Kenji explicitly recommends lower than USDA for texture reasons; the
  135°F / 57°C USDA standard for fish produces dry salmon.

### 2. Gordon Ramsay — Pan-Seared Salmon (MasterClass / YouTube)
- **Source**: masterclass.com/gordon-ramsay · gordonramsay.com
- **Method**: Heavily seasoned, olive oil in very hot pan, skin-side down 3 min,
  flip, 1 min flesh-side. Baste with butter + herbs.
- **Target**: **Visible medium doneness** — Ramsay describes "the colour rising
  up the side to halfway" as his visual cue, equivalent to ~52-55°C / 126-131°F
- **Note**: Ramsay's visual guide is practical for home cooks: white colour rising
  to 50% up the side = 120-125°F internal.

### 3. Thomas Keller — Crisp-Skinned Salmon (Bouchon Bistro)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Dry completely, season, cold-pan start (NOT hot pan) for even skin
  rendering, then flip once skin is crisp.
- **Target**: **120-125°F / 49-52°C** at thickest point
- **Note**: Keller's cold-pan method is controversial but produces the most
  evenly rendered skin without the spatter of a hot-pan start.

### 4. Swedish tradition — Stekt lax (Koket.se / Leila Lindholm)
- **Source**: koket.se · leila.se/recept
- **Method**: Butter + oil, skin-side down medium heat 4-5 min, flip 1-2 min.
- **Target**: **52-55°C** at thickest point (Swedish culinary standard for salmon)
- **Note**: Swedish food culture, with its deep affinity for salmon, defines "perfekt
  lax" at 52-55°C — firm but still moist, opaque but yielding.

### 5. Nobu Matsuhisa — Pan-Seared Salmon (Nobu: The Cookbook)
- **Source**: Nobu: The Cookbook (Kodansha International)
- **Method**: Season lightly, sear skin-side in neutral oil very briefly (2 min),
  serve with skin up for presentation.
- **Target**: **45-50°C / 113-122°F** at centre (Japanese medium-rare for salmon)
- **Note**: Nobu's target is deliberately lower than Western standards — Japanese
  sushi-grade salmon tradition accepts raw or near-raw centres.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller | 115-125°F / 46-52°C | Culinary medium; pull early |
| Gordon Ramsay | ~52-55°C / 126-131°F | Visual "colour at 50%" |
| Sweden | 52-55°C | Swedish culinary standard |
| Japan / Nobu | 45-50°C | Near-raw sushi-culture |
| USDA minimum | 145°F / 63°C | Safe but dry for salmon |

**Global culinary sweet spot: 52-55°C / 125-131°F.** Maps to `medium` in our
fish/salmon doneness range. The USDA 145°F is the safe minimum for vulnerable
populations (elderly, pregnant, immunocompromised).

## What makes this method special
Crispy salmon skin is the hallmark of pan searing — no other method reliably
renders salmon skin to a shatter-crisp texture without a griddle or salamander.
The contrast between crisp skin and silky, medium-rare flesh is considered
the gold standard salmon preparation in professional kitchens globally.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `oven_bake`, `grill`, `air_fryer`, `sous_vide`, `poach`
- `recommended_doneness`: `"medium"` (global culinary consensus 52-55°C)
