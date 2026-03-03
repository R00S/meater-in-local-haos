# Pork Loin Roast × Oven Roast — Recipe Temperature Research

## Cut profile
Pork loin roast is a large, very lean muscle from the back of the pig (not to be
confused with pork tenderloin, which is a separate, smaller cut). Weighing 1-3 kg /
2-6 lb, it requires moderate oven heat (325-375°F / 163-190°C) for 20-25 minutes
per pound to reach 145°F / 63°C without drying. A fat cap left intact on top bastes
the lean meat throughout the roast. Rest 10-15 minutes after pulling.

## Source recipes

### 1. America's Test Kitchen — Bone-In Pork Roast
- **Source**: americastestkitchen.com / Cook's Illustrated
- **Method**: Season generously, 275°F oven to 140°F internal (~2.5 hours for 3 lb).
  Rest 30 min tented.
- **Target**: **140°F / 60°C** pull; **145°F / 63°C** after rest
- **Note**: ATK's low-and-slow approach for a lean roast prevents the outer layers
  from drying while the centre comes up to temperature.

### 2. Thomas Keller — Rack of Pork / Pork Loin (Ad Hoc at Home)
- **Source**: Ad Hoc at Home (Workman)
- **Method**: Score fat cap, season, brown in oven-safe pan, roast 400°F to 145°F.
  Rest 15-20 min.
- **Target**: **140-145°F / 60-63°C** pull
- **Note**: Keller prefers high heat (400°F) for a caramelised exterior on the fat
  cap — he accepts slightly less even interior gradient as trade-off.

### 3. Leila Lindholm — Helstekt fläskkarré (leila.se)
- **Source**: leila.se/recept
- **Method**: Score fat cap, season with herbs, 200°C oven 25 min per 500g.
- **Target**: **68°C** at centre (Swedish standard for pork loin)
- **Note**: Swedish recipes consistently target 68°C for bone-in or boneless loin
  to provide visual reassurance that the thick roast is safely cooked through.

### 4. Nigel Slater — Slow-Roasted Loin of Pork (Tender)
- **Source**: Tender (Fourth Estate)
- **Method**: Dry overnight (rind exposed), 150°C / 300°F for 3.5-4 hours for 1.5 kg.
  Blast 220°C / 425°F for 30 min for crackling.
- **Target**: **65-70°C** at loin muscle; rind cracks at surface
- **Note**: Slater's long-slow approach produces a very moist loin despite the lean
  muscle — low heat minimises moisture loss per degree of temperature rise.

### 5. Julia Child — Roast Loin of Pork (Mastering the Art of French Cooking)
- **Source**: Mastering the Art of French Cooking (Alfred A. Knopf)
- **Method**: Season, roast 325°F / 165°C for 30 min per pound.
- **Target**: **160-170°F / 71-77°C** (old French standard — slightly above modern USDA)
- **Note**: Child's temperatures reflect pre-2011 USDA guidelines. Modern adapters
  reduce to 145°F/63°C with 3-min rest for a juicier result, consistent with
  current food safety science.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / ATK / USDA | 140-145°F / 60-63°C | Pull early, rest |
| Sweden | 68°C | Standard home guidance |
| UK / Slater | 65-70°C | Long-slow method |
| France / Child (updated) | 63-68°C | Modernised from 71°C |

**Consensus: 63-68°C final serving temp.** Maps to `medium` in pork doneness.

## What makes this method special
Oven roasting a whole pork loin is a festive centrepiece that serves 6-10 people
from a single cut. The fat cap self-bastes throughout the roast, and a crackling
finish transforms the presentation. No other method scales this effectively to a
large-format pork dinner.

## Data applied to cooking_data.py
- `supported_methods` gains: `oven_roast`, `slow_cooker`
- `recommended_doneness`: `"medium"` (63-68°C consensus)
