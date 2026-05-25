# Branch Timeline: bump-version-a-b-c-d — v0.10.0.x

**Branch:** `copilot/bump-version-a-b-c-d`  
**Version Scope:** 0.10.0.x  
**Started:** 2026-05-25

---

## Task

Start implementation of the Android APK according to ToR and plan.

---

## Session Log

### 2026-05-25 — Agent session

**Plan:**
- [x] Create required timeline file for this branch/version
- [ ] Read Android ToR and implementation plan docs
- [ ] Implement phase-1 Android APK foundation
- [ ] Build/validate Android project

**Discoveries:**
- Timeline file for `bump-version-a-b-c-d-0.10.0.x.md` did not exist and was created.
- `docs/ANDROID_APP_TOR.md` exists and will be used as source of truth for app scope.

**Actions:**
- Created timeline file.

### 2026-05-25 — Agent session (Android phase-1 start)

**Discoveries:**
- No `android/` project existed in repository.
- No dedicated Android implementation plan file exists; `docs/ANDROID_APP_TOR.md` is the active scope source.
- First build attempt failed due missing XML theme dependency (`Theme.Material3.DayNight.NoActionBar`).

**Actions:**
- Scaffolded `android/` Gradle project using `gradle init`.
- Added `app/` Android module (Kotlin + Compose) with package `io.kitchen.meater`.
- Implemented initial vertical slice:
  - Compose app shell (`MainActivity`, `MainScreen`)
  - BLE scan entry point (`MeaterBleScanner`) for MEATER-named BLE devices
  - Local storage skeleton (`SessionHistoryRepository`)
- Set app `versionName` to `0.10.0.0` per ToR versioning.
- Fixed build error by adding `com.google.android.material:material` dependency.
- Validated build: `./gradlew :app:assembleDebug` succeeded.

**Status:**
- [x] Android phase-1 foundation started and building
- [ ] GATT connection + temperature decode
- [ ] Multi-probe telemetry pipeline
- [ ] KCE panel/cut-data asset bundling pipeline


### 2026-05-25 — Agent session (CHORES + Android continuation)

**CHORES.md completed:**
- Version bumped to `0.10.0.1` in required integration locations (`manifest.json`, `__init__.py`, `const.py`).
- Branch timeline updated with missing implementation details.
- `docs/USER_GUIDE.md` updated with Android preview section and current build/feature status.
- Existing `_openHelp(...)` anchors in `panel-class-template.js` were verified unchanged and still aligned with current User Guide headings.

**Android ToR progress:**
- Added BLE GATT implementation module: `android/app/src/main/java/io/kitchen/meater/ble/MeaterBleService.kt`.
- Implemented MEATER service/characteristic discovery and read+notify handling for temperature and battery UUIDs.
- Implemented temperature decode path using ToR-documented formulas.
- Wired UI state for selecting scanned device and connect/disconnect flow.

**Status:**
- [x] CHORES.md tasks completed
- [x] BLE scan + connect/disconnect + decode baseline in app
- [ ] Multi-probe telemetry model and dashboard
- [ ] KCE panel/cut-data bundling into APK
- [ ] Cooking algorithm parity and milestone notifications


### 2026-05-25 (second agent session) — Finish Android app + CHORES

**Android ToR deliverables completed:**
- `CookingState.kt` — state machine enum (IDLE/COOKING/APPROACHING/GOAL_REACHED/RESTING/DONE)
- `CookingSession.kt` — per-probe data model (cut, doneness, target, ETA, history, notes)
- `CookingEngine.kt` — full port of KCE ETA algorithm from sensor.py; rate-based using 5-min rolling history; falls back to MINUTES_PER_DEGREE_C constant
- `NotificationHelper.kt` — milestone notifications (approaching, goal reached, rest complete) using Android NotificationChannel
- `MeaterBleService.kt` updated — multi-probe: enumerates all MEATER service instances the Block exposes; probeIndex passed to all callbacks
- `MainViewModel.kt` updated — multi-probe session map; state transition → notification wiring; auto-save to history on cook complete
- `MainScreen.kt` updated — multi-probe dashboard with ProbeCard per active probe (tip, ambient, battery, state, target, ETA)
- `SessionHistoryRepository.kt` updated — full JSON-backed serialization (save, load, updateNotes, delete)
- `.github/workflows/publish-apk.yml` added — builds debug APK on release and attaches to GitHub Release assets

**CHORES.md:**
- Version bumped to `0.10.0.2` in `manifest.json`, `__init__.py`, `const.py`, `build.gradle.kts`
- `docs/USER_GUIDE.md` updated with expanded Android feature list
- Branch timeline updated

**Remaining ToR items (not blocking first release):**
- Runtime permission UX flow (BLUETOOTH_SCAN/CONNECT request dialog)
- Cut selection UI (a full screen with protein/cut/doneness picker)
- KCE panel WebView integration (bundling kitchen-cooking-panel.js as APK asset)
- Language switching UI
- Signed release APK (keystore setup)

### 2026-05-25 (third agent session) — Finish Android ToR remaining items + CHORES

**Android ToR — remaining items completed:**
- `PermissionScreen.kt` — BLE runtime permission request (BLUETOOTH_SCAN + BLUETOOTH_CONNECT).
  Uses `ActivityResultContracts.RequestMultiplePermissions`. On API ≤ 30 passes through immediately.
- `CutSelectionScreen.kt` — three-step protein/cut/doneness picker.
  Reads `cooking_data.json` asset (bundled from `EXP_TREE`/`EXP_DONENESS_OPTIONS` in the generated panel JS).
  Supports SV/EN: shows `name_sv` when `language == "sv"`.
- `CookingDataRepository.kt` — parses `cooking_data.json` from APK assets into typed Kotlin models.
- `WebViewCookingScreen.kt` — embeds `kitchen-cooking-panel.js` (full KCE panel) in an Android WebView.
  Injects `KceAndroid` JS bridge (`startCooking`, `stopCooking`).
  Pushes live probe data via `window.kceAndroidProbeUpdate(...)` on each session update.
  Sets `window.KCE_ANDROID_LANGUAGE` before panel init.
- `LanguagePreference.kt` — persists EN/SV preference in SharedPreferences.
  Defaults to device locale (`Locale.getDefault().language == "sv"` → Swedish).
- `MainViewModel.kt` updated — `AppScreen` enum + full navigation logic.
  Permission → Scan → Dashboard → Cut Selection → WebView panel.
  Language toggle wired.
- `MainActivity.kt` updated — screen router using `when (state.screen)`.
  Back navigation via `OnBackPressedDispatcher` (replaces deprecated `onBackPressed()`).
- `MainScreen.kt` updated — language toggle button (EN↔SV), "Select cut" / "Change cut" per probe card,
  "Full Panel" button to open the WebView screen.
- `build.gradle.kts` updated — `signingConfigs { release { ... } }` reads from env vars
  (`KEYSTORE_PATH`, `KEYSTORE_PASSWORD`, `KEY_ALIAS`, `KEY_PASSWORD`) or local `keystore.properties`.
  Release build signs only when keystore is available; debug APK always unsigned.
- `publish-apk.yml` updated — decodes `KEYSTORE_BASE64` secret, builds both release + debug APK,
  attaches both to GitHub Release.
- `android/KEYSTORE_SETUP.md` added — step-by-step keystore generation and CI secret setup guide.
- `android/.gitignore` updated — `keystore.properties`, `*.keystore`, `*.jks` excluded.
- Assets bundled: `android/app/src/main/assets/cooking_data.json` (EXP_TREE + EXP_DONENESS_OPTIONS as JSON),
  `android/app/src/main/assets/kitchen-cooking-panel.js` (full KCE panel, 7 MB).
- String resources: `res/values/strings.xml` (EN), `res/values-sv/strings.xml` (SV) for all new screens.
- `versionCode` bumped to 4, `versionName` to `0.10.0.3` in `build.gradle.kts`.

**Build verified:** `./gradlew :app:assembleDebug` → `BUILD SUCCESSFUL`

**CHORES.md:**
- Version bumped to `0.10.0.3` in `manifest.json`, `__init__.py`, `const.py`
- `generate_frontend_data.py` run → `PANEL_VERSION` 603 → 604
- `cooking_data.json` and `kitchen-cooking-panel.js` assets regenerated from updated panel
- `docs/USER_GUIDE.md` §15 updated to reflect complete ToR implementation
- Branch timeline updated

**All Android ToR items complete.** Only polish/device-testing items remain (see USER_GUIDE.md §15).


### 2026-05-25 — Agent session (CI fix + CHORES)

**Problem solved:**
- `workflow_dispatch` "Run workflow" button was not visible in the GitHub Actions UI for `publish-apk.yml`.
- Root cause: GitHub only shows the button when the workflow file exists on the **default branch** (`main`).
  The workflow was only on this feature branch, so the button never appeared.

**Actions:**
- Simplified `publish-apk.yml` to debug-only build (removed signed release APK steps and keystore secrets).
- Added `push: branches: [main] paths: [android/**]` trigger → once merged, any push to android/ on main also builds.
- Artifact upload condition broadened from `workflow_dispatch`-only to all non-release runs.
- `docs/USER_GUIDE.md` §Build updated: clarified CI builds debug APK only.
- Version bumped to `0.10.0.4`.

**Status:**
- [x] CI fix committed
- [x] CHORES.md complete (version bump, timeline, user guide)
- [ ] Merge to main (pending PR review)
