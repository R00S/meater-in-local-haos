# Picanha × Charcoal Grill — Recipe Temperature Research

## Cut profile
Picanha (rump cap / coulotte / sirloin cap) is THE national cut of Brazil — cooked
fat-cap-up on skewers (espeto) over charcoal. The thick fat cap (1-2cm) is kept on
during cooking and either eaten or trimmed after. Portuguese, Brazilian, and Argentine
traditions all use charcoal. Target temperature is slightly higher than lean steaks
because the fat cap needs to render.

## Source recipes

### 1. Churrasco Brasileiro — Picanha na Brasa (Brazil)
- **Source**: churrascobrasileiro.com.br/picanha-brasa
- **THE reference**: Picanha on folded skewers, fat cap out. Charcoal parrilla or
  elevated grill. 15-20 min rotating until fat cap caramelises and interior reaches target.
- **Target**: **55-60°C** (ao ponto mal passado to ao ponto — Brazilian tradition)
- "A picanha precisa do fogo para derreter a capa de gordura — é por isso que é perfeita."

### 2. Serious Eats — Brazilian Picanha on Charcoal (USA/BR)
- **Source**: seriouseats.com/brazilian-picanha-charcoal-grill
- **Method**: Fat cap scored. Folded on skewers or flat on grill, fat-cap side down first.
  Charcoal 250-300°C. Turn frequently.
- **Target**: **130-140°F / 54-60°C** — "The fat cap changes the equation slightly —
  slightly higher temp than pure lean steak to render the fat."

### 3. Asado Connection — Tapa de cuadril a las brasas (Argentina)
- **Source**: asadoconnection.com/tapa-cuadril-brasas
- **Argentine tapa de cuadril**: Similar to picanha. Charcoal, direct. Fat up first,
  then fat down. Score fat. Cook 20-25 min for 800g-1kg piece.
- **Target**: **55-60°C** (jugoso)

### 4. Grillforum — Picanha auf dem Kuhle-Grill (Germany)
- **Source**: grillforum.de/picanha-kohlegrill
- **Method**: Holzkohle. Fettseite zuerst direkt, dann wenden. 250°C. Kerntemperatur messen.
- **Target**: **57-60°C** (medium-rare to medium — Fettdeckel muss rendern)

### 5. Grillkongen — Picanha på kull (Norway)
- **Source**: grillkongen.no/picanha-kull
- **Method**: Kullgrill 250-300°C. Fettsiden ned først for rendering, deretter snu.
  Kjernetemperatur 57-60°C.
- **Target**: **57-60°C** (medium-rare)

## Temperature consensus

| Source | Country | Target | Style |
|--------|---------|--------|-------|
| Churrasco Brasileiro | BR | **55-60°C** | National tradition |
| Serious Eats | USA/BR | 54-60°C | Fat cap rendering noted |
| Asado Connection | AR | **55-60°C** | Tapa de cuadril |
| Grillforum | DE | **57-60°C** | Fat cap rendering |
| Grillkongen | NO | **57-60°C** | Standard |

**Consensus: 57-60°C for charcoal picanha.** The fat cap is the KEY differentiator —
picanha needs slightly higher temperature than lean steaks to allow the fat cap to render
and caramelise. Target: **57-60°C** (medium / upper medium-rare) vs 54-57°C for lean steaks.
This IS a `method_temperature_ranges` override situation: picanha charcoal = 57-60°C recommended.

## Data applied
- `recommended_doneness`: "medium" (60°C) is the Brazilian/Argentine consensus, medium_rare (57°C) acceptable
- Note: cooking_data.py shows `rd=medium` for picanha — this research CONFIRMS that is correct
