# Branch Timeline: fix-issue-85 — v0.7.0.x

## Goal
Fix the blank screen that appears when the user returns to the KCE panel after
the browser tab has been hidden for some time.

## Root Cause Analysis (from HA source code)

After reading `partial-panel-resolver.ts` and `ha-panel-custom.ts` from
HA's frontend repository, the root cause was identified:

### HA's "suspendWhenHidden" mechanism

`partial-panel-resolver` watches `visibilitychange`. After the tab is hidden
for **5 minutes**, it removes `ha-panel-custom` from the DOM and stores it as
`_disconnectedPanel`. When the tab returns, it re-appends the same element.

On re-append, `ha-panel-custom.disconnectedCallback()` had already been called
during removal, which called `_cleanupPanel()`:
- Sets `_setProperties = undefined`
- Removes our `kitchen-cooking-card` child from DOM

On re-append, `ha-panel-custom.connectedCallback()` fires.
- **Newer HA (2024.x+)**: connectedCallback has a fix that checks
  `!_setProperties && !hasChildNodes() && panel` → calls `_createPanel()`
  → our element is recreated asynchronously.
- **Older HA**: connectedCallback does NOT call `_createPanel()`.
  `ha-panel-custom` is back in DOM but forever empty → **persistent blank**.

### Why existing in-element fixes don't help

All visibilitychange/focus handlers wired in `connectedCallback()` are
**removed** in `disconnectedCallback()`. Once our element is destroyed, those
handlers no longer exist. They cannot trigger a re-render of something that
doesn't exist anymore.

The `hasChanged: () => true` fix is correct but irrelevant here — it helps
when the element exists but HA passes the same hass reference; it cannot
help when the element has been destroyed.

## Fix

A **module-level recovery mechanism** that survives element destruction:

- `_kceHaPanelParent`: module-level variable, updated in `connectedCallback()`
  to always point to the current `ha-panel-custom` parent.
- `_kceRecoverPanel()`: checks if `ha-panel-custom` is connected but missing
  our element; if so, calls `haPanel.requestUpdate('panel', null)` which
  makes HA's `ha-panel-custom.update()` see `changedProps.has('panel')` with
  `oldValue=null ≠ actual panel` → calls `_createPanel()` → recreates us.
- `visibilitychange` listener at module level (not on the element) calls
  `_kceRecoverPanel` with a 500 ms delay (lets newer HA's own async
  connectedCallback chain finish first; recovery only fires if absent).
- `window focus` listener as belt-and-suspenders for mobile browsers.

Safe on all HA versions:
- New HA: element already present at 500 ms → check does nothing.
- Old HA: element absent → recovery fires once → blank resolved.

## Checklist

- [x] Create this timeline file
- [x] Add module-level `_kceHaPanelParent` variable and `_kceRecoverPanel()` 
      to `panel-class-template.js`
- [x] Add `visibilitychange` + `focus` recovery listeners at module level
- [x] Update `connectedCallback()` to set `_kceHaPanelParent = this.parentElement`
- [x] Update old (incorrect) comment in `connectedCallback()` to reflect true cause
- [x] Run `python3 generate_frontend_data.py` and verify ✅ (PANEL_VERSION 362→363)
- [x] Bump version to 0.7.0.14

## Session Log

### 2026-04-28 (Session 1)
- Read HA source: `partial-panel-resolver.ts` and `ha-panel-custom.ts`
- Identified root cause: 5-min suspension + missing connectedCallback fix in older HA
- Designed module-level recovery mechanism
- Created this timeline file

### 2026-04-28 (Session 2 — implementation v0.7.0.14)
- Added `_kceHaPanelParent = this.parentElement` to `connectedCallback()` (tracks ha-panel-custom)
- Updated stale "Blank-tab fix" comment to accurately describe what those handlers cover
- Added module-level `let _kceHaPanelParent` + `_kceRecoverPanel()` + listeners at end of template
- Ran generator: PANEL_VERSION 362→363
- Bumped version to 0.7.0.14

### 2026-04-29 (Session 3 — CHORES)
- Updated `docs/USER_GUIDE.md` version line `0.7.0.13` → `0.7.0.14`
- Updated `README.md` version line `0.7.0.13` → `0.7.0.14`
- Added `v0.7.0.14 Changes` changelog entry to `README.md`
- No heading changes were made in this branch → no `_openHelp` anchor updates needed

### 2026-04-29 (Session 4 — fullscreen recipe viewer + cook monitor v0.7.0.15)
- Added `_fullscreenRecipeMode`, `_fullscreenRecipeTitle`, `_fullscreenRecipeMonitoring` reactive properties
- Added `_openRecipeFullscreen(url, index, title)` — fetches file, sets fullscreen state
- Added `_closeRecipeFullscreen()` — resets all fullscreen state
- Added `_startCookInRecipeFullscreen()` — calls start_cook service, stays in fullscreen, sets monitoring flag
- Added `_renderRecipeFullscreen()` — full-screen recipe viewer with recipe-cook-header, Start Cook button, and 🏠 nav button when monitoring
- Added `_renderRecipeFullscreenMonitor(state)` — compact monitor card (temp display, progress bar, ETA, action buttons)
- Wired both recipe button locations to `_openRecipeFullscreen` (removed inline content rendering)
- Added priority check in `_renderContent()` for `_fullscreenRecipeMode`
- Ran generator: PANEL_VERSION 363→364
- Bumped version to 0.7.0.15

### 2026-04-29 (Session 5 — history fix v0.7.0.16)
- Root cause confirmed: `_renderPreviousCooksPath()` rendered path-header only, never called `_renderHistory()` — data was never corrupted
- Added `${this._renderHistory()}` call inside `_renderPreviousCooksPath()`
- Removed duplicate `status-banner` header from `_renderHistory()` (path-header already provides the title)
- Hardened `async_save_cook_history()` in storage.py with atomic write (write to `.tmp` + `os.replace()`) to prevent future corruption from mid-write HA crash
- Added `import os` to storage.py
- Ran generator: PANEL_VERSION 364→365
- Bumped version to 0.7.0.16

### 2026-04-29 (Session 6 — cook history all-types + restart fix v0.7.0.17)
- Root cause: `_renderHistory()` used hardcoded MEATER-only fields (`cook.cut`, `cook.protein`,
  `cook.target_temp_c`); recipe/Ninja cooks have none of these → invisible blank cards on the
  welcome-screen "Tidigare tillagningar" list
- Replaced `_renderHistory()` inline card template with `this._renderHistoryCard(cook)`, which
  already handles all cook types via `recipe_name || cut_display || cut`
- Root cause 2: `_restartCook()` passed `cut_id` as-is; old MEATER cooks stored it as int,
  but `SERVICE_START_COOK_SCHEMA` requires `str` → "expected str for dictionary value @ data['cut_id']"
- Fixed: `cut_id: String(cook.cut_id)` — safe for both old int values and new string slugs
- Ran generator: PANEL_VERSION 366→367
- Bumped version to 0.7.0.17
