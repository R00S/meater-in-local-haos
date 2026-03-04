# Moose Steak × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Moose (älg in Swedish, elg in Norwegian) is the largest deer species and produces
very lean, dark red meat with a mild, earthy, slightly sweet game flavour. Moose
loin or sirloin steak is a Scandinavian staple — one of the most prized and
frequently eaten game meats in Northern Europe. Like all very lean game, moose
should be cooked to medium-rare (52-58°C / 126-136°F) and pulled from the heat
quickly. Butter basting and a hot cast iron pan (500°F+) are the professional
standard.

## Source recipes

### 1. Magnus Nilsson — Stekt älgbiff (Fäviken / Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon) / Fäviken cookbook
- **Method**: Tallow or brown butter, maximum heat cast iron, 2 min per side,
  rest 5-8 min.
- **Target**: **52-55°C / 126-131°F** — "röd-rosa, varm" (red-pink, warm)

### 2. Traditional Swedish älgjakt (moose hunting) cooking tradition
- **Source**: viltmat.se / Swedish hunting/game tradition
- **Method**: Smör (butter), het gryta (hot cast iron), 2 min per sida, vila 5 min.
- **Target**: **55-58°C** (mainstream Swedish target for moose steak)

### 3. Leila Lindholm — Stekt älgbiff (leila.se)
- **Source**: leila.se/recept
- **Method**: Browned butter + thyme, very hot pan, 2-3 min per side.
- **Target**: **55-58°C** at centre ("rosa-röd" / pink-red)

### 4. Hank Shaw — Moose Steak (honest-food.net)
- **Source**: honest-food.net
- **Method**: Tallow, cast iron max heat, 90-120 sec per side.
- **Target**: **130-135°F / 54-57°C** — same as venison/bison standard

### 5. Norwegian Elg tradition — Elgbiff
- **Source**: norgesmat.no / Norwegian game tradition
- **Method**: Smør (butter) in jernstekepanne (cast iron), 2-3 min per side.
- **Target**: **52-58°C** (Norwegian "rødmende" = blushing-pink target)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Nordic professional / Nilsson | 52-55°C / 126-131°F | Fäviken standard |
| Swedish tradition | 55-58°C | Mainstream älg standard |
| Norwegian tradition | 52-58°C | "Rødmende" |
| USA / Hank Shaw | 130-135°F / 54-57°C | Game standard |
| USDA (game) | 160°F / 71°C | US safe minimum |

**Consensus: 52-58°C / 126-136°F medium-rare.**
Maps to `medium_rare` in game doneness.

## What makes this method special
Pan-seared moose steak in butter is Sweden and Norway's most beloved game preparation —
an annual autumn ritual after the moose hunt. The clean, sweet, earthy flavour of
älg/elg needs only butter, salt, and heat to shine. No other Scandinavian game
preparation is as culturally significant or as frequently made.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`
- `recommended_doneness`: `"medium_rare"` (52-58°C Nordic consensus)
