<!-- KCE:CUT_METHOD
type: cut_method
slug: goat_leg
method: slow_cooker
name: Goat Leg Roast × Slow Cooker
category: game
meat: goat
cut_type: Goat
-->
# Goat Leg × Slow Cooker — Recipe Temperature Research

## Tree position

| Field | Value |
|-------|-------|
| Category | `game` |
| Cut type folder | `goat/` |
| Cut slug | `goat_leg` |
| Method slug | `slow_cooker` |
| File | `goat_leg-slow_cooker.md` |
| Full path | `docs/recipe_research/game/goat/goat_leg-slow_cooker.md` |

## Cut profile

The slow cooker is the modern home of goat-leg curry: bone-in leg pieces spend 4–5 hours in a
sealed moist environment just under simmering, which is exactly the regime the cut's collagen
demands — and the appliance's sealed lid does what the Caribbean and Indian braising pot's lid
does, without any attention. Both fetched sources use bone-in goat from the leg region cut
into pieces (Caribbean curry goat; Indian goat curry where the author notes "typically we get
goat leg cut into pieces"), both season heavily and cook to tenderness, and neither states an
internal temperature. The result is braise-equivalent: fall-apart meat in a spiced sauce.

## Source recipes

### 1. Ultimate Slow Cooker (CrockPot) Curry Goat — Chris De La Rosa / CaribbeanPot.com
**Inspired by**: https://caribbeanpot.com/ultimate-slow-cooker-curry-goat/ (fetched 2026-10-24). Chris De La Rosa, CaribbeanPot.com; Caribbean tradition (Jamaican and Trinidadian). Ingredient line: "3 pounds goat bone-in, cleaned and trimmed."

**Serves**: 6 · **Prep**: not stated · **Cook**: 5 h · **Rest**: not stated

**Ingredients**
- 3 pounds goat bone-in, cleaned and trimmed
- 4 large potatoes, cut into quarters
- 1 Scotch bonnet pepper, sliced or whole
- 2 tablespoons Caribbean Green Seasoning
- 2 tablespoons curry powder
- 1 large onion, diced
- 5 sprigs thyme
- 4–6 cloves garlic, smashed
- 3–5 pieces ginger, thinly sliced
- 8 pimento berries, whole
- 1 large tomato, diced
- 3/4 tablespoon salt
- 1/4 teaspoon black pepper
- 2 scallions, chopped
- 2 tablespoons water
- (fresh chopped cilantro to finish; quantity not listed)

**Method**
1. Add all the ingredients to the slow cooker and stir well to combine.
2. Set the slow cooker on **low** and cook **5 hours**.
3. After 4.5 hours, check for doneness. Skim the surface fat and remove the Scotch bonnet if it was added whole.
4. Taste and adjust salt. To thicken, mash some potatoes or cook uncovered 20–30 minutes more.
5. Top with fresh chopped cilantro before serving.

**Probe and endpoint**: no probe step. **no internal temperature stated** — the endpoint is 5 hours on low plus the tenderness check at 4.5 hours.

---

### 2. Slow Cooker Goat Curry — Ashley / My Heart Beets
**Inspired by**: https://myheartbeets.com/slow-cooker-goat-curry-indian/ (fetched 2026-10-24). Ashley, My Heart Beets; Indian tradition (North Indian family cooking). Ingredient line: "2 pounds goat meat"; the recipe note says "you can use boneless or bone-in goat stew meat. Typically we get goat leg cut into pieces" — leg pieces are the author's stated norm.

**Serves**: 6 · **Prep**: 10 min · **Cook**: 5 h · **Rest**: not stated

**Ingredients**
- 2 pounds goat meat (typically goat leg cut into pieces)
- 4 whole cloves or a pinch of ground cloves
- 2 cardamom pods or a pinch of ground cardamom
- 2 red onions, chopped
- 1 1/2 inch knob fresh ginger, minced
- 3 cloves garlic, minced
- 1–2 serrano peppers, minced
- 1 tablespoon ghee
- 1 bay leaf
- 1 tablespoon coriander powder
- 2 teaspoons salt, adjust to taste
- 2 teaspoons Kashmiri chili powder or paprika
- 1 teaspoon cumin powder
- 1 teaspoon turmeric powder
- 1/8–1/4 teaspoon cayenne, to taste

*Add later*
- 1 28-ounce can diced tomatoes
- 1 teaspoon garam masala, to taste
- 1/2–1 cup water, depending on how thick you'd like the curry

**Method**
1. Finely grind the cloves and cardamom in a coffee grinder.
2. Add all the ingredients to the slow cooker except the tomatoes, water and garam masala.
3. Cook on **high for 4 hours**, stirring every hour or so.
4. Add the tomatoes, garam masala and water. Cook on **high another hour**, or until the meat is tender.

**Probe and endpoint**: no probe step. **no internal temperature stated** — the endpoint is tenderness after 5 hours on high.

---

## Temperature consensus

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| Caribbean (CaribbeanPot, curry goat) | "check for doneness" at 4.5 h — tenderness | Not stated |
| Indian (My Heart Beets, goat curry) | "until the meat is tender" | Not stated |

Neither fetched slow-cooker source states an internal temperature; no numeric range exists in
this collection and none is invented. Both cook to complete tenderness — for goat leg pieces
that means the collagen-gelatin conversion zone well past the 63 °C safe line — and both use
time-plus-feel endpoints. The variation between them is in heat setting philosophy (low 5 h
vs high 5 h) and thickening (potato-mashing vs tomato reduction), not in doneness goal.

## What makes this method special

The slow cooker holds goat-leg pieces in a sealed near-simmer all afternoon, so the cut's
abundant connective tissue converts to gelatin with zero risk of the meat drying — the one
failure mode dry heat risks with such a lean, collagen-heavy cut. The sealed environment also
means the assertive goat aroma stays in the pot and the sauce, which is why both fetched
sources are heavily spiced curries rather than plain preparations. The trade-off is the same
as any braise: no crust, and a doneness endpoint defined by feel.

## Data applied to cooking_data.py

- `supported_methods`: no change proposed; `slow_cooker` is already listed for this cut.
- `recommended_doneness`: no change proposed — neither source states an internal temperature; tenderness endpoints imply well-done practice but supply no number.
- No `method_temperature_ranges` override needed — no measured endpoint exists to override with.

## Summary

Slow cooking turns goat-leg pieces into fork-tender curry with no attention, over four to five hours of sealed gentle heat. It is an excellent structural match for the cut's collagen, in both Caribbean and Indian forms. Both sources cook to feel rather than temperature, so this method records technique and tradition only.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** Two fetched recipes (Groups A and C) with full ingredients and methods; the 4–6-source threshold is not met and no source states an internal temperature. Created 2026-10-24.
