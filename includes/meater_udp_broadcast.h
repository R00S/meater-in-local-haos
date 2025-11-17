#pragma once

#include "esphome.h"

#ifdef USE_ESP32

#include <WiFi.h>
#include <WiFiUdp.h>
#include <sys/time.h>

// MEATER Link UDP Protocol Implementation
// Implements bidirectional UDP communication on port 7878
// Sends protobuf-encoded packets matching MEATER app format

class MeaterUDPBroadcast {
 public:
  static MeaterUDPBroadcast* instance;
  
  // UDP socket and state
  WiFiUDP udp;
  uint32_t sequence_number;
  uint16_t udp_port;
  IPAddress broadcast_address;
  bool udp_initialized;
  
  // Temperature and battery data
  std::vector<uint8_t> temp_data;
  std::vector<uint8_t> battery_data;
  
  // Calculated temperature values
  float tip_temp_celsius;
  float ambient_temp_celsius;
  uint32_t battery_percent;
  
  // User-configurable metadata
  std::string username;
  std::string device_model;
  std::string app_version;
  
  // Device identifier (16 bytes)
  uint8_t device_id[16];
  
  // Timing
  unsigned long last_broadcast_ms;
  unsigned long broadcast_interval_ms;
  
  MeaterUDPBroadcast() :
    sequence_number(0),
    udp_port(7878),
    udp_initialized(false),
    tip_temp_celsius(0.0f),
    ambient_temp_celsius(0.0f),
    battery_percent(0),
    username("meater@esp32.local"),
    device_model("ESP32-C6"),
    app_version("4.6.3"),
    last_broadcast_ms(0),
    broadcast_interval_ms(5000) {  // Broadcast every 5 seconds
    
    instance = this;
    temp_data.resize(8, 0);
    battery_data.resize(2, 0);
    
    // Generate a unique device ID based on MAC address
    uint8_t mac[6];
    WiFi.macAddress(mac);
    for (int i = 0; i < 6; i++) {
      device_id[i] = mac[i];
    }
    // Fill rest with pseudo-random data based on MAC
    for (int i = 6; i < 16; i++) {
      device_id[i] = (mac[i % 6] * (i + 1)) ^ 0x5A;
    }
  }
  
  void setup() {
    ESP_LOGI("meater_udp", "MEATER UDP broadcast initialized");
    instance = this;
  }
  
  void initialize_udp() {
    // This is called from loop() once WiFi is connected
    if (udp_initialized || WiFi.status() != WL_CONNECTED) {
      return;
    }
    
    ESP_LOGI("meater_udp", "Starting UDP on port %d", udp_port);
    
    // Get broadcast address from current WiFi connection
    IPAddress ip = WiFi.localIP();
    IPAddress subnet = WiFi.subnetMask();
    broadcast_address = IPAddress(
      ip[0] | (~subnet[0]),
      ip[1] | (~subnet[1]),
      ip[2] | (~subnet[2]),
      ip[3] | (~subnet[3])
    );
    
    ESP_LOGI("meater_udp", "Local IP: %s", ip.toString().c_str());
    ESP_LOGI("meater_udp", "Broadcast address: %s", broadcast_address.toString().c_str());
    
    // Start UDP listener
    if (udp.begin(udp_port)) {
      ESP_LOGI("meater_udp", "UDP listener started on port %d", udp_port);
      udp_initialized = true;
    } else {
      ESP_LOGE("meater_udp", "Failed to start UDP listener");
    }
  }
  
  void loop() {
    // Initialize UDP once WiFi is connected
    initialize_udp();
    
    if (!udp_initialized) {
      return;  // Wait for WiFi to connect
    }
    
    // Check for incoming UDP packets
    int packet_size = udp.parsePacket();
    if (packet_size) {
      ESP_LOGI("meater_udp", "Received UDP packet from %s:%d, size: %d",
               udp.remoteIP().toString().c_str(), udp.remotePort(), packet_size);
      
      // Read packet data
      uint8_t packet_buffer[256];
      int len = udp.read(packet_buffer, sizeof(packet_buffer));
      if (len > 0) {
        ESP_LOGI("meater_udp", "Packet data (%d bytes):", len);
        // Log hex dump of received packet
        for (int i = 0; i < len && i < 80; i += 16) {
          std::string hex_line;
          for (int j = 0; j < 16 && (i + j) < len; j++) {
            char hex[4];
            snprintf(hex, sizeof(hex), "%02x ", packet_buffer[i + j]);
            hex_line += hex;
          }
          ESP_LOGI("meater_udp", "  %s", hex_line.c_str());
        }
      }
    }
    
    // Send periodic broadcasts
    unsigned long current_ms = millis();
    if (current_ms - last_broadcast_ms >= broadcast_interval_ms) {
      send_broadcast();
      last_broadcast_ms = current_ms;
    }
  }
  
  void update_temp_data(const std::vector<uint8_t>& data) {
    temp_data = data;
    
    // Calculate temperature values (same as meater.yaml)
    if (data.size() >= 6) {
      uint16_t tip = data[0] + (data[1] << 8);
      uint16_t ra = data[2] + (data[3] << 8);
      uint16_t oa = data[4] + (data[5] << 8);
      
      // Tip temperature
      tip_temp_celsius = (tip + 8.0f) / 16.0f;
      
      // Ambient temperature
      uint16_t min_val = 48;
      uint16_t ambient = (tip + std::max(0, (((ra - std::min(min_val, oa)) * 16 * 589) / 1487)) + 8) / 16;
      ambient_temp_celsius = (float)ambient;
      
      ESP_LOGD("meater_udp", "Updated temps - Tip: %.2f°C, Ambient: %.2f°C",
               tip_temp_celsius, ambient_temp_celsius);
    }
  }
  
  void update_battery_data(const std::vector<uint8_t>& data) {
    battery_data = data;
    
    // Calculate battery percentage (same as meater.yaml)
    if (data.size() >= 2) {
      battery_percent = (data[0] + data[1]) * 10;
      ESP_LOGD("meater_udp", "Updated battery: %d%%", battery_percent);
    }
  }
  
  void set_username(const std::string& user) {
    username = user;
  }
  
  void set_device_model(const std::string& model) {
    device_model = model;
  }
  
  void set_app_version(const std::string& version) {
    app_version = version;
  }
  
  void send_broadcast() {
    // Build protobuf-encoded packet matching MEATER app format
    std::vector<uint8_t> packet;
    
    // Get current timestamp in milliseconds
    struct timeval tv;
    gettimeofday(&tv, NULL);
    uint64_t timestamp_ms = (uint64_t)tv.tv_sec * 1000 + tv.tv_usec / 1000;
    
    // Field 1: MeaterLinkHeader (tag 0x0a = field 1, wire type 2 = length-delimited)
    append_field_header(packet, 1, 2);  // Field 1, length-delimited
    
    std::vector<uint8_t> header_data;
    // Header field 1: timestamp_ms (varint)
    append_varint_field(header_data, 1, timestamp_ms);
    // Header field 2: sequence (varint)
    append_varint_field(header_data, 2, sequence_number++);
    // Header field 3: version (varint) 
    append_varint_field(header_data, 3, 7);
    // Header field 4: unknown1 (varint)
    append_varint_field(header_data, 4, 3);
    // Header field 5: unknown2 (double)
    append_double_field(header_data, 5, 2.4711659027338287e+222);  // Value from capture
    
    append_length(packet, header_data.size());
    packet.insert(packet.end(), header_data.begin(), header_data.end());
    
    // Field 2: MLDevice (tag 0x12 = field 2, wire type 2 = length-delimited)
    append_field_header(packet, 2, 2);  // Field 2, length-delimited
    
    std::vector<uint8_t> device_data;
    // Device field 1: device_id (bytes)
    append_bytes_field(device_data, 1, device_id, 16);
    // Device field 2: connection_state (varint)
    append_varint_field(device_data, 2, 2);  // 2 = connected
    
    // Device field 3: username (string) - but actually goes in message field 3
    // Field 3 of main message: username (string)
    // Device field 4: device_model (string) - but actually goes in message field 4
    // Field 4 of main message: device_model (string)
    // Device field 5: app_version (string) - but actually goes in message field 5
    // Field 5 of main message: app_version (string)
    
    append_length(packet, device_data.size());
    packet.insert(packet.end(), device_data.begin(), device_data.end());
    
    // Field 3: username (string) - top level
    append_string_field(packet, 3, username);
    
    // Field 4: device_model (string) - top level
    append_string_field(packet, 4, device_model);
    
    // Field 5: app_version (string) - top level
    append_string_field(packet, 5, app_version);
    
    // Field 6: unknown field (string) - top level
    append_string_field(packet, 6, "14");
    
    // Send UDP broadcast
    if (WiFi.status() == WL_CONNECTED) {
      udp.beginPacket(broadcast_address, udp_port);
      udp.write(packet.data(), packet.size());
      udp.endPacket();
      
      ESP_LOGI("meater_udp", "Broadcast sent: %d bytes, seq=%d, tip=%.2f°C, battery=%d%%",
               packet.size(), sequence_number - 1, tip_temp_celsius, battery_percent);
      ESP_LOGD("meater_udp", "Packet hex: %s", bytes_to_hex(packet).c_str());
    } else {
      ESP_LOGW("meater_udp", "WiFi not connected, skipping broadcast");
    }
  }
  
 private:
  // Protobuf encoding helpers
  
  void append_field_header(std::vector<uint8_t>& buf, uint32_t field_num, uint32_t wire_type) {
    uint32_t tag = (field_num << 3) | wire_type;
    append_varint(buf, tag);
  }
  
  void append_varint(std::vector<uint8_t>& buf, uint64_t value) {
    while (value >= 0x80) {
      buf.push_back((uint8_t)((value & 0x7F) | 0x80));
      value >>= 7;
    }
    buf.push_back((uint8_t)value);
  }
  
  void append_length(std::vector<uint8_t>& buf, size_t length) {
    append_varint(buf, length);
  }
  
  void append_varint_field(std::vector<uint8_t>& buf, uint32_t field_num, uint64_t value) {
    append_field_header(buf, field_num, 0);  // Wire type 0 = varint
    append_varint(buf, value);
  }
  
  void append_double_field(std::vector<uint8_t>& buf, uint32_t field_num, double value) {
    append_field_header(buf, field_num, 1);  // Wire type 1 = 64-bit
    uint64_t bits;
    memcpy(&bits, &value, sizeof(double));
    for (int i = 0; i < 8; i++) {
      buf.push_back((uint8_t)(bits & 0xFF));
      bits >>= 8;
    }
  }
  
  void append_bytes_field(std::vector<uint8_t>& buf, uint32_t field_num, 
                          const uint8_t* data, size_t len) {
    append_field_header(buf, field_num, 2);  // Wire type 2 = length-delimited
    append_length(buf, len);
    buf.insert(buf.end(), data, data + len);
  }
  
  void append_string_field(std::vector<uint8_t>& buf, uint32_t field_num, 
                           const std::string& str) {
    append_field_header(buf, field_num, 2);  // Wire type 2 = length-delimited
    append_length(buf, str.length());
    buf.insert(buf.end(), str.begin(), str.end());
  }
  
  std::string bytes_to_hex(const std::vector<uint8_t>& data) {
    std::string hex;
    for (size_t i = 0; i < data.size() && i < 80; i++) {
      char buf[4];
      snprintf(buf, sizeof(buf), "%02x ", data[i]);
      hex += buf;
    }
    return hex;
  }
};

// Initialize static member
MeaterUDPBroadcast* MeaterUDPBroadcast::instance = nullptr;

#endif // USE_ESP32
