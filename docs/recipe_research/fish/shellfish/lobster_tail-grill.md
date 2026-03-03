# Lobster Tail × Grill — Recipe Temperature Research

## Cut profile
Grilled lobster tail is one of the most luxurious shellfish preparations: the shell
is split, the tail butterflied and placed flesh-side down on a 400-450°F / 200-230°C
grill for 5-7 minutes, then flipped onto the shell side with butter baste. The target
internal temperature is 135-140°F / 57-60°C — opaque white flesh that is just firm
and pulls away from the shell, but still tender and juicy. Overcooked lobster (above
145°F / 63°C) becomes rubbery; below 130°F/54°C it is undercooked and translucent.

## Source recipes

### 1. J. Kenji López-Alt — Grilled Lobster Tail (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Butterfly tail (split shell, pull meat up on top of shell), brush with
  clarified butter + garlic, grill 450°F 5-6 min.
- **Target**: **135-140°F / 57-60°C** at thickest point

### 2. Gordon Ramsay — Grilled Lobster Tail (Kitchen Secrets / MasterClass)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Halve lengthwise, herb butter, grill flesh-side 3-4 min, shell-side 3 min.
- **Target**: **140°F / 60°C** — "opaque, pulls from shell"

### 3. Thomas Keller — Grilled Lobster Tail (Bouchon)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Clarified butter baste, high-heat grill, 4-5 min flesh-side.
- **Target**: **135-140°F / 57-60°C**

### 4. Rick Stein — Grilled Lobster Tail (Rick Stein's Seafood)
- **Source**: Rick Stein's Seafood (BBC Books)
- **Method**: Garlic + herb butter, grill 5-7 min total.
- **Target**: **60-65°C** at thickest

### 5. Nobu Matsuhisa — Grilled Lobster (Nobu: The Cookbook)
- **Source**: Nobu: The Cookbook (Kodansha International)
- **Method**: Yuzu-miso butter, grill 5-6 min.
- **Target**: **57-62°C** at thickest point

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller | 135-140°F / 57-60°C | Just opaque, pull-from-shell |
| Gordon Ramsay | 140°F / 60°C | Opaque |
| UK / Rick Stein | 60-65°C | "Just set" |
| Japan / Nobu | 57-62°C | Near-Japanese standard |
| USDA (shellfish) | 145°F / 63°C | Safe minimum |

**Consensus: 57-62°C / 135-145°F.** Maps to `well_done` in shellfish doneness.

## What makes this method special
Grilled lobster tail in clarified butter is considered the pinnacle of summer grilling
luxury — a shellfish preparation that transforms an already extraordinary ingredient
through direct flame and herb butter. The caramelised flesh-side grill marks and
rendered shell flavours combine with the sweetness of lobster in a way no other cooking
method matches.

## Data applied to cooking_data.py
- `supported_methods` gains: `grill`, `oven_broil`, `poach`
- `recommended_doneness`: `"well_done"` (57-62°C / USDA 63°C standard)
