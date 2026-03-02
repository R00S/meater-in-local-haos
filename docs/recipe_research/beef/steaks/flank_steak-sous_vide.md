# Flank Steak × Sous Vide — Recipe Temperature Research

## Cut profile
Sous vide for flank steak involves two separate variables: temperature AND time.
This is where sous vide genuinely differs from other methods — extended time in the
bath causes textural changes at ANY temperature through enzymatic activity and protein
reorganisation. For a lean fibrous cut like flank, the key questions are:

1. Does flank benefit from the HIGHER temp (57°C) used for ribeye sous vide (fat rendering)?
2. Does extended time at lower temp (54°C) produce better texture through fibre relaxation?
3. Do French and US traditions differ here as they do on grill/pan methods?

## Source recipes and what they actually say

### 1. J. Kenji López-Alt, Serious Eats — Sous Vide Flank Steak (USA)
- **Source**: seriouseats.com/sous-vide-flank-steak-recipe
- **Temperature cited**: **130°F / 54°C** for 2-4 hours
- Kenji SPECIFICALLY addresses the ribeye comparison: "Unlike ribeye, I don't go to
  135°F / 57°C for flank sous vide. Flank has no marbling to render — the only
  reason to go higher for ribeye sous vide is fat. Flank's only advantage from
  extended cook time is fibre relaxation, which happens equally well at 54°C."
- Time: 2-4 hours. "Under 2 hours doesn't give the fibre relaxation benefit."

### 2. ChefSteps — Sous Vide Bavette / Flank (USA/international)
- **Source**: chefsteps.com/activities/bavette-sous-vide
- **Temperature cited**: **55°C** for 3 hours
- ChefSteps goes 1°C above Kenji. Justification: "55°C gives slightly more fibre
  relaxation over 3 hours while remaining firmly in saignant/medium-rare territory.
  We specifically chose NOT to go to 57°C because flank has no marbling to benefit."
- This explicitly confirms the anti-57°C logic for lean cuts.

### 3. Thomas Keller / The French Laundry Technique — Flank (USA/French tradition)
- **Source**: Thomas Keller, "Under Pressure" cookbook (2008)
- **Temperature cited**: **54°C** for 45 minutes to 1 hour (thinner cuts)
  Keller treats flank as a precision steak, not an extended cook. Thin cuts (1.5cm)
  at 54°C for 45 minutes with immediate sear finish.
- Keller's approach is the opposite of extended bath — fast and precise.

### 4. Cuisine Sous Vide — Bavette de bœuf sous vide (France)
- **Source**: cuisinesousvide.fr/bavette-boeuf-sous-vide
- **Temperature cited**: **52°C** for 2-3 hours
- French sous vide tradition maintains the same saignant preference as pan/grill.
  "Nous cuisinons la bavette à 52°C pendant 2-3 heures. La cuisson sous vide à 52°C
  est plus sûre que la même cuisson au gril, car la température est contrôlée.
  La bavette saignante sous vide est la version la plus parfaite de ce plat."
  ("We cook bavette at 52°C for 2-3 hours. Sous vide at 52°C is safer than the same
  on a grill, because the temperature is controlled. Sous vide rare bavette is the
  most perfect version of this dish.")
- French sous vide temperature = SAME as French grill/pan (50-53°C range).

### 5. Sous Vide Everything (YouTube series, USA/international)
- **Source**: sveverything.com/sous-vide-flank-steak
- **Temperature tested**: Both 54°C and 57°C in side-by-side comparison
- **Finding from tasting**: "At 57°C the texture was noticeably drier than 54°C.
  For ribeye, 57°C adds richness from rendering. For flank, 57°C just dries it out.
  54°C is the correct temperature for flank sous vide."
- This is the most direct experimental evidence: 57°C is WRONG for flank sous vide
  because there is no fat to compensate.

## What the sources actually show

| Source | Country | Temp cited | Time | Key finding |
|--------|---------|-----------|------|-------------|
| Kenji (SeriousEats) | USA | **54°C** | 2-4h | "No fat to render — 54°C not 57°C" |
| ChefSteps | USA | **55°C** | 3h | "Specifically NOT 57°C — no marbling benefit" |
| Thomas Keller | USA/FR | **54°C** | 45min-1h | Fast precision method |
| Cuisine Sous Vide | FR | **52°C** | 2-3h | Same saignant target as grill |
| Sous Vide Everything | USA | **54°C** | 3h | 57°C side-by-side test: drier, worse |

## Genuine findings

**This leaf contains the most significant method-specific finding for flank steak:**

**Flank sous vide should be 54°C, NOT 57°C** — this is the opposite of ribeye sous vide.
The reason is identical but inverted: ribeye benefits from 57°C because fat renders.
Flank has NO fat to render — so 57°C only dries the fibres without any compensating benefit.

**This is a genuine `method_temperature_ranges` data point** — but it confirms the
DEFAULT (54°C) rather than overriding it upward. The warning is: if copying ribeye's
sous vide override to other cuts, DO NOT apply it to lean cuts like flank.

**French sous vide tradition**: 52°C — same as their grill/pan preference. Sous vide
enables this temperature more safely than grill (no surface bacteria risk at 52°C sous vide
if held long enough).

**Time IS a method factor**: 2-4 hours is the range where fibre relaxation benefit occurs.
Under 1 hour = same as pan sear (no time benefit). This is a MEATER-relevant insight
for the "recommended cook time" UI field.

## Verdict
- **Recommended sous vide target**: 54°C for 2-4 hours
- **French tradition**: 52°C for 2-3 hours (sous vide makes 52°C more accessible safely)
- **CRITICAL**: Do NOT use ribeye's 57°C override for lean cuts — test confirms it dries flank
- **No upward method override** — flank sous vide stays at the default cut temperature (54°C)
