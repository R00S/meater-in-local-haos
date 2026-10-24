<!-- KCE:CUT_METHOD
type: cut_method
slug: mackerel
method: grill
name: Mackerel × Grill — Charcoal Variant
category: fish
meat: oily_fish
cut_type: Oily Fish
-->
# Mackerel × Grill — Charcoal Variant

> **Method classification:** Charcoal is a fuel/setup variant of `grill`, not a separate CookingMethod for this cut. Keep this research with the grill inventory; do not add duplicate charcoal_grill unless product semantics require equipment-specific method classification.

## Source recipes

### 1. Imma / Immaculate Bites — Whole Grilled Mackerel
**Inspired by**: https://www.africanbites.com/whole-grilled-mackerel/ (fetched 2026-10-24). Whole mackerel, 2–3 fish, about 1.5–2 lb each; charcoal-specific instructions.

**Ingredients**
- 2–3 whole mackerel; salt and pepper; 3–4 lemons; 2 tbsp minced garlic; 1–1.5 tbsp minced ginger; 1–2 tsp minced basil; optional 2 tsp or more chicken bouillon powder

**Method**
1. Clean and dry fish, score through bone, season with salt, pepper and lemon; coat in garlic-ginger-basil mixture and marinate 30 minutes to 24 hours.
2. For charcoal grill, open bottom vents, fill about 1/4 full with charcoal and wait until flames die and coals turn white/ashy.
3. Grill in basket about 7 or more minutes per side; check flesh near bone is fully cooked.

**Endpoint**: no internal temperature stated.

### 2. Bon Appétit / Epicurious — Grilled Whole Mackerel with Lemon, Oregano, and Olives
**Inspired by**: https://www.epicurious.com/recipes/food/views/grilled-whole-mackerel-with-lemon-oregano-and-olives-109523 (fetched 2026-10-24). 3 1/4–3 1/2 lb Spanish mackerel or bluefish; this is Spanish mackerel, not species-equivalent Atlantic mackerel.

**Method**
1. Stuff and tie fish with lemon and oregano, oil and season.
2. For charcoal, open bottom vents and light coals; medium-hot is defined as holding a hand 5 inches above the grate for 3–4 seconds.
3. Grill covered only for gas grills, 15 minutes; turn and cook about 15 minutes more until just cooked through.

**Endpoint**: no internal temperature stated.

## Conclusion

Charcoal is explicitly documented as a mackerel-grilling setup by two human-created recipe pages. It is not a new cooking method separate from `grill`; one recipe is African Bites' whole mackerel, and the Epicurious example uses Spanish mackerel. Keep these as grill variants and avoid a duplicate enum registration.
