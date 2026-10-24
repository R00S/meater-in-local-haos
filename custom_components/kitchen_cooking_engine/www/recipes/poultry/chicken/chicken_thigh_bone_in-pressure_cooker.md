<!-- KCE:CUT_METHOD
type: cut_method
slug: chicken_thigh_bone_in
method: pressure_cooker
name: Chicken Thigh (Bone-in) × Pressure Cooker
category: poultry
meat: chicken
cut_type: Dark Meat
-->
# Chicken Thigh (Bone-in) × Pressure Cooker — Recipe Temperature Research

## Tree position

| Field | Value |
|-------|-------|
| Category | `poultry` |
| Cut type folder | `chicken/` |
| Cut slug | `chicken_thigh_bone_in` |
| Method slug | `pressure_cooker` |
| File | `chicken_thigh_bone_in-pressure_cooker.md` |
| Full path | `docs/recipe_research/poultry/chicken/chicken_thigh_bone_in-pressure_cooker.md` |

## Cut profile

Pressure cooking collapses the bone-in thigh's long collagen problem into minutes: under
raised pressure the braising liquid boils above 100 °C, and 10 minutes at pressure plus a
release converts the thigh's connective tissue about as effectively as an hour-long simmer.
The fetched Korean source (dakbokkeumtang) sears the chicken first in the pot using its
sauté function, then pressure-cooks small bone-in pieces in a spicy gochujang sauce — the
cut-up bone-in thigh is the canonical choice because pressure cooking shreds boneless meat
and the bone helps pieces hold their shape. A quick release keeps the thighs from
overcooking in residual heat.

This leaf records one fetched Korean source; pressure-cooker bone-in thigh recipes exist in
other traditions (e.g. Indian and Caribbean pressure-cooker chicken), but no second
qualifying recipe was fetched this session, so this is partial research.

## Source recipes

### 1. Korean Bapsang — Pressure Cooker Dak Bokkeumtang (Korean Spicy Chicken Stew)
**Inspired by**: https://www.koreanbapsang.com/pressure-cooker-dakbokkeumtang-korean-spicy-chicken-stew/ (fetched 2026-10-24). Korean Bapsang; Korean tradition (dakbokkeumtang). The page states the dish is made with small, bone-in chicken pieces and names wings, small drumsticks and thighs as suitable choices.

**Serves**: 4 · **Prep**: not stated · **Cook**: 10 min at pressure (+ searing and pressure build) · **Rest**: not stated

**Ingredients**
- 2.5 pounds bone-in chicken parts, cut into small pieces (excess fat removed; thighs named as suitable)
- 6 ounces potatoes, cut in big chunks (or mini potatoes)
- 1/2 medium onion, cut in big chunks
- 2 small carrots, cut in big chunks (or baby carrots)
- 2 scallions or a few stalks of garlic chives
- 1 tablespoon canola or vegetable oil (specified in the method, for searing)

*Sauce*
- 3 tablespoons gochugaru
- 3 tablespoons sugar
- 2 tablespoons gochujang
- 1/2 tablespoon doenjang
- 2 tablespoons rice wine
- 4 tablespoons oyster sauce or soy sauce
- 1 tablespoon minced garlic
- 1 teaspoon grated ginger
- Black pepper, to taste
- 1/4 cup water or chicken broth
- 1 tablespoon sesame oil
- 1 teaspoon sesame seeds

**Method**
1. Combine the sauce ingredients **except** the sesame oil and sesame seeds; mix well.
2. Rinse the chicken, drain, and pat dry with paper towels.
3. Press **Sauté** on the Instant Pot. When hot, add 1 tablespoon canola or vegetable oil. Sear the chicken in two batches.
4. Return all the chicken to the pot. Add the potatoes, onion and carrots. Pour the sauce over everything and mix to coat.
5. Close and seal the lid. Press the **Poultry** function and adjust the time to **10 minutes**. When finished the cooker switches to Keep Warm automatically; turn the pressure valve to **venting** for a **quick release**, then open the lid.
6. Stir in the scallions (or garlic chives), sesame oil and sesame seeds. Optionally remove the meat and vegetables, turn Sauté back on and reduce the sauce with the lid open.

**Probe and endpoint**: the source gives no probe instruction and states no pressure level. **no internal temperature stated** — the endpoint is the programmed 10-minute cook plus quick release.

---

## Temperature consensus

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| Korean (Korean Bapsang, pressure cooker dakbokkeumtang) | Not stated — 10 min at pressure, quick release | Not stated |

One fetched recipe establishes the method and it publishes no internal temperature: the
endpoint is the cooker program plus release mode. Nothing numeric can be concluded about
serving temperature, and nothing is invented. The physics still constrains the outcome: the
sealed pot puts the thighs above boiling in a wet environment, so they finish at least at
simmer temperature throughout, with the quick release chosen precisely to stop carry-on
cooking once the program ends.

## What makes this method special

Pressure raises the braising liquid's boiling point, so a bone-in thigh's collagen converts
in minutes that would take an hour at atmospheric simmer — and the sealed environment means
almost no evaporation, leaving the sauce concentrated only by its own sugars. The sear step
on the sauté function is the only browning the cut gets; everything after it is wet heat.
The quick release matters for dark meat: without it, the residual heat would push the thigh
well past the point of tenderness into mushiness.

## Data applied to cooking_data.py

- `supported_methods` gains: `pressure_cooker` (one fetched, human-created Korean recipe using small bone-in thigh pieces confirms the method).
- `recommended_doneness`: no change proposed — the source states no internal temperature.
- No `method_temperature_ranges` override needed — no measured endpoint exists to override with.

## Summary

Pressure cooking gives bone-in thighs long-braised tenderness in about ten minutes at pressure, with a sear first for flavour and a quick release to protect texture. It is a strong match for the cut's connective tissue, but the result is a sauced stew component rather than a crusty one. One Korean source supports the method; no temperature target can be claimed yet.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched Group A recipe documents pressure cooking small bone-in thigh pieces, with no stated internal temperature. The 4–6-source threshold and tradition-diversity gate are not met.
