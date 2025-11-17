#!/usr/bin/env python3
"""
Test script for the new MEATER Block protocol changes.
This generates packets matching the updated meater_udp_broadcast.h implementation.
"""

import struct
import sys

def encode_varint(value):
    """Encode unsigned varint"""
    result = bytearray()
    while value > 0x7F:
        result.append((value & 0x7F) | 0x80)
        value >>= 7
    result.append(value & 0x7F)
    return bytes(result)

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

def encode_fixed64_field(field_num, value):
    """Encode fixed64 field (wire type 1)"""
    return encode_field_header(field_num, 1) + encode_fixed64(value)

def encode_string_field(field_num, text):
    """Encode string field"""
    return encode_length_delimited(field_num, text.encode('utf-8'))

def build_meater_link_header(sequence, device_id):
    """Build MeaterLinkHeader"""
    header = bytearray()
    header += encode_varint_field(1, 21578)      # Field 1: meaterLinkIdentifier = 21578
    header += encode_varint_field(2, 17)         # Field 2: versionMajor = 17
    header += encode_varint_field(3, 7)          # Field 3: versionMinor = 7
    header += encode_varint_field(4, sequence)   # Field 4: messageNumber = sequence
    header += encode_fixed64_field(5, device_id) # Field 5: deviceID = FIXED64 (8 bytes)
    return bytes(header)

def build_subscription_message_with_probe(temp_data, battery_data):
    """Build SubscriptionMessage WITH probe data (new format)"""
    subscription = bytearray()
    
    # Field 1: probe_data (16 bytes total)
    probe_data = bytearray()
    probe_data.extend(temp_data[:8])  # 8 bytes temperature data
    if battery_data and len(battery_data) >= 2:
        probe_data.extend(battery_data[:2])  # 2 bytes battery data
    else:
        probe_data.extend([0x00, 0x00])  # Pad with zeros
    while len(probe_data) < 16:
        probe_data.append(0x00)  # Pad to 16 bytes
    subscription += encode_length_delimited(1, bytes(probe_data))
    
    # Field 2: status = 2 (connected)
    subscription += encode_varint_field(2, 2)
    
    # Field 3: username string (empty for MEATER Block)
    subscription += encode_string_field(3, "")
    
    # Field 4: device_model string
    subscription += encode_string_field(4, "MEATER Block")
    
    # Field 5: app_version string
    subscription += encode_string_field(5, "1.0.0")
    
    # Field 6: unknown field string
    subscription += encode_string_field(6, "1")
    
    return bytes(subscription)

def build_subscription_message_without_probe():
    """Build SubscriptionMessage WITHOUT probe data (new format)"""
    subscription = bytearray()
    
    # Field 2: status = 2 (connected, but no active probe)
    subscription += encode_varint_field(2, 2)
    
    # Field 3: username string (empty for Block)
    subscription += encode_string_field(3, "")
    
    # Field 4: device_model string
    subscription += encode_string_field(4, "MEATER Block")
    
    # Field 5: app_version string
    subscription += encode_string_field(5, "1.0.0")
    
    # Field 6: unknown field string
    subscription += encode_string_field(6, "1")
    
    return bytes(subscription)

def build_meater_link_message(device_id, sequence, temp_data=None, battery_data=None):
    """Build complete MeaterLinkMessage"""
    message = bytearray()
    
    # Field 1: header (REQUIRED)
    message += encode_length_delimited(1, build_meater_link_header(sequence, device_id))
    
    # Field 2: SubscriptionMessage
    if temp_data and len(temp_data) >= 8:
        subscription_msg = build_subscription_message_with_probe(temp_data, battery_data)
    else:
        subscription_msg = build_subscription_message_without_probe()
    message += encode_length_delimited(2, subscription_msg)
    
    return bytes(message)

def test_with_probe_data():
    """Test packet WITH probe data"""
    print("=" * 70)
    print("Test 1: WITH Probe Data")
    print("=" * 70)
    
    device_id = 0xAABBCCDDEEFF0011
    sequence = 1
    # Sample temperature data (8 bytes)
    temp_data = bytes([0x40, 0x01, 0xE0, 0x00, 0x00, 0x00, 0x00, 0x00])
    # Sample battery data (2 bytes)
    battery_data = bytes([0x55, 0x00])  # 85%
    
    packet = build_meater_link_message(device_id, sequence, temp_data, battery_data)
    
    print(f"\nDevice ID: 0x{device_id:016x}")
    print(f"Sequence: {sequence}")
    print(f"Temperature data: {temp_data.hex()}")
    print(f"Battery data: {battery_data.hex()}")
    print(f"\nGenerated Packet ({len(packet)} bytes):")
    print(packet.hex())
    print("\nTo validate with app decoder:")
    print(f"  python validate_protocol.py {packet.hex()}")
    
    return packet

def test_without_probe_data():
    """Test packet WITHOUT probe data"""
    print("\n" + "=" * 70)
    print("Test 2: WITHOUT Probe Data")
    print("=" * 70)
    
    device_id = 0xAABBCCDDEEFF0011
    sequence = 2
    
    packet = build_meater_link_message(device_id, sequence, None, None)
    
    print(f"\nDevice ID: 0x{device_id:016x}")
    print(f"Sequence: {sequence}")
    print(f"No probe data")
    print(f"\nGenerated Packet ({len(packet)} bytes):")
    print(packet.hex())
    print("\nTo validate with app decoder:")
    print(f"  python validate_protocol.py {packet.hex()}")
    
    return packet

def main():
    print("MEATER Block Protocol Test (New Format)")
    print("Testing changes: empty username, 'MEATER Block' device_model,")
    print("'1.0.0' app_version, '1' unknown field\n")
    
    # Test both scenarios
    packet1 = test_with_probe_data()
    packet2 = test_without_probe_data()
    
    print("\n" + "=" * 70)
    print("Summary")
    print("=" * 70)
    print("✅ Generated 2 test packets")
    print("✅ Packet 1: WITH probe data (status=2, username='', device_model='MEATER Block')")
    print("✅ Packet 2: WITHOUT probe data (status=2, username='', device_model='MEATER Block')")
    print("\nKey changes from old format:")
    print("  - username: 'meater@esp32.local' → '' (empty)")
    print("  - device_model: 'ESP32-C3' → 'MEATER Block'")
    print("  - app_version: '4.6.3' → '1.0.0'")
    print("  - unknown field: '14' → '1'")
    print("  - status: always 2 (connected), even without probe")

if __name__ == "__main__":
    main()
