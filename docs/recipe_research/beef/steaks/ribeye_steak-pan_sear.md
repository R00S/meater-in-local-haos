# Ribeye Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Ribeye is cut from the rib section (ribs 6-12), prized for abundant intramuscular fat
(marbling) that bastes the meat from within during high-heat cooking. A screaming-hot
cast-iron or carbon-steel pan creates a thick Maillard crust while the fat renders into
the meat. Carryover from the hot metal surface is significant (3-5°C), so pull early.

## Source recipes

### 1. J. Kenji López-Alt — Butter-Basted Pan-Seared Thick-Cut Steaks (Serious Eats / Food52)
- **Source**: food52.com/recipes/67882 · seriouseats.com
- **Method**: Frequent flipping (every 30 s) on ripping-hot cast iron; butter-baste with
  thyme and garlic in final 90 seconds.
- **Pull temp**: 120-125°F / **49-52°C** for medium-rare
- **Final after rest (5-10 min)**: 130°F / **54°C**
- **Why this method works**: Frequent flipping gives more even interior gradient and a
  thinner, crispier crust than single-flip searing.

### 2. Leila Lindholm — Helstekt / Pannstekt entrecôte (Koket.se / Leila.se)
- **Source**: leila.se/leilas-stektemperaturer · koket.se
- **Method**: Hot pan, butter + oil, turn once; rest minimum 10 minutes.
- **Target** (slice / individual): Medium-rare = **55-57°C** at rest
- **Target** (whole piece roasted): Medium-rare = **56°C**
- **Note**: Swedish culinary tradition measures the *final resting temperature*, not pull
  temp — so 55-57°C is the serving temperature, which matches Kenji's 54°C after rest.

### 3. Paul Bocuse / French tradition — Entrecôte à la Bordelaise (750g.com / recettenomade.com)
- **Source**: 750g.com/comment-bien-cuire-son-entrecote-a-la-poele · recettenomade.com
- **Method**: Very hot pan, rendered beef fat or clarified butter. "Jamais plus de 57°C
  pour une côte de bœuf à point."
- **Saignant** (preferred, classic bistro): **50-53°C** at heart
- **À point**: **55-57°C** at heart
- **Note**: French *saignant* (blood-red warm centre) sits at the top end of our "rare"
  range or the low end of medium-rare. À point maps exactly to our medium-rare.

### 4. Italian tradition — Costata di manzo in padella (Macelleria Sparacello / Agrodolce / Sale&Pepe)
- **Source**: macelleriasparacello.it · agrodolce.it · salepepe.it
- **Method**: Ghisa (cast iron) or ferro very hot; never salt before cooking; rest 5 min.
- **Al sangue** (preferred for costata): **50-52°C** at core
- **Media cottura** (medium): **54-56°C**
- **Note**: Italian *al sangue* is slightly below our medium-rare target — closer to the
  bottom of the medium-rare range (52°C) or the top of rare (49°C).

### 5. Juan Gaffuri (Four Seasons Buenos Aires) — Bife ancho a la parrilla / sartén
- **Source**: foodit.lanacion.com.ar · mozzafiatoconce.cl
- **Method**: Thick-cut bife (≥3 cm), coarse salt only, hot grill/pan, rest 10 min.
- **Jugoso** (preferred): **55°C**
- **Al punto** (medium): **58-60°C**
- **Note**: Argentine tradition favours a slightly higher serving temp than French/Italian;
  "jugoso" at 55°C is the local equivalent of medium-rare.

## Temperature consensus

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| USA / Serious Eats (Kenji) | medium-rare | 54°C (130°F) |
| Sweden (Leila, ICA, Svenskt Kött) | medium-rare | 55-57°C |
| France (Bocuse) | à point / saignant | 50-57°C |
| Italy | al sangue / media | 50-56°C |
| Argentina | jugoso | 55-60°C |

**Global sweet spot: 54-57°C.** This maps to our `medium_rare` range (52-57°C, target 54°C).

The variation reflects **how carryover is counted** (pull-temp vs serving-temp) more than a
real disagreement about texture preference. All traditions converge on a warm, red/pink
centre with visible juices.

## What makes this method special
Cast-iron pan sear delivers maximum Maillard crust depth in minimum time, concentrating
flavour in the outer crust while the interior stays rare-to-medium-rare. Butter basting
adds dairy sweetness and accelerates crust formation. The 3-5°C carryover from the hot
metal means a pull temperature noticeably below the final target.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `pan_fry`, `grill`, `charcoal_grill`,
  `sous_vide`, `oven_roast`, `air_fryer`
- `recommended_doneness`: `"medium_rare"` (global consensus 54-57°C)
- No `method_temperature_ranges` override needed for pan_sear — default ranges apply
