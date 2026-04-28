<!-- KCE:CUT
type: cut
slug: ground_pork
name: Ground Pork
name_sv: Fläskfärs
category: pork
meat: pig
cut_type: Ground
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- braise
- pan_fry
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
quality_score: 11
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-04-26
-->
# Ground Pork — Cut Overview

## Cut profile

Ground pork (minced pork) is made by grinding pork shoulder, belly, or a blend of primal trimmings. Standard ground pork is typically 70–80% lean with 20–30% fat; the higher fat content gives it a juicy, cohesive texture when cooked and makes it more forgiving than ground beef or turkey. Ground pork is the basis of countless preparations worldwide — from Italian ragù and Swedish köttbullar to Chinese dumplings and Mexican chorizo. Because grinding distributes any surface bacteria throughout the mass, the USDA minimum safe internal temperature is 71°C (160°F). Carryover is negligible.


## Styckesprofil

Malet fläsk (malet fläskkött) är gjort av malt fläskaxel, mage eller blandade primär-trimmings. Standard malet fläsk är typiskt 70–80 % magert med 20–30 % fett. Det höga fettinnehållet ger en saftig, sammanhängande textur vid tillagning och gör det mer tolerant mot lätt överkokning.

USDA kräver att malet fläsk tillagas till 72 °C (160 °F) internt. Innertemperatur: **72–75 °C (162–167 °F)**. Eftertillagning: 2–3 °C. Sond in i tjockaste delen av biff eller köttfärskula. Används i diverse köttbullar, sausageblandningar, köfte och löst kokat i saucer.

## Research files by cooking method

- [Braise](./ground_pork-braise.md)
- [Pan Fry](./ground_pork-pan_fry.md)
## Quality score

**Score: 11 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | −8 |
| Method file `ground_pork-braise.md` copies parent cut profile | −1 |

### Improvement priorities

1. **−8** · Cooking methods not researched — research what cooking methods are appropriate for this cut across culinary traditions; update the `methods:` list in the frontmatter and set `cooking_methods_researched: 1`
2. **−1** · Method file `ground_pork-braise.md` copies parent cut profile — rewrite `ground_pork-braise.md`'s cut profile section with method-specific analysis — what this method does to this cut, carryover behaviour, why it suits it

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
