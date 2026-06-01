<!-- KCE:CUT
type: cut
slug: redfish
name: Redfish
name_sv: Uer
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
- pan_sear
- oven_bake
- grill
- smoker
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
quality_score: 14
cooking_methods_researched: 1
quality_assessed: 2026-05-31
rest_time_min: 0
rest_time_max: 3
carryover_temp_c: 2
-->
# Redfish — Cut Overview

## Cut profile

Redfish, also called ocean perch or Norway haddock (*Sebastes norvegicus* / *Sebastes mentella*, Swedish: uer / rödfisk / havskatt, German: Rotbarsch, Norwegian: uer, French: sébaste), is a deep-water rockfish (family Scorpaenidae) found widely in the North Atlantic. It is one of the most commercially important fish in Scandinavia and Germany, sold year-round in fillets at fish counters throughout the region. The flesh is pink to white, moderately firm, mildly flavoured, with a fat content of 3–5 g per 100 g — slightly richer than cod but still lean. Redfish fillets are typically thin (10–20 mm) and cook quickly. The skin is bright red-orange but is usually removed before sale. Pan-frying in butter or oil with a light coating is the classic preparation in Scandinavian and German home cooking. Oven-baking (*Rotbarschfilet im Ofen*) is also very popular in Germany. Hot smoking redfish fillets in a stovetop box smoker (*abu-röken*, *Tischräucherofen*) is a traditional Northern European method. Grilling is suitable for thicker portions. Probe placement: insert into the thickest cross-section of the fillet.

## Styckesprofil

Uer (*Sebastes norvegicus* / *S. mentella*; tyska: Rotbarsch; norska: uer) är en djuphavsfisk utbredd i Nordatlanten och en av de mest kommersiellt viktiga fiskarna i Skandinavien och Tyskland — säljs året runt som filé i fiskkiskar. Köttet är rosa till vitt, måttligt fast och milt smaksatt med fetthalt 3–5 g/100 g. Filén är tunn (10–20 mm) och tillagas snabbt. Pannstekning i smör eller olja med lätt panering är klassisk beredning i skandinaviska och tyska hem. Ugnsbakning (*Rotbarschfilet im Ofen*) är också populärt i Tyskland. Varmrökning i röklåda (abu-röken) är traditionellt. Sond placeras i tjockaste tvärsnittet av filén.

## Research files by cooking method

- [Pan Fry](./redfish-pan_fry.md)
- [Pan Sear](./redfish-pan_sear.md)
- [Oven Bake](./redfish-oven_bake.md)
- [Grill](./redfish-grill.md)
- [Smoker](./redfish-smoker.md)

## Quality score

**Score: 14 / 20** — assessed 2026-05-31

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | — (done: `cooking_methods_researched: 1`) |
| Missing method leaf files (4 of 5 declared: pan_sear, oven_bake, grill, smoker) | −4 |
| Partial leaf files | — (none; pan_fry leaf ✅ CONFORMS TO TOR with 4 sources) |
| Method leaf copies parent cut profile | — (none; pan_fry profile is method-specific) |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | — (covered: DE/AT/AU in redfish-pan_fry.md) |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | — (covered: DK in redfish-pan_fry.md) |

Groups A and C absent — redfish (*Rotbarsch* / *Sebastes*) is an Atlantic/Arctic fish; pan_fry leaf covers Groups B (DE/AT/AU) and D (DK) only. No East Asian, African, Arabic, or Turkish redfish recipe found. Other 4 method leaves not yet created.

### Improvement priorities

1. **−4** · Missing method leaf files — create `redfish-pan_sear.md`, `redfish-oven_bake.md`, `redfish-grill.md`, and `redfish-smoker.md`, each with 4–6 diverse source recipes.
2. **−1** · Missing Culinary Group A tradition — search for redfish in Japanese, Korean, or Chinese cooking (Pacific rockfish / *sebastes* may serve as proxy; note explicitly).
3. **−1** · Missing Culinary Group C tradition — search for redfish in any African, Arabic, Persian, or Caribbean cooking context.

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
