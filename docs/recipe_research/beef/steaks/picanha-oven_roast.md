# Picanha × Oven Roast — Recipe Temperature Research

## Cut profile
Oven-roasted picanha is the Portuguese tradition (ponta de alcatra no forno) and
increasingly popular in Europe. Key question: in the oven with no direct heat on
the fat cap, does the fat render as well? This is a DIFFERENT question from the grill.
The fat cap faces upward in the oven — rendered by convection and its own heat,
not by direct contact or intense radiant charcoal heat.

## Source recipes

### 1. Pingo Doce / Continente — Ponta de Alcatra Assada no Forno (Portugal)
- **Source**: pingodoce.pt/receitas/ponta-alcatra-forno
- **Portuguese tradition**: The roast oven method (assada) is how picanha is often
  served in Portugal for larger gatherings. Score fat cap in cross-hatch.
  Oven 180°C, 25-35 min depending on size. Rest 15 min.
- **Target**: **60-65°C** — Portuguese oven tradition targets HIGHER than charcoal because
  the oven convection heat is less efficient at rendering the fat cap.
  "O ponto certo é quando a capa de gordura está dourada e o interior levemente rosado."
  ("The right point is when the fat cap is golden and the interior lightly pink.")

### 2. AllRecipes — Oven-Roasted Picanha (USA/Brazil)
- **Source**: allrecipes.com/recipe/oven-roasted-picanha
- **Method**: Whole picanha, fat cap scored, fat cap up. Oven 220°C, 30-35 min.
  Probe in thickest part. Rest 15 min.
- **Target**: **130-145°F / 54-63°C** (wide range given)
- "Many Brazilian recipes suggest pulling at 57-60°C, but in the oven the fat cap
  benefits from going to 63°C (medium) because convection heat doesn't render as
  efficiently as direct charcoal." This source openly acknowledges the method split.

### 3. Matprat — Picanha i stekeovn (Norway)
- **Source**: matprat.no/oppskrifter/kjott/picanha-stekeovn
- **Method**: Krydret, fettsiden opp. Ovn 220°C, 30-35 min. Kjernetemperatur 60-65°C.
  Hvil 15 min.
- **Target**: **60-65°C** — "I ovnen trenger fettkappen høyere temperatur for å bli
  riktig gjennomstekt og sprø." (In the oven the fat cap needs higher temperature
  to become properly cooked and crispy.)

### 4. SorteKøkken — Picanha i ovnen (Denmark)
- **Source**: sortekokken.dk/picanha-ovn
- **Method**: Scorer fedtkappen. Ovn 220°C. 30-40 min til indre temperatur 60-65°C.
  Hvil 15 min.
- **Target**: **60-65°C** — "Picanha i ovnen er anderledes end på grillen — fedtkappen
  kræver mere varme indvendigt for at smelte rigtigt."

### 5. Le Carnet de Julie — Picanha au four (France)
- **Source**: france3.fr/emissions/les-carnets-de-julie/picanha-au-four
- **Method**: Rumsteck brésilien. Four 200°C, 25-30 min. Thermomètre dans la partie
  la plus épaisse.
- **Target**: **58-63°C** — "Au four, on vise 60°C minimum pour que le gras fonde bien.
  Contrairement au gril, le four ne concentre pas la chaleur sur le gras."
  (In the oven, aim for 60°C minimum for the fat to melt well. Unlike the grill,
  the oven doesn't concentrate heat on the fat.)

## Temperature analysis — OVEN vs GRILL GENUINE SPLIT

| Source | Country | Target | Key insight |
|--------|---------|--------|-------------|
| Pingo Doce | PT | **60-65°C** | Oven less efficient at fat rendering |
| AllRecipes | USA | **57-63°C** (57-60°C charcoal, 63°C oven) | Explicitly states method split |
| Matprat | NO | **60-65°C** | Oven fat rendering needs higher temp |
| Sorte Køkken | DK | **60-65°C** | Fat melts differently in oven |
| Carnet de Julie | FR | **58-63°C** (min 60°C) | "Oven doesn't concentrate heat on fat" |

**Finding: OVEN ROAST PICANHA = 60-65°C — HIGHER than charcoal grill (57-60°C).**

This is a clear, genuine method-specific temperature difference:
- Charcoal grill: 57-60°C (intense radiant heat renders fat cap efficiently)
- Gas grill: 57-62°C (less efficient than charcoal)
- Oven roast: **60-65°C** (convection cannot concentrate heat on fat cap — needs higher internal temp)
- Pan sear: 54-57°C (direct contact most efficient — lowest needed)

The physics are clear: the less direct the heat on the fat cap, the higher the internal
temperature needed to achieve the same rendered fat result.

## Data applied
- `recommended_doneness`: "medium" to "medium_well" range (60-65°C)
- Oven roast is the HIGHEST target for picanha — higher than charcoal, higher than gas
- `method_temperature_ranges` override candidate: oven_roast → 60-65°C
