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

## Sessions

### 2026-05-25 — initial name-filter fix (v0.10.0.3 → 0.10.0.4)
BLE discovery attempt 1: replace name filter with service UUID `ScanFilter`.
Also: APK download link fix in build-apk.yml; version label on scan screen.

### 2026-05-25 — triple-detection + MAC filter (v0.10.0.4 → 0.10.0.5)
Discovery still failing because Block does not advertise service UUID.
- Removed hardware `ScanFilter` (was dropping the Block silently)
- Added triple-detection in callback: service UUID OR name OR Apption Labs OUI
- OUIs verified from IEEE database: `B8:1F:5E` = Apption Labs Limited, `90:21:2E` = Apption Labs Ltd
- Added MAC filter/search text field on scan screen (partial filter + full-MAC direct connect)
- Bumped 0.10.0.4 → 0.10.0.5 (versionCode 5 → 6)

### 2026-05-25 — show-all BLE + probe memory + cut data ground truth (v0.10.0.5 → 0.10.0.6)
User reported only full-MAC direct-connect worked; name/OUI filtering was still unreliable.
- `MeaterBleScanner`: removed all filtering — now shows every BLE device
- New `ProbeRepository` (SharedPreferences) — saves known probes; "Known devices" section on scan screen
- `MainViewModel`: `connectToAddress()` saves probe on connect, loads known probes on init
- `MainScreen`: rewritten — known probes section, plain full device list, simple MAC field
- `generate_frontend_data.py`: now writes `android/app/src/main/assets/cooking_data.json` from
  `EXP_TREE`/`EXP_DONENESS_OPTIONS` — added beef, lamb; now 7 categories (was 5)
- Bumped 0.10.0.5 → 0.10.0.6 (versionCode 6 → 7)
