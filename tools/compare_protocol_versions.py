#!/usr/bin/env python3
"""
Compare BLE protocol between old (non-obfuscated) and new (obfuscated) MEATER apps.
Uses the old app as a template to search for corresponding elements in the new app.
"""

import os
import re
import json
from pathlib import Path
from typing import Dict, List, Set, Optional

class ProtocolExtractor:
    """Extract BLE protocol elements from MEATER app code."""
    
    def __init__(self, app_dir: str):
        self.app_dir = Path(app_dir)
        self.protocol_elements = {
            'uuids': {},
            'constants': {},
            'characteristic_properties': {},
            'data_structures': []
        }
    
    def extract_from_old_app(self):
        """Extract protocol elements from non-obfuscated old app."""
        print("=" * 70)
        print("EXTRACTING PROTOCOL FROM OLD APP")
        print("=" * 70)
        print()
        
        # Find Config.java which typically contains UUIDs
        config_files = list(self.app_dir.rglob("Config.java"))
        for config_file in config_files:
            self._parse_config_file(config_file)
        
        # Find BLE-related protobuf definitions
        protobuf_dir = self.app_dir / "v3protobuf"
        if protobuf_dir.exists():
            self._parse_protobuf_definitions(protobuf_dir)
        
        return self.protocol_elements
    
    def _parse_config_file(self, config_file: Path):
        """Parse Config.java for BLE constants."""
        print(f"Parsing: {config_file.name}")
        
        with open(config_file, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
            
        # Extract UUID constants
        uuid_pattern = r'public static final String (\w+)\s*=\s*"([0-9a-f-]+)"'
        for match in re.finditer(uuid_pattern, content, re.IGNORECASE):
            name, value = match.groups()
            if 'uuid' in name.lower() or re.match(r'[0-9a-f-]+', value):
                self.protocol_elements['uuids'][name] = value
                print(f"  Found UUID: {name} = {value}")
        
        # Extract other constants
        const_pattern = r'public static final \w+ (\w+)\s*=\s*([^;]+);'
        for match in re.finditer(const_pattern, content):
            name, value = match.groups()
            if 'meater' in name.lower() or 'ble' in name.lower():
                self.protocol_elements['constants'][name] = value.strip()
    
    def _parse_protobuf_definitions(self, protobuf_dir: Path):
        """Parse protobuf definitions for data structures."""
        print(f"\nParsing protobuf definitions in: {protobuf_dir.name}")
        
        for java_file in protobuf_dir.glob("*.java"):
            with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
            
            # Look for class definitions
            class_match = re.search(r'public (?:static )?(final )?class (\w+)', content)
            if class_match:
                class_name = class_match.group(2)
                if 'BLE' in class_name or 'Probe' in class_name or 'Device' in class_name:
                    self.protocol_elements['data_structures'].append({
                        'name': class_name,
                        'file': java_file.name
                    })
                    print(f"  Found data structure: {class_name}")


class ProtocolComparator:
    """Compare protocol elements between old and new apps."""
    
    def __init__(self, old_elements: Dict, new_app_dir: str):
        self.old_elements = old_elements
        self.new_app_dir = Path(new_app_dir)
        self.findings = []
    
    def compare(self):
        """Compare protocol elements."""
        print()
        print("=" * 70)
        print("COMPARING PROTOCOLS")
        print("=" * 70)
        print()
        
        # Check if UUIDs are present in new app
        self._check_uuids()
        
        # Check for data structure equivalents
        self._check_data_structures()
        
        # Generate summary
        self._generate_summary()
        
        return self.findings
    
    def _check_uuids(self):
        """Check if BLE UUIDs from old app exist in new app."""
        print("Checking BLE UUIDs...")
        print()
        
        for name, uuid in self.old_elements['uuids'].items():
            print(f"Searching for {name}: {uuid}")
            
            # Search in all Java files
            found = False
            search_pattern = uuid.replace('-', r'[\-]?')  # Allow for variations
            
            for java_file in self.new_app_dir.rglob("*.java"):
                try:
                    with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
                        content = f.read()
                        if uuid in content or re.search(search_pattern, content, re.IGNORECASE):
                            # Found the UUID
                            found = True
                            # Try to extract context
                            lines = content.split('\n')
                            for i, line in enumerate(lines):
                                if uuid in line or re.search(search_pattern, line, re.IGNORECASE):
                                    context_start = max(0, i - 2)
                                    context_end = min(len(lines), i + 3)
                                    context = '\n'.join(lines[context_start:context_end])
                                    
                                    self.findings.append({
                                        'type': 'UUID_FOUND',
                                        'old_name': name,
                                        'uuid': uuid,
                                        'new_file': str(java_file.relative_to(self.new_app_dir)),
                                        'context': context,
                                        'status': 'UNCHANGED'
                                    })
                                    
                                    print(f"  ✓ Found in: {java_file.name}")
                                    print(f"    Context: {line.strip()[:80]}...")
                                    break
                            break
                except Exception as e:
                    continue
            
            if not found:
                self.findings.append({
                    'type': 'UUID_MISSING',
                    'old_name': name,
                    'uuid': uuid,
                    'status': 'POTENTIALLY_CHANGED'
                })
                print(f"  ✗ NOT FOUND (may be obfuscated or changed)")
            
            print()
    
    def _check_data_structures(self):
        """Check for data structure equivalents."""
        print("Checking data structures...")
        print()
        
        for structure in self.old_elements['data_structures']:
            name = structure['name']
            print(f"Searching for structure: {name}")
            
            # Look for class name in new app
            found = False
            for java_file in self.new_app_dir.rglob("*.java"):
                try:
                    with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
                        content = f.read()
                        if f'class {name}' in content or f'{name}.java' == java_file.name:
                            found = True
                            self.findings.append({
                                'type': 'STRUCTURE_FOUND',
                                'name': name,
                                'new_file': str(java_file.relative_to(self.new_app_dir)),
                                'status': 'UNCHANGED'
                            })
                            print(f"  ✓ Found similar structure in: {java_file.name}")
                            break
                except Exception as e:
                    continue
            
            if not found:
                self.findings.append({
                    'type': 'STRUCTURE_MISSING',
                    'name': name,
                    'status': 'OBFUSCATED_OR_CHANGED'
                })
                print(f"  ✗ NOT FOUND (obfuscated)")
            
            print()
    
    def _generate_summary(self):
        """Generate comparison summary."""
        print()
        print("=" * 70)
        print("PROTOCOL COMPARISON SUMMARY")
        print("=" * 70)
        print()
        
        uuids_found = [f for f in self.findings if f['type'] == 'UUID_FOUND']
        uuids_missing = [f for f in self.findings if f['type'] == 'UUID_MISSING']
        
        print(f"BLE UUIDs:")
        print(f"  Found unchanged: {len(uuids_found)}")
        print(f"  Missing/changed: {len(uuids_missing)}")
        print()
        
        if uuids_found:
            print("✓ Found UUIDs (protocol likely unchanged):")
            for finding in uuids_found:
                print(f"  - {finding['old_name']}: {finding['uuid']}")
        print()
        
        if uuids_missing:
            print("✗ Missing UUIDs (may indicate protocol change):")
            for finding in uuids_missing:
                print(f"  - {finding['old_name']}: {finding['uuid']}")
        print()
        
        # Conclusion
        if len(uuids_found) > 0 and len(uuids_missing) == 0:
            print("=" * 70)
            print("CONCLUSION: BLE Protocol appears UNCHANGED")
            print("=" * 70)
            print()
            print("All critical BLE UUIDs from the old app were found in the new app.")
            print("The protocol implementation is likely compatible.")
        elif len(uuids_found) > 0 and len(uuids_missing) > 0:
            print("=" * 70)
            print("CONCLUSION: BLE Protocol PARTIALLY CHANGED")
            print("=" * 70)
            print()
            print("Some UUIDs are present but others are missing.")
            print("This may indicate:")
            print("  - Heavy obfuscation hiding some elements")
            print("  - Partial protocol updates")
            print("  - New features with additional UUIDs")
        else:
            print("=" * 70)
            print("CONCLUSION: Cannot determine (heavy obfuscation)")
            print("=" * 70)
            print()
            print("No UUIDs found. The new app is too heavily obfuscated")
            print("to extract protocol information through string searching.")
            print()
            print("Recommendation: Use BLE packet capture or continue using")
            print("the old app code as reference.")


def main():
    """Main entry point."""
    old_app_dir = "meater_app"
    new_app_dir = "meater.app.new"
    
    # Extract from old app
    extractor = ProtocolExtractor(old_app_dir)
    old_elements = extractor.extract_from_old_app()
    
    # Save extracted elements
    output_file = "tools/protocol_elements_old.json"
    with open(output_file, 'w') as f:
        json.dump(old_elements, f, indent=2)
    print()
    print(f"Saved extracted protocol elements to: {output_file}")
    print()
    
    # Compare with new app
    comparator = ProtocolComparator(old_elements, new_app_dir)
    findings = comparator.compare()
    
    # Save findings
    findings_file = "tools/protocol_comparison_findings.json"
    with open(findings_file, 'w') as f:
        json.dump(findings, f, indent=2)
    print(f"Saved comparison findings to: {findings_file}")
    print()


if __name__ == '__main__':
    main()
