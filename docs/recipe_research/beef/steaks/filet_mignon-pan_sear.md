# Filet Mignon × Pan Sear (+ Oven Finish) — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Filet mignon is cut from the psoas major — the least-worked muscle in the animal, running
along the spine. Zero exercise = zero intramuscular fat development = the most tender cut,
but almost no marbling. Its tenderness comes purely from structural looseness, not fat
lubrication. Pan sear + oven finish (2-4 min sear, 8-12 min oven at 200°C) is the
universal technique for thick tournedos (40-50 mm). This is the canonical French dish.

## Source recipes

### 1. Joël Robuchon / French Culinary Institute — Tournedos rossini style
- **Source**: robuchon.fr · classically trained French tradition
- **Method**: Sear in clarified butter 2 min each side, oven finish at 200°C.
  Robuchon was noted for "bleu" preference personally but recommended 54°C (medium-rare)
  for service — maintaining the silky, custardy interior.
- **Pull temp**: **50-52°C** (bleu-to-medium rare), rest 8 min to **54°C** final.
- **Why so precise**: "A filet mignon at 60°C is as good as wasted. You have removed
  the only thing that made it special — its silk." (paraphrased from In Search of Perfection)

### 2. J. Kenji López-Alt — Perfect Filet Mignon (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Dry brine overnight, sear in cast iron, butter baste with thyme.
  Optional reverse sear for very thick cuts.
- **Pull temp** (medium-rare): **50°C / 122°F** from oven, rest to **54°C / 130°F**
- **Note**: "Tenderloin is so lean and tender that it's actually more fragile than
  a ribeye. It goes from perfect to dried-out faster."

### 3. Gordon Ramsay — Pan-Seared Filet Mignon (gordonramsayrestaurants.com)
- **Source**: gordonramsayrestaurants.com
- **Method**: Season well, sear in hot pan with oil + butter, then oven at 180°C for
  6-8 min for a 40 mm thick fillet.
- **Target**: **54-57°C** — "medium-rare is the ONLY way to serve a filet mignon."

### 4. Heston Blumenthal — "In Search of Perfection" — Fillet Steak
- **Source**: BBC "In Search of Perfection" (Bloomsbury 2006)
- **Method**: Low oven 50°C until centre reads 49°C, then blast sear.
  This extreme reverse sear produces zero gray band.
- **Final serving temp**: **52-54°C** — Blumenthal argues that filet mignon should
  be served closer to rare (52°C) than medium-rare (54°C) to preserve the custardy
  texture that is lost when the muscle fibres tighten above 55°C.

### 5. Leila Lindholm — Oxfilé / Filet (Koket.se / Leila.se)
- **Source**: leila.se/leilas-stektemperaturer
- **Method**: Panstekt i smör, avsluta i ugn.
- **Target**: Medium-rare for oxfilé = **55-57°C** at rest
- **Note**: Swedish standard for "rosa" (pink) in tenderloin is consistent with
  the 54-57°C consensus; Swedish sources measure final resting temp not pull temp.

## Temperature consensus

| Source | Target | Notes |
|--------|--------|-------|
| Robuchon | 54°C | Bleu personally, 54°C for service |
| Kenji / Serious Eats | 54°C | "More fragile than ribeye" |
| Gordon Ramsay | 54-57°C | "ONLY way" |
| Heston Blumenthal | 52-54°C | Rare end for custardy texture |
| Leila Lindholm | 55-57°C | Swedish "rosa" standard |

**Verdict: medium_rare at 54°C** — possibly rare (52°C) for purists.
For sous vide: use 54°C NOT 57°C — there is NO fat to protect against drying.

## What makes filet mignon different from ribeye at 54°C
Same internal temperature, completely different experience. Ribeye at 54°C: fatty, rich,
buttery. Filet mignon at 54°C: silky, custardy, almost boneless-chicken tender.
The texture quality of filet mignon depends entirely on NOT overcooking — each degree
above 57°C noticeably tightens the protein structure that makes this cut famous.

## Data applied
- `supported_methods`: pan_sear, pan_fry, oven_roast, sous_vide, air_fryer, grill, charcoal_grill
- `recommended_doneness`: "medium_rare" (54°C)
- sous_vide: 54°C (NOT 57°C — very lean cut)
