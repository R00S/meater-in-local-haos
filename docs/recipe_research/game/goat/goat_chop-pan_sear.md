# Goat Chop × Pan Sear — Recipe Temperature Research

## Cut profile
Goat (kid or mature goat) chops are a staple in Caribbean, South Asian, Middle
Eastern, and Mediterranean cuisines. The meat is leaner than lamb with a slightly
stronger, cleaner flavour. Goat chops (loin or rib) pan sear similarly to lamb
but often benefit from a marinade. USDA safety standard: 145°F / 63°C + 3-min
rest. Most culinary traditions target medium to medium-well (145-160°F / 63-71°C)
for goat, as the leaner meat can become dry at higher temperatures while the
connective tissue benefits from being cooked slightly beyond lamb's medium-rare.

## Source recipes

### 1. Hank Shaw — Goat Chops (honest-food.net / Hunt Gather Cook)
- **Source**: honest-food.net/goat-chops
- **Method**: Marinate in yogurt + spices 2 hours, cast iron medium-high heat,
  3-4 min per side. Rest 5 min.
- **Target**: **145-150°F / 63-66°C** at centre (USDA safe with slight pink)
- **Note**: Shaw notes goat's leanness means it should not be served below 145°F
  as the connective tissue hasn't softened enough. Unlike lamb, rare goat is not
  the preferred target.

### 2. Yotam Ottolenghi — Goat Chops with Chermoula (Extra Good Things)
- **Source**: Extra Good Things (Appetite by Random House)
- **Method**: Chermoula marinade, cast iron or griddle, 3-4 min per side.
- **Target**: **145-155°F / 63-68°C** at thickest loin

### 3. Rick Stein — Pan-Fried Goat Chops (Rick Stein Far Eastern Odyssey)
- **Source**: Far Eastern Odyssey (BBC Books)
- **Method**: Asian-spiced marinade, hot pan, 3-4 min per side.
- **Target**: **63-68°C / 145-155°F**

### 4. Grace Parisi — Caribbean Goat Chops (Food & Wine Magazine)
- **Source**: foodandwine.com
- **Method**: Jerk-seasoned, cast iron, 4-5 min per side.
- **Target**: **145-155°F / 63-68°C** at centre

### 5. Leila Lindholm (adapted) — Getstek / Getkotlett
- **Source**: Pan-sear goat is not a prominent Swedish tradition; applies lamb
  methodology with slightly higher target for leaner goat meat
- **Method**: Marinate, cast iron, 3-4 min per side.
- **Target**: **65-68°C** (adapted from Swedish lamb standard + leanness adjustment)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw / USDA | 145-150°F / 63-66°C | USDA safe, slight pink |
| Middle East / Ottolenghi | 145-155°F / 63-68°C | Medium |
| UK / Rick Stein | 63-68°C | Medium |
| Caribbean | 145-155°F / 63-68°C | Jerk style |
| Adapted Nordic | 65-68°C | Leaner than lamb |

**Consensus: 63-68°C / 145-155°F (medium).** Maps to `medium` in goat doneness.
Unlike lamb, goat is not typically served medium-rare — the leaner meat and
connective tissue profile makes medium the preferred target.

## What makes this method special
Pan searing goat chops with a yogurt or spice marinade creates a deeply caramelised
crust on a uniquely flavoured meat — goat is cleaner and less fatty than lamb but
more complex than chicken or pork. The marinade is essential: it compensates for
the leanness and prevents the exterior from drying while the interior heats through.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `charcoal_grill`, `oven_roast`
- `recommended_doneness`: `"medium"` (63-68°C consensus for goat)
