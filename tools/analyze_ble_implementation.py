#!/usr/bin/env python3
"""
Analyze ESP32 BLE Implementation for Potential Issues

This script analyzes the BLE server implementation in the code
to identify potential issues that could prevent pairing.

Since we don't have physical hardware access, this performs static analysis
of the implementation against the verified protocol requirements.
"""

import re
import os
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

def print_warning(text):
    print(f"{Colors.YELLOW}⚠{Colors.ENDC} {text}")

def print_info(text):
    print(f"  {text}")

def analyze_ble_header():
    """Analyze the BLE server header file for issues"""
    print_header("ANALYZING BLE SERVER IMPLEMENTATION")
    
    header_file = Path("includes/meater_bluedroid_server.h")
    
    if not header_file.exists():
        print_error("BLE server header file not found!")
        return []
    
    with open(header_file, 'r') as f:
        content = f.read()
    
    issues = []
    
    # Check 1: Verify UUIDs are defined
    print_info("Checking UUID definitions...")
    
    required_uuids = {
        'MEATER_SERVICE_UUID': 'a75cc7fc-c956-488f-ac2a-2dbc08b63a04',
        'TEMP_CHAR_UUID': '7edda774-045e-4bbf-909b-45d1991a2876',
        'BATTERY_CHAR_UUID': '2adb4877-68d8-4884-bd3c-d83853bf27b8',
        'CONFIG_CHAR_UUID': '575d3bf1-0be4-4e8f-a41e-be090726ed0b',
    }
    
    for name, expected_uuid in required_uuids.items():
        if name in content:
            print_success(f"{name} defined")
        else:
            print_error(f"{name} NOT defined")
            issues.append(f"Missing UUID definition: {name}")
    
    # Check 2: Verify firmware version format
    print_info("\nChecking firmware version...")
    
    firmware_match = re.search(r'MEATER_FIRMWARE.*=.*"([^"]+)"', content)
    if firmware_match:
        firmware = firmware_match.group(1)
        print_info(f"  Current: {firmware}")
        
        # Validate format: v{major}.{minor}.{patch}_{probeNumber}
        if re.match(r'v\d+\.\d+\.\d+_\d+', firmware):
            print_success(f"Firmware format correct: {firmware}")
            probe_num = firmware.split('_')[1]
            if probe_num == '0':
                print_success("Probe number is 0 (standalone)")
            else:
                print_warning(f"Probe number is {probe_num} (expected 0 for standalone)")
                issues.append(f"Probe number should be 0, got {probe_num}")
        else:
            print_error(f"Invalid firmware format: {firmware}")
            print_info("  Expected: v{major}.{minor}.{patch}_{probeNumber}")
            print_info("  Example: v1.0.4_0")
            issues.append(f"Invalid firmware format: {firmware}")
    else:
        print_error("MEATER_FIRMWARE not found")
        issues.append("Missing firmware version definition")
    
    # Check 3: Verify advertising configuration
    print_info("\nChecking advertising configuration...")
    
    if 'esp_ble_adv_data_t' in content:
        print_success("Advertising data structure found")
        
        # Check for manufacturer data
        if 'manufacturer_len' in content and 'p_manufacturer_data' in content:
            print_success("Manufacturer data configured")
        else:
            print_warning("Manufacturer data may not be configured")
            print_info("  The MEATER app filters devices by manufacturer data")
            print_info("  Missing this could prevent device from appearing in scan")
            issues.append("Manufacturer data not configured in advertising")
        
        # Check for service UUID in advertising
        if 'service_uuid_len' in content or 'p_service_uuid' in content:
            print_success("Service UUID in advertising")
        else:
            print_error("Service UUID not in advertising")
            issues.append("Service UUID missing from advertising packet")
    else:
        print_warning("Cannot verify advertising configuration")
    
    # Check 4: Verify characteristic properties
    print_info("\nChecking characteristic properties...")
    
    # Temperature characteristic should have READ + NOTIFY
    temp_properties = []
    if 'ESP_GATT_CHAR_PROP_BIT_READ' in content:
        temp_properties.append('READ')
    if 'ESP_GATT_CHAR_PROP_BIT_NOTIFY' in content:
        temp_properties.append('NOTIFY')
    
    if len(temp_properties) >= 2:
        print_success(f"Temperature characteristic: {', '.join(temp_properties)}")
    else:
        print_warning(f"Temperature characteristic may be missing properties")
    
    # Config characteristic should have READ + WRITE
    if 'ESP_GATT_CHAR_PROP_BIT_WRITE' in content:
        print_success("Config characteristic has WRITE property")
    else:
        print_error("Config characteristic missing WRITE property")
        print_info("  This is CRITICAL for pairing!")
        issues.append("Config characteristic must have WRITE property")
    
    # Check 5: Verify pairing logic
    print_info("\nChecking pairing implementation...")
    
    if 'is_paired_' in content:
        print_success("Pairing state variable found")
        
        # Check for pairing timestamp
        if 'pairing_timestamp_' in content:
            print_success("Pairing timestamp tracked")
        else:
            print_warning("Pairing timestamp not tracked")
        
        # Check for write handler
        if 'ESP_GATTS_WRITE_EVT' in content:
            print_success("Write event handler present")
            
            # Check if write triggers pairing
            if re.search(r'is_paired_\s*=\s*true', content):
                print_success("Pairing state is set on write")
            else:
                print_warning("Pairing state may not be set correctly")
        else:
            print_error("Write event handler not found")
            issues.append("Write event handler missing")
    else:
        print_error("Pairing state not implemented")
        issues.append("Missing pairing state tracking")
    
    # Check 6: Data format
    print_info("\nChecking data format...")
    
    if 'temp_data_[8]' in content or 'temp_data_\[8\]' in content:
        print_success("Temperature data is 8 bytes")
    else:
        print_warning("Cannot verify temperature data size")
    
    if 'battery_data_[2]' in content or 'battery_data_\[2\]' in content:
        print_success("Battery data is 2 bytes")
    else:
        print_warning("Cannot verify battery data size")
    
    return issues

def check_config_uuid():
    """Verify the Config characteristic UUID matches the app's expectation"""
    print_header("VERIFYING CONFIG CHARACTERISTIC UUID")
    
    print_info("Checking old app code for Config UUID...")
    
    config_file = Path("meater_app/data/Config.java")
    if config_file.exists():
        with open(config_file, 'r') as f:
            content = f.read()
        
        # Search for Config characteristic UUID
        config_uuid_match = re.search(r'MEATERConfigBLECharacteristicUUID\s*=\s*"([^"]+)"', content)
        if config_uuid_match:
            expected_uuid = config_uuid_match.group(1)
            print_success(f"Found in old app: {expected_uuid}")
            
            # Check implementation
            header_file = Path("includes/meater_bluedroid_server.h")
            if header_file.exists():
                with open(header_file, 'r') as f:
                    impl_content = f.read()
                
                if expected_uuid.lower() in impl_content.lower():
                    print_success("UUID matches implementation")
                    return []
                else:
                    print_error("UUID MISMATCH!")
                    print_info(f"  Expected: {expected_uuid}")
                    print_info(f"  Check implementation has this exact UUID")
                    return [f"Config UUID mismatch - should be {expected_uuid}"]
        else:
            print_warning("Could not find Config UUID in old app")
            print_info("Searching for any Config-related UUIDs...")
            
            # Search for any config-related strings
            config_matches = re.findall(r'Config.*UUID\s*=\s*"([^"]+)"', content, re.IGNORECASE)
            if config_matches:
                for uuid in config_matches:
                    print_info(f"  Found: {uuid}")
    else:
        print_warning("Old app Config.java not found")
    
    return []

def analyze_new_app_uuid():
    """Check the new app for Config UUID"""
    print_header("CHECKING NEW APP FOR CONFIG UUID")
    
    print_info("Searching in obfuscated new app...")
    
    # We know the UUID class is z4/O.java
    uuid_file = Path("meater.app.new/sources/z4/O.java")
    if uuid_file.exists():
        with open(uuid_file, 'r') as f:
            content = f.read()
        
        # Look for config-related UUID
        print_info("Analyzing UUID definitions...")
        
        # Extract all UUID definitions
        uuid_pattern = r'UUID\.fromString\("([^"]+)"\)'
        uuids = re.findall(uuid_pattern, content)
        
        print_info(f"Found {len(uuids)} UUID definitions")
        
        # Look for Config constants
        config_pattern = r'Config\.(\w+)'
        config_refs = re.findall(config_pattern, content)
        
        config_related = [ref for ref in config_refs if 'config' in ref.lower()]
        if config_related:
            print_success(f"Found {len(config_related)} Config-related references")
            for ref in config_related:
                print_info(f"  Config.{ref}")
        else:
            print_warning("No explicit Config characteristic references found")
            print_info("The Config UUID might be hardcoded or use a different name")
    else:
        print_warning("UUID file not found in new app")
    
    return []

def main():
    print(f"\n{Colors.BOLD}ESP32 BLE Implementation Analysis{Colors.ENDC}")
    print("Static analysis of code to identify potential pairing issues\n")
    
    all_issues = []
    
    # Analyze implementation
    issues = analyze_ble_header()
    all_issues.extend(issues)
    
    # Verify Config UUID
    issues = check_config_uuid()
    all_issues.extend(issues)
    
    # Check new app
    issues = analyze_new_app_uuid()
    all_issues.extend(issues)
    
    # Summary
    print_header("ANALYSIS SUMMARY")
    
    if not all_issues:
        print_success("No critical issues found in static analysis")
        print_info("")
        print_info("However, without physical hardware testing, we cannot verify:")
        print_info("  1. BLE advertising is actually working")
        print_info("  2. Services are registered correctly")
        print_info("  3. Characteristics can be read/written")
        print_info("  4. Data format is parsed correctly by the app")
        print_info("")
        print_info("Most likely issues (in order of probability):")
        print_info("  1. Missing manufacturer data in advertising packet")
        print_info("  2. Config characteristic write not triggering pairing")
        print_info("  3. Connection parameters not matching app expectations")
    else:
        print_error(f"Found {len(all_issues)} potential issues:")
        for i, issue in enumerate(all_issues, 1):
            print_info(f"{i}. {issue}")
        print_info("")
        print_info("These issues should be fixed before testing with hardware")
    
    print_info("")
    print_info("Next steps:")
    print_info("  1. Fix any issues identified above")
    print_info("  2. Flash to ESP32 hardware")
    print_info("  3. Run test_esp32_meater_ble.py on a machine with BLE")
    print_info("  4. Check ESP32 logs during pairing attempt")
    print_info("  5. Compare with real MEATER device using nRF Connect")

if __name__ == "__main__":
    main()
