<!-- KCE:CUT
type: cut
slug: mackerel
name: Mackerel
name_sv: Makrill
name_da: Makrel
category: fish
meat: oily_fish
cut_type: Oily Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- air_fryer
- boil
- braise
- grill
- oven_bake
- oven_broil
- oven_roast
- pan_fry
- pan_sear
- poach
- pressure_cooker
- saute
- simmer
- smoker
- sous_vide
- steam
doneness:
# 2026-10-24: the `medium` option (57 °C) was retired — no fetched mackerel source cooks the
# fish below full doneness, and the only measured endpoint in the collection is 63 °C.
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 68
  max_f: 154
  usda_safe: true
  recommended: true
quality_score: 6
cooking_methods_researched: 1 # Supported-method inventory reviewed 2026-10-24: all 16 enum methods have research leaves; slow-cooker search found only sauce cooked slowly with mackerel grilled; charcoal is a grill fuel/setup variant.
quality_assessed: 2026-10-25
rest_time_min: 2
rest_time_max: 5
carryover_temp_c: 2
-->
# Mackerel — Cut Overview

## Cut profile

Atlantic mackerel (Scomber scombrus) is a medium-sized, highly oily pelagic fish found throughout the North Atlantic. It is typically used as whole butterflied fillets (two connected fillets from one fish, skin on) or as individual skin-on fillets. The fat content is among the highest of common market fish (up to 20 g/100 g at peak autumn season), making it exceptionally well-suited to dry heat: grilling and pan-frying. The high fat content renders visibly on a hot grill or pan and self-bastes the flesh. The natural oils also make mackerel a prime candidate for Japanese salt-grilling (shioyaki) and for Moroccan–spiced oven preparations. It must be cooked on the day of purchase for best quality. Sources from all culinary groups (Nordic grill, Japanese shioyaki, Moroccan chermoula) converge on full doneness — opaque throughout, flaking at the bone. Probe placement is in the thickest part of the fillet, parallel to the spine.

## Styckesprofil

Atlantisk makrill (Scomber scombrus) är en medelstora, mycket fet pelagisk fisk utbredd i hela Nordatlanten. Den används typiskt som hel fjärilsfilé (två sammanhängande filéer från en fisk, med skinn) eller som enskilda filéer med skinn. Fettinnehållet är bland de högsta hos vanliga marknadsförda fiskar (upp till 20 g/100 g på hösten vid säsongstopp), vilket gör den utmärkt lämpad för torrvärme: grillning och stekning. Det höga fettinnehållet smälter synligt på het grill eller panna och bastar köttet. Makrillens naturliga oljor gör den också till en naturlig kandidat för japansk saltgrillning (shioyaki) och för ugnsrätter med marockansk kryddning. Fisken bör tillagas på inköpsdagen för bästa kvalitet. Källor från alla kulinariska grupper (nordisk grillning, japansk shioyaki, marockansk chermoula) konvergerar mot full stekning — ogenomskinlig rakt igenom, lossnar vid ben. Sond placeras i tjockaste delen av filén, parallellt med ryggraden.

## Research files by cooking method

- [Grill](./mackerel-grill.md) — ✅ complete, 5 fetched sources (African-diaspora, ES, KR, VN + one flagged Spanish-mackerel lead); no internal temp stated by any source — **expanded 2026-10-25**
- [Pan Fry](./mackerel-pan_fry.md) — ⚠️ partial, 3 fetched sources (SE, JP, TR)
- [Oven Bake](./mackerel-oven_bake.md) — ⚠️ partial, 3 fetched sources (JP, UK, TR)
- [Smoker](./mackerel-smoker.md) — ⚠️ partial, 2 fetched sources (UK, US/Eastern-European; 63 °C stated endpoint)
- [Simmer](./mackerel-simmer.md) — ⚠️ partial, 2 fetched sources (JP miso-nikomi, IN ayala curry) — **new method 2026-10-24**
- [Steam](./mackerel-steam.md) — ⚠️ partial, 1 fetched source (ID pepes kembung) — **new method 2026-10-24**
- [Air Fryer](./mackerel-air_fryer.md) — ✅ complete, 4 fetched sources (JP-labelled, UK, African/American, South Indian; 63 °C / 145 °F stated) — **new method 2026-10-24, completed 2026-10-25**

- [Sous Vide](./mackerel-sous_vide.md) — ⚠️ partial, 4 fetched sources, bath temperatures 50°C / 122°F
- [Pressure Cooker](./mackerel-pressure_cooker.md) — ⚠️ partial, 4 fetched sources; 1-minute to 50-minute published pressure times, no internal temps
- [Braise](./mackerel-braise.md) — ⚠️ partial, 4 fetched sources (KR ×2, IT, VN); three traditions only, no internal temps — **expanded 2026-10-25**
- [Poach](./mackerel-poach.md) — ⚠️ partial, 5 fetched sources; species/byline limits noted, no recipe-specific internal temps
- [Boil](./mackerel-boil.md) — ⚠️ partial method inventory; historical recipes and modern boil-then-simmer distinction recorded
- [Oven Roast](./mackerel-oven_roast.md) — ⚠️ partial, 4 fetched whole-fish recipes; no internal endpoints
- [Oven Broil](./mackerel-oven_broil.md) — ⚠️ partial, 3 fetched recipes; no internal endpoints
- [Pan Sear](./mackerel-pan_sear.md) — ⚠️ partial, 1 Spanish-mackerel chef recipe; species differs from Atlantic/Indian
- [Sauté](./mackerel-saute.md) — ⚠️ partial, 1 named cookbook source; method is confirmed but overlaps pan_fry and needs additional traditions
- [Slow Cooker](./mackerel-slow_cooker.md) — no direct slow-cooked fish source found; existing lead slow-cooks sauce and grills fish
- [Charcoal Grill](./mackerel-charcoal_grill.md) — charcoal documented as grill fuel/setup variant, not separate method

## Quality score

**Score: 6 / 20** — reassessed 2026-10-25, up from 4 on 2026-10-24. Two leaves reached the
4–6-source / four-distinct-tradition gate (grill, air_fryer) and one was expanded from two Korean
sources to four sources across three traditions (braise, still short of the gate). The deduction
scale is unchanged and no leaf was credited for anything it does not hold: the score rose only
because two leaves stopped being partial. Context for the earlier number: the 2026-05-31 table
credited `mackerel-smoker.md` with 3 sources, two of which were uncited "inspired by Swedish
tradition" composites with invented internal temperatures; those were removed in the 2026-10-24
source-integrity repair, so the repaired collection is smaller but every remaining source is
fetched and citable.

| Criterion | Deduction | Evidence |
|-----------|-----------|----------|
| Cooking methods researched (`cooking_methods_researched: 1`) | 0 | All 16 supported enum methods have a research leaf; slow-cooker was investigated and no direct fish-cooking recipe was verified. Charcoal remains a grill setup rather than a separate method. |
| Partial method leaves / incomplete source-diversity gates | −14 | −1 per registered method leaf that remains partial: pan_fry (3), oven_bake (3), smoker (2), simmer (2), steam (1), sous_vide (4 but tradition gate partial), pressure_cooker (4 but species/source limits), braise (4 sources but 3 traditions — two are Korean), poach (5 but qualification limits), boil (historical/ambiguous), oven_roast (4 but tradition/species limits), oven_broil (3), pan_sear (1), saute (1). Grill (5 sources, 4 traditions) and air_fryer (4 sources, 4 traditions) no longer deduct. |

**Total deduction −14 → 6/20.** Criteria checked with evidence and receiving **0 deduction**:

- **Culinary Groups A/B/C/D all covered** across the leaves — A: Japanese (pan_fry, oven_bake, simmer), Korean (grill), Indian (simmer), Indonesian (steam); B: British (oven_bake, smoker), Spanish (grill), US/Eastern-European (smoker); C: Turkish (pan_fry, oven_bake — genuine Group C primaries, fixing the 2026-05-31 gap); D: Swedish (pan_fry, grill).
- Method inventory includes 18 mackerel research files: 16 supported enum leaves, one investigated but unsupported slow-cooker lead, and one charcoal-grill variant.
- **USDA safe temperature supported by research evidence** — `mackerel-smoker.md`'s Taste of Artisan source states an explicit 63 °C / 145 °F internal endpoint held 30 minutes.
- **Culinary preferred temperatures supported by research evidence** for the `well_done` key (the measured 63 °C endpoint plus convergent full-doneness practice in every source). The `medium` doneness option (57 °C), which had zero fetched-source support, was **retired on 2026-10-24** from this file and from `cooking_data.py`, so the panel now offers only the measured band.
- Per-method temperature nuance carried by each leaf's own consensus section (all record measured/absent endpoints per method without inference).
- No description copy-paste: every leaf's `## Cut profile` is method-specific.

Note on definitions: after the retirement the `doneness` block carries only `well_done`, matching `temperature_ranges=[FISH_WELL_DONE]` in `cooking_data.py`; no mismatch found.

### Improvement priorities

1. Expand the one-source `saute` lead and continue refining its boundary with `pan_fry`/`pan_sear`; the inventory survey is complete enough to set `cooking_methods_researched: 1`, but individual method leaves remain partial.
2. Raise the remaining leaves to the 4–6-source gate, starting with the thinnest: steam (+3), saute (+3), pan_sear (+3), smoker (+2), simmer (+2), then pan_fry/oven_bake/oven_broil (+1 each). Braise is the exception — it already holds four sources and needs a **fourth tradition** (its two Korean sources duplicate), so adding another Korean or Italian source cannot complete it; the cheapest route is a Chinese red-braised or Japanese *nimono* mackerel primary. Grill and air_fryer were completed on 2026-10-25 and are no longer on this list.
3. ~~Resolve the `medium` doneness option~~ — **done 2026-10-24**: retired, because no fetched source cooks mackerel below full doneness. Reopen only if a *measured* medium preparation (tataki, sous vide) is collected.
4. Deepen Group C beyond Turkey — find a mackerel-specific Moroccan, Egyptian or West African primary (the Cooking With Alia charmoula bake names "any whole fish", so it is a lead, not a source).

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
