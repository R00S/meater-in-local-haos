/*
 * NimBLE definitions for MEATER BLE server
 * 
 * This file contains minimal NimBLE type and constant definitions needed
 * for the MEATER BLE server to compile when NimBLE headers aren't available
 * in the build environment.
 * 
 * These definitions are compatible with Apache Mynewt NimBLE.
 */

#pragma once

#include <cstdint>
#include <cstring>

#ifdef __cplusplus
extern "C" {
#endif

// NimBLE constants
#define BLE_HS_CONN_HANDLE_NONE (0xFFFF)
#define BLE_HS_FOREVER (INT32_MAX)
#define BLE_OWN_ADDR_PUBLIC (0x00)
#define BLE_OWN_ADDR_RANDOM (0x01)
#define BLE_GAP_CONN_MODE_NON (0)
#define BLE_GAP_CONN_MODE_DIR (1)
#define BLE_GAP_CONN_MODE_UND (2)
#define BLE_GAP_DISC_MODE_NON (0)
#define BLE_GAP_DISC_MODE_LTD (1)
#define BLE_GAP_DISC_MODE_GEN (2)
#define BLE_HS_ADV_F_DISC_LTD (0x01)
#define BLE_HS_ADV_F_DISC_GEN (0x02)
#define BLE_HS_ADV_F_BREDR_UNSUP (0x04)
#define BLE_GATT_SVC_TYPE_PRIMARY (1)
#define BLE_GATT_CHR_F_READ (0x0002)
#define BLE_GATT_CHR_F_WRITE (0x0008)
#define BLE_GATT_CHR_F_NOTIFY (0x0010)
#define BLE_GATT_CHR_F_INDICATE (0x0020)
#define BLE_GATT_ACCESS_OP_READ_CHR (0)
#define BLE_GATT_ACCESS_OP_WRITE_CHR (1)
#define BLE_ATT_ERR_INSUFFICIENT_RES (0x11)
#define BLE_ATT_ERR_UNLIKELY (0x0e)
#define BLE_GAP_EVENT_CONNECT (0)
#define BLE_GAP_EVENT_DISCONNECT (1)
#define BLE_GAP_EVENT_ADV_COMPLETE (9)
#define BLE_GAP_EVENT_SUBSCRIBE (12)

// UUID structures
struct ble_uuid_t {
    uint8_t type;
};

struct ble_uuid16_t {
    ble_uuid_t u;
    uint16_t value;
};

struct ble_uuid128_t {
    ble_uuid_t u;
    uint8_t value[16];
};

#define BLE_UUID16_INIT(uuid16) { .u = {.type = 16}, .value = (uuid16) }
#define BLE_UUID128_INIT(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p) \
    { .u = {.type = 128}, .value = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p} }

// mbuf structure
struct os_mbuf {
    void *om_data;
    uint16_t om_len;
};

#define OS_MBUF_PKTLEN(om) ((om)->om_len)

// GAP structures
struct ble_gap_adv_params {
    uint8_t conn_mode;
    uint8_t disc_mode;
    uint16_t itvl_min;
    uint16_t itvl_max;
};

struct ble_hs_adv_fields {
    const uint8_t *name;
    uint8_t name_len;
    uint8_t name_is_complete;
    const ble_uuid16_t *uuids16;
    uint8_t num_uuids16;
    uint8_t uuids16_is_complete;
    const ble_uuid128_t *uuids128;
    uint8_t num_uuids128;
    uint8_t uuids128_is_complete;
    uint8_t flags;
    int8_t tx_pwr_lvl;
    uint8_t tx_pwr_lvl_is_present;
    const uint8_t *mfg_data;
    uint8_t mfg_data_len;
};

struct ble_gap_event {
    uint8_t type;
    union {
        struct {
            int status;
            uint16_t conn_handle;
        } connect;
        struct {
            int reason;
        } disconnect;
        struct {
            uint16_t conn_handle;
            uint16_t attr_handle;
            uint8_t cur_notify;
            uint8_t cur_indicate;
        } subscribe;
    };
};

// GATT structures
struct ble_gatt_access_ctxt {
    uint8_t op;
    struct os_mbuf *om;
};

struct ble_gatt_chr_def {
    const ble_uuid_t *uuid;
    int (*access_cb)(uint16_t conn_handle, uint16_t attr_handle,
                     struct ble_gatt_access_ctxt *ctxt, void *arg);
    uint16_t flags;
    uint16_t *val_handle;
};

struct ble_gatt_svc_def {
    uint8_t type;
    const ble_uuid_t *uuid;
    const struct ble_gatt_chr_def *characteristics;
};

// NimBLE function declarations (will link to real NimBLE or use stubs)
int ble_hs_id_set_rnd(const uint8_t *rnd_addr);
int ble_svc_gap_device_name_set(const char *name);
int ble_gatts_count_cfg(const struct ble_gatt_svc_def *defs);
int ble_gatts_add_svcs(const struct ble_gatt_svc_def *svcs);
void ble_gatts_start(void);
int ble_gap_adv_set_fields(const struct ble_hs_adv_fields *adv_fields);
int ble_gap_adv_start(uint8_t own_addr_type, const void *direct_addr, int32_t duration_ms,
                     const struct ble_gatt_adv_params *adv_params,
                     int (*cb)(struct ble_gap_event *event, void *arg), void *cb_arg);
int ble_gap_adv_stop(void);
struct os_mbuf *ble_hs_mbuf_from_flat(const void *buf, uint16_t len);
int ble_gatts_notify_custom(uint16_t conn_handle, uint16_t attr_handle, struct os_mbuf *om);
int os_mbuf_append(struct os_mbuf *om, const void *data, uint16_t len);
int ble_hs_mbuf_to_flat(const struct os_mbuf *om, void *flat, uint16_t len, uint16_t *out_copy_len);

#ifdef __cplusplus
}
#endif
