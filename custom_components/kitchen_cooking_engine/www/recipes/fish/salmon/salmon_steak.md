<!-- KCE:CUT
type: cut
slug: salmon_steak
name: Salmon Steak
name_sv: Laxbiff
category: fish
meat: salmon
cut_type: Salmon
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium
methods:
- grill
- oven_bake
- pan_sear
doneness:
- name: medium_rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
- name: medium
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
quality_score: -4
cooking_methods_researched: 2
quality_assessed: 2026-04-27
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 3
-->
# Salmon Steak — Cut Overview

## Cut profile

A salmon steak is a cross-cut through the whole fish, perpendicular to the spine. The
resulting shape is a roughly horseshoe cross-section: the thickest back-flesh section sits
above and around the central backbone, while two belly-flap lobes curve inward below. Skin
is present on all outer edges. Unlike a fillet (side-cut), a salmon steak retains the
central spine bone plus the curved rib bones, which conduct heat toward the interior —
slightly accelerating cooking around the bone compared to the true centre.

The back-flesh section contains the same layered myotome (muscle segment) and myocommata
(connective tissue) structure as a fillet; the cooking temperature targets are identical.
The belly flaps are substantially thinner and will overcook relative to the back section if
the steak is laid flat; experienced cooks either fold and secure the flaps inward or accept
that the flaps will cook to well-done while the back-flesh reaches culinary preferred temperature.

**Temperature targets**:
- **USDA safe minimum**: 63 °C / 145 °F (fully opaque, flaky)
- **Medium** (culinary preferred, recommended): **54 °C / 130 °F** — warm, just-opaque, moist centre
- **Medium-rare**: 49 °C / 120 °F — slightly translucent, jewel-red centre (not USDA safe)

**Probe placement**: Insert from the outer edge of the back-flesh (the thickest section), aiming
toward the geometric centre of the cross-section. Keep the tip at least 1 cm from the central
spine bone, which conducts heat and will give a lagging reading. Never insert from the belly-flap
side — too thin.

## Styckesprofil

En laxbiff är ett tvärssnitt genom hela fisken, vinkelrätt mot ryggraden. Den resulterande formen är ett ungefärligt hästskoformat tvärsnitt: den tjockaste ryggköttsektionen sitter ovanför och runt det centrala ryggradsbendet, medan två magliskelober kurvar inåt nedanför. Skinn finns på alla yttre kanter. Till skillnad från en filé (sidsnitt) behåller en laxbiff det centrala ryggradsbendet plus de böjda revbenen, som leder värme mot insidan — något accelererat tillagning runt benet jämfört med den sanna mitten.

Ryggköttsektionen innehåller samma skiktade myotom- och myokommat-struktur som en filé; tillagningstemperaturmålen är identiska. Magliskorna är väsentligt tunnare och överkokkar relativt ryggavsnittet om biffen läggs platt; erfarna kockar antingen viker och säkrar liskorna inåt eller accepterar att de blir välgenomstkta.

**Temperaturmål**: USDA säkert minimum: 63 °C. Kulinarisk preferens: **54 °C** (varm, precis ogenomskinlig, fuktig mitt). Medium-rare: 49 °C (lätt genomskinlig, inte USDA-säker). Sondplacering: stick in från yttre ryggköttkanten mot tvärsnittets geometriska mitt, minst 1 cm från ryggradsbendet.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| pan_sear | [salmon_steak-pan_sear.md](salmon_steak-pan_sear.md) | ✅ 4 sources (2 Northern + 2 Western); 0 explicit pull temps |
| oven_bake | [salmon_steak-oven_bake.md](salmon_steak-oven_bake.md) | ✅ 4 sources (2 Northern + 2 Western); 1 explicit pull temp (≈ 60 °C) |
| grill | *not yet created* | ⬜ |

## Quality score

**Score: -4 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not fully researched (2 of 3) | −3 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing method leaf file (grill) | −1 |
| Source recipes mostly silent on internal temperature (1 of 8 explicit) | −2 |
| Per-method temp research thin (1 of 2 leaves has explicit pull temp) | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−3** · Add the third method leaf file (grill) — Northern (Swedish gravad/grillad lax) and Western (BBQ) sources should be findable
2. **−2** · Find sources that give explicit thermometer targets — recipe collections that target instrumented home cooks (e.g. ChefSteps, Serious Eats) are more likely to publish them
3. **−2** · Add Eastern (e.g. Japanese teriyaki of a *salmon steak* specifically, not a fillet) and Southern (Mediterranean / Middle Eastern) sources — note that searches show fillet has displaced steak in these traditions, so this gap may be a legitimate "no data" finding rather than a fixable deduction

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
