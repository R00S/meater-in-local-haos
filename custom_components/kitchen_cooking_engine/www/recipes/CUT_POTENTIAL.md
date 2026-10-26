# Cut potential queue

<!-- GENERATED FILE - written by measure_cut_potential.py. Do not edit by hand. -->

This is the queue improvement passes work from. It replaces the legacy `quality_score` as the selection signal: that field is frozen, is not read here, and must not be used to choose work.

**Concrete gaps** assert something checkable: two sources of truth disagree, a declared method has no leaf, a leaf declares that no source publishes a temperature. They drive the ranking. **Speculative gaps** (leaf and source shortfalls) are listed but never ranked, because nothing yet shows that anything exists to be found.

## Summary

| Measure | Value |
|---------|-------|
| cuts with a hub file | 187 |
| cuts with at least one concrete gap | 90 |
| cuts with no concrete gap found | 97 |
| cuts carrying an authored ledger | 1 |
| authored ledgers that conflict with the files | 0 |
| hub slugs missing from the registry | 2 |

Hub files with no registry entry: `langoustine`, `whole_salmon`

## Top 20 by potential

| # | Cut | Potential | Concrete gaps | Leaves | Sources | Silent sources |
|---|-----|-----------|---------------|--------|---------|----------------|
| 1 | `arctic_char` | 8 | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:smoker, hub_method_without_leaf:sous_vide | 1 | 4 | 0 |
| 2 | `flounder` | 8 | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker | 1 | 4 | 0 |
| 3 | `gilt_head_bream` | 8 | hub_method_without_leaf:charcoal_grill, hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_sear | 1 | 4 | 0 |
| 4 | `langoustine` | 8 | hub_method_without_leaf:boil, hub_method_without_leaf:oven_roast, hub_without_registry_entry, leaf_without_any_temperature | 1 | 6 | 0 |
| 5 | `monkfish` | 8 | hub_method_without_leaf:braise, hub_method_without_leaf:grill, hub_method_without_leaf:oven_roast, hub_method_without_leaf:pan_sear | 1 | 3 | 0 |
| 6 | `pike` | 8 | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker | 1 | 4 | 0 |
| 7 | `plaice` | 8 | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker | 1 | 4 | 0 |
| 8 | `pollock` | 8 | hub_method_without_leaf:air_fryer, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker | 1 | 4 | 0 |
| 9 | `redfish` | 8 | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_sear, hub_method_without_leaf:smoker | 1 | 4 | 0 |
| 10 | `chicken_thigh` | 7 | hub_method_without_leaf:braise, hub_method_without_leaf:pan_fry, orphan_leaf | 4 | 12 | 0 |
| 11 | `chuck_roast` | 7 | hub_method_without_leaf:oven_roast, hub_method_without_leaf:slow_cooker, orphan_leaf | 2 | 6 | 0 |
| 12 | `lamb_shoulder` | 7 | hub_method_without_leaf:braise, hub_method_without_leaf:slow_cooker, orphan_leaf | 2 | 3 | 0 |
| 13 | `whole_chicken` | 7 | hub_method_without_leaf:air_fryer, hub_method_without_leaf:grill, orphan_leaf | 2 | 4 | 0 |
| 14 | `wild_boar_shoulder` | 7 | hub_method_without_leaf:braise, hub_method_without_leaf:slow_cooker, orphan_leaf | 2 | 3 | 0 |
| 15 | `burbot` | 6 | hub_method_without_leaf:braise, hub_method_without_leaf:oven_bake, hub_method_without_leaf:smoker | 1 | 3 | 0 |
| 16 | `mutton_shoulder_alt` | 6 | hub_method_without_leaf:braise, hub_method_without_leaf:oven_roast, hub_method_without_leaf:slow_cooker | 0 | 0 | 0 |
| 17 | `perch` | 6 | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:smoker | 1 | 4 | 0 |
| 18 | `sole` | 6 | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_sear | 1 | 4 | 0 |
| 19 | `whitefish` | 6 | hub_method_without_leaf:grill, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker | 1 | 4 | 0 |
| 20 | `chicken_thigh_bone_in` | 6 | leaf_without_any_temperature, orphan_leaf | 18 | 52 | 0 |

## Conflicts between authored ledgers and the files

No authored ledger contradicts its files yet.

## Side by side — authored claim vs derived fact

`authored` is what a pass recorded in its `## Data state and gaps` section; `derived` is what the files say now. Empty authored cells have not been worked under the new instructions yet.

| Cut | Tier | Authored snapshot | Derived facts | Concrete gaps |
|-----|------|-------------------|---------------|---------------|
| `arctic_char` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=pan_sear | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:smoker, hub_method_without_leaf:sous_vide |
| `flounder` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=steam | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker |
| `gilt_head_bream` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=steam | hub_method_without_leaf:charcoal_grill, hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_sear |
| `langoustine` | derived only | — | leaves=1, sources=6, silent_sources=0, silent_leaves=1, methods=grill | hub_method_without_leaf:boil, hub_method_without_leaf:oven_roast, hub_without_registry_entry, leaf_without_any_temperature |
| `monkfish` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=sous_vide | hub_method_without_leaf:braise, hub_method_without_leaf:grill, hub_method_without_leaf:oven_roast, hub_method_without_leaf:pan_sear |
| `pike` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=braise | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker |
| `plaice` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=steam | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker |
| `pollock` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=grill | hub_method_without_leaf:air_fryer, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker |
| `redfish` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=pan_fry | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_sear, hub_method_without_leaf:smoker |
| `chicken_thigh` | derived only | — | leaves=4, sources=12, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,smoker | hub_method_without_leaf:braise, hub_method_without_leaf:pan_fry, orphan_leaf |
| `chuck_roast` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=braise,smoker | hub_method_without_leaf:oven_roast, hub_method_without_leaf:slow_cooker, orphan_leaf |
| `lamb_shoulder` | derived only | — | leaves=2, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:braise, hub_method_without_leaf:slow_cooker, orphan_leaf |
| `whole_chicken` | derived only | — | leaves=2, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:air_fryer, hub_method_without_leaf:grill, orphan_leaf |
| `wild_boar_shoulder` | derived only | — | leaves=2, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:braise, hub_method_without_leaf:slow_cooker, orphan_leaf |
| `burbot` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=pan_fry | hub_method_without_leaf:braise, hub_method_without_leaf:oven_bake, hub_method_without_leaf:smoker |
| `chicken_thigh_bone_in` | derived only | — | leaves=18, sources=52, silent_sources=0, silent_leaves=7, methods=air_fryer,boil,braise,charcoal_grill,grill,oven_bake,oven_broil,oven_roast,pan_fry,pan_sear,poach,pressure_cooker,saute,simmer,slow_cooker,smoker,sous_vide,steam | leaf_without_any_temperature, orphan_leaf |
| `ground_moose` | authored+derived | leaves=4, methods=grill,oven_bake,pan_fry,simmer, silent=11, silent_leaves=1, sources=16 | leaves=4, sources=16, silent_sources=11, silent_leaves=1, methods=grill,oven_bake,pan_fry,simmer | leaf_without_any_temperature, recorded_unsafe_source |
| `mackerel` | derived only | — | leaves=18, sources=54, silent_sources=0, silent_leaves=9, methods=air_fryer,boil,braise,charcoal_grill,grill,oven_bake,oven_broil,oven_roast,pan_fry,pan_sear,poach,pressure_cooker,saute,simmer,slow_cooker,smoker,sous_vide,steam | leaf_without_any_temperature, orphan_leaf |
| `mutton_shoulder_alt` | derived only | — | leaves=0, sources=0, silent_sources=0, silent_leaves=0, methods=none | hub_method_without_leaf:braise, hub_method_without_leaf:oven_roast, hub_method_without_leaf:slow_cooker |
| `perch` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=pan_fry | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:smoker |
| `sole` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=pan_fry | hub_method_without_leaf:grill, hub_method_without_leaf:oven_bake, hub_method_without_leaf:pan_sear |
| `whitefish` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_bake | hub_method_without_leaf:grill, hub_method_without_leaf:pan_fry, hub_method_without_leaf:smoker |
| `chicken_breast` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_bake,pan_sear | hub_method_without_leaf:oven_roast, hub_method_without_leaf:sous_vide, hub_registry_method_drift |
| `duck_breast` | derived only | — | leaves=3, sources=6, silent_sources=0, silent_leaves=0, methods=oven_roast,pan_sear,smoker | hub_method_without_leaf:sous_vide, orphan_leaf |
| `haddock` | derived only | — | leaves=3, sources=8, silent_sources=0, silent_leaves=0, methods=oven_roast,pan_fry,smoker | hub_method_without_leaf:air_fryer, orphan_leaf |
| `lamb_brisket` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=braise | hub_method_without_leaf:oven_roast, hub_method_without_leaf:slow_cooker, hub_registry_method_drift |
| `moose_roast` | derived only | — | leaves=2, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:braise, orphan_leaf |
| `pork_loin_roast` | derived only | — | leaves=2, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:slow_cooker, orphan_leaf |
| `turkey_thigh` | derived only | — | leaves=1, sources=1, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:braise, hub_method_without_leaf:smoker, hub_registry_method_drift |
| `venison_roast` | derived only | — | leaves=2, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:braise, orphan_leaf |
| `brisket` | derived only | — | leaves=2, sources=5, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:braise, hub_method_without_leaf:slow_cooker |
| `chicken_breast_bone_in` | derived only | — | leaves=1, sources=2, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:air_fryer, hub_method_without_leaf:grill |
| `chicken_leg` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:air_fryer, hub_method_without_leaf:grill |
| `lamb_rump` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:grill, hub_method_without_leaf:pan_sear |
| `mahi_mahi` | derived only | — | leaves=1, sources=5, silent_sources=0, silent_leaves=0, methods=pan_sear | hub_method_without_leaf:air_fryer, hub_method_without_leaf:grill |
| `pork_jowl` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=braise | hub_method_without_leaf:oven_roast, hub_method_without_leaf:pan_fry |
| `round_roast` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:braise, hub_method_without_leaf:slow_cooker |
| `rump` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=pan_sear | hub_method_without_leaf:grill, hub_method_without_leaf:oven_roast |
| `rump_roast` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:braise, hub_method_without_leaf:slow_cooker |
| `short_ribs` | derived only | — | leaves=2, sources=5, silent_sources=0, silent_leaves=0, methods=braise,smoker | hub_method_without_leaf:oven_roast, hub_method_without_leaf:slow_cooker |
| `top_round_roast` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:braise, hub_method_without_leaf:slow_cooker |
| `trout` | derived only | — | leaves=2, sources=9, silent_sources=0, silent_leaves=0, methods=pan_sear,smoker | hub_method_without_leaf:grill, hub_method_without_leaf:oven_roast |
| `turbot` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=oven_bake,pan_sear | hub_method_without_leaf:grill, hub_method_without_leaf:sous_vide |
| `chicken_wing` | derived only | — | leaves=4, sources=7, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,smoker | orphan_leaf |
| `cod_fillet` | derived only | — | leaves=4, sources=18, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_bake,pan_fry,smoker | hub_method_without_leaf:oven_roast, hub_registry_method_drift |
| `goat_leg` | derived only | — | leaves=5, sources=12, silent_sources=0, silent_leaves=1, methods=braise,grill,oven_roast,pressure_cooker,slow_cooker | leaf_without_any_temperature |
| `goat_shank` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=braise,oven_roast | hub_method_without_leaf:slow_cooker, hub_registry_method_drift |
| `grayling` | derived only | — | leaves=6, sources=13, silent_sources=0, silent_leaves=4, methods=boil,grill,oven_bake,pan_fry,poach,smoker | leaf_without_any_temperature |
| `ground_lamb` | derived only | — | leaves=4, sources=5, silent_sources=0, silent_leaves=1, methods=grill,oven_bake,pan_fry,simmer | leaf_without_any_temperature |
| `hake` | derived only | — | leaves=6, sources=22, silent_sources=2, silent_leaves=3, methods=oven_roast,pan_fry,pan_sear,poach,simmer,steam | leaf_without_any_temperature |
| `halibut_fillet` | derived only | — | leaves=4, sources=21, silent_sources=0, silent_leaves=3, methods=grill,oven_roast,pan_sear,steam | leaf_without_any_temperature |
| `herring` | derived only | — | leaves=6, sources=20, silent_sources=0, silent_leaves=2, methods=braise,grill,oven_bake,pan_fry,pressure_cooker,smoker | leaf_without_any_temperature |
| `leg_of_lamb` | derived only | — | leaves=3, sources=7, silent_sources=0, silent_leaves=0, methods=grill,oven_roast,smoker | orphan_leaf |
| `pork_cheek` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=braise,oven_roast,pan_fry | hub_method_without_leaf:slow_cooker, hub_registry_method_drift |
| `pork_chop` | derived only | — | leaves=6, sources=20, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,pan_fry,pan_sear,smoker | orphan_leaf |
| `pork_tenderloin` | derived only | — | leaves=6, sources=20, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,pan_sear,smoker,sous_vide | orphan_leaf |
| `quail` | derived only | — | leaves=5, sources=12, silent_sources=0, silent_leaves=1, methods=braise,grill,oven_roast,pan_fry,smoker | leaf_without_any_temperature |
| `reindeer_roast` | derived only | — | leaves=2, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | orphan_leaf |
| `roasted_tomatoes` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_roast | hub_method_without_leaf:oven_broil, hub_registry_method_drift |
| `salmon_steak` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=oven_bake,pan_sear | hub_method_without_leaf:grill, hub_registry_method_drift |
| `secreto` | derived only | — | leaves=6, sources=22, silent_sources=0, silent_leaves=1, methods=braise,charcoal_grill,grill,oven_roast,pan_sear,sous_vide | leaf_without_any_temperature |
| `tuna_steak` | derived only | — | leaves=3, sources=10, silent_sources=0, silent_leaves=0, methods=grill,pan_sear,smoker | orphan_leaf |
| `whole_duck` | derived only | — | leaves=2, sources=3, silent_sources=1, silent_leaves=0, methods=oven_roast,smoker | orphan_leaf |
| `beef_burger` | derived only | — | leaves=3, sources=14, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,pan_fry | hub_method_without_leaf:charcoal_grill |
| `buffalo_steak` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | hub_method_without_leaf:charcoal_grill |
| `cheek` | derived only | — | leaves=1, sources=1, silent_sources=0, silent_leaves=0, methods=braise | hub_method_without_leaf:slow_cooker |
| `lamb_burger` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=grill | hub_method_without_leaf:pan_fry |
| `lamb_kofta` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=grill | hub_method_without_leaf:oven_roast |
| `lamb_loin_chops` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=pan_sear | hub_method_without_leaf:grill |
| `lamb_rib` | derived only | — | leaves=1, sources=2, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:grill |
| `liver_pork` | derived only | — | leaves=1, sources=2, silent_sources=0, silent_leaves=0, methods=pan_fry | hub_method_without_leaf:pan_sear |
| `rack_of_lamb` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:grill |
| `sirloin_tip_roast` | derived only | — | leaves=1, sources=2, silent_sources=0, silent_leaves=0, methods=oven_roast | hub_method_without_leaf:braise |
| `spare_ribs` | derived only | — | leaves=2, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:grill |
| `st_louis_ribs` | derived only | — | leaves=2, sources=2, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | hub_method_without_leaf:grill |
| `venison_loin` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=oven_roast,pan_sear | hub_method_without_leaf:sous_vide |
| `venison_steak` | derived only | — | leaves=2, sources=11, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | hub_method_without_leaf:charcoal_grill |
| `button_mushrooms` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,saute | hub_registry_method_drift |
| `cabbage` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=braise,grill,oven_roast,saute | hub_registry_method_drift |
| `cauliflower` | derived only | — | leaves=5, sources=20, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_roast,saute,steam,whole_roast | hub_registry_method_drift |
| `corn_on_cob` | derived only | — | leaves=5, sources=20, silent_sources=0, silent_leaves=0, methods=air_fryer,boil,grill,oven_roast,steam | hub_registry_method_drift |
| `eggplant` | derived only | — | leaves=5, sources=20, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,pan_fry,saute | hub_registry_method_drift |
| `ground_chicken` | derived only | — | leaves=3, sources=10, silent_sources=0, silent_leaves=0, methods=braise,grill,pan_fry | hub_registry_method_drift |
| `ground_turkey` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=braise,grill,pan_fry | hub_registry_method_drift |
| `hanger_steak` | derived only | — | leaves=4, sources=19, silent_sources=0, silent_leaves=0, methods=charcoal_grill,grill,pan_fry,pan_sear | hub_registry_method_drift |
| `lamb_shank` | derived only | — | leaves=3, sources=13, silent_sources=0, silent_leaves=0, methods=braise,oven_roast,slow_cooker | hub_registry_method_drift |
| `lobster_tail` | derived only | — | leaves=2, sources=9, silent_sources=0, silent_leaves=0, methods=grill,oven_roast | hub_registry_method_drift |
| `ostrich_fillet` | derived only | — | leaves=3, sources=1, silent_sources=0, silent_leaves=0, methods=braise,grill,pan_sear | hub_registry_method_drift |
| `pork_leg` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=braise,oven_roast,slow_cooker | hub_registry_method_drift |
| `whole_salmon` | derived only | — | leaves=3, sources=7, silent_sources=0, silent_leaves=0, methods=grill,oven_bake,smoker | hub_without_registry_entry |
| `acorn_squash` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=oven_bake,oven_roast | — |
| `asparagus` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=grill,oven_roast,saute,steam | — |
| `baby_back_ribs` | derived only | — | leaves=4, sources=15, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,smoker | — |
| `baked_potato` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_bake | — |
| `baltic_herring` | derived only | — | leaves=6, sources=31, silent_sources=0, silent_leaves=0, methods=boil,braise,grill,oven_bake,pan_fry,smoker | — |
| `beef_liver` | derived only | — | leaves=2, sources=9, silent_sources=0, silent_leaves=0, methods=pan_fry,pan_sear | — |
| `beef_shank` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=braise,slow_cooker | — |
| `beef_tenderloin_roast` | derived only | — | leaves=1, sources=5, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `beef_tongue` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=braise,slow_cooker | — |
| `bell_peppers` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,saute | — |
| `bison_burger` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=grill,pan_fry | — |
| `bison_roast` | derived only | — | leaves=1, sources=2, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `bison_steak` | derived only | — | leaves=4, sources=18, silent_sources=0, silent_leaves=0, methods=charcoal_grill,grill,pan_sear,sous_vide | — |
| `broccoli` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_roast,saute,steam | — |
| `brussels_sprouts` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_roast,pan_fry,saute | — |
| `buffalo_burger` | derived only | — | leaves=4, sources=14, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,pan_fry,smoker | — |
| `buffalo_roast` | derived only | — | leaves=3, sources=9, silent_sources=1, silent_leaves=0, methods=braise,oven_roast,smoker | — |
| `butternut_squash` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=oven_roast,pressure_cooker,steam | — |
| `caramelized_onions` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=pan_fry,saute | — |
| `chicken_burger` | derived only | — | leaves=3, sources=9, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,pan_fry | — |
| `cured_ham` | derived only | — | leaves=2, sources=7, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | — |
| `duck_leg_confit` | derived only | — | leaves=1, sources=2, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `eel` | derived only | — | leaves=5, sources=20, silent_sources=0, silent_leaves=0, methods=braise,grill,oven_bake,pan_fry,smoker | — |
| `filet_mignon` | derived only | — | leaves=7, sources=35, silent_sources=0, silent_leaves=0, methods=air_fryer,charcoal_grill,grill,oven_roast,pan_fry,pan_sear,sous_vide | — |
| `flank_steak` | derived only | — | leaves=6, sources=30, silent_sources=0, silent_leaves=0, methods=charcoal_grill,grill,oven_roast,pan_fry,pan_sear,sous_vide | — |
| `flat_iron` | derived only | — | leaves=7, sources=35, silent_sources=0, silent_leaves=0, methods=air_fryer,charcoal_grill,grill,oven_roast,pan_fry,pan_sear,sous_vide | — |
| `fresh_ham` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `goat_chop` | derived only | — | leaves=3, sources=8, silent_sources=0, silent_leaves=0, methods=grill,oven_broil,pan_sear | — |
| `goat_shoulder` | derived only | — | leaves=3, sources=11, silent_sources=0, silent_leaves=0, methods=braise,oven_roast,slow_cooker | — |
| `goose_breast` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=oven_roast,pan_sear | — |
| `goose_leg` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=braise,oven_roast | — |
| `goose_thigh` | derived only | — | leaves=2, sources=8, silent_sources=4, silent_leaves=0, methods=braise,oven_roast | — |
| `green_beans` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=boil,oven_roast,saute,steam | — |
| `ground_beef` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=braise,pan_fry | — |
| `ground_pork` | derived only | — | leaves=2, sources=7, silent_sources=0, silent_leaves=0, methods=braise,pan_fry | — |
| `ham` | derived only | — | leaves=3, sources=15, silent_sources=1, silent_leaves=0, methods=braise,oven_roast,slow_cooker | — |
| `kangaroo_fillet` | derived only | — | leaves=2, sources=2, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | — |
| `kangaroo_steak` | derived only | — | leaves=2, sources=7, silent_sources=5, silent_leaves=0, methods=grill,pan_sear | — |
| `lamb_chops` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | — |
| `lamb_cutlet` | derived only | — | leaves=2, sources=10, silent_sources=0, silent_leaves=0, methods=grill,pan_fry | — |
| `lamb_loin_roast` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `lamb_neck` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=braise,oven_roast,slow_cooker | — |
| `lamb_neck_filet` | derived only | — | leaves=3, sources=1, silent_sources=0, silent_leaves=0, methods=braise,pan_sear,slow_cooker | — |
| `leeks` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=braise,oven_roast,saute | — |
| `meatloaf` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `moose_steak` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | — |
| `mutton_chop` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | — |
| `mutton_leg` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `mutton_shoulder` | derived only | — | leaves=3, sources=11, silent_sources=0, silent_leaves=0, methods=braise,oven_roast,slow_cooker | — |
| `ny_strip` | derived only | — | leaves=7, sources=35, silent_sources=0, silent_leaves=0, methods=air_fryer,charcoal_grill,grill,oven_roast,pan_fry,pan_sear,sous_vide | — |
| `ostrich_steak` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | — |
| `picanha` | derived only | — | leaves=4, sources=20, silent_sources=0, silent_leaves=0, methods=charcoal_grill,grill,oven_roast,pan_sear | — |
| `pikeperch` | derived only | — | leaves=6, sources=24, silent_sources=0, silent_leaves=0, methods=grill,oven_bake,pan_fry,pan_sear,smoker,sous_vide | — |
| `pork_belly` | derived only | — | leaves=8, sources=29, silent_sources=0, silent_leaves=0, methods=air_fryer,braise,grill,oven_roast,pan_fry,slow_cooker,smoker,sous_vide | — |
| `pork_liver` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=pan_fry,pan_sear | — |
| `pork_loin_steak` | derived only | — | leaves=7, sources=27, silent_sources=0, silent_leaves=0, methods=air_fryer,braise,charcoal_grill,grill,oven_roast,pan_fry,sous_vide | — |
| `pork_sausage` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=grill,pan_fry | — |
| `pork_shoulder` | derived only | — | leaves=3, sources=10, silent_sources=0, silent_leaves=0, methods=oven_roast,slow_cooker,smoker | — |
| `pork_shoulder_steak` | derived only | — | leaves=7, sources=28, silent_sources=0, silent_leaves=0, methods=air_fryer,braise,grill,oven_broil,oven_roast,pan_fry,sous_vide | — |
| `pork_tongue` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=braise,slow_cooker | — |
| `portobello_mushrooms` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,saute | — |
| `prime_rib` | derived only | — | leaves=1, sources=5, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `rabbit_legs` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=braise,oven_roast | — |
| `rabbit_saddle` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=oven_roast,pan_sear | — |
| `reindeer_loin` | derived only | — | leaves=2, sources=0, silent_sources=0, silent_leaves=0, methods=oven_roast,pan_sear | — |
| `reindeer_steak` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | — |
| `ribeye_steak` | derived only | — | leaves=7, sources=24, silent_sources=0, silent_leaves=0, methods=air_fryer,charcoal_grill,grill,oven_roast,pan_fry,pan_sear,sous_vide | — |
| `roasted_beets` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `roasted_carrots` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_roast,saute | — |
| `roasted_garlic` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `roasted_onion` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=grill,oven_roast,saute | — |
| `roasted_parsnips` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_roast | — |
| `roasted_potatoes` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_roast | — |
| `roasted_sweet_potato` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=air_fryer,oven_bake,oven_roast | — |
| `roasting_joint` | derived only | — | leaves=1, sources=4, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `salmon_fillet` | derived only | — | leaves=6, sources=30, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_bake,pan_sear,smoker,sous_vide | — |
| `scallops` | derived only | — | leaves=1, sources=5, silent_sources=0, silent_leaves=0, methods=pan_sear | — |
| `sea_bass` | derived only | — | leaves=5, sources=16, silent_sources=2, silent_leaves=0, methods=grill,oven_bake,oven_roast,pan_sear,steam | — |
| `shrimp` | derived only | — | leaves=1, sources=5, silent_sources=0, silent_leaves=0, methods=pan_fry | — |
| `sirloin_roast` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `sirloin_steak` | derived only | — | leaves=7, sources=34, silent_sources=0, silent_leaves=0, methods=air_fryer,charcoal_grill,grill,oven_roast,pan_fry,pan_sear,sous_vide | — |
| `skirt_steak` | derived only | — | leaves=4, sources=20, silent_sources=0, silent_leaves=0, methods=charcoal_grill,grill,pan_fry,pan_sear | — |
| `spaghetti_squash` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=oven_bake,oven_roast | — |
| `spinach` | derived only | — | leaves=2, sources=8, silent_sources=0, silent_leaves=0, methods=saute,steam | — |
| `swordfish` | derived only | — | leaves=6, sources=26, silent_sources=0, silent_leaves=0, methods=braise,charcoal_grill,grill,oven_bake,pan_sear,sous_vide | — |
| `t_bone` | derived only | — | leaves=5, sources=25, silent_sources=0, silent_leaves=0, methods=air_fryer,charcoal_grill,grill,oven_roast,pan_sear | — |
| `tomahawk` | derived only | — | leaves=5, sources=15, silent_sources=0, silent_leaves=0, methods=charcoal_grill,grill,oven_roast,pan_sear,sous_vide | — |
| `tri_tip` | derived only | — | leaves=6, sources=18, silent_sources=0, silent_leaves=0, methods=charcoal_grill,grill,oven_roast,pan_sear,smoker,sous_vide | — |
| `turkey_breast` | derived only | — | leaves=2, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | — |
| `turkey_burger` | derived only | — | leaves=3, sources=12, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,pan_fry | — |
| `turkey_leg` | derived only | — | leaves=2, sources=5, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | — |
| `venison_leg` | derived only | — | leaves=2, sources=1, silent_sources=0, silent_leaves=0, methods=braise,oven_roast | — |
| `venison_shoulder` | derived only | — | leaves=3, sources=2, silent_sources=0, silent_leaves=0, methods=braise,oven_roast,slow_cooker | — |
| `whole_goose` | derived only | — | leaves=1, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast | — |
| `whole_turkey` | derived only | — | leaves=2, sources=3, silent_sources=0, silent_leaves=0, methods=oven_roast,smoker | — |
| `wild_boar_chop` | derived only | — | leaves=2, sources=6, silent_sources=0, silent_leaves=0, methods=grill,pan_sear | — |
| `zucchini` | derived only | — | leaves=4, sources=16, silent_sources=0, silent_leaves=0, methods=air_fryer,grill,oven_roast,saute | — |

## No concrete gap found

Not a statement that these cuts are finished - only that no contradiction or declared hole is visible in the files. A pass that searches one of these and finds something should add the gap with its evidence.

`acorn_squash`, `asparagus`, `baby_back_ribs`, `baked_potato`, `baltic_herring`, `beef_liver`, `beef_shank`, `beef_tenderloin_roast`, `beef_tongue`, `bell_peppers`, `bison_burger`, `bison_roast`, `bison_steak`, `broccoli`, `brussels_sprouts`, `buffalo_burger`, `buffalo_roast`, `butternut_squash`, `caramelized_onions`, `chicken_burger`, `cured_ham`, `duck_leg_confit`, `eel`, `filet_mignon`, `flank_steak`, `flat_iron`, `fresh_ham`, `goat_chop`, `goat_shoulder`, `goose_breast`, `goose_leg`, `goose_thigh`, `green_beans`, `ground_beef`, `ground_pork`, `ham`, `kangaroo_fillet`, `kangaroo_steak`, `lamb_chops`, `lamb_cutlet`, `lamb_loin_roast`, `lamb_neck`, `lamb_neck_filet`, `leeks`, `meatloaf`, `moose_steak`, `mutton_chop`, `mutton_leg`, `mutton_shoulder`, `ny_strip`, `ostrich_steak`, `picanha`, `pikeperch`, `pork_belly`, `pork_liver`, `pork_loin_steak`, `pork_sausage`, `pork_shoulder`, `pork_shoulder_steak`, `pork_tongue`, `portobello_mushrooms`, `prime_rib`, `rabbit_legs`, `rabbit_saddle`, `reindeer_loin`, `reindeer_steak`, `ribeye_steak`, `roasted_beets`, `roasted_carrots`, `roasted_garlic`, `roasted_onion`, `roasted_parsnips`, `roasted_potatoes`, `roasted_sweet_potato`, `roasting_joint`, `salmon_fillet`, `scallops`, `sea_bass`, `shrimp`, `sirloin_roast`, `sirloin_steak`, `skirt_steak`, `spaghetti_squash`, `spinach`, `swordfish`, `t_bone`, `tomahawk`, `tri_tip`, `turkey_breast`, `turkey_burger`, `turkey_leg`, `venison_leg`, `venison_shoulder`, `whole_goose`, `whole_turkey`, `wild_boar_chop`, `zucchini`

## What this file cannot see

- Culinary-group coverage: traditions are recorded in prose, not in a machine-readable field.
- Whether a leaf's sources are human-written or machine-generated: that needs a reader.
- Searched-negatives and blocked system changes: only an authored ledger can hold those.
- Whether a cited URL still resolves (`--check-urls` is a future addition, not built).

_Cuts: 187 · generated by `measure_cut_potential.py`_
