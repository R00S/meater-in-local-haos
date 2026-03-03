# Pork Tenderloin × Grill — Recipe Temperature Research

## Cut profile
Grilling pork tenderloin over medium-high direct heat (375-400°F / 190-205°C grill
surface) produces a lightly charred exterior with smoky flavour in 15-18 minutes total.
The challenge: the tenderloin is round and tapers at one end. Roll it periodically for
even cooking. An optional indirect zone to finish after searing all sides prevents
the thinner end from drying while the thick section finishes.

## Source recipes

### 1. Weber Grills — Grilled Pork Tenderloin
- **Source**: weber.com/grilling-inspiration/grilling-guide-pork
- **Method**: Marinate or season. Grill over direct medium-high, turn every 3 min for
  12-15 min total, then move to indirect if needed. Instant-read probe to 145°F.
- **Target**: **145°F / 63°C** internal
- **Note**: Weber specifies moving to indirect if flare-ups occur from dripping marinade.

### 2. Steve Raichlen — Grilled Pork Tenderloin with Garlic (How to Grill)
- **Source**: How to Grill cookbook (Workman) / barbecuebible.com
- **Method**: Score lightly, rub with garlic-oil, direct medium heat 15-18 min rotating.
- **Target**: **145°F / 63°C** pull; slight pink at centre is intentional and safe
- **Note**: Raichlen emphasises that pork tenderloin is the one pork cut most like
  a beef filet in terms of lean texture and quick overcooking.

### 3. Magnus Nilsson — Grillad fläskfilé (Nordic Cookbook / Fäviken)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Ember or gas grill, oil-rubbed, direct heat 12-15 min rotating.
  Baste with herb butter at end.
- **Target**: **63-65°C** at centre (faint pink acceptable per Nordic standards)
- **Note**: Nilsson notes that pork tenderloin grilled with visible pink at 63°C is
  the standard in all Nordic countries post-2014 food safety update.

### 4. Jamie Oliver — Grilled Pork Tenderloin (Jamie's Ministry of Food)
- **Source**: jamieoliver.com/recipes
- **Method**: Butterfly-score the tenderloin to flatten slightly, reducing grill time.
  Grill 10-12 min turning twice.
- **Target**: **65-70°C** at thickest point
- **Note**: Butterflying is a practical technique for home grillers without an
  instant-read thermometer — flatter cut gives better visual "done" cues.

### 5. Heston Blumenthal — Brined Grilled Pork Fillet (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: 4-hour brine, pat completely dry. Grill direct medium-high 15 min.
- **Target**: **62-65°C** at centre
- **Note**: Blumenthal's brined approach gives latitude to pull at a lower temp
  because the pre-hydrated muscle structure holds moisture at 62°C.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Weber / Raichlen | 145°F / 63°C | USDA with 3-min rest |
| Nordic / Nilsson | 63-65°C | Faint pink acceptable |
| UK / Jamie / Heston | 62-70°C | Method-dependent |

**Consensus: 63-65°C.** Maps to `medium` in pork doneness.

## What makes this method special
Grilling brings a smoky, charred quality to pork tenderloin impossible to replicate
indoors. The constant rotation ensures the cylindrical shape browns evenly on all
sides — unlike steaks or chops which only have two primary faces.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (global consensus 63°C)
