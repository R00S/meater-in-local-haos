package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum AlarmState implements WireEnum {
    ALARM_STATE_NOT_READY(0),
    ALARM_STATE_READY(1),
    ALARM_STATE_FIRED(2),
    ALARM_STATE_DISMISSED(3);

    public static final ProtoAdapter<AlarmState> ADAPTER = ProtoAdapter.newEnumAdapter(AlarmState.class);
    private final int value;

    AlarmState(int i10) {
        this.value = i10;
    }

    public static AlarmState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return ALARM_STATE_DISMISSED;
                }
                return ALARM_STATE_FIRED;
            }
            return ALARM_STATE_READY;
        }
        return ALARM_STATE_NOT_READY;
    }

    public int getValue() {
        return this.value;
    }
}
