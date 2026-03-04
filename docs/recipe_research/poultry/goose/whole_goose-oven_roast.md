# Whole Goose × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Whole roasted goose is the traditional Christmas feast bird in Northern and Central
Europe (England, Germany, Scandinavia, Poland) — a rich, flavourful bird with an
enormous fat layer. The challenge is identical to duck but amplified: render vast
amounts of fat while cooking the meat through. Traditional method: slow 325°F / 165°C
for 3-4 hours (weight-based: ~20 min per pound), turning every 30-45 minutes.
Final blast at 400°F / 200°C for 20-30 min crisps the skin.
Target: 165°F / 74°C in the thickest part of the thigh.

## Source recipes

### 1. Nigel Slater — Christmas Goose (The Kitchen Diaries)
- **Source**: The Kitchen Diaries (Fourth Estate)
- **Method**: Prick all over, stuff with apple + onion + sage, 220°C for 30 min,
  reduce to 180°C for 1.5-2 hours per kg.
- **Target**: **74-77°C** in thigh — "juices run clear from thigh"

### 2. Heston Blumenthal — Roast Goose (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: Blanch 10 min in boiling water, dry overnight, 160°C low-and-slow
  3 hours, blast 220°C 30 min.
- **Target**: **74°C** thigh temperature

### 3. Gordon Ramsay — Roast Goose (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Prick skin, 220°C 30 min, reduce 180°C remaining time (25 min/kg).
- **Target**: **165°F / 74°C** thigh

### 4. Leila Lindholm — Helrostad gås (leila.se)
- **Source**: leila.se/recept
- **Method**: Stick huden, fyll med äpple + lök + salvia, 160°C ca 3-4 timmar,
  hög värme 200°C sista 30 min.
- **Target**: **74°C** in låret

### 5. German tradition — Weihnachtsgans (Geflügelspezialitäten)
- **Source**: German culinary tradition / Essen & Trinken magazine
- **Method**: 180°C for 3-4 hours (30 min per 500g), rest 20 min.
- **Target**: **80-85°C** internal — German tradition cooks slightly higher

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| UK / Nigel Slater | 74-77°C | "Juices run clear" |
| UK / Ramsay / Heston | 74°C | |
| Sweden | 74°C | |
| Germany | 80-85°C | Slightly higher |
| USA / USDA | 165°F / 74°C | Poultry standard |

**Consensus: 74-80°C / 165-176°F in thigh.** Maps to `well_done` in poultry doneness.

## What makes this method special
Roasting a whole goose is one of the grandest culinary traditions of Northern Europe —
a dish reserved for Christmas feasts and major celebrations. The rendered goose fat is
a prized cooking fat (Schmalz, schmaltz), collected from the roasting pan for future
use. The bird itself serves 6-8 people and produces enough fat to cook with for weeks.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`
- `recommended_doneness`: `"well_done"` (74-80°C/165°F+ thigh standard)
