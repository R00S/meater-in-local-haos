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

> **Write the description first.** `## Cut profile` is not internal notes.
> `custom_components/kitchen_cooking_engine/generate_frontend_data.py` extracts it
> into `CUT_METHOD_PROFILES`, and `## Styckesprofil` into the Swedish `*_SV`
> equivalents, which the Home Assistant panel renders for the end user — it is the
> first thing a person reads about this cut and this method. The same is true one
> level up: a cut file's `## Cut profile` / `## Styckesprofil` is shown for the
> cut, and where a cut has no overview file, the leaf's profile is used as the
> cut's description. So when a cut file or leaf is **created**, write a real 3–6
> sentence description **before** the collection work, and never leave a
> placeholder, an empty section, or a copied sibling profile standing while the
> research continues. A description deferred is user-visible unfinished work in
> the GUI — it is the part of the file the end user actually sees, and it is
> finished long before the research that happens behind it.

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
  `**Pull at N°C** (N°F)`. It must not be buried in a prose sentence. **When the source
  states no temperature — which is normal in traditions that judge doneness by time and
  texture — the step is written `**Pull temperature: not stated by source.**`** Retain the
  source's own cue ("25 min per side until the bone shows", "until fork-tender") in that
  step. Never estimate, convert or supply a number the source does not contain; a guessed
  endpoint is fabricated data and is treated as forbidden in the analysis ToR.
- The **final serving temperature** after rest must be bolded:
  `Final serving temperature: **N°C / N°F** ({doneness name})` — or
  `Final serving temperature: **not stated by source**` for a source that gives none.
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

## Search in the language the cuisine is written in

**The rule: build the search in the language the cooks of that tradition actually
publish in — not in English, and not automatically in a country's official
language either, when the cuisine belongs to a regional one.**

An English query is answered mostly by English-language pages: international,
diaspora and "westernised" versions of a dish written for readers abroad —
ingredients swapped for what a foreign supermarket stocks, temperatures
converted, cut names replaced by the nearest American or British one. For a
Group B tradition that is native material, because English-language food media
*is* one of its traditions. For Groups A, C and D it is the wrong evidence: the
leaf would then record how somebody **outside** the tradition cooks the dish as
though it were the tradition's own practice.

The same failure happens one level down, where the language of the country is
not the language of the cuisine. A cuisine belonging to a region whose language
differs from the national or official one — Cantonese cooking searched only with
Mandarin terms, or Karnataka cooking searched only in Hindi instead of Kannada —
yields the cosmopolitan, capital-city or differently-inflected version of the
dish instead of the regional one. The recipe is real, it is authentic to *a*
reader, and it still does not cover the row it was stored under. Treat "which
language I searched in" as part of the evidence, never as an implementation
detail.

**Procedure**

1. Before searching, decide which language(s) that tradition's recipes are
   published in — usually more than one, and not always the national one.
   `SOURCE_SURVEY.md`, "Recommended source matrix by cuisine / language",
   pairs a tradition with a site; pair it with the language as well.
2. Translate the **cut** name and the **method** name into that language from a
   real lookup — the cut name especially. Guessing a foreign cut name is
   explicitly named as data degradation in `CUT_FILE_RESEARCH_TOR.md`, and the
   looked-up names already live in the cut file's language index (next section).
3. Search with those native terms, then fetch the page and check that it is
   written in the target language and is about the dish you set out to find.
4. **English results for a non-English tradition are a warning sign, not a
   result.** If the pages keep coming back Anglo-American or diaspora-adapted,
   the query is wrong — change the terms, not the criterion and not the culinary
   group being covered.
5. Log the search language and the actual terms in the leaf's
   `## Collection status and search log`, so a later agent can see the search was
   conducted in-language rather than assumed.
6. **Absence claims need an in-language search behind them.** "No Group A source
   exists for this cut" is a demonstrated result only after searching in the
   languages of Group A; an English-only search that finds nothing demonstrates
   nothing. This is what separates wall evidence under "Hard-wall exceptions"
   below from an unverified assumption (Pattern 3 in
   `HOW_I_INFLATE_CUT_FILES_AND_WHY.md`).

This rule also applies to method discovery and to cut discovery (Steps 2 and 2b
below): the method a tradition uses for this cut is named in that tradition's
language too.

---

## Names for this cut in other languages

**The rule: every name the research turns up for this cut in another language is
written into the cut file — looked up in a real source, never guessed, each with
what the source says it is.**

Names are the search keys for the next pass (the section above), the evidence
behind an identity-wall exception, and the thing that stops an agent claiming a
translation it invented. A name you cannot cite is not a name.

Where it goes, in `{cut_name}.md`:

1. `### Names for this cut in other languages — reference index` — a table, one
   row per name, with the columns:
   `| Group | Language / region | Name | What the source says it is | Status |`
   The `Group` is the culinary group (A/B/C/D) the language belongs to.
2. `Status` uses this closed vocabulary — the status is the point of the table:
   - `this cut` — the source's cutting lines match this cut
   - `named comparator` — a named cut of another tradition, anatomically useful,
     not proven identical
   - `comparator` — position or cutting lines not stated by the source
   - `generic only` — an umbrella term ("ribs", *costilla*) with no cutting line
   - `reverse polarity` — the same body region valued the opposite way (e.g. the
     premium Thai rib is the one nearest the spine)
   - `not a match` — reads like a translation but describes something else
   - `unverified` — the name is attested but the definition could not be read
   A short qualifier after a comma is allowed (`generic, belly-oriented`); do
   not invent additional statuses.
3. The evidence — quotations, URLs, and the caveats about skin, bone and cutting
   lines — stays in prose sections beneath the index, in the cut file. The index
   is the summary; the prose underneath is the citation. Names never live only
   in a leaf: a leaf that leans on a cross-language equivalence names the term
   and points at the cut file's index, and must not assert an equivalence the
   cut file does not carry.

Worked example: `pork/ribs/tjocka_revben.md`. A cut whose names have never been
researched is missing this section, and that is unfinished research, not an
optional extra.

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

When you create the new `{slug}.md` cut file, write its GUI-visible parts in the
same act: the `## Cut profile` / `## Styckesprofil` description (the text the
panel shows for the cut — see "Mandatory collection sections") and, from the
research you just did, the "Names for this cut in other languages" index. A cut
file created without them is a stub that looks finished to the end user.

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
- [ ] `## Cut profile` is present, contains no temperatures, and was written for
      this file when it was created (real description, no placeholder, not copied
      from a sibling leaf)
- [ ] 4–6 source recipes are present
- [ ] Each source has a verifiable citation (URL or bibliographic reference)
- [ ] Each source comes from a different culinary tradition (no two from the same)
- [ ] Sources are human-created — no AI-generated or AI-assisted content
- [ ] Sources were chosen to show temperature divergence, not enforce consensus
- [ ] Each recipe has a full ingredient list with quantities for every non-trivial item
- [ ] Each recipe has numbered method steps (not bullet points)
- [ ] Each recipe has an explicit probe insert step (or sous vide circulator note)
- [ ] Each recipe has a bolded pull step — `**Pull at N°C**` or, where the source states
      none, `**Pull temperature: not stated by source.**`
- [ ] Each recipe has a bolded `Final serving temperature: **N°C / N°F**` line (or the
      explicit `not stated by source` marker)
- [ ] Numeric sources counted and logged — the analysis gate needs at least 3
      (`RECIPE_ANALYSIS_TOR.md`, Purpose)
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

## Cut file improvement potential

Every **cut file** (the `{cut_name}.md` without a method suffix) carries an
`improvement_potential` field in its `<!-- KCE:CUT` front-matter block and an
`## Improvement potential` section at the end of the document.

The current measurement is defined in **`IMPROVEMENT_POTENTIAL_SYSTEM.md`, “New improvement
potential system”**. A higher number means more improvement potential; select the
highest readings first. Apply its category bases, thresholds and reductions after
improving a file. The former 0–20 readings use the opposite direction and must not
be compared or combined with readings under the new system. Assess the cut files
under the new system before ordering the queue; preserve existing assessments and
user-approved exceptions when recording the new reading.

**The system rates work; it never directs it.** The reading selects which cut file
to open next and is computed only after that file's work is finished. During the
research itself do not consult it and do not let it decide what to research,
create, omit or write: research conduct is governed solely by this ToR,
`RECIPE_ANALYSIS_TOR.md`, `SOURCE_SURVEY.md` and the traps in
`HOW_I_INFLATE_CUT_FILES_AND_WHY.md`, under neither the new system nor the former
0–20 scoring.

### Purpose — flaw detection, not achievement

> **The number is a diagnostic reading, not a target.**

The purpose of this measurement is to **name the gaps** so that the files with the
most potential can be found and improved first. A high number indicates more
potential under the new system; the number is a measurement, not a target.

**What this means in practice:**

- Do **not** soften or remove a criterion to make the number look better.
  Accurate assessment is more valuable than a misleading reading.
- Do **not** add credit for data that has not been genuinely researched.
  Frontmatter values auto-populated from `cooking_data.py` are not research.
- Do **not** treat any reading as a goal or as proof that a cut is finished.
- Do **not** use projected numbers to choose between optional improvements. Improve
  the data first, then read the number off the new system; it measures potential
  and does not replace research, source verification or the collection gate.
- **Do** use the `### Improvement priorities` list in each file to find the
  highest-value action for that specific cut.
- **Do** focus improvement work on the files with the highest numbers under the
  new system first.

Future agents: if you find yourself adjusting criteria to make numbers look
better, you are working against the purpose of this system.  Harsh, accurate
assessment is correct behaviour.

### Scale

The bases, category thresholds, reductions and threshold tiers are specified in
`IMPROVEMENT_POTENTIAL_SYSTEM.md` under “New improvement potential system”. Apply thresholds
separately to each reduction type, and apply each threshold per cut-method leaf rather than
against counts pooled across the cut's leaves. Each language present in a file — English,
Swedish, or Danish — takes its own deduction. Round the final reading to a whole number;
negative readings are allowed. Do not apply the former 0–20 calculation to a new
assessment.

### Culinary group coverage (assessed separately for the cut file and each method leaf)

Recipes must represent all four culinary groups.  Definitions:

| Culinary Group | Includes |
|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Bengali, Ceylon, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |

Count recipe reductions and the once-per-group bonus separately for the cut file
itself and for each individual method leaf, as specified in the new system. Do not
pool the leaves: a group represented in several leaves counts separately in each,
and a group found in one method does not establish coverage for another.

For measurement, a verified recipe means verified as human-created. Trust prior
agents' verification of existing recipes; changed internet content or sandbox
access is not grounds to invalidate it. New recipes and source details still
require real-source verification; this does not permit fabrication.

### Cut profile quality

The cut profile should give anatomical placement — where on the animal the cut
comes from, what muscle or structure it is, and what defines it (marbling,
connective tissue, leanness, typical use). A missing or placeholder profile is
unfinished work. Apply only the reductions specified by the new system.

### Appropriate cooking method research

The `cooking_methods_researched` field tracks whether someone has deliberately researched what cooking methods are
appropriate for this cut across culinary traditions — not just accepted whatever list was
auto-populated from `cooking_data.py`.  Research means: checking multiple culinary sources
to confirm which methods suit the cut's connective-tissue content, fat distribution, and
thickness, and verifying that the `methods:` list reflects that investigation.

Set `cooking_methods_researched: 1` once that research is complete and the `methods:` list
has been reviewed and corrected.

### Method sub-files

Every method listed in a cut's `methods:` block is owed its own leaf. The list is not a wish list and
not decoration: a declared method whose leaf does not exist is work that exists in the tree.

**Four leaves is the floor, not a target.** Four leaves clears the minimum this system accepts; it does
not close the cut and it does not mean the method survey is finished. A cut with several culinary
traditions behind it often supports five, six or eight methods — if the corpus supports six and the cut
has four leaves, two are owed, and the cut's own improvement list must say so. **Do not stop at four
because four is the number in this file.** Four is where the minimum ends and the research begins.

Discover and declare confirmed methods honestly, and create or improve their leaves.
A discovered method is valuable information: register it and write its leaf,
whatever the current reading says.
The new system distinguishes finished leaves from created stubs. For measurement,
a finished leaf has most of the parts making it useful in the GUI and concluded
recipe research, as defined in `IMPROVEMENT_POTENTIAL_SYSTEM.md`. This does not change the
collection or analysis gates or invalidate user-approved exceptions.

### Temperature data

Temperature criteria require **research evidence** — the presence of values in
the `<!-- KCE:CUT` frontmatter block alone does **not** satisfy these criteria.
Those values are auto-populated from `cooking_data.py` and may be present even
in a file with zero research content.  Research evidence means: at least one
method leaf file that contains source recipes with explicit pull temperatures
(the "Pull at X°C" step in the recipe format), OR the cut profile body
explicitly discusses specific pull or safe temperatures (not just a passing °C
mention).

Apply the new system's separate reductions for verified culinary preferred
and safe temperatures, and for each method-specific preferred-temperature
discussion. Do not present unsourced frontmatter values as verified research.

### Description uniqueness

Each method leaf must explain what that *specific method* does to this
*specific cut*. Copying a sibling or parent description instead is unfinished
method-specific research. Apply only the reductions specified by the new system.

### Recording the reading

Keep `improvement_potential` in the cut frontmatter and document the new-system
reading in its `## Improvement potential` section. The recorded reading is the
number itself: a whole number, written without commentary, arithmetic or
justification. Preserve previous assessments as historical readings, clearly
marked as the former 0–20 system; do not compare their numbers with the new scale.

The system lives in `IMPROVEMENT_POTENTIAL_SYSTEM.md` and is read at rating time, after the
work. Compute the number only from verified content; an unfinished leaf,
unverified recipe or unsupported temperature must not be represented as
completed evidence.

### Hard-wall exceptions (user-approved)

Approved exceptions remain in force within their approved scope. They let work
move on to other recipes when score walls are hit, instead of repeatedly
revisiting settled walls. Do not reopen or discard them during reassessment.
Where their numerical effect under the new system is not defined, document that
separately; do not invent an adjustment or let it block work on other recipes.

The procedure and 0–20 examples below are retained from the former system as the
record of the existing exception rules, not as a new-system calculation.

Some cuts are structurally unable to satisfy every criterion. The clearest case is a regional
identity the rest of the world does not distinguish: Baltic herring is *strömming*, *silakka*,
*räim*, *salaka* or *śledź bałtycki* around the Baltic (all names verified 2026-10-25), but
outside that region the fish is filed under generic *sill*/herring and no separate cut identity
exists to source. For such a cut, a missing Culinary Group point is **unearnable**: no
amount of additional research can ever clear it, so the cut is permanently parked at the bottom
of the work queue and repeated passes only churn the same documented gap.

The exception is deliberately narrow. It applies **only** when all of the following hold:

1. **The wall is structural, not a work gap.** The point can never be earned back by
   research. Three wall classes are recognised; a criterion is eligible only through one of
   them, and only for the exact rows that class demonstrably blocks:

   - **(a) Identity wall** — the cut identity does not exist in the relevant cuisine (the
     clearest case: a regional identity the rest of the world does not distinguish). Example:
     Baltic herring is *strömming*/*silakka*/*räim*/*salaka*/*śledź bałtycki* around the Baltic
     and is filed under generic *sill*/herring everywhere else, so no separate cut identity
     exists to source. Missing-Culinary-Group rows are the typical target.
   - **(b) External-authority wall** — the criterion is defined in terms of a named external
     authority's guidance (e.g. "USDA safe internal temperature") and that authority does not
     recognise the cut at all: no row, category or species identity for it anywhere in that
     authority's publications, in a jurisdiction where the ingredient is not culinarily native.
     Generic guidance for a broader category ("finfish", "fish") is not the authority's guidance
     *for this cut*; the criterion as written demands the cut's own value. Temperature rows for
     ingredients whose own culinary traditions publish only non-numeric doneness cues are the
     typical target.
   - **(c) Corpus-saturation wall** — the criterion demands a set-diversity condition over a
     leaf's sources (e.g. the source-selection gate "no two sources may share the same national
     or regional tradition") that could be satisfied **only by deleting already-fetched, valid
     primary sources**, because (i) the ingredient's verified name pool is confined to a small
     set of traditions, (ii) the duplicates already in the leaf are legitimate primary sources
     from the ingredient's cultural heartland, and (iii) the gate text is a gate — it is passed
     or not passed, never "mostly passed", and never reinterpreted to fit the corpus. The target
     is the same-tradition-duplication rows of leaves whose source sets are already frozen in.

   "We have not found a source yet", "the source is hard to fetch", "this pass is short on time",
   and "the fish is niche" are **not** walls — they are unfinished research, and the point
   stays. Criteria controlled by the agent's own work (`cooking_methods_researched`, method
   leaves and their source **counts**, description duplication, cut profile quality) remain
   **never** eligible on their own: source counts are always research work. Classes (b) and (c)
   can reach a temperature or diversity row only with the evidence that class demands — never on
   the strength of the agent's own unfinished work.
2. **The wall is demonstrated, not asserted.** The cut file must document the evidence: the
   names the ingredient carries in each region (looked up in a real source — **never guessed**),
   and what searches in the relevant cuisines actually showed (e.g. Japanese *nishin* is a
   different Pacific species; Caribbean herring traditions use the smoked product). A bare
   "geographic reality" verdict without this evidence remains number inflation (Pattern 3 in
   `HOW_I_INFLATE_CUT_FILES_AND_WHY.md`) and is **not** an exception.
3. **The user approves it.** The agent **asks** the user — it may never approve the exception
   itself. The request states: the cut, the exact criteria and rows sought, the
   evidence of the wall, and the number with and without the exception. Silence is not approval;
   a refused request changes nothing.

When (and only when) the user approves, document the exception **in the cut file's
`## Improvement potential` section**:

- an `**Exception (user-approved {ISO date}):**` line naming the exact criteria it covers
  (e.g. "Missing Culinary Group A and C only"), with the wall evidence summarized above it;
- the affected rows rewritten as `— (user-approved exception; wall documented above)`
  — the rows **stay in the table** and are never silently deleted;
- the number recomputed with the exception applied, shown alongside the without-exception number
  (e.g. `**Improvement potential: 8 / 20** (with user-approved exception; 6 / 20 without it)`).

Scope and lifetime:

- The exception is **per cut file and per criterion**. It transfers to no other cut, no other
  group, and no other criterion, and it is never a blanket waiver of the table.
- If a credible source that breaks the wall is ever found, the exception is revoked for that
  criterion, normal assessment resumes, and the cut file note records the revocation.
- The exception exists so later passes stop re-litigating a settled question — **not** so the
  file looks better than it is. Do not use it to chase 20/20 (Pattern 6): a low number with a
  documented, user-approved wall is still an honest reading.
- Without an approval in hand, the row stands exactly as written. An agent-written note
  claiming the wall, with no user approval, has zero effect on the number.

### Recurring task

Reading a cut file is a **recurring improvement task**. Whenever a new method
leaf is added or an existing leaf's tradition coverage is improved, recalculate
and update the reading under the new system.

**Use high numbers as a work queue.** Assess the cuts under the new system before
sorting `improvement_potential` descending. Former 0–20 readings are not
comparable and must not be mixed into that queue.
