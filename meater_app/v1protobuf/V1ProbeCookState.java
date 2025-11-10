package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1ProbeCookState implements WireEnum {
    COOK_STATE_NOT_STARTED(0),
    COOK_STATE_COOK_CONFIGURED(1),
    COOK_STATE_STARTED(2),
    COOK_STATE_READY_FOR_RESTING(3),
    COOK_STATE_RESTING(4),
    COOK_STATE_SLIGHTLY_UNDERDONE(5),
    COOK_STATE_FINISHED(6),
    COOK_STATE_SLIGHTLY_OVERDONE(7),
    COOK_STATE_OVERCOOK(8);

    public static final ProtoAdapter<V1ProbeCookState> ADAPTER = ProtoAdapter.newEnumAdapter(V1ProbeCookState.class);
    private final int value;

    V1ProbeCookState(int i10) {
        this.value = i10;
    }

    public static V1ProbeCookState fromValue(int i10) {
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
