# Bison Burger × Grill — Recipe Temperature Research

## Cut profile
Bison burgers are leaner than beef burgers (typically 10-15% fat vs. 20-25% for
beef) — they cook faster and dry out more easily if overcooked. USDA requires 160°F
/ 71°C for all ground meat including bison. Many bison specialty producers now
recommend 160°F and note that bison reaches this temperature 1-2 minutes faster
than beef on the same grill. A thicker patty (3/4 inch) compensates for leanness.

## Source recipes

### 1. J. Kenji López-Alt — Bison Burger (Serious Eats / adapted)
- **Source**: seriouseats.com — adapted from beef burger article
- **Method**: 80/20 fat if possible, medium-high grill, 3-4 min per side.
- **Target**: **160°F / 71°C** (USDA ground meat) — bison cooks faster than beef

### 2. Ted's Montana Grill — The Bison Burger Standard
- **Source**: tedsmontanagrill.com / bison management guidelines
- **Method**: Thick patty, medium grill, 4-5 min per side.
- **Target**: **160°F / 71°C** — "fully cooked"

### 3. National Bison Association — Cooking Bison
- **Source**: bisoncentral.com
- **Method**: Same technique as beef but watch — bison cooks 1/3 faster.
- **Target**: **160°F / 71°C**

### 4. Leila Lindholm — Bisonburgare (adapted) (leila.se)
- **Source**: leila.se/recept
- **Method**: Grill medium-hög, 3-4 min per sida.
- **Target**: **70-72°C**

### 5. Gordon Ramsay — Game Burger (adapted bison)
- **Source**: gordonramsay.com
- **Method**: Medium-high grill, season well, 3-4 min per side.
- **Target**: **160°F / 71°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA | 160°F / 71°C | Ground meat mandatory |
| National Bison Association | 160°F / 71°C | Bison industry standard |
| Sweden | 70-72°C | |

**Consensus: 160°F / 71°C (USDA ground meat standard).**
Maps to `well_done` in bison/game doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `grill`, `pan_fry`
- `recommended_doneness`: `"well_done"` (160°F/71°C ground bison)
