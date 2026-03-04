# Ostrich Steak × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Ostrich (struts) is a ratite (flightless bird) but its meat is red, not white —
it is physiologically more similar to beef or venison than to chicken. Ostrich
fillet (fan fillet or top loin) is extremely lean (2-3% fat) and very tender.
It must be served at medium-rare (130-135°F / 54-57°C) to remain juicy — above
150°F / 65°C, ostrich becomes very dry and chalky. The USDA classifies ostrich
under poultry but the South African and European culinary tradition treats it
as red meat.

## Source recipes

### 1. South African Ostrich Board (SAOBC)
- **Source**: saobc.co.za
- **Method**: Hot grill, 3-4 min per side for 2 cm fillet. Rest 3 min.
- **Target**: **55-60°C / 130-140°F** — "medium-rare; serves at pink"

### 2. Tom Parker Bowles — Ostrich Steak (Let's Eat Meat)
- **Source**: Let's Eat Meat (Pavilion)
- **Method**: Very hot pan or grill, 3 min per side. Treat exactly like venison.
- **Target**: **130-135°F / 54-57°C**

### 3. Hank Shaw — Ostrich Steak (honest-food.net adapted)
- **Source**: honest-food.net
- **Method**: Like ultra-lean red meat (same approach as venison/bison).
- **Target**: **130-135°F / 54-57°C** — "medium-rare is perfect"

### 4. Leila Lindholm — Strutsbiff (leila.se)
- **Source**: leila.se/recept
- **Method**: Het gjutjärnspanna, 3 min per sida. Vila.
- **Target**: **55-60°C** — "rosa som hjort"

### 5. Gordon Ramsay — Ostrich / Exotic Meats (MasterClass reference)
- **Source**: masterclass.com
- **Method**: Treat as lean red meat: very hot pan, 3 min per side, rest 5 min.
- **Target**: **130-140°F / 54-60°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| South Africa / SAOBC | 55-60°C | Industry standard |
| UK / Parker Bowles | 130-135°F / 54-57°C | Red meat treatment |
| Sweden | 55-60°C | "Rosa som hjort" |
| USDA (as poultry) | 165°F / 74°C | Poultry classification |

**Culinary consensus: 55-60°C / 130-140°F medium-rare.**
Maps to `medium_rare` in game doneness.

## What makes this method special
Ostrich bridges the worlds of poultry and red meat cookery — classified as a bird
but cooked and served like venison. The extraordinary leanness combined with red
meat character makes it unique in the protein world. At medium-rare, ostrich fillet
is tender and richly flavoured; at well-done, it is unpleasantly dry and chalky —
the difference in quality between the two is more dramatic than with almost any
other meat.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`
- `recommended_doneness`: `"medium_rare"` (55-60°C culinary consensus)
