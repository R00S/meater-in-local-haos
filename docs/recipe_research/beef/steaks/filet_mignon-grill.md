# Filet Mignon × Grill (gas) — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Filet mignon grilled on a gas BBQ: direct high heat (232°C / 450°F) for the initial
Maillard sear, then moved to indirect zone to finish gently. The lean cut absorbs the
grill's drip-smoke more intensely than a marbled ribeye — charred grill marks on the
mild-flavoured tenderloin add a pleasant caramelized contrast. The usual 4-5cm thickness
requires care not to overshoot temperature in the indirect zone.

## Source recipes

### 1. Gordon Ramsay — Grilled Filet Mignon (cooklikeramsay.com / hellskitchenrecipes.com)
- **Source**: cooklikeramsay.com/gordon-ramsay-filet-mignon · gordonramsayrestaurants.com
- **Method**: Preheat gas grill to 450°F / 232°C. Sear all sides 2-3 min, then indirect.
  Butter-baste with garlic and thyme in final 2-3 min using a cast iron skillet on grill.
- **Pull temp (medium-rare)**: **130-135°F / 54-57°C** — rest 5-10 min.
- **Ramsay quote**: "Medium-rare is the ONLY way to serve a filet mignon."

### 2. Food Network Kitchen — Perfect Grilled Filet Mignon (foodnetwork.com)
- **Source**: foodnetwork.com/recipes/food-network-kitchen/perfect-grilled-filet-mignon
- **Method**: Gas grill, high heat, turn every 2-3 min for even browning. Rest under foil.
- **Target**: medium-rare = **130°F / 54°C** after rest.
- **Note**: Food Network consistently recommends 54°C as the ideal for filet on the grill.

### 3. French tradition — Tournedos grillé / Tournedos Rossini au barbecue
- **Source**: recettescarnees.com/tournedos-rossini · lapetitecave.net/recette-tournedos-rossini
- **Method**: Charcoal or gas with hot direct zone + indirect finishing zone.
  Never pierce the meat (tournedos). Use a probe thermometer.
- **Target**: "Rosé" (the ideal for filet in France) = **52-54°C** at core.
  - Saignant = 48-52°C
  - Rosé = **52-54°C** ← French preferred for filet mignon
  - À point = 56-58°C
- **Quote**: "Au-delà de 58°C, la viande devient sèche — la précision à 52°C est la règle
  des chefs pour sublimer le filet mignon." (Beyond 58°C the meat dries — 52°C precision
  is the chef rule for elevating filet mignon.)
- **Key insight**: French culinary tradition places the IDEAL for filet at 52-54°C, the
  low end of our medium_rare range — lower than the 54-57°C US/UK convention.

### 4. ICA / Scan / Weber Sverige — Grillad oxfilé (Swedish)
- **Source**: ica.se/recept/grillad-oxfile · scan.se/kottguiden/guider/grillguiden
  · weber.com/SE/sv/grillrecept/biff/oxfile
- **Method**: Direct high heat for sear, indirect to finish. Vila 8-10 min.
- **Target**: "Medium rare (rosa)" = pull at 52°C, rest to **54-56°C**.
  Scan.se grillguide: medium rare = 54-56°C innertemp.
- **Note**: Swedish sources measure final resting temperature; aligns with French rosé.

### 5. Giallo Zafferano / Primo Chef (Italy) — Filetto di manzo alla griglia
- **Source**: blog.giallozafferano.it · primochef.it/filetto-di-manzo-alla-griglia
- **Method**: Griglia rovente (very hot grill), olio extravergine, no piercing.
  Rest 5-10 min covered.
- **Italian temperature table (at core)**:
  - Al sangue: **50°C** (Italian "al sangue" ≈ rare-medium-rare by Anglo standards)
  - Cottura media: 60°C
- **Note**: Italian chefs do not separate "medium-rare" as a category — "al sangue" at
  50°C is the preferred serving temp, slightly rarer than the 54°C US/UK standard.
  Most Italian chefs recommend filetto "al sangue" or "media" (50-60°C); the sweet
  spot for most is around 52-54°C.

## Temperature consensus

| Tradition | Preferred target | Local name |
|-----------|-----------------|------------|
| USA / Ramsay | 54-57°C | medium-rare |
| France (Tournedos tradition) | **52-54°C** | rosé |
| Sweden (ICA / Scan / Weber SE) | 54-56°C | medium rare / rosa |
| Italy (Giallo Zafferano / Primo Chef) | 50-54°C | al sangue |
| Food Network | 54°C | medium-rare |

**Verdict: medium_rare (54°C target)** covers all traditions.
French and Italian prefer the lower end (52-54°C); US/UK the upper end (54-57°C).

## What makes grill different from pan sear for this cut
The gas grill creates char from fat drippings and open flame, adding a smoky Maillard
contrast to the mild-flavoured tenderloin. Pan sear gives more even crust via direct
metal contact; grill gives striped sear marks with a slight smokiness. Internal
temperature target is the same (54°C / 130°F). Both are excellent; choice is about
flavour profile preference.

## Data applied
- `recommended_doneness`: "medium_rare" — confirmed by all 5 sources
- No `method_temperature_ranges` override needed
