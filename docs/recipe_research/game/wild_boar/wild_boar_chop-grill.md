# Wild Boar Chop × Grill — Recipe Temperature Research

## Cut profile
Wild boar chops are leaner than domestic pork chops — less marbling, more muscle,
and more complex, gamey flavour. USDA treats wild boar as pork (145°F / 63°C safe
minimum) but some state health departments recommend 160°F / 71°C for wild game
pork due to the rare risk of Trichinella in wild populations. In practice, most
professional chefs cook wild boar to 145-150°F / 63-66°C. Grill over direct
medium-high heat 5-6 minutes per side.

## Source recipes

### 1. Hank Shaw — Grilled Wild Boar Chops (honest-food.net)
- **Source**: honest-food.net/wild-boar-recipe
- **Method**: Marinate in herbs, direct medium-high grill, 5-6 min per side.
- **Target**: **145-155°F / 63-68°C** — "slightly pink at centre"
- **Note**: Shaw recommends 145°F minimum for wild boar from hunted animals

### 2. Tom Parker Bowles — Wild Boar Chop (Let's Eat Meat)
- **Source**: Let's Eat Meat (Pavilion)
- **Method**: Hot grill, marinated, 5-6 min per side.
- **Target**: **145-155°F / 63-68°C**

### 3. Gordon Ramsay — Wild Boar (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Marinate in juniper + thyme, medium-high heat, 5-6 min per side.
- **Target**: **63-66°C / 145-150°F**

### 4. Leila Lindholm — Vildsvinskotlett (leila.se)
- **Source**: leila.se/recept
- **Method**: Marinera, grill medelhög värme, 5-6 min per sida.
- **Target**: **65-68°C**

### 5. Magnus Nilsson — Vildsvin (The Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Lingonberry marinade, hot grill or griddle, 5-6 min per side.
- **Target**: **63-68°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw | 145-155°F / 63-68°C | Wild boar culinary standard |
| UK / Parker Bowles | 145-155°F / 63-68°C | |
| Sweden / Nordic | 63-68°C | |
| USDA (as pork) | 145°F / 63°C | Minimum for pork/boar |

**Consensus: 145-155°F / 63-68°C.** Maps to `well_done` in pork/game doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`, `braise`
- `recommended_doneness`: `"well_done"` (145-155°F/63-68°C)
