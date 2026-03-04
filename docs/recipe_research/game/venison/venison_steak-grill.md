# Venison Steak × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Grilling venison steak over high heat (400-500°F / 200-260°C) delivers smoky char
on the leanest game meat. The challenge identical to pan searing: extreme leanness
means the interior overcooks rapidly. On the grill, the key is maximum heat and
minimum time — 2-3 minutes per side for a 1-inch loin steak. Marinating in oil
for 1-2 hours beforehand compensates for the lack of intramuscular fat. Never cook
venison steak past medium (140°F / 60°C) on the grill.

## Source recipes

### 1. Hank Shaw — Grilled Venison Steaks (honest-food.net)
- **Source**: honest-food.net/grilled-venison-steak
- **Method**: Oil marinade 1-2 hours, high-heat grill direct, 2-3 min per side,
  rest 5 min.
- **Target**: **130-135°F / 54-57°C** at centre (medium-rare)
- **Note**: Shaw recommends marinating venison before grilling specifically to
  add fat content that the lean meat lacks.

### 2. Steve Raichlen — Grilled Venison Tenderloin (Planet Barbecue)
- **Source**: Planet Barbecue (Workman) / barbecuebible.com
- **Method**: Herb marinade, very hot grill 3-4 min per side maximum.
- **Target**: **130-140°F / 54-60°C** (medium-rare to medium)
- **Note**: Raichlen notes venison is treated like very lean beef on the grill —
  same temperatures, shorter cook times.

### 3. Magnus Nilsson — Grillad hjortbiff (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Simple salt + lingonberry marinade, hot grill 2-3 min per side.
- **Target**: **52-55°C / 126-131°F** (Nordic game standard)

### 4. Gordon Ramsay — Grilled Venison Haunch (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Juniper + garlic marinade, very hot grill, 3 min per side.
- **Target**: **54-57°C** — "must be pink"

### 5. Francis Mallmann — Open-Fire Venison Steak (Seven Fires context)
- **Source**: Seven Fires (Artisan Books) — adapted game section
- **Method**: Hardwood ember grill, rosemary + garlic marinade, 3 min per side.
- **Target**: **55-60°C / 131-140°F**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw / Raichlen | 130-140°F / 54-60°C | Medium-rare to medium |
| Nordic / Nilsson | 52-55°C | Wild game standard |
| Gordon Ramsay | 54-57°C | Must be pink |
| USDA (game) | 160°F / 71°C | Safe minimum |

**Consensus: 52-57°C / 126-135°F medium-rare.** Maps to `medium_rare` in game doneness.

## What makes this method special
Grilling adds a smoky, charred layer to venison that deepens the gamey, mineral
flavour profile of the meat. The open-fire char complements the wild character of
the protein in a way indoor methods cannot. Venison on a wood-fire grill is the
most ancient preparation method for this meat — essentially unchanged for millennia.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium_rare"` (52-57°C consensus)
