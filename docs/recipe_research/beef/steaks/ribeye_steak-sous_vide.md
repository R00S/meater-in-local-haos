# Ribeye Steak × Sous Vide — Recipe Temperature Research

## Cut profile
Sous vide immerses the vacuum-sealed steak in a precisely controlled water bath, bringing
the entire cut to the exact bath temperature from edge to edge with no gradient. There is
no carryover from pan or grill, so the probe temperature during the bath IS the final
internal temperature. The steak is finished with a 60-90 second screaming-hot sear to
build crust. This method is uniquely suited to reveal how intramuscular fat renders
differently at each temperature over extended time.

## THE KEY FINDING — WHY SOUS VIDE RIBEYE NEEDS 57°C, NOT 54°C

Pan-searing produces a temperature gradient: the outer layer reaches 70-80°C momentarily
while the centre is rare. Intramuscular fat near the surface renders from that brief
surface heat. Sous vide holds the **entire** steak at the bath temperature for 1-3 hours.
At 54°C (129°F), ribeye's abundant marbling does not render fully over 2 hours — the fat
remains semi-solid, tasting waxy or "unintegrated." At 57°C (135°F), the oleic-acid-rich
marbling softens uniformly and blends with the muscle, creating the buttery, silky texture
ribeye is famous for. Lean steaks (tenderloin, sirloin) do NOT benefit from the higher
temperature and become firmer; ribeye's fat is the insurance against dryness at 57°C.

## Source recipes

### 1. J. Kenji López-Alt — Sous Vide Ribeye (Anova Culinary / Serious Eats)
- **Source**: recipes.anovaculinary.com · souschef.co.uk/blogs/sous-vide-ribeye-steak
- **Bath temperature (medium-rare, standard ribeye)**: 130-133°F / **54-56°C**, 1-2.5 h
- **Bath temperature (RECOMMENDED for highly marbled ribeye)**: 135°F / **57°C**, 1-2.5 h
- **Key quote (paraphrased)**: "For a highly marbled ribeye, I prefer 135°F — the extra
  few degrees allow the fat to render silkier. The fat acts as an insurance policy against
  drying out at this temp, unlike a lean cut."
- **Why**: Fat-rendering science: ribeye marbling begins rendering at ~54°C but the
  transition from waxy to silky occurs between 54-60°C. 57°C hits the sweet spot.

### 2. ChefSteps — Sous Vide Time & Temperature Guide (chefsteps.com)
- **Source**: chefsteps.com/activities/sous-vide-time-and-temperature-guide
- **Medium-rare** (standard): 129-133°F / 54-56°C for 1-3 h
- **Recommended for ribeye specifically**: 135°F / **57°C** to "render fat more
  completely and achieve velvety texture in marbled cuts."
- **Note**: ChefSteps explicitly notes the higher temp recommendation is specific to
  marbled cuts; not for lean steaks.

### 3. Douglas Baldwin — A Practical Guide to Sous Vide Cooking
- **Source**: amazingfoodmadeeasy.com/sous-vide-times-temperatures (Baldwin tables)
- **Rib-eye medium-rare**: 131°F / **55°C** for 1-2.5 h (1-1.5 inch)
- **Note**: Baldwin's tables are based on pathogen reduction science and optimal texture
  research. His 55°C recommendation for rib-eye sits between Kenji's 54°C general and
  57°C marbled-specific.

### 4. Heston Blumenthal — Precision Cooking (The Fat Duck / In Search of Perfection)
- **Source**: blumenthal.restaurant · "In Search of Perfection" (BBC/Bloomsbury)
- **Method**: Blumenthal pioneered sous vide for restaurant use in the UK. For steak
  he recommends 55-58°C bath to achieve what he calls "the window of perfection" where
  myosin has denatured (giving firmness) but actin is still largely intact (retaining
  moisture and tenderness).
- **Target**: 56-58°C / **57°C** for fatty ribeye-type cuts.

### 5. Swedish sous vide guide — Sous vide entrecôte (Tasteline / Mathem)
- **Source**: tasteline.com · mathem.se
- **Method**: Standard Swedish home sous vide. Pre-salt, vacuum seal, sear in smör (butter)
  after bath.
- **Target (medium-rare, Rosa)**: **55-57°C** for 1-2 h — consistent with other
  European sources measuring final serving temp.

## Temperature consensus

| Source | Bath / target temp | Notes |
|--------|--------------------|-------|
| Kenji (standard ribeye) | 54-56°C | Medium-rare |
| Kenji (MARBLED ribeye) | **57°C** | Fat renders silkier — recommended |
| ChefSteps (marbled) | **57°C** | Explicit marbled-cut recommendation |
| Douglas Baldwin | 55°C | Science-based tables |
| Heston Blumenthal | 56-58°C | "Window of perfection" |
| Swedish (tasteline) | 55-57°C | Serving temperature |

**Verdict for ribeye × sous_vide: 57°C (135°F)** — the top of the medium_rare range.
This is the genuine method-specific optimum, 3°C above the pan-sear final temperature.

## What makes sous vide different from every other method
The steak reaches the bath temperature uniformly — zero gradient, no gray band near the
surface. The long hold time (1-3 hours vs. 6-8 minutes pan sear) at precise temperature
allows enzymatic activity and fat rendering to proceed that high-heat methods cannot
replicate. The "insurance" of the fat means marbled cuts can tolerate 57°C without
drying; lean cuts should stay at 54-55°C.

## Data applied to cooking_data.py
- `method_doneness["sous_vide"]` = `"medium_rare"` (the name is still medium_rare)
- `method_temperature_ranges["sous_vide"]` overrides the default to put the TARGET
  at 57°C (the optimal fat-rendering temperature) rather than 54°C, while keeping
  the range and the label "medium_rare" consistent with the other methods.
