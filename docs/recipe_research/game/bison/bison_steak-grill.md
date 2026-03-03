# Bison Steak × Grill — Recipe Temperature Research

## Cut profile
Grilling bison steak over maximum heat (450-500°F / 230-260°C) is the classic
American Great Plains preparation — simple, respectful of the clean, lean protein.
The extreme leanness demands the grill be as hot as possible and cooking time as
brief as possible. Like venison, bison should never be cooked above medium on the
grill — 140°F / 60°C is the absolute upper limit before the meat becomes dry and
loses its characteristic clean, slightly sweet flavour.

## Source recipes

### 1. Hank Shaw — Grilled Bison Steak (honest-food.net)
- **Source**: honest-food.net/grilled-bison
- **Method**: Oil-rubbed, 500°F+ grill, 2-3 min per side max, rest 5 min.
- **Target**: **130-135°F / 54-57°C** at centre

### 2. Ted Turner's Montana Grill — Grilled Bison Guidelines
- **Source**: ted-turners-montana-grill.com
- **Method**: Charcoal or gas maximum heat, 2-3 min per side.
- **Target**: **130-135°F / 54-57°C** medium-rare

### 3. Steve Raichlen — Grilled Bison with Herb Butter (Planet Barbecue)
- **Source**: Planet Barbecue (Workman)
- **Method**: Oil marinade, maximum grill heat, 2-3 min per side, herb butter finish.
- **Target**: **130-140°F / 54-60°C**

### 4. Weber — Wild Game Grilling Guide
- **Source**: weber.com/grilling-inspiration/wild-game
- **Method**: Maximum heat, brief cook, 2-3 min per side.
- **Target**: **145°F / 63°C** (USDA standard they quote); culinary preferred 130-135°F

### 5. Magnus Nilsson — Grilled Bison (Nordic Cookbook context)
- **Source**: The Nordic Cookbook (Phaidon) — game chapter
- **Method**: Simple seasoning, hot grill, 2-3 min per side.
- **Target**: **54-57°C** (Nordic game steak standard)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw / Raichlen | 130-140°F / 54-60°C | Medium-rare preferred |
| Ted Turner Montana Grill | 130-135°F / 54-57°C | Industry restaurant standard |
| USDA | 145°F / 63°C | Safe minimum |

**Consensus: 130-135°F / 54-57°C medium-rare.** Maps to `medium_rare` in game doneness.

## What makes this method special
Grilled bison has a direct lineage to the original Great Plains cooking traditions.
The open flame crust contrasts perfectly with bison's clean, sweet lean flesh —
a combination that feels simultaneously ancient and modern. The brief cook time
(under 6 minutes total) makes this one of the fastest premium steaks possible.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium_rare"` (54-57°C consensus)
