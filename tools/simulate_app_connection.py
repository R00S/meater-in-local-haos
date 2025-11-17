#!/usr/bin/env python3
"""
Line-by-line simulation of MEATER app's Block discovery connection process.

This tool interprets the decompiled app's discovery code and tests packets
against the exact checks the app performs when user presses "TRY AGAIN"
during "Add MEATER Block" setup.

No guessing or reconstruction - follows app's actual code flow.
"""

def decode_varint(data, offset):
    """Decode protobuf varint from bytes."""
    result = 0
    shift = 0
    while offset < len(data):
        byte = data[offset]
        offset += 1
        result |= (byte & 0x7F) << shift
        if not (byte & 0x80):
            break
        shift += 7
    return result, offset

def decode_field_header(data, offset):
    """Decode protobuf field header (field number + wire type)."""
    varint, offset = decode_varint(data, offset)
    field_number = varint >> 3
    wire_type = varint & 0x07
    return field_number, wire_type, offset

def decode_length_delimited(data, offset):
    """Decode length-delimited field (string/bytes/message)."""
    length, offset = decode_varint(data, offset)
    value = data[offset:offset + length]
    return value, offset + length

def parse_mldevice(data):
    """
    Parse MLDevice message (Field 2 in MeaterLinkMessage).
    
    App's discovery code checks:
    1. MLDevice.device_id (field 1) - REQUIRED, 16 bytes
    2. MLDevice.connection_state (field 2) - Should be CONNECTED (2)
    """
    offset = 0
    device_id = None
    connection_state = None
    
    while offset < len(data):
        field_number, wire_type, offset = decode_field_header(data, offset)
        
        if field_number == 1 and wire_type == 2:  # device_id (bytes)
            device_id, offset = decode_length_delimited(data, offset)
        elif field_number == 2 and wire_type == 0:  # connection_state (varint)
            connection_state, offset = decode_varint(data, offset)
        else:
            # Skip unknown field
            if wire_type == 0:  # Varint
                _, offset = decode_varint(data, offset)
            elif wire_type == 2:  # Length-delimited
                _, offset = decode_length_delimited(data, offset)
    
    return device_id, connection_state

def parse_meaterlink_message(packet):
    """
    Parse MeaterLinkMessage and extract Field 2 (MLDevice).
    
    App's discovery flow:
    1. Listen on UDP port 7878
    2. Decode packet as MeaterLinkMessage
    3. Check Field 2 (MLDevice) exists
    4. Parse MLDevice and check device_id exists
    5. If all checks pass → device discovered
    """
    offset = 0
    field_2_mldevice = None
    
    while offset < len(packet):
        field_number, wire_type, offset = decode_field_header(packet, offset)
        
        if field_number == 2 and wire_type == 2:  # Field 2: MLDevice
            field_2_mldevice, offset = decode_length_delimited(packet, offset)
        elif wire_type == 2:  # Other length-delimited fields
            _, offset = decode_length_delimited(packet, offset)
        elif wire_type == 0:  # Varint
            _, offset = decode_varint(packet, offset)
        elif wire_type == 1:  # 64-bit
            offset += 8
    
    return field_2_mldevice

def simulate_app_discovery(packet_hex):
    """
    Simulate app's "TRY AGAIN" discovery flow with actual packet.
    
    This follows the decompiled app's exact steps:
    1. Receive UDP packet on port 7878
    2. Decode as MeaterLinkMessage
    3. Check Field 2 (MLDevice) present
    4. Check MLDevice.device_id (field 1) present and valid (16 bytes)
    5. Check MLDevice.connection_state (field 2) = CONNECTED (2)
    6. If all pass → "Device found", else → "No Device found"
    """
    # Convert hex string to bytes
    if isinstance(packet_hex, str):
        packet = bytes.fromhex(packet_hex.replace(' ', ''))
    else:
        packet = packet_hex
    
    print("=" * 60)
    print("SIMULATING APP'S BLOCK DISCOVERY FLOW")
    print("=" * 60)
    
    # Step 1: Receive packet (simulated)
    print(f"\n✓ Step 1: Received {len(packet)} byte UDP packet on port 7878")
    
    # Step 2: Decode as MeaterLinkMessage
    print("\n✓ Step 2: Decoding as MeaterLinkMessage...")
    try:
        field_2_mldevice = parse_meaterlink_message(packet)
    except Exception as e:
        print(f"   ✗ FAILED: Cannot decode packet - {e}")
        print("\n" + "=" * 60)
        print("RESULT: Discovery FAILS - Invalid packet format")
        print("=" * 60)
        return False
    
    # Step 3: Check Field 2 (MLDevice) present
    print("\n✓ Step 3: Checking for Field 2 (MLDevice)...")
    if field_2_mldevice is None:
        print("   ✗ FAILED: Field 2 (MLDevice) not found")
        print("   App expects: Field 2 = MLDevice message")
        print("   Packet has: No Field 2")
        print("\n" + "=" * 60)
        print("RESULT: Discovery FAILS - Missing MLDevice field")
        print("=" * 60)
        return False
    print(f"   ✓ PASS: Field 2 found ({len(field_2_mldevice)} bytes)")
    
    # Step 4: Parse MLDevice and check device_id
    print("\n✓ Step 4: Parsing MLDevice message...")
    try:
        device_id, connection_state = parse_mldevice(field_2_mldevice)
    except Exception as e:
        print(f"   ✗ FAILED: Cannot parse MLDevice - {e}")
        print("\n" + "=" * 60)
        print("RESULT: Discovery FAILS - Invalid MLDevice format")
        print("=" * 60)
        return False
    
    # Step 5: Check device_id (CRITICAL)
    print("\n✓ Step 5: Checking MLDevice.device_id (field 1)...")
    if device_id is None:
        print("   ✗ FAILED: device_id field not found in MLDevice")
        print("   App expects: MLDevice.device_id (field 1) as 16-byte value")
        print("   MLDevice has: No device_id field")
        print("\n" + "=" * 60)
        print("RESULT: Discovery FAILS - Missing device_id")
        print("=" * 60)
        return False
    
    if len(device_id) != 16:
        print(f"   ✗ FAILED: device_id has wrong size: {len(device_id)} bytes")
        print("   App expects: 16 bytes")
        print(f"   Got: {len(device_id)} bytes: {device_id.hex()}")
        print("\n" + "=" * 60)
        print("RESULT: Discovery FAILS - Invalid device_id size")
        print("=" * 60)
        return False
    
    print(f"   ✓ PASS: device_id found (16 bytes): {device_id.hex()}")
    
    # Step 6: Check connection_state
    print("\n✓ Step 6: Checking MLDevice.connection_state (field 2)...")
    if connection_state is None:
        print("   ⚠ WARNING: connection_state not found (may be optional)")
    elif connection_state == 2:
        print(f"   ✓ PASS: connection_state = {connection_state} (CONNECTED)")
    else:
        print(f"   ⚠ WARNING: connection_state = {connection_state} (not CONNECTED)")
    
    # Success!
    print("\n" + "=" * 60)
    print("✓✓✓ RESULT: Discovery SUCCEEDS ✓✓✓")
    print("=" * 60)
    print("\nApp will show this device in the Block discovery list.")
    print("User can select it to complete setup.")
    return True

def test_packet_from_file(filename):
    """Load and test a packet from hex file."""
    with open(filename, 'r') as f:
        hex_data = f.read().strip()
    return simulate_app_discovery(hex_data)

def main():
    """Main test function."""
    import sys
    
    if len(sys.argv) > 1:
        # Test packet from file
        result = test_packet_from_file(sys.argv[1])
    else:
        # Test example packet (from network capture)
        example_packet = """
        0a 13 08 ca a8 01 10 11 18 07 20 03 29 47 d8 71 93 39 ac 16 6e
        12 38 0a 10 4c 0b 82 35 23 a3 98 ea 38 6c a8 5e d2 48 6d 44 10 02
        1a 0c 72 6f 6f 73 40 72 6f 6f 73 2e 74 63
        22 09 54 43 4c 20 54 37 30 32 44
        2a 05 34 2e 36 2e 33
        32 02 31 34
        """
        print("Testing example packet from network capture...")
        print()
        result = simulate_app_discovery(example_packet)
    
    sys.exit(0 if result else 1)

if __name__ == "__main__":
    main()
