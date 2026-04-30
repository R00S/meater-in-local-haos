# CRITICAL BLE FIX NEEDED - Config Characteristic UUID is Wrong

## Problem Identified

The ESP32 BLE implementation **cannot pair** because it's using the **wrong UUID** for the Config characteristic!

## Analysis Results

### What the Implementation Currently Uses

File: `includes/meater_bluedroid_server.h` (line 40-44)

```cpp
// Config Characteristic: 575d3bf1-0be4-4e8f-a41e-be090726ed0b
static const uint8_t CONFIG_CHAR_UUID[16] = {
    0x0b, 0xed, 0x26, 0x07, 0x09, 0xbe, 0x1e, 0xa4,
    0x8f, 0x4e, 0xe4, 0x0b, 0xf1, 0x3b, 0x5d, 0x57
};
```

**Current UUID**: `575d3bf1-0be4-4e8f-a41e-be090726ed0b`

> **Note:** This UUID `575d3bf1-0be4-4e8f-a41e-be090726ed0b` does NOT appear anywhere in the decompiled app code. It may have come from:
> - Incorrect reverse engineering
> - A different MEATER device variant
> - Old firmware version
> - Similar to but different from `MEATERTemperatureLogModeBLECharacteristicUUID = "575d3bf1-2757-45ad-94d9-875c2f6120d3"` (note: `-2757-` vs `-0be4-`)

### What the MEATER App Actually Expects

From `meater_app/data/Config.java` and verified in `meater.app.new/sources/z4/O.java`:

```java
public static final String MEATERCookSetupBLECharacteristicUUID = "caf28e64-3b17-4cb4-bb0a-2eaa33c47af7";
```

**Required UUID**: `caf28e64-3b17-4cb4-bb0a-2eaa33c47af7`

## Why This Breaks Pairing

1. **App looks for Cook Setup characteristic** (`caf28e64-3b17-4cb4-bb0a-2eaa33c47af7`)
2. **ESP32 advertises wrong UUID** (`575d3bf1-0be4-4e8f-a41e-be090726ed0b`)
3. **App cannot find the characteristic** it needs to write pairing data
4. **Pairing fails** because the app can't establish the connection

The pairing logic in the implementation (lines 425-428) is correct, but it's triggered on writes to the **wrong characteristic UUID**, so the app never triggers it!

## The Fix

### Step 1: Update the UUID Definition

In `includes/meater_bluedroid_server.h`, replace lines 40-44:

**BEFORE:**
```cpp
// Config Characteristic: 575d3bf1-0be4-4e8f-a41e-be090726ed0b
static const uint8_t CONFIG_CHAR_UUID[16] = {
    0x0b, 0xed, 0x26, 0x07, 0x09, 0xbe, 0x1e, 0xa4,
    0x8f, 0x4e, 0xe4, 0x0b, 0xf1, 0x3b, 0x5d, 0x57
};
```

**AFTER:**
```cpp
// Cook Setup Characteristic: caf28e64-3b17-4cb4-bb0a-2eaa33c47af7
// This is the characteristic the app writes to during pairing
static const uint8_t CONFIG_CHAR_UUID[16] = {
    0xf7, 0x7a, 0xc4, 0x33, 0xaa, 0x2e, 0x0a, 0xbb,
    0xb4, 0x4c, 0x17, 0x3b, 0x64, 0x8e, 0xf2, 0xca
};
```

### Step 2: Update the Comment

The characteristic should be called "Cook Setup" not "Config" to match the app's terminology.

### How to Convert UUID to Reverse Byte Order

```python
import uuid

# Standard UUID
standard = "caf28e64-3b17-4cb4-bb0a-2eaa33c47af7"

# Remove hyphens and convert to bytes
uuid_bytes = bytes.fromhex(standard.replace('-', ''))

# Reverse for ESP32 (little-endian UUID storage)
reversed_bytes = list(reversed(uuid_bytes))

# Format as C array
print("static const uint8_t CONFIG_CHAR_UUID[16] = {")
for i in range(0, 16, 8):
    hex_values = ', '.join(f'0x{b:02x}' for b in reversed_bytes[i:i+8])
    print(f"    {hex_values}{',' if i+8 < 16 else ''}")
print("};")
```

## Verification

After making this fix:

1. **Compile** the updated code with ESPHome
2. **Flash** to ESP32 hardware  
3. **Open MEATER app** and scan for devices
4. **Device should appear** and be selectable
5. **Pairing should complete** when you tap the device

The app will:
- Discover the MEATER service
- Find the Cook Setup characteristic (now with correct UUID)
- Write pairing data to it
- ESP32 will set `is_paired_ = true`
- App will mark device as paired

## Why This UUID Was Wrong

The UUID `575d3bf1-0be4-4e8f-a41e-be090726ed0b` doesn't match any UUID in the MEATER app's Config.java file. Possible reasons:

1. **Typo** during initial implementation
2. **Misidentified** the characteristic from early reverse engineering
3. **Confused** with Temperature Log Mode UUID (`575d3bf1-2757-45ad-94d9-875c2f6120d3` - note similar prefix)

The actual pairing characteristic is `MEATERCookSetupBLECharacteristicUUID` which is documented in the app as the characteristic for cook setup configuration - this is where pairing configuration is written.

## Additional Notes

### Other Characteristics are Correct

All other UUIDs in the implementation are correct:
- ✅ MEATER Service: `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`
- ✅ Temperature: `7edda774-045e-4bbf-909b-45d1991a2876`
- ✅ Battery: `2adb4877-68d8-4884-bd3c-d83853bf27b8`
- ✅ Firmware: `00002a26-0000-1000-8000-00805f9b34fb`

Only the Config/Cook Setup characteristic UUID needs to be fixed.

### Pairing Logic is Correct

The pairing implementation (lines 417-429 in meater_bluedroid_server.h) correctly:
- Detects writes to the config characteristic
- Sets `is_paired_ = true`
- Records pairing timestamp
- Logs pairing event

The logic just needs to be triggered by writes to the **correct UUID**.

## Expected Outcome After Fix

With this single UUID fix:
1. ✅ ESP32 will appear in MEATER app scan
2. ✅ Tapping the device will initiate pairing
3. ✅ App will write to Cook Setup characteristic
4. ✅ ESP32 will mark itself as paired
5. ✅ Device will appear in app's device list
6. ✅ Temperature and battery readings will be visible

This is a **one-line fix** (changing the UUID bytes) that should completely resolve the pairing issue!

## Commit Message Suggestion

```
Fix BLE pairing: Use correct Cook Setup characteristic UUID

The Config characteristic was using UUID 575d3bf1-0be4-4e8f-a41e-be090726ed0b
but the MEATER app expects MEATERCookSetupBLECharacteristicUUID which is
caf28e64-3b17-4cb4-bb0a-2eaa33c47af7. This prevented the app from finding
the characteristic needed to write pairing data, causing pairing to fail.

Verified against both old app (meater_app/data/Config.java) and new app
(meater.app.new/sources/z4/O.java) that this is the correct UUID.
```

## References

- **Old App**: `meater_app/data/Config.java` - line with `MEATERCookSetupBLECharacteristicUUID`
- **New App**: `meater.app.new/sources/z4/O.java` - `f53430h` references `Config.MEATERCookSetupBLECharacteristicUUID`
- **Protocol Analysis**: `tools/PROTOCOL_COMPARISON_RESULTS.md` - confirms all UUIDs unchanged
- **Implementation**: `includes/meater_bluedroid_server.h` - lines 40-44 (UUID definition), lines 417-429 (pairing logic)
