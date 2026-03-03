# Pork Belly × Oven Roast — Recipe Temperature Research

## Cut profile
Pork belly is uncured fresh bacon — layers of fat and muscle from the underside of
the pig. Roasting whole or in slabs renders the fat through prolonged heat, producing
either a burnished, caramelised slab (sliced) or the iconic crackling of British/
Asian roast pork belly. Two-phase cooking is standard: low heat (150°C / 300°F) for
2-3 hours renders fat and collagen; a high blast (240°C / 460°F) or broil at the end
creates the crackling or crust.

## Source recipes

### 1. Heston Blumenthal — Perfect Roast Pork Belly (Heston at Home / The Fat Duck)
- **Source**: hestonfromhome.com / thefatduck.co.uk
- **Method**: Score rind, dry overnight uncovered, roast 90°C / 195°F for 6 hours
  (confit-style), blast 230°C / 445°F for 30 min to crackle rind.
- **Internal target**: **85-90°C / 185-195°F** (full collagen breakdown, very tender)
- **Note**: Low-and-slow is the key to crackling — rendering the fat fully before
  the high-temp blast ensures crisp rind without chewy interior.

### 2. Thomas Keller — Slow-Roasted Pork Belly (Ad Hoc at Home)
- **Source**: Ad Hoc at Home cookbook (Workman Publishing)
- **Method**: Brine overnight, score, roast 175°F / 80°C for 8 hours; blast 425°F
  at end for 20 min. Internal: 165-175°F / 74-79°C at flesh portion.
- **Target**: **165-175°F / 74-79°C** flesh; rind 85°C+ for crackling texture
- **Note**: Keller's slow approach achieves an almost confit texture in the fat layers.

### 3. David Chang — Momofuku Bossam / Pork Belly (Momofuku cookbook)
- **Source**: Momofuku cookbook (Clarkson Potter)
- **Method**: Salt + sugar rub overnight, roast 300°F / 150°C for 6 hours uncovered.
  Rest 15 min, slice.
- **Target**: **165-175°F / 74-79°C** at thickest flesh portion
- **Note**: No crackling attempt; focus is on jammy, rendered fat with tender flesh.
  Rest before slicing is critical — all the rendered fat redistributes.

### 4. Leila Lindholm — Ugnsrostad sidfläsk (leila.se / Arla)
- **Source**: leila.se/recept · arla.se/recept
- **Method**: Score rind, salt rind generously, roast 160°C / 320°F for 2 hours,
  blast 240°C / 460°F for 15-20 min for crackling.
- **Target**: **70-75°C** at flesh (Swedish pork standard) + rind temperature
  irrelevant (crackling judged by sound/texture)
- **Note**: Swedish crackling tradition uses slightly lower overall temperature than
  British; focuses on rind dryness before roasting rather than blast temperature.

### 5. Fergus Henderson — Roast Belly of Pork (St. JOHN / Nose to Tail Eating)
- **Source**: Nose to Tail Eating cookbook (Bloomsbury)
- **Method**: Dry overnight, roast 200°C / 390°F for 2 hours until crackling set,
  rest 20 min. Internal 80-85°C.
- **Target**: **80-85°C / 175-185°F** at flesh portion
- **Note**: Henderson's higher initial temperature accepts some dryness in exchange
  for faster crackling without a dual-temperature step.

## Temperature consensus

| Tradition | Target flesh temp | Notes |
|-----------|------------------|-------|
| Heston Blumenthal | 85-90°C / 185-195°F | 6-8 hours, full collagen breakdown |
| Thomas Keller | 165-175°F / 74-79°C | Brine-first, 8 hours |
| David Chang | 165-175°F / 74-79°C | 6 hours, jammy texture |
| Sweden / Leila | 70-75°C | 2 hours, Swedish standard |
| Fergus Henderson | 80-85°C | 2 hours, crackling-first |

**Consensus: 74-90°C depending on style.** Sliced/jammy style: 74-80°C. Crackling
style: 85-90°C at flesh. Maps to `well_done` in pork doneness.

## What makes this method special
Oven roasting pork belly is unique in requiring two opposing temperatures: low heat
renders and softens the fat, while a high-heat blast or broil creates the crackling
crust. No other method achieves both. The result — shatteringly crispy rind over
luxuriously tender, fatty flesh — is impossible by any other means.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `braise`, `air_fryer`
- `recommended_doneness`: `"well_done"` (74-90°C collagen/fat rendering required)

## Summary
Pork belly is ideally suited to oven roasting: the thick fat layers need extended low
heat to render and soften, and only the oven's high-blast finish produces the
shatteringly crisp crackling that defines this cut at its best. It requires 2–6 hours
and careful rind preparation, but no other method delivers both the silky-tender
interior and the crackle simultaneously.
