# Pork Belly × Air Fryer — Recipe Temperature Research

## Cut profile
Air frying pork belly strips or slabs (boneless, skin-on, 1-2 cm thick slices or
small blocks) is increasingly popular for producing crispy rind without the complexity
of full oven crackling. The air fryer runs at 200°C / 390°F with high air velocity,
rendering fat and crisping skin in 25-30 minutes. Score the rind and dry thoroughly
beforehand; moisture is the enemy of crackle in an air fryer.

## Source recipes

### 1. Serious Eats — Air Fryer Pork Belly
- **Source**: seriouseats.com
- **Method**: Score rind deeply, salt rind, dry 1 hour, air fryer 200°C 25-30 min
  skin-side up. Internal flesh to 165°F / 74°C.
- **Target**: **165°F / 74°C** at flesh; rind judged by texture
- **Note**: Air fryer crackling is less shatteringly crisp than oven crackling but
  far faster; acceptable for weeknight pork belly.

### 2. Nigella Lawson — Air Fryer Crispy Pork Belly (nigella.com)
- **Source**: nigella.com
- **Method**: Chinese five-spice rub, dry overnight. Air fryer 200°C 25 min skin-side
  up, flip for 5 min to finish flesh side.
- **Target**: **70-75°C** at flesh (UK standard for pork)
- **Note**: Lawson's "crispy" standard is rind-colour based; probe to confirm
  flesh is not raw/pink.

### 3. Marion Grasby — Asian Crispy Pork Belly in Air Fryer (Marion's Kitchen)
- **Source**: marions-kitchen.com
- **Method**: Chinese-style pork belly: salt crust on rind, air fryer 200°C 30 min,
  remove salt crust, blast at 220°C 5-10 min for crackle.
- **Target**: **75-80°C** at meat layers
- **Note**: The two-temperature approach mirrors oven crackling technique scaled
  to air fryer dimensions.

### 4. ICA/Coop Sweden — Sidfläsk i luftfritösen
- **Source**: ica.se/recept · coop.se/recept
- **Method**: Score, salt rind, 200°C air fryer 25-30 min.
- **Target**: **70°C** at flesh (Swedish standard)

### 5. Heston Blumenthal (adapted for air fryer) — crispy pork belly technique
- **Source**: hestonfromhome.com technique adapted by culinary educators
- **Method**: Pre-braise, slice, dry thoroughly, air fryer 200°C 20 min skin-side up.
- **Target**: **165°F / 74°C** at flesh (pre-braised means fully cooked before air fry)
- **Note**: The braise-then-air-fry method produces superior crackling because the
  moisture has already been cooked out in the braise phase.

## Temperature consensus

| Tradition | Target flesh temp | Notes |
|-----------|-----------------|-------|
| USA / Serious Eats | 165°F / 74°C | USDA pork standard |
| UK / Nigella | 70-75°C | "No pink" standard |
| Asia / Marion | 75-80°C | Middle ground |
| Sweden | 70°C | Swedish pork guidance |

**Consensus: 70-75°C at flesh, rind by texture.** Maps to `well_done` in pork doneness.

## What makes this method special
Air frying is the fastest path to crispy pork belly skin for weeknight or small-batch
cooking. While it cannot fully replicate the shattering crackle of a proper 6-hour
oven roast, a 30-minute air fryer session with properly dried rind comes remarkably
close and requires no complex setup.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (70-75°C flesh + rendered fat required)

## Summary
Air frying delivers crispy pork belly rind in under 30 minutes — a useful shortcut
compared to the 3–6-hour oven roast. Fat renders adequately and the rind crisps, but
the crackle is softer and less dramatic than a full oven blast. It is the right choice
for small portions and weeknight speed; not the right choice when crackling quality is
the priority.
