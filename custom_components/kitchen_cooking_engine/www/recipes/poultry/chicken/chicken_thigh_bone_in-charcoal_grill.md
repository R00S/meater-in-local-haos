<!-- KCE:CUT_METHOD
type: cut_method
slug: chicken_thigh_bone_in
method: grill
name: Chicken Thigh (Bone-in) × Grill — Charcoal Variant
category: poultry
meat: chicken
cut_type: Dark Meat
-->
# Chicken Thigh (Bone-in) × Grill — Charcoal Variant

> **Method classification:** Charcoal is a grill fuel/setup variant, not a distinct `CookingMethod` enum from `grill`. This leaf records charcoal-specific evidence for the existing `grill` method and should not be registered as a separate `charcoal_grill` leaf unless the data model explicitly distinguishes the equipment variant.

## Charcoal source recipes

### 1. Nichole / The Salty Marshmallow — Perfect Grilled Chicken Thighs
**Inspired by**: https://thesaltymarshmallow.com/perfect-grilled-chicken-thighs/ (fetched 2026-10-24). US recipe; ingredient line “2 Pounds Bone in Skin on Chicken Thighs about 8 total.”

**Ingredients**
- 2 lb bone-in, skin-on chicken thighs (about 8)
- 1/4 cup olive oil; juice of 1 lemon; juice of 1 lime; 2 tsp garlic powder; 2 tsp onion powder; 1 tsp salt; 1/2 tsp black pepper; 1 tsp Dijon mustard; 2 tbsp soy sauce; 1/3 cup packed brown sugar

**Method**
1. Mix marinade ingredients, coat thighs, refrigerate 30 minutes to 12 hours, then temper 15–20 minutes while grill heats.
2. For charcoal, arrange briquettes under half the grate for two-zone fire.
3. Sear over lit side 2–3 minutes per side until skin is golden.
4. Move to unlit side and cook covered until internal temperature reaches **165°F**. Rest 5–10 minutes.

### 2. Susie Bulloch / Hey Grill Hey — BBQ Chicken Thighs
**Inspired by**: https://heygrillhey.com/bbq-chicken-thighs/ (fetched 2026-10-24). US barbecue; source explicitly says skin-on, bone-in chicken thighs and uses a charcoal grill in a 350°F two-zone setup.

**Ingredients**
- Bone-in, skin-on chicken thighs; Sweet BBQ Rub; Whiskey Peach BBQ Sauce (three recipe components; full recipes linked separately on the source page)

**Method**
1. Trim excess fat and season thighs with rub.
2. Heat charcoal grill to 350°F for two-zone cooking; cook thighs over indirect heat about 25–30 minutes to 165°F.
3. Add sauce and cook another 5–10 minutes until the source's preferred 175°F, then rest 5 minutes.

### 3. Samira Kazan / Alphafoodie — Perfectly Grilled Bone-In Chicken Thighs
**Inspired by**: https://www.alphafoodie.com/grilled-bone-in-chicken-thighs/ (fetched 2026-10-24). US author; recipe explicitly says bone-in, skin-on thighs and charcoal BBQ; 10–14 minutes over direct heat. The page's temperature language differs between 155–160°F pull with carryover to 165°F and a later instruction to continue to 165°F; retain that conflict as published.

**Method summary**: marinate thighs; prepare charcoal BBQ; grill over direct heat 10–14 minutes, flipping once. Page says remove at 155–160°F/68–71°C for carryover to 165°F/74°C; elsewhere says continue to 165°F.

## Conclusion

Three fetched charcoal recipes directly support bone-in thigh grilling. Charcoal grill changes fuel, smoke and heat-zoning setup, but remains the same cooking method family as `grill`; do not add a duplicate `charcoal_grill` cut-method registration. All sources are US-based, so this variant is an evidence note, not a complete cross-tradition leaf.
