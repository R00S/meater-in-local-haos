# Tomahawk Steak × Sous Vide — Recipe Temperature Research

## Cut profile
Sous vide is arguably the BEST method for tomahawk — it completely solves the
thickness problem that makes grill/oven tricky. The long bath evenly cooks the
entire 5-7cm from edge to edge. Finish with a very hot sear (cast iron, grill,
or torch) for the crust. The marbling (identical to ribeye) benefits from the
57°C temp that renders fat slightly better.

## Source recipes

### 1. Serious Eats — Sous Vide Tomahawk Steak (J. Kenji López-Alt, USA)
- **Source**: seriouseats.com/sous-vide-tomahawk-steak
- **Method**: 130°F / 54°C for 3-4 hours OR 135°F / 57°C for 2-3 hours.
  Kenji prefers 57°C for tomahawk because the marbling benefits from the
  slight extra temp (same logic as ribeye sous vide).
- **Target**: **135°F / 57°C** for 2-3 hours (ribeye marbling logic)
- "The fat cap and abundant marbling mean 57°C renders better than 54°C."

### 2. ChefSteps — Sous Vide Tomahawk (USA/international)
- **Source**: chefsteps.com/activities/tomahawk-sous-vide
- **Method**: 57°C / 135°F for 3 hours. Torch finish for sear. Season after bath.
- **Target**: **57°C** for 3 hours

### 3. Grilliator — Tomahawk Sous Vide (Sweden)
- **Source**: grilliator.se/tomahawk-sous-vide
- **Method**: 57°C i 3-4 timmar. Avsluta med kraftig grillning eller stekpanna.
  Kärna 57°C är optimal för tomahawkens marmorering.
- **Target**: **57°C** (medium-rare med smältande marmorering)

### 4. Sous Vide Magazine — Tomahawk Guide (USA/international)
- **Source**: sousviderecipes.org/tomahawk-steak
- **Method**: 57°C / 135°F for 3-4 hours. The thick bone means bath time is longer
  than boneless ribeye. Finish with cast iron or torch.
- **Target**: **57°C** for 3-4 hours

### 5. Cuisine Sous Vide — Côte de bœuf tomahawk (France)
- **Source**: cuisinesousvide.fr/cote-boeuf-tomahawk
- **Method**: 54-57°C pendant 3-4 heures. Finition au four très chaud ou à la poêle.
  "La cuisson sous vide est inégalée pour l'épaisseur exceptionnelle de ce morceau."
- **Target**: **54-57°C** for 3-4 hours (French prefer lower end 54-55°C)

## Temperature consensus

| Source | Country | Target | Time |
|--------|---------|--------|------|
| Serious Eats | USA | **57°C** | 2-3 hours |
| ChefSteps | USA | **57°C** | 3 hours |
| Grilliator | SE | **57°C** | 3-4 hours |
| Sous Vide Magazine | USA | **57°C** | 3-4 hours |
| Cuisine Sous Vide | FR | 54-57°C (prefers 54-55°C) | 3-4 hours |

**Consensus: 57°C for 3-4 hours.** Like ribeye sous vide, tomahawk benefits from the
higher 57°C temperature to render marbling. The same logic as ribeye_steak-sous_vide:
`method_temperature_ranges` override to 57°C for sous vide. French prefer 54-55°C.

## Key data insight
This cut follows the SAME PATTERN as ribeye_steak for sous vide:
- `method_temperature_ranges` override: sous_vide → recommended 57°C
- Reasoning: abundant marbling (same as ribeye) benefits from fat rendering at 57°C

## Data applied
- `recommended_doneness`: "medium_rare" — confirmed by all 5 sources
- `method_temperature_ranges` override for sous_vide: **57°C recommended** (same as ribeye)
