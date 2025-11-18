#!/usr/bin/env python3
"""
Live Packet Validator - Acts as MEATER App Interpreter

Validates actual packets captured from ESP32 and shows exactly where
they pass or fail in the app's device addition logic.
"""

import sys
import subprocess

def hex_to_bytes(hex_str):
    """Convert hex string to bytes"""
    hex_str = hex_str.replace(' ', '').replace(':', '').replace('\n', '')
    return bytes.fromhex(hex_str)

def validate_packet(packet_hex):
    """Validate a packet using the Java decoder"""
    
    print("=" * 80)
    print("LIVE PACKET VALIDATOR - MEATER App Interpreter")
    print("=" * 80)
    print()
    print(f"Packet (hex): {packet_hex}")
    print(f"Packet size: {len(hex_to_bytes(packet_hex))} bytes")
    print()
    
    # Create temporary test file
    test_code = f"""
import sys
sys.path.insert(0, '/home/runner/work/meater-in-local-haos/meater-in-local-haos/tools')

from test_with_app_decoder import *

# Decode the packet
packet_bytes = bytes.fromhex('{packet_hex}')
print("STEP 1: PACKET DECODE")
print("=" * 80)
decoded = decode_meater_link_message(packet_bytes)
print()

if decoded is None:
    print("❌ DECODER FAILED - Packet is malformed")
    print("   The app will ignore this packet completely.")
    sys.exit(1)

print("✅ Decoder succeeded!")
print()
print("Decoded message structure:")
print(f"  header: {{decoded.header}}")
print(f"  subscriptionMessage: {{decoded.subscriptionMessage}}")
print(f"  masterMessage: {{decoded.masterMessage}}")
print()

print("STEP 2: DEVICE ADDITION CHECKS")
print("=" * 80)
print()

# CHECK 1: Header exists
print("CHECK 1: msg.header exists")
if decoded.header is None:
    print("   ❌ FAIL - No header found")
    print("   Java code: if (msg.header == null) {{ return; }}")
    sys.exit(1)
print("   ✅ PASS")
print()

# CHECK 2: meaterLinkIdentifier
print("CHECK 2: meaterLinkIdentifier == 21578")
if decoded.header.meaterLinkIdentifier != 21578:
    print(f"   ❌ FAIL - Got {{decoded.header.meaterLinkIdentifier}}, expected 21578")
    print("   Java code: if (header.meaterLinkIdentifier != 21578) {{ return; }}")
    sys.exit(1)
print(f"   ✅ PASS - meaterLinkIdentifier = {{decoded.header.meaterLinkIdentifier}}")
print()

# CHECK 3: Protocol version
print("CHECK 3: Protocol version")
if decoded.header.versionMajor is None or decoded.header.versionMinor is None:
    print("   ❌ FAIL - Missing version")
    sys.exit(1)
print(f"   ✅ PASS - v{{decoded.header.versionMajor}}.{{decoded.header.versionMinor}}")
print()

# CHECK 4: deviceID exists
print("CHECK 4: deviceID exists")
if decoded.header.deviceID is None:
    print("   ❌ FAIL - No deviceID")
    print("   Java code: if (header.deviceID == null) {{ return; }}")
    sys.exit(1)
print(f"   ✅ PASS - deviceID = 0x{{decoded.header.deviceID:016x}}")
print()

# CHECK 5: messageNumber exists  
print("CHECK 5: messageNumber exists")
if decoded.header.messageNumber is None:
    print("   ❌ FAIL - No messageNumber")
    sys.exit(1)
print(f"   ✅ PASS - messageNumber = {{decoded.header.messageNumber}}")
print()

# CHECK 6: masterMessage exists (CRITICAL - determines if Block broadcast)
print("CHECK 6: masterMessage exists (Field 3 - Block broadcast)")
print("   Java code: if (msg.masterMessage == null) {{ return; }}")
if decoded.masterMessage is None:
    print("   ❌ FAIL - No masterMessage (Field 3)")
    print()
    print("   DIAGNOSIS:")
    print("   - Field 3 (masterMessage) is missing")
    print("   - App expects Block broadcasts to use Field 3")
    print("   - Without Field 3, app treats packet as client subscription (Field 2)")
    print("   - Device will NOT be added to registry")
    print()
    if decoded.subscriptionMessage is not None:
        print("   Note: Field 2 (subscriptionMessage) is present")
        print("         This is for app→block communication, not Block broadcasts")
    sys.exit(1)
print("   ✅ PASS - masterMessage exists (Field 3)")
print()

# CHECK 7: masterType
print("CHECK 7: masterType == MASTER_TYPE_BLOCK (0)")
if decoded.masterMessage.masterType != 0:
    print(f"   ❌ FAIL - masterType = {{decoded.masterMessage.masterType}}, expected 0")
    print("   Java code: if (masterMessage.masterType != MASTER_TYPE_BLOCK) {{ return; }}")
    sys.exit(1)
print(f"   ✅ PASS - masterType = {{decoded.masterMessage.masterType}} (MASTER_TYPE_BLOCK)")
print()

# CHECK 8: cloudConnectionState
print("CHECK 8: cloudConnectionState present")
if decoded.masterMessage.cloudConnectionState is None:
    print("   ❌ FAIL - Missing cloudConnectionState")
    sys.exit(1)
print(f"   ✅ PASS - cloudConnectionState = {{decoded.masterMessage.cloudConnectionState}}")
print()

# CHECK 9: devices array
print("CHECK 9: devices array valid")
if decoded.masterMessage.devices is None:
    print("   ❌ FAIL - devices is null")
    sys.exit(1)
device_count = len(decoded.masterMessage.devices) if decoded.masterMessage.devices else 0
print(f"   ✅ PASS - devices array has {{device_count}} device(s)")
print()

print("=" * 80)
print("FINAL RESULT: ALL 9 CHECKS PASSED!")
print("=" * 80)
print()
print("✅ Device WOULD BE SUCCESSFULLY ADDED to app!")
print()
print(f"Device will appear as: 'MEATER Block' (deviceID: 0x{{decoded.header.deviceID:016x}})")
if device_count == 0:
    print("Status: Idle (no active probe)")
else:
    print(f"Status: Active ({{device_count}} probe(s) connected)")
print()
"""
    
    with open('/tmp/validate_live.py', 'w') as f:
        f.write(test_code)
    
    # Run the validation
    result = subprocess.run(
        ['python3', '/tmp/validate_live.py'],
        capture_output=True,
        text=True
    )
    
    print(result.stdout)
    if result.stderr:
        print("ERRORS:", result.stderr)
    
    return result.returncode == 0

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Usage: python3 validate_live_packet.py <hex_packet>")
        print()
        print("Example from your logs:")
        print("  TX: 0a 13 08 ca a8 01 10 11 18 07 20 06 29 e4 b3 23 c2 92 f4 d0 d0 1a 04 08 00 10 00")
        print()
        print("Run:")
        print("  python3 validate_live_packet.py '0a1308caa80110111807200629e4b323c292f4d0d01a0408001000'")
        sys.exit(1)
    
    packet_hex = sys.argv[1]
    success = validate_packet(packet_hex)
    sys.exit(0 if success else 1)
