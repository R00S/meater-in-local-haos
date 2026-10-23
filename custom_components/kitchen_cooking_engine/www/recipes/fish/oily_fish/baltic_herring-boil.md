<!-- KCE:CUT_METHOD
type: cut_method
slug: baltic_herring
method: boil
name: Baltic Herring × Boil
category: fish
meat: oily_fish
cut_type: Oily Fish
-->
# Baltic Herring × Boil — Recipe Temperature Research

## Cut profile

Boiling is the documented historical everyday method for salted Baltic herring (salt strömming): the fish was cooked in its own brine-spiked liquid, and the broth was never wasted — often mixed with milk and drunk to the meal, or thickened with barley flour and milk into a *redning* ("smältning"). Root vegetables and potatoes could boil in the same pot, with the salted fish laid on top. The method suits salted rather than fresh fish: the salt firm the flesh so it holds together in liquid, and the cooking liquid becomes sauce and drink. This method was not in the auto-populated `methods:` list for baltic_herring; it is added on the basis of the fetched archival documentation below. The source states no temperatures, durations, or internal pull point; none is inferred.

## Styckesprofil

Kokning är den dokumenterade historiska vardagsmetoden för saltad strömming: fisken koktes i spadet, som aldrig slängdes — ofta blandades mjölk i spadet och drack till maten, eller så gjordes en redning av kornmjöl och mjölk ("smältning"). Rotfrukter och potatis kunde koka i samma kastrull med den salta fisken ovanpå. Metoden passar saltad snarare än färsk fisk: saltet ger köttet konsistens så det håller ihop i vätskan. Metoden fanns inte i den automatiska `methods:`-listan; den läggs till på grundval av det hämtade arkivmaterialet. Källan anger ingen temperatur, tid eller innertemperatur.

## Source recipes

### 1. Matkult.se (Institutet för språk och folkminnen material) — Tillagning: kokt salt fisk
**Inspired by**: https://www.matkult.se/fisk/konservering-och-tillagning.html (fetched 2026-10-23). Swedish food-culture documentation ("Matkult"), with archival recipe titles from the Swedish Women's Educational Association recipe archive (e.g. "Kokt saltströmming med löksås från Ed", "Kokt salt sik från Nordmaling"). Historical practice rather than a quantified modern recipe.
**Serves**: — (method documentation) · **Prep**: salting beforehand (days to months on the barrel) · **Cook**: until cooked; duration not stated

**Ingredients** (as documented)
- Salt fish, usually herring or strömming (*salt fisk, vanligen sill eller strömming*), from the barrel
- Water or the brine-cooking liquid (*spad*)
- Optionally milk, mixed into the broth for drinking
- Root vegetables and/or potatoes, boiled in the same liquid
- For the thickening (*redning / smältning*): barley flour (*kornmjöl*) and milk (or water if milk was scarce); wheat flour in later periods
- Onion sauce (*löksås*), the documented accompaniment in the archived "Kokt saltströmming" recipe title

**Method** (as documented)
1. Salted fish could be eaten raw from the barrel (*spicken*), but was usually boiled (*kokades vanligen fisken*).
2. Boil the fish in liquid; the broth (*spadet*) was always used afterwards — often mixed with milk and drunk with the meal.
3. Potatoes and root-vegetable pieces could boil in the broth; the salted herring or strömming could be laid on top of the potatoes as they boiled.
4. Lift the fish from the broth and make a thickening (*redning, "smältning"*) of barley flour and milk (or water) for the sauce.
5. The source gives no boiling time, liquid temperature, internal temperature, or explicit pull point; do not infer any of them. Serve with the onion sauce noted in the archived recipe title. The source states no final serving temperature.

---

## Temperature consensus

| Source | Stated doneness evidence | Internal/pull temperature |
|---|---|---|
| Matkult.se (SE) | Archival practice: boil salted fish; broth reused; thickening added | Not stated |

One fetched source documents the method as established Swedish national culinary tradition with archived recipe titles ("Kokt saltströmming med löksås från Ed"), but it is method documentation, not a quantified recipe. The 4–6-source, four-tradition gate is not met (Group D only). No temperature range or `recommended_doneness` key can be derived. Boiling is inherently a near-100 °C process, but the source does not state it and no pull target is invented.

## What makes this method special

Boiling salted strömming is a zero-waste one-pot method: the fish seasons the broth, the broth feeds the sauce and the drink, and root vegetables cook alongside. The pre-salting matters — it firms the flesh so the small fish survive immersion disintegration, and it shifts the seasoning into the fish before cooking. Unlike pan-frying or smoking, boiling produces no crust or smoke layer; the payoff is the broth economy and the soft, fully cooked texture suited to the smörgåsbord era's boiled-fish courses.

## Data applied to cooking_data.py

- `supported_methods` gains: `boil` (newly discovered method for baltic_herring — archival Swedish documentation verifies kokt saltströmming practice).
- `recommended_doneness`: no change proposed — no source provides explicit internal-temperature evidence.
- No `method_temperature_ranges` override proposed — no numerical evidence.

## Summary

Boiled salt strömming is the historical everyday preparation: barrel-salted fish simmered with potatoes, its broth reused as sauce and drink, finished with a barley-flour thickening and onion sauce. The archival documentation confirms the method and its cultural logic but carries no measured data, so this leaf adds method coverage, not a temperature recommendation.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched Swedish source (Group D) documents the kokt saltströmming tradition with archived recipe titles but no quantified recipe. The 4–6-source gate is not met. Search the Swedish Women's Educational Association archive recipe texts or modern boiled-salt-herring recipes before drawing analysis conclusions.
