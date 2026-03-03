# Mutton Chop × Pan Sear — Recipe Temperature Research

## Cut profile
Mutton is sheep over 1 year old (typically 2-5 years), with a more intense, complex
flavour than lamb and firmer, redder flesh. Mutton chops (loin or rib) are treated
similarly to lamb but benefit from a slightly longer marinade (1-2 hours minimum)
to complement the stronger flavour. USDA safety standard: 145°F / 63°C + 3-min rest
(same as lamb). Most culinary traditions target medium (140-145°F / 60-63°C) for
mutton chops — slightly higher than lamb's medium-rare, to allow the stronger
connective tissue to soften slightly more.

## Source recipes

### 1. Fergus Henderson — Mutton Chops (Beyond Nose to Tail / Nose to Tail Eating)
- **Source**: Beyond Nose to Tail (Bloomsbury)
- **Method**: Season, hot skillet with beef dripping, 3-4 min per side, rest 5 min.
- **Target**: **60-65°C / 140-149°F** — Henderson prefers mutton at slightly higher
  than lamb to mellow the stronger fat.
- **Note**: Henderson is one of the few prominent advocates of mutton in modern
  British cooking; he argues it is far superior to lamb in flavour.

### 2. Hank Shaw — Mutton Chops (Hunter Angler Gardener Cook — adapted from mature
  sheep section)
- **Source**: honest-food.net
- **Method**: Marinate in red wine + garlic + rosemary 2 hours, cast iron sear,
  3-4 min per side, rest 5 min.
- **Target**: **135-145°F / 57-63°C** at centre (medium-rare to medium)

### 3. Yotam Ottolenghi — Mutton Chops with Spiced Rub (Plenty More)
- **Source**: Plenty More (Ten Speed Press)
- **Method**: Heavy spice rub (cumin, coriander, garam masala), hot cast iron,
  3-4 min per side.
- **Target**: **57-63°C / 135-145°F** (medium for spice-rubbed mutton)

### 4. Jamie Oliver — Old Mutton Chops (Jamie's Great Britain)
- **Source**: Jamie's Great Britain (Hyperion)
- **Method**: Rosemary + anchovy marinade, hot griddle pan, 3-4 min per side.
- **Target**: **60-65°C / 140-149°F** — Oliver targets medium for mutton to avoid
  the overpowering lanolin flavour of undercooked mature sheep fat.

### 5. Magnus Nilsson — Swedish Mutton (Fårkött) Preparation
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Nordic-style with butter, medium-high heat, 4-5 min per side.
- **Target**: **60-65°C** (Swedish fårkött standard — medium)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| UK / Henderson | 60-65°C / 140-149°F | Slightly above lamb |
| USA / Hank Shaw | 135-145°F / 57-63°C | Medium-rare to medium |
| Middle East / Ottolenghi | 57-63°C | Spice-influenced |
| UK / Jamie Oliver | 60-65°C | Medium for fat melting |
| Sweden | 60-65°C | Nordic fårkött standard |

**Consensus: 60-65°C / 140-149°F (medium).** Maps to `medium` in mutton doneness.
Slightly higher than lamb's medium-rare, to allow the stronger flavour and fat
to mellow and the denser connective tissue to soften.

## What makes this method special
Pan searing mutton chops concentrates the distinctive intense mutton flavour — part
game, part lamb — in a mahogany crust while keeping the interior juicy. The marinade
step is nearly essential for mutton (unlike young lamb) to temper the stronger flavour
and add complementary aromatics. Mutton is a largely forgotten cut deserving revival.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`
- `recommended_doneness`: `"medium"` (60-65°C consensus for mutton)
