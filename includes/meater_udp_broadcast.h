#pragma once

#include "esphome.h"

#ifdef USE_ESP32

#include <WiFi.h>
#include <WiFiUdp.h>

// MEATER Link UDP broadcast port (from decompiled app: ProtocolParameters.MEATER_LINK_UDP_PORT)
#define MEATER_LINK_UDP_PORT 7878

// Simple UDP broadcaster for MEATER Block emulation
// Based on hints from the problem statement: "UDP 7878 broadcasts from Block contain raw temps"
class MeaterUDPBroadcaster {
 public:
  MeaterUDPBroadcaster() : 
    udp_(),
    device_name_("MEATER"),
    last_broadcast_time_(0),
    broadcast_interval_ms_(1000) {  // Broadcast every 1 second (Config.UDP_BROADCAST_INTERVAL)
    
    temp_data_.resize(8, 0);
    battery_data_.resize(2, 0);
  }
  
  void setup() {
    ESP_LOGI("meater_udp", "Setting up UDP broadcaster on port %d", MEATER_LINK_UDP_PORT);
    ESP_LOGI("meater_udp", "Device name: %s", device_name_.c_str());
    
    // Start UDP
    if (udp_.begin(MEATER_LINK_UDP_PORT)) {
      ESP_LOGI("meater_udp", "UDP broadcaster started successfully");
    } else {
      ESP_LOGE("meater_udp", "Failed to start UDP broadcaster");
    }
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
    
    // Only broadcast if connected to WiFi
    if (WiFi.status() != WL_CONNECTED) {
      return;
    }
    
    // Get broadcast address
    IPAddress broadcast_ip = WiFi.localIP();
    broadcast_ip[3] = 255;  // Simple broadcast to local subnet
    
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
    
    // Broadcast the packet
    udp_.beginPacket(broadcast_ip, MEATER_LINK_UDP_PORT);
    udp_.write(packet.data(), packet.size());
    udp_.endPacket();
    
    ESP_LOGD("meater_udp", "Broadcast %d bytes to %s:%d", 
             packet.size(), broadcast_ip.toString().c_str(), MEATER_LINK_UDP_PORT);
  }
  
 private:
  WiFiUDP udp_;
  std::string device_name_;
  std::vector<uint8_t> temp_data_;
  std::vector<uint8_t> battery_data_;
  unsigned long last_broadcast_time_;
  unsigned long broadcast_interval_ms_;
};

#endif // USE_ESP32
