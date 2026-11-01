<!-- KCE:CUT_METHOD
type: cut_method
slug: pork_loin_steak
method: charcoal_grill
name: Pork Loin Steak × Charcoal Grill
category: pork
meat: pig
cut_type: Chops & Tenderloin
-->
# Pork Loin Steak × Charcoal Grill — Recipe Temperature Research

## Cut profile

A charcoal grill adds two things a gas flame or a pan cannot give this cut: smoke, and a two-
zone fire layout that separates crust-building direct heat from gentle indirect finishing. The
fetched recipe — an exact match for this cut, explicitly boneless pork loin chops an inch
thick, brined — works medium coals with the lid open, sears at a 45-degree angle for
crosshatch marks, and finishes over indirect heat to a stated 60 °C (140 °F) target before a
10-minute rest; the fetched Kingsford technique guide adds the missing chamber numbers,
375–400 °F (190–204 °C) two-zone setups probing at 63 °C (145 °F). For a lean, uniform
2–3 cm steak the brine step in the primary source matters more here than in any indoor
method: smoke and moving dry air together pull moisture fast, and the salt-sugar soak is the
countermeasure. Carryover of 2–4 °C applies after the rest.

## Styckesprofil

En kolgrill tillför två saker som gaslåga eller panna inte kan ge detta stycke: rök, och en
zonindelad eld som skiljer direkt värme för skorpan från indirekt avslutning. Den hämtade
receptet — en exakt träff för stycket, uttryckligen benfria loin-kotletter en tum tjocka,
lagade — arbetar med medium kol med locket öppet, steks i 45-gradersvinkel för
rutmönster och avslutas över indirekt värme mot målet 60 °C före 10 minuters vila; den
hämtade Kingsford-teknikguiden kompletterar med kammarvärden 375–400 °F och son-mål på
63 °C. För en mager, enhetlig 2,5–3,5 cm steke betyder lagningen mer här än i någon inomhus-
metod: rök och torr, rörig luft drar fukt snabbt, och saltsockerlakningen är motmedlet.

## Source recipes

### 1. DadCooksDinner — Grilled Boneless Pork Loin Chops, Brined and Honey Glazed
**Inspired by**: https://www.dadcooksdinner.com/grilled-boneless-pork-loin-chops-brined-and-honey-glazed/ (fetched 2026-10-26). DadCooksDinner (US food publisher, Mike Vrobel). Recipe explicitly calls for boneless pork loin chops — an exact cut match — and gives separate gas and charcoal directions.
**Serves**: yield fields not present in the fetched text (recipe scales from a 3 lb loin) · **Prep**: ~10 min (+ 30 min brining) · **Cook**: ~10–15 min · **Rest**: 10 min (stated in method)

**Ingredients**
- 3 pounds boneless pork loin roast cut into 1-inch chops (about 8), or 3 pounds of 1-inch boneless pork chops
- **Brine**: 1 quart water; ¼ cup table salt; 2 tbsp sugar
- **Glaze**: 4 tbsp honey; 2 tbsp cider vinegar; 1 tsp dried thyme; pinch black pepper

**Method**
1. Stir the brine ingredients until the salt and sugar dissolve. If using a whole loin, cut crosswise into 1-inch chops. Brine at room temperature **30 minutes** while preparing the grill.
2. Stir the glaze ingredients until the honey is dissolved.
3. Prepare the grill for medium heat. For gas: preheat burners on high **10 minutes**, then turn to medium. For charcoal: the source says to **keep the lid open** during grilling.
4. Remove the chops from the brine and pat dry.
5. Grill at a 45-degree angle **3 minutes**, rotate 90 degrees and grill **3 minutes more**.
6. Flip, brush with glaze and grill **3 minutes more**. Check the temperature: target **140 °F (60 °C)**. If not done, rotate, brush with glaze and cook **1–3 minutes more**.
7. Transfer to a platter, brush again with glaze and **rest 10 minutes**.
8. Final serving temperature: **140 °F (60 °C)** target stated by the source (house note: carryover lands ≈145 °F/63 °C at rest).

---

### 2. Kingsford — How to Grill Pork Chops (technique guide)
**Inspired by**: https://www.kingsford.com/grill-basics/how-to-grill-pork-chops/ (fetched 2026-10-26). Kingsford (US charcoal brand's technique guide). **Recorded as a technique guide, not a recipe**: the page publishes grill setup and temperatures with no ingredient list, so it is counted as supporting temperature evidence for this leaf, not as one of the recipe-count sources.
**Serves**: not applicable (guide) · **Prep**: not stated · **Cook**: not stated · **Rest**: not stated

**Guidance as published (key figures)**
- Two-zone charcoal setup: bank coals for direct and indirect zones; grill temperature **375–400 °F (190–204 °C)**.
- Chops go over direct heat for searing marks, then move to indirect heat to finish.
- Target internal temperature **145 °F (63 °C)**; carry over after resting.
- No ingredient list, no serve/prep header — hence guide, not recipe.

---

## Temperature consensus

| Source | Tradition | Stated doneness evidence | Internal/pull temperature |
|---|---|---|---|
| DadCooksDinner (US) | American competition-style brined charcoal grilling | 30-min brine, 3+3 min direct sear flips, glaze, 10-min rest | **140 °F (60 °C)** stated target |
| Kingsford (US, technique guide) | American charcoal-brand technique guidance | Two-zone 375–400 °F setup, direct sear then indirect finish | **145 °F (63 °C)** stated target |

The full observed numerical range is **60–63 °C (140–145 °F)** — both figures are stated
targets rather than measured serving temperatures, and they bracket the USDA line from both
sides (the recipe pulls early for carryover, the guide cites the safety number directly). The
band maps to `cooking_data.py`'s `medium` band (60–66 °C, `usda_safe: true`) with its ceiling
exactly on the 63 °C target. What drives the 3 °C spread is the pull-versus-carryover
convention, not a doneness disagreement: the recipe's 60 °C plus a 10-minute rest lands where
the guide's 63 °C reading is taken. `recommended_doneness` for this method: **`medium`** —
both sources intend the same finish and neither argues for anything above 63 °C.

## What makes this method special

The charcoal grill is the only method in this cut's set where flavour comes from something
other than the meat or a pan: smoke compounds deposited on the wet surface during the indirect
phase bind to the outer millimetres of the steak, something no indoor technique for this cut
reproduces. The two-zone layout exists because of the cut's geometry — a flat, 2–3 cm lean
steak over live coals develops crust fast but dries equally fast, so searing for marks over
direct heat and finishing over the cooler side lets the centre reach 60–63 °C without
scorching the surface. Brining, which the primary source leads with, is the method's other
necessity: unlike a pan where fat bastes, open charcoal air removes moisture continuously, and
a salt-sugar soak raises the meat's water-holding capacity before it ever meets the fire. The
glaze applied during the final flips contributes sugar that browns quickly at grill
temperatures — hence the source's constant rotation and its explicit "lid open" instruction
for charcoal, keeping flare-ups off the honey.

## Summary

A charcoal grill gives a brined pork loin steak smoke and crosshatch char while a two-zone
fire lets the centre finish gently — the fetched recipe targets 140 °F and rests, the
technique guide cites 145 °C-line safety, and both mean the same juicy finish. It matches this
lean, flat cut well because the indirect zone protects the exact moisture the open fire wants
to pull out, and the brine the recipe insists on is what makes that protection real. What you
gain over gas or pan is flavour from smoke; what you give up is precision, since a live fire's
hot spots must be managed by rotation and a probe. Cook it two-zone, glaze late, and rest it.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** The 4–6-source collection gate is not met: **one** fully collected recipe source (US, exact cut match) plus one fetched technique guide (Kingsford, no ingredient list — recorded as guide, not recipe). The distinct-tradition gate also fails as written (US ×1 recipe is alone in the leaf, and the guide is US too — a single-tradition leaf cannot pass a cross-tradition test). Both rows are open agent work, not walls. Honest fix: fetch charcoal-grill pork loin chop recipes from further afield — Argentine or Uruguayan *asado* publications, South African *braai* sources, Korean *gogigui* publications, or Japanese *binchōtan* grilling guides — each would add both count and tradition. Temperature evidence: both sources state explicit targets (140 °F recipe, 145 °F guide), no serving temperature is invented, and the chamber-temperature figure is labelled as such. Method discovered and leaf created 2026-10-26.
