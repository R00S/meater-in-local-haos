# IMPROVE_CUISINE_DATA.md

**Purpose:** Add or improve cuisine data files in `www/cuisines/`.
Each cuisine is its own `.md` file with a `KCE:CUISINE` frontmatter block.
This is an ongoing incremental effort — only add verified data.

**When to run:** When the user says "do IMPROVE_CUISINE_DATA.md", carry out the task below.

---

## Architecture

Cuisine data lives in `www/cuisines/*.md` (the single source of truth for the AI recipe builder).
`docs/cuisines` is a symlink to `custom_components/kitchen_cooking_engine/www/cuisines/`.
The generator reads the files and builds `AI_CUISINE_REGIONS`, `AI_CUISINE_TO_REGION`, and
`AI_CUISINE_INGREDIENTS` in the panel JS.

**Adding a new cuisine file is all that is needed.** No other file must be edited.
If the file declares a new region (via `region_name` / `region_icon`), that region
appears in the GUI automatically on the next release.

Do NOT put cuisine data into `ai_recipe_data.py`. That system is obsolete for region/cuisine data.

---

## The core methodology: one pair at a time

A cuisine file has 5 ingredient categories (Proteins, Vegetables, Grains, Dairy,
Spices & Seasonings). Each category has 3 grades (signature, bulk, local).
That gives **15 category–grade pairs** per cuisine.

**Each pair is its own independent research task. Treat it that way.**

- Do NOT batch multiple pairs into a single search or a single research stint.
- Do NOT think "I'll research all of Proteins at once" or "I'll do signature for every category."
- Work one pair at a time: open a search, find evidence for that specific pair, write the items,
  then move to the next pair.

The total scope (15 pairs × many cuisines) is large. That is not your problem.
Your only task right now is: **complete the next unfinished pair** in the cuisine you are working on.
Stop when the pair is done. Move to the next pair. Repeat until the cuisine is complete or the
session ends. What happens with the rest is not this session's concern.

---

## The three grades — what they mean and how to research them

### Signature — *identity of the cuisine*

Signature ingredients are the ones that make a cuisine recognisable. They appear in
iconic dishes, they carry cultural weight, and a person who grew up with the cuisine
would nod at them immediately. Volume is irrelevant: a rare mushroom used in one famous
dish is more signature than a staple consumed by the ton.

**Search strategies for signature:**
- "What are the most famous dishes of [cuisine]?"
- "What ingredients are essential to [cuisine] cooking?"
- "What does [cuisine] taste like / what are its defining flavours?"
- "[cuisine] traditional food culture iconic ingredients"
- Look at 3–5 signature dishes and ask: what proteins, vegetables, grains, spices appear?

### Bulk — *what is consumed in the highest volumes statistically*

Bulk ingredients are the everyday workhorses. They may not be exciting, but they are
consumed in large amounts by the population. Official statistics are the right source.
A guess or a general impression is not good enough — find a number.

**Search strategies for bulk:**
- "[country] meat consumption kg per capita [year]"
- "[country] food consumption survey protein/vegetable/grain"
- "[country] FAO food balance sheet"
- "[country] most consumed food items statistics"
- "[country] [category] import/production/consumption data"

### Local — *what is produced, grown, farmed, fished, or foraged in this region*

Local ingredients are tied to the land and water of the cuisine's home region. They may or
may not be consumed in high volumes. What matters is that they originate there: farmed,
caught, raised, grown, or foraged in the region.

**Search strategies for local:**
- "[country/region] livestock farming what animals"
- "[country/region] fishing industry what fish are caught"
- "[country/region] agriculture what crops grown"
- "[country/region] game animals hunted"
- "[country/region] foraging wild plants mushrooms berries"
- "[country/region] local produce regional specialty food"

---

## File format

```markdown
---
KCE: CUISINE
id: japanese
name: Japanese
name_sv: Japanskt
icon: 🇯🇵
region: east_asian
region_name: East Asian
region_icon: 🥢
description: "Japanese cuisine is built on dashi, fermentation, and seasonal precision — from delicate sashimi to robust ramen."
description_sv: "Japanskt kök bygger på dashi, fermentering och säsongsprecision — från delikat sashimi till kraftfull ramen."
research_done: 1
---

## Research notes

Sources used and key findings. Be brief but specific — list the sources and key numbers.

## Proteins

### Proteins — Signature
<!-- Searched: "famous Japanese dishes proteins", "Japanese food culture iconic ingredients" -->

- {id: salmon, grade: signature, rating: 10, name: Salmon, name_sv: "Lax", notes: "Sashimi, sushi; cornerstone of Japanese fish culture"}

### Proteins — Bulk
<!-- Searched: "Japan meat consumption kg per capita 2022", "Japan FAO food balance" -->

- {id: chicken, grade: bulk, rating: 9, name: Chicken, name_sv: "Kyckling", notes: "Most consumed meat in Japan; karaage, yakitori"}

### Proteins — Local
<!-- Searched: "Japan aquaculture fish species", "Japan livestock farming animals" -->

- {id: wagyu, grade: local, rating: 8, name: Wagyu beef, name_sv: "Wagyu-nötkött", notes: "Raised in Japan; Kobe, Matsusaka, Ōmi brands"}
```

The `<!-- Searched: ... -->` comment is optional but strongly encouraged — it tells the
next agent what was already looked for and prevents duplicate work.

### Frontmatter fields

| Field | Required | Description |
|-------|----------|-------------|
| `id` | ✅ | Cuisine identifier, e.g. `swedish`, `japanese` |
| `name` | ✅ | English display name |
| `name_sv` | — | Swedish display name |
| `icon` | ✅ | Emoji flag or symbol for this cuisine (e.g. `🇸🇪`) |
| `region` | ✅ | Region ID this cuisine belongs to (must match `region` of sibling files in the same region, e.g. `nordic`). Used for fallback ingredient lookup. |
| `region_name` | ✅ | Human-readable region name (e.g. `Nordic`). Only the first file that declares a region sets its name. |
| `region_icon` | ✅ | Emoji for the region header (e.g. `❄️`). Only the first file that declares a region sets its icon. |
| `research_done` | ✅ | `0` = draft / incomplete, `1` = all 15 pairs fully researched |
| `description` | ✅ | 1–2 sentence English summary of the cuisine's identity and character. Shown above the ingredient tree in the GUI. |
| `description_sv` | — | Swedish translation of `description`. Shown instead of `description` when the UI language is Swedish. |

### Ingredient item fields

| Field | Required | Description |
|-------|----------|-------------|
| `id` | ✅ | Stable identifier used by the UI (e.g. `salmon`, `white_pepper`) |
| `grade` | ✅ | `signature`, `bulk`, or `local` (see above) |
| `rating` | ✅ | Integer 1–10. How important within the grade. Top 3 per grade are shown by default; rest hidden under "More". |
| `name` | ✅ | English display name |
| `name_sv` | ✅ | Swedish display name (include where known) |
| `notes` | — | Evidence for the grade and rating; brief source reference |

---

## The three grades — UI consequences

| Grade | Default shown | Lights protein tree | When to use |
|-------|:---:|:---:|----|
| `signature` | Top 3 by rating | ✅ dark green | Identity of the cuisine — not necessarily high-volume; may be rare or seasonal. |
| `bulk` | Top 3 by rating | ✅ light green | Consumed a lot by statistics (high kg/capita or market share). |
| `local` | Top 3 by rating | ✅ dark green | Produced/widely used locally, but not a bulk-consumption item. |

**Default visibility rule:** within each category, the top 3 ingredients per grade (sorted by
`rating` descending) are always shown. Everything below rank 3 within its grade is hidden
behind "More". Up to 9 items are visible by default (3 per grade).

**Protein tree button colour rule:**
- A subcat button turns **dark green** when the cuisine has a `signature` or `local` protein in that subcat.
- A subcat button turns **light green** when the cuisine has only `bulk` proteins in that subcat.
- Dark green takes precedence when both are present in the same subcat.

---

## Protein tree — authoring consequences

**Badge area rule:** any protein ingredient that maps to a tree node (via `PROTEIN_TO_SUBCAT`
or is a specific cut in `AI_PROTEIN_SUBCATS`) is excluded from the badge area — the tree
represents it. Non-tree proteins (e.g. elk in Swedish cuisine) appear in the badge area
instead, pulling in "next in line" items by rating within their grade.

### ⚠️ Node research required when a top-level button lights up

When a top-level protein button (e.g. 🐷 Pork) lights up for a cuisine, **the specific nodes
(cuts) that should also light up must be researched and added**. An empty top-level button with
no lit nodes is not acceptable — it misleads the user into thinking all cuts are equally
characteristic, when in reality only specific preparations define the cuisine.

Rules:
- **Most cuisines**: several nodes light up alongside the top level. Research which specific cuts
  or preparations the cuisine is actually known for and ensure those nodes are lit.
- **Special case — a single iconic preparation**: if a cuisine genuinely only uses one specific
  cut of a protein (e.g. a culture that exclusively uses one preparation of fish), then 1–2 lit
  nodes is acceptable. This must be explicitly justified.
- **Do not light up a top level without lit nodes.** If you cannot identify which nodes to light,
  do not add that protein ingredient until the research is done.

---

## What to do when triggered

1. Pick one cuisine with `research_done: 0` (or one that clearly needs improvement).
2. If the file has `description: "[STUB]"`, write the description first — 1–2 sentences capturing
   the identity and character of the cuisine. Add `description_sv` if you can.
3. Work through its pairs **one at a time**, in order:
   - Proteins — Signature
   - Proteins — Bulk
   - Proteins — Local
   - Vegetables — Signature
   - Vegetables — Bulk
   - Vegetables — Local
   - Grains — Signature
   - Grains — Bulk
   - Grains — Local
   - Dairy — Signature
   - Dairy — Bulk
   - Dairy — Local
   - Spices & Seasonings — Signature
   - Spices & Seasonings — Bulk
   - Spices & Seasonings — Local
4. For each pair: do a focused search (see strategies above), write the items, add the
   `<!-- Searched: ... -->` comment, then stop and move to the next pair.
5. When all 15 pairs are done and verified, set `research_done: 1`.
6. Run: `cd custom_components/kitchen_cooking_engine && python3 generate_frontend_data.py`
7. Confirm the generator prints the cuisine name and item count with no errors.
8. Commit both the cuisine file and the regenerated `www/kitchen-cooking-panel.js`.

If a session ends before a cuisine is complete, leave `research_done: 0`. A partial file
with real data is fine. The next agent will see the `<!-- Searched: ... -->` comments and
the stub lines that remain, and will pick up from there.

---

## Search quality — traps to avoid

### ❌ Trap 1: Ingredient names in the search query

The moment you put a specific ingredient name in your search query, you have already
answered your own question. The search will return results confirming what you put in,
even if those ingredients are not actually the most important.

**Wrong:**
> "Norwegian dairy products brunost geitost signature cheese iconic Norwegian food"

**Right:**
> "Norwegian cuisine most important dairy products"
> "Norway dairy consumption statistics most consumed products per capita"

The wrong search will return results about brunost and geitost regardless of their
actual importance. The right searches let the evidence tell you what the ingredients are.

**Rule:** Search queries must contain the cuisine name, the category, and the research
angle (statistics, cultural importance, production data) — but **never** the specific
ingredient names you are trying to discover.

---

### ❌ Trap 2: Bundling distinct items into one entry

If research shows that both milk and yogurt are consumed heavily, do not write one entry
called "dairy basics" or "milk/yogurt". Each distinct ingredient gets its own entry with
its own `id`, `rating`, and `notes`.

**Wrong:**
```
- {id: dairy_basics, grade: bulk, rating: 9, name: "Milk & Yogurt", ...}
```

**Right:**
```
- {id: milk, grade: bulk, rating: 9, name: Milk, name_sv: Mjölk, notes: "..."}
- {id: yogurt, grade: bulk, rating: 7, name: Yogurt, name_sv: Yoghurt, notes: "..."}
```

This also applies to fish ("white fish"), meat ("red meat"), bread ("baked goods"), etc.
If they are distinct ingredients, they get distinct entries.

---

### ❌ Trap 3: Stopping at the category level — always drill into varieties

When research shows "cheese is important" for a cuisine, do not add a single
`{id: cheese, name: Cheese}` entry and move on. That is the *start* of research,
not the end. A category word in a search result is a signal to go one level deeper:
**which specific varieties?**

**Wrong:**
```
- {id: cheese, grade: bulk, rating: 9, name: Cheese, name_sv: Ost, notes: "Norway consumes lots of cheese"}
```

**Right:** search "most consumed cheese varieties in Norway" and add separate entries:
```
- {id: brunost, grade: signature, rating: 10, name: Brunost, name_sv: Brunost, notes: "Brown whey cheese; iconic Norwegian; worldwide export"}
- {id: jarlsberg, grade: bulk, rating: 9, name: Jarlsberg, name_sv: Jarlsberg, notes: "Mild semi-hard; Norway's most exported cheese"}
- {id: norvegia, grade: bulk, rating: 8, name: Norvegia, name_sv: Norvegia, notes: "Most consumed everyday cheese in Norway"}
```

The same rule applies to fish (which species?), bread (which types?), oil (which kind?),
and any other broad category that turns up in research.

---

### ❌ Trap 4: Treating "top 3" as the target count, or stopping early

The UI shows the top 3 items per grade by default, and hides the rest behind "More".
This is a **display rule**, not a data target. There is **no upper limit** on how many
items a pair can have.

A spice-heavy cuisine like Indian or Persian may warrant 15+ verified bulk seasonings.
Three items is the absolute floor — 3 real items is the minimum credible result for a
pair that has been researched. Add every verified item you find; they all improve the
AI's picture of the cuisine and appear when the user clicks "More".

**Stub entries:** cuisine files ship with 9 placeholder stubs per grade pair. When you
research a pair, replace the stubs one-by-one with real verified items. **Do not delete
stubs that you have not yet replaced** — a remaining stub signals that the slot is still
empty and needs work. Once all 9 stubs are gone, keep adding verified items freely.

---

## A note on trust

The people using this app are cooking real food for real people. When the app shows
"Swedish cuisine uses salmon and dill", that should be true — not a guess, not a
placeholder, not a statistically average approximation.

The goal is data that someone who grew up with a cuisine would recognise and nod at.
If you are not sure whether something belongs, it is always fine to say so and leave
it out. The data can grow over time. What it should never do is mislead.

Every ingredient should earn its place. If something is hard to confirm, that is a
signal to go deeper — try more sources, not fewer.
