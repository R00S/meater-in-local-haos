package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2ProbeCookState implements WireEnum {
    V2COOK_STATE_NOT_STARTED(0),
    V2COOK_STATE_COOK_CONFIGURED(1),
    V2COOK_STATE_STARTED(2),
    V2COOK_STATE_READY_FOR_RESTING(3),
    V2COOK_STATE_RESTING(4),
    V2COOK_STATE_SLIGHTLY_UNDERDONE(5),
    V2COOK_STATE_FINISHED(6),
    V2COOK_STATE_SLIGHTLY_OVERDONE(7),
    V2COOK_STATE_OVERCOOK(8);

    public static final ProtoAdapter<V2ProbeCookState> ADAPTER = ProtoAdapter.newEnumAdapter(V2ProbeCookState.class);
    private final int value;

    V2ProbeCookState(int i10) {
        this.value = i10;
    }

    public static V2ProbeCookState fromValue(int i10) {
        switch (i10) {
            case 0:
                return V2COOK_STATE_NOT_STARTED;
            case 1:
                return V2COOK_STATE_COOK_CONFIGURED;
            case 2:
                return V2COOK_STATE_STARTED;
            case 3:
                return V2COOK_STATE_READY_FOR_RESTING;
            case 4:
                return V2COOK_STATE_RESTING;
            case 5:
                return V2COOK_STATE_SLIGHTLY_UNDERDONE;
            case 6:
                return V2COOK_STATE_FINISHED;
            case 7:
                return V2COOK_STATE_SLIGHTLY_OVERDONE;
            case 8:
                return V2COOK_STATE_OVERCOOK;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
