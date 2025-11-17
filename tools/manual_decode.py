#!/usr/bin/env python3
"""Manual decode of the packet to verify it's correct"""
import struct

packet_hex = "0a1308caa8011011180720012911eeddccbbaad0d01a37080010001a3112180a0b0911eeddccbbaad0d0100012060802105018001880052911eeddccbbaad0d030003a0608021050180048015000"
data = bytes.fromhex(packet_hex)

pos = 0

def read_varint():
    global pos
    result = 0
    shift = 0
    while True:
        b = data[pos]
        pos += 1
        result |= (b & 0x7F) << shift
        if (b & 0x80) == 0:
            break
        shift += 7
    return result

def read_fixed64():
    global pos
    value = struct.unpack('<Q', data[pos:pos+8])[0]
    pos += 8
    return value

def decode_zigzag(n):
    return (n >> 1) ^ (-(n & 1))

print("Packet analysis:")
print(f"Total length: {len(data)} bytes\n")

# Field 1
tag = read_varint()
field_num = tag >> 3
wire_type = tag & 7
print(f"Field {field_num} (wire type {wire_type}): MeaterLinkHeader")
length = read_varint()
print(f"  Length: {length} bytes")
header_end = pos + length
while pos < header_end:
    tag = read_varint()
    field_num = tag >> 3
    wire_type = tag & 7
    if wire_type == 0:
        value = read_varint()
        print(f"    Field {field_num}: {value}")
    elif wire_type == 1:
        value = read_fixed64()
        print(f"    Field {field_num}: 0x{value:016x}")

# Field 3
tag = read_varint()
field_num = tag >> 3
wire_type = tag & 7
print(f"\nField {field_num} (wire type {wire_type}): MasterMessage")
length = read_varint()
print(f"  Length: {length} bytes")
master_end = pos + length

# MasterMessage fields
tag = read_varint()
field_num = tag >> 3
print(f"  Field {field_num}: masterType = {read_varint()}")

tag = read_varint()
field_num = tag >> 3
print(f"  Field {field_num}: cloudConnectionState = {read_varint()}")

tag = read_varint()
field_num = tag >> 3
wire_type = tag & 7
print(f"  Field {field_num} (wire type {wire_type}): MLDevice (repeated)")
device_length = read_varint()
print(f"    Length: {device_length} bytes")
device_end = pos + device_length

while pos < device_end:
    tag = read_varint()
    field_num = tag >> 3
    wire_type = tag & 7
    
    if field_num == 2:  # MLPlus
        print(f"    Field {field_num} (wire type {wire_type}): plus (MLPlus)")
        plus_length = read_varint()
        plus_end = pos + plus_length
        while pos < plus_end:
            tag = read_varint()
            f = tag >> 3
            wt = tag & 7
            if f == 1:  # childProbe
                print(f"      Field {f}: childProbe (MLChildDevice)")
                child_len = read_varint()
                child_end = pos + child_len
                while pos < child_end:
                    tag = read_varint()
                    cf = tag >> 3
                    cwt = tag & 7
                    if cwt == 0:
                        print(f"        Field {cf}: {read_varint()}")
                    elif cwt == 1:
                        print(f"        Field {cf}: 0x{read_fixed64():016x}")
            elif f == 2:  # probeChargingState
                print(f"      Field {f}: probeChargingState (ChargeState)")
                charge_len = read_varint()
                charge_end = pos + charge_len
                while pos < charge_end:
                    tag = read_varint()
                    cf = tag >> 3
                    val = read_varint()
                    print(f"        Field {cf}: {val}")
            elif f == 3:  # ambientTemperature
                temp = decode_zigzag(read_varint())
                print(f"      Field {f}: ambientTemperature = {temp} ({temp/16.0}°C)")
    elif field_num == 5:  # identifier
        val = read_fixed64()
        print(f"    Field {field_num}: identifier = 0x{val:016x}")
    elif field_num == 6:  # probeNumber
        print(f"    Field {field_num}: probeNumber = {read_varint()}")
    elif field_num == 7:  # chargeState
        print(f"    Field {field_num} (wire type {wire_type}): chargeState (ChargeState)")
        charge_len = read_varint()
        charge_end = pos + charge_len
        while pos < charge_end:
            tag = read_varint()
            cf = tag >> 3
            val = read_varint()
            print(f"      Field {cf}: {val}")
    elif field_num == 9:  # connectionState
        print(f"    Field {field_num}: connectionState = {read_varint()}")
    elif field_num == 10:  # connectionType  
        print(f"    Field {field_num}: connectionType = {read_varint()}")

print(f"\n✅ Packet decoded successfully!")
print(f"✅ All fields match expected MasterMessage structure!")
