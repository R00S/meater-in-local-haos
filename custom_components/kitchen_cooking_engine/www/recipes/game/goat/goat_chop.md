<!-- KCE:CUT
type: cut
slug: goat_chop
name: Goat Chop
name_sv: Getkotlett
name_da: Gedekotelet
category: game
meat: goat
cut_type: Goat
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- oven_broil
- pan_sear
doneness:
- name: medium_rare
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
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
- name: well_done
  target_c: 71
  target_f: 160
  min_c: 68
  min_f: 155
  max_c: 77
  max_f: 170
  usda_safe: true
  recommended: true
improvement_potential: unrated
cooking_methods_researched: 1 # Survey completed 2026-10-26 on fetched pages. Declared + leafed: grill and pan_sear (both rewritten after their old records failed verification) and oven_broil (discovered this pass, registered in the cut file). Queued leads (no full recipe fetched yet): braise/curry (goat chops cooked in curry are mostly shoulder/leg pieces rather than chops — sinfullyspicy and Yummy Medley both use mixed goat meat), tandoor (no fetchable recipe), smoker (none fetched for chops specifically). Documented searched-negative 2026-10-26: Culinary Group C (African/Caribbean) — the "jerk goat chops" search returned only social-media posts and videos, and the Caribbean Pot site surfaced only its homepage rather than a recipe; Culinary Group D — no Nordic/Baltic goat-chop recipe found at all.
quality_assessed: 2026-10-26
rest_time_min: 5
rest_time_max: 10
carryover_temp_c: 3
-->
# Goat Chop — Cut Overview

## Cut profile

A goat chop is a bone-in slice through the **loin or the rib rack** — the same anatomical position
as a lamb chop, and the same two muscles on either side of the bone: the *longissimus dorsi* eye
and the smaller *psoas*. What differs is scale and fat. A goat loin chop is roughly 100–150 g and
2–3 cm thick, smaller than the lamb equivalent, with a **thin fat layer over the eye and almost no
intramuscular marbling**. Goat also carries a higher proportion of branched-chain fatty acids,
which is where its slightly stronger, more aromatic flavour comes from.

The structural consequence is narrow: this is a **naturally tender, fast-cooking cut** and it is
the wrong cut for the long braises that goat is famous for. One fetched source says it plainly —
using loin and rib chops in a goat curry works but "the meat [is] a little tough", and the same
page lists loin, rib and tenderloin as the cuts for broiling, grilling or a cast-iron sear. Every
record in this cut's three leaves cooks a chop in **8–17 minutes**.

That leanness is also why temperature matters more here than for lamb. With no fat to buffer it,
the meat goes from pink to dry across a narrow band, and every source compensates the same way:
season hard and early (a dry brine or an overnight marinade), cook on high heat for a short time,
and **pull below the target** — one record's rule is literally "5 °F under your desired
temperature", and the rest add 3–10 minutes on the board.

**A doneness mismatch is recorded here rather than hidden.** The registry recommends
`well_done` (68–77 °C) and the old profile claimed goat loin is "at its best at medium to
well-done (68–74 °C)". The fetched corpus contradicts both: six sources cook these chops to
**54–63 °C (130–145 °F)**, two of them explicitly for pinkness and one calling 145 °F
"medium-rare". Changing the cut's recommendation is a doneness-system decision, not a recipe-data
edit, so it is queued as this cut's first improvement priority instead of being changed unilaterally.

### Per-method temperature application (researched 2026-10-26)

| Method | Leaf | Counted sources | Observed numerical evidence | Applied target | Gate status |
|---|---|---|---|---|---|
| Grill | [grill](./goat_chop-grill.md) | 3 (IT, PK, US) | **130 °F / 135 °F** pulls (US); two finger/fork records | 57 °C / 135 °F | ⚠️ count below 4 |
| Pan sear | [pan_sear](./goat_chop-pan_sear.md) | 3 (US ×2, PK) | **130 / 135 °F** pulls; a rack cut to **135 °F** after a 350 °F oven | 54–57 °C | ⚠️ count below 4 |
| Oven broil | [oven_broil](./goat_chop-oven_broil.md) | 2 (both Group B) | **145 °F**, labelled medium-rare (IN-style); one stage-times-only record | 60 °C / 140 °F | ⚠️ count + distinct open |

## Styckesprofil

En getkotlett är en benspäckad skiva genom **ryggen eller revbensraden** — samma anatomiska
position som en lammkotlett, med *longissimus dorsi* på ena sidan benet och den mindre *psoas* på
den andra. Det som skiljer är skala och fett: en getkotlett är ungefär 100–150 g och 2–3 cm tjock,
mindre än lammotsvarigheten, med ett **tunt fettlager över ögat och nästan ingen marmorering**.
Get har också en högre andel grenade fettsyror, vilket ger den något starkare, aromatiska smaken.

Strukturellt innebär det en smal sak: det här är ett **naturligt mört snitt för snabb tillagning**,
och fel snitt för de långa bräseringar som get är känd för. En hämtad källa säger det rakt ut — att
använda rygg- och revbenskotletter i en getcurry fungerar men "köttet [blir] lite segt", och samma
sida listar rygg, revben och filé som snitten för grillning, broiling eller stekning i
gjutjärnspanna. Varje recept i snittets tre blad lagar en kotlett på **8–17 minuter**.

Magerheten är också skälet till att temperaturen betyder mer här än för lamm: utan fett som buffrar
går köttet från rosa till torrt inom ett smalt band. Innertemperatur: **54–57 °C (130–135 °F)** för
kotletter, **60 °C (140 °F)** för den grövre ugnsbroilade varianten. Eftertillagning: 3 °C över
5–10 minuters vila — en källa drar medvetet 3 °C under mål för att landa rätt. Sond i den
tjockaste muskeldelen, borta från benet och från fettkanten.

## Research files by cooking method

- [Grill](./goat_chop-grill.md) — 3 sources (Italy, Pakistan, US); ⚠️ count below 4; carries the Puglian two-zone fire and the Pakistani steam-then-char
- [Oven Broil](./goat_chop-oven_broil.md) — 2 sources (both Group B, one Indian-style seasoning); ⚠️ count + distinct rows open
- [Pan Sear](./goat_chop-pan_sear.md) — 3 sources (US ×2, Pakistan); ⚠️ count below 4; carries the dry-brine rule and the 5 °F-under pull

## Improvement potential

Not yet rated under the current system — read the criteria in `IMPROVEMENT_POTENTIAL_SYSTEM.md` and record a reading before using this file to order the queue.

### Integrity work recorded this pass

Both pre-ToR leaves were **fabricated and mutual copies**: the grill leaf's three records were a
BBC Good Food pulled-shoulder kebab (a different cut), an African Bites link to a **lamb**-chop
recipe, and a Caribbean Pot URL that pointed at the site's homepage; the pan_sear leaf cited an
unresolved Indian Healthy Recipes URL, a Laylita *seco de chivo* stew whose "75–80 °C chop pull"
was invented, and an African Bites *asun* page for a different dish. Every record in both leaves
carried the same **72–74 °C pull**, both leaves' profiles were near-copies of the hub's, and the
hub's own table had already flagged the copying. All of it is retracted; nothing in the three
current leaves is inherited. The hub's claim that goat loin is "best at medium to well-done
(68–74 °C)" was likewise unsourced — the corpus says the opposite and that is now recorded above.

**Uncounted reference:** BillyDoe Meats' grilling guide (450–500 °F grate, 2–3 min/side, pull
135–140 °F medium-rare and 145 °F medium, rest 3 min, two-zone method) — fetched, but a producer
guide without ingredient quantities.

### Improvement priorities

1. **Doneness pass (no number effect, highest value):** both the hub and `cooking_data.py` recommend `well_done` (68–77 °C) while all six fetched sources cook to 54–63 °C. The engine currently tells users to ruin this cut. Either the recommendation moves to `medium` with the USDA 145 °F whole-cut floor as its ceiling, or the corpus needs a source that actually cooks goat chops grey — none was found.
2. Culinary Group C: a real African or Caribbean goat-chop recipe. South African *braai* chops and Jamaican jerk chops are the obvious routes; both searches surfaced video only.
3. Culinary Group D: essentially a Europe-shaped gap — goat chops are not a Nordic/Baltic dish.
4. One more record per leaf would clear all three count rows; the cheapest is a fourth grilled chop from Italy, Greece or Turkey (all three are documented goat-chop countries, and the Puglian recipe came from a book excerpt that likely has siblings).
5. Queued leaves: `braise` (mixed-cut goat curries are fetched but no chop-specific braise), `tandoor`, `smoker`.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
