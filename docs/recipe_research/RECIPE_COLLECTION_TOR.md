# Terms of Reference — Recipe Collection for the Temperature Reference Library

## Purpose

This document defines the **exact standard** for every leaf file in
`docs/recipe_research/`. The model leaf is:

> `docs/recipe_research/beef/steaks/ribeye_steak-pan_sear.md`

Every future leaf must match that model. Do not deviate from the structure,
depth, or intent described here.

---

## What a leaf is

A leaf covers one **cut × cooking_method** combination.  
File name: `{cut_name}-{cooking_method}.md`  
Example: `ribeye_steak-pan_sear.md`

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
   guide, not a "how to cook" overview article.
2. From an **authoritative origin** — published cookbook, named chef, respected
   food media outlet (Serious Eats, America's Test Kitchen, ThermoWorks blog),
   or a named authority from a specific culinary tradition.
3. **Geographically diverse** where possible — aim for at least 3 different
   countries or culinary traditions across the 4–6 sources.
4. The source must actually use this *method* for this *cut* — not a
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
- AI-generated content

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
1. State the global sweet spot in °C.
2. Map it to the `cooking_data.py` doneness range and target.
3. Explain any variation between traditions (usually pull-temp vs serving-temp
   convention, not actual disagreement about texture).

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

## What is explicitly forbidden

| Forbidden | Why |
|-----------|-----|
| A synthesised "composite" recipe not from any real source | The purpose is to *save* real recipes, not to generate new ones |
| A `## Full Recipe` section that is not attributed to a source | This was the failure pattern in earlier sessions — see commit history |
| Temperature-only bullet points as a "source recipe" | These are not recipes; they are the failure pattern this ToR replaces |
| Fabricating or paraphrasing a recipe without a real source | Every ingredient list and method must be traceable to the cited source |
| Omitting probe placement from the Method | Probe placement is the integration point with MEATER; it is mandatory |
| Omitting pull temperature | Without pull temp, the leaf has no value to the temperature data model |

---

## Leaf completion checklist

Before a leaf is committed, verify:

- [ ] Cut profile is present and does not contain temperatures
- [ ] 4–6 source recipes are present
- [ ] Each source has a verifiable citation (URL or bibliographic reference)
- [ ] Each recipe has a full ingredient list with quantities
- [ ] Each recipe has a numbered method with probe insert step
- [ ] Each recipe has a bolded pull temperature in °C
- [ ] Each recipe has a bolded final serving temperature in °C after rest
- [ ] Cultural terminology is explained inline on first use
- [ ] Temperature consensus table is present
- [ ] Global sweet spot is mapped to a `cooking_data.py` doneness key
- [ ] `## What makes this method special` is present
- [ ] `## Data applied to cooking_data.py` bullet list is present
- [ ] No synthesised composite recipe exists in the file
- [ ] No `## Full Recipe` section exists that is not attributed to a source

---

## File tree covered

Every `Category → Cut Type → Cut → Cooking Method` combination present in
`custom_components/kitchen_cooking_engine/cooking_data.py` on the `main` branch
**requires exactly one leaf file** in this branch.  The full base tree is
**501 leaves** (see Appendix). Completion order is not mandated; this ToR
only defines the standard each leaf must meet when it is written.

When a new leaf is added to `cooking_data.py` on main, a corresponding leaf
file becomes required here.
