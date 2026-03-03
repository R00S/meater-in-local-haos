# Whole Turkey × Oven Roast — Recipe Temperature Research

## Cut profile
Roasting a whole turkey is the definitive American Thanksgiving preparation and a
major tradition in British and European Christmas cooking. A 5-7 kg / 11-15 lb
turkey roasts at 160-180°C / 325-350°F for 3-4 hours (or 2-2.5 hours spatchcocked).
USDA requires 165°F / 74°C in the thigh — the last part to reach temperature.
The challenge: breast overcooks to dry meat (180°F+) before the thigh reaches 165°F
in conventional upright roasting. Solutions: spatchcocking, dry-brining, or stuffing
with aromatics.

## Source recipes

### 1. J. Kenji López-Alt — Spatchcocked Turkey (Serious Eats)
- **Source**: seriouseats.com/spatchcocked-thanksgiving-turkey
- **Method**: Remove backbone, flatten. 450°F / 230°C oven on baking sheet 80-90 min.
- **Target**: **165°F / 74°C** at thigh; breast will reach 150-155°F simultaneously
  (safe by time-temp, 30+ min at 150°F is pasteurised)
- **Note**: Spatchcocking dramatically reduces cook time and allows breast and thigh
  to finish closer to the same time.

### 2. Alton Brown — Brined Roast Turkey (Good Eats)
- **Source**: foodnetwork.com/shows/good-eats / Good Eats cookbook
- **Method**: Wet brine 24 hours, roast 500°F / 260°C for 30 min, reduce to 350°F
  until thigh reaches 161°F / 72°C. Rest 20 min.
- **Target**: **161°F / 72°C** thigh pull (rests to 165°F/74°C)

### 3. Leila Lindholm — Helstekt kalkon (leila.se)
- **Source**: leila.se/recept
- **Method**: Dry-brine 24 hours, 160°C oven for 25-30 min per kg.
- **Target**: **74°C** in thigh (Swedish poultry standard)

### 4. Samin Nosrat — Buttermilk-Brined Turkey (NYT Cooking / Salt Fat Acid Heat)
- **Source**: cooking.nytimes.com / Salt Fat Acid Heat
- **Method**: Buttermilk brine 24-36 hours, roast 450°F 30 min then 400°F.
- **Target**: **165°F / 74°C** in thigh

### 5. Gordon Ramsay — Perfect Roast Turkey (Kitchen)
- **Source**: gordonramsay.com / Kitchen cookbook
- **Method**: Herb butter under skin, 220°C / 425°F for first 30 min, reduce to
  180°C / 350°F for remaining time (25-30 min per kg).
- **Target**: **165°F / 74°C** thigh, **clear juices** at thigh joint

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / all US traditions | 165°F / 74°C | Thigh — mandatory |
| Sweden | 74°C | Same as USDA |
| UK / Ramsay | 165°F / 74°C | Christmas tradition |
| Universal | 165°F / 74°C | No culinary tradition serves undercooked turkey |

**Universal consensus: 165°F / 74°C at thigh.**
Maps to `well_done` in poultry doneness.

## What makes this method special
A whole roasted turkey is the ultimate communal feast centrepiece — a 6 kg bird
feeds 10-15 people and becomes the ceremonial focus of Thanksgiving and Christmas
tables across multiple cultures. No other cooking method scales this effectively to
feed so many people from a single item while maintaining proper food safety.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`
- `recommended_doneness`: `"well_done"` (165°F/74°C universal standard)
