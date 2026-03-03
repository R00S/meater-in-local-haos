# Chuck Roast × Braise — Recipe Temperature Research

## Cut profile
Beef chuck roast (pot roast) is the quintessential braising cut — heavily marbled,
collagen-rich muscle from the shoulder. Braising (half-submerged in liquid, 160°C /
320°F covered oven for 3-4 hours) converts the tough connective tissue to gelatin.
The result: fork-tender beef in a rich, self-made sauce. Target: 190-200°F / 88-93°C
at the meat for pull-apart texture. Shorter braises (to 160°F / 71°C) produce a
"sliceable" but still firm roast — useful for beef bourguignon style service.

## Source recipes

### 1. J. Kenji López-Alt — The Ultimate Pot Roast (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-slow-cooked-beef-chuck-for-the-best-pot-roast
- **Method**: Sear well, aromatics + stock + wine, 300°F oven covered 4-5 hours.
- **Target**: **195-205°F / 91-96°C** for pull-apart; **160°F / 71°C** for sliceable

### 2. Julia Child — Boeuf Bourguignon (Mastering the Art of French Cooking)
- **Source**: Mastering the Art of French Cooking (Alfred A. Knopf)
- **Method**: Lardons, pearl onions, mushrooms, red wine braise 160°C 2.5-3 hours.
- **Target**: **160-170°F / 71-77°C** — "tender when pierced with a fork"

### 3. Thomas Keller — Short Rib / Chuck Braise (Ad Hoc at Home)
- **Source**: Ad Hoc at Home (Workman)
- **Method**: Deep brown sear, red wine + stock, 325°F covered 3-4 hours.
- **Target**: **190-200°F / 88-93°C** — "meat falling from bone"

### 4. Leila Lindholm — Bräserat nötkött (leila.se)
- **Source**: leila.se/recept
- **Method**: Bryn väl, grönsaksbädd, täckt ugn 160°C 4-5 timmar.
- **Target**: **90-95°C** — "faller isär lätt"

### 5. Gordon Ramsay — Slow-Cooked Beef Chuck (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Sear, red wine + beef stock, covered 160°C 3.5-4 hours.
- **Target**: **88-92°C / 190-198°F**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji / Keller | 195-205°F / 91-96°C | Pull-apart pot roast |
| France / Julia Child | 160-170°F / 71-77°C | Sliceable bourguignon |
| Sweden / Leila | 90-95°C | Fork-tender |
| Gordon Ramsay | 88-92°C | Restaurant braise |

**Consensus: 88-96°C / 190-205°F for pull-apart braised chuck.**
Maps to `well_done` in beef doneness.

## What makes this method special
Braised chuck roast is the original "poor man's" luxury — a cheap, tough cut
transformed by a few hours of gentle heat into something extraordinary. The
collagen-to-gelatin conversion creates a naturally thick, silky braising liquid
that no store-bought sauce can replicate. Boeuf bourguignon, pot roast, and
hundreds of cultural variants all use the same science.

## Data applied to cooking_data.py
- `supported_methods` gains: `braise`, `slow_cooker`, `oven_roast`
- `recommended_doneness`: `"well_done"` (88-96°C collagen conversion)
