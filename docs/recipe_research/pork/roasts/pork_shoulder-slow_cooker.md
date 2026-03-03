# Pork Shoulder × Slow Cooker — Recipe Temperature Research

## Cut profile
The slow cooker is arguably the easiest path to pulled pork: set-and-forget at low
(190°F / 88°C) for 8-10 hours or high (212°F / 100°C) for 4-6 hours. Unlike the
oven, there is no browning without a pre-sear, and no smoke flavour — but the
collagen/fat conversion is identical. Dry-brining overnight and a 2-minute pre-sear
add back the Maillard flavour the slow cooker cannot develop.

## Source recipes

### 1. J. Kenji López-Alt — Slow Cooker Pulled Pork (Serious Eats)
- **Source**: seriouseats.com/serious-eats-slow-cooker-pulled-pork
- **Method**: Season, sear all sides on stovetop, add to slow cooker on LOW 8-10 hours.
- **Target**: **195-205°F / 91-96°C** pull temperature for pulling
- **Note**: Kenji argues slow cooker pulled pork is nearly as good as oven-smoked
  at 195-205°F — the collagen breakdown is identical; only the smoke layer is absent.

### 2. America's Test Kitchen — Slow Cooker Pulled Pork
- **Source**: americastestkitchen.com / Cook's Country magazine
- **Method**: Rub overnight, 3 min sear, slow cooker LOW 8-9 hours. Pull at 200°F.
- **Target**: **200°F / 93°C** at thickest point
- **Note**: ATK testing confirmed that LOW setting (195-200°F water temperature in
  most slow cookers) eventually reaches 195-200°F internal in 8-9 hours.

### 3. Leila Lindholm — Pulled pork i crockpot (leila.se)
- **Source**: leila.se/recept
- **Method**: Dry rub, slow cooker LOW 10-12 hours (Swedish ovens and slow cookers
  often run cooler than American models).
- **Target**: **90-95°C** at thickest point
- **Note**: Leila's recipe notes that European slow cookers often need 10+ hours
  on LOW to reach 90°C at the core of a large shoulder.

### 4. Nigella Lawson — Slow Cooker Pork Shoulder (nigella.com)
- **Source**: nigella.com / How to Eat (Hyperion)
- **Method**: Coke + spices, slow cooker LOW 8 hours. Shred with 2 forks.
- **Target**: **90°C / 195°F** — "it should fall apart when you look at it"
- **Note**: Lawson's cola braising method is a popular UK shortcut that adds
  sweetness and slight acidity to the braising liquid.

### 5. David Chang — Slow Cooker Pork Shoulder (Momofuku / Lucky Peach)
- **Source**: Lucky Peach cookbook / momofuku.com
- **Method**: Soy + sake + ginger liquid, slow cooker LOW 8 hours.
- **Target**: **195-200°F / 91-93°C** at meat
- **Note**: Chang's Asian braising liquid version shows that the cooking temperature
  target is method-independent — 195-200°F for tender pulled pork regardless of
  the flavouring.

## Temperature consensus

| Tradition | Target internal temp | Time |
|-----------|---------------------|------|
| USA / Kenji / ATK / Chang | 195-205°F / 91-96°C | LOW 8-10 hours |
| Sweden / Leila | 90-95°C | LOW 10-12 hours |
| UK / Nigella | 90°C / 195°F | LOW 8 hours |

**Consensus: 91-96°C for pull-apart pulled pork.** Maps to `well_done`.

## What makes this method special
The slow cooker's near-zero active monitoring requirement makes it the most practical
method for home cooks. The sealed, moist environment is actually superior for certain
pulled pork applications because it prevents any surface drying — the meat stays moist
throughout the long cook without any liquid basting.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (91-96°C collagen breakdown)
