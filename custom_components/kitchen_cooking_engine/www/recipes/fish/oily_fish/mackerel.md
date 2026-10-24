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
- grill
- pan_fry
- oven_bake
- smoker
- simmer
- steam
- air_fryer
doneness:
- name: medium
  target_c: 57
  target_f: 135
  min_c: 54
  min_f: 130
  max_c: 60
  max_f: 140
  usda_safe: false
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 68
  max_f: 154
  usda_safe: true
  recommended: true
quality_score: 5
cooking_methods_researched: 0 # Survey 2026-10-24 found +3 methods (simmer, steam, air_fryer, all registered with leaves), but enum inventory still has plausible unverified leads (poach, braise, pressure_cooker, sous_vide, boil) — stays 0 until collected or ruled out.
quality_assessed: 2026-10-24
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

- [Grill](./mackerel-grill.md) — ⚠️ partial, 3 fetched sources (SE, ES, KR)
- [Pan Fry](./mackerel-pan_fry.md) — ⚠️ partial, 3 fetched sources (SE, JP, TR)
- [Oven Bake](./mackerel-oven_bake.md) — ⚠️ partial, 3 fetched sources (JP, UK, TR)
- [Smoker](./mackerel-smoker.md) — ⚠️ partial, 2 fetched sources (UK, US/Eastern-European; 63 °C stated endpoint)
- [Simmer](./mackerel-simmer.md) — ⚠️ partial, 2 fetched sources (JP miso-nikomi, IN ayala curry) — **new method 2026-10-24**
- [Steam](./mackerel-steam.md) — ⚠️ partial, 1 fetched source (ID pepes kembung) — **new method 2026-10-24**
- [Air Fryer](./mackerel-air_fryer.md) — ⚠️ partial, 1 fetched source — **new method 2026-10-24**

## Quality score

**Score: 5 / 20** — assessed 2026-10-24. From-scratch reassessment on the deduction
scale (no anchoring to the previous 7 — inflation doc Patterns 4 and 9). The 2026-05-31
table also credited `mackerel-smoker.md` with 3 sources, two of which were uncited
"inspired by Swedish tradition" composites with invented internal temperatures; those
were removed in the 2026-10-24 source-integrity repair, so the repaired collection is
smaller but every remaining source is fetched and citable.

| Criterion | Deduction | Evidence |
|-----------|-----------|----------|
| Cooking methods not researched (`cooking_methods_researched: 0`) | −8 | Survey 2026-10-24 found and registered 3 methods beyond the declared list (simmer — JP miso-nikomi + IN curry; steam — ID pepes; air_fryer), but the enum inventory is not complete: poach, braise (sear-then-braise form), pressure_cooker, sous_vide and boil all have plausible recipes that were not verified this session. Field stays 0 until they are collected or cleanly ruled out. |
| Partial leaves (< 4 fetched sources): pan_fry (3), grill (3), oven_bake (3), smoker (2), simmer (2), steam (1), air_fryer (1) | −7 | −1 per partial leaf (branch convention). All 7 leaves are partial. |

**Total deduction −15 → 5/20.** Criteria checked with evidence and receiving **0 deduction**:

- **Culinary Groups A/B/C/D all covered** across the leaves — A: Japanese (pan_fry, oven_bake, simmer), Korean (grill), Indian (simmer), Indonesian (steam); B: British (oven_bake, smoker), Spanish (grill), US/Eastern-European (smoker); C: Turkish (pan_fry, oven_bake — genuine Group C primaries, fixing the 2026-05-31 gap); D: Swedish (pan_fry, grill).
- Method leaf files exist — 7 of them.
- **USDA safe temperature supported by research evidence** — `mackerel-smoker.md`'s Taste of Artisan source states an explicit 63 °C / 145 °F internal endpoint held 30 minutes.
- **Culinary preferred temperatures supported by research evidence** for the `well_done` key (the measured 63 °C endpoint plus convergent full-doneness practice in every source). **Flagged**: the `medium` doneness option (57 °C) has zero fetched-source support and is listed in the priorities below.
- Per-method temperature nuance carried by each leaf's own consensus section (all record measured/absent endpoints per method without inference).
- No description copy-paste: every leaf's `## Cut profile` is method-specific.

Note on definitions: the `doneness` block's `medium` and `well_done` values match the global `FISH_MEDIUM` / `FISH_WELL_DONE` ranges in `cooking_data.py`; no mismatch found.

### Improvement priorities

1. Verify or rule out the remaining enum methods — poach (court-bouillon), braise (sear-then-braise), pressure_cooker, sous_vide, boil — then re-assess `cooking_methods_researched`.
2. Raise the leaves to the 4–6-source gate, starting with the thinnest: steam (+3), air_fryer (+3), smoker (+2), simmer (+2), then pan_fry/grill/oven_bake (+1 each).
3. Resolve the `medium` doneness option: no fetched source cooks mackerel below full doneness. Either locate genuine medium/rare mackerel practice (e.g. seared tataki, sous vide) as research evidence, or retire the option.
4. Deepen Group C beyond Turkey — find a mackerel-specific Moroccan, Egyptian or West African primary (the Cooking With Alia charmoula bake names "any whole fish", so it is a lead, not a source).

*Score is recalculated each time a new method leaf is added or the cut profile is updated.*
