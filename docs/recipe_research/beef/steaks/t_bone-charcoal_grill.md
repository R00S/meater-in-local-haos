# T-Bone / Porterhouse × Charcoal Grill — Recipe Temperature Research

## THE FIORENTINA REVELATION: Italian tradition = 48-52°C ("al sangue")

The most important cultural reference for T-bone on charcoal is **bistecca alla
Fiorentina** — the Tuscan tradition of cooking thick T-bone over oak/beech charcoal.
The Italian tradition targets 48-52°C at the tenderloin core — rarer than the
US/Nordic medium-rare of 54-57°C. This is the biggest temperature split in beef steaks.

## Source recipes

### 1. DeMarcoCarni — Come cuocere la Fiorentina perfetta (Italy)
- **Source**: demarcocarni.it/blogs/news/come-cuocere-la-fiorentina-perfetta
- **Italian tradition**: "al sangue" = **48-52°C** (preferred in Tuscany)
  "Cottura media" = 55-57°C. Well done (not recommended) = 60°C+.
- Griglia brace rovente (~250°C), 5-6 min per side, then stand on bone 2-3 min.
- "La Fiorentina si serve sempre rossa e succosa." (Always served red and juicy.)

### 2. Maccaturo — Bistecca alla Fiorentina: Guida completa alla cottura perfetta
- **Source**: maccaturo.it/blog/come-cucinare-bistecca-alla-fiorentina
- **Target**: "al sangue" = **48-52°C** at tenderloin core (most authentic)
- 4-6cm thick Chianina (or similar), quercia/faggio brace.
- "Non bucare la carne" (never pierce), gira solo una volta per lato.
- **Salt**: AFTER cooking only (never before — Fiorentina rule).

### 3. America's Test Kitchen — Charcoal-Grilled Porterhouse or T-Bone Steaks (USA)
- **Source**: americastestkitchen.com/recipes/4227-charcoal-grilled-porterhouse-or-t-bone-steaks
- **Method**: Two-zone charcoal fire. Tenderloin towards cooler side. Sear direct,
  finish indirect with bone towards fire (bone conducts heat to keep center warm).
- **Target (medium-rare)**: **130-135°F / 54-57°C** at tenderloin reading
- US tradition targets higher than Italian tradition.

### 4. BBQ Host — How to Grill T-Bone Steak (Two-Zone Technique)
- **Source**: bbqhost.com/how-to-grill-t-bone-steak
- **Method**: Two-zone charcoal. High heat sear + indirect finish. Bone towards fire.
- **Target (medium-rare)**: **130-135°F / 54-57°C**
- Argentina note: "Parrilla tradition — salt only, quebracho charcoal, same 54-57°C
  target but slower indirect cook with more smoke character."

### 5. Barbecue FAQ — Easy Charcoal Grilled T-Bone Steak Recipe
- **Source**: barbecuefaq.com/easy-charcoal-grilled-t-bone-steak-recipe
- **Method**: Dry brine, lump charcoal two-zone.
- **Target**: **130-135°F / 54-57°C** medium-rare

## Temperature consensus — THE REGIONAL SPLIT

| Tradition | Target | Character |
|-----------|--------|-----------|
| Italian (Fiorentina, Tuscany) | **48-52°C** al sangue | Red/rare center, traditional |
| USA (ATK, BBQ Host) | 54-57°C | Medium-rare, pink throughout |
| UK/Nordic | 54-57°C | Medium-rare |
| Argentina (parrilla) | 54-57°C | Medium-rare, salt only |

**The Italian tradition at 48-52°C is a GENUINE method_temperature_ranges split.**
A Fiorentina cooked to 54°C would not be considered authentic by Tuscan chefs.

## Key culinary insight for the T-bone charcoal_grill leaf
The bone-standing technique (stand T-bone on bone edge for 2-3 min at the end) is
specific to this cut and method — it equalises temperature between the two muscles
by conducting heat up through the bone without direct flame contact on either muscle.
This is the Fiorentina technique, also used by US and Argentine grillers.

## Data applied
- `recommended_doneness`: "medium_rare" (54°C)
- `method_temperature_ranges` for charcoal_grill: adds [DONENESS_RARE, DONENESS_MEDIUM_RARE, ...]
  so that users can select the Italian "al sangue" target (rare = 49°C)
- No separate method_doneness override — the default "medium_rare" covers US/Nordic/AR users.
  Italian users should select "rare" for authentic Fiorentina experience.
