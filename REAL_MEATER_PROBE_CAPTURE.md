# Real MEATER Probe BLE Advertising Capture

This document contains actual BLE advertising data captured from real MEATER probes using `bluetoothctl` on Linux.

**Capture Date:** 2025-11-21  
**Capture Method:** `bluetoothctl scan on` + `bluetoothctl info <MAC>`

## Purpose

This capture serves as the ground truth for the MEATER BLE protocol implementation. It shows exactly what a real MEATER probe advertises when NOT connected to the app.

**Important:** MEATER probes stop advertising when connected to the app. The data below is only visible when the probe is disconnected.

---

## MEATER Device (Regular)

### Device Information
```
Device B8:1F:5E:4A:5E:EF (public)
        Name: MEATER
        Alias: MEATER
        Paired: no
        Bonded: no
        Trusted: no
        Blocked: no
        Connected: no
        LegacyPairing: no
        CablePairing: no
```

### UUIDs Advertised
```
        UUID: Device Information        (0000180a-0000-1000-8000-00805f9b34fb)
        UUID: Vendor specific           (a75cc7fc-c956-488f-ac2a-2dbc08b63a04)
```

### Manufacturer Data
```
        ManufacturerData.Key: 0x7b03 (31491)
        ManufacturerData.Value:
  00 00                                            ..              

        ManufacturerData.Key: 0x037b (891)
        ManufacturerData.Value:
  00 4c 0b 82 35 23 a3 98 ea                       .L..5#...       
```

**Analysis:**
- Company ID: `0x037b` (891 decimal) = Apption Labs
- Data Length: 9 bytes
- Byte 0: `0x00` = Probe type (0x00 = regular MEATER, 0x80 = MEATER+)
- Bytes 1-8: `4c 0b 82 35 23 a3 98 ea` = Device ID

### Other Advertising Fields
```
        RSSI: 0xffffffc2 (-62)
        AdvertisingFlags:
  06                                               .               
```

**Advertising Flags Analysis:**
- `0x06` = `0000 0110` binary
- Bit 1: General Discoverable Mode
- Bit 2: BR/EDR Not Supported
- Combined: `ESP_BLE_ADV_FLAG_GEN_DISC | ESP_BLE_ADV_FLAG_BREDR_NOT_SPT`

---

## MEATER+ Device

### Device Information from Scan
```
[NEW] Device B8:1F:5E:44:EC:8D MEATER+
```

### UUIDs
Same as regular MEATER:
- Device Information Service (0000180a-0000-1000-8000-00805f9b34fb)
- MEATER Service (a75cc7fc-c956-488f-ac2a-2dbc08b63a04)

### Manufacturer Data
Same format as regular MEATER, but first byte would be `0x80` instead of `0x00` to indicate MEATER+ type.

---

## Additional Devices Found During Scan

### Device: E4:B3:23:C2:92:F6 MEATER
Another MEATER device found during earlier scan. Same advertising format.

---

## Key Findings

### What IS in the Advertising Packet ✅
1. **Device Name:** "MEATER" or "MEATER+"
2. **Service UUIDs:** 
   - Device Information (180a)
   - MEATER Service (a75cc7fc-c956-488f-ac2a-2dbc08b63a04)
3. **Manufacturer Data:**
   - Company ID: 0x037b (Apption Labs)
   - 9 bytes: probe type + 8-byte device ID
4. **Advertising Flags:** 0x06
5. **RSSI:** Signal strength

### What IS NOT in the Advertising Packet ❌
1. **NO Temperature data**
2. **NO Battery level**
3. **NO Service Data**
4. **NO other metadata**

### How the App Gets Temperature

Temperature and battery are NOT in advertising. The app must:
1. Scan and find device by manufacturer data + UUIDs
2. Connect to device via BLE
3. Read temperature characteristic via GATT
4. Read battery characteristic via GATT
5. Display data to user

**This means:** Real MEATER probes do NOT show temperature in the scan list BEFORE connection. The device appears in the list (not greyed), user taps to connect, THEN temperature appears after GATT read.

---

## Protocol Comparison

### Advertising Packet Structure

| Component | Real MEATER | ESP32 Implementation | Status |
|-----------|-------------|----------------------|--------|
| Device Name | "MEATER" | "MEATER" | ✅ Match |
| Company ID | 0x037b | 0x037b | ✅ Match |
| Manufacturer Data | 9 bytes | 9 bytes | ✅ Match |
| Probe Type Byte | 0x00 | 0x00 | ✅ Match |
| Device ID | 8 bytes | 8 bytes | ✅ Match |
| Service UUIDs | 180a + a75cc7fc | 180a + a75cc7fc | ✅ Match |
| Advertising Flags | 0x06 | 0x06 | ✅ Match |
| Service Data | None | None | ✅ Match |
| Temperature in Ad | None | None | ✅ Match |

**Conclusion:** ESP32 implementation advertising format matches real MEATER probe exactly.

---

## Raw Bluetoothctl Output

### Complete Scan Session
```
hci0 type 7 discovering on
[CHG] Device 7E:0C:46:CD:29:F0 RSSI: 0xffffffc4 (-60)
[CHG] Device 7E:0C:46:CD:29:F0 RSSI: 0xffffffd4 (-44)
[CHG] Device 20:28:BC:D4:B0:53 LegacyPairing: yes
[CHG] Device 7E:0C:46:CD:29:F0 LegacyPairing: yes
[NEW] Device B8:1F:5E:4A:5E:EF MEATER
[CHG] Device B8:1F:5E:4A:5E:EF ManufacturerData.Key: 0x7b03 (31491)
[CHG] Device B8:1F:5E:4A:5E:EF ManufacturerData.Value:
  00 00                                            ..              
[CHG] Device B8:1F:5E:4A:5E:EF ManufacturerData.Key: 0x037b (891)
[CHG] Device B8:1F:5E:4A:5E:EF ManufacturerData.Value:
  00 4c 0b 82 35 23 a3 98 ea                       .L..5#...       
hci0 type 7 discovering off
```

### Complete Device Info Output
```
[ThinkPad Compact Bluetooth Keyboard with TrackPoint]> info B8:1F:5E:4A:5E:EF
Device B8:1F:5E:4A:5E:EF (public)
        Name: MEATER
        Alias: MEATER
        Paired: no
        Bonded: no
        Trusted: no
        Blocked: no
        Connected: no
        LegacyPairing: no
        CablePairing: no
        UUID: Device Information        (0000180a-0000-1000-8000-00805f9b34fb)
        UUID: Vendor specific           (a75cc7fc-c956-488f-ac2a-2dbc08b63a04)
        ManufacturerData.Key: 0x7b03 (31491)
        ManufacturerData.Value:
  00 00                                            ..              
        ManufacturerData.Key: 0x037b (891)
        ManufacturerData.Value:
  00 4c 0b 82 35 23 a3 98 ea                       .L..5#...       
        RSSI: 0xffffffc2 (-62)
        AdvertisingFlags:
  06                                               .               
hci0 type 7 discovering off
```

---

## Implementation Notes

### ESP32 BLE Server Configuration

Based on this capture, the ESP32 implementation should:

1. **Manufacturer Data (11 bytes total):**
   ```cpp
   static uint8_t manufacturer_data[11] = {
       0x7B, 0x03,  // Company ID: 0x037B (Apption Labs) - little-endian
       0x00,        // Probe type: 0x00 = MEATER, 0x80 = MEATER+
       // 8 bytes: Device ID (unique per device)
       0xXX, 0xXX, 0xXX, 0xXX, 0xXX, 0xXX, 0xXX, 0xXX
   };
   ```

2. **Advertising Flags:**
   ```cpp
   ESP_BLE_ADV_FLAG_GEN_DISC | ESP_BLE_ADV_FLAG_BREDR_NOT_SPT  // = 0x06
   ```

3. **Service UUIDs (in scan response):**
   - Device Information Service: 0x180A
   - MEATER Service: a75cc7fc-c956-488f-ac2a-2dbc08b63a04

4. **NO Service Data**
5. **NO Temperature in advertising**

### Temperature/Battery Data

Must be read via GATT characteristics AFTER connection:
- Temperature Characteristic: 7edda774-045e-4bbf-909b-45d1991a2876 (8 bytes)
- Battery Characteristic: 2adb4877-68d8-4884-bd3c-d83853bf27b8 (2 bytes)

---

## Verification Checklist

When implementing or debugging MEATER BLE emulation:

- [ ] Company ID is 0x037b (little-endian: 7B 03)
- [ ] Manufacturer data is exactly 9 bytes (after company ID)
- [ ] First byte is 0x00 for MEATER or 0x80 for MEATER+
- [ ] Device name is "MEATER" or "MEATER+"
- [ ] Both UUIDs (180a and a75cc7fc) are advertised
- [ ] Advertising flags are 0x06
- [ ] NO Service Data in advertising
- [ ] NO Temperature in advertising
- [ ] GATT services properly configured for post-connection reads

---

**End of Capture Document**
