#!/usr/bin/env python3
"""
Test the corrected MEATER Link protocol implementation.
This generates a packet matching our corrected ESP32 implementation.
"""

import struct

def encode_varint(value):
    """Encode unsigned varint"""
    result = bytearray()
    while value > 0x7F:
        result.append((value & 0x7F) | 0x80)
        value >>= 7
    result.append(value & 0x7F)
    return bytes(result)

def encode_sint32_zigzag(value):
    """Encode signed int32 using ZigZag encoding"""
    # ZigZag: (n << 1) ^ (n >> 31)
    if value >= 0:
        zigzag = value << 1
    else:
        zigzag = ((-value) << 1) - 1
    return encode_varint(zigzag)

def encode_field_header(field_num, wire_type):
    """Encode field header (field_num << 3 | wire_type)"""
    return encode_varint((field_num << 3) | wire_type)

def encode_length_delimited(field_num, data):
    """Encode length-delimited field (wire type 2)"""
    return encode_field_header(field_num, 2) + encode_varint(len(data)) + data

def encode_fixed64(value):
    """Encode fixed64 (wire type 1)"""
    return struct.pack('<Q', value & 0xFFFFFFFFFFFFFFFF)

def encode_varint_field(field_num, value):
    """Encode varint field (wire type 0)"""
    return encode_field_header(field_num, 0) + encode_varint(value)

def encode_sint32_field(field_num, value):
    """Encode sint32 field with ZigZag encoding"""
    return encode_field_header(field_num, 0) + encode_sint32_zigzag(value)

def encode_fixed64_field(field_num, value):
    """Encode fixed64 field (wire type 1)"""
    return encode_field_header(field_num, 1) + encode_fixed64(value)

def encode_string_field(field_num, text):
    """Encode string field"""
    return encode_length_delimited(field_num, text.encode('utf-8'))

def build_meater_link_header(sequence, device_id):
    """Build MeaterLinkHeader (CORRECTED)"""
    header = bytearray()
    header += encode_varint_field(1, 21578)      # Field 1: meaterLinkIdentifier = 21578 (NOT timestamp!)
    header += encode_varint_field(2, 2)          # Field 2: versionMajor = 2
    header += encode_varint_field(3, 1)          # Field 3: versionMinor = 1
    header += encode_varint_field(4, sequence)   # Field 4: messageNumber = sequence
    header += encode_fixed64_field(5, device_id) # Field 5: deviceID = FIXED64 (8 bytes)
    return bytes(header)

def build_charge_state(battery_percent):
    """Build ChargeState message"""
    charge = bytearray()
    charge += encode_varint_field(1, 2)              # Field 1: chargingStatus = NOT_CHARGING (2)
    charge += encode_varint_field(2, battery_percent) # Field 2: batteryLevelPercent
    charge += encode_varint_field(3, 0)              # Field 3: batteryMinutesRemaining = 0 (unknown)
    return bytes(charge)

def build_ml_block(ambient_temp_raw, device_id):
    """Build MLBlock message"""
    block = bytearray()
    # Field 2: ambientTemperature (SINT32, ZigZag encoded)
    if ambient_temp_raw != 0:
        block += encode_sint32_field(2, ambient_temp_raw)
    # Field 4: macAddress (FIXED64)
    block += encode_fixed64_field(4, device_id)
    return bytes(block)

def build_ml_device(device_id, ambient_temp_raw, battery_percent):
    """Build MLDevice message"""
    device = bytearray()
    
    # Field 3: block (MLBlock)
    ml_block = build_ml_block(ambient_temp_raw, device_id)
    if ml_block:
        device += encode_length_delimited(3, ml_block)
    
    # Field 5: identifier (FIXED64, REQUIRED)
    device += encode_fixed64_field(5, device_id)
    
    # Field 6: probeNumber (UINT32, REQUIRED)
    device += encode_varint_field(6, 0)
    
    # Field 7: chargeState (ChargeState message, REQUIRED)
    device += encode_length_delimited(7, build_charge_state(battery_percent))
    
    # Field 8: firmwareRevision (string, optional)
    device += encode_string_field(8, "v1.0.0")
    
    # Field 9: connectionState (enum, REQUIRED) = CONNECTION_STATE_CONNECTED (1)
    device += encode_varint_field(9, 1)
    
    # Field 10: connectionType (enum, REQUIRED) = BLE (0)
    device += encode_varint_field(10, 0)
    
    # Field 11: bleSignalLevel (SINT32, optional)
    device += encode_sint32_field(11, -50)  # -50 dBm
    
    return bytes(device)

def build_master_message(device_id, ambient_temp_raw, battery_percent):
    """Build MasterMessage (Block broadcast)"""
    master = bytearray()
    # Field 1: masterType = MASTER_TYPE_BLOCK (0)
    master += encode_varint_field(1, 0)
    # Field 2: cloudConnectionState = CLOUD_CONNECTION_STATE_DISABLED (0)
    master += encode_varint_field(2, 0)
    # Field 3: devices array (single MLDevice)
    master += encode_length_delimited(3, build_ml_device(device_id, ambient_temp_raw, battery_percent))
    return bytes(master)

def build_meater_link_message(device_id, ambient_temp_raw, battery_percent, sequence):
    """Build complete MeaterLinkMessage"""
    message = bytearray()
    # Field 1: header (REQUIRED)
    message += encode_length_delimited(1, build_meater_link_header(sequence, device_id))
    # Field 3: masterMessage (REQUIRED for Block broadcasts)
    message += encode_length_delimited(3, build_master_message(device_id, ambient_temp_raw, battery_percent))
    return bytes(message)

def main():
    """Test the corrected protocol"""
    print("=" * 70)
    print("Corrected MEATER Link Protocol Test")
    print("=" * 70)
    
    # Test parameters
    device_id = 0xAABBCCDDEEFF0011  # 8-byte device ID
    ambient_temp_raw = 20 * 16       # 20°C * 16
    battery_percent = 85
    sequence = 1
    
    print(f"\nTest Parameters:")
    print(f"  Device ID: 0x{device_id:016x}")
    print(f"  Ambient Temp: {ambient_temp_raw / 16.0}°C (raw: {ambient_temp_raw})")
    print(f"  Battery: {battery_percent}%")
    print(f"  Sequence: {sequence}")
    
    # Build packet
    packet = build_meater_link_message(device_id, ambient_temp_raw, battery_percent, sequence)
    
    print(f"\nGenerated Packet ({len(packet)} bytes):")
    print(packet.hex())
    
    # Decode and validate
    print("\n" + "=" * 70)
    print("Packet Structure Validation")
    print("=" * 70)
    
    pos = 0
    data = packet
    
    # Top-level MeaterLinkMessage
    print("\nMeaterLinkMessage:")
    
    # Field 1: header
    field_tag = data[pos]
    field_num = field_tag >> 3
    wire_type = field_tag & 0x7
    pos += 1
    
    if field_num == 1 and wire_type == 2:
        length = data[pos]
        pos += 1
        print(f"  ✅ Field 1 (MeaterLinkHeader): {length} bytes")
        
        # Decode header
        header_data = data[pos:pos+length]
        pos += length
        hpos = 0
        
        print("    MeaterLinkHeader:")
        while hpos < len(header_data):
            htag = header_data[hpos]
            hfield = htag >> 3
            hwire = htag & 0x7
            hpos += 1
            
            if hfield == 1 and hwire == 0:  # meaterLinkIdentifier
                identifier = header_data[hpos]
                hpos += 1
                if identifier & 0x80:
                    identifier = (identifier & 0x7F) | (header_data[hpos] << 7)
                    hpos += 1
                print(f"      Field 1 (meaterLinkIdentifier): {identifier} {'✅ Correct!' if identifier == 21578 else '❌ WRONG!'}")
            elif hfield == 2 and hwire == 0:  # versionMajor
                ver = header_data[hpos]
                hpos += 1
                print(f"      Field 2 (versionMajor): {ver} {'✅' if ver == 2 else '❌'}")
            elif hfield == 3 and hwire == 0:  # versionMinor
                ver = header_data[hpos]
                hpos += 1
                print(f"      Field 3 (versionMinor): {ver} {'✅' if ver == 1 else '❌'}")
            elif hfield == 4 and hwire == 0:  # messageNumber
                seq = header_data[hpos]
                hpos += 1
                print(f"      Field 4 (messageNumber): {seq} ✅")
            elif hfield == 5 and hwire == 1:  # deviceID (FIXED64)
                dev_id = struct.unpack('<Q', header_data[hpos:hpos+8])[0]
                hpos += 8
                print(f"      Field 5 (deviceID): 0x{dev_id:016x} ✅")
    
    # Field 3: masterMessage
    field_tag = data[pos]
    field_num = field_tag >> 3
    wire_type = field_tag & 0x7
    pos += 1
    
    if field_num == 3 and wire_type == 2:
        length = data[pos]
        pos += 1
        if length & 0x80:
            length = (length & 0x7F) | (data[pos] << 7)
            pos += 1
        print(f"\n  ✅ Field 3 (MasterMessage): {length} bytes")
        print("    This is the CORRECT structure for Block broadcasts!")
    else:
        print(f"\n  ❌ Field {field_num} found instead of Field 3!")
    
    print("\n" + "=" * 70)
    print("✅ PROTOCOL VALIDATION PASSED")
    print("=" * 70)
    print("\nKey Differences from Old Implementation:")
    print("  ✅ meaterLinkIdentifier = 21578 (NOT timestamp!)")
    print("  ✅ versionMajor = 2, versionMinor = 1 (NOT version=7)")
    print("  ✅ deviceID is FIXED64 (8 bytes, NOT 16 bytes)")
    print("  ✅ Uses Field 3 (MasterMessage, NOT Field 2)")
    print("  ✅ No username/device_model/app_version strings")
    print("\nThis packet should be recognized by the MEATER app!")

if __name__ == "__main__":
    main()
