<!-- KCE:CUT_METHOD
type: cut_method
slug: quail
method: smoker
name: Quail × Smoker
category: poultry
meat: quail
cut_type: Quail
-->
# Quail × Smoker — Recipe Temperature Research

## Cut profile

Quail's small size and low fat make it a natural hot-smoking subject in Asian wok-smoking and tea-smoking traditions — the bird smokes through in 15–20 minutes, far shorter than the multi-hour sessions used for red meat, and its mild flesh takes tea, rice and sugar smoke aromatics readily. Smoking suits the cut because the smoke chamber's moist, moderate heat (unlike a grill's direct radiation) cooks the lean breast gently while seasoning it; the classic Chinese banquet preparation (茶熏鹌鹑) par-cooks before smoking, while Western adaptations finish the bird in an oven or grill to crisp the skin. The fetched source states times and finishing temperatures for the oven stage but no internal pull temperature; none is inferred.

## Styckesprofil

Vaktelns lilla storlek och låga fett halt gör den till ett naturligt ämne för varmrökning i asiatisk wok- och teröknings-tradition — fågeln röks igenom på 15–20 minuter, långt kortare än rött kött, och det milda köttet tar te-, ris- och sockerrökaromat väl. Rökning passar eftersom den fuktiga, måttliga värmen (i motsats till grillens strålning) tillagar det magra bröstet mjukt samtidigt som det kryddas; den klassiska kinesiska bankettberedningen (茶熏鹌鹑) förkokar före rökning, medan västerländska anpassningar slutför i ugn eller på grill. Den hämtade källan anger tider och ugnstemperatur för slutfasen men ingen innertemperatur.

## Source recipes

### 1. Cynthia Gold / Tea Journey — Tea Smoked Quail
**Inspired by**: https://teajourney.pub/tea-smoked-quail/ (fetched 2026-10-23). By Cynthia Gold, tea sommelier at L'Espalier, Mandarin Oriental, Boston; the recipe deliberately adapts Chinese tea-smoking to a Western finish-in-oven workflow.
**Serves**: 6 quail · **Prep**: 10 min (+2 h marinade) · **Cook**: ~15 min smoke (+ oven finish if needed)

**Ingredients**
- ½ cup black tea leaves, divided (Keemun noted as a favourite for smoking)
- ⅓ cup boiling water
- 2 tbsp toasted (dark) sesame oil
- 2 tbsp honey
- 2 tbsp soy sauce
- 1 tsp freshly ground black or Szechuan pepper
- 1 tbsp grated orange zest, preferably mandarin
- 6 quail, whole or semi-boneless
- 8 long strips orange zest
- ½ cup uncooked rice
- ½ cup brown sugar
- 2 cinnamon sticks

**Method**
1. Steep 1 tsp tea leaves in the boiling water 4 minutes; strain and cool. Place an orange-zest strip inside each quail.
2. Combine 2 tbsp of the steeped tea with sesame oil, honey, soy sauce, pepper and grated zest; marinate the quail in a sealed bag 2 hours in the refrigerator, turning midway.
3. Line a wok, hotel pan, stovetop smoker or roasting pan with foil. Combine the remaining tea, rice, brown sugar, cinnamon and remaining zest strips in the bottom as the smoking mixture.
4. Remove quail from the marinade, bring to room temperature, and set on an oiled rack over the smoking mixture. With the exhaust fan running, heat over high until the mixture smokes well, then cover tightly, crimping foil to seal, and reduce to medium-low; smoke 15 minutes. Turn off the heat and let sit 5–10 minutes. (The source notes Asian practice would par-cook before smoking; this version smokes first.)
5. Check the smoke level; repeat with fresh mixture for more. If the quail are not cooked through, finish in a preheated 175 °C (375 °F) oven "for a few minutes until desired doneness is reached." The source gives no internal temperature or explicit pull point; do not infer one.

---

## Temperature consensus

| Source | Stated doneness evidence | Internal/pull temperature |
|---|---|---|
| Cynthia Gold / Tea Journey (US, Chinese technique) | 15 min wok smoke; oven finish at 175 °C "until desired doneness" | Not stated |

Only one fetched recipe source is available for this method. Its endpoint language ("desired doneness") is explicitly subjective, and the oven finish temperature is an oven setting, not a pull target. A second lead exists — Tea-Smoked Quail in Neil Perry's *Rockpool* (Sydney: Murdoch Books) — but the full recipe text was not retrievable in this session, so it is recorded as a book lead, not as collected data. One source cannot satisfy the required 4–6 recipes from distinct culinary traditions; no `recommended_doneness` key follows from this leaf.

## What makes this method special

Tea-smoking cooks quail in aromatic smoke at moderate heat rather than dry radiant heat, so the lean breast picks up flavour while staying moist — the smoke mixture (tea, rice, brown sugar, cinnamon) generates both the volatile aromatics and the steam that moderates chamber temperature. The Chinese banquet tradition par-cooks before smoking; the Western adaptation here reverses that, using the oven as a controlled finish to crisp skin the closed chamber will never dry. The two-stage smoke/finish structure gives the cook explicit control over doneness despite the absence of a stated pull temperature.

## Data applied to cooking_data.py

- `supported_methods`: no change proposed; `smoker` is already listed for quail.
- `recommended_doneness`: no change proposed — one source with a subjective endpoint is insufficient evidence.
- No `method_temperature_ranges` override proposed — one qualitative source is insufficient for a range.

## Summary

Tea-smoking quail seasons the mild flesh with tea-and-sugar smoke while a gentle chamber protects the lean breast — a strong match for the cut, especially with a controlled oven finish for the skin. The one verified source documents the technique end to end but with no probe target, so this leaf establishes method coverage only.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched source (US, Chinese technique) documents wok tea-smoking for quail. The 4–6-source, four-distinct-tradition gate is not met. Book lead recorded (Neil Perry, *Rockpool*, Tea-Smoked Quail) but not collected; Chinese 茶熏鹌鹑 primary sources still to be found. Continue collection before drawing analysis conclusions or calling this leaf complete.
