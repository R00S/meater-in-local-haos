# Baby Back Ribs × Smoker — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Baby back ribs smoked at 225-250°F / 107-120°C for 4-5 hours is the canonical BBQ
competition method. The 3-2-1 method (3 hours naked, 2 hours foil-wrapped with
liquid, 1 hour naked sauced) was popularised by competition circuits. Smoke
penetration forms a distinctive pink ring beneath the surface — a desirable
quality marker in competition judging. Target: 185-203°F / 85-95°C internal
with meat that pulls cleanly from the bone but doesn't fall off.

## Source recipes

### 1. Aaron Franklin — Franklin Barbecue Baby Back Ribs
- **Source**: Franklin Barbecue (Ten Speed Press) / franklinbbq.com
- **Method**: Trim membrane, salt + pepper only, oak smoker 250°F for 4-5 hours.
  No wrap (Franklin prefers no-wrap for ribs). Sauce optional at end.
- **Target**: **195-200°F / 91-93°C** — "clean bite, pulls away from bone."
- **Note**: Franklin eschews the 3-2-1 foil wrap for ribs, preferring a pure smoke
  experience. His ribs take slightly longer than foil-wrapped.

### 2. Steve Raichlen — Smoked Baby Back Ribs (Planet Barbecue)
- **Source**: Planet Barbecue (Workman) / barbecuebible.com
- **Method**: Mustard slather, dry rub, 225°F cherry + apple wood, 4-5 hours. Glaze
  last 30 min.
- **Target**: **185-195°F / 85-91°C** — "meat pulls from bone with slight resistance"
- **Note**: Raichlen targets 185-195°F for a firmer rib bite; Franklin targets higher
  for more tender. Both are valid style choices.

### 3. Myron Mixon — Competition Baby Back Ribs (Everyday Barbecue)
- **Source**: Everyday Barbecue (Ballantine Books)
- **Method**: 3-2-1: 3 hours dry at 225°F, 2 hours foil with apple juice, 1 hour
  naked sauced.
- **Target**: **195-200°F / 91-93°C**
- **Note**: 3-2-1 is Mixon's competition standard; the foil wrap phase accelerates
  collagen conversion and adds moisture from steam.

### 4. J. Kenji López-Alt — Smoked Baby Back Ribs Science (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-how-to-smoke-ribs
- **Method**: 225°F fruit-wood smoke, 5-6 hours no-wrap for maximum bark development.
  Probe to 195°F.
- **Target**: **195°F / 91°C** at thickest meat
- **Note**: Kenji explains the no-wrap approach maximises bark (the dry, caramelised
  exterior crust), which is impossible in a foil-wrapped rib.

### 5. Pit Boys — BBQ Baby Back Ribs (pitboys.com)
- **Source**: pitboys.com / YouTube
- **Method**: 3-2-1, hickory + apple wood, 225°F.
- **Target**: **185-203°F / 85-95°C** — the range accounts for different smoker
  efficiencies and rib thicknesses.

## Temperature consensus

| Source | Smoker temp | Target internal temp |
|--------|------------|---------------------|
| Aaron Franklin | 250°F | 195-200°F / 91-93°C |
| Steve Raichlen | 225°F | 185-195°F / 85-91°C |
| Myron Mixon | 225°F (3-2-1) | 195-200°F / 91-93°C |
| J. Kenji López-Alt | 225°F | 195°F / 91°C |
| Pit Boys | 225°F | 185-203°F / 85-95°C |

**Consensus: 185-203°F / 85-95°C depending on style.**
Competition standard: 195-200°F. Maps to `well_done` in pork doneness.

## What makes this method special
Smoking is the only method that builds both a smoke ring (pink layer beneath
the surface from nitric oxide and myoglobin chemistry) and a bark (caramelised
exterior of dried rub reacting with smoke and heat). These two qualities define
competition BBQ ribs and cannot be replicated by any indoor cooking method.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (185-203°F collagen target)
