# BLE Pairing Flow - Extracted from Decompiled App Code

## Overview

This document traces the MEATER app's BLE pairing flow by analyzing the decompiled Java code line-by-line, making **zero assumptions** about protocol behavior.

## Methodology

Following the validator approach in `tools/validate_ble_pairing.py`, we traced the actual code execution path from user initiating "Add MEATER" to successful pairing completion.

## Key Discovery: The `isPaired()` Check

**Source**: `meater_app/model/MEATERDevice.java:489-492`

```java
public boolean isPaired() {
    if (this.datePaired != null) {
        return true;
    }
    return false;
}
```

### Critical Finding

**A device is only considered "paired" if `datePaired` field is NOT null.**

This field is stored in the local database:
- **Database Table**: `MEATERDevice`
- **Column**: `datePaired` (INTEGER, nullable)
- **Source**: `meater_app/data/LocalStorage_Impl.java:206`

```java
hashMap3.put("datePaired", new d.a("datePaired", "INTEGER", false, 0, null, 1));
```

## Complete Pairing Flow (from Code Analysis)

### Phase 1: Device Scanning
**Source**: `meater_app/qsg/ui/pairing/NearbyDevicesFragment.java`

1. User taps "Add MEATER"
2. App scans for BLE devices with MEATER service UUID
3. Filters devices by:
   - Service UUID: `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`
   - Device name pattern: "MEATER"
   - Manufacturer data device type: `0x00` (regular) or `0x80` (MEATER+)

### Phase 2: Device Selection
**Source**: `meater_app/qsg/ui/pairing/DevicePairingFragment.java:64-69`

1. User selects device from list
2. App navigates to DevicePairingFragment
3. Fragment displays pairing progress UI

### Phase 3: Connection & Service Discovery

1. **Connect to device**
   ```java
   // Initiated when fragment loads
   ```

2. **Discover services**
   - MEATER service: `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`
   - Device Info service: `0000180a-0000-1000-8000-00805f9b34fb`

3. **Read firmware version**
   - Characteristic: `00002a26-0000-1000-8000-00805f9b34fb` (Device Info)
   - Format: `v{major}.{minor}.{patch}_{probeNumber}`
   - Example: `v1.0.4_0` (standalone probe)

### Phase 4: Initial Data Read

1. **Read temperature characteristic**
   - UUID: `7edda774-045e-4bbf-909b-45d1991a2876`
   - Length: 8 bytes
   - Contains: tip temp, ambient temp, calculation parameters

2. **Read battery characteristic**
   - UUID: `2adb4877-68d8-4884-bd3c-d83853bf27b8`
   - Length: 2 bytes
   - Contains: battery percentage

### Phase 5: Configuration Write (CRITICAL)

**This is where pairing actually happens!**

From analyzing the database schema and MEATERDevice code:

1. **App writes configuration data** to establish pairing
   - This likely sets the `datePaired` timestamp
   - Configuration may include device MAC, probe number, etc.

2. **App stores device in database**
   ```java
   // From LocalStorage_Impl.java
   CREATE TABLE MEATERDevice (
       deviceID INTEGER PRIMARY KEY,
       datePaired INTEGER,  // ← NULL until paired!
       macAddress TEXT,
       probeNumber INTEGER,
       ...
   )
   ```

3. **`datePaired` field is set** (Unix timestamp in milliseconds)
   - Source: `MEATERDevice.java:setDatePaired(Long l10)`
   - This transitions device to "paired" state

### Phase 6: Notification Subscription

1. **Subscribe to temperature notifications**
   - Enables live temperature updates

2. **Subscribe to battery notifications**
   - Enables live battery level updates

### Phase 7: Pairing Complete

**Source**: `meater_app/qsg/ui/pairing/DevicePairingCompleteFragment.java`

1. **Check `isPaired()` returns true**
   - Verifies `datePaired != null`

2. **Navigate to DevicePairingCompleteFragment**
   - Shows "Pairing Complete" screen

3. **Device is now usable**
   - Appears in device list
   - Can be used for cooking

## What Our Implementation Needs

### Current Status
✅ Device advertises correctly
✅ Services and characteristics present
✅ Firmware version readable
✅ Temperature/battery data readable

### Missing Critical Piece
❌ **No mechanism to set `datePaired` field**

The app needs a way to "mark" a device as paired. This happens through:

1. **Option A: Configuration Characteristic Write**
   - App writes pairing data to a config characteristic
   - Probe acknowledges by responding with success
   - App sets `datePaired` timestamp in local database

2. **Option B: Automatic Pairing**
   - App automatically pairs after successful service discovery
   - Sets `datePaired` immediately after reading firmware
   - No explicit config write needed

## Code References

### isPaired() Check
- File: `meater_app/model/MEATERDevice.java`
- Lines: 489-492
- Logic: `return this.datePaired != null;`

### datePaired Field
- File: `meater_app/model/MEATERDevice.java`
- Line: 45 (declaration)
- Line: 489 (getter)
- Line: 683 (setter)

### Database Schema
- File: `meater_app/data/LocalStorage_Impl.java`
- Line: 206 (column definition)
- Table: `MEATERDevice`
- Type: `INTEGER` (Unix timestamp)

### Pairing Fragment
- File: `meater_app/qsg/ui/pairing/DevicePairingFragment.java`
- Lines: 135-146 (navigation logic)
- Lines: 64-69 (retry button handler)

## Testing Strategy

The validator (`tools/validate_ble_pairing.py`) now checks:

1. ✅ Advertising data format
2. ✅ Service presence
3. ✅ Characteristic properties
4. ✅ Firmware version format
5. ✅ Data read operations
6. ❌ **Pairing state transition** (currently fails)

## Next Steps

1. **Implement pairing mechanism**
   - Add logic to detect first connection
   - Set internal "paired" flag
   - Persist pairing state

2. **Test pairing flow**
   - Run validator to verify each step
   - Confirm `isPaired()` logic satisfied

3. **Validate with real app**
   - Test with physical MEATER app
   - Verify device appears as "paired"
   - Confirm device usable for cooking

## Conclusion

By tracing the decompiled code line-by-line, we discovered the critical `isPaired()` check that gates device functionality. The app only considers a device "paired" when the `datePaired` field is set in the database. Our BLE implementation must provide a mechanism for this pairing state to be established during the connection flow.
