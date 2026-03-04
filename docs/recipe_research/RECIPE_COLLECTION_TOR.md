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

The base tree (501 leaves) comes from `cooking_data.py`. You may add a leaf
that is **not** currently in the base tree if:

1. You find a real recipe for a cut × method combination that has clear
   temperature data and culinary significance.
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
7 categories.

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
**Source**: {URL or bibliographic reference}  
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

## How to research a cut

Use this protocol every time you are tasked with creating leaves for a cut that
has not yet been fully researched.

### Step 1 — Check what cooking_data.py currently lists

Open `cooking_data.py` and locate the `MeatCut` entry for this cut. Note every
method in `supported_methods`. These are the leaves already registered in the
engine — but they are **not necessarily complete**.

### Step 2 — Research ALL real-world cooking methods for this cut

Do not stop at what `cooking_data.py` currently lists. Research the cut across
culinary traditions to find every cooking method for which **credible,
human-created recipes exist**. Ask:

- What methods appear in named cookbooks for this cut?
- What methods are used in Asian, European, American, and Southern-hemisphere
  traditions for this cut?
- What methods are used in restaurant kitchens vs. home kitchens?
- What methods appear in respected food media (Serious Eats, ATK, ThermoWorks)?

**A method missing from `supported_methods` is not proof it does not exist —
it is a gap that requires investigation.**

### Step 3 — For every method you find real recipes for

1. If the method is already in `supported_methods`: create the leaf file for it.
2. If the method is **not** in `supported_methods`: add it to `cooking_data.py`
   first, then create the leaf file.

Do not create a leaf without the corresponding `cooking_data.py` entry, and do
not add a `cooking_data.py` entry without the leaf.

### Step 4 — Document the method inventory before writing any leaf

As the first act of your research session, write down:
- Which methods are already in `cooking_data.py`
- Which additional methods you found during Step 2
- Which methods (if any) produced no credible recipe after thorough search

Only then begin writing leaves.

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
