This is a set of instructions for the agent to conduct when the user refers to this file, the agents may never edit this file unless specificly intructed to.
__________________

## READ THIS FIRST — WHAT WE ARE DOING

We are building a corpus of **human-written, verifiable recipe data** for cooking temperatures. That is
the work. It is not a score, and there is no score to raise.

The working signal is **potential for improvement**: how much verifiable human data exists that we have
not captured yet, plus how much of what we have captured is unverified, silent, or contradicts itself.
A cut with twenty sources and four known holes has *more* potential than a cut with eight sources and no
holes. Choose work by that, and finish by closing, disproving or scheduling the holes.

**There is no "done".** A cut, a leaf, a pass and the collection itself are never finished, because the
collection is only finished when we can no longer tell whether the recipes we find are human-written or
AI-generated. We are nowhere near that, so the corpus keeps growing and speed buys nothing. Do not try to
get closer to done by working faster; the only thing speed produces is thinner evidence.

**What you must never do:** quote a score, compute a score, try to raise a score, report that a number
went up, or choose your work because a cut is "low". `quality_score` in the cut frontmatter is a
**legacy field**. It is frozen, it is not maintained, and it must not be read, updated, quoted or reasoned
about. If you catch yourself thinking "this will lift the cut to 15", you have left the task.

---

## SESSION START — MANDATORY GATE. DO NOT SKIP. DO NOT TOUCH ANY CUT FILE UNTIL ALL FOUR OUTPUTS BELOW ARE WRITTEN TO YOUR BRANCH TIMELINE FILE.

Open your branch timeline file (`docs/<branch-name-without-prefix>-<A.B.C.x>.md`) and add a section headed `## Session start` containing the following four items. Each item must be written **before** you look at a single cut file. You have to do this even if a former agent have already done it in the file.

---

### Output 1 — Culinary group definitions (verbatim from `RECIPE_COLLECTION_TOR.md`)

Open `RECIPE_COLLECTION_TOR.md` and find the "Culinary group coverage" table under section `### Culinary group coverage`. Copy all four rows word-for-word into your timeline file.

**The file is the authority, not this one.** This instruction file has previously carried a paraphrase that
read "Thai, Vietnamese, Indian" in the Group A row; the source file reads "Thai, Vietnamese, Bengali,
Ceylon, Indian". Copy what is in `RECIPE_COLLECTION_TOR.md` at the time you run the pass, and if it
disagrees with anything here, the source file wins and you note the disagreement in your timeline.

Any paraphrase or wrong country detail is instant evidence the file was not read. The timeline entry must be verbatim.

---

### Output 2 — Analysis gate rule (verbatim from `RECIPE_ANALYSIS_TOR.md`)

Open `RECIPE_ANALYSIS_TOR.md` and find the paragraph near the top that starts "Analysis begins only after…". Copy the exact two sentences word-for-word:

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

The exact threshold number (4–6) must appear in your timeline entry. A wrong number proves the file was not read.

---

### Output 3 — Source integrity rule (verbatim from `SOURCE_SURVEY.md`)

Open `SOURCE_SURVEY.md` and find the bolded project rule near the top. Copy the exact two sentences word-for-word:

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

---

### Output 4 — Your understanding of this file (your own words)

Write 3–5 sentences in your own words covering:

- What the primary task is, stated in terms of **data and evidence**, not in terms of a score
- What "potential for improvement" means to you concretely, and what would make you choose one cut over another
- What "this is not a race" means, and why the collection cannot be finished by working fast
- What you will do after the cut work is done

An answer framed as "raise the lowest scores, create enough leaves to hit the target, get as close to 20
as possible" proves the file was not absorbed. An answer like "find where verifiable human data exists
that we have not captured, capture it with its provenance, record honestly where it does not exist, and
leave the next pass a list of exactly what is still missing" is correct.

---

**Only after all four outputs exist in the timeline file, proceed to the task below.**

---

## THE TASK

### 1. Choose work by potential, not by score

Work the cuts at the top of the generated queue: `www/recipes/CUT_POTENTIAL.md`. That file is **generated
by the measurement sweep and is never hand-edited** — you read it, you do not write it. It lists each cut's
enumerated gaps, their effort, and what each would yield.

- Highest unblocked potential first; among equals, the cheapest evidence per unit of effort first
- A cut with no enumerated gaps is **not** a priority, however low its legacy score looks
- A cut with many enumerated gaps **is** a priority, however high its legacy score looks
- The file is regenerated by `measure_cut_potential.py`, which `CHORES.md` runs. If it is missing or
  clearly stale, run that script yourself before choosing work — do not guess a queue from a score.
- Where the queue disagrees with what you can see in a cut, trust the file you just read and record the
  gap. The sweep reads structure, not meaning.

### 2. For each cut: build the gap ledger, then close gaps

**a. Write the ledger into the cut file** as a `## Data state and gaps` section. Each entry needs
`evidence` (file + line, URL, or the literal queries you ran), `effort` (S/M/L), and `yield` (what data
closing it produces).

Start the section with a snapshot line so the sweep can check your claims against the files later:

```
<!-- ledger-state: leaves=4 sources=16 silent=11 silent_leaves=1 methods=grill,oven_bake,pan_fry,simmer -->
```

The sweep reports a conflict when those numbers stop matching the files, and a conflicting ledger is
itself a gap. Writing the snapshot is not optional: without it, the next pass cannot tell whether the
ledger is current, and a stale ledger is worse than no ledger at all.

A worked example lives in `game/moose/ground_moose.md`.

Gap ids the sweep emits (reuse these names so entries line up): `hub_recommended_not_in_hub_bands`,
`hub_method_without_leaf`, `orphan_leaf`, `leaf_without_any_temperature`, `recorded_unsafe_source`,
`inferred_mention_near_numbers`, `authored_ledger_stale`, `usda_mismatch`, `hub_registry_method_drift`,
`hub_without_registry_entry`. Anything the sweep cannot see gets your own id, and should say why the
machine cannot see it. Registry `temperature_ranges` are zone labels, not doneness bands — do not report
one as the other.

Types of gap to look for:

| Gap | How to see it |
|---|---|
| `registry_method_drift` | registry `supported_methods`, the frontmatter `methods:`, and the actual leaf files disagree |
| `silent_leaf` | a leaf whose sources publish **no** temperature at all |
| `unsafe_source` | a source whose published doneness advice contradicts a safe target |
| `source_shortfall` | a leaf below 4 readable sources |
| `duplicate_tradition` | every source in a leaf from one tradition |
| `missing_group` | a culinary group with no record anywhere in the cut |
| `unreachable_source` | a cited URL that no longer resolves |
| `method_unregistered` | a method the corpus uses that the engine cannot express |
| `provenance_inferred` | method steps you wrote that the page did not contain |

**b. Research the methods honestly.** Do not assume the `methods:` list is complete, and do not treat
finding a method as optional extra work. The method set is derived, not declared: registry methods, the
frontmatter list and the leaf files must all agree, and any difference is a gap.

**c. Every confirmed method gets a leaf.** If a method is used by **two or more cuts**, it is not cut work
— write it to the system backlog with the list of cuts it unblocks and its true cost (enum value, info
entry, panel support, AI mapping). Record it in the ledger as `blocked_by`. This is how discoveries stop
being silently skipped.

**d. Mark provenance on every method step.** `verbatim` (the page's own words, translated), `paraphrase`
(the page's meaning, restructured), or `inferred` (your reasoning from elsewhere on the page, or from
general technique). **An `inferred` step may never carry a number, a time or a temperature.** A leaf with
more than a couple of `inferred` steps is not finished.

**e. Human-source rule.** Every counted record must be attributable to a named human — an author, a
restaurant, a publication, a named home cook. Treat as **contamination** anything that reads as
machine-generated: templated proportions, generic "this dish is a celebration of…" prose, mirror-image
recipes across unrelated sites, suspiciously modern ingredient lists in "traditional" dishes, missing
weights or times, or a page with no verifiable author. Excluded records go in the leaf as
`source_quality: suspected_ai` with the reason, are **never counted** toward the source minimum, and never
contribute a temperature to the cut's band.

**f. Update the registry** so the engine and the data agree, with a dated comment saying why.

### 3. When a cut's pass is finished

When its enumerated gaps are **(a) closed**, **(b) recorded as searched-negative** with the exact queries
used, or **(c) escalated as blocked**. Nothing else ends a pass. A number moving is not a reason to stop,
and a number not moving is not a reason to keep going.

### 4. Report data state, never a delta

End the cut with a plain description of what is now known and what is still unknown — for example:
"four leaves, sixteen sources, eight of them silent on temperature, two publishing unsafe advice, one
registry field corrected, confit blocked on a system change". Do not headline the pass with a score, a
delta, or a comparison to a previous pass.

### 5. Then do CHORES.md

Not before. See that file.

---

## WORDS YOU MUST NOT USE ABOUT THIS WORK

`score` · `scoring` · `points` · `deduction` · `x/20` · `up from` · `improved to` · `target score` · `done`

Replace them with: `state`, `gaps`, `potential`, `evidence`, `searched-negative`, `blocked`, `unverified`,
`provenance`.

The reason is not cosmetic. "Deduction" tells an agent what to avoid being caught for. "Unexploited
evidence" tells it what to go and find. Wording decides behaviour long before any rule does.

Going back to this document for quidelines several times during the process is good practice, agents are prone to talk them out of keeping quality at a higher priority than efficiency.
