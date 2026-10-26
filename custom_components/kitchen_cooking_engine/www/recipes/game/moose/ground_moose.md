<!-- KCE:CUT
type: cut
slug: ground_moose
name: Minced Moose
name_sv: Älgfärs
name_da: Hakket elgkød
category: game
meat: moose
cut_type: Moose
usda_safe_c: 71
usda_safe_f: 160
recommended_doneness: well_done
methods:
- pan_fry
- grill
- oven_bake
- braise
doneness:
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
quality_score: 8
cooking_methods_researched: 0 # Set only to '1' after proper research is done on common cooking methods for this cut conducted, that is not yet in the cut file!
quality_assessed: 2026-10-26
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Minced Moose — Cut Overview

## Cut profile

Minced moose (*älgfärs*, *hakket elgkød*) is the moose equivalent of ground beef: loin,
haunch and shoulder trim put through a grinder, sold loose or formed into patties, meatballs
and burger shapes. It is even leaner than the whole-muscle cuts it comes from — moose carries
almost no intramuscular fat, so mince is typically blended with pork fat, cream, or stock to
keep it from crumbling, which is why Nordic mince recipes so often pair it with cream, egg and
potato flour rather than treating it as a plain burger.

**This is ground meat, not a whole muscle, and the temperature rule changes with that.** The
whole-muscle moose cuts in this project target 63 °C / 145 °F, because bacteria stay on the
surface of an intact steak. Grinding spreads that surface through the mass, so the USDA
ground-meat minimum applies: **71 °C / 160 °F**, and there is no rare or medium-rare option
here the way there is for a moose steak. Carryover is small (1–2 °C) because a thin patty or a
loose pan of mince transfers heat quickly, so pull at the target rather than below it.

Lean game mince also dries fast once it passes the safety point: the same rule that makes rare
moose steak good makes well-done moose mince dry, so fat or liquid has to be built into the
mixture rather than relied on from the meat.

## Styckesprofil

Älgfärs (*hakket elgkød*) är motsvarigheten till nötfärs: rygg, bakdel och bog körda genom
kvarn, sålda lösa eller formade till biffar, köttbullar och burgare. Färsen är ännu magrare än
hela musklerna — älg har nästan inget intramuskulärt fett — så den blandas typiskt med
fläskfett, grädde eller buljong för att inte smula sönder, vilket är varför nordiska
färsrecept så ofta kombinerar den med grädde, ägg och potatismjöl.

**Detta är malet kött, inte en hel muskel, och temperaturregeln ändras med det.**
Helmuskelsnitten i projektet siktar på 63 °C / 145 °F eftersom bakterierna sitter på ytan av
en intakt stek. Malningen fördelar ytan genom hela massan, så USDA:s gräns för malet kött
gäller: **71 °C / 160 °F**, och det finns ingen rare- eller medium-rare-möjlighet här på samma
sätt som för en älgbiff. Eftertillagningen är liten (1–2 °C) eftersom en tunn biff eller lös
färs i panna överför värme snabbt — dra vid måltemperaturen, inte under den.

Mager viltfärs torkar dessutom fort när den passerat säkerhetspunkten: samma regel som gör
älgbiffen god vid rare gör älgfärsen torr vid well done, så fett eller vätska måste byggas in i
smeten i stället för att förväntas komma från köttet.

## Research files by cooking method

No method leaf exists yet. The four methods declared in `methods:` are the research targets for
the next pass — `pan_fry` (färsbiffar / elgbøffer), `grill` (moose burgers), `oven_bake`
(meatloaf and oven färs dishes) and `braise` (älggryta on mince) — and each needs its own
`ground_moose-{method}.md` leaf with 4–6 fully sourced recipes before it can be cited here.

## Quality score

**Score: 8 / 20** — assessed 2026-10-26 (new cut; no research pass has run yet)

| Criterion | Deduction | Status |
|-----------|-----------|--------|
| Cooking methods not researched | −8 | `cooking_methods_researched: 0` — the four declared methods are inherited practice for minced game, not yet verified across traditions |
| Method leaf files missing | −4 | 0 of the 4 declared methods has a leaf file |

**Deductions**: −8 methods not researched · −4 leaf files missing = −12 → **8**

### Improvement priorities

1. **−8** · Research the cooking methods for minced moose across culinary traditions (Nordic *älgfärsbiffar* / *elgbøffer*, Sámi and Russian mince dishes, North American moose burger and meatloaf practice), then correct the `methods:` list and set `cooking_methods_researched: 1`
2. **−4** · Create the four method leaves: `ground_moose-pan_fry.md`, `ground_moose-grill.md`, `ground_moose-oven_bake.md`, `ground_moose-braise.md`, each with 4–6 sourced recipes and its own method-specific cut profile
3. Culinary groups: Group D (Nordic) is the natural home for this cut and should be easy to source; Group B (North American) and Group C (African/Caribbean mince treatments) need deliberate searching

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
