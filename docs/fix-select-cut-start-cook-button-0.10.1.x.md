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

### Notes for future agents
- Do **not** add a separate `cp` step before the generator — the generator's own
  copy includes the rewrite. The workflow's manual `cp + sed` is a belt-and-braces
  safety net for the case where `www/kitchen-cooking-panel.js` was committed but
  the generator did not run on that machine.
- `android/app/src/main/assets/kitchen-cooking-panel.js` is `.gitignore`d — never
  commit it. Same for `android/app/src/main/assets/recipes/`.
- `android/app/src/main/assets/lit-element-bundle.js` **is** committed and must
  stay committed; it is the offline LitElement runtime served by
  `WebViewAssetLoader` to satisfy the rewritten import.
