#!/usr/bin/env python3
"""
Validate that the CONFIG_CHAR_UUID fix has been applied correctly.
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

def main():
    print_header("VALIDATING CONFIG_CHAR_UUID FIX")
    
    # Read the header file
    header_file = Path("includes/meater_bluedroid_server.h")
    
    if not header_file.exists():
        print_error("Header file not found!")
        return False
    
    with open(header_file, 'r') as f:
        content = f.read()
    
    # Extract CONFIG_CHAR_UUID bytes
    uuid_pattern = r'CONFIG_CHAR_UUID\[16\]\s*=\s*\{([^}]+)\}'
    match = re.search(uuid_pattern, content)
    
    if not match:
        print_error("Could not find CONFIG_CHAR_UUID definition")
        return False
    
    uuid_bytes_str = match.group(1)
    
    # Parse hex bytes
    hex_values = re.findall(r'0x([0-9a-fA-F]{2})', uuid_bytes_str)
    
    if len(hex_values) != 16:
        print_error(f"Expected 16 bytes, found {len(hex_values)}")
        return False
    
    uuid_bytes = [int(h, 16) for h in hex_values]
    
    # Convert to standard UUID format
    actual_uuid = bytes_to_uuid(uuid_bytes)
    
    print_info(f"CONFIG_CHAR_UUID in implementation:")
    print_info(f"  Bytes: {', '.join(f'0x{b:02x}' for b in uuid_bytes)}")
    print_info(f"  UUID:  {actual_uuid}")
    print()
    
    # Expected UUID from MEATER app
    expected_uuid = "caf28e64-3b17-4cb4-bb0a-2eaa33c47af7"
    
    print_info(f"Expected MEATERCookSetupBLECharacteristicUUID:")
    print_info(f"  UUID:  {expected_uuid}")
    print()
    
    # Compare
    if actual_uuid.lower() == expected_uuid.lower():
        print_success("CONFIG_CHAR_UUID is CORRECT!")
        print_info("The implementation now uses the correct Cook Setup UUID")
        print_info("that the MEATER app expects for pairing.")
        print()
        print_success("The pairing fix has been successfully applied.")
        return True
    else:
        print_error("CONFIG_CHAR_UUID is still WRONG!")
        print_info(f"Expected: {expected_uuid}")
        print_info(f"Got:      {actual_uuid}")
        print()
        print_error("The pairing fix has NOT been applied.")
        print_info("Please update CONFIG_CHAR_UUID to the correct value.")
        return False

if __name__ == "__main__":
    success = main()
    exit(0 if success else 1)
