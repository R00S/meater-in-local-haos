# Moose Steak × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Moose (älg) is the most prized game meat in Scandinavia — älgstek is a centrepiece
dish in Sweden, Norway, and Finland. Moose is extremely lean red meat with a deep,
rich, mild game flavour. Like all lean game steaks, it must not be overcooked —
medium-rare to medium (130-140°F / 54-60°C) retains juiciness and flavour. The
Nordic culinary tradition is to serve älg at 54-57°C (rosa). USDA recommends 160°F
/ 71°C for wild game.

## Source recipes

### 1. Magnus Nilsson — Grillat Älgkött (The Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Season with salt + pepper, hot charcoal grill, 3-4 min per side.
  Rest 5 min. Serve with lingonberry.
- **Target**: **54-57°C** — "rosa, lätt stekt" (Nordic tradition)

### 2. Leila Lindholm — Grillad älgbiff (leila.se)
- **Source**: leila.se/recept
- **Method**: Krydda, het grill, 3-4 min per sida. Vila 5 min.
- **Target**: **54-57°C** — "rosa inuti"

### 3. Hank Shaw — Grilled Moose Steak (honest-food.net)
- **Source**: honest-food.net
- **Method**: Pat dry, hot grill, 3-4 min per side. Like venison.
- **Target**: **130-135°F / 54-57°C** — "medium-rare like venison/bison"

### 4. Tom Parker Bowles — Moose / Elk Steak (Let's Eat Meat)
- **Source**: Let's Eat Meat (Pavilion)
- **Method**: Hot grill, 3-4 min per side.
- **Target**: **130-140°F / 54-60°C**

### 5. Swedish Hunting Association (Svenska Jägareförbundet)
- **Source**: jagareforbundet.se
- **Method**: Grill or pan, medium-high, 3-4 min per side.
- **Target**: **60-65°C** at centre (SJF recommends slightly higher for wild game)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Sweden / Nordic (culinary) | 54-57°C | "Rosa" |
| USA / Hank Shaw | 130-135°F / 54-57°C | Medium-rare |
| UK | 130-140°F / 54-60°C | |
| Sweden / Swedish Hunting Assoc | 60-65°C | Game safety slightly higher |
| USDA (wild game) | 160°F / 71°C | |

**Culinary consensus: 54-57°C / 130-135°F medium-rare (Nordic and international).**
Maps to `medium_rare` in game doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`
- `recommended_doneness`: `"medium_rare"` (54-57°C Nordic/culinary consensus)
