# Pork Tenderloin × Sous Vide — Recipe Temperature Research

## Cut profile
Sous vide is arguably the ideal method for pork tenderloin: the lean, forgiving cut
is sealed in a bag at an exact temperature (140°F / 60°C is the sweet spot for 1-4
hours) and held there until uniformly cooked throughout — no guessing, no grey ring.
A brief sear after the bath adds the Maillard crust the water bath cannot produce.
Pasteurisation at 140°F/60°C is achieved after 30 minutes (FDA time-temperature tables).

## Source recipes

### 1. J. Kenji López-Alt — Sous Vide Pork Tenderloin (Serious Eats)
- **Source**: seriouseats.com/sous-vide-pork-tenderloin
- **Method**: Season, seal, 140°F / 60°C water bath 1-4 hours. Pat dry, sear in
  screaming-hot pan 45 sec per side. Rest 2 min.
- **Target**: **140°F / 60°C** bath temp (pasteurisation confirmed, slight pink centre)
- **Note**: At 140°F for 30+ min, pork is pasteurised by time-temperature relationship
  even though it reads below the instantaneous 160°F USDA old standard.

### 2. ChefSteps / Joule — Sous Vide Pork Tenderloin Guide
- **Source**: chefsteps.com / app.chefsteps.com
- **Method**: 140°F / 60°C for 1-2 hours. Ice bath if not searing immediately.
- **Target**: **140°F / 60°C** (medium — faint pink, very juicy)
- **Note**: ChefSteps offers 145°F/63°C for more traditional "fully cooked" appearance
  without sacrificing moisture thanks to the precise bath.

### 3. Thomas Keller — Under Vacuum Pork Loin (Bouchon Bistro)
- **Source**: Thomas Keller: Under Pressure cookbook (Artisan)
- **Method**: Season with aromatic herbs, seal, 59.5°C / 139°F bath 1.5 hours.
  Sear in clarified butter 1 min per side.
- **Target**: **139-140°F / 59-60°C** bath temperature
- **Note**: Keller's original sous vide specification for pork fillet. Time of 1.5
  hours chosen for pasteurisation safety at 59°C per FDA pathogen reduction tables.

### 4. Magnus Nilsson — Sous vide-tillagad fläskfilé (Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Salt 30 min, vacuum seal, 60°C bath 1-3 hours. Quick sear to finish.
- **Target**: **60°C / 140°F** bath (Nordic standard for fully pasteurised pink pork)
- **Note**: Nordic food safety authorities accept time-temperature pasteurisation at
  60°C making this method fully safe at pink internal appearance.

### 5. Heston Blumenthal — Perfect Pork Tenderloin Sous Vide (The Fat Duck Research)
- **Source**: hestonfromhome.com / Fat Duck kitchen research published notes
- **Method**: Brine 3 hours, bag with thyme + garlic, 58-60°C bath 1.5 hours. Very
  quick pan sear 30 sec per side.
- **Target**: **58-60°C / 136-140°F** bath temperature
- **Note**: Blumenthal argues 58°C for 1.5 hours gives best texture (slightly firmer
  than beef sous vide at 54°C) while meeting safety requirements.

## Temperature consensus

| Tradition | Bath temperature | Pasteurisation time |
|-----------|-----------------|---------------------|
| USA / Kenji / ChefSteps | 140°F / 60°C | 30 min minimum |
| Thomas Keller | 139°F / 59.5°C | 1.5 hours |
| Nordic / Nilsson | 60°C | 1-3 hours |
| Heston Blumenthal | 58-60°C | 1.5 hours |

**Consensus: 59-60°C / 138-140°F bath for 1-2 hours minimum.** Maps to `medium`
(pasteurised pink) in our pork doneness range.

## What makes this method special
Sous vide eliminates every risk of overcooking pork tenderloin — the most common
failure mode for this cut. The water bath holds the precise temperature indefinitely,
giving a 1-4 hour window of flexibility. A 30-second sear after creates the crust
without raising the already-perfect interior temperature by more than 1-2°C.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (60°C bath = pasteurised pink interior)
