# Branch timeline — fix-select-cut-start-cook-button (0.10.1.x)

## 2026-05-26 — v0.10.1.0

### Problem
APK v0.10.0.16 still showed a black screen with only the native back button after
"Select cut &amp; start cook". The fix released as v0.10.0.16 ("WebView black screen —
WebViewAssetLoader + local lit-element bundle") was incomplete in the CI build path.

### Root cause
`.github/workflows/build-apk.yml` has a step "Copy panel JS to Android assets" that
`cp`s `custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js` straight
into `android/app/src/main/assets/`. That repo copy still imports LitElement from

    "https://unpkg.com/lit-element@2.4.0/lit-element.js?module"

The import rewrite to `./lit-element-bundle.js` lives in
`custom_components/kitchen_cooking_engine/generate_frontend_data.py::regenerate_panel()`
(lines ~1364–1373) — but the generator is **never invoked in CI**. So the APK shipped
with the un-rewritten import. In the WebView (no network access by design, per
ToR §4.2) the module fetch failed, `kitchen-cooking-card` was never defined, and the
DOM stayed empty — leaving only the native `← Back` button visible above an empty
WebView (the "black screen").

`android/app/src/main/assets/lit-element-bundle.js` is committed to the repo (62 KB),
but it was unused because nothing imported it.

### Fix
Mirror the generator's rewrite directly in `build-apk.yml` so CI builds always ship
the local-import variant. Added a `sed -i` immediately after `cp`, plus a hard guard
that fails the workflow if any `unpkg.com/lit-element` string remains in the copy.
Now even if someone forgets to run `generate_frontend_data.py`, CI cannot produce a
broken APK.

### Files changed
- `.github/workflows/build-apk.yml` — `sed -i` rewrite + post-check guard.
- `android/app/build.gradle.kts` — `versionCode` 18 → 19, `versionName` "0.10.0.17" → "0.10.1.0".
- `custom_components/kitchen_cooking_engine/manifest.json` — `version` → 0.10.1.0.
- `custom_components/kitchen_cooking_engine/__init__.py` — `__version__` + "Last Change" → 0.10.1.0.
- `custom_components/kitchen_cooking_engine/const.py` — "Last Change" → 0.10.1.0; PANEL_VERSION auto-bumped 609 → 610.
- `custom_components/kitchen_cooking_engine/www/kitchen-cooking-panel.js` — regenerated (PANEL_VERSION 610).

### Verification
- `python3 generate_frontend_data.py` succeeded; `[CDN import rewritten to local]`
  printed; recipe files copied.
- `grep 'lit-element' android/app/src/main/assets/kitchen-cooking-panel.js` →
  `} from "./lit-element-bundle.js";` (no unpkg.com).
- All four version strings (manifest, `__version__`, two "Last Change" lines,
  `versionName`) match `0.10.1.0`.

## 2026-05-26 (cont.) — README link not updated (CI bug)

### Symptom
After v0.10.1.0 was built and committed by CI (run 26445665583), the README
"Download latest APK" link still pointed to
`raw/copilot/fix-meater-plus-discovery/android/apk/meater-kitchen-latest.apk`
on the previous branch — even though the v0.10.1.0 APK was correctly committed
to *this* branch as `android/apk/meater-kitchen-latest.apk`. The CI job's
"Update README download link for this branch" step ran and reported success,
but did not actually change anything.

### Root cause
The sed pattern in `build-apk.yml` was:

    s|raw/[^/]*/android/apk/meater-kitchen-latest\.apk|raw/${BRANCH}/...|g

`[^/]*` matches a single path segment. Real branch names contain slashes
(`copilot/fix-...`), so the existing URL has three slashes between `raw/` and
`/android/`. The pattern never matched, sed exited 0 with zero substitutions,
and `git add README.md` had no diff to commit. CI's "Commit APK" step did push
the APK files but the README was left stale.

### Fix
- Replace `[^/]*` with `[^ )]*` in `.github/workflows/build-apk.yml` so the
  capture spans the full branch path between `raw/` and `/android/apk/...`,
  while stopping at the markdown link's closing `)` or any whitespace.
- Add a post-rewrite `grep` guard that fails the workflow if the README does
  not contain `raw/${BRANCH}/android/apk/meater-kitchen-latest.apk` afterwards.
- Manually rewrite the link in `README.md` to point at this branch so the
  v0.10.1.0 APK can be downloaded immediately (without waiting for another
  CI run).

### Verification
Local dry-run with `BRANCH=copilot/fix-select-cut-start-cook-button` against a
file containing the old `copilot/fix-meater-plus-discovery` URL produced the
expected rewrite.

## 2026-05-26 (cont.) — v0.10.1.2 "Start cooking" fix did not actually work

### Symptom
User reported on v0.10.1.2: the "Starta tillagning" / "Start cooking" button is
still missing at the bottom of the MEATER cut page in the APK (and below the
recipe in the fullscreen recipe view). The page is not even scrollable past the
recipes — there is literally nothing where the button should be.

### Root cause (real, this time)
The v0.10.1.2 fix added page-level CSS for `ha-button` in
`buildCookPathHtml()`'s `<style>` block. That CSS lives in the **light DOM** of
the page. The KCE panel is a LitElement which renders into a **Shadow Root**
(`KitchenCookingPanel extends LitElement`, default render root = `ShadowRoot`).
Page-level CSS does not pierce shadow boundaries, so the `ha-button` rule never
applied to the `<ha-button>` instances inside the panel.

`ha-button` therefore remained an *undefined* custom element. In WebView,
undefined custom elements default to `display: inline` and bring no styling,
making the action button effectively invisible (and useless — `?disabled`
binds the attribute but undefined elements don't honour `disabled` either,
and pointer-events default applies, so the click handler may not even fire).

CSS custom properties (`--primary-color`, etc.) *do* inherit through shadow
boundaries, which is why the ha-card colours work — but plain element-selector
rules do not.

### Fix (APK v0.10.1.3 — APK framework only, KCE HAOS code unchanged)
Per user directive: HA frontend-element issues are fixed *in the APK
framework*, not by editing `panel-class-template.js` or any other KCE source
file. The panel must remain HA-compatible.

- Remove the dead page-level `ha-button { … }` CSS from `buildCookPathHtml()`
  in `android/app/src/main/java/io/kitchen/meater/ui/WebViewCookingScreen.kt`.
- Register `ha-button` as a real custom element *before* the panel module is
  imported, via `customElements.define('ha-button', HaButtonShim)` inside the
  boot IIFE in `WebViewCookingScreen.kt`. The shim:
  - Uses its own Shadow Root + `<slot>` so the panel's slotted text content
    ("Starta tillagning", "Stop", "Start rest", "Complete", "Skip", …) shows
    through.
  - Brings `:host`, `:host([outlined])`, `:host([disabled])` styling so the
    button is visible everywhere KCE writes `<ha-button>`, including inside
    the panel's shadow root (`:host` CSS is part of the shim's own shadow).
  - `pointer-events: none` on `:host([disabled])` prevents accidental clicks
    when the panel binds `?disabled=${!this._selectedDoneness}`.
  - Click events on slotted content bubble up to the host, so Lit's `@click`
    listener (attached on `<ha-button>`) still fires.
- Only `android/app/build.gradle.kts` bumps version (0.10.1.2 → 0.10.1.3,
  versionCode 21 → 22). KCE `manifest.json`, `__init__.py`, `const.py`,
  `panel-class-template.js`, generated `kitchen-cooking-panel.js` all stay
  at 0.10.1.2 / PANEL_VERSION 612 — they have nothing to do with this fix.

### Audit: HA custom elements the panel uses
`grep -oE '<ha-[a-z-]+'` over `panel-class-template.js`:
- `<ha-card>`         × 93 — works in the APK because the panel's own
  shadow-DOM styles include `ha-card { … }`; undefined element + inherited
  CSS vars are enough.
- `<ha-button>`       × 11 — broken until v0.10.1.3 (this fix).
- `<ha-circular-progress>`  × 1
- `<ha-menu-button>`        × 1
- `<ha-top-app-bar-fixed>`  × 1

The last three are not on the MEATER cut-path screens reached by the APK
(welcome / sidebar / loading chrome), so they don't currently affect APK
users — but they are the next candidates if more screens are surfaced. The
follow-up direction (per the broader requirement to "incorporate or emulate
the HA frontend") is to grow a small registry of these element shims in the
APK framework — not to special-case each one — and apply it from both
WebView entry points (`WebViewCookingScreen` and `WebViewCutSelectionScreen`).

### Verification
- `cd android && ./gradlew --no-daemon :app:assembleDebug` → `BUILD
  SUCCESSFUL` after the change (already run during initial v0.10.1.2 attempt;
  re-run for v0.10.1.3 below).
- Visual check on device: bottom of cut page + bottom of fullscreen recipe
  view both show a styled blue button labelled "Starta tillagning" / "Start
  cooking" that becomes faded/non-clickable until a doneness is picked, then
  clicking it triggers `_startCook` via the KceAndroid bridge.

## 2026-05-26 — v0.10.1.4

### Discussion outcome
User asked whether the APK WebView is a copy of the HA Android companion app
or whether successive agents had ignored that discussion and ended up with a
GUI that renders differently in the companion app vs. our APK. Investigation
confirmed the APK is **not** derived from the companion app: it is a from-
scratch minimal HA shell (mock `hass` object, a handful of CSS variables, and
now a real `customElements.define('ha-button', …)` Shadow-DOM shim). The
companion app, by contrast, points a WebView at the live HA server and loads
the real frontend — every `ha-*` custom element is the real implementation.
We can't do that because the APK is standalone by design (ToR §1, §4.2).

Three forward routes were identified:
1. Keep per-element shims in the APK framework (status quo, what v0.10.1.3
   establishes for `ha-button`).
2. Bundle a curated subset of `home-assistant-frontend` as APK assets so
   `customElements.define` happens naturally for the whole `ha-*` family.
3. Point the WebView at the user's HA instance when one exists, falling back
   to the mock only in true standalone mode (companion-app-style).

### ToR amendment
Per user direction, **Option 2 is now recorded as a future possible route**
in `docs/ANDROID_APP_TOR.md` §13 under a new "Future Possible Routes for HA
Custom Elements in the WebView" subsection. It is explicitly **non-binding
and out of scope today** — the per-element shim approach remains the rule
until a future user decision and ToR amendment say otherwise. The note also
restates that Option 2 is **not** an opening for a native Compose
reimplementation; §13's hard rule still stands.

### CHORES.md run
- Version bumped 0.10.1.3 → 0.10.1.4 across all four locations:
  - `custom_components/kitchen_cooking_engine/manifest.json`
  - `custom_components/kitchen_cooking_engine/__init__.py` (`__version__` +
    "Last Change" + version checklist comment block)
  - `custom_components/kitchen_cooking_engine/const.py` ("Last Change";
    `PANEL_VERSION` stays 612 — generator was not re-run because nothing in
    `panel-class-template.js` / `www/recipes/` / cooking-data changed)
  - `android/app/build.gradle.kts` (`versionCode` 22 → 23,
    `versionName` 0.10.1.3 → 0.10.1.4)
  This resynchronises KCE and the APK on a common version after the
  APK-only v0.10.1.3 release.
- Branch history file (this file) updated with the v0.10.1.4 entry.
- User guide: no GUI/heading changes in this branch — `docs/USER_GUIDE.md`
  is untouched and no `_openHelp(...)` anchors in `panel-class-template.js`
  need updating.

### Files changed
- `docs/ANDROID_APP_TOR.md` — new "Future Possible Routes for HA Custom
  Elements in the WebView" subsection inside §13.
- `custom_components/kitchen_cooking_engine/manifest.json` — version 0.10.1.4.
- `custom_components/kitchen_cooking_engine/__init__.py` — `__version__` +
  "Last Change" + checklist comment → 0.10.1.4.
- `custom_components/kitchen_cooking_engine/const.py` — "Last Change" → 0.10.1.4.
- `android/app/build.gradle.kts` — versionCode 23 / versionName 0.10.1.4.
- `docs/fix-select-cut-start-cook-button-0.10.1.x.md` — this entry.
