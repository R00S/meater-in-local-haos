# Branch Timeline: fix-meater-plus-discovery (0.10.0.x)

## Problem

Android app cannot discover the MEATER+ Block via BLE.
ESP32 (meater.yaml `bluetooth_proxy` + `ble_client`) can discover it.

## Root Cause

`MeaterBleScanner.kt` filters discovered devices by name:
```kotlin
val name = result.device.name ?: result.scanRecord?.deviceName ?: return
if (name.contains("MEATER", ignoreCase = true)) { ... }
```
If the Block's name is not present in the advertising packet (e.g. only in scan
response, or cached as null), both expressions are null and the device is silently
dropped before `onDeviceFound` is called.

The ESP32 does NOT filter by name. It identifies MEATER devices by their
service UUID (`a75cc7fc-c956-488f-ac2a-2dbc08b63a04`), which is always present
in the primary advertising packet (confirmed in REAL_MEATER_PROBE_CAPTURE.md).

## Fix

Replace the software name filter with a hardware-level `ScanFilter` on the MEATER
service UUID — the same way the ESP32 identifies the device.

- Add `ScanFilter` + `ScanSettings` (LOW_LATENCY) to `startScan()`
- Remove `?: return` name guard
- Use name if present, fall back to address for display

## Sessions

### 2026-05-25 — fix implemented
BLE discovery fixed: `MeaterBleScanner` now filters by service UUID, not name.

### 2026-05-25 — version display + CHORES
- Added app version (`v{versionName}`) below title on main scan screen
- Enabled `buildConfig = true` in `build.gradle.kts` to expose `BuildConfig.VERSION_NAME`
- Bumped version 0.10.0.3 → 0.10.0.4 (versionCode 4 → 5)
- Updated USER_GUIDE §15 with discovery fix description and new version
