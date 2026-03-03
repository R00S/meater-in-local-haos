# Pork Chop × Oven Roast — Recipe Temperature Research

## Cut profile
Roasting thick pork chops in the oven (350-400°F / 175-200°C) produces even cooking
throughout without the risk of a charred exterior before the interior reaches safe
temperature. This method suits bone-in chops ≥1.5 inches / 38 mm. A brief sear
before oven roasting adds crust development without slowing the oven phase.

## Source recipes

### 1. America's Test Kitchen — Easy Baked Pork Chops
- **Source**: cooks.com / americastestkitchen.com
- **Method**: 425°F oven, bone-in chops on rack over sheet pan. 15-20 min to 140-145°F.
  Rest 5 min.
- **Target**: **145°F / 63°C** internal at thickest point
- **Note**: ATK found 425°F oven produced the best exterior browning without drying.

### 2. Ina Garten — Perfect Pork Chops (Barefoot Contessa)
- **Source**: foodnetwork.com/shows/barefoot-contessa
- **Method**: Sear 3 min per side in oven-safe pan, then roast at 400°F / 200°C for
  10-15 min to 145°F. Rest 5 min.
- **Target**: **145°F / 63°C**
- **Note**: The sear-first step is important for colour development, since oven alone
  at 400°F takes longer to produce browning on pork.

### 3. Swedish tradition — Ugnsrostad fläskkotlett (ICA / Coop)
- **Source**: ica.se/recept · coop.se/recept
- **Method**: 200°C oven, bone-in chops 20-25 min. No pre-sear needed (relying on
  direct contact with roasting pan).
- **Target**: **68-70°C** at centre (Swedish standard)
- **Note**: Swedish food-safety guidance for home cooking recommends 70°C for pork
  to account for oven temperature variation in home ovens.

### 4. Marco Pierre White — Slow-Roasted Pork Chops (Kitchen) 
- **Source**: Marco Pierre White Kitchen (HarperCollins)
- **Method**: 160°C oven, 35-40 min for thick bone-in. Rest 10 min.
- **Target**: **65-68°C** at centre (White's preference for "just cooked through" pork)
- **Note**: Lower oven temp produces more even internal gradient with less moisture loss.

### 5. Samin Nosrat — Roasted Pork Chops with Fennel (Salt Fat Acid Heat)
- **Source**: Salt Fat Acid Heat cookbook (Simon & Schuster)
- **Method**: Brine overnight, pat dry, high oven 425°F. 12-15 min.
- **Target**: **145°F / 63°C** with visible faint pink at centre
- **Note**: Nosrat emphasises that the 2011 USDA revision (145°F vs old 160°F) was a
  significant improvement allowing properly juicy roasted pork.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / ATK / USDA | 145°F / 63°C | With 5-min rest |
| Sweden | 68-70°C | Home-oven safety margin |
| France / Marco Pierre White | 65-68°C | "Just cooked through" |

**Consensus: 63-68°C final serving temp.** Maps to `medium` in pork doneness.

## What makes this method special
Oven roasting gives the most even internal temperature gradient of any dry-heat method,
ideal for thick or bone-in chops where stove-top methods risk an overcooked outer ring.
A brief sear before the oven phase adds all the crust development oven alone cannot
achieve at safe roasting temperatures.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (global consensus 63-68°C)
