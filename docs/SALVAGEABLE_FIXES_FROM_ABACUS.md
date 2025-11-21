# Salvageable Fixes from Abacus Deep Agent Chat

## Executive Summary
The Abacus Deep Agent identified and attempted to fix the "greyed out probe" BLE pairing issue but failed to push changes to GitHub. This document contains the specific code fixes that were researched and can be applied.

**Status**: ❌ None of these fixes are currently in the codebase  
**Recommendation**: Apply these fixes as they are based on solid research (app decompilation and ESP32 docs)

---

## Fix 1: Temperature Calculation (READY TO APPLY)

### Current Code Status
**File**: `meater.yaml` line 134  
**Current State**: ❌ NOT FIXED (still using 16.0)

```cpp
// Current (INCORRECT):
uint16_t tip_temp = (temp_data[0] + (temp_data[1] << 8) + 8.0) / 16.0;
```

### Proposed Fix
```cpp
// Fixed (based on decompiled MEATER app):
uint16_t tip_temp = (temp_data[0] + (temp_data[1] << 8) + 8.0) / 32.0;
```

### Justification
- Based on decompilation of actual MEATER Android app
- The official MEATER protocol uses division by 32.0, not 16.0
- This explains why temperature readings were incorrect

### Impact
- Temperature readings will match official MEATER app
- Critical for accurate cooking temperature monitoring

---

## Fix 2: BLE GAP Event Handlers (READY TO APPLY)

### Current Code Status
**File**: `includes/meater_bluedroid_server.h`  
**Current State**: ❌ MISSING - Only has 4 event handlers (ADV_DATA_SET, ADV_START, SCAN_RSP_DATA_SET, SCAN_RESULT)

### Critical Missing Handlers

The following event handlers are **required** for BLE pairing/bonding to work with the MEATER app:

#### 1. ESP_GAP_BLE_NC_REQ_EVT (Event 20) - CRITICAL
```cpp
case ESP_GAP_BLE_NC_REQ_EVT: {
    // Numeric Comparison Request - auto-accept pairing
    ESP_LOGI(TAG, "ESP_GAP_BLE_NC_REQ_EVT");
    esp_ble_confirm_reply(param->ble_security.ble_req.bd_addr, true);
    break;
}
```
**Why needed**: The MEATER app initiates pairing with numeric comparison. Without this handler, pairing requests are ignored, causing the "greyed out" issue.

#### 2. ESP_GAP_BLE_ADV_STOP_COMPLETE_EVT (Event 21)
```cpp
case ESP_GAP_BLE_ADV_STOP_COMPLETE_EVT: {
    ESP_LOGI(TAG, "Advertising stopped");
    break;
}
```
**Why needed**: Handles advertising lifecycle properly. Currently logged as "unhandled event 21".

#### 3. ESP_GAP_BLE_PHY_UPDATE_COMPLETE_EVT (Event 60)
```cpp
case ESP_GAP_BLE_PHY_UPDATE_COMPLETE_EVT: {
    ESP_LOGI(TAG, "PHY update complete, status: %d", param->phy_update.status);
    break;
}
```
**Why needed**: Handles physical layer updates during connection. Currently logged as "unhandled event 60".

### Additional Pairing Handlers (RECOMMENDED)

For robust pairing support, add these handlers:

```cpp
case ESP_GAP_BLE_AUTH_CMPL_EVT: {
    // Authentication complete
    esp_ble_auth_cmpl_t auth_cmpl = param->ble_security.auth_cmpl;
    ESP_LOGI(TAG, "Authentication %s, addr: %02x:%02x:%02x:%02x:%02x:%02x",
             auth_cmpl.success ? "complete" : "failed",
             auth_cmpl.bd_addr[0], auth_cmpl.bd_addr[1], auth_cmpl.bd_addr[2],
             auth_cmpl.bd_addr[3], auth_cmpl.bd_addr[4], auth_cmpl.bd_addr[5]);
    break;
}

case ESP_GAP_BLE_SEC_REQ_EVT: {
    // Security request from peer
    ESP_LOGI(TAG, "ESP_GAP_BLE_SEC_REQ_EVT");
    esp_ble_gap_security_rsp(param->ble_security.ble_req.bd_addr, true);
    break;
}

case ESP_GAP_BLE_PASSKEY_REQ_EVT: {
    ESP_LOGI(TAG, "ESP_GAP_BLE_PASSKEY_REQ_EVT");
    // If needed, respond with passkey
    break;
}

case ESP_GAP_BLE_OOB_REQ_EVT: {
    ESP_LOGI(TAG, "ESP_GAP_BLE_OOB_REQ_EVT");
    break;
}

case ESP_GAP_BLE_LOCAL_IR_EVT: {
    ESP_LOGI(TAG, "ESP_GAP_BLE_LOCAL_IR_EVT");
    break;
}

case ESP_GAP_BLE_LOCAL_ER_EVT: {
    ESP_LOGI(TAG, "ESP_GAP_BLE_LOCAL_ER_EVT");
    break;
}

case ESP_GAP_BLE_PASSKEY_NOTIF_EVT: {
    ESP_LOGI(TAG, "ESP_GAP_BLE_PASSKEY_NOTIF_EVT, passkey: %d", 
             param->ble_security.key_notif.passkey);
    break;
}

case ESP_GAP_BLE_KEY_EVT: {
    ESP_LOGI(TAG, "ESP_GAP_BLE_KEY_EVT");
    break;
}
```

### Where to Add These Handlers

In `includes/meater_bluedroid_server.h`, inside the `handle_gap_event()` function's switch statement, add these cases alongside the existing ones:

```cpp
void handle_gap_event(esp_gap_ble_cb_event_t event, esp_ble_gap_cb_param_t *param) {
    switch (event) {
        case ESP_GAP_BLE_ADV_DATA_SET_COMPLETE_EVT:
            // ... existing code ...
            
        case ESP_GAP_BLE_ADV_START_COMPLETE_EVT:
            // ... existing code ...
            
        // ADD NEW HANDLERS HERE:
        case ESP_GAP_BLE_NC_REQ_EVT:
            // ... code from above ...
            
        case ESP_GAP_BLE_ADV_STOP_COMPLETE_EVT:
            // ... code from above ...
            
        case ESP_GAP_BLE_PHY_UPDATE_COMPLETE_EVT:
            // ... code from above ...
            
        // ... add remaining handlers ...
            
        default:
            ESP_LOGW(TAG, "Unhandled GAP event: %d", event);
    }
}
```

---

## Fix 3: BLE Security Configuration (UNCERTAIN - NEEDS INVESTIGATION)

### Current Status
**Status**: ❓ UNKNOWN - Abacus agent was uncertain if this made it into the code

### Proposed Addition

In the `setup()` method of `meater_bluedroid_server.h`, add security parameter configuration:

```cpp
void setup() override {
    // ... existing setup code ...
    
    // Configure BLE security parameters for pairing
    esp_ble_auth_req_t auth_req = ESP_LE_AUTH_BOND;  // Enable bonding
    esp_ble_io_cap_t iocap = ESP_IO_CAP_NONE;        // No I/O capability (auto-accept)
    uint8_t key_size = 16;                           // Maximum key size
    uint8_t init_key = ESP_BLE_ENC_KEY_MASK | ESP_BLE_ID_KEY_MASK;
    uint8_t rsp_key = ESP_BLE_ENC_KEY_MASK | ESP_BLE_ID_KEY_MASK;
    
    esp_ble_gap_set_security_param(ESP_BLE_SM_AUTHEN_REQ_MODE, &auth_req, sizeof(uint8_t));
    esp_ble_gap_set_security_param(ESP_BLE_SM_IOCAP_MODE, &iocap, sizeof(uint8_t));
    esp_ble_gap_set_security_param(ESP_BLE_SM_MAX_KEY_SIZE, &key_size, sizeof(uint8_t));
    esp_ble_gap_set_security_param(ESP_BLE_SM_SET_INIT_KEY, &init_key, sizeof(uint8_t));
    esp_ble_gap_set_security_param(ESP_BLE_SM_SET_RSP_KEY, &rsp_key, sizeof(uint8_t));
    
    ESP_LOGI(TAG, "BLE security parameters configured");
    
    // ... rest of setup ...
}
```

### Investigation Needed
1. Check if this configuration already exists in the codebase
2. Verify it's needed for pairing to work
3. Test with and without to determine necessity

---

## Implementation Priority

### High Priority (Apply Immediately)
1. ✅ **Fix 1: Temperature Calculation** - One line change, clear justification
2. ✅ **Fix 2a: Critical Event Handlers** - Events 20, 21, 60 are essential

### Medium Priority (Apply Soon)
3. ✅ **Fix 2b: Additional Pairing Handlers** - Improves robustness

### Low Priority (Investigate First)
4. ❓ **Fix 3: Security Configuration** - May already be present or unnecessary

---

## Testing Checklist

After applying fixes, test with actual hardware:

- [ ] ESP32 compiles without errors
- [ ] ESP32 starts advertising
- [ ] MEATER app discovers device
- [ ] App initiates pairing
- [ ] ESP32 logs show Event 20 handled (NC_REQ)
- [ ] Pairing completes successfully
- [ ] Device no longer shows greyed out
- [ ] Temperature readings are correct (compare to real MEATER probe)
- [ ] Device persists as paired after disconnect/reconnect

---

## Original Research Source

These fixes are based on:
1. **Decompiled MEATER Android App** - Temperature formula and pairing requirements
2. **ESP32 BLE Documentation** - Event handler specifications
3. **Log Analysis** - Unhandled events 20, 21, 60

Full chat log available in: `docs/abacusfail_obfuscated.txt`

---

## Code Statistics

If all fixes are applied:
- **meater.yaml**: 1 line changed
- **meater_bluedroid_server.h**: ~55 lines added (11 new case statements)
- Total changes: 56 lines across 2 files

---

## Recommendations

1. **Start with Fix 1 and Fix 2a**: These are proven and critical
2. **Test incrementally**: Apply Fix 1, test. Then Fix 2a, test.
3. **Add Fix 2b if needed**: If pairing still fails, add additional handlers
4. **Investigate Fix 3**: Check if security config is needed or already present
5. **Document results**: Update this file with test outcomes

---

## Questions for Future Investigation

1. Is the security configuration (Fix 3) already in the code?
2. Are there other MEATER app requirements we're missing?
3. Should we decompile the iOS app as well to compare?
4. Are there any timing issues with pairing that need addressing?

---

## Status Tracking

| Fix | Status | Tested | Notes |
|-----|--------|--------|-------|
| Temperature (16.0 → 32.0) | ❌ Not Applied | ⏳ Pending | Ready to apply |
| Event 20 (NC_REQ) | ❌ Not Applied | ⏳ Pending | Critical for pairing |
| Event 21 (ADV_STOP) | ❌ Not Applied | ⏳ Pending | Lifecycle handling |
| Event 60 (PHY_UPDATE) | ❌ Not Applied | ⏳ Pending | Connection quality |
| Additional handlers | ❌ Not Applied | ⏳ Pending | Robustness |
| Security config | ❓ Unknown | ⏳ Pending | Needs investigation |

---

Last Updated: 2025-11-21 (from Abacus chat dated 2024-11-20)
