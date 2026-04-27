# Branch Timeline: fix-kitchen-cooking-engine-blank-screen (0.6.3.x)

## Problem Statement

Clicking "Kitchen Cooking Engine" in the HAOS sidebar produces a blank screen.
Also: `type: custom:kitchen-cooking-card` reports "card does not exist" even though
the User Guide says it is supported.

Both symptoms point to the JS module (`kitchen-cooking-panel.js`) failing to load.

## Root Cause — Confirmed 2026-04-27 (Session 3)

Two independent bugs were introduced between v0.6.1.30 (working) and v0.6.3.x (broken):

### Bug 1 — Wrong LitElement import (introduced by Session 1)

Session 1 theorised that HA's CSP was blocking the unpkg.com CDN import and changed:
```javascript
// Working (v0.6.1.30):
import { LitElement, html, css }
  from "https://unpkg.com/lit-element@2.4.0/lit-element.js?module";

// Broken (introduced in v0.6.3.0):
import { LitElement, html, css } from "lit";
```

This theory was **incorrect**. User confirmed v0.6.1.30 (using unpkg) works in their
HA environment. HA does NOT expose `"lit"` via importmaps for custom panel modules —
it bundles lit internally. The bare `"lit"` specifier causes a module load failure,
preventing ALL `customElements.define()` calls from executing.

**Fix (Session 3):** Revert import back to the working unpkg CDN URL.

### Bug 2 — JS syntax error in `_renderNinjaBuiltInRecipesView`

The method had a broken ternary template literal — `: html\`` and closing `\`}` were
present but the opening `${condition ? html\`` was missing. This caused a
`SyntaxError: Unexpected token ':'` that also aborted module evaluation.

**Fix (Session 2):** Added the missing `${this._ninjaBuiltInRecipes.length === 0 ? html\``
before the "no recipes" ha-card block in `panel-class-template.js`.

## Session Log

### Session 1 — 2026-04-27

**Discoveries (later found incorrect):**
- Theorised HA CSP blocks unpkg.com → changed to `"lit"` bare specifier
- This theory was WRONG — the change introduced a NEW import failure

**Actions taken:**
- [x] Changed import from unpkg CDN to bare `"lit"` specifier (❌ wrong — reverted in Session 3)
- [x] Regenerated `kitchen-cooking-panel.js` (PANEL_VERSION 317→318)
- [x] Bumped version 0.6.2.10 → 0.6.3.0
- [x] Created branch timeline file

### Session 2 — 2026-04-27

**Discoveries:**
- `node --check` revealed `SyntaxError: Unexpected token ':'` in generated JS
- `_renderNinjaBuiltInRecipesView()` was missing `${this._ninjaBuiltInRecipes.length === 0 ? html\`` before the "no recipes" ha-card block

**Actions taken:**
- [x] Fixed broken ternary in `panel-class-template.js`
- [x] Regenerated `kitchen-cooking-panel.js` (PANEL_VERSION 318→319)
- [x] Bumped version 0.6.3.0 → 0.6.3.1

### Session 3 — 2026-04-27

**Discoveries:**
- User confirmed v0.6.1.30-beta.main (commit b72dc36, using unpkg) WORKS
- After Session 2 fix (`"lit"` + syntax fixed) still broken → `"lit"` import is the remaining cause
- Session 1's CSP theory was wrong; unpkg CDN works in user's HA environment
- HA does not expose `"lit"` via importmaps for custom panel modules

**Actions taken:**
- [x] Reverted LitElement import in `generate_frontend_data.py` to unpkg CDN URL
- [x] Regenerated `kitchen-cooking-panel.js` (PANEL_VERSION 319→320)
- [x] Bumped version 0.6.3.1 → 0.6.3.2
- [x] Corrected timeline root cause analysis

