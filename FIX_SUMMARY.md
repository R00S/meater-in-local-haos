# Device Not Found Issue - Fix Summary

## Problem

The MEATER app was not discovering the ESP32 as a MEATER Block device, showing "Device Not Found" error.

## Root Cause

The UDP broadcast implementation was sending the wrong protobuf message type:

- **Was sending**: Field 2 (SubscriptionMessage) - used for app → block subscriptions
- **Should send**: Field 3 (MasterMessage) - used for block → app device broadcasts

### SubscriptionMessage Structure (Field 2 - INCORRECT)
According to `meater_app/v3protobuf/SubscriptionMessage.java`:
- Field 1: `desiredDevices` (List<FIXED64>)
- Field 2: `clientType` (MasterType enum)
- Field 3: `emailAddress` (string)
- Field 4: `deviceInfo` (string)
- Field 5: `appVersion` (string)
- Field 6: `osVersion` (string)

### MasterMessage Structure (Field 3 - CORRECT)
According to `meater_app/v3protobuf/MasterMessage.java`:
- Field 1: `masterType` = 0 (MASTER_TYPE_BLOCK)
- Field 2: `cloudConnectionState` = 0 (CLOUD_CONNECTION_STATE_DISABLED)
- Field 3: `devices` (repeated MLDevice)

## Solution

Updated `includes/meater_udp_broadcast.h` to properly construct and send Field 3 (MasterMessage).

### Correct Packet Structure

```
MeaterLinkMessage {
  Field 1: MeaterLinkHeader {
    meaterLinkIdentifier: 21578
    versionMajor: 17
    versionMinor: 7
    messageNumber: <sequence>
    deviceID: <ESP32 MAC-derived FIXED64>
  }
  
  Field 3: MasterMessage {
    masterType: 0 (MASTER_TYPE_BLOCK)
    cloudConnectionState: 0 (CLOUD_CONNECTION_STATE_DISABLED)
    devices: [
      MLDevice {
        plus: MLPlus {
          childProbe: MLChildDevice {
            identifier: <device_id>
            probeNumber: 0
          }
          probeChargingState: ChargeState {
            chargingStatus: 2 (NOT_CHARGING)
            batteryLevelPercent: <battery%>
            batteryMinutesRemaining: 0
          }
          ambientTemperature: <ambient_temp_raw> (SINT32, ZigZag encoded)
        }
        identifier: <device_id>
        probeNumber: 0
        chargeState: ChargeState { ... }
        connectionState: 1 (CONNECTION_STATE_CONNECTED)
        connectionType: 0 (BLE)
      }
    ]
  }
}
```

## Key Changes

1. **Changed from Field 2 to Field 3**: Now sends MasterMessage instead of SubscriptionMessage
2. **Added masterType**: Set to 0 (MASTER_TYPE_BLOCK) to identify as a MEATER Block
3. **Added cloudConnectionState**: Set to 0 (DISABLED) as expected for local-only operation
4. **Proper MLDevice structure**: 
   - Uses MLPlus for MEATER+ probe
   - Includes MLChildDevice with identifier and probe number
   - Includes ChargeState with battery information
   - Uses SINT32 (ZigZag encoding) for ambient temperature
5. **All required fields**: identifier, probeNumber, chargeState, connectionState, connectionType

## Verification

Manual packet decoding confirms the structure matches the Java protobuf definitions exactly:

```
Field 1 (MeaterLinkHeader): ✅
  - meaterLinkIdentifier: 21578 ✅
  - versionMajor: 17 ✅
  - versionMinor: 7 ✅
  - deviceID: 0xd0d0... ✅

Field 3 (MasterMessage): ✅
  - masterType: 0 ✅
  - cloudConnectionState: 0 ✅
  - devices[0]: MLDevice ✅
    - plus.childProbe ✅
    - plus.probeChargingState ✅
    - plus.ambientTemperature ✅
    - identifier ✅
    - probeNumber ✅
    - chargeState ✅
    - connectionState: 1 ✅
    - connectionType: 0 ✅
```

## Testing

To test the fix:

1. Flash the updated code to your ESP32
2. Ensure the ESP32 is connected to your WiFi network
3. Ensure the MEATER probe is connected via BLE
4. Open the MEATER app and check for device discovery
5. The ESP32 should now appear as "MEATER Block" in the app

## References

- Java protobuf definitions: `meater_app/v3protobuf/*.java`
- UDP capture analysis: `docs/udp_capture.log`
- Protocol validator: `tools/validate_protocol.py`
- Manual decoder: `tools/manual_decode.py`
