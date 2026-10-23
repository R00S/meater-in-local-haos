<!-- KCE:CUT_METHOD
type: cut_method
slug: grayling
method: smoker
name: Grayling × Smoker
category: fish
meat: white_fish
cut_type: White Fish
-->
# Grayling × Smoker — Recipe Temperature Research

## Cut profile

European grayling (*Thymallus thymallus*, Swedish *harr*, German *Äsche*) is a lean, delicate river salmonid whose low fat content makes it less forgiving in a smoker than trout or salmon, but its small whole-fish size (typically 200–400 g) allows a short hot-smoke session rather than a long cure-and-smoke. Hot smoking on a cedar plank or in a stovetop box smoker (*abu-röken*, *Tischräucherofen*) is documented for grayling in both professional British and Scandinavian practice. The method's value here is aromatic: smoke and wood volatiles season flesh that is mild to begin with, while a short cook protects the moisture the lean flesh lacks reserves to lose. One fetched source states an explicit core temperature; the other collected evidence does not, and no temperature is invented where the source is silent.

## Styckesprofil

Europeisk harr (*Thymallus thymallus*) är en mager, ömtålig flodlaxfisk. Det låga fettinnehållet gör den mindre tålig i röka än öring eller lax, men den lilla storleken (200–400 g) medger en kort varmrökning snarare än en lång saltning. Varmrökning på cederplanka eller i röklåda (*abu-röken*) är dokumenterad både i brittiskt professionellt kök och skandinavisk tradition. Metodens värde är aromatiskt: rök kryddar ett milda kött, och en kort tillagning skyddar den fuktighet det magra köttet saknar reserv för att tappa. En hämtad källa anger uttryckligen en körd temperatur; övriga tiger, och ingen temperatur påhittas där källan tiger.

## Source recipes

### 1. Chef Phil Yeomans / Andrej Cooks Fish — European Grayling Part 1 (cedar plank)
**Inspired by**: https://andrejcooksfish.co.uk/videos/european-grayling/ (fetched 2026-10-23). UK catch-and-cook episode filmed at Season Cookery School, Lainston House, Hampshire; chef and pit master Phil Yeomans.
**Serves**: 2 · **Prep**: filleting plus ember-charring of vegetables · **Cook**: about 5 min in the smoker · **Rest**: not stated

**Ingredients**
- 1 whole grayling
- 250 g butter
- Fresh thyme, quantity not stated
- 1 tbsp pink peppercorns
- 1 tbsp sumac
- 1 tbsp smoked paprika
- A dash of lemon juice
- 2 leeks
- 1 lemon

**Method**
1. Fillet the fish as demonstrated in the video.
2. Char the leeks in the embers, peel and cut them into chunks; slice the lemon and char the slices on the hot grill.
3. Arrange the vegetables on a cedar plank and place it in the smoker until the plank starts developing a light smoke. Season the fish fillet and place it on the cedar plank skin-side down. Insert the probe into the thickest part of the fillet, from the flesh side, avoiding the skin and any thin tapering edge. Smoke at 200–250 °C for about 5 minutes.
4. **Pull at 55 °C** (131 °F) core temperature — the source's stated endpoint for the smoked fillet.
5. Herb butter: combine the butter, thyme, pink peppercorns, sumac, smoked paprika and lemon juice; roll into a sausage and chill until hardened. Slice over the hot fish and melt with hot embers. The source states no final serving temperature after the butter melts.

---

## Temperature consensus

| Source | Stated doneness evidence | Internal/pull temperature |
|---|---|---|
| Chef Phil Yeomans / Andrej Cooks Fish | Smoked on cedar plank at 200–250 °C for about 5 min | Core 55 °C stated |

Only one directly fetched recipe source is available for this method. It supplies an explicit core temperature of 55 °C (131 °F), which sits below the USDA safe internal temperature of 63 °C (145 °F) recorded for fish — a divergence worth recording rather than resolving, since the source is a professional chef's stated endpoint. One source cannot satisfy the required 4–6 recipes from distinct culinary traditions, so no `recommended_doneness` key follows from this leaf alone.

## What makes this method special

Hot smoking on a cedar plank cooks grayling with convective heat and wood smoke simultaneously, so the flesh takes on aromatic compounds while barely exceeding a gentle poach in thermal severity — a 55 °C core keeps the lean, fine-textured flesh moist where a dry-heat method would already risk flaking it dry. Pre-charring the leeks and lemon adds bitter-sweet contrast to the smoke. Because the plank buffers direct heat, the cook window is wider than grilling, but the lean flesh still has little tolerance for overshoot.

## Data applied to cooking_data.py

- `supported_methods`: no change proposed; `smoker` is already listed for grayling.
- `recommended_doneness`: no change proposed — a single source's 55 °C endpoint is insufficient evidence to move the recorded `well_done` recommendation.
- No `method_temperature_ranges` override proposed — one qualitative/one-temperature source is insufficient for a range; revisit if further sources are collected.

## Summary

Smoking grayling on a cedar plank seasons the mild flesh with wood smoke while a short cook keeps it moist — a good match for a lean fish that dries quickly under harsher heat. The one verified professional source pulls at 55 °C, below the recorded safe-temperature line, which makes the method promising for the temperature model but under-evidenced today.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched UK source (Group B) documents cedar-plank hot smoking with an explicit 55 °C core; the 4–6-source, four-distinct-tradition gate is not met. Scandinavian box-smoker (*abu-röken*) practice is referenced in the cut overview but no fetched species-specific recipe with quantities has been located yet. Continue collection before drawing analysis conclusions or calling this leaf complete.
