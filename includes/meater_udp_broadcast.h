#pragma once

#include "esphome.h"

#ifdef USE_ESP32

#include "lwip/sockets.h"
#include "lwip/netdb.h"
#include "esp_wifi.h"
#include "esp_netif.h"
#include <errno.h>

// MEATER Link UDP broadcast port (from decompiled app: ProtocolParameters.MEATER_LINK_UDP_PORT)
#define MEATER_LINK_UDP_PORT 7878

// Simple UDP broadcaster for MEATER Block emulation
// Based on hints from the problem statement: "UDP 7878 broadcasts from Block contain raw temps"
class MeaterUDPBroadcaster {
 public:
  MeaterUDPBroadcaster() : 
    udp_socket_(-1),
    device_name_("MEATER"),
    last_broadcast_time_(0),
    broadcast_interval_ms_(1000) {  // Broadcast every 1 second (Config.UDP_BROADCAST_INTERVAL)
    
    temp_data_.resize(8, 0);
    battery_data_.resize(2, 0);
  }
  
  ~MeaterUDPBroadcaster() {
    if (udp_socket_ >= 0) {
      ::close(udp_socket_);
    }
  }
  
  void setup() {
    ESP_LOGI("meater_udp", "Setting up UDP broadcaster on port %d", MEATER_LINK_UDP_PORT);
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
    
    ESP_LOGI("meater_udp", "UDP broadcaster started successfully");
  }
  
  void update_temp_data(const std::vector<uint8_t>& data) {
    temp_data_ = data;
    broadcast_data();
  }
  
  void update_battery_data(const std::vector<uint8_t>& data) {
    battery_data_ = data;
  }
  
  void set_device_name(const std::string& name) {
    device_name_ = name;
    ESP_LOGI("meater_udp", "Device name set to: %s", device_name_.c_str());
  }
  
  void broadcast_data() {
    unsigned long current_time = millis();
    
    // Rate limit broadcasts
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
    
    // Create a simple broadcast packet with raw temperature and battery data
    // Format: Device name (null-terminated) + temp data (8 bytes) + battery data (2 bytes)
    std::vector<uint8_t> packet;
    
    // Add device name
    for (char c : device_name_) {
      packet.push_back(c);
    }
    packet.push_back(0);  // Null terminator
    
    // Add raw temperature data (8 bytes)
    packet.insert(packet.end(), temp_data_.begin(), temp_data_.end());
    
    // Add raw battery data (2 bytes)
    packet.insert(packet.end(), battery_data_.begin(), battery_data_.end());
    
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
      ESP_LOGI("meater_udp", "Broadcast %d bytes to %s:%d - Device: %s", 
               packet.size(), 
               ::inet_ntoa(dest_addr.sin_addr),
               MEATER_LINK_UDP_PORT,
               device_name_.c_str());
      
      // Log packet contents in hex for debugging
      char hex_str[256];
      int offset = 0;
      for (size_t i = 0; i < packet.size() && i < 50; i++) {
        offset += snprintf(hex_str + offset, sizeof(hex_str) - offset, "%02X ", packet[i]);
      }
      ESP_LOGD("meater_udp", "Packet hex: %s", hex_str);
    }
  }
  
 private:
  int udp_socket_;
  std::string device_name_;
  std::vector<uint8_t> temp_data_;
  std::vector<uint8_t> battery_data_;
  unsigned long last_broadcast_time_;
  unsigned long broadcast_interval_ms_;
};

#endif // USE_ESP32
