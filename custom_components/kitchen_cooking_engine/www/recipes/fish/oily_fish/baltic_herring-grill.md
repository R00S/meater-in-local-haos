<!-- KCE:CUT_METHOD
type: cut_method
slug: baltic_herring
method: grill
name: Baltic Herring × Grill
category: fish
meat: oily_fish
cut_type: Oily Fish
-->
# Baltic Herring × Grill — Recipe Temperature Research

## Cut profile

Grilling Baltic herring (strömming) is documented in Swedish food culture as two archival techniques: *glödstekt* — the fish laid directly on glowing embers (sometimes wrapped in newspaper in later times) — and *halstrad*, small fresh fish skewered on a stick over an open fire. Both were outdoor, fishing-trip preparations: freshly caught small fish grilled whole made an immediate meal at the water. The tiny fish (40–80 g) tolerates the intense radiant heat only because the cook time is minutes; the historic methods used no thermometer and no stated endpoint beyond the fish being cooked through. This method was not in the auto-populated `methods:` list for baltic_herring; it is added on the basis of the fetched archival documentation below. No fetched source states an internal pull temperature; none is inferred.

## Styckesprofil

Grillning av strömming dokumenteras i svensk matkultur som två arkivtekniker: *glödstekt* — fisken lades helt enkelt på glöden (i senare tid ibland insvept i tidningspapper) — och *halstrad*, små nyfångade fiskar på pinne över öppen eld. Båda var utomhusberedningar vid fiske: färsk småfisk grillad hel gav en omedelbar måltid vid vattnet. Den lilla fisken (40–80 g) tål den heta strålningen bara för att tiden mäts i minuter; de historiska metoderna använde ingen termometer. Metoden fanns inte i den automatiska `methods:`-listan; den läggs till på grundval av det hämtade arkivmaterialet. Ingen källa anger innertemperatur.

## Source recipes

### 1. Matkult.se (Institutet för språk och folkminnen material) — Glödstekt eller halstrad
**Inspired by**: https://www.matkult.se/fisk/konservering-och-tillagning.html (fetched 2026-10-23). Swedish food-culture documentation ("Matkult"), archival photographs credited to Isof (Institute for Language and Folklore); documents historical Swedish fish cooking. Historical practice rather than a quantified modern recipe.
**Serves**: — (method documentation) · **Prep**: catch cleaning only · **Cook**: minutes over embers/open fire; duration not stated

**Ingredients** (as documented)
- Fresh fish, especially herring or strömming (*särskilt sill och strömming*); small freshly caught fish
- (Later period: newspaper, for wrapping before laying on the embers)

**Method** (as documented)
1. For *glödstekt*: lay the fish directly on the glowing embers (*man la den helt enkelt på glöden*). In later times it could first be rolled in newspaper.
2. For *halstrad*: skewer the freshly caught small fish on a stick over the open fire (*halstrad på en pinne över öppen eld*). Spits (*halster*) became common in the late 19th century; earlier the fire tongs (*eldtången*) served the purpose.
3. Cook until done. The source gives no time, internal temperature, or explicit pull point; do not infer any of them. The stated context is that this was an immediate meal when fishing (*en bra måltid att äta när man var ute och fiskade*).
4. Serve immediately. The source states no final serving temperature.

---

## Temperature consensus

| Source | Stated doneness evidence | Internal/pull temperature |
|---|---|---|
| Matkult.se (SE) | Archival practice: on embers or on a stick over open fire; "until done" | Not stated |

One fetched source documents the method as established Swedish national culinary tradition (an acceptable source type per the Collection ToR), but it is method documentation, not a quantified recipe: no quantities, times, or temperatures. The 4–6-source, four-tradition gate is not met (Group D only). No temperature range or `recommended_doneness` key can be derived.

## What makes this method special

Cooking directly on embers or over an open flame is the most primal heat application for this fish: intense radiant heat sears the skin and cooks the small body in minutes, with smoke from dripping fat contributing flavour that no indoor method reproduces. The technique's elegance is its zero equipment — the fish's own skin is the cooking vessel. The trade-off is total exposure: there is no lid, no cream blanket, and no margin, which is why the archival record pairs it with small, fresh fish cooked and eaten at once.

## Data applied to cooking_data.py

- `supported_methods` gains: `grill` (newly discovered method for baltic_herring — archival Swedish documentation verifies glödstekt/halstrad practice).
- `recommended_doneness`: no change proposed — no source provides explicit internal-temperature evidence.
- No `method_temperature_ranges` override proposed — no numerical evidence.

## Summary

Grilled strömming is the fisherman's preparation: whole small fish straight onto embers or on a stick over open fire, cooked in minutes and eaten immediately. The archival documentation confirms the method's authenticity and cultural role but carries no measured data, so this leaf adds method coverage and a documented tradition, not a temperature recommendation.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched Swedish source (Group D) documents the glödstekt/halstrad tradition. The 4–6-source gate is not met and the source is method documentation rather than a quantified recipe. Search for modern quantified grilled-strömming recipes (e.g. contemporary Swedish outdoor-cooking sources) before drawing analysis conclusions.
