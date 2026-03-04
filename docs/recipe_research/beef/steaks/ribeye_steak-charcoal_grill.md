# Ribeye Steak × Charcoal Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Charcoal grilling produces radiant heat from glowing coals at 650-900°F / 340-480°C at
grate level and convective heat under a closed lid. Hardwood charcoal (lump or briquette)
produces combustion gases including trace amounts of guaiacol and syringol — the compounds
responsible for the distinctive smoky flavour absent from gas grilling. Fat dripping onto
coals vaporises into aromatic compounds that coat the steak surface. The result is a more
complex, smoke-forward flavour vs. gas grill, at identical internal temperatures.

## Source recipes

### 1. Exploring BBQ — Ribeye on a Charcoal Kettle (Indirect + Reverse Sear)
- **Source**: exploringbbq.com/recipe/ribeye-steak-on-a-charcoal-kettle-grill
- **Method**: Two-zone setup. Cool indirect zone first (225°F / 107°C) until internal
  reaches 43-49°C / 110-120°F, then sear 60-90 sec per side over direct coals.
- **Final target (medium-rare)**: 130°F / **54°C** after rest
- **Key insight**: Reverse sear on charcoal dries the steak surface during the low phase
  → superior Maillard sear from coals vs. wet-surface direct grill.

### 2. Heston Blumenthal — Charcoal Beef Steak (Fat Duck / Waitrose Weekend)
- **Source**: hestonfatduck.co.uk · waitrose.com
- **Method**: Frequent flipping technique (Blumenthal's equivalent of Kenji's pan-sear
  method for coals). Thick steak, pre-salted, flipped every 30-60 seconds over very hot
  coals to build even crust without over-cooking the surface layers.
- **Target (medium-rare)**: pull at **52°C**, rest to **54-56°C**
- **What makes charcoal unique**: Blumenthal notes the smoke compounds polymerize into the
  outer 2-3 mm of meat, creating a flavour layer that gas cannot replicate.

### 3. South African Braai — Rib-eye stokie on hardwood (Jan Braai)
- **Source**: janbraai.com — "Braai the Beloved Country"
- **Method**: South African braai tradition: hardwood (rooikrans, kameeldoring) coals,
  grid at recommended height (hand test: hold 3-4 sec), no lid.
- **Target**: "Ros" (rosé/medium-rare) = **57-60°C** — South African medium-rare sits
  slightly higher than European due to tradition and the open-flame heat profile.

### 4. Argentine asado sobre brasas — Bife ancho a las brasas
- **Source**: asadoargentino.com · infobae.com/cocina
- **Method**: Quebracho colorado charcoal, embers at medium height, salt only.
  Key differentiator from gas: the quebracho wood smoke imparts a distinctive earthy note.
- **Target**: jugoso = **55°C**, al punto = **58-60°C**. Argentine asadores pull slightly
  higher to account for the thick cuts (≥3 cm) and the slower, lower charcoal heat.

### 5. Japanese Hibachi / Shichirin — Wagyu ribeye on binchotan
- **Source**: wagyu-ya.com · tobanyaki.jp
- **Method**: Binchotan (white charcoal — 白炭) burns at very high temperatures with almost
  no smoke. Used for high-marbled Wagyu ribeye (A4/A5). Thin slices or thick cuts, rare
  to medium-rare.
- **Target** (standard Wagyu): **49-54°C** rare-to-medium-rare
- **Why lower for Wagyu**: The exceptionally high marbling (oleic acid-rich fat, melts at
  ~25°C) renders so readily that going above 54°C causes visible fat loss and loses the
  prized buttery texture.

## Temperature consensus

| Tradition | Target | Notes |
|-----------|--------|-------|
| USA (Exploring BBQ) | 54°C | Reverse sear charcoal |
| UK (Blumenthal) | 54-56°C | Frequent-flip charcoal |
| South Africa (Braai) | 57-60°C | Open fire, no lid |
| Argentina (Asado) | 55-60°C | Quebracho coals |
| Japan (Binchotan/Wagyu) | 49-54°C | Ultra-marbled, go lower |

**Consensus: medium-rare (54-57°C)** for standard ribeye. Special cases:
- Wagyu on binchotan → rare (49-52°C) for A5 grade
- Open-fire traditions (SA braai, Argentine asado) → 55-60°C is the local "jugoso/ros"

## What makes this different from gas grill
Same internal target temperatures, but the surface character differs dramatically.
Charcoal combustion gases (guaiacol, syringol, phenols from wood) create depth of flavour
impossible with gas. Binchotan is nearly smoke-free but burns intensely hot — ideal for
wagyu where you want pure Maillard without smoke masking the fat.

## Data applied
- No `method_temperature_ranges` override needed — default ranges apply.
- `method_doneness["charcoal_grill"]` = not needed (same as `recommended_doneness`).
