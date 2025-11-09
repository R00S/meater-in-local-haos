#pragma once

#include "esphome.h"

#ifdef USE_ESP32

#include <host/ble_hs.h>
#include <host/ble_uuid.h>
#include <host/ble_gap.h>
#include <services/gap/ble_svc_gap.h>
#include <services/gatt/ble_svc_gatt.h>

// Forward declaration
class MeaterBLEServer;

// MEATER BLE Service and Characteristic UUIDs (128-bit)
// Note: NimBLE uses little-endian byte order for 128-bit UUIDs
// Service UUID: a75cc7fc-c956-488f-ac2a-2dbc08b63a04
static const ble_uuid128_t MEATER_SERVICE_UUID = BLE_UUID128_INIT(
    0x04, 0x3a, 0xb6, 0x08, 0xbc, 0x2d, 0x2a, 0xac,
    0x8f, 0x48, 0x56, 0xc9, 0xfc, 0xc7, 0x5c, 0xa7
);

// Temperature Characteristic UUID: 7edda774-045e-4bbf-909b-45d1991a2876
static const ble_uuid128_t MEATER_TEMP_CHAR_UUID = BLE_UUID128_INIT(
    0x76, 0x28, 0x1a, 0x99, 0xd1, 0x45, 0x9b, 0x90,
    0xbf, 0x4b, 0x5e, 0x04, 0x74, 0xa7, 0xdd, 0x7e
);

// Battery Characteristic UUID: 2adb4877-68d8-4884-bd3c-d83853bf27b8
static const ble_uuid128_t MEATER_BATTERY_CHAR_UUID = BLE_UUID128_INIT(
    0xb8, 0x27, 0xbf, 0x53, 0xd8, 0x83, 0x3c, 0xbd,
    0x84, 0x48, 0xd8, 0x68, 0x77, 0x48, 0xdb, 0x2a
);

// Device Information Service (standard 16-bit UUID)
static const ble_uuid16_t DEVICE_INFO_SERVICE_UUID = BLE_UUID16_INIT(0x180A);
static const ble_uuid16_t FIRMWARE_CHAR_UUID = BLE_UUID16_INIT(0x2A26);
static const ble_uuid16_t MANUFACTURER_NAME_CHAR_UUID = BLE_UUID16_INIT(0x2A29);
static const ble_uuid16_t MODEL_NUMBER_CHAR_UUID = BLE_UUID16_INIT(0x2A24);
static const ble_uuid16_t SOFTWARE_REV_CHAR_UUID = BLE_UUID16_INIT(0x2A28);

class MeaterBLEServer {
 public:
  static MeaterBLEServer* instance;
  
  uint16_t conn_handle;
  bool connected;
  
  // Characteristic value handles
  uint16_t temp_val_handle;
  uint16_t battery_val_handle;
  uint16_t fw_val_handle;
  uint16_t manufacturer_val_handle;
  uint16_t model_val_handle;
  uint16_t software_val_handle;
  
  // Subscription state for notifications
  bool temp_notify_enabled;
  bool battery_notify_enabled;
  
  std::vector<uint8_t> temp_data;
  std::vector<uint8_t> battery_data;
  std::vector<uint8_t> firmware_data;
  std::vector<uint8_t> manufacturer_name_data;
  std::vector<uint8_t> model_number_data;
  std::vector<uint8_t> software_rev_data;
  
  std::string device_name;
  bool device_name_set;
  bool force_simple_name;
  
  // Manufacturer data for advertising
  uint8_t manufacturer_data[24];
  
  MeaterBLEServer() : 
    conn_handle(BLE_HS_CONN_HANDLE_NONE),
    connected(false),
    temp_val_handle(0),
    battery_val_handle(0),
    fw_val_handle(0),
    manufacturer_val_handle(0),
    model_val_handle(0),
    software_val_handle(0),
    temp_notify_enabled(false),
    battery_notify_enabled(false),
    device_name("MEATER"),
    device_name_set(false),
    force_simple_name(true) {
    
    instance = this;
    temp_data.resize(8, 0);
    battery_data.resize(2, 0);
    firmware_data = {'v', '1', '.', '0', '.', '5', '_', '0'};
    manufacturer_name_data = {'A', 'p', 'p', 't', 'i', 'o', 'n', ' ', 'L', 'a', 'b', 's'};
    model_number_data = {'M', 'E', 'A', 'T', 'E', 'R'};
    software_rev_data = {'1', '.', '0', '.', '5', '_', '0'};
    
    // Initialize manufacturer data
    manufacturer_data[0] = 0x7B;  // Company ID (0x037B - Apption Labs)
    manufacturer_data[1] = 0x03;
    for (int i = 2; i < 24; i++) {
      manufacturer_data[i] = (i == 2) ? 0x80 : 0x00;
    }
  }
  
  void setup() {
    ESP_LOGI("meater_ble_server", "Setting up MEATER BLE Server with NimBLE...");
    ESP_LOGI("meater_ble_server", "Advertising as: %s", device_name.c_str());
    
    // Set a static random address for advertising (required for ESP32-C6)
    // Static random addresses have the two most significant bits set to 1 (0xC0 or 0xD0 range)
    uint8_t random_addr[6] = {0xD0, 0xD9, 0x4F, 0x12, 0x34, 0x56};
    int rc = ble_hs_id_set_rnd(random_addr);
    if (rc != 0) {
      ESP_LOGE("meater_ble_server", "Failed to set random address: %d", rc);
    } else {
      ESP_LOGI("meater_ble_server", "Set static random address: D0:D9:4F:12:34:56");
    }
    
    // Set device name in GAP service
    rc = ble_svc_gap_device_name_set(device_name.c_str());
    if (rc != 0) {
      ESP_LOGE("meater_ble_server", "Failed to set device name: %d", rc);
    }
    
    // Register GATT services
    rc = ble_gatts_count_cfg(get_gatt_svcs());
    if (rc != 0) {
      ESP_LOGE("meater_ble_server", "Failed to count services: %d", rc);
      return;
    }
    
    rc = ble_gatts_add_svcs(get_gatt_svcs());
    if (rc != 0) {
      ESP_LOGE("meater_ble_server", "Failed to add services: %d", rc);
      return;
    }
    
    // Start GATT server
    ble_gatts_start();
    
    // Start advertising
    start_advertising();
    
    ESP_LOGI("meater_ble_server", "BLE Server setup complete");
  }
  
  void update_temp_data(const std::vector<uint8_t>& data) {
    temp_data = data;
    if (connected && temp_val_handle != 0 && temp_notify_enabled) {
      struct os_mbuf *om = ble_hs_mbuf_from_flat(data.data(), data.size());
      if (om != NULL) {
        ble_gatts_notify_custom(conn_handle, temp_val_handle, om);
        ESP_LOGD("meater_ble_server", "Sent temperature notification");
      }
    }
  }
  
  void update_battery_data(const std::vector<uint8_t>& data) {
    battery_data = data;
    if (connected && battery_val_handle != 0 && battery_notify_enabled) {
      struct os_mbuf *om = ble_hs_mbuf_from_flat(data.data(), data.size());
      if (om != NULL) {
        ble_gatts_notify_custom(conn_handle, battery_val_handle, om);
        ESP_LOGD("meater_ble_server", "Sent battery notification");
      }
    }
  }
  
  void update_firmware_data(const std::vector<uint8_t>& data) {
    firmware_data = data;
  }
  
  void set_device_name(const std::string& name) {
    std::string new_name = force_simple_name ? "MEATER" : name;
    
    if (device_name != new_name) {
      device_name = new_name;
      device_name_set = true;
      ESP_LOGI("meater_ble_server", "Device name set to: %s (original: %s)", 
               device_name.c_str(), name.c_str());
      
      // Update device name in BLE stack
      ble_svc_gap_device_name_set(device_name.c_str());
      
      // Restart advertising if not connected
      if (!connected) {
        ESP_LOGI("meater_ble_server", "Restarting advertising with new name");
        ble_gap_adv_stop();
        start_advertising();
      }
    }
  }
  
  // GATT characteristic access callback
  static int gatt_char_access(uint16_t conn_handle, uint16_t attr_handle,
                              struct ble_gatt_access_ctxt *ctxt, void *arg) {
    if (!instance) return BLE_ATT_ERR_UNLIKELY;
    
    switch (ctxt->op) {
      case BLE_GATT_ACCESS_OP_READ_CHR:
        ESP_LOGD("meater_ble_server", "GATT_READ, handle %d", attr_handle);
        
        if (attr_handle == instance->fw_val_handle) {
          int rc = os_mbuf_append(ctxt->om, instance->firmware_data.data(),
                                  instance->firmware_data.size());
          return rc == 0 ? 0 : BLE_ATT_ERR_INSUFFICIENT_RES;
        } else if (attr_handle == instance->manufacturer_val_handle) {
          int rc = os_mbuf_append(ctxt->om, instance->manufacturer_name_data.data(),
                                  instance->manufacturer_name_data.size());
          return rc == 0 ? 0 : BLE_ATT_ERR_INSUFFICIENT_RES;
        } else if (attr_handle == instance->model_val_handle) {
          int rc = os_mbuf_append(ctxt->om, instance->model_number_data.data(),
                                  instance->model_number_data.size());
          return rc == 0 ? 0 : BLE_ATT_ERR_INSUFFICIENT_RES;
        } else if (attr_handle == instance->software_val_handle) {
          int rc = os_mbuf_append(ctxt->om, instance->software_rev_data.data(),
                                  instance->software_rev_data.size());
          return rc == 0 ? 0 : BLE_ATT_ERR_INSUFFICIENT_RES;
        }
        return BLE_ATT_ERR_UNLIKELY;
        
      default:
        return BLE_ATT_ERR_UNLIKELY;
    }
  }
  
  // GAP event callback
  static int gap_event_handler(struct ble_gap_event *event, void *arg) {
    if (!instance) return 0;
    
    switch (event->type) {
      case BLE_GAP_EVENT_CONNECT:
        ESP_LOGI("meater_ble_server", "BLE_GAP_EVENT_CONNECT, status=%d", 
                 event->connect.status);
        if (event->connect.status == 0) {
          instance->conn_handle = event->connect.conn_handle;
          instance->connected = true;
          // Reset subscription state on new connection
          instance->temp_notify_enabled = false;
          instance->battery_notify_enabled = false;
        }
        break;
        
      case BLE_GAP_EVENT_DISCONNECT:
        ESP_LOGI("meater_ble_server", "BLE_GAP_EVENT_DISCONNECT, reason=%d",
                 event->disconnect.reason);
        instance->connected = false;
        instance->conn_handle = BLE_HS_CONN_HANDLE_NONE;
        instance->temp_notify_enabled = false;
        instance->battery_notify_enabled = false;
        instance->start_advertising();
        break;
        
      case BLE_GAP_EVENT_ADV_COMPLETE:
        ESP_LOGI("meater_ble_server", "BLE_GAP_EVENT_ADV_COMPLETE");
        instance->start_advertising();
        break;
        
      case BLE_GAP_EVENT_SUBSCRIBE:
        ESP_LOGI("meater_ble_server", "BLE_GAP_EVENT_SUBSCRIBE, attr_handle=%d, "
                 "cur_notify=%d, cur_indicate=%d",
                 event->subscribe.attr_handle,
                 event->subscribe.cur_notify,
                 event->subscribe.cur_indicate);
        
        // Track subscription state for temperature notifications
        if (event->subscribe.attr_handle == instance->temp_val_handle) {
          instance->temp_notify_enabled = event->subscribe.cur_notify;
          ESP_LOGI("meater_ble_server", "Temperature notifications %s",
                   instance->temp_notify_enabled ? "ENABLED" : "DISABLED");
        }
        // Track subscription state for battery notifications
        else if (event->subscribe.attr_handle == instance->battery_val_handle) {
          instance->battery_notify_enabled = event->subscribe.cur_notify;
          ESP_LOGI("meater_ble_server", "Battery notifications %s",
                   instance->battery_notify_enabled ? "ENABLED" : "DISABLED");
        }
        break;
        
      default:
        break;
    }
    
    return 0;
  }
  
  void start_advertising() {
    ESP_LOGI("meater_ble_server", "Starting advertising as: %s", device_name.c_str());
    
    struct ble_hs_adv_fields fields;
    memset(&fields, 0, sizeof(fields));
    
    // Set flags
    fields.flags = BLE_HS_ADV_F_DISC_GEN | BLE_HS_ADV_F_BREDR_UNSUP;
    
    // Set device name
    fields.name = (uint8_t *)device_name.c_str();
    fields.name_len = device_name.length();
    fields.name_is_complete = 1;
    
    // Set TX power
    fields.tx_pwr_lvl_is_present = 1;
    fields.tx_pwr_lvl = 0;
    
    // Set service UUID (128-bit)
    fields.uuids128 = (ble_uuid128_t*)&MEATER_SERVICE_UUID;
    fields.num_uuids128 = 1;
    fields.uuids128_is_complete = 1;
    
    // Set manufacturer data
    fields.mfg_data = manufacturer_data;
    fields.mfg_data_len = sizeof(manufacturer_data);
    
    int rc = ble_gap_adv_set_fields(&fields);
    if (rc != 0) {
      ESP_LOGE("meater_ble_server", "Failed to set advertising data: %d", rc);
      return;
    }
    
    // Start advertising with random static address
    struct ble_gap_adv_params adv_params;
    memset(&adv_params, 0, sizeof(adv_params));
    adv_params.conn_mode = BLE_GAP_CONN_MODE_UND;
    adv_params.disc_mode = BLE_GAP_DISC_MODE_GEN;
    adv_params.itvl_min = 32;  // 20ms intervals
    adv_params.itvl_max = 64;  // 40ms intervals
    
    rc = ble_gap_adv_start(BLE_OWN_ADDR_RANDOM, NULL, BLE_HS_FOREVER,
                          &adv_params, gap_event_handler, NULL);
    if (rc != 0) {
      ESP_LOGE("meater_ble_server", "Failed to start advertising: %d", rc);
    } else {
      ESP_LOGI("meater_ble_server", "Advertising started successfully");
    }
  }
  
  // Get GATT service definitions
  static struct ble_gatt_svc_def* get_gatt_svcs() {
    static struct ble_gatt_chr_def meater_chr[] = {
      {
        // Temperature Characteristic
        .uuid = (ble_uuid_t*)&MEATER_TEMP_CHAR_UUID,
        .access_cb = MeaterBLEServer::gatt_char_access,
        .flags = BLE_GATT_CHR_F_NOTIFY,
        .val_handle = &instance->temp_val_handle,
      },
      {
        // Battery Characteristic
        .uuid = (ble_uuid_t*)&MEATER_BATTERY_CHAR_UUID,
        .access_cb = MeaterBLEServer::gatt_char_access,
        .flags = BLE_GATT_CHR_F_NOTIFY,
        .val_handle = &instance->battery_val_handle,
      },
      { 0 } // End of characteristics
    };
    
    static struct ble_gatt_chr_def device_info_chr[] = {
      {
        // Firmware Revision
        .uuid = (ble_uuid_t*)&FIRMWARE_CHAR_UUID,
        .access_cb = MeaterBLEServer::gatt_char_access,
        .flags = BLE_GATT_CHR_F_READ,
        .val_handle = &instance->fw_val_handle,
      },
      {
        // Manufacturer Name
        .uuid = (ble_uuid_t*)&MANUFACTURER_NAME_CHAR_UUID,
        .access_cb = MeaterBLEServer::gatt_char_access,
        .flags = BLE_GATT_CHR_F_READ,
        .val_handle = &instance->manufacturer_val_handle,
      },
      {
        // Model Number
        .uuid = (ble_uuid_t*)&MODEL_NUMBER_CHAR_UUID,
        .access_cb = MeaterBLEServer::gatt_char_access,
        .flags = BLE_GATT_CHR_F_READ,
        .val_handle = &instance->model_val_handle,
      },
      {
        // Software Revision
        .uuid = (ble_uuid_t*)&SOFTWARE_REV_CHAR_UUID,
        .access_cb = MeaterBLEServer::gatt_char_access,
        .flags = BLE_GATT_CHR_F_READ,
        .val_handle = &instance->software_val_handle,
      },
      { 0 } // End of characteristics
    };
    
    static struct ble_gatt_svc_def gatt_svcs[] = {
      {
        // MEATER Service
        .type = BLE_GATT_SVC_TYPE_PRIMARY,
        .uuid = (ble_uuid_t*)&MEATER_SERVICE_UUID,
        .characteristics = meater_chr,
      },
      {
        // Device Information Service
        .type = BLE_GATT_SVC_TYPE_PRIMARY,
        .uuid = (ble_uuid_t*)&DEVICE_INFO_SERVICE_UUID,
        .characteristics = device_info_chr,
      },
      { 0 } // End of services
    };
    
    return gatt_svcs;
  }
};

// Initialize static member
MeaterBLEServer* MeaterBLEServer::instance = nullptr;

#endif // USE_ESP32
