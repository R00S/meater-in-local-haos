<!-- KCE:CUT
type: cut
slug: hake
name: Hake Fillet
name_sv: Kummel
name_da: Kulmulefilet
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- oven_roast
- pan_fry
- pan_sear
- poach
- simmer
- steam
doneness:
- name: medium
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
improvement_potential: 11
cooking_methods_researched: 1 # 2026-10-24: all six declared methods now have leaves built on fetched sources; enum-wide disposition recorded below. Nothing in the fetched set states an internal temperature.
quality_assessed: 2026-10-24
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 2
-->
# Hake Fillet — Cut Overview

## Cut profile

Hake (*Merluccius merluccius*, European hake; *Merluccius capensis/paradoxus*, Cape hake; *Merluccius productus*, Pacific hake) is a slender, elongated fish of the family Merlucciidae. The fillet is cut from the flanks, running from behind the pectoral fins to the tail; the flesh is lean (< 1% fat), firm when raw, and produces large clean flakes when cooked. The lateral muscle is composed of W-shaped myotomes separated by collagen-rich myosepta; this structure gives hake its characteristically large flake and means it separates cleanly at the natural seams when cooked. The flesh is slightly softer than cod raw but firms to a similar texture under heat. It is the dominant food fish of Iberian cuisine (*merluza* in Spanish, *pescada* in Portuguese) and important in Moroccan, West African, and British traditions. Carryover is minimal (2–3 °C); pull at 60–63 °C for moist flakes.

## Styckesprofil

Hake (*Merluccius merluccius*, europeisk hake; *Merluccius capensis/paradoxus*, kapsk hake; *Merluccius productus*, stillahavshake) är en slank, utsträckt fisk av familjen Merlucciidae. Filén är skärd från flankerna och löper från bakom bröstfenorna till stjärten; köttet är magert (< 1% fett), fast rått och ger stora rena fjäll när kokt.

Sidans muskler är sammansatta av W-formade myotomer separerade av kollagenrika myosepta; denna struktur ger hake sin karakteristiska stora fjällning och innebär att den separerar rent vid de naturliga sömmarna när kokt. Köttet är något mjukare än torsk rått men hårdnar till en liknande textur under värme. Det är den dominerande matfisken i iberisk cuisine (*merluza* på spanska, *pescada* på portugisiska) och viktig i marockanska, västafrikanska och brittiska traditioner. Eftertillagning är minimal (2–3 °C); dra vid 60–63 °C för fuktiga fjäll. Innertemperatur: 60–63 °C.

## Research files by cooking method

- [Pan Fry](./hake-pan_fry.md) — rebuilt on three fetched sources (CL, US, UK-Indian); ⚠️ partial.
- [Pan Sear](./hake-pan_sear.md) — three fetched sources (UK, US, ZA); ⚠️ partial.
- [Oven Roast](./hake-oven_roast.md) — one fetched source (MSC/Mitch Tonks sear-and-roast); ⚠️ partial.
- [Poach](./hake-poach.md) — six fetched sources (UK, ZA ×2, IE, PT, FR-ambiguous).
- [Simmer](./hake-simmer.md) — six fetched sources (Basque ×2, EC, ZA, NG, UK-Indian).
- [Steam](./hake-steam.md) — three fetched sources (MSC/Charo Val, StarChefs, Dom in the Kitchen); ⚠️ partial.

All six declared methods now have a leaf. None of the fetched sources in any leaf states an internal temperature: every leaf records time and visual cues only, and no pull temperature has been carried over from anywhere else.

## Method inventory — 2026-10-24 (completed survey)

| Enum method | Disposition |
|---|---|
| pan_fry | leaf, three fetched recipes; five earlier cookbook records removed as unverifiable |
| pan_sear | leaf, three fetched (skin-side sear; one stage-only) |
| oven_roast | leaf, one fetched (sear + 200 °C oven finish) |
| poach | leaf, six fetched (court-bouillon + sauce-poached) |
| simmer | leaf, six fetched (raw-in-sauce and two hybrids) |
| steam | leaf, three fetched (steamer, bamboo, sealed parcel) |
| grill, grill over charcoal, oven_bake, oven_broil | not found as species-specific hake recipes this session — recorded as an unexhausted negative search, not as absence of the method |
| braise, saute, pressure_cooker, slow_cooker, sous_vide, air_fryer, boil | no species-specific hake recipe fetched; left undecided rather than assumed impossible |
| curing / gravlax / salt cod | not enum methods; out of scope |

`cooking_methods_researched: 1` is set on the strength of that disposition, not because every method has been exhausted: the six declared methods each carry fetched evidence, and the uncollected methods are recorded as leads rather than silently dropped.

## Improvement potential

The point for "no temperature evidence" is applied deliberately: the cut's `doneness` block and pull sentence are inherited guidance, not fetched hake evidence, and the 2026-10-24 sweep found no page that states an internal endpoint for this species.

### Improvement priorities

1. Four of six leaves are below the 4–6-source gate; `oven_roast` has a single source. Fetch more species-specific recipes (North African, Latin American, Nordic) rather than adding non-hake "any white fish" pages.
2. Temperature record: no fetched hake source publishes a pull temperature. Either find measured sources or keep the doneness bands marked as inherited.
3. Culinary Group A: look for Indian/Pakistani (e.g. hake/pink perch style), East Asian or Filipino hake recipes as primaries.
4. Culinary Group D: hake is fished throughout the North Atlantic and Baltic; no Danish/Swedish/Polish hake recipe has been fetched yet.
5. Watch item: `hake.md` declares six methods and `cooking_data.py` now registers the same six, so panel and engine agree; keep them in step when a method is added.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
