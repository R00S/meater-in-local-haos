<!-- KCE:CUT_METHOD
type: cut_method
slug: hake
method: pan_sear
name: Hake Fillet × Pan Sear
category: fish
meat: white_fish
cut_type: White Fish
-->
# Hake × Pan Sear — Recipe Temperature Research

## Tree position

| Field | Value |
|-------|-------|
| Category | `fish` |
| Cut type folder | `white_fish/` |
| Cut slug | `hake` |
| Method slug | `pan_sear` |
| File | `hake-pan_sear.md` |
| Full path | `docs/recipe_research/fish/white_fish/hake-pan_sear.md` |

## Cut profile

Pan searing is the single-surface cousin of pan frying, and for hake the distinction is
mechanical rather than semantic: the fish goes into the pan **skin-side down and stays there**,
the skin sets and crisps against the metal, the cook bastes rather than flips repeatedly, and the
thick loin is either finished in the same pan or moved to the oven. That sequence is what the
three fetched sources document. It matters for hake because the flesh is soft enough to tear at
the turn, so one deliberate turn (or none) protects the flake structure; the loin steak cut is
the only hake format thick enough to sear this way without overcooking.

The leaf is thin: three fetched sources, one of which uses the sear only as the first stage of a
stew. None publishes an internal temperature, so no pull temperature is stated.

## Source recipes

### 1. Lemon-Herb Wild Cape Hake Loin Steaks — The Fish Society
**Inspired by**: The Fish Society; https://www.thefishsociety.co.uk/blogs/recipes/lemon-herb-wild-cape-hake-loin-steaks (fetched 2026-10-24). UK seafood retailer recipe using Cape hake (*Merluccius capensis*).

**Serves**: 2 · **Prep**: not stated · **Cook**: 4–6 minutes at the pan plus 25–30 minutes for potatoes · **Rest**: not stated

**Ingredients**
- 2 wild Cape hake loin steaks
- 2 tbsp olive oil; 1 tbsp butter; 2 smashed garlic cloves
- Zest and juice of 1 lemon; 1 tsp fresh thyme (or ½ tsp dried)
- Salt and cracked black pepper; microgreens or chopped parsley
- A handful of baby potatoes

**Method**
1. Preheat the oven to 200 °C (fan 180 °C). Halve the potatoes, toss with oil, salt, pepper and thyme, and roast 25–30 minutes.
2. Pat the hake dry and season both sides with salt, pepper and lemon zest.
3. Heat the olive oil in a non-stick or cast-iron pan over medium-high heat. Add the steaks **skin-side down** and sear 2–3 minutes until golden and crisp.
4. Flip, reduce the heat to medium, add the butter, garlic and thyme and baste as the fish cooks 2–3 more minutes.
5. Add the lemon juice, let it bubble 30 seconds and remove from the heat. Serve with the potatoes and pan butter.

**Probe and endpoint**: no probe step and no internal temperature. Published cues are "golden and crisp" for the skin and a 2–3 minute baste on the second side.

---

### 2. Pan-Roasted Hake — Jeremy Sewall and Erin Byers Murray
**Inspired by**: The Splendid Table; https://www.splendidtable.org/story/2014/12/09/pan-roasted-hake (fetched 2026-10-24). New England/US.

**Serves**: 4 · **Prep**: not stated · **Cook**: about 10 minutes · **Rest**: not stated

**Ingredients**
- ¼ cup canola oil
- 4 (7-ounce) hake fillets, skin removed
- 1 tbsp unsalted butter; 3 tbsp freshly squeezed lemon juice
- 1 tsp fresh thyme leaves; kosher salt; freshly ground white pepper

**Method**
1. Preheat the oven to 375 °F.
2. Heat the oil in an oven-safe sauté pan over medium-high heat. Put the hake in **presentation-side down** and cook 2 minutes.
3. Lower the heat, add the butter and let it brown around the fish 3–4 minutes.
4. Remove the pan from the heat, flip the fish, and transfer the pan to the oven; bake 5 minutes.
5. Plate, brush with lemon juice, garnish with thyme and season.

**Probe and endpoint**: no probe step and no internal temperature stated. Note the source uses a **skinless** fillet and calls the pan-contact side the "presentation side", so it documents a single-surface sear without skin.

---

### 3. Hake and Potato Potjie (sear stage) — Georgia East
**Inspired by**: Marine Stewardship Council, *The SA Ocean Cookbook*; https://www.msc.org/what-you-can-do/sustainable-fish-seafood-recipes/recipe/hake-and-potato-potjie-stew (fetched 2026-10-24). South African.

**Serves**: 4 · **Prep**: not stated · **Cook**: sear stage only, then a stew · **Rest**: not stated

**Ingredients**
- 500 g hake fillets, cut into portions; olive oil
- Coarse sea salt, black pepper; 1 tsp paprika
- (Remaining stew ingredients are recorded in [hake-simmer.md](./hake-simmer.md).)

**Method**
1. Drizzle the hake with olive oil and season with salt, pepper and paprika. Set aside.
2. Heat a little olive oil in a heavy-bottomed casserole and **sear the hake skin-side down**. Remove the fish.
3. Continue with the stew base and return the fish for the final 5 minutes.

**Probe and endpoint**: no probe step and no internal temperature stated. This is sear-as-a-stage evidence, not a standalone pan-sear recipe.

---

## Evidence limits

Three fetched sources; only two are standalone sear recipes, and one of those (Splendid Table) is skinless. The third uses the sear as the opening stage of a stew. No source states an internal temperature, so the leaf cannot support a pull temperature for a seared hake loin.

## What makes this method special

A hake loin is thick enough to take a crust, and the skin is the only part of the fillet that can hold one. Sealing the skin side first also stabilises the portion: a seared skin holds the flake structure together through the baste or the oven finish, which is exactly the handling problem that makes plain pan-frying hake delicate. Basting with butter carries heat to the top surface without a second turn, and the oven finish (Splendid Table) solves the thickness problem that a 20 mm fillet does not have but a loin steak does.

## Data applied to cooking_data.py

- `supported_methods` gains `pan_sear`: two standalone sear recipes plus one stage-only source.
- `recommended_doneness`: no change — no fetched source states a temperature.
- No `method_temperature_ranges` override.

## Summary

Pan searing is recorded here as a genuine but thinly evidenced method for hake: skin-side down, sear 2–3 minutes, baste or oven-finish 2–5 minutes. Three fetched sources, none with an internal temperature.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** Three fetched sources, two of them standalone sears; the 4–6-source gate is not met and no source publishes an internal temperature. Registered in `cooking_data.py` on the strength of the fetched evidence, with the gap recorded here rather than filled by inference.
