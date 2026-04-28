<!-- KCE:CUT
type: cut
slug: tuna_steak
name: Tuna Steak
name_sv: Tonfiskbiff
category: fish
meat: tuna
cut_type: Tuna
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- pan_sear
doneness:
- name: rare
  target_c: 43
  target_f: 110
  min_c: 40
  min_f: 105
  max_c: 46
  max_f: 115
  usda_safe: false
  recommended: true
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
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Tuna Steak — Cut Overview

## Cut profile

Tuna steak — most commonly bluefin (*Thunnus thynnus*, Japanese *hon maguro*), yellowfin (*Thunnus albacares*, Hawaiian *ahi*), or bigeye (*Thunnus obesus*, *mebachi*) — is cut transversely from the cylindrical loin muscles of a large, pelagic, highly migratory fish. The flesh is deep crimson from high myoglobin content (endothermic muscle requiring sustained oxygen delivery). It is very lean and densely packed with fast-twitch white and red muscle fibres with almost no connective tissue between segments — this gives tuna its steak-like behaviour under direct heat rather than the flaking characteristic of most fish. Average steak dimensions: 2–4 cm thick, 10–15 cm diameter loin cross-section. Safe temperatures: USDA minimum for finfish is 63 °C (145 °F), but sushi-grade tuna is conventionally consumed raw; most chefs pull at 38–45 °C for rare (cold-raw centre) to 54–57 °C for medium-rare (lightly warmed centre).


## Research files by cooking method

- [Grill](./tuna_steak-grill.md)
- [Pan Sear](./tuna_steak-pan_sear.md)
## Quality score

**Score: 8 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing Culinary Group D tradition | −1 |
| Method file `tuna_steak-grill.md` copies parent cut profile | −1 |
| Method file `tuna_steak-pan_sear.md` copies parent cut profile | −1 |
| Method file `tuna_steak-grill.md` copies `tuna_steak-pan_sear.md` | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `tuna_steak-grill.md` copies `tuna_steak-pan_sear.md` — rewrite `tuna_steak-grill.md`'s cut profile — it must describe what the pan sear method does to this cut, not repeat another method's prose
3. **−1** · Method file `tuna_steak-grill.md` copies parent cut profile — rewrite `tuna_steak-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
4. **−1** · Method file `tuna_steak-pan_sear.md` copies parent cut profile — rewrite `tuna_steak-pan_sear.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it
5. **−1** · Missing Culinary Group D tradition(s) — add Culinary Group D source recipes to method leaf files — each tradition needs at least one recipe across the method files

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
