<!-- KCE:CUT_METHOD
type: cut_method
slug: mackerel
method: air_fryer
name: Mackerel × Air Fryer
category: fish
meat: oily_fish
cut_type: Oily Fish
-->
# Mackerel × Air Fryer — Recipe Temperature Research

## Tree position

| Field | Value |
|-------|-------|
| Category | `fish` |
| Cut type folder | `oily_fish/` |
| Cut slug | `mackerel` |
| Method slug | `air_fryer` |
| File | `mackerel-air_fryer.md` |

## Cut profile

Air-frying mackerel is a modern simplification of the pan-fry: the basket's high-velocity hot
air renders the skin and crisps it without the sticking and splattering that mackerel's very
high fat content causes in a pan. The fetched source is a minimal three-ingredient preparation
(salt, pepper, heat) aimed at a Japanese-style breakfast: skin-on mackerel pieces scored,
seasoned, and air-fried at 400 °F with one flip. The source states no internal temperature;
its endpoint is the 10-minute cook. Modern appliance recipes for this cut are thin on the
ground, so this leaf rests on a single source.

## Source recipes

### 1. 3 Ingredient Mess-Free CRISPY Air Fryer Mackerel — Tiffy / Tiffy Cooks
**Inspired by**: https://tiffycooks.com/crispiest-3-ingredient-air-fryer-mackerel-mess-free/ (fetched 2026-10-24). Tiffy, Tiffy Cooks; the page labels the cuisine "Asian, Japanese" (served as part of a Japanese-style breakfast). 2 skin-on mackerel pieces; the page does not state whole-fish vs fillet, species, or fresh vs frozen.

**Serves**: 2 · **Prep**: not stated · **Cook**: 10 min · **Rest**: not stated

**Ingredients**
- 2 pieces mackerel, skin-on
- Salt and pepper, to taste

**Method**
1. Make several cuts in the skin side of the mackerel.
2. Season both sides with salt and pepper.
3. **Air fry at 400°F for 10 minutes, flipping halfway through.**

**Probe and endpoint**: no probe step. **no internal temperature stated** — the endpoint is the 10-minute timed cook at 400 °F.

---

## Temperature consensus

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| Asian/Japanese-labelled (Tiffy Cooks) | Not stated — 400 °F, 10 min, flip halfway | Not stated |

One fetched recipe establishes the method and it states no internal temperature. Nothing
numeric can be concluded and none is inferred. The single stated appliance temperature
(400 °F / 204 °C basket) is aggressive for fish and consistent with the air fryer's role as a
pan-fry substitute — high surface heat, short time — and the source's flip-halfway instruction
mirrors the pan-fry's two-side structure.

## What makes this method special

The air fryer does for mackerel what it does for chicken skin: concentrates fast-moving hot air
on the surface so the skin renders and crisps while the interior stays moist, with none of the
pan's sticking problems. For this oily cut the practical gain is mess-free cooking — much of
the rendered fat drops into the basket rather than splattering — at the cost of the butter
basting the Swedish pan-fry tradition relies on. The scored skin in the fetched source serves
the same anti-buckling role it does on the grill.

## Data applied to cooking_data.py

- `supported_methods` gains: `air_fryer` (one fetched, human-created recipe air-frying skin-on mackerel pieces confirms the method).
- `recommended_doneness`: no change proposed — the source states no internal temperature.
- No `method_temperature_ranges` override needed — no measured endpoint exists to override with.

## Summary

Air-frying mackerel is the clean, modern stand-in for the pan-fry: high heat, ten minutes, crisp skin, no splatter. It suits the oily cut well for weeknight cooking but loses the basting traditions of stovetop preparations. One source supports the method and no temperature evidence exists yet.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched recipe (page labels it "Asian, Japanese") documents air-frying skin-on mackerel pieces; the 4–6-source threshold and tradition-diversity gate are not met and no source states an internal temperature. The page does not specify the fish's form (whole vs fillet) or state (fresh vs frozen) — recorded as published. Method discovered 2026-10-24 and registered in `cooking_data.py`.
