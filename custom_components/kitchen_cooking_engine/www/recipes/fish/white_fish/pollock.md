<!-- KCE:CUT
type: cut
slug: pollock
name: Pollock
name_sv: Sei
name_da: Sej
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
- oven_bake
- air_fryer
- smoker
- grill
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
carryover_temp_c: 2
-->
# Pollock — Cut Overview

## Cut profile

Pollock / saithe (*Pollachius virens*, Swedish: sei / gråsej, German: Seelachs / Köhler, Norwegian: sei, Danish: sej, French: lieu noir) is a large Atlantic cod-family fish (Gadidae) and one of the most commercially important and abundantly sold food fish in Scandinavia and Northern Europe. Despite its Swedish supermarket name *Seelachs* (sea salmon — a marketing term from the German fish trade), pollock is not related to salmon; it is a true cod-family fish. Fat content is very low (1–2 g per 100 g) and the grey-beige flesh whitens on cooking to become mild, slightly firmer than cod, with a slightly stronger flavour. It is frequently sold as frozen fillets throughout Scandinavia and Germany under the name "sej" or "Seelachs" and is one of the cheapest white fish available. Common preparations: pan-frying in butter with a flour/breadcrumb coating, oven-baking, air-frying. Hot smoking pollock fillets or steaks in a box smoker is traditional in Norway and Scotland. In the United States, Alaskan pollock (*Gadus chalcogrammus*, a related species) is the most harvested fish globally — used in fish sticks, fish and chips, and surimi. Probe placement: insert into the thickest cross-section of the fillet.

## Styckesprofil

Sei (*Pollachius virens*; tyska: Seelachs/Köhler; norska/danska: sei/sej; franska: lieu noir) är en stor atlantisk torskfamiljesfisk och en av de mest sålda matfiskarna i Skandinavien och Nordeuropa. Trots det svenska supermarknadsnamnet *Seelachs* (som är en tysk marknadsföringsterm) är sei inte relaterad till lax utan en äkta torskfamiljesfisk. Fetthalt mycket låg (1–2 g/100 g), köttet grå-beige men vitnar vid tillagning, milt smaksatt med lätt fastare textur än torsk. Vanliga beredningar: pannstekning med mjöl-/ströbrödsbeläggning, ugnsbakning, luftfrys. Varmrökning av seifilé i röklåda är tradition i Norge och Skottland. Sond placeras i tjockaste tvärsnittet av filén.

## Research files by cooking method

- Pan Fry — no research file yet
- Oven Bake — no research file yet
- Air Fryer — no research file yet
- Smoker — no research file yet
- [Grill](./pollock-grill.md)

## Improvement potential

| Criterion | Points |
|-----------|----------|
| Cooking methods not researched | — (done: `cooking_methods_researched: 1`) |
| Missing method leaf files (4 of 5 declared: pan_fry, oven_bake, air_fryer, smoker) | −4 |
| Partial leaf files | — (none; grill leaf ✅ CONFORMS TO TOR with 4 sources) |
| Method leaf copies parent cut profile | — (none; grill profile is method-specific) |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | — (covered: GB/DE in pollock-grill.md) |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | — (covered: SE/NO in pollock-grill.md) |

Groups A and C absent — pollock (*sej* / *Pollachius virens*) is a North Atlantic fish; the grill leaf covers Groups B (GB/DE) and D (SE/NO) only. No East Asian or African/Arabic/Turkish pollock recipe found. Other 4 method leaves not yet created.

### Improvement priorities

1. Missing method leaf files — create `pollock-pan_fry.md`, `pollock-oven_bake.md`, `pollock-air_fryer.md`, and `pollock-smoker.md`, each with 4–6 diverse source recipes.
2. Missing Culinary Group A tradition — Alaska pollock (*walleye pollock*) is a major fish in Japan (surimi); search for Japanese preparations using pollock directly.
3. Missing Culinary Group C tradition — search for pollock in any African, Arabic, or Caribbean context.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*

## Data state and gaps

<!-- ledger-state: leaves=1 sources=4 silent=0 silent_leaves=0 methods=grill -->

State on 2026-10-26: one leaf (grill) with four records. The cut declares five methods; four have no leaf.
This pass researched `oven_bake`, verified one recipe and one reference table, and hit four fetch failures,
so no leaf was written - two records do not meet the collection minimum.

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `hub_method_without_leaf:oven_bake` | open, research started | **one verified recipe**: 56kilo.se (Åse) "Saftig ugnsbakad kolja" - 600 g pollock fillet, 0.75 dl salt per litre brined 20-30 min, **170 °C until the core is 46-48 °C, 8-12 minutes**. **One verified reference**: godfisk.nu (citing svenskfisk.se) - white fish "such as cod, pollock and saithe" **about 52 °C**, +4 °C for a whole fish. **Four fetch failures**: hemmakoket.se (snippet 50 °C at 175 °C), sjofolket.se (48-50 °C at 160 °C), ica.se (52 °C at 160 °C, 5-8 min) and alltags-rezepte.de returned no readable recipe body | S | three of the four failed sources already state a number in their search snippet; getting the body from any two of them closes the leaf |
| `hub_method_without_leaf:pan_fry` | open | hub declares `pan_fry`; no leaf | M | pollock is the cheap white fish of northern Europe and pans well; a four-record leaf should be reachable |
| `hub_method_without_leaf:air_fryer` | open | hub declares `air_fryer`; no leaf and no record found | M | this is a modern method with thin published evidence; likely to end as a searched-negative or a two-record leaf |
| `hub_method_without_leaf:smoker` | open | hub declares `smoker`; no leaf | M | smoked pollock/saithe is a Norwegian tradition; not researched this pass |
| `oven_bake_range_conflict` | recorded | the verified recipe pulls at 46-48 °C while the reference table says about 52 °C for this species | S | a real disagreement to settle with two more records rather than by choosing one |
