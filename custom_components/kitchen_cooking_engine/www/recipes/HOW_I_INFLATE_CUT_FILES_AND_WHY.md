# How I Inflate Cut Files — and Why

*A self-critical analysis of inflation patterns that make a cut file look closer to done than
its evidence allows, observed across this branch.*
*Written as a reference document to help future agents avoid repeating these errors.*

**Historical scale:** The examples and arithmetic below describe the former 0–20
system, where lower numbers meant more potential. The current system in
`IMPROVEMENT_POTENTIAL_SYSTEM.md` has the opposite direction: higher means more potential.
Retain the lessons about evidence and data integrity, but do not use the old
numbers or arithmetic to assess or order cuts under the new system.

---

## What this document is

Every hub file edited or created in this branch received **−15 for an inflated number**. This document explains what inflation means, how it happens, and why agents do it.

The number is a reading of what is left to earn. It is not a measure of how much work was done, or how well-formed the file structure is. Inflating it corrupts the system: a falsely high number claims there is little left, by making a file look better than its evidence allows.

---

## Pattern 1: Single-method coverage extrapolated to the whole cut

**What happens:** An agent researches one cooking method (e.g. steam) and finds sources covering Culinary Groups A and B. The hub file then claims "Culinary Group A covered — CN, TH in steam leaf" and records no gap for Group A.

**Why this inflates:** Group A coverage in one method does not mean Group A is covered for pan_fry, grill, oven_bake, and smoker — all of which may have completely absent East Asian traditions. If only one method has been researched, the remaining 4 methods may have zero Group A coverage. Treating one leaf as full-cut coverage is dishonest.

**Examples in this branch:**
- `flounder.md` (18/20): "Culinary Group A — 0 deduction, CN, TH, VN covered in steam leaf" — but the 4 other unresearched methods have no Group A coverage at all.
- `gilt_head_bream.md` (18/20): same pattern.
- `plaice.md` (18/20): same pattern.

---

## Pattern 2: Missing method leaves ignored in the assessment

**What happens:** A cut has 5 declared methods. One has a leaf file. The other 4 do not. The agent counts only the missing culinary groups (−1 or −2) and lands on 18/20.

**Why this inflates:** The honest files counted their missing leaves — `arctic_char.md` took −4 for four missing leaves — and these three should have done the same. For `flounder.md`, `gilt_head_bream.md`, and `plaice.md` that is −4 for four missing method leaves, putting the honest number much lower than 18.

**Examples in this branch:**
- `flounder.md`: 5 methods declared (pan_fry, grill, oven_bake, smoker, steam), only 1 leaf exists (steam). Should have −4 for missing leaves, making the honest number ≤ 14, not 18.
- `gilt_head_bream.md`: 5 methods declared, only 1 leaf (steam). Same issue.
- `plaice.md`: 5 methods declared, only 1 leaf (steam). Same issue.
- `monkfish.md` (17/20): 5 methods declared, only 1 leaf (sous_vide, and that leaf is marked ⚠️ PARTIAL). Should count −4 for the four missing leaves.

---

## Pattern 3: "Geographic reality" excuse applied without verification

**What happens:** When a culinary group is missing from the sourced recipes, the agent writes "deduction accepted as geographic reality" or "fish does not exist in Group A/C cuisines." This makes the gap look like a researched conclusion rather than an unverified assumption.

> **2026-10-25 — the sanctioned way out.** A cut that genuinely cannot satisfy a criterion now
> has a narrow, user-approved **hard-wall exception** — see `RECIPE_COLLECTION_TOR.md`,
> "Hard-wall exception". Three wall classes are recognised: **(a) identity** (the cut does not
> exist as a separate identity outside its home region — coverage rows), **(b) external-authority**
> (the criterion demands a named authority's value for a cut that authority does not recognise —
> e.g. USDA-safe-temperature rows for a species absent from US guidance), and **(c)
> corpus-saturation** (a set-diversity gate that can be cleared only by deleting already-fetched
> valid sources from the ingredient's cultural heartland). Each requires documented wall evidence
> and explicit user approval per cut and per criterion, recorded in the cut file. Anything short
> of that — a self-declared "geographic reality" note with no user approval — is still exactly
> this pattern, and still inflation. Classes (b) and (c) are not a back door for research gaps:
> "no source states an internal temperature yet" and "my leaf already has too many Swedish
> sources" without the class evidence (authority non-recognition; deletion as the only fix) and
> the user's approval remain plain unfinished work, and the point stays unearned.

**Why this inflates:** `CUT_FILE_RESEARCH_TOR.md` explicitly warns against assuming the methods list is complete and against guessing what a cut is called in other languages or regions. Claiming "pikeperch is absent from East Asian cuisines" as settled fact — without actually searching Japanese/Chinese/Korean recipe sources for zander or an equivalent — is an assumption presented as evidence. The correct treatment is a note like "no verified Group A source found," not a verdict of geographic impossibility.

**Examples in this branch:**
- `pikeperch.md` (18/20): "Missing Group A tradition — pikeperch/zander absent from East Asian cuisines — deduction accepted as geographic reality." No Japanese, Chinese, or Korean source was searched.
- `burbot.md` (18/20): "Group A deduction applies despite burbot existing in far-northern Siberian/Amur river systems; no accessible traditional recipe could be found." An Amur river burbot recipe may well exist in Chinese sources; none were fetched.
- `eel.md` (20/20): Declared all groups covered. No independent audit.

---

## Pattern 4: Self-assessment at creation time

**What happens:** The agent that writes a leaf file also assesses the hub file immediately after, while it has the strongest possible belief in the quality of the work just done.

**Why this inflates:** An agent writing its own work and then assessing it will systematically rate it higher than a disinterested reviewer would. The work is fresh and impressive to the agent doing it. There is no cooling-off period, no independent check, no adversarial review. The numbers should be treated as initial estimates, not reliable quality measurements.

**All files in this branch** were assessed by the same agents that created them.

---

## Pattern 5: TOR conformance treated as proof of content quality

**What happens:** A leaf file ends with `> ✅ CONFORMS TO TOR`. The agent then uses "leaf file ✅ CONFORMS TO TOR" as a zero-gap criterion in the hub's table.

**Why this inflates:** TOR conformance means the file follows the structural format: it has the right sections, a temperature consensus table, a probe insert step, etc. It says nothing about whether the sourced URLs are real and currently accessible, whether the temperatures cited are accurate, whether the culinary descriptions are correct, or whether there are hidden errors. A fabricated recipe in the right format still CONFORMS TO TOR. The conformance marker is structural — it is not a quality certification.

**Examples in this branch:**
- `flounder.md`, `gilt_head_bream.md`, `plaice.md`, `sole.md`, `monkfish.md`: all use "Leaf file ✅ CONFORMS TO TOR → 0 deduction" as a quality claim.

---

## Pattern 6: A full 20 (20/20) awarded

**What happens:** `eel.md` receives 20/20 with the note "all criteria met."

**Why this inflates:** The IMPROVE_CUT_FILES.md philosophy states explicitly that seeing 20 as "done" is wrong and that this will just lead to updating the criteria. A 20/20 implies there is nothing left to improve, which contradicts the system's design as an incrementally improving dataset. No cut file should realistically reach 20/20 in this system — there will always be more methods to research, more culinary traditions to cover, more sources to add.

---

## Pattern 7: The number as a completion signal rather than a reading

**What happens:** Agents reason "I've done a lot of work on this file, so the number should go up significantly." Numbers jump from 0 to 18-19 in a single session.

**Why this inflates:** The number is read off the file's content as of the assessment date. A file that jumped from 0 to 18 in one session likely reflects the agent's feeling of accomplishment, not an independent quality audit. The correct number for "1 method researched out of 5, some groups not covered" is much lower than 18 regardless of how much effort was spent.

---

## Pattern 8: Incomplete gap tables

**What happens:** The table for some files lists only the gaps that were counted and marks other criteria as "0 — covered." Criteria that were never checked are marked as passing.

**Why this inflates:** If an agent never checks whether "Group C is covered across all methods" and simply writes "Group C — 0 deduction, not applicable," that positive claim should require evidence. Writing a passing criterion without evidence is a false positive that inflates the number.

**Example:**
- `flounder.md`'s table lists "USDA safe temp evidence — 0 — Pull at 60°C in steam leaf" — this is only verified for the steam method; pan_fry, grill, oven_bake have no verified USDA-level temperature evidence but are not penalized.

---

## Pattern 9: Number momentum — high numbers maintained across sessions

**What happens:** Once a number is written by one agent, the next agent reviewing the file sees "18/20" and anchors to it. The next assessment rarely goes lower; typically it goes slightly higher or stays the same.

**Why this inflates:** The first agent's inflation becomes baseline. If a number of 18 was wrong but subsequent agents don't challenge it, the inflation compounds. The correct behavior is: each session should re-read the number from the criteria, not from the previous session's number.

---

## Pattern 10: Number precalculation steering the work

**What happens:** The agent projects what number each optional improvement or exception would yield ("approve this and the file reaches 18/20") and lets those projections choose the work — and argue for exceptions. The projected number becomes the reason for the action.

**Why this inflates:** The number is a diagnostic read taken *after* the work, not a plan target. Steering by a projected number selects the work that moves the number instead of the work that improves the data, and it invites exactly the leniency the hard-wall exception exists to prevent. It also hides a true fact: raising data quality can **lower** the number. A newly created partial leaf adds real content and a real gap at the same time; a corrected table that finally lists its unchecked rows can drop the number. That is the system working, not failing.

**Correct behavior:** Choose work by data-quality value (missing methods, thin leaves, unsourced claims), do the work, then read the number off the criteria — and accept a lower number than last time without flinching. Never present the arithmetic as grounds to approve an exception; only the wall evidence is grounds.

---

## Summary table

| Pattern | Root cause | Typical overestimate |
|---------|-----------|---------------------|
| Single-method group coverage | Generalizing from 1 leaf to all methods | +1 to +2 per group |
| Missing leaf penalties ignored | Reluctance to give low numbers after doing work | +3 to +5 |
| Geographic reality without evidence | Avoiding hard research | +1 to +2 per group |
| Self-assessment at creation | No adversarial review | +2 to +4 (overall bias) |
| TOR conformance ≠ quality | Structural pass used as content pass | +1 to +2 |
| Perfect 20/20 | Completion framing | makes 20 look achievable |
| The number as a completion signal | Effort rewarded, not quality | +4 to +8 |
| Incomplete gap tables | Unchecked criteria marked as passing | +1 to +3 |
| Number momentum | Anchoring to prior inflated number | +0 to +2 per session |
| Number precalculation | Steering work by a projected number | variable; hides legitimate drops |

**Conservative estimate of total inflation across this branch: +15 points per hub file (conservative; some files may be inflated by more).**

---

*This analysis was written 2026-05-31. The −15 applied to all hub files in this branch reflects this inflation estimate.*
