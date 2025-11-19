#!/usr/bin/env python3
"""
Comprehensive UUID validation for ESP32 MEATER BLE implementation.
Checks all UUIDs against the protocol requirements from the app.
"""

import re
from pathlib import Path

class Colors:
    GREEN = '\033[92m'
    RED = '\033[91m'
    YELLOW = '\033[93m'
    BLUE = '\033[94m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'

def print_header(text):
    print(f"\n{Colors.BOLD}{Colors.BLUE}{'=' * 70}{Colors.ENDC}")
    print(f"{Colors.BOLD}{Colors.BLUE}{text}{Colors.ENDC}")
    print(f"{Colors.BOLD}{Colors.BLUE}{'=' * 70}{Colors.ENDC}\n")

def print_success(text):
    print(f"{Colors.GREEN}✓{Colors.ENDC} {text}")

def print_error(text):
    print(f"{Colors.RED}✗{Colors.ENDC} {text}")

def print_info(text):
    print(f"  {text}")

def bytes_to_uuid(byte_array):
    """Convert reverse byte order array to standard UUID string"""
    reversed_bytes = list(reversed(byte_array))
    uuid_str = '-'.join([
        ''.join(f'{b:02x}' for b in reversed_bytes[0:4]),
        ''.join(f'{b:02x}' for b in reversed_bytes[4:6]),
        ''.join(f'{b:02x}' for b in reversed_bytes[6:8]),
        ''.join(f'{b:02x}' for b in reversed_bytes[8:10]),
        ''.join(f'{b:02x}' for b in reversed_bytes[10:16])
    ])
    return uuid_str

def extract_uuid_from_header(content, var_name):
    """Extract UUID bytes from header file"""
    pattern = rf'{var_name}\[16\]\s*=\s*\{{([^}}]+)\}}'
    match = re.search(pattern, content, re.DOTALL)
    
    if not match:
        return None
    
    uuid_bytes_str = match.group(1)
    hex_values = re.findall(r'0x([0-9a-fA-F]{{2}})', uuid_bytes_str)
    
    if len(hex_values) != 16:
        return None
    
    uuid_bytes = [int(h, 16) for h in hex_values]
    return bytes_to_uuid(uuid_bytes)

def extract_short_uuid_from_header(content, var_name):
    """Extract 16-bit UUID from header file"""
    pattern = rf'{var_name}\s*=\s*0x([0-9a-fA-F]{{4}})'
    match = re.search(pattern, content)
    
    if not match:
        return None
    
    return f"0000{match.group(1).lower()}-0000-1000-8000-00805f9b34fb"

def main():
    print_header("COMPREHENSIVE UUID VALIDATION")
    print_info("Checking all BLE UUIDs in ESP32 implementation")
    print_info("against MEATER protocol requirements\n")
    
    # Read the header file
    header_file = Path("includes/meater_bluedroid_server.h")
    
    if not header_file.exists():
        print_error("Header file not found!")
        return False
    
    with open(header_file, 'r') as f:
        content = f.read()
    
    # Define expected UUIDs from MEATER app protocol
    expected_uuids = {
        'MEATER_SERVICE_UUID': 'a75cc7fc-c956-488f-ac2a-2dbc08b63a04',
        'TEMP_CHAR_UUID': '7edda774-045e-4bbf-909b-45d1991a2876',
        'BATTERY_CHAR_UUID': '2adb4877-68d8-4884-bd3c-d83853bf27b8',
        'CONFIG_CHAR_UUID': 'caf28e64-3b17-4cb4-bb0a-2eaa33c47af7',  # MEATERCookSetupBLECharacteristicUUID
        'DEVICE_INFO_SERVICE_UUID': '0000180a-0000-1000-8000-00805f9b34fb',
        'FIRMWARE_CHAR_UUID': '00002a26-0000-1000-8000-00805f9b34fb',
    }
    
    all_correct = True
    
    # Check 128-bit UUIDs
    print_info("Checking 128-bit UUIDs:")
    for var_name in ['MEATER_SERVICE_UUID', 'TEMP_CHAR_UUID', 'BATTERY_CHAR_UUID', 'CONFIG_CHAR_UUID']:
        expected = expected_uuids[var_name]
        actual = extract_uuid_from_header(content, var_name)
        
        if actual is None:
            print_error(f"{var_name}: NOT FOUND")
            all_correct = False
        elif actual.lower() == expected.lower():
            print_success(f"{var_name}: {actual}")
        else:
            print_error(f"{var_name}: MISMATCH")
            print_info(f"  Expected: {expected}")
            print_info(f"  Got:      {actual}")
            all_correct = False
    
    print()
    print_info("Checking 16-bit UUIDs:")
    for var_name in ['DEVICE_INFO_SERVICE_UUID', 'FIRMWARE_CHAR_UUID']:
        expected = expected_uuids[var_name]
        actual = extract_short_uuid_from_header(content, var_name)
        
        if actual is None:
            print_error(f"{var_name}: NOT FOUND")
            all_correct = False
        elif actual.lower() == expected.lower():
            print_success(f"{var_name}: {actual}")
        else:
            print_error(f"{var_name}: MISMATCH")
            print_info(f"  Expected: {expected}")
            print_info(f"  Got:      {actual}")
            all_correct = False
    
    # Check firmware version
    print()
    print_info("Checking firmware version:")
    firmware_match = re.search(r'MEATER_FIRMWARE\s*=\s*"([^"]+)"', content)
    if firmware_match:
        firmware = firmware_match.group(1)
        if re.match(r'v\d+\.\d+\.\d+_\d+', firmware):
            print_success(f"Firmware format valid: {firmware}")
            probe_num = firmware.split('_')[1]
            if probe_num == '0':
                print_success(f"  Probe number correct: {probe_num} (standalone)")
            else:
                print_error(f"  Probe number should be 0, got: {probe_num}")
                all_correct = False
        else:
            print_error(f"Invalid firmware format: {firmware}")
            print_info("  Expected: v{major}.{minor}.{patch}_{probeNumber}")
            all_correct = False
    else:
        print_error("MEATER_FIRMWARE not found")
        all_correct = False
    
    # Summary
    print_header("VALIDATION RESULT")
    
    if all_correct:
        print_success("ALL UUIDs ARE CORRECT!")
        print()
        print_info("The ESP32 implementation now has:")
        print_info("  ✓ Correct MEATER Service UUID")
        print_info("  ✓ Correct Temperature Characteristic UUID")
        print_info("  ✓ Correct Battery Characteristic UUID")
        print_info("  ✓ Correct Cook Setup Characteristic UUID (pairing)")
        print_info("  ✓ Correct Device Information Service UUID")
        print_info("  ✓ Correct Firmware Revision Characteristic UUID")
        print_info("  ✓ Valid firmware version format")
        print()
        print_success("The implementation should now pair successfully with the MEATER app!")
        return True
    else:
        print_error("SOME UUIDs ARE INCORRECT")
        print_info("Please review the errors above and fix the mismatched UUIDs.")
        return False

if __name__ == "__main__":
    success = main()
    exit(0 if success else 1)
