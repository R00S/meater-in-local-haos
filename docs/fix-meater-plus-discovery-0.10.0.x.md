# Branch Timeline: fix-meater-plus-discovery (0.10.0.x)

## Problem

Android app cannot discover the MEATER+ Block via BLE.
ESP32 (meater.yaml `bluetooth_proxy` + `ble_client`) can discover it.

## Root Cause

`MeaterBleScanner.kt` originally filtered by device name:
```kotlin
val name = result.device.name ?: result.scanRecord?.deviceName ?: return
if (name.contains("MEATER", ignoreCase = true)) { ... }
```
If the Block's name is absent from the primary advertising packet, the device was silently dropped.

A second attempt (v0.10.0.4) replaced the name filter with a hardware-level `ScanFilter` on
the MEATER service UUID (`a75cc7fc-…`). This also failed: the MEATER Block does **not** include
the service UUID in its advertising packet — it only advertises by name `"MEATER+"`. The service
UUID is a GATT-layer detail, only visible after connecting.

## Fix (v0.10.0.6)

**Show all BLE devices** (no filter at all) — the user sees every nearby BLE device in a list and
taps "MEATER+" themselves. This is the same approach used by open-source BLE scanner apps
(`grgcmz/BLEScanner`, `santansarah/ble-scanner`, etc. — all MIT-licensed Kotlin/Compose apps;
verified 2026-05-25). No borrowed code was needed; the Android scan API is identical.

Additionally added:
- **Known devices** section at the top of the scan screen — previously connected blocks are
  remembered in SharedPreferences and shown with a direct "Connect" button; "Forget" removes them
- **Connect by MAC address** field (full MAC only) remains as a power-user fallback
- **Cut data ground truth** — `generate_frontend_data.py` now also writes
  `android/app/src/main/assets/cooking_data.json` from `EXP_TREE` + `EXP_DONENESS_OPTIONS`.
  The recipe files in `www/recipes/` are now the single source of truth for both the HA panel
  and the Android app. Previously `cooking_data.json` was hand-crafted and missing beef & lamb;
  it now has all 7 categories.

### 2026-05-25 — Fix 6 Android bugs (v0.10.0.7)

All 6 issues reported after v0.10.0.6:

**Bug 1 — Cannot view recipes (recipe content missing)**
Root cause: Issue 1 was misunderstood as showing cooking data (temps/methods). Actual need: the
KCE:CUT `.md` files contain rich recipe inspiration content (cut profiles, source recipes with
ingredients + steps, MEATER probe placement). These were not bundled or accessible.

Fix:
- `generate_frontend_data.py`: new `_build_recipe_index()` builds a `slug → relative .md path`
  map and injects `EXP_RECIPE_INDEX = {...}` into `kitchen-cooking-panel.js`.
- Generator also copies `www/recipes/` tree to `android/app/src/main/assets/recipes/` at build time.
- `build-apk.yml`: new step `cp -r www/recipes android/app/src/main/assets/recipes`.
- New `RecipeScreen.kt`: reads `EXP_RECIPE_INDEX` from panel JS, loads `.md` files from
  `assets/recipes/`, strips `<!-- KCE:CUT -->` frontmatter, converts markdown to HTML,
  renders in WebView with minimal CSS.
- `CutSelectionScreen`: "📖 View Recipes" button at the doneness step opens `RecipeScreen`.
- `MainViewModel`: `AppScreen.RECIPE`, `openRecipe()`, recipe fields in `MainUiState`.
- Cooking info card (USDA safe temp, rest time, carryover, methods) kept as a summary header.

**Bug 2 — Flat cut tree**
Root cause: `CookingDataRepository` flattened the full hierarchy into category → flat cuts,
losing species and cut type levels entirely.

Fix: `CookingDataRepository` now exports `Species` and `CutType` data classes. `ProteinCategory`
has `species: List<Species>` instead of `cuts: List<Cut>`. `CutSelectionScreen` is now 4 steps:
category → species → cut (grouped by cut type) → doneness. Species step auto-skipped for
single-species categories.

**Bug 3 — Cannot start cooks (GATT threading race)**
Root cause: `MeaterBleService` GATT callbacks (`onConnectionStateChange`, `onServicesDiscovered`,
`onCharacteristicChanged`, `onCharacteristicRead`) fire on the Android binder thread. They all
wrote directly to `uiState` (Compose `mutableStateOf`). Concurrent writes from binder + main
thread caused read-modify-write races; the `screen=DASHBOARD` state written by `startCooking()`
could be overwritten by a concurrent temperature update carrying the old state.

Fix: all `onStatus`/`onTemperature`/`onBattery`/`onDisconnected`/`onError` callbacks now
wrapped in `Handler(Looper.getMainLooper()).post { }` — all state mutations are serialised on
the main thread.

**Bug 4 — No BLE scan results visible**
Root cause: The device list `LazyColumn` used `Modifier.weight(1f, fill=false)` inside a
non-scrollable `Column`. All fixed-size siblings (header, buttons, MAC field, connect button)
were measured first; on any screen where they filled most of the viewport the weighted
`LazyColumn` received 0 dp height — invisible even when devices were arriving.

Fix: outer Column made scrollable (`verticalScroll(rememberScrollState())`); device list changed
from `LazyColumn(weight)` to a plain `Column` (device count is always small). `LazyColumn` and
its `lazy.items` import removed from `MainScreen.kt`.

**Bug 5 — Full Panel = black screen**
Root cause: the WebView loaded `kitchen-cooking-panel.js` which is a LitElement HA custom
element requiring `this.hass`. Without a Home Assistant connection it renders nothing.

Fix: "Full Panel" button renamed to "Cook History" (`Tillagningshistorik`). `AppScreen.WEBVIEW_PANEL`
replaced with `AppScreen.HISTORY`. New `CookHistoryScreen.kt` renders completed cook sessions
from `SessionHistoryRepository` (same data the probe cards already collect).
`WebViewCookingScreen.kt` retained in repo but no longer reachable from navigation.

**Bug 6 — Battery not shown**
Root cause: `onServicesDiscovered` fired 4 GATT operations at once (2× `writeDescriptor` + 2×
`readCharacteristic`). Android BLE only processes one GATT operation at a time; the 2nd, 3rd,
4th calls were silently dropped. Battery CCCD write never completed → `onBattery` never called.

Fix: `MeaterBleService` now has a GATT operation queue (`ArrayDeque`). All GATT ops enqueued
with `enqueueGattOp {}`. `onDescriptorWrite` and `onCharacteristicRead` advance the queue via
`runNextGattOp()`. Sequence per service: enableNotifications(temp) → enableNotifications(batt) →
readCharacteristic(batt).

Version bump: 0.10.0.6 → 0.10.0.7 (versionCode 7 → 8).

### 2026-05-26 — Replace CutSelectionScreen with WebView panel cook path (v0.10.0.11)

**Goal**

One GUI codebase: the MEATER cook path in the Android app runs the **exact same
`kitchen-cooking-panel.js`** that runs in Home Assistant — no HA server required.
Previous `CutSelectionScreen.kt` (Kotlin/Compose reimplementation) was replaced.

**Problem**

`CutSelectionScreen.kt` was a manual Kotlin/Compose reimplementation of the KCE
MEATER cook path. Every time it was updated it diverged from the panel — wrong steps,
missing steps, different UI — because agents kept reinterpreting rather than copying.

**Solution: WebView + mock hass**

The Android app now acts as a *framework* that hosts the real panel JS:

1. `WebViewCutSelectionScreen` (in `WebViewCookingScreen.kt`) loads
   `kitchen-cooking-panel.js` from assets in a full-screen WebView.
2. A minimal mock `hass` object is injected into the page **before** the custom
   element is mounted:
   - `callApi()` → `Promise.resolve(null)` — all API calls fail silently;
     every try/catch in the panel handles `null` gracefully.
   - `callService('kitchen_cooking_engine', 'start_cook', data)` → routes to
     the `KceAndroid` JS bridge → Kotlin.
   - `states = {}` — no HA entities; entity dropdown stays hidden.
   - `user.language` → in-app language ("en" or "sv").
3. The panel element is created programmatically with `hass`, `_language`,
   `_dataSource`, `_currentPath = 'meater_experimental'`, and
   `_showMeaterCooking = true` set **before** `appendChild()` — so the very
   first LitElement render goes straight to the cook path; no welcome/appliance
   screen flash.
4. On "Start Cook" the JS bridge calls `CutSelectionBridgeImpl.onCallService()`.
   `MainActivity.kt` enriches the bare `cut_id / doneness` data using
   `CookingDataRepository.findCutById()` and `findCategoryIdByCutId()` (two new
   helper methods), then calls `viewModel.startCooking()` as before.

**Files changed**

- `android/app/src/main/java/io/kitchen/meater/ui/WebViewCookingScreen.kt`
  — added `WebViewCutSelectionScreen`, `buildCookPathHtml()`,
    `CutSelectionBridgeImpl`; kept legacy `WebViewCookingScreen` / `KceBridgeImpl`
    (still used by history path).
- `android/app/src/main/java/io/kitchen/meater/data/CookingDataRepository.kt`
  — added `findCutById()` and `findCategoryIdByCutId()` helpers.
- `android/app/src/main/java/io/kitchen/meater/MainActivity.kt`
  — `AppScreen.CUT_SELECTION` case now uses `WebViewCutSelectionScreen`;
    `CutSelectionScreen` import removed.
- `android/app/build.gradle.kts` — version 0.10.0.10 → 0.10.0.11 (code 12).

**What KCE component version tracks**

KCE manifest/`__init__.py` remain at 0.10.0.9 — this is a pure Android change.



**Issue 1 — BLE scanning shows nothing**

Root cause (identified via research of grgcmz/BLEScanner and santansarah/ble-scanner):
Previous code wrapped every `onScanResult` result in `Handler(Looper.getMainLooper()).post {}`.
Neither working reference app does this. grgcmz calls directly into Compose `mutableStateListOf`
from the BLE callback thread; santansarah dispatches to a coroutine scope.

Additionally, previous code accessed `result.scanRecord?.deviceName` first, then `result.device.name`
as fallback — both reference apps use `result.device.name` directly with `@SuppressLint` on
`onScanResult` itself (not on the outer `start()` function).

Fix:
- `MeaterBleScanner.kt`: removed `mainHandler` / `Handler.post`. `onDeviceFound` is now called
  directly from the BLE callback thread. `@SuppressLint("MissingPermission")` moved to
  `onScanResult` directly (matching grgcmz/santansarah pattern). `setCallbackType()` call removed
  (both reference apps rely on the `CALLBACK_TYPE_ALL_MATCHES` default). Auto-retry on
  `SCAN_FAILED_ALREADY_STARTED` (errorCode 2) copied from santansarah.
- `MainViewModel.kt`: `discoveredDevices` removed from `MainUiState`. New field
  `val scannedDevices = mutableStateListOf<BleDevice>()` on the ViewModel directly.
  `onDeviceFound` callback mutates `scannedDevices` from BLE thread — thread-safe because
  Compose snapshot state supports concurrent writes.
- `MainScreen.kt`: accepts `discoveredDevices: List<BleDevice>` as a separate parameter.
- `MainActivity.kt`: passes `viewModel.scannedDevices` to `MainScreen`.

**Issue 2 — Recipes show whole cut files**

Root cause: `RecipeScreen.buildRecipeHtml` concatenated the master cut profile file plus ALL
method files, giving the user a wall of unrelated content.

Fix: `RecipeScreen` now takes a `method: String` parameter and loads ONLY the
`{slug}-{method}.md` file from `EXP_RECIPE_INDEX`. The master cut file is not loaded.
`CutSelectionScreen` navigates here with the selected method slug.

**Issue 3 — Cook path missing steps**

Root cause: after selecting doneness, `onConfirm` fired immediately, skipping temperature
fine-tuning and cooking method selection entirely.

Fix: Full KCE MEATER cook path implemented in `CutSelectionScreen`:
- Step 4: Doneness selection (stores `selectedDoneness`, does NOT call `onConfirm`)
- Step 5: Target temperature fine-tuning (slider 35–100°C, ±1 buttons, USDA safety warning,
  reset-to-default button)
- Step 6: Cooking method selection (from `cut.supportedMethods`); recipe titles shown inline
  per method when the method card is expanded; clicking a title opens `RecipeScreen`
- Step 7: Start Cook button (enabled when doneness selected + method selected if methods exist)
- `onConfirm` now passes `cookingMethod`; `CookingSession.cookingMethod` stores it.
- `CookingDataRepository.recipeTitles` loaded from `RECIPE_TITLES_INDEX` in
  `kitchen-cooking-panel.js`.

Version bump: 0.10.0.9 → 0.10.0.10 (versionCode 10 → 11).
BLE discovery attempt 1: replace name filter with service UUID `ScanFilter`.
Also: APK download link fix in build-apk.yml; version label on scan screen.

### 2026-05-25 — triple-detection + MAC filter (v0.10.0.4 → 0.10.0.5)
Discovery still failing because Block does not advertise service UUID.
- Removed hardware `ScanFilter` (was dropping the Block silently)
- Added triple-detection in callback: service UUID OR name OR Apption Labs OUI
- OUIs verified from IEEE database: `B8:1F:5E` = Apption Labs Limited, `90:21:2E` = Apption Labs Ltd
- Added MAC filter/search text field on scan screen (partial filter + full-MAC direct connect)
- Bumped 0.10.0.4 → 0.10.0.5 (versionCode 5 → 6)

### 2026-05-25 — Android language toggle fix (v0.10.0.6)

Root cause identified: the EN/SV toggle button updated `uiState.language` correctly but
nothing in the UI observed it — `ProbeCard` received `useSv` but ignored it for every label,
and `CutSelectionScreen` used `stringResource()` which follows *Android system locale* (not
the in-app state), so it always rendered English strings regardless.

Pattern taken from the HAOS panel (`panel-class-template.js`):
`(lang === 'sv' && cut.name_sv) ? cut.name_sv : cut.name` — data is already bilingual in the
cut files, passed through via `EXP_TREE`/`EXP_DONENESS_OPTIONS`. Chrome strings are translated
by mirroring the `I18N_STRINGS` section of the same JS.

Changes (v0.10.0.5 → 0.10.0.6):

- **`CookingSession.kt`** — added `cutDisplayNameSv: String = ""` so the probe card shows
  the correct language after a toggle mid-cook.

- **`CookingEngine.kt`** — `startSession()` accepts and stores `cutDisplayNameSv`.

- **`MainViewModel.kt`** — `startCooking()` accepts `cutDisplayNameSv`, passes it through.

- **`CutSelectionScreen.kt`** — removed all `stringResource()` / `R` imports; replaced with
  `if (useSv) "sv text" else "en text"` using exact translations from `I18N_STRINGS`. `onConfirm`
  now passes `cut.name` AND `cut.nameSv` separately (always, regardless of current UI language).

- **`MainActivity.kt`** — updated `onConfirm` handler to accept and forward `cutDisplayNameSv`.

- **`MainScreen.kt`** — `ProbeCard`: all labels (Spets/Tip, Omgivning/Ambient, Batteri/Battery,
  Status/State, Mål/Target, Beräknad tid/ETA, state machine labels, button text) switch via
  `useSv`. Cut name shows `cutDisplayNameSv` when Swedish. `DeviceRow` also translated.
  Main screen chrome (app name, scan/connect buttons, section headings, hint text, probe
  section) all switch via `useSv`.

- **`USER_GUIDE.md`** — language switching moved to "implemented" list; cut selection and cook
  start documented with bilingual step-by-step; WebView language note updated.

Verification: cut names and doneness names are sourced exclusively from `EXP_TREE`/
`EXP_DONENESS_OPTIONS` in `kitchen-cooking-panel.js` (ground truth: the cut files). No
manual translation table. Chrome strings mirror `I18N_STRINGS` from the HAOS panel.

### 2026-05-26 — Fix black screen + sv/en button (v0.10.0.13)

**Bug 1 — "Select cut & start cook" still black screen (not a CSS issue)**

Root cause: `buildCookPathHtml` called `customElements.whenDefined('kitchen-cooking-panel')`
and `document.createElement('kitchen-cooking-panel')`, but `kitchen-cooking-panel.js` registers
the element as **`'kitchen-cooking-card'`** (line 11453 of panel-class-template.js:
`customElements.define('kitchen-cooking-card', KitchenCookingPanel)`).

`customElements.whenDefined('kitchen-cooking-panel')` — a Promise that never resolves because
that name is never registered. The body stays empty. Pure black background from CSS.

Fix: Changed both occurrences to `'kitchen-cooking-card'` in `buildCookPathHtml`.

**Bug 2 — sv/en toggle button disappeared**

Root cause: `WebViewCutSelectionScreen` was a full-screen WebView with no native overlay.
The panel's own language selector lives on the welcome screen (which we skip by jumping
directly to `_currentPath = 'meater_experimental'`). The sv/en toggle on `MainScreen`
(always present) was not visible while inside the full-screen WebView.

Fix: Added a thin native top bar above the WebView with a "← Back" / "← Tillbaka" button.
Language selection stays on the main/scan screen (matching KCE's pattern where language is
set once on the welcome screen before entering the cook path). No language toggle in the
cook path overlay — the user sets language on the scan screen before entering the cook flow.

Additionally: `key(language)` wraps the `AndroidView` so the WebView recreates if language
changes while the screen is open (e.g. user navigates back, changes language, re-enters).

Version bump: 0.10.0.12 → 0.10.0.13 (versionCode 13 → 14). Pure Android change.



**Bug 1 — BLE scan still finds no devices**

Root cause: `BLUETOOTH_SCAN` in `AndroidManifest.xml` lacked the
`android:usesPermissionFlags="neverForLocation"` attribute. On Android 12+ (API 31+), without
this flag the OS behaves as if the app uses Bluetooth to derive physical location — which in
Android 11 and below required `ACCESS_FINE_LOCATION` at runtime. Our manifest only declares
`ACCESS_FINE_LOCATION` for `maxSdkVersion="30"` and `PermissionScreen` never requests it for
API 31+, so the system silently delivered zero scan results with no error code.

Fix: `android:usesPermissionFlags="neverForLocation"` added to `BLUETOOTH_SCAN` in
`AndroidManifest.xml`. This declares to the OS that we never use BLE scan results to derive
location, removing the location-permission requirement entirely on API 31+.

**Bug 2 — "Select cut & start cook" renders a black screen**

Root cause: `WebViewCutSelectionScreen` embeds `kitchen-cooking-panel.js` (a LitElement) in a
standalone WebView with no HA server. The panel uses CSS custom properties
(`--primary-text-color`, `--divider-color`, `--card-background-color`, etc.) for all colors.
In a standalone WebView these variables are undefined — they evaluate to `transparent`/initial.
The page background was `#111` (fallback for `--primary-background-color`) and text color
inherited browser default (black), resulting in black text on a near-black background.

Fix: `buildCookPathHtml` now sets a full set of HA dark-theme CSS variables on `:root`.
These pierce the LitElement shadow DOM via CSS inheritance so the panel renders correctly
without any HA server. Also added `ha-card { display: block; }` in the outer page because
`ha-card` is an undefined custom element (renders as `display: inline` by default) inside
a standalone WebView — making it block ensures cards stack vertically as intended.

Version bump: 0.10.0.11 → 0.10.0.12 (versionCode 12 → 13).
