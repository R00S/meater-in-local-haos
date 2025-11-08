#pragma once

#include "esphome.h"

#ifdef USE_ESP32

#include <esp_bt.h>
#include <esp_bt_main.h>
#include <esp_gap_ble_api.h>
#include <esp_gatt_common_api.h>
#include <esp_gatts_api.h>

// MEATER BLE Service and Characteristic UUIDs (in reverse byte order for ESP32)
static const uint8_t MEATER_SERVICE_UUID[16] = {
    0x04, 0x3a, 0xb6, 0x08, 0xbc, 0x2d, 0x2a, 0xac,
    0x8f, 0x48, 0x56, 0xc9, 0xfc, 0xc7, 0x5c, 0xa7
};

static const uint8_t MEATER_TEMP_CHAR_UUID[16] = {
    0x76, 0x28, 0x1a, 0x99, 0xd1, 0x45, 0x9b, 0x90,
    0xbf, 0x4b, 0x5e, 0x04, 0x74, 0xa7, 0xdd, 0x7e
};

static const uint8_t MEATER_BATTERY_CHAR_UUID[16] = {
    0xb8, 0x27, 0xbf, 0x53, 0xd8, 0x83, 0x3c, 0xbd,
    0x84, 0x48, 0xd8, 0x68, 0x77, 0x48, 0xdb, 0x2a
};

// Firmware service (standard BLE service)
static const uint16_t DEVICE_INFO_SERVICE_UUID = 0x180A;
static const uint16_t FIRMWARE_CHAR_UUID = 0x2A26;

class MeaterBLEServer {
 public:
  static MeaterBLEServer* instance;
  
  esp_gatt_if_t gatts_if = ESP_GATT_IF_NONE;
  uint16_t conn_id = 0;
  bool connected = false;
  
  uint16_t service_handle = 0;
  uint16_t temp_char_handle = 0;
  uint16_t battery_char_handle = 0;
  
  uint16_t fw_service_handle = 0;
  uint16_t fw_char_handle = 0;
  
  std::vector<uint8_t> temp_data;
  std::vector<uint8_t> battery_data;
  std::vector<uint8_t> firmware_data;
  
  MeaterBLEServer() {
    instance = this;
    temp_data.resize(8, 0);
    battery_data.resize(2, 0);
    firmware_data = {'V', '1', '.', '0', '.', '0'};
  }
  
  void setup() {
    ESP_LOGI("meater_ble_server", "Setting up MEATER BLE Server...");
    
    esp_err_t ret;
    
    // Register GATTS callback
    ret = esp_ble_gatts_register_callback(gatts_event_handler);
    if (ret) {
      ESP_LOGE("meater_ble_server", "GATTS register callback failed: %d", ret);
      return;
    }
    
    // Register GAP callback
    ret = esp_ble_gap_register_callback(gap_event_handler);
    if (ret) {
      ESP_LOGE("meater_ble_server", "GAP register callback failed: %d", ret);
      return;
    }
    
    // Register GATTS app
    ret = esp_ble_gatts_app_register(0);
    if (ret) {
      ESP_LOGE("meater_ble_server", "GATTS app register failed: %d", ret);
      return;
    }
    
    ESP_LOGI("meater_ble_server", "BLE Server setup complete");
  }
  
  void update_temp_data(const std::vector<uint8_t>& data) {
    temp_data = data;
    if (connected && temp_char_handle != 0) {
      esp_ble_gatts_send_indicate(gatts_if, conn_id, temp_char_handle,
                                  data.size(), (uint8_t*)data.data(), false);
      ESP_LOGD("meater_ble_server", "Sent temperature notification");
    }
  }
  
  void update_battery_data(const std::vector<uint8_t>& data) {
    battery_data = data;
    if (connected && battery_char_handle != 0) {
      esp_ble_gatts_send_indicate(gatts_if, conn_id, battery_char_handle,
                                  data.size(), (uint8_t*)data.data(), false);
      ESP_LOGD("meater_ble_server", "Sent battery notification");
    }
  }
  
  void update_firmware_data(const std::vector<uint8_t>& data) {
    firmware_data = data;
  }
  
  static void gatts_event_handler(esp_gatts_cb_event_t event, esp_gatt_if_t gatts_if, 
                                  esp_ble_gatts_cb_param_t* param) {
    if (!instance) return;
    
    switch (event) {
      case ESP_GATTS_REG_EVT: {
        ESP_LOGI("meater_ble_server", "GATTS_REG_EVT, status %d, app_id %d", 
                 param->reg.status, param->reg.app_id);
        instance->gatts_if = gatts_if;
        
        // Set device name
        esp_ble_gap_set_device_name("MEATER");
        
        // Create MEATER service
        esp_gatt_srvc_id_t service_id;
        service_id.is_primary = true;
        service_id.id.inst_id = 0;
        service_id.id.uuid.len = ESP_UUID_LEN_128;
        memcpy(service_id.id.uuid.uuid.uuid128, MEATER_SERVICE_UUID, 16);
        
        esp_ble_gatts_create_service(gatts_if, &service_id, 8);
        break;
      }
      
      case ESP_GATTS_CREATE_EVT: {
        ESP_LOGI("meater_ble_server", "CREATE_SERVICE_EVT, status %d, service_handle %d",
                 param->create.status, param->create.service_handle);
        
        if (instance->service_handle == 0) {
          instance->service_handle = param->create.service_handle;
          esp_ble_gatts_start_service(instance->service_handle);
          
          // Add temperature characteristic
          esp_bt_uuid_t char_uuid;
          char_uuid.len = ESP_UUID_LEN_128;
          memcpy(char_uuid.uuid.uuid128, MEATER_TEMP_CHAR_UUID, 16);
          
          esp_gatt_char_prop_t property = ESP_GATT_CHAR_PROP_BIT_READ | 
                                          ESP_GATT_CHAR_PROP_BIT_NOTIFY;
          esp_gatt_perm_t perm = ESP_GATT_PERM_READ;
          
          esp_ble_gatts_add_char(instance->service_handle, &char_uuid, perm,
                                property, nullptr, nullptr);
        } else {
          // This is the firmware service
          instance->fw_service_handle = param->create.service_handle;
          esp_ble_gatts_start_service(instance->fw_service_handle);
          
          // Add firmware characteristic
          esp_bt_uuid_t char_uuid;
          char_uuid.len = ESP_UUID_LEN_16;
          char_uuid.uuid.uuid16 = FIRMWARE_CHAR_UUID;
          
          esp_gatt_char_prop_t property = ESP_GATT_CHAR_PROP_BIT_READ;
          esp_gatt_perm_t perm = ESP_GATT_PERM_READ;
          
          esp_ble_gatts_add_char(instance->fw_service_handle, &char_uuid, perm,
                                property, nullptr, nullptr);
        }
        break;
      }
      
      case ESP_GATTS_ADD_CHAR_EVT: {
        ESP_LOGI("meater_ble_server", "ADD_CHAR_EVT, status %d, attr_handle %d, service_handle %d",
                 param->add_char.status, param->add_char.attr_handle, param->add_char.service_handle);
        
        if (param->add_char.service_handle == instance->service_handle) {
          if (instance->temp_char_handle == 0) {
            instance->temp_char_handle = param->add_char.attr_handle;
            
            // Add battery characteristic
            esp_bt_uuid_t char_uuid;
            char_uuid.len = ESP_UUID_LEN_128;
            memcpy(char_uuid.uuid.uuid128, MEATER_BATTERY_CHAR_UUID, 16);
            
            esp_gatt_char_prop_t property = ESP_GATT_CHAR_PROP_BIT_READ | 
                                            ESP_GATT_CHAR_PROP_BIT_NOTIFY;
            esp_gatt_perm_t perm = ESP_GATT_PERM_READ;
            
            esp_ble_gatts_add_char(instance->service_handle, &char_uuid, perm,
                                  property, nullptr, nullptr);
          } else if (instance->battery_char_handle == 0) {
            instance->battery_char_handle = param->add_char.attr_handle;
            
            // Create firmware service
            esp_gatt_srvc_id_t service_id;
            service_id.is_primary = true;
            service_id.id.inst_id = 0;
            service_id.id.uuid.len = ESP_UUID_LEN_16;
            service_id.id.uuid.uuid.uuid16 = DEVICE_INFO_SERVICE_UUID;
            
            esp_ble_gatts_create_service(instance->gatts_if, &service_id, 4);
          }
        } else if (param->add_char.service_handle == instance->fw_service_handle) {
          instance->fw_char_handle = param->add_char.attr_handle;
          
          // Start advertising
          instance->start_advertising();
        }
        break;
      }
      
      case ESP_GATTS_START_EVT: {
        ESP_LOGI("meater_ble_server", "SERVICE_START_EVT, status %d, service_handle %d",
                 param->start.status, param->start.service_handle);
        break;
      }
      
      case ESP_GATTS_CONNECT_EVT: {
        ESP_LOGI("meater_ble_server", "ESP_GATTS_CONNECT_EVT, conn_id %d", param->connect.conn_id);
        instance->conn_id = param->connect.conn_id;
        instance->connected = true;
        
        // Update connection parameters
        esp_ble_conn_update_params_t conn_params = {};
        memcpy(conn_params.bda, param->connect.remote_bda, sizeof(esp_bd_addr_t));
        conn_params.latency = 0;
        conn_params.max_int = 0x20;
        conn_params.min_int = 0x10;
        conn_params.timeout = 400;
        esp_ble_gap_update_conn_params(&conn_params);
        break;
      }
      
      case ESP_GATTS_DISCONNECT_EVT: {
        ESP_LOGI("meater_ble_server", "ESP_GATTS_DISCONNECT_EVT");
        instance->connected = false;
        instance->start_advertising();
        break;
      }
      
      case ESP_GATTS_READ_EVT: {
        ESP_LOGI("meater_ble_server", "GATT_READ_EVT, handle %d", param->read.handle);
        esp_gatt_rsp_t rsp;
        memset(&rsp, 0, sizeof(esp_gatt_rsp_t));
        rsp.attr_value.handle = param->read.handle;
        
        if (param->read.handle == instance->temp_char_handle) {
          rsp.attr_value.len = instance->temp_data.size();
          memcpy(rsp.attr_value.value, instance->temp_data.data(), rsp.attr_value.len);
        } else if (param->read.handle == instance->battery_char_handle) {
          rsp.attr_value.len = instance->battery_data.size();
          memcpy(rsp.attr_value.value, instance->battery_data.data(), rsp.attr_value.len);
        } else if (param->read.handle == instance->fw_char_handle) {
          rsp.attr_value.len = instance->firmware_data.size();
          memcpy(rsp.attr_value.value, instance->firmware_data.data(), rsp.attr_value.len);
        }
        
        esp_ble_gatts_send_response(gatts_if, param->read.conn_id, param->read.trans_id,
                                    ESP_GATT_OK, &rsp);
        break;
      }
      
      case ESP_GATTS_WRITE_EVT: {
        ESP_LOGI("meater_ble_server", "GATT_WRITE_EVT, handle %d", param->write.handle);
        if (param->write.need_rsp) {
          esp_ble_gatts_send_response(gatts_if, param->write.conn_id, param->write.trans_id,
                                      ESP_GATT_OK, nullptr);
        }
        break;
      }
      
      default:
        break;
    }
  }
  
  static void gap_event_handler(esp_gap_ble_cb_event_t event, esp_ble_gap_cb_param_t* param) {
    switch (event) {
      case ESP_GAP_BLE_ADV_DATA_SET_COMPLETE_EVT:
        ESP_LOGI("meater_ble_server", "Advertising data set complete");
        break;
      case ESP_GAP_BLE_ADV_START_COMPLETE_EVT:
        if (param->adv_start_cmpl.status == ESP_BT_STATUS_SUCCESS) {
          ESP_LOGI("meater_ble_server", "Advertising started successfully");
        } else {
          ESP_LOGE("meater_ble_server", "Advertising start failed");
        }
        break;
      default:
        break;
    }
  }
  
  void start_advertising() {
    // Configure advertising data
    esp_ble_adv_data_t adv_data = {};
    adv_data.set_scan_rsp = false;
    adv_data.include_name = true;
    adv_data.include_txpower = false;
    adv_data.min_interval = 0x20;
    adv_data.max_interval = 0x40;
    adv_data.appearance = 0x00;
    adv_data.manufacturer_len = 0;
    adv_data.p_manufacturer_data = nullptr;
    adv_data.service_data_len = 0;
    adv_data.p_service_data = nullptr;
    adv_data.service_uuid_len = 16;
    adv_data.p_service_uuid = (uint8_t*)MEATER_SERVICE_UUID;
    adv_data.flag = (ESP_BLE_ADV_FLAG_GEN_DISC | ESP_BLE_ADV_FLAG_BREDR_NOT_SPT);
    
    esp_ble_gap_config_adv_data(&adv_data);
    
    // Configure advertising parameters
    esp_ble_adv_params_t adv_params = {};
    adv_params.adv_int_min = 0x20;
    adv_params.adv_int_max = 0x40;
    adv_params.adv_type = ADV_TYPE_IND;
    adv_params.own_addr_type = BLE_ADDR_TYPE_PUBLIC;
    adv_params.channel_map = ADV_CHNL_ALL;
    adv_params.adv_filter_policy = ADV_FILTER_ALLOW_SCAN_ANY_CON_ANY;
    
    esp_ble_gap_start_advertising(&adv_params);
    
    ESP_LOGI("meater_ble_server", "Started advertising as MEATER device");
  }
};

MeaterBLEServer* MeaterBLEServer::instance = nullptr;

#endif // USE_ESP32
