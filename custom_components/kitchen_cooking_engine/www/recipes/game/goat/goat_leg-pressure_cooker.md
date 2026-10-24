<!-- KCE:CUT_METHOD
type: cut_method
slug: goat_leg
method: pressure_cooker
name: Goat Leg Roast × Pressure Cooker
category: game
meat: goat
cut_type: Goat
-->
# Goat Leg × Pressure Cooker — Recipe Temperature Research

## Tree position

| Field | Value |
|-------|-------|
| Category | `game` |
| Cut type folder | `goat/` |
| Cut slug | `goat_leg` |
| Method slug | `pressure_cooker` |
| File | `goat_leg-pressure_cooker.md` |
| Full path | `docs/recipe_research/game/goat/goat_leg-pressure_cooker.md` |

## Cut profile

Pressure cooking compresses goat leg's multi-hour braise into minutes: browned bone-in leg
pieces go into a sealed pot with curry aromatics and stock, cook 40 minutes at high pressure,
and release naturally — the raised-pressure environment converts collagen as effectively as
2–3 hours of simmering. This is the Caribbean curry-goat tradition's weeknight adaptation and
it fits the cut exactly: goat leg's toughness is a time problem that pressure solves without
drying the meat. The one fetched source uses cubed bone-in goat and states no internal
temperature; the endpoint is the pressure program plus a final reduction.

## Source recipes

### 1. Instant Pot Curry Goat — The Sophisticated Caveman
**Inspired by**: https://www.thesophisticatedcaveman.com/instant-pot-curry-goat/ (fetched 2026-10-24). The Sophisticated Caveman; Caribbean tradition (described as a recreation of a classic Caribbean dish, no country named). Ingredient line: "3 pounds bone-in goat meat cubed."

**Serves**: 6 · **Prep**: not stated · **Cook**: 40 min at pressure (+ natural release, + 5–10 min Sauté); total 1 h 20 min as stated · **Rest**: not stated

**Ingredients**
- 3 pounds bone-in goat meat, cubed
- 1 large onion, diced
- 6 cloves garlic, minced
- 4–5 sprigs fresh thyme
- 1 Scotch bonnet pepper, seeded and minced (optional)
- 3 tablespoons curry powder, divided
- 1 cup chicken stock
- 1 tablespoon tomato paste
- 2 tablespoons coconut oil
- Green onions, sliced (to finish)
- Sea salt
- Black pepper

**Method**
1. Season the goat with 1 tablespoon curry powder, a large pinch of salt and a pinch of black pepper.
2. Use the Instant Pot **Sauté** setting and brown the goat on all sides in the coconut oil, working in batches. Transfer to a plate.
3. Add the onion, pepper and garlic; cook until the onion is tender, about 4–5 minutes.
4. Stir in the tomato paste and the remaining 2 tablespoons curry powder; cook until aromatic and brown, about 2–3 minutes.
5. Pour in the chicken stock and scrape the bottom of the pot. Return the goat and accumulated juices; add the thyme.
6. Lock the lid and cook on **high pressure for 40 minutes**.
7. Allow the pressure to release **naturally** (duration not stated).
8. Remove the lid, switch to **Sauté**, and simmer 5–10 minutes until the liquid has thickened and reduced by about half.
9. Season with salt and pepper to taste and garnish with green onion.

**Probe and endpoint**: no probe step. **no internal temperature stated** — the endpoint is the 40-minute pressure program, natural release, and the reduction stage.

---

## Temperature consensus

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| Caribbean (The Sophisticated Caveman, Instant Pot) | Not stated — 40 min high pressure, natural release | Not stated |

One fetched recipe establishes the method and it states no internal temperature. Nothing
numeric can be concluded and none is invented. The sealed pot bounds the physics as with any
pressure braise: the pieces finish at least at the liquid's elevated boiling point throughout,
and the natural release deliberately avoids the shock of a quick release that would tighten
the lean goat muscle.

## What makes this method special

Pressure is the technological shortcut for goat leg's defining trait: the same collagen that
needs 2–3 hours of simmering melts in about 40 minutes at high pressure, and because the
environment is sealed, the lean meat loses far less moisture than a long open braise would
cost it. The sear-first structure survives the translation from pot to pressure cooker —
fond, aromatics and tomato paste build the sauce before the lid closes. The natural release
matters more for goat than for most meats: a quick release would wring the moisture back out
of the muscle fibres the pressure just relaxed.

## Data applied to cooking_data.py

- `supported_methods` gains: `pressure_cooker` (one fetched, human-created recipe pressure-cooking cubed bone-in goat confirms the method).
- `recommended_doneness`: no change proposed — the source states no internal temperature.
- No `method_temperature_ranges` override needed — no measured endpoint exists to override with.

## Summary

Pressure cooking gives goat-leg pieces braised tenderness in under an hour, with a seared curry sauce built in the same pot. It is a strong structural match for the cut's connective tissue and the clear weeknight form of Caribbean curry goat. One source supports the method; no temperature evidence exists yet.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched Group C recipe documents pressure-cooking cubed bone-in goat; the 4–6-source threshold and tradition-diversity gate are not met and no source states an internal temperature. Method discovered 2026-10-24 and registered in `cooking_data.py`.
