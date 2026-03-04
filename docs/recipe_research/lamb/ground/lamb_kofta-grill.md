# Lamb Kofta / Kebab × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Lamb kofta are minced/ground lamb shaped around skewers or into oblong shapes for
grilling. A mixture of ground lamb (20%+ fat content), spices (cumin, coriander,
cinnamon, allspice), fresh herbs, and onion is packed firmly around flat skewers.
Grilling over medium-high heat (375-425°F / 190-220°C) for 8-10 minutes gives
charred exterior with juicy, spiced interior. USDA requires 160°F / 71°C for
ground lamb (same as ground beef) because grinding distributes surface bacteria.

## Source recipes

### 1. Yotam Ottolenghi — Lamb Kofta (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: 20% fat lamb mince, cumin + coriander + allspice + fresh herbs,
  shaped onto flat skewers, grill 400°F direct heat 8-10 min turning regularly.
- **Target**: **160°F / 71°C** — no pink in ground lamb
- **Note**: Ottolenghi's kofta recipe is one of the most referenced globally;
  he emphasises high fat content for juiciness.

### 2. Heston Blumenthal — Lamb Kofta (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: Home-grind shoulder + neck, fennel + cumin + coriander spice, grill.
- **Target**: **160°F / 71°C** internal for food safety
- **Note**: Blumenthal home-grinds to control fat ratio precisely (25% fat
  shoulder + neck mix).

### 3. Leila Lindholm — Lamm-kebab på spett (leila.se)
- **Source**: leila.se/recept
- **Method**: Ground lamb, harissa, fresh mint, grill 10-12 min turning every 2 min.
- **Target**: **70-72°C** at centre (Swedish ground meat standard)

### 4. Claudia Roden — Middle Eastern Kofta (The Book of Jewish Food)
- **Source**: The Book of Jewish Food (Knopf)
- **Method**: Classic spicing (allspice + cinnamon + coriander), grill or broil.
- **Target**: **160°F / 71°C** — "no pink should remain in ground meat"

### 5. Francis Mallmann — Lamb Kebabs (Seven Fires)
- **Source**: Seven Fires (Artisan Books)
- **Method**: Charcoal fire, skewered lamb, 8-10 min rotating.
- **Target**: **68-72°C** — charred exterior, no raw centre

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Ottolenghi | 160°F / 71°C | Ground lamb standard |
| Sweden | 70-72°C | Near-USDA |
| Middle East / Roden | 71°C | Traditional safety |
| Argentina / Mallmann | 68-72°C | Fire-char style |

**Consensus: 70-72°C / 158-162°F.** Maps to `well_done` in lamb doneness (ground).

## What makes this method special
Kofta on the grill is uniquely compelling: the combination of minced lamb's high fat
content, the aromatic spice blend, and the charcoal smoke creates a flavour profile
impossible to replicate with any other method or protein. The fat drips create flare-
ups that char the outside while the inside stays juicy — authentic streetfood perfection.

## Data applied to cooking_data.py
- `supported_methods` gains: `grill`, `pan_fry`, `charcoal_grill`
- `recommended_doneness`: `"well_done"` (71°C ground meat standard)
