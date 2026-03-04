# Spare Ribs × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Pork spare ribs (the full rack below the baby back ribs, from the belly side) are
larger, meatier, and slightly less tender than baby back ribs. They have more fat
and marbling, making them arguably more flavourful. The same low-and-slow approach
applies: 225-275°F / 107-135°C oven for 3-4 hours until the internal temperature
reaches 190-203°F / 88-95°C and the meat has pulled back from the bone and is
probe-tender.

## Source recipes

### 1. J. Kenji López-Alt — Oven-Baked Spare Ribs (Serious Eats)
- **Source**: seriouseats.com/oven-baked-ribs
- **Method**: Dry rub, 250°F / 120°C oven loosely tented 3-4 hours. Final 20 min
  uncovered with BBQ sauce.
- **Target**: **190-203°F / 88-95°C** at the thickest meat between bones

### 2. Aaron Franklin — Competition-Style Spare Ribs (Franklin Barbecue)
- **Source**: Franklin Barbecue (Ten Speed Press)
- **Method**: Dry rub, oak smoke 250°F, 3-4 hours. 3-2-1 method: 3 unwrapped,
  2 foil-wrapped, 1 unwrapped with sauce.
- **Target**: **190-203°F / 88-95°C** — "bend test: racks should flex 90° and
  surface should crack before breaking"

### 3. Gordon Ramsay — Slow-Cooked Ribs in Oven (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Dry rub, 160°C oven wrapped in foil 3 hours, unwrap and glaze 30 min.
- **Target**: **88-92°C** at thickest meat

### 4. Leila Lindholm — Ugnsrostade revben (leila.se)
- **Source**: leila.se/recept
- **Method**: Rub, täckt ugn 160°C 3-4 timmar, avsluta med sås ouppvärmt.
- **Target**: **88-95°C** at thickest

### 5. Weber Grill — Oven Spare Ribs Method
- **Source**: weber.com
- **Method**: Dry rub, foil-wrapped 250°F 3-4 hours, finish unwrapped with sauce.
- **Target**: **195-200°F / 91-93°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Aaron Franklin | 190-203°F / 88-95°C | BBQ competition standard |
| Gordon Ramsay | 88-92°C | Restaurant oven method |
| Sweden / Leila | 88-95°C | Oven ribs |
| Weber | 195-200°F / 91-93°C | Home BBQ |

**Consensus: 88-95°C / 190-203°F.** Maps to `well_done` in pork doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `grill`, `smoker`
- `recommended_doneness`: `"well_done"` (88-95°C collagen conversion)
