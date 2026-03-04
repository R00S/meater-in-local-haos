# Chicken Thigh × Air Fryer — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Air-fried chicken thighs (bone-in, skin-on) at 375-400°F / 190-200°C for 25-30
minutes produce arguably the best skin of any indoor method — the circulating hot
dry air renders fat and crisps skin without the oil of pan frying. The dark meat
stays moist even at 175°F/79°C (the preferred collagen-conversion temperature).
Air frying is now many cooks' go-to for chicken thighs precisely because of the
exceptional skin result.

## Source recipes

### 1. Serious Eats — Air Fryer Chicken Thighs
- **Source**: seriouseats.com
- **Method**: Season well, skin-side up, 400°F / 200°C 22-25 min.
- **Target**: **170-175°F / 77-79°C** at thickest

### 2. America's Test Kitchen — Air Fryer Chicken Thighs
- **Source**: americastestkitchen.com
- **Method**: 400°F 20-25 min, flip at 10 min.
- **Target**: **170-175°F / 77-79°C** — "dark meat preferred above 165°F"

### 3. Ninja Kitchen — Air Fryer Chicken Thighs
- **Source**: ninjakitchen.com
- **Method**: 380°F 25-28 min.
- **Target**: **165°F / 74°C** (USDA minimum)

### 4. ICA/Coop Sweden — Kycklinglår i luftfritös
- **Source**: ica.se/recept
- **Method**: 200°C 22-25 min skin-side up.
- **Target**: **74°C** minimum at bone

### 5. Gordon Ramsay (adapted) — Air Fryer Chicken Thighs
- **Source**: gordonramsay.com technique
- **Method**: Season, skin-side up, 200°C 25 min.
- **Target**: **165-175°F / 74-79°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Serious Eats / ATK | 170-175°F / 77-79°C | Preferred for texture |
| USDA minimum | 165°F / 74°C | Safe minimum |
| Sweden | 74°C | Standard |

**Preferred: 170-175°F / 77-79°C for skin-on thighs.** Maps to `well_done`.

## What makes this method special
Air frying produces the crispiest chicken thigh skin of any non-deep-fry method —
the circulating hot dry air is essentially the ideal environment for skin rendering.
The 30-minute hands-off cook with virtually no cleanup makes it the default method
for many home cooks today.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (170-175°F preferred)
