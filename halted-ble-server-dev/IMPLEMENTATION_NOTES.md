# Implementation Notes

## Current Implementation (2025-11-21)

### Summary

This implementation uses a BLE server (Bluedroid on ESP32-C3) to emulate a MEATER probe. The device advertises as "MEATER" and implements the MEATER GATT service structure.

**Current Status:**
- BLE server works and advertises successfully
- MEATER app can discover and add the device
- Connection fails after device is added (under investigation)
- BLE client is temporarily disabled to free memory for server debugging

---

## Previous Implementation Attempt: UDP Broadcast (OBSOLETE - RULED OUT)

> ⚠️ **OBSOLETE**: This section describes a UDP broadcasting approach that was investigated and ruled out.

This implementation attempted to remove the BLE server functionality and replace it with UDP broadcasting on port 7878 to emulate MEATER Block WiFi functionality.

### Changes Made (UDP Approach - RULED OUT)

#### 1. Removed BLE Server Components
- Removed `includes/meater_ble_server.h` from configuration
- Removed BLE server initialization code
- Changed NimBLE configuration to client-only mode
- Removed all BLE server forwarding in sensor lambdas

#### 2. Added UDP Broadcasting
- Created `includes/meater_udp_broadcast.h` 
- Broadcasts on UDP port 7878 (MEATER_LINK_UDP_PORT)
- Simple packet format: device name + 8 bytes temp + 2 bytes battery
- Rate limited to 1 second intervals
- Broadcasts to local subnet (x.x.x.255)

#### 3. Updated Documentation
- README updated to reflect WiFi bridge approach
- Troubleshooting section updated for UDP-specific issues

**Why Ruled Out:**
Investigation revealed that MEATER app requires both UDP discovery AND an HTTP server component. UDP alone is insufficient. Additionally, this approach moves away from the actual MEATER probe behavior (which is BLE-only). Development has refocused on BLE server implementation.

---

## Current BLE Server Implementation

### ✅ Working
- BLE server (Bluedroid) initializes successfully
- Advertises as "MEATER" with proper service UUIDs
- GATT services and characteristics configured
- MEATER app can discover and add the device
- Home Assistant sensors functional (mock data)
- OTA updates and WiFi connectivity

### ❌ Not Working
- MEATER app connection fails after adding device
- BLE client disabled (temporarily, for memory)

### 🔬 Investigation Needed

**Next Steps:**
Perform extremely thorough examination of decompiled MEATER app to understand:
1. Exact BLE connection sequence expected by app
2. Required characteristic behaviors (read/write/notify)
3. Pairing and bonding requirements
4. Connection parameters and timing
5. Any special handshake or authentication process

### Current Configuration

**Hardware:** ESP32-C3-DevKitM-1 (4MB flash)
**Framework:** ESP-IDF
**BLE Stack:** Bluedroid (not NimBLE)
**Mode:** Server only (client disabled)
**Include File:** `includes/meater_bluedroid_server.h`

## Testing Status

### Current Build
- [x] ESP32 compiles without errors
- [x] BLE server initializes successfully
- [x] Device advertises as "MEATER"
- [x] MEATER app can discover device
- [x] MEATER app can add device
- [ ] MEATER app can connect to device (FAILS - under investigation)
- [x] Home Assistant sensors show mock data
- [ ] Real MEATER probe data (BLE client disabled)

### UDP Approach (OBSOLETE)
- [x] ESP32 compiles without errors
- [x] ESP32 connects to MEATER device via BLE
- [x] Home Assistant sensors update correctly
- [x] UDP broadcasts visible on network (Wireshark/tcpdump)
- [ ] MEATER app discovers ESP32 as a Block (Failed - requires HTTP server)
- [ ] App can read temperature data (Not tested - discovery failed)
- [ ] App responds correctly to connection (Not tested - discovery failed)

## References

- MEATER BLE Protocol: https://github.com/nathanfaber/meaterble
- Decompiled app analysis in various docs/ files
- ESP32 Bluedroid documentation: https://docs.espressif.com/projects/esp-idf/en/latest/esp32/api-reference/bluetooth/esp_gatts.html
