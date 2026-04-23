# MAC Address Validation - Investigation and Solution

## Problem Statement

ESP32 device appears **greyed out** in MEATER app scan list, preventing user from clicking/connecting to it.

## Root Cause: MAC Address Prefix Validation

### Evidence from Real MEATER Devices

Captured MAC addresses from real MEATER probes:
- `B8:1F:5E:4A:5E:EF` - MEATER (regular)
- `B8:1F:5E:44:EC:8D` - MEATER+ 
- `E4:B3:23:C2:92:F6` - MEATER (regular)

**Pattern Identified:**
- Prefix 1: `B8:1F:5E` (Apption Labs registered OUI)
- Prefix 2: `E4:B3:23` (Apption Labs registered OUI)

### OUI (Organizationally Unique Identifier) Lookup

**B8:1F:5E** - Registered to: Apption Labs Limited  
**E4:B3:23** - Registered to: Apption Labs Limited

These are IEEE-registered MAC address prefixes that uniquely identify Apption Labs hardware.

### ESP32 MAC Address Prefixes

ESP32 devices use Espressif-assigned MAC prefixes:
- `30:AE:A4` (Espressif Inc.)
- `24:0A:C4` (Espressif Inc.)
- `24:6F:28` (Espressif Inc.)
- `24:62:AB` (Espressif Inc.)
- `A0:20:A6` (Espressif Inc.)
- And others...

**Our ESP32 likely uses one of these Espressif prefixes, NOT Apption Labs.**

## How App Validates Devices

From decompiled app code (`NearbyDevicesFragment.java:205`):

```java
if (!device.isPaired() && device.isOnline() && h.f8879a.T(device) && c3(device)) {
    // Device appears active in scan list
}
```

The obfuscated check `h.f8879a.T(device)` likely validates:

### Hypothesis 1: MAC Address Whitelist (Most Likely)
```java
// Pseudo-code of what h.f8879a.T() probably does:
public boolean T(MEATERDevice device) {
    String macPrefix = device.getMacAddress().substring(0, 8); // "B8:1F:5E" or "E4:B3:23"
    return macPrefix.equals("B8:1F:5E") || macPrefix.equals("E4:B3:23");
}
```

This prevents counterfeit/fake MEATER devices from working with the app.

### Why This Makes Sense
1. **Security:** Prevents competitors from creating fake MEATER devices
2. **Quality Control:** Ensures only official hardware works with app
3. **Revenue Protection:** Users must buy real MEATER hardware
4. **Support:** Apption Labs only supports their own hardware

## How to Verify This Theory

### Step 1: Check ESP32's Current MAC Address

Add to ESPHome logs to see actual MAC:
```yaml
logger:
  level: DEBUG
  
esp32:
  board: esp32-c3-devkitm-1
  framework:
    type: esp-idf
    
# Add this to see MAC on boot
esphome:
  on_boot:
    - lambda: |-
        uint8_t mac[6];
        esp_read_mac(mac, ESP_MAC_BT);
        ESP_LOGI("MAC", "BLE MAC Address: %02X:%02X:%02X:%02X:%02X:%02X", 
                 mac[0], mac[1], mac[2], mac[3], mac[4], mac[5]);
```

Expected output will show MAC like: `30:AE:A4:XX:XX:XX` (Espressif prefix)

### Step 2: Confirm Device Appears Greyed

With Espressif MAC, device should:
- ✅ Appear in app's scan list (name shows)
- ❌ Appear greyed out/disabled
- ❌ Cannot be clicked/selected
- ❌ Never connects

## Solution Options

### Option 1: MAC Address Spoofing (Recommended)

ESP32 allows setting custom BLE MAC address using ESP-IDF API.

**Implementation:**
```cpp
// In meater_bluedroid_server.h, in setup() before starting advertising:

void setup() {
    // ... existing setup code ...
    
    // Set custom MAC address (Apption Labs registered prefix)
    esp_bd_addr_t custom_mac = {0xB8, 0x1F, 0x5E, 0x12, 0x34, 0x56};
    //                           ^^^^^^^^^^^^^^^^^^  ^^^^^^^^^^^^^^
    //                           Apption Labs prefix  Random device ID
    
    esp_err_t ret = esp_ble_gap_set_rand_addr(custom_mac);
    if (ret != ESP_OK) {
        ESP_LOGE(TAG, "Failed to set custom MAC: 0x%x", ret);
    } else {
        ESP_LOGI(TAG, "✓ Set custom MAC: B8:1F:5E:12:34:56");
    }
    
    // ... continue with advertising setup ...
}
```

**Important Notes:**
- Last 3 bytes (`12:34:56` above) should be randomized per device
- Use different random bytes for each ESP32 to avoid conflicts
- MAC should be persistent (same on every boot)
- Could use ESP32's chip ID to generate unique last 3 bytes

**Alternative Prefixes:**
- `B8:1F:5E:XX:XX:XX` - Most common in our captures
- `E4:B3:23:XX:XX:XX` - Also valid Apption Labs prefix

### Option 2: Generate Unique MAC from ESP32 Chip ID

```cpp
void setup() {
    // Get ESP32's unique chip ID
    uint64_t chip_id = ESP.getEfuseMac();
    
    // Create MAC with Apption Labs prefix + unique ID
    esp_bd_addr_t custom_mac = {
        0xB8, 0x1F, 0x5E,                    // Apption Labs prefix
        (uint8_t)((chip_id >> 16) & 0xFF),   // Unique byte 1
        (uint8_t)((chip_id >> 8) & 0xFF),    // Unique byte 2
        (uint8_t)(chip_id & 0xFF)            // Unique byte 3
    };
    
    esp_err_t ret = esp_ble_gap_set_rand_addr(custom_mac);
    if (ret != ESP_OK) {
        ESP_LOGE(TAG, "Failed to set MAC: 0x%x", ret);
    } else {
        ESP_LOGI(TAG, "✓ MAC: %02X:%02X:%02X:%02X:%02X:%02X",
                 custom_mac[0], custom_mac[1], custom_mac[2],
                 custom_mac[3], custom_mac[4], custom_mac[5]);
    }
}
```

This ensures:
- ✅ Uses Apption Labs registered prefix
- ✅ Each ESP32 gets unique MAC (no conflicts)
- ✅ MAC is consistent across reboots
- ✅ Derived from hardware chip ID

### Option 3: Check if MAC Validation Can Be Bypassed

Less likely to work, but could try:
- Use ESPHome's BLE tracker to see if different advertising formats work
- Test if device ID in manufacturer data affects validation
- Check if there are other validation points

## Expected Results After MAC Spoofing

### Before (Current State):
```
App Scan List:
  [🔴 MEATER]  ← Greyed out, unclickable
     No temp shown
     MAC: 30:AE:A4:XX:XX:XX (Espressif)
```

### After (With Spoofed MAC):
```
App Scan List:
  [🟢 MEATER]  ← Active, clickable
     Reading temp...
     MAC: B8:1F:5E:XX:XX:XX (Apption Labs)
     
→ User clicks
→ App connects
→ Temperature displays
```

## Implementation Plan

### Phase 1: Verify Current MAC (5 minutes)
1. Add logging code to see ESP32's current MAC
2. Flash and check logs
3. Confirm it's Espressif prefix (not Apption Labs)

### Phase 2: Implement MAC Spoofing (30 minutes)
1. Add `esp_ble_gap_set_rand_addr()` call in setup
2. Use Apption Labs prefix `B8:1F:5E`
3. Generate unique last 3 bytes from chip ID
4. Flash and verify MAC is changed

### Phase 3: Test with MEATER App (10 minutes)
1. Open MEATER app
2. Scan for devices
3. Verify device appears ACTIVE (not greyed)
4. Click device to connect
5. Confirm temperature reads successfully

## Risks and Considerations

### Legal/Ethical:
- ✅ **For personal use**: Emulating hardware you own is legal
- ⚠️ **For distribution**: May violate Apption Labs terms of service
- ⚠️ **For sale**: Would likely violate trademark/IP laws

### Technical:
- ✅ ESP32 fully supports custom MAC addresses
- ✅ MAC spoofing is standard BLE practice for privacy
- ✅ No risk to ESP32 hardware
- ⚠️ App updates might add additional validation

### Practical:
- Must ensure each ESP32 has unique MAC (no duplicates)
- MAC should be stored/persistent across reboots
- Should log MAC on boot for debugging

## Alternative: Analyze Obfuscated Code Further

If MAC spoofing doesn't work, need to decompile `h.f8879a.T()` method:

### Steps:
1. Locate compiled class file: `c6/h.class`
2. Decompile with better tools (not ProGuard obfuscated)
3. Find `f8879a` field initialization
4. Trace `T()` method implementation
5. Identify exact validation logic

### Expected Difficulty:
- **High** - Code is heavily obfuscated
- **Medium** - If symbols remain for debugging
- **Low** - If validation is simple (just MAC check)

## References

### MAC Address Format
```
B8:1F:5E:XX:XX:XX
^^^^^^^^^^  ^^^^^^
OUI         NIC
(Vendor)    (Device ID)
```

### ESP32 BLE MAC APIs
- `esp_ble_gap_set_rand_addr()` - Set random address
- `esp_read_mac()` - Read factory MAC
- `esp_base_mac_addr_set()` - Set base MAC (affects all)

### Relevant Files
- `includes/meater_bluedroid_server.h` - BLE server implementation
- `meater.yaml` - ESPHome configuration
- `REAL_MEATER_PROBE_CAPTURE.md` - Real probe advertising data

---

## Status: Ready to Implement

**Next Action:** Implement MAC spoofing in `meater_bluedroid_server.h` and test.

**Expected Time:** 45 minutes total
- 5 min: Verify current MAC
- 30 min: Implement spoofing
- 10 min: Test with app

**Success Criteria:** 
- ✅ Device appears ACTIVE (not greyed) in app
- ✅ User can click device
- ✅ App connects successfully
- ✅ Temperature reads via GATT
