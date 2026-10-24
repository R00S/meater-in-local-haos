<!-- KCE:CUT_METHOD
type: cut_method
slug: herring
method: smoker
name: Herring × Smoker
category: fish
meat: oily_fish
cut_type: Oily Fish
-->
# Herring × Smoker — Recipe Temperature Research

## Cut profile

Herring's high fat content (10–20% by season) makes it one of the classic hot-smoking fish: the fat protects the flesh through long, low smoke phases and carries smoke-soluble aromatics into the meat. The fetched source documents a three-phase cabinet protocol — a dry phase to form the pellicle, a long cool smoke phase, and a hot finishing phase to a measured internal endpoint — and is one of the rare recipe families in this collection that states an internal pull temperature explicitly. The Swedish compact-box tradition (ABU-röken) is well documented culturally but no fetchable quantified recipe could be located in this session; the previous version of this leaf carried an invented ABU-röken recipe with fabricated times and a 63 °C pull. Those unsourced numbers have been removed — the tradition is real, the specifics were not citable.

## Styckesprofil

Sills höga fettinnehåll (10–20 % beroende på säsong) gör den till en klassisk varmrökningsfisk: fettet skyddar köttet genom långa, låga rökfaser och bär rökaromat in i köttet. Den hämtade källan dokumenterar en trefasig skåprotokoll — torkfas, lång kallrökningsfas, och het slutfas till mättad innertemperatur — och är en av de få receptfamiljerna i samlingen som anger en uttrycklig dragtemperatur. Den svenska röklåde-traditionen (ABU-röken) är kulturellt väldokumenterad men ingen hämtbar kvantifierad receptkälla kunde hittas i denna session; den tidigare versionen av detta blad bar på ett påhittat ABU-röken-recept med fabricerade tider och 63 °C dragning. De osourcade siffrorna har tagits bort — traditionen är riktig, detaljerna gick inte att citera.

## Source recipes

### 1. MySmoker Manufacturing — Hot Smoked Herring
**Inspired by**: https://www.mysmoker.ca/backyard-smokehouse-recipes/smoked-herring/ (fetched 2026-05-31). Canadian smoker manufacturer's backyard smokehouse recipe; three-phase hot-smoking protocol for a dedicated smoker cabinet.
**Serves**: variable · **Prep**: brine 2 h + pellicle drying · **Cook**: about 4 h total · **Rest**: cool in air

**Ingredients**
- Fresh whole herring (larger fish preferred)
- Brine: 65 g salt per litre of water, 7 allspice grains and 5 bay leaves per litre
- Alder wood chips; optional juniper berries for the final chip load

**Method**
1. Prepare the brine: boil a little water with the allspice and bay leaves, cool, and combine with the remaining cold water and salt. Submerge the cleaned herring for **2 hours at room temperature** (brine 1.5× the fish weight).
2. Rinse in cold water. Hang or rack the fish at room temperature until a slightly tacky pellicle forms; use toothpicks to hold the belly open.
3. Preheat the smoker to **40 °C (105 °F)** and load the fish.
4. **Phase 1 — dry**: 30 minutes at 40 °C without smoke.
5. **Phase 2 — smoke**: raise to **50 °C (122 °F)**; introduce alder smoke at medium density and smoke **3 hours** (juniper berries optionally in the final chip load).
6. **Phase 3 — finish**: raise the smoker to **80 °C (176 °F)** and continue until internal temperature = **60 °C (140 °F)**.
7. **Pull at 60 °C** (140 °F) — the source's explicit measured internal endpoint; insert the probe into the thickest dorsal muscle, tip clear of the spine.
8. Remove, cool in air, refrigerate several hours; serve cold or vacuum-pack and freeze. The source states no final serving temperature (the product is served cold).

---

## Temperature consensus

| Source | Method | Smoker/chamber settings | Pull temp |
|--------|--------|------------------------|-----------|
| MySmoker.ca (CA) | Cabinet, three-phase | 40 → 50 → 80 °C over ~4 h | **60 °C (140 °F)** stated |

One fetched source states an explicit internal pull temperature of 60 °C (140 °F), which sits below the 63 °C (145 °F) USDA safe internal temperature recorded for fish — a real divergence between a commercial smokehouse protocol and food-safety guidance, recorded here rather than resolved (the long brine and extended low-temperature phase are the protocol's implicit safety argument, but the source does not state that argument). The 4–6-source, four-tradition gate is not met (1 of 4; Group B/North America only).

## What makes this method special

Three-phase hot smoking decouples the three things a single hot smoke conflates: pellicle formation (dry, no smoke, 40 °C — the tacky surface that makes smoke adhere), flavour deposition (long cool smoke at 50 °C), and through-cooking (short hot finish to a measured core). Herring's fat carries the smoke aromatics deep into the flesh and prevents the drying that a lean fish would suffer over four hours; the measured 60 °C finish keeps the texture buttery rather than flaky-dry. This is one of the few methods in the whole collection where the source publishes a probe endpoint.

## Data applied to cooking_data.py

- `supported_methods`: no change proposed; `smoker` is already listed for herring.
- `recommended_doneness`: no change proposed — one source's 60 °C endpoint is below the 63 °C recorded safe line; insufficient evidence to move a fish safety default, but the divergence is documented here for future leaves.
- No `method_temperature_ranges` override proposed — one temperature-bearing source is insufficient for a range; revisit if 2+ more sources are collected.

## Summary

Hot-smoked herring is a three-phase cabinet cook that ends at a measured 60 °C core — one of the rare recipes in this collection that publishes a probe target at all. The single Canadian source is temperature-rich but tradition-poor, so this leaf establishes a real pull-temperature anchor for the cut while leaving the diversity gate open.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched source (CA, Group B) documents three-phase hot smoking with an explicit 60 °C pull. The 4–6-source, four-tradition gate is not met. The Swedish ABU-röken tradition is documented culturally (Matkult.se, see `baltic_herring-smoker.md`) but no fetchable quantified recipe was found; the previously listed ABU-röken numbers were unsourced and have been removed. Continue collection before drawing analysis conclusions.
