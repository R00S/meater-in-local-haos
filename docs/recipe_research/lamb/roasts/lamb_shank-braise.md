# Lamb Shank × Braise — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Lamb shank (the lower leg) is one of the most collagen-rich cuts on the animal —
packed with connective tissue that must be converted to gelatin through 2.5-3.5
hours of braising (partially submerged in liquid) at 150-165°C / 300-325°F. The
payoff: meat that literally falls from the bone in long, soft strands, surrounded
by a sticky, intensely flavoured braising liquid that reduces to a glaze. The
internal temperature target is 82-90°C / 180-195°F — well past conventional
"well done" but essential for the texture.

## Source recipes

### 1. Gordon Ramsay — Braised Lamb Shanks (Gordon Ramsay's Maze)
- **Source**: gordonramsay.com / Maze cookbook
- **Method**: Sear all sides until deep brown, add aromatics + stock + wine, braise
  160°C / 320°F covered 2.5-3 hours.
- **Target**: **85-90°C / 185-195°F** — "meat should fall from the bone"

### 2. Yotam Ottolenghi — Slow-Cooked Lamb Shanks (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Persian-spiced lamb shanks, braise 160°C 3 hours, rest 20 min.
- **Target**: **85-90°C** — fork-tender

### 3. Jamie Oliver — Slow-Braised Lamb Shanks (Jamie's Ministry of Food)
- **Source**: jamieoliver.com
- **Method**: Sear, root vegetables + red wine + stock, 170°C covered 3-4 hours.
- **Target**: **88-92°C** — "falling off the bone, sauce reduced"

### 4. Leila Lindholm — Bräserade lammlägg (leila.se)
- **Source**: leila.se/recept
- **Method**: Bryn väl (brown well), braise 160°C 3 hours covered.
- **Target**: **85-90°C** at meat

### 5. Fergus Henderson — Braised Lamb Shanks (Beyond Nose to Tail)
- **Source**: Beyond Nose to Tail (Bloomsbury)
- **Method**: Slow braise, 150°C / 300°F for 4 hours.
- **Target**: **82-88°C / 180-190°F** — Henderson prefers slightly lower for
  still-coherent meat structure rather than completely falling apart.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Ramsay / Ottolenghi | 85-90°C / 185-195°F | Fall-off-bone standard |
| Jamie Oliver | 88-92°C | Reduced sauce |
| Leila / Sweden | 85-90°C | Nordic braise |
| Fergus Henderson | 82-88°C | Coherent texture |

**Consensus: 85-90°C / 185-195°F.** Maps to `well_done` in lamb doneness.

## What makes this method special
Braised lamb shank is the definition of comfort food transformed through patience:
a tough, inexpensive cut becomes luxuriously tender through the magic of sustained
moist heat. The braising liquid absorbs the marrow and lamb fat, creating an
extraordinary sauce that no quick-cook method can produce.

## Data applied to cooking_data.py
- `supported_methods` gains: `braise`, `slow_cooker`
- `recommended_doneness`: `"well_done"` (85-90°C collagen conversion target)
