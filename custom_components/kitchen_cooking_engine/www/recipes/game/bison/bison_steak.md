<!-- KCE:CUT
type: cut
slug: bison_steak
name: Bison Steak
name_sv: Bisonbiff
name_da: Bisonbøf
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
- sous_vide
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
improvement_potential: 12
cooking_methods_researched: 1 # Enum-wide survey 2026-10-26, fetched sources for this exact whole-muscle steak cut. Confirmed+leafed: pan_sear, grill, charcoal_grill, sous_vide (the last discovered this pass, 4 measured sources). Queued leads (widening before leafing): oven_roast/reverse_sear (Primal Bison's "How To Reverse Sear a Bison Steak"; Grillocracy's tri-tip 300 °F oven finish; Vindulge's reverse-sear note), smoker (informal smoke-then-sear posts only: GrillSergeantUSA 225 °F smoke to 110 °F then charcoal vortex sear), braise (highlandsranchfoodie's porter stew uses sirloin steak pieces — queued as a steak-form braise lead), air_fryer (searched 2026-10-26; video/social results only, no fetchable recipe). Documented searched-negative 2026-10-26 for the whole-steak form: slow_cooker, pressure_cooker, simmer, poach, steam, boil — bison appears there only as stew meat, cubes, chuck roast or short ribs (Northstar stew, Noble Irish Stew on cubes, Miller slow-cooker roast), i.e. other cut forms, not this cut.
quality_assessed: 2026-10-26
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 3
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
off-flavour when cooked slowly at low temperature — a warning stated in its own words by the
fetched German source (DasKochrezept.de: bison cooked too long at too low a temperature "takes
on a liver-like taste") and echoed across the US corpus as "do not overcook" and "will get
tough and gamey". The measured pull temperatures for a grilled or seared bison steak therefore
cluster at **49–57 °C (120–135 °F)** depending on whether the source counts carryover (the
low-pull school) or measures the finished steak (the 57 °C school), with an absolute ceiling
at 63 °C / 145 °F / "medium".

Because of the leanness, technique compensations recur across traditions: seasoning hours to
days ahead, tempering (or, dissentingly, not tempering and dry-brining instead), butter-basting
the sear, and a real 5–10 minute rest. Slow low-temperature cooking (*Niedrigtemperatur*) is
explicitly warned against for the whole steak; the pan-sear + 80 °C oven hold of the German
"80-Grad-Methode" is the one exception its sources allow, because the hold never takes the
meat above its target.

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Sources | Observed numerical evidence | Measured band | Gate status |
|---|---|---|---|---|---|
| Charcoal grill | [charcoal_grill](./bison_steak-charcoal_grill.md) | 4 | 52 °C breeder tip (SE); 125/135/145 °F chart before rest (US) | 52–57 °C | ⚠️ distinct row open (US ×2) |
| Grill | [grill](./bison_steak-grill.md) | 5 | 125/135/145/155 °F chart (US); pull 120–125 °F (US); 125/135/145 °F chart (US); 2 verbal | 49–63 °C | ⚠️ distinct row open (US ×3) |
| Pan sear | [pan_sear](./bison_steak-pan_sear.md) | 5 (2 verifiable) | 120/125 °F targets (US); 125/135/145 °F chart (US); disputed 54 vs 60 °C (DE, unused) | 49–57 °C verifiable | ⚠️ count (verifiability) + distinct rows open |
| Sous vide | [sous_vide](./bison_steak-sous_vide.md) | 4 | 130/132/140 °F baths (US); 120→128 °F (US); 39.5→49.5 °C warm-aging (NL); 131 °F (US) | 49–55 °C baths | ⚠️ distinct row open (US ×3) |

## Styckesprofil

Bison (amerikansk buffel, *Bison bison*) är ett stort nordamerikanskt nötdjur uppfött primärt på öppet bete. Dess steaks — vanligast från rygg (filé), revben (entrecôte) eller striploin — är strukturellt likartade med nötköttsnitt men skiljer sig avgörande i fettinnehåll och smakkemi. Bison bär under 3 % intramuskulärt fett (jämfört med 10–25 % för nötkött) och har praktiskt taget inget yttre fettlock.

Den mörka röda färgen speglar hög myoglobinhalt. Behandla som ett extremt magert nötkött: bison överkokkas snabbare och straffar hårt för det — aldrig förbi medium, och lågtemperaturkok ger en leberartad smak (den tyska källans egen varning). Dra alltid 5 °C lägre än för nötkött och förvänta 3–5 °C eftertillagning. Innertemperatur: **52–57 °C (126–135 °F)** för medium-rare beroende på om källan räknar eftertillagning. Sond i tjockaste delen, borta från ben. Vila 5–10 minuter.

## Research files by cooking method

- [Charcoal Grill](./bison_steak-charcoal_grill.md) — 4 sources (DE, US ×2, SE); ⚠️ distinct row open (US ×2); carries the re-fetch-corrected Daskochrezept record
- [Grill](./bison_steak-grill.md) — 5 sources (US ×3, Thai-tradition, Nigerian-tradition); ⚠️ distinct row open (US ×3)
- [Pan Sear](./bison_steak-pan_sear.md) — 5 records (DE ×3 preserved/2 disputed, US ×2 verifiable); ⚠️ verifiability + distinct rows open
- [Sous Vide](./bison_steak-sous_vide.md) — 4 sources (US ×3, NL); ⚠️ distinct row open (US ×3)

## Improvement potential

### Integrity work recorded this pass (why some rows moved)

The pre-ToR leaves contained corrupted source records: the Daskochrezept charcoal recipe was
filed twice (under grill and pan_sear) with two different invented ingredient lists and two
different invented pull temperatures (57–60 °C and 52–54 °C) — a fresh fetch of the page
showed it publishes **no temperature at all**, and the corrected record now lives in the
charcoal_grill leaf with both old numbers retracted. Two Chefkoch "80-Grad-Methode" recipes
were likewise recorded twice with contradictory numbers (54 vs 60 °C); the pages now return
403 and cannot settle it, so the records are consolidated in the pan_sear leaf with explicit
conflict flags and **neither disputed number is used as evidence**. The old grill leaf also
counted a BBC Good Food **beef** chimichurri recipe as a bison source; it is retired (kept
only as an uncounted technique mention below). The old grill and pan_sear files' shared
long temperature narrative is replaced by each leaf's own method-specific analysis.

**Uncounted technique references, not sources:** BBC Good Food's "Steak with Chimichurri
Sauce" (a beef recipe; its chimichurri pairing technique, not its species or numbers);
Grillocracy's "Grilled Bison Tri-Tip, Santa Maria Style" (The Honest Bison's tips: 110–120 /
121–125 / 126–130 °F school — tri-tip is a small roast form, queued for a future cut/leaf);
Madens-style general chop-pan techniques do not apply here.

### Improvement priorities

1. Clear the four distinct-tradition rows with one non-US source per leaf: a Nordic/French/Canadian cast-iron recipe (pan_sear), a German or Nordic grill recipe (grill), a Canadian/Nordic live-fire recipe (charcoal_grill), a European precision-cooking page (sous_vide)
2. Widen `pan_sear` to four verifiable sources (Highlands Ranch Foodie and MyChicagoSteak are fetched leads; a Chefkoch mirror/cache for the disputed pair would also settle the 54-vs-60 °C conflict one way or the other)
3. Group depth: a second leaf carrying each thin group — e.g. Noble's miso-butter ribeye (A) in pan_sear, a second Suya-adjacent source (C) in charcoal_grill, a Nordic cast-iron source (D) in pan_sear (Reddit's Swedish "Bisonbiff + gjutjärn" thread is an uncounted lead)
4. Queued method leads to widen next pass: `oven_roast`/reverse_sear (Primal Bison guide; Grillocracy tri-tip oven finish), `smoker` (informal posts), `braise` (highlandsranchfoodie's porter stew with sirloin steak pieces)
5. Doneness is settled at `medium_rare` (54 °C target) and supported by the corpus; the low-pull (49–52 °C) versus finished (57 °C) school split is recorded in each leaf for a future doneness pass if the whole cut ever needs re-derivation

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
