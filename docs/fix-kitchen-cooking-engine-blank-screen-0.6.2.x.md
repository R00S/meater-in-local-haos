# Branch Timeline: fix-kitchen-cooking-engine-blank-screen (0.6.2.x)

## Problem Statement

Clicking "Kitchen Cooking Engine" in the HAOS sidebar produces a blank screen.
Also: `type: custom:kitchen-cooking-card` reports "card does not exist" even though
the User Guide says it is supported.

Both symptoms point to the JS module (`kitchen-cooking-panel.js`) failing to load.

## Root Cause — Discovered 2026-04-27

**External CDN import blocked by HA's Content Security Policy (CSP)**

The generated panel JS begins with:
```javascript
import { LitElement, html, css }
  from "https://unpkg.com/lit-element@2.4.0/lit-element.js?module";
```

HA 2024.x enforces `script-src 'self'` in its CSP, which blocks static `import`
statements from external domains (unpkg.com is not whitelisted). When the top-level
import fails, the entire ES module fails to evaluate — no custom elements are
registered — so:
- The sidebar panel (`kitchen-cooking-panel-v{VERSION}`) is never defined → blank screen
- The Lovelace card (`kitchen-cooking-card`) is never defined → "card does not exist"

The issue #80 fix (v0.6.2.01) added `type: custom:kitchen-cooking-card` to the User
Guide, which prompted users to try it and discover the underlying blank-screen bug.

**Fix**: Replace the unpkg.com import with HA's own bundled Lit library.

Since HA 2023.9, HA ships an import map that maps the bare specifier `"lit"` to its
own bundled Lit version. Using `import { LitElement, html, css } from "lit"` therefore
works in HA 2024.1+ without any internet access and without CSP issues.

## Session Log

### Session 1 — 2026-04-27 (current)

**Discoveries:**
- Both symptoms (blank screen + card missing) indicate JS module fails entirely
- JS imports from `https://unpkg.com/lit-element@2.4.0/lit-element.js?module`
- HA 2024.x CSP blocks external script imports → module evaluation fails
- Issue #80 fix (v0.6.2.01) exposed the bug by documenting the card feature
- Fix: change import in `generate_frontend_data.py` header to use `"lit"` bare specifier

**Actions taken:**
- [x] Changed import in `generate_frontend_data.py` header from `https://unpkg.com/lit-element@2.4.0/...` to bare `"lit"` specifier
- [x] Regenerated `kitchen-cooking-panel.js` (PANEL_VERSION 317→318)
- [x] Bumped version 0.6.2.10 → 0.6.2.11 in manifest.json, __init__.py, const.py
