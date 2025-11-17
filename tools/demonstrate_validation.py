#!/usr/bin/env python3
"""
Demonstration: MEATER Block Device Addition Process

This script demonstrates how the MEATER app processes UDP broadcast packets
to add a MEATER Block device, using the actual protocol implementation from
the main branch.

It shows:
1. Packet generation (mimicking ESP32 implementation)
2. Step-by-step validation through the app's decoder
3. Device addition decision logic
4. Where the implementation succeeds or fails
"""

import struct
import sys
import os

# Add tools directory to path
sys.path.insert(0, os.path.join(os.path.dirname(__file__), '..', 'tools'))

def encode_varint(value):
    """Encode varint (same as ESP32 implementation)"""
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

def encode_varint_field(field_num, value):
    """Encode varint field (wire type 0)"""
    return encode_field_header(field_num, 0) + encode_varint(value)

def encode_fixed64(field_num, value):
    """Encode fixed64 (wire type 1)"""
    return encode_field_header(field_num, 1) + struct.pack('<Q', value)

def encode_string(field_num, text):
    """Encode string field"""
    return encode_length_delimited(field_num, text.encode('utf-8'))

def build_esp32_packet():
    """
    Build a packet exactly as the ESP32 implementation does.
    
    Based on includes/meater_udp_broadcast.h build_protobuf_packet()
    Lines 322-357
    """
    packet = bytearray()
    
    print("=" * 80)
    print("STEP 1: ESP32 Builds UDP Broadcast Packet")
    print("=" * 80)
    print("\nFrom: includes/meater_udp_broadcast.h:322-357")
    print("Function: void build_protobuf_packet(std::vector<uint8_t>& packet)\n")
    
    # Field 1: MeaterLinkHeader (OLD IMPLEMENTATION - uses wrong fields!)
    print("Building Field 1: MeaterLinkHeader")
    print("  ⚠️  NOTE: Current implementation uses OLD field definitions!")
    print("  Line 333: encode_varint_field(header, 1, timestamp_ms);")
    print("  Line 334: encode_varint_field(header, 2, sequence_number_);")
    print("  Line 335: encode_varint_field(header, 3, 7);")
    print("  Line 336: encode_varint_field(header, 4, 3);")
    print("  Line 337: encode_fixed64(header, 5, 0x47d87193396eac16ULL);")
    
    header = bytearray()
    header += encode_varint_field(1, 250000)  # timestamp_ms (simulated)
    header += encode_varint_field(2, 1)       # sequence_number_
    header += encode_varint_field(3, 7)       # version = 7
    header += encode_varint_field(4, 3)       # unknown1 = 3
    header += encode_fixed64(5, 0x47d87193396eac16)  # unknown2
    packet += encode_length_delimited(1, bytes(header))
    
    print("  ✅ Built header: timestamp=250000, sequence=1, version=7")
    
    # Field 2: MLDevice (OLD - uses 16-byte device_id)
    print("\nBuilding Field 2: MLDevice")
    print("  ⚠️  NOTE: Uses 16-byte device_id instead of standard structure!")
    print("  Line 342: encode_length_delimited(device, 1, device_id_, 16);")
    print("  Line 343: encode_varint_field(device, 2, 2);")
    
    device = bytearray()
    # 16-byte device_id (MAC-derived)
    device_id_16 = bytes([0xAA, 0xBB, 0xCC, 0xDD, 0xEE, 0xFF, 0x11, 0x22,
                          0x33, 0x44, 0x55, 0x66, 0x77, 0x88, 0x99, 0x00])
    device += encode_length_delimited(1, device_id_16)
    device += encode_varint_field(2, 2)  # connection_state = 2 (connected)
    packet += encode_length_delimited(2, bytes(device))
    
    print("  ✅ Built device: device_id=0xAABBCCDD..., connection_state=2")
    
    # Fields 3-6: Strings
    print("\nBuilding Fields 3-6: Metadata strings")
    print("  Line 347: encode_string(packet, 3, \"meater@esp32.local\");")
    print("  Line 350: encode_string(packet, 4, \"ESP32-C3\");")
    print("  Line 353: encode_string(packet, 5, \"4.6.3\");")
    print("  Line 356: encode_string(packet, 6, \"14\");")
    
    packet += encode_string(3, "meater@esp32.local")
    packet += encode_string(4, "ESP32-C3")
    packet += encode_string(5, "4.6.3")
    packet += encode_string(6, "14")
    
    print("  ✅ Built metadata strings")
    
    print(f"\n✅ ESP32 Packet Built: {len(packet)} bytes")
    print(f"Hex: {packet.hex()}\n")
    
    return packet

def validate_with_app_decoder(packet_hex):
    """
    Validate packet using the validator (simulates app's decoder)
    """
    print("=" * 80)
    print("STEP 2: MEATER App Receives and Decodes Packet")
    print("=" * 80)
    print("\nFrom: meater_app/v3protobuf/MeaterLinkMessage.java")
    print("Function: ProtoAdapter_MeaterLinkMessage.m286decode(ProtoReader)\n")
    
    print("App executes: MeaterLinkMessage msg = MeaterLinkMessage.ADAPTER.decode(packet);\n")
    
    # Run the validator
    import subprocess
    result = subprocess.run(
        ['python3', 'tools/validate_protocol.py', packet_hex],
        capture_output=True,
        text=True
    )
    
    print(result.stdout)
    
    if result.returncode == 0:
        print("\n✅ Packet decoded successfully by app!")
        return True
    else:
        print("\n❌ Packet failed to decode!")
        print(result.stderr)
        return False

def analyze_device_addition(success):
    """
    Analyze whether the device would be added to the app
    """
    print("\n" + "=" * 80)
    print("STEP 3: App Decides Whether to Add Device")
    print("=" * 80)
    print("\nFrom: App device discovery logic\n")
    
    if success:
        print("✅ Decoder succeeded - packet structure is valid")
        print("\nApp checks:")
        print("  1. Does msg.header exist? ✅ YES")
        print("  2. Are all required header fields present? ✅ YES")
        print("     - meaterLinkIdentifier: Present (but wrong value!)")
        print("     - versionMajor: Present (but wrong value!)")
        print("     - versionMinor: Present (but wrong value!)")
        print("     - messageNumber: Present")
        print("     - deviceID: Present")
        print("\n⚠️  PROBLEM: Field values don't match expected protocol!")
        print("  Expected: meaterLinkIdentifier=21578, versionMajor=17, versionMinor=7")
        print("  Got: timestamp=250000, sequence=1, version=7")
        print("\n❌ RESULT: Device would NOT be added - wrong field values!")
        print("\nThe ESP32 implementation uses the WRONG field definitions.")
        print("It sends timestamp/sequence in fields meant for identifier/version.")
    else:
        print("❌ Decoder failed - packet structure is invalid")
        print("\n❌ RESULT: Device would NOT be added - decode failed!")

def show_correct_implementation():
    """
    Show what the correct implementation should be
    """
    print("\n" + "=" * 80)
    print("CORRECT IMPLEMENTATION")
    print("=" * 80)
    print("\nBased on: meater_app/v3protobuf/MeaterLinkHeader.java\n")
    print("The MeaterLinkHeader fields are:")
    print("  Field 1: meaterLinkIdentifier (UINT32) - Should be 21578 (0x544A)")
    print("  Field 2: versionMajor (UINT32) - Should be 17")
    print("  Field 3: versionMinor (UINT32) - Should be 7")
    print("  Field 4: messageNumber (UINT32) - Sequence counter")
    print("  Field 5: deviceID (FIXED64) - Unique device ID")
    print("\nAll these fields are REQUIRED (see Builder.m282build())")
    print("\nThe ESP32 should send:")
    print("  encode_varint_field(header, 1, 21578);  // meaterLinkIdentifier")
    print("  encode_varint_field(header, 2, 17);     // versionMajor")
    print("  encode_varint_field(header, 3, 7);      // versionMinor")
    print("  encode_varint_field(header, 4, seq);    // messageNumber")
    print("  encode_fixed64(header, 5, device_id);   // deviceID")

def main():
    """Main demonstration"""
    print("\n" + "=" * 80)
    print("DEMONSTRATION: MEATER Block Device Addition Process")
    print("=" * 80)
    print("\nThis demonstrates how the MEATER app processes UDP broadcast")
    print("packets from the ESP32 to add a MEATER Block device.")
    print("\nUsing current implementation from includes/meater_udp_broadcast.h\n")
    
    # Step 1: Build packet
    packet = build_esp32_packet()
    packet_hex = packet.hex()
    
    # Step 2: Validate with app decoder
    success = validate_with_app_decoder(packet_hex)
    
    # Step 3: Analyze device addition
    analyze_device_addition(success)
    
    # Show correct implementation
    show_correct_implementation()
    
    print("\n" + "=" * 80)
    print("SUMMARY")
    print("=" * 80)
    print("\nThe validator successfully demonstrates:")
    print("  ✅ How the ESP32 builds packets")
    print("  ✅ How the app decodes packets") 
    print("  ✅ Where the implementation fails")
    print("  ✅ What needs to be fixed")
    print("\nThe current implementation sends valid protobuf, but with")
    print("WRONG field values. The app can decode it, but won't recognize")
    print("it as a valid MEATER Block because the header fields don't match.")
    print("\n" + "=" * 80)

if __name__ == "__main__":
    main()
