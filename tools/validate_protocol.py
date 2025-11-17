#!/usr/bin/env python3
"""
MEATER Link Protocol Validator

Simulates the MEATER app's protobuf decoder to validate ESP32 broadcasts.
Based on decompiled app code from meater_app/v3protobuf/*.java
"""

import struct
import sys
from typing import Tuple, List, Dict, Any

class ProtobufDecoder:
    """Wire format protobuf decoder matching the MEATER app implementation"""
    
    def __init__(self, data: bytes):
        self.data = data
        self.pos = 0
    
    def read_byte(self) -> int:
        if self.pos >= len(self.data):
            raise ValueError("Unexpected end of data")
        b = self.data[self.pos]
        self.pos += 1
        return b
    
    def read_varint(self) -> int:
        """Decode varint (wire type 0)"""
        result = 0
        shift = 0
        while True:
            b = self.read_byte()
            result |= (b & 0x7F) << shift
            if (b & 0x80) == 0:
                break
            shift += 7
        return result
    
    def read_sint32(self) -> int:
        """Decode ZigZag encoded sint32"""
        n = self.read_varint()
        return (n >> 1) ^ (-(n & 1))
    
    def read_fixed64(self) -> int:
        """Decode fixed64 (wire type 1)"""
        if self.pos + 8 > len(self.data):
            raise ValueError("Not enough data for fixed64")
        value = struct.unpack('<Q', self.data[self.pos:self.pos+8])[0]
        self.pos += 8
        return value
    
    def read_length_delimited(self) -> bytes:
        """Decode length-delimited field (wire type 2)"""
        length = self.read_varint()
        if self.pos + length > len(self.data):
            raise ValueError(f"Not enough data for length-delimited field (need {length} bytes)")
        data = self.data[self.pos:self.pos+length]
        self.pos += length
        return data
    
    def read_field_header(self) -> Tuple[int, int]:
        """Read field number and wire type"""
        tag = self.read_varint()
        field_number = tag >> 3
        wire_type = tag & 0x07
        return field_number, wire_type
    
    def skip_field(self, wire_type: int):
        """Skip unknown field"""
        if wire_type == 0:  # varint
            self.read_varint()
        elif wire_type == 1:  # fixed64
            self.pos += 8
        elif wire_type == 2:  # length-delimited
            length = self.read_varint()
            self.pos += length
        elif wire_type == 5:  # fixed32
            self.pos += 4
        else:
            raise ValueError(f"Unknown wire type: {wire_type}")


def decode_meater_link_header(data: bytes) -> Dict[str, Any]:
    """Decode MeaterLinkHeader (field 1)"""
    decoder = ProtobufDecoder(data)
    header = {}
    
    while decoder.pos < len(data):
        field_num, wire_type = decoder.read_field_header()
        
        if field_num == 1:  # timestamp_ms
            header['timestamp_ms'] = decoder.read_varint()
        elif field_num == 2:  # sequence
            header['sequence'] = decoder.read_varint()
        elif field_num == 3:  # version
            header['version'] = decoder.read_varint()
        elif field_num == 4:  # unknown1
            header['unknown1'] = decoder.read_varint()
        elif field_num == 5:  # unknown2 (fixed64)
            header['unknown2'] = hex(decoder.read_fixed64())
        else:
            print(f"  [WARN] Unknown header field {field_num}")
            decoder.skip_field(wire_type)
    
    return header


def decode_cook_status(data: bytes) -> Dict[str, Any]:
    """Decode CookStatus"""
    decoder = ProtobufDecoder(data)
    status = {}
    
    while decoder.pos < len(data):
        field_num, wire_type = decoder.read_field_header()
        
        if field_num == 1:  # internalTemperature (sint32)
            status['internalTemperature'] = decoder.read_sint32()
        elif field_num == 2:  # ambientTemperature (sint32)
            status['ambientTemperature'] = decoder.read_sint32()
        elif field_num == 3:  # peakTemperature (sint32)
            status['peakTemperature'] = decoder.read_sint32()
        elif field_num == 4:  # remainingCookTime (sint32)
            status['remainingCookTime'] = decoder.read_sint32()
        elif field_num == 5:  # elapsedTime (uint32)
            status['elapsedTime'] = decoder.read_varint()
        elif field_num == 6:  # totalRemainingTime (sint32)
            status['totalRemainingTime'] = decoder.read_sint32()
        else:
            decoder.skip_field(wire_type)
    
    return status


def decode_cook_setup(data: bytes) -> Dict[str, Any]:
    """Decode CookSetup"""
    decoder = ProtobufDecoder(data)
    setup = {}
    
    while decoder.pos < len(data):
        field_num, wire_type = decoder.read_field_header()
        
        if field_num == 1:  # sequenceNumber
            setup['sequenceNumber'] = decoder.read_varint()
        elif field_num == 2:  # state
            setup['state'] = decoder.read_varint()
        elif field_num == 3:  # targetInternalTemperature
            setup['targetInternalTemperature'] = decoder.read_sint32()
        elif field_num == 99:  # lastItem
            setup['lastItem'] = decoder.read_varint()
        else:
            decoder.skip_field(wire_type)
    
    return setup


def decode_ml_probe(data: bytes) -> Dict[str, Any]:
    """Decode MLProbe"""
    decoder = ProtobufDecoder(data)
    probe = {}
    
    while decoder.pos < len(data):
        field_num, wire_type = decoder.read_field_header()
        
        if field_num == 1:  # parentIdentifier (fixed64)
            probe['parentIdentifier'] = hex(decoder.read_fixed64())
        elif field_num == 3:  # setup (CookSetup)
            setup_data = decoder.read_length_delimited()
            probe['setup'] = decode_cook_setup(setup_data)
        elif field_num == 4:  # status (CookStatus)
            status_data = decoder.read_length_delimited()
            probe['status'] = decode_cook_status(status_data)
        else:
            decoder.skip_field(wire_type)
    
    return probe


def decode_charge_state(data: bytes) -> Dict[str, Any]:
    """Decode ChargeState"""
    decoder = ProtobufDecoder(data)
    charge = {}
    
    while decoder.pos < len(data):
        field_num, wire_type = decoder.read_field_header()
        
        if field_num == 1:  # chargingStatus
            charge['chargingStatus'] = decoder.read_varint()
        elif field_num == 2:  # batteryLevelPercent
            charge['batteryLevelPercent'] = decoder.read_varint()
        elif field_num == 3:  # batteryMinutesRemaining
            charge['batteryMinutesRemaining'] = decoder.read_varint()
        else:
            decoder.skip_field(wire_type)
    
    return charge


def decode_ml_device(data: bytes) -> Dict[str, Any]:
    """Decode MLDevice"""
    decoder = ProtobufDecoder(data)
    device = {}
    
    while decoder.pos < len(data):
        field_num, wire_type = decoder.read_field_header()
        
        if field_num == 1:  # probe (MLProbe)
            probe_data = decoder.read_length_delimited()
            device['probe'] = decode_ml_probe(probe_data)
        elif field_num == 5:  # identifier (fixed64)
            device['identifier'] = hex(decoder.read_fixed64())
        elif field_num == 6:  # probeNumber
            device['probeNumber'] = decoder.read_varint()
        elif field_num == 7:  # chargeState
            charge_data = decoder.read_length_delimited()
            device['chargeState'] = decode_charge_state(charge_data)
        elif field_num == 8:  # firmwareRevision
            device['firmwareRevision'] = decoder.read_length_delimited().decode('utf-8')
        elif field_num == 9:  # connectionState
            device['connectionState'] = decoder.read_varint()
        elif field_num == 10:  # connectionType
            device['connectionType'] = decoder.read_varint()
        elif field_num == 11:  # bleSignalLevel
            device['bleSignalLevel'] = decoder.read_sint32()
        elif field_num == 12:  # wifiSignalLevel
            device['wifiSignalLevel'] = decoder.read_sint32()
        else:
            print(f"  [WARN] Unknown MLDevice field {field_num}")
            decoder.skip_field(wire_type)
    
    return device


def decode_master_message(data: bytes) -> Dict[str, Any]:
    """Decode MasterMessage (field 3)"""
    decoder = ProtobufDecoder(data)
    master = {}
    
    while decoder.pos < len(data):
        field_num, wire_type = decoder.read_field_header()
        
        if field_num == 1:  # masterType
            master_type = decoder.read_varint()
            master['masterType'] = master_type
            master['masterTypeName'] = {
                0: 'MASTER_TYPE_BLOCK',
                1: 'MASTER_TYPE_IOS',
                2: 'MASTER_TYPE_ANDROID',
                3: 'MASTER_TYPE_PROBE_SIM',
                4: 'MASTER_TYPE_BLOCK_V2_2P',
                5: 'MASTER_TYPE_BLOCK_V2_4P'
            }.get(master_type, f'UNKNOWN({master_type})')
        elif field_num == 2:  # cloudConnectionState
            cloud_state = decoder.read_varint()
            master['cloudConnectionState'] = cloud_state
            master['cloudConnectionStateName'] = {
                0: 'CLOUD_CONNECTION_STATE_DISABLED',
                1: 'CLOUD_CONNECTION_STATE_OFFLINE',
                2: 'CLOUD_CONNECTION_STATE_CONNECTING',
                3: 'CLOUD_CONNECTION_STATE_CONNECTED'
            }.get(cloud_state, f'UNKNOWN({cloud_state})')
        elif field_num == 3:  # devices (repeated MLDevice)
            device_data = decoder.read_length_delimited()
            if 'devices' not in master:
                master['devices'] = []
            master['devices'].append(decode_ml_device(device_data))
        else:
            print(f"  [WARN] Unknown MasterMessage field {field_num}")
            decoder.skip_field(wire_type)
    
    return master


def decode_meater_link_message(data: bytes) -> Dict[str, Any]:
    """Decode top-level MeaterLinkMessage"""
    decoder = ProtobufDecoder(data)
    message = {}
    
    print(f"\n=== Decoding {len(data)} byte packet ===")
    print(f"Hex: {data.hex()}\n")
    
    while decoder.pos < len(data):
        field_num, wire_type = decoder.read_field_header()
        
        if field_num == 1:  # header (MeaterLinkHeader - REQUIRED)
            header_data = decoder.read_length_delimited()
            message['header'] = decode_meater_link_header(header_data)
        elif field_num == 2:  # subscriptionMessage
            sub_data = decoder.read_length_delimited()
            message['subscriptionMessage'] = f"<{len(sub_data)} bytes>"
        elif field_num == 3:  # masterMessage
            master_data = decoder.read_length_delimited()
            message['masterMessage'] = decode_master_message(master_data)
        elif field_num == 4:  # setupMessage
            setup_data = decoder.read_length_delimited()
            message['setupMessage'] = f"<{len(setup_data)} bytes>"
        else:
            print(f"[WARN] Unknown MeaterLinkMessage field {field_num}")
            decoder.skip_field(wire_type)
    
    return message


def validate_packet(message: Dict[str, Any]) -> Tuple[List[str], List[str]]:
    """Validate decoded packet against MEATER app expectations"""
    errors = []
    warnings = []
    
    # Check required fields
    if 'header' not in message:
        errors.append("MISSING REQUIRED: MeaterLinkHeader (field 1)")
    else:
        header = message['header']
        if 'timestamp_ms' not in header:
            errors.append("MISSING REQUIRED: header.timestamp_ms")
        if 'sequence' not in header:
            errors.append("MISSING REQUIRED: header.sequence")
        if 'version' not in header:
            errors.append("MISSING REQUIRED: header.version")
        elif header['version'] != 7:
            warnings.append(f"Unexpected version: {header['version']} (expected 7)")
    
    if 'masterMessage' not in message:
        errors.append("MISSING REQUIRED: MasterMessage (field 3) - App won't recognize device!")
    else:
        master = message['masterMessage']
        
        if 'masterType' not in master:
            errors.append("MISSING REQUIRED: masterMessage.masterType")
        elif master['masterType'] != 0:
            warnings.append(f"masterType is {master['masterTypeName']}, not MASTER_TYPE_BLOCK (0)")
        
        if 'cloudConnectionState' not in master:
            errors.append("MISSING REQUIRED: masterMessage.cloudConnectionState")
        
        if 'devices' not in master or len(master['devices']) == 0:
            warnings.append("No devices in MasterMessage - Block appears empty")
        else:
            for i, device in enumerate(master['devices']):
                if 'identifier' not in device:
                    errors.append(f"MISSING REQUIRED: devices[{i}].identifier")
                if 'probeNumber' not in device:
                    errors.append(f"MISSING REQUIRED: devices[{i}].probeNumber")
                if 'connectionState' not in device:
                    errors.append(f"MISSING REQUIRED: devices[{i}].connectionState")
                if 'connectionType' not in device:
                    errors.append(f"MISSING REQUIRED: devices[{i}].connectionType")
                if 'probe' not in device:
                    warnings.append(f"devices[{i}] missing probe data (MLProbe)")
                else:
                    probe = device['probe']
                    if 'status' not in probe:
                        warnings.append(f"devices[{i}].probe missing CookStatus")
                    if 'setup' not in probe:
                        warnings.append(f"devices[{i}].probe missing CookSetup")
    
    return errors, warnings


def print_message(message: Dict[str, Any], indent: int = 0):
    """Pretty print decoded message"""
    prefix = "  " * indent
    
    for key, value in message.items():
        if isinstance(value, dict):
            print(f"{prefix}{key}:")
            print_message(value, indent + 1)
        elif isinstance(value, list):
            print(f"{prefix}{key}: [")
            for i, item in enumerate(value):
                if isinstance(item, dict):
                    print(f"{prefix}  [{i}]:")
                    print_message(item, indent + 2)
                else:
                    print(f"{prefix}  {item}")
            print(f"{prefix}]")
        else:
            print(f"{prefix}{key}: {value}")


def main():
    if len(sys.argv) < 2:
        print("Usage: python validate_protocol.py <hex_packet>")
        print("\nExample:")
        print("  python validate_protocol.py 0a13...")
        sys.exit(1)
    
    hex_packet = sys.argv[1].replace(" ", "").replace(":", "").replace("-", "")
    
    try:
        packet_data = bytes.fromhex(hex_packet)
    except ValueError as e:
        print(f"ERROR: Invalid hex string: {e}")
        sys.exit(1)
    
    try:
        message = decode_meater_link_message(packet_data)
        
        print("\n=== Decoded Message ===")
        print_message(message)
        
        print("\n=== Validation ===")
        errors, warnings = validate_packet(message)
        
        if errors:
            print("\n❌ ERRORS (packet will be rejected by app):")
            for error in errors:
                print(f"  - {error}")
        else:
            print("\n✅ No critical errors found")
        
        if warnings:
            print("\n⚠️  WARNINGS:")
            for warning in warnings:
                print(f"  - {warning}")
        
        if not errors and not warnings:
            print("\n🎉 Perfect! Packet should be recognized by MEATER app")
        
        sys.exit(0 if not errors else 1)
        
    except Exception as e:
        print(f"\n❌ DECODING ERROR: {e}")
        import traceback
        traceback.print_exc()
        sys.exit(1)


if __name__ == "__main__":
    main()
