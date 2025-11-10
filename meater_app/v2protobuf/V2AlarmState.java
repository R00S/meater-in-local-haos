package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2AlarmState implements WireEnum {
    V2ALARM_STATE_NOT_READY(0),
    V2ALARM_STATE_READY(1),
    V2ALARM_STATE_FIRED(2),
    V2ALARM_STATE_DISMISSED(3);

    public static final ProtoAdapter<V2AlarmState> ADAPTER = ProtoAdapter.newEnumAdapter(V2AlarmState.class);
    private final int value;

    V2AlarmState(int i10) {
        this.value = i10;
    }

    public static V2AlarmState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return V2ALARM_STATE_DISMISSED;
                }
                return V2ALARM_STATE_FIRED;
            }
            return V2ALARM_STATE_READY;
        }
        return V2ALARM_STATE_NOT_READY;
    }

    public int getValue() {
        return this.value;
    }
}
