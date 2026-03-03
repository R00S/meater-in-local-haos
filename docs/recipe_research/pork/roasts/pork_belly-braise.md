# Pork Belly × Braise — Recipe Temperature Research

> ⚠️ **STATUS: SOURCE RECIPES INCOMPLETE**
> One or more source recipes in this leaf are in summary / bullet-point format
> rather than the full collected format required by the ToR. The Temperature
> consensus, Data applied, and Summary sections are based on incomplete data
> and should be treated as **provisional only**. This leaf must be rewritten
> to full ToR standard before its conclusions can be used.

## Cut profile
Braising pork belly — submerging it partially in liquid and cooking low and slow
(120-140°C / 250-285°F oven or stovetop) — produces a different result from roasting:
the fat and collagen melt into the braising liquid, creating a sticky, gelatinous
sauce while the meat becomes fork-tender. No crackling; the payoff is extraordinary
tenderness and a rich, unctuous texture. Internal target is 85-95°C / 185-203°F
at the meat layers, achieved after 2.5-3.5 hours.

## Source recipes

### 1. David Chang — Pork Belly Braised in Soy (Momofuku)
- **Source**: Momofuku cookbook (Clarkson Potter)
- **Method**: Sear, add soy/mirin/sake/ginger, cover, braise 250°F / 120°C for 3 hours.
- **Target**: **85-95°C / 185-203°F** at flesh layers (probe slides in easily)
- **Note**: Chang's braising liquid becomes the serving sauce — collagen extracted
  from the belly at 85°C+ produces a thick, glossy glaze.

### 2. Thomas Keller — Braised Pork Belly (Ad Hoc at Home)
- **Source**: Ad Hoc at Home (Workman Publishing)
- **Method**: Brown on all sides, deglaze, braise 140°C / 285°F oven 2.5-3 hours
  covered in stock/aromatics.
- **Target**: **85-90°C / 185-195°F** at thickest flesh layer
- **Note**: Keller presses and chills the braised belly overnight, then slices and
  pan-sears individual portions for service — the dual cook gives restaurant texture.

### 3. Heston Blumenthal — Braised Pork Belly with Black Pudding (Heston at Home)
- **Source**: hestonfromhome.com
- **Method**: Vacuum-pack with aromatics, 80°C water bath 8 hours OR covered braise
  130°C / 265°F for 4 hours.
- **Target**: **80-85°C / 175-185°F** (very gentle; keeps belly intact for slicing)
- **Note**: Blumenthal's target is slightly lower than Chang's — he prioritises
  clean slices over fork-apart texture.

### 4. Fergus Henderson — Braised Belly of Pork (St. JOHN)
- **Source**: Nose to Tail Eating (Bloomsbury)
- **Method**: Salt overnight, brown, braise with stock + vegetables at 160°C / 320°F
  for 2.5 hours.
- **Target**: **88-92°C / 190-198°F** at flesh (thermometer slides through easily)
- **Note**: Henderson uses visual-tactile cues: "the belly should yield completely
  to a probe" — no bouncing resistance.

### 5. Leila Lindholm — Bräserad sidfläsk (Koket.se)
- **Source**: koket.se / leila.se
- **Method**: Brown well, add vegetables + cider/apple juice, braise 160°C / 320°F
  2-2.5 hours covered. Rest 15 min.
- **Target**: **85-90°C** at thickest flesh layer
- **Note**: Apple juice/cider is a traditional Scandinavian braising liquid for
  pork belly — the acidity balances the richness of the fat.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| David Chang | 85-95°C / 185-203°F | Collagen fully dissolved |
| Thomas Keller | 85-90°C | Press-chill-sear approach |
| Heston Blumenthal | 80-85°C | Lower for clean slicing |
| Fergus Henderson | 88-92°C | "Probe slides through" |
| Sweden / Leila | 85-90°C | Standard braise target |

**Consensus: 85-90°C at flesh layers.** Maps to `well_done` in pork doneness.

## What makes this method special
Braising transforms pork belly into something entirely different from roasting — the
liquid environment extracts collagen into a rich glaze while the fat becomes silky
rather than crispy. The result is a restaurant-quality texture achievable at home
in a covered Dutch oven with no special equipment.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (85-90°C braising target)

## Summary
Braising suits pork belly exceptionally well: the fat and collagen dissolve into the
braising liquid, producing a silky, unctuous texture that roasting cannot replicate.
The trade-off is no crackling — the rind softens entirely and the belly becomes
fork-tender rather than crispy. Choose braising when you want richness and a built-in
sauce; choose oven roasting when crackling is the goal.
