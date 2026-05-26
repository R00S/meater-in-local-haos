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
