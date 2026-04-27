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

### Session 4 — 2026-04-27

**Discoveries:**
- Sidebar panel fixed (v0.6.3.2), but `kitchen-cooking-card` still shows "Custom element doesn't exist"
- User's Lovelace config: `type: custom:kitchen-cooking-card` in a `sections` view
- Root cause: `_async_register_lovelace_resource` was called during `async_setup_entry`,
  BEFORE `EVENT_HOMEASSISTANT_STARTED` fires — at that point Lovelace's resource collection
  is not yet loaded from storage, so `hass.data["lovelace"]` may be None or its `resources`
  attribute not yet populated → function silently returns → resource never registered
- Secondary: `getattr(lovelace_data, "resources", None)` didn't handle dict-style lovelace data

**Actions taken:**
- [x] Imported `EVENT_HOMEASSISTANT_STARTED` and `callback` in `__init__.py`
- [x] Replaced direct `await _async_register_lovelace_resource(...)` with deferred call:
      - If `hass.is_running` (reload): register immediately
      - Else: listen for `EVENT_HOMEASSISTANT_STARTED`, then create task
- [x] Added dict fallback: if `getattr` returns None, try `lovelace_data.get("resources")`
- [x] Regenerated JS (PANEL_VERSION 320→321) — syntax verified clean
- [x] Bumped version 0.6.3.2 → 0.6.3.3

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

### Session 5 — 2026-04-27

**Problem:** After v0.6.3.3, sidebar panel worked but `type: custom:kitchen-cooking-card` in a
dashboard `sections` view still showed "Custom element doesn't exist".

**Root cause:**
The deferred `_async_register_lovelace_resource` mechanism introduced in Session 4 was
still unreliable — `hass.data["lovelace"]` and its `resources` attribute are not guaranteed
to exist at `EVENT_HOMEASSISTANT_STARTED` time on all HA configurations (e.g. YAML-mode
Lovelace). The entire Lovelace resource injection approach was fragile.

**Fix:** Replaced all Lovelace resource registration code with a single call to HA's
first-party `add_extra_js_url(hass, url, es5=False)` API (from
`homeassistant.components.frontend`). This API is specifically designed to make a JS module
available as a Lovelace custom element without touching the Lovelace resource list.

**Actions taken:**
- [x] Removed `_async_register_lovelace_resource`, all `EVENT_HOMEASSISTANT_STARTED` listeners,
      and the `lovelace` dependency from `__init__.py`
- [x] Added `add_extra_js_url(hass, module_url)` call inside `_async_register_panel()`
- [x] Regenerated `kitchen-cooking-panel.js` (PANEL_VERSION 321→322)
- [x] Bumped version 0.6.3.3 → 0.6.3.4

### Session 6 — 2026-04-27

**Problem:** User confirmed `type: custom:kitchen-cooking-card` now loads, but the sidebar
panel (navigating to `/kitchen-cooking`) was blank again after the v0.6.3.4 update.

**Root cause:**
HA's `@webcomponents/scoped-custom-element-registry` polyfill throws
`"this constructor has already been used with this registry"` when the same ES class is
passed to `customElements.define()` a second time — even under a different name.

The `panel-class-template.js` was registering `KitchenCookingPanel` twice:
1. Under a versioned name `kitchen-cooking-panel-v${PANEL_VERSION}` (for sidebar panel)
2. Under the stable name `kitchen-cooking-card` (for Lovelace dashboard card)

Meanwhile `__init__.py` was setting `"name": f"kitchen-cooking-panel-v{panel_version}"`
in the panel config. On each load, the polyfill threw on the second `define()` call,
preventing the sidebar panel element from being found.

**Fix:**
- Removed the versioned `define()` call from `panel-class-template.js`; left only the
  single stable `customElements.define('kitchen-cooking-card', ...)` guard
- Changed `__init__.py` panel config `"name"` to the fixed string `"kitchen-cooking-card"`
  (cache-busting is already handled by `?v={panel_version}` on the `module_url`)

**Actions taken:**
- [x] Removed versioned `VERSIONED_NAME` / `customElements.define(VERSIONED_NAME, ...)` block from `panel-class-template.js`
- [x] Changed `__init__.py` panel config `"name"` from `f"kitchen-cooking-panel-v{panel_version}"` to `"kitchen-cooking-card"`
- [x] Regenerated `kitchen-cooking-panel.js` (PANEL_VERSION 322→323)
- [x] Bumped version 0.6.3.4 → 0.6.3.5
- [x] User confirmed both sidebar panel and `custom:kitchen-cooking-card` work correctly

