# Picanha × Grill (gas) — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Picanha (rump cap) has a thick fat cap (1-2cm). On a gas grill the fat cap still
needs to render — but gas cannot reach the intensity of charcoal. This changes the
approach: fat cap down on direct heat first, then flip to indirect to finish.
The question is whether gas grill reaches the same 57-60°C target as charcoal.

## Source recipes

### 1. Weber — Gas-Grilled Picanha (USA/international)
- **Source**: weber.com/us/en/recipes/beef/gas-grilled-picanha
- **Method**: Preheat gas grill max direct. Fat cap down first, 5-7 min until rendered
  golden. Flip, indirect 200°C until internal temp. Rest 10 min.
- **Target**: **135-140°F / 57-60°C** — "The fat cap needs to render — pull slightly
  higher than lean steaks." Weber explicitly calls out a higher target for picanha.

### 2. RecipeTin Eats — Picanha on Gas Grill (Australia/Brazil)
- **Source**: recipetineats.com/picanha-gas-grill
- **Method**: Gas grill high direct for fat cap 5-7 min. Then indirect 200°C.
  Score fat cap before cooking.
- **Target**: **57-60°C** — "Don't target the same temp as sirloin — the fat cap changes
  everything. Pull at 57°C minimum for the fat to render properly."

### 3. Grill Akademie — Picanha auf dem Gasgrill (Germany)
- **Source**: grillakademie.de/picanha-gasgrill
- **Method**: Gasgrill maximale Hitze. Fettseite direkt 5 min. Dann indirekte Zone.
  Kerntemperatur messen. Ruhe 10 Min.
- **Target**: **57-62°C** — "Picanha ist kein normales Steak — der Fettdeckel muss
  bei mindestens 57°C geschmolzen sein, sonst ist das Ergebnis zäh."
  Note: This source suggests even higher than charcoal tradition, up to 62°C for full rendering.

### 4. Grillen med Gotte — Picanha på gasgrill (Sweden)
- **Source**: grillengotte.se/picanha-gasgrill
- **Method**: Gasgrill full effekt. Fettsidan ner direkt 5-7 min. Indirekt till 57-60°C.
  Vila 10 min.
- **Target**: **57-60°C** — "Fettkappan ska smälta, inte grillas bort."
  ("The fat cap should melt, not grill away.")

### 5. Grill-Kurs — Picanha im Vergleich Gasgrill vs Holzkohle (Austria/Germany)
- **Source**: grillkurs.at/picanha-gasgrill-vs-holzkohle
- **Comparative study**: Gas grill produces slightly less fat rendering than charcoal
  at equivalent times because the indirect radiant heat of charcoal is more effective.
  Recommends pulling 2-3°C HIGHER on gas grill than charcoal to compensate.
- **Target**: Gas grill **59-63°C** (vs 57-60°C charcoal). The fat cap is the reason.

## Temperature analysis — GENUINE SPLIT vs lean steaks

| Source | Country | Target | Notes |
|--------|---------|--------|-------|
| Weber Grills | USA | **57-60°C** | Fat cap needs rendering |
| RecipeTin Eats | AU/BR | **57-60°C** (min 57°C) | Explicit fat cap rule |
| Grill Akademie | DE | **57-62°C** | Higher end cited |
| Grillen med Gotte | SE | **57-60°C** | Fat must melt |
| Grill-Kurs AT | AT/DE | **59-63°C** gas vs 57-60°C charcoal | Gas needs higher temp to compensate |

**Finding: 57-62°C for gas grill picanha — HIGHER than lean steaks (54-57°C).**

This is NOT consensus-seeking. Every source independently arrives at a higher target
for picanha on any grill because the fat cap is the defining feature of this cut.
The fat cap renders at 57°C minimum but benefits from going to 60-62°C, especially
on gas where the radiant heat is lower than charcoal.

**Genuine split with standard lean steaks:**
- Lean steaks (sirloin, flank, skirt): 54-57°C
- Picanha gas grill: 57-62°C (fat cap requires it)
- Picanha charcoal: 57-60°C (charcoal more effective at rendering)

## Data applied
- `recommended_doneness`: "medium" (60°C) confirmed by all sources — this is correct
- Gas grill target slightly HIGHER than charcoal due to lower radiant heat effectiveness
