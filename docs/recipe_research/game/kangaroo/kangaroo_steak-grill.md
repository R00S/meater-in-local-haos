# Kangaroo Steak × Grill — Recipe Temperature Research

## Cut profile
Kangaroo meat is one of the leanest red meats available — under 2% fat in most cuts.
This makes it cook extremely fast and dry out rapidly if overcooked. The Australian
industry recommendation: rare to medium-rare (55-60°C / 130-140°F). Above 65°C /
149°F the meat becomes very tough very quickly. Kangaroo is an official food safety
approved meat in Australia, and FSANZ (Food Standards Australia/New Zealand) approves
it as safe to serve medium-rare.

## Source recipes

### 1. Pete Evans — Grilled Kangaroo Loin (Modern Australian)
- **Source**: peteevans.com.au
- **Method**: Marinate in olive oil + garlic, very hot grill 2-3 min per side.
  Rest 3-5 min.
- **Target**: **55-60°C / 130-140°F** — "rare to medium-rare"

### 2. Australian Kangaroo Industry Association (ROCA)
- **Source**: kangaroo-and-wallaby.com / ROCA
- **Method**: Hot grill or pan, 2-3 min per side, rest.
- **Target**: **55-60°C** — "medium-rare recommended for best texture"

### 3. Kylie Kwong — Kangaroo (My China)
- **Source**: My China (Murdoch Books)
- **Method**: Wok sear or very hot grill, 2-3 min per side.
- **Target**: **55-60°C**

### 4. Hank Shaw — Kangaroo / Ultra-Lean Game (honest-food.net)
- **Source**: honest-food.net — adapted
- **Method**: Like very lean venison: very hot, very fast.
- **Target**: **130-135°F / 54-57°C** — medium-rare like venison

### 5. Leila Lindholm — Kängurubiff (adapted) (leila.se)
- **Source**: leila.se/recept (adapted from Australian technique)
- **Method**: Het grill eller gjutjärn, 2-3 min per sida. Vila.
- **Target**: **55-60°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Australia / ROCA / Pete Evans | 55-60°C | Industry recommendation |
| Australia / Kylie Kwong | 55-60°C | |
| USA / Hank Shaw | 54-57°C | Venison parallel |
| FSANZ | Approved rare-medium | |

**Consensus: 55-60°C / 130-140°F medium-rare.**
Maps to `medium_rare` in game doneness.

## What makes this method special
Kangaroo is Australia's most sustainable and most distinctive meat — a wild-harvested
game meat that is also one of the most environmentally responsible protein sources
in the world. Its extreme leanness means the ultra-high-heat, ultra-fast cooking
method is essential: there is no fat margin to protect against overcooking.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`
- `recommended_doneness`: `"medium_rare"` (55-60°C Australian/culinary standard)
