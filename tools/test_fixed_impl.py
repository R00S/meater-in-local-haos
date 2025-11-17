#!/usr/bin/env python3
"""Test the FIXED implementation that uses Field 3 (MasterMessage)"""
import struct

def encode_varint(value):
    result = bytearray()
    while value > 0x7F:
        result.append((value & 0x7F) | 0x80)
        value >>= 7
    result.append(value & 0x7F)
    return bytes(result)

def encode_sint32_zigzag(value):
    """ZigZag encoding for SINT32"""
    if value >= 0:
        zigzag = value << 1
    else:
        zigzag = ((-value) << 1) - 1
    return encode_varint(zigzag)

def encode_field_header(field_num, wire_type):
    return encode_varint((field_num << 3) | wire_type)

def encode_length_delimited(field_num, data):
    return encode_field_header(field_num, 2) + encode_varint(len(data)) + data

def encode_varint_field(field_num, value):
    return encode_field_header(field_num, 0) + encode_varint(value)

def encode_sint32_field(field_num, value):
    return encode_field_header(field_num, 0) + encode_sint32_zigzag(value)

def encode_fixed64(field_num, value):
    return encode_field_header(field_num, 1) + struct.pack('<Q', value)

# Build packet EXACTLY as FIXED meater_udp_broadcast.h does
packet = bytearray()

# Field 1: MeaterLinkHeader
header = bytearray()
header += encode_varint_field(1, 21578)       # meaterLinkIdentifier = 21578
header += encode_varint_field(2, 17)          # versionMajor = 17
header += encode_varint_field(3, 7)           # versionMinor = 7
header += encode_varint_field(4, 1)           # messageNumber = 1
header += encode_fixed64(5, 0xd0d0AABBCCDDEE11)  # deviceID
packet += encode_length_delimited(1, bytes(header))

# Field 3: MasterMessage
master_msg = bytearray()

# Field 1: masterType = 0 (MASTER_TYPE_BLOCK)
master_msg += encode_varint_field(1, 0)

# Field 2: cloudConnectionState = 0 (CLOUD_CONNECTION_STATE_DISABLED)
master_msg += encode_varint_field(2, 0)

# Field 3: devices (repeated MLDevice) - with probe data
mldevice = bytearray()

# Field 2: plus (MLPlus)
mlplus = bytearray()

# Field 1: childProbe (MLChildDevice)
child_probe = bytearray()
child_probe += encode_fixed64(1, 0xd0d0AABBCCDDEE11)  # identifier
child_probe += encode_varint_field(2, 0)               # probeNumber = 0
mlplus += encode_length_delimited(1, bytes(child_probe))

# Field 2: probeChargingState (ChargeState)
charge_state = bytearray()
charge_state += encode_varint_field(1, 2)      # chargingStatus = NOT_CHARGING (2)
charge_state += encode_varint_field(2, 80)     # batteryLevelPercent = 80
charge_state += encode_varint_field(3, 0)      # batteryMinutesRemaining = 0
mlplus += encode_length_delimited(2, bytes(charge_state))

# Field 3: ambientTemperature (SINT32) - example: 320 (20°C * 16)
mlplus += encode_sint32_field(3, 320)

mldevice += encode_length_delimited(2, bytes(mlplus))

# Field 5: identifier (FIXED64)
mldevice += encode_fixed64(5, 0xd0d0AABBCCDDEE11)

# Field 6: probeNumber (UINT32) = 0
mldevice += encode_varint_field(6, 0)

# Field 7: chargeState (ChargeState) - same as above
mldevice += encode_length_delimited(7, bytes(charge_state))

# Field 9: connectionState = 1 (CONNECTION_STATE_CONNECTED)
mldevice += encode_varint_field(9, 1)

# Field 10: connectionType = 0 (BLE)
mldevice += encode_varint_field(10, 0)

# Add MLDevice to MasterMessage
master_msg += encode_length_delimited(3, bytes(mldevice))

# Add MasterMessage to packet as Field 3
packet += encode_length_delimited(3, bytes(master_msg))

print("Packet hex:", packet.hex())
print("Packet length:", len(packet), "bytes")
