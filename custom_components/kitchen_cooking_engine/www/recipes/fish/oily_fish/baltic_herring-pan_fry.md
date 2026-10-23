<!-- KCE:CUT_METHOD
type: cut_method
slug: baltic_herring
method: pan_fry
name: Baltic Herring × Pan Fry
category: fish
meat: oily_fish
cut_type: Oily Fish
-->
# Baltic Herring × Pan Fry — Recipe Temperature Research

## Cut profile

Pan-frying is the defining stovetop method for Baltic herring (*strömming*, *silakka*): fillets or butterflied "flundror" (pairs of fillets folded around a herb filling) are dredged in coarse rye flour or breadcrumbs and fried quickly in butter. The fish is small (40–80 g whole; fillets cook in 2–4 minutes per side), lean for a herring, and its fine flesh sets fast — the classic failure mode is sticking and tearing rather than drying. Rye-flour dredging (Swedish *rågmjöl*) is the traditional crust: it crisps in butter without the sealing effect of fine breadcrumbs. All fetched sources use time and visual endpoints; none states an internal pull temperature, and none is inferred here.

## Styckesprofil

Pannstekning är den definierande stekmetoden för strömming: filéer eller strömmingsflundror (filépar vikta kring örtfyllning) dredgas i grovt rågmjöl eller ströbröd och steks snabbt i smör. Fisken är liten (40–80 g hel) och magrare än sill; det klassiska misslyckandet är att fisken fastnar och går sönder, inte att den torkar. Rågmjölspanering är traditionell. Alla hämtade källor använder tids- och visuella slutpunkter; ingen anger innertemperatur och ingen sådan härleds.

## Source recipes

### 1. Köket.se — Stekta strömmingsflundror
**Inspired by**: https://www.koket.se/stekta-strommingsflundror (fetched 2026-10-23). Swedish recipe platform (TV4's Köket.se); no individual author named.
**Serves**: 4 · **Prep**: not stated · **Cook**: 3–4 min per side · **Rest**: not stated

**Ingredients**
- 600 g strömmingsfilé (Baltic herring fillets)
- Coarse rye flour (*grovt rågmjöl*), for dredging
- Breadcrumbs (*ströbröd*), for dredging
- Salt
- White pepper
- Butter, for frying

**Method**
1. Mix the breadcrumbs with the coarse rye flour; season with salt and pepper.
2. Dredge the fillets in the mixture.
3. Fry the strömming in butter 3–4 minutes per side. The source gives no internal temperature or explicit pull point; do not infer one from the stated time.
4. Serve with new potatoes or mashed potato. The source states no final serving temperature.

---

### 2. Marthaförbundet (Martha.fi) — Strömmingsflundror
**Inspired by**: https://www.martha.fi/recept/strommingsflundror (fetched 2026-10-23). Finland-Swedish household association Marthaförbundet (Finnish organisation; recipe in Swedish).
**Serves**: not stated (1 kg strömming / 600 g fillet) · **Prep**: not stated · **Cook**: 3–4 min per side (pan) · **Rest**: not stated

**Ingredients**
- 1 kg strömming, or 600 g strömmingsfilé
- 1 dl rågmjöl (rye flour)
- Salt, white or black pepper
- Finely chopped dill and chives, or mint
- Butter

**Method**
1. Lay the fillets skin-side down on buttered or baking paper; season with salt and pepper.
2. Put the filling (mint/chives and dill) on half the fillets, then pair the strömming two and two into "flundror". Dredge them in the coating.
3. Fry in butter in a pan 3–4 minutes per side (the source also gives an oven variant: 225 °C for about 10 minutes). The source gives no internal temperature or explicit pull point; do not infer one.
4. Serve with sour-cream sauce, boiled potatoes and a raw cabbage-and-lingonberry side. The source states no final serving temperature.

---

### 3. Tillmiddag.se — Stekt strömming med potatismos
**Inspired by**: https://tillmiddag.se/recept/stekt-stromming-med-potatismos/ (fetched 2026-10-23). Swedish home-cooking recipe site.
**Serves**: 4 · **Prep**: 20 min · **Cook**: 25 min · **Rest**: not stated

**Ingredients**
- 600 g strömmingsfiléer, skin on
- 1 dl rågmjöl (rye flour, for dredging)
- 1 tsp salt
- ½ tsp white pepper
- 2 tbsp butter (for frying)
- 1 tbsp rapeseed oil (for frying)
- 2 tbsp chopped dill (optional)
- Sides: 1 kg floury potatoes, 2 dl hot milk, 50 g butter, salt, white pepper, nutmeg, 1 dl lingonberry jam, 1 lemon

**Method**
1. Pat the fillets dry with kitchen paper.
2. Mix the rye flour, salt and white pepper on a plate; dredge the fillets, skin side last.
3. Heat butter and oil in a large frying pan. Fry 2–3 minutes per side, starting skin-side down.
4. Scatter dill over at the end and lift to a plate. The source gives no internal temperature or explicit pull point; do not infer one from the stated time. Serve immediately with mash, lingonberry jam and lemon.

---

## Temperature consensus

| Source | Stated doneness evidence | Internal/pull temperature |
|---|---|---|
| Köket.se (SE) | 3–4 min per side in butter | Not stated |
| Marthaförbundet (FI) | 3–4 min per side (or oven 225 °C ~10 min) | Not stated |
| Tillmiddag.se (SE) | 2–3 min per side, skin-side first | Not stated |

The fetched sources give times and visual cues only. No source states an internal or final serving temperature, so no temperature range, doneness band, or `recommended_doneness` key can be derived from this leaf; the earlier version of this leaf's "approximately 63–68 °C at visual doneness" figure was inference, not source data, and has been removed. Tradition coverage: Sweden (2 sources) and Finland-Swedish (1) — two of the three sources share the Swedish national tradition, a documented duplication (Baltic herring cookery is essentially confined to the Baltic region). Culinary Groups A, B and C are not represented.

## What makes this method special

Pan-frying sets the rye-flour crust in butter within minutes while the thin fillet cooks through almost instantly — conductive heat at the skin, no thermal gradient worth measuring. The flundra fold doubles the thickness and protects the filling side, which is why the paired parcels get the longer end of the time range. The method's failure mode is mechanical (sticking, tearing) rather than thermal; the crust, not a probe, is the cook's signal.

## Data applied to cooking_data.py

- `supported_methods`: no change proposed; `pan_fry` is already listed for baltic_herring.
- `recommended_doneness`: no change proposed — no source provides explicit internal-temperature evidence.
- No `method_temperature_ranges` override proposed — collected sources provide times and visual endpoints only.

## Summary

Pan-fried strömming is a two-to-four-minute rye-dredged butter fry where crisp crust and intact fillets matter more than any probe target. The three fetched Nordic sources agree closely on technique and times and none publishes an internal temperature, so this leaf supports method coverage and records the published absences.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** Three fetched sources (SE ×2, FI ×1) document pan-fried strömming; same-tradition duplication is documented above, the 4–6-source four-tradition gate is not met, and no source gives a pull temperature. Continue collection (Estonian/Latvian/Finnish-language sources would add distinct traditions) before drawing analysis conclusions.
