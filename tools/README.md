# MEATER Link Protocol Validation Tools

This directory contains tools for validating the MEATER Link UDP protocol implementation.

## validate_protocol.py

Python script that decodes and validates MEATER Link protobuf packets using the same wire format decoder logic as the official MEATER app (based on decompiled v3protobuf structures).

### Usage

```bash
python tools/validate_protocol.py <hex_packet>
```

### Example

Test with a sample packet from ESP32 logs:

```bash
# Example from ESP32 TX logs
python tools/validate_protocol.py "0a1308c9f903100118072003291...6e"
```

### Output

The script will:
1. Decode the packet using protobuf wire format
2. Display all fields in human-readable format
3. Validate against MEATER app requirements
4. Report any errors or warnings

### Validation Checks

**Critical Errors (packet rejected):**
- Missing MeaterLinkHeader (field 1)
- Missing MasterMessage (field 3) - causes discovery failure
- Missing required fields in nested messages

**Warnings (may work but suspicious):**
- Unexpected protocol version
- Wrong master type (not MASTER_TYPE_BLOCK)
- Missing optional fields

### Example Output

```
=== Decoding 150 byte packet ===

=== Decoded Message ===
header:
  timestamp_ms: 250000
  sequence: 1
  version: 7
  unknown1: 3
  unknown2: 0x47d87193396eac16
masterMessage:
  masterType: 0
  masterTypeName: MASTER_TYPE_BLOCK
  cloudConnectionState: 0
  cloudConnectionStateName: CLOUD_CONNECTION_STATE_DISABLED
  devices: [
    [0]:
      probe:
        parentIdentifier: 0x4f292c3b3e4
        setup:
          sequenceNumber: 0
          state: 0
          targetInternalTemperature: -1024
          lastItem: 96
        status:
          internalTemperature: 300
          ambientTemperature: 250
          ...
      identifier: 0x4f292c3b3e4
      probeNumber: 0
      chargeState:
        chargingStatus: 0
        batteryLevelPercent: 85
        batteryMinutesRemaining: 0
      firmwareRevision: v1.0.6_0
      connectionState: 1
      connectionType: 0
      bleSignalLevel: -50
  ]

=== Validation ===

✅ No critical errors found

🎉 Perfect! Packet should be recognized by MEATER app
```

## Testing Your Implementation

1. Flash the firmware to ESP32-C3
2. Monitor the serial logs to capture TX packet hex dumps
3. Copy a full packet hex string from the logs
4. Run this validator to check if the packet structure is correct
5. Fix any errors reported before testing with the actual MEATER app

## Technical Details

The validator implements the same protobuf wire format decoding as the MEATER app's `ProtoAdapter_*` classes:

- **Wire Type 0 (varint)**: Variable-length integers for small numbers
- **Wire Type 1 (fixed64)**: 64-bit little-endian for device IDs, timestamps
- **Wire Type 2 (length-delimited)**: Strings, bytes, and nested messages
- **ZigZag encoding**: Used for signed integers (sint32)

Based on decompiled code from:
- `meater_app/v3protobuf/MeaterLinkMessage.java`
- `meater_app/v3protobuf/MasterMessage.java`
- `meater_app/v3protobuf/MLDevice.java`
- `meater_app/v3protobuf/MLProbe.java`
- And other supporting message types
