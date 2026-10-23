<!-- KCE:CUT_METHOD
type: cut_method
slug: baltic_herring
method: smoker
name: Baltic Herring × Smoker
category: fish
meat: oily_fish
cut_type: Oily Fish
-->
# Baltic Herring × Smoker — Recipe Temperature Research

## Cut profile

Smoking Baltic herring (strömming) has its own Swedish name: the product is *böckling* (hot-smoked strömming or herring; the word is borrowed from Dutch, "little buck"). Larger strömming are the traditional choice for smoking — small summer fish are fried instead. Smoking here is primarily a flavour and preservation method: Swedish food-culture documentation records cold smoking at about 20 °C for 8–10 days (the oldest method) and hot smoking at 75–85 °C for a few hours, in both cases combined with salting or drying. Hot smoking coagulates the protein and gives the fish a cooked character. No fetched source states an internal pull temperature for the fish, and none is inferred here; the smoking-chamber figures above are the sources' own stated process temperatures.

## Styckesprofil

Varmrökt strömming har ett eget svenskt namn: *böckling* (namnet är lånat från nederländska, "liten bock"). Större strömming är det traditionella valet för rökning — små sommarströmmingar steks i stället. Rökningen är framför allt smakförhöjande och konserverande: svensk matkulturdokumentation anger kallrökning vid ca 20 °C i 8–10 dagar (äldsta metoden) och varmrökning vid 75–85 °C under några timmar, i båda fallen kombinerat med saltning eller torkning. Varmrökning koagulerar proteinet och ger fisken kokt karaktär. Ingen hämtad källa anger innertemperatur för fisken; process-temperaturerna ovan är källornas egna angivna rökningstemperaturer.

## Source recipes

### 1. Matkult.se (Institutet för språk och folkminnen material) — Konservering och tillagning: Rökning
**Inspired by**: https://www.matkult.se/fisk/konservering-och-tillagning.html (fetched 2026-10-23). Swedish food-culture documentation site ("Matkult"), with archival photographs credited to Isof (Institute for Language and Folklore); documents historical Swedish fish preservation and cooking methods rather than a single modern recipe.
**Serves**: — (method documentation) · **Prep**: salting/drying first (always combined with smoking) · **Cook**: hot smoke 75–85 °C for a few hours; or cold smoke ~20 °C for 8–10 days

**Ingredients** (as documented)
- Herring or strömming (*sill eller strömming*)
- Salt (smoking was "always combined with salting or drying")
- Wood smoke (traditional setups: Swedish fireplaces in the south; German-style fish smokehouses spread from the late 19th century — the era in which *böckling* arose)

**Method** (as documented)
1. Salt the fish (smoking alone does not preserve; the source states saltning, fermentering or torkning all preceded smoking).
2. For hot smoking (*varmrökning*): smoke at **75–85 °C for a few hours** — the protein coagulates and the fish takes on a cooked character. The source gives no fish internal temperature or explicit pull point; do not infer one from the process temperature.
3. For cold smoking (*kallrökning*): smoke at **about 20 °C for 8–10 days** — the oldest method; preserves with the aid of the preceding salting/drying.
4. The finished hot-smoked product is *böckling* (rökt sill eller strömming). The source states no final serving temperature.

---

### 2. Susanne Jarl / Recepten.se — Strömming (ingredient page)
**Inspired by**: https://www.recepten.se/info/stroemming.html (fetched 2026-10-23). Swedish recipe site written by Susanne Jarl (all recipes authored by the site owner).
**Serves**: — (ingredient guidance) · **Prep**: not stated · **Cook**: not stated

**Ingredients** (as documented)
- Strömming (Baltic herring), whole, fresh

**Method notes** (as documented)
1. The source states strömming "passar bra att steka, lägga in eller röka" (suits frying, pickling or smoking).
2. "Större strömmingar är goda att röka. Rökt strömming kallas böckling" — larger strömming are good for smoking; smoked strömming is called böckling.
3. The source gives no smoking times, temperatures, internal temperature, or explicit pull point; do not infer any of them. It notes a food-safety caveat (dioxins/PCB in self-caught Baltic herring; national dietary advice applies).

---

## Temperature consensus

| Source | Stated process evidence | Internal/pull temperature |
|---|---|---|
| Matkult.se (SE) | Hot smoke 75–85 °C, a few hours; cold smoke ~20 °C, 8–10 days; always with salting/drying | Not stated |
| Recepten.se (SE) | Smoking documented as a suitable method; larger fish used; no parameters | Not stated |

The fetched sources document the smoking process temperatures but no fish internal temperature or measured final serving temperature. The75–85 °C hot-smoke chamber figure is a process setting, not a pull target, and must not be converted into one. Both sources are Swedish; the 4–6-source, four-tradition gate is not met (Groups A, B, C absent). The previous version of this leaf asserted a "12–20 min, pull at 63 °C" ABU-röken profile summarised from unspecified print literature; that unsourced claim has been removed — the numbers could not be traced to a fetchable source and violated the project's source-integrity rule.

## What makes this method special

Hot smoking cooks and seasons Baltic herring at once: the 75–85 °C chamber is hot enough to coagulate the protein (giving böckling its cooked character) while the smoke deposits the aromatic layer that distinguishes it from plain salted fish. Because smoking was historically combined with salting, the texture is firmer than a bare fry; and because strömming is small and lean, a few hours in hot smoke is enough where salmonid fillets need longer. The method's Nordic specificity is captured by the product having its own name.

## Data applied to cooking_data.py

- `supported_methods`: no change proposed; `smoker` is already listed for baltic_herring.
- `recommended_doneness`: no change proposed — no source provides explicit internal-temperature evidence.
- No `method_temperature_ranges` override proposed — process temperatures only; no numerical doneness evidence.

## Summary

Smoked strömming is böckling: hot-smoked at 75–85 °C over a few hours after salting, it is a cooked, smoke-seasoned product with its own Swedish name. The fetched documentation confirms the method and its process temperatures but publishes no probe target, so this leaf supports method coverage and records the published absences.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** Two fetched Swedish sources (Group D ×2; same-tradition duplication) document smoking of strömming. The 4–6-source, four-tradition gate is not met. A fetchable primary böckling recipe (ingredient quantities, numbered steps) is still needed — the sources above are method/ingredient documentation, not full recipes. Continue collection before drawing analysis conclusions.
