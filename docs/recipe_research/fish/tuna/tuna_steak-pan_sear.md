# Tuna Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Tuna steak (bluefin, yellowfin/ahi, bigeye) is unique among fish: it is almost always
served rare or medium-rare — a raw, cool red centre surrounded by a seared exterior
crust. Unlike most proteins, tuna at room temperature is intentionally the target state.
USDA mandates 145°F / 63°C for fish safety, but virtually all professional and home
recipes targeting quality serve tuna at 95-115°F / 35-46°C centre temperature.
The key is a screaming-hot pan (500°F+ / 260°C+) and maximum 60-90 seconds per side.

## Source recipes

### 1. J. Kenji López-Alt — Seared Ahi Tuna (Serious Eats)
- **Source**: seriouseats.com/pan-seared-tuna-steak
- **Method**: Dry completely, season with sesame seeds optional, cast iron or
  carbon steel at maximum heat, 45-60 sec per side. Thin sear line only.
- **Target**: **95-105°F / 35-41°C** at centre (cool, very rare red core)
- **Note**: Kenji argues tuna should be "barely warm" at the centre — it is
  sold as sushi-quality for a reason.

### 2. Gordon Ramsay — Seared Tuna Steak (Kitchen Secrets / MasterClass)
- **Source**: gordonramsay.com / masterclass.com
- **Method**: Season, sesame crust optional, maximally hot pan, 1 min per side.
- **Target**: Visual: sear line 3-5mm deep on all sides, centre deep red
  (~**104-115°F / 40-46°C**)
- **Note**: Ramsay's visual guide: a quarter-inch seared band all around with
  a raw red core.

### 3. Nobu Matsuhisa — Tuna Tataki / Seared Tuna (Nobu: The Cookbook)
- **Source**: Nobu: The Cookbook (Kodansha International)
- **Method**: Sear 30 sec per side in sesame oil at maximum heat. Ice bath
  immediately to halt cooking.
- **Target**: **Barely above room temperature at centre** — tataki style
  (~**86-95°F / 30-35°C**)
- **Note**: Nobu's ice-bath technique is a restaurant-specific method that
  precisely stops cooking — practical only with very precise equipment.

### 4. Eric Ripert — Seared Tuna (Le Bernardin Cookbook / CBS Sunday Morning)
- **Source**: Le Bernardin Cookbook (Clarkson Potter)
- **Method**: Canola oil, maximum heat, 1 min total (30 sec per side or less for
  thin cuts). Probe centre: still cold.
- **Target**: **Below 100°F / 38°C** at centre — "the fish should still be cold
  in the middle"
- **Note**: Ripert's standard reflects the Le Bernardin approach: tuna as an
  expression of its own raw flavour, barely heated.

### 5. Magnus Nilsson — Stekt tonfisk tataki-stil (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Very hot pan, 45 sec per side, serve sliced thin.
- **Target**: **40-46°C** at centre (barely warm by Scandinavian home standards
  — unusual; most Swedish recipes call for fully cooked tuna at 65-70°C)
- **Note**: Nilsson's Japanese-influenced approach is a departure from traditional
  Swedish tuna preparation which historically cooked tuna fully through.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Japan / Nobu / Ripert | 30-40°C / 86-104°F | Raw-centre tataki |
| USA / Kenji / Ramsay | 40-46°C / 104-115°F | Very rare sear |
| Nordic / Nilsson | 40-46°C | Japanese-influenced |
| USDA minimum (fish) | 145°F / 63°C | Safe for all, but overcooks tuna |

**Culinary consensus: 40-46°C / 104-115°F for proper seared tuna.**
Note: USDA 145°F produces fully grey, dry tuna universally considered
overcooked in professional kitchens. USDA standard should be applied for
vulnerable populations (elderly, pregnant, immunocompromised).

## What makes this method special
Seared tuna is the highest-heat, shortest-cook method in all of fish cookery.
The screaming-hot pan creates a Maillard crust in under 60 seconds on each side
while leaving the interior essentially raw. No other fish benefits from this
treatment — it requires sushi-grade quality and the confidence to serve a red,
cool interior.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `charcoal_grill`
- `recommended_doneness`: `"rare"` (40-46°C / 104-115°F culinary standard)
