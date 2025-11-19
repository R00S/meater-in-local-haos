# Implementation Notes

> ⚠️ **CONTAINS ASSUMPTIONS**: This document contains implementation notes based on testing and observation. It is NOT based on direct extraction from decompiled app code. - UDP Broadcast for MEATER Block Emulation

## Summary

This implementation removes the BLE server functionality and replaces it with UDP broadcasting on port 7878 to emulate MEATER Block WiFi functionality.

## Changes Made

### 1. Removed BLE Server Components
- Removed `includes/meater_ble_server.h` from configuration
- Removed BLE server initialization code
- Changed NimBLE configuration to client-only mode
- Removed all BLE server forwarding in sensor lambdas

### 2. Added UDP Broadcasting
- Created `includes/meater_udp_broadcast.h` 
- Broadcasts on UDP port 7878 (MEATER_LINK_UDP_PORT)
- Simple packet format: device name + 8 bytes temp + 2 bytes battery
- Rate limited to 1 second intervals
- Broadcasts to local subnet (x.x.x.255)

### 3. Updated Documentation
- README updated to reflect WiFi bridge approach
- Troubleshooting section updated for UDP-specific issues

## Current Implementation Status

### ✅ Working
- BLE client connects to MEATER device
- Reads temperature, battery, firmware, device name
- Home Assistant sensors functional
- UDP broadcasts sent every second

### ⚠️ Needs Testing
- MEATER app discovery via UDP
- Whether simple packet format is sufficient
- App compatibility with broadcast format

### 🔬 Future Research Needed

The decompiled MEATER app shows that the actual MEATER Link protocol uses Protocol Buffers (protobuf). Key files found:

- `v3protobuf/MeaterLinkMessage.java` - Main message wrapper
- `v3protobuf/MeaterLinkHeader.java` - Message header
- `v3protobuf/SubscriptionMessage.java` - Client subscription
- `v3protobuf/MasterMessage.java` - Block status messages
- `v3protobuf/TemperatureHistoryMessage.java` - Temperature data

The protocol appears to use:
1. **Discovery broadcasts** - Block advertises presence
2. **Subscription messages** - App subscribes to block
3. **Status messages** - Block sends temperature/status updates

### Next Steps for Full Compatibility

If the simple UDP broadcast doesn't work with the MEATER app, the implementation should be enhanced with:

1. **Protobuf encoding** - Use proper MeaterLinkMessage format
2. **Header structure** - Include MeaterLinkHeader with version info
3. **Subscription handling** - Listen for and respond to app subscription requests
4. **Bidirectional UDP** - Both broadcast and receive on port 7878

The current simple implementation serves as a foundation that can be enhanced based on testing feedback.

## Testing Checklist

- [ ] ESP32 compiles without errors
- [ ] ESP32 connects to MEATER device via BLE
- [ ] Home Assistant sensors update correctly
- [ ] UDP broadcasts visible on network (Wireshark/tcpdump)
- [ ] MEATER app discovers ESP32 as a Block
- [ ] App can read temperature data
- [ ] App responds correctly to connection

## References

- MEATER BLE Protocol: https://github.com/nathanfaber/meaterble
- Decompiled app in `meater_app/` directory (gitignored)
- UDP Port: 7878 (from `data/ProtocolParameters.java`)
- Broadcast interval: 1 second (from `data/Config.java`)
