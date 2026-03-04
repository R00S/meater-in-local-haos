# Whole Duck × Oven Roast — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Whole roasted duck is a festive centrepiece — but challenging: the duck has a very
thick fat layer that must be rendered before the skin crisps, while the breast meat
must not overcook. Traditional techniques: slow roasting at 325°F / 165°C for 2-2.5
hours renders the fat; a final blast at 425°F / 220°C for 15-20 min crisps the skin.
Or the "prick and pierce" technique where the skin is pierced multiple times to allow
fat drainage. Target: 165°F / 74°C in the thigh; breast 140-150°F / 60-65°C.

## Source recipes

### 1. Thomas Keller — Whole Roasted Duck (Ad Hoc at Home)
- **Source**: Ad Hoc at Home (Workman)
- **Method**: Score skin, salt overnight, 325°F for 2 hours (flip every 30 min),
  425°F final 20 min.
- **Target**: **165°F / 74°C** in thigh; **140-150°F / 60-65°C** in breast

### 2. Gordon Ramsay — Perfect Roast Duck (Kitchen)
- **Source**: gordonramsay.com
- **Method**: Prick skin, 200°C for 30 min, reduce to 160°C for 1.5 hours, blast
  200°C for 20 min final.
- **Target**: **165°F / 74°C** thigh; **140°F / 60°C** breast

### 3. Heston Blumenthal — Roast Duck (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: Blanch in boiling water 10 min (renders fat), dry overnight,
  160°C for 2.5 hours, blast 220°C 20 min.
- **Target**: **70°C** thigh

### 4. Leila Lindholm — Helrostad anka (leila.se)
- **Source**: leila.se/recept
- **Method**: Stick huden, lagugt 150°C 2.5 timmar, hög värme 200°C 20 min.
- **Target**: **74°C** in thigh

### 5. Julia Child — Roasted Duck (Mastering the Art)
- **Source**: Mastering the Art of French Cooking (Knopf)
- **Method**: Roast 325°F / 165°C for 1.5-2 hours. Rest 15 min.
- **Target**: **165°F / 74°C** thigh

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Keller | 165°F / 74°C | Thigh temperature |
| UK / Ramsay | 165°F / 74°C | Thigh |
| Sweden | 74°C | |
| France / Julia Child | 165°F / 74°C | Thigh |

**Consensus: 165°F / 74°C in the thigh.** Breast will be 140-150°F / 60-65°C
(medium) which is acceptable for duck. Maps to `well_done` in poultry doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`
- `recommended_doneness`: `"well_done"` (165°F/74°C thigh; breast lower is OK)
