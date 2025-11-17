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
// Based on MEATER Link protocol reverse engineering and network captures
//
// Protocol Details:
// - Uses Protocol Buffers (protobuf) wire format encoding
// - Broadcasts 79-byte packets on UDP port 7878
// - Listens for incoming packets on same port (bidirectional)
// - Main message structure:
//   Field 1: MeaterLinkHeader (timestamp_ms, sequence, version, etc.)
//   Field 2: MLDevice (device_id[16], connection_state, temps, battery)
//   Field 3: username string
//   Field 4: device_model string
//   Field 5: app_version string
//   Field 6: unknown field string
//
// Protobuf wire types:
// - 0: Varint (int32, int64, uint32, uint64, bool, enum)
// - 1: 64-bit (fixed64, double)
// - 2: Length-delimited (string, bytes, embedded messages)
//
// Credits: Protocol research from https://github.com/nathanfaber/meaterble
class MeaterUDPBroadcaster {
 public:
  MeaterUDPBroadcaster() : 
    udp_socket_(-1),
    device_name_("MEATER"),
    last_broadcast_time_(0),
    broadcast_interval_ms_(5000),  // Broadcast every 5 seconds (matching app behavior)
    sequence_number_(0) {
    
    temp_data_.resize(8, 0);
    battery_data_.resize(2, 0);
    
    // Initialize device_id with default pattern (will be properly generated in setup())
    memset(device_id_, 0xAA, 16);
  }
  
  ~MeaterUDPBroadcaster() {
    if (udp_socket_ >= 0) {
      ::close(udp_socket_);
    }
  }
  
  void setup() {
    ESP_LOGI("meater_udp", "Setting up UDP broadcaster/listener on port %d", MEATER_LINK_UDP_PORT);
    ESP_LOGI("meater_udp", "Device name: %s", device_name_.c_str());
    
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
    ESP_LOGI("meater_udp", "Device ID: %02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x",
             device_id_[0], device_id_[1], device_id_[2], device_id_[3],
             device_id_[4], device_id_[5], device_id_[6], device_id_[7],
             device_id_[8], device_id_[9], device_id_[10], device_id_[11],
             device_id_[12], device_id_[13], device_id_[14], device_id_[15]);
  }
  
  void update_temp_data(const std::vector<uint8_t>& data) {
    temp_data_ = data;
    broadcast_data();
  }
  
  void update_battery_data(const std::vector<uint8_t>& data) {
    battery_data_ = data;
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
  uint64_t sequence_number_;
  uint8_t device_id_[16];  // 16-byte device identifier
  
  // Generate 16-byte device ID from ESP32 MAC address
  void generate_device_id() {
    uint8_t mac[6];
    esp_err_t ret = esp_wifi_get_mac(WIFI_IF_STA, mac);
    
    if (ret != ESP_OK) {
      ESP_LOGW("meater_udp", "Failed to get MAC address, using default device ID");
      // Use a default pattern if MAC read fails
      memset(device_id_, 0xAA, 16);
      return;
    }
    
    // Create 16-byte device ID from 6-byte MAC
    // Pattern: MAC[6] + MAC[6] + (MAC[0]^MAC[1]) + (MAC[2]^MAC[3]) + (MAC[4]^MAC[5]) + 0x00
    memcpy(device_id_, mac, 6);
    memcpy(device_id_ + 6, mac, 6);
    device_id_[12] = mac[0] ^ mac[1];
    device_id_[13] = mac[2] ^ mac[3];
    device_id_[14] = mac[4] ^ mac[5];
    device_id_[15] = 0x00;
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
  
  // Encode length-delimited string field
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
  
  // Build complete protobuf packet (79 bytes)
  void build_protobuf_packet(std::vector<uint8_t>& packet) {
    packet.clear();
    
    // Get current timestamp in milliseconds
    uint64_t timestamp_ms = millis();
    
    // Increment sequence number
    sequence_number_++;
    
    // Field 1: MeaterLinkHeader (length-delimited)
    std::vector<uint8_t> header;
    encode_varint_field(header, 1, timestamp_ms);           // field 1: timestamp_ms
    encode_varint_field(header, 2, sequence_number_);       // field 2: sequence
    encode_varint_field(header, 3, 7);                      // field 3: version = 7
    encode_varint_field(header, 4, 3);                      // field 4: unknown1 = 3
    encode_fixed64(header, 5, 0x47d87193396eac16ULL);       // field 5: unknown2 (from capture)
    encode_length_delimited(packet, 1, header.data(), header.size());
    
    // Field 2: MLDevice (length-delimited)
    std::vector<uint8_t> device;
    encode_length_delimited(device, 1, device_id_, 16);  // field 1: device_id (16 bytes)
    encode_varint_field(device, 2, 2);                   // field 2: connection_state = 2 (connected)
    encode_length_delimited(packet, 2, device.data(), device.size());
    
    // Field 3: username string
    encode_string(packet, 3, "meater@esp32.local");
    
    // Field 4: device_model string
    encode_string(packet, 4, "ESP32-C3");
    
    // Field 5: app_version string
    encode_string(packet, 5, "4.6.3");
    
    // Field 6: unknown field string
    encode_string(packet, 6, "14");
  }
};

#endif // USE_ESP32
