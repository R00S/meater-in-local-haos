#pragma once

#include "esphome.h"

#ifdef USE_ESP32

#include "lwip/sockets.h"
#include "lwip/netdb.h"
#include "esp_wifi.h"
#include "esp_netif.h"
#include <errno.h>
#include <fcntl.h>

// MEATER Link UDP broadcast port (from decompiled app: ProtocolParameters.MEATER_LINK_UDP_PORT)
#define MEATER_LINK_UDP_PORT 7878

// MEATER Block UDP broadcaster and listener with protobuf wire format encoding
// Based on actual network packet captures and decompiled app analysis
//
// Protocol Details (CORRECTED based on packet captures):
// - Uses Protocol Buffers (protobuf) wire format encoding
// - Broadcasts on UDP port 7878
// - Listens for incoming packets on same port (bidirectional)
//
// Correct Message Structure (from actual MEATER app broadcasts):
//   Field 1: MeaterLinkHeader (REQUIRED)
//     - meaterLinkIdentifier: 21578 (UINT32, from MeaterLinkHeader.java DEFAULT)
//     - versionMajor: 17 (UINT32, from network captures)
//     - versionMinor: 7 (UINT32, from network captures)
//     - messageNumber: sequence counter (UINT32)
//     - deviceID: FIXED64 (8 bytes, from ESP32 MAC)
//
//   Field 2: SubscriptionMessage (ALL sub-fields nested inside!)
//     - Field 1: ProbeData (length-delimited, 16 bytes) - OPTIONAL when probe active
//       → 8 bytes: temperature data (from BLE characteristic 7EDDA774-045E-4BBF-909B-45D1991A2876)
//       → 2 bytes: battery data (from BLE characteristic 2ADB4877-68D8-4884-BD3C-D83853BF27B8)
//       → 6 bytes: additional probe state/padding
//     - Field 2: connection_state (UINT32, value 2 = connected)
//     - Field 3: username (string, e.g. "meater@esp32.local")
//     - Field 4: device_model (string, e.g. "ESP32-C3")
//     - Field 5: app_version (string, e.g. "4.6.3")
//     - Field 6: unknown (string, e.g. "14")
//
// CRITICAL: All strings and probe data are SUB-FIELDS of Field 2 (SubscriptionMessage),
//           NOT separate top-level fields! This is why Field 2 is 38-56 bytes.
//
// Note [OBSOLETE]: Actual captures show Field 2 is used (NOT Field 3/MasterMessage)
//       despite Java protobuf classes suggesting MasterMessage structure.
//       This note is obsolete - the implementation uses custom Field 2 structure.
//
// Protobuf wire types:
// - 0: Varint (int32, int64, uint32, uint64, bool, enum)
// - 1: 64-bit (fixed64, double)
// - 2: Length-delimited (string, bytes, embedded messages)
//
// Credits: Protocol research from network captures and decompiled MEATER app
class MeaterUDPBroadcaster {
 public:
  MeaterUDPBroadcaster() : 
    udp_socket_(-1),
    device_name_("MEATER"),
    last_broadcast_time_(0),
    broadcast_interval_ms_(5000),  // Broadcast every 5 seconds (matching app behavior)
    sequence_number_(0),
    device_id_(0),  // Initialize to 0, will be set from MAC in setup()
    ambient_temp_raw_(0),
    tip_temp_raw_(0),
    battery_percent_(0) {
    
    temp_data_.resize(8, 0);
    battery_data_.resize(2, 0);
  }
  
  ~MeaterUDPBroadcaster() {
    if (udp_socket_ >= 0) {
      ::close(udp_socket_);
    }
  }
  
  void setup() {
    ESP_LOGI("meater_udp", "Setting up UDP broadcaster/listener on port %d", MEATER_LINK_UDP_PORT);
    ESP_LOGI("meater_udp", "Device name: %s", device_name_.c_str());
    
    // Generate device ID from MAC address
    generate_device_id();
    
    // Create UDP socket
    udp_socket_ = ::socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP);
    if (udp_socket_ < 0) {
      ESP_LOGE("meater_udp", "Failed to create UDP socket");
      return;
    }
    
    // Enable broadcast
    int broadcast_enable = 1;
    if (::setsockopt(udp_socket_, SOL_SOCKET, SO_BROADCAST, &broadcast_enable, sizeof(broadcast_enable)) < 0) {
      ESP_LOGE("meater_udp", "Failed to enable broadcast");
      ::close(udp_socket_);
      udp_socket_ = -1;
      return;
    }
    
    // Enable SO_REUSEADDR to allow binding to port 7878
    int reuse = 1;
    if (::setsockopt(udp_socket_, SOL_SOCKET, SO_REUSEADDR, &reuse, sizeof(reuse)) < 0) {
      ESP_LOGW("meater_udp", "Failed to set SO_REUSEADDR (non-fatal)");
    }
    
    // Bind socket to port 7878 to receive incoming packets
    struct sockaddr_in bind_addr;
    memset(&bind_addr, 0, sizeof(bind_addr));
    bind_addr.sin_family = AF_INET;
    bind_addr.sin_addr.s_addr = INADDR_ANY;  // Listen on all interfaces
    bind_addr.sin_port = ::htons(MEATER_LINK_UDP_PORT);
    
    if (::bind(udp_socket_, (struct sockaddr*)&bind_addr, sizeof(bind_addr)) < 0) {
      ESP_LOGE("meater_udp", "Failed to bind to port %d, errno=%d", MEATER_LINK_UDP_PORT, errno);
      ::close(udp_socket_);
      udp_socket_ = -1;
      return;
    }
    
    // Make socket non-blocking for polling
    int flags = ::fcntl(udp_socket_, F_GETFL, 0);
    if (flags < 0 || ::fcntl(udp_socket_, F_SETFL, flags | O_NONBLOCK) < 0) {
      ESP_LOGE("meater_udp", "Failed to set non-blocking mode, errno=%d", errno);
      ::close(udp_socket_);
      udp_socket_ = -1;
      return;
    }
    
    ESP_LOGI("meater_udp", "UDP broadcaster/listener started successfully");
    ESP_LOGI("meater_udp", "Device ID (FIXED64): 0x%016llx", (unsigned long long)device_id_);
  }
  
  void update_temp_data(const std::vector<uint8_t>& data) {
    temp_data_ = data;
    
    // Extract temperature values from the 8-byte MEATER protocol data
    if (data.size() >= 8) {
      // Bytes 0-1: Tip temperature (little-endian, value * 16 to get celsius)
      tip_temp_raw_ = (int16_t)((data[1] << 8) | data[0]);
      
      // Bytes 2-3: Ambient temperature (little-endian, value * 16 to get celsius)
      ambient_temp_raw_ = (int16_t)((data[3] << 8) | data[2]);
      
      ESP_LOGD("meater_udp", "Temps updated - Tip: %d (%.1f°C), Ambient: %d (%.1f°C)", 
               tip_temp_raw_, tip_temp_raw_ / 16.0, 
               ambient_temp_raw_, ambient_temp_raw_ / 16.0);
    }
    
    broadcast_data();
  }
  
  void update_battery_data(const std::vector<uint8_t>& data) {
    battery_data_ = data;
    
    // Extract battery percentage from 2-byte data
    if (data.size() >= 2) {
      battery_percent_ = data[0];  // First byte is battery percentage
      ESP_LOGD("meater_udp", "Battery updated: %d%%", battery_percent_);
    }
  }
  
  void set_device_name(const std::string& name) {
    // MEATER Block emulation - always use "MEATER Block" regardless of probe name
    // The decompiled app shows DevicesType.MEATER_BLOCK("MEATER Block", ...)
    device_name_ = "MEATER Block";
    ESP_LOGI("meater_udp", "Device name set to: %s (simulating MEATER Block with probe: %s)", 
             device_name_.c_str(), name.c_str());
  }
  
  // Poll for incoming packets and broadcast on interval
  void poll_and_broadcast() {
    check_incoming_packets();
    broadcast_data();
  }
  
  void broadcast_data() {
    unsigned long current_time = millis();
    
    // Rate limit broadcasts - now 5 seconds instead of 1
    if (current_time - last_broadcast_time_ < broadcast_interval_ms_) {
      return;
    }
    last_broadcast_time_ = current_time;
    
    // Check if socket is valid
    if (udp_socket_ < 0) {
      return;
    }
    
    // Don't broadcast until we have temp data from probe
    if (temp_data_.empty() || temp_data_.size() < 8) {
      return;  // Silently skip - will broadcast once temp data arrives
    }
    
    // Get IP address to check if WiFi is connected
    esp_netif_t *netif = esp_netif_get_handle_from_ifkey("WIFI_STA_DEF");
    if (netif == nullptr) {
      return;
    }
    
    esp_netif_ip_info_t ip_info;
    if (esp_netif_get_ip_info(netif, &ip_info) != ESP_OK || ip_info.ip.addr == 0) {
      return;  // Not connected to WiFi
    }
    
    // Calculate broadcast address
    uint32_t broadcast_addr = ip_info.ip.addr | ~ip_info.netmask.addr;
    
    // Build protobuf packet (79 bytes)
    std::vector<uint8_t> packet;
    build_protobuf_packet(packet);
    
    // Setup broadcast address
    struct sockaddr_in dest_addr;
    dest_addr.sin_family = AF_INET;
    dest_addr.sin_port = ::htons(MEATER_LINK_UDP_PORT);
    dest_addr.sin_addr.s_addr = broadcast_addr;
    
    // Broadcast the packet
    int sent = ::sendto(udp_socket_, packet.data(), packet.size(), 0, 
                     (struct sockaddr*)&dest_addr, sizeof(dest_addr));
    
    if (sent < 0) {
      ESP_LOGE("meater_udp", "Failed to send UDP broadcast, errno=%d", errno);
    } else {
      ESP_LOGI("meater_udp", "Broadcast %d bytes to %s:%d - Sequence: %lu", 
               packet.size(), 
               ::inet_ntoa(dest_addr.sin_addr),
               MEATER_LINK_UDP_PORT,
               sequence_number_ - 1);  // Already incremented in build_protobuf_packet
      
      // Log packet contents in hex for debugging
      log_hex_dump("TX", packet.data(), packet.size());
    }
  }
  
 private:
  int udp_socket_;
  std::string device_name_;
  std::vector<uint8_t> temp_data_;
  std::vector<uint8_t> battery_data_;
  unsigned long last_broadcast_time_;
  unsigned long broadcast_interval_ms_;
  uint32_t sequence_number_;
  uint64_t device_id_;  // 8-byte device identifier (FIXED64)
  int16_t ambient_temp_raw_;  // Ambient temperature raw value (celsius * 16)
  int16_t tip_temp_raw_;      // Tip temperature raw value (celsius * 16)
  uint8_t battery_percent_;   // Battery percentage (0-100)
  
  // Generate 8-byte device ID from ESP32 MAC address (FIXED64)
  void generate_device_id() {
    uint8_t mac[6];
    esp_err_t ret = esp_wifi_get_mac(WIFI_IF_STA, mac);
    
    if (ret != ESP_OK) {
      ESP_LOGW("meater_udp", "Failed to get MAC address, using default device ID");
      device_id_ = 0xAAAAAAAAAAAAAAAAULL;
      return;
    }
    
    // Create 8-byte device ID from 6-byte MAC (little-endian format)
    // Format: MAC bytes in little-endian order + 0xd0d0 padding
    device_id_ = 0;
    device_id_ |= ((uint64_t)mac[0]);
    device_id_ |= ((uint64_t)mac[1] << 8);
    device_id_ |= ((uint64_t)mac[2] << 16);
    device_id_ |= ((uint64_t)mac[3] << 24);
    device_id_ |= ((uint64_t)mac[4] << 32);
    device_id_ |= ((uint64_t)mac[5] << 40);
    device_id_ |= ((uint64_t)0xd0 << 48);  // Padding byte 1
    device_id_ |= ((uint64_t)0xd0 << 56);  // Padding byte 2
    
    ESP_LOGI("meater_udp", "Generated device ID from MAC: %02x:%02x:%02x:%02x:%02x:%02x -> 0x%016llx",
             mac[0], mac[1], mac[2], mac[3], mac[4], mac[5], (unsigned long long)device_id_);
  }
  
  // Check for incoming UDP packets (non-blocking)
  void check_incoming_packets() {
    if (udp_socket_ < 0) {
      return;
    }
    
    uint8_t buffer[512];
    struct sockaddr_in sender_addr;
    socklen_t sender_len = sizeof(sender_addr);
    
    // Non-blocking receive - will return immediately if no data
    int received = ::recvfrom(udp_socket_, buffer, sizeof(buffer), 0,
                             (struct sockaddr*)&sender_addr, &sender_len);
    
    if (received > 0) {
      ESP_LOGI("meater_udp", "Received %d bytes from %s:%d",
               received,
               ::inet_ntoa(sender_addr.sin_addr),
               ::ntohs(sender_addr.sin_port));
      
      // Log packet contents in hex
      log_hex_dump("RX", buffer, received);
    } else if (received < 0 && errno != EAGAIN && errno != EWOULDBLOCK) {
      // EAGAIN/EWOULDBLOCK means no data available (expected for non-blocking)
      ESP_LOGW("meater_udp", "recvfrom error: errno=%d", errno);
    }
  }
  
  // Log hex dump of packet data
  void log_hex_dump(const char* prefix, const uint8_t* data, size_t len) {
    char hex_str[256];
    int offset = 0;
    
    for (size_t i = 0; i < len && offset < (int)sizeof(hex_str) - 4; i++) {
      offset += snprintf(hex_str + offset, sizeof(hex_str) - offset, "%02x ", data[i]);
      
      // Break line every 16 bytes for readability
      if ((i + 1) % 16 == 0 && i + 1 < len) {
        ESP_LOGD("meater_udp", "%s: %s", prefix, hex_str);
        offset = 0;
      }
    }
    
    if (offset > 0) {
      ESP_LOGD("meater_udp", "%s: %s", prefix, hex_str);
    }
  }
  
  // Protobuf wire format encoding helpers
  
  // Encode varint (variable-length integer)
  void encode_varint(std::vector<uint8_t>& out, uint64_t value) {
    while (value > 0x7F) {
      out.push_back((uint8_t)((value & 0x7F) | 0x80));
      value >>= 7;
    }
    out.push_back((uint8_t)value);
  }
  
  // Encode SINT32 using ZigZag encoding
  void encode_sint32_zigzag(std::vector<uint8_t>& out, int32_t value) {
    // ZigZag encoding: (n << 1) ^ (n >> 31)
    uint32_t zigzag = (uint32_t)((value << 1) ^ (value >> 31));
    encode_varint(out, zigzag);
  }
  
  // Encode field header (field number + wire type)
  void encode_field_header(std::vector<uint8_t>& out, uint32_t field_number, uint32_t wire_type) {
    encode_varint(out, (field_number << 3) | wire_type);
  }
  
  // Encode length-delimited field (wire type 2)
  void encode_length_delimited(std::vector<uint8_t>& out, uint32_t field_number, 
                               const uint8_t* data, size_t len) {
    encode_field_header(out, field_number, 2);  // Wire type 2 = length-delimited
    encode_varint(out, len);
    out.insert(out.end(), data, data + len);
  }
  
  // Encode length-delimited field from vector
  void encode_length_delimited(std::vector<uint8_t>& out, uint32_t field_number,
                               const std::vector<uint8_t>& data) {
    encode_length_delimited(out, field_number, data.data(), data.size());
  }
  
  // Encode string field
  void encode_string(std::vector<uint8_t>& out, uint32_t field_number, const char* str) {
    encode_length_delimited(out, field_number, (const uint8_t*)str, strlen(str));
  }
  
  // Encode fixed64 field (wire type 1)
  void encode_fixed64(std::vector<uint8_t>& out, uint32_t field_number, uint64_t value) {
    encode_field_header(out, field_number, 1);  // Wire type 1 = 64-bit
    // Little-endian encoding
    for (int i = 0; i < 8; i++) {
      out.push_back((uint8_t)(value & 0xFF));
      value >>= 8;
    }
  }
  
  // Encode varint field (wire type 0)
  void encode_varint_field(std::vector<uint8_t>& out, uint32_t field_number, uint64_t value) {
    encode_field_header(out, field_number, 0);  // Wire type 0 = varint
    encode_varint(out, value);
  }
  
  // Encode SINT32 field with ZigZag encoding
  void encode_sint32_field(std::vector<uint8_t>& out, uint32_t field_number, int32_t value) {
    encode_field_header(out, field_number, 0);  // Wire type 0 = varint
    encode_sint32_zigzag(out, value);
  }
  
  // Build complete protobuf packet following MEATER Link protocol
  // Based on actual network captures: ALL fields nested inside Field 2!
  // CRITICAL: Field numbering shifts when probe data is absent!
  void build_protobuf_packet(std::vector<uint8_t>& packet) {
    packet.clear();
    
    // Increment sequence number
    sequence_number_++;
    
    // ========== Field 1: MeaterLinkHeader (REQUIRED) ==========
    std::vector<uint8_t> header;
    encode_varint_field(header, 1, 21578);              // field 1: meaterLinkIdentifier = 21578
    encode_varint_field(header, 2, 17);                 // field 2: versionMajor = 17
    encode_varint_field(header, 3, 7);                  // field 3: versionMinor = 7
    encode_varint_field(header, 4, sequence_number_);   // field 4: messageNumber (sequence)
    encode_fixed64(header, 5, device_id_);              // field 5: deviceID (FIXED64 from MAC)
    encode_length_delimited(packet, 1, header);
    
    // ========== Field 2: SubscriptionMessage (ALL sub-fields nested inside!) ==========
    // Key insight: Field numbering depends on whether probe data is present!
    std::vector<uint8_t> subscription_msg;
    
    bool has_probe_data = !temp_data_.empty() && temp_data_.size() >= 8;
    
    if (has_probe_data) {
      // WITH probe data: Include probe data as field 1
      std::vector<uint8_t> probe_data;
      probe_data.insert(probe_data.end(), temp_data_.begin(), temp_data_.begin() + 8);
      if (!battery_data_.empty() && battery_data_.size() >= 2) {
        probe_data.insert(probe_data.end(), battery_data_.begin(), battery_data_.begin() + 2);
      } else {
        probe_data.push_back(0x00);
        probe_data.push_back(0x00);
      }
      while (probe_data.size() < 16) {
        probe_data.push_back(0x00);
      }
      encode_length_delimited(subscription_msg, 1, probe_data.data(), probe_data.size());
      
      // Field 2: status = 2 (connected)
      encode_varint_field(subscription_msg, 2, 2);  // NOT 0!
      
      // Field 3: username string (empty for MEATER Block)
      encode_string(subscription_msg, 3, "");
      
      // Field 4: device_model string
      encode_string(subscription_msg, 4, "MEATER Block");
      
      // Field 5: app_version string
      encode_string(subscription_msg, 5, "1.0.0");
      
      // Field 6: unknown field string
      encode_string(subscription_msg, 6, "1");
    } else {
      // WITHOUT probe data: NO device_id field, start directly with status
      // Field 2: status = 2 (connected, but no active probe)
      encode_varint_field(subscription_msg, 2, 2);
      
      // Field 3: username string (empty for Block)
      encode_string(subscription_msg, 3, "");
      
      // Field 4: device_model string  
      encode_string(subscription_msg, 4, "MEATER Block");
      
      // Field 5: app_version string
      encode_string(subscription_msg, 5, "1.0.0");
      
      // Field 6: unknown field string
      encode_string(subscription_msg, 6, "1");
    }
    
    // Encode the entire SubscriptionMessage as Field 2 of the main packet
    encode_length_delimited(packet, 2, subscription_msg.data(), subscription_msg.size());
    
    ESP_LOGD("meater_udp", "Built packet: %d bytes, seq=%u, deviceID=0x%016llx", 
             packet.size(), sequence_number_, (unsigned long long)device_id_);
    if (has_probe_data) {
      ESP_LOGD("meater_udp", "Probe data included: %d bytes temp, %d bytes battery", 
               (int)temp_data_.size(), (int)battery_data_.size());
    } else {
      ESP_LOGD("meater_udp", "No probe data (waiting for initial temp reading)");
    }
  }
};

#endif // USE_ESP32
