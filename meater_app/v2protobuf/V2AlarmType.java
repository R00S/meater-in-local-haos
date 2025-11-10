package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2AlarmType implements WireEnum {
    V2ALARM_TYPE_MIN_AMBIENT(0),
    V2ALARM_TYPE_MAX_AMBIENT(1),
    V2ALARM_TYPE_MIN_INTERNAL(2),
    V2ALARM_TYPE_MAX_INTERNAL(3),
    V2ALARM_TYPE_TIME_FROM_NOW(4),
    V2ALARM_TYPE_TIME_BEFORE_READY(5),
    V2ALARM_TYPE_REPEAT_DURATION(6);

    public static final ProtoAdapter<V2AlarmType> ADAPTER = ProtoAdapter.newEnumAdapter(V2AlarmType.class);
    private final int value;

    V2AlarmType(int i10) {
        this.value = i10;
    }

    public static V2AlarmType fromValue(int i10) {
        switch (i10) {
            case 0:
                return V2ALARM_TYPE_MIN_AMBIENT;
            case 1:
                return V2ALARM_TYPE_MAX_AMBIENT;
            case 2:
                return V2ALARM_TYPE_MIN_INTERNAL;
            case 3:
                return V2ALARM_TYPE_MAX_INTERNAL;
            case 4:
                return V2ALARM_TYPE_TIME_FROM_NOW;
            case 5:
                return V2ALARM_TYPE_TIME_BEFORE_READY;
            case 6:
                return V2ALARM_TYPE_REPEAT_DURATION;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
