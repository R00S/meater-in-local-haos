#pragma once

#include "esphome.h"

#ifdef USE_ESP32

#include <esp_bt.h>
#include <esp_bt_main.h>
#include <esp_gap_ble_api.h>
#include <esp_gatts_api.h>
#include <esp_gatt_common_api.h>
#include <esp_timer.h>
#include <nvs_flash.h>
#include <string.h>

// MEATER Probe Emulation using Bluedroid
// This emulates a standalone MEATER probe (not MEATER+ or Block)
// Probe Number: 0 (standalone/singleton probe)
// Device Name: "MEATER"

// UUIDs (stored in reverse byte order for ESP32)
// MEATER Service: a75cc7fc-c956-488f-ac2a-2dbc08b63a04
static const uint8_t MEATER_SERVICE_UUID[16] = {
    0x04, 0x3a, 0xb6, 0x08, 0xbc, 0x2d, 0x2a, 0xac,
    0x8f, 0x48, 0x56, 0xc9, 0xfc, 0xc7, 0x5c, 0xa7
};

// Temperature Characteristic: 7edda774-045e-4bbf-909b-45d1991a2876
static const uint8_t TEMP_CHAR_UUID[16] = {
    0x76, 0x28, 0x1a, 0x99, 0x1d, 0x45, 0x9b, 0x90,
    0x4b, 0xbb, 0x5e, 0x04, 0x74, 0xa7, 0xdd, 0x7e
};

// Battery Characteristic: 2adb4877-68d8-4884-bd3c-d83853bf27b8
static const uint8_t BATTERY_CHAR_UUID[16] = {
    0xb8, 0x27, 0x3b, 0x85, 0x3c, 0xd8, 0x84, 0x48,
    0xbd, 0x3c, 0x77, 0x48, 0xdb, 0x2a, 0x00, 0x00
};

// Cook Setup Characteristic: caf28e64-3b17-4cb4-bb0a-2eaa33c47af7
// This is the characteristic the app writes to during pairing
static const uint8_t CONFIG_CHAR_UUID[16] = {
    0xf7, 0x7a, 0xc4, 0x33, 0xaa, 0x2e, 0x0a, 0xbb,
    0xb4, 0x4c, 0x17, 0x3b, 0x64, 0x8e, 0xf2, 0xca
};

// Device Information Service UUID: 0x180A
static const uint16_t DEVICE_INFO_SERVICE_UUID = 0x180A;

// Firmware Revision UUID: 0x2A26
static const uint16_t FIRMWARE_CHAR_UUID = 0x2A26;

// Manufacturer Name UUID: 0x2A29
static const uint16_t MANUFACTURER_CHAR_UUID = 0x2A29;

// Model Number UUID: 0x2A24
static const uint16_t MODEL_CHAR_UUID = 0x2A24;

// Generic Access Service UUID: 0x1800
static const uint16_t GAP_SERVICE_UUID = 0x1800;

// Device Name UUID: 0x2A00
static const uint16_t DEVICE_NAME_CHAR_UUID = 0x2A00;

// MEATER firmware version (probe number 0 for singleton/standalone probes)
static const char* MEATER_FIRMWARE = "v1.0.4_0";
static const char* MEATER_NAME = "MEATER";
static const char* MANUFACTURER_NAME = "Apption Labs";
static const char* MODEL_NUMBER = "MEATER";

class MeaterBluedroidServer {
private:
    esp_gatt_if_t gatts_if_;
    uint16_t conn_id_;
    bool connected_;
    
    // Service handles
    uint16_t meater_service_handle_;
    uint16_t device_info_service_handle_;
    uint16_t gap_service_handle_;
    
    // Characteristic handles for MEATER service
    uint16_t temp_char_handle_;
    uint16_t battery_char_handle_;
    uint16_t config_char_handle_;
    
    // Characteristic handles for Device Information service
    uint16_t firmware_char_handle_;
    uint16_t manufacturer_char_handle_;
    uint16_t model_char_handle_;
    
    // Characteristic handles for GAP service
    uint16_t device_name_char_handle_;
    
    // Current data
    uint8_t temp_data_[8];
    uint8_t battery_data_[2];
    uint8_t config_data_[4];
    
    // Pairing state (from BLE_PAIRING_FLOW_FROM_CODE.md analysis)
    bool is_paired_;
    uint64_t pairing_timestamp_;  // Unix timestamp in milliseconds when paired
    
    // Notification enabled flags
    bool temp_notify_enabled_;
    bool battery_notify_enabled_;
    
    // Service creation counter
    int service_creation_count_;
    
    // Static instance pointer for callbacks
    static MeaterBluedroidServer* instance_;
    
    // Advertising data
    static esp_ble_adv_data_t adv_data_;
    static esp_ble_adv_params_t adv_params_;
    
    // GAP event handler
    static void gap_event_handler(esp_gap_ble_cb_event_t event, esp_ble_gap_cb_param_t *param) {
        if (instance_) {
            instance_->handle_gap_event(event, param);
        }
    }
    
    // GATTS event handler
    static void gatts_event_handler(esp_gatts_cb_event_t event, esp_gatt_if_t gatts_if, esp_ble_gatts_cb_param_t *param) {
        if (instance_) {
            instance_->handle_gatts_event(event, gatts_if, param);
        }
    }
    
    void handle_gap_event(esp_gap_ble_cb_event_t event, esp_ble_gap_cb_param_t *param) {
        switch (event) {
            case ESP_GAP_BLE_ADV_DATA_SET_COMPLETE_EVT:
                ESP_LOGI("meater_ble_server", "Advertising data set complete, starting advertising...");
                {
                    esp_err_t ret = esp_ble_gap_start_advertising(&adv_params_);
                    if (ret != ESP_OK) {
                        ESP_LOGE("meater_ble_server", "Start advertising failed: 0x%x", ret);
                    }
                }
                break;
            case ESP_GAP_BLE_ADV_START_COMPLETE_EVT:
                if (param->adv_start_cmpl.status == ESP_BT_STATUS_SUCCESS) {
                    ESP_LOGI("meater_ble_server", "✓ Advertising started successfully - Device should be visible as 'MEATER'");
                } else {
                    ESP_LOGE("meater_ble_server", "✗ Advertising start failed with status: %d", param->adv_start_cmpl.status);
                }
                break;
            case ESP_GAP_BLE_SCAN_RSP_DATA_SET_COMPLETE_EVT:
                ESP_LOGI("meater_ble_server", "Scan response data set complete");
                break;
            case ESP_GAP_BLE_SCAN_RESULT_EVT:
                // Ignore scan results from esp32_ble_tracker - too noisy
                break;
            default:
                ESP_LOGD("meater_ble_server", "Unhandled GAP event: %d", event);
                break;
        }
    }
    
    void handle_gatts_event(esp_gatts_cb_event_t event, esp_gatt_if_t gatts_if, esp_ble_gatts_cb_param_t *param) {
        switch (event) {
            case ESP_GATTS_REG_EVT:
                ESP_LOGI("meater_ble_server", "GATTS app registered, app_id: %d", param->reg.app_id);
                gatts_if_ = gatts_if;
                
                // Set device name
                esp_ble_gap_set_device_name(MEATER_NAME);
                
                // Configure advertising data
                configure_advertising();
                
                // Create services
                create_services();
                break;
                
            case ESP_GATTS_CREATE_EVT:
                ESP_LOGI("meater_ble_server", "Service created, handle: %d", param->create.service_handle);
                handle_service_created(param);
                break;
                
            case ESP_GATTS_ADD_CHAR_EVT:
                ESP_LOGI("meater_ble_server", "Characteristic added, handle: %d", param->add_char.attr_handle);
                handle_char_added(param);
                break;
                
            case ESP_GATTS_CONNECT_EVT:
                ESP_LOGI("meater_ble_server", "Client connected, conn_id: %d", param->connect.conn_id);
                conn_id_ = param->connect.conn_id;
                connected_ = true;
                break;
                
            case ESP_GATTS_DISCONNECT_EVT:
                ESP_LOGI("meater_ble_server", "Client disconnected");
                connected_ = false;
                temp_notify_enabled_ = false;
                battery_notify_enabled_ = false;
                // Restart advertising
                esp_ble_gap_start_advertising(&adv_params_);
                break;
                
            case ESP_GATTS_READ_EVT:
                handle_read(param);
                break;
                
            case ESP_GATTS_WRITE_EVT:
                handle_write(param);
                break;
                
            case ESP_GATTS_START_EVT:
                ESP_LOGI("meater_ble_server", "Service started");
                break;
                
            default:
                break;
        }
    }
    
    void configure_advertising() {
        ESP_LOGI("meater_ble_server", "Configuring BLE advertising...");
        
        // Advertising data
        static uint8_t service_uuid[16];
        memcpy(service_uuid, MEATER_SERVICE_UUID, 16);
        
        static uint8_t manufacturer_data[24] = {
            0x7B, 0x03,  // Company ID: 0x037B (Apption Labs)
            0x00, 0x00,  // Device type indicator (0x00 for regular MEATER)
            // Rest filled with zeros
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00
        };
        
        adv_data_.set_scan_rsp = false;
        adv_data_.include_name = true;
        adv_data_.include_txpower = true;
        adv_data_.min_interval = 0x0006;
        adv_data_.max_interval = 0x0010;
        adv_data_.appearance = 0x00;
        adv_data_.manufacturer_len = sizeof(manufacturer_data);
        adv_data_.p_manufacturer_data = manufacturer_data;
        adv_data_.service_data_len = 0;
        adv_data_.p_service_data = nullptr;
        adv_data_.service_uuid_len = 16;
        adv_data_.p_service_uuid = service_uuid;
        adv_data_.flag = (ESP_BLE_ADV_FLAG_GEN_DISC | ESP_BLE_ADV_FLAG_BREDR_NOT_SPT);
        
        ESP_LOGI("meater_ble_server", "Setting advertising data...");
        esp_err_t ret = esp_ble_gap_config_adv_data(&adv_data_);
        if (ret != ESP_OK) {
            ESP_LOGE("meater_ble_server", "Config advertising data failed: 0x%x", ret);
        }
        
        // Advertising parameters
        adv_params_.adv_int_min = 0x20;
        adv_params_.adv_int_max = 0x40;
        adv_params_.adv_type = ADV_TYPE_IND;
        adv_params_.own_addr_type = BLE_ADDR_TYPE_PUBLIC;
        adv_params_.channel_map = ADV_CHNL_ALL;
        adv_params_.adv_filter_policy = ADV_FILTER_ALLOW_SCAN_ANY_CON_ANY;
        
        ESP_LOGI("meater_ble_server", "Advertising configuration complete");
    }
    
    void create_services() {
        // Create MEATER service
        esp_gatt_srvc_id_t meater_srvc_id;
        meater_srvc_id.is_primary = true;
        meater_srvc_id.id.inst_id = 0;
        meater_srvc_id.id.uuid.len = ESP_UUID_LEN_128;
        memcpy(meater_srvc_id.id.uuid.uuid.uuid128, MEATER_SERVICE_UUID, 16);
        
        esp_ble_gatts_create_service(gatts_if_, &meater_srvc_id, 12); // 12 handles
        
        // Create Device Information service
        esp_gatt_srvc_id_t device_info_srvc_id;
        device_info_srvc_id.is_primary = true;
        device_info_srvc_id.id.inst_id = 0;
        device_info_srvc_id.id.uuid.len = ESP_UUID_LEN_16;
        device_info_srvc_id.id.uuid.uuid.uuid16 = DEVICE_INFO_SERVICE_UUID;
        
        esp_ble_gatts_create_service(gatts_if_, &device_info_srvc_id, 10); // 10 handles
        
        // Create GAP service
        esp_gatt_srvc_id_t gap_srvc_id;
        gap_srvc_id.is_primary = true;
        gap_srvc_id.id.inst_id = 0;
        gap_srvc_id.id.uuid.len = ESP_UUID_LEN_16;
        gap_srvc_id.id.uuid.uuid.uuid16 = GAP_SERVICE_UUID;
        
        esp_ble_gatts_create_service(gatts_if_, &gap_srvc_id, 4); // 4 handles
    }
    
    void handle_service_created(esp_ble_gatts_cb_param_t *param) {
        uint16_t service_handle = param->create.service_handle;
        
        // Track which service was created based on creation order
        // Order: MEATER (0), Device Info (1), GAP (2)
        if (service_creation_count_ == 0) {
            // MEATER service (first created, 128-bit UUID)
            meater_service_handle_ = service_handle;
            esp_ble_gatts_start_service(service_handle);
            
            // Add temperature, battery, and config characteristics
            add_temperature_char();
            add_battery_char();
            add_config_char();
        } else if (service_creation_count_ == 1) {
            // Device Information service (second created, 16-bit UUID)
            device_info_service_handle_ = service_handle;
            esp_ble_gatts_start_service(service_handle);
            
            // Add firmware characteristic
            add_firmware_char();
        } else if (service_creation_count_ == 2) {
            // GAP service (third created, 16-bit UUID)
            gap_service_handle_ = service_handle;
            esp_ble_gatts_start_service(service_handle);
            
            // Add device name characteristic
            add_device_name_char();
        }
        
        service_creation_count_++;
    }
    
    void add_temperature_char() {
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_128;
        memcpy(char_uuid.uuid.uuid128, TEMP_CHAR_UUID, 16);
        
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ | ESP_GATT_CHAR_PROP_BIT_NOTIFY;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ;
        
        esp_ble_gatts_add_char(meater_service_handle_, &char_uuid, permissions, properties, nullptr, nullptr);
    }
    
    void add_battery_char() {
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_128;
        memcpy(char_uuid.uuid.uuid128, BATTERY_CHAR_UUID, 16);
        
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ | ESP_GATT_CHAR_PROP_BIT_NOTIFY;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ;
        
        esp_ble_gatts_add_char(meater_service_handle_, &char_uuid, permissions, properties, nullptr, nullptr);
    }
    
    void add_config_char() {
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_128;
        memcpy(char_uuid.uuid.uuid128, CONFIG_CHAR_UUID, 16);
        
        // Config characteristic: READ + WRITE (for pairing)
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ | ESP_GATT_CHAR_PROP_BIT_WRITE;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ | ESP_GATT_PERM_WRITE;
        
        esp_ble_gatts_add_char(meater_service_handle_, &char_uuid, permissions, properties, nullptr, nullptr);
    }
    
    void add_firmware_char() {
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_16;
        char_uuid.uuid.uuid16 = FIRMWARE_CHAR_UUID;
        
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ;
        
        esp_attr_value_t attr_val;
        attr_val.attr_max_len = 32;
        attr_val.attr_len = strlen(MEATER_FIRMWARE);
        attr_val.attr_value = (uint8_t*)MEATER_FIRMWARE;
        
        esp_ble_gatts_add_char(device_info_service_handle_, &char_uuid, permissions, properties, &attr_val, nullptr);
    }
    
    void add_device_name_char() {
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_16;
        char_uuid.uuid.uuid16 = DEVICE_NAME_CHAR_UUID;
        
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ;
        
        esp_attr_value_t attr_val;
        attr_val.attr_max_len = 32;
        attr_val.attr_len = strlen(MEATER_NAME);
        attr_val.attr_value = (uint8_t*)MEATER_NAME;
        
        esp_ble_gatts_add_char(gap_service_handle_, &char_uuid, permissions, properties, &attr_val, nullptr);
    }
    
    void handle_char_added(esp_ble_gatts_cb_param_t *param) {
        // Store characteristic handles
        // Note: Need to add battery and config characteristics as well
        // This is simplified - full implementation would track which char was added
    }
    
    void handle_read(esp_ble_gatts_cb_param_t *param) {
        ESP_LOGI("meater_ble_server", "Read request for handle: %d", param->read.handle);
        
        esp_gatt_rsp_t rsp;
        memset(&rsp, 0, sizeof(esp_gatt_rsp_t));
        rsp.attr_value.handle = param->read.handle;
        
        // Determine which characteristic is being read
        // For now, return empty response
        rsp.attr_value.len = 0;
        
        esp_ble_gatts_send_response(gatts_if_, param->read.conn_id, param->read.trans_id, ESP_GATT_OK, &rsp);
    }
    
    void handle_write(esp_ble_gatts_cb_param_t *param) {
        ESP_LOGI("meater_ble_server", "Write request for handle: %d, len: %d", param->write.handle, param->write.len);
        
        // Check if this is a config characteristic write (pairing)
        if (param->write.handle == config_char_handle_) {
            if (param->write.len <= 4) {
                memcpy(config_data_, param->write.value, param->write.len);
                
                // PAIRING MECHANISM (from BLE_PAIRING_FLOW_FROM_CODE.md)
                // When app writes config data, it's establishing pairing
                // This triggers the app to set datePaired field in database
                if (!is_paired_) {
                    is_paired_ = true;
                    pairing_timestamp_ = millis();  // Use ESPHome's millis() instead
                    ESP_LOGI("meater_ble_server", "✓ Device paired! Timestamp: %llu", pairing_timestamp_);
                    ESP_LOGI("meater_ble_server", "App should now set datePaired field in database");
                } else {
                    ESP_LOGI("meater_ble_server", "Config updated (already paired)");
                }
            }
        }
        
        // Send response if needed
        if (param->write.need_rsp) {
            esp_ble_gatts_send_response(gatts_if_, param->write.conn_id, param->write.trans_id, ESP_GATT_OK, nullptr);
        }
    }
    
public:
    MeaterBluedroidServer() :
        gatts_if_(ESP_GATT_IF_NONE),
        conn_id_(0),
        connected_(false),
        meater_service_handle_(0),
        device_info_service_handle_(0),
        gap_service_handle_(0),
        temp_char_handle_(0),
        battery_char_handle_(0),
        config_char_handle_(0),
        firmware_char_handle_(0),
        manufacturer_char_handle_(0),
        model_char_handle_(0),
        device_name_char_handle_(0),
        temp_notify_enabled_(false),
        battery_notify_enabled_(false),
        service_creation_count_(0),
        is_paired_(false),
        pairing_timestamp_(0) {
        
        ESP_LOGI("meater_ble_server", "Constructor called - creating MeaterBluedroidServer instance");
        
        // Initialize data
        memset(temp_data_, 0, sizeof(temp_data_));
        memset(battery_data_, 0, sizeof(battery_data_));
        memset(config_data_, 0, sizeof(config_data_));
        
        instance_ = this;
        ESP_LOGI("meater_ble_server", "Constructor complete - instance pointer set");
    }
    
    bool setup() {
        ESP_LOGI("meater_ble_server", "Setting up MEATER BLE server (using esp32_ble_tracker's Bluedroid)");
        
        // esp32_ble_tracker component handles Bluedroid initialization
        // We just need to register our callbacks
        esp_err_t ret;
        
        // Verify Bluedroid is enabled (should be done by esp32_ble_tracker)
        if (esp_bluedroid_get_status() != ESP_BLUEDROID_STATUS_ENABLED) {
            ESP_LOGE("meater_ble_server", "Bluedroid not enabled - esp32_ble_tracker may not have initialized");
            return false;
        }
        ESP_LOGI("meater_ble_server", "✓ Bluedroid already enabled by esp32_ble_tracker");
        
        // Register GAP callback
        ret = esp_ble_gap_register_callback(gap_event_handler);
        if (ret) {
            ESP_LOGE("meater_ble_server", "GAP callback register failed: %d", ret);
            return false;
        } else {
            ESP_LOGI("meater_ble_server", "GAP callback registered successfully");
        }
        
        // Register GATTS callback
        ret = esp_ble_gatts_register_callback(gatts_event_handler);
        if (ret) {
            ESP_LOGE("meater_ble_server", "GATTS callback register failed: %d", ret);
            return false;
        } else {
            ESP_LOGI("meater_ble_server", "GATTS callback registered successfully");
        }
        
        // Register application
        ret = esp_ble_gatts_app_register(0);
        if (ret) {
            ESP_LOGE("meater_ble_server", "GATTS app register failed: %d", ret);
            return false;
        } else {
            ESP_LOGI("meater_ble_server", "GATTS app register initiated");
        }
        
        // Set MTU
        esp_ble_gatt_set_local_mtu(517);
        
        ESP_LOGI("meater_ble_server", "MEATER BLE server setup complete");
        return true;
    }
    
    void update_temperature(const std::vector<uint8_t>& data) {
        if (data.size() == 8) {
            memcpy(temp_data_, data.data(), 8);
            
            // Send notification if enabled and connected
            if (connected_ && temp_notify_enabled_ && temp_char_handle_ != 0) {
                esp_ble_gatts_send_indicate(gatts_if_, conn_id_, temp_char_handle_, 8, temp_data_, false);
            }
        }
    }
    
    void update_battery(const std::vector<uint8_t>& data) {
        if (data.size() == 2) {
            memcpy(battery_data_, data.data(), 2);
            
            // Send notification if enabled and connected
            if (connected_ && battery_notify_enabled_ && battery_char_handle_ != 0) {
                esp_ble_gatts_send_indicate(gatts_if_, conn_id_, battery_char_handle_, 2, battery_data_, false);
            }
        }
    }
    
    bool is_connected() const {
        return connected_;
    }
};

// Static member initialization
MeaterBluedroidServer* MeaterBluedroidServer::instance_ = nullptr;
esp_ble_adv_data_t MeaterBluedroidServer::adv_data_ = {};
esp_ble_adv_params_t MeaterBluedroidServer::adv_params_ = {};

#endif // USE_ESP32
