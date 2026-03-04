# Pork Chop × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Grilling pork chops over direct medium-high heat (400-450°F grill surface) gives
grill marks and a lightly charred, smoky crust while keeping the interior at safe
and juicy 145°F/63°C. Bone-in chops are preferred on the grill — the bone insulates
the meat near it, giving a wider window before overcooking.

## Source recipes

### 1. Weber Grills — Perfect Grilled Pork Chops
- **Source**: weber.com/us/en/grilling-inspiration/grilling-guides/grilling-guide-pork
- **Method**: Gas grill preheated high, direct heat 3-4 min per side for 1-inch chops.
  Rest 5 min on cutting board.
- **Target**: **145°F / 63°C** internal at thickest point away from bone
- **Note**: Weber thermometer guide specifies 63°C as the target for all pork chops.

### 2. Steve Raichlen — Planet Barbecue Pork Chops
- **Source**: barbecuebible.com
- **Method**: Direct then indirect if thick. Season with dry rub 30 min before. Grill
  marks on both sides, then move to indirect zone if needed.
- **Target**: **145°F / 63°C** pull (160°F/71°C for ground/sausage)
- **Note**: Recommends bone-in rib chops (thicker, fattier) for the grill.

### 3. Magnus Nilsson — Grillad fläskkotlett (Fäviken / Nordic Cookbook)
- **Source**: Fäviken cookbook / nordicfoodlab.org
- **Method**: High direct heat, 3-4 min per side. Baste with juniper-herb butter.
- **Target**: **63-65°C** at centre with visible light pink
- **Note**: Nordic approach allows visible pink in pork since 2014 EU/Nordic
  food safety guidance aligned with USDA 145°F standard.

### 4. Heston Blumenthal — Perfect Pork Chop (Heston at Home / BBC)
- **Source**: hestonfromhome.com / bbc.co.uk/food/heston_blumenthal
- **Method**: Brine 4-6 hours, dry thoroughly, grill 4 min per side, rest 10 min.
- **Target**: **62-65°C** at centre
- **Note**: Blumenthal's brine-first approach allows reaching a lower final temp
  while still retaining 100% of surface moisture from the brine.

### 5. Francis Mallmann — Grilled pork chops over wood fire (Seven Fires)
- **Source**: Seven Fires cookbook (Artisan Books)
- **Method**: Hardwood fire, indirect/ember heat, 5-6 min per side for thick chops.
- **Target**: **65-68°C** at thickest point
- **Note**: Open-fire grilling requires slightly higher pull temp due to less precise
  heat control and longer resting distance from fire.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Weber / Raichlen | 145°F / 63°C | USDA minimum, with rest |
| Nordic / Nilsson | 63-65°C | EU 2014 alignment with USDA |
| UK / Blumenthal | 62-65°C | Brine-first allows lower temp |
| Argentina / Mallmann | 65-68°C | Open fire, wider margin |

**Consensus: 63-65°C.** Maps to `medium` in pork doneness range.

## What makes this method special
Direct grill heat renders pork fat immediately, crisping the exterior while the smoke
from rendered drippings adds a layer of flavour absent from stove-top methods.
Grill marks create localised high-temp Maillard zones with lower temp between, giving
the characteristic grilled pork taste profile.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (USDA 63°C global consensus)
