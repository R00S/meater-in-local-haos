<!-- KCE:CUT
type: cut
slug: ham
name: Ham
name_sv: Skinka
category: pork
meat: pig
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- oven_roast
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: -7
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 15
rest_time_max: 30
carryover_temp_c: 8
-->
# Ham — Cut Overview

## Cut profile

Ham is the hind leg of the pig — the biceps femoris and surrounding muscles of the upper
rear limb — cured with salt, smoke, or both before being sold. Unlike any other pork cut,
ham does not arrive raw: curing transforms it into a shelf-stable product with a firm,
dense texture, a pronounced savoury-sweet flavour, and a characteristic mahogany rind
once cooked. The cut runs from the aitch bone (hip socket) down to and including the shank.

Two primary forms are sold for oven roasting:
- **Fully cooked (ready-to-serve) ham** — already pasteurised during commercial smoking/curing.
  The oven is used solely to heat it through (55–63 °C / 130–145 °F) and caramelise a glaze.
- **Raw/uncooked ham (UK gammon, Nordic julskinka, Filipino fresh ham)** — must reach USDA
  minimum 63 °C / 145 °F; Swedish practice specifies 72 °C / 162 °F for safety.

The bone runs along the centre of the shank end. Probe placement: insert from the thick cut
end (butt end), angle to the geometric centre of the largest lean muscle section, clear of the
central bone. Multiple muscle groups are separated by fat seams — avoid resting the tip in a
fat seam.

Glazing is universal across all traditions: sweet (maple syrup, brown sugar, honey, pineapple
juice, fruit jam) balanced with a tangy counterpoint (mustard, citrus) and warm spice (cloves,
allspice, cinnamon). The glaze is applied in the final 15–45 minutes at elevated heat (200–225 °C)
and basted repeatedly to build a lacquered crust over the scored fat.

## Styckesprofil

Skinka är grisens bakben — *biceps femoris* och omgivande muskler i det övre bakbenet — härdad med salt, rökning eller båda. Till skillnad från alla andra fläsksnitt anländer härdad skinka inte rå: härdning omvandlar den till en hållbar produkt med karakteristisk salt-söt smakprofil.

Tillagningstemperaturer: **68–72 °C** för genomvarm, saftig; **60–65 °C** för varm men fortfarande djupt rosa (tunnare skärning). Eftertillagning: 3–4 °C. Sond in i tjockaste köttmassan, borta från lårbenets kärna. Vila 15 minuter täckt.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| oven_roast | [ham-oven_roast.md](ham-oven_roast.md) | ✅ 4 recipes — SE/JM/UK/AU; 2 explicit pull temps |

## Quality score

**Score: -7 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group A tradition | −1 |
| No temperature research (culinary preferred) | −2 |
| No per-method temp research | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — set `cooking_methods_researched: 1` after confirming no additional methods (slow_cooker, braise) need leaves
2. **−2** · No culinary preferred temp research — two sources gave no explicit pull temp; find a US/Filipino source with explicit temp
3. **−1** · Missing Culinary Group A tradition — add an Culinary Group A tradition source (e.g. Filipino, Vietnamese, Chinese glazed ham)
4. **−1** · Per-method temp research — once all 4 traditions have explicit temps, this resolves

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
