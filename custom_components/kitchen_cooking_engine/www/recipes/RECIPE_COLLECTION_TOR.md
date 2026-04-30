# Terms of Reference — Recipe Collection

> **Companion document**: [`RECIPE_ANALYSIS_TOR.md`](RECIPE_ANALYSIS_TOR.md) covers
> temperature consensus, `cooking_data.py` coding, verification, and the analysis
> sections that follow the source recipes in each leaf file.

## Purpose

This document defines the standard for **finding, selecting, and saving source
recipes** in every leaf file in `docs/recipe_research/`.  
The model leaf is `docs/recipe_research/beef/steaks/ribeye_steak-pan_sear.md`.

The goal of collection is to save real, human-created recipes — with full
ingredients, numbered method steps, probe instructions, and explicit temperatures —
from credible, diverse culinary traditions. Collection is complete when the leaf
contains 4–6 fully saved recipes. Analysis (temperature consensus, coding decisions,
summary) is covered in the companion Analysis ToR.

---

## What a leaf is

A leaf covers **exactly one cut × exactly one cooking_method** combination.  
File name: `{cut_name}-{cooking_method}.md`  
Example: `ribeye_steak-pan_sear.md`

**One file = one method.** If a cut supports five cooking methods, that is five
separate leaf files. You may not combine two or more cooking methods into a single
leaf file under any circumstances — not to save space, not because the methods are
similar, not because recipes for each method are scarce.

A leaf is NOT a synthesis document. It is a **saved collection of primary source
recipes** that happen to share the same cut and method. The temperature consensus
and `cooking_data.py` note are byproducts of that collection, not the goal.

---

## Tree structure

The tree has four levels:

```
Category  →  Cut Type  →  Cut  →  Cooking Method  =  leaf
```

Each level maps directly to the folder and file structure:

```
docs/recipe_research/
  {category}/
    {cut_type_folder}/
      {cut_name}-{cooking_method}.md
```

### Source of truth

The authoritative tree is `custom_components/kitchen_cooking_engine/cooking_data.py`
in the `main` branch. **Every `MeatCategory` → `CutType` → `MeatCut.supported_methods`
combination is a required leaf.** This branch must eventually contain one fully
populated leaf file for every such combination.

- **Category** = `MeatCategory.name` (e.g. `beef`, `pork`, `poultry`, `fish`,
  `lamb`, `game`, `vegetables`)
- **Cut Type** = `CutType.name` mapped to a folder slug (e.g. `Steaks` → `steaks`,
  `Braising Cuts` → `braising`, `Chops & Tenderloin` → `chops`)
- **Cut** = `MeatCut.name` (e.g. `ribeye_steak`, `pork_tenderloin`)
- **Cooking Method** = `CookingMethod` enum value (e.g. `pan_sear`, `oven_roast`,
  `grill`, `charcoal_grill`, `sous_vide`, `air_fryer`, `smoker`, `braise`,
  `slow_cooker`, `pan_fry`, `steam`, `boil`, `saute`, `oven_bake`,
  `pressure_cooker`, `oven_broil`)

### Folder slug mapping

| Cut Type name in cooking_data.py | Folder in repo |
|----------------------------------|---------------|
| Steaks | `steaks/` |
| Roasts | `roasts/` |
| Braising Cuts | `braising/` |
| Ground | `ground/` |
| Other / Offal | `offal/` |
| Chops & Tenderloin | `chops/` |
| Ham | `roasts/` |
| Ribs | `ribs/` |
| Breast | `chicken/` |
| Dark Meat | `chicken/` |
| Whole (poultry) | `chicken/` |
| Turkey | `turkey/` |
| Duck | `duck/` |
| Goose | `goose/` |
| Salmon | `salmon/` |
| Tuna | `tuna/` |
| White Fish | `white_fish/` |
| Shellfish | `shellfish/` |
| Chops (lamb/game) | `chops/` |
| venison/bison/reindeer/etc. | `{animal}/` |
| Root Vegetables | `root_vegetables/` |
| Green Vegetables | `green_vegetables/` |
| Alliums | `alliums/` |
| Squash | `squash/` |
| Cruciferous | `cruciferous/` |
| Peppers | `peppers/` |
| Mushrooms | `mushrooms/` |
| Corn | `corn/` |
| Eggplant | `eggplant/` |
| Tomatoes | `tomatoes/` |

### Adding new leaves

The base tree (501 leaves) comes from `cooking_data.py`. **This is a floor,
not a ceiling.**

> ⚠️ **Every search session will find new leaves. This is expected and normal.**
>
> A protein does not have one cut. It has many cuts.  
> A cut does not have one cooking method. It has many cooking methods.  
> The entries in `cooking_data.py` are a starting point based on the most
> obvious combinations — they are **not** a complete inventory of what real
> recipes exist in the world. Assume that for every protein you research,
> you will discover cut × method combinations that are not yet registered.
> This is the rule, not the exception.
>
> **Example**: Beef alone has ribeye, sirloin, NY strip, T-bone, tenderloin,
> flank, skirt, hanger, flat iron, tri-tip, picanha, chuck, brisket, short rib,
> oxtail, and more. Each of those cuts is cooked by pan-sear, grill, charcoal
> grill, oven roast, oven bake, sous vide, air fryer, broil, braise, or smoker
> across different traditions. A "starting point" of 3 methods per cut does not
> mean only 3 methods exist. **Never stop at what `cooking_data.py` currently
> lists.**

Every serious research session will discover cut × method combinations that
real cooks actually use but that are not yet registered in `cooking_data.py`.
A single protein can have a dozen or more distinct cuts, each of which may
support five, eight, or more cooking methods across different culinary
traditions.

**When you find a real recipe for a cut × method combination that is not yet
in the base tree, you are expected to create the leaf and add the entry to
`cooking_data.py`.** This is normal research work, not an exception.

The conditions are:

1. A real, human-created recipe exists for this cut × method combination with
   clear temperature data and culinary significance.
2. The combination does not yet have a leaf file in the repo.
3. You add a matching entry to `cooking_data.py` (`supported_methods`) so that
   the leaf is registered in the engine.

Do **not** create a leaf file for a combination that exists only in theory.
A leaf exists because a real recipe for it exists, not because the method is
theoretically possible.

### Removing a leaf

A leaf file **must not be deleted**. The only permissible exception is when a
thorough search finds **no credible, human-created recipe** for that specific
cut × cooking method combination anywhere — not in cookbooks, not in named
chef publications, not in respected food media.

If that is the case:

1. **Keep the file.** Do not delete it.
2. Replace the file body with the following stub:

```markdown
# {Cut} × {Method} — No Recipes Found

> **STATUS: NO CREDIBLE RECIPES FOUND - SEARCH HAS BEEN CONDUCTED**
>
> A thorough search of cookbooks, named chef publications, and respected food
> media found no credible human-created recipe for this cut × method
> combination. This leaf is retained as a placeholder so the gap is visible
> in the tree. If a credible recipe is found in future, replace this stub
> with a full leaf following the ToR standard.

## Search log

- Searched: {date}
- Sources checked: {list the sources and search terms used}
- Conclusion: No credible human-created recipe found.
```

3. Do **not** remove the corresponding `supported_methods` entry from
   `cooking_data.py` without a separate explicit decision — that is a code
   change with wider impact and requires its own PR.

### Base tree count

The base tree derived from `cooking_data.py` contains **501 leaves** across
7 categories. This number will grow as research sessions discover real recipes
for cut × method combinations not yet registered. **501 is a minimum, not a
target ceiling.** Expect the true count to be significantly higher once all
proteins have been fully researched across culinary traditions.

---

## Mandatory collection sections

Every leaf file must open with these two sections, in this order, before any
analysis sections.

### `# {Cut} × {Method} — Recipe Temperature Research`

Top-level title only.

---

### `## Cut profile`

3–6 sentences that answer:
- Where on the animal is this cut from?
- What structural quality defines it (marbling, connective tissue, leanness,
  muscle use)?
- Why does *this specific method* suit this cut?
- What is the dominant carryover behaviour (is it significant, minimal, why)?

Do not include temperatures here. Do not include cooking instructions here.

---

### `## Source recipes`

**This is the heart of the leaf.** Contains 4–6 source recipes.

---

## Source selection criteria

Each source must be:
1. A **real, human-created recipe** — not a temperature chart, not a food-safety
   guide, not a "how to cook" overview article, and **never AI-generated**.
2. From a **well-regarded, authoritative origin** — published cookbook, named
   chef, respected food media outlet (Serious Eats, America's Test Kitchen,
   ThermoWorks blog), or a named authority from a specific culinary tradition.
3. **From a different culinary tradition than every other source in the same
   leaf.** No two sources may share the same national or regional tradition.
4. **Chosen to reveal the temperature range of human disagreement, not to
   confirm a single consensus.** Prefer sources that differ in their target
   doneness, pull temperature, or resting approach. The divergence is the data.
5. The source must actually use this *method* for this *cut* — not a
   substitution or a generalisation.

Acceptable source types (in order of preference):
- Named cookbook (author + title + publisher + year)
- Named chef's published recipe with verifiable URL
- Named food media outlet recipe with verifiable URL
- Established national culinary tradition documented by a named authority

Not acceptable:
- Anonymous recipe aggregator entries (allrecipes.com, food.com)
- Government food-safety temperature charts
- Temperature-only references with no recipe
- AI-generated content of any kind — including AI-assisted rewrites of real
  recipes, AI-summarised cookbooks, or AI-generated "based on" recipes

---

## Source recipe format

Each source recipe follows this exact format:

```markdown
### {N}. {Author / Tradition} — {Dish name in original language if applicable}
**Inspired by**: {URL or bibliographic reference}  
**Serves**: {n} · **Prep**: {n} min (+{n} min tempering if applicable) · **Cook**: {n}–{n} min · **Rest**: {n} min

**Ingredients**
- {quantity} {ingredient, with clarifying note if culturally specific}
- …

**Method**
1. {Step. Include probe insert timing and location explicitly where relevant.}
2. …
N. **Pull at {temp}°C** ({temp}°F). {One sentence explaining why this pull point.}
N+1. Rest {duration}. Final serving temperature: **{temp}°C / {temp}°F** ({doneness name}).

---
```

### Rules for ingredients

- Every non-trivial ingredient must have a **quantity** (weight, volume, or count).
- "Salt to taste" is acceptable only for purely optional garnish; all primary
  ingredients must have quantities.
- Culturally specific ingredients should have a brief clarifying note in
  *italics* on first use (e.g., *gochugaru* (Korean red chilli flakes)).

### Rules for method steps

- Steps must be **numbered**, not bullet points.
- The **probe insert step** must appear in the Method — state:
  - Where exactly to insert the probe (thick end, side, from which direction)
  - At what point in the cook (before sear, after first flip, when the steak
    goes into the oven, etc.)
  - What to avoid (bone, fat pocket, thin tapered end)
  - **Exception for sous vide**: a probe cannot be inserted during a
    sealed-bag cook. The method must state that the circulator temperature is
    the cook target and note when post-bath temperature verification can be done.
- The **pull temperature** must be a dedicated numbered step, bolded:
  `**Pull at N°C** (N°F)`. It must not be buried in a prose sentence.
- The **final serving temperature** after rest must be bolded:
  `Final serving temperature: **N°C / N°F** ({doneness name})`.
- Cultural terminology should be preserved and briefly explained inline in
  *italics* on first use.
- A `---` horizontal rule must follow every recipe.

---

## What is explicitly forbidden (collection)

| Forbidden | Why |
|-----------|-----|
| Combining two or more cooking methods into one leaf file | One leaf = one cut × one method |
| Two sources from the same culinary tradition in one leaf | Each source must come from a different national or regional tradition |
| Selecting sources to minimise temperature spread | The spread is the data |
| A synthesised "composite" recipe not from any real source | The purpose is to *save* real recipes |
| A `## Full Recipe` section that is not attributed to a source | This was an early failure pattern |
| Temperature-only bullet points as a "source recipe" | These are not recipes |
| Fabricating or paraphrasing a recipe without a real source | Every ingredient list and method must be traceable |
| Omitting probe placement from the Method | Probe placement is the MEATER integration point; it is mandatory |
| Omitting pull temperature | Without pull temp, the leaf has no value to the temperature data model |
| Appending a corrected recipe alongside an invalid bullet-point recipe | Invalid data must be completely removed and replaced |

---

## How to fetch recipe content

This section documents what internet-access methods work in the coding-agent
environment, based on verified testing. **Update this section if you discover a
new working or broken method.**

### Method status (verified 2026-04-26 — supersedes 2026-03-05 entry)

| Method | Result | Notes |
|--------|--------|-------|
| `web_fetch` tool | ✅ WORKS for many sites | DNS and outbound HTTP are available. Confirmed working: en.wikipedia.org, koket.se, themediterraneandish.com, nigella.com, recipetineats.com, thewoksoflife.com, giallozafferano.it, argiro.gr, and many others. See `SOURCE_SURVEY.md` for the full tested list. Not all sites are accessible — some return 402 (paywall), 403 (geo/bot block), 404 (wrong URL slug), or GDPR gate. **Always test with a real URL before building a leaf around a source.** |
| `curl` / `wget` (bash) | ✅ WORKS | DNS resolution is available at OS level. Use to probe HTTP status codes quickly. |
| `web_search` tool | ✅ WORKS (for source discovery only) | Returns Bing AI-generated summaries. Useful for finding correct URL slugs and author names. **Do not use `web_search` output as recipe text** — it synthesises multiple sources and is AI-generated, which violates the source requirements of this ToR. Always follow up with `web_fetch` on the real URL. |

> ⚠️ **Note:** Before 2026-04-26 the sandbox had no outbound network access. Leaves written
> before that date using "training-data knowledge" (see old method below) are still valid
> if the source is cited to a real, verifiable URL or published book — but new leaves must
> use `web_fetch` to retrieve actual content.

### Preferred method: web_fetch on confirmed working sites

**This is now the primary method.** For every new source recipe:

1. Use `web_search` to find a valid URL slug for the recipe on a confirmed-working site.
2. Use `web_fetch` on the exact URL to retrieve the actual recipe text.
3. Verify the returned content contains ingredients + numbered method steps before citing.
4. Cite the real URL in the `**Inspired by**:` line.

See `SOURCE_SURVEY.md` for the list of confirmed-working recipe sites and their URL formats.

### Fallback method: book citations

Cookbooks do not require web_fetch. Cite author, title, publisher, year, and page where
known. The reader must be able to verify the citation in a physical copy of the book.
Every ingredient quantity, method step, and pull temperature must accurately reflect what
is in the named source — do not reconstruct from memory if you are uncertain.

### Obsolete method (pre-2026-04-26): training-data knowledge

Before outbound network access became available, agents reproduced published recipes from
training-data memory. These leaves are still valid if the source is cited to a real URL or
book. **New leaves must not use this method** — use `web_fetch` instead. Training-data
recall of "what a recipe roughly contains" is not an acceptable source for new work.

---

## How to research a cut

Use this protocol every time you are tasked with creating leaves for a cut that
has not yet been fully researched.

### Step 1 — Check what cooking_data.py currently lists

Open `cooking_data.py` and locate the `MeatCut` entry for this cut. Note every
method in `supported_methods`. These are the leaves already registered in the
engine — but they are **not necessarily complete, and almost certainly not**.

> ⚠️ **Treat the current `supported_methods` as a minimum starting hint, not
> as the full picture.** The number of methods listed (even if there are 5 or
> more) does not mean those are the only methods used by real cooks for this cut.

### Step 2 — Research ALL real-world cooking methods for this cut

> ⚠️ **Expect to find more methods than what `cooking_data.py` lists.** For
> every cut you research, assume the real list is longer. A lean white fish
> fillet is poached, steamed, en papillote, salt-baked, smoked, pan-fried,
> oven-baked, air-fried, and grilled across different traditions. An entry with
> 3 methods in `supported_methods` is not evidence that only 3 methods exist —
> it is evidence that 3 were obvious enough to register without research.
> **The whole purpose of this research work is to find the rest.**

Do not stop at what `cooking_data.py` currently lists. Research the cut across
culinary traditions to find every cooking method for which **credible,
human-created recipes exist**. Ask:

- What methods appear in named cookbooks for this cut?
- What methods are used in Asian, European, American, and Southern-hemisphere
  traditions for this cut?
- What methods are used in restaurant kitchens vs. home kitchens?
- What methods appear in respected food media (Serious Eats, ATK, ThermoWorks)?

**A method missing from `supported_methods` is not proof it does not exist —
it is a gap that requires investigation. Assume the gap is real until you have
searched and found no credible recipe.**

### Step 2b — Research ALL real-world cuts for this protein

The protein (beef, salmon, pork, etc.) may have cuts that are not yet
registered in `cooking_data.py` at all. A protein category does not have one
or two cuts. It has many. Beef alone has 15+ common cuts. Salmon has fillet,
steak, belly, collar, and whole. Shellfish includes scallops, shrimp, lobster
tail, crab, clams, oysters, and more — each a distinct cut with its own
supported methods.

If you encounter a real recipe for a cut × method that has no entry in
`cooking_data.py`, add both the `MeatCut` entry and the leaf file. This is
as expected as finding a new method for an existing cut.

### Step 3 — For every method you find real recipes for

1. If the method is already in `supported_methods`: create the leaf file for it.
2. If the method is **not** in `supported_methods`: add it to `cooking_data.py`
   first, then create the leaf file.

Do not create a leaf without the corresponding `cooking_data.py` entry, and do
not add a `cooking_data.py` entry without the leaf.

### Step 4 — Document the method inventory before writing any leaf

As the first act of your research session, write down:
- Which methods are already in `cooking_data.py`
- Which additional methods you found during Step 2 (expect to find some)
- Which new cuts you found during Step 2b (expect to find some)
- Which methods (if any) produced no credible recipe after thorough search

Only then begin writing leaves. If you found no new methods and no new cuts
beyond what `cooking_data.py` already lists, that is a sign the research was
not thorough enough — go back and look again before concluding.

---

## Collection checklist

Before the collection portion of a leaf is committed, verify:

- [ ] File is named `{cut_name}-{cooking_method}.md`
- [ ] File covers exactly one cut × one method (no combined-method content)
- [ ] `## Cut profile` is present and contains no temperatures
- [ ] 4–6 source recipes are present
- [ ] Each source has a verifiable citation (URL or bibliographic reference)
- [ ] Each source comes from a different culinary tradition (no two from the same)
- [ ] Sources are human-created — no AI-generated or AI-assisted content
- [ ] Sources were chosen to show temperature divergence, not enforce consensus
- [ ] Each recipe has a full ingredient list with quantities for every non-trivial item
- [ ] Each recipe has numbered method steps (not bullet points)
- [ ] Each recipe has an explicit probe insert step (or sous vide circulator note)
- [ ] Each recipe has a bolded `**Pull at N°C**` step
- [ ] Each recipe has a bolded `Final serving temperature: **N°C / N°F**` line
- [ ] A `---` horizontal rule follows each recipe
- [ ] No synthesised composite recipe exists in the file

For the analysis sections that follow (`## Temperature consensus` onward),
see [`RECIPE_ANALYSIS_TOR.md`](RECIPE_ANALYSIS_TOR.md).

---

## File tree covered

Every `Category → Cut Type → Cut → Cooking Method` combination present in
`custom_components/kitchen_cooking_engine/cooking_data.py` on the `main` branch
**requires exactly one leaf file** in this branch. The full base tree is
**501 leaves**. Completion order is not mandated; this ToR only defines the
standard each leaf must meet when it is written.

When a new leaf is added to `cooking_data.py` on main, a corresponding leaf
file becomes required here.

---

## Cut file quality scoring

Every **cut file** (the `{cut_name}.md` without a method suffix) carries a
`quality_score` field in its `<!-- KCE:CUT` front-matter block and a
`## Quality score` section at the end of the document.

### Purpose — flaw detection, not achievement

> **The score is a diagnostic tool, not a target.**

The purpose of this scoring system is to **identify flaws** so that the worst
files can be found and improved first.  A low score is the point — it means the
scoring is working correctly.

**What this means in practice:**

- Do **not** soften or remove a criterion because files score lower as a result.
  Accurate detection of a real gap is more valuable than a higher number.
- Do **not** add credit for data that has not been genuinely researched.
  Frontmatter values auto-populated from `cooking_data.py` are not research.
- Do **not** treat 20/20 as the goal.  Reaching 20/20 on every file is neither
  required nor expected.  Many cuts may never reach it.
- **Do** use the `### Improvement priorities` list in each file to find the
  highest-value action for that specific cut.
- **Do** focus improvement work on the lowest-scoring files first — the floor
  matters more than the ceiling.

Future agents: if you find yourself adjusting criteria to make scores look
better, you are working against the purpose of this system.  Harsh, accurate
scoring is correct behaviour.

### Scale

**Base: 20 points.** Deductions are subtracted from 20.  A stub file with no
research content will score around 3/20.  That is not a bug — it is an accurate
reflection of the file's state.

### Culinary group coverage (assessed across *all* method leaf files for the cut)

Recipes must represent all four culinary groups.  Definitions:

| Culinary Group | Includes |
|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Bengali, Ceylon, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

**Deduction: −1 per missing culinary group** (maximum −4).

### Cut profile quality

- **−3** if `## Cut profile` section is missing entirely (no heading at all).
- **−1** if `## Cut profile` section exists but is a placeholder (content is a
  stub note such as "Placeholder — research not yet completed" with no real
  text). Placeholders are a special case: the gap is acknowledged, so the
  deduction is lighter than for a completely absent section.
- **−1** if `## Cut profile` exists with real content but lacks anatomical
  placement — where on the animal the cut comes from, what muscle or structure
  it is, what defines it (marbling, connective tissue, leanness, typical use).
  Anatomy is always applicable; this deduction applies universally to profiles
  with real content.

### Appropriate cooking method research

- **−8** if `cooking_methods_researched: 0` in the cut frontmatter.

This field tracks whether someone has deliberately researched what cooking methods are
appropriate for this cut across culinary traditions — not just accepted whatever list was
auto-populated from `cooking_data.py`.  Research means: checking multiple culinary sources
to confirm which methods suit the cut's connective-tissue content, fat distribution, and
thickness, and verifying that the `methods:` list reflects that investigation.

Set `cooking_methods_researched: 1` once that research is complete and the `methods:` list
has been reviewed and corrected.

### Method sub-files

- **−3** if no `{cut_name}-{method}.md` leaf files exist at all for the cut.

### Temperature data

Temperature criteria require **research evidence** — the presence of values in
the `<!-- KCE:CUT` frontmatter block alone does **not** satisfy these criteria.
Those values are auto-populated from `cooking_data.py` and may be present even
in a file with zero research content.  Research evidence means: at least one
method leaf file that contains source recipes with explicit pull temperatures
(the "Pull at X°C" step in the recipe format), OR the cut profile body
explicitly discusses specific pull or safe temperatures (not just a passing °C
mention).

- **−3** if USDA safe internal temperature is not supported by research evidence
  as defined above.
- **−4** if culinary preferred temperatures (doneness targets) are not supported
  by research evidence as defined above.
- **−2** if culinary preferred temperatures are not researched per method
  independently (i.e. the cut file body states a single global target with no
  per-method nuance, and the method leaf files also lack per-method temperature
  ranges). No deduction if either the cut file or the method leaf files already
  carry per-method data.

### Description uniqueness

Two separate deductions apply:

- **−1** per method leaf file whose `## Cut profile` or opening description is
  a copy-paste or near-identical reuse of **another method leaf file** for the
  same cut (maximum −2 across this sub-criterion). Each method must explain what
  that *specific method* does to this *specific cut*.

- **−1** per method leaf file whose `## Cut profile` text is a copy-paste or
  near-identical reuse of the **parent cut file's** `## Cut profile` text (no
  upper limit). Using the generic cut overview as a method description is worse
  than copying a sibling method file — it means the method file contains no
  method-specific analysis at all.

### Scoring summary table

| Criterion | Possible deduction |
|-----------|--------------------|
| Cooking methods not researched (`cooking_methods_researched: 0`) | −8 |
| Missing Culinary Group A tradition | −1 |
| Missing Culinary Group B tradition | −1 |
| Missing Culinary Group C tradition | −1 |
| Missing Culinary Group D tradition | −1 |
| No `## Cut profile` section | −3 |
| Cut profile is a placeholder | −1 |
| Cut profile lacks anatomy | −1 |
| No method leaf files exist | −3 |
| No safe temperature data | −3 |
| No culinary preferred temps | −4 |
| Per-method temp data missing (cut + method files both) | −2 |
| Method file copies sibling method description (per file, max 2) | −1 each |
| Method file copies parent cut profile (per file, no limit) | −1 each |
| **Maximum total deduction** | **−27 + number of method files** |
| **Minimum score** | **varies** |

### How the score is written into the cut file

Add to the `<!-- KCE:CUT` block:
```yaml
quality_score: 17
cooking_methods_researched: 0
quality_assessed: 2026-04-26
```

And append this section at the end of the cut file:

```markdown
## Quality score

**Score: 17 / 20** — assessed 2026-04-26

| Criterion | Deduction |
|-----------|-----------|
| Missing Culinary Group D tradition | −1 |
| Cut profile lacks anatomy | −1 |
| Per-method temp data missing | −1 |

*Score is recalculated each time a new method leaf is added or the cut
profile is updated.*
```

### Recurring task

Grading cut files is a **recurring improvement task**. Whenever a new method
leaf is added or an existing leaf's tradition coverage is improved, the cut
file score must be recalculated and updated.

**Use low scores as a work queue.** Sort all cut files by `quality_score`
ascending — the files at the bottom of the list are the ones that need
attention.  Improve the lowest-scoring files first.  Do not adjust criteria
or add leniency exceptions to raise scores artificially.
