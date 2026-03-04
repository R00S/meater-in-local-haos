# Ribeye Steak × Pan Fry — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Pan fry (as distinct from pan sear) typically means cooking in more oil at a moderately
high temperature (175-220°C / 350-430°F) rather than the near-smoking-point temperatures
of a pan sear (230-290°C / 450-550°F). The result is similar but with a slightly softer
crust — less Maillard depth than a screaming-hot sear, more even gentle browning. Many
home cooks in France, Germany, and Sweden use this as their default technique rather than
the American cast-iron blast approach.

## Source recipes

### 1. ICA Sverige — Steka entrecôte i panna (ica.se)
- **Source**: ica.se/recept/steka-entrecote
- **Method**: Swedish home-cooking standard — smör och rapsolja, medium-hög värme (not
  at the smoking point). Stek 2-3 min per sida, vänd en gång.
- **Target**: Medium rare = **52-54°C** innertemp, vila under folie 5 min till 55-57°C

### 2. German Bratpfanne technique — Rib-Eye braten (chefkoch.de / lecker.de)
- **Source**: chefkoch.de · lecker.de
- **Method**: Butterschmalz (clarified butter) or neutral Öl, medium-high heat.
  German home technique does not push temperature as high as US cast-iron method.
- **Kerntemperatur medium**: **54-57°C** for "rosa" result
- **Note**: German recipes more often call for medium (rosa = 54-60°C) rather than the
  US-style "medium-rare". Closest equivalent is "englisch/medium rare" at 54-57°C.

### 3. Gordon Ramsay — Pan-Fried Ribeye (gordonramsayrestaurants.com / YouTube)
- **Source**: gordonramsayrestaurants.com
- **Method**: Oil first, butter + thyme added for basting during cooking.
  Moderately high heat, constant tilting/basting — similar to pan fry but with active fat.
- **Target**: "Pink in the middle" = medium-rare at **54-57°C**. Ramsay consistently
  advocates medium-rare as the ideal for a ribeye.

### 4. Nigella Lawson — Steak Pan-Fry (nigella.com / How to Eat)
- **Source**: nigella.com
- **Method**: Standard British "frying pan steak" method — moderate heat, turn once,
  rest well. UK home cooking method is somewhat less aggressive than American.
- **Target**: "Nice and pink inside" = **54-57°C** — aligns with British medium-rare.

### 5. Tuscan-style bistecca in padella — Fiorentina pan-seared (La Cucina Italiana)
- **Source**: lacucinaitaliana.it
- **Method**: Padella di ferro (iron pan), olio extravergine, fuoco medio-alto.
  Italian tradition for bistecca is actually usually the grill or iron, but home version
  uses iron pan.
- **Target**: "Al sangue / al rosa" = **52-56°C** at core

## Temperature consensus

| Source | Target | Method character |
|--------|--------|-----------------|
| ICA Sverige | 52-54°C pull → 55-57°C final | Moderate-high, butter |
| Germany (Bratpfanne) | 54-57°C | Moderate, clarified butter |
| Gordon Ramsay | 54-57°C | Active basting |
| Nigella Lawson | 54-57°C | Moderate, single turn |
| Italy (padella) | 52-56°C | High iron pan |

**Consensus: medium-rare (54-57°C)** — identical final target to pan sear.
The difference vs. pan_sear: slightly less intense Maillard crust development, slightly
less smoke, more accessible technique for home cooks.

## What makes pan fry distinct from pan sear
Both achieve medium-rare at the same internal temperatures. Pan fry uses more oil,
slightly lower heat, and produces a more uniform golden-brown crust rather than the
"black-brick" deep crust of a hot cast-iron sear. The flavour is milder but more
accessible; especially common in Nordic and German home cooking.

## Data applied
- No `method_temperature_ranges` override needed — default ranges apply.
- `method_doneness["pan_fry"]` = not needed (same as `recommended_doneness`).
