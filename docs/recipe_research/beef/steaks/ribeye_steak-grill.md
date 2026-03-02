# Ribeye Steak × Grill (gas) — Recipe Temperature Research

## Cut profile
Gas grill direct heat sears the ribeye rapidly from below with radiant and convective heat.
Fat dripping on hot burners ignites briefly, adding a light char and smoke note. Less
aggressive heat differential than charcoal, more controllable. Grill marks develop where
the grate contacts the meat (Maillard), but the spaces between grates receive less direct
heat — creating a characteristic striped sear rather than the full-crust of cast iron.

## Source recipes

### 1. Weber Grills — Classic Rib-Eye Steaks (weber.com)
- **Source**: weber.com/recipes/red-meat/classic-rib-eye-steaks
- **Method**: Preheat gas grill to 450-500°F / 230-260°C. Direct heat, turn once.
  Two-zone setup for thick cuts: sear on direct, finish on indirect.
- **Target** (medium-rare): pull at 125-130°F / **52-54°C**, rest 5 min to 135°F / 57°C
- **Doneness verdict**: medium-rare universally recommended for ribeye.

### 2. ThermoWorks — Steak Temperature Guide (blog.thermoworks.com)
- **Source**: blog.thermoworks.com/steak-guide
- **Method**: High heat direct grill; instant-read probe inserted sideways at steak centre.
- **Pull temp**: 5°F / 3°C below final target. For medium-rare pull at 125°F / **52°C**.
- **Final after rest**: 130-135°F / **54-57°C**

### 3. Swedish barbecue tradition — Grillad entrecôte (Grillkurs.se / Allt om mat)
- **Source**: alltommat.se · grillkurs.se
- **Method**: Swedish grillare typically use direct gas heat, flip once, rest under foil.
  Preference: "rosa i mitten men med grillyta" (pink inside with grill marks).
- **Target** (medium-rare): **55-57°C** at rest — matching Leila Lindholm's pan-sear.

### 4. Argentine parilla over wood/gas — Bife ancho a la parrilla (Frigorifico SADA)
- **Source**: frigorificosada.com.ar/blog/punto-de-coccion-de-la-carne
- **Method**: Coals or gas grill. "Al punto" (medium / jugoso) preferred nationally.
- **Target**: jugoso = 55°C, al punto = 58-60°C
- **Note**: Argentine tradition tends toward slightly higher temperatures than French/Italian.

### 5. South African braai tradition — Rib-eye on the grid (Jan Braai / Jan Scannell)
- **Source**: janbraai.com / braaivleis.co.za
- **Method**: Hardwood coals, grid at hand height, flip once per side.
- **Target**: South African braai masters prefer medium to medium-well (60-65°C) for
  taste/tradition, but premium cuts are increasingly served at medium-rare (54-57°C).

## Temperature consensus

| Tradition | Preferred target | Notes |
|-----------|-----------------|-------|
| USA / ThermoWorks / Weber | 54-57°C final | medium-rare |
| Sweden | 55-57°C | medium-rare |
| Argentina | 55-60°C | jugoso / al punto |
| South Africa (braai) | 60-65°C | tradition, shifting toward 54-57°C |

**Consensus: medium-rare (54-57°C)** is the globally dominant choice for grilled ribeye.
South African and some Latin American traditions go slightly higher but are converging.

## What makes gas grill different from pan sear
Gas grill produces char from fat drippings and open flame, adding a subtly smoky note
absent from pan searing. Grill marks concentrate Maillard flavour in stripes. Interior
texture is essentially identical at the same final temperature — the difference is surface
character and flavour complexity, not the internal doneness target.

## Data applied
- No `method_temperature_ranges` override needed — default ranges apply.
- `method_doneness["grill"]` = not needed (same as `recommended_doneness`).
