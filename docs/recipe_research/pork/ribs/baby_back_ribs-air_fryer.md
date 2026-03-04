# Baby Back Ribs × Air Fryer — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Air frying ribs is a modern shortcut that produces tender ribs with caramelised glaze
in under 40 minutes — dramatically faster than traditional low-and-slow methods.
The trade-off: less smoke flavour, less bark development, and a slightly less
silky collagen texture than hours-long methods. Best approach: cut slab into
2-3 rib sections to fit the air fryer basket. Pre-season well; the fast cook
relies on the rub and glaze for flavour intensity.

## Source recipes

### 1. Serious Eats — Air Fryer Baby Back Ribs
- **Source**: seriouseats.com
- **Method**: Cut into sections, dry rub, air fryer 375°F / 190°C 25-30 min
  flipping at 15 min. Brush with sauce, 5 min more at 400°F / 200°C.
- **Target**: **165°F / 74°C** minimum; prefer 185-190°F / 85-88°C for tenderness
- **Note**: At 165°F ribs are safe but still somewhat tough; 185°F gives the
  texture improvement that makes ribs worthwhile.

### 2. Ninja Foodi — Air Fryer Baby Back Ribs Guide
- **Source**: ninjakitchen.com
- **Method**: Sections, 380°F 25-28 min, sauce + 5 min more.
- **Target**: **145°F minimum / 185-190°F preferred** for tender texture
- **Note**: Appliance manufacturer specifies USDA 145°F safe minimum; experienced
  rib cooks target higher for texture.

### 3. America's Test Kitchen — Quick Air Fryer Ribs
- **Source**: americastestkitchen.com
- **Method**: Dry rub, 300°F / 150°C air fryer 30 min (lower temp, longer), then
  sauce at 400°F / 200°C for 10 min.
- **Target**: **185-190°F / 85-88°C** — more tender than the 145°F safe minimum
- **Note**: ATK's lower-temp longer approach gets closer to slow-cook texture than
  the standard 380°F fast approach.

### 4. ICA/Coop Sweden — Luftfritösprimad revbensspjäll
- **Source**: ica.se/recept · coop.se/recept
- **Method**: Pre-cook in microwave 10 min + dry rub, 200°C air fryer 15 min.
- **Target**: **70-75°C minimum** (Swedish safety standard)
- **Note**: Microwave pre-cook step speeds collagen conversion before air frying.

### 5. Alton Brown — Ribs in the Air Fryer (Good Eats Reloaded)
- **Source**: goodeatsfanpage.com
- **Method**: 275°F / 135°C air fryer 35-40 min for gentle collagen conversion, then
  sauce at 400°F 5 min.
- **Target**: **185-190°F / 85-88°C** for "acceptable tenderness"
- **Note**: Brown acknowledges air fryer ribs cannot match smoker quality but
  finds 35-40 min at 275°F produces the best texture achievable by this method.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Serious Eats / ATK | 185-190°F / 85-88°C | Preferred for texture |
| USDA minimum | 145°F / 63°C | Safe but still tough |
| Sweden | 70-75°C | Safety standard |

**Consensus: 85-88°C / 185-190°F for acceptable tenderness in air fryer.**
Maps to `well_done` in pork doneness.

## What makes this method special
Air fryer ribs are the fastest path from raw to table for ribs (40 minutes vs
4-6 hours for smoker/oven). The result is not authentic BBQ, but for a weeknight
rib craving it delivers 80% of the reward in 10% of the time. The high convection
heat caramelises the glaze effectively, producing sticky, glossy ribs quickly.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (85-88°C for texture)
