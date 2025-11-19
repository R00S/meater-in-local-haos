#!/usr/bin/env python3
"""
Test ESP32 MEATER BLE Implementation

This script tests each step of the BLE pairing flow to identify
where the ESP32 implementation might be failing.

Requirements:
    pip install bleak

Usage:
    python3 test_esp32_meater_ble.py [device_address]
    
    If device_address is not provided, will scan for MEATER devices.
"""

import asyncio
import sys
from bleak import BleakScanner, BleakClient

# MEATER BLE UUIDs (from protocol analysis)
MEATER_SERVICE = "a75cc7fc-c956-488f-ac2a-2dbc08b63a04"
TEMP_CHAR = "7edda774-045e-4bbf-909b-45d1991a2876"
BATTERY_CHAR = "2adb4877-68d8-4884-bd3c-d83853bf27b8"
CONFIG_CHAR = "575d3bf1-0be4-4e8f-a41e-be090726ed0b"
FIRMWARE_CHAR = "00002a26-0000-1000-8000-00805f9b34fb"
MANUFACTURER_CHAR = "00002a29-0000-1000-8000-00805f9b34fb"
MODEL_CHAR = "00002a24-0000-1000-8000-00805f9b34fb"

class Colors:
    """ANSI color codes for terminal output"""
    GREEN = '\033[92m'
    RED = '\033[91m'
    YELLOW = '\033[93m'
    BLUE = '\033[94m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'

def print_header(text):
    """Print a section header"""
    print(f"\n{Colors.BOLD}{Colors.BLUE}{'=' * 70}{Colors.ENDC}")
    print(f"{Colors.BOLD}{Colors.BLUE}{text}{Colors.ENDC}")
    print(f"{Colors.BOLD}{Colors.BLUE}{'=' * 70}{Colors.ENDC}\n")

def print_success(text):
    """Print success message"""
    print(f"{Colors.GREEN}✓{Colors.ENDC} {text}")

def print_error(text):
    """Print error message"""
    print(f"{Colors.RED}✗{Colors.ENDC} {text}")

def print_warning(text):
    """Print warning message"""
    print(f"{Colors.YELLOW}⚠{Colors.ENDC} {text}")

def print_info(text):
    """Print info message"""
    print(f"  {text}")

async def scan_for_meater():
    """Scan for MEATER devices"""
    print_header("STEP 1: Scanning for MEATER Devices")
    print_info("Scanning for 10 seconds...")
    
    devices = await BleakScanner.discover(timeout=10.0)
    
    meater_devices = []
    for device in devices:
        if device.name and "MEATER" in device.name.upper():
            meater_devices.append(device)
            print_success(f"Found: {device.name} ({device.address})")
            
            # Check for advertised services
            if device.metadata and 'uuids' in device.metadata:
                uuids = device.metadata['uuids']
                if MEATER_SERVICE in uuids:
                    print_info(f"  Advertises MEATER service UUID")
                else:
                    print_warning(f"  Does not advertise MEATER service UUID")
    
    if not meater_devices:
        print_error("No MEATER devices found")
        print_info("Make sure:")
        print_info("  1. ESP32 is powered on")
        print_info("  2. BLE advertising is enabled")
        print_info("  3. You're within BLE range (~10m)")
        return None
    
    return meater_devices[0] if len(meater_devices) == 1 else meater_devices

async def test_connection(device_address):
    """Test BLE connection and service discovery"""
    print_header("STEP 2: Connecting and Discovering Services")
    print_info(f"Connecting to {device_address}...")
    
    try:
        async with BleakClient(device_address, timeout=20.0) as client:
            if client.is_connected:
                print_success("Connected successfully")
            else:
                print_error("Connection failed")
                return None
            
            print_info("\nDiscovered services and characteristics:")
            
            services_found = {
                'meater': False,
                'device_info': False,
                'gap': False
            }
            
            characteristics_found = {
                'temp': False,
                'battery': False,
                'config': False,
                'firmware': False,
                'manufacturer': False,
                'model': False
            }
            
            for service in client.services:
                service_uuid = service.uuid.lower()
                
                if MEATER_SERVICE.lower() in service_uuid:
                    print_success(f"MEATER Service: {service.uuid}")
                    services_found['meater'] = True
                elif '180a' in service_uuid:
                    print_success(f"Device Information Service: {service.uuid}")
                    services_found['device_info'] = True
                elif '1800' in service_uuid:
                    print_success(f"Generic Access Service: {service.uuid}")
                    services_found['gap'] = True
                else:
                    print_info(f"Service: {service.uuid}")
                
                for char in service.characteristics:
                    char_uuid = char.uuid.lower()
                    props = ', '.join(char.properties)
                    
                    if TEMP_CHAR.lower() in char_uuid:
                        print_success(f"  └─ Temperature Char: {char.uuid} ({props})")
                        characteristics_found['temp'] = True
                        if 'read' not in props.lower() or 'notify' not in props.lower():
                            print_warning(f"     Missing required properties (need READ, NOTIFY)")
                    
                    elif BATTERY_CHAR.lower() in char_uuid:
                        print_success(f"  └─ Battery Char: {char.uuid} ({props})")
                        characteristics_found['battery'] = True
                        if 'read' not in props.lower() or 'notify' not in props.lower():
                            print_warning(f"     Missing required properties (need READ, NOTIFY)")
                    
                    elif CONFIG_CHAR.lower() in char_uuid:
                        print_success(f"  └─ Config Char: {char.uuid} ({props})")
                        characteristics_found['config'] = True
                        if 'write' not in props.lower():
                            print_error(f"     Missing WRITE property (critical for pairing!)")
                    
                    elif '2a26' in char_uuid:
                        print_success(f"  └─ Firmware Char: {char.uuid} ({props})")
                        characteristics_found['firmware'] = True
                    
                    elif '2a29' in char_uuid:
                        print_success(f"  └─ Manufacturer Char: {char.uuid} ({props})")
                        characteristics_found['manufacturer'] = True
                    
                    elif '2a24' in char_uuid:
                        print_success(f"  └─ Model Char: {char.uuid} ({props})")
                        characteristics_found['model'] = True
                    
                    else:
                        print_info(f"  └─ Char: {char.uuid} ({props})")
            
            # Summary
            print_info("\nService/Characteristic Summary:")
            all_good = True
            
            if not services_found['meater']:
                print_error("Missing MEATER Service")
                all_good = False
            if not services_found['device_info']:
                print_warning("Missing Device Information Service (optional but recommended)")
            
            if not characteristics_found['temp']:
                print_error("Missing Temperature Characteristic")
                all_good = False
            if not characteristics_found['battery']:
                print_error("Missing Battery Characteristic")
                all_good = False
            if not characteristics_found['config']:
                print_error("Missing Config Characteristic (critical for pairing!)")
                all_good = False
            if not characteristics_found['firmware']:
                print_warning("Missing Firmware Characteristic (needed for pairing)")
            
            if all_good:
                print_success("All critical services and characteristics present")
            
            return client
    
    except Exception as e:
        print_error(f"Connection error: {e}")
        return None

async def test_data_reading(device_address):
    """Test reading data from characteristics"""
    print_header("STEP 3: Testing Data Reading")
    
    try:
        async with BleakClient(device_address, timeout=20.0) as client:
            # Test firmware read
            try:
                firmware = await client.read_gatt_char(FIRMWARE_CHAR)
                firmware_str = firmware.decode('utf-8')
                print_success(f"Firmware: {firmware_str}")
                
                # Validate format
                if firmware_str.startswith('v') and '_' in firmware_str:
                    parts = firmware_str.split('_')
                    if len(parts) == 2:
                        version = parts[0]
                        probe_num = parts[1]
                        print_info(f"  Version: {version}, Probe Number: {probe_num}")
                        if probe_num == '0':
                            print_success("  Probe number is 0 (standalone probe)")
                        else:
                            print_warning(f"  Probe number is {probe_num} (expected 0 for standalone)")
                    else:
                        print_error(f"  Invalid format (expected v{MAJOR}.{MINOR}.{PATCH}_{PROBE_NUM})")
                else:
                    print_error(f"  Invalid firmware format (expected v{MAJOR}.{MINOR}.{PATCH}_{PROBE_NUM})")
            except Exception as e:
                print_error(f"Firmware read failed: {e}")
            
            # Test temperature read
            try:
                temp = await client.read_gatt_char(TEMP_CHAR)
                print_success(f"Temperature: {len(temp)} bytes")
                if len(temp) == 8:
                    print_success("  Correct length (8 bytes)")
                    print_info(f"  Hex: {temp.hex()}")
                else:
                    print_error(f"  Wrong length (expected 8 bytes, got {len(temp)})")
            except Exception as e:
                print_error(f"Temperature read failed: {e}")
            
            # Test battery read
            try:
                battery = await client.read_gatt_char(BATTERY_CHAR)
                print_success(f"Battery: {len(battery)} bytes")
                if len(battery) == 2:
                    print_success("  Correct length (2 bytes)")
                    print_info(f"  Hex: {battery.hex()}")
                else:
                    print_error(f"  Wrong length (expected 2 bytes, got {len(battery)})")
            except Exception as e:
                print_error(f"Battery read failed: {e}")
            
            # Test manufacturer read
            try:
                manufacturer = await client.read_gatt_char(MANUFACTURER_CHAR)
                manufacturer_str = manufacturer.decode('utf-8')
                print_success(f"Manufacturer: {manufacturer_str}")
            except Exception as e:
                print_info(f"Manufacturer read failed (optional): {e}")
            
            # Test model read
            try:
                model = await client.read_gatt_char(MODEL_CHAR)
                model_str = model.decode('utf-8')
                print_success(f"Model: {model_str}")
            except Exception as e:
                print_info(f"Model read failed (optional): {e}")
    
    except Exception as e:
        print_error(f"Data reading test failed: {e}")

async def test_pairing(device_address):
    """Test pairing (config characteristic write)"""
    print_header("STEP 4: Testing Pairing (Config Write)")
    
    try:
        async with BleakClient(device_address, timeout=20.0) as client:
            # Try writing to config characteristic
            try:
                test_data = b'\x01\x02\x03\x04'
                print_info(f"Writing test data to Config characteristic: {test_data.hex()}")
                await client.write_gatt_char(CONFIG_CHAR, test_data)
                print_success("Config write successful")
                print_info("Check ESP32 logs for pairing confirmation message:")
                print_info("  [meater_ble_server] ✓ Device paired! Timestamp: ...")
                
                # Try reading back
                try:
                    config_read = await client.read_gatt_char(CONFIG_CHAR)
                    print_success(f"Config read successful: {config_read.hex()}")
                except Exception as e:
                    print_info(f"Config read not supported (optional): {e}")
                
            except Exception as e:
                print_error(f"Config write failed: {e}")
                print_error("This is the most likely reason pairing fails!")
                print_info("Possible causes:")
                print_info("  1. Config characteristic missing WRITE property")
                print_info("  2. Write callback not registered in ESP32 code")
                print_info("  3. Wrong characteristic handle")
    
    except Exception as e:
        print_error(f"Pairing test failed: {e}")

async def main():
    """Main test flow"""
    print(f"\n{Colors.BOLD}ESP32 MEATER BLE Implementation Test{Colors.ENDC}")
    print(f"Testing BLE pairing flow to identify issues\n")
    
    device_address = None
    
    # Check if device address provided as argument
    if len(sys.argv) > 1:
        device_address = sys.argv[1]
        print_info(f"Using provided address: {device_address}")
    else:
        # Scan for devices
        result = await scan_for_meater()
        if result is None:
            return
        
        if isinstance(result, list):
            # Multiple devices found
            print_info("\nMultiple MEATER devices found. Please specify address:")
            for i, dev in enumerate(result):
                print_info(f"  {i+1}. {dev.name} ({dev.address})")
            print_info(f"\nUsage: python3 {sys.argv[0]} <address>")
            return
        else:
            device_address = result.address
    
    # Run tests
    await test_connection(device_address)
    await test_data_reading(device_address)
    await test_pairing(device_address)
    
    # Final summary
    print_header("SUMMARY AND NEXT STEPS")
    print_info("Review the output above to identify which test failed.")
    print_info("")
    print_info("Common issues:")
    print_info("  1. Device not found → Check BLE advertising configuration")
    print_info("  2. Service/char missing → Check GATT server initialization")
    print_info("  3. Data read fails → Check characteristic value initialization")
    print_info("  4. Config write fails → Check WRITE property and callback")
    print_info("")
    print_info("If all tests pass but MEATER app still can't pair:")
    print_info("  - Check manufacturer data in advertising packet")
    print_info("  - Verify exact UUID matches (case-sensitive)")
    print_info("  - Compare with real MEATER device side-by-side in nRF Connect")
    print_info("")
    print_info("See tools/TROUBLESHOOT_BLE_PAIRING.md for detailed troubleshooting guide.")

if __name__ == "__main__":
    try:
        asyncio.run(main())
    except KeyboardInterrupt:
        print("\n\nTest interrupted by user")
    except Exception as e:
        print_error(f"Unexpected error: {e}")
        import traceback
        traceback.print_exc()
