# Pork Chop × Air Fryer — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Air fryer pork chops cook in 12-15 minutes at 375-400°F / 190-200°C circulating air,
producing a crisped exterior without oil. The small air fryer cavity means the chop
is surrounded by hot air on all sides simultaneously, giving faster, more even cooking
than a standard oven. Boneless loin chops 0.75-1 inch / 20-25 mm thick are ideal.

## Source recipes

### 1. Serious Eats — Air-Fryer Pork Chops
- **Source**: seriouseats.com/air-fryer-pork-chops
- **Method**: Season, light oil brush, 375°F / 190°C for 12-14 min flipping at 6 min.
- **Target**: **145°F / 63°C** internal
- **Note**: Air fryer models vary widely; start checking at 10 min. Avoid overcooking
  boneless chops past 145°F — they dry rapidly.

### 2. Ninja Foodi / Kitchen Appliance Brand Guides
- **Source**: ninjakitchen.com / cosori.com cooking guides
- **Method**: Preheat 400°F / 200°C 3 min. Chops 400°F, 8-10 min per side for 1-inch.
- **Target**: **145°F / 63°C**
- **Note**: Air fryer manuals specify 145°F for pork consistent with USDA.

### 3. Alton Brown — Good Eats Air Fryer Pork Technique
- **Source**: goodeatsfanpage.com / foodnetwork.com
- **Method**: Dry-brine 30 min, 375°F air fryer, 10-12 min for 3/4-inch boneless chops.
  Rest 3-5 min in foil tent.
- **Target**: **140°F / 60°C** pull; rests to 145°F/63°C
- **Note**: Air fryers run hot; pulling at 140°F prevents the 145°F target from
  overshooting to 150°F during rest.

### 4. ICA/Coop Sweden — Luftfritösstekt fläskkotlett
- **Source**: ica.se/recept · coop.se/luftfritös
- **Method**: 200°C air fryer, 12-14 min turning once. No added oil needed.
- **Target**: **70°C** at thickest point
- **Note**: Swedish consumer guidance uses 70°C for all pork preparations in air fryers
  to account for probe placement error in home cooking.

### 5. Nigella Lawson — Crispy Air Fryer Pork Chops (At My Table / Website)
- **Source**: nigella.com
- **Method**: Breadcrumb or spice crust, 180°C air fryer, 15 min.
- **Target**: **70-72°C** (well-done by UK standards, important for breadcrumbed versions)
- **Note**: Breadcrumb coatings require slightly higher internal temp to ensure the
  crust does not mask undercooked pork near bone.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / Serious Eats | 145°F / 63°C | Pull at 140°F |
| Sweden / Scandinavia | 70°C | Safety margin |
| UK / Nigella | 70-72°C | Especially when crumbed |

**Consensus: 63-70°C depending on style.** Maps to `medium` (63°C for American style)
or `well_done` (70-72°C for crumbed/safety-first).

## What makes this method special
Air frying is the fastest oven-like method for pork chops, delivering a dry, crispy
exterior similar to pan frying with no added fat. The circulating hot air eliminates
hot spots and the need to flip multiple times. Ideal weeknight option for boneless
chops when pan or grill are not available.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (USDA 63°C global consensus)
