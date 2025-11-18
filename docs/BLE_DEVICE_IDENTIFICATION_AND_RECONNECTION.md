# BLE Device Identification and Reconnection

## Executive Summary

**Critical Finding**: The MEATER app uses **MAC address** as the unique device identifier for reconnection. When a device is paired, the app stores both the `datePaired` timestamp and the `macAddress`. On subsequent connections, the app checks if the MAC address matches a known paired device to decide whether to show it as "already paired" or treat it as a new device.

## Device Identification Flow

### Database Schema

From `LocalStorage_Impl.java:206` and `MEATERDevice.java`:

```sql
CREATE TABLE MEATERDevice (
    deviceID INTEGER PRIMARY KEY,
    macAddress TEXT,              -- ← Unique identifier!
    datePaired INTEGER,           -- ← Pairing timestamp
    probeNumber INTEGER,
    firmwareRevision TEXT,
    lastSeenDate INTEGER,
    lastSeenAdvertising INTEGER,
    connectionState TEXT,
    ...
)
```

### Key Fields for Device Lifecycle

**`macAddress`** (`MEATERDevice.java:49`):
- Type: String
- Purpose: Unique device identifier
- Used for: Matching devices across reconnections
- Format: BLE MAC address (e.g., "E4:B3:23:C2:92:F4")

**`datePaired`** (`MEATERDevice.java:683`):
- Type: Long (nullable)
- Purpose: Indicates pairing status
- Value: `System.currentTimeMillis()` when paired, null otherwise
- Used by: `isPaired()` method

**`lastSeenDate`** (`MEATERDevice.java:47`):
- Type: Long
- Purpose: Last time device was seen/connected
- Value: Updated on every connection
- Used for: Connection state management

**`lastSeenAdvertising`** (`MEATERDevice.java:46`):
- Type: Long  
- Purpose: Last time device BLE advertising was detected
- Value: Updated during scanning
- Used for: Determining if device is nearby

## Pairing vs Reconnection Logic

### Initial Pairing (New Device)

```
1. App scans for BLE devices
2. User selects device from "Nearby Devices" list
3. App connects and discovers services
4. App reads firmware version
5. App reads initial temperature/battery
6. App saves device to database:
   - macAddress = BLE MAC address
   - datePaired = System.currentTimeMillis()  ← KEY: This marks as paired!
   - lastSeenDate = current time
   - connectionState = CONNECTED
7. Device now appears in "My Devices" list
```

### Reconnection (Previously Paired Device)

```
1. App scans for BLE devices
2. For each discovered device:
   a. Get MAC address from BLE advertising
   b. Query database: SELECT * FROM MEATERDevice WHERE macAddress = ?
   c. Check if result found:
      - If found AND datePaired != null → Already paired device
      - If found AND datePaired == null → Incomplete pairing
      - If not found → New device
3. For already paired devices:
   - Update lastSeenAdvertising = current time
   - Update lastSeenDate = current time
   - Update connectionState = CONNECTED
   - Show in "My Devices" list immediately (no pairing needed)
4. For new devices:
   - Show in "Nearby Devices" list
   - Require user to go through pairing flow
```

## Critical Code References

### `isPaired()` Check

**Source**: `MEATERDevice.java:489-492`

```java
public boolean isPaired() {
    if (this.datePaired != null) {
        return true;
    }
    return false;
}
```

### Connection State Management

**Source**: `MEATERDevice.java:685-694`

```java
@Override
public boolean getShouldShowAsConnected() {
    DeviceConnectionState deviceConnectionState = this.connectionState;
    if (deviceConnectionState != DeviceConnectionState.CONNECTED && 
        deviceConnectionState != DeviceConnectionState.ATTEMPTING_RECONNECT) {
        return false;
    }
    // Check parent device if this is a child (block probe)
    MEATERDevice parentDevice = this.parentDevice;
    if (parentDevice != null) {
        return parentDevice.getShouldShowAsConnected();
    }
    return true;
}
```

## Implementation Requirements for ESP32 BLE Server

### Critical: MAC Address Must Be Consistent

**Problem**: If the ESP32 uses a different MAC address each time (e.g., random address), the app will treat it as a **new device every time**, requiring re-pairing.

**Solution**: ESP32 must use a **static, consistent MAC address** across reboots.

### Implementation Strategy

**Option 1: Use Hardware MAC Address** (RECOMMENDED)
```cpp
// ESP32 has built-in MAC address in eFuse
uint8_t mac[6];
esp_read_mac(mac, ESP_MAC_BT);  // Get Bluetooth MAC
// This is permanent and unique per device
```

**Option 2: Generate and Store MAC Address**
```cpp
// On first boot:
// 1. Generate random MAC or use derived value
// 2. Store in NVS (non-volatile storage)
// 3. Load from NVS on subsequent boots
```

### Pairing Flow Implementation

**Phase 1: Initial Pairing**
```
1. ESP32 advertises with:
   - Device name: "MEATER"
   - Service UUID: a75cc7fc-c956-488f-ac2a-2dbc08b63a04
   - Manufacturer data: 0x7B03 0x00 (Apption Labs, MEATER type)
   - MAC address: CONSISTENT value (e.g., E4:B3:23:C2:92:F4)

2. App scans and finds ESP32
3. App checks database for macAddress = "E4:B3:23:C2:92:F4"
   - Not found → Treat as new device
   - Show in "Nearby Devices" list

4. User selects device
5. App connects and reads characteristics
6. App sets datePaired = System.currentTimeMillis()
7. App saves to database with MAC address
```

**Phase 2: Reconnection**
```
1. ESP32 advertises with SAME MAC address
2. App scans and finds ESP32
3. App checks database for macAddress = "E4:B3:23:C2:92:F4"
   - Found AND datePaired != null → Already paired!
   - Skip pairing flow
   - Connect directly
   - Show in "My Devices" immediately
```

## Testing Strategy

### Test 1: Initial Pairing
```
Expected:
1. Device appears in "Nearby Devices"
2. User selects device
3. Pairing completes
4. Device appears in "My Devices"
```

### Test 2: Reconnection After Power Cycle
```
Given: Device was previously paired
When: ESP32 power cycled and boots up
Then:
1. Device advertises with SAME MAC address
2. App detects device
3. Device appears in "My Devices" immediately (no pairing needed)
4. App connects automatically
```

### Test 3: Reconnection After App Restart
```
Given: Device was previously paired
When: App is closed and reopened
Then:
1. App loads device list from database (using MAC address)
2. App scans for BLE devices
3. When MAC address matches, device shows as connected
4. No re-pairing needed
```

## Common Issues and Solutions

### Issue 1: "No Device Found" on Reconnection

**Symptom**: Device requires re-pairing every time app restarts

**Cause**: MAC address is changing between sessions

**Solution**: Ensure MAC address is consistent across all advertising

### Issue 2: App Shows Two Devices

**Symptom**: App shows both old and new entries in device list

**Cause**: MAC address changed, app treats as different device

**Solution**: Use static MAC address, or clear app data to reset

### Issue 3: Device Never Moves to "My Devices"

**Symptom**: Device always shows in "Nearby Devices", never in "My Devices"

**Cause**: `datePaired` is never set in app's database

**Solution**: Ensure pairing flow completes successfully, app can write to database

## Next Steps

1. **Modify BLE Server** (`includes/meater_bluedroid_server.h`):
   - Use consistent MAC address (from hardware or NVS)
   - Log MAC address on startup for verification
   - Ensure MAC appears in BLE advertising

2. **Test Reconnection**:
   - Pair device once
   - Power cycle ESP32
   - Verify app reconnects without re-pairing
   - Check app's device list shows same device

3. **Validate with Tools**:
   - Use `validate_ble_pairing.py` to verify MAC consistency
   - Check advertising data contains correct MAC
   - Verify database queries use MAC address as key

## References

- `MEATERDevice.java:49` - macAddress field declaration
- `MEATERDevice.java:489-492` - isPaired() check
- `MEATERDevice.java:683` - setDatePaired() setter
- `LocalStorage_Impl.java:206` - Database schema
- `MEATERDevice.java:685-694` - getShouldShowAsConnected()
