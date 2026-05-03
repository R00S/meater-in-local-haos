# IMPROVE_CUISINE_DATA.md

**Purpose:** Add or improve cuisine data files in `www/cuisines/`.
Each cuisine is its own `.md` file with a `KCE:CUISINE` frontmatter block.
This is an ongoing incremental effort — only add files you have verified data for.

**When to run:** When the user says "do IMPROVE_CUISINE_DATA.md", carry out the task below.

---

## Architecture

Cuisine data lives in `custom_components/kitchen_cooking_engine/www/cuisines/*.md`.
The generator reads these files and builds `AI_CUISINE_INGREDIENTS` in the panel JS.
`ai_recipe_data.py` keeps an empty `CUISINE_INGREDIENTS = {}` for backward compat only.

Do NOT put cuisine ingredients into `ai_recipe_data.py`. That system is obsolete.

---

## File format

```markdown
---
KCE: CUISINE
id: japanese
name: Japanese
name_sv: Japanskt
culinary_group: A
research_done: 1
---

## Research notes

One paragraph of sources and key consumption statistics used.

## Proteins

- {id: salmon, grade: signature, name: Salmon, name_sv: "Lax", notes: "..."}
- {id: chicken, grade: bulk, name: Chicken, notes: "..."}

## Vegetables

- {id: daikon, grade: signature, name: Daikon, notes: "..."}

## Grains

- {id: rice, grade: bulk, name: Rice, notes: "..."}

## Dairy

(omit section if not applicable)

## Spices & Seasonings

- {id: miso, grade: signature, name: Miso, notes: "..."}
```

---

## The three grades

| Grade | Compact view | Lights protein tree | When to use |
|-------|-------------|--------------------|----|
| `signature` | ✅ shown | ✅ yes | Important for the identity of the cuisine. Does not have to be common — may be rare or seasonal. |
| `bulk` | ✅ shown | ✅ yes | Consumed a lot in the country according to statistics (high kg/capita or market share). |
| `local` | ❌ behind "More" | ❌ no | Produced and/or widely used in the country, but not a bulk-consumption item. |

**Do not pad with universal ingredients.** If you cannot confirm an ingredient is
characteristic of this specific cuisine from a specific source, do not add it.
Maximum 30 items per cuisine. If a category is not relevant, omit it entirely.

### Concrete examples

| Ingredient | Cuisine | Grade | Reason |
|---|---|---|---|
| Reindeer | Swedish | signature | Sami heritage; culturally iconic; not everyday |
| Herring | Swedish | signature | Inlagd sill, surströmming; defines Swedish food culture |
| Pork | Swedish | bulk | 35 kg/capita/year; most consumed Swedish meat |
| Allspice | Swedish | signature | The spice in Swedish meatballs; not used this way elsewhere |
| Soy sauce | Japanese | signature | Foundation of Japanese savoury cooking |
| Chicken | Japanese | bulk | Most common meat; karaage, yakitori, everyday |
| Dill | Swedish | signature | THE defining herb; everything from sill to new potatoes |
| Potatoes | Swedish | bulk | Near-universal staple; high consumption volume |
| Leeks | Swedish | local | Grown in Sweden, used in soups/stews, but not a bulk-consumption item |

---

## Grade → protein tree lighting

A cuisine's protein tree buttons (🐄 Beef / 🐷 Pork / 🍗 Poultry / 🐟 Fish / 🐑 Lamb / 🦌 Game)
light up only if the cuisine has a `signature` or `bulk` ingredient that maps to that
protein category in `PROTEIN_TO_SUBCAT` (in `ai_recipe_data.py`).

`local` grade items do NOT light up tree buttons — they appear only in the "More" list.

This means: if a protein genuinely defines a cuisine (e.g. salmon for Swedish), it MUST be
`signature` or `bulk`. Making it `local` hides it from the tree.

---

## Research required before writing a file

1. Find consumption data (kg/capita or dietary share) — primary signal for `very_common`
2. Identify 3–5 signature dishes that define the cuisine — signals `signature` proteins and spices
3. Identify seasonal or culturally iconic items not in everyday cooking — `signature` grade
4. Set `research_done: 0` until sources are verified; `1` when thoroughly reviewed
5. Cite your sources in the `## Research notes` section

Do NOT write a cuisine file without completing steps 1–3 with verifiable sources.

---

## Culinary groups

| Group | Traditions |
|-------|-----------|
| A | South Asian, East Asian, SE Asian |
| B | North American, European, Australasian |
| C | African, Caribbean, Arabic, Levant, Persian |
| D | Scandinavian, Baltic, Slavic, Caucasus, Stans, Sami, Inuit |

---

## Task — what to do when triggered

1. Pick one cuisine that has no file in `www/cuisines/` yet
2. Do the research (consumption stats, signature dishes, seasonal/iconic items)
3. Write the file following the format above — 15–30 items, no padding
4. Set `research_done: 1` only if research is thorough
5. Run: `cd custom_components/kitchen_cooking_engine && python3 generate_frontend_data.py`
6. Confirm generator prints the new cuisine and item count with no errors
7. Commit ALL changed files: the new `www/cuisines/<id>.md` and the regenerated `www/kitchen-cooking-panel.js`


---

## Background — what the data controls

Each cuisine entry in `CUISINE_INGREDIENTS` is a flat list of ingredient dicts.
There are two kinds:

- `_ing(id, name)` — **common** ingredient: shown immediately, and if it maps to a
  protein subcategory in `PROTEIN_TO_SUBCAT`, it **lights up that button** in the
  protein tree (Beef / Pork / Poultry / Fish / Lamb / Game).
- `_inge(id, name)` — **extended** ingredient: hidden behind "More", and it does
  **not** light up any protein tree button, even if the protein is in
  `PROTEIN_TO_SUBCAT`.

This means: a protein that genuinely belongs to a cuisine **must be `_ing`** for it
to appear in the protein tree. If it is only `_inge`, it becomes invisible in the
tree but still clutters the "More" list — which is both structurally and visually
wrong.

---

## The two problems to fix

### 1. Structural problem — protein tree buttons not lit

If a protein category (e.g. Game, Beef, Lamb) is genuinely used in a cuisine but all
its proteins are `_inge`, the tree button stays unlit while the proteins float
orphaned in the "More" list. The fix is to promote at least one representative
protein from that category to `_ing` — the one most characteristic of the cuisine.

### 2. Content problem — wrong priorities and bloat

Many cuisine lists have been seeded with a near-universal ingredient dump. The "More"
list for some cuisines contains 80–100 items, many of which have no connection to the
cuisine at all. `_ing` items should reflect what a cook in that tradition would reach
for first. `_inge` should cover plausible alternatives and supporting ingredients —
not every ingredient that exists.

A common failure pattern is **protein dominance**: one protein (e.g. pork) is over-
represented in `_ing` while other equally or more important proteins (e.g. beef, game,
fish) are buried in `_inge` or missing entirely. This produces a protein tree where
the wrong buttons light up and the right ones stay dark.

> **Cautionary example — Swedish cuisine:**
> The Swedish entry had `pork` and `meatball_mix` (both mapped to pork) as `_ing`,
> making the Pork button light up. But `beef` and `reindeer` were `_inge` — so the
> Beef and Game buttons stayed dark. In reality, beef is Sweden's second most consumed
> meat (~23 kg/capita), with century-old classics like *kalops* (beef stew) and
> *kålrot*, while reindeer is the culturally iconic game meat of northern Sweden and
> Sami tradition. The protein tree showed Pork only — the opposite of the actual
> culinary picture.

---

## How to approach a cuisine — research first

**Do not rely on assumed knowledge.** For every cuisine you work on, look up real data
before making any changes. Consumption statistics, cookbook traditions, and cultural
context are publicly available and easy to find — a single web search is usually
enough to confirm what the primary proteins are.

For each cuisine:

1. **Research the protein priorities.** What are the most consumed or most
   traditionally important proteins in this cuisine? Look for:
   - Consumption data (kg per capita, or proportional share of diet)
   - Traditional dishes in cookbooks and food media that define the cuisine
   - Proteins that are culturally iconic, even if not the highest in volume
     (e.g. reindeer in Swedish/Sami tradition)

2. **Check `PROTEIN_TO_SUBCAT`** to know which `_ing` entries light up which tree
   button. Only proteins listed there affect the tree.

3. **Decide `_ing` vs `_inge`.** For each protein category:
   - If the cuisine genuinely uses proteins from that category as a staple → at
     least one should be `_ing`
   - If proteins from that category appear occasionally or in specific regional
     traditions → `_inge` is fine
   - If a protein has no real place in this cuisine → remove it

4. **Check for protein dominance.** If one protein subcategory has 2–3 `_ing` entries
   and another genuinely important category has zero, rebalance. The common set
   should light up every button that a cook from that tradition would expect to see
   highlighted.

5. **Trim the `_inge` list.** Remove ingredients that are not plausibly used in this
   cuisine. A list of 20–30 well-chosen items is better than 80–100 loosely relevant
   ones.

6. **Verify the result.** After editing, mentally run through the protein tree:
   which buttons will light up? Does that match the actual culinary picture?
   If not, adjust.

---

## Task

Pick 2–3 cuisines from `CUISINE_INGREDIENTS` that look like they need attention.
Work through each one using the steps above. When done, do `CHORES.md`.

---

## Note to agent

There is no good existing example to copy from — all cuisines currently have problems
to varying degrees. Work from researched facts for each cuisine. A cuisine with
12 well-chosen, correctly-prioritised ingredients is better than one with 90 loosely
relevant ones. **Smaller and more accurate is always the right direction.**

If you are genuinely uncertain about a cuisine after researching it, say so explicitly
and leave it for a future session rather than guessing. A wrong protein tree is worse
than an incomplete one.
