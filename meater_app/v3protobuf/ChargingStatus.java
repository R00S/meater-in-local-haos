package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum ChargingStatus implements WireEnum {
    UNKNOWN(0),
    NOT_SUPPORTED(1),
    NOT_CHARGING(2),
    CHARGING_FAILURE(3),
    CHARGING_FAILURE_TEMPERATURE(4),
    CHARGING_FAST(5),
    CHARGING_TOO_LOW_USB(6),
    CHARGING_SLOW(7),
    CHARGING_FULL_N_TERMINATED(8);

    public static final ProtoAdapter<ChargingStatus> ADAPTER = ProtoAdapter.newEnumAdapter(ChargingStatus.class);
    private final int value;

    ChargingStatus(int i10) {
        this.value = i10;
    }

    public static ChargingStatus fromValue(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN;
            case 1:
                return NOT_SUPPORTED;
            case 2:
                return NOT_CHARGING;
            case 3:
                return CHARGING_FAILURE;
            case 4:
                return CHARGING_FAILURE_TEMPERATURE;
            case 5:
                return CHARGING_FAST;
            case 6:
                return CHARGING_TOO_LOW_USB;
            case 7:
                return CHARGING_SLOW;
            case 8:
                return CHARGING_FULL_N_TERMINATED;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
