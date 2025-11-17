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

// MEATER Link UDP Protocol - Proper Implementation
// Based on decompiled MEATER app v3protobuf structures
//
// Protocol Structure (MeaterLinkMessage):
//   Field 1: MeaterLinkHeader (timestamp_ms, sequence, version)
//   Field 2: SubscriptionMessage (from app to block)
//   Field 3: MasterMessage (from block to app) - THIS IS WHAT WE SEND
//            {
//              masterType: MASTER_TYPE_BLOCK (0)
//              cloudConnectionState: CLOUD_CONNECTION_STATE_DISABLED (0)
//              devices: [MLDevice, ...]
//            }
//   Field 4: SetupMessage (from app to block - cook configuration)
//
// MLDevice Structure:
//   probe: MLProbe {
//     parentIdentifier: fixed64 device ID
//     setup: CookSetup {sequenceNumber, state, targetTemp, ...}
//     status: CookStatus {internalTemp, ambientTemp, elapsedTime, ...}
//   }
//   identifier: fixed64 device ID
//   probeNumber: uint32
//   chargeState: ChargeState {chargingStatus, batteryLevelPercent, ...}
//   connectionState: CONNECTION_STATE_CONNECTED (1)
//   connectionType: BLE (0)
//   bleSignalLevel: sint32 (RSSI)
//   firmwareRevision: string
//
// Credits: Protocol research from https://github.com/nathanfaber/meaterble
class MeaterUDPBroadcaster {
 public:
  MeaterUDPBroadcaster() : 
    udp_socket_(-1),
    device_name_("MEATER"),
    last_broadcast_time_(0),
    broadcast_interval_ms_(5000),  // Broadcast every 5 seconds
    sequence_number_(0),
    device_identifier_(0) {
    
    temp_data_.resize(8, 0);
    battery_data_.resize(2, 0);
  }
  
  ~MeaterUDPBroadcaster() {
    if (udp_socket_ >= 0) {
      ::close(udp_socket_);
    }
  }
  
  void setup() {
    ESP_LOGI("meater_udp", "Setting up MEATER Link UDP protocol on port %d", MEATER_LINK_UDP_PORT);
    ESP_LOGI("meater_udp", "Device name: %s", device_name_.c_str());
    
    // Generate device identifier from MAC address
    generate_device_identifier();
    
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
    
    // Enable SO_REUSEADDR
    int reuse = 1;
    if (::setsockopt(udp_socket_, SOL_SOCKET, SO_REUSEADDR, &reuse, sizeof(reuse)) < 0) {
      ESP_LOGW("meater_udp", "Failed to set SO_REUSEADDR");
    }
    
    // Bind socket to port 7878 to receive incoming packets
    struct sockaddr_in bind_addr;
    memset(&bind_addr, 0, sizeof(bind_addr));
    bind_addr.sin_family = AF_INET;
    bind_addr.sin_addr.s_addr = INADDR_ANY;
    bind_addr.sin_port = ::htons(MEATER_LINK_UDP_PORT);
    
    if (::bind(udp_socket_, (struct sockaddr*)&bind_addr, sizeof(bind_addr)) < 0) {
      ESP_LOGE("meater_udp", "Failed to bind to port %d, errno=%d", MEATER_LINK_UDP_PORT, errno);
      ::close(udp_socket_);
      udp_socket_ = -1;
      return;
    }
    
    // Set non-blocking mode
    int flags = ::fcntl(udp_socket_, F_GETFL, 0);
    if (flags >= 0) {
      ::fcntl(udp_socket_, F_SETFL, flags | O_NONBLOCK);
    }
    
    ESP_LOGI("meater_udp", "UDP broadcaster/listener started successfully");
    ESP_LOGI("meater_udp", "Device identifier: 0x%016llx", device_identifier_);
  }
  
  void update_temp_data(const std::vector<uint8_t>& data) {
    temp_data_ = data;
  }
  
  void update_battery_data(const std::vector<uint8_t>& data) {
    battery_data_ = data;
  }
  
  void set_device_name(const std::string& name) {
    device_name_ = name;
    ESP_LOGI("meater_udp", "Device name set to: %s", device_name_.c_str());
  }
  
  // Main polling method - call from ESPHome interval
  void poll_and_broadcast() {
    if (udp_socket_ < 0) {
      return;
    }
    
    // Check for incoming packets
    check_incoming_packets();
    
    // Send broadcast if interval elapsed
    unsigned long now = millis();
    if (now - last_broadcast_time_ >= broadcast_interval_ms_) {
      send_broadcast();
      last_broadcast_time_ = now;
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
  uint64_t device_identifier_;  // 64-bit device identifier
  
  // Generate 64-bit device identifier from ESP32 MAC address
  void generate_device_identifier() {
    uint8_t mac[6];
    esp_err_t ret = esp_wifi_get_mac(WIFI_IF_STA, mac);
    
    if (ret != ESP_OK) {
      ESP_LOGW("meater_udp", "Failed to get MAC address, using default device ID");
      device_identifier_ = 0xAABBCCDDEEFF0011ULL;
      return;
    }
    
    // Create 64-bit identifier from 6-byte MAC
    // Pattern: mac[5] mac[4] mac[3] mac[2] mac[1] mac[0] 0x00 0x00
    device_identifier_ = 0;
    for (int i = 0; i < 6; i++) {
      device_identifier_ |= ((uint64_t)mac[i]) << (i * 8);
    }
  }
  
  // Check for incoming UDP packets (non-blocking)
  void check_incoming_packets() {
    uint8_t buffer[1500];  // MAX_UDP_MSG_LENGTH from ProtocolParameters
    struct sockaddr_in sender_addr;
    socklen_t sender_len = sizeof(sender_addr);
    
    int received = ::recvfrom(udp_socket_, buffer, sizeof(buffer), 0,
                             (struct sockaddr*)&sender_addr, &sender_len);
    
    if (received > 0) {
      ESP_LOGI("meater_udp", "Received %d bytes from %s:%d",
               received,
               ::inet_ntoa(sender_addr.sin_addr),
               ::ntohs(sender_addr.sin_port));
      
      log_hex_dump("RX", buffer, received);
      
      // TODO: Parse incoming SubscriptionMessage and SetupMessage
      // TODO: Forward SetupMessage cook config to BLE probe
    } else if (received < 0 && errno != EAGAIN && errno != EWOULDBLOCK) {
      ESP_LOGW("meater_udp", "recvfrom error: errno=%d", errno);
    }
  }
  
  // Send MasterMessage broadcast
  void send_broadcast() {
    // Get broadcast address
    esp_netif_t* netif = esp_netif_get_handle_from_ifkey("WIFI_STA_DEF");
    if (!netif) {
      ESP_LOGW("meater_udp", "Failed to get netif");
      return;
    }
    
    esp_netif_ip_info_t ip_info;
    if (esp_netif_get_ip_info(netif, &ip_info) != ESP_OK) {
      ESP_LOGW("meater_udp", "Failed to get IP info");
      return;
    }
    
    // Calculate broadcast address
    uint32_t broadcast_ip = ip_info.ip.addr | ~(ip_info.netmask.addr);
    
    // Build MeaterLinkMessage with MasterMessage
    std::vector<uint8_t> packet;
    build_meater_link_message(packet);
    
    // Send broadcast
    struct sockaddr_in dest_addr;
    memset(&dest_addr, 0, sizeof(dest_addr));
    dest_addr.sin_family = AF_INET;
    dest_addr.sin_port = ::htons(MEATER_LINK_UDP_PORT);
    dest_addr.sin_addr.s_addr = broadcast_ip;
    
    int sent = ::sendto(udp_socket_, packet.data(), packet.size(), 0,
                       (struct sockaddr*)&dest_addr, sizeof(dest_addr));
    
    if (sent > 0) {
      ESP_LOGI("meater_udp", "Broadcast %d bytes - Sequence: %llu", sent, sequence_number_);
      log_hex_dump("TX", packet.data(), packet.size());
    } else {
      ESP_LOGW("meater_udp", "Failed to send broadcast");
    }
  }
  
  // Log hex dump
  void log_hex_dump(const char* prefix, const uint8_t* data, size_t len) {
    char hex_str[256];
    int offset = 0;
    
    for (size_t i = 0; i < len && offset < (int)sizeof(hex_str) - 4; i++) {
      offset += snprintf(hex_str + offset, sizeof(hex_str) - offset, "%02x ", data[i]);
      
      if ((i + 1) % 16 == 0 && i + 1 < len) {
        ESP_LOGD("meater_udp", "%s: %s", prefix, hex_str);
        offset = 0;
      }
    }
    
    if (offset > 0) {
      ESP_LOGD("meater_udp", "%s: %s", prefix, hex_str);
    }
  }
  
  // === Protobuf Encoding Helpers ===
  
  void encode_varint(std::vector<uint8_t>& out, uint64_t value) {
    while (value > 0x7F) {
      out.push_back((uint8_t)((value & 0x7F) | 0x80));
      value >>= 7;
    }
    out.push_back((uint8_t)value);
  }
  
  void encode_field_header(std::vector<uint8_t>& out, uint32_t field_number, uint32_t wire_type) {
    encode_varint(out, (field_number << 3) | wire_type);
  }
  
  void encode_varint_field(std::vector<uint8_t>& out, uint32_t field_number, uint64_t value) {
    encode_field_header(out, field_number, 0);  // Wire type 0 = varint
    encode_varint(out, value);
  }
  
  void encode_sint32_field(std::vector<uint8_t>& out, uint32_t field_number, int32_t value) {
    // ZigZag encoding for signed integers
    uint32_t zigzag = (value << 1) ^ (value >> 31);
    encode_varint_field(out, field_number, zigzag);
  }
  
  void encode_fixed64(std::vector<uint8_t>& out, uint32_t field_number, uint64_t value) {
    encode_field_header(out, field_number, 1);  // Wire type 1 = 64-bit
    for (int i = 0; i < 8; i++) {
      out.push_back((uint8_t)(value & 0xFF));
      value >>= 8;
    }
  }
  
  void encode_length_delimited(std::vector<uint8_t>& out, uint32_t field_number, 
                               const uint8_t* data, size_t len) {
    encode_field_header(out, field_number, 2);  // Wire type 2 = length-delimited
    encode_varint(out, len);
    out.insert(out.end(), data, data + len);
  }
  
  void encode_string(std::vector<uint8_t>& out, uint32_t field_number, const char* str) {
    encode_length_delimited(out, field_number, (const uint8_t*)str, strlen(str));
  }
  
  void encode_bytes(std::vector<uint8_t>& out, uint32_t field_number, 
                   const uint8_t* data, size_t len) {
    encode_length_delimited(out, field_number, data, len);
  }
  
  // === Message Builders ===
  
  // Build CookStatus message
  void build_cook_status(std::vector<uint8_t>& out) {
    // Extract temperatures from temp_data_ (8 bytes)
    if (temp_data_.size() >= 8) {
      // Parse raw temperature data (see MEATER_BLE_PROTOCOL.md)
      uint16_t tip_raw = temp_data_[0] + (temp_data_[1] << 8);
      uint16_t ra_raw = temp_data_[2] + (temp_data_[3] << 8);
      uint16_t oa_raw = temp_data_[4] + (temp_data_[5] << 8);
      
      // Calculate temperatures in Celsius * 16 (as per protocol)
      int32_t tip_temp = tip_raw + 8;  // Raw value already includes offset
      int32_t ambient_temp = tip_raw + std::max(0, (((ra_raw - std::min(48, oa_raw)) * 16 * 589)) / 1487) + 8;
      
      encode_sint32_field(out, 1, tip_temp);        // internalTemperature
      encode_sint32_field(out, 2, ambient_temp);    // ambientTemperature
      encode_sint32_field(out, 3, tip_temp);        // peakTemperature
      encode_sint32_field(out, 4, -1);              // remainingCookTime (-1 = unknown)
      encode_varint_field(out, 5, 0);               // elapsedTime
      encode_sint32_field(out, 6, -1);              // totalRemainingTime
    }
  }
  
  // Build CookSetup message
  void build_cook_setup(std::vector<uint8_t>& out) {
    encode_varint_field(out, 1, 0);                  // sequenceNumber
    encode_varint_field(out, 2, 0);                  // state = COOK_STATE_NOT_STARTED (0)
    encode_sint32_field(out, 3, -1024);              // targetInternalTemperature (default from ProtocolParameters)
    encode_varint_field(out, 99, 96);                // lastItem = 96 (default)
  }
  
  // Build MLProbe message
  void build_ml_probe(std::vector<uint8_t>& out) {
    encode_fixed64(out, 1, device_identifier_);      // parentIdentifier
    
    // Field 3: CookSetup (nested message)
    std::vector<uint8_t> cook_setup;
    build_cook_setup(cook_setup);
    encode_length_delimited(out, 3, cook_setup.data(), cook_setup.size());
    
    // Field 4: CookStatus (nested message)
    std::vector<uint8_t> cook_status;
    build_cook_status(cook_status);
    encode_length_delimited(out, 4, cook_status.data(), cook_status.size());
  }
  
  // Build ChargeState message
  void build_charge_state(std::vector<uint8_t>& out) {
    encode_varint_field(out, 1, 0);  // chargingStatus = UNKNOWN (0)
    
    // Extract battery level from battery_data_ (2 bytes)
    uint32_t battery_percent = 0;
    if (battery_data_.size() >= 2) {
      uint16_t battery_raw = battery_data_[0] + (battery_data_[1] << 8);
      battery_percent = (battery_raw * 10);  // Convert to percentage
      if (battery_percent > 100) battery_percent = 100;
    }
    
    encode_varint_field(out, 2, battery_percent);  // batteryLevelPercent
    encode_varint_field(out, 3, 0);                // batteryMinutesRemaining
  }
  
  // Build MLDevice message
  void build_ml_device(std::vector<uint8_t>& out) {
    // Field 1: probe (nested MLProbe message)
    std::vector<uint8_t> probe;
    build_ml_probe(probe);
    encode_length_delimited(out, 1, probe.data(), probe.size());
    
    // Field 5: identifier
    encode_fixed64(out, 5, device_identifier_);
    
    // Field 6: probeNumber
    encode_varint_field(out, 6, 0);  // Probe #0 (singleton)
    
    // Field 7: chargeState (nested message)
    std::vector<uint8_t> charge_state;
    build_charge_state(charge_state);
    encode_length_delimited(out, 7, charge_state.data(), charge_state.size());
    
    // Field 8: firmwareRevision
    encode_string(out, 8, "v1.0.6_0");  // Format: v{version}_{probe_number}
    
    // Field 9: connectionState
    encode_varint_field(out, 9, 1);  // CONNECTION_STATE_CONNECTED (1)
    
    // Field 10: connectionType
    encode_varint_field(out, 10, 0);  // BLE (0)
    
    // Field 11: bleSignalLevel (RSSI)
    encode_sint32_field(out, 11, -50);  // Example RSSI value
  }
  
  // Build MasterMessage
  void build_master_message(std::vector<uint8_t>& out) {
    // Field 1: masterType
    encode_varint_field(out, 1, 0);  // MASTER_TYPE_BLOCK (0)
    
    // Field 2: cloudConnectionState
    encode_varint_field(out, 2, 0);  // CLOUD_CONNECTION_STATE_DISABLED (0)
    
    // Field 3: devices (repeated MLDevice)
    std::vector<uint8_t> device;
    build_ml_device(device);
    encode_length_delimited(out, 3, device.data(), device.size());
  }
  
  // Build MeaterLinkHeader
  void build_meater_link_header(std::vector<uint8_t>& out) {
    uint64_t timestamp_ms = millis();
    sequence_number_++;
    
    encode_varint_field(out, 1, timestamp_ms);           // timestamp_ms
    encode_varint_field(out, 2, sequence_number_);       // sequence
    encode_varint_field(out, 3, 7);                      // version = 7
    encode_varint_field(out, 4, 3);                      // unknown1 = 3
    encode_fixed64(out, 5, 0x47d87193396eac16ULL);       // unknown2 (from capture)
  }
  
  // Build complete MeaterLinkMessage
  void build_meater_link_message(std::vector<uint8_t>& packet) {
    packet.clear();
    
    // Field 1: MeaterLinkHeader (nested message)
    std::vector<uint8_t> header;
    build_meater_link_header(header);
    encode_length_delimited(packet, 1, header.data(), header.size());
    
    // Field 3: MasterMessage (nested message)
    // Note: Field 2 would be SubscriptionMessage (app → block)
    //       Field 4 would be SetupMessage (app → block)
    //       We only send MasterMessage (block → app)
    std::vector<uint8_t> master_msg;
    build_master_message(master_msg);
    encode_length_delimited(packet, 3, master_msg.data(), master_msg.size());
  }
};

#endif  // USE_ESP32
