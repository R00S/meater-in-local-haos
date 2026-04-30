# Halted BLE Server Development

⚠️ **STATUS: ON HOLD - Hopefully Resumable**

This folder contains the halted BLE server emulation development work. The goal was to make an ESP32 appear as a MEATER probe to the official MEATER app.

## Why Halted

- BLE server could advertise as "MEATER" but the app could not maintain a stable connection
- The MEATER app's connection/pairing requirements are more complex than initially understood
- Need a MEATER Block available for BLE traffic sniffing to understand the protocol better

## ⚠️ Critical Hardware Constraint (confirmed 2026-04-30)

The **MEATER+ Block enforces a strict 1-to-1 BLE connection chain**.

> "The MEATER+ Block stops the Bluetooth session as soon as it connects to the cloud and
> vice versa. It's a 1-to-1 only allowed connection chain all the way — or we would have
> tapped into it long ago."

This means:
- When the Block is cloud-connected (WiFi active), it **also** holds the BLE slot to the probe exclusively.
- There is **no way** to intercept or share the BLE connection while the Block is running.
- Any local BLE client (ESP32, Emkraan, or other) can only reach the probe when the Block is **powered off**.
- Sniffing the Block↔probe BLE link is only possible if you can power-cycle the Block and capture the reconnect window, or use a dedicated BLE sniffer at the right moment.

This constraint was previously unknown and is the primary reason an ESP32 BLE client approach against a Block-connected probe will always fail silently — the probe is simply not advertising when the Block is active.

## Resumption Potential: **CONSTRAINED** 🟠

For the BLE **server emulation** path (making ESP32 appear as a probe to the MEATER app):
- The Block ↔ App BLE link is what needs to be sniffed, not the probe ↔ Block link.
- With the Block powered on and app connected, sniffing that specific BLE session would reveal the server protocol.
- We already have the GATT structure broadly correct (services, characteristics, UUIDs).
- Main unknown remains the exact handshake/connection flow the app expects from a Block.

## What's Here

### Configuration Files
- `meater.yaml.backup` - BLE server configuration (was main config)
- `meater_old.yaml` - Earlier iteration
- `meater_ble_client_backup.yaml` - Client-only backup before server work

### Server Implementation (C++ Headers)
- `meater_ble_server.h` - Main BLE server implementation (Bluedroid)
- `meater_ble_server_bluedroid.h.backup` - Bluedroid server backup
- `meater_bluedroid_server.h` - Alternative Bluedroid implementation
- `meater_nimble_client.h` - NimBLE client attempt

### Development Documentation
- `MEATER_BLE_PROTOCOL.md` - BLE protocol analysis
- `BLE_ADVERTISING_STATUS.md` - Advertising debug notes
- `CRITICAL_BLE_FIX_NEEDED.md` - Outstanding issues
- `FIX_CONNECTION_ISSUE_SUMMARY.md` - Connection troubleshooting
- `FIX_NO_DEVICE_FOUND.md` - Discovery issues
- `FIX_VALIDATION_REPORT.md` - Validation attempts
- `GROUND_TRUTH_VERIFICATION.md` - Protocol verification
- `REAL_MEATER_PROBE_CAPTURE.md` - Captured probe data
- `MAC_ADDRESS_INVESTIGATION.md` - Address analysis

### Session Logs
- `esp32_meater.log` - ESP32 debug logs
- Various session summaries and fix documentation

## Potential Future Use

If revisiting BLE server emulation:
1. Study `meater_app/` decompiled code for exact connection requirements
2. Review ChatGPT analysis in `halted-udp-server-dev/chatgpt-analysis`
3. Consider using Combustion Inc (open protocol) as reference implementation

## Related

- See `halted-udp-server-dev/` for UDP/MEATER Link protocol work
- See `meater_app/` for decompiled MEATER app code (may help understand cooking algorithms)
