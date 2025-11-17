#!/usr/bin/env python3
"""Test current implementation from meater_udp_broadcast.h"""
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

def encode_string(field_num, text):
    return encode_length_delimited(field_num, text.encode('utf-8'))

# Build packet EXACTLY as current meater_udp_broadcast.h does (lines 400-466)
packet = bytearray()

# Field 1: MeaterLinkHeader (lines 400-407)
header = bytearray()
header += encode_varint_field(1, 21578)       # meaterLinkIdentifier = 21578
header += encode_varint_field(2, 17)          # versionMajor = 17
header += encode_varint_field(3, 7)           # versionMinor = 7
header += encode_varint_field(4, 1)           # messageNumber = 1
header += encode_fixed64(5, 0xd0d0AABBCCDDEE11)  # deviceID (from MAC)
packet += encode_length_delimited(1, bytes(header))

# Field 2: SubscriptionMessage (lines 409-466)
# Test WITH probe data (lines 415-446)
subscription_msg = bytearray()

# Probe data (16 bytes: 8 temp + 2 battery + 6 padding)
probe_data = bytearray()
probe_data += bytes([0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07])  # 8 temp bytes
probe_data += bytes([0x50, 0x00])  # 2 battery bytes (80%)
probe_data += bytes([0x00] * 6)    # 6 padding bytes
subscription_msg += encode_length_delimited(1, bytes(probe_data))

subscription_msg += encode_varint_field(2, 2)                      # status = 2
subscription_msg += encode_string(3, "meater@esp32.local")         # username
subscription_msg += encode_string(4, "ESP32-C3")                   # device_model
subscription_msg += encode_string(5, "4.6.3")                      # app_version
subscription_msg += encode_string(6, "14")                         # unknown

packet += encode_length_delimited(2, bytes(subscription_msg))

print("Packet hex:", packet.hex())
print("Packet length:", len(packet), "bytes")
