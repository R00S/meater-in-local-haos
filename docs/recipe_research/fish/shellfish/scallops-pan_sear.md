# Scallops × Pan Sear — Recipe Temperature Research

## Cut profile
Sea scallops are among the most temperature-sensitive proteins in cookery: a 30-second
difference separates silky-sweet from rubbery. The objective is a deep mahogany
caramelised crust on flat faces while the interior remains just opaque and barely
firm — target 115-125°F / 46-52°C at the thickest point. A screaming-hot, dry pan
(500°F+ cast iron) and completely dry scallops (paper-towels 30 minutes before) are
prerequisites for the crust formation.

## Source recipes

### 1. J. Kenji López-Alt — Perfect Pan-Seared Scallops (Serious Eats)
- **Source**: seriouseats.com/the-best-pan-seared-scallops
- **Method**: Dry thoroughly, stainless or cast iron ripping hot, oil with high
  smoke point, 90 sec per side undisturbed. Butter baste 30 sec at end.
- **Target**: **115°F / 46°C** at centre (translucent/barely set core = best texture)
- **Note**: Kenji's key insight: the "foot" (small muscle) shrinks during cooking —
  remove it for even thickness. Scallops release from the pan when ready to flip.

### 2. Thomas Keller — Caramelised Sea Scallops (Bouchon Bistro)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Perfectly dry scallops, clarified butter in carbon steel at maximum heat,
  90 sec per side, season only after crust forms.
- **Target**: **115-120°F / 46-49°C** at centre
- **Note**: Keller seasons AFTER searing to prevent moisture extraction pre-sear.

### 3. Gordon Ramsay — Restaurant-Style Seared Scallops (MasterClass)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Dry scallops, olive oil, maximum heat, 90-120 sec per side. Rest 30 sec.
- **Target**: Visual: golden-brown crust, slightly springy — about **120-125°F / 49-52°C**
- **Note**: Ramsay's "slightly springy" texture cue maps to 120-125°F internal.

### 4. Nobu Matsuhisa — Seared Scallops (Nobu: The Cookbook)
- **Source**: Nobu: The Cookbook (Kodansha International)
- **Method**: Sesame oil, maximum heat, 60 sec per side only.
- **Target**: **113-122°F / 45-50°C** — translucent, barely warm at centre
- **Note**: Nobu's approach is the most Japanese-influenced: the scallop centre
  remains essentially raw, heated only by carryover.

### 5. Eric Ripert — Barely Cooked Scallops (Le Bernardin)
- **Source**: Le Bernardin Cookbook (Clarkson Potter)
- **Method**: Maximum heat, clarified butter, 60 sec per side, rest 30 sec.
- **Target**: **115°F / 46°C** — "opaque outside, translucent at centre, barely warm"
- **Note**: Le Bernardin is famous for cooking seafood to the lowest temperature
  that still constitutes "cooked" — scallops are a signature example.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller / Ripert | 115-120°F / 46-49°C | Barely set, translucent centre |
| Gordon Ramsay | 120-125°F / 49-52°C | "Slightly springy" |
| Japan / Nobu | 45-50°C / 113-122°F | Near-raw |
| USDA minimum (shellfish) | 145°F / 63°C | Safe but rubbery |

**Culinary consensus: 46-52°C / 115-126°F.** Maps to `medium` in shellfish doneness.
Note: USDA 145°F produces the rubbery, overcooked scallop texture universally
avoided in professional cookery.

## What makes this method special
Pan searing scallops with a Maillard crust is considered one of the hardest simple
techniques in cooking — completely dry surface, maximally hot pan, and nerves of
steel not to flip too early. The payoff: a deep caramel crust over a silky, barely-
set interior that no other method can produce.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`
- `recommended_doneness`: `"medium"` (46-52°C culinary consensus)
