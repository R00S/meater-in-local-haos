# Troubleshooting: ESP32 Cannot Be Added as MEATER Probe

## Problem

The ESP32 BLE server is not being recognized or cannot be added as a MEATER probe in the official MEATER app, despite the BLE protocol being verified as unchanged.

## Diagnostic Checklist

Follow these steps in order to identify the issue:

### Step 1: Verify BLE Advertising

**What to check:**
- Is the ESP32 visible in the MEATER app's "Add MEATER" screen?
- Is it visible in other BLE scanner apps (nRF Connect, LightBlue)?

**Expected behavior:**
- Device name: `MEATER`
- Advertises MEATER service UUID: `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`

**How to verify:**

1. **Check ESP32 logs** for advertising messages:
   ```
   [meater_ble_server] Starting BLE advertising...
   [meater_ble_server] Advertising as: MEATER
   ```

2. **Use nRF Connect app** (Android/iOS):
   - Open nRF Connect
   - Scan for devices
   - Look for device named "MEATER"
   - Check if service `a75cc7fc` is advertised

**If device is NOT visible:**
- ❌ BLE advertising not working
- Check: Is BLE stack initialized? (Check ESP32 logs for init messages)
- Check: Are there BLE configuration errors in meater.yaml?
- Fix: Review `meater_bluedroid_server.h` advertising configuration

**If device IS visible:**
- ✅ Advertising works
- Continue to Step 2

---

### Step 2: Verify Service and Characteristic Structure

**What to check:**
- Can you connect to the ESP32 from nRF Connect?
- Are all services and characteristics visible?

**Expected structure:**

```
MEATER Service (a75cc7fc-c956-488f-ac2a-2dbc08b63a04)
├─ Temperature Characteristic (7edda774-045e-4bbf-909b-45d1991a2876)
│  └─ Properties: READ, NOTIFY
├─ Battery Characteristic (2adb4877-68d8-4884-bd3c-d83853bf27b8)
│  └─ Properties: READ, NOTIFY  
└─ Config Characteristic (575d3bf1-0be4-4e8f-a41e-be090726ed0b)
   └─ Properties: READ, WRITE

Device Information Service (0x180A)
├─ Firmware Revision (0x2A26)
│  └─ Properties: READ
│  └─ Value: "v1.0.4_0" format
├─ Manufacturer Name (0x2A29)
│  └─ Properties: READ
└─ Model Number (0x2A24)
   └─ Properties: READ

Generic Access Service (0x1800)
└─ Device Name (0x2A00)
   └─ Properties: READ
   └─ Value: "MEATER"
```

**How to verify:**

1. **Using nRF Connect:**
   - Connect to the MEATER device
   - Expand all services
   - Verify UUIDs match exactly
   - Check each characteristic has correct properties

2. **Check ESP32 logs:**
   ```
   [meater_ble_server] Service added: MEATER Service
   [meater_ble_server] Characteristic added: Temperature
   [meater_ble_server] Characteristic added: Battery
   [meater_ble_server] Characteristic added: Config
   [meater_ble_server] Service added: Device Information
   ```

**If services/characteristics are missing:**
- ❌ GATT server setup failed
- Check ESP32 logs for service registration errors
- Check: Is there enough memory for all services?
- Fix: Review service initialization in `init_ble_server()`

**If all services/characteristics are present:**
- ✅ GATT structure correct
- Continue to Step 3

---

### Step 3: Verify Firmware Version Format

**What to check:**
- Read the Firmware Revision characteristic
- Verify it matches MEATER format

**Expected format:**
- Pattern: `v{major}.{minor}.{patch}_{probeNumber}`
- Example: `v1.0.4_0`
- Probe number: `0` for standalone probe

**How to verify:**

1. **Using nRF Connect:**
   - Navigate to Device Information Service (0x180A)
   - Read Firmware Revision (0x2A26)
   - Value should be exactly: `v1.0.4_0`

2. **Check ESP32 logs:**
   ```
   [meater_ble_server] Firmware version: v1.0.4_0
   ```

**If firmware format is wrong:**
- ❌ Version parsing will fail in app
- Check: Is `MEATER_FIRMWARE` constant correct? (line 65 in .h file)
- Fix: Set to `"v1.0.4_0"` exactly

**If firmware format is correct:**
- ✅ Firmware readable
- Continue to Step 4

---

### Step 4: Verify Data Format (Temperature & Battery)

**What to check:**
- Can you read temperature and battery characteristics?
- Is the data format correct?

**Expected format:**

**Temperature (8 bytes):**
```
Byte 0-1: Tip temperature (raw value, little-endian)
Byte 2-3: Ambient temperature (raw value, little-endian)
Byte 4-5: Calculation parameter 1
Byte 6-7: Calculation parameter 2
```

**Battery (2 bytes):**
```
Byte 0-1: Battery percentage (0-100, little-endian)
```

**How to verify:**

1. **Using nRF Connect:**
   - Read Temperature characteristic (7edda774...)
   - Should return 8 bytes
   - Read Battery characteristic (2adb4877...)
   - Should return 2 bytes

2. **Check ESP32 logs:**
   ```
   [meater_ble_server] Temperature read: 8 bytes
   [meater_ble_server] Battery read: 2 bytes
   ```

**If data cannot be read:**
- ❌ Characteristic read not working
- Check: Are characteristic values initialized?
- Fix: Verify `temp_data_` and `battery_data_` arrays

**If data format is wrong:**
- ❌ App will fail to parse
- Check: Is data in correct byte order?
- Fix: Ensure little-endian format

**If data reads correctly:**
- ✅ Data format correct
- Continue to Step 5

---

### Step 5: Verify Pairing (Config Characteristic Write)

**This is the most likely issue!**

**What to check:**
- Can the app write to the Config characteristic?
- Does the write trigger pairing logic?

**Expected behavior:**

1. **App connects and reads firmware/temp/battery**
2. **App writes to Config characteristic** (this establishes pairing)
3. **ESP32 sets `is_paired_ = true`**
4. **App sets `datePaired` in its local database**
5. **Device appears in app's device list**

**How to verify:**

1. **Check if Config characteristic is writable:**
   - Using nRF Connect, try writing to Config characteristic
   - Should accept the write without error

2. **Monitor ESP32 logs during pairing attempt:**
   ```
   [meater_ble_server] Config characteristic write received
   [meater_ble_server] ✓ Device paired! Timestamp: 1234567890
   [meater_ble_server] App should now set datePaired field in database
   ```

3. **Check for errors:**
   ```
   [meater_ble_server] ❌ Write request rejected (wrong handle)
   [meater_ble_server] ❌ Write request rejected (no permission)
   ```

**Common issues:**

❌ **Config characteristic not writable**
- Symptom: Write fails in nRF Connect
- Cause: Characteristic properties don't include WRITE
- Fix: Verify line 355 in .h file sets `ESP_GATT_PERM_WRITE`

❌ **Write callback not triggered**
- Symptom: Write succeeds but no log message
- Cause: Callback not registered or wrong handle
- Fix: Verify `gatts_event_handler()` handles `ESP_GATTS_WRITE_EVT`

❌ **Pairing state not persisted**
- Symptom: Pairing works but doesn't persist across ESP32 reboots
- Cause: Pairing state only in RAM
- Fix: Add NVS storage for `is_paired_` and `pairing_timestamp_`

---

### Step 6: Verify App-Side Behavior

**What to check:**
- What does the MEATER app do when you try to add the device?
- Does it get stuck at a specific step?

**Expected flow in app:**

1. **Scanning screen** - "Looking for MEATER devices..."
   - Device should appear here
   
2. **Device list** - Shows found device
   - Tap to select
   
3. **Pairing screen** - "Connecting to MEATER..."
   - Shows progress spinner
   
4. **Reading data** - "Reading device information..."
   - Reads firmware, temperature, battery
   
5. **Establishing pairing** - "Setting up device..."
   - Writes to Config characteristic
   
6. **Complete screen** - "Pairing Complete!"
   - Device added to list

**Identify where it fails:**

**If it fails at "Scanning":**
- Issue: Step 1 (Advertising)
- The ESP32 is not advertising correctly

**If it fails at "Connecting":**
- Issue: BLE connection fails
- Check ESP32 logs for connection errors
- May be a Bluedroid configuration issue

**If it fails at "Reading device information":**
- Issue: Step 3 or 4 (Firmware format or data format)
- App cannot parse firmware version or data

**If it fails at "Setting up device":**
- Issue: Step 5 (Pairing/Config write)
- This is the most likely issue
- App cannot write to Config characteristic

**If it completes but device doesn't appear in list:**
- Issue: App-side `datePaired` not being set
- This means the pairing signal wasn't recognized
- Check if Config write response is correct

---

## Common Root Causes

Based on analysis, here are the most likely issues:

### 1. Config Characteristic UUID Wrong (LIKELY)

**Problem:** The Config characteristic UUID in the code doesn't match what the app expects.

**Current implementation:**
```cpp
// Config Characteristic: 575d3bf1-0be4-4e8f-a41e-be090726ed0b
```

**Check against old app:**
From `meater_app/data/Config.java`:
```java
public static final String MEATERConfigBLECharacteristicUUID = ???
```

**Fix:** Verify the Config UUID matches the app's expectation exactly.

### 2. Missing Advertising Data

**Problem:** The BLE advertising packet doesn't include required manufacturer data.

**What the app expects:**
- Service UUID: `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`
- Manufacturer data with device type:
  - `0x00` for regular MEATER
  - `0x80` for MEATER+

**Current implementation:** Check if advertising includes manufacturer data.

**Fix:** Add manufacturer data to advertising packet:
```cpp
esp_ble_adv_data_t adv_data = {
    .set_scan_rsp = false,
    .include_name = true,
    .include_txpower = false,
    .min_interval = 0x0006,
    .max_interval = 0x0010,
    .appearance = 0x00,
    .manufacturer_len = 2,  // Add this
    .p_manufacturer_data = manufacturer_data,  // Add this
    .service_data_len = 0,
    .p_service_data = NULL,
    .service_uuid_len = 16,
    .p_service_uuid = (uint8_t*)MEATER_SERVICE_UUID,
    .flag = (ESP_BLE_ADV_FLAG_GEN_DISC | ESP_BLE_ADV_FLAG_BREDR_NOT_SPT)
};
```

### 3. Connection Parameters

**Problem:** The BLE connection parameters don't match what the app expects.

**What to check:**
- Connection interval
- Slave latency
- Supervision timeout

**Fix:** Verify connection parameters match MEATER device behavior.

### 4. Characteristic Properties

**Problem:** A characteristic is missing required properties.

**What to check:**
- Temperature: Must have READ + NOTIFY
- Battery: Must have READ + NOTIFY
- Config: Must have READ + WRITE
- Firmware: Must have READ

**Fix:** Verify all properties are set correctly in characteristic initialization.

---

## Diagnostic Script

Create a Python script to test BLE connectivity:

```python
#!/usr/bin/env python3
"""
Test ESP32 MEATER BLE implementation
Requires: pip install bleak
"""

import asyncio
from bleak import BleakScanner, BleakClient

MEATER_SERVICE = "a75cc7fc-c956-488f-ac2a-2dbc08b63a04"
TEMP_CHAR = "7edda774-045e-4bbf-909b-45d1991a2876"
BATTERY_CHAR = "2adb4877-68d8-4884-bd3c-d83853bf27b8"
CONFIG_CHAR = "575d3bf1-0be4-4e8f-a41e-be090726ed0b"
FIRMWARE_CHAR = "00002a26-0000-1000-8000-00805f9b34fb"

async def test_meater():
    print("Scanning for MEATER devices...")
    devices = await BleakScanner.discover(timeout=10.0)
    
    meater_device = None
    for device in devices:
        if "MEATER" in device.name:
            print(f"✓ Found: {device.name} ({device.address})")
            meater_device = device
            break
    
    if not meater_device:
        print("❌ No MEATER device found")
        return
    
    print(f"\nConnecting to {meater_device.address}...")
    async with BleakClient(meater_device.address) as client:
        print("✓ Connected")
        
        # Check services
        for service in client.services:
            print(f"\nService: {service.uuid}")
            for char in service.characteristics:
                print(f"  Char: {char.uuid}")
                print(f"    Properties: {char.properties}")
        
        # Read firmware
        try:
            firmware = await client.read_gatt_char(FIRMWARE_CHAR)
            print(f"\n✓ Firmware: {firmware.decode()}")
        except Exception as e:
            print(f"❌ Firmware read failed: {e}")
        
        # Read temperature
        try:
            temp = await client.read_gatt_char(TEMP_CHAR)
            print(f"✓ Temperature data: {len(temp)} bytes")
        except Exception as e:
            print(f"❌ Temperature read failed: {e}")
        
        # Read battery
        try:
            battery = await client.read_gatt_char(BATTERY_CHAR)
            print(f"✓ Battery data: {len(battery)} bytes")
        except Exception as e:
            print(f"❌ Battery read failed: {e}")
        
        # Try writing config
        try:
            await client.write_gatt_char(CONFIG_CHAR, b'\x01\x02\x03\x04')
            print("✓ Config write successful")
        except Exception as e:
            print(f"❌ Config write failed: {e}")

if __name__ == "__main__":
    asyncio.run(test_meater())
```

Run this script to test each step of the pairing flow.

---

## Next Steps

1. **Run diagnostic script** to identify which step fails
2. **Check ESP32 logs** during pairing attempt
3. **Compare with real MEATER** using nRF Connect side-by-side
4. **Fix identified issue** based on diagnostic results
5. **Test pairing again** with MEATER app

---

## Quick Fixes to Try

If you're short on time, try these common fixes:

1. **Add manufacturer data** to advertising (most likely fix)
2. **Verify Config UUID** matches app expectation
3. **Check characteristic properties** (READ, WRITE, NOTIFY)
4. **Ensure firmware format** is exactly `v1.0.4_0`
5. **Add connection parameter updates** if needed

---

## Getting Help

If you're still stuck, provide:

1. ESP32 log output during pairing attempt
2. nRF Connect screenshots showing services/characteristics
3. What step the MEATER app gets stuck at
4. Any error messages from the app or ESP32

This will help identify the specific issue quickly.
