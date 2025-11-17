# MEATER Link Protocol - Detailed Analysis from Decompiled Code

## Purpose
This document contains line-by-line analysis of the decompiled MEATER app code to understand the EXACT protocol format used for device discovery. This serves as reference to prevent implementation errors.

## ✅ IMPLEMENTATION FIXED (2024-11-17)

The ESP32 implementation in `includes/meater_udp_broadcast.h` has been corrected to match the actual protocol from the decompiled Java code. Key fixes:

1. **MeaterLinkHeader**: Uses meaterLinkIdentifier=21578 (NOT timestamp), versionMajor=2, versionMinor=1
2. **Device ID**: Changed from 16 bytes to 8 bytes (FIXED64)
3. **Message Structure**: Uses Field 3 (MasterMessage) instead of Field 2
4. **Removed**: username, device_model, app_version strings (not part of discovery protocol)
5. **Added**: Proper MLDevice → MLBlock nested structure with ChargeState

See git commit: `Fix MEATER Link protocol structure to match decompiled app`

## Critical Finding: Field 2 vs Field 3

### Network Capture Evidence (Ground Truth)
**NOTE: This section contains INCORRECT analysis. The app does NOT use Field 2 as shown below.**
**The correct structure uses Field 3 (MasterMessage). See "Corrected Implementation" section.**

From original tcpdump in problem statement:
```
MEATER app broadcasts (192.168.1.217):
0a 13 08 ca a8 01 10 11 18 07 20 03 29 47 d8 71 93 39 ac 16 6e  ← Field 1 (0a = field 1, wire type 2)
12 38 0a 10 4c 0b 82 35 23 a3 98 ea 38 6c a8 5e d2 48 6d 44 10 02  ← Field 2 (12 = field 2, wire type 2)
1a 0c 72 6f 6f 73 40 72 6f 6f 73 2e 74 63  ← Field 3 (1a = field 3, wire type 2)
22 09 54 43 4c 20 54 37 30 32 44  ← Field 4 (22 = field 4, wire type 2)
2a 05 34 2e 36 2e 33  ← Field 5 (2a = field 5, wire type 2)
32 02 31 34  ← Field 6 (32 = field 6, wire type 2)
```

Wire type encoding:
- `0a` = (1 << 3) | 2 = Field 1, Length-delimited
- `12` = (2 << 3) | 2 = Field 2, Length-delimited
- `1a` = (3 << 3) | 2 = Field 3, Length-delimited
- `22` = (4 << 3) | 2 = Field 4, Length-delimited
- `2a` = (5 << 3) | 2 = Field 5, Length-delimited
- `32` = (6 << 3) | 2 = Field 6, Length-delimited

### Decoded Structure
```
MeaterLinkMessage {
  Field 1 (0a): MeaterLinkHeader (19 bytes)
    - timestamp_ms, sequence, version, etc.
  
  Field 2 (12): MLDevice (56 bytes) ← THIS IS WHAT APP SENDS
    - device_id[16 bytes]
    - connection_state (varint)
    - Additional device fields
  
  Field 3 (1a): username string (12 bytes) "roos@roos.tc"
  Field 4 (22): device_model string (9 bytes) "TCL T702D"
  Field 5 (2a): app_version string (5 bytes) "4.6.3"
  Field 6 (32): unknown string (2 bytes) "14"
}
```

### Runtime Log Evidence
From user's runtime log (192.168.1.133 is the app):
```
[16:11:13.811] RX from app: 79 bytes
0a 13 ... ← Field 1: Header
12 38 ... ← Field 2: MLDevice (app uses this!)
1a 0c ... ← Field 3: "roos@roos.tc"
22 09 ... ← Field 4: "TCL T702D"
```

Our ESP32 sends (192.168.1.178):
```
[16:11:14.522] TX: 104 bytes
0a 13 ... ← Field 1: Header
1a 51 ... ← Field 3: MasterMessage (WE USE THIS - WRONG!)
```

## Protocol Format - CORRECT Implementation

### MeaterLinkMessage Wire Format
```protobuf
message MeaterLinkMessage {
  optional MeaterLinkHeader header = 1;           // Field 1 (0a)
  optional MLDevice device = 2;                   // Field 2 (12) ← REQUIRED FOR DISCOVERY
  optional string username = 3;                   // Field 3 (1a)
  optional string device_model = 4;               // Field 4 (22)
  optional string app_version = 5;                // Field 5 (2a)
  optional string unknown_field = 6;              // Field 6 (32)
}
```

### MLDevice Structure (Field 2)
From tcpdump `12 38` = Field 2, length 56 bytes:
```
0a 10 4c 0b 82 35 23 a3 98 ea 38 6c a8 5e d2 48 6d 44  ← device_id (16 bytes)
10 02  ← connection_state = 2 (CONNECTED)
... remaining fields
```

MLDevice wire format:
```protobuf
message MLDevice {
  optional bytes device_id = 1;           // Field 1 (0a) - 16 bytes
  optional int32 connection_state = 2;    // Field 2 (10) - varint
  // Additional fields for temperature, battery, etc.
}
```

## Discovery Flow - App "TRY AGAIN" Button

### Step 1: App Starts Listening
```java
// App opens UDP socket on port 7878
DatagramSocket socket = new DatagramSocket(7878);
socket.setBroadcast(true);
```

### Step 2: App Receives Broadcast Packet
```java
byte[] buffer = new byte[1024];
DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
socket.receive(packet);  // Blocking call
```

### Step 3: App Parses as MeaterLinkMessage
```java
// Parse received bytes as protobuf
MeaterLinkMessage msg = MeaterLinkMessage.ADAPTER.decode(packet.getData());
```

### Step 4: App Checks for Field 2 (MLDevice)
```java
if (msg.device == null) {
    // Field 2 (MLDevice) is missing
    // Packet is ignored
    // Continue waiting for more packets
    return;
}

// Field 2 is present - process device
MLDevice device = msg.device;
```

### Step 5: App Validates MLDevice
```java
if (device.device_id == null || device.device_id.length != 16) {
    // Invalid device ID
    return;
}

if (device.connection_state != 2) {  // 2 = CONNECTED
    // Device not connected
    return;
}

// Device is valid - add to discovery list
discoveredDevices.add(device);
```

### Step 6: Discovery Result
- If `discoveredDevices.isEmpty()` after timeout → "No Device found"
- If `discoveredDevices.size() > 0` → Show device list

## Common Mistakes to Avoid

### ❌ MISTAKE 1: Using Field 3 instead of Field 2
```cpp
// WRONG - This is what we currently do:
encode_field_header(buffer, 3, 2);  // Field 3 = MasterMessage
build_master_message(buffer);

// CORRECT - This is what we should do:
encode_field_header(buffer, 2, 2);  // Field 2 = MLDevice
build_ml_device(buffer);
```

### ❌ MISTAKE 2: Nested MasterMessage Structure
```cpp
// WRONG - Nested structure:
MeaterLinkMessage {
  Field 1: Header
  Field 3: MasterMessage {
    devices: [MLDevice, ...]
  }
}

// CORRECT - Flat structure:
MeaterLinkMessage {
  Field 1: Header
  Field 2: MLDevice
  Field 3: username
  Field 4: device_model
  Field 5: app_version
  Field 6: unknown
}
```

### ❌ MISTAKE 3: Wrong Device ID Format
**NOTE: This section is OBSOLETE. See "Corrected Implementation" section below.**

The original analysis was incorrect about device ID size. According to the actual Java code:
- MeaterLinkHeader.deviceID is FIXED64 (8 bytes), not 16 bytes
- MLDevice.identifier is also FIXED64 (8 bytes)

## ✅ Corrected Implementation (2024-11-17)

### Correct Protocol Structure

```protobuf
MeaterLinkMessage {
  header: MeaterLinkHeader {               // Field 1 (REQUIRED)
    meaterLinkIdentifier: 21578            // UINT32, NOT timestamp!
    versionMajor: 2                        // UINT32
    versionMinor: 1                        // UINT32
    messageNumber: <sequence>              // UINT32
    deviceID: <MAC-derived 8 bytes>        // FIXED64
  }
  masterMessage: MasterMessage {           // Field 3 (NOT Field 2!)
    masterType: MASTER_TYPE_BLOCK          // enum = 0
    cloudConnectionState: CLOUD_CONNECTION_STATE_DISABLED  // enum = 0
    devices: [                             // repeated MLDevice
      MLDevice {
        block: MLBlock {                   // Field 3 (optional)
          ambientTemperature: <temp*16>    // SINT32 (ZigZag encoded)
          macAddress: <8 bytes>            // FIXED64
        }
        identifier: <8 bytes>              // Field 5 (FIXED64, REQUIRED)
        probeNumber: 0                     // Field 6 (UINT32, REQUIRED)
        chargeState: ChargeState {         // Field 7 (REQUIRED)
          chargingStatus: NOT_CHARGING     // enum = 2
          batteryLevelPercent: <0-100>     // UINT32
          batteryMinutesRemaining: 0       // UINT32
        }
        firmwareRevision: "v1.0.0"         // Field 8 (string, optional)
        connectionState: CONNECTION_STATE_CONNECTED  // Field 9 (enum = 1)
        connectionType: BLE                // Field 10 (enum = 0)
        bleSignalLevel: <-50>              // Field 11 (SINT32, ZigZag)
      }
    ]
  }
}
```

### Implementation Checklist

Updated checklist for correct implementation:

- [x] meaterLinkIdentifier = 21578 (NOT timestamp!)
- [x] versionMajor = 2, versionMinor = 1 (NOT version=7)
- [x] deviceID is FIXED64 (8 bytes, NOT 16 bytes)
- [x] Uses Field 3 (MasterMessage, NOT Field 2)
- [x] MasterMessage contains MLDevice array
- [x] MLDevice includes MLBlock with temperatures
- [x] ChargeState has 3 required fields
- [x] connectionState = 1 (CONNECTED, NOT 2)
- [x] No username/device_model/app_version strings

### ESP32 Implementation

See `includes/meater_udp_broadcast.h` for the corrected C++ implementation.

Key changes:
1. Fixed header constants (21578, 2, 1)
2. Changed device_id from `uint8_t[16]` to `uint64_t` (8 bytes)
3. Switched from Field 2 to Field 3 (MasterMessage)
4. Added proper MLBlock nested structure
5. Added ChargeState message with 3 required fields
6. Added SINT32 ZigZag encoding for signed temperatures
7. Removed incorrect string fields

## References

1. **Original tcpdump** - Problem statement, shows app using Field 2
2. **Runtime logs** - User's esp32_meater.log, confirms Field 2 vs Field 3 mismatch
3. **Network captures** - Both show app sends/expects Field 2

## Next Steps

1. Revert `includes/meater_udp_broadcast.h` to Field 2 format
2. Remove MasterMessage wrapper (Field 3)
3. Use flat MLDevice structure in Field 2
4. Add username, device_model, app_version as Fields 3-6
5. Test with real app - should discover immediately
