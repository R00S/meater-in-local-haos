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

## Fix (v0.10.0.5)

Triple-detection in the scan callback (no hardware filter — scan all, filter in software):

1. **Service UUID** — bare probe advertising when not Block-connected
2. **Name prefix "MEATER"** — Block advertising as "MEATER+" or "MEATER"
3. **Apption Labs OUI** — MAC prefix `B8:1F:5E` (Apption Labs Limited) or `90:21:2E`
   (Apption Labs Ltd), verified against IEEE OUI database 2026-05-25

Any device matching at least one criterion appears in the discovered list.

Additionally added:
- **MAC search / filter field** on the scan screen — type any partial MAC (e.g. `B8:1F:5E`)
  to narrow the discovered list; type a full `XX:XX:XX:XX:XX:XX` address to reveal a
  "Connect directly" button that bypasses scanning entirely (useful when Block is not advertising)

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
