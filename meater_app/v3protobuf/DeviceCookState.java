package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum DeviceCookState implements WireEnum {
    COOK_STATE_NOT_STARTED(0),
    COOK_STATE_COOK_CONFIGURED(1),
    COOK_STATE_STARTED(2),
    COOK_STATE_READY_FOR_RESTING(3),
    COOK_STATE_RESTING(4),
    COOK_STATE_SLIGHTLY_UNDERDONE(5),
    COOK_STATE_FINISHED(6),
    COOK_STATE_SLIGHTLY_OVERDONE(7),
    COOK_STATE_OVERCOOK(8);

    public static final ProtoAdapter<DeviceCookState> ADAPTER = ProtoAdapter.newEnumAdapter(DeviceCookState.class);
    private final int value;

    DeviceCookState(int i10) {
        this.value = i10;
    }

    public static DeviceCookState fromValue(int i10) {
        switch (i10) {
            case 0:
                return COOK_STATE_NOT_STARTED;
            case 1:
                return COOK_STATE_COOK_CONFIGURED;
            case 2:
                return COOK_STATE_STARTED;
            case 3:
                return COOK_STATE_READY_FOR_RESTING;
            case 4:
                return COOK_STATE_RESTING;
            case 5:
                return COOK_STATE_SLIGHTLY_UNDERDONE;
            case 6:
                return COOK_STATE_FINISHED;
            case 7:
                return COOK_STATE_SLIGHTLY_OVERDONE;
            case 8:
                return COOK_STATE_OVERCOOK;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
