<!-- KCE:CUT
type: cut
slug: sea_bass
name: Sea Bass
name_sv: Havsabborre
name_da: Havbars
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- grill
- oven_bake
- oven_roast
- pan_sear
- steam
doneness:
- name: medium_rare
  target_c: 49
  target_f: 120
  min_c: 46
  min_f: 115
  max_c: 52
  max_f: 125
  usda_safe: false
- name: medium
  target_c: 54
  target_f: 130
  min_c: 52
  min_f: 125
  max_c: 57
  max_f: 135
  usda_safe: false
- name: well_done
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 66
  max_f: 150
  usda_safe: true
  recommended: true
improvement_potential: 16
cooking_methods_researched: 1 # 2026-10-26: enum-wide survey done with 16 fetched sources across five leaves. Confirmed and leafed: pan_sear, grill, oven_roast, steam, oven_bake. Queued leads (error single-source, no leaf yet): charcoal_grill (the Turkish mangal and Greek κάρβουνα recipes are currently counted inside the `grill` leaf with their fuel flagged per row), poach (no fetchable cut-specific recipe found), air_fryer, sous_vide, pan_fry (the flour-dusted pan recipes live in `pan_sear`), smoker, oven_broil. Documented negatives: pressure_cooker, slow_cooker, braise (only sauce-braised branzino fillets, no whole-fish braise), saute (same technique family as pan_sear).
quality_assessed: 2026-10-26
rest_time_min: 0
rest_time_max: 2
carryover_temp_c: 2
-->
# Sea Bass — Cut Overview

## Cut profile

European sea bass (*Dicentrarchus labrax*, Italian: branzino/spigola, Turkish: levrek,
Swedish: havsabborre, Danish: havbars) is a prized lean white fish with moderately firm, flaky
white flesh and a thin but distinctly flavoured skin that renders beautifully crisp in a hot
pan. The fish is built for whole-fish cookery: a slender, torpedo-shaped body with a relatively
thin belly and a much thicker shoulder behind the head, so a single fish carries a real
internal gradient — the shoulder is the only place where a probe reads the true done-ness.
Flesh fat is low (well under 5 %), which is why every tradition here either protects the
surface (salt crust, steaming, skin-on searing) or cooks it fast; there is almost no
intramuscular fat to baste the fish from within. Sea bass is sold as whole fish (typically
400 g–1.5 kg), as skin-on fillets, and as butterflied/boneless fish; the cut's `methods` list
reflects all three forms.

Internal temperature is the reliable doneness indicator: the flesh transitions from
translucent to opaque at roughly 55–58 °C and is fully cooked at 60–63 °C (USDA minimum for
finfish 63 °C / 145 °F). A MEATER probe in thin fillets must be inserted from the edge
(laterally) rather than from above; in whole or butterflied fish it goes through the shoulder
behind the head, never into the belly cavity.

## Styckesprofil

Europeisk havsabborre (*Dicentrarchus labrax*, italiensk: branzino/spigola, turkisk: levrek,
svenska: havsabborre) är en uppskattad mager vitfisk med måttligt fast, flakigt vitt kött och
ett tunt men distinkt smakande skinn. Fisken är byggd för tillagning av hel fisk: en slank,
torpedformad kropp med tunn buk och en betydligt tjockare bog bakom huvudet, så en och samma
fisk har en verklig temperaturgradient — bogen är den enda platsen där en sond visar den
riktiga kärntemperaturen. Fettinnehållet är lågt (klart under 5 %), vilket är anledningen till
att alla traditioner här antingen skyddar ytan (saltcrusta, ångning, stekning med skinnet kvar)
eller tillagar snabbt; det finns nästan inget intramuskulärt fett som bastar fisken inifrån.
Filéer steks skinnsida ned under press i 3–4 minuter och vänds för 1–2 minuter. Innertemperatur
58–63 °C. Skinnet ger det bästa smakdraget på denna fisk.

## Per-method temperature application

| Method | Form | Published temperature evidence | House pull / check | Time and setting |
|---|---|---|---|---|
| `pan_sear` | Skin-on fillets | **None** — all three sources (AU, GR, IT) judge by time and opacity | 60 °C (140 °F) lateral pull | 2–3 min skin side + 1–2 min flesh side; 3 + 3 min at 2 cm |
| `grill` | Whole fish | **None** — US, TR and GR sources all use release-from-grate | 60 °C (140 °F) at the shoulder | 5–7 min + 5 min (US); ~15 min (TR); 15–20 min (GR) |
| `oven_roast` | Whole fish | **145 °F / 63 °C** internal (US/Greek-style source, verbatim) | 63 °C (145 °F) at the shoulder | 400 °F 5 + 5–7 min then broil 3–4; 180 °C fan 20–35 min (IT); 180 °C 20 min after sear (RU); 200 °C ~30 min (SE) |
| `steam` | Whole fish and bone-in cuts | **None** — TH, CN and JP sources all use time plus a covered rest | 58–60 °C (136–140 °F) before the rest | 8–12 min over boiling water (TH); 10 min + 5 min off heat (CN); ~6 min microwave (JP) |
| `oven_bake` | Whole unscaled fish in a salt crust | **None** — and two of three sources give no oven temperature either | 60–63 °C (140–145 °F) through a lifted patch of crust | 220 °C 25 min per 500 g + 15 min per extra 500 g (IT); weight table 20–45 min (ES); ~35 min (RU) |

The single published internal temperature across all 16 fetched sources is the US/Greek-style
roast's **145 °F / 63 °C**, which is exactly this cut's `usda_safe_c`. Everything else in the
table above is house guidance derived from that one number, and it is labelled as such in
every leaf — the finding of this pass is how completely the world's sea-bass cookery relies on
mechanical and visual cues (translucency, release from the grate, the tail pulling free) rather
than on thermometers.

## Research files by cooking method

- [Pan Sear](./sea_bass-pan_sear.md) — skin-on fillets, the crisp-skin tradition
- [Grill](./sea_bass-grill.md) — whole fish over gas or charcoal
- [Oven Roast](./sea_bass-oven_roast.md) — whole fish in a hot oven
- [Steam](./sea_bass-steam.md) — the East Asian whole-fish method
- [Oven Bake](./sea_bass-oven_bake.md) — whole fish sealed in a salt crust

## Improvement potential

| Criterion | Points |
|-----------|----------|
| Cooking methods not researched | none — survey done, `cooking_methods_researched: 1` |
| Missing method leaf files (grill, oven_roast were declared without leaves) | none — 5 leaves now exist |
| Missing Culinary Group A | none — China, Thailand, Japan |
| Missing Culinary Group B | none — Italy, Greece, US, Australia |
| Missing Culinary Group C | none — Turkey |
| Missing Culinary Group D | none — Russia, Sweden |
| No safe / preferred temperature data | none — 145 °F / 63 °C published by a fetched source, level with `usda_safe_c` |
| Per-method temperature data missing | none — the table above plus per-leaf consensus |
| Method file copies parent cut profile | none — `pan_sear` rewritten with its own profile |
| Source count below 4 in a leaf (branch convention) | −1 × 4 (`pan_sear` 3, `grill` 3, `steam` 3, `oven_bake` 3) |
| Distinct-tradition gate failed in a leaf | none — every leaf's sources are from distinct traditions |

### Improvement priorities

1. Four leaves sit at three sources each. The fix is ordinary fetch work, not a wall: `grill` needs a fourth grill-tradition source (an Italian *alla griglia* or a US gas-grill recipe), `steam` a fourth steaming tradition (Korean *jjim* or Vietnamese *hấp*), `pan_sear` a fourth European pan source, and `oven_bake` a French *loup au sel* or US salt-baked fish.
2. **No temperature evidence in four of five leaves** · Only `oven_roast` carries a published internal temperature. Adding sources that state one (US publications routinely print 145 °F) would let the per-method rows stop relying on house guidance.
3. **`steam` quantity gate** · Xiachufang publishes no amounts and Cookpad Japan publishes 少々; a Chinese-language or Japanese source with full quantities would clear that shortfall.
4. **Queued methods not yet leafed** · `charcoal_grill` (recipes currently inside `grill`, fuel flagged per row), `poach`, `air_fryer`, `sous_vide`, `pan_fry` (recipes currently inside `pan_sear`), `smoker`, `oven_broil`. Each widens before it is declared — declaring a method without a leaf fails the missing-leaf criterion.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*
