# Kangaroo Steak × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Kangaroo (red or grey) is Australia's most sustainable red meat — extremely lean
(1-2% fat), high in protein, and with a rich, earthy, slightly gamey flavour
similar to lean venison. Kangaroo loin, fillet, or rump steak is best at medium-rare
(130-135°F / 54-57°C). Australian food safety standard for kangaroo is 63°C (not
the game standard of 71°C because kangaroo is commercially processed). Culinary
tradition targets 54-57°C. A very hot pan, fat added (kangaroo has essentially none),
and 90-120 seconds per side is the universal approach.

## Source recipes

### 1. Hank Shaw — Kangaroo Steaks (honest-food.net)
- **Source**: honest-food.net/kangaroo-steak
- **Method**: Cast iron, duck fat or lard, maximum heat, 90 sec per side. Rest 5 min.
- **Target**: **130-135°F / 54-57°C** — "treat exactly like lean venison"

### 2. Luke Mangan — Pan-Seared Kangaroo Loin (Australian celebrity chef)
- **Source**: lukemangan.com / Australian food media
- **Method**: Hot pan, macadamia oil, 2 min per side, rest 5 min.
- **Target**: **54-58°C / 130-136°F** — medium-rare (Australian culinary standard)
- **Note**: Mangan is Australia's leading advocate for kangaroo cuisine; his
  target reflects Australian commercial kitchen practice.

### 3. MasterChef Australia — Kangaroo Technique
- **Source**: Australian MasterChef TV show / tenplay.com.au
- **Method**: Cast iron sear, 2-3 min per side, rest 5-8 min.
- **Target**: **54-58°C** — consistently shown on Australian cooking shows

### 4. Gordon Ramsay — Kangaroo Fillet (Kitchen Secrets S03)
- **Source**: bbc.co.uk/food/gordon_ramsay
- **Method**: Hot pan, beef dripping, 90 sec per side, rest.
- **Target**: **54-57°C / 130-135°F** — "rare to medium-rare, like venison"

### 5. Jared Ingersoll (Australian) — Pan-Seared Kangaroo Loin (Danks Street Depot)
- **Source**: danksstreetdepot.com.au / Australian culinary tradition
- **Method**: Native bush herbs + hot pan, 2 min per side. Rest 5 min.
- **Target**: **54-58°C** at centre

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw | 130-135°F / 54-57°C | Lean venison-equivalent |
| Australian culinary | 54-58°C | Professional kitchen standard |
| Gordon Ramsay | 54-57°C | "Like venison" |
| Australian food safety | 63°C | Minimum for commercial meat |

**Culinary consensus: 54-58°C / 130-136°F medium-rare.**
Maps to `medium_rare` in game doneness.

## What makes this method special
Pan-seared kangaroo is perhaps the most sustainable premium red meat available —
wild-harvested, zero food-miles for most of Australia, extraordinarily lean and
nutritious. The flavour is clean, dark, and earthy without the overpowering gaminess
of unaged wild venison. Australia's indigenous food heritage includes kangaroo
cookery for tens of thousands of years.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`
- `recommended_doneness`: `"medium_rare"` (54-58°C culinary consensus)
