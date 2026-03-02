# Flank Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Flank is a long, flat, fibrous working muscle from the belly. It has STRONG directional
grain — everything depends on slicing across it after cooking. It is very lean.
Key rules: high heat, short time, NEVER above medium (63°C) or the fibres contract
and become chewy. Best at medium-rare 54-57°C. Rest before slicing.

## Source recipes

### 1. Serious Eats / J. Kenji López-Alt — The Food Lab: Perfect Pan-Seared Flank Steak
- **Source**: seriouseats.com/the-food-lab-complete-guide-to-pan-seared-steaks
- **Method**: Very hot cast iron, thin film of oil, 1-2 min/side max. Flip every 30 sec
  for even crust. No butter basting — lean cut dries with too much butter.
- **Target**: **130-135°F / 54-57°C** medium-rare. Slice thin against the grain.
- "Flank has very little fat to protect it. Above 140°F it squeezes dry."

### 2. BBC Good Food — Bavette Steak with Shallot Sauce (French bistro tradition)
- **Source**: bbcgoodfood.com/recipes/bavette-steak-shallot-sauce
- **French name**: bavette à l'échalote — pan-seared flank (bavette) with shallot-vinegar sauce
- **Method**: Very hot pan, salted, sear 2-3 min/side. Rest, deglaze with shallot+red wine vinegar.
- **Target**: **52-55°C** (French prefer *saignant* to *à point* for bavette — looser fibres stay tender)
- "The bavette is quintessential bistro fare in France and Belgium."

### 3. RecipeTin Eats — Pan Fried Flank Steak (Australia/international)
- **Source**: recipetineats.com/pan-fried-flank-steak
- **Method**: Pat dry, season. Cast iron screaming hot. 2 min/side. Rest 5 min minimum.
  Slice against grain on bias.
- **Target**: **130-135°F / 54-57°C** medium-rare
- "Resting is essential — the fibres need time to reabsorb juices."

### 4. ICA Recept — Flanksteak med chimichurri (Sweden)
- **Source**: ica.se/recept/flanksteak-med-chimichurri
- **Method**: Rumstempererad biff. Stekpanna mycket het. 2-3 min per sida. Vila 5 min.
  Skär mot fibrerna.
- **Target**: **54-57°C** (medium-rare / medium blodig på svenska)
- "Skär alltid mot fibrerna — annars är biffen seg."

### 5. El Comidista — Cómo hacer el bistec de falda perfecto (Spain)
- **Source**: elcomidista.elpais.com/elcomidista/recetas/bistec-de-falda
- **Spanish**: bistec de falda / fraldinha — sartén muy caliente, 2 min/lado, reposar.
- **Target**: **52-57°C** — Spanish tradition slightly more flexible than French; "al punto" = 57°C
- "La falda es un corte de bistec que perdona poco: o la haces bien o queda gomosa."

## Temperature consensus

| Source | Country | Target | Character |
|--------|---------|--------|-----------|
| Kenji / Serious Eats | USA | 54-57°C | Medium-rare, scientific |
| BBC Good Food (bavette) | UK/FR | **52-55°C** | French *saignant* — slightly rarer |
| RecipeTin Eats | AU | 54-57°C | Medium-rare |
| ICA Recept | SE | 54-57°C | Medium blodig |
| El Comidista | ES | 52-57°C | Al punto |

**Consensus: 54-57°C medium-rare.** French bavette tradition prefers the lower end (52-54°C)
for slightly more tender result. Hard ceiling: never above 63°C (medium) or fibers toughen.

## Key method insight
The lean fibrous nature of flank means the method DOES NOT change the target temperature
significantly (unlike ribeye where sous vide needs 57°C). Fast high-heat pan sear is the
ideal method for this cut — quick in, quick out, rest, slice thin against grain.

## Data applied
- `recommended_doneness`: "medium_rare" confirmed by all 5 sources
- No method_temperature_ranges override needed for pan_sear (same as cut default)
