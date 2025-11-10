package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum BLERadioState implements WireEnum {
    BLE_STATE_UNKNOWN(0),
    BLE_STATE_NOT_SUPPORTED(1),
    BLE_STATE_ENABLED(2),
    BLE_STATE_DISABLED(3),
    BLE_STATE_UNAUTHORIZED(4),
    BLE_STATE_RESETTING(5);

    public static final ProtoAdapter<BLERadioState> ADAPTER = ProtoAdapter.newEnumAdapter(BLERadioState.class);
    private final int value;

    BLERadioState(int i10) {
        this.value = i10;
    }

    public static BLERadioState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return null;
                            }
                            return BLE_STATE_RESETTING;
                        }
                        return BLE_STATE_UNAUTHORIZED;
                    }
                    return BLE_STATE_DISABLED;
                }
                return BLE_STATE_ENABLED;
            }
            return BLE_STATE_NOT_SUPPORTED;
        }
        return BLE_STATE_UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
