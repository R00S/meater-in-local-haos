# New York Strip × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
The New York strip (striploin, contre-filet, Rumpsteak) is cut from the short loin —
moderately marbled with a distinct fat cap along one edge. It is more marbled than
sirloin (top sirloin) and filet mignon, but less so than ribeye. The fat cap's role
is particularly important: searing the fat cap against the hot pan for 30-60 seconds
before the main sear renders it partially and adds flavour to the crust. Internal target
is the same as other steaks (54-57°C) but the fat cap influences the sous vide decision
(see separate leaf).

## Source recipes

### 1. Food Network Kitchen — The Perfect New York Strip Steak
- **Source**: foodnetwork.com/fnk/recipes/the-perfect-new-york-strip-steak-7151722
- **Method**: Cast iron, high heat, oil. Sear 3 min, flip, add butter+thyme+garlic.
  Baste 1-2 min. Optionally finish in 400°F oven for thick cuts.
- **Pull temp (medium-rare)**: **125-130°F / 52-54°C** from heat; rest to **130-135°F / 54-57°C**

### 2. FlavoryCooking — Perfectly Medium-Rare: The Ideal Temperature for NY Strip Steak
- **Source**: flavorycooking.com/what-temp-is-medium-rare-for-ny-strip
- **Method**: Sear in very hot cast iron, butter baste, rest 5-10 min.
- **Target**: **130-135°F / 54-57°C** medium-rare
- "Kenji López-Alt and Serious Eats: pull at 125-130°F for medium-rare result after rest."

### 3. Cooking in the Keys — How to Cook NY Strip Steak on the Stove (Medium Rare)
- **Source**: cookinginthekeys.com/strip-steak
- **Method**: Cast iron, high heat. Sear 2-3 min each side. Butter baste with garlic.
- **Target**: **130-135°F / 54-57°C** medium-rare pull, rest 5 min.

### 4. Bake It With Love — Pan Seared New York Strip Steak
- **Source**: bakeitwithlove.com/pan-seared-new-york-strip-steak
- **Method**: Render fat cap against pan first (30-60 sec on edge), then sear both faces.
  Butter+garlic+thyme baste. Rest.
- **Target**: **130-135°F / 54-57°C** medium-rare
- "Rendering the fat cap edge against the hot pan before the main sear adds enormous
  flavour to the steak and ensures it doesn't remain chewy."

### 5. Steak Advisor — Pan Seared Strip Steak with Butter and Herbs
- **Source**: steakadvisor.com/steak-recipes/pan-seared-strip-steak
- **Method**: French technique — butter+thyme+garlic baste (arroser). 2-3 min/side.
  Edge-fat rendered before main sear.
- **Target**: Medium-rare = **54-57°C** (French "saignant/rosé" end)
- Note: European strip (contre-filet) is often slightly thinner than US strip; same temp.

## Temperature consensus

| Source | Pull from heat | Final (medium-rare) |
|--------|---------------|---------------------|
| Food Network | 52-54°C | 54-57°C |
| FlavoryCooking (Kenji) | 52-54°C | 54-57°C |
| Cooking in the Keys | 52-54°C | 54-57°C |
| Bake It With Love | ~54°C | 54-57°C |
| Steak Advisor (FR) | ~54°C | 54-57°C |

**Universal: medium_rare at 54-57°C.** The fat cap needs the 30-60 sec edge-sear
before the main sear — this is the specific NY strip technique vs. filet/sirloin.

## NY strip fat cap insight (impacts sous_vide, see separate leaf)
The fat cap along the edge is what makes NY strip distinctive. For pan sear:
- The edge fat is partially rendered by the hot pan contact during the main sear
- For sous vide: 57°C is recommended for fattier strips to fully render the edge fat
  (unlike 54°C which leaves the fat somewhat waxy/chewy)
- This is the same principle as ribeye sous_vide at 57°C

## Data applied
- `supported_methods`: pan_sear, pan_fry, grill, charcoal_grill, oven_roast, sous_vide, air_fryer
- `recommended_doneness`: "medium_rare" — confirmed by all 5 sources
- `method_temperature_ranges` override for sous_vide: [_SV_RARE, _SV_MEDIUM_RARE_MARBLED, _SV_MEDIUM]
  (57°C target — fat cap needs rendering, same principle as ribeye)
