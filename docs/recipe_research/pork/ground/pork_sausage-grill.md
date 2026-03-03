# Pork Sausage × Grill — Recipe Temperature Research

## Cut profile
Grilling sausages over direct medium heat (350-400°F / 175-200°C) produces the
characteristic char, snap, and smoky flavour that makes grilled sausages a
near-universal favourite. The risk: casing burst from rapid steam buildup inside.
Technique: never pierce the casing (loses fat and flavour); use medium heat and
rotate frequently; pre-cook in water (blanch 5 min) for very thick sausages.
USDA target 160°F / 71°C for all fresh pork sausages.

## Source recipes

### 1. Weber Grills — Grilled Sausages
- **Source**: weber.com/grilling-inspiration
- **Method**: Direct medium heat (350°F), rotate every 2-3 min, 12-15 min total.
  Probe to 160°F.
- **Target**: **160°F / 71°C** internal
- **Note**: Weber advises starting with cold sausages from fridge for more even
  cooking gradient vs room-temperature start.

### 2. Steve Raichlen — Grilled Sausage (Planet Barbecue)
- **Source**: Planet Barbecue (Workman Publishing) / barbecuebible.com
- **Method**: Indirect heat then direct finish. Medium-low indirect 15 min, move to
  direct 3-4 min for char.
- **Target**: **160°F / 71°C** at centre
- **Note**: Raichlen's indirect-then-direct method prevents the common problem of
  charred exterior with undercooked interior.

### 3. Leila Lindholm — Grillad korv (leila.se / Weber Sverige)
- **Source**: leila.se/recept
- **Method**: Direct medium heat, rotate every 2 min, 10-15 min depending on size.
  "Cut and check" if no thermometer available.
- **Target**: **72°C** at centre (Swedish sausage standard)
- **Note**: Swedish grilling guides recommend probing sausage to 72°C as the standard
  safety check at all barbecues.

### 4. Francis Mallmann — Grilled Sausages over Open Fire (Seven Fires)
- **Source**: Seven Fires (Artisan Books)
- **Method**: Asado choripán style — hardwood ember grill, rotate constantly, 10-15 min.
- **Target**: **71-74°C** — surface should be deeply charred and crackling
- **Note**: Argentine choripán style prioritises the char and surface flavour;
  sausages are almost always pork + beef or pure pork at ~71-74°C.

### 5. Jamie Oliver — Grilled Sausages (Jamie's Ministry of Food)
- **Source**: jamieoliver.com
- **Method**: Direct medium grill, no piercing, 10-15 min rotating every 2 min.
- **Target**: **70-75°C** — "squeeze gently and no pink juice should run"
- **Note**: Oliver's visual cue maps to ~70-75°C internal temperature.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Weber / Raichlen | 160°F / 71°C | USDA ground pork |
| Sweden | 72°C | Slightly above USDA |
| UK / Jamie Oliver | 70-75°C | Visual-cue equivalent |
| Argentina / Mallmann | 71-74°C | Deep char style |

**Consensus: 71-74°C (160-165°F) for all fresh pork sausages.**
Maps to `well_done` in pork doneness.

## What makes this method special
Grilling creates the snapping casing and char lines that define the barbecue sausage
experience. The exterior caramelisation from direct heat concentrates flavour in a way
that no indoor method can replicate. The smoky aroma from rendered sausage fat dripping
onto coals or flavorizer bars is a signature of outdoor grilling.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (160°F / 71°C ground pork standard)
