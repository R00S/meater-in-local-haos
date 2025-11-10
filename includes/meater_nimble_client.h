#pragma once

#include "esphome.h"

#ifdef USE_ESP32

// Include NimBLE headers
#if __has_include(<host/ble_hs.h>)
  #include <host/ble_hs.h>
  #include <host/ble_uuid.h>
  #include <host/ble_gap.h>
  #include <host/ble_gatt.h>
  #include <nimble/nimble_port.h>
  #include <nimble/nimble_port_freertos.h>
#else
  #error "NimBLE headers are required for ESP32-C6. Please enable CONFIG_BT_NIMBLE_ENABLED in sdkconfig."
#endif

// MEATER service and characteristic UUIDs
static const ble_uuid128_t MEATER_SERVICE_UUID = BLE_UUID128_INIT(
    0x04, 0x3a, 0xb6, 0x08, 0x2d, 0xac, 0x8f, 0x4a, 
    0x56, 0xc9, 0xfc, 0xc7, 0x5c, 0xa7, 0x00, 0x00
);

static const ble_uuid128_t MEATER_TEMP_CHAR_UUID = BLE_UUID128_INIT(
    0x76, 0x28, 0x1a, 0x99, 0x1d, 0x45, 0x9b, 0x90,
    0x4b, 0xbb, 0x5e, 0x04, 0x74, 0xa7, 0xdd, 0x7e
);

static const ble_uuid128_t MEATER_BATTERY_CHAR_UUID = BLE_UUID128_INIT(
    0xb8, 0x27, 0x3b, 0x85, 0x3c, 0xd8, 0x84, 0x48,
    0xbd, 0x3c, 0x77, 0x48, 0xdb, 0x2a, 0x00, 0x00
);

static const ble_uuid16_t DEVICE_INFO_SERVICE_UUID = BLE_UUID16_INIT(0x180A);
static const ble_uuid16_t FIRMWARE_CHAR_UUID = BLE_UUID16_INIT(0x2A26);
static const ble_uuid16_t GAP_SERVICE_UUID = BLE_UUID16_INIT(0x1800);
static const ble_uuid16_t DEVICE_NAME_CHAR_UUID = BLE_UUID16_INIT(0x2A00);

class MeaterNimBLEClient {
private:
    std::string target_mac_;
    uint16_t conn_handle_;
    bool connected_;
    bool scanning_;
    
    // Characteristic handles
    uint16_t temp_char_handle_;
    uint16_t battery_char_handle_;
    uint16_t firmware_char_handle_;
    uint16_t device_name_char_handle_;
    
    // Callbacks for sensor updates
    std::function<void(const std::vector<uint8_t>&)> on_temp_update_;
    std::function<void(const std::vector<uint8_t>&)> on_battery_update_;
    std::function<void(const std::vector<uint8_t>&)> on_firmware_update_;
    std::function<void(const std::vector<uint8_t>&)> on_device_name_update_;
    
    // Static callback handlers (NimBLE requires C-style callbacks)
    static int gap_event_handler(struct ble_gap_event *event, void *arg) {
        MeaterNimBLEClient *client = static_cast<MeaterNimBLEClient*>(arg);
        return client->handle_gap_event(event);
    }
    
    static int gatt_disc_svc_fn(uint16_t conn_handle, const struct ble_gatt_error *error,
                                 const struct ble_gatt_svc *service, void *arg) {
        MeaterNimBLEClient *client = static_cast<MeaterNimBLEClient*>(arg);
        return client->handle_service_discovery(conn_handle, error, service);
    }
    
    static int gatt_disc_chr_fn(uint16_t conn_handle, const struct ble_gatt_error *error,
                                 const struct ble_gatt_chr *chr, void *arg) {
        MeaterNimBLEClient *client = static_cast<MeaterNimBLEClient*>(arg);
        return client->handle_char_discovery(conn_handle, error, chr);
    }
    
    static int gatt_read_char_fn(uint16_t conn_handle, const struct ble_gatt_error *error,
                                  struct ble_gatt_attr *attr, void *arg) {
        auto *callback = static_cast<std::function<void(const std::vector<uint8_t>&)>*>(arg);
        
        if (error->status == 0 && attr) {
            std::vector<uint8_t> data;
            uint16_t len = OS_MBUF_PKTLEN(attr->om);
            data.resize(len);
            ble_hs_mbuf_to_flat(attr->om, data.data(), len, NULL);
            
            if (*callback) {
                (*callback)(data);
            }
        }
        return 0;
    }
    
    static int gatt_notify_fn(uint16_t conn_handle, uint16_t attr_handle,
                               struct ble_gatt_attr *attr, void *arg) {
        auto *callback = static_cast<std::function<void(const std::vector<uint8_t>&)>*>(arg);
        
        if (attr) {
            std::vector<uint8_t> data;
            uint16_t len = OS_MBUF_PKTLEN(attr->om);
            data.resize(len);
            ble_hs_mbuf_to_flat(attr->om, data.data(), len, NULL);
            
            if (*callback) {
                (*callback)(data);
            }
        }
        return 0;
    }
    
    int handle_gap_event(struct ble_gap_event *event) {
        switch (event->type) {
            case BLE_GAP_EVENT_DISC: {
                // Check if this is our target device
                if (event->disc.event_type == BLE_HCI_ADV_RPT_EVTYPE_ADV_IND ||
                    event->disc.event_type == BLE_HCI_ADV_RPT_EVTYPE_DIR_IND) {
                    
                    char addr_str[18];
                    snprintf(addr_str, sizeof(addr_str), "%02x:%02x:%02x:%02x:%02x:%02x",
                            event->disc.addr.val[5], event->disc.addr.val[4],
                            event->disc.addr.val[3], event->disc.addr.val[2],
                            event->disc.addr.val[1], event->disc.addr.val[0]);
                    
                    if (strcasecmp(addr_str, target_mac_.c_str()) == 0) {
                        ESP_LOGI("meater_client", "Found MEATER device: %s", addr_str);
                        ble_gap_disc_cancel();
                        connect_to_device(&event->disc.addr);
                    }
                }
                return 0;
            }
            
            case BLE_GAP_EVENT_CONNECT: {
                if (event->connect.status == 0) {
                    ESP_LOGI("meater_client", "Connected to MEATER");
                    conn_handle_ = event->connect.conn_handle;
                    connected_ = true;
                    scanning_ = false;
                    
                    // Start service discovery
                    ble_gattc_disc_all_svcs(conn_handle_, gatt_disc_svc_fn, this);
                } else {
                    ESP_LOGE("meater_client", "Connection failed, status=%d", event->connect.status);
                    connected_ = false;
                    // Retry scanning
                    start_scan();
                }
                return 0;
            }
            
            case BLE_GAP_EVENT_DISCONNECT: {
                ESP_LOGW("meater_client", "Disconnected from MEATER, reason=%d", event->disconnect.reason);
                connected_ = false;
                conn_handle_ = BLE_HS_CONN_HANDLE_NONE;
                
                // Restart scanning after disconnect
                start_scan();
                return 0;
            }
            
            case BLE_GAP_EVENT_DISC_COMPLETE: {
                ESP_LOGI("meater_client", "Discovery complete");
                scanning_ = false;
                if (!connected_) {
                    // Restart scan if not connected
                    start_scan();
                }
                return 0;
            }
            
            case BLE_GAP_EVENT_NOTIFY_RX: {
                ESP_LOGD("meater_client", "Notification received for handle 0x%04x", event->notify_rx.attr_handle);
                return 0;
            }
        }
        return 0;
    }
    
    int handle_service_discovery(uint16_t conn_handle, const struct ble_gatt_error *error,
                                   const struct ble_gatt_svc *service) {
        if (error->status != 0) {
            return 0;
        }
        
        if (service) {
            ESP_LOGD("meater_client", "Service discovered");
            // Discover characteristics for this service
            ble_gattc_disc_all_chrs(conn_handle, service->start_handle, service->end_handle,
                                     gatt_disc_chr_fn, this);
        }
        
        return 0;
    }
    
    int handle_char_discovery(uint16_t conn_handle, const struct ble_gatt_error *error,
                               const struct ble_gatt_chr *chr) {
        if (error->status != 0) {
            return 0;
        }
        
        if (chr) {
            // Check if this is one of our characteristics
            if (ble_uuid_cmp(&chr->uuid.u, &MEATER_TEMP_CHAR_UUID.u) == 0) {
                ESP_LOGI("meater_client", "Found temperature characteristic");
                temp_char_handle_ = chr->val_handle;
                subscribe_to_char(chr->val_handle, &on_temp_update_);
            }
            else if (ble_uuid_cmp(&chr->uuid.u, &MEATER_BATTERY_CHAR_UUID.u) == 0) {
                ESP_LOGI("meater_client", "Found battery characteristic");
                battery_char_handle_ = chr->val_handle;
                subscribe_to_char(chr->val_handle, &on_battery_update_);
            }
            else if (ble_uuid_cmp(&chr->uuid.u, &FIRMWARE_CHAR_UUID.u) == 0) {
                ESP_LOGI("meater_client", "Found firmware characteristic");
                firmware_char_handle_ = chr->val_handle;
                read_char(chr->val_handle, &on_firmware_update_);
            }
            else if (ble_uuid_cmp(&chr->uuid.u, &DEVICE_NAME_CHAR_UUID.u) == 0) {
                ESP_LOGI("meater_client", "Found device name characteristic");
                device_name_char_handle_ = chr->val_handle;
                read_char(chr->val_handle, &on_device_name_update_);
            }
        }
        
        return 0;
    }
    
    void connect_to_device(const ble_addr_t *addr) {
        struct ble_gap_conn_params conn_params = {};
        conn_params.scan_itvl = 0x0010;
        conn_params.scan_window = 0x0010;
        conn_params.itvl_min = BLE_GAP_INITIAL_CONN_ITVL_MIN;
        conn_params.itvl_max = BLE_GAP_INITIAL_CONN_ITVL_MAX;
        conn_params.latency = 0;
        conn_params.supervision_timeout = 0x0100;
        conn_params.min_ce_len = 0x0000;
        conn_params.max_ce_len = 0x0000;
        
        int rc = ble_gap_connect(BLE_OWN_ADDR_PUBLIC, addr, 30000, &conn_params,
                                  gap_event_handler, this);
        if (rc != 0) {
            ESP_LOGE("meater_client", "Failed to connect, rc=%d", rc);
        }
    }
    
    void subscribe_to_char(uint16_t char_handle, std::function<void(const std::vector<uint8_t>&)> *callback) {
        uint8_t value[2] = {0x01, 0x00}; // Enable notifications
        int rc = ble_gattc_write_flat(conn_handle_, char_handle + 1, value, sizeof(value), gatt_notify_fn, callback);
        if (rc != 0) {
            ESP_LOGE("meater_client", "Failed to subscribe to char 0x%04x, rc=%d", char_handle, rc);
        }
    }
    
    void read_char(uint16_t char_handle, std::function<void(const std::vector<uint8_t>&)> *callback) {
        int rc = ble_gattc_read(conn_handle_, char_handle, gatt_read_char_fn, callback);
        if (rc != 0) {
            ESP_LOGE("meater_client", "Failed to read char 0x%04x, rc=%d", char_handle, rc);
        }
    }
    
public:
    MeaterNimBLEClient(const std::string &mac_address) 
        : target_mac_(mac_address),
          conn_handle_(BLE_HS_CONN_HANDLE_NONE),
          connected_(false),
          scanning_(false),
          temp_char_handle_(0),
          battery_char_handle_(0),
          firmware_char_handle_(0),
          device_name_char_handle_(0) {
    }
    
    void set_on_temp_update(std::function<void(const std::vector<uint8_t>&)> callback) {
        on_temp_update_ = callback;
    }
    
    void set_on_battery_update(std::function<void(const std::vector<uint8_t>&)> callback) {
        on_battery_update_ = callback;
    }
    
    void set_on_firmware_update(std::function<void(const std::vector<uint8_t>&)> callback) {
        on_firmware_update_ = callback;
    }
    
    void set_on_device_name_update(std::function<void(const std::vector<uint8_t>&)> callback) {
        on_device_name_update_ = callback;
    }
    
    void start_scan() {
        if (scanning_ || connected_) {
            return;
        }
        
        ESP_LOGI("meater_client", "Starting BLE scan for MEATER device: %s", target_mac_.c_str());
        
        struct ble_gap_disc_params disc_params = {};
        disc_params.filter_duplicates = 1;
        disc_params.passive = 0;
        disc_params.itvl = 0;
        disc_params.window = 0;
        disc_params.filter_policy = 0;
        disc_params.limited = 0;
        
        int rc = ble_gap_disc(BLE_OWN_ADDR_PUBLIC, BLE_HS_FOREVER, &disc_params, gap_event_handler, this);
        if (rc == 0) {
            scanning_ = true;
        } else {
            ESP_LOGE("meater_client", "Failed to start scan, rc=%d", rc);
        }
    }
    
    bool is_connected() const {
        return connected_;
    }
};

#endif // USE_ESP32
