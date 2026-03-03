# Rack of Lamb × Oven Roast — Recipe Temperature Research

## Cut profile
Rack of lamb (carré d'agneau) is the most elegant lamb presentation: 8 rib bones
frenched (cleaned) to expose the bone handles, surrounding a loin eye muscle
(2-3 cm thick). Standard preparation: sear all sides in a hot pan, coat in herb
crust, then roast at 200°C / 390°F for 15-20 minutes to 57-63°C / 135-145°F.
The thin loin muscle cooks quickly — a 2-rack restaurant-size portion (1 kg)
takes only 20-25 minutes in the oven after searing.

## Source recipes

### 1. Thomas Keller — Herb-Crusted Rack of Lamb (The French Laundry / Bouchon)
- **Source**: The French Laundry Cookbook (Artisan)
- **Method**: Sear all sides in clarified butter, mustard-dijon coating, herb breadcrumb
  crust, 400°F / 200°C oven 15-20 min. Rest 10 min.
- **Target**: **130-135°F / 54-57°C** pull; 135-140°F / 57-60°C after rest
- **Note**: Keller's herb crust must be added AFTER the initial sear — adding before
  searing burns the breadcrumbs.

### 2. Gordon Ramsay — Herb-Crusted Rack of Lamb (MasterClass)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Season, sear all sides in hot pan, mustard + herb crust, 200°C / 390°F
  oven 12-15 min. Rest 5-8 min.
- **Target**: **135°F / 57°C** at eye of loin (medium-rare)
- **Note**: Ramsay: "lamb needs to be pink — if it's grey, it's been abused."

### 3. Leila Lindholm — Lammsida i ugn (leila.se)
- **Source**: leila.se/recept
- **Method**: Herb + mustard crust, 200°C oven 18-22 min.
- **Target**: **58-60°C** at loin eye (Swedish "rosa")

### 4. Paul Bocuse — Carré d'agneau rôti (Bocuse in Your Kitchen)
- **Source**: Bocuse in Your Kitchen (Flammarion)
- **Method**: Sear in hot butter, mustard + herbes de Provence, oven 220°C 15 min.
- **Target**: **55-57°C** at eye — "rosé saignant" (bloody-pink = French ideal)
- **Note**: Bocuse's slightly lower target than British or American reflects the
  French preference for a more pronounced red-pink interior.

### 5. Heston Blumenthal — Sous vide + roast Rack of Lamb (adapted for oven)
- **Source**: hestonfromhome.com
- **Method**: Low oven 60°C / 140°F for 1.5 hours first (sous vide-style), then sear
  and breadcrumb blast at 250°C / 480°F for 10 min.
- **Target**: **57-60°C / 135-140°F** at thickest point of loin
- **Note**: Blumenthal's two-phase approach produces the most evenly cooked rack —
  the low-oven phase pasteurises the meat uniformly before the high-blast crust.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Keller | 130-135°F / 54-57°C | Medium-rare pull |
| UK / Ramsay | 135°F / 57°C | Medium-rare |
| Sweden | 58-60°C | "Rosa" |
| France / Bocuse | 55-57°C | "Rosé saignant" |
| Heston | 57-60°C | Even gradient |

**Consensus: 55-60°C / 131-140°F medium-rare.** Maps to `medium_rare` in lamb doneness.

## What makes this method special
Rack of lamb is the quintessential restaurant-quality home cook showpiece — visually
stunning with the frenched rib bones, herb-crusted exterior, and perfectly pink eye
of loin. The sear-then-roast method is the only way to achieve both a deeply browned
crust and a precisely controlled interior.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `grill`
- `recommended_doneness`: `"medium_rare"` (55-60°C European consensus)
