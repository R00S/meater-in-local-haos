# Baby Back Ribs × Grill — Recipe Temperature Research

## Cut profile
Grilling baby back ribs uses indirect heat in a covered kettle or gas grill
maintaining 225-275°F / 107-135°C inside the closed lid. Direct-heat grilling
of raw ribs burns the exterior before the collagen converts; the classic method
is "pre-cook then grill" (par-boil or oven-bake first, then grill for char and
glaze) or full indirect grilling in a kettle. Both methods target 185-203°F /
85-95°C internal with a caramelised, sticky glaze exterior.

## Source recipes

### 1. Weber Grills — Backyard Baby Back Ribs
- **Source**: weber.com/grilling-inspiration/grilling-guide-ribs
- **Method**: Indirect heat, kettle grill 225-250°F, 3-4 hours with wood chips.
  Sauce last 30 min. Pull at 190-200°F / 88-93°C.
- **Target**: **190-200°F / 88-93°C**
- **Note**: Weber's guide distinguishes between "done" (meat pulls from bone)
  and "fall-off-the-bone" (more than 200°F); competition style is "pull clean."

### 2. Steve Raichlen — Grilled Baby Back Ribs (How to Grill / Planet Barbecue)
- **Source**: How to Grill (Workman Publishing)
- **Method**: 3-zone fire on charcoal kettle: hot zone + warm zone + no-zone. Ribs
  on indirect zone, lid on, 225-250°F for 3-4 hours.
- **Target**: **190-203°F / 88-95°C**
- **Note**: Raichlen's 3-zone setup is excellent for kettle grills without a
  smoker — the hot coals on one side create a convection circuit.

### 3. J. Kenji López-Alt — Easy Grilled Baby Back Ribs (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-how-to-grill-ribs
- **Method**: Par-bake in oven at 300°F / 150°C for 2 hours, then grill direct heat
  2-3 min per side sauced, for glaze and char.
- **Target**: **190-200°F / 88-93°C** (achieved in oven, maintained on grill)
- **Note**: Kenji's two-step approach is especially practical when a full 4-hour
  grill session isn't possible.

### 4. Leila Lindholm — Grillade revben (leila.se)
- **Source**: leila.se/recept
- **Method**: Pre-cook in oven 125°C for 3 hours, glaze, finish on hot grill 5-8 min.
- **Target**: **90-95°C** internal (achieved before grilling)
- **Note**: Scandinavian approach separates the long cook phase (oven) from the
  char/glaze phase (grill) for convenience.

### 5. Francis Mallmann — Wood-Grilled Ribs (Seven Fires)
- **Source**: Seven Fires (Artisan Books)
- **Method**: Hardwood fire, indirect ember heat, 2.5-3 hours. No sauce; coarse salt
  and chimichurri.
- **Target**: **88-93°C / 190-200°F** — meat lifts from bone with thumb pressure
- **Note**: Mallmann's open-fire method with no foil wrap produces a dryer, more
  bark-heavy rib than covered kettle methods — legitimate style difference.

## Temperature consensus

| Tradition | Target internal temp | Method |
|-----------|---------------------|--------|
| USA / Weber / Raichlen / Kenji | 190-203°F / 88-95°C | Indirect or pre-bake |
| Sweden / Leila | 90-95°C | Pre-bake + grill |
| Argentina / Mallmann | 88-93°C | Open fire indirect |

**Consensus: 88-95°C (190-203°F) for tender pull-clean ribs.**
Maps to `well_done` in pork doneness.

## What makes this method special
Grilling adds a charred exterior and smoke flavour to ribs that oven alone cannot
replicate. Even a pre-baked rib finished on the grill for 5-8 minutes gains a
caramelised lacquer from direct heat that transforms the texture of the sauce glaze.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (88-95°C target)
