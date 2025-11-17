#!/usr/bin/env python3
"""Test with MasterMessage (Field 3) instead of SubscriptionMessage (Field 2)"""
import struct

def encode_varint(value):
    result = bytearray()
    while value > 0x7F:
        result.append((value & 0x7F) | 0x80)
        value >>= 7
    result.append(value & 0x7F)
    return bytes(result)

def encode_field_header(field_num, wire_type):
    return encode_varint((field_num << 3) | wire_type)

def encode_length_delimited(field_num, data):
    return encode_field_header(field_num, 2) + encode_varint(len(data)) + data

def encode_varint_field(field_num, value):
    return encode_field_header(field_num, 0) + encode_varint(value)

def encode_fixed64(field_num, value):
    return encode_field_header(field_num, 1) + struct.pack('<Q', value)

# Build packet with Field 3 (MasterMessage) instead of Field 2
packet = bytearray()

# Field 1: MeaterLinkHeader
header = bytearray()
header += encode_varint_field(1, 21578)       # meaterLinkIdentifier = 21578
header += encode_varint_field(2, 17)          # versionMajor = 17
header += encode_varint_field(3, 7)           # versionMinor = 7
header += encode_varint_field(4, 1)           # messageNumber = 1
header += encode_fixed64(5, 0xd0d0AABBCCDDEE11)  # deviceID
packet += encode_length_delimited(1, bytes(header))

# Field 3: MasterMessage (instead of Field 2: SubscriptionMessage)
master_msg = bytearray()
master_msg += encode_varint_field(1, 1)  # masterType = 1 (MASTER_TYPE_BLOCK)
master_msg += encode_varint_field(2, 0)  # cloudConnectionState = 0 (DISABLED)
# No devices yet (empty list)
packet += encode_length_delimited(3, bytes(master_msg))

print("Packet hex:", packet.hex())
print("Packet length:", len(packet), "bytes")
