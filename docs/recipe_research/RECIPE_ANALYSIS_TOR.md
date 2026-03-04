# Terms of Reference — Recipe Analysis

> **Companion document**: [`RECIPE_COLLECTION_TOR.md`](RECIPE_COLLECTION_TOR.md) covers
> finding, selecting, and saving source recipes — the collection phase that must
> be complete before any analysis begins.

## Purpose

This document defines the standard for **analysing collected source recipes** and
converting the temperature findings into the `cooking_data.py` coding decisions
that drive the cooking engine.

Analysis begins only after the collection phase (4–6 fully saved source recipes
per leaf) is complete. Drawing conclusions from a leaf with incomplete source
recipes produces invalid data.

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

2–4 sentences, readable in approximately 10 seconds. Must answer:

1. **What does this method do to this specific cut?** — describe the physical
   result (texture, moisture, crust, rendering, etc.) in terms a non-expert can
   picture.
2. **Is this a good match — and why or why not?** — state clearly whether this
   method suits this cut, what the cook gains or sacrifices, and what the key
   takeaway is for someone choosing between methods.

Do not repeat numbers from the consensus table. Do not mention `cooking_data.py`.
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
  What makes this method special → Data applied to cooking_data.py → Summary
- [ ] File covers exactly one cut × one method

### Verification Step 2 — Confirm each source recipe is fully collected (GATE)

This is the most important gate. Check every source recipe against **all** of
the following:

- [ ] Attribution line: `**Source**: {URL or bibliographic reference}`
- [ ] Header line: `**Serves**: N · **Prep**: N min · **Cook**: N–N min · **Rest**: N min`
- [ ] `**Ingredients**` section with quantities for every non-trivial item
- [ ] Numbered `**Method**` steps
- [ ] Probe insert step (or sous vide circulator note)
- [ ] Bolded pull temperature: `**Pull at N°C** (N°F)`
- [ ] Bolded final serving temperature: `Final serving temperature: **N°C / N°F**`
- [ ] `---` horizontal rule after the recipe

**If any recipe fails:** the Temperature consensus, Data applied, and Summary
are based on incomplete data and are **invalid**. Fix the failing recipe first.

### Verification Step 3 — Confirm source diversity and quality

- [ ] 4–6 source recipes are present
- [ ] Every source is human-created
- [ ] No two sources share the same national or regional culinary tradition
- [ ] Sources reveal temperature disagreement (not enforce consensus)
- [ ] Every source is from an acceptable type (cookbook, named chef, named food media)

### Verification Step 4 — Confirm temperature consensus validity

- [ ] Table is present and covers all source recipes
- [ ] Text states the full observed range in °C
- [ ] Text maps the range to `cooking_data.py` doneness options
- [ ] Divergence is treated as the finding, not as an error to resolve
- [ ] `recommended_doneness` key is identified with rationale

### Verification Step 5 — Confirm summary and coding note

- [ ] `## What makes this method special` is present (3–6 sentences)
- [ ] `## Data applied to cooking_data.py` bullet list is present and actionable
- [ ] `## Summary` is present, ≤4 sentences, explains cut-method fit
- [ ] Summary does not merely restate the consensus numbers
- [ ] No synthesised composite recipe exists
- [ ] `⚠️` notice removed and `✅ CONFORMS TO TOR` marker present

### Verification Step 6 — Confirm method coverage for the cut

- [ ] All methods in `cooking_data.py` `supported_methods` have a leaf file
- [ ] Research has been done for methods NOT yet in `supported_methods`
- [ ] Any discovered missing method is either added to `cooking_data.py` or
  documented as having no credible recipe

---

## Analysis checklist

Before the analysis portion of a leaf is finalised:

- [ ] Temperature consensus table covers all source recipes
- [ ] Full observed range (°C) is stated in the narrative
- [ ] Range is mapped to `cooking_data.py` doneness options
- [ ] `recommended_doneness` key is identified with rationale
- [ ] `## What makes this method special` is 3–6 sentences on physics/chemistry
- [ ] `## Data applied to cooking_data.py` is a direct, actionable bullet list
- [ ] `## Summary` is ≤4 sentences and explains cut-method fit in plain language
- [ ] Summary does not restate consensus numbers
- [ ] `✅ CONFORMS TO TOR` marker is appended with an ISO-8601 timestamp
- [ ] `⚠️ STATUS` notice is removed
