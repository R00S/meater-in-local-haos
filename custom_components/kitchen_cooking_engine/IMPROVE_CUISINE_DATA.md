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

> **Search language rule:** Always run searches in the cuisine's native language first.
> English searches may be used to complement when native-language results are insufficient.
> See Trap 6 for details and examples.

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
- "[country] most consumed [category] per capita [year]"
- "[country] [category] consumption statistics per capita"
- "[country] food consumption survey [category]"
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
- "[country/region] foraging wild ingredients traditions"
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
<!-- Searched: "famous Japanese dishes", "Japanese food culture iconic preparations" -->

- {id: salmon, grade: signature, rating: 9, name: Salmon, name_sv: "Lax", notes: "Sashimi, sushi; cornerstone of Japanese fish culture"}

### Proteins — Bulk
<!-- Searched: "Japan most consumed protein foods per capita 2022", "Japan FAO food balance" -->

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
| `rating` | ✅ | Integer 1–9. Significance within the grade — not a rank. Multiple ingredients may share the same value. Top 3 shown per grade (by highest rating, before "More" is clicked); clicking "More" reveals at least 6 more per grade — 9 or more items per pair ensures the "More" section is always meaningful. |
| `name` | ✅ | English display name |
| `name_sv` | ✅ | Swedish display name (include where known) |
| `notes` | — | Evidence for the grade and rating; brief source reference |

---

## The three grades — UI consequences

| Grade | Shown before "More" | Lights protein tree | When to use |
|-------|:---:|:---:|----|
| `signature` | Top 3 shown | ✅ dark green | Identity of the cuisine — not necessarily high-volume; may be rare or seasonal. |
| `bulk` | Top 3 shown | ✅ light green | Consumed a lot by statistics (high kg/capita or market share). |
| `local` | Top 3 shown | ✅ dark green | Produced/widely used locally, but not a bulk-consumption item. |

**Default visibility rule:** within each category, the top 3 shown per grade (sorted by
`rating` descending) are visible before the user clicks "More". Everything beyond the top 3 shown within its
grade is hidden behind "More" — clicking it reveals all remaining items. Up to 9 items are visible
by default (top 3 shown × 3 grades). The data target per grade is **9 or more** items, so that
clicking "More" always reveals at least 6 additional items per grade.

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
- {id: brunost, grade: signature, rating: 9, name: Brunost, name_sv: Brunost, notes: "Brown whey cheese; iconic Norwegian; worldwide export"}
- {id: jarlsberg, grade: bulk, rating: 9, name: Jarlsberg, name_sv: Jarlsberg, notes: "Mild semi-hard; Norway's most exported cheese"}
- {id: norvegia, grade: bulk, rating: 8, name: Norvegia, name_sv: Norvegia, notes: "Most consumed everyday cheese in Norway"}
```

The same rule applies to fish (which species?), bread (which types?), oil (which kind?),
and any other broad category that turns up in research.

---

### ❌ Trap 4: Treating "top 3 shown" as the target count, or stopping early

The UI shows the top 3 items per grade when "More" has not been clicked, and hides the rest behind "More".
This is a **display rule**, not a data target. There is **no upper limit** on how many
items a pair can have.

A spice-heavy cuisine like Indian or Persian may warrant 15+ verified bulk seasonings.
**Nine or more items is the absolute floor** — 9 or more real items is the minimum credible result for a
pair that has been researched. This ensures that when the user clicks "More", they see
at least 6 additional items beyond the top 3 shown (before "More" is clicked). Add every verified item you
find beyond 9; they all improve the AI's picture of the cuisine and appear when the user
clicks "More".

**Stub entries:** cuisine files ship with 9 placeholder stubs per grade pair. When you
research a pair, replace the stubs one-by-one with real verified items. **Do not delete
stubs that you have not yet replaced** — a remaining stub signals that the slot is still
empty and needs work. Once all 9 stubs are gone, keep adding verified items freely.

---

### ❌ Trap 5: Writing from an international outsider perspective instead of authentic cultural sources

When you research a cuisine using general web search, a large share of results will be
written by people who are not from that culture — travel bloggers, food magazines, recipe
aggregators, and international cooking sites. These sources tend to reflect how the cuisine
has been *adapted* and simplified for foreign audiences, not how it is actually practised
at home.

**The symptom:** ingredients that locals consider central are downplayed or absent, while
ingredients that foreigners associate with the cuisine are foregrounded.

**A documented example:** Spanish sofrito.
- International sources describe sofrito as "tomato-based" or lead with tomato.
- Authentic Spanish sofrito is built on **onion, garlic, and pimiento (bell pepper)**.
  Tomato is a secondary or optional element in many regions.
- An AI trained mostly on English-language food content will produce the international
  adaptation, not the authentic version.

**How to detect this trap:**
- Ask yourself: "Am I seeing this cuisine through the eyes of a tourist or a local?"
- If most search results are in English and from non-native cooking sites, treat them with
  suspicion for signature ingredients.
- Search specifically for *[cuisine] home cooking*, *[cuisine] traditional everyday food*,
  or *[cuisine] what families actually eat* — not just *[cuisine] famous dishes*.
- For signature vegetables and spices especially, cross-check with a source in the native
  language if possible, or from a cultural institution, culinary school, or food historian
  from that country.

**Rule:** If the ingredients you are about to write would surprise someone who grew up
cooking that cuisine, stop and research deeper before writing them. The goal is the
insider's view, not the tourist's menu.

---

### ❌ Trap 6: Researching in English when the cuisine has its own language

English-language search results are biased towards how the cuisine is *perceived internationally*,
not how it is actually practised at home. This is the root cause of the sofrito error in Trap 5
and of many similar quality failures: the AI's training data, and most English search results,
reflect how other cultures write about a cuisine rather than what practitioners from that culture
actually do.

**Rule: Always search in the cuisine's own language first.**

Use English searches only to complement — when local-language results are insufficient, hard to
evaluate, or when the cuisine's language is one you cannot translate reliably.

**How to apply this:**

1. Identify the native language(s) of the cuisine.
2. Translate your search queries into that language (or use a tool to help). Examples:
   - Swedish cuisine → search in Swedish: *"de mest äta grönsakerna i Sverige"* instead of
     *"most consumed vegetables in Sweden"*
   - Spanish cuisine → search in Spanish: *"ingredientes básicos de la cocina española"* instead of
     *"essential Spanish cooking ingredients"*
   - Japanese cuisine → search in Japanese: *"日本料理の代表的な食材"*
3. Prefer results from local food institutions, cooking schools, culinary journalism, and
   government food statistics from the country — not international food media.
4. If you find a conflict between English-language results and native-language results,
   **the native-language source takes precedence** for signature ingredients.
5. If you genuinely cannot get enough data in the native language, note this in a
   `<!-- Searched: ... -->` comment and fall back to English, but flag the uncertainty.

**Why this matters:** The most important class of error — confidently wrong signature ingredients —
almost always comes from English-language outsider sources. Native-language sources, even when
partial, give you the insider's view that the data needs.

---

### ❌ Trap 7: Batching pairs to save effort

Research for multiple pairs at once feels efficient. It is not — it is how quality gets
sacrificed without noticing.

When you say "I'll search for all Protein pairs at once" or "let me gather all signature
ingredients across all categories in one go", you stop treating each pair as a distinct
research task and start fitting results into pre-existing buckets. The search query
becomes vague, the evidence becomes mixed, and ingredients land in the wrong pair
because you weren't focused on just that pair.

**The symptom:** after batching, you have results spread across multiple pairs but none
of them is fully verified — because you never stopped and asked "is this actually the
best evidence I can find specifically for *this* pair?"

**Rule:** Close the previous pair before opening the next one. One focused search.
One reviewed result. One written pair. Then and only then move on.
The 15-pair methodology exists precisely because batching fails at quality.
If you feel the urge to batch, that is the signal to slow down, not speed up.

---

### ❌ Trap 8: Extrapolating the remaining pairs from already collected data

After researching 3–5 pairs, you have a picture of the cuisine. The temptation is to
think: "I now understand this cuisine well enough to fill in the rest without searching."
This is the most dangerous trap, because it feels like expertise but is actually
pattern-matching dressed up as research.

**What goes wrong:** the pairs you researched were shaped by what you happened to search.
The remaining pairs have their own specific evidence — statistics you have not seen,
local practices you do not know about, ingredients that a native would expect to see but
that never came up in the pairs you already did.

**A concrete example of failure:** after researching Venezuelan Proteins and Vegetables,
an agent "knew" the cuisine used corn heavily, so it filled in Grains from that prior
knowledge without searching — and missed that Venezuela's bulk grain by consumption
statistics is rice, not corn, with maize flour (arepa) being signature but not bulk.
A search would have shown this. Pattern-matching from prior pairs did not.

**Rule:** Every pair gets its own search. The fact that you have already researched N pairs
does not reduce the research requirement for pair N+1 to zero. Prior knowledge of the
cuisine informs the *interpretation* of search results — it does not replace finding them.
If a pair feels "obvious", search anyway. The obvious answer is often wrong.

---

### ❌ Trap 9: Giving up on a pair when the first search comes up short

The most common failure mode is not bad data — it is *too little data*. An agent searches
once for a pair, finds only 1–2 items, declares the pair done, and moves on. The pair is
marked complete but is actually incomplete.

**Why this happens:** the first obvious search query hits the most visible results. If those
results are sparse, the agent interprets "I did not find much" as "there is not much to find",
and stops. This is wrong. It means the search angle was poor, not that the data does not exist.

**The rule:** If a pair has fewer than 9 verified items after the first search, **do not move
on**. Instead, try a different research angle. You must exhaust at least 3 distinct approaches
before concluding that a pair genuinely cannot be filled.

**How to invent new research angles when the obvious search yields little:**

For **signature** pairs that come up short:
- Try dish-first: "most iconic [cuisine] dishes" → extract what ingredient class each iconic dish uses.
- Try cultural/regional lens: "what do people from [country] consider comfort food" or "what did families eat in [country] 50 years ago"
- Try seasonal/festive: "[cuisine] holiday food", "[cuisine] wedding food", "[cuisine] traditional celebration dish"
- Try diaspora/export: "[cuisine] restaurant abroad what is always on the menu" — this often reveals what is truly considered the cuisine's identity outside marketing
- Try food historians or culinary institutions from the country

For **bulk** pairs that come up short:
- Try alternate statistics keywords: "food balance sheet [country]", "[country] household food expenditure survey", "[country] national dietary survey", "[country] FAO food supply", "per capita food consumption [country] [year]"
- Try the FAO FAOSTAT database directly: "FAOSTAT [country] food supply cereals/vegetables/etc"
- Try the country's own national statistics agency name + food: "INE España alimentación" / "Statistics Finland food" / "Destatis Nahrungsmittel" etc.
- Try the retail angle: "[country] most sold [category] supermarket", "[country] top grocery items by sales volume"

For **local** pairs that come up short:
- Try the production/agriculture angle: "[country] agricultural output report", "[country] livestock statistics", "[country] fishing catch report", "[country] harvest data"
- Try GI/PDO registries: "European PDO [country] food", "[country] protected designation of origin food products", "[country] geographical indication list"
- Try regional focus: name each major region of the country and search "[region] local food production" — local production is often invisible at the national level but well-documented regionally
- Try export statistics: "[country] food exports what products" — what a country exports is almost always what it produces locally in significant volume

**Stop condition:** you may conclude a pair genuinely has fewer than 9 items only after having
tried at least 3 distinct search angles, none of which yielded additional candidates. Document
this with a `<!-- Searched: ... — insufficient results after N angles -->` comment so the next
agent knows the pair was genuinely attempted and not just skipped.

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
