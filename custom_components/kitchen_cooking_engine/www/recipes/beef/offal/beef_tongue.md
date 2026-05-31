<!-- KCE:CUT
type: cut
slug: beef_tongue
name: Beef Tongue
name_sv: Oxtunga
category: beef
meat: cow
cut_type: Other / Offal
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: pulled
methods:
- braise
- slow_cooker
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
quality_score: -4
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
rest_time_min: 15
rest_time_max: 30
carryover_temp_c: 5
-->
# Beef Tongue — Cut Overview

## Cut profile

Beef tongue (*Bos taurus* lingual muscle) is a single dense cylindrical muscle wrapped in a thick, papillae-covered skin. The muscle itself is rich in collagen and intramuscular fat; the skin is inedible and must be peeled after cooking — the standard method is to braise the whole tongue at 85–95 °C until the collagen converts to gelatin, then peel the skin while the tongue is still warm. Cooking times of 3–4 hours for a 1.5–2 kg tongue are standard. Carryover is essentially zero (the surrounding liquid buffers the temperature) but the tongue retains heat well after removal — the skin must be peeled within 5 minutes of lifting from the braise or it cools and tightens. Pull is timed by the texture of the muscle: a paring knife should slide in with no resistance.


## Styckesprofil

Nöttungue (*Bos taurus* lingvalmuskel) är en enda tät cylindrisk muskel som arbetar konstant under djurets liv — ungefär lika belastad som hjärtmuskeln, men strukturellt mer lik en benmuskel. Den är tätt insvept i ett tjockt, grovt hudlager som måste avlägsnas efter tillagning; det underliggande köttet är fint fibrerat, marmorerat och extremt kollagenrikt. Korrekt tillagad (bräserad i 3–4 timmar tills innertemperaturen når 85–90 °C) är tungan silkeslent mör med en smak som liknar nötkindsmuskeln. Det yttre skinnet skalar lätt av strax efter kokning medan tungan fortfarande är varm.

## Research files by cooking method

- [Braise](./beef_tongue-braise.md)
- [Slow Cooker](./beef_tongue-slow_cooker.md)
## Quality score

**Score: -4 / 20**

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `beef_tongue-braise.md` copies parent cut profile | −1 |
| Inflated score (this branch) | −15 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `beef_tongue-braise.md` copies parent cut profile — rewrite `beef_tongue-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
