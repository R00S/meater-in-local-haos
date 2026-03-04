# Tuna Steak × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Grilling tuna steak over a very hot grill (500°F+ / 260°C+ grate surface) produces
beautiful grill marks and a smoky seared crust on a protein usually served raw at
the centre. Tuna is one of the firmest fish — it holds together on the grill without
falling apart like more delicate fillets. Grill marks appear in ~90 seconds per side.
The challenge: a tuna steak is often thicker than 1 inch / 25 mm — verify the sear
line only penetrates 5-8 mm before the heat reaches the raw centre.

## Source recipes

### 1. J. Kenji López-Alt — Grilled Tuna Steaks (Serious Eats)
- **Source**: seriouseats.com/grilled-tuna-steaks
- **Method**: Preheat grill to highest setting, oil grates well. 1-1.5 min per side
  max for a 1-inch steak.
- **Target**: **105-115°F / 41-46°C** at centre (cool red core)
- **Note**: Tuna steaks should never be on the grill for more than 3 min total —
  the lean muscle dries instantly past 130°F/54°C.

### 2. Steve Raichlen — Grilled Tuna with Nicoise Garnish (Planet Barbecue)
- **Source**: Planet Barbecue (Workman) / barbecuebible.com
- **Method**: Marinate briefly, maximum direct heat grill, 1-2 min per side.
  Serve immediately.
- **Target**: **115-125°F / 46-52°C** at centre (Raichlen slightly higher than
  raw-centre tataki)
- **Note**: Raichlen's target allows a slightly warmer centre for diners
  unaccustomed to near-raw tuna.

### 3. Weber Grills — Grilled Tuna Steaks
- **Source**: weber.com
- **Method**: Oil grates, maximum heat, 3-4 min per side (for well-done by USDA).
  OR 1-2 min per side for rare-centre.
- **Target**: **145°F / 63°C** for USDA, **rare option** at ~115°F/46°C
- **Note**: Weber presents both USDA-safe and culinary-preference options,
  unlike most appliance guides.

### 4. Nobu Matsuhisa — Grilled Tuna (Nobu: The Cookbook)
- **Source**: Nobu: The Cookbook (Kodansha International)
- **Method**: Very hot grill, sesame oil brush, 30-40 sec per side only.
  Serve thinly sliced immediately.
- **Target**: **Below 40°C / 104°F** at centre — raw and cold in the middle
- **Note**: Nobu's grill approach is similar to tataki — maximum heat, minimum
  time, raw centre.

### 5. Gordon Ramsay — Grilled Tuna Nicoise (Kitchen Secrets / YouTube)
- **Source**: gordonramsay.com
- **Method**: Hot grill, 1 min per side, quarter-turn at 30 sec for cross-hatch.
- **Target**: Visual medium-rare: sear marks 5 mm deep, red warm centre
  (~**46-50°C / 115-122°F**)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Japan / Nobu | <40°C / <104°F | Tataki-raw centre |
| USA / Kenji / Raichlen | 105-125°F / 41-52°C | Rare to medium-rare |
| Gordon Ramsay | 46-50°C / 115-122°F | Medium-rare visual |
| Weber / USDA | 145°F / 63°C | Well-done safe minimum |

**Culinary consensus: 41-50°C / 105-122°F.** Maps to `rare` in fish doneness.

## What makes this method special
Grilling tuna adds authentic grill char marks and light smokiness to the seared
crust without any risk of overcooking the interior (given the short cook time).
The high grill heat creates a clean, caramelised crust in under 90 seconds that
pan searing can't quite match due to oil interference.

## Data applied to cooking_data.py
- `recommended_doneness`: `"rare"` (41-50°C culinary standard)
