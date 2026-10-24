<!-- KCE:CUT_METHOD
type: cut_method
slug: goat_leg
method: grill
name: Goat Leg Roast × Grill
category: game
meat: goat
cut_type: Goat
-->
# Goat Leg × Grill — Recipe Temperature Research

## Tree position

| Field | Value |
|-------|-------|
| Category | `game` |
| Cut type folder | `goat/` |
| Cut slug | `goat_leg` |
| Method slug | `grill` |
| File | `goat_leg-grill.md` |
| Full path | `docs/recipe_research/game/goat/goat_leg-grill.md` |

## Cut profile

Grilling a whole goat leg is the Caribbean answer to the cut: an oil-and-herb marinade worked
into deep slits, hours of indirect charcoal heat with a rosemary-brush baste, then a brief
direct finish for colour. The method treats the leg like a small whole roast — tied to hold
its shape, cooked 2–3 hours at barbecue temperatures (135–150 °C) — and the fat that renders
returns as smoke. The two fetched sources disagree, however, about where the leg is done: the
Caribbean source cooks to tenderness with no stated temperature, while a US source pulls a
butterflied leg at **135–140 °F (57–60 °C) for medium rare** — below the cut file's 63 °C
safe line. That divergence is the leaf's central finding.

## Source recipes

### 1. Succulent Grilled Leg of Goat — Chris De La Rosa / CaribbeanPot.com
**Inspired by**: https://caribbeanpot.com/succulent-grilled-leg-of-goat/ (fetched 2026-10-24). Chris De La Rosa, CaribbeanPot.com; Caribbean tradition. Ingredient line: "3-4 lbs goat (leg)." The page describes tying and grilling the leg but does not state whether it is bone-in.

**Serves**: not stated · **Prep**: marinate overnight or at least 2–3 h · **Cook**: about 2–3 h (this leg ~2.5 h) · **Rest**: advised, duration not stated

**Ingredients**
- 3–4 lbs goat (leg)
- 3/4 cup olive oil
- 4 cloves garlic (diced or crushed)
- 5 sprigs thyme
- 2 tablespoons parsley (chopped)
- 2 tablespoons oregano
- 2 sprigs rosemary (3 sprigs more to make the brush)
- 1 tablespoon dried pepper flakes
- 1 lime (juice)
- 1/2 lime for washing the goat
- 1/2 teaspoon allspice
- 2 teaspoon honey
- 2 scallions (chopped)
- 3/4 cup orange juice
- 3/4 tablespoon salt

**Method**
1. Wash the goat leg with the juice of 1/2 lime and cool water; pat dry.
2. Make slits in the thick parts of the leg. Combine the marinade ingredients, pour over the leg, massage it in, and refrigerate overnight or at least 2–3 hours.
3. Tie the leg with kitchen string to help it maintain its shape. Make a brush from the extra rosemary.
4. Prepare a charcoal fire for 2–3 hours of cooking. Grill the leg over **indirect heat** until cooked and tender, about 2–3 hours — the page says its leg took about 2.5 hours on a grill "at about 275-300 F" (135–150 °C).
5. Stop brushing on the raw marinade when about 30 minutes of cooking time remain.
6. For the last 15 minutes, place the leg **directly over the heat**.
7. Rest before slicing; the page does not specify a duration.

**Probe and endpoint**: no probe step. **no internal temperature stated** — the endpoint is "cooked and tender" by time.

---

### 2. Grilled Leg of Goat — Erin Scott / Yummy Supper
**Inspired by**: http://yummysupper.blogspot.com/2009/10/grilled-leg-of-goat.html (fetched 2026-10-24). Erin Scott, Yummy Supper; US tradition. Ingredient line: "Leg of Goat (or Lamb) 3-4 pounds, butterflied" — the page does not state bone status.

**Serves**: 8 · **Prep**: not stated · **Cook**: not stated (grill stages below) · **Rest**: 15 min

**Ingredients**
- Leg of goat (or lamb), 3–4 pounds, butterflied
- 1/2 cup olive oil
- Juice of 1 1/2 Meyer lemons
- 2 big cloves garlic, chopped
- Fresh oregano, 3 sprigs
- Fresh rosemary, 2–3 sprigs
- Salt and pepper

**Method**
1. Marinate the butterflied leg in the oil, Meyer-lemon juice, garlic and herbs.
2. Heat the grill ("turn outside burners to medium"; no charcoal instruction given).
3. Sear the leg **2½ minutes per side**.
4. Grill **indirectly for 30 minutes**, flip and grill **10 minutes**, flip again and grill **10 minutes**.
5. Remove at **135–140 degrees** for medium rare. Rest **15 minutes**.

**Probe and endpoint**: the source gives a numeric endpoint — **Pull at 57–60°C** (135–140 °F), stated as "medium rare".
Final serving temperature: **57–60°C / 135–140°F** after a 15-minute rest, as stated by the source. **Note: this is below the cut file's 63 °C / 145 °F safe line — recorded as the source's published divergence, not as guidance.**

---

## Temperature consensus

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| Caribbean (CaribbeanPot, indirect charcoal) | "cooked and tender" — 2–3 h, no temperature | Not stated |
| US (Yummy Supper, butterflied leg) | "medium rare" — pulled at 135–140 °F | 57–60 °C / 135–140 °F |

The full observed range across the fetched sources where temperatures are stated is
57–60 °C (135–140 °F), with one source silent and cooking to tenderness (which physically
lands far higher). The divergence is the finding: the US source treats grilled goat leg like
lamb leg — pulled pink and rested to a medium-rare finish below the 63 °C safe line — while
the Caribbean source's 2.5-hour indirect cook is the slow-roast tradition that takes the same
cut to well-done tenderness. The `medium_rare` doneness key (54 °C target) is directly
exercised by the US source; the `well_done` practice of the Caribbean source is unmeasured.
Neither practice should be silently merged: the cook must choose the tradition.

## What makes this method special

Grilling treats goat leg as a whole roast built from fire: indirect charcoal heat renders the
fat and smokes the surface while the interior climbs slowly, and the final direct blast colours
the crust the marinade has been building. The deep slits in the Caribbean source and the
butterflying in the US source are two answers to the same problem — a leg is too thick to cook
evenly over fire without help. What the fire adds over any indoor method is smoke and crust;
what it costs is control, which is why the two sources' doneness philosophies diverge so far.

## Data applied to cooking_data.py

- `supported_methods` gains: `grill` (two fetched, human-created recipes grilling goat leg confirm the method).
- `recommended_doneness`: no change proposed — the two sources express opposite targets (measured 57–60 °C medium-rare vs unmeasured well-done tenderness); no single recommendation is supportable yet.
- `method_temperature_ranges` candidate: if `grill` is added, the measured 57–60 °C practice suggests the `medium_rare` band should remain available for this method; no override committed on 2 sources.

## Summary

Grilling a goat leg gives the cut its best crust and a smoke character no indoor method matches, in both a Caribbean slow-indirect form and an American butterflied medium-rare form. The two traditions disagree fundamentally about doneness — one to tenderness, one to 135–140 °F pink — and that disagreement is real, not noise. It suits the cut well for cooks who manage fire; the temperature record needs more traditions before recommending either target.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** Two fetched recipes (Groups B and C) with full ingredients and methods; the 4–6-source threshold is not met. One source's 135–140 °F endpoint sits below the cut's 63 °C safe line and is recorded as published divergence, not guidance. Method discovered 2026-10-24 and registered in `cooking_data.py`.
