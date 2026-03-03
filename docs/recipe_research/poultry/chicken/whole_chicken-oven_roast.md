# Whole Chicken × Oven Roast — Recipe Temperature Research

## Cut profile
Roasting a whole chicken is the most universal single-bird cooking method worldwide.
A 1.5-2 kg / 3-4 lb bird roasts at 200-220°C / 390-430°F for 60-90 minutes.
The only safe internal temperature for whole poultry is 165°F / 74°C in the thickest
part of the thigh (not the breast, which will reach 165°F earlier and overcook
before the thigh is done). Spatchcocking (removing backbone and flattening) dramatically
reduces cook time and produces crispier, more even skin.

## Source recipes

### 1. J. Kenji López-Alt — The Perfect Roast Chicken (Serious Eats)
- **Source**: seriouseats.com/the-best-roast-chicken
- **Method**: Spatchcocked or whole. 425°F / 220°C oven on preheated cast iron.
  45-60 min to 165°F in thigh.
- **Target**: **165°F / 74°C** in thigh (USDA poultry requirement)
- **Note**: Kenji spatchcocks for 30-40% faster cooking and skin that crisps
  uniformly. Breast overcooks to 170-175°F before the thigh reaches 165°F
  in conventional whole-bird roasting.

### 2. Thomas Keller — Roast Chicken with Herbs Under the Skin (Bouchon)
- **Source**: Bouchon Bistro cookbook (Artisan)
- **Method**: Truss, herb butter under skin, 450°F / 230°C 45-60 min, rest 15 min.
- **Target**: **165°F / 74°C** at thigh joint
- **Note**: Keller's trussed high-heat method is the classic French technique —
  high oven temperature guarantees crisp skin.

### 3. Leila Lindholm — Helstekt kyckling (leila.se / Arla)
- **Source**: leila.se/recept · arla.se/recept
- **Method**: Butter + lemon + thyme inside cavity, 200°C oven 60-80 min.
- **Target**: **73-74°C** at thickest thigh (Swedish poultry standard = 74°C)
- **Note**: Swedish food safety guidance for whole chicken is 74°C — aligns
  exactly with USDA 165°F.

### 4. Heston Blumenthal — Perfect Roast Chicken (Heston at Home / The Fat Duck)
- **Source**: hestonfromhome.com
- **Method**: Brine overnight, pat dry, roast at 90°C / 195°F for 3-4 hours until
  thigh reaches 74°C. Blast 230°C / 445°F for 20 min for skin.
- **Target**: **74°C / 165°F** at thigh
- **Note**: Blumenthal's low-temp approach produces the most moist breast meat
  possible — the oven can't exceed 74°C until the blast phase.

### 5. Samin Nosrat — Herbed Roast Chicken (Salt Fat Acid Heat)
- **Source**: Salt Fat Acid Heat (Simon & Schuster)
- **Method**: Generous salt rub 24 hours before, 425°F oven 50-65 min.
- **Target**: **165°F / 74°C** at thigh
- **Note**: Nosrat's 24-hour dry-brine is the single most impactful step for
  both crispy skin and juicy meat.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / all US authorities | 165°F / 74°C | Thigh | Mandatory |
| Sweden (Livsmedelsverket) | 74°C | Thigh | Same as USDA |
| UK / EU food safety | 74°C minimum | Poultry standard |
| France (Keller) | 165°F / 74°C | Thigh | Classic French |

**Universal consensus: 165°F / 74°C at thigh.** There is zero culinary tradition
of serving whole chicken below USDA minimum — unlike beef, pork, or lamb.
Maps to `well_done` in poultry doneness.

## What makes this method special
Oven roasting a whole chicken is one of cooking's great universal pleasures —
the smell of a chicken roasting has no parallel. The combination of crispy skin,
juicy breast, and sticky, flavourful thigh-and-leg cannot be replicated by
any other single method. It is the foundational technique of European home cooking.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `air_fryer`
- `recommended_doneness`: `"well_done"` (165°F/74°C thigh — USDA universal standard)
