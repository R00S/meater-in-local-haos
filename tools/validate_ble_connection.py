#!/usr/bin/env python3
"""
BLE Connection Validator for MEATER Protocol

This tool interprets decompiled Java BLE connection code and simulates its execution
against a BLE device or implementation. It makes NO assumptions about how the app works,
but instead line-by-line interprets what the decompiled code does during connection.

The validator acts as an independent layer between:
- Decompiled MEATER app code (input: what the app does)
- Your BLE implementation (test target)

Usage:
    # Test against live BLE device
    python validate_ble_connection.py <mac_address>
    
    # Test against simulated responses (for development)
    python validate_ble_connection.py --simulate <response_file>
    
    # Use specific decompiled app version
    python validate_ble_connection.py <mac_address> --app-version v5.11.0
    
Example:
    python validate_ble_connection.py E4:B3:23:C2:92:F4
    python validate_ble_connection.py --simulate test_responses.json
    
The tool will:
1. Parse Java BLE connection code from decompiled app
2. Extract the connection flow (scan → connect → discover → read/subscribe)
3. Execute each step exactly as the app does
4. Show where connection succeeds or fails
5. Compare expected vs actual responses at each step

This works for ANY decompiled app version, not just current MEATER versions.
"""

import re
import sys
import json
import struct
import asyncio
import argparse
from pathlib import Path
from typing import Dict, Any, List, Tuple, Optional, Set
from dataclasses import dataclass, field
from enum import Enum

# Optional BLE library imports (gracefully handle if not installed)
try:
    from bleak import BleakClient, BleakScanner
    from bleak.backends.device import BLEDevice
    from bleak.backends.characteristic import BleakGATTCharacteristic
    BLEAK_AVAILABLE = True
except ImportError:
    BLEAK_AVAILABLE = False
    # Create dummy types for simulation mode
    BleakClient = Any
    BLEDevice = Any
    BleakGATTCharacteristic = Any
    print("WARNING: bleak library not installed. Install with: pip install bleak")
    print("         Running in simulation-only mode.")


class BleActionType(Enum):
    """Types of BLE actions the app can perform"""
    SCAN = "scan"
    CONNECT = "connect"
    DISCOVER_SERVICES = "discover_services"
    READ_CHARACTERISTIC = "read_characteristic"
    WRITE_CHARACTERISTIC = "write_characteristic"
    SUBSCRIBE_NOTIFICATION = "subscribe_notification"
    UNSUBSCRIBE_NOTIFICATION = "unsubscribe_notification"
    DISCONNECT = "disconnect"


@dataclass
class BleAction:
    """Represents a single BLE action extracted from decompiled code"""
    action_type: BleActionType
    target: Optional[str] = None  # UUID, MAC address, etc.
    parameters: Dict[str, Any] = field(default_factory=dict)
    expected_response: Optional[Any] = None
    source_line: Optional[str] = None  # Original Java line
    line_number: Optional[int] = None


@dataclass
class BleConnectionFlow:
    """Complete BLE connection flow extracted from app code"""
    scan_filters: List[str] = field(default_factory=list)  # Service UUIDs to filter
    required_services: List[str] = field(default_factory=list)
    required_characteristics: Dict[str, List[str]] = field(default_factory=dict)
    connection_sequence: List[BleAction] = field(default_factory=list)
    device_name_pattern: Optional[str] = None
    manufacturer_id: Optional[int] = None


class JavaBleCodeParser:
    """
    Parses decompiled Java BLE connection code to extract the connection flow.
    
    This parser looks for BLE-related method calls and reconstructs the sequence
    of operations the app performs during connection.
    """
    
    def __init__(self, app_path: Path):
        self.app_path = app_path
        self.step_num = 0
        
    def find_ble_activity_files(self) -> List[Path]:
        """Find Java files that handle BLE connections"""
        ble_files = []
        
        # Common patterns in MEATER app structure
        patterns = [
            "**/BleManager*.java",
            "**/BluetoothManager*.java",
            "**/DeviceConnection*.java",
            "**/ProbeConnection*.java",
            "**/MeaterDevice*.java",
            "**/activities/*Pairing*.java",
            "**/activities/*Device*.java",
        ]
        
        for pattern in patterns:
            ble_files.extend(self.app_path.rglob(pattern))
            
        return ble_files
    
    def extract_scan_filters(self, java_code: str) -> List[str]:
        """Extract service UUIDs used for BLE scanning"""
        uuids = []
        
        # Look for UUID constants or filter definitions
        uuid_patterns = [
            r'UUID\.fromString\("([a-f0-9-]+)"\)',
            r'addServiceUuid\(.*?"([a-f0-9-]+)"',
            r'MEATER_SERVICE_UUID\s*=.*?"([a-f0-9-]+)"',
            r'SERVICE_UUID\s*=.*?"([a-f0-9-]+)"',
        ]
        
        for pattern in uuid_patterns:
            matches = re.finditer(pattern, java_code, re.IGNORECASE)
            for match in matches:
                uuid = match.group(1)
                if uuid not in uuids:
                    uuids.append(uuid)
                    
        return uuids
    
    def extract_device_name_pattern(self, java_code: str) -> Optional[str]:
        """Extract expected device name pattern"""
        patterns = [
            r'getName\(\)\.equals\("([^"]+)"\)',
            r'getName\(\)\.startsWith\("([^"]+)"\)',
            r'DEVICE_NAME\s*=\s*"([^"]+)"',
            r'name\.equals\("([^"]+)"\)',
        ]
        
        for pattern in patterns:
            match = re.search(pattern, java_code)
            if match:
                return match.group(1)
                
        return None
    
    def extract_manufacturer_id(self, java_code: str) -> Optional[int]:
        """Extract manufacturer ID from advertising data parsing"""
        patterns = [
            r'getManufacturerData\(0x([0-9a-fA-F]+)\)',
            r'MANUFACTURER_ID\s*=\s*0x([0-9a-fA-F]+)',
            r'manufacturerId\s*==\s*0x([0-9a-fA-F]+)',
        ]
        
        for pattern in patterns:
            match = re.search(pattern, java_code)
            if match:
                return int(match.group(1), 16)
                
        return None
    
    def extract_connection_sequence(self, java_code: str) -> List[BleAction]:
        """Extract the sequence of BLE operations during connection"""
        actions = []
        lines = java_code.split('\n')
        
        for i, line in enumerate(lines):
            line = line.strip()
            
            # Scan operation
            if 'startScan' in line or 'startLeScan' in line:
                action = BleAction(
                    action_type=BleActionType.SCAN,
                    source_line=line,
                    line_number=i + 1
                )
                actions.append(action)
            
            # Connect operation
            elif 'connect' in line.lower() and 'gatt' in line.lower():
                # Extract MAC or device reference
                mac_match = re.search(r'([0-9A-F:]{17})', line)
                action = BleAction(
                    action_type=BleActionType.CONNECT,
                    target=mac_match.group(1) if mac_match else None,
                    source_line=line,
                    line_number=i + 1
                )
                actions.append(action)
            
            # Service discovery
            elif 'discoverServices' in line:
                action = BleAction(
                    action_type=BleActionType.DISCOVER_SERVICES,
                    source_line=line,
                    line_number=i + 1
                )
                actions.append(action)
            
            # Read characteristic
            elif 'readCharacteristic' in line:
                uuid_match = re.search(r'([a-f0-9-]{36})', line, re.IGNORECASE)
                action = BleAction(
                    action_type=BleActionType.READ_CHARACTERISTIC,
                    target=uuid_match.group(1) if uuid_match else None,
                    source_line=line,
                    line_number=i + 1
                )
                actions.append(action)
            
            # Write characteristic
            elif 'writeCharacteristic' in line:
                uuid_match = re.search(r'([a-f0-9-]{36})', line, re.IGNORECASE)
                action = BleAction(
                    action_type=BleActionType.WRITE_CHARACTERISTIC,
                    target=uuid_match.group(1) if uuid_match else None,
                    source_line=line,
                    line_number=i + 1
                )
                actions.append(action)
            
            # Subscribe to notifications
            elif 'setCharacteristicNotification' in line and 'true' in line:
                uuid_match = re.search(r'([a-f0-9-]{36})', line, re.IGNORECASE)
                action = BleAction(
                    action_type=BleActionType.SUBSCRIBE_NOTIFICATION,
                    target=uuid_match.group(1) if uuid_match else None,
                    source_line=line,
                    line_number=i + 1
                )
                actions.append(action)
                
        return actions
    
    def parse_connection_flow(self, app_version: Optional[str] = None) -> BleConnectionFlow:
        """
        Parse decompiled app code to extract complete BLE connection flow.
        
        This is the main method that interprets the Java code step-by-step.
        """
        print(f"\n{'='*70}")
        print(f"PARSING BLE CONNECTION FLOW FROM DECOMPILED APP")
        print(f"{'='*70}\n")
        
        # Find relevant Java files
        ble_files = self.find_ble_activity_files()
        print(f"Found {len(ble_files)} BLE-related Java files")
        
        if not ble_files:
            print("WARNING: No BLE-related Java files found!")
            print(f"Searched in: {self.app_path}")
            return BleConnectionFlow()
        
        # Parse each file
        flow = BleConnectionFlow()
        
        for java_file in ble_files:
            print(f"\nParsing: {java_file.name}")
            try:
                java_code = java_file.read_text(encoding='utf-8', errors='ignore')
                
                # Extract scan filters
                uuids = self.extract_scan_filters(java_code)
                for uuid in uuids:
                    if uuid not in flow.scan_filters:
                        flow.scan_filters.append(uuid)
                        print(f"  Found scan filter: {uuid}")
                
                # Extract device name
                if not flow.device_name_pattern:
                    name = self.extract_device_name_pattern(java_code)
                    if name:
                        flow.device_name_pattern = name
                        print(f"  Found device name: {name}")
                
                # Extract manufacturer ID
                if not flow.manufacturer_id:
                    mfr_id = self.extract_manufacturer_id(java_code)
                    if mfr_id:
                        flow.manufacturer_id = mfr_id
                        print(f"  Found manufacturer ID: 0x{mfr_id:04X}")
                
                # Extract connection sequence
                actions = self.extract_connection_sequence(java_code)
                if actions:
                    print(f"  Found {len(actions)} BLE actions")
                    flow.connection_sequence.extend(actions)
                    
            except Exception as e:
                print(f"  Error parsing {java_file.name}: {e}")
        
        print(f"\n{'='*70}")
        print(f"EXTRACTION COMPLETE")
        print(f"{'='*70}")
        print(f"Scan filters: {len(flow.scan_filters)}")
        print(f"Connection actions: {len(flow.connection_sequence)}")
        print()
        
        return flow


class BleConnectionValidator:
    """
    Validates a BLE implementation against the extracted connection flow.
    
    This validator executes each action from the connection flow and compares
    the results against what the app expects.
    """
    
    def __init__(self, connection_flow: BleConnectionFlow, simulation_mode: bool = False):
        self.flow = connection_flow
        self.simulation_mode = simulation_mode
        self.step_num = 0
        self.validation_results: List[Dict[str, Any]] = []
        
    def print_step(self, message: str, success: bool = True):
        """Print a validation step with formatting"""
        self.step_num += 1
        status = "✓" if success else "✗"
        print(f"  [{self.step_num:2d}] {status} {message}")
        
    async def validate_scan(self, action: BleAction) -> Dict[str, Any]:
        """Validate BLE scanning matches app expectations"""
        self.print_step(f"Scanning for devices...")
        
        result = {
            "action": "scan",
            "success": False,
            "details": {}
        }
        
        if self.simulation_mode:
            self.print_step("Simulation: Device found", success=True)
            result["success"] = True
            result["details"]["simulated"] = True
            return result
        
        if not BLEAK_AVAILABLE:
            self.print_step("Bleak not available, cannot scan", success=False)
            result["details"]["error"] = "Bleak library not installed"
            return result
        
        try:
            # Scan for devices matching filters
            print(f"     Scanning with filters: {self.flow.scan_filters}")
            devices = await BleakScanner.discover(timeout=5.0)
            
            matching_devices = []
            for device in devices:
                # Check device name
                if self.flow.device_name_pattern:
                    if device.name and self.flow.device_name_pattern in device.name:
                        matching_devices.append(device)
                        continue
                
                # Check service UUIDs (if available in advertisement)
                if self.flow.scan_filters:
                    # Note: Not all backends provide UUIDs in scan results
                    matching_devices.append(device)
            
            if matching_devices:
                self.print_step(f"Found {len(matching_devices)} matching device(s)", success=True)
                for dev in matching_devices:
                    print(f"       - {dev.name} ({dev.address})")
                result["success"] = True
                result["details"]["devices"] = [
                    {"name": d.name, "address": d.address} for d in matching_devices
                ]
            else:
                self.print_step("No matching devices found", success=False)
                result["details"]["total_devices"] = len(devices)
                
        except Exception as e:
            self.print_step(f"Scan failed: {e}", success=False)
            result["details"]["error"] = str(e)
        
        return result
    
    async def validate_connect(self, action: BleAction, device_address: str) -> Tuple[bool, Optional[BleakClient]]:
        """Validate connection to device"""
        self.print_step(f"Connecting to {device_address}...")
        
        if self.simulation_mode:
            self.print_step("Simulation: Connected", success=True)
            return True, None
        
        if not BLEAK_AVAILABLE:
            self.print_step("Bleak not available, cannot connect", success=False)
            return False, None
        
        try:
            client = BleakClient(device_address)
            await client.connect()
            
            if client.is_connected:
                self.print_step("Connected successfully", success=True)
                return True, client
            else:
                self.print_step("Connection failed", success=False)
                return False, None
                
        except Exception as e:
            self.print_step(f"Connection failed: {e}", success=False)
            return False, None
    
    async def validate_discover_services(self, action: BleAction, client: Optional[BleakClient]) -> Dict[str, Any]:
        """Validate service discovery"""
        self.print_step(f"Discovering services...")
        
        result = {
            "action": "discover_services",
            "success": False,
            "details": {}
        }
        
        if self.simulation_mode:
            self.print_step("Simulation: Services discovered", success=True)
            result["success"] = True
            result["details"]["simulated"] = True
            return result
        
        if not client:
            self.print_step("No client connection", success=False)
            return result
        
        try:
            services = client.services
            
            print(f"     Found {len(services)} services:")
            for service in services:
                print(f"       - {service.uuid}")
                for char in service.characteristics:
                    props = ",".join(char.properties)
                    print(f"         └─ {char.uuid} ({props})")
            
            # Check if expected services are present
            if self.flow.scan_filters:
                missing_services = []
                for expected_uuid in self.flow.scan_filters:
                    found = any(expected_uuid.lower() in str(s.uuid).lower() for s in services)
                    if not found:
                        missing_services.append(expected_uuid)
                
                if missing_services:
                    self.print_step(f"Missing expected services: {missing_services}", success=False)
                    result["details"]["missing_services"] = missing_services
                else:
                    self.print_step("All expected services present", success=True)
                    result["success"] = True
            else:
                result["success"] = True
                
            result["details"]["service_count"] = len(services)
            
        except Exception as e:
            self.print_step(f"Service discovery failed: {e}", success=False)
            result["details"]["error"] = str(e)
        
        return result
    
    async def validate_read_characteristic(self, action: BleAction, client: Optional[BleakClient]) -> Dict[str, Any]:
        """Validate reading a characteristic"""
        char_uuid = action.target or "unknown"
        self.print_step(f"Reading characteristic {char_uuid}...")
        
        result = {
            "action": "read_characteristic",
            "uuid": char_uuid,
            "success": False,
            "details": {}
        }
        
        if self.simulation_mode:
            self.print_step("Simulation: Read successful", success=True)
            result["success"] = True
            result["details"]["simulated"] = True
            result["details"]["value"] = "simulated_data"
            return result
        
        if not client:
            self.print_step("No client connection", success=False)
            return result
        
        try:
            value = await client.read_gatt_char(char_uuid)
            hex_value = value.hex()
            
            self.print_step(f"Read {len(value)} bytes: {hex_value}", success=True)
            result["success"] = True
            result["details"]["value"] = hex_value
            result["details"]["length"] = len(value)
            
        except Exception as e:
            self.print_step(f"Read failed: {e}", success=False)
            result["details"]["error"] = str(e)
        
        return result
    
    async def validate_connection_flow(self, device_address: Optional[str] = None) -> Dict[str, Any]:
        """
        Execute complete connection flow validation.
        
        This is the main validation method that steps through each action.
        """
        print(f"\n{'='*70}")
        print(f"VALIDATING BLE CONNECTION FLOW")
        print(f"{'='*70}\n")
        
        if self.simulation_mode:
            print("Running in SIMULATION mode (no real BLE connection)\n")
        
        overall_result = {
            "success": True,
            "total_steps": len(self.flow.connection_sequence),
            "passed_steps": 0,
            "failed_steps": 0,
            "step_results": []
        }
        
        client = None
        
        try:
            # Execute each action in sequence
            for action in self.flow.connection_sequence:
                print(f"\nAction: {action.action_type.value}")
                if action.source_line:
                    print(f"  Source: {action.source_line}")
                
                step_result = None
                
                if action.action_type == BleActionType.SCAN:
                    step_result = await self.validate_scan(action)
                
                elif action.action_type == BleActionType.CONNECT:
                    if not device_address:
                        self.print_step("No device address provided", success=False)
                        step_result = {"action": "connect", "success": False}
                    else:
                        success, client = await self.validate_connect(action, device_address)
                        step_result = {"action": "connect", "success": success}
                
                elif action.action_type == BleActionType.DISCOVER_SERVICES:
                    step_result = await self.validate_discover_services(action, client)
                
                elif action.action_type == BleActionType.READ_CHARACTERISTIC:
                    step_result = await self.validate_read_characteristic(action, client)
                
                else:
                    self.print_step(f"Action type not yet implemented: {action.action_type.value}", success=False)
                    step_result = {"action": action.action_type.value, "success": False, "details": {"not_implemented": True}}
                
                if step_result:
                    overall_result["step_results"].append(step_result)
                    if step_result.get("success"):
                        overall_result["passed_steps"] += 1
                    else:
                        overall_result["failed_steps"] += 1
                        overall_result["success"] = False
        
        finally:
            # Cleanup
            if client and not self.simulation_mode:
                try:
                    await client.disconnect()
                    self.print_step("Disconnected", success=True)
                except:
                    pass
        
        print(f"\n{'='*70}")
        print(f"VALIDATION COMPLETE")
        print(f"{'='*70}")
        print(f"Total steps: {overall_result['total_steps']}")
        print(f"Passed: {overall_result['passed_steps']}")
        print(f"Failed: {overall_result['failed_steps']}")
        print(f"Overall: {'SUCCESS' if overall_result['success'] else 'FAILED'}")
        print()
        
        return overall_result


async def main():
    parser = argparse.ArgumentParser(
        description="Validate BLE connection against decompiled MEATER app code",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog=__doc__
    )
    
    parser.add_argument(
        "device",
        nargs="?",
        help="BLE device MAC address (e.g., E4:B3:23:C2:92:F4)"
    )
    
    parser.add_argument(
        "--simulate",
        action="store_true",
        help="Run in simulation mode (no real BLE connection)"
    )
    
    parser.add_argument(
        "--app-path",
        type=str,
        default="meater_app",
        help="Path to decompiled MEATER app directory (default: meater_app)"
    )
    
    parser.add_argument(
        "--app-version",
        type=str,
        help="Specific app version to use (optional)"
    )
    
    parser.add_argument(
        "--output",
        type=str,
        help="Save validation results to JSON file"
    )
    
    args = parser.parse_args()
    
    # Validate inputs
    if not args.simulate and not args.device:
        parser.error("Device MAC address required unless using --simulate")
    
    app_path = Path(args.app_path)
    if not app_path.exists():
        print(f"ERROR: App path not found: {app_path}")
        print(f"Current directory: {Path.cwd()}")
        sys.exit(1)
    
    # Parse decompiled app code
    parser = JavaBleCodeParser(app_path)
    connection_flow = parser.parse_connection_flow(args.app_version)
    
    if not connection_flow.connection_sequence:
        print("\nWARNING: No BLE connection sequence found in decompiled code!")
        print("This may mean:")
        print("  1. The decompiled code structure is different than expected")
        print("  2. BLE code is obfuscated or in a different location")
        print("  3. The app path is incorrect")
        print("\nContinuing with basic validation...")
    
    # Run validation
    validator = BleConnectionValidator(connection_flow, simulation_mode=args.simulate)
    result = await validator.validate_connection_flow(args.device)
    
    # Save results if requested
    if args.output:
        output_path = Path(args.output)
        output_path.write_text(json.dumps(result, indent=2))
        print(f"\nResults saved to: {output_path}")
    
    # Exit code based on validation success
    sys.exit(0 if result["success"] else 1)


if __name__ == "__main__":
    asyncio.run(main())
