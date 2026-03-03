# Bison Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Bison (American buffalo) steak is treated virtually identically to beef steak by most
authorities, but with one critical difference: bison is significantly leaner (2-3%
fat vs 10-20% for equivalent beef cuts). This means bison overcooks faster than beef
at the same temperature. The loin steaks (strip, ribeye equivalent) are best at
medium-rare (130-135°F / 54-57°C), and should never be taken above medium (140°F /
60°C). Pan searing in a very hot cast iron (500°F+) for 90-120 seconds per side is
the professional recommendation.

## Source recipes

### 1. Hank Shaw — Bison Steak (honest-food.net)
- **Source**: honest-food.net/bison-steak
- **Method**: Dry 24 hours, cast iron maximum heat, 90-120 sec per side.
- **Target**: **130-135°F / 54-57°C** — same as beef, lean means faster carryover
- **Note**: Shaw: "Treat bison like a very lean beef ribeye — same temp, shorter cook."

### 2. Ted Turner's Montana Grill — Bison Preparation Standards
- **Source**: Montana Grill / ted-turners-montana-grill.com
- **Method**: High heat, minimal cooking time, medium-rare target.
- **Target**: **130-135°F / 54-57°C**
- **Note**: Turner, the largest bison rancher in North America, specifies
  medium-rare for all bison steaks at his restaurant chain.

### 3. J. Kenji López-Alt — Bison Steaks (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Same technique as beef — cast iron, hot, quick. Pull 5°F early.
- **Target**: **125-130°F / 52-54°C** pull; 130-135°F/54-57°C after rest
- **Note**: Pull 5°F earlier than for beef because bison's leanness produces
  more carryover temperature rise per minute of resting.

### 4. Steve Raichlen — Grilled/Seared Bison (Planet Barbecue)
- **Source**: Planet Barbecue (Workman)
- **Method**: Season simply (bison's clean flavour needs no masking), very hot
  surface 2-3 min per side.
- **Target**: **130-140°F / 54-60°C** (medium-rare to medium)

### 5. Leila Lindholm (adapted from nordisk game tradition)
- **Source**: Adapted from Swedish viltmat tradition
- **Method**: Brown butter, hot cast iron, 2 min per side, rest 5 min.
- **Target**: **54-58°C** (Nordic game steak standard)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw / Kenji | 130-135°F / 54-57°C | Medium-rare, pull early |
| Ted Turner Montana Grill | 130-135°F / 54-57°C | Industry standard |
| Steve Raichlen | 130-140°F / 54-60°C | Medium-rare to medium |
| Nordic adapted | 54-58°C | Game steak standard |
| USDA (beef standard applies) | 145°F / 63°C | Safe minimum |

**Consensus: 130-135°F / 54-57°C medium-rare.** Maps to `medium_rare` in game doneness.

## What makes this method special
Pan searing bison steak delivers the identical Maillard crust as beef but on a
fundamentally cleaner-flavoured, lower-fat protein. The result is surprisingly
elegant — the absence of marbling fat means the bison's inherent, grass-fed sweetness
dominates. Speed is everything: 90 seconds per side on maximum heat.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `charcoal_grill`, `oven_roast`
- `recommended_doneness`: `"medium_rare"` (54-57°C consensus)
