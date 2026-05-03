# IMPROVE_CUISINE_DATA.md

**Purpose:** Add or improve cuisine data files in `docs/cuisines/`.
Each cuisine is its own `.md` file with a `KCE:CUISINE` frontmatter block.
This is an ongoing incremental effort — only add files you have verified data for.

**When to run:** When the user says "do IMPROVE_CUISINE_DATA.md", carry out the task below.

---

## Architecture

Cuisine data lives in `docs/cuisines/*.md` (the single source of truth for the AI recipe builder).
`custom_components/kitchen_cooking_engine/www/cuisines` is a symlink to `docs/cuisines/`.
The generator reads the files through that symlink and builds `AI_CUISINE_REGIONS`,
`AI_CUISINE_TO_REGION`, and `AI_CUISINE_INGREDIENTS` in the panel JS.

**Adding a new cuisine file is all that is needed.** No other file must be edited.
If the file declares a new region (via `region_name` / `region_icon`), that region
appears in the GUI automatically on the next release.

Do NOT put cuisine data into `ai_recipe_data.py`. That system is obsolete for region/cuisine data.

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
research_done: 1
---

## Research notes

One paragraph of sources and key consumption statistics used.

## Proteins

- {id: salmon, grade: signature, rating: 10, name: Salmon, name_sv: "Lax", notes: "..."}
- {id: chicken, grade: bulk, rating: 9, name: Chicken, notes: "..."}

## Vegetables

- {id: daikon, grade: signature, rating: 8, name: Daikon, notes: "..."}

## Grains

- {id: rice, grade: bulk, rating: 10, name: Rice, notes: "..."}

## Dairy

(omit section if not applicable)

## Spices & Seasonings

- {id: miso, grade: signature, rating: 9, name: Miso, notes: "..."}
```

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
| `research_done` | ✅ | `0` = draft / incomplete, `1` = verified coverage |

### Ingredient item fields

| Field | Required | Description |
|-------|----------|-------------|
| `id` | ✅ | Stable identifier used by the UI (e.g. `salmon`, `white_pepper`) |
| `grade` | ✅ | `signature`, `bulk`, or `local` (see below) |
| `rating` | ✅ | Integer 1–10. How important within the grade. Top 3 per grade are shown by default; rest hidden under "More". |
| `name` | ✅ | English display name |
| `name_sv` | ✅ | Swedish display name (include where known) |
| `notes` | — | Research justification; evidence for the grade and rating |

---

## The three grades

| Grade | Default shown | Lights protein tree | When to use |
|-------|:---:|:---:|----|
| `signature` | Top 3 by rating | ✅ dark green | Identity of the cuisine — not necessarily high-volume; may be rare or seasonal. |
| `bulk` | Top 3 by rating | ✅ light green | Consumed a lot by statistics (high kg/capita or market share). |
| `local` | Top 3 by rating | ✅ dark green | Produced/widely used locally, but not a bulk-consumption item. |

**Default visibility rule:** within each category, the top 3 ingredients per grade (sorted by `rating` descending)
are always shown. Everything below rank 3 within its grade is hidden behind "More".
Up to 9 items are visible by default (3 per grade), from all three grades.

**Protein tree button colour rule:**
- A subcat button turns **dark green** when the cuisine has a `signature` or `local` protein in that subcat.
- A subcat button turns **light green** when the cuisine has only `bulk` proteins in that subcat.
- Dark green takes precedence when both are present in the same subcat.

Every ingredient should earn its place. If something is hard to confirm, that is a
signal to go deeper — try more sources, not fewer. It is fine to spend a whole session
on a single cuisine if that is what thorough coverage takes. Quality over batch size.

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

This applies equally to all three grades: lighting up a top level means you are asserting this
protein is characteristic of the cuisine. That assertion requires knowing *which cuts* are used.

---

## Research before writing

Good cuisine data starts with real sources. Before writing or editing a file, spend a few
minutes confirming the basics:

1. **Consumption data** — what are the most eaten proteins and staples in this food culture?
   (kg/capita, dietary share, food industry reports)
2. **Signature dishes** — which 3–5 dishes best define the cuisine? What proteins and
   seasonings do they use?
3. **Cultural/seasonal icons** — what do people in this culture reach for on special
   occasions, or what are they proud of? These are often `signature` grade even if
   consumed in smaller volumes.
4. **Write down your sources** in the `## Research notes` section, even briefly.
   Future contributors (and agents) will trust the data more when they can see where it
   came from.

It is perfectly fine to set `research_done: 0` and leave a cuisine incomplete. A partial
file with honest data is better than a complete-looking file with guessed data.

---

## What to do when triggered

Pick one cuisine that has no file yet, or one that has `research_done: 0` and looks
like it can now be improved. Do the research, write or update the file, then:

1. Run: `cd custom_components/kitchen_cooking_engine && python3 generate_frontend_data.py`
2. Confirm the generator prints the cuisine name and item count with no errors.
3. Commit both the cuisine file and the regenerated `www/kitchen-cooking-panel.js`.

Quality over volume. One well-researched cuisine is worth more than three rushed ones.
If you finish a single cuisine properly in a session, that is a good session.

---

## A note on trust

The people using this app are cooking real food for real people. When the app shows
"Swedish cuisine uses salmon and dill", that should be true — not a guess, not a
placeholder, not a statistically average approximation.

The goal is data that someone who grew up with a cuisine would recognise and nod at.
If you are not sure whether something belongs, it is always fine to say so and leave
it out. The data can grow over time. What it should never do is mislead.

