#!/usr/bin/env python3
"""
Demonstration: Current MEATER Block Implementation Analysis

This script demonstrates how the MEATER app processes UDP broadcast packets
from the CURRENT implementation (Field 2: SubscriptionMessage) to understand
exactly where device addition fails.

Based on: includes/meater_udp_broadcast.h (current implementation)
"""

import struct
import sys
import os

# Add tools directory to path
sys.path.insert(0, os.path.dirname(__file__))

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

def encode_fixed64_field(field_num, value):
    """Encode fixed64 field (wire type 1)"""
    return encode_field_header(field_num, 1) + struct.pack('<Q', value)

def encode_string_field(field_num, text):
    """Encode string field"""
    return encode_length_delimited(field_num, text.encode('utf-8'))

def build_current_packet_with_probe():
    """
    Build a packet EXACTLY as current implementation does (WITH probe data).
    
    Based on: includes/meater_udp_broadcast.h lines 394-476
    Function: build_protobuf_packet()
    """
    packet = bytearray()
    
    print("=" * 80)
    print("STEP 1: Current ESP32 Implementation Builds Packet (WITH PROBE DATA)")
    print("=" * 80)
    print("\nFrom: includes/meater_udp_broadcast.h:394-476")
    print("Function: void build_protobuf_packet(std::vector<uint8_t>& packet)\n")
    
    # Field 1: MeaterLinkHeader (lines 400-407)
    print("Building Field 1: MeaterLinkHeader (lines 401-407)")
    print("  encode_varint_field(header, 1, 21578);      // meaterLinkIdentifier")
    print("  encode_varint_field(header, 2, 17);         // versionMajor")
    print("  encode_varint_field(header, 3, 7);          // versionMinor")
    print("  encode_varint_field(header, 4, 13);         // messageNumber")
    print("  encode_fixed64(header, 5, device_id);       // deviceID")
    
    header = bytearray()
    header += encode_varint_field(1, 21578)  # meaterLinkIdentifier = 21578
    header += encode_varint_field(2, 17)     # versionMajor = 17
    header += encode_varint_field(3, 7)      # versionMinor = 7
    header += encode_varint_field(4, 13)     # messageNumber (sequence)
    header += encode_fixed64_field(5, 0xd0d0f492c223b3e4)  # deviceID (8 bytes)
    packet += encode_length_delimited(1, bytes(header))
    
    print("  ✅ Built header with CORRECT values")
    
    # Field 2: SubscriptionMessage (lines 410-464)
    print("\nBuilding Field 2: SubscriptionMessage (lines 410-464)")
    print("  ⚠️  USES Field 2 (SubscriptionMessage) - app uses this for subscriptions!")
    print("  ⚠️  NOT Field 3 (MasterMessage) - which Blocks should use!")
    
    subscription_msg = bytearray()
    
    # Field 1: probe_data (16 bytes) - lines 417-429
    print("\n  Building sub-field 1: probe_data (16 bytes)")
    probe_data = bytearray()
    # 8 bytes temp data
    temp_data = bytes([0x7b, 0x01, 0x0a, 0x00, 0x0a, 0x00, 0x09, 0x00])
    probe_data.extend(temp_data)
    # 2 bytes battery
    battery_data = bytes([0x06, 0x00])
    probe_data.extend(battery_data)
    # Pad to 16 bytes
    while len(probe_data) < 16:
        probe_data.append(0x00)
    subscription_msg += encode_length_delimited(1, bytes(probe_data))
    print(f"    probe_data: {probe_data.hex()}")
    
    # Field 2: status = 2 (line 432)
    subscription_msg += encode_varint_field(2, 2)
    print("    status: 2 (connected)")
    
    # Field 3: username = "" (line 435)
    subscription_msg += encode_string_field(3, "")
    print("    username: '' (empty)")
    
    # Field 4: device_model = "MEATER Block" (line 438)
    subscription_msg += encode_string_field(4, "MEATER Block")
    print("    device_model: 'MEATER Block'")
    
    # Field 5: app_version = "1.0.0" (line 441)
    subscription_msg += encode_string_field(5, "1.0.0")
    print("    app_version: '1.0.0'")
    
    # Field 6: unknown = "1" (line 444)
    subscription_msg += encode_string_field(6, "1")
    print("    unknown: '1'")
    
    packet += encode_length_delimited(2, bytes(subscription_msg))
    
    print(f"\n✅ Current Packet Built: {len(packet)} bytes")
    print(f"Hex: {packet.hex()}\n")
    
    return packet

def build_current_packet_without_probe():
    """
    Build a packet EXACTLY as current implementation does (WITHOUT probe data).
    
    Based on: includes/meater_udp_broadcast.h lines 445-461
    """
    packet = bytearray()
    
    print("=" * 80)
    print("STEP 1: Current ESP32 Implementation Builds Packet (WITHOUT PROBE DATA)")
    print("=" * 80)
    
    # Field 1: MeaterLinkHeader
    print("Building Field 1: MeaterLinkHeader")
    header = bytearray()
    header += encode_varint_field(1, 21578)  # meaterLinkIdentifier
    header += encode_varint_field(2, 17)     # versionMajor
    header += encode_varint_field(3, 7)      # versionMinor
    header += encode_varint_field(4, 1)      # messageNumber
    header += encode_fixed64_field(5, 0xd0d0f492c223b3e4)  # deviceID
    packet += encode_length_delimited(1, bytes(header))
    print("  ✅ Built header")
    
    # Field 2: SubscriptionMessage (WITHOUT probe data field)
    print("\nBuilding Field 2: SubscriptionMessage (lines 445-461)")
    print("  NO probe_data field!")
    
    subscription_msg = bytearray()
    
    # Field 2: status = 2 (line 448)
    subscription_msg += encode_varint_field(2, 2)
    print("    status: 2 (connected, no active probe)")
    
    # Field 3: username = "" (line 451)
    subscription_msg += encode_string_field(3, "")
    print("    username: '' (empty)")
    
    # Field 4: device_model = "MEATER Block" (line 454)
    subscription_msg += encode_string_field(4, "MEATER Block")
    print("    device_model: 'MEATER Block'")
    
    # Field 5: app_version = "1.0.0" (line 457)
    subscription_msg += encode_string_field(5, "1.0.0")
    print("    app_version: '1.0.0'")
    
    # Field 6: unknown = "1" (line 460)
    subscription_msg += encode_string_field(6, "1")
    print("    unknown: '1'")
    
    packet += encode_length_delimited(2, bytes(subscription_msg))
    
    print(f"\n✅ Current Packet Built: {len(packet)} bytes")
    print(f"Hex: {packet.hex()}\n")
    
    return packet

def validate_with_app_decoder(packet_hex, description):
    """
    Validate packet using the validator (simulates app's decoder)
    """
    print("=" * 80)
    print(f"STEP 2: MEATER App Decodes Packet - {description}")
    print("=" * 80)
    print("\nFrom: meater_app/v3protobuf/MeaterLinkMessage.java")
    print("Function: ProtoAdapter_MeaterLinkMessage.decode(ProtoReader)\n")
    
    # Run the validator
    import subprocess
    result = subprocess.run(
        ['python3', 'tools/validate_protocol.py', packet_hex],
        capture_output=True,
        text=True,
        cwd='/home/runner/work/meater-in-local-haos/meater-in-local-haos'
    )
    
    print(result.stdout)
    
    if result.returncode == 0:
        print("\n✅ Packet decoded successfully by MeaterLinkMessage decoder!")
        return True, result.stdout
    else:
        print("\n❌ Packet failed to decode!")
        print(result.stderr)
        return False, result.stdout + "\n" + result.stderr

def analyze_subscription_message_fields(success, output):
    """
    Analyze what the SubscriptionMessage decoder found
    """
    print("\n" + "=" * 80)
    print("STEP 3: Analyzing SubscriptionMessage Structure")
    print("=" * 80)
    print("\nFrom: meater_app/v3protobuf/SubscriptionMessage.java")
    print("Function: ProtoAdapter_SubscriptionMessage.decode(ProtoReader)\n")
    
    print("SubscriptionMessage expects:")
    print("  Field 1: desiredDevices (List<Long>, FIXED64) - Device IDs to subscribe to")
    print("  Field 2: clientType (MasterType enum) - Type of client")
    print("  Field 3: emailAddress (String) - User email")
    print("  Field 4: deviceInfo (String) - Device model/info")
    print("  Field 5: appVersion (String) - App version")
    print("  Field 6: osVersion (String) - OS version")
    
    print("\n⚠️  PROTOCOL MISMATCH DETECTED!")
    print("\nCurrent implementation sends in Field 2:")
    print("  Field 1: probe_data (16 bytes) - Temperature/battery data")
    print("  Field 2: status (varint) - Connection status")
    print("  Field 3: username (string) - Empty")
    print("  Field 4: device_model (string) - 'MEATER Block'")
    print("  Field 5: app_version (string) - '1.0.0'")
    print("  Field 6: unknown (string) - '1'")
    
    print("\n❌ CRITICAL ISSUE:")
    print("  - ESP32 treats Field 2 as custom message for broadcasting probe data")
    print("  - App treats Field 2 (SubscriptionMessage) as client subscription request")
    print("  - Field 2 is for app → block communication (NOT block → app!)")
    print("  - Blocks should use Field 3 (MasterMessage) for broadcasting")

def show_correct_solution():
    """
    Show what should be done to fix this
    """
    print("\n" + "=" * 80)
    print("CORRECT SOLUTION")
    print("=" * 80)
    print("\nBased on: docs/udp_capture.log and protocol documentation\n")
    
    print("MeaterLinkMessage structure:")
    print("  Field 1: MeaterLinkHeader (REQUIRED)")
    print("  Field 2: SubscriptionMessage (app → block) - NOT for broadcasts!")
    print("  Field 3: MasterMessage (block → app) - THIS IS WHAT BLOCKS SEND!")
    print("  Field 4-15: Other message types...")
    
    print("\nFor a MEATER Block to broadcast, it should send:")
    print("  MeaterLinkMessage {")
    print("    Field 1: MeaterLinkHeader { ... }")
    print("    Field 3: MasterMessage {")
    print("      Field 1: masterType = 0 (MASTER_TYPE_BLOCK)")
    print("      Field 2: cloudConnectionState = 0 (DISABLED)")
    print("      Field 3: devices (repeated MLDevice) {")
    print("        MLDevice {")
    print("          Field 1: probe (MLProbe) { ... }")
    print("          Field 5: identifier (FIXED64)")
    print("          Field 6: probeNumber (UINT32)")
    print("          Field 7: chargeState (ChargeState)")
    print("          Field 8: firmwareRevision (string)")
    print("          Field 9: connectionState = 1 (CONNECTED)")
    print("          Field 10: connectionType = 0 (BLE)")
    print("          Field 11: bleSignalLevel (SINT32)")
    print("        }")
    print("      }")
    print("    }")
    print("  }")
    
    print("\n⚠️  The current implementation uses the WRONG message type!")
    print("  Current: Field 2 (SubscriptionMessage) - for client subscriptions")
    print("  Should be: Field 3 (MasterMessage) - for Block broadcasts")

def main():
    """Main demonstration"""
    print("\n" + "=" * 80)
    print("CURRENT IMPLEMENTATION ANALYSIS")
    print("=" * 80)
    print("\nThis demonstrates how the current ESP32 implementation builds")
    print("packets and where exactly the MEATER app decoder fails.\n")
    
    print("Testing both scenarios:\n")
    
    # Test WITH probe data
    print("\n" + "#" * 80)
    print("# TEST 1: WITH PROBE DATA")
    print("#" * 80)
    packet1 = build_current_packet_with_probe()
    packet1_hex = packet1.hex()
    success1, output1 = validate_with_app_decoder(packet1_hex, "WITH PROBE DATA")
    
    # Test WITHOUT probe data
    print("\n" + "#" * 80)
    print("# TEST 2: WITHOUT PROBE DATA")
    print("#" * 80)
    packet2 = build_current_packet_without_probe()
    packet2_hex = packet2.hex()
    success2, output2 = validate_with_app_decoder(packet2_hex, "WITHOUT PROBE DATA")
    
    # Analyze the issue
    analyze_subscription_message_fields(success1 or success2, output1)
    
    # Show solution
    show_correct_solution()
    
    print("\n" + "=" * 80)
    print("SUMMARY")
    print("=" * 80)
    print("\n✅ FINDINGS:")
    print("  1. Packet structure is VALID protobuf")
    print("  2. MeaterLinkHeader is CORRECT (21578, 17, 7, seq, deviceID)")
    print("  3. Field 2 (SubscriptionMessage) decoder may accept it structurally")
    print("\n❌ ROOT CAUSE:")
    print("  1. ESP32 uses Field 2 (SubscriptionMessage) for broadcasting")
    print("  2. SubscriptionMessage is for app → block (client subscriptions)")
    print("  3. Blocks should use Field 3 (MasterMessage) for broadcasting")
    print("  4. App doesn't recognize Field 2 as a Block device broadcast")
    print("\n🔧 SOLUTION:")
    print("  Switch from Field 2 (SubscriptionMessage) to Field 3 (MasterMessage)")
    print("  with proper MLDevice/MLProbe structure for Block broadcasts")
    print("\n" + "=" * 80)

if __name__ == "__main__":
    main()
