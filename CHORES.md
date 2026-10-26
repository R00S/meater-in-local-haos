# CHORES.md

**Purpose:** This file contains important but mechanical maintenance tasks that keep the repository healthy and ready for releases and future work.

**When to run:** When I say "do CHORES.md", please carry out the tasks below.

---

### Tasks:

* Regenerate the cut-improvement queue: `python custom_components/kitchen_cooking_engine/measure_cut_potential.py`, and check its report for authored-vs-derived **conflicts**. A conflict means a cut's `## Data state and gaps` ledger no longer describes the files — fix the ledger (or the gap it hid) before picking new work
* Bump version according to the version bumping scheme  
* Update the branch history file with any missing information about what has been done in this branch  
* Update the user guide with changes made in this branch, and update any GUI help button anchors in `panel-class-template.js` that link to sections whose headings have changed (anchors are in `_openHelp(...)` calls)

---

**Note to Agent:**  
These are routine but necessary tasks. Please do them carefully and completely. Once finished, feel free to return to the previous work with the same focus and quality you had before.
