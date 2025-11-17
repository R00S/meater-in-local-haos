package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum DeviceConnectionType implements WireEnum {
    BLE(0),
    BLE_FIVE(1),
    BLE_FIVE_LR(2);

    public static final ProtoAdapter<DeviceConnectionType> ADAPTER = ProtoAdapter.newEnumAdapter(DeviceConnectionType.class);
    private final int value;

    DeviceConnectionType(int i10) {
        this.value = i10;
    }

    public static DeviceConnectionType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return BLE_FIVE_LR;
            }
            return BLE_FIVE;
        }
        return BLE;
    }

    public int getValue() {
        return this.value;
    }
}
