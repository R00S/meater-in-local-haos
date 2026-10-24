<!-- KCE:CUT_METHOD
type: cut_method
slug: ground_lamb
method: grill
name: Ground Lamb × Grill
category: lamb
meat: ground
cut_type: Ground
-->
# Ground Lamb × Grill — Recipe Temperature Research

## Tree position

| Field | Value |
|-------|-------|
| Category | `lamb` |
| Cut type folder | `ground/` |
| Cut slug | `ground_lamb` |
| Method slug | `grill` |
| File | `ground_lamb-grill.md` |
| Full path | `docs/recipe_research/lamb/ground/ground_lamb-grill.md` |

## Cut profile

Grilling ground lamb means shaping it onto skewers — the kebab family (Adana, kafta) — and
taking it over charcoal, where the mince's high fat content drips, flares and returns as
smoke-crust. The fetched source is the canonical Turkish form: hand-mixed spiced mince
pressed onto skewers, grilled over medium-high charcoal and turned until charred outside.
The cut's grinding makes the meat cohesive enough to hold a skewer and risky enough that the
cooked-through rule of ground meat applies. **Boundary note:** grilled lamb *burgers* and
named *kofta* preparations have their own cut files (`lamb_burger`, `lamb_kofta`) in this
dataset; this leaf covers skewered grilled lamb mince as such.

## Source recipes

### 1. Adana Kebab (Turkish Ground Lamb Kebabs) — Faith Gorsky / An Edible Mosaic
**Inspired by**: https://www.anediblemosaic.com/adana-kebab-recipe/ (fetched 2026-10-24). Faith Gorsky, An Edible Mosaic; Turkish tradition (the author grills over charcoal). Ingredient line: "2 pounds ground lamb."

**Serves**: 8 · **Prep**: 15 min · **Cook**: 15 min (author's 3 large skewers took 15–18 min total) · **Rest**: not stated

**Ingredients**
*Lamb kebab*
- 2 pounds ground lamb
- 1 small–medium onion, peeled and grated
- 3 cloves garlic, crushed
- 2 teaspoons salt
- 2 teaspoons sumac
- 2 teaspoons cumin
- 2 teaspoons crushed red pepper flakes (more or less to taste)
- 3/4 teaspoon sweet paprika
- 1/2 teaspoon smoked paprika
- 1 1/2 tablespoons olive oil (to brush on the meat before grilling)

*Sumac onions (optional)*
- 1 large red onion, peeled and thinly sliced
- 1 tablespoon fresh lemon juice
- 1 tablespoon extra-virgin olive oil
- 1/2 teaspoon sumac
- 1/4 teaspoon salt

**Method**
1. For the sumac onions, stir their ingredients together, cover and refrigerate at least 30 minutes (or up to 3 days).
2. Combine the kebab ingredients by hand in a large bowl; avoid overmixing.
3. With slightly wet hands, shape the meat onto skewers and brush both sides with olive oil.
4. Preheat the grill to **medium-high**. Grill the skewers, turning as needed, **until charred outside and cooked to the desired doneness** — the author's three large skewers took about **15–18 minutes total**. (The page's oven alternative: 425F, 7–10 min per side.)
5. Serve hot with the sumac onions and accompaniments if desired. (Soak wooden skewers 20 minutes first if using.)

**Probe and endpoint**: no probe step. **no internal temperature stated** — the endpoint is "charred outside and cooked to the desired doneness".

---

## Temperature consensus

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| Turkish (An Edible Mosaic, Adana kebab) | "cooked to the desired doneness" — charred outside | Not stated |

One fetched recipe establishes the method and it states no internal temperature. Nothing
numeric can be concluded and none is invented. Note that "desired doneness" is the source's
own phrasing — skewered mince is thin enough that the difference between done and overdone is
a minute or two on charcoal, and the source leaves the level to the cook even though food-safety
practice for ground lamb calls for complete cooking.

## What makes this method special

Skewer-grilling gives ground lamb what a pan cannot: live fire underneath and rendered lamb
fat dripping into it, producing the smoke-crust and char that define kebab cookery. The skewer
form also exposes the maximum surface area to direct heat, so the outside chars while the
inside stays juicy — the fat content that would make a lean mince dry is the cut's advantage
here. The mixing discipline matters more than in any other method: overworked mince turns
tight on the skewer, and the grated onion in the fetched recipe carries both flavour and
moisture into the interior.

## Data applied to cooking_data.py

- `supported_methods` gains: `grill` (one fetched, human-created Turkish recipe grilling skewered ground lamb confirms the method).
- `recommended_doneness`: no change proposed — the source states no internal temperature.
- No `method_temperature_ranges` override needed — no measured endpoint exists to override with.

## Summary

Grilling ground lamb on skewers is the kebab tradition's core technique: spiced mince, charcoal, and a charred crust that no pan matches. It suits the cut's fat content superbly, though the ground-meat safety rule still demands the centre be cooked through. One Turkish source supports the method; no temperature evidence exists yet.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** One fetched Group C recipe documents skewer-grilling ground lamb; the 4–6-source threshold and tradition-diversity gate are not met and no source states an internal temperature. Grilled lamb burgers and named kofta are separate cuts (`lamb_burger`, `lamb_kofta`) and are out of this leaf's scope. Method confirmed 2026-10-24 (declared in the cut frontmatter but previously without a leaf).
