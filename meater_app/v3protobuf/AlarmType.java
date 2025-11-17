package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum AlarmType implements WireEnum {
    ALARM_TYPE_MIN_AMBIENT(0),
    ALARM_TYPE_MAX_AMBIENT(1),
    ALARM_TYPE_MIN_INTERNAL(2),
    ALARM_TYPE_MAX_INTERNAL(3),
    ALARM_TYPE_TIME_FROM_NOW(4),
    ALARM_TYPE_TIME_BEFORE_READY(5),
    ALARM_TYPE_REPEAT_DURATION(6),
    ALARM_TYPE_ESTIMATE_READY(7);

    public static final ProtoAdapter<AlarmType> ADAPTER = ProtoAdapter.newEnumAdapter(AlarmType.class);
    private final int value;

    AlarmType(int i10) {
        this.value = i10;
    }

    public static AlarmType fromValue(int i10) {
        switch (i10) {
            case 0:
                return ALARM_TYPE_MIN_AMBIENT;
            case 1:
                return ALARM_TYPE_MAX_AMBIENT;
            case 2:
                return ALARM_TYPE_MIN_INTERNAL;
            case 3:
                return ALARM_TYPE_MAX_INTERNAL;
            case 4:
                return ALARM_TYPE_TIME_FROM_NOW;
            case 5:
                return ALARM_TYPE_TIME_BEFORE_READY;
            case 6:
                return ALARM_TYPE_REPEAT_DURATION;
            case 7:
                return ALARM_TYPE_ESTIMATE_READY;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
