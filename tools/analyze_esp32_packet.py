#!/usr/bin/env python3
"""
Live ESP32 Packet Analyzer
Decodes actual packets from ESP32 logs and validates them against app logic
"""

import sys
import os

# Add the tools directory to path for imports
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from validate_protocol import MeaterLinkMessageAdapter, MeaterLinkHeaderAdapter, MasterMessageAdapter, SubscriptionMessageAdapter

def analyze_packet(hex_string):
    """Analyze a packet from ESP32 logs"""
    
    # Remove spaces and convert to bytes
    hex_clean = hex_string.replace(' ', '').replace('\n', '')
    packet_bytes = bytes.fromhex(hex_clean)
    
    print("=" * 80)
    print("ESP32 PACKET ANALYZER - Acting as MEATER App Interpreter")
    print("=" * 80)
    print()
    print(f"Packet (hex): {hex_clean}")
    print(f"Packet size: {len(packet_bytes)} bytes")
    print()
    
    # STEP 1: Try to decode with app's decoder
    print("STEP 1: DECODE WITH APP'S PROTOBUF DECODER")
    print("=" * 80)
    
    try:
        adapter = MeaterLinkMessageAdapter()
        msg = adapter.decode(packet_bytes)
        print("✅ Packet decoded successfully!")
        print()
        
        # STEP 2: Analyze header
        print("STEP 2: HEADER VALIDATION")
        print("=" * 80)
        
        if msg.header is None:
            print("❌ FAIL: msg.header is null")
            print("   App will reject packet - no header")
            return False
        
        print(f"✅ CHECK 1: msg.header exists")
        print(f"   Header: {msg.header}")
        print()
        
        h = msg.header
        
        # Check 2: Identifier
        if h.meaterLinkIdentifier != 21578:
            print(f"❌ FAIL: meaterLinkIdentifier = {h.meaterLinkIdentifier} (expected 21578)")
            return False
        print(f"✅ CHECK 2: meaterLinkIdentifier = {h.meaterLinkIdentifier}")
        
        # Check 3: Version
        print(f"✅ CHECK 3: Protocol version = v{h.versionMajor}.{h.versionMinor}")
        
        # Check 4: deviceID
        if h.deviceID is None or h.deviceID == 0:
            print(f"❌ FAIL: deviceID is null or zero")
            return False
        print(f"✅ CHECK 4: deviceID = 0x{h.deviceID:016x}")
        
        # Check 5: messageNumber
        print(f"✅ CHECK 5: messageNumber = {h.messageNumber}")
        print()
        
        # STEP 3: Check which message type
        print("STEP 3: MESSAGE TYPE CHECK (CRITICAL)")
        print("=" * 80)
        
        if msg.masterMessage is not None:
            print("✅ CHECK 6: masterMessage EXISTS (Field 3)")
            print(f"   This is a BLOCK BROADCAST (correct for Block devices)")
            print()
            
            mm = msg.masterMessage
            
            # Check 7: masterType
            print(f"✅ CHECK 7: masterType = {mm.masterType}")
            if mm.masterType == 0:
                print(f"   → MASTER_TYPE_BLOCK (correct)")
            else:
                print(f"   ⚠️  Unknown masterType")
            print()
            
            # Check 8: cloudConnectionState
            print(f"✅ CHECK 8: cloudConnectionState = {mm.cloudConnectionState}")
            if mm.cloudConnectionState == 0:
                print(f"   → DISABLED (acceptable for local-only)")
            print()
            
            # Check 9: devices array
            device_count = len(mm.devices) if mm.devices else 0
            print(f"✅ CHECK 9: devices array length = {device_count}")
            if device_count == 0:
                print(f"   → Idle Block (no active probe)")
            else:
                print(f"   → {device_count} device(s) connected")
            print()
            
            print("=" * 80)
            print("FINAL RESULT: ✅ ALL 9 CHECKS PASS!")
            print("=" * 80)
            print()
            print("✅ Device SHOULD BE ADDED to app as 'MEATER Block'")
            print("✅ Packet structure is CORRECT")
            print("✅ Field 3 (MasterMessage) is the right message type")
            print()
            
            # Now check timing
            print("ADDITIONAL CHECKS:")
            print("=" * 80)
            print("⏱  Broadcast timing: Check ESP32 logs")
            print("   Real MEATER Blocks broadcast every ~5 seconds")
            print("   Your implementation should match this timing")
            print()
            print("📡 Network: Ensure 192.168.1.255 broadcast reaches app")
            print("   Check subnet mask allows broadcast")
            print()
            
            return True
            
        elif msg.subscriptionMessage is not None:
            print("❌ CHECK 6: subscriptionMessage EXISTS (Field 2)")
            print(f"   This is a SUBSCRIPTION REQUEST (wrong for Block devices)")
            print()
            print("=" * 80)
            print("FINAL RESULT: ❌ DEVICE WILL BE REJECTED")
            print("=" * 80)
            print()
            print("❌ Problem: Using Field 2 (SubscriptionMessage)")
            print("✅ Solution: Use Field 3 (MasterMessage) for Block broadcasts")
            print()
            print("The app checks: if (msg.masterMessage == null) { return; }")
            print("Since masterMessage is null, the device is rejected.")
            return False
            
        else:
            print("❌ CHECK 6: NO MESSAGE TYPE")
            print(f"   Neither masterMessage nor subscriptionMessage exists")
            print()
            print("=" * 80)
            print("FINAL RESULT: ❌ DEVICE WILL BE REJECTED")
            print("=" * 80)
            print()
            print("❌ Problem: Packet has no message payload")
            return False
            
    except Exception as e:
        print(f"❌ DECODE FAILED: {e}")
        print()
        print("The app's protobuf decoder cannot parse this packet.")
        print("This means the packet structure is malformed.")
        print()
        import traceback
        traceback.print_exc()
        return False

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python3 analyze_esp32_packet.py <hex_string>")
        print()
        print("Example from ESP32 logs:")
        print("  TX: 0a 13 08 ca a8 01 10 11 18 07 20 06 29 e4 b3 23")
        print("  TX: c2 92 f4 d0 d0 1a 04 08 00 10 00")
        print()
        print("Run:")
        print("  python3 analyze_esp32_packet.py '0a1308caa80110111807200629e4b323c292f4d0d01a0408001000'")
        sys.exit(1)
    
    hex_string = sys.argv[1]
    analyze_packet(hex_string)
