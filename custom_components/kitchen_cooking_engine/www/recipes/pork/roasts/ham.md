<!-- KCE:CUT
type: cut
slug: ham
name: Ham
name_sv: Skinka
name_da: Skinke
category: pork
meat: pig
cut_type: Roasts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- oven_roast
- slow_cooker
- braise
doneness:
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
improvement_potential: 17
cooking_methods_researched: 1 # 2026-10-24: survey completed and recorded below — oven_roast, slow_cooker and braise each have a gate-meeting leaf; the remaining enum methods are recorded as uncollected leads.
quality_assessed: 2026-10-24
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
| oven_roast | [ham-oven_roast.md](ham-oven_roast.md) | ✅ 6 recipes — SE/PHT/KR/JM/UK/AU; 4 explicit internal targets |
| slow_cooker | [ham-slow_cooker.md](ham-slow_cooker.md) | ✅ 4 recipes — all UK gammon; 2 explicit internal targets (68 °C, 71 °C) |
| braise | [ham-braise.md](ham-braise.md) | ✅ 5 recipes — UK ×3, DE ×2; no internal temperatures |

All three declared methods now have a leaf and all three meet the 4–6-source gate.

## Method inventory — 2026-10-24 (completed survey)

| Enum method | Disposition |
|---|---|
| oven_roast | leaf, six fetched recipes (Groups A/B/C/D) |
| slow_cooker | leaf, four fetched British gammon recipes |
| braise | leaf, five fetched British/German recipes |
| poach / boil | not distinguished from braise for this cut: the hock-in-liquid recipes fetched for `braise` are simmering preparations, and no ham method separates a poach from a braise in the sources read |
| grill | ham steaks are a different format (slice, not joint); no whole-ham grill recipe fetched — recorded as a lead |
| pressure_cooker, sous_vide, air_fryer, smoker, saute, oven_bake, oven_broil | no species-format recipe fetched this session; recorded as uncollected leads, not as absence |

`cooking_methods_researched: 1` records that every method this cut declares now has fetched
evidence and that the remaining enum methods have been dispositioned. It does not claim the
surveys for `grill`, `pressure_cooker` or `sous_vide` are exhausted.

## Improvement potential

**Improvement potential: 17 / 20** — assessed 2026-10-24 (from-scratch recount; supersedes 8 recorded 2026-04-27, which deducted −8 for an unstarted survey, −1 for missing Group A, −2 for preferred-temperature research and −1 for per-method temperatures — the Group A and per-method gaps are now closed by fetched sources). Self-assessed (HOW_I_INFLATE_CUT_FILES_AND_WHY.md Pattern 4).

| Criterion | Deduction |
|-----------|----------|
| Cooking methods researched (`cooking_methods_researched: 1`, inventory above) | — |
| Missing declared method leaves (0 of 3 missing) | — |
| Leaves below the 4–6-source gate (oven_roast 6, slow_cooker 4, braise 5) | — |
| Culinary group coverage (A Filipino/Korean, B British/Australian, C Jamaican, D Swedish) | — |
| Preferred-temperature evidence (72 °C Swedish, 140 °F Filipino, 135 °F Korean, 55 °C Jamaican) | — |
| Doneness model does not separate fully cooked ham (55–60 °C) from raw/cured ham (63–72 °C) — one 63/71 °C scale serves two different products | −1 |
| `braise` and `slow_cooker` are single-tradition (all British, or British/German) | −1 |
| No fetched source covers a **bone-in raw** gammon in either `slow_cooker` or `braise` | −1 |
| Cut profile anatomy | — (anatomical profile present) |
| Method-file duplication of the parent profile | — (no leaf copies this text) |

### Improvement priorities

1. **−1** · The doneness model is the cut's main structural flaw: a fully cooked 5 kg ham should not be offered the same 71 °C target as a raw gammon joint. Splitting the two would need a cut-level change, not a text edit.
2. **−1** · Fetch non-British slow-cooker and braise sources (US slow-cooker ham, Chinese braised ham/hock, Caribbean) to break the single-tradition base.
3. **−1** · Fetch a bone-in raw gammon recipe for the slow cooker or a braise.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
