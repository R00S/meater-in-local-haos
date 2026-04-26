<!-- KCE:CUT
type: cut
slug: bison_steak
name: Bison Steak
category: game
meat: bison
cut_type: Bison
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- charcoal_grill
- grill
- pan_sear
doneness:
- name: rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
- name: medium_rare
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
  recommended: true
- name: medium
  target_c: 60
  target_f: 140
  min_c: 57
  min_f: 135
  max_c: 63
  max_f: 145
  usda_safe: false
- name: medium_well
  target_c: 66
  target_f: 150
  min_c: 63
  min_f: 145
  max_c: 68
  max_f: 155
  usda_safe: true
quality_score: 7
cooking_methods_researched: 0
quality_assessed: 2026-04-26
-->
# Bison Steak — Cut Overview

## Cut profile

Bison (American buffalo, *Bison bison*) is a large North American bovine raised primarily on
open pasture. Its steaks — most commonly cut from the loin (fillet/tenderloin), rib (entrecôte/
ribeye), or striploin (sirloin) — are structurally similar to beef cuts from the same primal
positions but differ decisively in fat content and flavour chemistry. Bison carries significantly
less intramuscular fat than commercial beef: its marbling score is typically very low, and the
external fat cap is thin. This leanness means there is very little insulating fat to slow heat
penetration, so bison steaks cook faster than their beef equivalents and have a narrower
window between perfectly cooked and overdone.

The critical temperature rule for bison steak is the most frequently repeated piece of culinary
consensus in all traditions: bison must always be served rare to medium-rare and must never be
taken past medium. The lean muscle fibres of bison, deprived of intramuscular fat that would
lubricate the texture, become dry, chalky, and develop a distinctly unpleasant liver-like
off-flavour when cooked beyond 65 °C. This off-note — noted explicitly in German, American,
and French bison cooking literature — is caused by the oxidation of the comparatively high
iron content in the lean, myoglobin-rich muscle at elevated temperatures. The pull temperature
for a grilled bison steak is therefore 57–60 °C (medium-rare), and never above 63 °C.

On the grill, bison steak performs best over direct, high heat — charcoal (Holzkohlegrill) is
frequently recommended in German and North American traditions because the intense radiant
heat of charcoal sears the exterior rapidly, creating Maillard crust without the interior
overcooking. Gas grill or cast-iron griddle are also acceptable. Because of the leanness,
marinating overnight is common in German tradition: the marinade provides moisture and
flavour compounds that compensate for the lack of intramuscular fat. Resting is universally
recommended (5 minutes minimum) to allow the muscle fibres to relax and reabsorb juices.
Slow low-temperature cooking (Niedrigtemperatur) is explicitly warned against for bison steak
by German sources — while it works for collagen-rich beef cuts, for lean bison steak it
concentrates the liver-like off-note and dries the meat. The pan-sear + brief oven finish
at 80 °C (as described in two German sources below) is the one acceptable exception, because
the sear provides Maillard flavour and the short oven time (25 min at 80 °C) simply holds
the meat at medium without further cooking.


off-flavour when cooked beyond 65 °C. This off-note — noted explicitly in German, American,
iron content in the lean, myoglobin-rich muscle at elevated temperatures. The pull temperature
for a grilled bison steak is therefore 57–60 °C (medium-rare), and never above 63 °C.
at 80 °C (as described in two German sources below) is the one acceptable exception, because
the sear provides Maillard flavour and the short oven time (25 min at 80 °C) simply holds


## Research files by cooking method

- [Grill](./bison_steak-grill.md)
- [Pan Sear](./bison_steak-pan_sear.md)
## Quality score

**Score: 7 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Missing method leaf file `bison_steak-charcoal_grill.md` | −1 |
| Missing Eastern tradition | −1 |
| Missing Southern tradition | −1 |
| Missing Northern tradition | −1 |
| Method file `bison_steak-grill.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Missing method leaf file — create `bison_steak-charcoal_grill.md` with 4–6 diverse source recipes, a method-specific cut profile, and pull temperatures from sources
3. **−3** · Missing Eastern, Southern and Northern tradition(s) — add Eastern, Southern and Northern source recipes to method leaf files — each tradition needs at least one recipe across the method files
4. **−1** · Method file `bison_steak-grill.md` copies parent cut profile — rewrite `bison_steak-grill.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
