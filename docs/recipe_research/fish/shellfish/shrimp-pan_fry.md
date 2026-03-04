# Shrimp × Pan Fry — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Shrimp (or prawns) cook extremely fast — 1-3 minutes per side depending on size —
and signal doneness visually by turning from grey-translucent to pink-opaque and
curling into a C-shape (fully straight = undercooked; tight O-shape = overcooked).
The USDA target for shrimp is 145°F / 63°C (fully opaque pink) but the culinary
"doneness window" is very narrow. A large sea shrimp/prawn at room temperature in
a hot (350-400°F / 175-200°C) pan with butter reaches 145°F in 90-120 seconds
per side.

## Source recipes

### 1. J. Kenji López-Alt — Perfect Pan-Fried Shrimp (Serious Eats)
- **Source**: seriouseats.com/pan-fried-shrimp
- **Method**: Dry, season with salt + oil, medium-high heat pan, single layer, 1-2
  min per side (medium-large shrimp). Pull as soon as fully pink.
- **Target**: **120-130°F / 49-54°C** — pink and opaque but still juicy
- **Note**: Shrimp above 140°F / 60°C become noticeably rubbery; the USDA 145°F
  standard is technically correct for safety but creates slightly overcooked texture.

### 2. Gordon Ramsay — Garlic Butter Prawns (Ramsay's Home Cooking / YouTube)
- **Source**: gordonramsay.com
- **Method**: Butter + garlic, medium-high heat, 1-2 min per side. Finish with lemon.
- **Target**: Visual: completely pink and curled to C — about **130-140°F / 54-60°C**
- **Note**: Ramsay uses the C-shape cue universally for shrimp/prawns.

### 3. Leila Lindholm — Stekta räkor (leila.se)
- **Source**: leila.se/recept
- **Method**: Garlic butter, high heat, 1-2 min per side.
- **Target**: **55-60°C** — completely pink, C-shaped
- **Note**: Swedish culinary target for prawns at 55-60°C aligns with Kenji's
  culinary preference rather than USDA.

### 4. Nobu Matsuhisa — Sautéed Shrimp (Nobu: The Cookbook)
- **Source**: Nobu: The Cookbook (Kodansha International)
- **Method**: Very hot wok or pan, sesame oil, 1 min per side maximum.
- **Target**: **52-57°C** — Japanese preferred doneness for prawns

### 5. Jamie Oliver — Easy Garlic Prawns (Jamie's Quick & Easy Food)
- **Source**: jamieoliver.com
- **Method**: Butter + oil, 1-2 min, "until they're pink all over and slightly charred."
- **Target**: **60-65°C** (UK standard for prawns — fully pink)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / USDA | 120-145°F / 49-63°C | 120°F culinary; 145°F USDA safe |
| Sweden | 55-60°C | Culinary "just pink" |
| Japan / Nobu | 52-57°C | Japanese preferred |
| UK / Jamie Oliver | 60-65°C | "Pink all over" |

**Consensus: 55-60°C / 131-140°F for quality shrimp; 63°C for USDA safety.**
Maps to `well_done` in shellfish doneness (visual: fully pink and C-shaped).

## What makes this method special
Pan frying shrimp in garlic butter is one of the fastest, most rewarding cooking
techniques: maximum flavour development in under 5 minutes. The butter-garlic
pan sauce creates itself from the shrimp juices and aromatics during cooking.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_fry`, `saute`, `grill`, `air_fryer`
- `recommended_doneness`: `"well_done"` (fully pink C-shape standard)
