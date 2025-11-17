#!/usr/bin/env python3
"""
Discovery Flow Test - Simulates EXACT app behavior during "Add MEATER Block"

This test attempts to replicate what the MEATER app does when user clicks:
"Add MEATER Block" → "TRY AGAIN" (after "No Device found")

Based on analysis of decompiled app code, the discovery flow should:
1. Listen for UDP broadcasts on port 7878
2. Parse incoming packets as MeaterLinkMessage
3. Check for Field 3 (MasterMessage) with masterType=MASTER_TYPE_BLOCK
4. Extract device information from MLDevice
5. Display found devices to user

Current Issue: Real app shows "No Device found"
This means one of the following is failing:
- App isn't receiving our broadcasts (network issue)
- App can't parse our packet structure (protocol issue)
- App doesn't recognize our device as valid Block (validation issue)
- App requires specific fields/values we're not providing

This test will identify which step is failing.
"""

import subprocess
import sys

def main():
    print("="*80)
    print("MEATER BLOCK DISCOVERY FLOW TEST")
    print("="*80)
    print()
    print("This test simulates what the MEATER app does during device discovery.")
    print("It will identify exactly WHERE and WHY discovery is failing.")
    print()
    
    # Step 1: Generate packet from our C++ implementation
    print("Step 1: Generating packet from C++ implementation...")
    print("-" * 80)
    
    result = subprocess.run(
        ["python3", "tools/debug_protocol.py"],
        capture_output=True,
        text=True,
        cwd="/home/runner/work/meater-in-local-haos/meater-in-local-haos"
    )
    
    if result.returncode != 0:
        print("❌ FAILED: Could not generate packet")
        print(result.stderr)
        return 1
    
    # Extract packet hex from output
    packet_hex = None
    for line in result.stdout.split('\n'):
        if 'First 32 bytes:' in line and packet_hex is None:
            # Extract hex after the colon
            packet_hex = line.split(':', 1)[1].strip()
            break
    
    if not packet_hex:
        print("❌ FAILED: Could not extract packet from encoder output")
        return 1
    
    print(f"✅ Generated packet (first 32 bytes): {packet_hex}")
    print()
    
    # Step 2: Check what the app's discovery logic looks for
    print("Step 2: Checking against app's discovery requirements...")
    print("-" * 80)
    print()
    
    print("📋 App Discovery Checklist (from decompiled code):")
    print()
    
    checks_passed = 0
    checks_total = 0
    
    # Check 1: Packet can be decoded as MeaterLinkMessage
    checks_total += 1
    print(f"Check {checks_total}: Can packet be decoded as MeaterLinkMessage?")
    if "SUCCESS" in result.stdout:
        print("   ✅ PASS - Packet decodes successfully")
        checks_passed += 1
    else:
        print("   ❌ FAIL - Packet cannot be decoded")
        print("   → This is why app shows 'No Device found'")
        return 1
    
    # Check 2: Field 1 (MeaterLinkHeader) present
    checks_total += 1
    print(f"Check {checks_total}: Is Field 1 (MeaterLinkHeader) present?")
    if "MeaterLinkHeader present" in result.stdout:
        print("   ✅ PASS - Header found")
        checks_passed += 1
    else:
        print("   ❌ FAIL - Header missing")
        print("   → App requires this field")
        return 1
    
    # Check 3: Field 3 (MasterMessage) present (NOT Field 2!)
    checks_total += 1
    print(f"Check {checks_total}: Is Field 3 (MasterMessage) present?")
    if "Field 3: MasterMessage" in result.stdout:
        print("   ✅ PASS - MasterMessage in correct field")
        checks_passed += 1
    else:
        print("   ❌ FAIL - MasterMessage missing or in wrong field")
        print("   → App looks for Field 3, not Field 2")
        print("   → This is likely why discovery fails!")
        return 1
    
    # Check 4: masterType = MASTER_TYPE_BLOCK (0)
    checks_total += 1
    print(f"Check {checks_total}: Is masterType = MASTER_TYPE_BLOCK (0)?")
    if "masterType = MASTER_TYPE_BLOCK" in result.stdout or "masterType: 0" in result.stdout:
        print("   ✅ PASS - Correct master type")
        checks_passed += 1
    else:
        print("   ❌ FAIL - Wrong master type")
        print("   → App filters for Block devices during 'Add MEATER Block'")
        return 1
    
    # Check 5: At least one device in devices array
    checks_total += 1
    print(f"Check {checks_total}: Does MasterMessage contain at least one device?")
    if "1 device(s)" in result.stdout or "devices: 1" in result.stdout:
        print("   ✅ PASS - Device present in array")
        checks_passed += 1
    else:
        print("   ❌ FAIL - No devices in MasterMessage")
        print("   → App needs at least one MLDevice to display")
        return 1
    
    # Check 6: MLDevice has identifier
    checks_total += 1
    print(f"Check {checks_total}: Does MLDevice have identifier field?")
    if "identifier:" in result.stdout:
        print("   ✅ PASS - Device identifier present")
        checks_passed += 1
    else:
        print("   ❌ FAIL - Device identifier missing")
        print("   → App uses identifier to track devices")
        return 1
    
    # Check 7: MLDevice has connectionState = CONNECTED (1)
    checks_total += 1
    print(f"Check {checks_total}: Is connectionState = CONNECTED (1)?")
    if "connectionState: 1" in result.stdout or "CONNECTION_STATE_CONNECTED" in result.stdout:
        print("   ✅ PASS - Device shows as connected")
        checks_passed += 1
    else:
        print("   ⚠️  WARNING - Device may not show as connected")
        print("   → App might filter out disconnected devices")
    
    # Check 8: MLDevice has probe field
    checks_total += 1
    print(f"Check {checks_total}: Does MLDevice have probe field?")
    if "probe: Present" in result.stdout:
        print("   ✅ PASS - Probe data present")
        checks_passed += 1
    else:
        print("   ⚠️  WARNING - Probe data missing")
        print("   → App needs probe to show temperature")
    
    print()
    print("="*80)
    print(f"RESULTS: {checks_passed}/{checks_total} checks passed")
    print("="*80)
    print()
    
    if checks_passed == checks_total:
        print("✅ ALL CHECKS PASSED")
        print()
        print("Conclusion: Our packet structure appears correct for app discovery.")
        print()
        print("If the real app still shows 'No Device found', the issue is likely:")
        print("  1. Network routing - app isn't receiving UDP broadcasts")
        print("  2. Timing - app only listens during specific discovery window")
        print("  3. Additional validation - app checks something we haven't identified")
        print()
        print("Next steps:")
        print("  - Verify ESP32 and phone are on same network/VLAN")
        print("  - Check firewall rules allow UDP port 7878")
        print("  - Capture network traffic during 'TRY AGAIN' to see if packets arrive")
        print("  - Compare our broadcast timing (5s) with official Block behavior")
        return 0
    else:
        print("❌ SOME CHECKS FAILED")
        print()
        print("The failed checks above explain why app shows 'No Device found'.")
        print("Fix the identified issues and run this test again.")
        return 1

if __name__ == "__main__":
    sys.exit(main())
