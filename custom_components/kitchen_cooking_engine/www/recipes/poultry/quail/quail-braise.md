<!-- KCE:CUT_METHOD
type: cut_method
slug: quail
method: braise
name: Quail × Braise
category: poultry
meat: quail
cut_type: Quail
-->
# Quail × Braise — Recipe Temperature Research

## Cut profile

Quail is a lean white-meat game bird, and unlike collagen-rich cuts it is usually considered poor material for long wet cooking — yet braising is a documented quail method across Mediterranean and European traditions, where the birds are browned first and then gently simmered in wine, stock or vegetables until just tender. The method suits the cut when the goal is infused, saucy flesh rather than crisp skin: the short braise (15–90 minutes depending on wild versus farmed birds) keeps the breast from drying if it is not overdone, and the braising liquid becomes the sauce. This method was not in the auto-populated `methods:` list for quail; it is added on the basis of the fetched sources below. Neither fetched source states an internal pull temperature; none is inferred.

## Styckesprofil

Vaktel är en mager vitmässig spel fågel och anses ofta olämplig för lång våttillagning — men stekning/braisering är dokumenterat i medelhavs- och europeisk tradition, där fåglarna brunas först och sedan sjuds mjukt i vin, buljong eller grönsaker. Metoden passar när målet är smakrik, såsig fågel snarare än krispigt skinn: den korta braisen (15–90 minuter beroende på vild eller tam) skyddar bröstet om den inte överkokas. Metoden fanns inte i den automatiska `methods:`-listan; den läggs till på grundval av de hämtade källorna. Ingen källa anger innertemperatur.

## Source recipes

### 1. Hank Shaw — Greek Braised Quail
**Inspired by**: https://honest-food.net/braised-quail-recipe/ (fetched 2026-10-23). American wild-game author Hank Shaw; adapted from Greek cookbooks including Diane Kochilas' *The Glorious Foods of Greece*.
**Serves**: 4 (4–8 quail) · **Prep**: 15 min · **Cook**: 1 h 30 min (90 min for wild birds)

**Ingredients**
- ¼ cup olive oil
- 4–8 quail
- Salt
- 3 stalks celery, chopped
- 1 large yellow onion, sliced thin
- 1 head garlic, cloves peeled whole
- 2 tsp dried oregano
- 1 cup white wine
- 3 lemons, zest and juice
- 12 oz marinated artichoke hearts
- 12 oz pitted black olives
- 1 tbsp capers (optional)
- 3 tbsp chopped fresh parsley
- Black pepper, to taste

**Method**
1. Cut out the quail backbones (optionally ribs); preheat the oven to 165 °C (325 °F).
2. Heat the olive oil in a lidded Dutch oven; salt the quail and brown them in the oil on both sides, removing to a bowl.
3. Sauté the onion and celery until translucent; return the quail and juices, add the garlic, oregano and wine; let the wine boil 1–3 minutes.
4. Barely cover with water, bring to a simmer, add salt and the lemon zest, cover and braise in the oven 1 hour. The source gives no internal temperature or explicit pull point; do not infer one from the stated time.
5. Add artichokes, olives and capers; if the birds are not yet tender (wild birds may need up to 30 more minutes), cover and continue. Finish with parsley, lemon juice and pepper. The source states no final serving temperature.

---

### 2. Pakus / Directo al Paladar — Codornices guisadas al vino
**Inspired by**: https://www.directoalpaladar.com/recetas-de-carnes-y-aves/codornices-guisadas-al-vino-receta-para-lucirse-triunfar-familia (fetched 2026-10-23). Spanish food media; author "Pakus" (editor senior).
**Serves**: 2 (4 quail) · **Prep**: 15 min · **Cook**: 15 min · **Rest**: 15 min (covered, off heat)

**Ingredients**
- 4 quail
- 2 carrots
- 1 onion
- 250 ml chicken stock
- 1 glass red wine
- 1 bay leaf
- Salt and pepper, to taste
- 3 tbsp extra-virgin olive oil
- 2 garlic cloves
- A good splash of sherry vinegar

**Method**
1. Slice the onion and carrots; clean the quail.
2. Heat the oil in a casserole and brown the quail well on all sides; remove and reserve.
3. In the same oil, sauté the onion, carrot, garlic and bay leaf over high heat until the onion colours; lower the heat, add pepper and a pinch of salt, return the quail, and add the wine.
4. Let the alcohol evaporate, add the stock, and when it boils add the sherry vinegar. Cook uncovered 15 minutes, then cover the casserole, turn off the heat, and rest 15 minutes. The source gives no internal temperature or explicit pull point; do not infer one from the stated time.
5. Serve with rice or traditional chips. The source states no final serving temperature.

---

## Temperature consensus

| Source | Stated doneness evidence | Internal/pull temperature |
|---|---|---|
| Hank Shaw (US, Greek tradition) | 1 h oven braise at 165 °C + up to 30 min; "tender" texture endpoint | Not stated |
| Directo al Paladar (ES) | 15 min simmer + 15 min covered rest | Not stated |

The two fetched sources span Group B (Greek adaptation in a US publication and Spanish tradition). Times diverge wildly (15 min versus 90 min) because one uses farmed birds and one anticipates wild birds — a cut-variant-driven divergence the ToR wants preserved. Neither states an internal or final serving temperature, so no range, doneness band, or `recommended_doneness` key can be derived. The 4–6-source, four-tradition gate is not met.

## What makes this method special

Braising trades quail's crisp skin for deeply seasoned, spoon-tender flesh: the browned surface contributes Maillard compounds to the braising liquid, which reduces into the sauce, while the sub-simmer cooking environment keeps the lean breast from the drying that dry heat risks. The catch is that quail has little collagen to convert, so the tenderisation window is short — overshoot turns the breast mealy, which is why the Spanish source cooks just 15 minutes and rests off heat. The method's value is flavour transport (wine, lemon, olives, soy) into mild flesh.

## Data applied to cooking_data.py

- `supported_methods` gains: `braise` (newly discovered method for quail — two fetched, human-created recipes from distinct traditions verify it).
- `recommended_doneness`: no change proposed — no source provides explicit internal-temperature evidence.
- No `method_temperature_ranges` override proposed — collected sources provide times and texture endpoints only.

## Summary

Braising quail browns the birds, then gently simmers them in wine and aromatics until spoon-tender — a saucy, flavour-infused alternative to dry heat that suits the mild flesh if the short tenderisation window is respected. Two verified sources confirm the method across Greek and Spanish traditions but state no probe targets, so this leaf adds method coverage, not a temperature recommendation.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** Two fetched sources (US/Greek and Spanish, both Group B) document braised quail. The 4–6-source, four-distinct-tradition gate is not met (both sources are Group B; a Group C Moroccan or Group A Chinese red-cooked quail source would strengthen it). Continue collection before drawing analysis conclusions or calling this leaf complete.
