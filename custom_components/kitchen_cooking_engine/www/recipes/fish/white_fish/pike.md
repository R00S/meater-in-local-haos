<!-- KCE:CUT
type: cut
slug: pike
name: Pike
name_sv: Gädda
name_da: Gedde
category: fish
meat: white_fish
cut_type: White Fish
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: well_done
methods:
- pan_fry
- oven_bake
- grill
- smoker
- braise
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
improvement_potential: 14
cooking_methods_researched: 1
quality_assessed: 2026-05-31
rest_time_min: 0
rest_time_max: 3
carryover_temp_c: 2
-->
# Pike — Cut Overview

## Cut profile

Northern pike (*Esox lucius*, Swedish: gädda, German: Hecht, French: brochet, Finnish: hauki) is a large, lean freshwater predator widely distributed across Europe, North Asia, and North America. Fat content is very low (1–2 g per 100 g), and the white flesh is firm with a mild, slightly sweet flavour. The main challenge with pike is its extensive Y-bone structure (inter-muscular bones that fork into fine Y-shapes throughout the fillet); traditional preparation either smokes or bakes the fish whole so that the fine bones soften and can be eaten, or debones the fillet using a specialist cut pattern. Hot smoking whole pike in a stovetop box smoker (*abu-röken* / *röklåda*) is a classic Scandinavian and Eastern European preparation where the bones become soft enough to chew through — the fish is gutted, left whole on the bone, and smoked at box temperature for 15–25 minutes. Oven-baked pike stuffed with herbs is traditional in French (*brochet au beurre blanc*) and Central European cuisines. Pan-frying is best with carefully deboned fillets. Pike is also central to Eastern European Jewish cuisine (*gefilte fish*) where it is minced to avoid the bone problem entirely. Probe placement for whole smoked pike: insert along the top of the fish into the thickest shoulder muscle. For fillets: insert into the thickest cross-section avoiding bones.

## Styckesprofil

Gädda (*Esox lucius*; tyska: Hecht; franska: brochet; finska: hauki) är en stor, mager sötvattensrovfisk med mycket låg fetthalt (1–2 g/100 g) och fast, vitt, milt kött. Det stora utmaningen är gäddans y-bensstruktur (intermuskulära ben som grenar sig i Y-form genom filén); traditionell beredning antingen röker eller bakar fisken hel så att benen mjuknar och kan ätas, eller urbenar filén med speciell skärteknik. Varmrökning av hel gädda i röklåda (abu-röken) är en klassisk skandinavisk och osteuropeisk metod — fisken rensas, lämnas hel på benet och röks 15–25 min tills benen blivit tuggbara. Ugnsbakad gädda fylld med örter är tradition i fransk matlagning (*brochet au beurre blanc*). Sond placeras längs ryggen in i tjockaste axelmuskel (hel fisk) eller i tjockaste del av filén.

## Research files by cooking method

- Pan Fry — no research file yet
- Oven Bake — no research file yet
- Grill — no research file yet
- Smoker — no research file yet
- [Braise](./pike-braise.md)

## Improvement potential

**Improvement potential: 14 / 20** — assessed 2026-05-31

| Criterion | Deduction |
|-----------|----------|
| Cooking methods not researched | — (done: `cooking_methods_researched: 1`) |
| Missing method leaf files (4 of 5 declared: pan_fry, oven_bake, grill, smoker) | −4 |
| Partial leaf files | — (none; braise leaf ✅ CONFORMS TO TOR with 4 sources) |
| Method leaf copies parent cut profile | — (none; braise profile is method-specific) |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | — (covered: DE-Alsace / FR-Burgundy / DE in pike-braise.md) |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | — (covered: SE in pike-braise.md) |

Groups A and C absent — braised pike is a Central/Western European tradition (*matelote*, *quenelles de brochet*); no verified East Asian, African, Arabic, or Caribbean pike recipe found. Other 4 method leaves not yet created.

### Improvement priorities

1. **−4** · Missing method leaf files — create `pike-pan_fry.md`, `pike-oven_bake.md`, `pike-grill.md`, and `pike-smoker.md`, each with 4–6 diverse source recipes.
2. **−1** · Missing Culinary Group A tradition — pike (*gädda*) exists in Chinese freshwater fishing; search for Chinese or Japanese preparations.
3. **−1** · Missing Culinary Group C tradition — search for pike in any African, Arabic, Persian, or Caribbean cooking context.

*Improvement potential is recalculated each time a new method leaf is added or the cut profile is updated.*

## Data state and gaps

<!-- ledger-state: leaves=1 sources=4 silent=0 silent_leaves=0 methods=braise -->

State on 2026-10-26: one leaf (braise) with four records. The cut declares five methods; four have no leaf.
This pass researched `oven_bake` and could not reach the collection minimum, so no leaf was written and the
verified evidence is recorded here instead - the alternative was a leaf built from two records, which the
analysis gate forbids.

| gap | status | evidence | effort | yield |
|---|---|---|---|---|
| `hub_method_without_leaf:oven_bake` | open, research started | **one verified recipe**: johansmat.se "Ugnsbakad hel gädda med vitvinssås" - whole 1 kg pike, herbs and lemon in the belly, sealed foil, **175 °C about 45 minutes, to 54 °C next to the bone**. **One verified technique record**: tasteline.com "Foliebakad gädda" - **275 °C** oven, and cooking time calculated from the fish's back width (30 min for 4 cm, +5 min per extra cm), with no internal temperature at all. **Two fetch failures**: kokaihop.se (snippet states 52 °C at the thickest point) and koket.se (225 °C whole pike) returned no readable recipe body | S | two more verified pike oven records would close this leaf; both leads above are one fetch away from being countable |
| `hub_method_without_leaf:pan_fry` | open | hub declares `pan_fry`; no leaf. Leads found: norrmejerier.se "Stekt gäddfilé med ansjovissås" and martha.fi (2 min per side in butter) | S | the most likely next leaf: pike pan-fried in butter is standard in Sweden and Finland |
| `hub_method_without_leaf:grill` | open | hub declares `grill`; no leaf and no record found this pass | M | unknown; pike is more often smoked or fried than grilled, so this may end as a searched-negative |
| `hub_method_without_leaf:smoker` | open | hub declares `smoker`; no leaf. Pike is smoked in Sweden and Finland, but no record was fetched | M | a smoked-pike leaf; the same 60-80 °C box-smoker pattern as the other freshwater fish in this collection |
| `pike_bone_structure` | recorded | not derivable by the sweep: pike is exceptionally bony, and both verified records are written around that (whole fish in foil, flesh lifted off the bones after cooking) | - | a method that assumes fillets (pan_fry, air_fryer) needs a deboning note in its profile |
