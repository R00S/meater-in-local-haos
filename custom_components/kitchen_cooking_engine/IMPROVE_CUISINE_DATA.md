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

A cuisine file has 5 ingredient categories (Proteins, Produce, Grains & Starches,
Dairy, Oils & Sauces, Spices, Nuts & Seasonings). Each category has 3 grades
(signature, bulk, local).
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
| `rating` | ✅ | Integer 1–9. Significance within the grade — not a rank. Multiple ingredients may share the same value. Top 3 shown per grade (by highest rating, before "More" is clicked); clicking "More" reveals additional items — **8 or more items per pair** (or **6 or more for Grains & Starches**) ensures the "More" section is always meaningful. |
| `name` | ✅ | English display name — **the raw, uncooked ingredient** (råvara). This is the label shown in the GUI badge. It must be a clean ingredient name with **no parentheses, no dashes with annotations, no dish names, no local-language annotations**. Examples of correct names: `Lamb`, `Haddock`, `Pork belly`, `Garam masala`, `Suckling pig`. Put dish names, local names, cultural context, and origin details in `notes` only. |
| `name_sv` | ✅ | Swedish display name — same rules as `name`: the raw ingredient in Swedish, clean, no parentheses, no dash annotations. E.g. `Lammkött`, `Kolja`, `Fläskbuken`. |
| `notes` | — | Evidence for the grade and rating; brief source reference. This is also the place for dish names, local-language names, origin labels, and any other context useful to the AI recipe builder — it is never shown directly in the GUI badge. |

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
by default (top 3 shown × 3 grades). The data target per grade is **8 or more** items (for
Grains & Starches: **6 or more**), so that clicking "More" always reveals at least a few
additional items per grade.

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
3. Work through its pairs **one at a time**, in this exact order:
   - Proteins — Signature
   - Proteins — Local
   - Proteins — Bulk
   - Produce — Signature
   - Produce — Local
   - Produce — Bulk
   - Grains & Starches — Signature
   - Grains & Starches — Local
   - Grains & Starches — Bulk
   - Dairy, Oils & Sauces — Signature
   - Dairy, Oils & Sauces — Local
   - Dairy, Oils & Sauces — Bulk
   - Spices, Nuts & Seasonings — Signature
   - Spices, Nuts & Seasonings — Local
   - Spices, Nuts & Seasonings — Bulk

   **Deduplication rule (critical):** Research signature first, then local, then bulk.
   - If an ingredient already appears in **signature**, do **not** repeat it in local or bulk.
     Find a different ingredient to fill that slot.
   - If an ingredient already appears in **signature or local**, do **not** repeat it in bulk.
     Find a different ingredient to fill that slot.
   - Each grade must introduce ingredients that are not already listed in a higher-priority grade.
     Duplicates waste slots and dilute the value of the "More" section.
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

## Worked example — how the 15 pairs are executed in practice

Below is the actual sequence of web searches used when researching Finnish cuisine.
Each pair gets exactly one focused search (sometimes one native-language + one English),
then the results are written and the next pair begins. No batching. No extrapolation.

```
Pair 1: Proteins — Signature
  Search (native): "Web Search: Finnish perinteiset ruoat ikoninen proteiini lohi poro
                   silakka - perinteiset suomalaiset ruoat tyypilliset lihat kalat"
  → Wrote Proteins — Signature items. Pair 1 done.

Pair 2: Proteins — Local
  Search (mixed): "Web Search: Suomi kalastus poronhoito hirvenmetsästys paikallinen
                  tuotanto lihakarja - Finland local protein production livestock
                  fishing hunting statistics"
  → Checked for duplicates with Pair 1 (signature). Wrote Proteins — Local items
    that are not already in signature. Pair 2 done.

Pair 3: Proteins — Bulk
  Search (English): "Web Search: Finland meat consumption per capita statistics 2022 2023
                    pork chicken beef kg/capita FAO food balance"
  → Checked for duplicates with signature and local. Wrote Proteins — Bulk items
    that are not already listed in either. Pair 3 done.

Pair 4: Produce — Signature
  Search (native): "Web Search: suomalaiset perinteruoat kasvikset perunalaatikko
                   lanttulaatikko porkkanalaatikko rosolli joulupöytä perinteinen"
  → Wrote Produce — Signature items. Pair 4 done.

Pair 5: Produce — Local
  Search (mixed): "Web Search: Suomi paikallinen kasvituotanto sienet marjat kantarelli
                  puolukka peruna lanttu - Finland locally grown vegetables foraging
                  mushrooms berries"
  → Checked for duplicates with signature. Wrote Produce — Local items
    not already in signature. Pair 5 done.

Pair 6: Produce — Bulk
  Search (English): "Web Search: Finland vegetable consumption per capita statistics
                    most consumed vegetables 2022 2023 Luke natural resources"
  → Checked for duplicates with signature and local. Wrote Produce — Bulk items
    not already listed in either. Pair 6 done.

Pair 7: Grains & Starches — Signature
  Search (mixed): "Web Search: ruisleipä karjalanpiirakka kaurapuuro suomalainen
                  ruokaidentiteetti ikoninen vilja - Finnish rye bread oats iconic
                  grain dishes identity"
  → Wrote Grains & Starches — Signature items. Pair 7 done.

Pair 8: Grains & Starches — Local
  Search (English): "Web Search: Finland grain crop production locally grown oats barley
                    rye wheat farming statistics hectares production Luke"
  → Checked for duplicates with signature. Wrote Grains & Starches — Local items
    not already in signature. Pair 8 done.

Pair 9: Grains & Starches — Bulk
  Search (English): "Web Search: Finland grain consumption per capita 2022 2023 wheat
                    rye oats statistics Luke food balance cereals"
  → Checked for duplicates with signature and local. Wrote Grains & Starches — Bulk items
    not already listed in either. Pair 9 done.

Pair 10: Dairy, Oils & Sauces — Signature
  Search (native): "Web Search: suomalainen juustoleipä viili piimä ikoninen maitotuote
                   perinteinen - Finnish dairy signature bread cheese viili traditional
                   iconic"
  → Wrote Dairy, Oils & Sauces — Signature items. Pair 10 done.

Pair 11: Dairy, Oils & Sauces — Local
  Search (English): "Web Search: Finland local dairy production Finnish Ayrshire cattle
                    breeds regional cheese varieties juustoleipä production area
                    Ostrobothnia Lapland"
  → Checked for duplicates with signature. Wrote Dairy, Oils & Sauces — Local items
    not already in signature. Pair 11 done.

Pair 12: Dairy, Oils & Sauces — Bulk
  Search (English): "Web Search: Finland dairy consumption per capita milk butter cheese
                    2022 2023 statistics Luke kg per capita"
  → Checked for duplicates with signature and local. Wrote Dairy, Oils & Sauces — Bulk items
    not already listed in either. Pair 12 done.

Pair 13: Spices, Nuts & Seasonings — Signature
  Search (mixed): "Web Search: suomalaisen ruuan mausteet tilli kumina maustepippuri
                  valkopippuri katajan marjat ikoninen maku - Finnish cuisine defining
                  spices dill caraway allspice signature flavour"
  → Wrote Spices, Nuts & Seasonings — Signature items. Pair 13 done.

Pair 14: Spices, Nuts & Seasonings — Local
  Search (mixed): "Web Search: Finland locally foraged seasonings juniper berries
                  lingonberry sea buckthorn tyrni wild herbs birch kataja paikallinen
                  maustekasvit"
  → Checked for duplicates with signature. Wrote Spices, Nuts & Seasonings — Local items
    not already in signature. Pair 14 done.

Pair 15: Spices, Nuts & Seasonings — Bulk
  Search (English): "Web Search: Finland most used seasonings condiments statistics
                    salt pepper dill everyday cooking consumption 2022 2023"
  → Checked for duplicates with signature and local. Wrote Spices, Nuts & Seasonings — Bulk items
    not already listed in either. All 15 pairs done.
  → Set research_done: 1. Ran generator. Committed.
```

**What this demonstrates:**
- Every pair gets its own search — never combined or skipped.
- Native-language searches are used where the cuisine has its own language (Finnish here).
- English is used for statistics when official data is easier to find in English.
- The transition between pairs is explicit: "Pair N done. Now Pair N+1."
- The sequence is always the same order (Proteins → Produce → Grains & Starches → Dairy, Oils & Sauces → Spices, Nuts & Seasonings), and within each category the order is **signature → local → bulk**.
- Before writing local items, check the signature list and skip any ingredient already there.
- Before writing bulk items, check both signature and local and skip any ingredient already there.

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
**Eight or more items is the absolute floor** — 8 or more real items is the minimum credible result for a
pair that has been researched. **For Grains & Starches the floor is 6 or more.** This ensures that when the user clicks "More", they see
at least a few additional items beyond the top 3 shown (before "More" is clicked). Add every verified item you
find beyond the floor; they all improve the AI's picture of the cuisine and appear when the user
clicks "More".

**Stub entries:** cuisine files ship with placeholder stubs per grade pair. When you
research a pair, replace the stubs one-by-one with real verified items. **Do not delete
stubs that you have not yet replaced** — a remaining stub signals that the slot is still
empty and needs work. Once all stubs are gone, keep adding verified items freely.

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

**A concrete example of failure:** after researching Venezuelan Proteins and Produce,
an agent "knew" the cuisine used corn heavily, so it filled in Grains & Starches from that prior
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

**The rule:** If a pair has fewer than 8 verified items after the first search (fewer than 6 for Grains & Starches), **do not move
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

**Stop condition:** you may conclude a pair genuinely has fewer than 8 items (fewer than 6 for Grains & Starches) only after having
tried at least 3 distinct search angles, none of which yielded additional candidates. Document
this with a `<!-- Searched: ... — insufficient results after N angles -->` comment so the next
agent knows the pair was genuinely attempted and not just skipped.

---

### ❌ Trap 10: Entering dishes as ingredients

**Dishes do not belong in cuisine files at all.** An ingredient is a raw material (råvara) —
something you buy at a market or farm, forage, fish for or hunt. A dish is a preparation — something a cook makes
from ingredients. The two are not interchangeable and must never be confused.

**Wrong — these are dishes, not ingredients:**
```
- {id: cochinillo, name: "Roast Suckling Pig", ...}
- {id: chicharron, name: "Fried Pork Chunks", ...}
- {id: moqueca, name: "Fish Stew", ...}
- {id: jerk_chicken, name: "Jerk Chicken", ...}
- {id: boeuf_bourguignon, name: "Beef Bourguignon", ...}
```

These entries must be **deleted**. Do not rename them, do not move the dish name to `notes`,
do not replace them with a vague category like "firm white fish" as a stand-in for a stew.

**If a dish appears in your research, use it as a signal — not as an entry.**
Ask: what is the raw protein (or vegetable, grain, spice) that this dish is built on?
Research and add *that ingredient* instead.

| Dish that appeared in research | What to add instead |
|-------------------------------|---------------------|
| Roast Suckling Pig (cochinillo) | `Suckling pig` — the animal as purchased |
| Fried Pork Chunks (chicharrón) | `Pork belly` or `Pork rind` — the cut used |
| Fish Stew (moqueca) | Research which fish species moqueca actually uses, then add those fish |
| Jerk Chicken | `Chicken` — already a raw ingredient |
| Beef Bourguignon | `Beef chuck` or `Beef stew cuts` — the raw cut used |

**The test:** Can you walk into a shop and buy this item uncooked? If yes, it is an ingredient.
If it must be cooked first, it is a dish — **delete the entry and research the underlying ingredient.**

The only narrow exception: ingredients that are defined by a curing or drying process and
sold as-is at a market (e.g. `Smoked paprika`, `Dried chilli`, `Cured ham`, `Pickled lime`).
These are preserved ingredients, not dishes.

---

### ❌ Trap 11: Parentheses or dashes with annotations in name or name_sv clutter the GUI

Parenthetical text or dash-separated annotations in `name` or `name_sv` are shown directly
in the GUI badge. They make badges harder to read and harder to understand for users who are
not from that culture. The badge must be immediately comprehensible — a single clean ingredient name.

This applies to **both** parentheses **and** dashes used as annotation separators:

**Wrong:**
```
name: "Pork Belly (sidfläsk)"
name: "Haddock (Melanogrammus aeglefinus)"
name: "Garam masala (spice blend)"
name: "Char siu (BBQ pork)"
name_sv: "Havskräfta (Norska hummer)"
name: "Catla Carp — Pond Aquaculture"
name: "Hilsa — National Fish"
name: "Chilli — Locally Cultivated"
name_sv: "Buffelmjölk — Sydkusten"
```

**Right:**
```
name: "Pork belly"          notes: "sidfläsk; used in hong shao rou red-braised belly"
name: "Haddock"             notes: "Melanogrammus aeglefinus; most common white fish in British fish and chips"
name: "Garam masala"        notes: "aromatic spice blend — the defining warm-spice seasoning of South Asian cooking"
name: "Char siu pork"       notes: "叉烧 — lacquered BBQ pork; used in char siu bao and fried rice"
name_sv: "Havskräfta"       notes: "Norska hummer; Nephrops norvegicus; central to Norwegian and Swedish west-coast cuisine"
name: "Catla carp"          notes: "pond-farmed freshwater carp; major aquaculture species in Bangladesh"
name: "Hilsa"               notes: "Tenualosa ilisha; national fish of Bangladesh; essential to Bengali cooking"
name: "Chilli"              notes: "locally cultivated; small red varieties dominant in Bengali home cooking"
name_sv: "Buffelmjölk"      notes: "produceras längs södra kusten och kustzonen; bas i lokal ostproduktion"
```

**Rule:** `name` and `name_sv` must each be a **single clean ingredient name** — no parentheses,
no dash-separated labels, no local-script annotations, no origin suffixes, no grade labels.
The user who sees the badge should instantly know what ingredient it is. Anything beyond the
bare ingredient name belongs in `notes`, where the AI recipe builder can use it freely and
it never clutters the GUI.

The only narrow exception: ingredients that are defined by a curing or drying process and
sold as-is at a market (e.g. `Smoked paprika`, `Dried chilli`, `Cured ham`, `Pickled lime`).
These are preserved ingredients, not dishes, and the preparation method is part of the name.

---

### ❌ Trap 12: Region-prefix in names, and "local"/"lokalt odlad" in names

**Two related mistakes that clutter the name field:**

#### 12a — Region-prefix names that are just the regular ingredient

Adding a cuisine or region prefix to an ingredient's name is acceptable **only** when the
prefix genuinely makes it a *different ingredient* — one that a shopper, cook, or botanist
would recognise as distinct from the base ingredient without the prefix.

**Acceptable (different ingredient):**
```
name: "Jerusalem artichoke"   # not an artichoke at all; a separate tuber species
name: "Scotch bonnet"         # a specific chilli cultivar, not just any chilli
name: "Kalamata olive"        # a specific Greek variety with distinct taste and texture
name: "Hokkaido pumpkin"      # a specific Japanese cultivar sold by that name globally
```

**Not acceptable (same ingredient, different origin):**
```
name: "Cuban black beans"       → name: "Black beans"
name: "Belgian strawberries"    → name: "Strawberries"
name: "Romanian sunflower oil"  → name: "Sunflower oil"
name: "Cuban tomatoes"          → name: "Tomatoes"
name_sv: "Kubanska bönor"       → name_sv: "Svarta bönor"
```

If the only thing the prefix tells you is where the ingredient is grown or made, **drop the
prefix**. The cuisine file already tells the AI this ingredient is used in Cuban / Belgian /
Romanian cooking. A redundant origin label in the name adds nothing and misleads the user
into thinking it is a special variety.

**The test:** Could you substitute a specimen from another country and the dish would be the
same? If yes, drop the prefix and put any origin notes in the `notes` field.

---

#### 12b — "Local", "locally grown", "lokalt odlad", "lokal" in name or name_sv

The `grade: local` field already communicates that an ingredient is locally produced.
Writing "Lokalt odlad tomat" or "Locally grown tomato" in `name` or `name_sv` is redundant
noise that clutters the GUI badge — the user sees "Lokalt odlad tomat" where they should
just see "Tomat".

**Wrong:**
```
name: "Locally grown tomato"
name_sv: "Lokalt odlad tomat"
name: "Local black beans"
name_sv: "Lokal majs"
```

**Right:**
```
name: "Tomato"            notes: "locally grown; key in Cuban cooking year-round"
name_sv: "Tomat"
name: "Black beans"       notes: "locally cultivated staple"
name_sv: "Svarta bönor"
```

**Rule:** `name` and `name_sv` must never contain the words "local", "locally", "lokalt",
"lokal", "locally grown", "locally produced", or any equivalent. The grade field handles
that signal. The name field must be the clean ingredient name only.

---

### ❌ Trap 14: Cross-grade duplication within a category section

If an ingredient already appears in **signature**, do **not** repeat it in **local** or **bulk**.
If an ingredient already appears in **local**, do **not** repeat it in **bulk**.
This is stated in the methodology example, but it is the single most widespread structural error
in practice — so it gets its own trap.

**Why it keeps happening:**

The most common failure mode is the agent writing Local-grade entries and thinking:
"This ingredient IS locally produced — that's *exactly* why it should be in Local."
The agent is right about the fact but wrong about the conclusion. If the ingredient is
*already in Signature*, it is already in the data. Repeating it in Local adds zero
information and corrupts the deduplication logic.

A second failure mode: the Bulk pair is researched independently from the Signature pair
(as it should be, per the 15-pair methodology) and the agent picks the statistically
most-consumed items — which are often the same iconic items already in Signature.

**Documented failure (2026-05, Hawaiian cuisine):**
- `ginger`: in Spices-Sig AND Spices-Local
- `garlic`: in Spices-Sig AND Spices-Local
- `chicken`: in Proteins-Sig AND Proteins-Bulk
- `spam`: in Proteins-Sig AND Proteins-Bulk
- `beef`: in Proteins-Sig AND Proteins-Bulk
- `white rice`: in Grains-Sig AND Grains-Bulk
- `shoyu`: in Dairy-Sig AND Dairy-Bulk
- `coconut milk`: in Produce-Sig AND Dairy-Bulk

**Documented failure (2026-05, Georgian cuisine):**
- `walnut oil`: in Dairy-Sig AND Dairy-Local
- `guda cheese`: in Dairy-Sig AND Dairy-Local
- `Zanduri`: in Grains-Sig AND Grains-Local (under different name variants)
- `Imeretian saffron`: in Spices-Sig AND Spices-Local
- `blue fenugreek`: in Spices-Sig AND Spices-Local

**The rule:** Before writing **any** item into any grade of a section, scan the section above
(all items already written in Signature and Local for that section) and skip if the same
ingredient is already present, regardless of which grade it is in.

This dedup check must be done item-by-item. A bulk scan at the end is not sufficient — you
need to check *before you write each item* so you do not invest effort in a duplicate.

**How to do it in practice:**

1. After writing Signature, paste the ingredient names in a visible list.
2. When writing Local, run down that list before writing each entry.
3. When writing Bulk, run down BOTH the Signature and Local lists.
4. If an item is on either prior list → skip it. Write the next-best item instead.

**The one exception — Local sub-varieties of a Signature ingredient:**

If Signature has `name: "Taro"` and Local has `name: "Wetland taro"` (a specific cultivated
variety with a distinct name and growing method), this is acceptable because it is a genuinely
different product — not just the same ingredient with a locality label. Apply this exception
sparingly. When in doubt, do NOT add the local sub-variety.

---

### ❌ Trap 15: Disguised duplication — same ingredient under different names

The dedup logic described in Trap 14 only catches exact or near-exact string matches.
**Do not exploit this** by giving the same ingredient a different name in each grade.

**Documented failure (2026-05, Georgian cuisine):**
- Spices-Sig: `name: "Imeretian Saffron (Dried Marigold)"` (= dried Tagetes petals)
- Spices-Local: `name: "Marigold Petals (Imeretian Saffron)"` (= the same dried Tagetes petals)

These are exactly the same ingredient — just named from different angles (one leads with
the Georgian culinary name, one leads with the botanical description). The automated scan
would not catch this. The agent almost certainly did not notice.

A second example from the same file:
- Spices-Sig: `name: "Blue Fenugreek (Utskho Suneli)"` (= Trigonella caerulea)
- Spices-Local: `name: "Blue Fenugreek Plants (local)"` (= the same plant grown locally)

**The rule:** When writing Local or Bulk items, ask yourself: *"Is this the same food, even
if I am describing it differently?"* If a Spices-Sig item describes a spice by its culinary
name and you are about to add the same spice described by its botanical name or production
context, **that is a duplicate**. Use the same name consistently, and add only one instance.

**How to catch it:** When you think an item belongs in Local because it is "locally grown",
trace it back to its English ingredient name (without the "locally grown" qualifier) and ask
if that bare ingredient name is already in Signature.

---



The `name` field is the **English display name** shown in the GUI. Every user sees it — including
users who have never heard of the cuisine and do not speak the cuisine's language. When you write
`name: "Crema de leche"` instead of `name: "Heavy cream"`, the user sees a Spanish phrase where
they should see a plain English ingredient name. When you write `name: "Queso Paipa"` instead of
`name: "Paipa cheese"`, the user is left guessing what "Queso" means.

**The rule:** `name` must be the ingredient's **English culinary name** — the name an
English-speaking shopper or cook would recognise and search for. `name_sv` must be the
**Swedish culinary name**.

**Wrong:**
```
name: "Crema de leche"         # Spanish for heavy cream
name: "Ají molido"             # Spanish for ground red pepper
name: "Queso cremoso"          # Spanish for creamy fresh cheese
name: "Queso Paipa"            # Spanish; should be Paipa cheese
name: "Lori-Panir"             # Armenian; should be Lori cheese
name: "Livanjski Sir"          # Bosnian; should be Livno cheese
name: "Aframomum"              # Botanical genus; should be Grains of Selim
```

**Right:**
```
name: "Heavy cream"            notes: "crema de leche; used in pasta sauces, tarts, and chocotorta"
name: "Ground red pepper"      notes: "ají molido; dried chili flakes; defining heat in chimichurri"
name: "Cremoso cheese"         notes: "queso cremoso; mild spreadable fresh cheese; Argentine pizza cheese"
name: "Paipa cheese"           notes: "queso Paipa; Colombia's only PDO cheese; semi-mature; Paipa, Boyacá"
name: "Lori cheese"            notes: "Lori-Panir; firm cylindrical cheese from Lori province"
name: "Livno cheese"           notes: "Livanjski Sir; GI-protected hard cheese from Livno, Bosnia"
name: "Grains of Selim"        notes: "Aframomum daniellii/melegueta; West African false cardamom"
```

**The exception — accepted culinary loanwords:**

Many ingredient names are borrowed from other languages and ARE the standard English name.
These do NOT need to be translated, because the borrowed term *is* the English name:

```
name: "Ghee"          # English uses the Hindi word — this IS the English name
name: "Bulgur"        # English uses the Turkish word
name: "Harissa"       # English uses the Arabic word
name: "Chimichurri"   # English uses the Spanish word
name: "Roti"          # English uses the Hindi word
name: "Dulce de leche"  # English uses the Spanish phrase for this specific product
name: "Arequipe"      # English uses the Colombian term for this specific caramel product
name: "Ají color"     # English uses this term for the specific Chilean pepper variety
```

**How to tell the difference:**

Ask: *"Would an English-speaking cook searching for this ingredient type this exact term
into a recipe website?"*

- If yes → the loanword IS the English name. Keep it.
- If no, and a plain English description exists → use the English description. Put the
  local-language name in `notes`.

**Same rule applies to `name_sv`:** it must be the Swedish culinary name, not a copy of
the Spanish, Armenian, or Bosnian name. If there is no established Swedish word for a
foreign ingredient, use the descriptive Swedish equivalent or keep the loanword if that
IS how Swedish-speaking cooks know the ingredient.

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

---

## Root-cause analysis: 2026-05 conformance audit (8 cuisine files)

This section documents WHY the violations found in the May 2026 audit happened,
to help future agents recognise and avoid the same patterns.

**Files audited:** hawaiian, haitian, greek, german, georgian, french, finnish, ghanaian.
**Files that needed fixes:** 7 of 8 (ghanaian was clean).

---

### Pattern A — Trap 11: Parenthetical annotations in names (most widespread)

**Observed in:** hawaiian, german, georgian, french, finnish, greek (6/8 files).

**What agents wrote:**
```
name: "Cherry Plum (Tkemali)"
name: "Blue Fenugreek (Utskho Suneli)"
name: "Fresh Coriander (Cilantro)"
name: "Wild Garlic (Ramsons)"
name: "Imeretian Saffron (Dried Marigold)"
name: "Green Lentils (Puy)"
name: "White Beans (cassoulet)"
name: "Isigny Cream (AOP)"
name: "Cornmeal (Gaudes)"
name: "Cep (Porcini)"
name: "Cheese (sliced/processed)"
```

**Why it keeps happening:**

The agent sees an ingredient with a famous native-language name or a well-known synonym
and wants to help the user understand what it is. Adding "(Tkemali)" after "Cherry Plum"
feels useful — it connects the English name to the Georgian name the recipe will mention.

This is a well-meaning instinct that violates the rule. The parenthetical information
belongs in `notes`, where the AI uses it freely. In `name` it clutters the badge.

**The specific mental trigger to watch for:**

If you catch yourself about to write `name: "X (Y)"` because:
- Y is the native-language name for X (Tkemali, Utskho Suneli, Gaudes)
- Y is a synonym or alias in another language (Cilantro, Ramsons, Porcini)
- Y is a product category label (AOP, AOC, cassoulet, for cooking)
- Y is a botanical description (Dried Marigold, Fresh Whey Cheese)

→ Stop. Move Y to `notes`. Keep only X in `name`.

**The only exception:** preparation methods that ARE the ingredient's English culinary name
(`Smoked paprika`, `Dried chilli`, `Cured ham`) — these are not annotations, they are names.

---

### Pattern B — Trap 12a: Cuisine/country prefix on Local-grade entries (very common)

**Observed in:** georgian, french (2/8 files explicitly; likely latent elsewhere).

**What agents wrote:**
```
Georgian Maize, Georgian Wheat, Georgian Barley, Georgian Sunflower, Georgian Kidney Bean
French Maize, French Rye, French Oats, French Cider Vinegar, French Basil (Grand Vert)
```

**Why it keeps happening:**

When writing the Local grade, the agent wants to distinguish locally-grown items from
their generic counterparts in Signature or Bulk. Prefixing with "Georgian" or "French"
feels like it adds precision and signals "this specific variety".

But the cuisine file IS the Georgian / French file. The `grade: local` already communicates
"locally produced in Georgia / France". The prefix adds zero information and misleads the
user into thinking it is a special variety.

**The specific mental trigger to watch for:**

If your ONLY reason for adding the country/region prefix is "this is grown in [country]",
drop the prefix. The grade handles it.

Keep the prefix ONLY if removing it would create a genuinely different ingredient:
- "Camargue Rice" → not just "rice"; specific variety with IGP, distinct character. KEEP.
- "Georgian Maize" → just maize grown in Georgia. DROP.

---

### Pattern C — Trap 14/15: Cross-grade duplication (most damaging structurally)

**Observed in:** hawaiian (8 dupes), georgian (5 dupes), french (1 dupe).

**Root cause — Local-grade research:**

The agent correctly identifies that ingredient X is locally produced in the cuisine's region.
The agent writes X into Local. But X is *already in Signature* because it is also an iconic
ingredient. The agent did not scan backwards through the section before writing.

**Root cause — Bulk-grade research:**

The agent researches what is consumed in highest volume statistically. The top results
are the same iconic proteins/spices/grains that are ALREADY in Signature — because a
cuisine's most iconic ingredients are typically also its most consumed. The agent writes
them again without checking.

**The concrete failure pattern (Hawaiian):**

The agent wrote Proteins-Signature with chicken, pork, spam, beef, shrimp.
The agent then researched Proteins-Bulk and found: chicken, pork, spam, beef, shrimp
are consumed in largest volumes. Correct research, wrong action: added them again to Bulk
instead of finding the next-tier proteins not already in Signature.

**The concrete failure pattern (Georgian):**

The agent wrote Spices-Signature with "Blue Fenugreek (Utskho Suneli)" and "Imeretian Saffron".
The agent then wrote Spices-Local with "Blue Fenugreek Plants (local)" and "Marigold Petals
(Imeretian Saffron)". The slightly different names masked the duplication. The dedup scan
did not flag them because the strings did not match exactly. Only a human reading both lists
side-by-side would see they are the same ingredients.

**The prevention rule:**

Before writing any item into Local or Bulk, mentally strip any prefix, suffix, qualifier,
or parenthetical from the name, and ask: "Is this bare ingredient already in Signature?"
If yes, skip it. Write the next-best item that is genuinely not already present.

---

### Pattern D — Trap 2: Bundled entries with slash separators

**Observed in:** hawaiian, german, greek, french, finnish (slash or ampersand in name).

**What agents wrote:**
```
name: "Brie/Camembert"
name: "Cheese (sliced/processed)"
name: "Lime & Lemon"
```

These are distinct ingredients that each deserve their own entry with their own `id`
and `rating`. The slash/ampersand is a shortcut that loses information and violates
the data model.

**Why it happens:** The agent correctly identifies two items from the same category
(both "sliced cheese" and "processed cheese" are valid bulk items) but avoids adding
two entries to stay "under some imagined limit". There is no such limit. Add both.

---

### Conformance checklist for future agents

Before considering any cuisine file complete, run this mental checklist:

**Name field rules:**
- [ ] No `(parentheses)` or `)brackets(` in any `name` or `name_sv`
- [ ] No `/` slash in `name` or `name_sv`
- [ ] No ` & ` ampersand in `name` (unless it IS the ingredient's name, like "Salt & pepper")
- [ ] No "local", "locally", "lokalt", "lokal" in `name` or `name_sv`
- [ ] No cuisine/country prefix unless it makes a genuinely distinct ingredient

**Structure rules:**
- [ ] For each section, Signature items are NOT repeated in Local or Bulk
- [ ] For each section, Local items are NOT repeated in Bulk
- [ ] "Same ingredient under different names" check: could two items in different grades refer to the same food?
- [ ] Minimum 8 items per grade in non-Grains sections (6 for Grains & Starches)
- [ ] No dish entries (things that require cooking to exist)

**Generator:** Always run `python3 generate_frontend_data.py` after editing. A YAML parse error silently drops the affected item — the generator succeeding is NOT a proof of correctness, only of syntax validity.
