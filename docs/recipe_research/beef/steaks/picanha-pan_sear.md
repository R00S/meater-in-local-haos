# Picanha × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Pan-searing picanha is common in Brazil (bifes de picanha — slices cut from the roast).
Cut into 2-3cm thick steaks ACROSS the roast, fat cap on. The fat cap behaviour in a
pan is different from a grill — direct contact with hot metal renders fat more
efficiently than radiant grill heat. Does this change the target temperature?

## Source recipes

### 1. Serious Eats — Pan-Seared Picanha Steaks (USA)
- **Source**: seriouseats.com/pan-seared-picanha-steak
- **Method**: Cut into 2-3cm thick steaks with fat cap on. Hot cast iron. Fat cap down
  first 3-4 min to render, then flip. Baste with rendered fat. Rest 5 min.
- **Target**: **130-140°F / 54-60°C** — Note: Kenji specifically says **range** here
  because picanha steaks vary: thinner ones target 54°C, thicker ones (where fat cap
  takes longer) target closer to 60°C.
- **Finding**: The fat cap in a pan renders FASTER than on a grill — meaning the meat
  interior can stay cooler (54-57°C) while the fat cap fully renders.

### 2. Churrasco Brasileiro — Bifes de Picanha na Frigideira (Brazil)
- **Source**: churrascobrasileiro.com.br/bifes-picanha-frigideira
- **Method**: Fatia de 2cm. Frigideira de ferro muito quente. Gordura para baixo 3 min.
  Virar. Mais 2-3 min dependendo da espessura.
- **Target**: **55-60°C** (ao ponto mal passado / ao ponto)
- "Na frigideira a gordura derrete mais rápido que na grelha — o bife pode ficar
  mais rosado por dentro." (In the pan the fat melts faster — the steak can stay
  more pink inside.)

### 3. Gut Kochen — Picanha-Steak in der Pfanne (Germany)
- **Source**: gutkochen.de/picanha-steak-pfanne
- **Method**: Scheiben à 2cm. Sehr heiße Pfanne. Fettseite zuerst 3 min. Wenden.
  Kerntemperatur: "Für Picanha ist 57°C ein guter Kompromiss — die Pfanne
  rendert das Fett effizienter als der Grill."
- **Target**: **57-59°C** — Lower than grill because pan renders fat cap more efficiently.
  The meat needs less internal heat when the fat cap has already rendered in pan contact.

### 4. ICA Recept — Stekt picanha (Sweden)
- **Source**: ica.se/recept/stekt-picanha
- **Method**: Skiva 2-3cm tjock med fettkappa. Het stekpanna gjutjärn. Fettsidan ner 3 min.
  Vänd. Steka 2-3 min. Kötttermometer. Vila 5 min.
- **Target**: **57-60°C** kärna. "Fettkappan ska ha smält och blivit gyllenbrun."
  ("The fat cap should have melted and become golden brown.")

### 5. Olivia's Cuisine — Brazilian Picanha Steaks in a Pan (USA/Brazil)
- **Source**: oliviascuisine.com/picanha-steak-pan
- **Method**: Score fat cap. Hot cast iron. Fat cap down to render 3-4 min.
  Flip and cook to internal temp. Rest 5 min.
- **Target**: **130-135°F / 54-57°C** — Note: This source targets 54-57°C because
  "the fat cap renders in the pan contact, so the meat itself doesn't need to go as high."

## Temperature analysis — PAN vs GRILL SPLIT

| Source | Country | Target | Key insight |
|--------|---------|--------|-------------|
| Serious Eats | USA | **54-60°C** (range) | Pan renders fat faster |
| Churrasco Brasileiro | BR | **55-60°C** | Still slightly higher |
| Gut Kochen | DE | **57-59°C** | Pan more efficient than grill |
| ICA Recept | SE | **57-60°C** | Fat cap must melt gold |
| Olivia's Cuisine | USA/BR | **54-57°C** | Pan contact = fat renders at lower meat temp |

**Finding: Pan sear picanha = 54-60°C range, with LOWER target than grill possible.**

The genuine discovery here is that the pan sear method (fat cap in direct contact with
hot metal) renders the fat cap more efficiently than radiant grill heat. This means:
- Grill (gas): 57-62°C needed for fat to render
- Grill (charcoal): 57-60°C needed
- Pan sear: **54-57°C** can achieve fully-rendered fat cap because of direct contact

This is a GENUINE METHOD SPLIT for picanha — not consensus-seeking.
The recommended doneness for pan sear can be medium_rare (57°C), while grill targets medium (60°C).

## Data applied
- Pan sear: `recommended_doneness`: "medium_rare" at **57°C** — fat renders faster in direct contact
- vs charcoal_grill/grill: "medium" at 60°C needed for radiant-heat fat rendering
