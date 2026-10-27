<!-- KCE:CUT
type: cut
slug: short_ribs
name: Short Ribs
name_sv: Korta revben
name_da: Oksetværreb
category: beef
meat: cow
cut_type: Braising Cuts
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: pulled
methods:
- braise
- oven_roast
- oven_broil
- slow_cooker
- smoker
doneness:
- name: pulled
  target_c: 93
  target_f: 200
  min_c: 88
  min_f: 190
  max_c: 96
  max_f: 205
  usda_safe: true
  recommended: true
improvement_potential: 19
cooking_methods_researched: 1
quality_assessed: 2026-10-27
rest_time_min: 10
rest_time_max: 20
carryover_temp_c: 3
-->
# Short Ribs — Cut Overview

## Cut profile

Short ribs are cut from the lower portion of the beef rib cage — either the chuck short ribs (ribs 1–5, with thicker meat and more marbling) or the plate short ribs (ribs 6–10, the longer, meatier "dino rib" cut favoured in American barbecue). The meat consists of the intercostal muscles and the serratus ventralis, muscles that are among the most heavily worked in the animal: constant movement builds dense, collagen-rich fibre bundles that would be inedibly tough cooked quickly. That same density of connective tissue is the source of their culinary value — after sustained low-and-slow cooking the collagen dissolves into gelatin, the intramuscular fat renders, and the result is a self-basting, pull-apart texture with extraordinary depth of flavour.

The bone runs along the underside of each rib section; in the English cut (bone-in cross-cut pieces), the bone and surrounding marrow are visible in cross-section. English-cut short ribs are the standard braising and slow-cooker format. Flanken-cut short ribs slice across multiple bones into thin strips — the Korean galbi format — and are suited to quick grilling rather than long braising. Boneless short ribs are sometimes sold as "beef spare ribs"; they cook similarly to bone-in but finish slightly faster because the bone acts as a heat buffer.

Korean short rib preparations (galbi-jjim for braising, galbi for grilling) treat the cut as a secondary category in `cooking_data.py` under the name `short_ribs` with method `grill`. The temperatures and methods differ substantially from the Western braising tradition: bone-in short ribs for galbi are sliced thinly across the ribs and marinated overnight in a soy-pear-sesame brine before grilling to medium-rare, which corresponds to a different doneness target than the braised pulled preparation.

## Styckesprofil

Revbensspjäll skärs från den nedre delen av nötdjurets revbenskorg — antingen chuck-revbensspjäll (revben 1–5, med tjockare kött och mer marmorering) eller tallriksrevbensspjäll (revben 6–10, det längre, köttrikare "dino rib"-snittet som är populärt i amerikanskt grillkök). Köttet består av mellangärdes- och serratus-ventralis-muskler, bland de hårdast arbetade i djuret: ständig rörelse bygger täta, kollagenrika fiberknippen som hade varit oätliga om de tillagats snabbt. Den höga halten bindväv är källan till deras kulinariska värde — efter lång och långsam tillagning löses kollagenet till gelatin, det intramuskulära fettet smälter ut och resultatet är en självbastande, isärfallande konsistens med ovanlig smakdjup.

Benet löper längs undersidan av varje revbensdel; i det engelska snittet (benfasta tvärsnittsdelar) syns benet och det omgivande märget i tvärsnittet. Engelskt snittade revbensspjäll är standardformatet för brässering och slow cooker. Flanken-snittade revbensspjäll skär tvärs över flera ben i tunna strimlor — det koreanska galbi-formatet — och lämpar sig för snabb grillning snarare än lång brässering. Benfria revbensspjäll säljs ibland som "nötspareribs"; de tillagas på liknande sätt som med ben men blir klara något snabbare eftersom benet fungerar som värmebuffert.

Koreanska revbensspjällstillagningar (galbi-jjim för brässering, galbi för grillning) behandlar styckdelen som en sekundär kategori i `cooking_data.py` under namnet `short_ribs` med metoden `grill`. Temperaturerna och metoderna skiljer sig väsentligt från den västerländska bräseringstraditionen: benfasta revbensspjäll för galbi skärs tunt tvärs över revbenen och marineras över natten i en soja-päron-sesamlake innan de grillas till medium-rare, vilket motsvarar ett annat mörhetsmål än den bräserade, isärpullsade varianten.

## Research files by cooking method

| Method | Leaf file | Status |
|--------|-----------|--------|
| Braise | [short_ribs-braise.md](./short_ribs-braise.md) | ✅ Complete — 5 recipes, CONFORMS TO TOR (2026-04-27) |
| Oven roast | [short_ribs-oven_roast.md](./short_ribs-oven_roast.md) | ⚠️ Partial — 5 records, 4 with numbers, **distinct-tradition gate not met** (2026-10-27) |
| Oven broil | — | ⬜ Owed. Discovered 2026-10-27: Korean LA galbi is a 2–3 minute oven-broiler method, fetched but not yet written up as its own leaf |
| Slow cooker | — | ⬜ Owed |
| Smoker | — | ⬜ Owed |

## Improvement potential

**Improvement potential: 19 / 20** — assessed 2026-10-27 (supersedes the 2026-04-27 number 8, which was
computed from an ad-hoc table rather than the TOR criteria: it counted "+2 braise researched" and "+3 leaf has
5 sources" as credits and never charged the missing culinary group. That table was not the rubric, and this
one is.)

| Criterion | Points | Evidence |
|-----------|--------|----------|
| Cooking methods not researched (`cooking_methods_researched: 1`) | — | survey re-run 2026-10-27: braise, oven-roast, oven-broil (new), slow-cooker, smoker all confirmed from fetched recipes |
| Missing Culinary Group A | — | Chinese-American braise record (Woks of Life) |
| Missing Culinary Group B | — | Australian, US ×3, German, Italian records |
| Missing Culinary Group C | **−1** | no African, Caribbean, Arabic, Levantine or Persian short rib record in any leaf |
| Missing Culinary Group D | — | Swedish ×2 and Ukrainian records |
| `## Cut profile` missing / placeholder / lacks anatomy | — | anatomy written: intercostal + serratus ventralis, bone, English vs flanken cut |
| No method leaf files exist | — | two exist (braise, oven_roast) |
| Safe-temperature evidence | — | USDA 63 °C is far below the 88–96 °C band every source publishes; the band is evidenced |
| Preferred-temperature evidence | — | braise 88–94 °C, oven-roast 90–96 °C |
| Per-method temperature data | — | separate bands and sources per leaf |
| Description duplication | — | oven_roast profile is method-specific, not copied from the hub or the braise leaf |

**Points: −1 Group C → 19.**

**What the number cannot see.** Three leaves this cut declares are still owed — `oven_broil`, `slow_cooker`,
`smoker` — and TOR has no row that charges a declared-but-unwritten leaf, so 19 is honest against the table
and dishonest as a description of the work. Those three are the top of the improvement list below, and they
are why the number is not to be read as "nearly done".

### Data state and gaps

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `leaf_without_number` (oven_roast) | open | 2 of 5 oven records publish no internal temperature and judge by time | S | find one more oven record that probes |
| `duplicate_tradition` (oven_roast) | open | US ×2, German, Italian all Group B; only the Ukrainian record is Group D | M | a Korean oven galbi (already half-found) or a Chinese oven braise would add Group A |
| `group_C_absent` | searched-negative | "short ribs tagine", "beef ribs chermoula", "galbi Moroccan" — nothing citable for this cut | — | none found; record stays open |
| `unwritten_leaf:oven_broil` | open | mykoreankitchen.com LA galbi (Korean, 200 °C broil, 2–3 min a side, no internal target) fetched 2026-10-27 | M | needs 3 more broiler records (Japanese *yakiniku*-style, Filipino, US) |
| `unwritten_leaf:slow_cooker` | open | not researched this pass | M | 4 records from distinct traditions |
| `unwritten_leaf:smoker` | open | not researched this pass | M | Texas + one other smoke tradition |

### Improvement priorities

1. **−1** · Group C: this is the only row the table charges, and the honest outcome may be a searched-negative plus a user-approved wall — the cut is a European/North American barbecue identity.
2. **Owed leaves** · `oven_broil` (one lead already fetched), `slow_cooker`, `smoker`. Each needs 4 records from distinct traditions; the floor for this cut is four leaves and it does not yet have four.
3. **Oven-roast diversity** · replace the second US record with a non-Group-B source when one can be fetched.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
