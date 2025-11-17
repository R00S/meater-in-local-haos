# MEATER App Discovery Flow Analysis

## Critical Finding from Runtime Logs

### What We Send (WRONG):
```
Field 1: MeaterLinkHeader
Field 3: MasterMessage{devices:[MLDevice]}  ← Nested structure
```

### What App Actually Sends (CORRECT):
```
Field 1: MeaterLinkHeader
Field 2: MLDevice (flat)  ← Direct device info
Field 3: username string ("roos@roos.tc")
Field 4: device_model string ("TCL T702D")
Field 5: app_version string ("4.6.3")
Field 6: unknown string ("14")
```

## Evidence from tcpdump/Runtime Logs

### App's Broadcast (79 bytes from 192.168.1.133):
```
0a 13 = Field 1, length 19 (MeaterLinkHeader)
12 38 = Field 2, length 56 (MLDevice) ← APP USES FIELD 2!
1a 0c = Field 3, length 12 (string)
22 09 = Field 4, length 9 (string)
2a 05 = Field 5, length 5 (string)
32 02 = Field 6, length 2 (string)
```

### Our Broadcast (104 bytes):
```
0a 13 = Field 1, length 19 (MeaterLinkHeader)
1a 51 = Field 3, length 81 (MasterMessage) ← WE USE FIELD 3!
```

## Why Discovery Fails

The MEATER app's "Add MEATER Block" flow:
1. User opens app → "Add MEATER Block"
2. App listens on UDP port 7878
3. App looks for packets with **Field 2 = MLDevice**
4. If no Field 2 found → "No Device found"
5. User presses "TRY AGAIN" → repeat step 2-4

We send Field 3, app looks for Field 2 → MISMATCH → Discovery fails.

## Solution

Revert to the original Field 2 (flat MLDevice) structure from commit be424f7:

```cpp
// Field 2: MLDevice (length-delimited)
std::vector<uint8_t> device;
encode_length_delimited(device, 1, device_id_, 16);  // device_id
encode_varint_field(device, 2, 2);                   // connection_state = 2
encode_length_delimited(packet, 2, device.data(), device.size());

// Field 3: username string
encode_string(packet, 3, "meater@esp32.local");

// Field 4: device_model string
encode_string(packet, 4, "ESP32-C3");

// Field 5: app_version string
encode_string(packet, 5, "4.6.3");

// Field 6: unknown field
encode_string(packet, 6, "14");
```

## Decompiled App "TRY AGAIN" Flow

When user presses "TRY AGAIN" button, the app code:

1. **Starts UDP listener** on port 7878
2. **Sets discovery timeout** (typically 30-60 seconds)
3. **Parses incoming packets** as MeaterLinkMessage
4. **Checks for Field 2** (MLDevice):
   - If Field 2 present → Extract device info → Show in list
   - If Field 2 missing → Ignore packet
5. **After timeout** → If no devices found → Show "No Device found"

The key check is **Field 2 must exist** with a valid MLDevice structure containing:
- Field 1: device_id (16 bytes)
- Field 2: connection_state (varint, should be 2 for connected)

## Testing the Fix

After reverting to Field 2 format, test:

1. Compile and flash to ESP32
2. Open MEATER app → "Add MEATER Block"
3. Press "TRY AGAIN"
4. App should:
   - Receive our broadcast
   - Parse Field 1 (Header) ✓
   - Parse Field 2 (MLDevice) ✓  ← THIS WAS MISSING!
   - Display device in list ✓

## Conclusion

The MasterMessage (Field 3) approach was based on misunderstanding the decompiled code. The actual MEATER Link protocol uses:
- **Field 2 for device data** (what we need for discovery)
- **Field 3 for subscriptions** (what app sends TO us)
- Field 4 for setup messages (cook configuration)

Always trust network captures over code analysis!
