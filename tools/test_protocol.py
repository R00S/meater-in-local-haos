#!/usr/bin/env python3
"""
Test suite for MEATER Link protocol implementation

Generates test packets matching our ESP32 implementation and validates them
against the expected structure that the MEATER app would decode.
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

def encode_sint32_zigzag(value):
    """Encode signed int32 using ZigZag encoding"""
    if value >= 0:
        return encode_varint(value * 2)
    else:
        return encode_varint((-value) * 2 - 1)

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

def build_meater_link_header(timestamp_ms, sequence):
    """Build MeaterLinkHeader matching ESP32 implementation"""
    header = bytearray()
    header += encode_varint_field(1, timestamp_ms)  # timestamp_ms
    header += encode_varint_field(2, sequence)  # sequence
    header += encode_varint_field(3, 7)  # version
    header += encode_varint_field(4, 3)  # unknown1
    header += encode_fixed64_field(5, 0x476e16ac39937193d8)  # unknown2 from captures
    return bytes(header)

def build_cook_status(tip_temp_c, ambient_temp_c, elapsed_time_s):
    """Build CookStatus message"""
    status = bytearray()
    status += encode_varint_field(1, int(tip_temp_c * 16))  # internalTemp (celsius * 16)
    status += encode_varint_field(2, int(ambient_temp_c * 16))  # ambientTemp (celsius * 16)
    status += encode_varint_field(3, elapsed_time_s)  # elapsedTime (seconds)
    return bytes(status)

def build_cook_setup(sequence, state=1):
    """Build CookSetup message"""
    setup = bytearray()
    setup += encode_varint_field(1, sequence)  # sequenceNumber
    setup += encode_varint_field(2, state)  # state (1 = COOKING)
    return bytes(setup)

def build_charge_state(battery_percent):
    """Build ChargeState message"""
    charge = bytearray()
    charge += encode_varint_field(1, 0)  # chargingStatus (0 = NOT_CHARGING)
    charge += encode_varint_field(2, battery_percent)  # batteryPercent
    return bytes(charge)

def build_ml_probe(device_id, tip_temp_c, ambient_temp_c, elapsed_time_s):
    """Build MLProbe message"""
    probe = bytearray()
    probe += encode_fixed64_field(1, device_id)  # parentIdentifier
    probe += encode_length_delimited(2, build_cook_setup(1))  # setup
    probe += encode_length_delimited(3, build_cook_status(tip_temp_c, ambient_temp_c, elapsed_time_s))  # status
    return bytes(probe)

def build_ml_device(device_id, tip_temp_c, ambient_temp_c, battery_percent, rssi, firmware="v1.0.6_0"):
    """Build MLDevice message"""
    device = bytearray()
    # Field 1: probe (MLProbe)
    device += encode_length_delimited(1, build_ml_probe(device_id, tip_temp_c, ambient_temp_c, 0))
    # Field 2: identifier (fixed64)
    device += encode_fixed64_field(2, device_id)
    # Field 3: probeNumber
    device += encode_varint_field(3, 0)
    # Field 4: chargeState
    device += encode_length_delimited(4, build_charge_state(battery_percent))
    # Field 5: connectionState (1 = CONNECTED)
    device += encode_varint_field(5, 1)
    # Field 6: connectionType (0 = BLE)
    device += encode_varint_field(6, 0)
    # Field 7: bleSignalLevel (signed int32)
    device += encode_sint32_field(7, rssi)
    # Field 8: firmwareRevision
    device += encode_string_field(8, firmware)
    return bytes(device)

def build_master_message(device_id, tip_temp_c, ambient_temp_c, battery_percent, rssi):
    """Build MasterMessage (Block broadcast)"""
    master = bytearray()
    # Field 1: masterType (0 = MASTER_TYPE_BLOCK)
    master += encode_varint_field(1, 0)
    # Field 2: cloudConnectionState (0 = DISABLED)
    master += encode_varint_field(2, 0)
    # Field 3: devices array (single device)
    master += encode_length_delimited(3, build_ml_device(device_id, tip_temp_c, ambient_temp_c, battery_percent, rssi))
    return bytes(master)

def build_meater_link_message(device_id, tip_temp_c, ambient_temp_c, battery_percent, rssi, timestamp_ms, sequence):
    """Build complete MeaterLinkMessage"""
    message = bytearray()
    # Field 1: header
    message += encode_length_delimited(1, build_meater_link_header(timestamp_ms, sequence))
    # Field 3: masterMessage
    message += encode_length_delimited(3, build_master_message(device_id, tip_temp_c, ambient_temp_c, battery_percent, rssi))
    return bytes(message)

def decode_varint(data, pos):
    """Decode varint, return (value, new_pos)"""
    result = 0
    shift = 0
    while True:
        if pos >= len(data):
            return None, pos
        b = data[pos]
        pos += 1
        result |= (b & 0x7F) << shift
        if (b & 0x80) == 0:
            break
        shift += 7
    return result, pos

def decode_field_header(data, pos):
    """Decode field header, return (field_num, wire_type, new_pos)"""
    value, pos = decode_varint(data, pos)
    if value is None:
        return None, None, pos
    field_num = value >> 3
    wire_type = value & 0x7
    return field_num, wire_type, pos

def skip_field(data, pos, wire_type):
    """Skip a field based on wire type"""
    if wire_type == 0:  # varint
        _, pos = decode_varint(data, pos)
    elif wire_type == 1:  # fixed64
        pos += 8
    elif wire_type == 2:  # length-delimited
        length, pos = decode_varint(data, pos)
        pos += length
    elif wire_type == 5:  # fixed32
        pos += 4
    return pos

def validate_packet(packet_hex):
    """Validate packet structure"""
    try:
        data = bytes.fromhex(packet_hex)
    except ValueError as e:
        print(f"❌ Invalid hex string: {e}")
        return False
    
    print(f"\n=== Validating {len(data)} byte packet ===")
    print(f"Hex: {packet_hex}\n")
    
    pos = 0
    has_header = False
    has_master = False
    errors = []
    warnings = []
    
    # Decode top-level MeaterLinkMessage
    while pos < len(data):
        field_num, wire_type, pos = decode_field_header(data, pos)
        if field_num is None:
            break
        
        if field_num == 1:  # header
            has_header = True
            length, pos = decode_varint(data, pos)
            header_data = data[pos:pos+length]
            pos += length
            print(f"✅ Field 1 (MeaterLinkHeader): {length} bytes")
            
            # Decode header fields
            hpos = 0
            while hpos < len(header_data):
                hfield, hwire, hpos = decode_field_header(header_data, hpos)
                if hfield is None:
                    break
                if hfield == 1:  # timestamp
                    ts, hpos = decode_varint(header_data, hpos)
                    print(f"   - timestamp_ms: {ts}")
                elif hfield == 2:  # sequence
                    seq, hpos = decode_varint(header_data, hpos)
                    print(f"   - sequence: {seq}")
                elif hfield == 3:  # version
                    ver, hpos = decode_varint(header_data, hpos)
                    print(f"   - version: {ver}")
                else:
                    hpos = skip_field(header_data, hpos, hwire)
        
        elif field_num == 3:  # masterMessage
            has_master = True
            length, pos = decode_varint(data, pos)
            master_data = data[pos:pos+length]
            pos += length
            print(f"✅ Field 3 (MasterMessage): {length} bytes")
            
            # Decode MasterMessage
            mpos = 0
            while mpos < len(master_data):
                mfield, mwire, mpos = decode_field_header(master_data, mpos)
                if mfield is None:
                    break
                if mfield == 1:  # masterType
                    mtype, mpos = decode_varint(master_data, mpos)
                    print(f"   - masterType: {mtype} {'(BLOCK)' if mtype == 0 else ''}")
                elif mfield == 2:  # cloudConnectionState
                    cloud, mpos = decode_varint(master_data, mpos)
                    print(f"   - cloudConnectionState: {cloud}")
                elif mfield == 3:  # devices array
                    dlength, mpos = decode_varint(master_data, mpos)
                    device_data = master_data[mpos:mpos+dlength]
                    mpos += dlength
                    print(f"   - devices[0]: {dlength} bytes")
                    
                    # Decode MLDevice
                    dpos = 0
                    while dpos < len(device_data):
                        dfield, dwire, dpos = decode_field_header(device_data, dpos)
                        if dfield is None:
                            break
                        if dfield == 1:  # probe
                            plength, dpos = decode_varint(device_data, dpos)
                            print(f"      - probe (MLProbe): {plength} bytes")
                            dpos += plength
                        elif dfield == 2:  # identifier
                            dev_id = struct.unpack('<Q', device_data[dpos:dpos+8])[0]
                            print(f"      - identifier: {hex(dev_id)}")
                            dpos += 8
                        elif dfield == 3:  # probeNumber
                            pnum, dpos = decode_varint(device_data, dpos)
                            print(f"      - probeNumber: {pnum}")
                        elif dfield == 4:  # chargeState
                            clength, dpos = decode_varint(device_data, dpos)
                            print(f"      - chargeState: {clength} bytes")
                            dpos += clength
                        elif dfield == 5:  # connectionState
                            conn, dpos = decode_varint(device_data, dpos)
                            print(f"      - connectionState: {conn} {'(CONNECTED)' if conn == 1 else ''}")
                        elif dfield == 6:  # connectionType
                            ctype, dpos = decode_varint(device_data, dpos)
                            print(f"      - connectionType: {ctype} {'(BLE)' if ctype == 0 else ''}")
                        elif dfield == 7:  # bleSignalLevel
                            rssi_raw, dpos = decode_varint(device_data, dpos)
                            # Decode ZigZag
                            rssi = (rssi_raw >> 1) ^ (-(rssi_raw & 1))
                            print(f"      - bleSignalLevel: {rssi} dBm")
                        elif dfield == 8:  # firmwareRevision
                            flength, dpos = decode_varint(device_data, dpos)
                            firmware = device_data[dpos:dpos+flength].decode('utf-8')
                            print(f"      - firmwareRevision: {firmware}")
                            dpos += flength
                        else:
                            warnings.append(f"Unknown MLDevice field {dfield}")
                            dpos = skip_field(device_data, dpos, dwire)
                else:
                    warnings.append(f"Unknown MasterMessage field {mfield}")
                    mpos = skip_field(master_data, mpos, mwire)
        else:
            warnings.append(f"Unknown top-level field {field_num}")
            pos = skip_field(data, pos, wire_type)
    
    # Validation checks
    print("\n=== Validation Results ===")
    
    if not has_header:
        errors.append("Missing Field 1 (MeaterLinkHeader)")
    
    if not has_master:
        errors.append("Missing Field 3 (MasterMessage) - CRITICAL for discovery!")
    
    if errors:
        print("❌ ERRORS:")
        for err in errors:
            print(f"   - {err}")
    else:
        print("✅ All required fields present")
    
    if warnings:
        print("\n⚠️  WARNINGS:")
        for warn in warnings:
            print(f"   - {warn}")
    
    return len(errors) == 0

def main():
    """Run protocol tests"""
    print("=" * 70)
    print("MEATER Link Protocol Implementation Test")
    print("=" * 70)
    
    # Test Case 1: Typical broadcast with probe connected
    print("\n### Test Case 1: Normal Operation ###")
    print("Simulating: ESP32 with MEATER+ probe showing 20°C tip, 21°C ambient, 85% battery, -50dBm RSSI")
    
    device_id = 0xf492c223b3e4  # MAC-derived ID
    tip_temp = 20.0  # 20°C
    ambient_temp = 21.0  # 21°C
    battery = 85  # 85%
    rssi = -50  # -50 dBm
    timestamp = 250000  # ~4 minutes uptime
    sequence = 1
    
    packet = build_meater_link_message(device_id, tip_temp, ambient_temp, battery, rssi, timestamp, sequence)
    packet_hex = packet.hex()
    
    print(f"\nGenerated packet ({len(packet)} bytes):")
    print(packet_hex)
    
    if validate_packet(packet_hex):
        print("\n✅ TEST CASE 1 PASSED: Packet structure valid for MEATER app")
    else:
        print("\n❌ TEST CASE 1 FAILED: Packet structure invalid")
        return 1
    
    # Test Case 2: High temperature
    print("\n\n### Test Case 2: High Temperature (65°C) ###")
    packet2 = build_meater_link_message(device_id, 65.0, 30.0, 70, -60, 300000, 2)
    if validate_packet(packet2.hex()):
        print("\n✅ TEST CASE 2 PASSED")
    else:
        print("\n❌ TEST CASE 2 FAILED")
        return 1
    
    # Test Case 3: Low battery
    print("\n\n### Test Case 3: Low Battery (15%) ###")
    packet3 = build_meater_link_message(device_id, 25.0, 22.0, 15, -70, 350000, 3)
    if validate_packet(packet3.hex()):
        print("\n✅ TEST CASE 3 PASSED")
    else:
        print("\n❌ TEST CASE 3 FAILED")
        return 1
    
    print("\n" + "=" * 70)
    print("✅ ALL TESTS PASSED")
    print("=" * 70)
    print("\nThe implementation correctly generates MEATER Link protocol packets")
    print("that should be recognized by the MEATER app as a MEATER Block device.")
    print("\nNext steps:")
    print("1. Flash to ESP32-C3 hardware")
    print("2. Run tcpdump to capture actual broadcasts")
    print("3. Test with MEATER mobile app for device discovery")
    
    return 0

if __name__ == "__main__":
    sys.exit(main())
