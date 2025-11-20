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
    0xb8, 0x27, 0xbf, 0x53, 0x38, 0xd8, 0x3c, 0xbd,
    0x84, 0x48, 0xd8, 0x68, 0x77, 0x48, 0xdb, 0x2a
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

// Client Characteristic Configuration Descriptor (CCCD) UUID: 0x2902
static const uint16_t CCCD_UUID = 0x2902;

// MEATER firmware version (probe number 0 for singleton/standalone probes)
static const char* MEATER_FIRMWARE = "v1.0.4_0";
static const char* MEATER_NAME = "MEATER";
static const char* MANUFACTURER_NAME = "Apption Labs";
static const char* MODEL_NUMBER = "MEATER";

// Logging tag
static const char* TAG = "meater_ble_server";

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
    
    // CCCD descriptor handles (for notification enable/disable)
    uint16_t temp_cccd_handle_;
    uint16_t battery_cccd_handle_;
    
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
                
            case ESP_GATTS_ADD_CHAR_DESCR_EVT:
                ESP_LOGI("meater_ble_server", "Descriptor added, handle: %d", param->add_char_descr.attr_handle);
                handle_descr_added(param);
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
                service_creation_count_++;
                // All 3 services started (MEATER, Device Info, GAP)
                if (service_creation_count_ >= 3) {
                    ESP_LOGI("meater_ble_server", "=== All services started ===");
                    ESP_LOGI("meater_ble_server", "Temp handle: %d, CCCD: %d", temp_char_handle_, temp_cccd_handle_);
                    ESP_LOGI("meater_ble_server", "Battery handle: %d, CCCD: %d", battery_char_handle_, battery_cccd_handle_);
                    ESP_LOGI("meater_ble_server", "Config handle: %d", config_char_handle_);
                    ESP_LOGI("meater_ble_server", "Firmware handle: %d", firmware_char_handle_);
                    ESP_LOGI("meater_ble_server", "Device name handle: %d", device_name_char_handle_);
                }
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
        
        // ✅ Manufacturer data structure based on real MEATER probe format
        // Structure: Company ID (2 bytes) + Probe number (1 byte) + Device ID (8 bytes)
        // Total: 9 bytes data + company ID (2 bytes) = 11 bytes total array
        // 
        // NOTE: Device ID bytes are unique to this ESP32 to avoid conflicts with
        // real MEATER probes or MEATER Block devices that might try to connect
        static uint8_t manufacturer_data[11] = {
            0x7B, 0x03,  // Company ID: 0x037B (Apption Labs) - little-endian as required by BLE spec
            0x00,        // Byte 2: Probe number (0x00 = regular MEATER probe)
            0xE5, 0xF3, 0x32, 0xC0, 0xDE, 0x00, 0x01, 0x23  // Bytes 3-10: Unique device identifier for this ESP32
            // Device ID is unique to avoid conflicts with real probes
        };
        
        // Primary advertising packet - keep under 31 bytes
        // Contents: Flags (3) + Name (8) + Manufacturer Data (13) = 24 bytes (fits!)
        adv_data_.set_scan_rsp = false;
        adv_data_.include_name = true;
        adv_data_.include_txpower = false;  // Disabled to save space
        adv_data_.min_interval = 0;
        adv_data_.max_interval = 0;
        adv_data_.appearance = 0x00;
        adv_data_.manufacturer_len = sizeof(manufacturer_data);
        adv_data_.p_manufacturer_data = manufacturer_data;
        adv_data_.service_data_len = 0;
        adv_data_.p_service_data = nullptr;
        adv_data_.service_uuid_len = 0;  // Will be in scan response instead
        adv_data_.p_service_uuid = nullptr;
        adv_data_.flag = (ESP_BLE_ADV_FLAG_GEN_DISC | ESP_BLE_ADV_FLAG_BREDR_NOT_SPT);
        
        // Debug: Log manufacturer data to verify it's correct
        ESP_LOGI("meater_ble_server", "Manufacturer data (%d bytes): %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x",
                 (int)sizeof(manufacturer_data),
                 manufacturer_data[0], manufacturer_data[1], manufacturer_data[2], manufacturer_data[3],
                 manufacturer_data[4], manufacturer_data[5], manufacturer_data[6], manufacturer_data[7],
                 manufacturer_data[8], manufacturer_data[9], manufacturer_data[10]);
        
        ESP_LOGI("meater_ble_server", "Setting advertising data (primary packet)...");
        esp_err_t ret = esp_ble_gap_config_adv_data(&adv_data_);
        if (ret != ESP_OK) {
            ESP_LOGE("meater_ble_server", "Config advertising data failed: 0x%x", ret);
        } else {
            ESP_LOGI("meater_ble_server", "✓ Advertising data set successfully");
        }
        
        // Scan response packet - contains service UUID
        static esp_ble_adv_data_t scan_rsp_data = {};
        scan_rsp_data.set_scan_rsp = true;
        scan_rsp_data.include_name = false;
        scan_rsp_data.include_txpower = false;
        scan_rsp_data.appearance = 0x00;
        scan_rsp_data.manufacturer_len = 0;
        scan_rsp_data.p_manufacturer_data = nullptr;
        scan_rsp_data.service_data_len = 0;
        scan_rsp_data.p_service_data = nullptr;
        scan_rsp_data.service_uuid_len = 16;
        scan_rsp_data.p_service_uuid = service_uuid;
        scan_rsp_data.flag = 0;
        
        ESP_LOGI("meater_ble_server", "Setting scan response data (service UUID)...");
        ret = esp_ble_gap_config_adv_data(&scan_rsp_data);
        if (ret != ESP_OK) {
            ESP_LOGE("meater_ble_server", "Config scan response data failed: 0x%x", ret);
        } else {
            ESP_LOGI("meater_ble_server", "✓ Scan response data set successfully");
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
        
        ESP_LOGI("meater_ble_server", "Creating MEATER service: a75cc7fc-c956-488f-ac2a-2dbc08b63a04");
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
            ESP_LOGI("meater_ble_server", "Adding temp char: 7edda774-045e-4bbf-909b-45d1991a2876");
            add_temperature_char();
            ESP_LOGI("meater_ble_server", "Adding battery char: 2adb4877-68d8-4884-bd3c-d83853bf27b8");
            add_battery_char();
            ESP_LOGI("meater_ble_server", "Adding config char: caf28e64-3b17-4cb4-bb0a-2eaa33c47af7");
            add_config_char();
        } else if (service_creation_count_ == 1) {
            // Device Information service (second created, 16-bit UUID)
            device_info_service_handle_ = service_handle;
            esp_ble_gatts_start_service(service_handle);
            
            // Add firmware characteristic
            ESP_LOGI("meater_ble_server", "Adding firmware char: 00002a26-0000-1000-8000-00805f9b34fb");
            add_firmware_char();
        } else if (service_creation_count_ == 2) {
            // GAP service (third created, 16-bit UUID)
            gap_service_handle_ = service_handle;
            esp_ble_gatts_start_service(service_handle);
            
            // Add device name characteristic
            ESP_LOGI("meater_ble_server", "Adding device name char: 00002a00-0000-1000-8000-00805f9b34fb");
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
        
        // Don't use auto_rsp - we'll handle read responses manually to return live data
        esp_attr_control_t control;
        control.auto_rsp = ESP_GATT_RSP_BY_APP;  // Manual response
        
        // MUST provide initial attribute value when using ESP_GATT_RSP_BY_APP
        esp_attr_value_t attr_val;
        attr_val.attr_max_len = 8;
        attr_val.attr_len = 8;
        attr_val.attr_value = temp_data_;
        
        esp_ble_gatts_add_char(meater_service_handle_, &char_uuid, permissions, properties, &attr_val, &control);
        // CCCD will be added in handle_char_added() after characteristic is created
    }
    
    void add_cccd_descriptor() {
        esp_bt_uuid_t descr_uuid;
        descr_uuid.len = ESP_UUID_LEN_16;
        descr_uuid.uuid.uuid16 = CCCD_UUID;
        
        // CCCD permissions: read + write
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ | ESP_GATT_PERM_WRITE;
        
        // CCCD value (2 bytes: notifications disabled by default)
        uint8_t cccd_value[2] = {0x00, 0x00};
        esp_attr_value_t attr_val;
        attr_val.attr_max_len = 2;
        attr_val.attr_len = 2;
        attr_val.attr_value = cccd_value;
        
        // Manual response for CCCD writes
        esp_attr_control_t control;
        control.auto_rsp = ESP_GATT_RSP_BY_APP;
        
        esp_ble_gatts_add_char_descr(meater_service_handle_, &descr_uuid, permissions, &attr_val, &control);
    }
    
    void add_battery_char() {
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_128;
        memcpy(char_uuid.uuid.uuid128, BATTERY_CHAR_UUID, 16);
        
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ | ESP_GATT_CHAR_PROP_BIT_NOTIFY;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ;
        
        // Don't use auto_rsp - we'll handle read responses manually to return live data
        esp_attr_control_t control;
        control.auto_rsp = ESP_GATT_RSP_BY_APP;  // Manual response
        
        // MUST provide initial attribute value when using ESP_GATT_RSP_BY_APP
        esp_attr_value_t attr_val;
        attr_val.attr_max_len = 2;
        attr_val.attr_len = 2;
        attr_val.attr_value = battery_data_;
        
        esp_ble_gatts_add_char(meater_service_handle_, &char_uuid, permissions, properties, &attr_val, &control);
        // CCCD will be added in handle_char_added() after characteristic is created
    }
    
    void add_config_char() {
        ESP_LOGI(TAG, "Adding config char: caf28e64-3b17-4cb4-bb0a-2eaa33c47af7");
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_128;
        memcpy(char_uuid.uuid.uuid128, CONFIG_CHAR_UUID, 16);
        
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ | ESP_GATT_CHAR_PROP_BIT_WRITE;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ | ESP_GATT_PERM_WRITE;
        
        esp_attr_control_t control;
        control.auto_rsp = ESP_GATT_RSP_BY_APP;  // Manual response
        
        // MUST provide initial attribute value
        esp_attr_value_t attr_val;
        attr_val.attr_max_len = 4;
        attr_val.attr_len = 4;
        attr_val.attr_value = config_data_;
        
        esp_ble_gatts_add_char(meater_service_handle_, &char_uuid, permissions, properties, &attr_val, &control);
    }
    
    void add_firmware_char() {
        ESP_LOGI(TAG, "Adding firmware char: 00002a26-0000-1000-8000-00805f9b34fb");
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_16;
        char_uuid.uuid.uuid16 = 0x2A26;  // Firmware Revision String
        
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ;
        
        esp_attr_control_t control;
        control.auto_rsp = ESP_GATT_RSP_BY_APP;  // Manual response
        
        // MUST provide initial attribute value
        esp_attr_value_t attr_val;
        attr_val.attr_max_len = 16;
        attr_val.attr_len = strlen(MEATER_FIRMWARE);
        attr_val.attr_value = (uint8_t*)MEATER_FIRMWARE;
        
        esp_ble_gatts_add_char(device_info_service_handle_, &char_uuid, permissions, properties, &attr_val, &control);
    }
    
    void add_device_name_char() {
        ESP_LOGI(TAG, "Adding device name char: 00002a00-0000-1000-8000-00805f9b34fb");
        esp_bt_uuid_t char_uuid;
        char_uuid.len = ESP_UUID_LEN_16;
        char_uuid.uuid.uuid16 = 0x2A00;  // Device Name
        
        esp_gatt_char_prop_t properties = ESP_GATT_CHAR_PROP_BIT_READ;
        esp_gatt_perm_t permissions = ESP_GATT_PERM_READ;
        
        esp_attr_control_t control;
        control.auto_rsp = ESP_GATT_RSP_BY_APP;  // Manual response
        
        // MUST provide initial attribute value
        esp_attr_value_t attr_val;
        attr_val.attr_max_len = 16;
        attr_val.attr_len = strlen(MEATER_NAME);
        attr_val.attr_value = (uint8_t*)MEATER_NAME;
        
        esp_ble_gatts_add_char(gap_service_handle_, &char_uuid, permissions, properties, &attr_val, &control);
    }
    
    void handle_char_added(esp_ble_gatts_cb_param_t *param) {
        // Store characteristic handles based on service
        uint16_t char_handle = param->add_char.attr_handle;
        
        if (param->add_char.service_handle == meater_service_handle_) {
            // MEATER service characteristics - store in order they were added
            if (temp_char_handle_ == 0) {
                temp_char_handle_ = char_handle;
                ESP_LOGI("meater_ble_server", "Temperature char handle: %d", temp_char_handle_);
                // Now add CCCD descriptor for temperature characteristic
                add_cccd_descriptor();
            } else if (battery_char_handle_ == 0) {
                battery_char_handle_ = char_handle;
                ESP_LOGI("meater_ble_server", "Battery char handle: %d", battery_char_handle_);
                // Now add CCCD descriptor for battery characteristic
                add_cccd_descriptor();
            } else if (config_char_handle_ == 0) {
                config_char_handle_ = char_handle;
                ESP_LOGI("meater_ble_server", "Config char handle: %d", config_char_handle_);
            }
        } else if (param->add_char.service_handle == device_info_service_handle_) {
            firmware_char_handle_ = char_handle;
            ESP_LOGI("meater_ble_server", "Firmware char handle: %d", firmware_char_handle_);
        } else if (param->add_char.service_handle == gap_service_handle_) {
            device_name_char_handle_ = char_handle;
            ESP_LOGI("meater_ble_server", "Device name char handle: %d", device_name_char_handle_);
        }
    }
    
    void handle_descr_added(esp_ble_gatts_cb_param_t *param) {
        // CCCD descriptors are added automatically after characteristics with NOTIFY property
        // Track them by checking which was the last characteristic added
        uint16_t descr_handle = param->add_char_descr.attr_handle;
        
        // The descriptor follows its characteristic, so check which one was just added
        if (temp_char_handle_ != 0 && battery_char_handle_ == 0 && temp_cccd_handle_ == 0) {
            // First descriptor after temp char
            temp_cccd_handle_ = descr_handle;
            ESP_LOGI("meater_ble_server", "Temperature CCCD handle: %d", temp_cccd_handle_);
        } else if (battery_char_handle_ != 0 && config_char_handle_ == 0 && battery_cccd_handle_ == 0) {
            // First descriptor after battery char
            battery_cccd_handle_ = descr_handle;
            ESP_LOGI("meater_ble_server", "Battery CCCD handle: %d", battery_cccd_handle_);
        }
    }
    
    void handle_read(esp_ble_gatts_cb_param_t *param) {
        ESP_LOGI("meater_ble_server", "Read request for handle: %d", param->read.handle);
        
        esp_gatt_rsp_t rsp;
        memset(&rsp, 0, sizeof(esp_gatt_rsp_t));
        rsp.attr_value.handle = param->read.handle;
        
        // Determine which characteristic is being read and return appropriate data
        if (param->read.handle == temp_char_handle_) {
            // Return temperature data (8 bytes)
            memcpy(rsp.attr_value.value, temp_data_, 8);
            rsp.attr_value.len = 8;
            ESP_LOGI("meater_ble_server", "Returning temperature data (8 bytes)");
        } else if (param->read.handle == battery_char_handle_) {
            // Return battery data (2 bytes)
            memcpy(rsp.attr_value.value, battery_data_, 2);
            rsp.attr_value.len = 2;
            ESP_LOGI("meater_ble_server", "Returning battery data (2 bytes)");
        } else if (param->read.handle == config_char_handle_) {
            // Return config data (4 bytes)
            memcpy(rsp.attr_value.value, config_data_, 4);
            rsp.attr_value.len = 4;
            ESP_LOGI("meater_ble_server", "Returning config data (4 bytes)");
        } else if (param->read.handle == firmware_char_handle_) {
            // Return firmware version string
            const char* firmware = "v1.0.4_0";
            strcpy((char*)rsp.attr_value.value, firmware);
            rsp.attr_value.len = strlen(firmware);
            ESP_LOGI("meater_ble_server", "Returning firmware: %s", firmware);
        } else if (param->read.handle == device_name_char_handle_) {
            // Return device name
            strcpy((char*)rsp.attr_value.value, MEATER_NAME);
            rsp.attr_value.len = strlen(MEATER_NAME);
            ESP_LOGI("meater_ble_server", "Returning device name: %s", MEATER_NAME);
        } else {
            // Unknown characteristic, return empty
            rsp.attr_value.len = 0;
            ESP_LOGW("meater_ble_server", "Read request for unknown handle: %d", param->read.handle);
        }
        
        esp_ble_gatts_send_response(gatts_if_, param->read.conn_id, param->read.trans_id, ESP_GATT_OK, &rsp);
    }
    
    void handle_write(esp_ble_gatts_cb_param_t *param) {
        ESP_LOGI("meater_ble_server", "Write request for handle: %d, len: %d", param->write.handle, param->write.len);
        
        // Check if this is a CCCD write (2 bytes for notification enable/disable)
        if (param->write.len == 2) {
            uint16_t descr_value = param->write.value[0] | (param->write.value[1] << 8);
            
            // Temperature characteristic CCCD
            if (temp_cccd_handle_ != 0 && param->write.handle == temp_cccd_handle_) {
                temp_notify_enabled_ = (descr_value == 0x0001);
                ESP_LOGI("meater_ble_server", "Temperature notifications %s", 
                         temp_notify_enabled_ ? "ENABLED" : "DISABLED");
            }
            // Battery characteristic CCCD
            else if (battery_cccd_handle_ != 0 && param->write.handle == battery_cccd_handle_) {
                battery_notify_enabled_ = (descr_value == 0x0001);
                ESP_LOGI("meater_ble_server", "Battery notifications %s", 
                         battery_notify_enabled_ ? "ENABLED" : "DISABLED");
            }
        }
        
        // Check if this is a config characteristic write (pairing)
        if (param->write.handle == config_char_handle_) {
            if (param->write.len <= 4) {
                memcpy(config_data_, param->write.value, param->write.len);
                
                // PAIRING MECHANISM (from BLE_PAIRING_FLOW_FROM_CODE.md)
                // When app writes config data, it's establishing pairing
                // This triggers the app to set datePaired field in database
                if (!is_paired_) {
                    is_paired_ = true;
                    pairing_timestamp_ = esp_timer_get_time() / 1000;  // μs to ms
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
        temp_cccd_handle_(0),
        battery_cccd_handle_(0),
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
            
            // Update GATT database attribute value so auto-response returns current data
            if (temp_char_handle_ != 0) {
                esp_ble_gatts_set_attr_value(temp_char_handle_, 8, temp_data_);
            }
            
            // Send notification if enabled and connected
            if (connected_ && temp_notify_enabled_ && temp_char_handle_ != 0) {
                esp_ble_gatts_send_indicate(gatts_if_, conn_id_, temp_char_handle_, 8, temp_data_, false);
            }
        }
    }
    
    void update_battery(const std::vector<uint8_t>& data) {
        if (data.size() == 2) {
            memcpy(battery_data_, data.data(), 2);
            
            // Update GATT database attribute value so auto-response returns current data
            if (battery_char_handle_ != 0) {
                esp_ble_gatts_set_attr_value(battery_char_handle_, 2, battery_data_);
            }
            
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
