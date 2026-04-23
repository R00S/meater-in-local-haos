# Branch Timeline: implement-branch-history-system 0.6.0.x

**Branch:** `copilot/implement-branch-history-system`
**Version series:** `0.6.0.x`
**Date started:** 2026-04-23
**Purpose:** Implement the branch history / timeline file convention from
`R00S/addon-tellstick-local` into this repo, and create the first complete
branch timeline file following that pattern.

> **Agents: read this file before implementing anything on this branch.**
> It documents every root cause found, every solution tried, and what the
> current state is — so we don't repeat failed approaches or forget key
> discoveries.

---

## Problem statement (user-reported)

> "Look in https://github.com/R00S/addon-tellstick-local.
> There you will find a system for creating and maintaining branch history
> in files. Implement the same instructions in this repo and branch and
> create a complete branch history file after that pattern here."

The `R00S/addon-tellstick-local` repo uses a convention where every branch has a
**timeline file** in `docs/` that records every root cause, failed attempt, and
implemented fix — keyed by branch name and version prefix. The corresponding
instruction block in `.github/copilot-instructions.md` tells agents to read the
file first and update it after every change. This prevents debug loops and
lost discoveries when multiple agent sessions work the same branch.

This repo (`meater-in-local-haos`) had no equivalent convention.

---

## Reference: pattern from addon-tellstick-local

### Where it lives

| File | Role |
|------|------|
| `.github/copilot-instructions.md` | Contains the "Branch Timeline Files" instruction block (the boxed rule agents see first) |
| `AGENTS.md` | Mirrors the instruction for agents that read that file instead |
| `docs/<branch-without-prefix>-<A.B.C.x>.md` | The actual per-branch timeline |

### Naming rule

```
branch:  copilot/retrieve-rtl-conf-luxorparts
version: 3.1.12.5
file:    docs/retrieve-rtl-conf-luxorparts-3.1.12.x.md
```

Strip everything up to and including the last `/` in the branch name, take the
first three version components (`A.B.C`), append `.x.md`.

### How to find the file (shell one-liner)

```bash
BRANCH=$(git branch --show-current | sed 's|.*/||')
VERSION=$(python3 -c "import json; d=json.load(open('custom_components/kitchen_cooking_engine/manifest.json')); print('.'.join(d['version'].split('.')[:3]))")
FILE="docs/${BRANCH}-${VERSION}.x.md"
echo "$FILE"
```

### Rules for agents

1. **Read it first** — before reading any other file or writing code.
2. **If it does not exist, create it** before doing anything else.
3. **After each discovery, failed attempt, or implemented fix — update it.**
4. This prevents debug loops and lost discoveries across agent sessions.

---

## Solution applied (this session — 2026-04-23)

### Step 1 — Add "Branch Timeline Files" block to copilot-instructions.md

**File changed:** `.github/copilot-instructions.md`

Inserted a new `## Branch Timeline Files` section immediately before
`## Quick Commands`. The section contains the same boxed ASCII-art rule block
used in `addon-tellstick-local`, adapted for this repo:

- Path formula uses `manifest.json` inside `custom_components/kitchen_cooking_engine/`
- Version extraction uses Python (not `jq`) because `jq` may not be available
  in all environments and Python is already required by this project.

### Step 2 — Create this timeline file

**File created:** `docs/implement-branch-history-system-0.6.0.x.md`

This is the branch timeline for `copilot/implement-branch-history-system` at
version series `0.6.0.x` (current version `0.6.0.01`).

---

## Version history on this branch

| Version | Change |
|---------|--------|
| 0.6.0.01 | Starting version when branch was created — no version bump needed for doc-only changes |

---

## Current state

| Item | Status |
|------|--------|
| Branch Timeline Files instruction block | ✅ Added to `.github/copilot-instructions.md` |
| Branch timeline file for this branch | ✅ Created (this file) |
| Convention covers future branches | ✅ Agents will find the instruction block at the top of Quick Commands |

---

## Pending / future work on this branch

- [ ] Verify the convention is working by having the next agent session read this file first
