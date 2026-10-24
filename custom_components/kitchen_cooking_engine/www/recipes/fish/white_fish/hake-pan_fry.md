<!-- KCE:CUT_METHOD
type: cut_method
slug: hake
method: pan_fry
name: Hake Fillet × Pan Fry
category: fish
meat: white_fish
cut_type: White Fish
-->
# Hake × Pan Fry — Recipe Temperature Research

## Tree position

| Field | Value |
|-------|-------|
| Category | `fish` |
| Cut type folder | `white_fish/` |
| Cut slug | `hake` |
| Method slug | `pan_fry` |
| File | `hake-pan_fry.md` |
| Full path | `docs/recipe_research/fish/white_fish/hake-pan_fry.md` |

## Cut profile

Pan frying is the everyday hake method of the Iberian Atlantic, Chile and the British Isles: a
floured or bare fillet goes into moderate fat, cooks undisturbed on the first side so a crust can
form, and is turned once. Hake's softness sets the technique — every fetched source either pats
the fish very dry or dusts it with flour, and every one of them warns against moving it before the
first side has set, because the flesh tears at the seams if it is handled wet. The fillet is thin
(around 20 mm), so the whole cook is 6–8 minutes and the fat is the only buffer against
overcooking.

**Provenance note (2026-10-24).** The previous version of this leaf contained five recipes
attributed to named cookbooks (José Andrés, Rick Stein, Paula Wolfert, Marcella Hazan, Donna Hay)
with MEATER probe steps and pull temperatures of 60–64 °C. None of those records could be tied to
a page or passage that was actually read, and the book attributions could not be verified, so they
were removed under the project's source-integrity rule rather than left in place. What follows is
what could be fetched and read; the leaf is now partial where it previously looked complete.

## Source recipes

### 1. Merluza a la Plancha (Pan-Fried Hake) — Pilar Hernández
**Inspired by**: Chilean Food & Garden; https://www.chileanfoodandgarden.com/sauteed-white-fish/ (fetched 2026-10-24). Chilean; the page names hake (*merluza*) first among the fish that work.

**Serves**: 4 · **Prep**: 5 minutes · **Cook**: 6 minutes · **Rest**: not stated

**Ingredients**
- 4 clean hake fillets (or cod/catfish)
- Oil for the pan; salt and pepper
- Optional *aliño completo* (dried oregano, cumin, cilantro, garlic, pepper and salt)
- Parsley and lemon, to serve

**Method**
1. Heat a non-stick pan over medium heat for 2–3 minutes.
2. Pat the fish thoroughly dry with paper towels and add about 1 tbsp oil to the hot pan.
3. Add the fillets without overlapping and season with salt, pepper and the optional aliño.
4. Cook 3 minutes **without moving**. Turn with a spatula, season and cook 2–3 minutes more, until cooked and easily flaking.
5. Serve immediately, or cover to keep warm; finish with parsley and lemon.

**Probe and endpoint**: no probe step and no internal temperature. Published cue: "until cooked and easily flakes"; the page notes timing depends on thickness.

---

### 2. Fish with Spanish Green Sauce — Hank Shaw
**Inspired by**: Honest Food; https://honest-food.net/spanish-green-sauce-for-fish/ (fetched 2026-10-24). US; the fish list explicitly includes hake.

**Serves**: 4 · **Prep**: not stated · **Cook**: about 10 minutes · **Rest**: not stated (browned fish is held in a 200 °F oven)

**Ingredients**
- 1 lb skinless, boneless fish (cusk, hake or cod)
- Salt and black pepper; flour for dusting
- ¼ cup olive oil, divided
- 1 yellow or white onion, minced; 3 garlic cloves, minced; ¼ tsp cayenne (optional)
- ¾ cup white wine; 1 cup fish or chicken stock
- 1 cup finely minced parsley, fennel fronds, dill, chervil or cilantro; lemon juice

**Method**
1. Salt and pepper the fish. Set a cooling rack over a baking sheet in a 200 °F oven.
2. Cook the onion gently in 1 tbsp oil until golden and translucent, not brown; turn off the heat.
3. Heat the remaining oil in a large sauté pan over medium-high heat. Dust the fish with flour and **fry until browned on both sides, about four minutes per side**. Move the browned fish to the rack in the oven.
4. Add the onion, then the garlic, to the fish pan and cook a minute or two.
5. Add the wine and boil a minute or two; add the stock and boil down a couple of minutes. Season, add the herbs and cayenne, cook 1 minute and turn off the heat.
6. Add pepper and lemon juice, and spoon the sauce over the fish.

**Probe and endpoint**: no probe step and no internal temperature. The 200 °F oven is a holding oven, not a cooking stage; the page's only timing is 4 minutes per side over medium-high heat.

---

### 3. Fresh Hake Curry (fry stage) — Dan Toombs
**Inspired by**: The Curry Guy / Great Curry Recipes; https://greatcurryrecipes.net/2012/04/17/hake-curry/ (fetched 2026-10-24). UK-published Indian-restaurant-style recipe.

**Serves**: 4 · **Prep**: not stated · **Cook**: browning stage plus sauce · **Rest**: not stated

**Ingredients**
- 500 g skinless, boneless hake fillets
- 5 tbsp plain flour; 3 tbsp corn oil
- (Full curry ingredients are recorded in [hake-simmer.md](./hake-simmer.md).)

**Method**
1. Cut the hake into 2-inch chunks and dust with flour.
2. Heat the oil in a large frying pan over medium-high heat and **brown the fish in batches on all sides, cooking only about 50%**; remove.
3. Finish the fish in the blended sauce, about 2 minutes, until heated through.

**Probe and endpoint**: no probe step and no internal temperature. This is fry-then-sauce evidence: the pan stage is real, but the source deliberately undercooks the fish at this point.

---

## Evidence limits

Three fetched sources, all naming hake explicitly: Chile, US and UK-published Indian-restaurant style. None publishes an internal temperature, and only one gives a per-side time (4 minutes per side); the Chilean source uses 3 + 2–3 minutes and the UK source gives no per-side time at all. The flour-dusting is common to two of three. Three sources do not meet the 4–6-source gate, and the previous leaf's apparent five-source completeness was not real.

## What makes this method special

Pan frying gives hake what poaching cannot: a browned, slightly crisp surface that stands up to lemon and fat-based sauces, in under ten minutes. The flour dust is functional, not decorative — it dries the surface, limits sticking on a soft fillet and gives the crust something to form on. The method's weakness is control: with a 20 mm fillet in a hot pan there is a very short window between "easily flakes" (Chilean cue) and dry, which is precisely why the source that cares about a temperature uses a holding oven instead of a longer pan cook.

## Data applied to cooking_data.py

- `supported_methods`: `pan_fry` was already registered and stays registered; the evidence now behind it is three fetched recipes rather than five unverifiable book records.
- `recommended_doneness`: no change — no fetched source states a temperature.
- No `method_temperature_ranges` override.

## Summary

Pan-fried hake is a short, hot, mostly undisturbed cook in a little fat: dry or flour the fillet, set it down, leave it 3–4 minutes, turn once and finish in 2–3 minutes to a flake cue. Three fetched sources now support it, none with an internal temperature; the five cookbook records that previously supplied pull temperatures were removed because they could not be verified.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** Three fetched, hake-specific sources (CL, US, UK-Indian); the 4–6-source gate is not met. No source publishes an internal temperature, so no pull temperature is stated. Rebuilt 2026-10-24 after five unverifiable cookbook records were removed.
