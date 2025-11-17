#!/usr/bin/env python3
"""
Generic Protobuf Decoder Validator

This tool interprets decompiled Java ProtoAdapter code and simulates its execution
against test packets. It makes NO assumptions about the protocol structure.

Usage:
    python validate_protocol.py <packet_hex> [class_name]
    
Example:
    python validate_protocol.py 0a1308... MeaterLinkMessage
    
The tool will:
1. Parse the Java ProtoAdapter decode method for the specified class
2. Execute it step-by-step against the packet
3. Show exactly where decoding succeeds or fails
4. Follow all nested decode() calls recursively

This works for ANY protobuf message, not just MEATER protocol.
"""

import re
import sys
import struct
from pathlib import Path
from typing import Dict, Any, List, Tuple, Optional

class ProtoReader:
    """Simulates Wire Protocol's ProtoReader"""
    
    def __init__(self, data: bytes):
        self.data = data
        self.pos = 0
        
    def has_data(self) -> bool:
        return self.pos < len(self.data)
        
    def read_tag(self) -> Optional[int]:
        """Read next field tag, return None if no more data"""
        if not self.has_data():
            return None
        try:
            return self.read_varint()
        except:
            return None
            
    def read_varint(self) -> int:
        result = 0
        shift = 0
        while True:
            if self.pos >= len(self.data):
                raise ValueError("End of data reading varint")
            b = self.data[self.pos]
            self.pos += 1
            result |= (b & 0x7F) << shift
            if (b & 0x80) == 0:
                break
            shift += 7
        return result
        
    def read_fixed64(self) -> int:
        if self.pos + 8 > len(self.data):
            raise ValueError("Not enough data for fixed64")
        value = struct.unpack('<Q', self.data[self.pos:self.pos+8])[0]
        self.pos += 8
        return value
        
    def read_fixed32(self) -> int:
        if self.pos + 4 > len(self.data):
            raise ValueError("Not enough data for fixed32")
        value = struct.unpack('<I', self.data[self.pos:self.pos+4])[0]
        self.pos += 4
        return value
        
    def read_length_delimited(self) -> bytes:
        length = self.read_varint()
        if self.pos + length > len(self.data):
            raise ValueError(f"Not enough data for length-delimited (need {length})")
        data = self.data[self.pos:self.pos+length]
        self.pos += length
        return data
        
    def read_sint32(self) -> int:
        """ZigZag decode"""
        n = self.read_varint()
        return (n >> 1) ^ (-(n & 1))

class JavaCodeInterpreter:
    """
    Interprets Java ProtoAdapter decode methods and simulates their execution.
    
    This is a generic interpreter that works for ANY protobuf message by parsing
    the decompiled Java code structure.
    """
    
    def __init__(self, meater_app_path: str):
        self.meater_app_path = Path(meater_app_path)
        self.v3protobuf_path = self.meater_app_path / "v3protobuf"
        self.step_num = 0
        
    def find_java_file(self, class_name: str) -> Optional[Path]:
        """Find the Java file for a given class name"""
        java_file = self.v3protobuf_path / f"{class_name}.java"
        if java_file.exists():
            return java_file
        return None
        
    def parse_decode_method(self, java_content: str, class_name: str) -> Dict[str, Any]:
        """
        Parse the ProtoAdapter decode method from Java code.
        
        Extracts:
        - Field numbers and their types
        - Which adapter to call for nested messages
        - Required vs optional fields
        - Build validation logic
        """
        result = {
            'class_name': class_name,
            'fields': {},
            'required_fields': [],
            'decode_logic': []
        }
        
        # Find the ProtoAdapter decode method - use lookahead to find method boundaries better
        decode_pattern = r'public\s+\w+\s+\w*decode\(ProtoReader\s+protoReader\)\s*\{(.*?)(?=\n\s+public|\n\s+private|\Z)'
        decode_match = re.search(decode_pattern, java_content, re.DOTALL)
        
        if not decode_match:
            return result
            
        decode_body = decode_match.group(1)
        
        # Try to find switch/case statements first
        case_pattern = r'case\s+(\d+):\s*(.*?)break;'
        cases = re.findall(case_pattern, decode_body, re.DOTALL)
        
        if cases:
            # Found switch/case pattern
            for field_num, case_body in cases:
                field_info = self.parse_field_decode(field_num, case_body, class_name)
                result['fields'][int(field_num)] = field_info
                result['decode_logic'].append(field_info)
        else:
            # Try if/else pattern: if (nextTag == N) { ... } else if (nextTag == M) { ... }
            # Handle both single-line and multi-line if statements
            if_pattern = r'if\s*\(\s*nextTag\s*==\s*(\d+)\s*\)\s*\{([^}]*)\}'
            if_matches = re.findall(if_pattern, decode_body, re.DOTALL)
            
            for field_num, if_body in if_matches:
                # Skip the check for nextTag == -1 (end condition)
                if field_num == "-1":
                    continue
                field_info = self.parse_field_decode(field_num, if_body, class_name)
                result['fields'][int(field_num)] = field_info
                result['decode_logic'].append(field_info)
                
            # Also check for final else clause which often handles the last field
            # Pattern: } else if (nextTag != N) { ... } else { builder.fieldName(...) }
            final_else_pattern = r'\}\s*else\s*if\s*\(\s*nextTag\s*!=\s*(\d+)\s*\)\s*\{[^}]*\}\s*else\s*\{([^}]*)\}'
            final_else_match = re.search(final_else_pattern, decode_body, re.DOTALL)
            if final_else_match:
                # The != N means the else handles field N
                field_num = final_else_match.group(1)
                else_body = final_else_match.group(2)
                field_info = self.parse_field_decode(field_num, else_body, class_name)
                result['fields'][int(field_num)] = field_info
                result['decode_logic'].append(field_info)
            
        # Find required fields from Builder.build() method
        build_pattern = r'if\s*\((.*?)\s*!=\s*null.*?\)\s*\{.*?return.*?\}.*?throw\s+Internal\.missingRequiredFields\((.*?)\);'
        build_match = re.search(build_pattern, java_content, re.DOTALL)
        
        if build_match:
            required_check = build_match.group(1)
            # Extract field names from the condition
            field_names = re.findall(r'this\.(\w+)', required_check)
            result['required_fields'] = field_names
            
        return result
        
    def parse_field_decode(self, field_num: str, case_body: str, parent_class: str) -> Dict[str, Any]:
        """Parse individual field decode logic"""
        field_info = {
            'field_number': int(field_num),
            'field_name': None,
            'field_type': None,
            'adapter': None,
            'is_repeated': False
        }
        
        # Extract field name from builder.fieldName(...)
        field_name_pattern = r'builder\.(\w+)\('
        field_name_match = re.search(field_name_pattern, case_body)
        if field_name_match:
            field_info['field_name'] = field_name_match.group(1)
            
        # Check if it's a nested message decode
        if '.ADAPTER.decode(' in case_body:
            adapter_pattern = r'(\w+)\.ADAPTER\.decode'
            adapter_match = re.search(adapter_pattern, case_body)
            if adapter_match:
                field_info['adapter'] = adapter_match.group(1)
                field_info['field_type'] = 'message'
                
        # Check for primitive types
        elif 'ProtoAdapter.UINT32.decode' in case_body:
            field_info['field_type'] = 'uint32'
        elif 'ProtoAdapter.FIXED64.decode' in case_body:
            field_info['field_type'] = 'fixed64'
        elif 'ProtoAdapter.SINT32.decode' in case_body:
            field_info['field_type'] = 'sint32'
        elif 'ProtoAdapter.STRING.decode' in case_body:
            field_info['field_type'] = 'string'
            
        # Check if repeated
        if '.add(' in case_body:
            field_info['is_repeated'] = True
            
        return field_info
        
    def decode_message(self, packet_data: bytes, class_name: str, indent: int = 0) -> Dict[str, Any]:
        """
        Decode a message by interpreting its Java ProtoAdapter code.
        
        This recursively follows nested decode calls.
        """
        prefix = "  " * indent
        self.step_num += 1
        step = self.step_num
        
        print(f"\n{prefix}[Step {step}] Decoding {class_name}...")
        
        # Find and parse the Java file
        java_file = self.find_java_file(class_name)
        if not java_file:
            print(f"{prefix}  ❌ ERROR: Cannot find {class_name}.java")
            raise FileNotFoundError(f"{class_name}.java not found")
            
        with open(java_file, 'r') as f:
            java_content = f.read()
            
        # Parse the decode method
        decode_info = self.parse_decode_method(java_content, class_name)
        
        if not decode_info['fields']:
            print(f"{prefix}  ⚠️  WARNING: No decode logic found in {class_name}")
            
        # Simulate the decode process
        reader = ProtoReader(packet_data)
        decoded_message = {}
        
        print(f"{prefix}  Java: Builder builder = new Builder();")
        print(f"{prefix}  Java: while (true) {{ int nextTag = protoReader.nextTag(); ... }}")
        
        while reader.has_data():
            tag = reader.read_tag()
            if tag is None:
                break
                
            field_number = tag >> 3
            wire_type = tag & 0x07
            
            print(f"{prefix}    → Field {field_number} (wire type {wire_type})")
            
            if field_number in decode_info['fields']:
                field_info = decode_info['fields'][field_number]
                print(f"{prefix}      Java: case {field_number}: builder.{field_info['field_name']}(...)")
                
                try:
                    value = self.decode_field(reader, field_info, wire_type, indent + 2)
                    decoded_message[field_info['field_name']] = value
                    print(f"{prefix}      ✅ Success")
                except Exception as e:
                    print(f"{prefix}      ❌ ERROR: {e}")
                    raise
            else:
                print(f"{prefix}      ⚠️  Unknown field - skipping")
                self.skip_field(reader, wire_type)
                
        # Validate required fields (from Builder.build() method)
        print(f"{prefix}  Java: return builder.build();")
        self.validate_required_fields(decoded_message, decode_info, prefix)
        
        return decoded_message
        
    def decode_field(self, reader: ProtoReader, field_info: Dict[str, Any], 
                     wire_type: int, indent: int) -> Any:
        """Decode a single field based on its type"""
        prefix = "  " * indent
        
        if field_info['field_type'] == 'message':
            # Nested message - recursively decode
            data = reader.read_length_delimited()
            print(f"{prefix}Java: {field_info['adapter']}.ADAPTER.decode(protoReader)")
            return self.decode_message(data, field_info['adapter'], indent + 1)
            
        elif field_info['field_type'] == 'uint32':
            value = reader.read_varint()
            print(f"{prefix}Value: {value}")
            return value
            
        elif field_info['field_type'] == 'fixed64':
            value = reader.read_fixed64()
            print(f"{prefix}Value: 0x{value:016x}")
            return value
            
        elif field_info['field_type'] == 'sint32':
            value = reader.read_sint32()
            print(f"{prefix}Value: {value}")
            return value
            
        elif field_info['field_type'] == 'string':
            data = reader.read_length_delimited()
            value = data.decode('utf-8', errors='replace')
            print(f"{prefix}Value: \"{value}\"")
            return value
            
        else:
            # Unknown type - read as length-delimited
            data = reader.read_length_delimited()
            print(f"{prefix}Value: <{len(data)} bytes>")
            return data
            
    def skip_field(self, reader: ProtoReader, wire_type: int):
        """Skip unknown field based on wire type"""
        if wire_type == 0:  # varint
            reader.read_varint()
        elif wire_type == 1:  # fixed64
            reader.read_fixed64()
        elif wire_type == 2:  # length-delimited
            reader.read_length_delimited()
        elif wire_type == 5:  # fixed32
            reader.read_fixed32()
            
    def validate_required_fields(self, decoded_message: Dict[str, Any], 
                                 decode_info: Dict[str, Any], prefix: str):
        """Validate that all required fields are present (from Builder.build())"""
        missing = []
        for field_name in decode_info['required_fields']:
            if field_name not in decoded_message:
                missing.append(field_name)
                
        if missing:
            error = f"Internal.missingRequiredFields: {', '.join(missing)}"
            print(f"{prefix}  ❌ VALIDATION FAILED: {error}")
            raise ValueError(error)
        else:
            print(f"{prefix}  ✅ All required fields present")


def main():
    if len(sys.argv) < 2:
        print("Usage: python validate_protocol.py <packet_hex> [class_name]")
        print("\nGeneric protobuf decoder validator that interprets Java ProtoAdapter code.")
        print("\nArguments:")
        print("  packet_hex  - Hex string of the packet to validate")
        print("  class_name  - Java class to decode as (default: MeaterLinkMessage)")
        print("\nExample:")
        print("  python validate_protocol.py 0a1308... MeaterLinkMessage")
        print("\nThis tool:")
        print("  - Reads the decompiled Java code for the specified class")
        print("  - Simulates the ProtoAdapter.decode() method execution")
        print("  - Shows step-by-step what happens during decoding")
        print("  - Works for ANY protocol version - just interprets the Java code")
        sys.exit(1)
        
    packet_hex = sys.argv[1].replace(" ", "").replace(":", "").replace("-", "")
    class_name = sys.argv[2] if len(sys.argv) > 2 else "MeaterLinkMessage"
    
    try:
        packet_data = bytes.fromhex(packet_hex)
    except ValueError as e:
        print(f"❌ ERROR: Invalid hex string: {e}")
        sys.exit(1)
        
    print("="*80)
    print("Generic Protobuf Decoder Validator")
    print("="*80)
    print(f"Packet: {packet_hex}")
    print(f"Length: {len(packet_data)} bytes")
    print(f"Decoding as: {class_name}")
    print(f"\nInterpreting Java code from meater_app/v3protobuf/{class_name}.java")
    print("="*80)
    
    # Find meater_app directory
    script_dir = Path(__file__).parent
    repo_root = script_dir.parent
    meater_app_path = repo_root / "meater_app"
    
    if not meater_app_path.exists():
        print(f"❌ ERROR: Cannot find meater_app directory at {meater_app_path}")
        sys.exit(1)
        
    try:
        interpreter = JavaCodeInterpreter(str(meater_app_path))
        result = interpreter.decode_message(packet_data, class_name)
        
        print("\n" + "="*80)
        print("✅ SUCCESS: Packet decoded successfully!")
        print("="*80)
        print(f"\nDecoded message structure:")
        import json
        print(json.dumps(result, indent=2, default=str))
        
        sys.exit(0)
        
    except Exception as e:
        print("\n" + "="*80)
        print(f"❌ FAILURE: Decoding failed")
        print("="*80)
        print(f"Error: {e}")
        import traceback
        traceback.print_exc()
        sys.exit(1)


if __name__ == "__main__":
    main()
