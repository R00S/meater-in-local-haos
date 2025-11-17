# Protocol Validator Usage Guide

## Overview

`tools/validate_protocol.py` is a generic Java ProtoAdapter code interpreter that validates protobuf packets against the decompiled MEATER app code.

**🚀 New to testing implementations?** See **[TESTING_NEW_IMPLEMENTATIONS.md](TESTING_NEW_IMPLEMENTATIONS.md)** for a complete step-by-step guide.

**Key Features:**
- Makes NO assumptions about the protocol
- Interprets Java code dynamically
- Works for any protocol version
- Shows exactly where packets fail

## Basic Usage

```bash
# Validate a packet (default: MeaterLinkMessage)
python tools/validate_protocol.py <hex_packet>

# Validate as a specific message type
python tools/validate_protocol.py <hex_packet> <ClassName>
```

## Examples

### Example 1: Valid MeaterLinkHeader

```bash
$ python tools/validate_protocol.py 0a1308caa80110111807200129665544332211d0d0

✅ SUCCESS: Packet decoded successfully!

Decoded message structure:
{
  "header": {
    "meaterLinkIdentifier": 21578,
    "versionMajor": 17,
    "versionMinor": 7,
    "messageNumber": 1,
    "deviceID": 15046545193631503718
  }
}
```

### Example 2: Missing Required Field

```bash
$ python tools/validate_protocol.py 0a0508caa8011001

❌ FAILURE: Decoding failed
Error: Internal.missingRequiredFields: versionMinor, messageNumber, deviceID

[Step 2] Decoding MeaterLinkHeader...
  Java: return builder.build();
  ❌ VALIDATION FAILED: Internal.missingRequiredFields: versionMinor, messageNumber, deviceID
```

### Example 3: Wrong Field Type

```bash
$ python tools/validate_protocol.py 0a1308...  # Packet with wrong wire type

❌ FAILURE: Decoding failed
Error: Not enough data for length-delimited (need 67)
```

## How It Works

1. **Parses Java code**: Reads `meater_app/v3protobuf/<ClassName>.java`
2. **Extracts decode logic**: Uses regex to find field numbers, types, and adapters
3. **Simulates execution**: Steps through the Java decode() method
4. **Validates fields**: Checks Builder.build() for required fields
5. **Follows nested messages**: Recursively decodes nested types

## Testing Your ESP32 Implementation

### Step 1: Generate a Test Packet

From ESP32 logs, copy the hex dump of a UDP broadcast packet.

### Step 2: Validate It

```bash
python tools/validate_protocol.py <your_packet_hex>
```

### Step 3: Fix Issues

The validator will show exactly:
- Which field failed
- What the Java code expected
- Where in the decode process it failed

### Step 4: Iterate

Keep testing until the validator shows success.

## Understanding the Output

### Success

```
[Step N] Decoding ClassName...
  Java: Builder builder = new Builder();
  Java: while (true) { int nextTag = protoReader.nextTag(); ... }
    → Field N (wire type X)
      Java: case N: builder.fieldName(...)
    Value: <decoded_value>
      ✅ Success
  Java: return builder.build();
  ✅ All required fields present

✅ SUCCESS: Packet decoded successfully!
```

### Failure

```
[Step N] Decoding ClassName...
    → Field N (wire type X)
      Java: case N: builder.fieldName(...)
      ❌ ERROR: Not enough data for length-delimited (need 19)

❌ FAILURE: Decoding failed
Error: Not enough data for length-delimited (need 19)
```

## Supported Java Patterns

The validator handles multiple Java code patterns:

1. **Switch/case** (MeaterLinkMessage):
   ```java
   switch (nextTag) {
       case 1:
           builder.field1(...);
           break;
       case 2:
           builder.field2(...);
           break;
   }
   ```

2. **If/else chains** (MeaterLinkHeader):
   ```java
   if (nextTag == 1) {
       builder.field1(...);
   } else if (nextTag == 2) {
       builder.field2(...);
   }
   ```

3. **Final else clause** (deviceID field):
   ```java
   } else if (nextTag != 5) {
       builder.addUnknownField(...);
   } else {
       builder.field5(...);  // Field 5
   }
   ```

## Limitations

1. **Regex-based parsing**: Complex Java patterns may not be recognized
2. **No semantic analysis**: Only interprets syntax, not business logic
3. **Field types**: Only recognizes common types (uint32, fixed64, sint32, string, message)

## Extending the Validator

To add support for more field types, edit `parse_field_decode()` in `validate_protocol.py`:

```python
elif 'ProtoAdapter.BYTES.decode' in case_body:
    field_info['field_type'] = 'bytes'
```

Then add decoding logic in `decode_field()`:

```python
elif field_info['field_type'] == 'bytes':
    data = reader.read_length_delimited()
    print(f"{prefix}Value: {data.hex()}")
    return data
```

## Troubleshooting

### "Cannot find <ClassName>.java"

The class doesn't exist in `meater_app/v3protobuf/`. Check spelling and ensure the file exists.

### "No decode logic found"

The regex couldn't parse the Java decode() method. The Java file may use an unsupported pattern.

### "Unknown field - skipping"

The field number wasn't found in the Java decode logic. This could be:
- An extra field not in the protocol
- A parsing issue (regex didn't catch it)
- The field uses an unrecognized pattern

## Advanced Usage

### Testing Nested Messages

```bash
# Test just the header
python tools/validate_protocol.py <header_hex> MeaterLinkHeader

# Test a device message
python tools/validate_protocol.py <device_hex> MLDevice
```

### Debugging Parse Issues

Add debug output to see what the regex found:

```python
# In parse_decode_method(), after finding matches:
print(f"Found {len(cases)} case statements")
print(f"Found {len(if_matches)} if statements")
```

## Conclusion

This validator is a true step-by-step interpreter that treats the Java code as ground truth. It makes no assumptions about the protocol and adapts automatically to any changes in the Java decoder logic.

Use it to:
- ✅ Verify ESP32 packets match app expectations
- ✅ Debug protocol implementation issues
- ✅ Understand exactly what the app does during decoding
- ✅ Test protocol changes before deploying to hardware
