#!/usr/bin/env python3
"""
Validator for the custom MEATER protocol implementation.
This validates the packet structure without assuming it matches the Java SubscriptionMessage.
"""

import struct
import sys

class ProtoReader:
    """Simple protobuf reader"""
    
    def __init__(self, data):
        self.data = data
        self.pos = 0
        
    def read_varint(self):
        result = 0
        shift = 0
        while True:
            if self.pos >= len(self.data):
                raise ValueError("End of data reading varint")
            b = self.data[self.pos]
            self.pos += 1
            result |= (b & 0x7F) << shift
            if (b & 0x80) == 0:
                break
            shift += 7
        return result
        
    def read_fixed64(self):
        if self.pos + 8 > len(self.data):
            raise ValueError("Not enough data for fixed64")
        value = struct.unpack('<Q', self.data[self.pos:self.pos+8])[0]
        self.pos += 8
        return value
        
    def read_length_delimited(self):
        length = self.read_varint()
        if self.pos + length > len(self.data):
            raise ValueError(f"Not enough data for length-delimited (need {length})")
        data = self.data[self.pos:self.pos+length]
        self.pos += length
        return data

def validate_meater_link_header(data):
    """Validate MeaterLinkHeader structure"""
    reader = ProtoReader(data)
    fields = {}
    
    print("  MeaterLinkHeader:")
    while reader.pos < len(data):
        tag = reader.read_varint()
        field_num = tag >> 3
        wire_type = tag & 0x7
        
        if field_num == 1 and wire_type == 0:  # meaterLinkIdentifier
            value = reader.read_varint()
            fields[1] = value
            print(f"    Field 1 (meaterLinkIdentifier): {value} {'✅' if value == 21578 else '❌ Expected 21578'}")
        elif field_num == 2 and wire_type == 0:  # versionMajor
            value = reader.read_varint()
            fields[2] = value
            print(f"    Field 2 (versionMajor): {value} {'✅' if value == 17 else '❌ Expected 17'}")
        elif field_num == 3 and wire_type == 0:  # versionMinor
            value = reader.read_varint()
            fields[3] = value
            print(f"    Field 3 (versionMinor): {value} {'✅' if value == 7 else '❌ Expected 7'}")
        elif field_num == 4 and wire_type == 0:  # messageNumber
            value = reader.read_varint()
            fields[4] = value
            print(f"    Field 4 (messageNumber): {value} ✅")
        elif field_num == 5 and wire_type == 1:  # deviceID (FIXED64)
            value = reader.read_fixed64()
            fields[5] = value
            print(f"    Field 5 (deviceID): 0x{value:016x} ✅")
        else:
            print(f"    Field {field_num} (wire type {wire_type}): Unknown")
            if wire_type == 0:
                reader.read_varint()
            elif wire_type == 1:
                reader.read_fixed64()
            elif wire_type == 2:
                reader.read_length_delimited()
    
    # Check required fields
    required = [1, 2, 3, 4, 5]
    missing = [f for f in required if f not in fields]
    if missing:
        raise ValueError(f"Missing required fields: {missing}")
    
    return fields

def validate_custom_subscription_message(data, has_probe_data_expected):
    """Validate the custom SubscriptionMessage format"""
    reader = ProtoReader(data)
    fields = {}
    
    print("  Custom SubscriptionMessage (Field 2):")
    while reader.pos < len(data):
        tag = reader.read_varint()
        field_num = tag >> 3
        wire_type = tag & 0x7
        
        if field_num == 1 and wire_type == 2:  # Probe data
            probe_data = reader.read_length_delimited()
            fields[1] = probe_data
            print(f"    Field 1 (probe_data): {len(probe_data)} bytes")
            if len(probe_data) == 16:
                print(f"      ✅ Correct length (8 temp + 2 battery + 6 padding)")
                print(f"      Temp data: {probe_data[:8].hex()}")
                print(f"      Battery data: {probe_data[8:10].hex()}")
            else:
                print(f"      ❌ Expected 16 bytes, got {len(probe_data)}")
        elif field_num == 2 and wire_type == 0:  # Status
            value = reader.read_varint()
            fields[2] = value
            print(f"    Field 2 (status): {value} {'✅ Connected' if value == 2 else '❌ Expected 2'}")
        elif field_num == 3 and wire_type == 2:  # Username
            username = reader.read_length_delimited().decode('utf-8', errors='replace')
            fields[3] = username
            print(f"    Field 3 (username): \"{username}\" {'✅' if username == '' else '⚠️'}")
        elif field_num == 4 and wire_type == 2:  # Device model
            device_model = reader.read_length_delimited().decode('utf-8', errors='replace')
            fields[4] = device_model
            print(f"    Field 4 (device_model): \"{device_model}\" {'✅' if device_model == 'MEATER Block' else '❌ Expected MEATER Block'}")
        elif field_num == 5 and wire_type == 2:  # App version
            app_version = reader.read_length_delimited().decode('utf-8', errors='replace')
            fields[5] = app_version
            print(f"    Field 5 (app_version): \"{app_version}\" {'✅' if app_version == '1.0.0' else '❌ Expected 1.0.0'}")
        elif field_num == 6 and wire_type == 2:  # Unknown field
            unknown = reader.read_length_delimited().decode('utf-8', errors='replace')
            fields[6] = unknown
            print(f"    Field 6 (unknown): \"{unknown}\" {'✅' if unknown == '1' else '❌ Expected 1'}")
        else:
            print(f"    Field {field_num} (wire type {wire_type}): Unexpected")
            if wire_type == 0:
                reader.read_varint()
            elif wire_type == 1:
                reader.read_fixed64()
            elif wire_type == 2:
                reader.read_length_delimited()
    
    # Validate based on whether probe data is expected
    if has_probe_data_expected:
        if 1 not in fields:
            raise ValueError("Expected probe data in field 1, but not found")
        required = [1, 2, 3, 4, 5, 6]
    else:
        if 1 in fields:
            print("    ⚠️ Warning: Probe data found but not expected for this test")
        required = [2, 3, 4, 5, 6]
    
    missing = [f for f in required if f not in fields]
    if missing:
        raise ValueError(f"Missing required fields: {missing}")
    
    return fields

def validate_packet(packet_hex, has_probe_data=True):
    """Validate a complete MEATER Link packet"""
    try:
        packet_data = bytes.fromhex(packet_hex.replace(" ", "").replace(":", ""))
    except ValueError as e:
        print(f"❌ ERROR: Invalid hex string: {e}")
        return False
    
    print(f"\nPacket: {packet_hex[:60]}{'...' if len(packet_hex) > 60 else ''}")
    print(f"Length: {len(packet_data)} bytes\n")
    
    try:
        reader = ProtoReader(packet_data)
        
        # Read Field 1: MeaterLinkHeader
        tag = reader.read_varint()
        field_num = tag >> 3
        wire_type = tag & 0x7
        
        if field_num != 1 or wire_type != 2:
            raise ValueError(f"Expected Field 1 (header), got field {field_num}")
        
        print("Field 1: MeaterLinkHeader")
        header_data = reader.read_length_delimited()
        validate_meater_link_header(header_data)
        
        # Read Field 2: Custom SubscriptionMessage
        tag = reader.read_varint()
        field_num = tag >> 3
        wire_type = tag & 0x7
        
        if field_num != 2 or wire_type != 2:
            raise ValueError(f"Expected Field 2 (subscription), got field {field_num}")
        
        subscription_data = reader.read_length_delimited()
        validate_custom_subscription_message(subscription_data, has_probe_data)
        
        if reader.pos < len(packet_data):
            print(f"\n⚠️ Warning: {len(packet_data) - reader.pos} extra bytes at end")
        
        print("\n" + "="*70)
        print("✅ SUCCESS: Packet structure is valid!")
        print("="*70)
        return True
        
    except Exception as e:
        print("\n" + "="*70)
        print("❌ FAILURE: Packet validation failed")
        print("="*70)
        print(f"Error: {e}")
        import traceback
        traceback.print_exc()
        return False

def main():
    if len(sys.argv) < 2:
        print("Usage: python validate_custom_protocol.py <packet_hex> [with_probe|no_probe]")
        print("\nValidates the custom MEATER Block protocol implementation.")
        print("\nArguments:")
        print("  packet_hex  - Hex string of the packet to validate")
        print("  with_probe  - Packet contains probe data (default)")
        print("  no_probe    - Packet without probe data")
        print("\nExample:")
        print("  python validate_custom_protocol.py 0a1308... with_probe")
        sys.exit(1)
    
    packet_hex = sys.argv[1]
    has_probe = True if len(sys.argv) < 3 or sys.argv[2] == "with_probe" else False
    
    print("="*70)
    print("Custom MEATER Protocol Validator")
    print("="*70)
    
    success = validate_packet(packet_hex, has_probe)
    sys.exit(0 if success else 1)

if __name__ == "__main__":
    main()
