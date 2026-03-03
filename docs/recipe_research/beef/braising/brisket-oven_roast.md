# Beef Brisket × Oven Roast / Low-and-Slow — Recipe Temperature Research

## Cut profile
Beef brisket is one of the toughest, most collagen-rich cuts — the flat or point
from the chest of the animal. Properly cooked to 195-210°F / 91-99°C over 8-14 hours
at 225-250°F / 107-120°C, it transforms from extraordinarily tough to fall-apart
tender with a buttery, gelatinous texture. This requires patience — no shortcut
produces true brisket texture. Used for Texas BBQ, Jewish braised brisket, and
Korean galbi-jjim.

## Source recipes

### 1. Aaron Franklin — Texas BBQ Brisket (Franklin Barbecue)
- **Source**: Franklin Barbecue (Ten Speed Press) / franklinbbq.com
- **Method**: Salt + pepper only, oak smoke 250°F 12-16 hours. Wrap in butcher paper
  at stall. Target 200-205°F. Rest 2+ hours in cooler.
- **Target**: **200-205°F / 93-96°C** — "probe slides in like butter"

### 2. J. Kenji López-Alt — Oven-Braised Brisket (Serious Eats)
- **Source**: seriouseats.com/oven-braised-brisket
- **Method**: Sear, vegetables + liquid, 300°F / 150°C oven covered 6-8 hours.
- **Target**: **195-200°F / 91-93°C** — "fork-tender, slices without falling apart"

### 3. Joan Nathan — Jewish Braised Brisket (Quiches, Kugels, and Couscous)
- **Source**: Quiches, Kugels, and Couscous (Knopf)
- **Method**: Sear, onion + wine + stock, covered 325°F oven 3-4 hours.
- **Target**: **190-200°F / 88-93°C** — "falls apart easily"

### 4. Leila Lindholm — Bräserad oxbringa (leila.se)
- **Source**: leila.se/recept
- **Method**: Bryn, täck med vätska, ugn 160°C 4-5 timmar.
- **Target**: **90-95°C** at thickest

### 5. Korean tradition — Galbi-jjim (braised short rib/brisket)
- **Source**: Korean culinary tradition
- **Method**: Braise in soy + sugar + aromatics, stovetop or oven 150°C for 3-4 hours.
- **Target**: **85-95°C** — "chopstick-tender"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Aaron Franklin / BBQ | 200-205°F / 93-96°C | Low-and-slow BBQ |
| USA / Kenji / braise | 195-200°F / 91-93°C | Oven braise |
| Jewish / Nathan | 190-200°F / 88-93°C | Braised |
| Sweden | 90-95°C | European braise |
| Korean | 85-95°C | Asian braise |

**Consensus: 88-96°C / 190-205°F.** Maps to `well_done` in beef doneness.

## What makes this method special
Brisket is the proof that time and patience transform the toughest cut into the
most luxurious. At 195-205°F, every gram of collagen has converted to silky gelatin,
every fat cap has rendered, and the fibres have relaxed to produce the singular
"pull and slice" texture that defines great Texas BBQ brisket. No other preparation
shows the science of meat cookery more dramatically.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `smoker`, `braise`, `slow_cooker`
- `recommended_doneness`: `"well_done"` (88-96°C collagen conversion target)
