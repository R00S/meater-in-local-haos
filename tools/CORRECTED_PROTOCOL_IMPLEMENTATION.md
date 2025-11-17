# Corrected MEATER Link Protocol Implementation

## Date: 2024-11-17

## Summary

The ESP32 UDP broadcast implementation has been corrected to match the actual MEATER Link protocol structure found in the decompiled app's Java protobuf classes.

## What Was Wrong

### 1. MeaterLinkHeader (Field 1)
**Incorrect Implementation:**
```cpp
// WRONG - Used timestamp and incorrect version
encode_varint_field(header, 1, millis());     // timestamp_ms
encode_varint_field(header, 3, 7);            // version = 7
encode_fixed64(header, 5, 0x47d8...);         // random value from capture
```

**Correct Implementation:**
```cpp
// CORRECT - Use fixed constants from MeaterLinkHeader.java
encode_varint_field(header, 1, 21578);        // meaterLinkIdentifier = 21578
encode_varint_field(header, 2, 2);            // versionMajor = 2
encode_varint_field(header, 3, 1);            // versionMinor = 1
encode_varint_field(header, 4, sequence);     // messageNumber (sequence counter)
encode_fixed64(header, 5, device_id);         // deviceID (FIXED64, 8 bytes from MAC)
```

### 2. Device ID Size
**Incorrect:**
- Used 16-byte array: `uint8_t device_id_[16]`
- Generated from MAC: `MAC + MAC + XOR bytes + padding`

**Correct:**
- Use 8-byte fixed64: `uint64_t device_id_`
- Generated from MAC: `MAC (6 bytes) + XOR checksum (2 bytes)`

### 3. Message Structure
**Incorrect:**
```cpp
// WRONG - Used Field 2 with custom structure
encode_length_delimited(packet, 2, device);  // Field 2
encode_string(packet, 3, "meater@esp32.local");  // username
encode_string(packet, 4, "ESP32-C3");  // device_model
encode_string(packet, 5, "4.6.3");  // app_version
```

**Correct:**
```cpp
// CORRECT - Use Field 3 with MasterMessage
encode_length_delimited(packet, 3, master_message);  // Field 3
// No username/device_model/app_version strings!
```

### 4. MLDevice Structure
**Incorrect:**
- Flat structure in Field 2
- Missing ChargeState, MLBlock

**Correct:**
- Nested in MasterMessage.devices array
- Includes MLBlock (Field 3) with ambient temperature
- Includes ChargeState (Field 7) with 3 required fields
- Uses correct enum values for connectionState (1 = CONNECTED, not 2)

## Correct Protocol Structure

### Top Level: MeaterLinkMessage

```
MeaterLinkMessage {
  Field 1: MeaterLinkHeader (length-delimited, REQUIRED)
  Field 3: MasterMessage (length-delimited, for Block broadcasts)
}
```

### Field 1: MeaterLinkHeader

```
MeaterLinkHeader {
  Field 1: meaterLinkIdentifier (UINT32) = 21578
  Field 2: versionMajor (UINT32) = 2
  Field 3: versionMinor (UINT32) = 1
  Field 4: messageNumber (UINT32) = sequence counter
  Field 5: deviceID (FIXED64) = 8-byte ID from ESP32 MAC
}
```

**Default Values** (from MeaterLinkHeader.java):
- `DEFAULT_MEATERLINKIDENTIFIER = 21578`
- `DEFAULT_VERSIONMAJOR = 2`
- `DEFAULT_VERSIONMINOR = 1`
- `DEFAULT_MESSAGENUMBER = 0`
- `DEFAULT_DEVICEID = 0L`

### Field 3: MasterMessage

```
MasterMessage {
  Field 1: masterType (enum, REQUIRED) = MASTER_TYPE_BLOCK (0)
  Field 2: cloudConnectionState (enum, REQUIRED) = CLOUD_CONNECTION_STATE_DISABLED (0)
  Field 3: devices (repeated MLDevice)
}
```

**Enum Values:**
- MasterType: `MASTER_TYPE_BLOCK = 0`
- CloudConnectionState: `CLOUD_CONNECTION_STATE_DISABLED = 0`

### MLDevice Structure

```
MLDevice {
  Field 3: block (MLBlock, optional)
  Field 5: identifier (FIXED64, REQUIRED)
  Field 6: probeNumber (UINT32, REQUIRED)
  Field 7: chargeState (ChargeState, REQUIRED)
  Field 8: firmwareRevision (string, optional)
  Field 9: connectionState (ConnectionState enum, REQUIRED)
  Field 10: connectionType (DeviceConnectionType enum, REQUIRED)
  Field 11: bleSignalLevel (SINT32, optional, ZigZag encoded)
}
```

**Enum Values:**
- ConnectionState: `CONNECTION_STATE_CONNECTED = 1`
- DeviceConnectionType: `BLE = 0`

**Note:** Only ONE of Fields 1-4 (probe/plus/block/amber) should be set!

### MLBlock Structure

```
MLBlock {
  Field 2: ambientTemperature (SINT32, optional, ZigZag encoded)
  Field 4: macAddress (FIXED64, optional)
}
```

**Temperature Encoding:**
- Raw value = celsius * 16
- Encoded using ZigZag: `(n << 1) ^ (n >> 31)`

### ChargeState Structure

```
ChargeState {
  Field 1: chargingStatus (ChargingStatus enum, REQUIRED)
  Field 2: batteryLevelPercent (UINT32, REQUIRED)
  Field 3: batteryMinutesRemaining (UINT32, REQUIRED)
}
```

**Enum Values:**
- ChargingStatus: `NOT_CHARGING = 2`

## Wire Format Encoding

### Field Header
```
field_header = (field_number << 3) | wire_type
```

### Wire Types
- 0: Varint (int32, int64, uint32, uint64, bool, enum)
- 1: 64-bit (fixed64, double)
- 2: Length-delimited (string, bytes, embedded messages)

### ZigZag Encoding (for SINT32)
```cpp
uint32_t zigzag = (value << 1) ^ (value >> 31);
```

Used for signed temperatures in MLBlock.ambientTemperature and MLDevice.bleSignalLevel.

## Example Packet

**Test Parameters:**
- Device ID: 0xAABBCCDDEEFF0011
- Ambient Temp: 20°C (raw: 320)
- Battery: 85%
- Sequence: 1

**Generated Packet (76 bytes):**
```
0a1308caa801100218012001291100ffeeddccbbaa1a35080010001a2f1a0c108005
211100ffeeddccbbaa291100ffeeddccbbaa30003a06080210551800420676312e30
2e30480150005863
```

**Structure:**
- Field 1 (0a): MeaterLinkHeader (19 bytes)
  - meaterLinkIdentifier: 21578
  - versionMajor: 2
  - versionMinor: 1
  - messageNumber: 1
  - deviceID: 0xAABBCCDDEEFF0011
- Field 3 (1a): MasterMessage (53 bytes)
  - masterType: 0 (BLOCK)
  - cloudConnectionState: 0 (DISABLED)
  - devices[0]: MLDevice with MLBlock, ChargeState, etc.

## Implementation Files

### C++ Implementation
- `includes/meater_udp_broadcast.h`

### Validation Tools
- `tools/test_protocol.py` - Test protocol generation
- `tools/validate_protocol.py` - Validate packet structure
- `/tmp/test_corrected_protocol.py` - Test corrected implementation

### Documentation
- `tools/PROTOCOL_ANALYSIS_NOTES.md` - Protocol analysis
- `meater_app/v3protobuf/*.java` - Decompiled Java protobuf classes

## Verification Checklist

- [x] meaterLinkIdentifier = 21578 (constant)
- [x] versionMajor = 2, versionMinor = 1
- [x] deviceID is FIXED64 (8 bytes)
- [x] Uses Field 3 (MasterMessage)
- [x] MasterMessage has masterType=0, cloudConnectionState=0
- [x] MLDevice is in MasterMessage.devices array
- [x] MLDevice includes MLBlock (Field 3)
- [x] MLBlock has ambientTemperature (SINT32, ZigZag)
- [x] ChargeState has 3 required fields
- [x] connectionState = 1 (CONNECTED)
- [x] connectionType = 0 (BLE)
- [x] bleSignalLevel uses SINT32 ZigZag encoding
- [x] No username/device_model/app_version strings
- [x] Packet validates against decompiled protocol structure

## Testing

### Unit Test
```bash
cd /tmp
python3 test_corrected_protocol.py
```

**Expected Output:**
```
✅ PROTOCOL VALIDATION PASSED
```

### Hardware Test
1. Flash corrected code to ESP32-C3
2. Monitor UDP broadcasts with tcpdump:
   ```bash
   tcpdump -i wlan0 -n udp port 7878 -X
   ```
3. Test with MEATER app device discovery

## References

### Java Protobuf Classes
- `meater_app/v3protobuf/MeaterLinkMessage.java`
- `meater_app/v3protobuf/MeaterLinkHeader.java`
- `meater_app/v3protobuf/MasterMessage.java`
- `meater_app/v3protobuf/MLDevice.java`
- `meater_app/v3protobuf/MLBlock.java`
- `meater_app/v3protobuf/ChargeState.java`
- `meater_app/v3protobuf/ConnectionState.java`
- `meater_app/v3protobuf/DeviceConnectionType.java`
- `meater_app/v3protobuf/MasterType.java`
- `meater_app/v3protobuf/CloudConnectionState.java`
- `meater_app/v3protobuf/ChargingStatus.java`

### Git History
- Commit: "Fix MEATER Link protocol structure to match decompiled app"
- Branch: `copilot/fix-udp-broadcast-implementation`
- Date: 2024-11-17

## Next Steps

1. ✅ Protocol structure corrected
2. ✅ Python test validates structure
3. ✅ Documentation updated
4. 🔄 Hardware testing required
5. 🔄 MEATER app discovery testing
6. 🔄 Verify temperature data transmission

---

**Status:** Implementation complete, ready for hardware testing
**Last Updated:** 2024-11-17
