<!-- KCE:CUT
type: cut
slug: plaice
name: Plaice
name_sv: Rödspätta
name_da: Rødspætte
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
- oven_bake
- grill
- smoker
- steam
doneness:
- name: medium
  target_c: 57
  target_f: 135
  min_c: 54
  min_f: 130
  max_c: 60
  max_f: 140
  usda_safe: false
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 68
  max_f: 154
  usda_safe: true
  recommended: true
improvement_potential: 14
cooking_methods_researched: 1
quality_assessed: 2026-05-31
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 1
-->
# Plaice — Cut Overview

## Cut profile

European plaice (*Pleuronectes platessa*, Swedish: rödspätta / spätta, German: Scholle, Danish: rødspætte, Dutch: schol) is a premium flatfish of the family Pleuronectidae and one of the most commercially important and widely consumed fish in Northern Europe, particularly in the UK, Denmark, Germany, and the Netherlands. It is distinguishable by the bright orange-red spots on its dark upper side. Fat content is low (1–2 g per 100 g) and the white flesh is very mild, slightly sweet, and delicate — considered finer than flounder. Plaice is sold whole or as fillets (typically 4 per fish); because the fillets are thin (8–15 mm) cooking time is very short. Pan-frying is the dominant preparation: whole plaice or fillets are coated in flour and pan-fried in butter (*Scholle nach Finkenwerder Art* in Hamburg — the classic German version with bacon and shrimp). Oven-baking is also common. Grilling whole over moderate heat is traditional in Denmark and the Netherlands. Hot smoking whole plaice or large fillets in a stovetop box smoker (*røgekasse*, *abu-röken*) is practised in Scandinavia and Germany. Commercially smoked plaice (*Räucherscholle*) is sold throughout Germany and Scandinavia. Probe placement: insert from the thickest edge into the top fillet, clear of the central bone.

## Styckesprofil

Rödspätta (*Pleuronectes platessa*; tyska: Scholle; danska: rødspætte; holländska: schol) är en premiumplattfisk och ett av de mest konsurmerade fisken i Nordeuropa. Igenkänd på de orange-röda fläckarna på ovansidan. Fetthalten är låg (1–2 g/100 g), köttet vitt, milt och delikat. Pannstekning (mjölpanerad i smör, *Finkenwerder Scholle*) är dominerande beredning. Varmrökning hel i röklåda (*Räucherscholle*) är tradition i Skandinavien och Tyskland. Sond placeras från tjockaste kanten in i överfilén, fri från mittenbenet.

## Research files by cooking method

- Pan Fry — no research file yet
- [Oven Bake](./plaice-oven_bake.md)
- Grill — no research file yet
- Smoker — no research file yet
- [Steam](./plaice-steam.md)

## Improvement potential

Group C and D absent — steam leaf covers A (CN/TH/VN) and B (DE) only. Steam leaf states "Group C and D not separately required for this method" — this is an unverified assumption; points applied. Other method leaves (pan_fry, oven_bake, grill, smoker) are not yet created.

### Improvement priorities

1. Missing method leaf files — create `plaice-pan_fry.md`, `plaice-oven_bake.md`, `plaice-grill.md`, and `plaice-smoker.md`, each with 4–6 diverse source recipes.
2. Missing Culinary Group C tradition — add at least one Group C source recipe across any method leaf.
3. Missing Culinary Group D tradition — add at least one Group D (Scandinavian/Baltic/Slavic) source recipe. Plaice (*rödspätta*) is traditional in Northern European cooking.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*

## Data state and gaps

<!-- ledger-state: leaves=2 sources=8 silent=0 silent_leaves=0 methods=oven_bake,steam -->

State on 2026-10-26: two leaves (steam, oven_bake), eight source records, four of them naming an internal
temperature, all of them Nordic. The cut declares five methods and has data for two.

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `hub_method_without_leaf:grill` | open | hub declares `grill`; no `plaice-grill.md` exists | M | plaice is grilled whole in Sweden and Denmark; four records with a probe would close it |
| `hub_method_without_leaf:pan_fry` | open | hub declares `pan_fry`; no leaf. This is the classic treatment (breaded, in butter) and the corpus clearly has material | S | likely the cheapest leaf in the cut: `panerad rödspätta` is a standard Swedish and Danish dish |
| `hub_method_without_leaf:smoker` | open | hub declares `smoker`; no leaf, and no plaice-smoking record was found this pass | M | uncertain; flatfish smoking may not exist as a tradition, which would make this a searched-negative rather than a leaf |
| `duplicate_tradition` (oven_bake) | open | `plaice-oven_bake.md` - four of four records Nordic (SE x3, DK x1) | S | a German *Scholle*, Dutch *schol* or British plaice record with a temperature |
| `well_done_unsupported` | open | hub recommends `well_done` (63 °C); every record in the oven_bake leaf tops out at 52 °C, and Tasteline's house rule is 50-52 °C | M | a doneness decision for flatfish generally, not just plaice: nothing in this cut evidences 63 °C |
| `leaf_without_any_temperature` (steam) | unverified this pass | `plaice-steam.md` was not re-read in this pass; it was not part of the research here | S | read it and record its state, or leave the gap open knowingly |
