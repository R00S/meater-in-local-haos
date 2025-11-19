# MEATER BLE Protocol Documentation

> ⚠️ **CONTAINS ASSUMPTIONS**: This document contains reverse-engineered MEATER BLE protocol information from [nathanfaber/meaterble](https://github.com/nathanfaber/meaterble). It includes assumptions and interpretations about protocol behavior. For verified UUID constants extracted directly from decompiled app code, see `tools/extracted_operations.json` which contains all 29 UUID constants from Config.java.

## Important Notes

- **Single Connection Limit**: Each MEATER device only allows a single BLE connection at a time
- Your app, Block, or MEATER+ must be OFF for the probe to be seen
- The ESP32 proxy connects to the MEATER Block (not the probe directly)
- The Block communicates with the probe via a proprietary connection

## BLE Services and Characteristics

### MEATER Service (a75cc7fc-c956-488f-ac2a-2dbc08b63a04)

#### Temperature Characteristic (7edda774-045e-4bbf-909b-45d1991a2876)
- **Handle**: 31 (0x1F)
- **Properties**: READ, NOTIFY
- **Length**: 8 bytes
- **Format**:

| Byte 1  | Byte 2 | Byte 3  | Byte 4 | Byte 5  | Byte 6 | Byte 7 | Byte 8 |
|---------|--------|---------|--------|---------|--------|--------|--------|
| Tip accum | Tip count | Ambient ra accum | Ambient ra count | Ambient oa accum | Ambient oa count | Unknown | Unknown |

**Raw value calculation**: `accum + count * 256`
- The accumulator reaches 255 and rolls over to the count

**Temperature conversion**:
- Celsius: `(raw_value + 8.0) / 16.0`
- Fahrenheit: `((celsius * 9) / 5) + 32.0`

**Ambient temperature calculation**:
```python
tip = byte1*256 + byte0
ra  = byte3*256 + byte2
oa  = byte5*256 + byte4
ambient = tip + max(0, ((((ra - min(48, oa)) * 16) * 589)) / 1487)
```

#### Battery Characteristic (2adb4877-68d8-4884-bd3c-d83853bf27b8)
- **Handle**: 35 (0x23)
- **Properties**: READ, NOTIFY
- **Length**: 2 bytes
- **Format**: `(byte1*256 + byte0) * 10` = battery percentage

#### Config Characteristic (575d3bf1-2757-45ad-94d9-875c2f6120d3)
- **Handle**: 26 (0x1A)
- **Properties**: READ, WRITE
- **Purpose**: Used by Android app during pairing/configuration

### Device Information Service (180A)

#### Manufacturer Name (0x2A29)
- **Handle**: 18
- **Value**: `"Apption Labs"`

#### Model Number (0x2A24)
- **Handle**: 20
- **Value**: `"MEATER"`

#### Firmware Revision (0x2A26)
- **Handle**: 22
- **Format**: `v{version}_{probe_number}`
- **Examples**:
  - Singleton probe: `v1.0.4_0`
  - Block probe #1: `v1.0.5_1`
  - Block probe #2: `v1.0.5_2`
  - Block probe #3: `v1.0.5_3`
  - Block probe #4: `v1.0.5_4`

**Note**: The suffix after `_` identifies the probe number (0 for singleton, 1-4 for block probes corresponding to etch numbers)

#### Software Revision (0x2A28)
- **Handle**: 24
- **Format**: `{version}_{probe_number}` (same as firmware but without 'v' prefix)

### Generic Access Service (1800)

#### Device Name (0x2A00)
- **Handle**: 3
- **Value**: `"MEATER"` or `"MEATER+"` depending on device type

## Advertising Data

### Manufacturer Data
- **Company ID**: 0x037B (Apption Labs)
- **Format**: 24 bytes total
  - Bytes 0-1: Company ID (0x7B03 in little-endian)
  - Bytes 2-23: Device-specific data

### Complete Service UUIDs
- MEATER Service: `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`

## History Ring Buffer

The probe maintains a history ring buffer accessible via handle 43 (512 bytes = 256 value pairs):

- **Index 1-2**: Uptime in seconds
- **Index 3**: Unknown
- **Index 4**: Current pointer into ring buffer (indexes 7-246)
- **Index 7-246**: Ring buffer of 120 temperature/ambient pairs (same format as handle 31)
- **Index 247-256**: Unknown

The ring buffer is populated each time a read is requested, so frequency is determined by the client.

## Implementation Notes for ESP32 Proxy

1. **Read characteristics from real MEATER** (BLE Client):
   - Temperature (handle 31): 8 bytes, enable notifications
   - Battery (handle 35): 2 bytes, enable notifications
   - Firmware (handle 22): String, read once
   - Config (handle 26): Variable bytes, read once

2. **Advertise as MEATER** (BLE Server):
   - Device name from real MEATER (e.g., "MEATER+")
   - Manufacturer data with company ID 0x037B
   - MEATER service UUID in advertising packet

3. **Forward data to Android app**:
   - Expose same characteristics with same UUIDs
   - Forward raw data from real MEATER without modification
   - Support WRITE operations on config characteristic
   - Maintain characteristic properties (READ/WRITE/NOTIFY)

4. **Critical for Android app pairing**:
   - Firmware version must match expected format (`v{version}_{probe}`)
   - Config characteristic must be readable/writable
   - All characteristics must use correct UUIDs
   - Manufacturer data in advertising must be present

## References

- Original reverse engineering: https://github.com/nathanfaber/meaterble
- MEATER official website: https://meater.com
