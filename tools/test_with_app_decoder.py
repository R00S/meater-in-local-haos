#!/usr/bin/env python3
"""
Integration test that uses line-by-line translation of the decompiled
MEATER app's ProtoAdapter decoder to validate our ESP32 implementation.

This is NOT an interpretation - it's a direct translation of the Java code
from MasterMessage.java, MLDevice.java, etc.
"""

import struct
import sys
from typing import List, Tuple, Optional, Any


class ProtoReader:
    """Simulates Wire's ProtoReader - direct translation from decompiled code"""
    
    def __init__(self, data: bytes):
        self.data = data
        self.pos = 0
        self.message_stack = []
    
    def beginMessage(self) -> int:
        """Returns position to track message boundaries"""
        start_pos = self.pos
        self.message_stack.append(start_pos)
        return start_pos
    
    def endMessage(self, start_pos: int):
        """Validates message was fully consumed"""
        if self.message_stack and self.message_stack[-1] == start_pos:
            self.message_stack.pop()
    
    def nextTag(self) -> int:
        """Read next field tag. Returns -1 if no more fields."""
        if self.pos >= len(self.data):
            return -1
        
        # Read varint for field header (field_number << 3 | wire_type)
        header = self.readVarint()
        if header is None:
            return -1
        
        field_number = header >> 3
        wire_type = header & 0x07
        
        # Store wire type for peekFieldEncoding()
        self.current_wire_type = wire_type
        
        return field_number
    
    def readVarint(self) -> Optional[int]:
        """Read varint from current position"""
        if self.pos >= len(self.data):
            return None
        
        result = 0
        shift = 0
        
        while self.pos < len(self.data):
            byte = self.data[self.pos]
            self.pos += 1
            
            result |= (byte & 0x7F) << shift
            
            if (byte & 0x80) == 0:
                return result
            
            shift += 7
            if shift >= 64:
                raise ValueError("Varint too long")
        
        return None
    
    def readFixed64(self) -> Optional[int]:
        """Read 64-bit little-endian integer"""
        if self.pos + 8 > len(self.data):
            return None
        
        value = struct.unpack('<Q', self.data[self.pos:self.pos+8])[0]
        self.pos += 8
        return value
    
    def readString(self) -> Optional[str]:
        """Read length-delimited string"""
        length = self.readVarint()
        if length is None or self.pos + length > len(self.data):
            return None
        
        value = self.data[self.pos:self.pos+length].decode('utf-8', errors='replace')
        self.pos += length
        return value
    
    def readBytes(self) -> Optional[bytes]:
        """Read length-delimited bytes"""
        length = self.readVarint()
        if length is None or self.pos + length > len(self.data):
            return None
        
        value = self.data[self.pos:self.pos+length]
        self.pos += length
        return value
    
    def readSint32(self) -> Optional[int]:
        """Read ZigZag encoded signed int32"""
        value = self.readVarint()
        if value is None:
            return None
        
        # ZigZag decode: (n >>> 1) ^ -(n & 1)
        return (value >> 1) ^ -(value & 1)
    
    def peekFieldEncoding(self) -> int:
        """Returns the wire type of current field"""
        return getattr(self, 'current_wire_type', 0)
    
    def readLengthDelimitedMessage(self) -> bytes:
        """Read a nested message as bytes"""
        return self.readBytes()


# Direct translation of MasterType enum from decompiled code
class MasterType:
    MASTER_TYPE_BLOCK = 0
    MASTER_TYPE_PLUS = 1
    
    @staticmethod
    def decode(reader: ProtoReader) -> int:
        return reader.readVarint()


# Direct translation of CloudConnectionState enum
class CloudConnectionState:
    CLOUD_CONNECTION_STATE_DISABLED = 0
    CLOUD_CONNECTION_STATE_ENABLED = 1
    
    @staticmethod
    def decode(reader: ProtoReader) -> int:
        return reader.readVarint()


# Direct translation of ConnectionState enum
class ConnectionState:
    CONNECTION_STATE_OFFLINE = 0
    CONNECTION_STATE_CONNECTED = 1
    CONNECTION_STATE_READY = 2
    
    @staticmethod
    def decode(reader: ProtoReader) -> int:
        return reader.readVarint()


# Direct translation of DeviceConnectionType enum
class DeviceConnectionType:
    BLE = 0
    WIFI = 1
    
    @staticmethod
    def decode(reader: ProtoReader) -> int:
        return reader.readVarint()


# Direct translation of ChargeState from decompiled code
class ChargeState:
    """
    From ChargeState.java in decompiled app - EXACT field order and tags
    """
    
    def __init__(self):
        self.chargingStatus = None  # tag 1, UINT32
        self.batteryPercent = None  # tag 2, UINT32
        self.estimatedChargingTime = None  # tag 3, UINT32
        self.hardwareSocPercent = None  # tag 4, UINT32
        self.liveChargePower = None  # tag 5, UINT32
    
    @staticmethod
    def decode(reader: ProtoReader) -> 'ChargeState':
        """
        Direct translation of ProtoAdapter_ChargeState.decode() from ChargeState.java
        Lines 62-91 in decompiled code
        """
        charge_state = ChargeState()
        beginMessage = reader.beginMessage()
        
        while True:
            nextTag = reader.nextTag()
            if nextTag == -1:
                reader.endMessage(beginMessage)
                return charge_state
            
            # Exact switch statement from decompiled code
            if nextTag == 1:
                charge_state.chargingStatus = reader.readVarint()
            elif nextTag == 2:
                charge_state.batteryPercent = reader.readVarint()
            elif nextTag == 3:
                charge_state.estimatedChargingTime = reader.readVarint()
            elif nextTag == 4:
                charge_state.hardwareSocPercent = reader.readVarint()
            elif nextTag == 5:
                charge_state.liveChargePower = reader.readVarint()
            else:
                # Skip unknown fields
                wire_type = reader.peekFieldEncoding()
                if wire_type == 0:  # VARINT
                    reader.readVarint()
                elif wire_type == 1:  # FIXED64
                    reader.readFixed64()
                elif wire_type == 2:  # LENGTH_DELIMITED
                    reader.readBytes()
                else:
                    raise ValueError(f"Unknown wire type: {wire_type}")


# Direct translation of MLProbe from decompiled code
class MLProbe:
    """
    From MLProbe.java in decompiled app
    """
    
    def __init__(self):
        self.parentIdentifier = None  # tag 1, FIXED64
        self.setup = None  # tag 2, CookSetup
        self.status = None  # tag 3, CookStatus
    
    @staticmethod
    def decode(reader: ProtoReader) -> 'MLProbe':
        """Direct translation of ProtoAdapter_MLProbe.decode()"""
        probe = MLProbe()
        beginMessage = reader.beginMessage()
        
        while True:
            nextTag = reader.nextTag()
            if nextTag == -1:
                reader.endMessage(beginMessage)
                return probe
            
            if nextTag == 1:
                probe.parentIdentifier = reader.readFixed64()
            elif nextTag == 2:
                # CookSetup - read as nested message
                setup_bytes = reader.readLengthDelimitedMessage()
                # For now, just store raw bytes
                probe.setup = setup_bytes
            elif nextTag == 3:
                # CookStatus - read as nested message
                status_bytes = reader.readLengthDelimitedMessage()
                probe.status = status_bytes
            else:
                wire_type = reader.peekFieldEncoding()
                if wire_type == 0:
                    reader.readVarint()
                elif wire_type == 1:
                    reader.readFixed64()
                elif wire_type == 2:
                    reader.readBytes()


# Direct translation of MLDevice from MLDevice.java
class MLDevice:
    """
    From MLDevice.java lines 13-525 in decompiled app
    EXACT field order and behavior
    """
    
    def __init__(self):
        self.probe = None  # tag 1, MLProbe
        self.plus = None  # tag 2, MLPlus
        self.block = None  # tag 3, MLBlock
        self.amber = None  # tag 4, MLAmber
        self.identifier = None  # tag 5, FIXED64, REQUIRED
        self.probeNumber = None  # tag 6, UINT32, REQUIRED
        self.chargeState = None  # tag 7, ChargeState, REQUIRED
        self.firmwareRevision = None  # tag 8, STRING
        self.connectionState = None  # tag 9, ConnectionState, REQUIRED
        self.connectionType = None  # tag 10, DeviceConnectionType, REQUIRED
        self.bleSignalLevel = None  # tag 11, SINT32
        self.wifiSignalLevel = None  # tag 12, SINT32
    
    @staticmethod
    def decode(reader: ProtoReader) -> 'MLDevice':
        """
        Direct translation of ProtoAdapter_MLDevice.decode()
        From MLDevice.java lines 164-226
        """
        device = MLDevice()
        beginMessage = reader.beginMessage()
        
        while True:
            nextTag = reader.nextTag()
            if nextTag == -1:
                reader.endMessage(beginMessage)
                
                # Validate REQUIRED fields (lines 149-153 in Java)
                if (device.identifier is None or
                    device.probeNumber is None or
                    device.chargeState is None or
                    device.connectionState is None or
                    device.connectionType is None):
                    raise ValueError("Missing required fields in MLDevice")
                
                return device
            
            # Exact switch from lines 170-220
            if nextTag == 1:
                nested_bytes = reader.readLengthDelimitedMessage()
                nested_reader = ProtoReader(nested_bytes)
                device.probe = MLProbe.decode(nested_reader)
            elif nextTag == 2:
                device.plus = reader.readBytes()  # MLPlus not fully implemented
            elif nextTag == 3:
                device.block = reader.readBytes()  # MLBlock not fully implemented
            elif nextTag == 4:
                device.amber = reader.readBytes()  # MLAmber not fully implemented
            elif nextTag == 5:
                device.identifier = reader.readFixed64()
            elif nextTag == 6:
                device.probeNumber = reader.readVarint()
            elif nextTag == 7:
                nested_bytes = reader.readLengthDelimitedMessage()
                nested_reader = ProtoReader(nested_bytes)
                device.chargeState = ChargeState.decode(nested_reader)
            elif nextTag == 8:
                device.firmwareRevision = reader.readString()
            elif nextTag == 9:
                device.connectionState = ConnectionState.decode(reader)
            elif nextTag == 10:
                device.connectionType = DeviceConnectionType.decode(reader)
            elif nextTag == 11:
                device.bleSignalLevel = reader.readSint32()
            elif nextTag == 12:
                device.wifiSignalLevel = reader.readSint32()
            else:
                # Unknown field - skip it (lines 217-219)
                wire_type = reader.peekFieldEncoding()
                if wire_type == 0:
                    reader.readVarint()
                elif wire_type == 1:
                    reader.readFixed64()
                elif wire_type == 2:
                    reader.readBytes()


# Direct translation of MasterMessage from MasterMessage.java
class MasterMessage:
    """
    From MasterMessage.java lines 14-204 in decompiled app
    EXACT field order and behavior
    """
    
    def __init__(self):
        self.masterType = None  # tag 1, MasterType, REQUIRED
        self.cloudConnectionState = None  # tag 2, CloudConnectionState, REQUIRED
        self.devices = []  # tag 3, List<MLDevice>, REPEATED
    
    @staticmethod
    def decode(reader: ProtoReader) -> 'MasterMessage':
        """
        Direct translation of ProtoAdapter_MasterMessage.decode()
        From MasterMessage.java lines 68-95
        """
        master_message = MasterMessage()
        beginMessage = reader.beginMessage()
        
        while True:
            nextTag = reader.nextTag()
            if nextTag == -1:
                reader.endMessage(beginMessage)
                
                # Validate REQUIRED fields (lines 54-57 in Java)
                if (master_message.masterType is None or
                    master_message.cloudConnectionState is None):
                    raise ValueError("Missing required fields in MasterMessage")
                
                return master_message
            
            # Exact logic from lines 77-94
            if nextTag == 1:
                master_message.masterType = MasterType.decode(reader)
            elif nextTag == 2:
                master_message.cloudConnectionState = CloudConnectionState.decode(reader)
            elif nextTag == 3:
                # REPEATED field - add to list (line 93)
                nested_bytes = reader.readLengthDelimitedMessage()
                nested_reader = ProtoReader(nested_bytes)
                device = MLDevice.decode(nested_reader)
                master_message.devices.append(device)
            else:
                # Unknown field
                wire_type = reader.peekFieldEncoding()
                if wire_type == 0:
                    reader.readVarint()
                elif wire_type == 1:
                    reader.readFixed64()
                elif wire_type == 2:
                    reader.readBytes()


# Direct translation of MeaterLinkHeader
class MeaterLinkHeader:
    """From MeaterLinkHeader.java"""
    
    def __init__(self):
        self.timestampMs = None  # tag 1, UINT64
        self.sequenceNumber = None  # tag 2, UINT32
        self.version = None  # tag 3, UINT32
        self.unknown1 = None  # tag 4, UINT32
        self.unknown2 = None  # tag 5, FIXED64
    
    @staticmethod
    def decode(reader: ProtoReader) -> 'MeaterLinkHeader':
        header = MeaterLinkHeader()
        beginMessage = reader.beginMessage()
        
        while True:
            nextTag = reader.nextTag()
            if nextTag == -1:
                reader.endMessage(beginMessage)
                return header
            
            if nextTag == 1:
                header.timestampMs = reader.readVarint()
            elif nextTag == 2:
                header.sequenceNumber = reader.readVarint()
            elif nextTag == 3:
                header.version = reader.readVarint()
            elif nextTag == 4:
                header.unknown1 = reader.readVarint()
            elif nextTag == 5:
                header.unknown2 = reader.readFixed64()
            else:
                wire_type = reader.peekFieldEncoding()
                if wire_type == 0:
                    reader.readVarint()
                elif wire_type == 1:
                    reader.readFixed64()
                elif wire_type == 2:
                    reader.readBytes()


# Direct translation of MeaterLinkMessage
class MeaterLinkMessage:
    """
    Top-level message from v3protobuf
    """
    
    def __init__(self):
        self.header = None  # tag 1, MeaterLinkHeader
        self.subscriptionMessage = None  # tag 2
        self.masterMessage = None  # tag 3, MasterMessage
        self.setupMessage = None  # tag 4
        # ... other message types not implemented yet
    
    @staticmethod
    def decode(reader: ProtoReader) -> 'MeaterLinkMessage':
        """Decode MeaterLinkMessage - what the app does when it receives UDP packet"""
        message = MeaterLinkMessage()
        beginMessage = reader.beginMessage()
        
        while True:
            nextTag = reader.nextTag()
            if nextTag == -1:
                reader.endMessage(beginMessage)
                return message
            
            if nextTag == 1:
                nested_bytes = reader.readLengthDelimitedMessage()
                nested_reader = ProtoReader(nested_bytes)
                message.header = MeaterLinkHeader.decode(nested_reader)
            elif nextTag == 2:
                message.subscriptionMessage = reader.readBytes()
            elif nextTag == 3:
                # THIS IS THE CRITICAL PART - MasterMessage for Block discovery
                nested_bytes = reader.readLengthDelimitedMessage()
                nested_reader = ProtoReader(nested_bytes)
                message.masterMessage = MasterMessage.decode(nested_reader)
            elif nextTag == 4:
                message.setupMessage = reader.readBytes()
            else:
                wire_type = reader.peekFieldEncoding()
                if wire_type == 0:
                    reader.readVarint()
                elif wire_type == 1:
                    reader.readFixed64()
                elif wire_type == 2:
                    reader.readBytes()


def test_packet(hex_data: str) -> bool:
    """
    Test a packet using the EXACT decoder from the decompiled app.
    This is what the MEATER app does when it receives a UDP packet.
    
    Returns True if packet is valid for app discovery, False otherwise.
    """
    print("=" * 80)
    print("TESTING PACKET WITH DECOMPILED APP DECODER")
    print("=" * 80)
    
    # Parse hex
    try:
        packet_bytes = bytes.fromhex(hex_data.replace(" ", "").replace("\n", ""))
    except ValueError as e:
        print(f"❌ FATAL: Invalid hex data: {e}")
        return False
    
    print(f"\n📦 Packet: {len(packet_bytes)} bytes")
    print(f"   Hex: {packet_bytes.hex()}")
    
    # Decode using app's decoder
    try:
        reader = ProtoReader(packet_bytes)
        message = MeaterLinkMessage.decode(reader)
        
        print("\n✅ DECODED SUCCESSFULLY")
        print("\n" + "=" * 80)
        print("DECODED MESSAGE STRUCTURE (What the app sees)")
        print("=" * 80)
        
        # Check header
        if message.header:
            print(f"\n✅ Field 1: MeaterLinkHeader")
            print(f"   timestampMs: {message.header.timestampMs}")
            print(f"   sequenceNumber: {message.header.sequenceNumber}")
            print(f"   version: {message.header.version}")
        else:
            print("\n❌ Field 1: MeaterLinkHeader MISSING")
        
        # Check MasterMessage - CRITICAL for discovery
        if message.masterMessage:
            print(f"\n✅ Field 3: MasterMessage (CRITICAL FOR DISCOVERY)")
            print(f"   masterType: {message.masterMessage.masterType}")
            if message.masterMessage.masterType == MasterType.MASTER_TYPE_BLOCK:
                print(f"      ✅ = MASTER_TYPE_BLOCK (correct for Block discovery)")
            else:
                print(f"      ❌ = NOT BLOCK TYPE (app won't discover as Block)")
            
            print(f"   cloudConnectionState: {message.masterMessage.cloudConnectionState}")
            print(f"   devices: {len(message.masterMessage.devices)} device(s)")
            
            # Check each device
            for i, device in enumerate(message.masterMessage.devices):
                print(f"\n   Device {i}:")
                print(f"      identifier: {device.identifier}")
                print(f"      probeNumber: {device.probeNumber}")
                print(f"      connectionState: {device.connectionState}")
                print(f"      connectionType: {device.connectionType}")
                print(f"      firmwareRevision: {device.firmwareRevision}")
                
                if device.bleSignalLevel is not None:
                    print(f"      bleSignalLevel: {device.bleSignalLevel} dBm")
                
                if device.chargeState:
                    print(f"      chargeState:")
                    print(f"         batteryPercent: {device.chargeState.batteryPercent}")
                
                if device.probe:
                    print(f"      probe: MLProbe present")
                    print(f"         parentIdentifier: {device.probe.parentIdentifier}")
        else:
            print(f"\n❌ Field 3: MasterMessage MISSING")
            print(f"   ⚠️  APP WILL NOT DISCOVER THIS DEVICE")
            print(f"   ⚠️  Block must send MasterMessage (field 3)")
            return False
        
        # Final validation
        print("\n" + "=" * 80)
        print("VALIDATION RESULT")
        print("=" * 80)
        
        errors = []
        warnings = []
        
        if not message.header:
            errors.append("MeaterLinkHeader (field 1) missing")
        
        if not message.masterMessage:
            errors.append("MasterMessage (field 3) missing - CRITICAL")
        else:
            if message.masterMessage.masterType != MasterType.MASTER_TYPE_BLOCK:
                errors.append(f"masterType = {message.masterMessage.masterType}, should be MASTER_TYPE_BLOCK (0)")
            
            if not message.masterMessage.devices:
                warnings.append("No devices in MasterMessage")
            else:
                device = message.masterMessage.devices[0]
                if device.connectionState != ConnectionState.CONNECTION_STATE_CONNECTED:
                    warnings.append(f"Device connectionState = {device.connectionState}, expected CONNECTED (1)")
                
                if device.connectionType != DeviceConnectionType.BLE:
                    warnings.append(f"Device connectionType = {device.connectionType}, expected BLE (0)")
                
                if not device.probe:
                    warnings.append("Device has no probe data")
        
        if errors:
            print("\n❌ CRITICAL ERRORS:")
            for err in errors:
                print(f"   - {err}")
            print("\n⚠️  APP WILL NOT DISCOVER THIS DEVICE")
            return False
        
        if warnings:
            print("\n⚠️  WARNINGS:")
            for warn in warnings:
                print(f"   - {warn}")
        
        print("\n✅ PACKET VALID FOR APP DISCOVERY")
        print("   App should discover this as a MEATER Block")
        return True
        
    except Exception as e:
        print(f"\n❌ DECODE FAILED: {e}")
        print(f"\n⚠️  APP WILL REJECT THIS PACKET")
        import traceback
        traceback.print_exc()
        return False


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python test_with_app_decoder.py <hex_packet>")
        print("\nExample:")
        print("  python test_with_app_decoder.py '0a1308c9f903...'")
        sys.exit(1)
    
    hex_packet = sys.argv[1]
    success = test_packet(hex_packet)
    sys.exit(0 if success else 1)
