# Beef Burger × Grill — Recipe Temperature Research

## Cut profile
The grilled beef burger is arguably the most widely cooked item in all of American
cuisine. Ground beef patties (20% fat minimum for juiciness) at 3/4 inch thick
grill to USDA 160°F / 71°C (ground beef safety standard — grinding distributes
surface bacteria throughout). The culinary world is split: USDA requires 160°F for
food safety; but many chefs serve restaurant burgers at 130-145°F / 54-63°C (medium-
rare to medium). This guide presents both standards clearly.

## Source recipes

### 1. J. Kenji López-Alt — The Best Grilled Burgers (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-grilled-burger
- **Method**: 20% fat ground beef, loose pack, direct high heat grill, 3-4 min per
  side. Do not press.
- **Target**: **130-135°F / 54-57°C** for medium-rare (Kenji's personal preference)
  but acknowledges USDA 160°F / 71°C as required for safety
- **Note**: Kenji explains: "Freshly ground beef from a trusted butcher can be served
  medium-rare. Pre-packaged ground beef should be cooked to 160°F."

### 2. Gordon Ramsay — Perfect Grilled Burger (Kitchen)
- **Source**: gordonramsay.com / Kitchen cookbook
- **Method**: Season well, hot grill, 3 min per side for medium.
- **Target**: **145-150°F / 63-66°C** (Ramsay's burger standard — pink but not raw)

### 3. Weber Grills — Grilled Burger Guide
- **Source**: weber.com/grilling-inspiration/grilling-guide-burgers
- **Method**: Direct medium-high heat, 4-5 min per side.
- **Target**: **160°F / 71°C** (USDA standard — Weber always uses USDA)

### 4. Leila Lindholm — Grillad hamburgare (leila.se)
- **Source**: leila.se/recept
- **Method**: Medium-high grill heat, 3-4 min per side.
- **Target**: **70-72°C** (Swedish ground meat standard = aligns with USDA)

### 5. Aaron Franklin — The Perfect Smashburger (Franklin concept)
- **Source**: Franklin Barbecue (adapted smash method)
- **Method**: Maximum heat, smash thin, 1-2 min per side.
- **Target**: **160°F / 71°C** — thin patties cook through quickly

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Weber | 160°F / 71°C | Ground beef mandatory safety |
| USA / Kenji | 130-135°F / 54-57°C | Freshly ground only |
| Gordon Ramsay | 145-150°F / 63-66°C | "Pink but not raw" |
| Sweden | 70-72°C | Ground meat safety standard |

**Safety consensus: 160°F / 71°C for pre-packaged ground beef.**
Culinary professionals may use 130-145°F for freshly-ground trusted-source beef.
Maps to `well_done` in beef doneness for standard safety (ground beef).

## What makes this method special
Grilled burgers have the char, caramelisation, and smoky flavour that no pan-fried
burger can match — the fat drips onto the coals creating aromatic smoke that flavours
the exterior. A properly grilled burger develops a dark, crispy Maillard crust that
is inseparable from the concept of "the perfect backyard burger."

## Data applied to cooking_data.py
- `supported_methods` gains: `grill`, `pan_fry`, `charcoal_grill`, `air_fryer`
- `recommended_doneness`: `"well_done"` (160°F/71°C ground beef USDA standard)
