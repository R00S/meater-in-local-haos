# Branch Timeline: update-meater-app-integration (v0.8.0.x)

**Branch:** `copilot/update-meater-app-integration`
**Started:** 2026-04-30

---

## Goal

Restore halted MEATER+ BLE and UDP research back to main so the community can benefit
from it. The research was deleted in the repo cleanup (commit 23a28b4c) but predates the
Kitchen Cooking Engine focus and contains valuable protocol analysis that nobody has
fully solved yet.

---

## Key Discovery (2026-04-30)

**MEATER+ Block 1-to-1 BLE connection constraint** (corrected from earlier docs):

The Block enforces a strict 1-to-1 chain: Probe ↔ Block ↔ Cloud.
When the Block connects to MEATER Cloud via WiFi it simultaneously holds the BLE
slot to the probe — exclusively. There is NO way to tap into that connection.
An ESP32 or any other BLE client can only reach the probe when the Block is powered off.

This corrects the previously documented claim "No impact (ESP32 uses BLE, not WiFi)".

---

## Completed

- [x] Restored `halted-ble-server-dev/` (34 files) from commit 5d82f8e8
- [x] Restored `halted-udp-server-dev/` (17 files including tools/) from commit 5d82f8e8
- [x] Updated `halted-ble-server-dev/README.md` with the 1-to-1 connection constraint
- [x] Created branch timeline

---

## Notes for Future Agents

These two folders contain **archived research only**. They are not part of the
Kitchen Cooking Engine and should not be modified as part of KCE tasks.

- `halted-ble-server-dev/` — ESP32 BLE server emulation (making ESP32 look like a MEATER Block to the app)
- `halted-udp-server-dev/` — MEATER Link UDP broadcast protocol reverse engineering

The UDP puzzle (how the MEATER app discovers a local Block via UDP broadcast) has not
been fully solved. The research here may help future contributors.
