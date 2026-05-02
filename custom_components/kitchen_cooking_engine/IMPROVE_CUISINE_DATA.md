# IMPROVE_CUISINE_DATA.md

**Purpose:** Improve the ingredients list and protein tree data for a small number of cuisines
per session. The data lives in
`custom_components/kitchen_cooking_engine/ai_recipe_data.py`.
This is an ongoing incremental effort — the file will be visited many times.

**When to run:** When the user says "do IMPROVE_CUISINE_DATA.md", carry out the task below.

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
