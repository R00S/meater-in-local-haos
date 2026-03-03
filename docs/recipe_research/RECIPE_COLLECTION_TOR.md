# Terms of Reference — Recipe Collection for the Temperature Reference Library

## Purpose

This document defines the **exact standard** for every leaf file in
`docs/recipe_research/`. The model leaf is:

> `docs/recipe_research/beef/steaks/ribeye_steak-pan_sear.md`

Every future leaf must match that model. Do not deviate from the structure,
depth, or intent described here.

---

## What a leaf is

A leaf covers **exactly one cut × exactly one cooking_method** combination.  
File name: `{cut_name}-{cooking_method}.md`  
Example: `ribeye_steak-pan_sear.md`

**One file = one method.** If a cut supports five cooking methods, that is five
separate leaf files. You may not combine two or more cooking methods into a
single leaf file under any circumstances — not to save space, not because the
methods are similar, not because recipes for each method are scarce.

A leaf is NOT a synthesis document. It is a **saved collection of primary
source recipes** that happen to share the same cut and method. The temperature
consensus and the `cooking_data.py` note are byproducts of that collection,
not the goal.

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
7 categories. As of this writing, 262 of those leaf files exist in the repo.
See the **Appendix** at the end of this document for the full inventory.

---

## Mandatory sections, in order

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

#### Source selection criteria

Each source must be:
1. A **real, human-created recipe** — not a temperature chart, not a food-safety
   guide, not a "how to cook" overview article, and **never AI-generated**.
2. From a **well-regarded, authoritative origin** — published cookbook, named
   chef, respected food media outlet (Serious Eats, America's Test Kitchen,
   ThermoWorks blog), or a named authority from a specific culinary tradition.
   "Well-regarded" means the source is cited or recommended within its own
   culinary tradition, not merely that it exists online.
3. **From a different culinary tradition than every other source in the same
   leaf.** No two sources may share the same national or regional tradition.
   A leaf with sources from France, Japan, the American South, and Brazil meets
   this rule. A leaf with two French sources does not, regardless of how
   different the chefs are.
4. **Chosen to reveal the temperature range of human disagreement, not to
   confirm a single consensus.** Prefer sources that differ in their target
   doneness, pull temperature, or resting approach. A well-built leaf will
   naturally show that a Japanese chef and a Texan pitmaster disagree on what
   "done" means for the same cut — and that both are correct within their own
   tradition. Do not discard or suppress sources that land outside a narrow
   consensus. The divergence is the data.
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

#### Source recipe format

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
N. **Pull at {temp}°C** ({temp}°F). {One sentence explaining why this pull point,
   especially if it differs from the final serving temp.}
N+1. Rest {duration}. Final serving temperature: **{temp}°C / {temp}°F** ({doneness name}).

---
```

Rules:
- Ingredients must have **quantities** (weight, volume, or count). Vague
  entries like "salt to taste" are acceptable only for purely optional garnish.
- The **probe insert step** must appear in the Method — where exactly to insert
  the probe, at what point in the cook (before sear, after first flip, etc.),
  from which direction (side, top, etc.), and what to avoid (bone, fat pocket).
- Every recipe must have an explicit **pull temperature** in °C, bolded.
- Every recipe must have an explicit **final serving temperature** in °C after
  rest, bolded.
- Cultural terminology should be preserved and briefly explained inline in
  *italics* on first use (e.g., *al sangue* (blood-red warm centre)).
- The `---` horizontal rule separates recipes from each other.

---

### `## Temperature consensus`

A markdown table:

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| … | … | … |

Followed by 2–4 sentences that:
1. State the **full observed range** in °C — from the lowest to the highest
   final serving temperature seen across the sources.
2. Map the range to the `cooking_data.py` doneness options and explain which
   traditions land in which doneness band.
3. Explain what drives the variation (texture goal, cultural convention,
   carryover assumptions, pull-temp vs. serving-temp convention). Do **not**
   treat divergence as an error to be resolved — it is the finding.
4. Identify the doneness key that best represents the broadest common use, for
   `recommended_doneness` — but note if a strong tradition sits outside it.

---

### `## What makes this method special`

3–6 sentences. Explain what this cooking *method* does to this *cut* that
makes it distinct from other methods. Focus on the physics and flavour
chemistry, not on preferences. This section informs why a different
`method_temperature_ranges` override may or may not be needed.

---

### `## Data applied to cooking_data.py`

A short bullet list:

```markdown
- `supported_methods` gains: `method_1`, `method_2`, …
- `recommended_doneness`: `"doneness_key"` ({rationale in ≤10 words})
- No `method_temperature_ranges` override needed — {reason}
  OR
- `method_temperature_ranges` override: `{"method": [range_1, range_2, …]}`
  — {reason}
```

This section is not a re-statement of consensus. It is the direct instruction
to the person (or agent) who will update `cooking_data.py` next.

---

### `## Summary`

2–4 sentences, readable in approximately 10 seconds. This is the reader-facing
conclusion for the entire leaf. It must answer two questions in plain language:

1. **What does this method do to this specific cut?** — describe the physical
   result (texture, moisture, crust, rendering, etc.) in terms a non-expert can
   picture.
2. **Is this a good match — and why or why not?** — state clearly whether this
   method suits this cut, what the cook gains or sacrifices, and what the key
   takeaway is for someone choosing between methods.

Write for the cook who has read nothing else in the leaf. Do not repeat
numbers from the consensus table. Do not mention `cooking_data.py`. The
summary stands alone.

Good reference: `## Verdict` in `filet_mignon-sous_vide.md` — two sentences,
no hedging, explains the cut-method fit and the key reason in one breath.

---

## What is explicitly forbidden

| Forbidden | Why |
|-----------|-----|
| Combining two or more cooking methods into one leaf file | One leaf = one cut × one method; five methods = five files |
| Two sources from the same culinary tradition in one leaf | Each source must come from a different national or regional tradition |
| Selecting sources to minimise temperature spread | The spread is the data; cherry-picking for consensus falsifies the record |
| Deleting a leaf file because no recipe was found | Keep it; replace the body with the "no recipes found" stub instead |
| A synthesised "composite" recipe not from any real source | The purpose is to *save* real recipes, not to generate new ones |
| A `## Full Recipe` section that is not attributed to a source | This was the failure pattern in earlier sessions — see commit history |
| Temperature-only bullet points as a "source recipe" | These are not recipes; they are the failure pattern this ToR replaces |
| Fabricating or paraphrasing a recipe without a real source | Every ingredient list and method must be traceable to the cited source |
| Omitting probe placement from the Method | Probe placement is the integration point with MEATER; it is mandatory |
| Omitting pull temperature | Without pull temp, the leaf has no value to the temperature data model |
| Omitting `## Summary` or making it longer than 4 sentences | The summary must exist and be readable in ~10 seconds; a wall of text defeats its purpose |
| A `## Summary` that only restates the temperature consensus table | The summary must explain the cut-method fit in plain language, not repeat numbers |

---

## Leaf completion checklist

Before a leaf is committed, verify:

- [ ] Cut profile is present and does not contain temperatures
- [ ] 4–6 source recipes are present
- [ ] Each source has a verifiable citation (URL or bibliographic reference)
- [ ] Each source comes from a different culinary tradition (no two from the same)
- [ ] Sources are human-created — no AI-generated or AI-assisted content
- [ ] Sources were chosen to show temperature divergence, not to enforce consensus
- [ ] Each recipe has a full ingredient list with quantities
- [ ] Each recipe has a numbered method with probe insert step
- [ ] Each recipe has a bolded pull temperature in °C
- [ ] Each recipe has a bolded final serving temperature in °C after rest
- [ ] Cultural terminology is explained inline on first use
- [ ] Temperature consensus table is present
- [ ] Global sweet spot is mapped to a `cooking_data.py` doneness key
- [ ] `## What makes this method special` is present
- [ ] `## Data applied to cooking_data.py` bullet list is present
- [ ] `## Summary` is present, ≤4 sentences, explains cut-method fit in plain language
- [ ] No synthesised composite recipe exists in the file
- [ ] No `## Full Recipe` section exists that is not attributed to a source
- [ ] If no credible recipe was found: file contains the "no recipes found" stub, NOT an empty file or deleted file

---

## File tree covered

Every `Category → Cut Type → Cut → Cooking Method` combination present in
`custom_components/kitchen_cooking_engine/cooking_data.py` on the `main` branch
**requires exactly one leaf file** in this branch.  The full base tree is
**501 leaves** (see Appendix). Completion order is not mandated; this ToR
only defines the standard each leaf must meet when it is written.

When a new leaf is added to `cooking_data.py` on main, a corresponding leaf
file becomes required here.
