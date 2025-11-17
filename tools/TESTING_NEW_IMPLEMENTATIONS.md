# Testing New Protocol Implementations

This guide enables agents to independently test new implementations of `meater_udp_broadcast.h` without asking questions.

## Quick Start

1. **Build and flash** your ESP32 implementation
2. **Capture** a packet hex string from serial logs
3. **Validate** with: `python tools/validate_protocol.py <packet_hex>`
4. **Fix** any errors and repeat

## Complete Testing Workflow

### Step 1: Extract Packet from ESP32 Logs

Your ESP32 code should log broadcast packets in hex format. Look for output like:

```
[meater_udp] Broadcast 84 bytes to 255.255.255.255:7878 - Sequence: 1
[meater_udp] TX: 0a 13 08 ca a8 01 10 11 18 07 20 01 29 66 55 44 ...
```

**Extract the hex:**
```bash
# If logs are space-separated hex bytes:
0a1308caa80110111807200129665544332211d0d0...

# Remove spaces, newlines, and any prefixes
```

### Step 2: Run the Validator

```bash
python tools/validate_protocol.py <packet_hex>
```

**Expected output patterns:**

**✅ SUCCESS:**
```
✅ SUCCESS: Packet decoded successfully!

Decoded message structure:
{
  "header": {
    "meaterLinkIdentifier": 21578,
    "versionMajor": 17,
    ...
  }
}
```

**❌ FAILURE:**
```
❌ FAILURE: Decoding failed
Error: Internal.missingRequiredFields: versionMinor, messageNumber, deviceID
```

### Step 3: Interpret Validation Results

#### Common Error Patterns

| Error | Cause | Fix |
|-------|-------|-----|
| `Internal.missingRequiredFields: versionMinor, ...` | Missing required header fields | Add all MeaterLinkHeader fields (see Field Reference below) |
| `Not enough data for length-delimited (need N)` | Incorrect field numbering or wrong wire type | Check field numbers match Java classes |
| `Unknown field - skipping` | Extra field not in protocol | May be OK if optional, but verify field numbers |
| Field value mismatch (e.g., got 250000, expected 21578) | Wrong value in field | Use correct constant values (see Field Reference) |

### Step 4: Fix Implementation

Common fixes needed:

**Problem:** Header uses timestamp instead of meaterLinkIdentifier
```cpp
// ❌ WRONG
encode_varint_field(header, 1, millis());

// ✅ CORRECT (from Java: DEFAULT_MEATERLINKIDENTIFIER = 21578)
encode_varint_field(header, 1, 21578);
```

**Problem:** Missing required deviceID
```cpp
// ❌ WRONG - only 4 fields
encode_varint_field(header, 1, 21578);
encode_varint_field(header, 2, 17);
encode_varint_field(header, 3, 7);
encode_varint_field(header, 4, sequence_num);

// ✅ CORRECT - all 5 required fields
encode_varint_field(header, 1, 21578);
encode_varint_field(header, 2, 17);
encode_varint_field(header, 3, 7);
encode_varint_field(header, 4, sequence_num);
encode_fixed64(header, 5, device_id);  // REQUIRED
```

**Problem:** Wrong wire type for deviceID
```cpp
// ❌ WRONG - using varint (wire type 0)
encode_varint_field(header, 5, device_id);

// ✅ CORRECT - must use fixed64 (wire type 1)
encode_fixed64(header, 5, device_id);
```

### Step 5: Iterate Until Success

Keep testing and fixing until you get:
```
✅ SUCCESS: Packet decoded successfully!
```

Then verify all field values match expectations (see Field Reference).

## Field Reference Table

These are the REQUIRED field values based on decompiled Java code.

### MeaterLinkHeader (Field 1 of MeaterLinkMessage)

| Field | Number | Type | Expected Value | Source |
|-------|--------|------|----------------|--------|
| meaterLinkIdentifier | 1 | UINT32 | **21578** (0x544A) | `MeaterLinkHeader.java` DEFAULT_MEATERLINKIDENTIFIER |
| versionMajor | 2 | UINT32 | **17** | Network captures, `MeaterLinkHeader.java` |
| versionMinor | 3 | UINT32 | **7** | Network captures, `MeaterLinkHeader.java` |
| messageNumber | 4 | UINT32 | Sequence counter (starts at 1) | `MeaterLinkHeader.java` |
| deviceID | 5 | FIXED64 | Unique 8-byte ID (from MAC) | `MeaterLinkHeader.java` (REQUIRED) |

**All 5 fields are REQUIRED** (see `Builder.m282build()` validation)

### Example Code Snippet

```cpp
// Field 1: MeaterLinkHeader
std::vector<uint8_t> header;
encode_varint_field(header, 1, 21578);      // meaterLinkIdentifier (REQUIRED)
encode_varint_field(header, 2, 17);         // versionMajor (REQUIRED)
encode_varint_field(header, 3, 7);          // versionMinor (REQUIRED)
encode_varint_field(header, 4, seq_num);    // messageNumber (REQUIRED)
encode_fixed64(header, 5, device_id);       // deviceID (REQUIRED, FIXED64!)
encode_length_delimited(packet, 1, header.data(), header.size());
```

### Other Message Fields

For complete protocol structure, see:
- `meater_app/v3protobuf/MeaterLinkMessage.java` - Top-level message
- `meater_app/v3protobuf/SubscriptionMessage.java` - Field 2 structure
- `meater_app/v3protobuf/MasterMessage.java` - Field 3 structure (for MEATER Block)
- `meater_app/v3protobuf/MLDevice.java` - Device info structure

## Troubleshooting Decision Tree

```
Validation fails?
│
├─ Error: "missingRequiredFields"?
│  └─ Add the missing fields to your packet
│     (Check Field Reference Table above)
│
├─ Error: "Not enough data for length-delimited"?
│  └─ Check field numbering and wire types
│     - Field 5 (deviceID) MUST be FIXED64 (wire type 1)
│     - Nested messages MUST be length-delimited (wire type 2)
│
├─ Error: Field value mismatch?
│  └─ Use correct constant values
│     - meaterLinkIdentifier = 21578 (not timestamp!)
│     - versionMajor = 17 (not sequence!)
│     - versionMinor = 7
│
├─ Success but device not discovered in app?
│  └─ Field values may be wrong even if structure is valid
│     Compare decoded values to Field Reference Table
│
└─ Validator crashes or can't parse Java?
   └─ Report issue - validator should handle all Java patterns
```

## Integration Test Checklist

Before considering your implementation complete:

- [ ] **Validator passes**: `python tools/validate_protocol.py <packet>` shows SUCCESS
- [ ] **Field values correct**: All fields match Field Reference Table values
- [ ] **Required fields present**: All MeaterLinkHeader fields (1-5) are included
- [ ] **Wire types correct**: deviceID uses FIXED64 (not UINT32/varint)
- [ ] **Sequence increments**: messageNumber increases on each broadcast
- [ ] **Packet size reasonable**: Typical range 21-150 bytes depending on content
- [ ] **No unknown fields**: Validator doesn't report unexpected field numbers
- [ ] **Repeated broadcasts work**: Multiple packets validate successfully

## Advanced: Testing Specific Message Types

### Test Just the Header

```bash
# Generate header-only packet (21 bytes)
python tools/validate_protocol.py <header_hex> MeaterLinkHeader
```

### Test Nested Messages

```bash
# Test SubscriptionMessage structure
python tools/validate_protocol.py <subscription_hex> SubscriptionMessage

# Test MasterMessage structure (for MEATER Block)
python tools/validate_protocol.py <master_hex> MasterMessage
```

## Getting Help

If validation consistently fails after following this guide:

1. **Capture and share**:
   - Full packet hex string
   - Complete validator output
   - Relevant C++ code snippet

2. **Check these files** for protocol details:
   - `meater_app/v3protobuf/*.java` - Ground truth for all message structures
   - `tools/VALIDATOR_USAGE.md` - Validator usage details
   - `docs/udp_capture.log` - Example of real MEATER app packets

3. **Common misunderstandings**:
   - Field numbering starts at 1 (not 0)
   - Wire types matter: FIXED64 ≠ UINT32 ≠ UINT64
   - Required vs optional: Check Builder.build() validation in Java
   - String encoding: UTF-8 for all string fields

## Example: Complete Test Session

```bash
# 1. Flash ESP32 with new implementation
$ pio run --target upload

# 2. Monitor serial output
$ pio device monitor
...
[meater_udp] TX: 0a 13 08 ca a8 01 10 11 18 07 20 01 29 66 55 44 33 22 11 d0 d0
...

# 3. Extract hex (remove spaces)
$ PACKET="0a1308caa80110111807200129665544332211d0d0"

# 4. Validate
$ python tools/validate_protocol.py $PACKET

# 5. If failed, check error and fix code
❌ FAILURE: Decoding failed
Error: Internal.missingRequiredFields: deviceID

# Fix: Added encode_fixed64(header, 5, device_id);

# 6. Re-flash and test again
$ pio run --target upload
$ pio device monitor
...

# 7. Validate again
$ python tools/validate_protocol.py <new_packet>
✅ SUCCESS: Packet decoded successfully!

# 8. Verify field values match expectations
Decoded message structure:
{
  "header": {
    "meaterLinkIdentifier": 21578,  ✓ Correct
    "versionMajor": 17,              ✓ Correct
    "versionMinor": 7,               ✓ Correct
    "messageNumber": 1,              ✓ Correct
    "deviceID": 15046545193631503718 ✓ Present
  }
}

# ✅ Done! Implementation is valid.
```

## Summary

**Key Points:**
1. Always use `validate_protocol.py` with actual captured packets
2. Check Field Reference Table for expected values
3. Fix errors using the decision tree
4. Verify all checklist items before completion
5. The Java code in `meater_app/v3protobuf/` is the ultimate ground truth

This workflow should enable you to test implementations independently without asking questions.
