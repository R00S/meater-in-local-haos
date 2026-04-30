# BLE Advertising Status

## Current State: ✅ BLE Server Running, ❌ App Not Finding Device

### What's Working

The logs confirm the BLE server is functioning correctly:

```
[16:05:14.295][I][meater_ble_server:145][BTC_TASK]: ✓ Advertising started successfully - Device should be visible as 'MEATER'
```

**Confirmed working:**
- ✅ Bluedroid initialized by esp32_ble_tracker
- ✅ BLE server setup completes
- ✅ All services created (handles: 20, 40, 52)
- ✅ All characteristics added (6 characteristics total)
- ✅ Advertising data configured
- ✅ Advertising started
- ✅ Device is broadcasting BLE advertisements

### What's Not Working

**MEATER app reports:** "No Device Found"

This means the app's scanner is filtering out our device during the scan. The app is likely checking for specific criteria that we're not meeting.

### Possible Issues

#### 1. Device Name Format
**Current:** "MEATER"
**Possible issue:** Real MEATER probes may have specific naming patterns like "MEATER-XXXX" with serial numbers

**Check needed:** Look at real MEATER probe advertisements to see exact name format

#### 2. Manufacturer Data Format
**Current implementation:**
```cpp
static uint8_t manufacturer_data[24] = {
    0x7B, 0x03,  // Company ID: 0x037B (Apption Labs) - LITTLE ENDIAN
    0x00, 0x00,  // Device type indicator
    // ... rest zeros
};
```

**Possible issues:**
- Company ID byte order might be wrong (should be 0x03, 0x7B for big-endian)
- Device type indicator might need specific value
- Additional fields might be required in manufacturer data

#### 3. Service UUID in Advertising
**Current:** We advertise the MEATER service UUID `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`

**Possible issue:** App might scan for devices WITHOUT filtering by service UUID, and instead rely solely on manufacturer data to identify MEATER devices

#### 4. Missing Fields
The app might require:
- Specific appearance value
- Specific flags
- TX power level in specific format
- Scan response data

### Next Steps to Debug

1. **Capture real MEATER probe advertisement** using nRF Connect or similar BLE scanner
   - Record exact advertising packet structure
   - Record manufacturer data bytes
   - Record device name pattern
   - Record all advertising flags

2. **Compare with ESP32 advertisement** 
   - Use nRF Connect to see what ESP32 is actually advertising
   - Compare byte-by-byte with real probe

3. **Check decompiled app for scan filters**
   - Look for how app filters BLE scan results
   - Check if it uses service UUID filtering or manufacturer data filtering
   - Find exact matching logic

### Decompiled App Analysis Needed

From `meater_app` directory, need to find:
- How `serviceScanner` (in NearbyDevicesFragment) filters devices
- What criteria it uses to accept/reject scan results
- Whether it looks for service UUIDs or manufacturer data
- Exact byte patterns it expects in manufacturer data

### Ground Truth Sources

**To extract from decompiled app:**
- Scanning filter logic (likely in a Scanner or BLE manager class)
- Device identification logic (how it determines "this is a MEATER")
- Advertisement data validation

**Cannot use:**
- Reverse-engineered protocol docs (already found conflicts)
- Assumptions about manufacturer data format
- Guesses about device naming

### Current Advertising Configuration

```cpp
// Device name
"MEATER"

// Service UUID (128-bit)
a75cc7fc-c956-488f-ac2a-2dbc08b63a04

// Manufacturer Data (24 bytes)
03 7B 00 00 00 00... (18 more zeros)

// Flags
ESP_BLE_ADV_FLAG_GEN_DISC | ESP_BLE_ADV_FLAG_BREDR_NOT_SPT
```

### Verification Command

To see what the ESP32 is actually advertising:
```bash
# On Linux with bluetoothctl
sudo bluetoothctl
scan on
# Look for device named "MEATER"
```

Or use nRF Connect mobile app to inspect the advertisement packet.
