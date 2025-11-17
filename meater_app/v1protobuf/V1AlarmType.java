package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1AlarmType implements WireEnum {
    ALARM_TYPE_MIN_AMBIENT(0),
    ALARM_TYPE_MAX_AMBIENT(1),
    ALARM_TYPE_MIN_INTERNAL(2),
    ALARM_TYPE_MAX_INTERNAL(3),
    ALARM_TYPE_TIME_FROM_NOW(4),
    ALARM_TYPE_TIME_BEFORE_READY(5);

    public static final ProtoAdapter<V1AlarmType> ADAPTER = ProtoAdapter.newEnumAdapter(V1AlarmType.class);
    private final int value;

    V1AlarmType(int i10) {
        this.value = i10;
    }

    public static V1AlarmType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return null;
                            }
                            return ALARM_TYPE_TIME_BEFORE_READY;
                        }
                        return ALARM_TYPE_TIME_FROM_NOW;
                    }
                    return ALARM_TYPE_MAX_INTERNAL;
                }
                return ALARM_TYPE_MIN_INTERNAL;
            }
            return ALARM_TYPE_MAX_AMBIENT;
        }
        return ALARM_TYPE_MIN_AMBIENT;
    }

    public int getValue() {
        return this.value;
    }
}
