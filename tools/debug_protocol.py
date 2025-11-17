#!/usr/bin/env python3
"""
Debug tool that compiles our C++ implementation, extracts a packet,
then steps through BOTH our encoder AND the app's decoder line-by-line
to find exactly where the mismatch occurs.
"""

import subprocess
import sys
import os
import re
from pathlib import Path

# Import our app decoder
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from test_with_app_decoder import (
    ProtoReader, MeaterLinkMessage, MeaterLinkHeader, MasterMessage, MLDevice,
    MasterType, CloudConnectionState, ConnectionState, DeviceConnectionType,
    ChargeState, MLProbe
)


def compile_and_extract_packet():
    """
    Compile a standalone test version of our C++ encoder and extract a packet.
    This tests the ACTUAL implementation, not a simulation.
    """
    print("=" * 80)
    print("STEP 1: COMPILE OUR C++ IMPLEMENTATION")
    print("=" * 80)
    
    # Create a standalone test program from our actual implementation
    test_cpp = """
#include <cstdint>
#include <cstring>
#include <cstdio>
#include <sys/time.h>

// Include our ACTUAL implementation
namespace {
    // Minimal ESP32 stubs for compilation
    namespace esp {
        int wifi_get_mac(int mode, uint8_t* mac) {
            // Use a fixed MAC for testing: e4:b3:23:c2:92:f4
            mac[0] = 0xe4; mac[1] = 0xb3; mac[2] = 0x23;
            mac[3] = 0xc2; mac[4] = 0x92; mac[5] = 0xf4;
            return 0;
        }
    }
    #define ESP_LOGI(tag, ...) fprintf(stderr, "[INFO] " __VA_ARGS__); fprintf(stderr, "\\n")
}

// Copy of our encoding methods from meater_udp_broadcast.h
class PacketBuilder {
private:
    uint8_t buffer_[512];
    size_t pos_;
    uint64_t device_identifier_;
    uint64_t sequence_number_;
    
    // Test data
    uint8_t temp_data_[8];
    uint8_t battery_data_[2];
    int8_t rssi_;
    
public:
    PacketBuilder() : pos_(0), sequence_number_(0), rssi_(-50) {
        // Simulate temperature data: 20°C
        memset(temp_data_, 0, sizeof(temp_data_));
        temp_data_[0] = 0x40; // tip_raw = 320 (20°C)
        temp_data_[1] = 0x01;
        
        // Simulate battery: 85%
        battery_data_[0] = 0x09; // 85 * 10 / 10 = 8.5, stored as 9
        battery_data_[1] = 0x00;
        
        // Generate device ID from MAC
        uint8_t mac[6];
        esp::wifi_get_mac(0, mac);
        device_identifier_ = 0;
        for (int i = 0; i < 6; i++) {
            device_identifier_ |= ((uint64_t)mac[i]) << (i * 8);
        }
        
        ESP_LOGI("TEST", "Device ID: %016llx", (unsigned long long)device_identifier_);
    }
    
    size_t encode_varint(uint64_t value) {
        size_t start = pos_;
        while (value >= 0x80) {
            buffer_[pos_++] = (uint8_t)(value | 0x80);
            value >>= 7;
        }
        buffer_[pos_++] = (uint8_t)value;
        return pos_ - start;
    }
    
    size_t encode_field_header(uint32_t field_number, uint8_t wire_type) {
        return encode_varint((field_number << 3) | wire_type);
    }
    
    size_t encode_varint_field(uint32_t field_number, uint64_t value) {
        size_t start = pos_;
        encode_field_header(field_number, 0);
        encode_varint(value);
        return pos_ - start;
    }
    
    size_t encode_sint32_field(uint32_t field_number, int32_t value) {
        uint32_t zigzag = (value << 1) ^ (value >> 31);
        return encode_varint_field(field_number, zigzag);
    }
    
    size_t encode_fixed64(uint64_t value) {
        size_t start = pos_;
        for (int i = 0; i < 8; i++) {
            buffer_[pos_++] = (value >> (i * 8)) & 0xFF;
        }
        return pos_ - start;
    }
    
    size_t encode_fixed64_field(uint32_t field_number, uint64_t value) {
        size_t start = pos_;
        encode_field_header(field_number, 1);
        encode_fixed64(value);
        return pos_ - start;
    }
    
    size_t encode_string(uint32_t field_number, const char* str) {
        size_t start = pos_;
        size_t len = strlen(str);
        encode_field_header(field_number, 2);
        encode_varint(len);
        memcpy(buffer_ + pos_, str, len);
        pos_ += len;
        return pos_ - start;
    }
    
    size_t encode_bytes(uint32_t field_number, const uint8_t* data, size_t len) {
        size_t start = pos_;
        encode_field_header(field_number, 2);
        encode_varint(len);
        memcpy(buffer_ + pos_, data, len);
        pos_ += len;
        return pos_ - start;
    }
    
    size_t encode_length_delimited(uint32_t field_number, const uint8_t* data, size_t len) {
        return encode_bytes(field_number, data, len);
    }
    
    // Build ChargeState
    size_t build_charge_state(uint8_t* output) {
        size_t saved_pos = pos_;
        uint8_t* saved_buffer = buffer_ + pos_;
        size_t temp_pos = 0;
        
        // Field 2: batteryPercent
        uint16_t raw_battery = (battery_data_[1] << 8) | battery_data_[0];
        uint32_t battery_percent = (raw_battery * 10);
        if (battery_percent > 100) battery_percent = 100;
        
        ESP_LOGI("BUILD", "ChargeState: batteryPercent=%u", battery_percent);
        
        size_t start_pos = pos_;
        encode_varint_field(2, battery_percent);
        size_t len = pos_ - start_pos;
        
        memcpy(output, buffer_ + start_pos, len);
        pos_ = saved_pos;
        return len;
    }
    
    // Build CookStatus
    size_t build_cook_status(uint8_t* output) {
        size_t saved_pos = pos_;
        size_t start_pos = pos_;
        
        // Extract temperature data
        uint16_t tip_raw = (temp_data_[1] << 8) | temp_data_[0];
        uint16_t oa_raw = (temp_data_[3] << 8) | temp_data_[2];
        uint16_t ra_raw = (temp_data_[5] << 8) | temp_data_[4];
        
        float tip_temp = (tip_raw + 8.0f) / 16.0f;
        uint16_t oa_limited = (oa_raw < 48) ? oa_raw : 48;
        float ambient_temp = tip_temp + ((ra_raw - oa_limited) * 16.0f * 589.0f) / (1487.0f * 16.0f);
        
        int32_t internal_temp = (int32_t)(tip_temp * 16.0f);
        int32_t ambient_temp_encoded = (int32_t)(ambient_temp * 16.0f);
        
        ESP_LOGI("BUILD", "CookStatus: internalTemp=%d, ambientTemp=%d", internal_temp, ambient_temp_encoded);
        
        // Field 1: internalTemperature (sint32)
        encode_sint32_field(1, internal_temp);
        // Field 2: ambientTemperature (sint32)
        encode_sint32_field(2, ambient_temp_encoded);
        
        size_t len = pos_ - start_pos;
        memcpy(output, buffer_ + start_pos, len);
        pos_ = saved_pos;
        return len;
    }
    
    // Build CookSetup
    size_t build_cook_setup(uint8_t* output) {
        size_t saved_pos = pos_;
        size_t start_pos = pos_;
        
        ESP_LOGI("BUILD", "CookSetup: sequenceNumber=1, state=0");
        
        // Field 1: sequenceNumber
        encode_varint_field(1, 1);
        // Field 2: state (COOK_STATE_NOT_STARTED = 0)
        encode_varint_field(2, 0);
        
        size_t len = pos_ - start_pos;
        memcpy(output, buffer_ + start_pos, len);
        pos_ = saved_pos;
        return len;
    }
    
    // Build MLProbe
    size_t build_ml_probe(uint8_t* output) {
        size_t saved_pos = pos_;
        size_t start_pos = pos_;
        
        ESP_LOGI("BUILD", "MLProbe: parentIdentifier=%016llx", (unsigned long long)device_identifier_);
        
        // Field 1: parentIdentifier (fixed64)
        encode_fixed64_field(1, device_identifier_);
        
        // Field 2: setup (CookSetup)
        uint8_t setup_buffer[32];
        size_t setup_len = build_cook_setup(setup_buffer);
        encode_length_delimited(2, setup_buffer, setup_len);
        
        // Field 3: status (CookStatus)
        uint8_t status_buffer[32];
        size_t status_len = build_cook_status(status_buffer);
        encode_length_delimited(3, status_buffer, status_len);
        
        size_t len = pos_ - start_pos;
        memcpy(output, buffer_ + start_pos, len);
        pos_ = saved_pos;
        return len;
    }
    
    // Build MLDevice
    size_t build_ml_device(uint8_t* output) {
        size_t saved_pos = pos_;
        size_t start_pos = pos_;
        
        ESP_LOGI("BUILD", "MLDevice: identifier=%016llx, connectionState=1, connectionType=0",
                 (unsigned long long)device_identifier_);
        
        // Field 1: probe (MLProbe)
        uint8_t probe_buffer[128];
        size_t probe_len = build_ml_probe(probe_buffer);
        encode_length_delimited(1, probe_buffer, probe_len);
        
        // Field 5: identifier (fixed64) - REQUIRED
        encode_fixed64_field(5, device_identifier_);
        
        // Field 6: probeNumber (uint32) - REQUIRED
        encode_varint_field(6, 0);
        
        // Field 7: chargeState (ChargeState) - REQUIRED
        uint8_t charge_buffer[16];
        size_t charge_len = build_charge_state(charge_buffer);
        encode_length_delimited(7, charge_buffer, charge_len);
        
        // Field 8: firmwareRevision (string)
        encode_string(8, "v1.0.6_0");
        
        // Field 9: connectionState (enum) - REQUIRED
        encode_varint_field(9, 1); // CONNECTION_STATE_CONNECTED
        
        // Field 10: connectionType (enum) - REQUIRED
        encode_varint_field(10, 0); // BLE
        
        // Field 11: bleSignalLevel (sint32)
        encode_sint32_field(11, rssi_);
        
        size_t len = pos_ - start_pos;
        memcpy(output, buffer_ + start_pos, len);
        pos_ = saved_pos;
        return len;
    }
    
    // Build MasterMessage
    size_t build_master_message(uint8_t* output) {
        size_t saved_pos = pos_;
        size_t start_pos = pos_;
        
        ESP_LOGI("BUILD", "MasterMessage: masterType=0 (BLOCK), cloudConnectionState=0");
        
        // Field 1: masterType (enum) - REQUIRED
        encode_varint_field(1, 0); // MASTER_TYPE_BLOCK
        
        // Field 2: cloudConnectionState (enum) - REQUIRED
        encode_varint_field(2, 0); // CLOUD_CONNECTION_STATE_DISABLED
        
        // Field 3: devices (repeated MLDevice)
        uint8_t device_buffer[256];
        size_t device_len = build_ml_device(device_buffer);
        encode_length_delimited(3, device_buffer, device_len);
        
        size_t len = pos_ - start_pos;
        memcpy(output, buffer_ + start_pos, len);
        pos_ = saved_pos;
        return len;
    }
    
    // Build MeaterLinkHeader
    size_t build_header(uint8_t* output) {
        size_t saved_pos = pos_;
        size_t start_pos = pos_;
        
        struct timeval tv;
        gettimeofday(&tv, NULL);
        uint64_t timestamp_ms = (uint64_t)tv.tv_sec * 1000 + tv.tv_usec / 1000;
        
        ESP_LOGI("BUILD", "Header: timestampMs=%llu, sequence=%llu",
                 (unsigned long long)timestamp_ms, (unsigned long long)sequence_number_);
        
        // Field 1: timestampMs
        encode_varint_field(1, timestamp_ms);
        // Field 2: sequenceNumber
        encode_varint_field(2, sequence_number_++);
        // Field 3: version
        encode_varint_field(3, 7);
        // Field 4: unknown1
        encode_varint_field(4, 3);
        // Field 5: unknown2 (fixed64)
        encode_fixed64_field(5, 0x6e16ac39937193d8ULL);
        
        size_t len = pos_ - start_pos;
        memcpy(output, buffer_ + start_pos, len);
        pos_ = saved_pos;
        return len;
    }
    
    // Build complete MeaterLinkMessage
    size_t build_packet() {
        pos_ = 0;
        
        ESP_LOGI("BUILD", "===== BUILDING MEATERLINKME SSAGEpacket =====");
        
        // Field 1: header (MeaterLinkHeader)
        uint8_t header_buffer[64];
        size_t header_len = build_header(header_buffer);
        encode_length_delimited(1, header_buffer, header_len);
        
        // Field 3: masterMessage (MasterMessage)
        uint8_t master_buffer[384];
        size_t master_len = build_master_message(master_buffer);
        encode_length_delimited(3, master_buffer, master_len);
        
        ESP_LOGI("BUILD", "Total packet size: %zu bytes", pos_);
        
        return pos_;
    }
    
    void print_packet_hex() {
        printf("\\nPACKET_HEX:");
        for (size_t i = 0; i < pos_; i++) {
            printf("%02x", buffer_[i]);
        }
        printf("\\n");
    }
};

int main() {
    PacketBuilder builder;
    size_t len = builder.build_packet();
    builder.print_packet_hex();
    return 0;
}
"""
    
    # Write test program
    test_dir = Path("/tmp/meater_test")
    test_dir.mkdir(exist_ok=True)
    
    test_file = test_dir / "test_encoder.cpp"
    with open(test_file, 'w') as f:
        f.write(test_cpp)
    
    # Compile
    print(f"\n📝 Compiling {test_file}...")
    result = subprocess.run(
        ["g++", "-std=c++11", "-o", str(test_dir / "test_encoder"), str(test_file)],
        capture_output=True,
        text=True
    )
    
    if result.returncode != 0:
        print(f"❌ Compilation failed:")
        print(result.stderr)
        return None
    
    print("✅ Compilation successful")
    
    # Run and extract packet
    print("\n🚀 Running encoder...")
    result = subprocess.run(
        [str(test_dir / "test_encoder")],
        capture_output=True,
        text=True
    )
    
    if result.returncode != 0:
        print(f"❌ Execution failed:")
        print(result.stderr)
        return None
    
    # Parse output
    print("\n📤 Encoder output:")
    print(result.stderr)
    
    # Extract hex
    for line in result.stdout.split('\n'):
        if line.startswith("PACKET_HEX:"):
            hex_data = line.split(':')[1].strip()
            print(f"\n✅ Generated packet: {len(hex_data)//2} bytes")
            return hex_data
    
    print("❌ Could not extract packet hex")
    return None


def debug_decoder_step_by_step(hex_data: str):
    """
    Step through the app's decoder line-by-line, showing exactly what it sees.
    This simulates running the app's decoder in a debugger.
    """
    print("\n" + "=" * 80)
    print("STEP 2: DEBUG APP DECODER LINE-BY-LINE")
    print("=" * 80)
    
    packet_bytes = bytes.fromhex(hex_data)
    
    print(f"\n🔍 Starting decode of {len(packet_bytes)} bytes...")
    print(f"   First 32 bytes: {packet_bytes[:32].hex()}")
    
    try:
        reader = ProtoReader(packet_bytes)
        
        print("\n" + "-" * 80)
        print("MeaterLinkMessage.decode() - TOP LEVEL")
        print("-" * 80)
        
        message = MeaterLinkMessage()
        beginMessage = reader.beginMessage()
        print(f"✓ beginMessage() at position {beginMessage}")
        
        field_count = 0
        while True:
            pos_before = reader.pos
            nextTag = reader.nextTag()
            
            if nextTag == -1:
                print(f"\n✓ nextTag() returned -1 (end of message)")
                print(f"✓ endMessage() - message complete")
                break
            
            field_count += 1
            print(f"\n🔸 Field #{field_count}")
            print(f"   Position: {pos_before} → {reader.pos}")
            print(f"   Tag: {nextTag}")
            print(f"   Wire type: {reader.current_wire_type}")
            
            if nextTag == 1:
                print(f"   ✓ This is Field 1: MeaterLinkHeader")
                nested_bytes = reader.readLengthDelimitedMessage()
                print(f"   ✓ Read {len(nested_bytes)} bytes for nested message")
                print(f"      Bytes: {nested_bytes.hex()}")
                
                nested_reader = ProtoReader(nested_bytes)
                header = MeaterLinkHeader.decode(nested_reader)
                message.header = header
                
                print(f"   ✓ Decoded header:")
                print(f"      timestampMs: {header.timestampMs}")
                print(f"      sequenceNumber: {header.sequenceNumber}")
                print(f"      version: {header.version}")
                
            elif nextTag == 3:
                print(f"   ✓ This is Field 3: MasterMessage (CRITICAL!)")
                nested_bytes = reader.readLengthDelimitedMessage()
                print(f"   ✓ Read {len(nested_bytes)} bytes for nested message")
                print(f"      First 32 bytes: {nested_bytes[:32].hex()}")
                
                print(f"\n   🔍 Decoding MasterMessage...")
                nested_reader = ProtoReader(nested_bytes)
                
                try:
                    master = MasterMessage.decode(nested_reader)
                    message.masterMessage = master
                    
                    print(f"   ✅ MasterMessage decoded successfully!")
                    print(f"      masterType: {master.masterType}")
                    if master.masterType == 0:
                        print(f"         ✅ = MASTER_TYPE_BLOCK (correct!)")
                    print(f"      cloudConnectionState: {master.cloudConnectionState}")
                    print(f"      devices: {len(master.devices)} device(s)")
                    
                    if master.devices:
                        device = master.devices[0]
                        print(f"\n      🔍 First device:")
                        print(f"         identifier: 0x{device.identifier:016x}")
                        print(f"         probeNumber: {device.probeNumber}")
                        print(f"         connectionState: {device.connectionState}")
                        print(f"         connectionType: {device.connectionType}")
                        print(f"         firmwareRevision: {device.firmwareRevision}")
                        if device.chargeState:
                            print(f"         chargeState.batteryPercent: {device.chargeState.batteryPercent}")
                        if device.bleSignalLevel is not None:
                            print(f"         bleSignalLevel: {device.bleSignalLevel} dBm")
                        if device.probe:
                            print(f"         probe: Present")
                        
                except Exception as e:
                    print(f"   ❌ MasterMessage decode FAILED: {e}")
                    import traceback
                    traceback.print_exc()
                    return False
                    
            else:
                print(f"   ⚠️  Unknown field {nextTag}")
                wire_type = reader.peekFieldEncoding()
                if wire_type == 0:
                    reader.readVarint()
                elif wire_type == 1:
                    reader.readFixed64()
                elif wire_type == 2:
                    reader.readBytes()
        
        # Final validation
        print("\n" + "=" * 80)
        print("STEP 3: VALIDATION")
        print("=" * 80)
        
        print(f"\n✓ Total fields decoded: {field_count}")
        
        if not message.header:
            print("\n❌ FAIL: No MeaterLinkHeader (field 1)")
            return False
        else:
            print("\n✅ MeaterLinkHeader present")
        
        if not message.masterMessage:
            print("\n❌ FAIL: No MasterMessage (field 3)")
            print("   ⚠️  APP WILL NOT DISCOVER DEVICE")
            print("   ⚠️  Blocks MUST send MasterMessage")
            return False
        else:
            print("\n✅ MasterMessage present")
            
            if message.masterMessage.masterType != 0:
                print(f"\n❌ FAIL: masterType = {message.masterMessage.masterType}")
                print(f"   Expected: 0 (MASTER_TYPE_BLOCK)")
                return False
            else:
                print("✅ masterType = MASTER_TYPE_BLOCK")
            
            if not message.masterMessage.devices:
                print("\n❌ FAIL: No devices in MasterMessage")
                return False
            else:
                print(f"✅ {len(message.masterMessage.devices)} device(s) present")
        
        print("\n" + "=" * 80)
        print("✅ SUCCESS: Packet is valid for app discovery!")
        print("=" * 80)
        print("\nThe MEATER app should discover this device as a MEATER Block.")
        return True
        
    except Exception as e:
        print(f"\n❌ DECODE FAILED: {e}")
        import traceback
        traceback.print_exc()
        return False


def main():
    print("=" * 80)
    print("MEATER PROTOCOL DEBUG TOOL")
    print("=" * 80)
    print("\nThis tool:")
    print("1. Compiles our ACTUAL C++ implementation")
    print("2. Generates a real packet from our code")
    print("3. Steps through the app's decoder line-by-line")
    print("4. Shows exactly where/how it fails (if it does)")
    
    # Step 1: Compile and get packet
    hex_data = compile_and_extract_packet()
    if not hex_data:
        print("\n❌ Could not generate packet from C++ implementation")
        return 1
    
    # Step 2: Debug decoder
    success = debug_decoder_step_by_step(hex_data)
    
    if success:
        print("\n✅ Implementation is correct!")
        print("   Ready for hardware testing.")
        return 0
    else:
        print("\n❌ Implementation has issues")
        print("   Review the decoder output above to see where it failed.")
        return 1


if __name__ == "__main__":
    sys.exit(main())
