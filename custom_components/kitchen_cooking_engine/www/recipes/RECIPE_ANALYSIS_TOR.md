> **Source of truth (read first):** `cooking_data.py` and `swedish_cooking_data.py` were deleted.
> Cuts, methods and doneness live in the cut file's `KCE:CUT` block (and `KCE:CUT_METHOD` tags) in `www/recipes/`.
> **A Python cooking-data file is generated output, not a source:** if one exists anywhere — an installed
> release, a build artefact, a future export — it is produced from the cut files and must never be hand-edited,
> hand-extended or used to register a method, because the next run overwrites it. To change the data, edit the
> cut file and regenerate.
> Do NOT recreate Python cooking data by hand, and do not add a section that describes edits to one: the old
> `## Data applied to cooking_data.py` section has been removed from every research file. What a method needs from
> the cut is already expressed by the leaf itself and the cut file's own `methods:` list.

# Terms of Reference — Recipe Analysis

> **Companion document**: [`RECIPE_COLLECTION_TOR.md`](RECIPE_COLLECTION_TOR.md) covers
> finding, selecting, and saving source recipes — the collection phase that must
> be complete before any analysis begins.

## Purpose

This document defines the standard for **analysing collected source recipes** and
converting the temperature findings into the recipe-data decisions (the cut's `KCE:CUT` block and `KCE:CUT_METHOD` tags)
that drive the cooking engine.

Analysis begins only after the collection phase (4–6 fully saved source recipes
per leaf) is complete. Drawing conclusions from a leaf with incomplete source
recipes produces invalid data.

**Numeric and non-numeric sources (user decision, 2026-11-01).** Many traditions publish
rib or meat recipes that judge doneness by time, colour or fork-tenderness and state no
internal temperature — this is normal in Group A and Group C sources especially. Such a
source is **saved in full** and marked `**Pull temperature: not stated by source.**`; it is
never converted, estimated or back-filled into a number, and it is never dropped to make
the leaf pass. It counts normally toward the 4–6 collection requirement and toward source
diversity. What it does not do is contribute to the range:

- **A numeric source** states a bolded `**Pull at N°C** (N°F)` *and* a numeric final
  serving temperature.
- **A non-numeric source** is stored with both of those lines explicitly marked
  `not stated by source`, retaining its own doneness cues exactly as the source wrote them.
- **Analysis opens when the leaf holds at least 3 numeric sources** (plus the other Step 3
  requirements). Below 3 numeric sources the analysis sections stay unwritten — the wall
  is a corpus fact about that tradition, and it is documented in the leaf's search log, not
  worked around.
- `## Temperature consensus` is computed **only** over the numeric sources. Non-numeric
  sources appear beside the table as comparators, in their own block, in the source's own
  words — never inside the °C range and never as an inferred row.

---

## Mandatory analysis sections

These sections must appear in every leaf, in this order, immediately after the
`## Source recipes` section.

---

### `## Temperature consensus`

A markdown table:

```markdown
| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| … | … | … |
```

Followed by 2–4 sentences that:
1. State the **full observed range** in °C — from the lowest to the highest
   final serving temperature seen across the sources.
2. Map the range to the doneness options in the cut's `KCE:CUT` block and explain which
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
chemistry, not on preferences. This section informs whether the cut
file's doneness levels need a method-specific note.

---

### `## Summary`

2–4 sentences, readable in approximately 10 seconds. Must answer:

1. **What does this method do to this specific cut?** — describe the physical
   result (texture, moisture, crust, rendering, etc.) in terms a non-expert can
   picture.
2. **Is this a good match — and why or why not?** — state clearly whether this
   method suits this cut, what the cook gains or sacrifices, and what the key
   takeaway is for someone choosing between methods.

Do not repeat numbers from the consensus table. Do not mention the legacy Python data files; they no longer exist.
The summary stands alone.

---

### Completion marker

After all sections are verified, append:

```markdown
> ✅ **CONFORMS TO TOR** — Verified {ISO-8601 timestamp}. {Brief checklist summary.}
```

Remove the `⚠️ STATUS: NEEDS TO BE RECREATED FROM SCRATCH` notice when this
marker is added.

---

## What is explicitly forbidden (analysis)

| Forbidden | Why |
|-----------|-----|
| Deleting a leaf file because no recipe was found | Keep it; replace the body with the "no recipes found" stub |
| Drawing conclusions from a leaf that has any failing source recipes | The consensus and coding decisions are invalid if the data they are based on is incomplete |
| A `## Summary` that only restates the temperature consensus numbers | The summary must explain the cut-method fit in plain language |
| Converting a source's non-numeric doneness cues (time, fork-tenderness, colour) into a temperature | The number would be invented, not sourced — it is fabrication wearing the source's citation |
| Opening `## Temperature consensus` with fewer than 3 numeric sources | The range would rest on fewer sources than the analysis gate allows; the leaf keeps collecting instead |
| Omitting `## Summary` or making it longer than 4 sentences | The summary must exist and be readable in ~10 seconds |

---

## How to verify an existing leaf

Use this protocol every time you open an existing leaf to assess, update, or
draw conclusions from it. Work through each step **in order**. If a step fails,
**stop and fix the deficiency before proceeding**.

### Verification Step 1 — Confirm file structure

- [ ] File is named `{cut_name}-{cooking_method}.md`
- [ ] All mandatory sections are present in the correct order:
  Cut profile → Source recipes → Temperature consensus →
  What makes this method special → Data applied (recipe data) → Summary
- [ ] File covers exactly one cut × one method

### Verification Step 2 — Confirm each source recipe is fully collected (GATE)

This is the most important gate. Check every source recipe against **all** of
the following:

- [ ] Attribution line: `**Inspired by**: {URL or bibliographic reference}`
- [ ] Header line: `**Serves**: N · **Prep**: N min · **Cook**: N–N min · **Rest**: N min`
- [ ] `**Ingredients**` section with quantities for every non-trivial item
- [ ] Numbered `**Method**` steps
- [ ] Probe insert step (or sous vide circulator note)
- [ ] Pull temperature present as a bolded dedicated step — **either**
      `**Pull at N°C** (N°F)` **or**, when the source states none,
      `**Pull temperature: not stated by source.**`
- [ ] Final serving temperature present as a bolded line — **either**
      `Final serving temperature: **N°C / N°F** ({doneness})` **or**
      `Final serving temperature: **not stated by source**`
- [ ] `---` horizontal rule after the recipe

**If any recipe fails:** the Temperature consensus, Data applied, and Summary
are based on incomplete data and are **invalid**. Fix the failing recipe first.

**Then count the numeric sources of this leaf.** A source whose two temperature lines
say `not stated by source` is collected, but it carries no number. **Fewer than 3 numeric
sources → stop:** `## Temperature consensus` cannot be opened for this leaf, however many
non-numeric sources it holds. Record the count in the leaf's
`## Collection status and search log`.

### Verification Step 3 — Confirm source diversity and quality

- [ ] 4–6 source recipes are present
- [ ] At least 3 of them are **numeric sources** (analysis gate — see Purpose)
- [ ] Every source is human-created
- [ ] No two sources share the same national or regional culinary tradition
- [ ] Sources reveal temperature disagreement (not enforce consensus)
- [ ] Every source is from an acceptable type (cookbook, named chef, named food media)

### Verification Step 4 — Confirm temperature consensus validity

- [ ] Table is present and covers **every numeric source** in the leaf
- [ ] Non-numeric sources are listed in a `### Non-numeric comparators` block directly
      beneath the table, each with its source-stated doneness cue verbatim and marked
      `not stated by source`
- [ ] Text states how many sources the leaf holds, how many are numeric, and that the
      range rests on the numeric ones
- [ ] Text states the full observed range in °C
- [ ] Text maps the range to the cut's `KCE:CUT` doneness options
- [ ] Divergence is treated as the finding, not as an error to resolve
- [ ] `recommended_doneness` key is identified with rationale from the numeric sources

### Verification Step 5 — Confirm summary and coding note

- [ ] `## What makes this method special` is present (3–6 sentences)
- [ ] `## Summary` is present, ≤4 sentences, explains cut-method fit
- [ ] Summary does not merely restate the consensus numbers
- [ ] No synthesised composite recipe exists
- [ ] `⚠️` notice removed and `✅ CONFORMS TO TOR` marker present

### Verification Step 6 — Confirm method coverage for the cut

- [ ] All methods in the cut's `KCE:CUT` `methods:` list have a leaf file
- [ ] Research has been done for methods NOT yet in the cut's `methods:` list
- [ ] Any discovered missing method is either added to the cut's `KCE:CUT` `methods:` list or
  documented as having no credible recipe

---

## Analysis checklist

Before the analysis portion of a leaf is finalised:

- [ ] Temperature consensus table covers all **numeric** sources; non-numeric sources are
      listed separately as comparators and excluded from the range
- [ ] Full observed range (°C) is stated in the narrative
- [ ] Range is mapped to the cut's `KCE:CUT` doneness options
- [ ] `recommended_doneness` key is identified with rationale
- [ ] `## What makes this method special` is 3–6 sentences on physics/chemistry
- [ ] `## Summary` is ≤4 sentences and explains cut-method fit in plain language
- [ ] Summary does not restate consensus numbers
- [ ] `✅ CONFORMS TO TOR` marker is appended with an ISO-8601 timestamp
- [ ] `⚠️ STATUS` notice is removed
