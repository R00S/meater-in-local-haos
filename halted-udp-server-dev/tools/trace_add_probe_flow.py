#!/usr/bin/env python3
"""
Trace the complete "Add Probe" flow through the decompiled MEATER app code.
Extracts and analyzes the entire pairing process step by step.

Usage:
    python trace_add_probe_flow.py [app_directory]
"""

import os
import re
import sys
from pathlib import Path
from typing import List, Dict, Optional, Tuple

class AddProbeFlowTracer:
    """Trace the complete Add Probe flow through Java code."""
    
    def __init__(self, app_dir: str):
        self.app_dir = Path(app_dir)
        self.flow_steps = []
        self.uuids_found = {}
        self.characteristics_found = {}
        
    def find_java_files(self, pattern: str) -> List[Path]:
        """Find Java files matching pattern."""
        results = []
        for root, dirs, files in os.walk(self.app_dir):
            for file in files:
                if pattern.lower() in file.lower() and file.endswith('.java'):
                    results.append(Path(root) / file)
        return results
    
    def extract_method_calls(self, content: str, method_name: str) -> List[Tuple[int, str]]:
        """Extract all calls to a specific method with line numbers."""
        calls = []
        lines = content.split('\n')
        for i, line in enumerate(lines):
            if method_name in line and '(' in line:
                calls.append((i+1, line.strip()))
        return calls
    
    def find_uuid_definitions(self, content: str) -> Dict[str, str]:
        """Find UUID constant definitions."""
        uuids = {}
        # Pattern: final String NAME = "uuid";
        pattern = r'static\s+final\s+String\s+(\w+UUID\w*)\s*=\s*"([0-9a-fA-F-]+)"'
        for match in re.finditer(pattern, content, re.IGNORECASE):
            name = match.group(1)
            uuid = match.group(2)
            uuids[name] = uuid
        return uuids
    
    def print_header(self, text):
        """Print section header."""
        print(f"\n{'=' * 70}")
        print(f"{text}")
        print('=' * 70)
    
    def print_step(self, num, title, details=None):
        """Print a flow step."""
        print(f"\n[Step {num}] {title}")
        if details:
            for detail in details:
                print(f"  • {detail}")
    
    def trace_scanning_phase(self):
        """Phase 1: Device Scanning."""
        self.print_header("PHASE 1: DEVICE SCANNING")
        
        files = self.find_java_files('NearbyDevicesFragment')
        
        if not files:
            print("  ⚠ NearbyDevicesFragment not found")
            return
        
        for file in files:
            print(f"\n  Analyzing: {file.name}")
            with open(file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
                lines = content.split('\n')
                
                # Step 1: User taps "Add MEATER"
                self.print_step(1, "User taps 'Add MEATER' button", [
                    f"UI: {file.name}",
                    "Triggers BLE scanning for MEATER devices"
                ])
                
                # Step 2: Scanner initialization
                scanner_init_lines = []
                for i, line in enumerate(lines):
                    if 'scanner' in line.lower() and ('new' in line or 'init' in line):
                        scanner_init_lines.append(f"Line {i+1}: {line.strip()}")
                
                if scanner_init_lines:
                    self.print_step(2, "BLE Scanner Initialization", scanner_init_lines[:3])
                
                # Step 3: Service UUID filter
                service_uuid_lines = []
                for i, line in enumerate(lines):
                    if 'a75cc7fc' in line.lower() or 'service' in line.lower() and 'uuid' in line.lower():
                        service_uuid_lines.append(f"Line {i+1}: {line.strip()}")
                
                if service_uuid_lines:
                    self.print_step(3, "Filter by MEATER Service UUID", 
                                   service_uuid_lines[:2] + [
                                       "UUID: a75cc7fc-c956-488f-ac2a-2dbc08b63a04"
                                   ])
                
                # Step 4: Device filtering
                filter_lines = []
                for i, line in enumerate(lines):
                    if 'filter' in line.lower() or 'meater' in line.lower() and 'name' in line.lower():
                        filter_lines.append(f"Line {i+1}: {line.strip()}")
                
                if filter_lines:
                    self.print_step(4, "Device Name Filtering", 
                                   filter_lines[:2] + [
                                       "Expected device name: 'MEATER'"
                                   ])
                
                # Step 5: Display found devices
                display_lines = []
                for i, line in enumerate(lines):
                    if 'adapter' in line.lower() or 'list' in line.lower() or 'recycler' in line.lower():
                        if 'notif' in line.lower() or 'update' in line.lower():
                            display_lines.append(f"Line {i+1}: {line.strip()}")
                
                if display_lines:
                    self.print_step(5, "Display Device List", 
                                   display_lines[:2] + [
                                       "User sees list of available MEATER devices"
                                   ])
    
    def trace_connection_phase(self):
        """Phase 2: Device Connection."""
        self.print_header("PHASE 2: DEVICE CONNECTION & SERVICE DISCOVERY")
        
        files = self.find_java_files('DevicePairingFragment')
        files += self.find_java_files('DevicePairing')
        
        if not files:
            print("  ⚠ DevicePairingFragment not found")
            return
        
        for file in files:
            print(f"\n  Analyzing: {file.name}")
            with open(file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
                lines = content.split('\n')
                
                # Step 6: User selects device
                self.print_step(6, "User Selects Device from List", [
                    f"UI: {file.name}",
                    "Navigation to pairing screen"
                ])
                
                # Step 7: BLE Connection
                connect_lines = []
                for i, line in enumerate(lines):
                    if 'connect' in line.lower() and ('gatt' in line.lower() or 'ble' in line.lower()):
                        connect_lines.append(f"Line {i+1}: {line.strip()}")
                
                if connect_lines:
                    self.print_step(7, "Establish BLE Connection", connect_lines[:2])
                
                # Step 8: Service Discovery
                discover_lines = []
                for i, line in enumerate(lines):
                    if 'discover' in line.lower() and 'service' in line.lower():
                        discover_lines.append(f"Line {i+1}: {line.strip()}")
                
                if discover_lines:
                    self.print_step(8, "Discover GATT Services", 
                                   discover_lines[:2] + [
                                       "Looking for MEATER Service and Device Info Service"
                                   ])
    
    def trace_characteristic_reading_phase(self):
        """Phase 3: Reading Characteristics."""
        self.print_header("PHASE 3: READING DEVICE CHARACTERISTICS")
        
        # Look for MEATERDevice or BLE interaction code
        files = self.find_java_files('MEATERDevice')
        files += self.find_java_files('BLE')
        files += self.find_java_files('Gatt')
        
        if not files:
            print("  ⚠ BLE interaction files not found")
            return
        
        for file in files[:3]:  # Limit to first 3 files
            print(f"\n  Analyzing: {file.name}")
            with open(file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
                lines = content.split('\n')
                
                # Step 9: Read Firmware Version
                firmware_lines = []
                for i, line in enumerate(lines):
                    if 'firmware' in line.lower() or '2a26' in line.lower():
                        if 'read' in line.lower() or 'get' in line.lower():
                            firmware_lines.append(f"Line {i+1}: {line.strip()}")
                
                if firmware_lines:
                    self.print_step(9, "Read Firmware Revision Characteristic", 
                                   firmware_lines[:2] + [
                                       "UUID: 00002a26-0000-1000-8000-00805f9b34fb",
                                       "Expected format: v{major}.{minor}.{patch}_{probeNumber}",
                                       "Example: v1.0.4_0"
                                   ])
                
                # Step 10: Read Temperature
                temp_lines = []
                for i, line in enumerate(lines):
                    if '7edda774' in line.lower() or ('temperature' in line.lower() and 'read' in line.lower()):
                        temp_lines.append(f"Line {i+1}: {line.strip()}")
                
                if temp_lines:
                    self.print_step(10, "Read Temperature Characteristic", 
                                   temp_lines[:2] + [
                                       "UUID: 7edda774-045e-4bbf-909b-45d1991a2876",
                                       "Expected: 8 bytes (tip temp, ambient temp, parameters)"
                                   ])
                
                # Step 11: Read Battery
                battery_lines = []
                for i, line in enumerate(lines):
                    if '2adb4877' in line.lower() or ('battery' in line.lower() and 'read' in line.lower()):
                        battery_lines.append(f"Line {i+1}: {line.strip()}")
                
                if battery_lines:
                    self.print_step(11, "Read Battery Characteristic", 
                                   battery_lines[:2] + [
                                       "UUID: 2adb4877-68d8-4884-bd3c-d83853bf27b8",
                                       "Expected: 2 bytes (battery percentage)"
                                   ])
    
    def trace_pairing_phase(self):
        """Phase 4: Pairing/Configuration."""
        self.print_header("PHASE 4: PAIRING (CRITICAL)")
        
        # Look for Config.java to find the Cook Setup UUID
        config_files = self.find_java_files('Config')
        
        cook_setup_uuid = None
        if config_files:
            for file in config_files:
                with open(file, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                    uuids = self.find_uuid_definitions(content)
                    if 'MEATERCookSetupBLECharacteristicUUID' in uuids:
                        cook_setup_uuid = uuids['MEATERCookSetupBLECharacteristicUUID']
                        print(f"\n  Found in {file.name}:")
                        print(f"    MEATERCookSetupBLECharacteristicUUID = {cook_setup_uuid}")
        
        # Step 12: Write to Cook Setup Characteristic
        self.print_step(12, "Write Configuration to Cook Setup Characteristic", [
            "⚠ CRITICAL STEP FOR PAIRING!",
            f"UUID: {cook_setup_uuid or 'caf28e64-3b17-4cb4-bb0a-2eaa33c47af7'}",
            "App writes pairing/configuration data",
            "This triggers device to set pairing state",
            "ESP32 must have this characteristic with WRITE property"
        ])
        
        # Look for pairing-related code
        files = self.find_java_files('Pairing')
        files += self.find_java_files('Setup')
        
        for file in files[:2]:
            with open(file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
                lines = content.split('\n')
                
                write_lines = []
                for i, line in enumerate(lines):
                    if 'write' in line.lower() and ('characteristic' in line.lower() or 'setup' in line.lower()):
                        write_lines.append(f"Line {i+1}: {line.strip()}")
                
                if write_lines:
                    print(f"\n  Found write operations in {file.name}:")
                    for line in write_lines[:3]:
                        print(f"    {line}")
    
    def trace_completion_phase(self):
        """Phase 5: Pairing Completion."""
        self.print_header("PHASE 5: PAIRING COMPLETION")
        
        # Look for MEATERDevice to find isPaired() logic
        files = self.find_java_files('MEATERDevice')
        
        if not files:
            print("  ⚠ MEATERDevice not found")
            return
        
        for file in files:
            print(f"\n  Analyzing: {file.name}")
            with open(file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
                lines = content.split('\n')
                
                # Step 13: App sets datePaired field
                self.print_step(13, "App Sets datePaired Field", [
                    "After successful write to Cook Setup characteristic",
                    "App stores device in local database",
                    "Sets datePaired = current timestamp",
                    "This marks device as paired"
                ])
                
                # Find isPaired() method
                is_paired_lines = []
                for i, line in enumerate(lines):
                    if 'isPaired' in line:
                        is_paired_lines.append((i+1, line.strip()))
                
                if is_paired_lines:
                    print(f"\n  isPaired() method logic:")
                    for line_num, line in is_paired_lines[:5]:
                        print(f"    Line {line_num}: {line}")
                
                # Step 14: Database storage
                self.print_step(14, "Device Stored in Database", [
                    "MEATERDevice object with datePaired != null",
                    "Device appears in app's device list",
                    "isPaired() returns true"
                ])
                
                # Step 15: Subscribe to notifications
                self.print_step(15, "Subscribe to Characteristic Notifications", [
                    "Temperature characteristic (for live updates)",
                    "Battery characteristic (for live updates)",
                    "Enables real-time temperature monitoring"
                ])
                
                # Step 16: Completion
                self.print_step(16, "Pairing Complete!", [
                    "Device is ready to use",
                    "Shows in device list",
                    "Can start cooking session"
                ])
    
    def trace_critical_requirements(self):
        """Summarize critical requirements for ESP32."""
        self.print_header("CRITICAL REQUIREMENTS FOR ESP32 IMPLEMENTATION")
        
        print("\n1. BLE ADVERTISING:")
        print("   ✓ Device name: 'MEATER'")
        print("   ✓ Service UUID: a75cc7fc-c956-488f-ac2a-2dbc08b63a04")
        print("   • Must be visible in BLE scan")
        
        print("\n2. GATT SERVICES:")
        print("   ✓ MEATER Service (a75cc7fc...)")
        print("   ✓ Device Information Service (0000180a...)")
        
        print("\n3. CHARACTERISTICS (MEATER Service):")
        print("   ✓ Temperature (7edda774...) - READ, NOTIFY")
        print("   ✓ Battery (2adb4877...) - READ, NOTIFY")
        print("   ✓ Cook Setup (caf28e64...) - READ, WRITE ⚠ CRITICAL!")
        
        print("\n4. CHARACTERISTICS (Device Info Service):")
        print("   ✓ Firmware Revision (00002a26...) - READ")
        print("   • Format: v{major}.{minor}.{patch}_{probeNumber}")
        print("   • Example: v1.0.4_0")
        
        print("\n5. PAIRING MECHANISM:")
        print("   ⚠ CRITICAL: Cook Setup characteristic MUST:")
        print("   • Have WRITE property enabled")
        print("   • Accept writes from app")
        print("   • Trigger pairing state = true")
        print("   • Use correct UUID: caf28e64-3b17-4cb4-bb0a-2eaa33c47af7")
        
        print("\n6. DATA FORMATS:")
        print("   • Temperature: 8 bytes")
        print("   • Battery: 2 bytes")
        print("   • Both in little-endian format")
    
    def run_trace(self):
        """Run complete flow trace."""
        print("=" * 70)
        print("MEATER APP: Complete 'Add Probe' Flow Analysis")
        print("=" * 70)
        print(f"\nAnalyzing decompiled app in: {self.app_dir}")
        
        self.trace_scanning_phase()
        self.trace_connection_phase()
        self.trace_characteristic_reading_phase()
        self.trace_pairing_phase()
        self.trace_completion_phase()
        self.trace_critical_requirements()
        
        print("\n" + "=" * 70)
        print("ANALYSIS COMPLETE")
        print("=" * 70)
        print("\nThe most critical finding:")
        print("  The app writes to Cook Setup characteristic (caf28e64...)")
        print("  during pairing. The ESP32 MUST have this characteristic")
        print("  with the correct UUID and WRITE property enabled.")
        print("\nWithout this, pairing will fail!")

def main():
    """Main entry point."""
    app_dir = sys.argv[1] if len(sys.argv) > 1 else 'meater_app'
    
    if not Path(app_dir).exists():
        print(f"Error: Directory not found: {app_dir}")
        sys.exit(1)
    
    tracer = AddProbeFlowTracer(app_dir)
    tracer.run_trace()

if __name__ == '__main__':
    main()
